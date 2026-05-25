package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLaganosuchus;
import net.lepidodendron.entity.EntityPrehistoricFloraSusisuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLaganosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer throatPouch;
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

    private ModelAnimator animator;

    public ModelLaganosuchus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.0F, 4.0F);
        this.setRotateAngle(main, -0.0873F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 18, -3.0F, -2.25F, -3.75F, 6, 5, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 80, 2.0F, -2.75F, -2.0F, 0, 1, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 18, 80, -2.0F, -2.75F, -2.0F, 0, 1, 3, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.75F, 0.65F, 0.0F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.5061F, -0.9948F, -0.6632F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 65, 62, -1.5F, -1.0F, -1.25F, 3, 5, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.5708F, 0.4189F, 1.5882F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 73, 9, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.3491F, -0.6981F, 0.2182F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 71, 41, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 71, 30, -2.0F, -0.5F, -2.0F, 4, 1, 2, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-2.75F, 0.65F, 0.0F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.5061F, 0.9948F, 0.6632F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 65, 62, -1.5F, -1.0F, -1.25F, 3, 5, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.5708F, -0.4189F, -1.5882F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 73, 9, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.3491F, 0.6981F, -0.2182F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 71, 41, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 71, 30, -2.0F, -0.5F, -2.0F, 4, 1, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.3F, 1.75F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 30, -2.5F, -0.75F, -0.5F, 5, 4, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 49, 71, 1.5F, -1.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 49, 71, -1.5F, -1.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.tail.cubeList.add(new ModelBox(tail, 46, 42, -2.5F, 2.75F, -0.5F, 5, 1, 7, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 42, -2.0F, -1.25F, -0.5F, 4, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 71, 1.0F, -1.75F, 0.0F, 0, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 60, 71, -1.0F, -1.75F, 0.0F, 0, 1, 5, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2182F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 23, -1.5F, -1.25F, -0.25F, 3, 3, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 71, 71, 0.5F, -2.25F, 0.0F, 0, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 71, 71, -0.5F, -2.25F, 0.0F, 0, 1, 5, 0.0F, true));
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 62, -1.5F, 1.25F, -0.25F, 3, 1, 7, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 6.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 21, 65, -1.0F, -0.9F, -0.25F, 2, 3, 6, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 66, 0.0F, -2.9F, -0.25F, 0, 2, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.75F, 5.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 9, 75, -0.5F, -0.9F, -0.25F, 1, 2, 3, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 67, 51, -0.025F, -2.9F, -0.25F, 0, 4, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -3.25F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -1.75F, -10.5F, 8, 6, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 42, 2.5F, -2.25F, -10.5F, 0, 1, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 42, -2.5F, -2.25F, -10.5F, 0, 1, 11, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 25, 18, -3.0F, -1.5F, -5.5F, 6, 5, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 75, 78, 2.0F, -2.0F, -4.0F, 0, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 75, 78, -2.0F, -2.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.0F, 2.0F, -3.0F);
        this.body2.addChild(leftArm);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.025F, 0.3F);
        this.leftArm.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2445F, 0.769F, -0.0511F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 66, -1.0F, -1.03F, -1.0F, 1, 4, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.leftArm.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2331F, 0.7821F, -0.0671F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 16, -1.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.0F, 0.5F, 2.25F);
        this.leftArm.addChild(leftArm2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.425F, 0.95F, 0.125F);
        this.leftArm2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6003F, -0.7972F, 0.1384F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 61, 78, -1.0F, -1.0F, -1.0F, 2, 4, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.125F, 0.7F, -0.15F);
        this.leftArm2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6003F, -0.7972F, 0.1384F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 55, -1.0F, -0.98F, -1.0F, 2, 4, 1, -0.006F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.9386F, 2.9853F, -1.1875F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4238F, 0.9774F, -0.5158F);
        this.leftArm3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1332F, -0.0137F, -0.0467F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 34, -1.0F, -1.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.0F, 2.0F, -3.0F);
        this.body2.addChild(rightArm);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.025F, 0.3F);
        this.rightArm.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.2445F, -0.769F, 0.0511F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 66, 0.0F, -1.03F, -1.0F, 1, 4, 2, -0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.rightArm.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2331F, -0.7821F, 0.0671F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 16, -1.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.0F, 0.5F, 2.25F);
        this.rightArm.addChild(rightArm2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.425F, 0.95F, 0.125F);
        this.rightArm2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6003F, 0.7972F, -0.1384F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 78, -1.0F, -1.0F, -1.0F, 2, 4, 1, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.125F, 0.7F, -0.15F);
        this.rightArm2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6003F, 0.7972F, -0.1384F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 55, -1.0F, -0.98F, -1.0F, 2, 4, 1, -0.006F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.9386F, 2.9853F, -1.1875F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.4238F, 0.9774F, -0.5158F);
        this.rightArm3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1332F, 0.0137F, 0.0467F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 34, -2.0F, -1.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1F, -5.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 46, 51, -2.0F, -1.5F, -4.75F, 4, 4, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 28, 1, -2.0F, 2.0F, -4.75F, 4, 1, 6, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 68, 78, 1.0F, -2.0F, -3.5F, 0, 1, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 68, 78, -1.0F, -2.0F, -3.5F, 0, 1, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.65F, -4.25F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 71, 23, -1.5F, -0.75F, -2.0F, 3, 4, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 78, -1.0F, -0.75F, -4.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.5319F, -9.9952F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0435F, 0.0038F, 0.0872F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 80, 0.0F, -0.75F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 0.4447F, -11.9933F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0504F, -0.523F, 0.0252F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 65, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.15F, -0.65F, -2.75F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0852F, -0.1546F, 0.4417F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 82, 9, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.3779F, 0.7938F, -3.9972F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0697F, -0.061F, 0.0027F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 12, 0.1F, -0.75F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.1337F, 0.6196F, -7.986F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0489F, -0.057F, 0.09F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 66, 0.0F, -0.75F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 0.8809F, -2.0029F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0437F, -0.061F, 0.0027F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 54, 0.0F, -1.0F, -9.0F, 1, 1, 9, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.4447F, -11.9933F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0504F, 0.523F, -0.0252F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 65, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.4447F, -11.9933F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 40, -1.0F, -0.75F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.4447F, -11.9933F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 9, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.3779F, 0.7938F, -3.9972F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0697F, 0.061F, -0.0027F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 12, -2.1F, -0.75F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.1337F, 0.6196F, -7.986F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0489F, 0.057F, -0.09F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 78, 66, 0.0F, -0.75F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, 0.8809F, -2.0029F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0437F, 0.061F, -0.0027F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 54, -1.0F, -1.0F, -9.0F, 1, 1, 9, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.5319F, -9.9952F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0435F, -0.0038F, -0.0872F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 80, 0.0F, -0.75F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 0.75F, -5.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 30, -2.0F, -1.0F, -6.15F, 2, 1, 10, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, -0.75F, -4.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 71, 46, -1.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.15F, -0.65F, -2.75F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0852F, 0.1546F, -0.4417F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 82, 9, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.75F, -0.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 0, -1.5F, 0.0F, -10.35F, 2, 1, 10, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 68, -1.0F, 0.0F, -11.2F, 1, 1, 1, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 0.0F, -11.2F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.5149F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 80, 46, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.4506F, 0.0F, -10.1332F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.4102F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 69, 9, 0.05F, -0.25F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.0F, 0.0F, -1.15F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.0611F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 38, 71, 0.05F, -0.25F, -8.0F, 0, 1, 5, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 55, 0.0F, 0.0F, -9.0F, 1, 1, 9, -0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, -11.2F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.5149F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 80, 46, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.8604F, 1.7429F, -2.7149F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.0436F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 78, 51, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.8604F, 1.7429F, -2.7149F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0436F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 78, 51, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.7476F, 0.9776F, -4.5592F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3927F, -0.0611F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 45, 78, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.7476F, 0.9776F, -4.5592F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3927F, 0.0611F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 45, 78, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.4506F, 0.0F, -10.1332F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.4102F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 69, 9, -0.05F, -0.25F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0F, 0.0F, -1.15F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0611F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 38, 71, -0.05F, -0.25F, -8.0F, 0, 1, 5, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 55, -1.0F, 0.0F, -9.0F, 1, 1, 9, -0.01F, false));

        this.throatPouch = new AdvancedModelRenderer(this);
        this.throatPouch.setRotationPoint(-0.5F, 0.25F, -11.2F);
        this.jaw.addChild(throatPouch);
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 50, 12, -1.0F, 0.0F, 0.85F, 2, 1, 9, -0.01F, false));
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 0, 81, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.02F, false));
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 0, 75, -0.5F, 1.408F, 7.4615F, 1, 2, 3, 0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, 2.724F, 12.3409F);
        this.throatPouch.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.829F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 78, 61, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 3.408F, 10.4615F);
        this.throatPouch.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3491F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 54, 78, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 2.5423F, 3.5563F);
        this.throatPouch.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.2182F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 65, 34, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, 1.5162F, 0.7372F);
        this.throatPouch.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3491F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 18, 75, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 25, 80, -1.0F, -1.75F, 1.0F, 1, 1, 2, -0.02F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.throatPouch.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.6109F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 10, 81, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.throatPouch.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.5149F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 5, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.03F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.throatPouch.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.5149F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 5, 81, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.03F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0F, 2.0749F, 9.6834F);
        this.throatPouch.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4363F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 76, 34, -2.0F, -2.0F, 0.0F, 2, 2, 2, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0F, 1.9006F, 7.691F);
        this.throatPouch.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0873F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 27, 75, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.0F, 1.0F, 0.85F);
        this.throatPouch.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1309F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 64, 0, -2.0F, -1.0F, 0.0F, 2, 1, 7, -0.02F, false));

        throatPouch.scaleChildren = true;

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
        this.main.offsetY = -1.0F;
        this.main.offsetX = -0.038F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(18);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.33F;
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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraLaganosuchus proteros = (EntityPrehistoricFloraLaganosuchus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
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
        this.throatPouch.setScale(1,1,1);
        EntityPrehistoricFloraLaganosuchus ee = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.16377-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.94969-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.33387-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 12.16377 + (((tickAnim - 5) / 4) * (16.84014-(12.16377)));
            yy = -7.94969 + (((tickAnim - 5) / 4) * (-8.51315-(-7.94969)));
            zz = -0.33387 + (((tickAnim - 5) / 4) * (-3.31117-(-0.33387)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 16.84014 + (((tickAnim - 9) / 7) * (-10.25-(16.84014)));
            yy = -8.51315 + (((tickAnim - 9) / 7) * (0-(-8.51315)));
            zz = -3.31117 + (((tickAnim - 9) / 7) * (0-(-3.31117)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.25 + (((tickAnim - 16) / 3) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.25 + (((tickAnim - 19) / 4) * (-10.19686-(-10.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (-1.53568-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-3.96333-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.19686 + (((tickAnim - 23) / 4) * (-15.84843-(-10.19686)));
            yy = -1.53568 + (((tickAnim - 23) / 4) * (-0.76784-(-1.53568)));
            zz = -3.96333 + (((tickAnim - 23) / 4) * (-1.98166-(-3.96333)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -15.84843 + (((tickAnim - 27) / 3) * (-15.34843-(-15.84843)));
            yy = -0.76784 + (((tickAnim - 27) / 3) * (-0.76784-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 27) / 3) * (-1.98166-(-1.98166)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -15.34843 + (((tickAnim - 30) / 5) * (0-(-15.34843)));
            yy = -0.76784 + (((tickAnim - 30) / 5) * (0-(-0.76784)));
            zz = -1.98166 + (((tickAnim - 30) / 5) * (0-(-1.98166)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.89347-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.03535-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75415-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.89347 + (((tickAnim - 5) / 4) * (11.48596-(4.89347)));
            yy = 14.03535 + (((tickAnim - 5) / 4) * (17.04317-(14.03535)));
            zz = -2.75415 + (((tickAnim - 5) / 4) * (-1.4762-(-2.75415)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 11.48596 + (((tickAnim - 9) / 3) * (13.28126-(11.48596)));
            yy = 17.04317 + (((tickAnim - 9) / 3) * (9.94947-(17.04317)));
            zz = -1.4762 + (((tickAnim - 9) / 3) * (-5.56616-(-1.4762)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 13.28126 + (((tickAnim - 12) / 2) * (-8.78697-(13.28126)));
            yy = 9.94947 + (((tickAnim - 12) / 2) * (7.5849-(9.94947)));
            zz = -5.56616 + (((tickAnim - 12) / 2) * (-6.92949-(-5.56616)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -8.78697 + (((tickAnim - 14) / 4) * (1-(-8.78697)));
            yy = 7.5849 + (((tickAnim - 14) / 4) * (0-(7.5849)));
            zz = -6.92949 + (((tickAnim - 14) / 4) * (0-(-6.92949)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (-19.98527-(1)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.37617-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-4.48428-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.98527 + (((tickAnim - 23) / 4) * (-0.24264-(-19.98527)));
            yy = -0.37617 + (((tickAnim - 23) / 4) * (-0.18808-(-0.37617)));
            zz = -4.48428 + (((tickAnim - 23) / 4) * (-2.24214-(-4.48428)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.24264 + (((tickAnim - 27) / 3) * (-0.24264-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 27) / 3) * (-0.18808-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 27) / 3) * (-2.24214-(-2.24214)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.24264 + (((tickAnim - 30) / 5) * (0-(-0.24264)));
            yy = -0.18808 + (((tickAnim - 30) / 5) * (0-(-0.18808)));
            zz = -2.24214 + (((tickAnim - 30) / 5) * (0-(-2.24214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 5) / 4) * (0-(17)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (19.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 14) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 19.5 + (((tickAnim - 22) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 0.7 + (((tickAnim - 0) / 9) * (0.5-(0.7)));
            zz = 1 + (((tickAnim - 0) / 9) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 9) / 3) * (1-(1)));
            yy = 0.5 + (((tickAnim - 9) / 3) * (0.5-(0.5)));
            zz = 1 + (((tickAnim - 9) / 3) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (1-(1)));
            yy = 0.5 + (((tickAnim - 12) / 3) * (0.8-(0.5)));
            zz = 1 + (((tickAnim - 12) / 3) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.8 + (((tickAnim - 15) / 3) * (0.825-(0.8)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 1 + (((tickAnim - 18) / 4) * (1-(1)));
            yy = 0.825 + (((tickAnim - 18) / 4) * (1.0475-(0.825)));
            zz = 1 + (((tickAnim - 18) / 4) * (1-(1)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 22) / 7) * (1-(1)));
            yy = 1.0475 + (((tickAnim - 22) / 7) * (0.9725-(1.0475)));
            zz = 1 + (((tickAnim - 22) / 7) * (1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 29) / 6) * (1-(1)));
            yy = 0.9725 + (((tickAnim - 29) / 6) * (0.7-(0.9725)));
            zz = 1 + (((tickAnim - 29) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);
       

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 20) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 20) / 6) * (14-(12)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (0.6175-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 1 + (((tickAnim - 20) / 6) * (1-(1)));
            yy = 0.6175 + (((tickAnim - 20) / 6) * (0.6175-(0.6175)));
            zz = 1 + (((tickAnim - 20) / 6) * (1-(1)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 26) / 9) * (1-(1)));
            yy = 0.6175 + (((tickAnim - 26) / 9) * (1-(0.6175)));
            zz = 1 + (((tickAnim - 26) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (56.64081-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (39.37534-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-39.8579-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 56.64081 + (((tickAnim - 20) / 18) * (-19.72302-(56.64081)));
            yy = 39.37534 + (((tickAnim - 20) / 18) * (15.31263-(39.37534)));
            zz = -39.8579 + (((tickAnim - 20) / 18) * (-15.5003-(-39.8579)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -19.72302 + (((tickAnim - 38) / 12) * (0-(-19.72302)));
            yy = 15.31263 + (((tickAnim - 38) / 12) * (0-(15.31263)));
            zz = -15.5003 + (((tickAnim - 38) / 12) * (0-(-15.5003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.93664-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.24841-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.20001-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0.93664 + (((tickAnim - 20) / 18) * (0.92762-(0.93664)));
            yy = -11.24841 + (((tickAnim - 20) / 18) * (-33.99547-(-11.24841)));
            zz = -0.20001 + (((tickAnim - 20) / 18) * (-0.56779-(-0.20001)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.92762 + (((tickAnim - 38) / 12) * (0-(0.92762)));
            yy = -33.99547 + (((tickAnim - 38) / 12) * (0-(-33.99547)));
            zz = -0.56779 + (((tickAnim - 38) / 12) * (0-(-0.56779)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-41.53821-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-11.52477-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (41.50497-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -41.53821 + (((tickAnim - 10) / 10) * (43.5-(-41.53821)));
            yy = -11.52477 + (((tickAnim - 10) / 10) * (0-(-11.52477)));
            zz = 41.50497 + (((tickAnim - 10) / 10) * (0-(41.50497)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 43.5 + (((tickAnim - 20) / 18) * (96.49295-(43.5)));
            yy = 0 + (((tickAnim - 20) / 18) * (-29.34408-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (-34.56985-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 96.49295 + (((tickAnim - 38) / 12) * (0-(96.49295)));
            yy = -29.34408 + (((tickAnim - 38) / 12) * (0-(-29.34408)));
            zz = -34.56985 + (((tickAnim - 38) / 12) * (0-(-34.56985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (1.325-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.325 + (((tickAnim - 38) / 12) * (0-(1.325)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -29.25 + (((tickAnim - 20) / 8) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-2.4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -2.4 + (((tickAnim - 18) / 10) * (-2.4-(-2.4)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -2.4 + (((tickAnim - 28) / 22) * (0-(-2.4)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 18) / 10) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -34.75 + (((tickAnim - 28) / 22) * (0-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (36.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 36.5 + (((tickAnim - 18) / 10) * (36.5-(36.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 36.5 + (((tickAnim - 28) / 22) * (0-(36.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-34.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -34.75 + (((tickAnim - 18) / 10) * (-34.75-(-34.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -34.75 + (((tickAnim - 28) / 22) * (0-(-34.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-36.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -36.5 + (((tickAnim - 18) / 10) * (-36.5-(-36.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -36.5 + (((tickAnim - 28) / 22) * (0-(-36.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10.5 + (((tickAnim - 18) / 10) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 28) / 22) * (0-(10.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -11.25 + (((tickAnim - 18) / 10) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 28) / 22) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 10 + (((tickAnim - 18) / 10) * (10-(10)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 28) / 22) * (0-(10)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 18) / 10) * (-17-(-17)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 28) / 22) * (0-(-17)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-32.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -32.25 + (((tickAnim - 18) / 10) * (-32.25-(-32.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -32.25 + (((tickAnim - 28) / 22) * (0-(-32.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (33.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 33.75 + (((tickAnim - 18) / 10) * (33.75-(33.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 33.75 + (((tickAnim - 28) / 22) * (0-(33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (32.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 32.25 + (((tickAnim - 18) / 10) * (32.25-(32.25)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 32.25 + (((tickAnim - 28) / 22) * (0-(32.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-33.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = -33.75 + (((tickAnim - 18) / 10) * (-33.75-(-33.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = -33.75 + (((tickAnim - 28) / 22) * (0-(-33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 560;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 560) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 560) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.075-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = -3.075 + (((tickAnim - 30) / 270) * (-3.075-(-3.075)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = -3.075 + (((tickAnim - 300) / 235) * (-3.075-(-3.075)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = -3.075 + (((tickAnim - 535) / 25) * (0-(-3.075)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -40.25 + (((tickAnim - 30) / 270) * (-40.25-(-40.25)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -40.25 + (((tickAnim - 300) / 235) * (-40.25-(-40.25)));
            yy = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -40.25 + (((tickAnim - 535) / 25) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.05662-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-25.9823-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.76328-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 2.05662 + (((tickAnim - 30) / 270) * (2.05662-(2.05662)));
            yy = -25.9823 + (((tickAnim - 30) / 270) * (-25.9823-(-25.9823)));
            zz = 1.76328 + (((tickAnim - 30) / 270) * (1.76328-(1.76328)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 2.05662 + (((tickAnim - 300) / 235) * (2.05662-(2.05662)));
            yy = -25.9823 + (((tickAnim - 300) / 235) * (-25.9823-(-25.9823)));
            zz = 1.76328 + (((tickAnim - 300) / 235) * (1.76328-(1.76328)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 2.05662 + (((tickAnim - 535) / 25) * (0-(2.05662)));
            yy = -25.9823 + (((tickAnim - 535) / 25) * (0-(-25.9823)));
            zz = 1.76328 + (((tickAnim - 535) / 25) * (0-(1.76328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1.20928-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (10.30214-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (8.18763-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 1.20928 + (((tickAnim - 30) / 270) * (1.20928-(1.20928)));
            yy = 10.30214 + (((tickAnim - 30) / 270) * (10.30214-(10.30214)));
            zz = 8.18763 + (((tickAnim - 30) / 270) * (8.18763-(8.18763)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 1.20928 + (((tickAnim - 300) / 235) * (1.20928-(1.20928)));
            yy = 10.30214 + (((tickAnim - 300) / 235) * (10.30214-(10.30214)));
            zz = 8.18763 + (((tickAnim - 300) / 235) * (8.18763-(8.18763)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 1.20928 + (((tickAnim - 535) / 25) * (0-(1.20928)));
            yy = 10.30214 + (((tickAnim - 535) / 25) * (0-(10.30214)));
            zz = 8.18763 + (((tickAnim - 535) / 25) * (0-(8.18763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 270) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 0.55 + (((tickAnim - 300) / 235) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0.55 + (((tickAnim - 535) / 25) * (0-(0.55)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -40.25 + (((tickAnim - 30) / 270) * (-40.25-(-40.25)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -40.25 + (((tickAnim - 300) / 235) * (-40.25-(-40.25)));
            yy = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -40.25 + (((tickAnim - 535) / 25) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.05662-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (25.9823-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.76328-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 2.05662 + (((tickAnim - 30) / 270) * (2.05662-(2.05662)));
            yy = 25.9823 + (((tickAnim - 30) / 270) * (25.9823-(25.9823)));
            zz = -1.76328 + (((tickAnim - 30) / 270) * (-1.76328-(-1.76328)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 2.05662 + (((tickAnim - 300) / 235) * (2.05662-(2.05662)));
            yy = 25.9823 + (((tickAnim - 300) / 235) * (25.9823-(25.9823)));
            zz = -1.76328 + (((tickAnim - 300) / 235) * (-1.76328-(-1.76328)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 2.05662 + (((tickAnim - 535) / 25) * (0-(2.05662)));
            yy = 25.9823 + (((tickAnim - 535) / 25) * (0-(25.9823)));
            zz = -1.76328 + (((tickAnim - 535) / 25) * (0-(-1.76328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1.20928-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-10.30214-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-8.18763-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 1.20928 + (((tickAnim - 30) / 270) * (1.20928-(1.20928)));
            yy = -10.30214 + (((tickAnim - 30) / 270) * (-10.30214-(-10.30214)));
            zz = -8.18763 + (((tickAnim - 30) / 270) * (-8.18763-(-8.18763)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 1.20928 + (((tickAnim - 300) / 235) * (1.20928-(1.20928)));
            yy = -10.30214 + (((tickAnim - 300) / 235) * (-10.30214-(-10.30214)));
            zz = -8.18763 + (((tickAnim - 300) / 235) * (-8.18763-(-8.18763)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 1.20928 + (((tickAnim - 535) / 25) * (0-(1.20928)));
            yy = -10.30214 + (((tickAnim - 535) / 25) * (0-(-10.30214)));
            zz = -8.18763 + (((tickAnim - 535) / 25) * (0-(-8.18763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 270) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 0.55 + (((tickAnim - 300) / 235) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0.55 + (((tickAnim - 535) / 25) * (0-(0.55)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 13.5 + (((tickAnim - 30) / 270) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 13.5 + (((tickAnim - 300) / 235) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 13.5 + (((tickAnim - 535) / 25) * (0-(13.5)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (8-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 8 + (((tickAnim - 30) / 270) * (8-(8)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 8 + (((tickAnim - 300) / 235) * (8-(8)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 8 + (((tickAnim - 535) / 25) * (0-(8)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-11.99445-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (8.49967-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.07472-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -11.99445 + (((tickAnim - 30) / 270) * (-11.99445-(-11.99445)));
            yy = 8.49967 + (((tickAnim - 30) / 270) * (8.49967-(8.49967)));
            zz = 0.07472 + (((tickAnim - 30) / 270) * (0.07472-(0.07472)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -11.99445 + (((tickAnim - 300) / 235) * (-11.99445-(-11.99445)));
            yy = 8.49967 + (((tickAnim - 300) / 235) * (8.49967-(8.49967)));
            zz = 0.07472 + (((tickAnim - 300) / 235) * (0.07472-(0.07472)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -11.99445 + (((tickAnim - 535) / 25) * (0-(-11.99445)));
            yy = 8.49967 + (((tickAnim - 535) / 25) * (0-(8.49967)));
            zz = 0.07472 + (((tickAnim - 535) / 25) * (0-(0.07472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 4.25 + (((tickAnim - 30) / 270) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 4.25 + (((tickAnim - 300) / 235) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 4.25 + (((tickAnim - 535) / 25) * (0-(4.25)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.51246-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (8.99862-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.15838-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -3.51246 + (((tickAnim - 30) / 270) * (-3.51246-(-3.51246)));
            yy = 8.99862 + (((tickAnim - 30) / 270) * (8.99862-(8.99862)));
            zz = -0.15838 + (((tickAnim - 30) / 270) * (-0.15838-(-0.15838)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -3.51246 + (((tickAnim - 300) / 235) * (-3.51246-(-3.51246)));
            yy = 8.99862 + (((tickAnim - 300) / 235) * (8.99862-(8.99862)));
            zz = -0.15838 + (((tickAnim - 300) / 235) * (-0.15838-(-0.15838)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -3.51246 + (((tickAnim - 535) / 25) * (0-(-3.51246)));
            yy = 8.99862 + (((tickAnim - 535) / 25) * (0-(8.99862)));
            zz = -0.15838 + (((tickAnim - 535) / 25) * (0-(-0.15838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -3.5 + (((tickAnim - 30) / 270) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -3.5 + (((tickAnim - 300) / 235) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -3.5 + (((tickAnim - 535) / 25) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 3.5 + (((tickAnim - 30) / 270) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 3.5 + (((tickAnim - 300) / 235) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 3.5 + (((tickAnim - 535) / 25) * (0-(3.5)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 21.5 + (((tickAnim - 15) / 15) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 21.5 + (((tickAnim - 30) / 270) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 21.5 + (((tickAnim - 300) / 20) * (25.25-(21.5)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 535) {
            xx = 25.25 + (((tickAnim - 320) / 215) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 215) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 25.25 + (((tickAnim - 535) / 25) * (0-(25.25)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -33.75 + (((tickAnim - 30) / 270) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = -33.75 + (((tickAnim - 300) / 20) * (-15.75-(-33.75)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 535) {
            xx = -15.75 + (((tickAnim - 320) / 215) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 215) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 540) {
            xx = -15.75 + (((tickAnim - 535) / 5) * (-6.85-(-15.75)));
            yy = 0 + (((tickAnim - 535) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 5) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 560) {
            xx = -6.85 + (((tickAnim - 540) / 20) * (0-(-6.85)));
            yy = 0 + (((tickAnim - 540) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.425-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0.425 + (((tickAnim - 30) / 270) * (0.425-(0.425)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0.425 + (((tickAnim - 300) / 20) * (0.425-(0.425)));
        }
        else if (tickAnim >= 320 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            zz = 0.425 + (((tickAnim - 320) / 215) * (0.425-(0.425)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0.425 + (((tickAnim - 535) / 25) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 25 + (((tickAnim - 30) / 270) * (25-(25)));
            yy = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 25 + (((tickAnim - 300) / 20) * (0-(25)));
            yy = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 215) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 215) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 0) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 30) * (0.6-(1)));
            zz = 1 + (((tickAnim - 0) / 30) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 1 + (((tickAnim - 30) / 270) * (1-(1)));
            yy = 0.6 + (((tickAnim - 30) / 270) * (0.6-(0.6)));
            zz = 1 + (((tickAnim - 30) / 270) * (1-(1)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 1 + (((tickAnim - 300) / 235) * (1-(1)));
            yy = 0.6 + (((tickAnim - 300) / 235) * (0.6-(0.6)));
            zz = 1 + (((tickAnim - 300) / 235) * (1-(1)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 1 + (((tickAnim - 535) / 25) * (1-(1)));
            yy = 0.6 + (((tickAnim - 535) / 25) * (1-(0.6)));
            zz = 1 + (((tickAnim - 535) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-12.64822-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (21.15736-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-31.87148-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -12.64822 + (((tickAnim - 30) / 270) * (-12.64822-(-12.64822)));
            yy = 21.15736 + (((tickAnim - 30) / 270) * (21.15736-(21.15736)));
            zz = -31.87148 + (((tickAnim - 30) / 270) * (-31.87148-(-31.87148)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -12.64822 + (((tickAnim - 300) / 235) * (-12.64822-(-12.64822)));
            yy = 21.15736 + (((tickAnim - 300) / 235) * (21.15736-(21.15736)));
            zz = -31.87148 + (((tickAnim - 300) / 235) * (-31.87148-(-31.87148)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -12.64822 + (((tickAnim - 535) / 25) * (0-(-12.64822)));
            yy = 21.15736 + (((tickAnim - 535) / 25) * (0-(21.15736)));
            zz = -31.87148 + (((tickAnim - 535) / 25) * (0-(-31.87148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-29.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (30.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = -29.5 + (((tickAnim - 30) / 270) * (-29.5-(-29.5)));
            zz = 30.75 + (((tickAnim - 30) / 270) * (30.75-(30.75)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = -29.5 + (((tickAnim - 300) / 235) * (-29.5-(-29.5)));
            zz = 30.75 + (((tickAnim - 300) / 235) * (30.75-(30.75)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = -29.5 + (((tickAnim - 535) / 25) * (0-(-29.5)));
            zz = 30.75 + (((tickAnim - 535) / 25) * (0-(30.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 270) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 0.825 + (((tickAnim - 300) / 235) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0.825 + (((tickAnim - 535) / 25) * (0-(0.825)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-12.64822-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-21.15736-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (31.87148-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = -12.64822 + (((tickAnim - 30) / 270) * (-12.64822-(-12.64822)));
            yy = -21.15736 + (((tickAnim - 30) / 270) * (-21.15736-(-21.15736)));
            zz = 31.87148 + (((tickAnim - 30) / 270) * (31.87148-(31.87148)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = -12.64822 + (((tickAnim - 300) / 235) * (-12.64822-(-12.64822)));
            yy = -21.15736 + (((tickAnim - 300) / 235) * (-21.15736-(-21.15736)));
            zz = 31.87148 + (((tickAnim - 300) / 235) * (31.87148-(31.87148)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = -12.64822 + (((tickAnim - 535) / 25) * (0-(-12.64822)));
            yy = -21.15736 + (((tickAnim - 535) / 25) * (0-(-21.15736)));
            zz = 31.87148 + (((tickAnim - 535) / 25) * (0-(31.87148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (29.5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-30.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 29.5 + (((tickAnim - 30) / 270) * (29.5-(29.5)));
            zz = -30.75 + (((tickAnim - 30) / 270) * (-30.75-(-30.75)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 29.5 + (((tickAnim - 300) / 235) * (29.5-(29.5)));
            zz = -30.75 + (((tickAnim - 300) / 235) * (-30.75-(-30.75)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 29.5 + (((tickAnim - 535) / 25) * (0-(29.5)));
            zz = -30.75 + (((tickAnim - 535) / 25) * (0-(-30.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 30) / 270) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 270) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 30) / 270) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 535) {
            xx = 0 + (((tickAnim - 300) / 235) * (0-(0)));
            yy = 0.825 + (((tickAnim - 300) / 235) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 300) / 235) * (0-(0)));
        }
        else if (tickAnim >= 535 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 535) / 25) * (0-(0)));
            yy = 0.825 + (((tickAnim - 535) / 25) * (0-(0.825)));
            zz = 0 + (((tickAnim - 535) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (6.25-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-20.84589-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -20.84589 + (((tickAnim - 8) / 5) * (0-(-20.84589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (22.75-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.75 + (((tickAnim - 8) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (0.6575-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 0.6575 + (((tickAnim - 8) / 2) * (1-(0.6575)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throatPouch.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-0.25), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05 + (((tickAnim - 18) / 5) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05 + (((tickAnim - 44) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.2))*0.05)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throatPouch.rotationPointX = this.throatPouch.rotationPointX + (float)(xx);
        this.throatPouch.rotationPointY = this.throatPouch.rotationPointY - (float)(yy);
        this.throatPouch.rotationPointZ = this.throatPouch.rotationPointZ + (float)(zz);

        this.throatPouch.setScale((float)1,(float)0.6675,(float)1);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-10))*0.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-10))*-1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.85+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-20))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*0.25);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 64.21124 + (((tickAnim - 0) / 10) * (30.56979-(64.21124)));
            yy = 24.51591 + (((tickAnim - 0) / 10) * (33.38363-(24.51591)));
            zz = -40.25978 + (((tickAnim - 0) / 10) * (-33.64508-(-40.25978)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 30.56979 + (((tickAnim - 10) / 10) * (-17.00958-(30.56979)));
            yy = 33.38363 + (((tickAnim - 10) / 10) * (43.84119-(33.38363)));
            zz = -33.64508 + (((tickAnim - 10) / 10) * (21.53986-(-33.64508)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -17.00958 + (((tickAnim - 20) / 30) * (64.21124-(-17.00958)));
            yy = 43.84119 + (((tickAnim - 20) / 30) * (24.51591-(43.84119)));
            zz = 21.53986 + (((tickAnim - 20) / 30) * (-40.25978-(21.53986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (-16.26317-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (46.12926-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (-4.88864-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -16.26317 + (((tickAnim - 15) / 5) * (-5-(-16.26317)));
            yy = 46.12926 + (((tickAnim - 15) / 5) * (16-(46.12926)));
            zz = -4.88864 + (((tickAnim - 15) / 5) * (0-(-4.88864)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 20) / 10) * (-4.38715-(-5)));
            yy = 16 + (((tickAnim - 20) / 10) * (9.04502-(16)));
            zz = 0 + (((tickAnim - 20) / 10) * (26.49625-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.38715 + (((tickAnim - 30) / 20) * (0-(-4.38715)));
            yy = 9.04502 + (((tickAnim - 30) / 20) * (0-(9.04502)));
            zz = 26.49625 + (((tickAnim - 30) / 20) * (0-(26.49625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.33-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 15) / 5) * (-0.25-(0.33)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 30) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 109.49037 + (((tickAnim - 0) / 5) * (117.22527-(109.49037)));
            yy = -44.4728 + (((tickAnim - 0) / 5) * (-42.645-(-44.4728)));
            zz = -60.44992 + (((tickAnim - 0) / 5) * (-32.16425-(-60.44992)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 117.22527 + (((tickAnim - 5) / 10) * (-54.51715-(117.22527)));
            yy = -42.645 + (((tickAnim - 5) / 10) * (-18.45979-(-42.645)));
            zz = -32.16425 + (((tickAnim - 5) / 10) * (86.31442-(-32.16425)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -54.51715 + (((tickAnim - 15) / 5) * (-32.64834-(-54.51715)));
            yy = -18.45979 + (((tickAnim - 15) / 5) * (-37.77088-(-18.45979)));
            zz = 86.31442 + (((tickAnim - 15) / 5) * (43.26422-(86.31442)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -32.64834 + (((tickAnim - 20) / 10) * (-25.51877-(-32.64834)));
            yy = -37.77088 + (((tickAnim - 20) / 10) * (-40.00486-(-37.77088)));
            zz = 43.26422 + (((tickAnim - 20) / 10) * (8.69284-(43.26422)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -25.51877 + (((tickAnim - 30) / 10) * (-51.61886-(-25.51877)));
            yy = -40.00486 + (((tickAnim - 30) / 10) * (-33.32894-(-40.00486)));
            zz = 8.69284 + (((tickAnim - 30) / 10) * (61.36311-(8.69284)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -51.61886 + (((tickAnim - 40) / 10) * (109.49037-(-51.61886)));
            yy = -33.32894 + (((tickAnim - 40) / 10) * (-44.4728-(-33.32894)));
            zz = 61.36311 + (((tickAnim - 40) / 10) * (-60.44992-(61.36311)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.82-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0.4 + (((tickAnim - 5) / 10) * (0.23-(0.4)));
            yy = 0.82 + (((tickAnim - 5) / 10) * (0.84-(0.82)));
            zz = 0 + (((tickAnim - 5) / 10) * (0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.23 + (((tickAnim - 15) / 5) * (0-(0.23)));
            yy = 0.84 + (((tickAnim - 15) / 5) * (-0.275-(0.84)));
            zz = 0.225 + (((tickAnim - 15) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 20) / 10) * (-0.105-(-0.275)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.105 + (((tickAnim - 30) / 20) * (0-(-0.105)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -40.7356 + (((tickAnim - 0) / 5) * (0-(-40.7356)));
            yy = 5.71059 + (((tickAnim - 0) / 5) * (0-(5.71059)));
            zz = 10.28606 + (((tickAnim - 0) / 5) * (0-(10.28606)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (26.5-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 26.5 + (((tickAnim - 12) / 8) * (0-(26.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (-40.7356-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (5.71059-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (10.28606-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.025-(0)));
            zz = 0.275 + (((tickAnim - 0) / 5) * (0.45-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 5) / 7) * (0.04-(-0.025)));
            zz = 0.45 + (((tickAnim - 5) / 7) * (0.23-(0.45)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0.04 + (((tickAnim - 12) / 8) * (0-(0.04)));
            zz = 0.23 + (((tickAnim - 12) / 8) * (0-(0.23)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.29-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.29 + (((tickAnim - 40) / 10) * (0.275-(0.29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0.88686 + (((tickAnim - 0) / 23) * (64.21124-(0.88686)));
            yy = -38.86875 + (((tickAnim - 0) / 23) * (-24.51591-(-38.86875)));
            zz = -6.68045 + (((tickAnim - 0) / 23) * (40.25978-(-6.68045)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 64.21124 + (((tickAnim - 23) / 10) * (30.56979-(64.21124)));
            yy = -24.51591 + (((tickAnim - 23) / 10) * (-33.38363-(-24.51591)));
            zz = 40.25978 + (((tickAnim - 23) / 10) * (33.64508-(40.25978)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 30.56979 + (((tickAnim - 33) / 10) * (-17.00958-(30.56979)));
            yy = -33.38363 + (((tickAnim - 33) / 10) * (-43.84119-(-33.38363)));
            zz = 33.64508 + (((tickAnim - 33) / 10) * (-21.53986-(33.64508)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -17.00958 + (((tickAnim - 43) / 7) * (0.88686-(-17.00958)));
            yy = -43.84119 + (((tickAnim - 43) / 7) * (-38.86875-(-43.84119)));
            zz = -21.53986 + (((tickAnim - 43) / 7) * (-6.68045-(-21.53986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -4.37239 + (((tickAnim - 0) / 23) * (0-(-4.37239)));
            yy = -19.80252 + (((tickAnim - 0) / 23) * (0-(-19.80252)));
            zz = 0.68641 + (((tickAnim - 0) / 23) * (0-(0.68641)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (-16.26317-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (-46.12926-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (4.88864-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -16.26317 + (((tickAnim - 38) / 5) * (-5-(-16.26317)));
            yy = -46.12926 + (((tickAnim - 38) / 5) * (-16-(-46.12926)));
            zz = 4.88864 + (((tickAnim - 38) / 5) * (0-(4.88864)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 43) / 7) * (-4.37239-(-5)));
            yy = -16 + (((tickAnim - 43) / 7) * (-19.80252-(-16)));
            zz = 0 + (((tickAnim - 43) / 7) * (0.68641-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 23) * (0-(-0.2)));
            zz = 0.175 + (((tickAnim - 0) / 23) * (0-(0.175)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0.33-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.33 + (((tickAnim - 38) / 5) * (-0.25-(0.33)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -0.25 + (((tickAnim - 43) / 7) * (-0.2-(-0.25)));
            zz = 0 + (((tickAnim - 43) / 7) * (0.175-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -56.82133 + (((tickAnim - 0) / 23) * (109.49037-(-56.82133)));
            yy = 27.02544 + (((tickAnim - 0) / 23) * (44.4728-(27.02544)));
            zz = -62.54462 + (((tickAnim - 0) / 23) * (60.44992-(-62.54462)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 109.49037 + (((tickAnim - 23) / 5) * (117.22527-(109.49037)));
            yy = 44.4728 + (((tickAnim - 23) / 5) * (42.645-(44.4728)));
            zz = 60.44992 + (((tickAnim - 23) / 5) * (32.16425-(60.44992)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 117.22527 + (((tickAnim - 28) / 10) * (-54.51715-(117.22527)));
            yy = 42.645 + (((tickAnim - 28) / 10) * (18.45979-(42.645)));
            zz = 32.16425 + (((tickAnim - 28) / 10) * (-86.31442-(32.16425)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -54.51715 + (((tickAnim - 38) / 5) * (-32.64834-(-54.51715)));
            yy = 18.45979 + (((tickAnim - 38) / 5) * (37.77088-(18.45979)));
            zz = -86.31442 + (((tickAnim - 38) / 5) * (-43.26422-(-86.31442)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -32.64834 + (((tickAnim - 43) / 7) * (-56.82133-(-32.64834)));
            yy = 37.77088 + (((tickAnim - 43) / 7) * (27.02544-(37.77088)));
            zz = -43.26422 + (((tickAnim - 43) / 7) * (-62.54462-(-43.26422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = -0.045 + (((tickAnim - 0) / 23) * (0-(-0.045)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0.4-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.82-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0.4 + (((tickAnim - 28) / 10) * (0.23-(0.4)));
            yy = 0.82 + (((tickAnim - 28) / 10) * (0.84-(0.82)));
            zz = 0 + (((tickAnim - 28) / 10) * (0.225-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0.23 + (((tickAnim - 38) / 5) * (0-(0.23)));
            yy = 0.84 + (((tickAnim - 38) / 5) * (-0.275-(0.84)));
            zz = 0.225 + (((tickAnim - 38) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 43) / 7) * (-0.045-(-0.275)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-40.7356-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-5.71059-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-10.28606-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -40.7356 + (((tickAnim - 23) / 5) * (0-(-40.7356)));
            yy = -5.71059 + (((tickAnim - 23) / 5) * (0-(-5.71059)));
            zz = -10.28606 + (((tickAnim - 23) / 5) * (0-(-10.28606)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (26.5-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 26.5 + (((tickAnim - 35) / 8) * (0-(26.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.275-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-0.025-(0)));
            zz = 0.275 + (((tickAnim - 23) / 5) * (0.45-(0.275)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 28) / 7) * (0.04-(-0.025)));
            zz = 0.45 + (((tickAnim - 28) / 7) * (0.23-(0.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0.04 + (((tickAnim - 35) / 8) * (0-(0.04)));
            zz = 0.23 + (((tickAnim - 35) / 8) * (0-(0.23)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-200))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-250))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-300))*-1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*4), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-100))*1.5), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(19.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-50))*-1.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-20.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-150))*-1.5), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-2), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 2.06892 + (((tickAnim - 0) / 13) * (-13.83137-(2.06892)));
            yy = 37.55376 + (((tickAnim - 0) / 13) * (-11.08616-(37.55376)));
            zz = 16.94089 + (((tickAnim - 0) / 13) * (22.89194-(16.94089)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -13.83137 + (((tickAnim - 13) / 14) * (-44.7127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-13.83137)));
            yy = -11.08616 + (((tickAnim - 13) / 14) * (126.6113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(-11.08616)));
            zz = 22.89194 + (((tickAnim - 13) / 14) * (14.7424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-80-(22.89194)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -44.7127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 27) / 11) * (15.5236-(-44.7127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 126.6113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 27) / 11) * (71.93525-(126.6113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = 14.7424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-80 + (((tickAnim - 27) / 11) * (26.66755-(14.7424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-80)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 15.5236 + (((tickAnim - 38) / 12) * (2.06892-(15.5236)));
            yy = 71.93525 + (((tickAnim - 38) / 12) * (37.55376-(71.93525)));
            zz = 26.66755 + (((tickAnim - 38) / 12) * (16.94089-(26.66755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.67306 + (((tickAnim - 0) / 13) * (46.05329-(29.67306)));
            yy = -14.28778 + (((tickAnim - 0) / 13) * (34.42704-(-14.28778)));
            zz = -5.48025 + (((tickAnim - 0) / 13) * (-11.1915-(-5.48025)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 46.05329 + (((tickAnim - 13) / 9) * (73.73012-(46.05329)));
            yy = 34.42704 + (((tickAnim - 13) / 9) * (-14.2332-(34.42704)));
            zz = -11.1915 + (((tickAnim - 13) / 9) * (-30.10358-(-11.1915)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 73.73012 + (((tickAnim - 22) / 9) * (-21.70552-(73.73012)));
            yy = -14.2332 + (((tickAnim - 22) / 9) * (-25.42609-(-14.2332)));
            zz = -30.10358 + (((tickAnim - 22) / 9) * (-11.37874-(-30.10358)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -21.70552 + (((tickAnim - 31) / 7) * (20.31257-(-21.70552)));
            yy = -25.42609 + (((tickAnim - 31) / 7) * (-18.96498-(-25.42609)));
            zz = -11.37874 + (((tickAnim - 31) / 7) * (-17.64462-(-11.37874)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 20.31257 + (((tickAnim - 38) / 12) * (29.67306-(20.31257)));
            yy = -18.96498 + (((tickAnim - 38) / 12) * (-14.28778-(-18.96498)));
            zz = -17.64462 + (((tickAnim - 38) / 12) * (-5.48025-(-17.64462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 13) * (-0.3-(-0.275)));
            zz = -0.55 + (((tickAnim - 0) / 13) * (0-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (-0.1-(0)));
            yy = -0.3 + (((tickAnim - 13) / 9) * (-0.175-(-0.3)));
            zz = 0 + (((tickAnim - 13) / 9) * (-0.475-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 38) {
            xx = -0.1 + (((tickAnim - 22) / 16) * (0-(-0.1)));
            yy = -0.175 + (((tickAnim - 22) / 16) * (-0.275-(-0.175)));
            zz = -0.475 + (((tickAnim - 22) / 16) * (-0.55-(-0.475)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 38) / 12) * (-0.275-(-0.275)));
            zz = -0.55 + (((tickAnim - 38) / 12) * (-0.55-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -35.17639 + (((tickAnim - 0) / 13) * (-44.87572-(-35.17639)));
            yy = -42.88586 + (((tickAnim - 0) / 13) * (-36.14728-(-42.88586)));
            zz = 19.38373 + (((tickAnim - 0) / 13) * (30.26684-(19.38373)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -44.87572 + (((tickAnim - 13) / 5) * (-16.57017-(-44.87572)));
            yy = -36.14728 + (((tickAnim - 13) / 5) * (-36.14728-(-36.14728)));
            zz = 30.26684 + (((tickAnim - 13) / 5) * (30.26684-(30.26684)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -16.57017 + (((tickAnim - 18) / 4) * (40.87428-(-16.57017)));
            yy = -36.14728 + (((tickAnim - 18) / 4) * (-36.14728-(-36.14728)));
            zz = 30.26684 + (((tickAnim - 18) / 4) * (30.26684-(30.26684)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 40.87428 + (((tickAnim - 22) / 5) * (60.345-(40.87428)));
            yy = -36.14728 + (((tickAnim - 22) / 5) * (-41.76587-(-36.14728)));
            zz = 30.26684 + (((tickAnim - 22) / 5) * (19.00881-(30.26684)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 60.345 + (((tickAnim - 27) / 4) * (66.11228-(60.345)));
            yy = -41.76587 + (((tickAnim - 27) / 4) * (-46.44803-(-41.76587)));
            zz = 19.00881 + (((tickAnim - 27) / 4) * (9.62712-(19.00881)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 66.11228 + (((tickAnim - 31) / 7) * (-12.27533-(66.11228)));
            yy = -46.44803 + (((tickAnim - 31) / 7) * (-46.33561-(-46.44803)));
            zz = 9.62712 + (((tickAnim - 31) / 7) * (18.39739-(9.62712)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.27533 + (((tickAnim - 38) / 12) * (-35.17639-(-12.27533)));
            yy = -46.33561 + (((tickAnim - 38) / 12) * (-42.88586-(-46.33561)));
            zz = 18.39739 + (((tickAnim - 38) / 12) * (19.38373-(18.39739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.425 + (((tickAnim - 0) / 7) * (-0.21-(-0.425)));
            yy = 0.5 + (((tickAnim - 0) / 7) * (0.525-(0.5)));
            zz = 0.05 + (((tickAnim - 0) / 7) * (0.18-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -0.21 + (((tickAnim - 7) / 6) * (0-(-0.21)));
            yy = 0.525 + (((tickAnim - 7) / 6) * (0.4-(0.525)));
            zz = 0.18 + (((tickAnim - 7) / 6) * (0.3-(0.18)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (-0.835-(0)));
            yy = 0.4 + (((tickAnim - 13) / 6) * (1.65-(0.4)));
            zz = 0.3 + (((tickAnim - 13) / 6) * (0.83-(0.3)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = -0.835 + (((tickAnim - 19) / 8) * (-0.14-(-0.835)));
            yy = 1.65 + (((tickAnim - 19) / 8) * (1.93-(1.65)));
            zz = 0.83 + (((tickAnim - 19) / 8) * (0.205-(0.83)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -0.14 + (((tickAnim - 27) / 4) * (-0.265-(-0.14)));
            yy = 1.93 + (((tickAnim - 27) / 4) * (1.93-(1.93)));
            zz = 0.205 + (((tickAnim - 27) / 4) * (0.225-(0.205)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -0.265 + (((tickAnim - 31) / 7) * (0-(-0.265)));
            yy = 1.93 + (((tickAnim - 31) / 7) * (0.575-(1.93)));
            zz = 0.225 + (((tickAnim - 31) / 7) * (0-(0.225)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (-0.425-(0)));
            yy = 0.575 + (((tickAnim - 38) / 12) * (0.5-(0.575)));
            zz = 0 + (((tickAnim - 38) / 12) * (0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -8.98775 + (((tickAnim - 0) / 13) * (15.5236-(-8.98775)));
            yy = -53.0613+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 0) / 13) * (-71.93525-(-53.0613+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            zz = 22.3826008131+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 0) / 13) * (-26.66755-(22.3826008131+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 15.5236 + (((tickAnim - 13) / 25) * (-4.88137-(15.5236)));
            yy = -71.93525 + (((tickAnim - 13) / 25) * (11.08616-(-71.93525)));
            zz = -26.66755 + (((tickAnim - 13) / 25) * (-22.89194-(-26.66755)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -4.88137 + (((tickAnim - 38) / 12) * (-8.98775-(-4.88137)));
            yy = 11.08616 + (((tickAnim - 38) / 12) * (-134.5863+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(11.08616)));
            zz = -22.89194 + (((tickAnim - 38) / 12) * (-60.2424+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(-22.89194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 39.82058 + (((tickAnim - 0) / 7) * (-3.4096-(39.82058)));
            yy = 35.58419 + (((tickAnim - 0) / 7) * (35.04271-(35.58419)));
            zz = -13.40522 + (((tickAnim - 0) / 7) * (32.09175-(-13.40522)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3.4096 + (((tickAnim - 7) / 6) * (20.31257-(-3.4096)));
            yy = 35.04271 + (((tickAnim - 7) / 6) * (18.96498-(35.04271)));
            zz = 32.09175 + (((tickAnim - 7) / 6) * (17.64462-(32.09175)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 20.31257 + (((tickAnim - 13) / 25) * (46.05329-(20.31257)));
            yy = 18.96498 + (((tickAnim - 13) / 25) * (-34.42704-(18.96498)));
            zz = 17.64462 + (((tickAnim - 13) / 25) * (11.1915-(17.64462)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 46.05329 + (((tickAnim - 38) / 12) * (39.82058-(46.05329)));
            yy = -34.42704 + (((tickAnim - 38) / 12) * (35.58419-(-34.42704)));
            zz = 11.1915 + (((tickAnim - 38) / 12) * (-13.40522-(11.1915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.275 + (((tickAnim - 0) / 7) * (0.12-(0.275)));
            yy = -0.175 + (((tickAnim - 0) / 7) * (-0.23-(-0.175)));
            zz = -0.375 + (((tickAnim - 0) / 7) * (-0.27-(-0.375)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.12 + (((tickAnim - 7) / 6) * (0-(0.12)));
            yy = -0.23 + (((tickAnim - 7) / 6) * (-0.275-(-0.23)));
            zz = -0.27 + (((tickAnim - 7) / 6) * (-0.55-(-0.27)));
        }
        else if (tickAnim >= 13 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 13) / 25) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 25) * (-0.3-(-0.275)));
            zz = -0.55 + (((tickAnim - 13) / 25) * (0-(-0.55)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0.275-(0)));
            yy = -0.3 + (((tickAnim - 38) / 12) * (-0.175-(-0.3)));
            zz = 0 + (((tickAnim - 38) / 12) * (-0.375-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 59.07602 + (((tickAnim - 0) / 3) * (75.47649-(59.07602)));
            yy = 43.397 + (((tickAnim - 0) / 3) * (42.11343-(43.397)));
            zz = -16.54818 + (((tickAnim - 0) / 3) * (-16.01215-(-16.54818)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 75.47649 + (((tickAnim - 3) / 4) * (61.87695-(75.47649)));
            yy = 42.11343 + (((tickAnim - 3) / 4) * (40.82987-(42.11343)));
            zz = -16.01215 + (((tickAnim - 3) / 4) * (-15.47613-(-16.01215)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 61.87695 + (((tickAnim - 7) / 6) * (-11.70754-(61.87695)));
            yy = 40.82987 + (((tickAnim - 7) / 6) * (44.29114-(40.82987)));
            zz = -15.47613 + (((tickAnim - 7) / 6) * (-16.52867-(-15.47613)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -11.70754 + (((tickAnim - 13) / 15) * (-37.13709-(-11.70754)));
            yy = 44.29114 + (((tickAnim - 13) / 15) * (39.02358-(44.29114)));
            zz = -16.52867 + (((tickAnim - 13) / 15) * (-20.1748-(-16.52867)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -37.13709 + (((tickAnim - 28) / 7) * (-50.54036-(-37.13709)));
            yy = 39.02358 + (((tickAnim - 28) / 7) * (32.08521-(39.02358)));
            zz = -20.1748 + (((tickAnim - 28) / 7) * (-27.83465-(-20.1748)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -50.54036 + (((tickAnim - 35) / 15) * (59.07602-(-50.54036)));
            yy = 32.08521 + (((tickAnim - 35) / 15) * (43.397-(32.08521)));
            zz = -27.83465 + (((tickAnim - 35) / 15) * (-16.54818-(-27.83465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.425 + (((tickAnim - 0) / 7) * (0.2-(0.425)));
            yy = 1.725 + (((tickAnim - 0) / 7) * (1.22-(1.725)));
            zz = 0.025 + (((tickAnim - 0) / 7) * (-0.105-(0.025)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0.2 + (((tickAnim - 7) / 6) * (0-(0.2)));
            yy = 1.22 + (((tickAnim - 7) / 6) * (0.625-(1.22)));
            zz = -0.105 + (((tickAnim - 7) / 6) * (-0.275-(-0.105)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0.485-(0)));
            yy = 0.625 + (((tickAnim - 13) / 8) * (0.78-(0.625)));
            zz = -0.275 + (((tickAnim - 13) / 8) * (0.215-(-0.275)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.485 + (((tickAnim - 21) / 7) * (0.31-(0.485)));
            yy = 0.78 + (((tickAnim - 21) / 7) * (0.63-(0.78)));
            zz = 0.215 + (((tickAnim - 21) / 7) * (0.145-(0.215)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.31 + (((tickAnim - 28) / 7) * (0.6-(0.31)));
            yy = 0.63 + (((tickAnim - 28) / 7) * (0.05-(0.63)));
            zz = 0.145 + (((tickAnim - 28) / 7) * (-0.1-(0.145)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.6 + (((tickAnim - 35) / 3) * (0.55-(0.6)));
            yy = 0.05 + (((tickAnim - 35) / 3) * (0.72-(0.05)));
            zz = -0.1 + (((tickAnim - 35) / 3) * (0.06-(-0.1)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.55 + (((tickAnim - 38) / 12) * (0.425-(0.55)));
            yy = 0.72 + (((tickAnim - 38) / 12) * (1.725-(0.72)));
            zz = 0.06 + (((tickAnim - 38) / 12) * (0.025-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);
       
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLaganosuchus entity = (EntityPrehistoricFloraLaganosuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.75), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(94.4092281337+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), leftLeg.rotateAngleY + (float) Math.toRadians(38.30168), leftLeg.rotateAngleZ + (float) Math.toRadians(-36.90337));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-19.50197), leftLeg2.rotateAngleY + (float) Math.toRadians(49.8259303437+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2), leftLeg2.rotateAngleZ + (float) Math.toRadians(-31.31717));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(193.5738983798+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*2), leftLeg3.rotateAngleY + (float) Math.toRadians(-42.9541), leftLeg3.rotateAngleZ + (float) Math.toRadians(-93.38373));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0.425);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(15.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*2), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(0);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(0);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(0.2);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(94.4092281337+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-2), rightLeg.rotateAngleY + (float) Math.toRadians(-38.30168), rightLeg.rotateAngleZ + (float) Math.toRadians(36.90337));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-19.50197), rightLeg2.rotateAngleY + (float) Math.toRadians(-49.8259303437+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2), rightLeg2.rotateAngleZ + (float) Math.toRadians(31.31717));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(193.5738983798+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2), rightLeg3.rotateAngleY + (float) Math.toRadians(42.9541), rightLeg3.rotateAngleZ + (float) Math.toRadians(93.38373));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(-0.425);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(15.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-2), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(0);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(0);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(13.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3.75), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-11.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-12), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*2), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(21), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-19.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.throatPouch.setScale((float)1,(float)0.8,(float)1);


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(30.17922), leftArm.rotateAngleY + (float) Math.toRadians(-6.5752), leftArm.rotateAngleZ + (float) Math.toRadians(37.63952));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(56.67281), leftArm2.rotateAngleY + (float) Math.toRadians(-56.82082), leftArm2.rotateAngleZ + (float) Math.toRadians(-71.78252));
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(-0.3);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(79.25), leftArm3.rotateAngleY + (float) Math.toRadians(-39.25), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(0);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(0.725);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(30.17922), rightArm.rotateAngleY + (float) Math.toRadians(6.5752), rightArm.rotateAngleZ + (float) Math.toRadians(-37.63952));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(56.67281), rightArm2.rotateAngleY + (float) Math.toRadians(56.82082), rightArm2.rotateAngleZ + (float) Math.toRadians(71.78252));
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(-0.3);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(79.25), rightArm3.rotateAngleY + (float) Math.toRadians(39.25), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(0);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(0.725);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(0);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLaganosuchus e = (EntityPrehistoricFloraLaganosuchus) entity;
        animator.update(entity);

    }
}
