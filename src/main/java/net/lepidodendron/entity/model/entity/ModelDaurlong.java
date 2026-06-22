package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDaurlong;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDaurlong extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer HeadFeathers4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer HeadFeathers3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Eye;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer HeadFeathers2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer HeadFeathers;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private ModelAnimator animator;

    public ModelDaurlong() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 11.1378F, 1.6454F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.3325F, 0.7194F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -2.0F, -1.7F, -2.3F, 4, 4, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.412F, -2.6841F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 22, -2.0F, -1.2F, -2.2F, 4, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.53F, 0.0188F);
        this.Hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 41, -2.0F, -0.3F, -1.5F, 3, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.431F, 0.7021F);
        this.Hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 41, -2.0F, -1.5F, -2.0F, 3, 3, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.1754F, -2.9535F);
        this.Hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 0, -1.5F, -1.5F, -2.0F, 4, 5, 4, -0.01F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, -0.7225F, -4.7455F);
        this.Hips.addChild(Body);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.1325F, -3.2742F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 33, -2.0F, 0.4F, -1.0F, 4, 3, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 2.3828F, -1.4082F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 15, 0.0F, 1.3F, -0.5F, 2, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 41, -0.5F, -1.5F, -1.5F, 3, 3, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.246F, -1.2842F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2967F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 33, -3.0F, -1.4F, -2.5F, 4, 3, 4, -0.01F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.07F, -3.8001F);
        this.Body.addChild(Neck);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4884F, -3.2166F);
        this.Neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.192F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 63, 47, -1.0F, 0.4959F, 1.0477F, 2, 2, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.5884F, -3.2166F);
        this.Neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2094F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 67, 0.0F, 1.5777F, 2.3537F, 0, 1, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 35, -0.5F, 1.6777F, 1.7537F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.4782F, -0.5817F);
        this.Neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 57, -1.0F, -0.5F, -1.6F, 2, 1, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5884F, -3.2166F);
        this.Neck.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 56, -1.0F, 0.3979F, 0.8247F, 2, 2, 3, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0375F, 0.7479F, -1.6336F);
        this.Neck.addChild(Neck2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1875F, -1.685F, -0.7015F);
        this.Neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.2043F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 0, -0.65F, -1.1354F, -0.4984F, 1, 2, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 0, -0.05F, -1.1354F, -0.4984F, 1, 2, 3, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(-0.0375F, -2.1968F, -0.1836F);
        this.Neck2.addChild(Neck3);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.2789F, -2.5827F);
        this.Neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 62, -0.5F, -2.4097F, -0.1239F, 1, 2, 2, 0.003F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0177F, -1.1582F);
        this.Neck3.addChild(Head);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4F, 1.2896F, -1.7916F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4028F, -0.0803F, -0.0342F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 68, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.2967F, -1.4245F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7248F, -0.1445F, -0.1268F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 68, -0.8477F, -1.5317F, -1.1069F, 1, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.4F, 1.2896F, -1.7916F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4028F, 0.0803F, 0.0342F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 68, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.2967F, -1.4245F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7248F, 0.1445F, 0.1268F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 68, -0.1523F, -1.5317F, -1.1069F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.2967F, -1.4245F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 68, 16, -0.5F, -1.0641F, -2.9881F, 1, 1, 2, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.2967F, -1.4245F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 68, 12, -0.5F, -0.2545F, -3.1617F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.2967F, -1.4245F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2269F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 62, -1.0F, -1.6864F, -0.0909F, 2, 2, 2, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.2967F, 0.1756F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3142F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 30, -1.0F, -0.767F, 0.3809F, 2, 1, 1, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1129F, -0.3818F, -0.0422F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 7, -0.8141F, 0.2483F, -0.5848F, 1, 1, 1, -0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1047F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 62, -0.5F, 0.2491F, -2.9721F, 1, 1, 3, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1129F, 0.3818F, 0.0422F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 53, 7, -0.1859F, 0.2483F, -0.5848F, 1, 1, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.192F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 64, 20, -1.0F, 0.2468F, -0.0811F, 2, 1, 2, -0.01F, false));

        this.HeadFeathers4 = new AdvancedModelRenderer(this);
        this.HeadFeathers4.setRotationPoint(0.0F, -0.3397F, -1.6758F);
        this.Head.addChild(HeadFeathers4);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.3516F, 0.7366F);
        this.HeadFeathers4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.576F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 55, 66, -1.0F, -0.2F, -1.0F, 2, 1, 2, -0.01F, false));

        this.HeadFeathers3 = new AdvancedModelRenderer(this);
        this.HeadFeathers3.setRotationPoint(0.0F, -0.6357F, -0.6089F);
        this.Head.addChild(HeadFeathers3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.9324F, -0.8155F);
        this.HeadFeathers3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.4363F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 60, -1.0F, -1.4296F, 1.1057F, 2, 1, 2, -0.01F, false));

        this.Eye = new AdvancedModelRenderer(this);
        this.Eye.setRotationPoint(0.0F, 0.2697F, -0.8558F);
        this.Head.addChild(Eye);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.027F, -0.5687F);
        this.Eye.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 63, 52, -1.1F, -1.4127F, 0.2384F, 1, 1, 1, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 63, 52, 0.1F, -1.4127F, 0.2384F, 1, 1, 1, 0.0F, false));

        this.HeadFeathers2 = new AdvancedModelRenderer(this);
        this.HeadFeathers2.setRotationPoint(0.0F, -1.7411F, -1.1119F);
        this.Neck3.addChild(HeadFeathers2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.02F, -1.4708F);
        this.HeadFeathers2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3491F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 67, -0.5F, -2.4231F, 0.7166F, 1, 1, 2, 0.01F, false));

        this.HeadFeathers = new AdvancedModelRenderer(this);
        this.HeadFeathers.setRotationPoint(0.0F, -0.2419F, 0.3846F);
        this.Neck3.addChild(HeadFeathers);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.15F, 1.5537F, -0.5025F);
        this.HeadFeathers.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.4363F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 59, 12, -0.65F, -1.6613F, -0.2663F, 1, 1, 1, 0.01F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(-0.0375F, -0.787F, -1.2326F);
        this.Neck2.addChild(Throat);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.15F, -0.0981F, 0.8311F);
        this.Throat.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.6283F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 7, 69, -0.65F, 0.1903F, -1.7897F, 1, 1, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.15F, -0.0981F, 0.8311F);
        this.Throat.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.8901F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 67, -0.15F, 0.8583F, -1.4395F, 0, 1, 3, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.8712F, 2.403F, -2.6749F);
        this.Body.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.0001F, 0.0393F, -0.0087F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.3F, 1.5F);
        this.leftArm.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2618F, 0.2269F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 11, 57, 0.5288F, -4.1275F, -2.1049F, 0, 2, 4, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 60, 41, -0.2712F, -2.9275F, -2.2049F, 1, 2, 3, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.3168F, 0.679F, 2.6038F);
        this.leftArm.addChild(leftArm2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.4142F, 1.3112F, -1.6506F);
        this.leftArm2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.8151F, 0.3491F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 57, 0.0F, -0.9F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.3168F, 1.721F, -1.0038F);
        this.leftArm2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -2.2689F, 0.3491F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 26, 49, 0.3297F, -3.1455F, -3.9018F, 0, 3, 5, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 51, 35, -0.5703F, -0.3455F, -2.9018F, 1, 1, 4, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-0.5756F, 2.2629F, -1.7661F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.3498F, 2.4934F, 1.4837F);
        this.leftArm3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.9774F, 0.3491F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 55, 61, -0.791F, -1.1335F, -3.2402F, 1, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.3498F, 2.4934F, 1.4837F);
        this.leftArm3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -2.5307F, 0.3491F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 43, 67, 0.291F, -3.219F, -1.0362F, 0, 2, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.3498F, 2.4934F, 1.4837F);
        this.leftArm3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -1.4486F, 0.3491F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 61, 55, -0.791F, 0.6512F, -2.8117F, 1, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.3498F, 2.4934F, 1.4837F);
        this.leftArm3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -1.1519F, 0.3491F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 50, 55, -0.691F, -0.2192F, -3.2098F, 1, 1, 4, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.3498F, 2.4934F, 1.4837F);
        this.leftArm3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -2.8274F, 0.3491F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 48, 61, 0.391F, -1.4475F, -2.4347F, 0, 4, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.8712F, 2.403F, -2.6749F);
        this.Body.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.0001F, -0.0393F, 0.0087F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 2.3F, 1.5F);
        this.rightArm.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2618F, -0.2269F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 57, -0.5288F, -4.1275F, -2.1049F, 0, 2, 4, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 60, 41, -0.7288F, -2.9275F, -2.2049F, 1, 2, 3, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-0.3168F, 0.679F, 2.6038F);
        this.rightArm.addChild(rightArm2);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.4142F, 1.3112F, -1.6506F);
        this.rightArm2.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -1.8151F, -0.3491F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 30, 57, 0.0F, -0.9F, -2.0F, 0, 1, 3, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.3168F, 1.721F, -1.0038F);
        this.rightArm2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -2.2689F, -0.3491F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 26, 49, -0.3297F, -3.1455F, -3.9018F, 0, 3, 5, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 51, 35, -0.4297F, -0.3455F, -2.9018F, 1, 1, 4, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.5756F, 2.2629F, -1.7661F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.3498F, 2.4934F, 1.4837F);
        this.rightArm3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.9774F, -0.3491F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 55, 61, -0.209F, -1.1335F, -3.2402F, 1, 1, 3, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.3498F, 2.4934F, 1.4837F);
        this.rightArm3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -2.5307F, -0.3491F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 43, 67, -0.291F, -3.219F, -1.0362F, 0, 2, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.3498F, 2.4934F, 1.4837F);
        this.rightArm3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -1.4486F, -0.3491F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 61, 55, -0.209F, 0.6512F, -2.8117F, 1, 1, 3, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.3498F, 2.4934F, 1.4837F);
        this.rightArm3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -1.1519F, -0.3491F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 50, 55, -0.309F, -0.2192F, -3.2098F, 1, 1, 4, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.3498F, 2.4934F, 1.4837F);
        this.rightArm3.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -2.8274F, -0.3491F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 61, -0.391F, -1.4475F, -2.4347F, 0, 4, 3, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, -0.2244F, 2.7327F);
        this.Hips.addChild(Tail);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.9531F, 0.8716F, 2.0823F);
        this.Tail.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.028F, -0.0375F, -0.3647F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 64, 64, -0.6F, 0.6F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 3.3075F, 1.4601F);
        this.Tail.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1047F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 20, 63, -0.5F, 0.3F, -2.0F, 1, 1, 3, -0.02F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 20, 58, -1.0F, 0.4F, -1.2F, 2, 1, 3, -0.02F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 46, 0, -1.5F, -1.5F, -1.9F, 3, 2, 4, -0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(1.9531F, 0.8716F, 2.0823F);
        this.Tail.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.028F, 0.0375F, 0.3647F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 64, 64, -0.4F, 0.6F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0867F, 1.6219F);
        this.Tail.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1745F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 30, 41, -1.5F, -0.3F, -1.6F, 3, 3, 4, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(-0.0833F, 0.7478F, 3.892F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 59, 7, -0.9167F, 2.2098F, 0.2441F, 2, 1, 3, -0.02F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 9, 64, -0.4167F, 2.1098F, -0.4559F, 1, 1, 3, -0.02F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-2.6167F, 1.2747F, 1.6412F);
        this.Tail2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0978F, -0.0375F, -0.3647F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 51, 30, 0.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(2.7833F, 1.2747F, 1.6412F);
        this.Tail2.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0978F, 0.0375F, 0.3647F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 51, 30, -2.0F, 0.0F, -2.0F, 2, 0, 4, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0833F, 1.3533F, 1.8706F);
        this.Tail2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.1571F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 49, -1.0F, -1.6F, -2.3F, 2, 3, 4, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0119F, 0.4152F, 3.674F);
        this.Tail2.addChild(Tail3);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-2.2551F, 1.1873F, 2.4575F);
        this.Tail3.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0629F, -0.0375F, -0.3647F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 40, 15, -1.0F, -0.1F, -2.6F, 3, 0, 5, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5714F, 0.8208F, 2.3907F);
        this.Tail3.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0873F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 13, 49, -1.2F, -1.0F, -2.5F, 1, 2, 5, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 13, 49, -0.8F, -1.0F, -2.5F, 1, 2, 5, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0714F, 1.8446F, 2.1201F);
        this.Tail3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1222F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 53, 21, 0.0F, -0.55F, -2.65F, 0, 1, 5, 0.0F, false));
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 37, 49, -0.5F, -0.45F, -2.35F, 1, 1, 5, -0.02F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(2.398F, 1.1873F, 2.4575F);
        this.Tail3.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.0629F, 0.0375F, 0.3647F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 15, -2.0F, -0.1F, -2.6F, 3, 0, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0714F, 0.3636F, 4.9413F);
        this.Tail3.addChild(Tail4);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-2.4237F, 1.0836F, 2.4093F);
        this.Tail4.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.2549F, -0.0375F, -0.3647F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 0, -2.0F, 0.5F, -2.5F, 4, 0, 10, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 2.6477F, 9.0534F);
        this.Tail4.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.7505F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 10, -2.5F, 0.2F, -0.5F, 5, 0, 4, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(2.4237F, 1.0836F, 2.4093F);
        this.Tail4.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.2549F, 0.0375F, 0.3647F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 0, -2.0F, 0.5F, -2.5F, 4, 0, 10, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.5F, 0.888F, 2.2716F);
        this.Tail4.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.2967F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 11, 0.0F, -0.5F, -2.5F, 1, 1, 9, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.9F, 0.0715F, -1.1388F);
        this.Hips.addChild(leftLeg);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 2.9F, -1.3F);
        this.leftLeg.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -1.7802F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 19, 22, -1.5F, -3.7F, -4.1F, 2, 4, 6, 0.02F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.25F, 4.614F, -1.6768F);
        this.leftLeg.addChild(leftLeg2);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.25F, 1.9018F, 2.8882F);
        this.leftLeg2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, -0.8552F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 22, -1.5F, -0.9F, -3.5F, 2, 2, 7, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.25F, 4.0351F, 5.7576F);
        this.leftLeg2.addChild(leftLeg3);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.5F, 1.3975F, -1.3703F);
        this.leftLeg3.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -1.9548F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 50, 49, -1.5F, -0.8F, -1.9F, 2, 1, 4, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(-0.0667F, 3.1602F, -1.7703F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 64, 24, -0.9333F, -0.0186F, -1.5F, 2, 1, 2, 0.01F, false));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0667F, 0.4814F, -1.5F);
        this.leftLeg4.addChild(leftLeg5);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 64, 28, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(-0.6333F, 0.0181F, -0.7569F);
        this.leftLeg4.addChild(leftLeg6);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, -0.7791F, -0.3179F);
        this.leftLeg6.addChild(cube_r68);
        this.setRotateAngle(cube_r68, -1.1694F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 69, 40, 0.0F, -0.3F, -1.3F, 0, 2, 2, 0.0F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.0633F, 0.2569F);
        this.leftLeg6.addChild(cube_r69);
        this.setRotateAngle(cube_r69, -0.6807F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 64, 32, -0.5F, -0.2F, -1.0F, 1, 1, 1, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.9F, 0.0715F, -1.1388F);
        this.Hips.addChild(rightLeg);


        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.0F, 2.9F, -1.3F);
        this.rightLeg.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -1.7802F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 19, 22, -0.5F, -3.7F, -4.1F, 2, 4, 6, 0.02F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.25F, 4.614F, -1.6768F);
        this.rightLeg.addChild(rightLeg2);


        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(-0.25F, 1.9018F, 2.8882F);
        this.rightLeg2.addChild(cube_r71);
        this.setRotateAngle(cube_r71, -0.8552F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 0, 22, -0.5F, -0.9F, -3.5F, 2, 2, 7, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.25F, 4.0351F, 5.7576F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, 1.3975F, -1.3703F);
        this.rightLeg3.addChild(cube_r72);
        this.setRotateAngle(cube_r72, -1.9548F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 50, 49, -0.5F, -0.8F, -1.9F, 2, 1, 4, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0667F, 3.1602F, -1.7703F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 64, 24, -1.0667F, -0.0186F, -1.5F, 2, 1, 2, 0.01F, true));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-0.0667F, 0.4814F, -1.5F);
        this.rightLeg4.addChild(rightLeg5);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 64, 28, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, true));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.6333F, 0.0181F, -0.7569F);
        this.rightLeg4.addChild(rightLeg6);


        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, -0.7791F, -0.3179F);
        this.rightLeg6.addChild(cube_r73);
        this.setRotateAngle(cube_r73, -1.1694F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 69, 40, 0.0F, -0.3F, -1.3F, 0, 2, 2, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 0.0633F, 0.2569F);
        this.rightLeg6.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.6807F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 64, 32, -0.5F, -0.2F, -1.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.650F;
        this.Hips.offsetX = 0.1F;
        this.Hips.rotateAngleY = (float)Math.toRadians(225);
        this.Hips.rotateAngleX = (float)Math.toRadians(-10);
        this.Hips.rotateAngleZ = (float)Math.toRadians(3);
        this.Hips.scaleChildren = true;
        float scaler = 1.15F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraDaurlong EntityMegalosaurus = (EntityPrehistoricFloraDaurlong) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Jaw, 0.1F, 0.05F, true, 3F, -0.05F, f2, 1F);

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        this.Eye.setScale(1,1,1);
        EntityPrehistoricFloraDaurlong ee = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10 + (((tickAnim - 3) / 3) * (5-(-10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 6) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -19.25 + (((tickAnim - 3) / 3) * (24-(-19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 24 + (((tickAnim - 6) / 4) * (0-(24)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 3) * (0-(-0.5)));
            zz = 0.575 + (((tickAnim - 3) / 3) * (0-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -17.25 + (((tickAnim - 3) / 3) * (40-(-17.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 6) / 4) * (0-(40)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.025-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.575 + (((tickAnim - 3) / 3) * (0.1-(-0.575)));
            zz = -0.025 + (((tickAnim - 3) / 3) * (-0.7-(-0.025)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 6) / 4) * (0-(0.1)));
            zz = -0.7 + (((tickAnim - 6) / 4) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 19.25 + (((tickAnim - 3) / 3) * (-20.75-(19.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 6) / 2) * (-0.95-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.95 + (((tickAnim - 8) / 2) * (0-(-0.95)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 3) * (0.15-(-0.3)));
            zz = -0.1 + (((tickAnim - 3) / 3) * (0.3-(-0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (-0.16-(0.15)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.18-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.16 + (((tickAnim - 8) / 2) * (0-(-0.16)));
            zz = 0.18 + (((tickAnim - 8) / 2) * (0-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 18 + (((tickAnim - 3) / 3) * (-59.75-(18)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -59.75 + (((tickAnim - 6) / 2) * (-10.65-(-59.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.65 + (((tickAnim - 8) / 2) * (0-(-10.65)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (42.5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 42.5 + (((tickAnim - 6) / 2) * (0-(42.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 10) / 10) * (0-(16)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.175-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.175 + (((tickAnim - 10) / 10) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29 + (((tickAnim - 10) / 10) * (0-(29)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (67.25-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 67.25 + (((tickAnim - 10) / 5) * (0-(67.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-0.9-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 10) / 5) * (0-(-0.1)));
            zz = -0.9 + (((tickAnim - 10) / 5) * (0-(-0.9)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (36.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 36.5 + (((tickAnim - 4) / 6) * (0-(36.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (36.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 36.5 + (((tickAnim - 15) / 5) * (0-(36.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -41 + (((tickAnim - 10) / 10) * (0-(-41)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (27.25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 27.25 + (((tickAnim - 8) / 2) * (0-(27.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -29.25 + (((tickAnim - 10) / 10) * (-30.5-(-29.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -30.5 + (((tickAnim - 20) / 17) * (25-(-30.5)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 25 + (((tickAnim - 37) / 6) * (-16.5-(25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 43) / 7) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.62-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.62 + (((tickAnim - 10) / 10) * (-6.75-(29.62)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -6.75 + (((tickAnim - 20) / 17) * (22.5-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 22.5 + (((tickAnim - 37) / 6) * (30.25-(22.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 30.25 + (((tickAnim - 43) / 7) * (0-(30.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-24.13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -24.13 + (((tickAnim - 10) / 10) * (11.25-(-24.13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = 11.25 + (((tickAnim - 20) / 17) * (21.5-(11.25)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 21.5 + (((tickAnim - 37) / 6) * (-22.75-(21.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -22.75 + (((tickAnim - 43) / 7) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (76.37-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 76.37 + (((tickAnim - 10) / 10) * (26.75-(76.37)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 26.75 + (((tickAnim - 20) / 7) * (-12.3-(26.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 37) {
            xx = -12.3 + (((tickAnim - 27) / 10) * (42.25-(-12.3)));
            yy = 0 + (((tickAnim - 27) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 10) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 42.25 + (((tickAnim - 37) / 6) * (68.88-(42.25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 68.88 + (((tickAnim - 43) / 7) * (0-(68.88)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -32.25 + (((tickAnim - 15) / 15) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -32.25 + (((tickAnim - 30) / 10) * (13.25-(-32.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 40) / 10) * (0-(13.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.05-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -6.05 + (((tickAnim - 15) / 15) * (-6.05-(-6.05)));
            zz = 5.1 + (((tickAnim - 15) / 15) * (5.1-(5.1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -6.05 + (((tickAnim - 30) / 10) * (-2.65-(-6.05)));
            zz = 5.1 + (((tickAnim - 30) / 10) * (3.775-(5.1)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -2.65 + (((tickAnim - 40) / 10) * (0-(-2.65)));
            zz = 3.775 + (((tickAnim - 40) / 10) * (0-(3.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 16.25 + (((tickAnim - 15) / 15) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 30) / 20) * (0-(16.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
            zz = 0.15 + (((tickAnim - 15) / 15) * (0.15-(0.15)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
            zz = 0.15 + (((tickAnim - 30) / 20) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 15) / 15) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 30) / 10) * (-14.75-(18.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -14.75 + (((tickAnim - 40) / 10) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.475-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.475 + (((tickAnim - 40) / 10) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.25 + (((tickAnim - 8) / 7) * (-3.75-(-9.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.75 + (((tickAnim - 15) / 15) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 30) / 10) * (10.5-(-3.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 40) / 10) * (0-(10.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 8) / 7) * (-3.5-(12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 15) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 30) / 10) * (-36.25-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -36.25 + (((tickAnim - 40) / 10) * (0-(-36.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 40) / 10) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.175-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 40) / 10) * (0-(0.5)));
            zz = -0.175 + (((tickAnim - 40) / 10) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 15) / 15) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.75 + (((tickAnim - 30) / 10) * (4.5-(7.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 40) / 10) * (0-(4.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.65 + (((tickAnim - 15) / 15) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.65 + (((tickAnim - 30) / 10) * (-0.45-(-0.65)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -0.45 + (((tickAnim - 40) / 10) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail.rotationPointX = this.Tail.rotationPointX + (float)(xx);
        this.Tail.rotationPointY = this.Tail.rotationPointY - (float)(yy);
        this.Tail.rotationPointZ = this.Tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 12.25 + (((tickAnim - 15) / 15) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 30) / 5) * (1.87-(12.25)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.87 + (((tickAnim - 35) / 5) * (1.75-(1.87)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 40) / 10) * (0-(1.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.4 + (((tickAnim - 15) / 15) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.rotationPointX = this.Tail2.rotationPointX + (float)(xx);
        this.Tail2.rotationPointY = this.Tail2.rotationPointY - (float)(yy);
        this.Tail2.rotationPointZ = this.Tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 15) / 15) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 30) / 5) * (-5.63-(8.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5.63 + (((tickAnim - 35) / 5) * (-20-(-5.63)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 40) / 10) * (0-(-20)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.4 + (((tickAnim - 15) / 15) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.4 + (((tickAnim - 30) / 10) * (0-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(xx);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(yy);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 15) / 15) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 15.75 + (((tickAnim - 30) / 10) * (-8.5-(15.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 40) / 10) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 15) / 15) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-47.5-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -47.5 + (((tickAnim - 40) / 10) * (0-(-47.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 15) / 15) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 15) / 15) * (-36-(-36)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -36 + (((tickAnim - 30) / 10) * (-30-(-36)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 40) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 75 + (((tickAnim - 15) / 15) * (75-(75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 75 + (((tickAnim - 30) / 10) * (53.25-(75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 40) / 10) * (0-(53.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.035-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.035 + (((tickAnim - 8) / 7) * (0.725-(1.035)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 15) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 10) * (0-(0.725)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.325-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-21.35911-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.81798-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-14.40925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -21.35911 + (((tickAnim - 15) / 15) * (-21.35911-(-21.35911)));
            yy = -1.81798 + (((tickAnim - 15) / 15) * (-1.81798-(-1.81798)));
            zz = -14.40925 + (((tickAnim - 15) / 15) * (-14.40925-(-14.40925)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.35911 + (((tickAnim - 30) / 10) * (-39.79547-(-21.35911)));
            yy = -1.81798 + (((tickAnim - 30) / 10) * (25.45482-(-1.81798)));
            zz = -14.40925 + (((tickAnim - 30) / 10) * (-56.29435-(-14.40925)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -39.79547 + (((tickAnim - 40) / 10) * (0-(-39.79547)));
            yy = 25.45482 + (((tickAnim - 40) / 10) * (0-(25.45482)));
            zz = -56.29435 + (((tickAnim - 40) / 10) * (0-(-56.29435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -27.75 + (((tickAnim - 15) / 15) * (-27.75-(-27.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.75 + (((tickAnim - 30) / 10) * (-47.5-(-27.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -47.5 + (((tickAnim - 40) / 10) * (0-(-47.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 22.5 + (((tickAnim - 15) / 15) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 22.5 + (((tickAnim - 30) / 20) * (0-(22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-36-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -36 + (((tickAnim - 15) / 15) * (-36-(-36)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -36 + (((tickAnim - 30) / 10) * (-30-(-36)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 40) / 10) * (0-(-30)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 75 + (((tickAnim - 15) / 15) * (75-(75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 75 + (((tickAnim - 30) / 10) * (53.25-(75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 53.25 + (((tickAnim - 40) / 10) * (0-(53.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.035-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.035 + (((tickAnim - 8) / 7) * (0.725-(1.035)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 15) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 10) * (0-(0.725)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.325-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-21.35911-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.81798-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (14.40925-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -21.35911 + (((tickAnim - 15) / 15) * (-21.35911-(-21.35911)));
            yy = 1.81798 + (((tickAnim - 15) / 15) * (1.81798-(1.81798)));
            zz = 14.40925 + (((tickAnim - 15) / 15) * (14.40925-(14.40925)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -21.35911 + (((tickAnim - 30) / 10) * (-39.79547-(-21.35911)));
            yy = 1.81798 + (((tickAnim - 30) / 10) * (-25.45482-(1.81798)));
            zz = 14.40925 + (((tickAnim - 30) / 10) * (56.29435-(14.40925)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -39.79547 + (((tickAnim - 40) / 10) * (0-(-39.79547)));
            yy = -25.45482 + (((tickAnim - 40) / 10) * (0-(-25.45482)));
            zz = 56.29435 + (((tickAnim - 40) / 10) * (0-(56.29435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10 + (((tickAnim - 0) / 12) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10 + (((tickAnim - 12) / 13) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288))*-10)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 4.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*-10 + (((tickAnim - 0) / 20) * (14.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*30-(4.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*-10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*30 + (((tickAnim - 20) / 5) * (4.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*-10-(14.15-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-150))*30)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*10 + (((tickAnim - 0) / 20) * (-25.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-30-(3.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -25.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-30 + (((tickAnim - 20) / 5) * (3.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*10-(-25.925-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-30)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-300))*10 + (((tickAnim - 0) / 20) * (-29.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-50-(8.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-300))*10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -29.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-50 + (((tickAnim - 20) / 5) * (8.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-300))*10-(-29.625-Math.sin((Math.PI/180)*(((double)tickAnim/20)*288-200))*-50)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-6.425-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-400))*10), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(9.725-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-400))*-15), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 11) / 9) * (16.25-(-9.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 16.25 + (((tickAnim - 20) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0.825 + (((tickAnim - 11) / 9) * (-0.725-(0.825)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 20) / 5) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 0) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 11) * (1-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 11) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 11) / 9) * (1.3-(1)));
            zz = 1 + (((tickAnim - 11) / 9) * (1.1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 20) / 5) * (1-(1)));
            yy = 1.3 + (((tickAnim - 20) / 5) * (1-(1.3)));
            zz = 1.1 + (((tickAnim - 20) / 5) * (1-(1.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throat.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 38) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 43) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0.19 + (((tickAnim - 48) / 2) * (0-(0.19)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0.19-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 47) * (0-(0)));
            zz = 0.19 + (((tickAnim - 53) / 47) * (0-(0.19)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (48.13232-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-13.78508-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (3.51222-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 48.13232 + (((tickAnim - 35) / 20) * (48.13232-(48.13232)));
            yy = -13.78508 + (((tickAnim - 35) / 20) * (-13.78508-(-13.78508)));
            zz = 3.51222 + (((tickAnim - 35) / 20) * (3.51222-(3.51222)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 48.13232 + (((tickAnim - 55) / 10) * (48.16813-(48.13232)));
            yy = -13.78508 + (((tickAnim - 55) / 10) * (-8.03807-(-13.78508)));
            zz = 3.51222 + (((tickAnim - 55) / 10) * (3.32327-(3.51222)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 48.16813 + (((tickAnim - 65) / 35) * (0-(48.16813)));
            yy = -8.03807 + (((tickAnim - 65) / 35) * (0-(-8.03807)));
            zz = 3.32327 + (((tickAnim - 65) / 35) * (0-(3.32327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (48.27403-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-46.02818-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-7.58699-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 48.27403 + (((tickAnim - 35) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 35) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 35) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 47.77403 + (((tickAnim - 38) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 38) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 38) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 48.27403 + (((tickAnim - 40) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 40) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 40) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 47.77403 + (((tickAnim - 43) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 43) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 43) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 48.27403 + (((tickAnim - 45) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 45) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 45) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 47.77403 + (((tickAnim - 48) / 2) * (48.27403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 48) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 48) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 48.27403 + (((tickAnim - 50) / 3) * (47.77403-(48.27403)));
            yy = -46.02818 + (((tickAnim - 50) / 3) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 50) / 3) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 47.77403 + (((tickAnim - 53) / 2) * (47.77403-(47.77403)));
            yy = -46.02818 + (((tickAnim - 53) / 2) * (-46.02818-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 53) / 2) * (-7.58699-(-7.58699)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 47.77403 + (((tickAnim - 55) / 10) * (35.93929-(47.77403)));
            yy = -46.02818 + (((tickAnim - 55) / 10) * (-35.93643-(-46.02818)));
            zz = -7.58699 + (((tickAnim - 55) / 10) * (-0.24927-(-7.58699)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 35.93929 + (((tickAnim - 65) / 35) * (0-(35.93929)));
            yy = -35.93643 + (((tickAnim - 65) / 35) * (0-(-35.93643)));
            zz = -0.24927 + (((tickAnim - 65) / 35) * (0-(-0.24927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.35-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0.4 + (((tickAnim - 35) / 20) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = -0.35 + (((tickAnim - 35) / 20) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = 0.4 + (((tickAnim - 55) / 45) * (0-(0.4)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = -0.35 + (((tickAnim - 55) / 45) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (1.11518-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-45.04838-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-10.50705-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.11518 + (((tickAnim - 35) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 35) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 35) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.11518 + (((tickAnim - 38) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 38) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 38) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 1.11518 + (((tickAnim - 40) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 40) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 40) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0.11518 + (((tickAnim - 43) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 43) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 43) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 1.11518 + (((tickAnim - 45) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 45) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 45) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0.11518 + (((tickAnim - 48) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 48) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 48) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 1.11518 + (((tickAnim - 50) / 3) * (0.11518-(1.11518)));
            yy = -45.04838 + (((tickAnim - 50) / 3) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 50) / 3) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0.11518 + (((tickAnim - 53) / 2) * (1.11518-(0.11518)));
            yy = -45.04838 + (((tickAnim - 53) / 2) * (-45.04838-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 53) / 2) * (-10.50705-(-10.50705)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = 1.11518 + (((tickAnim - 55) / 20) * (0-(1.11518)));
            yy = -45.04838 + (((tickAnim - 55) / 20) * (0-(-45.04838)));
            zz = -10.50705 + (((tickAnim - 55) / 20) * (0-(-10.50705)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.025 + (((tickAnim - 35) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.025 + (((tickAnim - 40) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.025 + (((tickAnim - 45) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -0.025 + (((tickAnim - 50) / 5) * (-0.025-(-0.025)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = -0.025 + (((tickAnim - 55) / 45) * (0-(-0.025)));
            yy = 0 + (((tickAnim - 55) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck3.rotationPointX = this.Neck3.rotationPointX + (float)(xx);
        this.Neck3.rotationPointY = this.Neck3.rotationPointY - (float)(yy);
        this.Neck3.rotationPointZ = this.Neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 65) / 10) * (-5.2942+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(0)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (-2.95652-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -5.2942+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 75) / 25) * (0-(-5.2942+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = -2.95652 + (((tickAnim - 75) / 25) * (0-(-2.95652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.2-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.075 + (((tickAnim - 35) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 35) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -0.075 + (((tickAnim - 40) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 40) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -0.075 + (((tickAnim - 45) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 45) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = -0.075 + (((tickAnim - 50) / 5) * (-0.075-(-0.075)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 50) / 5) * (0.2-(0.2)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = -0.075 + (((tickAnim - 55) / 20) * (0.43-(-0.075)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = 0.2 + (((tickAnim - 55) / 20) * (-0.025-(0.2)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0.43 + (((tickAnim - 75) / 25) * (0-(0.43)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = -0.025 + (((tickAnim - 75) / 25) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 12) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 18) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 25) / 10) * (5-(5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 5 + (((tickAnim - 35) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 40) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 5 + (((tickAnim - 45) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 5 + (((tickAnim - 50) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 55) / 10) * (0-(5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = 7.25 + (((tickAnim - 23) / 16) * (11.25481-(7.25)));
            yy = -32.5 + (((tickAnim - 23) / 16) * (-56.95221-(-32.5)));
            zz = 0 + (((tickAnim - 23) / 16) * (-5.55975-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 11.25481 + (((tickAnim - 39) / 16) * (9.21395-(11.25481)));
            yy = -56.95221 + (((tickAnim - 39) / 16) * (-48.33954-(-56.95221)));
            zz = -5.55975 + (((tickAnim - 39) / 16) * (-2.99971-(-5.55975)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 9.21395 + (((tickAnim - 55) / 10) * (7.25-(9.21395)));
            yy = -48.33954 + (((tickAnim - 55) / 10) * (-32.5-(-48.33954)));
            zz = -2.99971 + (((tickAnim - 55) / 10) * (0-(-2.99971)));
        }
        else if (tickAnim >= 65 && tickAnim < 100) {
            xx = 7.25 + (((tickAnim - 65) / 35) * (0-(7.25)));
            yy = -32.5 + (((tickAnim - 65) / 35) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 65) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.375-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 39) {
            xx = 0.375 + (((tickAnim - 23) / 16) * (0.375-(0.375)));
            yy = 0.4 + (((tickAnim - 23) / 16) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 23) / 16) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 0.375 + (((tickAnim - 39) / 16) * (0.375-(0.375)));
            yy = 0.4 + (((tickAnim - 39) / 16) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 39) / 16) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 100) {
            xx = 0.375 + (((tickAnim - 55) / 45) * (0-(0.375)));
            yy = 0.4 + (((tickAnim - 55) / 45) * (0-(0.4)));
            zz = 0 + (((tickAnim - 55) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(xx);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(yy);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (26.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-57.7161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 26.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 23) / 12) * (-42.98842-(26.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = -57.7161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 23) / 12) * (-18.85897-(-57.7161+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 1.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 23) / 12) * (-77.05626-(1.952+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -42.98842 + (((tickAnim - 35) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 35) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 35) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -43.07375 + (((tickAnim - 38) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 38) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 38) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -42.98842 + (((tickAnim - 40) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 40) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 40) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -43.07375 + (((tickAnim - 43) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 43) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 43) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -42.98842 + (((tickAnim - 45) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 45) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 45) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -43.07375 + (((tickAnim - 48) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 48) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 48) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = -42.98842 + (((tickAnim - 50) / 3) * (-43.07375-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 50) / 3) * (-19.08799-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 50) / 3) * (-76.337-(-77.05626)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -43.07375 + (((tickAnim - 53) / 2) * (-42.98842-(-43.07375)));
            yy = -19.08799 + (((tickAnim - 53) / 2) * (-18.85897-(-19.08799)));
            zz = -76.337 + (((tickAnim - 53) / 2) * (-77.05626-(-76.337)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -42.98842 + (((tickAnim - 55) / 10) * (-42.85273-(-42.98842)));
            yy = -18.85897 + (((tickAnim - 55) / 10) * (-18.47498-(-18.85897)));
            zz = -77.05626 + (((tickAnim - 55) / 10) * (-78.25354-(-77.05626)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = -42.85273 + (((tickAnim - 65) / 13) * (-31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-42.85273)));
            yy = -18.47498 + (((tickAnim - 65) / 13) * (-9.23749-(-18.47498)));
            zz = -78.25354 + (((tickAnim - 65) / 13) * (-39.12677-(-78.25354)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 78) / 12) * (0-(-31.5014+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = -9.23749 + (((tickAnim - 78) / 12) * (0-(-9.23749)));
            zz = -39.12677 + (((tickAnim - 78) / 12) * (0-(-39.12677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 50.5 + (((tickAnim - 35) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 50.50541 + (((tickAnim - 38) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 38) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 38) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 50.5 + (((tickAnim - 40) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 50.50541 + (((tickAnim - 43) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 43) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 43) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 50.5 + (((tickAnim - 45) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 50.50541 + (((tickAnim - 48) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 48) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 48) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 50.5 + (((tickAnim - 50) / 3) * (50.50541-(50.5)));
            yy = 0 + (((tickAnim - 50) / 3) * (-1.49313-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (-0.14348-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 50.50541 + (((tickAnim - 53) / 2) * (50.5-(50.50541)));
            yy = -1.49313 + (((tickAnim - 53) / 2) * (0-(-1.49313)));
            zz = -0.14348 + (((tickAnim - 53) / 2) * (0-(-0.14348)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 50.5 + (((tickAnim - 55) / 10) * (50.5-(50.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 78) {
            xx = 50.5 + (((tickAnim - 65) / 13) * (50.04-(50.5)));
            yy = 0 + (((tickAnim - 65) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 13) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 50.04 + (((tickAnim - 78) / 12) * (0-(50.04)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.41314-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-4.7256-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.87217-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 90) {
            xx = 0.41314 + (((tickAnim - 35) / 55) * (0-(0.41314)));
            yy = -4.7256 + (((tickAnim - 35) / 55) * (0-(-4.7256)));
            zz = 5.87217 + (((tickAnim - 35) / 55) * (0-(5.87217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 55) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 55) / 5) * (-0.015-(1)));
            zz = 1 + (((tickAnim - 55) / 5) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 60) / 5) * (1-(1)));
            yy = -0.015 + (((tickAnim - 60) / 5) * (1-(-0.015)));
            zz = 1 + (((tickAnim - 60) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5))*-4), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*4));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-70))*1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-70))*-1.5);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*-8), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*-4));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*-10), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(0);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(0);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(0.25);


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(28.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-300))*12), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-11.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-350))*-12), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-22.75), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(-3.5), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));
        this.Throat.rotationPointX = this.Throat.rotationPointX + (float)(0);
        this.Throat.rotationPointY = this.Throat.rotationPointY - (float)(0.475);
        this.Throat.rotationPointZ = this.Throat.rotationPointZ + (float)(0);


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-50))*8), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*4));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-100))*8), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*4));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-200))*13), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*4));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-250))*15), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615))*4));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -26.79563 + (((tickAnim - 0) / 6) * (20.74602-(-26.79563)));
            yy = -4.12503 + (((tickAnim - 0) / 6) * (-0.06245-(-4.12503)));
            zz = 0.32391 + (((tickAnim - 0) / 6) * (0.00752-(0.32391)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 20.74602 + (((tickAnim - 6) / 3) * (53.7772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.74602)));
            yy = -0.06245 + (((tickAnim - 6) / 3) * (-2.06252-(-0.06245)));
            zz = 0.00752 + (((tickAnim - 6) / 3) * (-0.16196-(0.00752)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 53.7772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 9) / 3) * (-26.79563-(53.7772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -2.06252 + (((tickAnim - 9) / 3) * (-4.12503-(-2.06252)));
            zz = -0.16196 + (((tickAnim - 9) / 3) * (0.32391-(-0.16196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -17.5 + (((tickAnim - 0) / 1) * (-22.96-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = -22.96 + (((tickAnim - 1) / 5) * (23.5-(-22.96)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 23.5 + (((tickAnim - 6) / 3) * (45.18-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(23.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 45.18-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 3) * (-17.5-(45.18-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -3.5 + (((tickAnim - 0) / 1) * (-1.64-(-3.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -1.64 + (((tickAnim - 1) / 1) * (2.05-(-1.64)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 2.05 + (((tickAnim - 2) / 4) * (19-(2.05)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 19 + (((tickAnim - 6) / 3) * (-39.18-(19)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -39.18 + (((tickAnim - 9) / 1) * (-39.18-(-39.18)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -39.18 + (((tickAnim - 10) / 2) * (-3.5-(-39.18)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 9) / 1) * (-0.425-(-0.425)));
            zz = 0.125 + (((tickAnim - 9) / 1) * (0.125-(0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 2) * (0-(-0.425)));
            zz = 0.125 + (((tickAnim - 10) / 2) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 45.2597 + (((tickAnim - 0) / 1) * (41.43329-(45.2597)));
            yy = 1.14055 + (((tickAnim - 0) / 1) * (3.71834-(1.14055)));
            zz = 0.9743 + (((tickAnim - 0) / 1) * (-2.73732-(0.9743)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 41.43329 + (((tickAnim - 1) / 1) * (23.31155-(41.43329)));
            yy = 3.71834 + (((tickAnim - 1) / 1) * (2.28001-(3.71834)));
            zz = -2.73732 + (((tickAnim - 1) / 1) * (-2.2223-(-2.73732)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.31155 + (((tickAnim - 2) / 1) * (10.4675-(23.31155)));
            yy = 2.28001 + (((tickAnim - 2) / 1) * (2.30015-(2.28001)));
            zz = -2.2223 + (((tickAnim - 2) / 1) * (-5.82039-(-2.2223)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.4675 + (((tickAnim - 3) / 1) * (26.20991-(10.4675)));
            yy = 2.30015 + (((tickAnim - 3) / 1) * (0.32587-(2.30015)));
            zz = -5.82039 + (((tickAnim - 3) / 1) * (0.27837-(-5.82039)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.20991 + (((tickAnim - 4) / 2) * (23.5-(26.20991)));
            yy = 0.32587 + (((tickAnim - 4) / 2) * (0-(0.32587)));
            zz = 0.27837 + (((tickAnim - 4) / 2) * (0-(0.27837)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 23.5 + (((tickAnim - 6) / 2) * (99.46983-(23.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.65175-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.55674-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 99.46983 + (((tickAnim - 8) / 2) * (73.14978-(99.46983)));
            yy = 0.65175 + (((tickAnim - 8) / 2) * (0.81468-(0.65175)));
            zz = 0.55674 + (((tickAnim - 8) / 2) * (0.69593-(0.55674)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 73.14978 + (((tickAnim - 10) / 2) * (45.2597-(73.14978)));
            yy = 0.81468 + (((tickAnim - 10) / 2) * (1.14055-(0.81468)));
            zz = 0.69593 + (((tickAnim - 10) / 2) * (0.9743-(0.69593)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 1) / 1) * (0.3-(0.425)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 2) / 1) * (-0.175-(0.3)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 1) * (0.375-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 4) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.525-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 10) / 2) * (0-(0.525)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.93484-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (21.28538-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.31244-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 7.93484 + (((tickAnim - 4) / 2) * (10.44643-(7.93484)));
            yy = 21.28538 + (((tickAnim - 4) / 2) * (11.06817-(21.28538)));
            zz = 3.31244 + (((tickAnim - 4) / 2) * (2.02715-(3.31244)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 10.44643 + (((tickAnim - 6) / 6) * (0-(10.44643)));
            yy = 11.06817 + (((tickAnim - 6) / 6) * (0-(11.06817)));
            zz = 2.02715 + (((tickAnim - 6) / 6) * (0-(2.02715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg6, leftLeg6.rotateAngleX + (float) Math.toRadians(xx), leftLeg6.rotateAngleY + (float) Math.toRadians(yy), leftLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-46.25-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -46.25 + (((tickAnim - 4) / 2) * (40.25-(-46.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 40.25 + (((tickAnim - 6) / 2) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.25 + (((tickAnim - 8) / 2) * (-5.25-(40.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -5.25 + (((tickAnim - 10) / 2) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 4) / 2) * (0.125-(-0.275)));
            zz = 0.25 + (((tickAnim - 4) / 2) * (0.35-(0.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 6) / 2) * (0.125-(0.125)));
            zz = 0.35 + (((tickAnim - 6) / 2) * (0.35-(0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 2) * (0-(0.125)));
            zz = 0.35 + (((tickAnim - 8) / 2) * (0-(0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(9.3275806062-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*-8), leftArm.rotateAngleY + (float) Math.toRadians(5.75111), leftArm.rotateAngleZ + (float) Math.toRadians(-6.89448));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-7.4808173842-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*12), leftArm2.rotateAngleY + (float) Math.toRadians(-2.88269), leftArm2.rotateAngleZ + (float) Math.toRadians(-4.66456));
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0.2);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(22.31472), leftArm3.rotateAngleY + (float) Math.toRadians(2.95808), leftArm3.rotateAngleZ + (float) Math.toRadians(-7.16645));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.74602 + (((tickAnim - 0) / 3) * (18.1772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(20.74602)));
            yy = -0.06245 + (((tickAnim - 0) / 3) * (2.06252-(-0.06245)));
            zz = 0.00752 + (((tickAnim - 0) / 3) * (0.16196-(0.00752)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 18.1772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 3) / 3) * (-26.79563-(18.1772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 2.06252 + (((tickAnim - 3) / 3) * (4.12503-(2.06252)));
            zz = 0.16196 + (((tickAnim - 3) / 3) * (-0.32391-(0.16196)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -26.79563 + (((tickAnim - 6) / 6) * (20.74602-(-26.79563)));
            yy = 4.12503 + (((tickAnim - 6) / 6) * (-0.06245-(4.12503)));
            zz = -0.32391 + (((tickAnim - 6) / 6) * (0.00752-(-0.32391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.5 + (((tickAnim - 0) / 3) * (31.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(23.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 31.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 3) / 3) * (-17.5-(31.88-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 6) / 1) * (-22.96-(-17.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -22.96 + (((tickAnim - 7) / 5) * (23.5-(-22.96)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19 + (((tickAnim - 0) / 3) * (-39.18-(19)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -39.18 + (((tickAnim - 3) / 1) * (-39.18-(-39.18)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -39.18 + (((tickAnim - 4) / 2) * (-3.5-(-39.18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -3.5 + (((tickAnim - 6) / 1) * (-1.64-(-3.5)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -1.64 + (((tickAnim - 7) / 1) * (2.05-(-1.64)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.05 + (((tickAnim - 8) / 4) * (19-(2.05)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 3) / 1) * (-0.425-(-0.425)));
            zz = 0.125 + (((tickAnim - 3) / 1) * (0.125-(0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 4) / 2) * (0-(-0.425)));
            zz = 0.125 + (((tickAnim - 4) / 2) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.5 + (((tickAnim - 0) / 3) * (99.46983-(23.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.65175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.55674-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 99.46983 + (((tickAnim - 3) / 3) * (45.2597-(99.46983)));
            yy = 0.65175 + (((tickAnim - 3) / 3) * (-1.14055-(0.65175)));
            zz = 0.55674 + (((tickAnim - 3) / 3) * (-0.9743-(0.55674)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 45.2597 + (((tickAnim - 6) / 1) * (41.43329-(45.2597)));
            yy = -1.14055 + (((tickAnim - 6) / 1) * (-3.71834-(-1.14055)));
            zz = -0.9743 + (((tickAnim - 6) / 1) * (-2.73732-(-0.9743)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 41.43329 + (((tickAnim - 7) / 1) * (23.31155-(41.43329)));
            yy = -3.71834 + (((tickAnim - 7) / 1) * (-2.28001-(-3.71834)));
            zz = -2.73732 + (((tickAnim - 7) / 1) * (2.2223-(-2.73732)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.31155 + (((tickAnim - 8) / 0) * (10.4675-(23.31155)));
            yy = -2.28001 + (((tickAnim - 8) / 0) * (-2.30015-(-2.28001)));
            zz = 2.2223 + (((tickAnim - 8) / 0) * (5.82039-(2.2223)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10.4675 + (((tickAnim - 8) / 2) * (26.20991-(10.4675)));
            yy = -2.30015 + (((tickAnim - 8) / 2) * (0.32587-(-2.30015)));
            zz = 5.82039 + (((tickAnim - 8) / 2) * (0.27837-(5.82039)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 26.20991 + (((tickAnim - 10) / 2) * (23.5-(26.20991)));
            yy = 0.32587 + (((tickAnim - 10) / 2) * (0-(0.32587)));
            zz = 0.27837 + (((tickAnim - 10) / 2) * (0-(0.27837)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


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
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.425-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 7) / 1) * (0.3-(0.425)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 0) * (-0.175-(0.3)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 2) * (0.375-(-0.175)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 10) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
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
            xx = 40.25 + (((tickAnim - 0) / 3) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 40.25 + (((tickAnim - 3) / 1) * (-5.25-(40.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -5.25 + (((tickAnim - 4) / 2) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-46.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -46.25 + (((tickAnim - 10) / 2) * (40.25-(-46.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (0.125-(0.125)));
            zz = 0.35 + (((tickAnim - 0) / 3) * (0.35-(0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 1) * (0-(0.125)));
            zz = 0.35 + (((tickAnim - 3) / 1) * (0-(0.35)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 2) * (0.125-(-0.275)));
            zz = 0.25 + (((tickAnim - 10) / 2) * (0.35-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.44643 + (((tickAnim - 0) / 6) * (0-(10.44643)));
            yy = -11.06817 + (((tickAnim - 0) / 6) * (0-(-11.06817)));
            zz = -2.02715 + (((tickAnim - 0) / 6) * (0-(-2.02715)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (10.44643-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (-11.06817-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-2.02715-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(9.3275806062-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*-8), rightArm.rotateAngleY + (float) Math.toRadians(-5.75111), rightArm.rotateAngleZ + (float) Math.toRadians(6.89448));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-7.4808173842-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615/0.5-150))*12), rightArm2.rotateAngleY + (float) Math.toRadians(2.88269), rightArm2.rotateAngleZ + (float) Math.toRadians(4.66456));
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(-0.2);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(22.31472), rightArm3.rotateAngleY + (float) Math.toRadians(-2.95808), rightArm3.rotateAngleZ + (float) Math.toRadians(7.16645));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDaurlong entity = (EntityPrehistoricFloraDaurlong) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-4), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-0.45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-0.6);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0.35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*1);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*6), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*2.5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(0);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(0);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(0), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*5), Tail.rotateAngleY + (float) Math.toRadians(0), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.Tail.rotationPointX = this.Tail.rotationPointX + (float)(0);
        this.Tail.rotationPointY = this.Tail.rotationPointY - (float)(0);
        this.Tail.rotationPointZ = this.Tail.rotationPointZ + (float)(-0.375);


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*4), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-4), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.Tail3.rotationPointX = this.Tail3.rotationPointX + (float)(0);
        this.Tail3.rotationPointY = this.Tail3.rotationPointY - (float)(0);
        this.Tail3.rotationPointZ = this.Tail3.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*4), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20.54563 + (((tickAnim - 0) / 10) * (12.5-(-20.54563)));
            yy = -4.12503 + (((tickAnim - 0) / 10) * (0-(-4.12503)));
            zz = -0.32391 + (((tickAnim - 0) / 10) * (0-(-0.32391)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.5 + (((tickAnim - 10) / 5) * (56.7022-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(12.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (-2.06252-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.16196-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 56.7022-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 15) / 5) * (-20.54563-(56.7022-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = -2.06252 + (((tickAnim - 15) / 5) * (-4.12503-(-2.06252)));
            zz = -0.16196 + (((tickAnim - 15) / 5) * (-0.32391-(-0.16196)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-20.96-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -20.96 + (((tickAnim - 2) / 8) * (14.25-(-20.96)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 14.25 + (((tickAnim - 10) / 4) * (60.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(14.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 60.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 14) / 3) * (-8.0375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(60.525-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.0375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 17) / 3) * (-17.5-(-8.0375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 5.75 + (((tickAnim - 0) / 2) * (-8-(5.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -8 + (((tickAnim - 2) / 1) * (-23.3-(-8)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -23.3 + (((tickAnim - 3) / 7) * (19-(-23.3)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 19 + (((tickAnim - 10) / 4) * (-22.17-(19)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -22.17 + (((tickAnim - 14) / 3) * (-26.67-(-22.17)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -26.67 + (((tickAnim - 17) / 3) * (5-(-26.67)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 37.0097 + (((tickAnim - 0) / 2) * (45.25727-(37.0097)));
            yy = 1.14055 + (((tickAnim - 0) / 2) * (0.85542-(1.14055)));
            zz = 0.9743 + (((tickAnim - 0) / 2) * (0.73073-(0.9743)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 45.25727 + (((tickAnim - 2) / 1) * (46.16709-(45.25727)));
            yy = 0.85542 + (((tickAnim - 2) / 1) * (0.70334-(0.85542)));
            zz = 0.73073 + (((tickAnim - 2) / 1) * (0.60082-(0.73073)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 46.16709 + (((tickAnim - 3) / 3) * (10.53182-(46.16709)));
            yy = 0.70334 + (((tickAnim - 3) / 3) * (0.47523-(0.70334)));
            zz = 0.60082 + (((tickAnim - 3) / 3) * (0.40596-(0.60082)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10.53182 + (((tickAnim - 6) / 4) * (23.5-(10.53182)));
            yy = 0.47523 + (((tickAnim - 6) / 4) * (0-(0.47523)));
            zz = 0.40596 + (((tickAnim - 6) / 4) * (0-(0.40596)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.5 + (((tickAnim - 10) / 3) * (73.08737-(23.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.47523-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.40596-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 73.08737 + (((tickAnim - 13) / 5) * (33.11892-(73.08737)));
            yy = 0.47523 + (((tickAnim - 13) / 5) * (0.91878-(0.47523)));
            zz = 0.40596 + (((tickAnim - 13) / 5) * (0.78485-(0.40596)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 33.11892 + (((tickAnim - 18) / 2) * (37.0097-(33.11892)));
            yy = 0.91878 + (((tickAnim - 18) / 2) * (1.14055-(0.91878)));
            zz = 0.78485 + (((tickAnim - 18) / 2) * (0.9743-(0.78485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 2) / 1) * (0.625-(0.375)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 3) / 1) * (0.99-(0.625)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 4) / 2) * (0.55-(0.99)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.475-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 13) / 3) * (0.755-(0.475)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.755 + (((tickAnim - 16) / 2) * (0.485-(0.755)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 18) / 2) * (0-(0.485)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (10.44643-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (11.06817-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.02715-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10.44643 + (((tickAnim - 10) / 3) * (33.69292-(10.44643)));
            yy = 11.06817 + (((tickAnim - 10) / 3) * (26.36036-(11.06817)));
            zz = 2.02715 + (((tickAnim - 10) / 3) * (-2.78705-(2.02715)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 33.69292 + (((tickAnim - 13) / 7) * (0-(33.69292)));
            yy = 26.36036 + (((tickAnim - 13) / 7) * (0-(26.36036)));
            zz = -2.78705 + (((tickAnim - 13) / 7) * (0-(-2.78705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg6, leftLeg6.rotateAngleX + (float) Math.toRadians(xx), leftLeg6.rotateAngleY + (float) Math.toRadians(yy), leftLeg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-29-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -29 + (((tickAnim - 8) / 2) * (0-(-29)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (26.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.25 + (((tickAnim - 13) / 2) * (52.25-(26.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 52.25 + (((tickAnim - 15) / 3) * (0-(52.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg5, leftLeg5.rotateAngleX + (float) Math.toRadians(xx), leftLeg5.rotateAngleY + (float) Math.toRadians(yy), leftLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 2) * (0-(-0.1)));
            zz = 0.175 + (((tickAnim - 8) / 2) * (0-(0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 2) * (0.205-(0.05)));
            zz = 0.2 + (((tickAnim - 13) / 2) * (0.38-(0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.205 + (((tickAnim - 15) / 3) * (0-(0.205)));
            zz = 0.38 + (((tickAnim - 15) / 3) * (0-(0.38)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg5.rotationPointX = this.leftLeg5.rotationPointX + (float)(xx);
        this.leftLeg5.rotationPointY = this.leftLeg5.rotationPointY - (float)(yy);
        this.leftLeg5.rotationPointZ = this.leftLeg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*4), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-6), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-5.775-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*6), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HeadFeathers4, HeadFeathers4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2.5), HeadFeathers4.rotateAngleY + (float) Math.toRadians(0), HeadFeathers4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HeadFeathers3, HeadFeathers3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2.5), HeadFeathers3.rotateAngleY + (float) Math.toRadians(0), HeadFeathers3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HeadFeathers2, HeadFeathers2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-5.5), HeadFeathers2.rotateAngleY + (float) Math.toRadians(0), HeadFeathers2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HeadFeathers, HeadFeathers.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-8), HeadFeathers.rotateAngleY + (float) Math.toRadians(0), HeadFeathers.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 0) / 5) * (18.9772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(12.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.06252-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.16196-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18.9772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 5) / 5) * (-20.54563-(18.9772-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 2.06252 + (((tickAnim - 5) / 5) * (4.12503-(2.06252)));
            zz = 0.16196 + (((tickAnim - 5) / 5) * (0.32391-(0.16196)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.54563 + (((tickAnim - 10) / 10) * (12.5-(-20.54563)));
            yy = 4.12503 + (((tickAnim - 10) / 10) * (0-(4.12503)));
            zz = 0.32391 + (((tickAnim - 10) / 10) * (0-(0.32391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14.25 + (((tickAnim - 0) / 4) * (38.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(14.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 38.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 4) * (-92.9875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200-(38.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -92.9875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200 + (((tickAnim - 8) / 2) * (-17.5-(-92.9875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*200)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 10) / 2) * (-20.96-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -20.96 + (((tickAnim - 12) / 8) * (14.25-(-20.96)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 19 + (((tickAnim - 0) / 4) * (-22.17-(19)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -22.17 + (((tickAnim - 4) / 3) * (-26.67-(-22.17)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -26.67 + (((tickAnim - 7) / 3) * (5.75-(-26.67)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 5.75 + (((tickAnim - 10) / 2) * (-8-(5.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -8 + (((tickAnim - 12) / 1) * (-20.55-(-8)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -20.55 + (((tickAnim - 13) / 7) * (19-(-20.55)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.5 + (((tickAnim - 0) / 3) * (73.08737-(23.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.47523-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.40596-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 73.08737 + (((tickAnim - 3) / 5) * (33.11892-(73.08737)));
            yy = 0.47523 + (((tickAnim - 3) / 5) * (0.91878-(0.47523)));
            zz = 0.40596 + (((tickAnim - 3) / 5) * (0.78485-(0.40596)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 33.11892 + (((tickAnim - 8) / 2) * (37.0097-(33.11892)));
            yy = 0.91878 + (((tickAnim - 8) / 2) * (1.14055-(0.91878)));
            zz = 0.78485 + (((tickAnim - 8) / 2) * (0.9743-(0.78485)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 37.0097 + (((tickAnim - 10) / 2) * (45.25727-(37.0097)));
            yy = 1.14055 + (((tickAnim - 10) / 2) * (0.85542-(1.14055)));
            zz = 0.9743 + (((tickAnim - 10) / 2) * (0.73073-(0.9743)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 45.25727 + (((tickAnim - 12) / 1) * (41.41709-(45.25727)));
            yy = 0.85542 + (((tickAnim - 12) / 1) * (0.70334-(0.85542)));
            zz = 0.73073 + (((tickAnim - 12) / 1) * (0.60082-(0.73073)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 41.41709 + (((tickAnim - 13) / 3) * (7.53182-(41.41709)));
            yy = 0.70334 + (((tickAnim - 13) / 3) * (0.47523-(0.70334)));
            zz = 0.60082 + (((tickAnim - 13) / 3) * (0.40596-(0.60082)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 7.53182 + (((tickAnim - 16) / 4) * (23.5-(7.53182)));
            yy = 0.47523 + (((tickAnim - 16) / 4) * (0-(0.47523)));
            zz = 0.40596 + (((tickAnim - 16) / 4) * (0-(0.40596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.375-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.375 + (((tickAnim - 12) / 1) * (0.625-(0.375)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 1) * (0.99-(0.625)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 14) / 2) * (0.375-(0.99)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 16) / 2) * (0-(0.375)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 26.25 + (((tickAnim - 3) / 2) * (52.25-(26.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52.25 + (((tickAnim - 5) / 3) * (0-(52.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-29-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -29 + (((tickAnim - 18) / 2) * (0-(-29)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg5, rightLeg5.rotateAngleX + (float) Math.toRadians(xx), rightLeg5.rotateAngleY + (float) Math.toRadians(yy), rightLeg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 3) / 2) * (0.205-(0.05)));
            zz = 0.2 + (((tickAnim - 3) / 2) * (0.38-(0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.205 + (((tickAnim - 5) / 3) * (0-(0.205)));
            zz = 0.38 + (((tickAnim - 5) / 3) * (0-(0.38)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 18) / 2) * (0-(-0.1)));
            zz = 0.175 + (((tickAnim - 18) / 2) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg5.rotationPointX = this.rightLeg5.rotationPointX + (float)(xx);
        this.rightLeg5.rotationPointY = this.rightLeg5.rotationPointY - (float)(yy);
        this.rightLeg5.rotationPointZ = this.rightLeg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10.44643 + (((tickAnim - 0) / 3) * (33.69292-(10.44643)));
            yy = -11.06817 + (((tickAnim - 0) / 3) * (-26.36036-(-11.06817)));
            zz = -2.02715 + (((tickAnim - 0) / 3) * (2.78705-(-2.02715)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 33.69292 + (((tickAnim - 3) / 7) * (10.44643-(33.69292)));
            yy = -26.36036 + (((tickAnim - 3) / 7) * (-11.06817-(-26.36036)));
            zz = 2.78705 + (((tickAnim - 3) / 7) * (-2.02715-(2.78705)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.44643 + (((tickAnim - 10) / 10) * (10.44643-(10.44643)));
            yy = -11.06817 + (((tickAnim - 10) / 10) * (-11.06817-(-11.06817)));
            zz = -2.02715 + (((tickAnim - 10) / 10) * (-2.02715-(-2.02715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg6, rightLeg6.rotateAngleX + (float) Math.toRadians(xx), rightLeg6.rotateAngleY + (float) Math.toRadians(yy), rightLeg6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-2.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-40))*4), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(6-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-6), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(-5.775-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*6), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDaurlong e = (EntityPrehistoricFloraDaurlong) entity;
        animator.update(entity);


    }
}
