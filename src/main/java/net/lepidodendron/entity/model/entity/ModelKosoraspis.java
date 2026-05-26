package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKosoraspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private ModelAnimator animator;


    public ModelKosoraspis() {
        animator = ModelAnimator.create();

        this.textureWidth = 55;
        this.textureHeight = 55;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.2F, -1.0F);
        this.main.cubeList.add(new ModelBox(main, 19, 0, -2.5F, -6.2985F, -2.0641F, 5, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -2.2037F, -7.4682F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 2.1293F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 24, -1.5F, 0.0F, 0.0F, 2, 2, 1, 0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1339F, -5.8697F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2654F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 40, -1.5F, -0.7F, 0.0F, 3, 3, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.2037F, -7.4682F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.6155F, -0.218F, -0.0097F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -0.2F, 0.2F, -0.4F, 0, 2, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.2037F, -7.4682F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.6155F, 0.218F, 0.0097F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 11, 0.2F, 0.2F, -0.4F, 0, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.2037F, -7.4682F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5272F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 20, -1.5F, 0.0F, 0.0F, 2, 2, 1, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.123F, -2.9679F, -6.6303F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.9924F, -0.2822F, 0.4254F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 5, -0.5F, -0.375F, -0.175F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.123F, -2.9679F, -6.6303F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.9924F, 0.2822F, -0.4254F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 5, -0.5F, -0.375F, -0.175F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.0F, -6.5413F, 0.1154F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.4399F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 8, 1.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, -6.2985F, -1.0641F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0472F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 28, 2.5F, -0.2F, -0.2F, 1, 1, 2, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.608F, -5.6893F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4363F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 30, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.9992F, -6.4826F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6545F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 45, -1.5F, 0.0F, 0.0F, 3, 1, 1, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -0.7443F, -4.7028F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1614F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 0, -0.5F, -1.0F, -0.025F, 3, 1, 3, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.3F, -1.7417F, -4.5776F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1708F, -0.3314F, 0.0561F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 46, 0.0F, -1.0F, -3.0F, 1, 1, 1, 0.003F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 15, 0.0F, -2.0F, -2.0F, 1, 2, 2, 0.003F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.3F, -2.3269F, -1.9494F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1614F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 40, 0.0F, -2.0F, -2.5F, 1, 4, 3, 0.003F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 40, 3.6F, -2.0F, -2.5F, 1, 4, 3, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.3F, -1.7417F, -4.5776F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1708F, 0.3314F, -0.0561F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 15, -1.0F, -2.0F, -2.0F, 1, 2, 2, 0.003F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 46, -1.0F, -1.0F, -3.0F, 1, 1, 1, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, -0.45F, 2.2F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 27, -1.5F, -2.0F, -4.025F, 4, 2, 3, -0.003F, false));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(0.6647F, -1.0161F, 0.4606F);
        this.main.addChild(spine);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1588F, 1.1292F, -0.1115F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 43, 33, 0.0F, -0.5F, 1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.0437F, 0.184F, 0.7838F);
        this.spine.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0801F, 0.5654F, -0.0106F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 45, -1.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.3876F, 0.5282F, -1.2228F);
        this.spine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0732F, 0.3914F, 0.0044F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 9, -2.6F, -1.0F, -3.2F, 2, 1, 4, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.5992F, -0.5238F, -1.5716F);
        this.spine.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1032F, 0.2186F, -0.0711F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 40, -1.3F, -3.0F, -1.5F, 1, 3, 3, 0.0F, false));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(-0.6647F, -1.0161F, 0.4606F);
        this.main.addChild(spine2);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1588F, -1.1292F, 0.1115F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 33, -1.0F, -0.5F, 1.0F, 1, 1, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-4.0437F, 0.184F, 0.7838F);
        this.spine2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0801F, -0.5654F, 0.0106F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 45, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.003F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-3.3876F, 0.5282F, -1.2228F);
        this.spine2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0732F, -0.3914F, -0.0044F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 34, 9, 0.6F, -1.0F, -3.2F, 2, 1, 4, 0.003F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.5992F, -0.5238F, -1.5716F);
        this.spine2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1032F, -0.2186F, 0.0711F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 40, 0.3F, -3.0F, -1.5F, 1, 3, 3, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.4253F, -0.7978F, 0.5451F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1189F, 0.2653F, 0.0329F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 15, 34, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.4253F, -0.7978F, 0.5451F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1189F, -0.2653F, -0.0329F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 15, 34, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.55F, -4.65F);
        this.main.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 15, -0.5F, -0.975F, -3.1F, 3, 1, 2, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 46, 0.0F, -0.975F, -4.1F, 2, 1, 1, -0.003F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1667F, -4.6067F, 0.6359F);
        this.main.addChild(body);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.8333F, 3.8087F, 3.8379F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 15, 27, -0.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.6667F, -1.0745F, 0.2026F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3011F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 37, -0.5F, -2.375F, 0.6F, 0, 3, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.6667F, -1.6881F, -0.1558F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2007F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -2.5F, 0.0F, 0.0F, 4, 4, 5, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.1667F, -0.1604F, 4.4051F);
        this.body.addChild(tail);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 3.0045F, 3.9367F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1047F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 17, 19, -0.5F, -1.6F, -4.95F, 2, 2, 5, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.75F, 0.0657F, 4.1938F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 17, 10, -0.75F, -0.05F, -5.0F, 3, 3, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.7516F, 3.0545F, 0.9857F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.2052F, -0.4549F, 0.723F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 36, 5, -0.3F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.7516F, 3.0545F, 0.9857F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.2052F, 0.4549F, -0.723F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 36, 5, -2.7F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.1667F, 0.6132F, 3.8482F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 33, -0.8333F, -0.5882F, -0.2482F, 2, 2, 4, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.1667F, 1.3868F, 3.7518F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3054F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 19, -1.0F, -1.825F, -4.0F, 2, 2, 4, -0.006F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.1667F, 0.1383F, 3.1933F);
        this.tail2.addChild(tail3);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.4258F, 0.346F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4058F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 9, 39, -0.5F, -1.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.2264F, -0.0415F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1745F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 10, 0.5F, -0.125F, 0.0F, 0, 3, 8, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.2264F, -0.0415F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1309F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 22, -0.5F, -0.4F, 0.0F, 1, 1, 6, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }
        this.main.offsetZ = -0.5F;

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
