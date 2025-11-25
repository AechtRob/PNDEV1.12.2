package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMegateuthis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMegateuthis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer finbaseR;
    private final AdvancedModelRenderer finbaseL;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer siphpn;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer arms;
    private final AdvancedModelRenderer armss;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer arms6;
    private final AdvancedModelRenderer armss6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer arms2;
    private final AdvancedModelRenderer armss2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer arms7;
    private final AdvancedModelRenderer armss7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer arms3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armss3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer arms8;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer armss8;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer arms4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer armss4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer arms9;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer armss9;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer arms5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer armss5;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer arms10;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer armss10;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;

    private ModelAnimator animator;

    public ModelMegateuthis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -2.5F, -4.0F, 7, 5, 17, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 22, -3.0F, -2.0F, 12.0F, 6, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 0, -2.5F, -1.5F, 20.0F, 5, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 39, -1.5F, -1.0F, 26.0F, 3, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -1.0F, -1.0F, 29.0F, 2, 2, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 3, -0.5F, -0.5F, 44.0F, 1, 1, 3, 0.0F, false));

        this.finbaseR = new AdvancedModelRenderer(this);
        this.finbaseR.setRotationPoint(-1.0F, 0.0F, 27.5F);
        this.body.addChild(finbaseR);
        this.finbaseR.cubeList.add(new ModelBox(finbaseR, 0, 30, -4.0F, 0.0F, -7.5F, 5, 0, 3, 0.0F, false));
        this.finbaseR.cubeList.add(new ModelBox(finbaseR, 16, 44, -7.0F, 0.0F, -4.5F, 8, 0, 3, 0.0F, false));
        this.finbaseR.cubeList.add(new ModelBox(finbaseR, 28, 9, -7.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, false));
        this.finbaseR.cubeList.add(new ModelBox(finbaseR, 28, 12, -6.0F, 0.0F, 1.5F, 7, 0, 3, 0.0F, false));
        this.finbaseR.cubeList.add(new ModelBox(finbaseR, 6, 0, -3.0F, 0.0F, 4.5F, 4, 0, 3, 0.0F, false));

        this.finbaseL = new AdvancedModelRenderer(this);
        this.finbaseL.setRotationPoint(1.0F, 0.0F, 27.5F);
        this.body.addChild(finbaseL);
        this.finbaseL.cubeList.add(new ModelBox(finbaseL, 0, 30, -1.0F, 0.0F, -7.5F, 5, 0, 3, 0.0F, true));
        this.finbaseL.cubeList.add(new ModelBox(finbaseL, 16, 44, -1.0F, 0.0F, -4.5F, 8, 0, 3, 0.0F, true));
        this.finbaseL.cubeList.add(new ModelBox(finbaseL, 28, 9, -1.0F, 0.0F, -1.5F, 8, 0, 3, 0.0F, true));
        this.finbaseL.cubeList.add(new ModelBox(finbaseL, 28, 12, -1.0F, 0.0F, 1.5F, 7, 0, 3, 0.0F, true));
        this.finbaseL.cubeList.add(new ModelBox(finbaseL, 6, 0, -1.0F, 0.0F, 4.5F, 4, 0, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 29, 34, -2.5F, -2.0F, -4.0F, 5, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.75F, -1.75F, -2.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 22, -1.3F, -0.35F, -1.5F, 2, 3, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.75F, -1.75F, -2.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 22, -0.7F, -0.35F, -1.5F, 2, 3, 3, 0.0F, false));

        this.siphpn = new AdvancedModelRenderer(this);
        this.siphpn.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.body2.addChild(siphpn);
        this.setRotateAngle(siphpn, 0.1309F, 0.0F, 0.0F);
        this.siphpn.cubeList.add(new ModelBox(siphpn, 0, 24, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(-0.5F, -1.55F, -4.0F);
        this.body2.addChild(arm);
        this.arm.cubeList.add(new ModelBox(arm, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 16, -0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm.cubeList.add(new ModelBox(arm, 0, 16, 0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms = new AdvancedModelRenderer(this);
        this.arms.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm.addChild(arms);
        this.arms.cubeList.add(new ModelBox(arms, 0, 15, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 0, 15, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms.cubeList.add(new ModelBox(arms, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss = new AdvancedModelRenderer(this);
        this.armss.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms.addChild(armss);
        this.armss.cubeList.add(new ModelBox(armss, 0, 0, -0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss.cubeList.add(new ModelBox(armss, 0, 0, 0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss.cubeList.add(new ModelBox(armss, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(0.5F, -1.55F, -4.0F);
        this.body2.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 16, 0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm6.cubeList.add(new ModelBox(arm6, 0, 16, -0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms6 = new AdvancedModelRenderer(this);
        this.arms6.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm6.addChild(arms6);
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 15, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms6.cubeList.add(new ModelBox(arms6, 0, 15, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));

        this.armss6 = new AdvancedModelRenderer(this);
        this.armss6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms6.addChild(armss6);
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 0, 0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 0, -0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss6.cubeList.add(new ModelBox(armss6, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(-1.475F, -1.05F, -4.0F);
        this.body2.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 16, -0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, false));
        this.arm2.cubeList.add(new ModelBox(arm2, 0, 16, 0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, false));

        this.arms2 = new AdvancedModelRenderer(this);
        this.arms2.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm2.addChild(arms2);
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 15, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 15, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, false));
        this.arms2.cubeList.add(new ModelBox(arms2, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss2 = new AdvancedModelRenderer(this);
        this.armss2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms2.addChild(armss2);
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 0, -0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 0, 0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, false));
        this.armss2.cubeList.add(new ModelBox(armss2, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(1.475F, -1.05F, -4.0F);
        this.body2.addChild(arm7);
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 16, 0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, true));
        this.arm7.cubeList.add(new ModelBox(arm7, 0, 16, -0.25F, 0.0F, -6.5F, 0, 1, 7, 0.0F, true));

        this.arms7 = new AdvancedModelRenderer(this);
        this.arms7.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm7.addChild(arms7);
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 15, 0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 15, -0.25F, 0.0F, -7.0F, 0, 1, 7, 0.0F, true));
        this.arms7.cubeList.add(new ModelBox(arms7, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss7 = new AdvancedModelRenderer(this);
        this.armss7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms7.addChild(armss7);
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 0, 0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 0, -0.25F, 0.0F, -8.0F, 0, 1, 8, 0.0F, true));
        this.armss7.cubeList.add(new ModelBox(armss7, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(-2.0F, -0.075F, -4.0F);
        this.body2.addChild(arm3);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.5F, 1.5F);
        this.arm3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));

        this.arms3 = new AdvancedModelRenderer(this);
        this.arms3.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm3.addChild(arms3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.5F, 8.0F);
        this.arms3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.5708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 15, 1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 15, 1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss3 = new AdvancedModelRenderer(this);
        this.armss3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms3.addChild(armss3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.5F, 15.0F);
        this.armss3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.25F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.75F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.5708F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(2.0F, -0.075F, -4.0F);
        this.body2.addChild(arm8);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.5F, 1.5F);
        this.arm8.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, -1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, -1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));

        this.arms8 = new AdvancedModelRenderer(this);
        this.arms8.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm8.addChild(arms8);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.5F, 8.0F);
        this.arms8.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 1.5708F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms8.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss8 = new AdvancedModelRenderer(this);
        this.armss8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms8.addChild(armss8);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.5F, 15.0F);
        this.armss8.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.25F, -0.5F, -23.0F, 0, 1, 8, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.75F, -0.5F, -23.0F, 0, 1, 8, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss8.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 1.5708F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(-1.475F, 0.9F, -4.0F);
        this.body2.addChild(arm4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -0.5F, 1.5F);
        this.arm4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 16, 1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 16, 1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, false));

        this.arms4 = new AdvancedModelRenderer(this);
        this.arms4.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm4.addChild(arms4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5F, -0.5F, 8.0F);
        this.arms4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 3.1416F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 15, 1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 15, 1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 3.1416F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss4 = new AdvancedModelRenderer(this);
        this.armss4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms4.addChild(armss4);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.5F, -0.5F, 15.0F);
        this.armss4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 3.1416F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 1.25F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 1.75F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 3.1416F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(1.475F, 0.9F, -4.0F);
        this.body2.addChild(arm9);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -0.5F, 1.5F);
        this.arm9.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -3.1416F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 16, -1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 16, -1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm9.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -3.1416F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, true));

        this.arms9 = new AdvancedModelRenderer(this);
        this.arms9.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm9.addChild(arms9);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.5F, -0.5F, 8.0F);
        this.arms9.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -3.1416F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 15, -1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 15, -1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms9.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armss9 = new AdvancedModelRenderer(this);
        this.armss9.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms9.addChild(armss9);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.25F, 3.25F);
        this.armss9.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.25F, -0.25F, -11.25F, 0, 1, 8, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -0.25F, -0.25F, -11.25F, 0, 1, 8, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss9.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(-0.5F, 1.375F, -4.0F);
        this.body2.addChild(arm5);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, -0.5F, 1.5F);
        this.arm5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -3.1416F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 16, 1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 16, 1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, false));

        this.arms5 = new AdvancedModelRenderer(this);
        this.arms5.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm5.addChild(arms5);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, -0.5F, 8.0F);
        this.arms5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -3.1416F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, 1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, 1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms5.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -3.1416F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armss5 = new AdvancedModelRenderer(this);
        this.armss5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms5.addChild(armss5);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.5F, -0.5F, 15.0F);
        this.armss5.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -3.1416F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, 1.25F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, 1.75F, -0.5F, -23.0F, 0, 1, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(0.5F, 1.375F, -4.0F);
        this.body2.addChild(arm10);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5F, -0.5F, 1.5F);
        this.arm10.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, -3.1416F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 16, -1.75F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 16, -1.25F, -0.5F, -8.0F, 0, 1, 7, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arm10.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -3.1416F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 9, -0.5F, -0.5F, -6.5F, 1, 1, 7, 0.01F, true));

        this.arms10 = new AdvancedModelRenderer(this);
        this.arms10.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.arm10.addChild(arms10);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.arms10.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -3.1416F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.5F, -0.5F, 8.0F);
        this.arms10.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -3.1416F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 15, -1.25F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 15, -1.75F, -0.5F, -15.0F, 0, 1, 7, 0.0F, true));

        this.armss10 = new AdvancedModelRenderer(this);
        this.armss10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arms10.addChild(armss10);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.5F, -0.5F, 15.0F);
        this.armss10.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -3.1416F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -1.25F, -0.5F, -23.0F, 0, 1, 8, 0.0F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, -1.75F, -0.5F, -23.0F, 0, 1, 8, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armss10.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -3.1416F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 39, -0.5F, -0.5F, -8.0F, 1, 1, 8, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.main.rotateAngleY = (float)Math.toRadians(((EntityPrehistoricFloraMegateuthis)entity).getRotationAngle());
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.7F;
        this.root.offsetX = 0.3F;
        this.root.rotateAngleY = (float)Math.toRadians(140);
        this.root.rotateAngleX = (float)Math.toRadians(40);
        this.root.rotateAngleZ = (float)Math.toRadians(-10);
        this.root.scaleChildren = true;
        float scaler = 0.7F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraMegateuthis ee = (EntityPrehistoricFloraMegateuthis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                if (ee.getIsFast()) { //Running
                    animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else {
                if (ee.getIsFast()) { //Running
                    animFront(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animBack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegateuthis entity = (EntityPrehistoricFloraMegateuthis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 15) / 5) * (8.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 15) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1 + (((tickAnim - 0) / 10) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)));
            zz = 0 + (((tickAnim - 0) / 10) * (5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 10) / 5) * (2.5-(2.5)));
            zz = 5 + (((tickAnim - 10) / 5) * (-7.5-(5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 2.5 + (((tickAnim - 15) / 5) * (3.36603-(2.5)));
            zz = -7.5 + (((tickAnim - 15) / 5) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025 + (((tickAnim - 15) / 5) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025 + (((tickAnim - 15) / 5) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.025)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.025 + (((tickAnim - 15) / 5) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*0.025)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-30 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 15) / 5) * (4.33013-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30 + (((tickAnim - 15) / 5) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finbaseR, finbaseR.rotateAngleX + (float) Math.toRadians(xx), finbaseR.rotateAngleY + (float) Math.toRadians(yy), finbaseR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finbaseR.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*30 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 15) / 5) * (4.33013-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30 + (((tickAnim - 15) / 5) * (30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finbaseL, finbaseL.rotateAngleX + (float) Math.toRadians(xx), finbaseL.rotateAngleY + (float) Math.toRadians(yy), finbaseL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finbaseL.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 15) / 5) * (-0.33494-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.025)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.025)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.025 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025 + (((tickAnim - 15) / 5) * (1.0125-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025 + (((tickAnim - 15) / 5) * (1.0125-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-0.025)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*0.025 + (((tickAnim - 15) / 5) * (0.9875-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*0.025)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5 + (((tickAnim - 0) / 15) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 15) / 5) * (145.66987-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(siphpn, siphpn.rotateAngleX + (float) Math.toRadians(xx), siphpn.rotateAngleY + (float) Math.toRadians(yy), siphpn.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 20) * (0.575-(0.575)));
            zz = -2 + (((tickAnim - 0) / 20) * (-2-(-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.siphpn.rotationPointX = this.siphpn.rotationPointX + (float)(xx);
        this.siphpn.rotationPointY = this.siphpn.rotationPointY - (float)(yy);
        this.siphpn.rotationPointZ = this.siphpn.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05 + (((tickAnim - 0) / 15) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2 + (((tickAnim - 0) / 15) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1 + (((tickAnim - 0) / 15) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.05 + (((tickAnim - 15) / 5) * (1.0433-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.2 + (((tickAnim - 15) / 5) * (0.97321-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.2)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.1 + (((tickAnim - 15) / 5) * (1.0134-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.siphpn.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 10) * (-45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 10) * (-15-(-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -45 + (((tickAnim - 10) / 5) * (-15-(-45)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 5) * (-10-(-15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 15) / 3) * (2.5-(-15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-0.33494-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 18) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 2) * (1-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 15) / 5) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 10) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -60 + (((tickAnim - 10) / 5) * (30-(-60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 15) / 3) * (2.5-(30)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (4.16506-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms, arms.rotateAngleX + (float) Math.toRadians(xx), arms.rotateAngleY + (float) Math.toRadians(yy), arms.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 10) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -60 + (((tickAnim - 10) / 5) * (10-(-60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (-20-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (2-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss, armss.rotateAngleX + (float) Math.toRadians(xx), armss.rotateAngleY + (float) Math.toRadians(yy), armss.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 9) * (-45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 9) * (15-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -45 + (((tickAnim - 9) / 5) * (-15-(-45)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 15 + (((tickAnim - 9) / 5) * (10-(15)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 14) / 4) * (2.5-(-15)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 10 + (((tickAnim - 14) / 4) * (10-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-0.33494-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 18) / 2) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(xx), arm6.rotateAngleY + (float) Math.toRadians(yy), arm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 1) * (1-(0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 14) / 6) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 9) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -60 + (((tickAnim - 9) / 5) * (30-(-60)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 14) / 4) * (2.5-(30)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (4.16506-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms6, arms6.rotateAngleX + (float) Math.toRadians(xx), arms6.rotateAngleY + (float) Math.toRadians(yy), arms6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 9) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -60 + (((tickAnim - 9) / 5) * (10-(-60)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 14) / 4) * (-20-(10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (2-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss6, armss6.rotateAngleX + (float) Math.toRadians(xx), armss6.rotateAngleY + (float) Math.toRadians(yy), armss6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 11) * (-45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)));
            zz = -45 + (((tickAnim - 0) / 11) * (-45-(-45)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -45 + (((tickAnim - 11) / 5) * (-15-(-45)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 11) / 5) * (-45-(-45)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 16) / 2) * (2.5-(-15)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = -45 + (((tickAnim - 16) / 2) * (-45-(-45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-0.33494-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.86603-(0)));
            zz = -45 + (((tickAnim - 18) / 2) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 3) * (1-(0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 11) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 16) / 4) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 11) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -60 + (((tickAnim - 11) / 5) * (30-(-60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 16) / 2) * (2.5-(30)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (4.16506-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.16506-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 11) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -60 + (((tickAnim - 11) / 5) * (10-(-60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 16) / 2) * (-20-(10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (2-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss2, armss2.rotateAngleX + (float) Math.toRadians(xx), armss2.rotateAngleY + (float) Math.toRadians(yy), armss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 11) * (-45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1)));
            zz = 45 + (((tickAnim - 0) / 11) * (45-(45)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -45 + (((tickAnim - 11) / 5) * (-15-(-45)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 11) / 5) * (45-(45)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 16) / 2) * (2.5-(-15)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 45 + (((tickAnim - 16) / 2) * (45-(45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-0.33494-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.86603-(0)));
            zz = 45 + (((tickAnim - 18) / 2) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(xx), arm7.rotateAngleY + (float) Math.toRadians(yy), arm7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 3) * (1-(0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 11) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 16) / 4) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 11) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -60 + (((tickAnim - 11) / 5) * (30-(-60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 16) / 2) * (2.5-(30)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (4.16506-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-2.16506-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms7, arms7.rotateAngleX + (float) Math.toRadians(xx), arms7.rotateAngleY + (float) Math.toRadians(yy), arms7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 11) * (-60-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -60 + (((tickAnim - 11) / 5) * (10-(-60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 16) / 2) * (-20-(10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (2-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss7, armss7.rotateAngleX + (float) Math.toRadians(xx), armss7.rotateAngleY + (float) Math.toRadians(yy), armss7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 9) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 9) / 5) * (15-(45)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 15 + (((tickAnim - 14) / 4) * (-2.5-(15)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-0.33494-(0)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 1) * (1-(0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 14) / 6) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 9) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = -2 + (((tickAnim - 0) / 9) * (60-(-2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 60 + (((tickAnim - 9) / 5) * (-30-(60)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -30 + (((tickAnim - 14) / 4) * (-2.5-(-30)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (2.16506-(0)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (-2-(-2.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 9) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = -2 + (((tickAnim - 0) / 9) * (60-(-2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 60 + (((tickAnim - 9) / 5) * (-10-(60)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -10 + (((tickAnim - 14) / 4) * (20-(-10)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 2) * (-2-(20)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss3, armss3.rotateAngleX + (float) Math.toRadians(xx), armss3.rotateAngleY + (float) Math.toRadians(yy), armss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 9) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 9) / 5) * (-15-(-45)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -15 + (((tickAnim - 14) / 4) * (2.5-(-15)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-0.33494-(0)));
            yy = 2.5 + (((tickAnim - 18) / 2) * (0-(2.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(xx), arm8.rotateAngleY + (float) Math.toRadians(yy), arm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 1) * (1-(0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 9) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 9) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 14) / 6) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 14) / 6) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 9) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 2 + (((tickAnim - 0) / 9) * (-60-(2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -60 + (((tickAnim - 9) / 5) * (30-(-60)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 30 + (((tickAnim - 14) / 4) * (2.5-(30)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (2.16506-(0)));
            yy = 2.5 + (((tickAnim - 18) / 2) * (2-(2.5)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms8, arms8.rotateAngleX + (float) Math.toRadians(xx), arms8.rotateAngleY + (float) Math.toRadians(yy), arms8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 9) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 2 + (((tickAnim - 0) / 9) * (-60-(2)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = -60 + (((tickAnim - 9) / 5) * (10-(-60)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 10 + (((tickAnim - 14) / 4) * (-20-(10)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 2) * (2-(-20)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss8, armss8.rotateAngleX + (float) Math.toRadians(xx), armss8.rotateAngleY + (float) Math.toRadians(yy), armss8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 11) * (45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1)));
            zz = 45 + (((tickAnim - 0) / 11) * (45-(45)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 45 + (((tickAnim - 11) / 5) * (15-(45)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 45 + (((tickAnim - 11) / 5) * (45-(45)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 16) / 2) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 45 + (((tickAnim - 16) / 2) * (45-(45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (-0.33494-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.86603-(0)));
            zz = 45 + (((tickAnim - 18) / 2) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(xx), arm4.rotateAngleY + (float) Math.toRadians(yy), arm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 3) * (1-(0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 11) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 16) / 4) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 11) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 11) / 5) * (-30-(60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -30 + (((tickAnim - 16) / 2) * (-2.5-(-30)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (0.16506-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-2.16506-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms4, arms4.rotateAngleX + (float) Math.toRadians(xx), arms4.rotateAngleY + (float) Math.toRadians(yy), arms4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 11) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 11) / 5) * (-10-(60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 16) / 2) * (20-(-10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 18) / 2) * (-2-(20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss4, armss4.rotateAngleX + (float) Math.toRadians(xx), armss4.rotateAngleY + (float) Math.toRadians(yy), armss4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 10) * (45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1 + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-1)));
            zz = -45 + (((tickAnim - 0) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 45 + (((tickAnim - 10) / 5) * (15-(45)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -45 + (((tickAnim - 10) / 5) * (-45-(-45)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 15) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = -45 + (((tickAnim - 15) / 3) * (-45-(-45)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (-0.33494-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.86603-(0)));
            zz = -45 + (((tickAnim - 18) / 2) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(xx), arm9.rotateAngleY + (float) Math.toRadians(yy), arm9.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 2) * (1-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 15) / 5) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm9.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 10) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 60 + (((tickAnim - 10) / 5) * (-30-(60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -30 + (((tickAnim - 15) / 3) * (-2.5-(-30)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (0.16506-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (2.16506-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms9, arms9.rotateAngleX + (float) Math.toRadians(xx), arms9.rotateAngleY + (float) Math.toRadians(yy), arms9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 10) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 60 + (((tickAnim - 10) / 5) * (-10-(60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (20-(-10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 18) / 2) * (-2-(20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss9, armss9.rotateAngleX + (float) Math.toRadians(xx), armss9.rotateAngleY + (float) Math.toRadians(yy), armss9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 10) * (45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 10) * (15-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 45 + (((tickAnim - 10) / 5) * (15-(45)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 15 + (((tickAnim - 10) / 5) * (10-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 15) / 3) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 15) / 3) * (10-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (-0.33494-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 18) / 2) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(xx), arm5.rotateAngleY + (float) Math.toRadians(yy), arm5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 2) * (1-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 10) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 10) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 15) / 5) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 15) / 5) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 10) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 60 + (((tickAnim - 10) / 5) * (-30-(60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -30 + (((tickAnim - 15) / 3) * (-2.5-(-30)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (0.16506-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms5, arms5.rotateAngleX + (float) Math.toRadians(xx), arms5.rotateAngleY + (float) Math.toRadians(yy), arms5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 10) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 60 + (((tickAnim - 10) / 5) * (-10-(60)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 15) / 3) * (20-(-10)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 18) / 2) * (-2-(20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss5, armss5.rotateAngleX + (float) Math.toRadians(xx), armss5.rotateAngleY + (float) Math.toRadians(yy), armss5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 11) * (45-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 11) * (-15-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 45 + (((tickAnim - 11) / 5) * (15-(45)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = -15 + (((tickAnim - 11) / 5) * (0-(-15)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 16) / 2) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (-0.33494-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(xx), arm10.rotateAngleY + (float) Math.toRadians(yy), arm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05 + (((tickAnim - 0) / 8) * (0.5-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.05)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 3) * (1-(1)));
            zz = 0.5 + (((tickAnim - 8) / 3) * (1-(0.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            yy = 1 + (((tickAnim - 11) / 5) * (1.1-(1)));
            zz = 1 + (((tickAnim - 11) / 5) * (1.5-(1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            yy = 1.1 + (((tickAnim - 16) / 4) * (1-(1.1)));
            zz = 1.5 + (((tickAnim - 16) / 4) * (1-(1.5)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm10.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 11) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 11) / 5) * (-30-(60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -30 + (((tickAnim - 16) / 2) * (-2.5-(-30)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (0.16506-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms10, arms10.rotateAngleX + (float) Math.toRadians(xx), arms10.rotateAngleY + (float) Math.toRadians(yy), arms10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 11) * (60-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 60 + (((tickAnim - 11) / 5) * (-10-(60)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 16) / 2) * (20-(-10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 18) / 2) * (-2-(20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss10, armss10.rotateAngleX + (float) Math.toRadians(xx), armss10.rotateAngleY + (float) Math.toRadians(yy), armss10.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animBack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegateuthis entity = (EntityPrehistoricFloraMegateuthis) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(180), root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.5);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.25);
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01));


        this.setRotateAngle(finbaseR, finbaseR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), finbaseR.rotateAngleY + (float) Math.toRadians(0), finbaseR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5));



        this.setRotateAngle(finbaseL, finbaseL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), finbaseL.rotateAngleY + (float) Math.toRadians(0), finbaseL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*-2.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*2.5));
        this.body2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.008),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.008));


        this.siphpn.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.2),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.1));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 40) * (-10-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -10 + (((tickAnim - 40) / 40) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 40) * (4.66506-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.66506 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms, arms.rotateAngleX + (float) Math.toRadians(xx), arms.rotateAngleY + (float) Math.toRadians(yy), arms.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 40) * (2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss, armss.rotateAngleX + (float) Math.toRadians(xx), armss.rotateAngleY + (float) Math.toRadians(yy), armss.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 40) * (10-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 10 + (((tickAnim - 40) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(xx), arm6.rotateAngleY + (float) Math.toRadians(yy), arm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 40) * (4.66506-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.66506 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms6, arms6.rotateAngleX + (float) Math.toRadians(xx), arms6.rotateAngleY + (float) Math.toRadians(yy), arms6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 40) * (2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss6, armss6.rotateAngleX + (float) Math.toRadians(xx), armss6.rotateAngleY + (float) Math.toRadians(yy), armss6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 40) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 40) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 40) * (4.66506-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.66506 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 40) * (2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss2, armss2.rotateAngleX + (float) Math.toRadians(xx), armss2.rotateAngleY + (float) Math.toRadians(yy), armss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 40) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 40) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(xx), arm7.rotateAngleY + (float) Math.toRadians(yy), arm7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 40) * (4.66506-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.66506 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms7, arms7.rotateAngleX + (float) Math.toRadians(xx), arms7.rotateAngleY + (float) Math.toRadians(yy), arms7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 40) * (2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss7, armss7.rotateAngleX + (float) Math.toRadians(xx), armss7.rotateAngleY + (float) Math.toRadians(yy), armss7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 40) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -2.5 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(xx), arm8.rotateAngleY + (float) Math.toRadians(yy), arm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 40) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 40) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 40) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(xx), arm4.rotateAngleY + (float) Math.toRadians(yy), arm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 40) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 40) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 40) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(xx), arm9.rotateAngleY + (float) Math.toRadians(yy), arm9.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm9.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 40) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 10 + (((tickAnim - 0) / 40) * (10-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 10 + (((tickAnim - 40) / 40) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(xx), arm5.rotateAngleY + (float) Math.toRadians(yy), arm5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 40) * (2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 40) * (-10-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -10 + (((tickAnim - 40) / 40) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(xx), arm10.rotateAngleY + (float) Math.toRadians(yy), arm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 80) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 0) / 80) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm10.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 40) * (2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(2.16506)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss8, armss8.rotateAngleX + (float) Math.toRadians(xx), armss8.rotateAngleY + (float) Math.toRadians(yy), armss8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 40) * (4.66506-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 4.66506 + (((tickAnim - 40) / 40) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(4.66506)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms8, arms8.rotateAngleX + (float) Math.toRadians(xx), arms8.rotateAngleY + (float) Math.toRadians(yy), arms8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 40) * (-4.66506-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -4.66506 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-4.66506)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 40) * (-4.66506-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.66506 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms9, arms9.rotateAngleX + (float) Math.toRadians(xx), arms9.rotateAngleY + (float) Math.toRadians(yy), arms9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 40) * (-2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss9, armss9.rotateAngleX + (float) Math.toRadians(xx), armss9.rotateAngleY + (float) Math.toRadians(yy), armss9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 40) * (-4.66506-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.66506 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms5, arms5.rotateAngleX + (float) Math.toRadians(xx), arms5.rotateAngleY + (float) Math.toRadians(yy), arms5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 40) * (-2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss5, armss5.rotateAngleX + (float) Math.toRadians(xx), armss5.rotateAngleY + (float) Math.toRadians(yy), armss5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 40) * (-4.66506-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.66506 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms10, arms10.rotateAngleX + (float) Math.toRadians(xx), arms10.rotateAngleY + (float) Math.toRadians(yy), arms10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 40) * (-2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss10, armss10.rotateAngleX + (float) Math.toRadians(xx), armss10.rotateAngleY + (float) Math.toRadians(yy), armss10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 40) * (-2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-2.16506)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss3, armss3.rotateAngleX + (float) Math.toRadians(xx), armss3.rotateAngleY + (float) Math.toRadians(yy), armss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 0) / 40) * (-4.66506-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -4.66506 + (((tickAnim - 40) / 40) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-4.66506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms4, arms4.rotateAngleX + (float) Math.toRadians(xx), arms4.rotateAngleY + (float) Math.toRadians(yy), arms4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 0) / 40) * (-2.16506-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.16506 + (((tickAnim - 40) / 40) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(-2.16506)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss4, armss4.rotateAngleX + (float) Math.toRadians(xx), armss4.rotateAngleY + (float) Math.toRadians(yy), armss4.rotateAngleZ + (float) Math.toRadians(zz));

       
    }
    public void animFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegateuthis entity = (EntityPrehistoricFloraMegateuthis) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 180 + (((tickAnim - 0) / 30) * (180-(180)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 180 + (((tickAnim - 30) / 10) * (180-(180)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 180 + (((tickAnim - 40) / 30) * (180-(180)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 180 + (((tickAnim - 70) / 10) * (180-(180)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.025)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.025)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finbaseR, finbaseR.rotateAngleX + (float) Math.toRadians(xx), finbaseR.rotateAngleY + (float) Math.toRadians(yy), finbaseR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.7 + (((tickAnim - 0) / 30) * (0.7-(0.7)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.7 + (((tickAnim - 30) / 10) * (1-(0.7)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0.7-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finbaseR.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+90))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(finbaseL, finbaseL.rotateAngleX + (float) Math.toRadians(xx), finbaseL.rotateAngleY + (float) Math.toRadians(yy), finbaseL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.7 + (((tickAnim - 0) / 30) * (0.7-(0.7)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0.7 + (((tickAnim - 30) / 10) * (1-(0.7)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 30) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (0.7-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.finbaseL.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+150))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.01)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-0.01)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.body2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5 + (((tickAnim - 30) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-5)));
            yy = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 30) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(siphpn, siphpn.rotateAngleX + (float) Math.toRadians(xx), siphpn.rotateAngleY + (float) Math.toRadians(yy), siphpn.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2 + (((tickAnim - 0) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2 + (((tickAnim - 0) / 30) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05 + (((tickAnim - 30) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2 + (((tickAnim - 30) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2 + (((tickAnim - 30) / 10) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2 + (((tickAnim - 40) / 30) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1 + (((tickAnim - 40) / 30) * (1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.05)));
            yy = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2 + (((tickAnim - 70) / 10) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*0.2)));
            zz = 1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1 + (((tickAnim - 70) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.2-(1.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-0.1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.siphpn.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 0) / 30) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-10-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -10 + (((tickAnim - 40) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(0)));
            zz = -10 + (((tickAnim - 70) / 10) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(xx), arm.rotateAngleY + (float) Math.toRadians(yy), arm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms, arms.rotateAngleX + (float) Math.toRadians(xx), arms.rotateAngleY + (float) Math.toRadians(yy), arms.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss, armss.rotateAngleX + (float) Math.toRadians(xx), armss.rotateAngleY + (float) Math.toRadians(yy), armss.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 0) / 30) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 30) / 10) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (10-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 10 + (((tickAnim - 40) / 30) * (10-(10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(0)));
            zz = 10 + (((tickAnim - 70) / 10) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(xx), arm6.rotateAngleY + (float) Math.toRadians(yy), arm6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms6, arms6.rotateAngleX + (float) Math.toRadians(xx), arms6.rotateAngleY + (float) Math.toRadians(yy), arms6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss6, armss6.rotateAngleX + (float) Math.toRadians(xx), armss6.rotateAngleY + (float) Math.toRadians(yy), armss6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 0) / 30) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 30) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 70) / 10) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(xx), arm2.rotateAngleY + (float) Math.toRadians(yy), arm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss2, armss2.rotateAngleX + (float) Math.toRadians(xx), armss2.rotateAngleY + (float) Math.toRadians(yy), armss2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 0) / 30) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 30) * (45-(45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 30) / 10) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 30) * (45-(45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 70) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(xx), arm7.rotateAngleY + (float) Math.toRadians(yy), arm7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms7, arms7.rotateAngleX + (float) Math.toRadians(xx), arms7.rotateAngleY + (float) Math.toRadians(yy), arms7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss7, armss7.rotateAngleX + (float) Math.toRadians(xx), armss7.rotateAngleY + (float) Math.toRadians(yy), armss7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 0) / 30) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(xx), arm3.rotateAngleY + (float) Math.toRadians(yy), arm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 0) / 30) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(xx), arm8.rotateAngleY + (float) Math.toRadians(yy), arm8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 0) / 30) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 0) / 30) * (45-(45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 30) / 10) * (45-(45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 45 + (((tickAnim - 40) / 30) * (45-(45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 45 + (((tickAnim - 70) / 10) * (45-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(xx), arm4.rotateAngleY + (float) Math.toRadians(yy), arm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 0) / 30) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 30) / 10) * (-45-(-45)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -45 + (((tickAnim - 40) / 30) * (-45-(-45)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -45 + (((tickAnim - 70) / 10) * (-45-(-45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(xx), arm9.rotateAngleY + (float) Math.toRadians(yy), arm9.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm9.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 0) / 30) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 0) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 10 + (((tickAnim - 0) / 30) * (10-(10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            zz = 10 + (((tickAnim - 30) / 10) * (10-(10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 10 + (((tickAnim - 40) / 30) * (10-(10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(0)));
            zz = 10 + (((tickAnim - 70) / 10) * (10-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(xx), arm5.rotateAngleY + (float) Math.toRadians(yy), arm5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 0) / 30) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -10 + (((tickAnim - 0) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 30) / 10) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = -10 + (((tickAnim - 30) / 10) * (-10-(-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -10 + (((tickAnim - 40) / 30) * (-10-(-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 70) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(0)));
            zz = -10 + (((tickAnim - 70) / 10) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(xx), arm10.rotateAngleY + (float) Math.toRadians(yy), arm10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 0) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3 + (((tickAnim - 30) / 10) * (1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 40) / 30) * (1-(1)));
            zz = 1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 40) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05-(1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 70) / 10) * (1-(1)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05 + (((tickAnim - 70) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*0.3-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.05)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.arm10.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss8, armss8.rotateAngleX + (float) Math.toRadians(xx), armss8.rotateAngleY + (float) Math.toRadians(yy), armss8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20 + (((tickAnim - 30) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 40) / 30) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*-20-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms8, arms8.rotateAngleX + (float) Math.toRadians(xx), arms8.rotateAngleY + (float) Math.toRadians(yy), arms8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms9, arms9.rotateAngleX + (float) Math.toRadians(xx), arms9.rotateAngleY + (float) Math.toRadians(yy), arms9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss9, armss9.rotateAngleX + (float) Math.toRadians(xx), armss9.rotateAngleY + (float) Math.toRadians(yy), armss9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms5, arms5.rotateAngleX + (float) Math.toRadians(xx), arms5.rotateAngleY + (float) Math.toRadians(yy), arms5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss5, armss5.rotateAngleX + (float) Math.toRadians(xx), armss5.rotateAngleY + (float) Math.toRadians(yy), armss5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms10, arms10.rotateAngleX + (float) Math.toRadians(xx), arms10.rotateAngleY + (float) Math.toRadians(yy), arms10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss10, armss10.rotateAngleX + (float) Math.toRadians(xx), armss10.rotateAngleY + (float) Math.toRadians(yy), armss10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss3, armss3.rotateAngleX + (float) Math.toRadians(xx), armss3.rotateAngleY + (float) Math.toRadians(yy), armss3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20 + (((tickAnim - 30) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 40) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+90))*20-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms4, arms4.rotateAngleX + (float) Math.toRadians(xx), arms4.rotateAngleY + (float) Math.toRadians(yy), arms4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 40) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 30) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+45))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armss4, armss4.rotateAngleX + (float) Math.toRadians(xx), armss4.rotateAngleY + (float) Math.toRadians(yy), armss4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFront(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegateuthis entity = (EntityPrehistoricFloraMegateuthis) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(180), root.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01));


        this.setRotateAngle(finbaseR, finbaseR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), finbaseR.rotateAngleY + (float) Math.toRadians(0), finbaseR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-30));



        this.setRotateAngle(finbaseL, finbaseL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), finbaseL.rotateAngleY + (float) Math.toRadians(0), finbaseL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*30));



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.01));


        this.setRotateAngle(siphpn, siphpn.rotateAngleX + (float) Math.toRadians(145.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), siphpn.rotateAngleY + (float) Math.toRadians(0), siphpn.rotateAngleZ + (float) Math.toRadians(0));
        this.siphpn.rotationPointX = this.siphpn.rotationPointX + (float)(0);
        this.siphpn.rotationPointY = this.siphpn.rotationPointY - (float)(0.625);
        this.siphpn.rotationPointZ = this.siphpn.rotationPointZ + (float)(-2);
        this.siphpn.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.1),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.1));


        this.setRotateAngle(arm, arm.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm.rotateAngleY + (float) Math.toRadians(0), arm.rotateAngleZ + (float) Math.toRadians(-10));
        this.arm.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms, arms.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms.rotateAngleY + (float) Math.toRadians(0), arms.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss, armss.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss.rotateAngleY + (float) Math.toRadians(0), armss.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm6, arm6.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm6.rotateAngleY + (float) Math.toRadians(0), arm6.rotateAngleZ + (float) Math.toRadians(10));
        this.arm6.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms6, arms6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms6.rotateAngleY + (float) Math.toRadians(0), arms6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss6, armss6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss6.rotateAngleY + (float) Math.toRadians(0), armss6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm2, arm2.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm2.rotateAngleZ + (float) Math.toRadians(-45));
        this.arm2.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss2, armss2.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm7, arm7.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1), arm7.rotateAngleZ + (float) Math.toRadians(45));
        this.arm7.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms7, arms7.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), arms7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss7, armss7.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), armss7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm3, arm3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm3.rotateAngleY + (float) Math.toRadians(0), arm3.rotateAngleZ + (float) Math.toRadians(0));
        this.arm3.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms3.rotateAngleY + (float) Math.toRadians(-2), arms3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss3, armss3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss3.rotateAngleY + (float) Math.toRadians(-2), armss3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm8, arm8.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm8.rotateAngleY + (float) Math.toRadians(0), arm8.rotateAngleZ + (float) Math.toRadians(0));
        this.arm8.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms8, arms8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms8.rotateAngleY + (float) Math.toRadians(2), arms8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss8, armss8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss8.rotateAngleY + (float) Math.toRadians(2), armss8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm4, arm4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1), arm4.rotateAngleZ + (float) Math.toRadians(45));
        this.arm4.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms4, arms4.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), arms4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss4, armss4.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), armss4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm9, arm9.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1), arm9.rotateAngleZ + (float) Math.toRadians(-45));
        this.arm9.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms9, arms9.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss9, armss9.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss9.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm5, arm5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm5.rotateAngleY + (float) Math.toRadians(0), arm5.rotateAngleZ + (float) Math.toRadians(10));
        this.arm5.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms5, arms5.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms5.rotateAngleY + (float) Math.toRadians(0), arms5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss5, armss5.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss5.rotateAngleY + (float) Math.toRadians(0), armss5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arm10, arm10.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), arm10.rotateAngleY + (float) Math.toRadians(0), arm10.rotateAngleZ + (float) Math.toRadians(-10));
        this.arm10.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05));


        this.setRotateAngle(arms10, arms10.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), arms10.rotateAngleY + (float) Math.toRadians(0), arms10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armss10, armss10.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), armss10.rotateAngleY + (float) Math.toRadians(0), armss10.rotateAngleZ + (float) Math.toRadians(0));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMegateuthis e = (EntityPrehistoricFloraMegateuthis) entity;
        animator.update(entity);

    }
}
