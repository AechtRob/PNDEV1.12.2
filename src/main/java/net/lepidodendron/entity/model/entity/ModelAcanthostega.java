package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAcanthostega;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAcanthostega extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;


    private ModelAnimator animator;

    public ModelAcanthostega() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.0F, 1.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 23, -2.5F, -2.0F, -3.25F, 5, 3, 8, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -3.375F, 1.7F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0087F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 23, -3.5F, 0.0F, -5.0F, 4, 2, 8, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.root.addChild(upperbody);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -1.425F, 2.0F);
        this.upperbody.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0393F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -3.5F, 0.0F, -10.0F, 5, 2, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 2.05F, 2.0F);
        this.upperbody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0131F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -4.5F, -2.0F, -10.0F, 6, 3, 9, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.45F, 1.75F, -4.75F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.0F, 0.7854F, -0.1745F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 55, -2.8F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-2.55F, 0.0F, 0.0F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.0F, -0.1309F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 18, 37, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 48, 18, -2.25F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.45F, 1.75F, -4.75F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.0F, -0.7854F, 0.1745F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 55, -0.2F, -0.5F, -1.0F, 3, 1, 2, 0.01F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(2.55F, 0.0F, 0.0F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.0F, 0.1309F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 18, 37, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 48, 18, -0.75F, 0.0F, -2.0F, 3, 0, 4, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.075F, -7.522F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.15F, 0.975F, -6.978F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4189F, 0.1134F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 55, -0.1F, -1.0F, -1.3F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.288F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 56, 0.15F, -1.0F, 0.2F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.288F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 57, 0.15F, -1.0F, 1.75F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.288F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 58, 0.15F, -0.725F, 3.25F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.125F, 1.075F, -7.003F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.288F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 22, -1.5F, -1.0F, 2.7F, 2, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.125F, 0.725F, -6.978F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1134F, 0.288F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 53, -1.5F, -1.0F, -0.3F, 2, 1, 3, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.7F, 0.825F, -6.778F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6632F, 0.637F, -0.2356F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 57, 0.075F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.7F, 0.825F, -6.778F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6632F, -0.637F, 0.2356F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 57, -1.075F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.6F, -7.178F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.48F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 56, -1.0F, -1.025F, -1.0F, 2, 1, 1, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.05F, -5.278F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2443F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 9, -1.0F, 0.0F, -1.975F, 2, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.8F, -4.678F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5498F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 3, -1.0F, 0.25F, -2.0F, 2, 1, 2, -0.02F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 0, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.7F, -1.0F, 0.922F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.1833F, 0.0044F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 58, -1.0F, 0.0F, -6.025F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.7F, -1.0F, 0.922F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, -0.1833F, -0.0044F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 58, 0.0F, 0.0F, -6.025F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.625F, 0.2F, 0.822F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.1833F, -0.0131F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 48, 11, -0.95F, -1.0F, -6.0F, 1, 2, 5, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.625F, 0.2F, 0.822F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, -0.1833F, 0.0131F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 11, -0.05F, -1.0F, -6.0F, 1, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.2F, 1.022F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 41, -2.0F, -1.0F, -6.0F, 3, 2, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.625F, -6.978F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 48, -2.0F, -1.0F, 2.7F, 3, 1, 4, -0.01F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 53, -1.5F, -1.0F, -0.3F, 2, 1, 3, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.125F, 1.075F, -7.003F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0262F, -0.288F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 22, -0.5F, -1.0F, 2.7F, 2, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0175F, -0.288F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 4, 58, -0.15F, -0.725F, 3.25F, 0, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0698F, -0.288F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 30, 57, -0.15F, -1.0F, 1.75F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.125F, 0.975F, -6.978F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1134F, -0.288F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 38, 56, -0.15F, -1.0F, 0.2F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.25F, 0.975F, -6.978F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.4189F, 0.288F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 55, -0.6F, -1.0F, -0.8F, 0, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.25F, 0.975F, -6.978F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4189F, -0.288F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 10, 55, 0.6F, -1.0F, -0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.15F, 0.975F, -6.978F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4189F, -0.1134F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 55, 0.1F, -1.0F, -1.3F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.125F, 0.725F, -6.978F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1134F, -0.288F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 53, -0.5F, -1.0F, -0.3F, 2, 1, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -0.478F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 41, -1.0F, 0.0F, -5.175F, 2, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 49, -2.0F, -1.0F, -2.175F, 4, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.6F, -0.2F, -8.15F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3229F, 0.288F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 6, -0.75F, -1.0F, 1.7F, 1, 1, 2, -0.02F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 49, -0.5F, -1.0F, 1.7F, 1, 1, 2, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.0F, 0.55F, -6.7F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.829F, 0.3316F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 6, 58, -2.0F, -1.0F, -2.3F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.1F, 0.35F, -6.4F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.3054F, 0.288F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 46, 11, -1.5F, -1.0F, -0.3F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.1F, 0.75F, -6.4F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.288F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 28, 12, -1.5F, -1.0F, 1.7F, 0, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.1F, 1.0F, -6.5F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.288F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 46, 40, -1.5F, -1.0F, 1.7F, 2, 1, 5, -0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.7F, -0.1F, -8.125F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.7069F, 0.5934F, -0.1396F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 57, -1.2F, -1.6F, 0.55F, 1, 1, 1, -0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.7F, -0.1F, -8.125F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.7069F, -0.5934F, 0.1396F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 22, 57, 0.2F, -1.6F, 0.55F, 1, 1, 1, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.6F, -0.2F, -8.15F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3229F, -0.288F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 56, 6, -0.25F, -1.0F, 1.7F, 1, 1, 2, -0.02F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 49, -0.5F, -1.0F, 1.7F, 1, 1, 2, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.25F, 0.6F, -6.5F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2182F, 0.2531F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 46, 46, -2.0F, -1.0F, 1.7F, 2, 1, 5, -0.01F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.25F, 0.6F, -6.5F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2182F, -0.2531F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 46, 46, 0.0F, -1.0F, 1.7F, 2, 1, 5, -0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-3.0F, 0.55F, -6.7F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.829F, -0.3316F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 6, 58, 2.0F, -1.0F, -2.3F, 0, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-3.1F, 0.35F, -6.4F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3054F, -0.288F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 46, 11, 1.5F, -1.0F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-3.1F, 0.75F, -6.4F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.288F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 28, 12, 1.5F, -1.0F, 1.7F, 0, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.1F, 1.0F, -6.5F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.288F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 46, 40, -0.5F, -1.0F, 1.7F, 2, 1, 5, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 2.125F, -1.175F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.288F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 34, -2.0F, -1.0F, -4.0F, 3, 1, 6, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -0.6F, -7.65F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -1.2217F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 57, -1.0F, -0.95F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.475F, -6.6F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.7854F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 10, 57, -1.0F, -1.0F, -1.5F, 2, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.975F, -5.15F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.4363F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 18, 34, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -1.75F, 4.5F);
        this.root.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.0873F, 0.0F, 0.0F);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 26, 33, -1.5F, -1.6F, -0.5F, 3, 2, 6, -0.01F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0F, 2.7F, -0.3F);
        this.lowerbody.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0698F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 28, 14, -3.0F, -3.025F, 0.0F, 4, 3, 6, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.lowerbody.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 41, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 50, 27, 0.0F, 1.25F, -1.0F, 0, 1, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 40, 52, 0.0F, -2.5F, -1.0F, 0, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 48, -0.5F, -1.15F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 46, 0, 0.0F, -3.0F, 0.0F, 0, 6, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 33, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 0, 0.0F, -3.0F, 0.0F, 0, 6, 8, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.5F, 1.75F, 3.5F);
        this.lowerbody.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.5672F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 50, 55, -2.25F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-2.25F, 0.0F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 0.0873F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 32, 53, -2.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.rightleg2.addChild(rightleg3);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 50, 52, -2.1F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.5F, 1.75F, 3.5F);
        this.lowerbody.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, -0.5672F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 50, 55, -0.75F, -0.5F, -1.0F, 3, 1, 2, 0.01F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(2.25F, 0.0F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -0.0873F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 32, 53, 0.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.leftleg2.addChild(leftleg3);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 50, 52, -0.9F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {


    }
    public void renderStaticFloor(float f) {

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.2F;
        this.root.offsetX = 0.2F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.4F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraAcanthostega entitySilesaurus = (EntityPrehistoricFloraAcanthostega) e;
        ((EntityPrehistoricFloraAcanthostega)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraAcanthostega ee = (EntityPrehistoricFloraAcanthostega) entitylivingbaseIn;

        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) {
                    animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
                    animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } 

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcanthostega entity = (EntityPrehistoricFloraAcanthostega) entitylivingbaseIn;
        int animCycle = 70;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5-170))*0.59), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-170))*2), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-50))*2));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-20))*-0.25);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5-20))*-0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5-50))*0.1);


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5+20))*-0.5), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-200))*2), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103+50))*5));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (2.7164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-127.6834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-90-(0)));
            zz = -5.5 + (((tickAnim - 0) / 16) * (-6.1796+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-30-(-5.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 31) {
            xx = 2.7164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 16) / 15) * (0.36431-(2.7164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = -127.6834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-90 + (((tickAnim - 16) / 15) * (-76.321-(-127.6834+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-90)));
            zz = -6.1796+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-30 + (((tickAnim - 16) / 15) * (-2.05199817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*10-(-6.1796+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-30)));
        }
        else if (tickAnim >= 31 && tickAnim < 70) {
            xx = 0.36431 + (((tickAnim - 31) / 39) * (0-(0.36431)));
            yy = -76.321 + (((tickAnim - 31) / 39) * (0-(-76.321)));
            zz = -2.05199817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*10 + (((tickAnim - 31) / 39) * (-5.5-(-2.05199817+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-10.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (6.09138-(0)));
            yy = 13.5 + (((tickAnim - 15) / 8) * (6.40618-(13.5)));
            zz = -10.75 + (((tickAnim - 15) / 8) * (1.01511-(-10.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 6.09138 + (((tickAnim - 23) / 24) * (0-(6.09138)));
            yy = 6.40618 + (((tickAnim - 23) / 24) * (0-(6.40618)));
            zz = 1.01511 + (((tickAnim - 23) / 24) * (9.25-(1.01511)));
        }
        else if (tickAnim >= 47 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 47) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 11) * (0-(0)));
            zz = 9.25 + (((tickAnim - 47) / 11) * (9.63-(9.25)));
        }
        else if (tickAnim >= 58 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 12) * (0-(0)));
            zz = 9.63 + (((tickAnim - 58) / 12) * (0-(9.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 55) {
            xx = 7.25 + (((tickAnim - 24) / 31) * (-3.12-(7.25)));
            yy = 0 + (((tickAnim - 24) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 31) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = -3.12 + (((tickAnim - 55) / 15) * (0-(-3.12)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 4.75 + (((tickAnim - 0) / 16) * (3.45921-(4.75)));
            yy = 71 + (((tickAnim - 0) / 16) * (38.50434-(71)));
            zz = 0 + (((tickAnim - 0) / 16) * (-5.24384-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 3.45921 + (((tickAnim - 16) / 9) * (2.93183-(3.45921)));
            yy = 38.50434 + (((tickAnim - 16) / 9) * (19.35386-(38.50434)));
            zz = -5.24384 + (((tickAnim - 16) / 9) * (-2.64406-(-5.24384)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 2.93183 + (((tickAnim - 25) / 9) * (0-(2.93183)));
            yy = 19.35386 + (((tickAnim - 25) / 9) * (0-(19.35386)));
            zz = -2.64406 + (((tickAnim - 25) / 9) * (5.5-(-2.64406)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (1.6062654096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-80-(0)));
            yy = 0 + (((tickAnim - 34) / 16) * (32.98029-(0)));
            zz = 5.5 + (((tickAnim - 34) / 16) * (-7.66912-(5.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 1.6062654096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-80 + (((tickAnim - 50) / 20) * (4.75-(1.6062654096+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*-80)));
            yy = 32.98029 + (((tickAnim - 50) / 20) * (71-(32.98029)));
            zz = -7.66912 + (((tickAnim - 50) / 20) * (0-(-7.66912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = -6 + (((tickAnim - 0) / 35) * (0-(-6)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (9.25-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 20) * (0-(0)));
            zz = 9.25 + (((tickAnim - 50) / 20) * (-6-(9.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(4.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5+30))*2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-350))*4), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-350))*-5));


        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5-50))*1.5), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-30))*3), lowerbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-190))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103/0.5-80))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-50))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-220))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-250))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-200))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*103-350))*4));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.5926 + (((tickAnim - 0) / 5) * (7.05977-(3.5926)));
            yy = -57.93672 + (((tickAnim - 0) / 5) * (-64.11396-(-57.93672)));
            zz = -4.92751 + (((tickAnim - 0) / 5) * (-7.65546-(-4.92751)));
        }
        else if (tickAnim >= 5 && tickAnim < 41) {
            xx = 7.05977 + (((tickAnim - 5) / 36) * (4.81213-(7.05977)));
            yy = -64.11396 + (((tickAnim - 5) / 36) * (-1.57815-(-64.11396)));
            zz = -7.65546 + (((tickAnim - 5) / 36) * (-5.20469-(-7.65546)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = 4.81213 + (((tickAnim - 41) / 29) * (3.5926-(4.81213)));
            yy = -1.57815 + (((tickAnim - 41) / 29) * (-57.93672-(-1.57815)));
            zz = -5.20469 + (((tickAnim - 41) / 29) * (-4.92751-(-5.20469)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.20099-(0)));
            yy = -5.5 + (((tickAnim - 0) / 15) * (-1.46489-(-5.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (3.2562-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 41) {
            xx = 0.20099 + (((tickAnim - 15) / 26) * (0-(0.20099)));
            yy = -1.46489 + (((tickAnim - 15) / 26) * (5.5-(-1.46489)));
            zz = 3.2562 + (((tickAnim - 15) / 26) * (0-(3.2562)));
        }
        else if (tickAnim >= 41 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 41) / 16) * (0-(0)));
            yy = 5.5 + (((tickAnim - 41) / 16) * (15.25-(5.5)));
            zz = 0 + (((tickAnim - 41) / 16) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            yy = 15.25 + (((tickAnim - 57) / 13) * (-5.5-(15.25)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 0) / 57) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 57) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 0.325 + (((tickAnim - 57) / 13) * (0-(0.325)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (21.7695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (62.0341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-6.07587-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 21.7695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20 + (((tickAnim - 17) / 17) * (15.64601-(21.7695+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*20)));
            yy = 62.0341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*50 + (((tickAnim - 17) / 17) * (52.59579-(62.0341+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*50)));
            zz = -6.07587 + (((tickAnim - 17) / 17) * (8.05087-(-6.07587)));
        }
        else if (tickAnim >= 34 && tickAnim < 70) {
            xx = 15.64601 + (((tickAnim - 34) / 36) * (0-(15.64601)));
            yy = 52.59579 + (((tickAnim - 34) / 36) * (0-(52.59579)));
            zz = 8.05087 + (((tickAnim - 34) / 36) * (0-(8.05087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-10.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (9.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 17) / 17) * (-6.74841-(0)));
            yy = -10.5 + (((tickAnim - 17) / 17) * (4.85309-(-10.5)));
            zz = 9.5 + (((tickAnim - 17) / 17) * (-1.24134-(9.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 70) {
            xx = -6.74841 + (((tickAnim - 34) / 36) * (0-(-6.74841)));
            yy = 4.85309 + (((tickAnim - 34) / 36) * (0-(4.85309)));
            zz = -1.24134 + (((tickAnim - 34) / 36) * (0-(-1.24134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-0.3-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -0.3 + (((tickAnim - 17) / 17) * (0-(-0.3)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 7.25 + (((tickAnim - 18) / 8) * (0-(7.25)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (-4.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 30) * (0-(0)));
            zz = -4.75 + (((tickAnim - 40) / 30) * (0-(-4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcanthostega entity = (EntityPrehistoricFloraAcanthostega) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*6), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6), upperbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(44.361944212+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6), rightarm.rotateAngleY + (float) Math.toRadians(16.1008402293+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6), rightarm.rotateAngleZ + (float) Math.toRadians(-20.23111));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(44.361944212+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*6), leftarm.rotateAngleY + (float) Math.toRadians(-16.1008402293+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6), leftarm.rotateAngleZ + (float) Math.toRadians(20.23111));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*6), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*6), lowerbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*14), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(19.70015), rightleg.rotateAngleY + (float) Math.toRadians(22.973117686+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2), rightleg.rotateAngleZ + (float) Math.toRadians(-42.8088362554+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(19.70015), leftleg.rotateAngleY + (float) Math.toRadians(-22.973117686+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*2), leftleg.rotateAngleZ + (float) Math.toRadians(42.8088362554+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAcanthostega entity = (EntityPrehistoricFloraAcanthostega) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*10), root.rotateAngleZ + (float) Math.toRadians(0));
        this.root.rotationPointX = this.root.rotationPointX + (float)(0);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-10), upperbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(44.361944212+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-6), rightarm.rotateAngleY + (float) Math.toRadians(16.1008402293+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-6), rightarm.rotateAngleZ + (float) Math.toRadians(-20.23111));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(44.361944212+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*6), leftarm.rotateAngleY + (float) Math.toRadians(-16.1008402293+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-6), leftarm.rotateAngleZ + (float) Math.toRadians(20.23111));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-190))*10), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10), lowerbody.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*16), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*18), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(19.70015), rightleg.rotateAngleY + (float) Math.toRadians(22.973117686+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*2), rightleg.rotateAngleZ + (float) Math.toRadians(-42.8088362554+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(19.70015), leftleg.rotateAngleY + (float) Math.toRadians(-22.973117686+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*2), leftleg.rotateAngleZ + (float) Math.toRadians(42.8088362554+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*10));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAcanthostega entity = (EntityPrehistoricFloraAcanthostega) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.80556-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.33333-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.80556 + (((tickAnim - 3) / 5) * (-12.25-(3.80556)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 3) / 5) * (-7.5-(-3.33333)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -12.25 + (((tickAnim - 8) / 7) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -7.5 + (((tickAnim - 8) / 7) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAcanthostega e = (EntityPrehistoricFloraAcanthostega) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
