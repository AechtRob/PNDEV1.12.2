package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpectrovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSpectrovenator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Eye2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer crestleft;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer crestright;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cheekleft;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cheekright;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelSpectrovenator() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 3.5065F, -1.6322F);
        this.setRotateAngle(main, -0.1309F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 29, 0, -3.0F, -1.0484F, -0.6568F, 6, 10, 7, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.75F, 1.4366F, 2.7563F);
        this.main.addChild(leftLeg);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 7.9144F, -2.0477F);
        this.leftLeg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 18, -2.0F, -9.0F, -1.125F, 3, 10, 6, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 8.7148F, -1.5198F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7854F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 48, -1.0F, -1.325F, -1.0F, 2, 9, 3, 0.003F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 7.7307F, 1.4247F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 47, 56, -1.0F, -0.5072F, -1.766F, 2, 6, 2, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.5F, 4.2656F, 0.1089F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0436F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 56, 7, -1.0F, -0.125F, -2.825F, 3, 1, 3, 0.0F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.5F, -0.125F, -2.8F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 20, 57, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.75F, 1.4366F, 2.7563F);
        this.main.addChild(rightLeg);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 7.9144F, -2.0477F);
        this.rightLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 18, -1.0F, -9.0F, -1.125F, 3, 10, 6, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 8.7148F, -1.5198F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7854F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 48, -1.0F, -1.325F, -1.0F, 2, 9, 3, 0.003F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 7.7307F, 1.4247F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 47, 56, -1.0F, -0.5072F, -1.766F, 2, 6, 2, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.5F, 4.2656F, 0.1089F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0436F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 56, 7, -2.0F, -0.125F, -2.825F, 3, 1, 3, 0.0F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.5F, -0.125F, -2.8F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 20, 57, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.2919F, -0.8941F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -3.5F, -0.6497F, -6.5028F, 7, 9, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1023F, -5.4636F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 6.4312F, -2.8639F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0218F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 35, -2.5F, -7.0F, -2.0F, 5, 7, 5, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.2494F, 3.4266F, -3.705F);
        this.body2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3314F, 0.1534F, -0.2671F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 31, 60, -0.5F, -0.05F, -1.025F, 1, 3, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.025F, 2.9089F, 0.9238F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3927F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 38, 60, -0.5F, 0.0F, -1.95F, 1, 3, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.425F, 2.975F, -0.95F);
        this.leftArm2.addChild(leftArm3);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 20, 61, -0.925F, 0.0F, -1.0F, 1, 2, 2, 0.005F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.2494F, 3.4266F, -3.705F);
        this.body2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3314F, -0.1534F, 0.2671F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 31, 60, -0.5F, -0.05F, -1.025F, 1, 3, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.025F, 2.9089F, 0.9238F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3927F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 38, 60, -0.5F, 0.0F, -1.95F, 1, 3, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.425F, 2.975F, -0.95F);
        this.rightArm2.addChild(rightArm3);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 20, 61, -0.075F, 0.0F, -1.0F, 1, 2, 2, 0.005F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1711F, -3.112F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.9032F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 19, 47, -1.5F, -0.8383F, -2.6846F, 3, 4, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6959F, -2.5312F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 47, 48, -1.0F, -0.1849F, -2.3684F, 2, 4, 3, -0.05F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.0052F, -2.3616F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.5672F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0399F, -2.849F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0087F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 26, -1.0F, -0.1433F, -0.0561F, 2, 4, 3, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1129F, -2.786F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.2284F, -2.3187F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.6232F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 12, -1.5F, -2.361F, -0.1294F, 2, 2, 3, 0.006F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 0.0716F, -3.8187F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.3614F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 57, -1.5F, -1.9406F, -0.011F, 2, 3, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, 0.7716F, -5.7187F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.2217F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 61, -1.0F, -0.9654F, -0.0189F, 1, 1, 2, -0.003F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 18, -1.4F, -0.9654F, -0.0189F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.7F, 1.2716F, -6.6187F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.0996F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 22, -1.0F, -0.9943F, -0.0558F, 1, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 63, -1.4F, -0.9943F, -0.0558F, 1, 1, 2, 0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.2F, 2.7157F, -4.4134F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 65, -0.4F, -0.475F, -1.125F, 0, 1, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 65, 0.8F, -0.475F, -1.125F, 0, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 56, -0.825F, -0.875F, -1.125F, 2, 1, 3, 0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.325F, 3.3716F, -6.1437F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 63, -0.2F, -0.9676F, -1.2418F, 0, 1, 2, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 63, 0.85F, -0.9676F, -1.2418F, 0, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 3.0716F, -6.2187F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 56, 61, -0.8F, -1.0426F, -1.2418F, 1, 1, 2, 0.003F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 31, -1.2F, -1.0426F, -1.2418F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.2716F, -6.6187F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.733F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 57, 0.0F, -0.0443F, -0.0558F, 1, 1, 1, 0.0F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.55F, 0.8133F, -3.4963F);
        this.head.addChild(Eye);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Eye2 = new AdvancedModelRenderer(this);
        this.Eye2.setRotationPoint(-0.55F, 0.8133F, -3.4963F);
        this.head.addChild(Eye2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 58, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.crestleft = new AdvancedModelRenderer(this);
        this.crestleft.setRotationPoint(0.3F, 1.0543F, -6.497F);
        this.head.addChild(crestleft);
        this.setRotateAngle(crestleft, 0.0F, -0.0175F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.133F, 0.4263F, 0.013F);
        this.crestleft.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.0814F, 0.1429F, -0.022F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 66, -0.5F, -2.0F, -0.5F, 1, 2, 1, -0.2F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.675F, -0.725F, 1.375F);
        this.crestleft.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.4853F, 0.0561F, -0.0197F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 66, -0.4231F, -3.1175F, -0.6406F, 1, 2, 1, -0.18F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.65F, -0.7F, 1.3F);
        this.crestleft.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.148F, 0.3323F, 0.042F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 66, -0.8284F, -1.6561F, -0.1811F, 1, 2, 1, -0.2F, false));

        this.crestright = new AdvancedModelRenderer(this);
        this.crestright.setRotationPoint(-0.3F, 1.0543F, -6.497F);
        this.head.addChild(crestright);
        this.setRotateAngle(crestright, 0.0F, 0.0175F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.133F, 0.4263F, 0.013F);
        this.crestright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.0814F, -0.1429F, 0.022F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 66, -0.5F, -2.0F, -0.5F, 1, 2, 1, -0.2F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.675F, -0.725F, 1.375F);
        this.crestright.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.4853F, -0.0561F, 0.0197F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 66, -0.5769F, -3.1175F, -0.6406F, 1, 2, 1, -0.18F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.65F, -0.7F, 1.3F);
        this.crestright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -1.148F, -0.3323F, -0.042F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 66, -0.1716F, -1.6561F, -0.1811F, 1, 2, 1, -0.2F, true));

        this.cheekleft = new AdvancedModelRenderer(this);
        this.cheekleft.setRotationPoint(1.2F, 1.3716F, -1.0187F);
        this.head.addChild(cheekleft);
        this.setRotateAngle(cheekleft, 0.0886F, 0.2157F, 0.2215F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.111F, 1.1462F, -1.2712F);
        this.cheekleft.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6618F, -0.0145F, -0.8768F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, 0.107F, -0.443F, -0.2496F, 1, 1, 2, -0.1F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, 0.107F, -0.443F, -0.2496F, 1, 1, 2, -0.1F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.3747F, 0.7124F, -1.4097F);
        this.cheekleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0134F, 0.0011F, -0.8442F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 26, -0.5973F, -0.597F, -2.6311F, 1, 1, 3, -0.1F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 26, -0.5973F, -0.597F, -2.6311F, 1, 1, 3, -0.1F, false));

        this.cheekright = new AdvancedModelRenderer(this);
        this.cheekright.setRotationPoint(-1.2F, 1.3716F, -1.0187F);
        this.head.addChild(cheekright);
        this.setRotateAngle(cheekright, 0.0886F, -0.2157F, -0.2215F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.111F, 1.1462F, -1.2712F);
        this.cheekright.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6618F, 0.0145F, 0.8768F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 62, -1.107F, -0.443F, -0.2496F, 1, 1, 2, -0.1F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 62, -1.107F, -0.443F, -0.2496F, 1, 1, 2, -0.1F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.3747F, 0.7124F, -1.4097F);
        this.cheekright.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0134F, -0.0011F, 0.8442F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 26, -0.4027F, -0.597F, -2.6311F, 1, 1, 3, -0.1F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 26, -0.4027F, -0.597F, -2.6311F, 1, 1, 3, -0.1F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.8716F, -0.5937F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0087F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 0, -1.0F, -2.3F, -2.5F, 2, 3, 3, -0.004F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3F, -0.525F, -2.075F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2094F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 64, 65, -0.325F, -0.5373F, -2.8561F, 0, 1, 2, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 64, 65, 0.925F, -0.5373F, -2.8561F, 0, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.0F, -4.8F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0262F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 66, -0.525F, -1.4909F, -1.8824F, 0, 1, 2, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 66, 0.525F, -1.4909F, -1.8824F, 0, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.3F, -0.6F, -2.1F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 57, -1.325F, 0.0127F, -2.9561F, 2, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, -4.8F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0349F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 65, -0.3F, -0.9909F, -1.9824F, 1, 1, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 45, 64, -0.7F, -0.9909F, -1.9824F, 1, 1, 2, 0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.8266F, -4.2118F);
        this.jaw.addChild(throat);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.4234F, -0.0382F);
        this.throat.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 48, 18, -0.5F, -1.35F, -0.15F, 1, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1145F, 6.1032F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -2.0F, -0.9377F, -0.5307F, 4, 6, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3941F, 9.2851F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 34, -1.5F, -0.175F, -1.125F, 3, 4, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1963F, 6.6944F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 47, -1.0F, -0.175F, -0.175F, 2, 2, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2531F, 6.6341F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 23, 35, -0.5F, -0.225F, -0.475F, 1, 1, 10, 0.0F, false));

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
        this.main.offsetY = -0.0F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.neck.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck3, 0.511F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.202F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.5512F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.1833F, 0.0F, 0.0F);
        this.neck.offsetY = -0F;
        this.neck.offsetX = -0F;
        this.neck.offsetZ = -0.03F;
        this.neck.render(0.01F);
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail4, 0.2836F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1173F, -0.0006F, 0.0028F);
        this.setRotateAngle(tail2, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.7374F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.3709F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.1162F, 0.4166F, 1.1834F);
        this.setRotateAngle(neck3, 0.3011F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1702F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.9512F, 0.0F, 0.0F);
        this.setRotateAngle(main, -0.4407F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, 0.231F, -0.011F, 0.0467F);
        this.setRotateAngle(leftLeg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.7899F, -0.0178F, -0.0442F);
        this.setRotateAngle(leftLeg, 0.1353F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm, 0.1162F, -0.4166F, -1.1834F);
        this.setRotateAngle(jaw, 0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -1.0996F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -1.2217F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -1.3614F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -1.6232F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.0218F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r28, 0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r27, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, 0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, -0.0134F, -0.0011F, 0.8442F);
        this.setRotateAngle(cube_r23, 0.6618F, 0.0145F, 0.8768F);
        this.setRotateAngle(cube_r22, -0.0134F, 0.0011F, -0.8442F);
        this.setRotateAngle(cube_r21, 0.6618F, -0.0145F, -0.8768F);
        this.setRotateAngle(cube_r20, -1.148F, -0.3323F, -0.042F);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -1.4853F, -0.0561F, 0.0197F);
        this.setRotateAngle(cube_r18, -1.0814F, -0.1429F, 0.022F);
        this.setRotateAngle(cube_r17, -1.148F, 0.3323F, 0.042F);
        this.setRotateAngle(cube_r16, -1.4853F, 0.0561F, -0.0197F);
        this.setRotateAngle(cube_r15, -1.0814F, 0.1429F, -0.022F);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(crestright, 0.0F, 0.0175F, 0.0F);
        this.setRotateAngle(crestleft, 0.0F, -0.0175F, 0.0F);
        this.setRotateAngle(cheekright, 0.0886F, -0.2157F, -0.2215F);
        this.setRotateAngle(cheekleft, 0.0886F, 0.2157F, 0.2215F);
        this.setRotateAngle(body2, -0.0044F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.0044F, 0.0F, 0.0F);
        this.main.offsetY = -0.125F;
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

        EntityPrehistoricFloraSpectrovenator EntityCerato = (EntityPrehistoricFloraSpectrovenator) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityCerato.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityCerato.getAnimation() == EntityCerato.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.05F, 0.5, f2, 0.7F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityCerato.isReallyInWater()) {

                if (f3 == 0.0F || !EntityCerato.getIsMoving()) {
                    if (EntityCerato.getAnimation() != EntityCerato.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityCerato.getIsFast()) { //Running


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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (15-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 8) / 5) * (0-(15)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6 + (((tickAnim - 5) / 3) * (0.5-(6)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.5 + (((tickAnim - 8) / 5) * (0-(0.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.75 + (((tickAnim - 5) / 3) * (-15-(2.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -15 + (((tickAnim - 8) / 1) * (-20.5-(-15)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.5 + (((tickAnim - 9) / 4) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.75 + (((tickAnim - 5) / 3) * (-20-(-8.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 8) / 1) * (-11.5-(-20)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -11.5 + (((tickAnim - 9) / 4) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8 + (((tickAnim - 5) / 3) * (36.5-(8)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 36.5 + (((tickAnim - 8) / 1) * (0-(36.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (5.5-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 5.5 + (((tickAnim - 9) / 4) * (0-(5.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 40) / 100) * (5.5-(-22.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 5.5 + (((tickAnim - 140) / 30) * (0-(5.5)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 20.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10 + (((tickAnim - 40) / 100) * (-5.75-(20.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -5.75 + (((tickAnim - 140) / 30) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 15 + (((tickAnim - 40) / 100) * (0-(15)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -12.25 + (((tickAnim - 40) / 100) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -3 + (((tickAnim - 40) / 100) * (0-(-3)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = -0.75 + (((tickAnim - 40) / 100) * (-0.25-(-0.75)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = -0.25 + (((tickAnim - 140) / 30) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10 + (((tickAnim - 40) / 100) * (-5.75-(20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*10)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -5.75 + (((tickAnim - 140) / 30) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 15 + (((tickAnim - 40) / 100) * (0-(15)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -12.25 + (((tickAnim - 40) / 100) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = -3 + (((tickAnim - 40) / 100) * (0-(-3)));
            yy = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 40) / 100) * (0-(0)));
            yy = -0.75 + (((tickAnim - 40) / 100) * (-0.25-(-0.75)));
            zz = 0 + (((tickAnim - 40) / 100) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = -0.25 + (((tickAnim - 140) / 30) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 140) {
            xx = -3.5 + (((tickAnim - 39) / 101) * (10.75-(-3.5)));
            yy = 0 + (((tickAnim - 39) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 101) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 10.75 + (((tickAnim - 140) / 30) * (0-(10.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 140) {
            xx = -12.5 + (((tickAnim - 39) / 101) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 39) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 101) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.22336-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0.22336 + (((tickAnim - 40) / 100) * (0.22336-(0.22336)));
            yy = -21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10 + (((tickAnim - 40) / 100) * (-21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10-(-21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10)));
            zz = -58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5 + (((tickAnim - 40) / 100) * (-58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5-(-58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0.22336 + (((tickAnim - 140) / 30) * (0-(0.22336)));
            yy = -21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10 + (((tickAnim - 140) / 30) * (0-(-21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*-10)));
            zz = -58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5 + (((tickAnim - 140) / 30) * (0-(-58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0.22336-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 140) {
            xx = 0.22336 + (((tickAnim - 40) / 100) * (0.22336-(0.22336)));
            yy = 21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10 + (((tickAnim - 40) / 100) * (21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10-(21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10)));
            zz = 58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5 + (((tickAnim - 40) / 100) * (58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5-(58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0.22336 + (((tickAnim - 140) / 30) * (0-(0.22336)));
            yy = 21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10 + (((tickAnim - 140) / 30) * (0-(21.0533415458+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800-50))*10)));
            zz = 58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5 + (((tickAnim - 140) / 30) * (0-(58.4929500406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 39) / 101) * (50.5-(0)));
            yy = 0 + (((tickAnim - 39) / 101) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 101) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 50.5 + (((tickAnim - 140) / 30) * (0-(50.5)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = -0.175 + (((tickAnim - 140) / 30) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 39) / 51) * (6.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10-(0)));
            yy = 0 + (((tickAnim - 39) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 51) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 6.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10 + (((tickAnim - 90) / 50) * (-1.5-(6.46+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-10)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -1.5 + (((tickAnim - 140) / 30) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 39) / 51) * (6.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-20-(0)));
            yy = 0 + (((tickAnim - 39) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 51) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 6.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-20 + (((tickAnim - 90) / 50) * (-36-(6.885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+80))*-20)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -36 + (((tickAnim - 140) / 30) * (0-(-36)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 39) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 51) * (0.025-(0)));
            zz = 0 + (((tickAnim - 39) / 51) * (0.02-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0.025 + (((tickAnim - 90) / 50) * (0-(0.025)));
            zz = 0.02 + (((tickAnim - 90) / 50) * (0.425-(0.02)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0.425 + (((tickAnim - 140) / 30) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 39) / 51) * (3.85-(0)));
            yy = 0 + (((tickAnim - 39) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 51) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 3.85 + (((tickAnim - 90) / 50) * (-22.5-(3.85)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -22.5 + (((tickAnim - 140) / 30) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 5.75 + (((tickAnim - 140) / 30) * (0-(5.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 1.5 + (((tickAnim - 40) / 61) * (0.8-(1.5)));
            yy = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 61) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 140) {
            xx = 0.8 + (((tickAnim - 101) / 39) * (9.75-(0.8)));
            yy = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 39) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 9.75 + (((tickAnim - 140) / 30) * (0-(9.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 2.75 + (((tickAnim - 40) / 17) * (-8.32-(2.75)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 101) {
            xx = -8.32 + (((tickAnim - 57) / 44) * (-8.29-(-8.32)));
            yy = 0 + (((tickAnim - 57) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 44) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 140) {
            xx = -8.29 + (((tickAnim - 101) / 39) * (8.5-(-8.29)));
            yy = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 39) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 154) {
            xx = 8.5 + (((tickAnim - 140) / 14) * (6.24-(8.5)));
            yy = 0 + (((tickAnim - 140) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 14) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 6.24 + (((tickAnim - 154) / 16) * (0-(6.24)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 7.25 + (((tickAnim - 40) / 17) * (-4.2-(7.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 101) {
            xx = -4.2 + (((tickAnim - 57) / 44) * (-18.49-(-4.2)));
            yy = 0 + (((tickAnim - 57) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 44) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 140) {
            xx = -18.49 + (((tickAnim - 101) / 39) * (-5.5-(-18.49)));
            yy = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 39) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 154) {
            xx = -5.5 + (((tickAnim - 140) / 14) * (8.35-(-5.5)));
            yy = 0 + (((tickAnim - 140) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 14) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 8.35 + (((tickAnim - 154) / 16) * (0-(8.35)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 101) {
            xx = 19.75 + (((tickAnim - 40) / 61) * (0.75-(19.75)));
            yy = 0 + (((tickAnim - 40) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 61) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 140) {
            xx = 0.75 + (((tickAnim - 101) / 39) * (-11.25-(0.75)));
            yy = 0 + (((tickAnim - 101) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 39) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 154) {
            xx = -11.25 + (((tickAnim - 140) / 14) * (13.06-(-11.25)));
            yy = 0 + (((tickAnim - 140) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 14) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 13.06 + (((tickAnim - 154) / 16) * (0-(13.06)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.75 + (((tickAnim - 10) / 10) * (0-(5.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 10) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 37 + (((tickAnim - 10) / 10) * (0-(37)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 10) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 5) / 5) * (0-(25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 27.75 + (((tickAnim - 5) / 5) * (0-(27.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.7786-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.11553-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.7837-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.7786 + (((tickAnim - 5) / 5) * (-1.21858-(-5.7786)));
            yy = -2.11553 + (((tickAnim - 5) / 5) * (-3.05459-(-2.11553)));
            zz = -2.7837 + (((tickAnim - 5) / 5) * (-1.98825-(-2.7837)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -1.21858 + (((tickAnim - 10) / 6) * (-23.02491-(-1.21858)));
            yy = -3.05459 + (((tickAnim - 10) / 6) * (-5.1391-(-3.05459)));
            zz = -1.98825 + (((tickAnim - 10) / 6) * (-2.59789-(-1.98825)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -23.02491 + (((tickAnim - 16) / 4) * (-18.87068-(-23.02491)));
            yy = -5.1391 + (((tickAnim - 16) / 4) * (-6.6201-(-5.1391)));
            zz = -2.59789 + (((tickAnim - 16) / 4) * (-3.34551-(-2.59789)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -18.87068 + (((tickAnim - 20) / 15) * (-18.87068-(-18.87068)));
            yy = -6.6201 + (((tickAnim - 20) / 15) * (-6.6201-(-6.6201)));
            zz = -3.34551 + (((tickAnim - 20) / 15) * (-3.34551-(-3.34551)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -18.87068 + (((tickAnim - 35) / 10) * (0-(-18.87068)));
            yy = -6.6201 + (((tickAnim - 35) / 10) * (0-(-6.6201)));
            zz = -3.34551 + (((tickAnim - 35) / 10) * (0-(-3.34551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.735-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 2.735 + (((tickAnim - 5) / 5) * (4.875-(2.735)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 4.875 + (((tickAnim - 10) / 10) * (10.025-(4.875)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 10.025 + (((tickAnim - 20) / 15) * (10.025-(10.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 10.025 + (((tickAnim - 35) / 10) * (0-(10.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 10) / 10) * (1.49246-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.15027-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (5.74804-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1.49246 + (((tickAnim - 20) / 15) * (1.49246-(1.49246)));
            yy = -0.15027 + (((tickAnim - 20) / 15) * (-0.15027-(-0.15027)));
            zz = 5.74804 + (((tickAnim - 20) / 15) * (5.74804-(5.74804)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.49246 + (((tickAnim - 35) / 5) * (12.74623-(1.49246)));
            yy = -0.15027 + (((tickAnim - 35) / 5) * (-0.07513-(-0.15027)));
            zz = 5.74804 + (((tickAnim - 35) / 5) * (2.87402-(5.74804)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.74623 + (((tickAnim - 40) / 3) * (-22.87689-(12.74623)));
            yy = -0.07513 + (((tickAnim - 40) / 3) * (-0.03757-(-0.07513)));
            zz = 2.87402 + (((tickAnim - 40) / 3) * (1.43701-(2.87402)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -22.87689 + (((tickAnim - 43) / 2) * (0-(-22.87689)));
            yy = -0.03757 + (((tickAnim - 43) / 2) * (0-(-0.03757)));
            zz = 1.43701 + (((tickAnim - 43) / 2) * (0-(1.43701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.88-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4.88 + (((tickAnim - 10) / 5) * (46.31-(-4.88)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 46.31 + (((tickAnim - 15) / 5) * (18-(46.31)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 18 + (((tickAnim - 20) / 15) * (17.25-(18)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 17.25 + (((tickAnim - 35) / 5) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 17.25 + (((tickAnim - 40) / 3) * (35.81-(17.25)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 35.81 + (((tickAnim - 43) / 2) * (0-(35.81)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-35.55-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -35.55 + (((tickAnim - 15) / 5) * (-15-(-35.55)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -15 + (((tickAnim - 20) / 15) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 35) / 5) * (-15-(-15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -15 + (((tickAnim - 40) / 3) * (-24.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -24.5 + (((tickAnim - 43) / 2) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.5 + (((tickAnim - 10) / 5) * (77.47-(24.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 77.47 + (((tickAnim - 15) / 5) * (20-(77.47)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 20) / 15) * (20-(20)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 35) / 5) * (20-(20)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 40) / 3) * (77.5-(20)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 77.5 + (((tickAnim - 43) / 2) * (0-(77.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.82-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.82 + (((tickAnim - 15) / 5) * (-0.7-(0.82)));
            zz = -1.025 + (((tickAnim - 15) / 5) * (0-(-1.025)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -0.7 + (((tickAnim - 20) / 15) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.7 + (((tickAnim - 35) / 5) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = -0.7 + (((tickAnim - 40) / 3) * (1.32-(-0.7)));
            zz = 0 + (((tickAnim - 40) / 3) * (-1.15-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 1.32 + (((tickAnim - 43) / 2) * (0-(1.32)));
            zz = -1.15 + (((tickAnim - 43) / 2) * (0-(-1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (25.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 25.75 + (((tickAnim - 15) / 5) * (0-(25.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(0);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(0);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.77167-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.42347-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.15566-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.77167 + (((tickAnim - 10) / 10) * (-4.25-(9.77167)));
            yy = 0.42347 + (((tickAnim - 10) / 10) * (0-(0.42347)));
            zz = 2.15566 + (((tickAnim - 10) / 10) * (6-(2.15566)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -4.25 + (((tickAnim - 20) / 15) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 6 + (((tickAnim - 20) / 15) * (6-(6)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -4.25 + (((tickAnim - 35) / 3) * (-22.625-(-4.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 6 + (((tickAnim - 35) / 3) * (3-(6)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -22.625 + (((tickAnim - 38) / 4) * (-3.5-(-22.625)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 3 + (((tickAnim - 38) / 4) * (0-(3)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -3.5 + (((tickAnim - 42) / 3) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (43.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 43.25 + (((tickAnim - 4) / 4) * (8.5-(43.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.5 + (((tickAnim - 8) / 2) * (2-(8.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (-21.65-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.65 + (((tickAnim - 20) / 15) * (-21.65-(-21.65)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -21.65 + (((tickAnim - 35) / 3) * (34-(-21.65)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 34 + (((tickAnim - 38) / 4) * (0-(34)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -27.75 + (((tickAnim - 4) / 6) * (-21.08-(-27.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -21.08 + (((tickAnim - 10) / 6) * (-5.92-(-21.08)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -5.92 + (((tickAnim - 16) / 4) * (-5.25-(-5.92)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 20) / 15) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -5.25 + (((tickAnim - 35) / 3) * (-40.37-(-5.25)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -40.37 + (((tickAnim - 38) / 4) * (0-(-40.37)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (71.38-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 71.38 + (((tickAnim - 4) / 4) * (66.5-(71.38)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66.5 + (((tickAnim - 8) / 2) * (50.68-(66.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 50.68 + (((tickAnim - 10) / 4) * (35.19-(50.68)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 35.19 + (((tickAnim - 14) / 6) * (50.5-(35.19)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 50.5 + (((tickAnim - 20) / 15) * (50.5-(50.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 50.5 + (((tickAnim - 35) / 3) * (69.88-(50.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 69.88 + (((tickAnim - 38) / 4) * (10.5-(69.88)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 10.5 + (((tickAnim - 42) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.905-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.9-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.905 + (((tickAnim - 4) / 4) * (0.4-(0.905)));
            zz = -0.9 + (((tickAnim - 4) / 4) * (-0.825-(-0.9)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 8) / 2) * (1.005-(0.4)));
            zz = -0.825 + (((tickAnim - 8) / 2) * (-0.71-(-0.825)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.005 + (((tickAnim - 10) / 4) * (0.855-(1.005)));
            zz = -0.71 + (((tickAnim - 10) / 4) * (-0.41-(-0.71)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.855 + (((tickAnim - 14) / 6) * (0.25-(0.855)));
            zz = -0.41 + (((tickAnim - 14) / 6) * (0-(-0.41)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0.25 + (((tickAnim - 20) / 15) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 35) / 3) * (0.54-(0.25)));
            zz = 0 + (((tickAnim - 35) / 3) * (-1.05-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0.54 + (((tickAnim - 38) / 4) * (0.75-(0.54)));
            zz = -1.05 + (((tickAnim - 38) / 4) * (0-(-1.05)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 42) / 3) * (0-(0.75)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 25.75 + (((tickAnim - 4) / 4) * (-58.75-(25.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -58.75 + (((tickAnim - 8) / 2) * (-36.86-(-58.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -36.86 + (((tickAnim - 10) / 4) * (0-(-36.86)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.65 + (((tickAnim - 8) / 2) * (-0.26-(-0.65)));
            zz = 0.475 + (((tickAnim - 8) / 2) * (0.41-(0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -0.26 + (((tickAnim - 10) / 4) * (0-(-0.26)));
            zz = 0.41 + (((tickAnim - 10) / 4) * (0-(0.41)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.62-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.62 + (((tickAnim - 10) / 10) * (-9.25-(-11.62)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 20) / 15) * (-11-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -11 + (((tickAnim - 35) / 10) * (0-(-11)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.9911-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.16323-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.12075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.9911 + (((tickAnim - 10) / 10) * (-10.4822-(-10.9911)));
            yy = 0.16323 + (((tickAnim - 10) / 10) * (0.32645-(0.16323)));
            zz = 3.12075 + (((tickAnim - 10) / 10) * (6.2415-(3.12075)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -10.4822 + (((tickAnim - 20) / 15) * (-15.4822-(-10.4822)));
            yy = 0.32645 + (((tickAnim - 20) / 15) * (0.32645-(0.32645)));
            zz = 6.2415 + (((tickAnim - 20) / 15) * (6.2415-(6.2415)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -15.4822 + (((tickAnim - 35) / 10) * (0-(-15.4822)));
            yy = 0.32645 + (((tickAnim - 35) / 10) * (0-(0.32645)));
            zz = 6.2415 + (((tickAnim - 35) / 10) * (0-(6.2415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.1591-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.72523-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-48.44026-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.1591 + (((tickAnim - 20) / 15) * (-0.1591-(-0.1591)));
            yy = -13.72523 + (((tickAnim - 20) / 15) * (-13.72523-(-13.72523)));
            zz = -48.44026 + (((tickAnim - 20) / 15) * (-48.44026-(-48.44026)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -0.1591 + (((tickAnim - 35) / 10) * (0-(-0.1591)));
            yy = -13.72523 + (((tickAnim - 35) / 10) * (0-(-13.72523)));
            zz = -48.44026 + (((tickAnim - 35) / 10) * (0-(-48.44026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.1591-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (13.72523-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (48.44026-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -0.1591 + (((tickAnim - 20) / 15) * (-0.1591-(-0.1591)));
            yy = 13.72523 + (((tickAnim - 20) / 15) * (13.72523-(13.72523)));
            zz = 48.44026 + (((tickAnim - 20) / 15) * (48.44026-(48.44026)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -0.1591 + (((tickAnim - 35) / 10) * (0-(-0.1591)));
            yy = 13.72523 + (((tickAnim - 35) / 10) * (0-(13.72523)));
            zz = 48.44026 + (((tickAnim - 35) / 10) * (0-(48.44026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.94-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 26.94 + (((tickAnim - 5) / 9) * (42.95-(26.94)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 42.95 + (((tickAnim - 14) / 6) * (29.75-(42.95)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 29.75 + (((tickAnim - 20) / 3) * (49.5-(29.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 49.5 + (((tickAnim - 23) / 12) * (45.75-(49.5)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 45.75 + (((tickAnim - 35) / 10) * (0-(45.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (14.55-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 14.55 + (((tickAnim - 14) / 6) * (9.25-(14.55)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 20) / 15) * (18-(9.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 35) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-33.5903-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.78273-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.51224-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -33.5903 + (((tickAnim - 20) / 3) * (-12.5903-(-33.5903)));
            yy = 2.78273 + (((tickAnim - 20) / 3) * (2.78273-(2.78273)));
            zz = 0.51224 + (((tickAnim - 20) / 3) * (0.51224-(0.51224)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -12.5903 + (((tickAnim - 23) / 12) * (-30.0903-(-12.5903)));
            yy = 2.78273 + (((tickAnim - 23) / 12) * (2.78273-(2.78273)));
            zz = 0.51224 + (((tickAnim - 23) / 12) * (0.51224-(0.51224)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -30.0903 + (((tickAnim - 35) / 10) * (0-(-30.0903)));
            yy = 2.78273 + (((tickAnim - 35) / 10) * (0-(2.78273)));
            zz = 0.51224 + (((tickAnim - 35) / 10) * (0-(0.51224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0.225-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-7.19-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -7.19 + (((tickAnim - 14) / 6) * (17.75-(-7.19)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 17.75 + (((tickAnim - 20) / 3) * (-0.62-(17.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -0.62 + (((tickAnim - 23) / 12) * (-8.5-(-0.62)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -8.5 + (((tickAnim - 35) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 20) / 3) * (0-(21.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (31.75-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 31.75 + (((tickAnim - 35) / 10) * (0-(31.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-26.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -26.25 + (((tickAnim - 20) / 15) * (-5-(-26.25)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -5 + (((tickAnim - 35) / 10) * (0-(-5)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-28.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 20) / 25) * (0-(0)));
            yy = -28.25 + (((tickAnim - 20) / 25) * (0-(-28.25)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (22-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 22 + (((tickAnim - 10) / 10) * (19.5-(22)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 19.5 + (((tickAnim - 20) / 15) * (-20.25-(19.5)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -20.25 + (((tickAnim - 35) / 10) * (0-(-20.25)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (29.38-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 29.38 + (((tickAnim - 10) / 10) * (35.75-(29.38)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 35.75 + (((tickAnim - 20) / 15) * (-27.75-(35.75)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = -27.75 + (((tickAnim - 35) / 10) * (0-(-27.75)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 6.75 + (((tickAnim - 13) / 14) * (0-(6.75)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -14.5 + (((tickAnim - 13) / 14) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -1.75 + (((tickAnim - 13) / 14) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 16.25 + (((tickAnim - 13) / 9) * (0-(16.25)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 31.75 + (((tickAnim - 15) / 10) * (0-(31.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (31.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 40) / 10) * (0-(31.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 26.75 + (((tickAnim - 15) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (26.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 26.75 + (((tickAnim - 40) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 10) * (0-(0.3)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-45.25-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -45.25 + (((tickAnim - 20) / 5) * (0-(-45.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-45.25-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -45.25 + (((tickAnim - 45) / 5) * (0-(-45.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40.92-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 40.92 + (((tickAnim - 5) / 10) * (45.5-(40.92)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 45.5 + (((tickAnim - 15) / 5) * (97.25-(45.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 97.25 + (((tickAnim - 20) / 5) * (0-(97.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (40.92-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 40.92 + (((tickAnim - 30) / 10) * (45.5-(40.92)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 45.5 + (((tickAnim - 40) / 5) * (97.25-(45.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 97.25 + (((tickAnim - 45) / 5) * (0-(97.25)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.445-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -0.445 + (((tickAnim - 5) / 10) * (-0.525-(-0.445)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (1.25-(0)));
            zz = -0.525 + (((tickAnim - 15) / 5) * (-1.335-(-0.525)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 20) / 5) * (0-(1.25)));
            zz = -1.335 + (((tickAnim - 20) / 5) * (0-(-1.335)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.445-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.445 + (((tickAnim - 30) / 10) * (-0.525-(-0.445)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (1.25-(0)));
            zz = -0.525 + (((tickAnim - 40) / 5) * (-1.335-(-0.525)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 45) / 5) * (-0.25-(1.25)));
            zz = -1.335 + (((tickAnim - 45) / 5) * (0-(-1.335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-59.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -59.75 + (((tickAnim - 5) / 10) * (37.5-(-59.75)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 15) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (-59.75-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -59.75 + (((tickAnim - 30) / 10) * (37.5-(-59.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.575-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.55 + (((tickAnim - 5) / 6) * (0-(-0.55)));
            zz = 0.575 + (((tickAnim - 5) / 6) * (0-(0.575)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0.575-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = -0.55 + (((tickAnim - 30) / 6) * (0-(-0.55)));
            zz = 0.575 + (((tickAnim - 30) / 6) * (0-(0.575)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-6.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.975-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -6.1 + (((tickAnim - 15) / 20) * (-6.1-(-6.1)));
            zz = 1.975 + (((tickAnim - 15) / 20) * (1.975-(1.975)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -6.1 + (((tickAnim - 35) / 15) * (0-(-6.1)));
            zz = 1.975 + (((tickAnim - 35) / 15) * (0-(1.975)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = -5.25 + (((tickAnim - 15) / 20) * (-5.25-(-5.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = -5.25 + (((tickAnim - 35) / 15) * (0-(-5.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29.5 + (((tickAnim - 15) / 20) * (29.5-(29.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29.5 + (((tickAnim - 35) / 15) * (0-(29.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.55 + (((tickAnim - 15) / 20) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.55 + (((tickAnim - 35) / 15) * (0-(0.55)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-97-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -97 + (((tickAnim - 15) / 20) * (-97-(-97)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -97 + (((tickAnim - 35) / 15) * (0-(-97)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.28-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.13-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.28 + (((tickAnim - 7) / 8) * (-0.775-(0.28)));
            zz = 0.13 + (((tickAnim - 7) / 8) * (-1.1-(0.13)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 20) * (-0.775-(-0.775)));
            zz = -1.1 + (((tickAnim - 15) / 20) * (-1.1-(-1.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.775 + (((tickAnim - 35) / 15) * (0-(-0.775)));
            zz = -1.1 + (((tickAnim - 35) / 15) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (88.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 88.75 + (((tickAnim - 15) / 20) * (88.75-(88.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 88.75 + (((tickAnim - 35) / 15) * (0-(88.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.8 + (((tickAnim - 15) / 20) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.525-(0)));
            zz = -0.8 + (((tickAnim - 35) / 8) * (-1.11-(-0.8)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 43) / 7) * (0-(0.525)));
            zz = -1.11 + (((tickAnim - 43) / 7) * (0-(-1.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.5 + (((tickAnim - 15) / 20) * (-12.5-(-12.5)));
            yy = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (0-(-12.5)));
            yy = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29.5 + (((tickAnim - 15) / 20) * (29.5-(29.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 29.5 + (((tickAnim - 35) / 15) * (0-(29.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.55 + (((tickAnim - 15) / 20) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.55 + (((tickAnim - 35) / 15) * (0-(0.55)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-97-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -97 + (((tickAnim - 15) / 20) * (-97-(-97)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -97 + (((tickAnim - 35) / 15) * (0-(-97)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.28-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.13-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.28 + (((tickAnim - 7) / 8) * (-0.775-(0.28)));
            zz = 0.13 + (((tickAnim - 7) / 8) * (-1.1-(0.13)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.775 + (((tickAnim - 15) / 20) * (-0.775-(-0.775)));
            zz = -1.1 + (((tickAnim - 15) / 20) * (-1.1-(-1.1)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.775 + (((tickAnim - 35) / 15) * (0-(-0.775)));
            zz = -1.1 + (((tickAnim - 35) / 15) * (0-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (88.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 88.75 + (((tickAnim - 15) / 20) * (88.75-(88.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 88.75 + (((tickAnim - 35) / 15) * (0-(88.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.8-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.8 + (((tickAnim - 15) / 20) * (-0.8-(-0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.525-(0)));
            zz = -0.8 + (((tickAnim - 35) / 8) * (-1.11-(-0.8)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.525 + (((tickAnim - 43) / 7) * (0-(0.525)));
            zz = -1.11 + (((tickAnim - 43) / 7) * (0-(-1.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (0-(2.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -14.5 + (((tickAnim - 15) / 20) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 35) / 15) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -12 + (((tickAnim - 7) / 8) * (-9.75-(-12)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -9.75 + (((tickAnim - 15) / 20) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -9.75 + (((tickAnim - 35) / 5) * (-15-(-9.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15 + (((tickAnim - 40) / 10) * (0-(-15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -13.25 + (((tickAnim - 9) / 6) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -8.75 + (((tickAnim - 40) / 3) * (-19.16-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -19.16 + (((tickAnim - 43) / 7) * (0-(-19.16)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (31.5-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.5 + (((tickAnim - 15) / 20) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 31.5 + (((tickAnim - 35) / 5) * (16.5-(31.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 16.5 + (((tickAnim - 40) / 3) * (-10.33-(16.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.33 + (((tickAnim - 43) / 7) * (0-(-10.33)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+50))*5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+100))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+150)));
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-100))*-1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -28.4671 + (((tickAnim - 0) / 7) * (29-(-28.4671)));
            yy = 1.13885 + (((tickAnim - 0) / 7) * (0-(1.13885)));
            zz = 3.30975 + (((tickAnim - 0) / 7) * (0-(3.30975)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 29 + (((tickAnim - 7) / 3) * (-0.88433-(29)));
            yy = 0 + (((tickAnim - 7) / 3) * (31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.88433 + (((tickAnim - 10) / 3) * (-28.4671-(-0.88433)));
            yy = 31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 10) / 3) * (1.13885-(31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            zz = 16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20 + (((tickAnim - 10) / 3) * (3.30975-(16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -22.72284 + (((tickAnim - 0) / 7) * (25.25-(-22.72284)));
            yy = -0.51982 + (((tickAnim - 0) / 7) * (0-(-0.51982)));
            zz = -0.14455 + (((tickAnim - 0) / 7) * (0-(-0.14455)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25.25 + (((tickAnim - 7) / 2) * (20.82023-(25.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.23992-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.06671-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.82023 + (((tickAnim - 9) / 4) * (-22.72284-(20.82023)));
            yy = -0.23992 + (((tickAnim - 9) / 4) * (-0.51982-(-0.23992)));
            zz = -0.06671 + (((tickAnim - 9) / 4) * (-0.14455-(-0.06671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 7) * (0.25-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 7) / 2) * (0.565-(0.25)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.565 + (((tickAnim - 9) / 4) * (-0.425-(0.565)));
            zz = -0.15 + (((tickAnim - 9) / 4) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.75 + (((tickAnim - 0) / 7) * (5.25-(2.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 5.25 + (((tickAnim - 7) / 2) * (-51.13-(5.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -51.13 + (((tickAnim - 9) / 1) * (-51.13-(-51.13)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -51.13 + (((tickAnim - 10) / 3) * (2.75-(-51.13)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 69.12975 + (((tickAnim - 0) / 1) * (29.52983-(69.12975)));
            yy = 3.6112 + (((tickAnim - 0) / 1) * (2.40746-(3.6112)));
            zz = -3.81327 + (((tickAnim - 0) / 1) * (-2.54218-(-3.81327)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 29.52983 + (((tickAnim - 1) / 2) * (5.08-(29.52983)));
            yy = 2.40746 + (((tickAnim - 1) / 2) * (0-(2.40746)));
            zz = -2.54218 + (((tickAnim - 1) / 2) * (0-(-2.54218)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 5.08 + (((tickAnim - 3) / 1) * (69.54-(5.08)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 69.54 + (((tickAnim - 4) / 3) * (60.5-(69.54)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 60.5 + (((tickAnim - 7) / 2) * (86.31-(60.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 86.31 + (((tickAnim - 9) / 2) * (53.42-(86.31)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 53.42 + (((tickAnim - 11) / 2) * (69.12975-(53.42)));
            yy = 0 + (((tickAnim - 11) / 2) * (3.6112-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-3.81327-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.195-(0)));
            zz = -1 + (((tickAnim - 0) / 1) * (-0.21-(-1)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.195 + (((tickAnim - 1) / 2) * (1.85-(1.195)));
            zz = -0.21 + (((tickAnim - 1) / 2) * (0-(-0.21)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.85 + (((tickAnim - 3) / 1) * (1.135-(1.85)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.915-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.135 + (((tickAnim - 4) / 3) * (0.45-(1.135)));
            zz = -0.915 + (((tickAnim - 4) / 3) * (-0.775-(-0.915)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 7) / 1) * (2.315-(0.45)));
            zz = -0.775 + (((tickAnim - 7) / 1) * (-1.07-(-0.775)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.315 + (((tickAnim - 8) / 1) * (1.775-(2.315)));
            zz = -1.07 + (((tickAnim - 8) / 1) * (-1.375-(-1.07)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.775 + (((tickAnim - 9) / 2) * (-0.295-(1.775)));
            zz = -1.375 + (((tickAnim - 9) / 2) * (-0.82-(-1.375)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.295 + (((tickAnim - 11) / 2) * (0-(-0.295)));
            zz = -0.82 + (((tickAnim - 11) / 2) * (-1-(-0.82)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-75.37-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -75.37 + (((tickAnim - 4) / 3) * (19.75-(-75.37)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 19.75 + (((tickAnim - 7) / 6) * (0-(19.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0.73-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 1) * (-0.7-(-0.2)));
            zz = 0.73 + (((tickAnim - 3) / 1) * (0.75-(0.73)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.7 + (((tickAnim - 4) / 1) * (-0.15-(-0.7)));
            zz = 0.75 + (((tickAnim - 4) / 1) * (0.38-(0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 2) * (0-(-0.15)));
            zz = 0.38 + (((tickAnim - 5) / 2) * (0-(0.38)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29 + (((tickAnim - 0) / 3) * (-0.88433-(29)));
            yy = 0 + (((tickAnim - 0) / 3) * (-12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.88433 + (((tickAnim - 3) / 3) * (-29.7171-(-0.88433)));
            yy = -12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 3) / 3) * (-1.13885-(-12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            zz = 16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20 + (((tickAnim - 3) / 3) * (-3.30975-(16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -29.7171 + (((tickAnim - 6) / 7) * (29-(-29.7171)));
            yy = -1.13885 + (((tickAnim - 6) / 7) * (0-(-1.13885)));
            zz = -3.30975 + (((tickAnim - 6) / 7) * (0-(-3.30975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.25 + (((tickAnim - 0) / 3) * (30.57023-(23.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.23992-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.06671-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 30.57023 + (((tickAnim - 3) / 3) * (-17.97284-(30.57023)));
            yy = -0.23992 + (((tickAnim - 3) / 3) * (-0.51982-(-0.23992)));
            zz = -0.06671 + (((tickAnim - 3) / 3) * (-0.14455-(-0.06671)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -17.97284 + (((tickAnim - 6) / 7) * (21.5-(-17.97284)));
            yy = -0.51982 + (((tickAnim - 6) / 7) * (0-(-0.51982)));
            zz = -0.14455 + (((tickAnim - 6) / 7) * (0-(-0.14455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (0.565-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.325-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.565 + (((tickAnim - 3) / 3) * (-0.425-(0.565)));
            zz = -0.325 + (((tickAnim - 3) / 3) * (0-(-0.325)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 6) / 7) * (0.25-(-0.425)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.25 + (((tickAnim - 0) / 3) * (-51.13-(5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -51.13 + (((tickAnim - 3) / 1) * (-51.13-(-51.13)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -51.13 + (((tickAnim - 4) / 2) * (-2.25-(-51.13)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.25 + (((tickAnim - 6) / 7) * (5.25-(-2.25)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 60.5 + (((tickAnim - 0) / 3) * (86.31-(60.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 86.31 + (((tickAnim - 3) / 1) * (98.42-(86.31)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 98.42 + (((tickAnim - 4) / 2) * (64.12975-(98.42)));
            yy = 0 + (((tickAnim - 4) / 2) * (-3.6112-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (3.81327-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 64.12975 + (((tickAnim - 6) / 1) * (35.36481-(64.12975)));
            yy = -3.6112 + (((tickAnim - 6) / 1) * (-2.40756-(-3.6112)));
            zz = 3.81327 + (((tickAnim - 6) / 1) * (2.54228-(3.81327)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35.36481 + (((tickAnim - 7) / 1) * (7.58-(35.36481)));
            yy = -2.40756 + (((tickAnim - 7) / 1) * (0-(-2.40756)));
            zz = 2.54228 + (((tickAnim - 7) / 1) * (0-(2.54228)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.58 + (((tickAnim - 8) / 3) * (69.54-(7.58)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 69.54 + (((tickAnim - 11) / 2) * (60.5-(69.54)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 2) * (2.39-(0.45)));
            zz = -0.775 + (((tickAnim - 0) / 2) * (-1.07-(-0.775)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.39 + (((tickAnim - 2) / 1) * (1.55-(2.39)));
            zz = -1.07 + (((tickAnim - 2) / 1) * (-1.375-(-1.07)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.55 + (((tickAnim - 3) / 1) * (0.705-(1.55)));
            zz = -1.375 + (((tickAnim - 3) / 1) * (-1.27-(-1.375)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.705 + (((tickAnim - 4) / 2) * (0.35-(0.705)));
            zz = -1.27 + (((tickAnim - 4) / 2) * (-0.6-(-1.27)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 1) * (0.745-(0.35)));
            zz = -0.6 + (((tickAnim - 6) / 1) * (0.2-(-0.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.745 + (((tickAnim - 7) / 1) * (1.725-(0.745)));
            zz = 0.2 + (((tickAnim - 7) / 1) * (0-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.725 + (((tickAnim - 8) / 2) * (1.395-(1.725)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.46-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 1.395 + (((tickAnim - 10) / 1) * (-0.265-(1.395)));
            zz = -0.46 + (((tickAnim - 10) / 1) * (-0.915-(-0.46)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.265 + (((tickAnim - 11) / 2) * (0.45-(-0.265)));
            zz = -0.915 + (((tickAnim - 11) / 2) * (-0.775-(-0.915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.75 + (((tickAnim - 3) / 3) * (0-(19.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-75.37-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -75.37 + (((tickAnim - 11) / 2) * (19.75-(-75.37)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.73-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 1) * (-0.7-(-0.2)));
            zz = 0.73 + (((tickAnim - 10) / 1) * (0.75-(0.73)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.7 + (((tickAnim - 11) / 1) * (-0.15-(-0.7)));
            zz = 0.75 + (((tickAnim - 11) / 1) * (0.38-(0.75)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.15 + (((tickAnim - 12) / 1) * (0-(-0.15)));
            zz = 0.38 + (((tickAnim - 12) / 1) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+200))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+200))*5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+150))*-6), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+250))*5));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(16.29818), leftArm.rotateAngleY + (float) Math.toRadians(-3.65514), leftArm.rotateAngleZ + (float) Math.toRadians(5.15912));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-27.75), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(16.29818), rightArm.rotateAngleY + (float) Math.toRadians(-3.65514), rightArm.rotateAngleZ + (float) Math.toRadians(5.15912));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-27.75), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+200))*6), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+200))*-5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+250))*-6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+250))*5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-21.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5+300))*6), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+300))*-5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-6.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5))*-5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-100))*-5), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577+50))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-50))*10), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-150))*-15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-150))*-5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-200))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-10));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577/0.5-250))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-250))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*577-50))*-10));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpectrovenator entity = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -18.9671 + (((tickAnim - 0) / 11) * (22-(-18.9671)));
            yy = 1.13885 + (((tickAnim - 0) / 11) * (0-(1.13885)));
            zz = 3.30975 + (((tickAnim - 0) / 11) * (0-(3.30975)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 22 + (((tickAnim - 11) / 6) * (-0.88433-(22)));
            yy = 0 + (((tickAnim - 11) / 6) * (31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -0.88433 + (((tickAnim - 17) / 5) * (-18.9671-(-0.88433)));
            yy = 31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 17) / 5) * (1.13885-(31.2038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            zz = 16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20 + (((tickAnim - 17) / 5) * (3.30975-(16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -17.97284 + (((tickAnim - 0) / 11) * (25.75-(-17.97284)));
            yy = -0.51982 + (((tickAnim - 0) / 11) * (0-(-0.51982)));
            zz = -0.14455 + (((tickAnim - 0) / 11) * (0-(-0.14455)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 11) / 5) * (-1.92977-(25.75)));
            yy = 0 + (((tickAnim - 11) / 5) * (-0.23992-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (-0.06671-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -1.92977 + (((tickAnim - 16) / 6) * (-17.97284-(-1.92977)));
            yy = -0.23992 + (((tickAnim - 16) / 6) * (-0.51982-(-0.23992)));
            zz = -0.06671 + (((tickAnim - 16) / 6) * (-0.14455-(-0.06671)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 11) * (0.25-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 11) / 5) * (0.565-(0.25)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0.565 + (((tickAnim - 16) / 6) * (-0.425-(0.565)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.25 + (((tickAnim - 0) / 11) * (-1.25-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -1.25 + (((tickAnim - 11) / 5) * (-51.13-(-1.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -51.13 + (((tickAnim - 16) / 2) * (-51.13-(-51.13)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -51.13 + (((tickAnim - 18) / 4) * (-2.25-(-51.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40.87975 + (((tickAnim - 0) / 4) * (5.08-(40.87975)));
            yy = 3.6112 + (((tickAnim - 0) / 4) * (0-(3.6112)));
            zz = -3.81327 + (((tickAnim - 0) / 4) * (0-(-3.81327)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.08 + (((tickAnim - 4) / 4) * (69.54-(5.08)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 69.54 + (((tickAnim - 8) / 3) * (60.5-(69.54)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60.5 + (((tickAnim - 11) / 5) * (94.81-(60.5)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 94.81 + (((tickAnim - 16) / 3) * (53.42-(94.81)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 53.42 + (((tickAnim - 19) / 3) * (40.87975-(53.42)));
            yy = 0 + (((tickAnim - 19) / 3) * (3.6112-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (-3.81327-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (1.045-(0.35)));
            zz = -0.4 + (((tickAnim - 0) / 2) * (-0.21-(-0.4)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.045 + (((tickAnim - 2) / 2) * (0.175-(1.045)));
            zz = -0.21 + (((tickAnim - 2) / 2) * (0-(-0.21)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.175 + (((tickAnim - 4) / 4) * (0.31-(0.175)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.915-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.31 + (((tickAnim - 8) / 3) * (0.45-(0.31)));
            zz = -0.915 + (((tickAnim - 8) / 3) * (-0.775-(-0.915)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 11) / 2) * (1.69-(0.45)));
            zz = -0.775 + (((tickAnim - 11) / 2) * (-1.07-(-0.775)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.69 + (((tickAnim - 13) / 3) * (1.125-(1.69)));
            zz = -1.07 + (((tickAnim - 13) / 3) * (-1.375-(-1.07)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.125 + (((tickAnim - 16) / 3) * (-0.295-(1.125)));
            zz = -1.375 + (((tickAnim - 16) / 3) * (-0.82-(-1.375)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = -0.295 + (((tickAnim - 19) / 3) * (0.35-(-0.295)));
            zz = -0.82 + (((tickAnim - 19) / 3) * (-0.4-(-0.82)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 0) / 5) * (-0.88433-(22)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.88433 + (((tickAnim - 5) / 5) * (-18.9671-(-0.88433)));
            yy = -12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 5) / 5) * (-1.13885-(-12.3712+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            zz = 16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20 + (((tickAnim - 5) / 5) * (-3.30975-(16.9149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -18.9671 + (((tickAnim - 10) / 12) * (22-(-18.9671)));
            yy = -1.13885 + (((tickAnim - 10) / 12) * (0-(-1.13885)));
            zz = -3.30975 + (((tickAnim - 10) / 12) * (0-(-3.30975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25.75 + (((tickAnim - 0) / 5) * (-1.92977-(25.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.23992-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.06671-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.92977 + (((tickAnim - 5) / 5) * (-17.97284-(-1.92977)));
            yy = -0.23992 + (((tickAnim - 5) / 5) * (-0.51982-(-0.23992)));
            zz = -0.06671 + (((tickAnim - 5) / 5) * (-0.14455-(-0.06671)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -17.97284 + (((tickAnim - 10) / 12) * (25.75-(-17.97284)));
            yy = -0.51982 + (((tickAnim - 10) / 12) * (0-(-0.51982)));
            zz = -0.14455 + (((tickAnim - 10) / 12) * (0-(-0.14455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.565-(0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.565 + (((tickAnim - 5) / 5) * (-0.425-(0.565)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 12) * (0.25-(-0.425)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 60.5 + (((tickAnim - 0) / 5) * (94.81-(60.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 94.81 + (((tickAnim - 5) / 3) * (53.42-(94.81)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 53.42 + (((tickAnim - 8) / 2) * (40.87975-(53.42)));
            yy = 0 + (((tickAnim - 8) / 2) * (-3.6112-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (3.81327-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 40.87975 + (((tickAnim - 10) / 5) * (2.58-(40.87975)));
            yy = -3.6112 + (((tickAnim - 10) / 5) * (0-(-3.6112)));
            zz = 3.81327 + (((tickAnim - 10) / 5) * (0-(3.81327)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.58 + (((tickAnim - 15) / 3) * (69.54-(2.58)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 69.54 + (((tickAnim - 18) / 4) * (60.5-(69.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 3) * (1.69-(0.45)));
            zz = -0.775 + (((tickAnim - 0) / 3) * (-1.07-(-0.775)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.69 + (((tickAnim - 3) / 2) * (1.125-(1.69)));
            zz = -1.07 + (((tickAnim - 3) / 2) * (-1.375-(-1.07)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.125 + (((tickAnim - 5) / 3) * (-0.295-(1.125)));
            zz = -1.375 + (((tickAnim - 5) / 3) * (-0.82-(-1.375)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.295 + (((tickAnim - 8) / 2) * (0.35-(-0.295)));
            zz = -0.82 + (((tickAnim - 8) / 2) * (-0.4-(-0.82)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 10) / 3) * (0.87-(0.35)));
            zz = -0.4 + (((tickAnim - 10) / 3) * (-0.21-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.87 + (((tickAnim - 13) / 2) * (0.1-(0.87)));
            zz = -0.21 + (((tickAnim - 13) / 2) * (0-(-0.21)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 15) / 2) * (0.645-(0.1)));
            zz = 0 + (((tickAnim - 15) / 2) * (-0.46-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.645 + (((tickAnim - 17) / 1) * (-0.265-(0.645)));
            zz = -0.46 + (((tickAnim - 17) / 1) * (-0.915-(-0.46)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.265 + (((tickAnim - 18) / 4) * (0.45-(-0.265)));
            zz = -0.915 + (((tickAnim - 18) / 4) * (-0.775-(-0.915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.75 + (((tickAnim - 0) / 5) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.75 + (((tickAnim - 5) / 5) * (0-(19.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-75.37-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -75.37 + (((tickAnim - 18) / 4) * (19.75-(-75.37)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0.73-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 17) / 1) * (-0.7-(-0.2)));
            zz = 0.73 + (((tickAnim - 17) / 1) * (0.75-(0.73)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 2) * (-0.15-(-0.7)));
            zz = 0.75 + (((tickAnim - 18) / 2) * (0.38-(0.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 20) / 2) * (0-(-0.15)));
            zz = 0.38 + (((tickAnim - 20) / 2) * (0-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-80))*2), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+80))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-50))*0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-100))*-1);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-75.37-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -75.37 + (((tickAnim - 8) / 3) * (19.75-(-75.37)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 19.75 + (((tickAnim - 11) / 11) * (0-(19.75)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.73-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 6) / 2) * (-0.7-(-0.2)));
            zz = 0.73 + (((tickAnim - 6) / 2) * (0.75-(0.73)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.7 + (((tickAnim - 8) / 1) * (-0.15-(-0.7)));
            zz = 0.75 + (((tickAnim - 8) / 1) * (0.38-(0.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 9) / 2) * (0-(-0.15)));
            zz = 0.38 + (((tickAnim - 9) / 2) * (0-(0.38)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.25 + (((tickAnim - 0) / 5) * (-51.13-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -51.13 + (((tickAnim - 5) / 2) * (-51.13-(-51.13)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -51.13 + (((tickAnim - 7) / 3) * (-2.25-(-51.13)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -2.25 + (((tickAnim - 10) / 12) * (-1.25-(-2.25)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-150))*-2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+150))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-250))*3), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+180))*2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-250))*-3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+180))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-300))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+180))*2));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-250))*-3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+180))*2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-300))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+180))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-300))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-380))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-450))*-3), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-500))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-150))*-4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-50))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-100))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-250))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-100))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-200))*6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-300))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-100))*-2));


    }




    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSpectrovenator ee = (EntityPrehistoricFloraSpectrovenator) entitylivingbaseIn;

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
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpectrovenator e = (EntityPrehistoricFloraSpectrovenator) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
