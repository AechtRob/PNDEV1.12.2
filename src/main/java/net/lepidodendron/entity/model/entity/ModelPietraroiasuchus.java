package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPietraroiasuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPietraroiasuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer pelvis;
    private final AdvancedModelRenderer leftUpperLeg;
    private final AdvancedModelRenderer leftLowerLeg;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightUpperLeg;
    private final AdvancedModelRenderer rightLowerLeg;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
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
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer leftUpperArm;
    private final AdvancedModelRenderer leftlowerArmw;
    private final AdvancedModelRenderer leftLowerArm;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer rightlowerArmw;
    private final AdvancedModelRenderer rightLowerArm;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r31;

    private ModelAnimator animator;

    public ModelPietraroiasuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.pelvis = new AdvancedModelRenderer(this);
        this.pelvis.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(pelvis);
        this.pelvis.cubeList.add(new ModelBox(pelvis, 11, 27, -1.5F, -3.0F, -2.3F, 3, 3, 2, -0.01F, false));
        this.pelvis.cubeList.add(new ModelBox(pelvis, 19, 45, 1.4F, -3.3F, -2.3F, 0, 1, 2, 0.0F, false));
        this.pelvis.cubeList.add(new ModelBox(pelvis, 19, 45, -1.4F, -3.3F, -2.3F, 0, 1, 2, 0.0F, false));

        this.leftUpperLeg = new AdvancedModelRenderer(this);
        this.leftUpperLeg.setRotationPoint(1.4447F, -1.1796F, -1.9F);
        this.pelvis.addChild(leftUpperLeg);
        this.setRotateAngle(leftUpperLeg, -0.0419F, 0.2086F, -0.3893F);
        this.leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 35, 15, -0.9F, -0.4F, -0.6F, 3, 1, 2, 0.0F, false));
        this.leftUpperLeg.cubeList.add(new ModelBox(leftUpperLeg, 22, 32, -0.9F, -0.4F, -1.0F, 3, 1, 2, 0.01F, false));

        this.leftLowerLeg = new AdvancedModelRenderer(this);
        this.leftLowerLeg.setRotationPoint(1.7F, -0.1F, 0.5F);
        this.leftUpperLeg.addChild(leftLowerLeg);
        this.setRotateAngle(leftLowerLeg, -0.5984F, -0.5953F, 1.2614F);
        this.leftLowerLeg.cubeList.add(new ModelBox(leftLowerLeg, 0, 32, 0.0F, -0.5F, -1.3F, 3, 1, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(3.2314F, 0.1355F, -0.1998F);
        this.leftLowerLeg.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.0574F, 0.4831F, -0.7067F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftFoot.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7679F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 0, -0.8F, -0.2F, -1.6F, 4, 0, 3, 0.0F, false));

        this.rightUpperLeg = new AdvancedModelRenderer(this);
        this.rightUpperLeg.setRotationPoint(-1.4447F, -1.1796F, -1.9F);
        this.pelvis.addChild(rightUpperLeg);
        this.setRotateAngle(rightUpperLeg, -0.0419F, -0.2086F, 0.3893F);
        this.rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 38, 48, -2.1F, -0.4F, -0.6F, 3, 1, 2, 0.0F, false));
        this.rightUpperLeg.cubeList.add(new ModelBox(rightUpperLeg, 27, 48, -2.1F, -0.4F, -1.0F, 3, 1, 2, 0.01F, false));

        this.rightLowerLeg = new AdvancedModelRenderer(this);
        this.rightLowerLeg.setRotationPoint(-1.7F, -0.1F, 0.5F);
        this.rightUpperLeg.addChild(rightLowerLeg);
        this.setRotateAngle(rightLowerLeg, -0.5984F, 0.5953F, -1.2614F);
        this.rightLowerLeg.cubeList.add(new ModelBox(rightLowerLeg, 0, 36, -3.0F, -0.5F, -1.3F, 3, 1, 2, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.2314F, 0.1355F, -0.1998F);
        this.rightLowerLeg.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.0574F, -0.4831F, 0.7067F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightFoot.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7679F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 18, -3.2F, -0.2F, -1.6F, 4, 0, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.3F, -0.3F);
        this.pelvis.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 10, -1.5F, -1.7F, 0.0F, 3, 3, 4, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 35, 23, 1.4F, -2.1F, 0.0F, 0, 1, 4, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 35, 23, -1.4F, -2.1F, 0.0F, 0, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3F, 4.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 10, -0.8F, -1.4F, 0.0F, 2, 3, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, 1.0F, -2.0F, 0.0F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -1.0F, -2.0F, 0.0F, 0, 1, 4, 0.0F, true));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -1.2F, -1.4F, 0.0F, 2, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.3F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 18, -1.0F, -1.7F, -0.1F, 2, 3, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 37, 0.8F, -2.4F, -0.1F, 0, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 9, 37, -0.8F, -2.4F, -0.1F, 0, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.8F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 25, -0.5F, -1.1F, -0.1F, 1, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.1F, -0.2F);
        this.tail4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 8, -0.3F, -2.3F, 0.1F, 0, 2, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 8, 0.3F, -2.3F, 0.1F, 0, 2, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.7F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 37, 8, -0.5F, -0.5F, 0.1F, 1, 1, 3, -0.01F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 36, 0.1F, -1.4F, 0.1F, 0, 1, 3, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 36, -0.1F, -1.4F, 0.1F, 0, 1, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.8F, -1.9F);
        this.pelvis.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.2F, -5.9F, 4, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 18, 1.5F, -1.5F, -5.9F, 0, 3, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 18, -1.5F, -1.5F, -5.9F, 0, 3, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.4F, -5.9F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 26, -1.5F, -1.6F, -1.8F, 3, 3, 2, -0.01F, false));
        this.chest.cubeList.add(new ModelBox(chest, 14, 45, 1.3F, -1.9F, -1.8F, 0, 1, 2, 0.0F, false));
        this.chest.cubeList.add(new ModelBox(chest, 14, 45, -1.3F, -1.9F, -1.8F, 0, 1, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3F, -1.5F);
        this.chest.addChild(neck);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 36, -1.3F, 0.1F, 0.0F, 2, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 46, -1.1F, -0.2F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 46, 1.1F, -0.2F, 0.0F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 27, -0.7F, 0.1F, 0.0F, 2, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -1.2F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 11, 33, -1.5F, -1.0F, -1.7F, 3, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 33, 32, -1.5F, -1.5F, -1.7F, 3, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 8, -0.2F, -1.05F, -4.8F, 1, 1, 1, -0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 11, -0.8F, -1.05F, -4.8F, 1, 1, 1, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.3F, -4.7F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3142F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 8, -0.5F, -0.55F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.8015F, -0.2006F, -2.0896F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0352F, -0.1221F, 0.1179F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 41, -0.2F, -0.6F, -2.0F, 0, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.8015F, -0.2006F, -2.0896F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0352F, 0.1221F, -0.1179F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 37, 0.2F, -0.6F, -2.0F, 0, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.1F, -2.4F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0352F, 0.1221F, 0.0043F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 37, 41, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.1F, -2.4F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0352F, -0.1221F, -0.0043F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 41, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.1F, -2.4F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 41, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -1.6F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 29, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 0.0F, -1.7F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0524F, -0.5585F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 45, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, 0.0F, -1.7F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.5585F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 45, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, -1.7F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4189F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 15, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6F, -0.4F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0175F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 4, -1.5F, -0.7F, -1.3F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 5, 46, -0.5F, -0.7F, -2.0F, 1, 1, 1, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4F, -0.1349F, -3.8997F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 42, -1.4F, -2.0F, 3.0F, 2, 2, 1, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, 0.3F, -1.6F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0259F, -0.1221F, -0.0043F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 23, 0.05F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, -1.4F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0259F, -0.1221F, -0.0043F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 0, 0.05F, -1.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.7F, -0.1F, -3.3F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 17, -1.0F, -0.65F, -1.05F, 1, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 14, -1.4F, -0.65F, -1.05F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.4F, -4.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0524F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 8, 0.0F, -0.65F, -0.05F, 1, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.0F, -1.4F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0259F, 0.1221F, 0.0043F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 37, -0.05F, -1.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.3F, -1.6F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0259F, 0.1221F, 0.0043F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 42, -1.05F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.4462F, -0.696F, -1.3235F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0095F, -0.6776F, -0.0226F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 46, 0.0F, 0.03F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.4462F, -0.696F, -1.3235F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0095F, 0.6776F, 0.0226F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 45, -1.0F, 0.03F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, -0.9565F, -1.9163F);
        this.head.addChild(eye);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.1919F, -0.4772F, -0.3943F);
        this.eye.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0773F, -0.541F, -0.02F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 39, 45, 0.0F, 0.0F, -0.4F, 1, 1, 1, -0.01F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.1919F, -0.4772F, -0.3943F);
        this.eye.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0773F, 0.541F, 0.02F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 45, -1.0F, 0.0F, -0.4F, 1, 1, 1, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.3847F, -1.3825F);
        this.neck.addChild(throat);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.1153F, 1.3825F);
        this.throat.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1047F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 36, -1.0F, -1.9F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.9063F, -0.6065F);
        this.throat.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.6283F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 44, 31, -1.0F, -1.9F, -1.0F, 2, 2, 1, -0.01F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(1.3F, 0.2F, -0.7F);
        this.chest.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, 0.0F, -0.2269F, 0.0873F);
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 35, 19, -0.1F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.leftlowerArmw = new AdvancedModelRenderer(this);
        this.leftlowerArmw.setRotationPoint(2.7F, 0.0F, 0.0F);
        this.leftUpperArm.addChild(leftlowerArmw);


        this.leftLowerArm = new AdvancedModelRenderer(this);
        this.leftLowerArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftlowerArmw.addChild(leftLowerArm);
        this.setRotateAngle(leftLowerArm, 0.3214F, 1.0215F, 0.2884F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.leftLowerArm.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 0.0873F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 0, 0.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.9F, 0.1F, 0.0F);
        this.leftLowerArm.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, -0.1047F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.3703F, 0.25F, 0.0F);
        this.leftHand.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0174F, -0.0016F, -0.0916F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 21, 4, 0.0143F, 0.1922F, -1.4965F, 3, 0, 3, 0.0F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-1.3F, 0.2F, -0.7F);
        this.chest.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, 0.0F, 0.2269F, -0.0873F);
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 0, 49, -2.9F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.rightlowerArmw = new AdvancedModelRenderer(this);
        this.rightlowerArmw.setRotationPoint(-2.7F, 0.0F, 0.0F);
        this.rightUpperArm.addChild(rightlowerArmw);


        this.rightLowerArm = new AdvancedModelRenderer(this);
        this.rightLowerArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightlowerArmw.addChild(rightLowerArm);
        this.setRotateAngle(rightLowerArm, 0.3214F, -1.0215F, -0.2884F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.rightLowerArm.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.0873F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 49, -2.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.9F, 0.35F, 0.0F);
        this.rightLowerArm.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, -0.0262F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.3772F, 0.5658F, 0.0F);
        this.rightHand.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0171F, 0.0033F, 0.192F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 17, 49, -3.0143F, -0.3997F, -1.4965F, 3, 0, 3, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.0F;
        this.root.offsetX = -0.038F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(18);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.33F;
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
    public void renderStaticWall(float f) {

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
        this.root.offsetY = 0.0F;

        EntityPrehistoricFloraPietraroiasuchus proteros = (EntityPrehistoricFloraPietraroiasuchus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
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
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraPietraroiasuchus ee = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -5.5 + (((tickAnim - 7) / 6) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (2-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 16) / 2) * (-5-(2)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5 + (((tickAnim - 18) / 2) * (0-(-5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (15.42574-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.53423-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.5422-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 15.42574 + (((tickAnim - 7) / 6) * (-12.75-(15.42574)));
            yy = 1.53423 + (((tickAnim - 7) / 6) * (0-(1.53423)));
            zz = -5.5422 + (((tickAnim - 7) / 6) * (0-(-5.5422)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -12.75 + (((tickAnim - 13) / 3) * (-23.5-(-12.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -23.5 + (((tickAnim - 16) / 2) * (-18.25-(-23.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.25 + (((tickAnim - 18) / 2) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 7) / 6) * (0-(14)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 20.25 + (((tickAnim - 16) / 2) * (0-(20.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 24.25 + (((tickAnim - 7) / 6) * (-8.5-(24.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -8.5 + (((tickAnim - 13) / 3) * (-5.5-(-8.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -5.5 + (((tickAnim - 16) / 2) * (-14.25-(-5.5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -14.25 + (((tickAnim - 18) / 2) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.01109-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.49833-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-21.08318-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.01109 + (((tickAnim - 5) / 5) * (-4.71306-(-10.01109)));
            yy = 12.49833 + (((tickAnim - 5) / 5) * (29.81401-(12.49833)));
            zz = -21.08318 + (((tickAnim - 5) / 5) * (-7.0406-(-21.08318)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.71306 + (((tickAnim - 10) / 10) * (16.12931-(-4.71306)));
            yy = 29.81401 + (((tickAnim - 10) / 10) * (-38.87936-(29.81401)));
            zz = -7.0406 + (((tickAnim - 10) / 10) * (-3.01322-(-7.0406)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 16.12931 + (((tickAnim - 20) / 5) * (-10.01109-(16.12931)));
            yy = -38.87936 + (((tickAnim - 20) / 5) * (12.49833-(-38.87936)));
            zz = -3.01322 + (((tickAnim - 20) / 5) * (-21.08318-(-3.01322)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -10.01109 + (((tickAnim - 25) / 5) * (-4.71306-(-10.01109)));
            yy = 12.49833 + (((tickAnim - 25) / 5) * (29.81401-(12.49833)));
            zz = -21.08318 + (((tickAnim - 25) / 5) * (-7.0406-(-21.08318)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -4.71306 + (((tickAnim - 30) / 10) * (16.12931-(-4.71306)));
            yy = 29.81401 + (((tickAnim - 30) / 10) * (-38.87936-(29.81401)));
            zz = -7.0406 + (((tickAnim - 30) / 10) * (-3.01322-(-7.0406)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 16.12931 + (((tickAnim - 40) / 5) * (-8.90899-(16.12931)));
            yy = -38.87936 + (((tickAnim - 40) / 5) * (-8.06399-(-38.87936)));
            zz = -3.01322 + (((tickAnim - 40) / 5) * (-16.65565-(-3.01322)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -8.90899 + (((tickAnim - 45) / 5) * (0-(-8.90899)));
            yy = -8.06399 + (((tickAnim - 45) / 5) * (0-(-8.06399)));
            zz = -16.65565 + (((tickAnim - 45) / 5) * (0-(-16.65565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23.72344-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (15.94298-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-18.54207-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 23.72344 + (((tickAnim - 5) / 5) * (24.43268-(23.72344)));
            yy = 15.94298 + (((tickAnim - 5) / 5) * (37.81174-(15.94298)));
            zz = -18.54207 + (((tickAnim - 5) / 5) * (-11.53015-(-18.54207)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.43268 + (((tickAnim - 10) / 10) * (29.25-(24.43268)));
            yy = 37.81174 + (((tickAnim - 10) / 10) * (0-(37.81174)));
            zz = -11.53015 + (((tickAnim - 10) / 10) * (-20-(-11.53015)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 29.25 + (((tickAnim - 20) / 5) * (23.72344-(29.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (15.94298-(0)));
            zz = -20 + (((tickAnim - 20) / 5) * (-18.54207-(-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.72344 + (((tickAnim - 25) / 5) * (24.43268-(23.72344)));
            yy = 15.94298 + (((tickAnim - 25) / 5) * (37.81174-(15.94298)));
            zz = -18.54207 + (((tickAnim - 25) / 5) * (-11.53015-(-18.54207)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 24.43268 + (((tickAnim - 30) / 10) * (29.25-(24.43268)));
            yy = 37.81174 + (((tickAnim - 30) / 10) * (0-(37.81174)));
            zz = -11.53015 + (((tickAnim - 30) / 10) * (-20-(-11.53015)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 29.25 + (((tickAnim - 40) / 5) * (23.72344-(29.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (15.94298-(0)));
            zz = -20 + (((tickAnim - 40) / 5) * (-18.54207-(-20)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 23.72344 + (((tickAnim - 45) / 5) * (0-(23.72344)));
            yy = 15.94298 + (((tickAnim - 45) / 5) * (0-(15.94298)));
            zz = -18.54207 + (((tickAnim - 45) / 5) * (0-(-18.54207)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.57167-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-16.59565-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (35.31039-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.57167 + (((tickAnim - 5) / 5) * (0-(20.57167)));
            yy = -16.59565 + (((tickAnim - 5) / 5) * (0-(-16.59565)));
            zz = 35.31039 + (((tickAnim - 5) / 5) * (0-(35.31039)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (47.79739-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-64.13937-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (2.22851-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 47.79739 + (((tickAnim - 20) / 5) * (20.57167-(47.79739)));
            yy = -64.13937 + (((tickAnim - 20) / 5) * (-16.59565-(-64.13937)));
            zz = 2.22851 + (((tickAnim - 20) / 5) * (35.31039-(2.22851)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20.57167 + (((tickAnim - 25) / 5) * (0-(20.57167)));
            yy = -16.59565 + (((tickAnim - 25) / 5) * (0-(-16.59565)));
            zz = 35.31039 + (((tickAnim - 25) / 5) * (0-(35.31039)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (47.79739-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-64.13937-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (2.22851-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 47.79739 + (((tickAnim - 40) / 5) * (20.57167-(47.79739)));
            yy = -64.13937 + (((tickAnim - 40) / 5) * (-16.59565-(-64.13937)));
            zz = 2.22851 + (((tickAnim - 40) / 5) * (35.31039-(2.22851)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 20.57167 + (((tickAnim - 45) / 5) * (0-(20.57167)));
            yy = -16.59565 + (((tickAnim - 45) / 5) * (0-(-16.59565)));
            zz = 35.31039 + (((tickAnim - 45) / 5) * (0-(35.31039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15 + (((tickAnim - 5) / 5) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 10) / 14) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.425 + (((tickAnim - 5) / 5) * (0-(0.425)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20 + (((tickAnim - 5) / 5) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15 + (((tickAnim - 10) / 14) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 40.5 + (((tickAnim - 5) / 3) * (0-(40.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 320;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            yy = 4 + (((tickAnim - 40) / 260) * (4-(4)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 4 + (((tickAnim - 300) / 20) * (0-(4)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.7627-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5.49365-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.26469-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = -2.7627 + (((tickAnim - 40) / 260) * (-2.7627-(-2.7627)));
            yy = 5.49365 + (((tickAnim - 40) / 260) * (5.49365-(5.49365)));
            zz = -0.26469 + (((tickAnim - 40) / 260) * (-0.26469-(-0.26469)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = -2.7627 + (((tickAnim - 300) / 20) * (0-(-2.7627)));
            yy = 5.49365 + (((tickAnim - 300) / 20) * (0-(5.49365)));
            zz = -0.26469 + (((tickAnim - 300) / 20) * (0-(-0.26469)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = -0.225 + (((tickAnim - 40) / 260) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = -0.225 + (((tickAnim - 300) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.76512-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5.99306-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.28892-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = -2.76512 + (((tickAnim - 40) / 260) * (-2.76512-(-2.76512)));
            yy = 5.99306 + (((tickAnim - 40) / 260) * (5.99306-(5.99306)));
            zz = -0.28892 + (((tickAnim - 40) / 260) * (-0.28892-(-0.28892)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = -2.76512 + (((tickAnim - 300) / 20) * (0-(-2.76512)));
            yy = 5.99306 + (((tickAnim - 300) / 20) * (0-(5.99306)));
            zz = -0.28892 + (((tickAnim - 300) / 20) * (0-(-0.28892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.05-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = -0.05 + (((tickAnim - 40) / 260) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = -0.05 + (((tickAnim - 300) / 20) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 22) * (0-(2)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            yy = 2 + (((tickAnim - 310) / 10) * (0-(2)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-17-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = -17 + (((tickAnim - 18) / 22) * (0-(-17)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 310) {
            xx = 0 + (((tickAnim - 300) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 10) * (24.5-(0)));
            zz = 0 + (((tickAnim - 300) / 10) * (0-(0)));
        }
        else if (tickAnim >= 310 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 310) / 10) * (0-(0)));
            yy = 24.5 + (((tickAnim - 310) / 10) * (0-(24.5)));
            zz = 0 + (((tickAnim - 310) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 9.75 + (((tickAnim - 40) / 260) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 9.75 + (((tickAnim - 300) / 20) * (0-(9.75)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = -19.75 + (((tickAnim - 40) / 260) * (-19.75-(-19.75)));
            yy = 8.5 + (((tickAnim - 40) / 260) * (8.5-(8.5)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = -19.75 + (((tickAnim - 300) / 20) * (0-(-19.75)));
            yy = 8.5 + (((tickAnim - 300) / 20) * (0-(8.5)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 300) {
            xx = 24 + (((tickAnim - 40) / 260) * (24-(24)));
            yy = 0 + (((tickAnim - 40) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 260) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 24 + (((tickAnim - 300) / 20) * (0-(24)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 145 && tickAnim < 160) {
            xx = 1 + (((tickAnim - 145) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 145) / 15) * (0.0175-(1)));
            zz = 1 + (((tickAnim - 145) / 15) * (1-(1)));
        }
        else if (tickAnim >= 160 && tickAnim < 288) {
            xx = 1 + (((tickAnim - 160) / 128) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 160) / 128) * (0.0175-(0.0175)));
            zz = 1 + (((tickAnim - 160) / 128) * (1-(1)));
        }
        else if (tickAnim >= 288 && tickAnim < 300) {
            xx = 1 + (((tickAnim - 288) / 12) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 288) / 12) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 288) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);



        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*0.3 + (((tickAnim - 0) / 8) * (0.68-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*0.3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.68 + (((tickAnim - 8) / 5) * (1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*1.5-(0.68)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*1.5 + (((tickAnim - 13) / 9) * (0.68-(1.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-120))*1.5)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0.68 + (((tickAnim - 22) / 5) * (0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-0.3-(0.68)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.75 + (((tickAnim - 0) / 6) * (4.85442-(15.75)));
            yy = -46.25 + (((tickAnim - 0) / 6) * (-9.19944-(-46.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (-16.14245-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 4.85442 + (((tickAnim - 6) / 7) * (-6.75392-(4.85442)));
            yy = -9.19944 + (((tickAnim - 6) / 7) * (32.8186-(-9.19944)));
            zz = -16.14245 + (((tickAnim - 6) / 7) * (-9.5217-(-16.14245)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -6.75392 + (((tickAnim - 13) / 14) * (15.75-(-6.75392)));
            yy = 32.8186 + (((tickAnim - 13) / 14) * (-46.25-(32.8186)));
            zz = -9.5217 + (((tickAnim - 13) / 14) * (0-(-9.5217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(xx), leftUpperLeg.rotateAngleY + (float) Math.toRadians(yy), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 26.85849 + (((tickAnim - 0) / 2) * (28.44808-(26.85849)));
            yy = -3.02192 + (((tickAnim - 0) / 2) * (-13.46024-(-3.02192)));
            zz = -31.0916 + (((tickAnim - 0) / 2) * (-10.58567-(-31.0916)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 28.44808 + (((tickAnim - 2) / 4) * (35.84262-(28.44808)));
            yy = -13.46024 + (((tickAnim - 2) / 4) * (26.17855-(-13.46024)));
            zz = -10.58567 + (((tickAnim - 2) / 4) * (23.6064-(-10.58567)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 35.84262 + (((tickAnim - 6) / 7) * (-12.40282-(35.84262)));
            yy = 26.17855 + (((tickAnim - 6) / 7) * (18.3105-(26.17855)));
            zz = 23.6064 + (((tickAnim - 6) / 7) * (15.8638-(23.6064)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -12.40282 + (((tickAnim - 13) / 14) * (26.85849-(-12.40282)));
            yy = 18.3105 + (((tickAnim - 13) / 14) * (-3.02192-(18.3105)));
            zz = 15.8638 + (((tickAnim - 13) / 14) * (-31.0916-(15.8638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(xx), leftLowerLeg.rotateAngleY + (float) Math.toRadians(yy), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 33.3043 + (((tickAnim - 0) / 2) * (60.73516-(33.3043)));
            yy = -15.13424 + (((tickAnim - 0) / 2) * (-19.95075-(-15.13424)));
            zz = -2.00548 + (((tickAnim - 0) / 2) * (-17.43537-(-2.00548)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 60.73516 + (((tickAnim - 2) / 4) * (2.68185-(60.73516)));
            yy = -19.95075 + (((tickAnim - 2) / 4) * (-8.02942-(-19.95075)));
            zz = -17.43537 + (((tickAnim - 2) / 4) * (-12.39782-(-17.43537)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.68185 + (((tickAnim - 6) / 4) * (-16.86531-(2.68185)));
            yy = -8.02942 + (((tickAnim - 6) / 4) * (-7.11848-(-8.02942)));
            zz = -12.39782 + (((tickAnim - 6) / 4) * (-23.40698-(-12.39782)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -16.86531 + (((tickAnim - 10) / 3) * (2.31422-(-16.86531)));
            yy = -7.11848 + (((tickAnim - 10) / 3) * (0.1233-(-7.11848)));
            zz = -23.40698 + (((tickAnim - 10) / 3) * (-9.5707-(-23.40698)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 2.31422 + (((tickAnim - 13) / 14) * (33.3043-(2.31422)));
            yy = 0.1233 + (((tickAnim - 13) / 14) * (-15.13424-(0.1233)));
            zz = -9.5707 + (((tickAnim - 13) / 14) * (-2.00548-(-9.5707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.17-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.17 + (((tickAnim - 6) / 4) * (-0.49-(-1.17)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.49 + (((tickAnim - 10) / 3) * (-0.325-(-0.49)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -0.325 + (((tickAnim - 13) / 14) * (0-(-0.325)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -6.75392 + (((tickAnim - 0) / 14) * (15.75-(-6.75392)));
            yy = -32.81864 + (((tickAnim - 0) / 14) * (46.25-(-32.81864)));
            zz = 9.52166 + (((tickAnim - 0) / 14) * (0-(9.52166)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 15.75 + (((tickAnim - 14) / 7) * (0.31296-(15.75)));
            yy = 46.25 + (((tickAnim - 14) / 7) * (3.84645-(46.25)));
            zz = 0 + (((tickAnim - 14) / 7) * (28.11416-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.31296 + (((tickAnim - 21) / 6) * (-6.75392-(0.31296)));
            yy = 3.84645 + (((tickAnim - 21) / 6) * (-32.81864-(3.84645)));
            zz = 28.11416 + (((tickAnim - 21) / 6) * (9.52166-(28.11416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(xx), rightUpperLeg.rotateAngleY + (float) Math.toRadians(yy), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -12.40282 + (((tickAnim - 0) / 14) * (26.85849-(-12.40282)));
            yy = -18.31049 + (((tickAnim - 0) / 14) * (-3.02192-(-18.31049)));
            zz = -15.86377 + (((tickAnim - 0) / 14) * (31.0916-(-15.86377)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 26.85849 + (((tickAnim - 14) / 7) * (35.84262-(26.85849)));
            yy = -3.02192 + (((tickAnim - 14) / 7) * (-26.1786-(-3.02192)));
            zz = 31.0916 + (((tickAnim - 14) / 7) * (-23.6064-(31.0916)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 35.84262 + (((tickAnim - 21) / 6) * (-12.40282-(35.84262)));
            yy = -26.1786 + (((tickAnim - 21) / 6) * (-18.31049-(-26.1786)));
            zz = -23.6064 + (((tickAnim - 21) / 6) * (-15.86377-(-23.6064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(xx), rightLowerLeg.rotateAngleY + (float) Math.toRadians(yy), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 2.31422 + (((tickAnim - 0) / 14) * (33.3043-(2.31422)));
            yy = -0.12332 + (((tickAnim - 0) / 14) * (15.1342-(-0.12332)));
            zz = 9.57066 + (((tickAnim - 0) / 14) * (2.0055-(9.57066)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 33.3043 + (((tickAnim - 14) / 2) * (60.73516-(33.3043)));
            yy = 15.1342 + (((tickAnim - 14) / 2) * (19.9508-(15.1342)));
            zz = 2.0055 + (((tickAnim - 14) / 2) * (17.4354-(2.0055)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 60.73516 + (((tickAnim - 16) / 5) * (2.68185-(60.73516)));
            yy = 19.9508 + (((tickAnim - 16) / 5) * (8.0294-(19.9508)));
            zz = 17.4354 + (((tickAnim - 16) / 5) * (12.3978-(17.4354)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 2.68185 + (((tickAnim - 21) / 6) * (2.31422-(2.68185)));
            yy = 8.0294 + (((tickAnim - 21) / 6) * (-0.12332-(8.0294)));
            zz = 12.3978 + (((tickAnim - 21) / 6) * (9.57066-(12.3978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0.325 + (((tickAnim - 0) / 14) * (0-(0.325)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (1.17-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 1.17 + (((tickAnim - 21) / 6) * (0.325-(1.17)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 4.75553 + (((tickAnim - 0) / 15) * (38.79965-(4.75553)));
            yy = 39.35462 + (((tickAnim - 0) / 15) * (-26.9158-(39.35462)));
            zz = 10.61402 + (((tickAnim - 0) / 15) * (-16.5778-(10.61402)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 38.79965 + (((tickAnim - 15) / 6) * (11.18437-(38.79965)));
            yy = -26.9158 + (((tickAnim - 15) / 6) * (2.98556-(-26.9158)));
            zz = -16.5778 + (((tickAnim - 15) / 6) * (-21.86209-(-16.5778)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 11.18437 + (((tickAnim - 21) / 6) * (4.75553-(11.18437)));
            yy = 2.98556 + (((tickAnim - 21) / 6) * (39.35462-(2.98556)));
            zz = -21.86209 + (((tickAnim - 21) / 6) * (10.61402-(-21.86209)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(xx), leftUpperArm.rotateAngleY + (float) Math.toRadians(yy), leftUpperArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*-3-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*-3 + (((tickAnim - 21) / 6) * (0-(2.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+30))*-3)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftUpperArm.rotationPointX = this.leftUpperArm.rotationPointX + (float)(xx);
        this.leftUpperArm.rotationPointY = this.leftUpperArm.rotationPointY - (float)(yy);
        this.leftUpperArm.rotationPointZ = this.leftUpperArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (-17.30276-(10)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.18028-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-50.28303-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17.30276 + (((tickAnim - 8) / 4) * (-17.86519-(-17.30276)));
            yy = 6.18028 + (((tickAnim - 8) / 4) * (1.92618-(6.18028)));
            zz = -50.28303 + (((tickAnim - 8) / 4) * (-63.37839-(-50.28303)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.86519 + (((tickAnim - 12) / 3) * (-17.93455-(-17.86519)));
            yy = 1.92618 + (((tickAnim - 12) / 3) * (3.90719-(1.92618)));
            zz = -63.37839 + (((tickAnim - 12) / 3) * (-57.45857-(-63.37839)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.93455 + (((tickAnim - 15) / 3) * (-3.62408-(-17.93455)));
            yy = 3.90719 + (((tickAnim - 15) / 3) * (-4.07788-(3.90719)));
            zz = -57.45857 + (((tickAnim - 15) / 3) * (12.89244-(-57.45857)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -3.62408 + (((tickAnim - 18) / 3) * (-0.22286-(-3.62408)));
            yy = -4.07788 + (((tickAnim - 18) / 3) * (-2.90732-(-4.07788)));
            zz = 12.89244 + (((tickAnim - 18) / 3) * (39.74006-(12.89244)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -0.22286 + (((tickAnim - 21) / 6) * (10-(-0.22286)));
            yy = -2.90732 + (((tickAnim - 21) / 6) * (0-(-2.90732)));
            zz = 39.74006 + (((tickAnim - 21) / 6) * (0-(39.74006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.18-(0)));
            yy = 0.375 + (((tickAnim - 0) / 2) * (0.58-(0.375)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.18 + (((tickAnim - 2) / 2) * (-0.36-(-0.18)));
            yy = 0.58 + (((tickAnim - 2) / 2) * (0.805-(0.58)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.36 + (((tickAnim - 4) / 2) * (-0.51-(-0.36)));
            yy = 0.805 + (((tickAnim - 4) / 2) * (0.83-(0.805)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.51 + (((tickAnim - 6) / 2) * (-0.925-(-0.51)));
            yy = 0.83 + (((tickAnim - 6) / 2) * (0.18-(0.83)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.925 + (((tickAnim - 8) / 7) * (-1.245-(-0.925)));
            yy = 0.18 + (((tickAnim - 8) / 7) * (0.18-(0.18)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.245 + (((tickAnim - 15) / 3) * (-1.1-(-1.245)));
            yy = 0.18 + (((tickAnim - 15) / 3) * (0.465-(0.18)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -1.1 + (((tickAnim - 18) / 3) * (-0.7-(-1.1)));
            yy = 0.465 + (((tickAnim - 18) / 3) * (0.555-(0.465)));
            zz = 0.3 + (((tickAnim - 18) / 3) * (-0.11-(0.3)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -0.7 + (((tickAnim - 21) / 6) * (0-(-0.7)));
            yy = 0.555 + (((tickAnim - 21) / 6) * (0.375-(0.555)));
            zz = -0.11 + (((tickAnim - 21) / 6) * (0-(-0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 38.79965 + (((tickAnim - 0) / 6) * (12.08998-(38.79965)));
            yy = 26.91584 + (((tickAnim - 0) / 6) * (-11.2199-(26.91584)));
            zz = 16.57779 + (((tickAnim - 0) / 6) * (24.91473-(16.57779)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 12.08998 + (((tickAnim - 6) / 8) * (4.75553-(12.08998)));
            yy = -11.2199 + (((tickAnim - 6) / 8) * (-39.3546-(-11.2199)));
            zz = 24.91473 + (((tickAnim - 6) / 8) * (-10.614-(24.91473)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 4.75553 + (((tickAnim - 14) / 13) * (38.79965-(4.75553)));
            yy = -39.3546 + (((tickAnim - 14) / 13) * (26.91584-(-39.3546)));
            zz = -10.614 + (((tickAnim - 14) / 13) * (16.57779-(-10.614)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(xx), rightUpperArm.rotateAngleY + (float) Math.toRadians(yy), rightUpperArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+60))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+60))*5 + (((tickAnim - 6) / 8) * (0-(-4.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+60))*5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightUpperArm.rotationPointX = this.rightUpperArm.rotationPointX + (float)(xx);
        this.rightUpperArm.rotationPointY = this.rightUpperArm.rotationPointY - (float)(yy);
        this.rightUpperArm.rotationPointZ = this.rightUpperArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -18.18484 + (((tickAnim - 0) / 3) * (0.6959-(-18.18484)));
            yy = 2.43389 + (((tickAnim - 0) / 3) * (-16.65929-(2.43389)));
            zz = 52.93581 + (((tickAnim - 0) / 3) * (-4.26178-(52.93581)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.6959 + (((tickAnim - 3) / 3) * (0.07956-(0.6959)));
            yy = -16.65929 + (((tickAnim - 3) / 3) * (-14.28445-(-16.65929)));
            zz = -4.26178 + (((tickAnim - 3) / 3) * (-11.83162-(-4.26178)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.07956 + (((tickAnim - 6) / 6) * (-7.872-(0.07956)));
            yy = -14.28445 + (((tickAnim - 6) / 6) * (-3.35405-(-14.28445)));
            zz = -11.83162 + (((tickAnim - 6) / 6) * (4.05662-(-11.83162)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -7.872 + (((tickAnim - 12) / 2) * (6.24828-(-7.872)));
            yy = -3.35405 + (((tickAnim - 12) / 2) * (0.13471-(-3.35405)));
            zz = 4.05662 + (((tickAnim - 12) / 2) * (2.00797-(4.05662)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 6.24828 + (((tickAnim - 14) / 3) * (-7.44054-(6.24828)));
            yy = 0.13471 + (((tickAnim - 14) / 3) * (-1.94833-(0.13471)));
            zz = 2.00797 + (((tickAnim - 14) / 3) * (19.29075-(2.00797)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -7.44054 + (((tickAnim - 17) / 3) * (-17.26696-(-7.44054)));
            yy = -1.94833 + (((tickAnim - 17) / 3) * (-3.32926-(-1.94833)));
            zz = 19.29075 + (((tickAnim - 17) / 3) * (41.02055-(19.29075)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -17.26696 + (((tickAnim - 20) / 4) * (-23.38337-(-17.26696)));
            yy = -3.32926 + (((tickAnim - 20) / 4) * (-4.55194-(-3.32926)));
            zz = 41.02055 + (((tickAnim - 20) / 4) * (69.56521-(41.02055)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -23.38337 + (((tickAnim - 24) / 3) * (-18.18484-(-23.38337)));
            yy = -4.55194 + (((tickAnim - 24) / 3) * (2.43389-(-4.55194)));
            zz = 69.56521 + (((tickAnim - 24) / 3) * (52.93581-(69.56521)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.245 + (((tickAnim - 0) / 3) * (1.21-(1.245)));
            yy = -0.18 + (((tickAnim - 0) / 3) * (0.28-(-0.18)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.21 + (((tickAnim - 3) / 3) * (1.075-(1.21)));
            yy = 0.28 + (((tickAnim - 3) / 3) * (0.2-(0.28)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.075 + (((tickAnim - 6) / 7) * (0.11-(1.075)));
            yy = 0.2 + (((tickAnim - 6) / 7) * (0.195-(0.2)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.11 + (((tickAnim - 13) / 1) * (0-(0.11)));
            yy = 0.195 + (((tickAnim - 13) / 1) * (0.05-(0.195)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0.11-(0)));
            yy = 0.05 + (((tickAnim - 14) / 1) * (0.21-(0.05)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0.11 + (((tickAnim - 15) / 2) * (0.33-(0.11)));
            yy = 0.21 + (((tickAnim - 15) / 2) * (0.4-(0.21)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.33 + (((tickAnim - 17) / 1) * (0.44-(0.33)));
            yy = 0.4 + (((tickAnim - 17) / 1) * (0.42-(0.4)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.44 + (((tickAnim - 18) / 1) * (0.54-(0.44)));
            yy = 0.42 + (((tickAnim - 18) / 1) * (0.56-(0.42)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0.54 + (((tickAnim - 19) / 1) * (0.7-(0.54)));
            yy = 0.56 + (((tickAnim - 19) / 1) * (0.375-(0.56)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0.7 + (((tickAnim - 20) / 1) * (0.695-(0.7)));
            yy = 0.375 + (((tickAnim - 20) / 1) * (0.26-(0.375)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0.695 + (((tickAnim - 21) / 1) * (0.585-(0.695)));
            yy = 0.26 + (((tickAnim - 21) / 1) * (0.25-(0.26)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0.585 + (((tickAnim - 22) / 1) * (0.59-(0.585)));
            yy = 0.25 + (((tickAnim - 22) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0.59 + (((tickAnim - 23) / 4) * (1.245-(0.59)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.18-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5))*-1.2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-30))*2), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(0);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(0);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(-0.25);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+50))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.25), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270))*-1), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 54.79432 + (((tickAnim - 0) / 2) * (63.58795-(54.79432)));
            yy = -33.39856 + (((tickAnim - 0) / 2) * (-21.85956-(-33.39856)));
            zz = 2.37927 + (((tickAnim - 0) / 2) * (7.26989-(2.37927)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 63.58795 + (((tickAnim - 2) / 4) * (29.42521-(63.58795)));
            yy = -21.85956 + (((tickAnim - 2) / 4) * (1.01844-(-21.85956)));
            zz = 7.26989 + (((tickAnim - 2) / 4) * (17.05112-(7.26989)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 29.42521 + (((tickAnim - 6) / 8) * (0.35403-(29.42521)));
            yy = 1.01844 + (((tickAnim - 6) / 8) * (-1.6016-(1.01844)));
            zz = 17.05112 + (((tickAnim - 6) / 8) * (7.7233-(17.05112)));
        }
        else if (tickAnim >= 14 && tickAnim < 27) {
            xx = 0.35403 + (((tickAnim - 14) / 13) * (54.79432-(0.35403)));
            yy = -1.6016 + (((tickAnim - 14) / 13) * (-33.39856-(-1.6016)));
            zz = 7.7233 + (((tickAnim - 14) / 13) * (2.37927-(7.7233)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightlowerArmw, rightlowerArmw.rotateAngleX + (float) Math.toRadians(xx), rightlowerArmw.rotateAngleY + (float) Math.toRadians(yy), rightlowerArmw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-60))*1.2), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270))*2), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270))));
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270))*0.05);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-80))*0.1);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5))*0.1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*-4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-100))*4), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270+60))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-180))*4), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-200))*-4), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (54.79432-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (33.3986-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.37927-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 54.79432 + (((tickAnim - 15) / 3) * (67.68871-(54.79432)));
            yy = 33.3986 + (((tickAnim - 15) / 3) * (19.28894-(33.3986)));
            zz = 2.37927 + (((tickAnim - 15) / 3) * (-6.32996-(2.37927)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 67.68871 + (((tickAnim - 18) / 3) * (35.86284-(67.68871)));
            yy = 19.28894 + (((tickAnim - 18) / 3) * (6.62404-(19.28894)));
            zz = -6.32996 + (((tickAnim - 18) / 3) * (-8.21833-(-6.32996)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 35.86284 + (((tickAnim - 21) / 3) * (1.11979-(35.86284)));
            yy = 6.62404 + (((tickAnim - 21) / 3) * (2.83887-(6.62404)));
            zz = -8.21833 + (((tickAnim - 21) / 3) * (-3.52214-(-8.21833)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1.11979 + (((tickAnim - 24) / 3) * (0-(1.11979)));
            yy = 2.83887 + (((tickAnim - 24) / 3) * (0-(2.83887)));
            zz = -3.52214 + (((tickAnim - 24) / 3) * (0-(-3.52214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlowerArmw, leftlowerArmw.rotateAngleX + (float) Math.toRadians(xx), leftlowerArmw.rotateAngleY + (float) Math.toRadians(yy), leftlowerArmw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270-50))*-2));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*270/0.5-50))*0.02);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(46.4611), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-48.4232+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(50.19024));


        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(19.25), leftLowerLeg.rotateAngleY + (float) Math.toRadians(0), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(-25.75));


        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(5.97985), leftFoot.rotateAngleY + (float) Math.toRadians(-51.76706), leftFoot.rotateAngleZ + (float) Math.toRadians(42.40224));


        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(44.45794), rightUpperLeg.rotateAngleY + (float) Math.toRadians(50.1437+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-52.86318));


        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(19.25), rightLowerLeg.rotateAngleY + (float) Math.toRadians(0), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(25.75));


        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(5.97985), rightFoot.rotateAngleY + (float) Math.toRadians(51.7671), rightFoot.rotateAngleZ + (float) Math.toRadians(-42.4022));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+220))*3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+350))*-3), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(78), leftUpperArm.rotateAngleY + (float) Math.toRadians(-41.5), leftUpperArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));


        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(-8.75), leftLowerArm.rotateAngleY + (float) Math.toRadians(-42), leftLowerArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(33.75));
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(0);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(0.25);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(0);


        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(78), rightUpperArm.rotateAngleY + (float) Math.toRadians(41.5), rightUpperArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4));


        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(-8.75), rightLowerArm.rotateAngleY + (float) Math.toRadians(42), rightLowerArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-33.75));
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(0);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(0.25);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(0);


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*4), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1.5));
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-0.4);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(0);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(0);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(0);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(-0.125);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*25), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*30), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*3), chest.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPietraroiasuchus entity = (EntityPrehistoricFloraPietraroiasuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(leftUpperLeg, leftUpperLeg.rotateAngleX + (float) Math.toRadians(43.13543), leftUpperLeg.rotateAngleY + (float) Math.toRadians(-51.7971+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), leftUpperLeg.rotateAngleZ + (float) Math.toRadians(55.15776));


        this.setRotateAngle(leftLowerLeg, leftLowerLeg.rotateAngleX + (float) Math.toRadians(19.25), leftLowerLeg.rotateAngleY + (float) Math.toRadians(0), leftLowerLeg.rotateAngleZ + (float) Math.toRadians(-25.75));


        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(5.97985), leftFoot.rotateAngleY + (float) Math.toRadians(-51.76706), leftFoot.rotateAngleZ + (float) Math.toRadians(42.40224));


        this.setRotateAngle(rightUpperLeg, rightUpperLeg.rotateAngleX + (float) Math.toRadians(43.13543), rightUpperLeg.rotateAngleY + (float) Math.toRadians(51.7971+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), rightUpperLeg.rotateAngleZ + (float) Math.toRadians(-55.1578));


        this.setRotateAngle(rightLowerLeg, rightLowerLeg.rotateAngleX + (float) Math.toRadians(19.25), rightLowerLeg.rotateAngleY + (float) Math.toRadians(0), rightLowerLeg.rotateAngleZ + (float) Math.toRadians(25.75));


        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(5.97985), rightFoot.rotateAngleY + (float) Math.toRadians(51.7671), rightFoot.rotateAngleZ + (float) Math.toRadians(-42.4022));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+220))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-7.25), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+350))*-1), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftUpperArm, leftUpperArm.rotateAngleX + (float) Math.toRadians(78), leftUpperArm.rotateAngleY + (float) Math.toRadians(-41.5), leftUpperArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));


        this.setRotateAngle(leftLowerArm, leftLowerArm.rotateAngleX + (float) Math.toRadians(-8.75), leftLowerArm.rotateAngleY + (float) Math.toRadians(-42), leftLowerArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(0), leftHand.rotateAngleY + (float) Math.toRadians(0), leftHand.rotateAngleZ + (float) Math.toRadians(33.75));
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(0);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(0.25);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(0);


        this.setRotateAngle(rightUpperArm, rightUpperArm.rotateAngleX + (float) Math.toRadians(78), rightUpperArm.rotateAngleY + (float) Math.toRadians(41.5), rightUpperArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1));


        this.setRotateAngle(rightLowerArm, rightLowerArm.rotateAngleX + (float) Math.toRadians(-8.75), rightLowerArm.rotateAngleY + (float) Math.toRadians(42), rightLowerArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(0), rightHand.rotateAngleY + (float) Math.toRadians(0), rightHand.rotateAngleZ + (float) Math.toRadians(-33.75));
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(0);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(0.25);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(0);


        this.setRotateAngle(pelvis, pelvis.rotateAngleX + (float) Math.toRadians(0), pelvis.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), pelvis.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.5));
        this.pelvis.rotationPointX = this.pelvis.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.07);
        this.pelvis.rotationPointY = this.pelvis.rotationPointY - (float)(0);
        this.pelvis.rotationPointZ = this.pelvis.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(0);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(0);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(-0.125);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*8), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(-0.125);


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*16), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*20), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*1), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*1), chest.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPietraroiasuchus e = (EntityPrehistoricFloraPietraroiasuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);

    }
}
