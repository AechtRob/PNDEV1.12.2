package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStenoprotome extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backSpine;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backSpine3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer backSpine2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backSpine4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;

    public ModelStenoprotome() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 0, -1.5F, -0.975F, -6.25F, 3, 3, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 26, 7, 0.65F, -0.025F, -6.075F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 26, 7, -1.65F, -0.025F, -6.075F, 1, 1, 1, 0.0F, true));
        this.main.cubeList.add(new ModelBox(main, 36, 40, -1.0F, -0.975F, -7.025F, 2, 2, 1, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 41, 13, -1.9964F, -1.0F, -3.6754F, 1, 1, 1, -0.003F, true));
        this.main.cubeList.add(new ModelBox(main, 41, 13, 0.9964F, -1.0F, -3.6754F, 1, 1, 1, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.9F, -2.45F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.096F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 38, -0.5F, -0.1F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5825F, -0.475F, -4.625F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.48F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 16, 0.35F, -0.5F, 3.0F, 1, 1, 1, 0.003F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 25, 0.0F, -0.525F, 0.0F, 1, 1, 3, 0.006F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5825F, -0.5F, -4.625F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.48F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 16, -1.35F, -0.5F, 3.0F, 1, 1, 1, 0.003F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 25, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.7165F, -0.5F, -4.125F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2217F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 30, -1.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.8911F, -0.5F, -3.6975F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.789F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 43, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -0.5F, -4.0F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 33, -1.25F, -0.5F, -3.0F, 1, 1, 3, 0.003F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.8911F, -0.5F, -3.6975F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 1.789F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 43, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.7165F, -0.5F, -4.125F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 1.2217F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 30, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.0619F, 0.1299F, -9.6726F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0524F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 10, -1.0F, -1.0F, -7.0F, 1, 1, 7, 0.003F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0619F, 0.1299F, -9.6726F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0524F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 10, 0.0F, -1.0F, -7.0F, 1, 1, 7, 0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2165F, -1.0F, -6.7231F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, -0.0524F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 35, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.006F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2165F, -1.0F, -6.7231F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0524F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 35, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.006F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.5F, -4.0F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 33, 0.25F, -0.5F, -3.0F, 1, 1, 3, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -0.975F, -3.25F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 19, -1.0F, 0.0F, 0.0F, 3, 4, 3, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.975F, -7.025F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0567F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 19, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.2999F, -8.9589F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0567F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.5F, 0.0F, -7.725F, 1, 1, 8, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.0F, -7.25F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1658F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 36, -0.5F, -1.025F, -1.9F, 1, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.1281F, -3.5063F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 27, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 2.5F, -4.75F);
        this.main.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 19, -1.5F, -1.775F, -2.625F, 2, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9537F, -7.0335F);
        this.main.addChild(jaw);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0463F, -0.2165F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1658F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 41, -0.5F, -0.1F, -1.55F, 1, 1, 2, -0.006F, false));

        this.backSpine = new AdvancedModelRenderer(this);
        this.backSpine.setRotationPoint(1.3224F, 2.5272F, -2.524F);
        this.main.addChild(backSpine);
        this.setRotateAngle(backSpine, 0.0F, 0.2487F, -0.2007F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.3951F, 1.4929F, 1.9721F);
        this.backSpine.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.6115F, 0.1744F, 0.0077F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 20, 33, -0.475F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.4201F, 1.4929F, 1.9721F);
        this.backSpine.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0437F, 0.061F, 0.0027F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 0, -0.475F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.4201F, 0.8089F, 0.1677F);
        this.backSpine.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 11, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.006F, false));

        this.backSpine3 = new AdvancedModelRenderer(this);
        this.backSpine3.setRotationPoint(-1.3224F, 2.5272F, -2.524F);
        this.main.addChild(backSpine3);
        this.setRotateAngle(backSpine3, 0.0F, -0.2487F, 0.2007F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.3951F, 1.4929F, 1.9721F);
        this.backSpine3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6115F, -0.1744F, -0.0077F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 33, 0.475F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.4201F, 1.4929F, 1.9721F);
        this.backSpine3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0437F, -0.061F, -0.0027F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 43, 0, 0.475F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.4201F, 0.8089F, 0.1677F);
        this.backSpine3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3491F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 11, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.006F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.9569F, 2.9906F, -0.4534F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1745F, 0.3927F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 29, 36, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.9569F, 2.9906F, -0.4534F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1745F, -0.3927F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 29, 36, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.0F, -0.6F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 13, 26, -1.0F, -1.15F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 2.649F, 0.0481F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 31, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.006F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, -1.9215F, 0.349F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1571F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 41, 0.975F, -0.8F, 2.05F, 0, 1, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 26, 0.0F, 0.05F, -0.125F, 2, 1, 3, -0.006F, false));

        this.backSpine2 = new AdvancedModelRenderer(this);
        this.backSpine2.setRotationPoint(0.3087F, 1.5764F, 0.68F);
        this.tail.addChild(backSpine2);
        this.setRotateAngle(backSpine2, -0.1886F, 0.3864F, -0.0718F);
        this.backSpine2.cubeList.add(new ModelBox(backSpine2, 29, 40, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.2946F, 1.0F, 5.9392F);
        this.backSpine2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1745F, -0.3491F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 17, 10, 0.0F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.4F, 1.0F, 2.0F);
        this.backSpine2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.1745F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 5, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.backSpine4 = new AdvancedModelRenderer(this);
        this.backSpine4.setRotationPoint(-0.3087F, 1.5764F, 0.68F);
        this.tail.addChild(backSpine4);
        this.setRotateAngle(backSpine4, -0.1886F, -0.3864F, 0.0718F);
        this.backSpine4.cubeList.add(new ModelBox(backSpine4, 29, 40, -0.5F, -1.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.2946F, 1.0F, 5.9392F);
        this.backSpine4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.3491F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 10, 0.0F, -1.0F, 0.0F, 0, 1, 7, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.4F, 1.0F, 2.0F);
        this.backSpine4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.1745F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 32, 5, 0.0F, -1.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.05F, 2.6F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 37, -1.0F, -0.7F, 0.0F, 2, 2, 2, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 7, -1.0F, -0.2F, 1.975F, 2, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, 2.3375F, 0.4367F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3491F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 42, 1.0F, -0.075F, 1.2333F, 0, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.3375F, 0.4367F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3491F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 0, -1.0F, -1.0F, -0.0167F, 2, 1, 3, -0.009F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, -1.4723F, 0.5808F);
        this.tail2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4189F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 5, 43, 1.0F, -0.9F, -0.0608F, 0, 1, 2, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 32, 0.0F, 0.0F, -0.0108F, 2, 1, 3, -0.009F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 2.975F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 16, 0.0F, -1.3F, 1.0F, 0, 3, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.7525F, 1.8524F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1745F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 41, 9, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 41, 5, 0.0F, -0.1F, 0.0F, 1, 1, 2, 0.003F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -3.25F;
        this.main.offsetX = -0.3F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);



            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
//                this.main.offsetX = 0.40F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
