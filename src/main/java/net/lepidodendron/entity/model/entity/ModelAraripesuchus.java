package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAraripesuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAraripesuchus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelAraripesuchus() {
        this.textureWidth = 52;
        this.textureHeight = 52;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 15.7138F, 7.1941F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5138F, -2.1941F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 27, -1.0F, -1.25F, 0.25F, 2, 1, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.5138F, -2.1941F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 15, -1.0F, -0.5F, 0.25F, 3, 3, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.9F, 1.1521F, -0.9529F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 15, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5236F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 4, 2, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 3.5F, 1.5F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 0, 27, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.9F, 1.1521F, -0.9529F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 15, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5236F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 4, 2, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 3.5F, 1.5F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 0, 27, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -0.7638F, -1.4441F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -0.5F, -10.0F, 4, 4, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 15, -1.0F, -1.05F, -10.0F, 3, 1, 10, -0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, -9.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 23, 31, -1.0F, 0.175F, -2.95F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 12, -0.5F, 0.0F, 0.0F, 2, 1, 3, 0.001F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.9F, 2.7076F, -1.4479F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.3403F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 0, 45, -0.7F, -0.5F, -0.6F, 2, 4, 1, 0.0F, false));
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 16, 43, -0.7F, -0.5F, -0.15F, 2, 4, 1, -0.001F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.8F, 3.1451F, -0.0398F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.9425F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 42, 24, -1.5F, -0.25F, -0.5F, 2, 4, 1, 0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 3.1166F, 0.1539F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.6021F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 41, 33, -1.5F, -0.025F, -2.6F, 2, 1, 3, 0.01F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-0.9F, 2.7076F, -1.4479F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.3403F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 0, 45, -1.3F, -0.5F, -0.6F, 2, 4, 1, 0.0F, true));
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 16, 43, -1.3F, -0.5F, -0.15F, 2, 4, 1, -0.001F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.8F, 3.1451F, -0.0398F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.9425F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 42, 24, -0.5F, -0.25F, -0.5F, 2, 4, 1, 0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 3.1166F, 0.1539F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.6021F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 41, 33, -0.5F, -0.025F, -2.6F, 2, 1, 3, 0.01F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0436F, -2.2519F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0654F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 32, 17, -0.5F, 0.0F, -4.0F, 2, 2, 4, -0.001F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 39, 0.0F, -0.5F, -4.0F, 1, 1, 4, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 35, -0.5F, -0.825F, -4.075F, 2, 1, 4, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4619F, -3.7913F);
        this.body3.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 43, 38, 0.0F, 0.5F, -6.0F, 1, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 27, 0.75F, 0.7F, -5.0F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 33, -0.5F, 0.5F, -4.0F, 2, 1, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 27, 0.25F, 0.7F, -5.0F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.0F, -5.5F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.48F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 27, -0.375F, -0.375F, -0.35F, 0, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 27, 0.375F, -0.375F, -0.35F, 0, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.5F, -6.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 7, -0.25F, -0.8F, -0.725F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 7, 0.25F, -0.8F, -0.725F, 0, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 19, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.1873F, -1.5106F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, -0.5F, -0.1F, 0.45F, 2, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.0035F, -4.0103F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0654F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 35, 40, -0.5F, 0.0F, -0.025F, 2, 1, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.2608F, -4.6334F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3272F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 0, -0.5F, -0.05F, -0.325F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.3044F, -6.633F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0218F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 17, -0.5F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.head.addChild(jaw);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.8423F, -5.5031F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2487F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 15, -0.25F, -1.25F, -1.0F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 15, 0.25F, -1.25F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.25F, 0.1384F, -4.0059F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5105F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 27, -0.125F, -0.325F, -0.7F, 0, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 27, 0.625F, -0.325F, -0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.8423F, -5.5281F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2487F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 5, 22, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.3F, 1.4F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0305F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 39, -0.5F, -1.0F, -4.15F, 2, 2, 3, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 1.65F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0305F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 34, -0.5F, 0.0F, -5.15F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, -0.35F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0305F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 0, -0.5F, 0.0F, -5.15F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.9033F, -3.5291F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2487F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 6, -0.5F, -1.0F, -0.05F, 1, 1, 4, -0.002F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5F, 0.6F, -2.9F);
        this.head.addChild(eye);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.725F, 0.0F, 0.0F);
        this.eye.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.725F, 0.0F, 0.0F);
        this.eye.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1309F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.2379F, 1.8129F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3491F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 22, 23, -0.5F, 0.0F, 0.025F, 2, 2, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.2F, 0.0F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0131F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 28, 0.5F, -0.95F, 0.025F, 1, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0065F, 4.5496F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 0, -0.5F, 0.0F, 0.025F, 2, 2, 5, -0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.5F, 0.75F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 29, 3, 0.5F, -1.1F, -0.725F, 1, 1, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 28, 10, 0.0F, 0.0F, 0.025F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 36, 0.5F, -0.5F, 0.025F, 0, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 37, 0, 0.0F, 0.0F, 0.025F, 1, 1, 4, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.25F, 2.025F);
        this.tail4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 41, 0.5F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));


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
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
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

        EntityPrehistoricFloraAraripesuchus proteros = (EntityPrehistoricFloraAraripesuchus) e;

        this.faceTarget(f3, f4, 10, body3);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.body3, this.head};
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
        EntityPrehistoricFloraAraripesuchus ee = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.35395-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.44463-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.51672-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -25.35395 + (((tickAnim - 15) / 9) * (15.36576-(-25.35395)));
            yy = -16.44463 + (((tickAnim - 15) / 9) * (-16.97536-(-16.44463)));
            zz = -7.51672 + (((tickAnim - 15) / 9) * (-28.35428-(-7.51672)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 15.36576 + (((tickAnim - 24) / 11) * (53.27976-(15.36576)));
            yy = -16.97536 + (((tickAnim - 24) / 11) * (-16.42963-(-16.97536)));
            zz = -28.35428 + (((tickAnim - 24) / 11) * (-17.68323-(-28.35428)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 53.27976 + (((tickAnim - 35) / 15) * (0-(53.27976)));
            yy = -16.42963 + (((tickAnim - 35) / 15) * (0-(-16.42963)));
            zz = -17.68323 + (((tickAnim - 35) / 15) * (0-(-17.68323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -22.5 + (((tickAnim - 15) / 9) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (16.25-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 35) / 15) * (0-(16.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 15) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 28) * (0.75-(0)));
            zz = 0 + (((tickAnim - 15) / 28) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 43) / 7) * (0-(0.75)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 61.25 + (((tickAnim - 15) / 9) * (66.37633-(61.25)));
            yy = 0 + (((tickAnim - 15) / 9) * (-12.13005-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (-14.73532-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 66.37633 + (((tickAnim - 24) / 11) * (69-(66.37633)));
            yy = -12.13005 + (((tickAnim - 24) / 11) * (0-(-12.13005)));
            zz = -14.73532 + (((tickAnim - 24) / 11) * (0-(-14.73532)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 69 + (((tickAnim - 35) / 8) * (43.67-(69)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 43.67 + (((tickAnim - 43) / 7) * (0-(43.67)));
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
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (-0.16-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (1.69-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.16 + (((tickAnim - 19) / 5) * (-0.35-(-0.16)));
            yy = 1.69 + (((tickAnim - 19) / 5) * (2-(1.69)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -0.35 + (((tickAnim - 24) / 11) * (0-(-0.35)));
            yy = 2 + (((tickAnim - 24) / 11) * (0-(2)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (1.5-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 43) / 7) * (0-(1.5)));
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
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.75 + (((tickAnim - 10) / 10) * (0-(18.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 10) / 10) * (-4.125-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 20) / 15) * (-4.125-(-4.125)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.125 + (((tickAnim - 35) / 15) * (0-(-4.125)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.75 + (((tickAnim - 10) / 10) * (2.23424-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (-10.86982-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-18.0777-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.23424 + (((tickAnim - 20) / 15) * (2.23424-(2.23424)));
            yy = -10.86982 + (((tickAnim - 20) / 15) * (-10.86982-(-10.86982)));
            zz = -18.0777 + (((tickAnim - 20) / 15) * (-18.0777-(-18.0777)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.23424 + (((tickAnim - 35) / 15) * (0-(2.23424)));
            yy = -10.86982 + (((tickAnim - 35) / 15) * (0-(-10.86982)));
            zz = -18.0777 + (((tickAnim - 35) / 15) * (0-(-18.0777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (49.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 49.25 + (((tickAnim - 20) / 15) * (49.25-(49.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49.25 + (((tickAnim - 35) / 15) * (0-(49.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 40) * (0-(0.5)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (125.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 125.75 + (((tickAnim - 20) / 15) * (125.75-(125.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 125.75 + (((tickAnim - 35) / 7) * (-31.55523-(125.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (6.37623-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (6.00461-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -31.55523 + (((tickAnim - 42) / 8) * (0-(-31.55523)));
            yy = 6.37623 + (((tickAnim - 42) / 8) * (0-(6.37623)));
            zz = 6.00461 + (((tickAnim - 42) / 8) * (0-(6.00461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.75 + (((tickAnim - 10) / 10) * (2.23424-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (10.8698-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (18.0777-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 2.23424 + (((tickAnim - 20) / 15) * (2.23424-(2.23424)));
            yy = 10.8698 + (((tickAnim - 20) / 15) * (10.8698-(10.8698)));
            zz = 18.0777 + (((tickAnim - 20) / 15) * (18.0777-(18.0777)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.23424 + (((tickAnim - 35) / 15) * (0-(2.23424)));
            yy = 10.8698 + (((tickAnim - 35) / 15) * (0-(10.8698)));
            zz = 18.0777 + (((tickAnim - 35) / 15) * (0-(18.0777)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (49.25-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 49.25 + (((tickAnim - 20) / 15) * (49.25-(49.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49.25 + (((tickAnim - 35) / 15) * (0-(49.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 40) * (0-(0.5)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (125.75-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 125.75 + (((tickAnim - 20) / 15) * (125.75-(125.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 125.75 + (((tickAnim - 35) / 7) * (-34.25674-(125.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (-10.89154-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (-9.24504-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -34.25674 + (((tickAnim - 42) / 8) * (0-(-34.25674)));
            yy = -10.89154 + (((tickAnim - 42) / 8) * (0-(-10.89154)));
            zz = -9.24504 + (((tickAnim - 42) / 8) * (0-(-9.24504)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (-1-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 20) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 35) / 15) * (0-(-1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 10) / 10) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-40.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -19 + (((tickAnim - 10) / 25) * (-19-(-19)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = -40.5 + (((tickAnim - 10) / 25) * (-40.5-(-40.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 35) / 15) * (0-(-19)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -40.5 + (((tickAnim - 35) / 15) * (0-(-40.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-38.31193-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.83723-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (38.88305-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -38.31193 + (((tickAnim - 10) / 25) * (-38.31193-(-38.31193)));
            yy = -5.83723 + (((tickAnim - 10) / 25) * (-5.83723-(-5.83723)));
            zz = 38.88305 + (((tickAnim - 10) / 25) * (38.88305-(38.88305)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -38.31193 + (((tickAnim - 35) / 15) * (0-(-38.31193)));
            yy = -5.83723 + (((tickAnim - 35) / 15) * (0-(-5.83723)));
            zz = 38.88305 + (((tickAnim - 35) / 15) * (0-(38.88305)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 50.5 + (((tickAnim - 10) / 10) * (59.5-(50.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 59.5 + (((tickAnim - 20) / 15) * (59.5-(59.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 59.5 + (((tickAnim - 35) / 15) * (0-(59.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (45-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            zz = 45 + (((tickAnim - 10) / 25) * (45-(45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 45 + (((tickAnim - 35) / 15) * (0-(45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-48.19778-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.00867-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-44.95192-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -48.19778 + (((tickAnim - 10) / 25) * (-48.19778-(-48.19778)));
            yy = -9.00867 + (((tickAnim - 10) / 25) * (-9.00867-(-9.00867)));
            zz = -44.95192 + (((tickAnim - 10) / 25) * (-44.95192-(-44.95192)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -48.19778 + (((tickAnim - 35) / 15) * (0-(-48.19778)));
            yy = -9.00867 + (((tickAnim - 35) / 15) * (0-(-9.00867)));
            zz = -44.95192 + (((tickAnim - 35) / 15) * (0-(-44.95192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 50 + (((tickAnim - 10) / 10) * (57.5-(50)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 57.5 + (((tickAnim - 20) / 15) * (57.5-(57.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 57.5 + (((tickAnim - 35) / 15) * (0-(57.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.25 + (((tickAnim - 10) / 10) * (-1-(-9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 20) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 35) / 15) * (0-(-1)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 10) / 40) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 20) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 35) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 20) / 15) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8 + (((tickAnim - 35) / 15) * (0-(8)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 26;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -1 + (((tickAnim - 12) / 5) * (-1.75-(-1)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -1.75 + (((tickAnim - 17) / 10) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.98263-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.1239-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (4.84082-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -6.98263 + (((tickAnim - 12) / 5) * (-7.48263-(-6.98263)));
            yy = 0.1239 + (((tickAnim - 12) / 5) * (0.1239-(0.1239)));
            zz = 4.84082 + (((tickAnim - 12) / 5) * (4.84082-(4.84082)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -7.48263 + (((tickAnim - 17) / 10) * (0-(-7.48263)));
            yy = 0.1239 + (((tickAnim - 17) / 10) * (0-(0.1239)));
            zz = 4.84082 + (((tickAnim - 17) / 10) * (0-(4.84082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 19.5 + (((tickAnim - 12) / 5) * (20.25-(19.5)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 20.25 + (((tickAnim - 17) / 4) * (0-(20.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (5.25-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 5.25 + (((tickAnim - 25) / 2) * (0-(5.25)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (0.495-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 12) / 5) * (1-(1)));
            yy = 0.495 + (((tickAnim - 12) / 5) * (0.27-(0.495)));
            zz = 1 + (((tickAnim - 12) / 5) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 0.27 + (((tickAnim - 17) / 6) * (1-(0.27)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 23) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 2) * (0.05-(1)));
            zz = 1 + (((tickAnim - 23) / 2) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 25) / 2) * (1-(1)));
            yy = 0.05 + (((tickAnim - 25) / 2) * (1-(0.05)));
            zz = 1 + (((tickAnim - 25) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 8) / 12) * (0-(-5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 9) / 11) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (21.88-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 21.88 + (((tickAnim - 9) / 11) * (0-(21.88)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 7 + (((tickAnim - 5) / 5) * (0-(7)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.5 + (((tickAnim - 5) / 5) * (0-(6.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.34549-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.4867-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-15.1129-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.34549 + (((tickAnim - 5) / 5) * (0-(-3.34549)));
            yy = 4.4867 + (((tickAnim - 5) / 5) * (0-(4.4867)));
            zz = -15.1129 + (((tickAnim - 5) / 5) * (0-(-15.1129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-31.11707-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (6.9448-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (13.3189-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.11707 + (((tickAnim - 5) / 5) * (0-(-31.11707)));
            yy = 6.9448 + (((tickAnim - 5) / 5) * (0-(6.9448)));
            zz = 13.3189 + (((tickAnim - 5) / 5) * (0-(13.3189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 5) / 5) * (0-(31)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.34549-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.48673-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.11294-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.34549 + (((tickAnim - 5) / 5) * (0-(-3.34549)));
            yy = -4.48673 + (((tickAnim - 5) / 5) * (0-(-4.48673)));
            zz = 15.11294 + (((tickAnim - 5) / 5) * (0-(15.11294)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-31.11707-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-6.94485-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-13.31892-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.11707 + (((tickAnim - 5) / 5) * (0-(-31.11707)));
            yy = -6.94485 + (((tickAnim - 5) / 5) * (0-(-6.94485)));
            zz = -13.31892 + (((tickAnim - 5) / 5) * (0-(-13.31892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (31-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 5) / 5) * (0-(31)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 5) / 5) * (-6.5-(2.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -6.5 + (((tickAnim - 10) / 5) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 3) / 2) * (0.25-(14)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.25 + (((tickAnim - 5) / 5) * (-10.5-(0.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -10.5 + (((tickAnim - 10) / 2) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.5 + (((tickAnim - 5) / 2) * (0-(25.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (16.5-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 16.5 + (((tickAnim - 10) / 2) * (0-(16.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 20) / 10) * (2.49979-(2.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (-0.03271-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0.74929-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.49979 + (((tickAnim - 30) / 10) * (2.5-(2.49979)));
            yy = -0.03271 + (((tickAnim - 30) / 10) * (0-(-0.03271)));
            zz = 0.74929 + (((tickAnim - 30) / 10) * (0-(0.74929)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 40) / 10) * (2.49979-(2.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (-0.03271-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0.74929-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2.49979 + (((tickAnim - 50) / 10) * (2.5-(2.49979)));
            yy = -0.03271 + (((tickAnim - 50) / 10) * (0-(-0.03271)));
            zz = 0.74929 + (((tickAnim - 50) / 10) * (0-(0.74929)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 2.5 + (((tickAnim - 60) / 45) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 105) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -32.75 + (((tickAnim - 20) / 10) * (25.25-(-32.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 25.25 + (((tickAnim - 30) / 10) * (-32.75-(25.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -32.75 + (((tickAnim - 40) / 10) * (25.25-(-32.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 25.25 + (((tickAnim - 50) / 10) * (-32.75-(25.25)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -32.75 + (((tickAnim - 60) / 45) * (-32.75-(-32.75)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -32.75 + (((tickAnim - 105) / 15) * (0-(-32.75)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.75 + (((tickAnim - 10) / 10) * (29-(-13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 20) / 10) * (25.75-(29)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.75 + (((tickAnim - 30) / 5) * (-21.87-(25.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -21.87 + (((tickAnim - 35) / 5) * (29-(-21.87)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 29 + (((tickAnim - 40) / 10) * (25.75-(29)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 25.75 + (((tickAnim - 50) / 5) * (-21.87-(25.75)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -21.87 + (((tickAnim - 55) / 5) * (29-(-21.87)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 29 + (((tickAnim - 60) / 45) * (29-(29)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 29 + (((tickAnim - 105) / 8) * (-8-(29)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -8 + (((tickAnim - 113) / 7) * (0-(-8)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.485-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0.33-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.485 + (((tickAnim - 25) / 5) * (0.525-(0.485)));
            zz = 0.33 + (((tickAnim - 25) / 5) * (0.25-(0.33)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 30) / 10) * (0-(0.525)));
            zz = 0.25 + (((tickAnim - 30) / 10) * (0-(0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.485-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0.33-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.485 + (((tickAnim - 45) / 5) * (0.525-(0.485)));
            zz = 0.33 + (((tickAnim - 45) / 5) * (0.25-(0.33)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 50) / 10) * (0-(0.525)));
            zz = 0.25 + (((tickAnim - 50) / 10) * (0-(0.25)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 39.75 + (((tickAnim - 10) / 10) * (0-(39.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-11.13-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.13 + (((tickAnim - 25) / 5) * (81-(-11.13)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 81 + (((tickAnim - 30) / 10) * (0-(81)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (-11.13-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -11.13 + (((tickAnim - 45) / 5) * (81-(-11.13)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 81 + (((tickAnim - 50) / 10) * (0-(81)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 105) / 8) * (33.25-(0)));
            yy = 0 + (((tickAnim - 105) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 8) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 33.25 + (((tickAnim - 113) / 7) * (0-(33.25)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-0.475-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.475 + (((tickAnim - 30) / 10) * (0-(-0.475)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (-0.475-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -0.475 + (((tickAnim - 50) / 10) * (0-(-0.475)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3.25 + (((tickAnim - 20) / 10) * (-3.25718-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.48963-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-1.68013-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.25718 + (((tickAnim - 30) / 10) * (-3.25-(-3.25718)));
            yy = 0.48963 + (((tickAnim - 30) / 10) * (0-(0.48963)));
            zz = -1.68013 + (((tickAnim - 30) / 10) * (0-(-1.68013)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 40) / 10) * (-3.25718-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0.48963-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (-1.68013-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -3.25718 + (((tickAnim - 50) / 10) * (-3.25-(-3.25718)));
            yy = 0.48963 + (((tickAnim - 50) / 10) * (0-(0.48963)));
            zz = -1.68013 + (((tickAnim - 50) / 10) * (0-(-1.68013)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = -3.25 + (((tickAnim - 60) / 45) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = -3.25 + (((tickAnim - 105) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 105) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.45284-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.06266-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.19015-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 4.45284 + (((tickAnim - 20) / 23) * (4.45284-(4.45284)));
            yy = -4.06266 + (((tickAnim - 20) / 23) * (-4.06266-(-4.06266)));
            zz = 4.19015 + (((tickAnim - 20) / 23) * (4.19015-(4.19015)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 4.45284 + (((tickAnim - 43) / 7) * (8.5278+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(4.45284)));
            yy = -4.06266 + (((tickAnim - 43) / 7) * (-4.06266-(-4.06266)));
            zz = 4.19015 + (((tickAnim - 43) / 7) * (4.19015-(4.19015)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 8.5278+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 50) / 30) * (22.35877-(8.5278+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -4.06266 + (((tickAnim - 50) / 30) * (-7.73775-(-4.06266)));
            zz = 4.19015 + (((tickAnim - 50) / 30) * (-1.73729-(4.19015)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 22.35877 + (((tickAnim - 80) / 4) * (23.60877-(22.35877)));
            yy = -7.73775 + (((tickAnim - 80) / 4) * (-7.73775-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 80) / 4) * (-1.73729-(-1.73729)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 23.60877 + (((tickAnim - 84) / 4) * (22.35877-(23.60877)));
            yy = -7.73775 + (((tickAnim - 84) / 4) * (-7.73775-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 84) / 4) * (-1.73729-(-1.73729)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 22.35877 + (((tickAnim - 88) / 5) * (23.60877-(22.35877)));
            yy = -7.73775 + (((tickAnim - 88) / 5) * (-7.73775-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 88) / 5) * (-1.73729-(-1.73729)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 23.60877 + (((tickAnim - 93) / 4) * (22.35877-(23.60877)));
            yy = -7.73775 + (((tickAnim - 93) / 4) * (-7.73775-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 93) / 4) * (-1.73729-(-1.73729)));
        }
        else if (tickAnim >= 97 && tickAnim < 105) {
            xx = 22.35877 + (((tickAnim - 97) / 8) * (16.60877-(22.35877)));
            yy = -7.73775 + (((tickAnim - 97) / 8) * (-7.73775-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 97) / 8) * (-1.73729-(-1.73729)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 16.60877 + (((tickAnim - 105) / 15) * (0-(16.60877)));
            yy = -7.73775 + (((tickAnim - 105) / 15) * (0-(-7.73775)));
            zz = -1.73729 + (((tickAnim - 105) / 15) * (0-(-1.73729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.16073-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-13.18626-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (7.30772-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -1.16073 + (((tickAnim - 20) / 30) * (-1.16073-(-1.16073)));
            yy = -13.18626 + (((tickAnim - 20) / 30) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 20) / 30) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -1.16073 + (((tickAnim - 50) / 30) * (20.08927-(-1.16073)));
            yy = -13.18626 + (((tickAnim - 50) / 30) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 50) / 30) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 20.08927 + (((tickAnim - 80) / 4) * (18.08927-(20.08927)));
            yy = -13.18626 + (((tickAnim - 80) / 4) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 80) / 4) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 18.08927 + (((tickAnim - 84) / 4) * (20.08927-(18.08927)));
            yy = -13.18626 + (((tickAnim - 84) / 4) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 84) / 4) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 20.08927 + (((tickAnim - 88) / 5) * (18.08927-(20.08927)));
            yy = -13.18626 + (((tickAnim - 88) / 5) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 88) / 5) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 18.08927 + (((tickAnim - 93) / 4) * (20.08927-(18.08927)));
            yy = -13.18626 + (((tickAnim - 93) / 4) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 93) / 4) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 97 && tickAnim < 105) {
            xx = 20.08927 + (((tickAnim - 97) / 8) * (27.08927-(20.08927)));
            yy = -13.18626 + (((tickAnim - 97) / 8) * (-13.18626-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 97) / 8) * (7.30772-(7.30772)));
        }
        else if (tickAnim >= 105 && tickAnim < 120) {
            xx = 27.08927 + (((tickAnim - 105) / 15) * (0-(27.08927)));
            yy = -13.18626 + (((tickAnim - 105) / 15) * (0-(-13.18626)));
            zz = 7.30772 + (((tickAnim - 105) / 15) * (0-(7.30772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 97 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 97) / 4) * (3-(0)));
            yy = 0 + (((tickAnim - 97) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 4) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 105) {
            xx = 3 + (((tickAnim - 101) / 4) * (0-(3)));
            yy = 0 + (((tickAnim - 101) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 97) {
            xx = 1 + (((tickAnim - 0) / 97) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 97) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 97) * (1-(1)));
        }
        else if (tickAnim >= 97 && tickAnim < 101) {
            xx = 1 + (((tickAnim - 97) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 97) / 4) * (-0.01-(1)));
            zz = 1 + (((tickAnim - 97) / 4) * (1-(1)));
        }
        else if (tickAnim >= 101 && tickAnim < 105) {
            xx = 1 + (((tickAnim - 101) / 4) * (1-(1)));
            yy = -0.01 + (((tickAnim - 101) / 4) * (1-(-0.01)));
            zz = 1 + (((tickAnim - 101) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*-0.7), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334))*-4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*-0.1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 33 + (((tickAnim - 0) / 8) * (-16.46409-(33)));
            yy = 0 + (((tickAnim - 0) / 8) * (-8.18318-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (8.49598-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.46409 + (((tickAnim - 8) / 2) * (-22.20273-(-16.46409)));
            yy = -8.18318 + (((tickAnim - 8) / 2) * (-1.14468-(-8.18318)));
            zz = 8.49598 + (((tickAnim - 8) / 2) * (5.08822-(8.49598)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -22.20273 + (((tickAnim - 10) / 10) * (33-(-22.20273)));
            yy = -1.14468 + (((tickAnim - 10) / 10) * (0-(-1.14468)));
            zz = 5.08822 + (((tickAnim - 10) / 10) * (0-(5.08822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (17.59693-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.74293-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.42572-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 17.59693 + (((tickAnim - 3) / 5) * (-23.95854-(17.59693)));
            yy = 0.74293 + (((tickAnim - 3) / 5) * (0.74293-(0.74293)));
            zz = -2.42572 + (((tickAnim - 3) / 5) * (-2.42572-(-2.42572)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -23.95854 + (((tickAnim - 8) / 2) * (-13.31019-(-23.95854)));
            yy = 0.74293 + (((tickAnim - 8) / 2) * (1.4393-(0.74293)));
            zz = -2.42572 + (((tickAnim - 8) / 2) * (-4.78887-(-2.42572)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.31019 + (((tickAnim - 10) / 10) * (20-(-13.31019)));
            yy = 1.4393 + (((tickAnim - 10) / 10) * (0-(1.4393)));
            zz = -4.78887 + (((tickAnim - 10) / 10) * (0-(-4.78887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.415-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.415 + (((tickAnim - 3) / 5) * (0.89-(1.415)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.89 + (((tickAnim - 8) / 2) * (-0.225-(0.89)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 10) / 10) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 29.75 + (((tickAnim - 0) / 3) * (45.63-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 45.63 + (((tickAnim - 3) / 2) * (45.63-(45.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 45.63 + (((tickAnim - 5) / 3) * (15.05-(45.63)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 15.05 + (((tickAnim - 8) / 2) * (35-(15.05)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 10) / 5) * (-1.72-(35)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.72 + (((tickAnim - 15) / 5) * (29.75-(-1.72)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 3) * (1.715-(0.2)));
            zz = 0.35 + (((tickAnim - 0) / 3) * (-0.3-(0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.715 + (((tickAnim - 3) / 2) * (1.715-(1.715)));
            zz = -0.3 + (((tickAnim - 3) / 2) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.715 + (((tickAnim - 5) / 3) * (-0.13-(1.715)));
            zz = -0.3 + (((tickAnim - 5) / 3) * (-0.18-(-0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.13 + (((tickAnim - 8) / 2) * (-0.1-(-0.13)));
            zz = -0.18 + (((tickAnim - 8) / 2) * (0-(-0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 10) / 10) * (0.2-(-0.1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.20273 + (((tickAnim - 0) / 10) * (48.29727-(-22.20273)));
            yy = -1.14468 + (((tickAnim - 0) / 10) * (-1.14468-(-1.14468)));
            zz = 5.08822 + (((tickAnim - 0) / 10) * (5.08822-(5.08822)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 48.29727 + (((tickAnim - 10) / 8) * (-25.61899-(48.29727)));
            yy = -1.14468 + (((tickAnim - 10) / 8) * (3.98977-(-1.14468)));
            zz = 5.08822 + (((tickAnim - 10) / 8) * (-3.41513-(5.08822)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25.61899 + (((tickAnim - 18) / 2) * (-22.20273-(-25.61899)));
            yy = 3.98977 + (((tickAnim - 18) / 2) * (-1.14468-(3.98977)));
            zz = -3.41513 + (((tickAnim - 18) / 2) * (5.08822-(-3.41513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13.31019 + (((tickAnim - 0) / 10) * (7.18981-(-13.31019)));
            yy = 1.4393 + (((tickAnim - 0) / 10) * (1.4393-(1.4393)));
            zz = -4.78887 + (((tickAnim - 0) / 10) * (-4.78887-(-4.78887)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 7.18981 + (((tickAnim - 10) / 5) * (2.18079-(7.18981)));
            yy = 1.4393 + (((tickAnim - 10) / 5) * (1.56574-(1.4393)));
            zz = -4.78887 + (((tickAnim - 10) / 5) * (-0.58168-(-4.78887)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 2.18079 + (((tickAnim - 15) / 3) * (-4.5-(2.18079)));
            yy = 1.56574 + (((tickAnim - 15) / 3) * (0-(1.56574)));
            zz = -0.58168 + (((tickAnim - 15) / 3) * (0-(-0.58168)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 18) / 2) * (-13.31019-(-4.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (1.4393-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-4.78887-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 10) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.25-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 1.25 + (((tickAnim - 15) / 1) * (1.25-(1.25)));
            zz = 0.025 + (((tickAnim - 15) / 1) * (0.025-(0.025)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.25 + (((tickAnim - 16) / 2) * (0-(1.25)));
            zz = 0.025 + (((tickAnim - 16) / 2) * (0-(0.025)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 35 + (((tickAnim - 0) / 7) * (-10.23-(35)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10.23 + (((tickAnim - 7) / 3) * (38.75-(-10.23)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 38.75 + (((tickAnim - 10) / 3) * (82.61-(38.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 82.61 + (((tickAnim - 13) / 2) * (82.61-(82.61)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 82.61 + (((tickAnim - 15) / 3) * (11.25-(82.61)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 18) / 2) * (35-(11.25)));
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
            yy = -0.1 + (((tickAnim - 0) / 3) * (0.37-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.37 + (((tickAnim - 3) / 4) * (-0.15-(0.37)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 7) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.4-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 2.4 + (((tickAnim - 13) / 2) * (2.4-(2.4)));
            zz = -0.125 + (((tickAnim - 13) / 2) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 2.4 + (((tickAnim - 15) / 3) * (0.3-(2.4)));
            zz = -0.125 + (((tickAnim - 15) / 3) * (0.2-(-0.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 2) * (-0.1-(0.3)));
            zz = 0.2 + (((tickAnim - 18) / 2) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166-20))*0.4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334-200))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.334))*-4.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166-20))*0.02);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166-30))*-0.02);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*0.1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.33-280))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333))*3.5));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166+20))*-0.05);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166+30))*0.02);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -30.94367 + (((tickAnim - 0) / 3) * (-26-(-30.94367)));
            yy = 1.14452 + (((tickAnim - 0) / 3) * (0-(1.14452)));
            zz = -13.11468 + (((tickAnim - 0) / 3) * (0-(-13.11468)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = -26 + (((tickAnim - 3) / 9) * (30.58015-(-26)));
            yy = 0 + (((tickAnim - 3) / 9) * (3.58223-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (-5.42734-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 30.58015 + (((tickAnim - 12) / 8) * (-30.94367-(30.58015)));
            yy = 3.58223 + (((tickAnim - 12) / 8) * (1.14452-(3.58223)));
            zz = -5.42734 + (((tickAnim - 12) / 8) * (-13.11468-(-5.42734)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5.42277 + (((tickAnim - 0) / 3) * (24.5-(5.42277)));
            yy = -2.77203 + (((tickAnim - 0) / 3) * (0-(-2.77203)));
            zz = 17.98742 + (((tickAnim - 0) / 3) * (0-(17.98742)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 24.5 + (((tickAnim - 3) / 9) * (38.85748-(24.5)));
            yy = 0 + (((tickAnim - 3) / 9) * (2.51525-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (4.89274-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 38.85748 + (((tickAnim - 12) / 4) * (-22.48163-(38.85748)));
            yy = 2.51525 + (((tickAnim - 12) / 4) * (-1.39751-(2.51525)));
            zz = 4.89274 + (((tickAnim - 12) / 4) * (12.01657-(4.89274)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22.48163 + (((tickAnim - 16) / 2) * (-19.11096-(-22.48163)));
            yy = -1.39751 + (((tickAnim - 16) / 2) * (-4.33208-(-1.39751)));
            zz = 12.01657 + (((tickAnim - 16) / 2) * (17.35945-(12.01657)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -19.11096 + (((tickAnim - 18) / 2) * (5.42277-(-19.11096)));
            yy = -4.33208 + (((tickAnim - 18) / 2) * (-2.77203-(-4.33208)));
            zz = 17.35945 + (((tickAnim - 18) / 2) * (17.98742-(17.35945)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (0-(0.175)));
            zz = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 16) / 2) * (0.175-(0.525)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 2) * (0.175-(0.175)));
            zz = 0.225 + (((tickAnim - 18) / 2) * (0.225-(0.225)));
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
            xx = 58.25 + (((tickAnim - 0) / 3) * (0-(58.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-38.33-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -38.33 + (((tickAnim - 8) / 4) * (-15-(-38.33)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 12) / 3) * (89.25-(-15)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 89.25 + (((tickAnim - 15) / 2) * (89.25-(89.25)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 89.25 + (((tickAnim - 17) / 3) * (58.25-(89.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
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
            zz = -0.575 + (((tickAnim - 0) / 3) * (0-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0.725-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (-0.775-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 2) * (0.725-(0.725)));
            zz = -0.775 + (((tickAnim - 15) / 2) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.725 + (((tickAnim - 17) / 3) * (0-(0.725)));
            zz = -0.775 + (((tickAnim - 17) / 3) * (-0.575-(-0.775)));
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
            xx = 25.25 + (((tickAnim - 0) / 3) * (35-(25.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-6.91246-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.95479-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (6.98285-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.91246 + (((tickAnim - 8) / 3) * (-30.2-(-6.91246)));
            yy = -1.95479 + (((tickAnim - 8) / 3) * (0-(-1.95479)));
            zz = 6.98285 + (((tickAnim - 8) / 3) * (0-(6.98285)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -30.2 + (((tickAnim - 11) / 9) * (25.25-(-30.2)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6 + (((tickAnim - 0) / 3) * (9-(6)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9 + (((tickAnim - 3) / 3) * (-43.70096-(9)));
            yy = 0 + (((tickAnim - 3) / 3) * (-2.99978-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.03668-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -43.70096 + (((tickAnim - 6) / 2) * (-29.30096-(-43.70096)));
            yy = -2.99978 + (((tickAnim - 6) / 2) * (-2.99978-(-2.99978)));
            zz = 0.03668 + (((tickAnim - 6) / 2) * (0.03668-(0.03668)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -29.30096 + (((tickAnim - 8) / 3) * (29.35-(-29.30096)));
            yy = -2.99978 + (((tickAnim - 8) / 3) * (0-(-2.99978)));
            zz = 0.03668 + (((tickAnim - 8) / 3) * (0-(0.03668)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 29.35 + (((tickAnim - 11) / 9) * (6-(29.35)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.25 + (((tickAnim - 0) / 3) * (24-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 24 + (((tickAnim - 3) / 3) * (74.91542-(24)));
            yy = 0 + (((tickAnim - 3) / 3) * (1.53786-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-2.57616-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 74.91542 + (((tickAnim - 6) / 2) * (86.28059-(74.91542)));
            yy = 1.53786 + (((tickAnim - 6) / 2) * (2.17789-(1.53786)));
            zz = -2.57616 + (((tickAnim - 6) / 2) * (-3.65044-(-2.57616)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 86.28059 + (((tickAnim - 8) / 3) * (3-(86.28059)));
            yy = 2.17789 + (((tickAnim - 8) / 3) * (0-(2.17789)));
            zz = -3.65044 + (((tickAnim - 8) / 3) * (0-(-3.65044)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 11) / 5) * (-13.69-(3)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -13.69 + (((tickAnim - 16) / 4) * (-1.25-(-13.69)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 3) * (-0.35-(0.75)));
            zz = -0.225 + (((tickAnim - 3) / 3) * (-0.665-(-0.225)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 6) / 2) * (-0.35-(-0.35)));
            zz = -0.665 + (((tickAnim - 6) / 2) * (-0.665-(-0.665)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 3) * (0-(-0.35)));
            zz = -0.665 + (((tickAnim - 8) / 3) * (0-(-0.665)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 16) / 4) * (0-(0.425)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*-0.8), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-150))*2), body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+20))*-2.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.1666))*2), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333-150))*2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+20))*2.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+80))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+80))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+10))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+120))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166-50))*-1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+190))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+170))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.166-100))*-1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.333+170))*-3));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAraripesuchus entity = (EntityPrehistoricFloraAraripesuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+70))*-4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.7);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28.78695 + (((tickAnim - 0) / 6) * (30.96305-(-28.78695)));
            yy = -7.5479 + (((tickAnim - 0) / 6) * (-7.5479-(-7.5479)));
            zz = -0.28932 + (((tickAnim - 0) / 6) * (-0.28932-(-0.28932)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30.96305 + (((tickAnim - 6) / 2) * (-10.28326-(30.96305)));
            yy = -7.5479 + (((tickAnim - 6) / 2) * (-18.72511-(-7.5479)));
            zz = -0.28932 + (((tickAnim - 6) / 2) * (-16.74079-(-0.28932)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.28326 + (((tickAnim - 8) / 2) * (-28.78695-(-10.28326)));
            yy = -18.72511 + (((tickAnim - 8) / 2) * (-7.5479-(-18.72511)));
            zz = -16.74079 + (((tickAnim - 8) / 2) * (-0.28932-(-16.74079)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -10.25 + (((tickAnim - 0) / 6) * (24.75-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.75 + (((tickAnim - 6) / 2) * (-13.78-(24.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.78 + (((tickAnim - 8) / 2) * (-10.25-(-13.78)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 6) * (0-(-0.35)));
            zz = 0.25 + (((tickAnim - 0) / 6) * (0-(0.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.74-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.74 + (((tickAnim - 8) / 2) * (-0.35-(0.74)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.25-(0)));
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
            xx = 48.82209 + (((tickAnim - 0) / 2) * (16-(48.82209)));
            yy = 0.49593 + (((tickAnim - 0) / 2) * (0-(0.49593)));
            zz = 0.4529 + (((tickAnim - 0) / 2) * (0-(0.4529)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 16 + (((tickAnim - 2) / 4) * (33.07209-(16)));
            yy = 0 + (((tickAnim - 2) / 4) * (0.49593-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0.4529-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 33.07209 + (((tickAnim - 6) / 1) * (66.07209-(33.07209)));
            yy = 0.49593 + (((tickAnim - 6) / 1) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 6) / 1) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 66.07209 + (((tickAnim - 7) / 1) * (66.07209-(66.07209)));
            yy = 0.49593 + (((tickAnim - 7) / 1) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 7) / 1) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66.07209 + (((tickAnim - 8) / 2) * (48.82209-(66.07209)));
            yy = 0.49593 + (((tickAnim - 8) / 2) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 8) / 2) * (0.4529-(0.4529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (0.625-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 2) / 4) * (0-(0.625)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (2.225-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (-0.2-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.225 + (((tickAnim - 7) / 1) * (2.225-(2.225)));
            zz = -0.2 + (((tickAnim - 7) / 1) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.225 + (((tickAnim - 8) / 2) * (-0.325-(2.225)));
            zz = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -28.78695 + (((tickAnim - 0) / 4) * (40.11978-(-28.78695)));
            yy = 7.5479 + (((tickAnim - 0) / 4) * (6.37611-(7.5479)));
            zz = 0.2893 + (((tickAnim - 0) / 4) * (5.12446-(0.2893)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 40.11978 + (((tickAnim - 4) / 4) * (-10.05105-(40.11978)));
            yy = 6.37611 + (((tickAnim - 4) / 4) * (19.04407-(6.37611)));
            zz = 5.12446 + (((tickAnim - 4) / 4) * (17.45822-(5.12446)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10.05105 + (((tickAnim - 8) / 2) * (-28.78695-(-10.05105)));
            yy = 19.04407 + (((tickAnim - 8) / 2) * (7.5479-(19.04407)));
            zz = 17.45822 + (((tickAnim - 8) / 2) * (0.2893-(17.45822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -10.25 + (((tickAnim - 0) / 4) * (22.5-(-10.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 4) / 4) * (-13.78-(22.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.78 + (((tickAnim - 8) / 2) * (-10.25-(-13.78)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 4) * (0-(-0.35)));
            zz = 0.25 + (((tickAnim - 0) / 4) * (0-(0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0.94-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.94 + (((tickAnim - 7) / 1) * (0.74-(0.94)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.74 + (((tickAnim - 8) / 2) * (-0.35-(0.74)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 48.82209 + (((tickAnim - 0) / 2) * (-0.92791-(48.82209)));
            yy = 0.49593 + (((tickAnim - 0) / 2) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 0) / 2) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -0.92791 + (((tickAnim - 2) / 2) * (77.32209-(-0.92791)));
            yy = 0.49593 + (((tickAnim - 2) / 2) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 2) / 2) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 77.32209 + (((tickAnim - 4) / 3) * (66.07209-(77.32209)));
            yy = 0.49593 + (((tickAnim - 4) / 3) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 4) / 3) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 66.07209 + (((tickAnim - 7) / 1) * (66.07209-(66.07209)));
            yy = 0.49593 + (((tickAnim - 7) / 1) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 7) / 1) * (0.4529-(0.4529)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 66.07209 + (((tickAnim - 8) / 2) * (48.82209-(66.07209)));
            yy = 0.49593 + (((tickAnim - 8) / 2) * (0.49593-(0.49593)));
            zz = 0.4529 + (((tickAnim - 8) / 2) * (0.4529-(0.4529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 2) * (0.35-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 2) * (0.9-(0.35)));
            zz = 0 + (((tickAnim - 2) / 2) * (-0.45-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 4) / 3) * (2.225-(0.9)));
            zz = -0.45 + (((tickAnim - 4) / 3) * (-0.2-(-0.45)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.225 + (((tickAnim - 7) / 1) * (2.225-(2.225)));
            zz = -0.2 + (((tickAnim - 7) / 1) * (-0.2-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.225 + (((tickAnim - 8) / 2) * (-0.325-(2.225)));
            zz = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+140))*12), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+220))*-15), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45.81215 + (((tickAnim - 0) / 3) * (6.81839-(45.81215)));
            yy = 21.21895 + (((tickAnim - 0) / 3) * (5.0589-(21.21895)));
            zz = -18.53041 + (((tickAnim - 0) / 3) * (-46.7539-(-18.53041)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.81839 + (((tickAnim - 3) / 3) * (-22.5-(6.81839)));
            yy = 5.0589 + (((tickAnim - 3) / 3) * (0-(5.0589)));
            zz = -46.7539 + (((tickAnim - 3) / 3) * (0-(-46.7539)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 6) / 4) * (45.81215-(-22.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (21.21895-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-18.53041-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9 + (((tickAnim - 0) / 3) * (-23.05881-(9)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.8876-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (16.1059-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -23.05881 + (((tickAnim - 3) / 3) * (27.5-(-23.05881)));
            yy = 5.8876 + (((tickAnim - 3) / 3) * (0-(5.8876)));
            zz = 16.1059 + (((tickAnim - 3) / 3) * (0-(16.1059)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 6) / 4) * (9-(27.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15.5 + (((tickAnim - 0) / 3) * (67.25-(15.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 67.25 + (((tickAnim - 3) / 3) * (-6.5-(67.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 6) / 2) * (-24.85682-(-6.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.80753-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (6.76373-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.85682 + (((tickAnim - 8) / 2) * (15.5-(-24.85682)));
            yy = -1.80753 + (((tickAnim - 8) / 2) * (0-(-1.80753)));
            zz = 6.76373 + (((tickAnim - 8) / 2) * (0-(6.76373)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (-0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.15-(0)));
            zz = -0.475 + (((tickAnim - 3) / 3) * (0.025-(-0.475)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 2) * (0.84-(0.15)));
            zz = 0.025 + (((tickAnim - 6) / 2) * (0.02-(0.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.84 + (((tickAnim - 8) / 2) * (0-(0.84)));
            zz = 0.02 + (((tickAnim - 8) / 2) * (0-(0.02)));
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
            xx = 46.04584 + (((tickAnim - 0) / 3) * (6.81839-(46.04584)));
            yy = -19.85474 + (((tickAnim - 0) / 3) * (-5.05894-(-19.85474)));
            zz = 17.86437 + (((tickAnim - 0) / 3) * (46.75391-(17.86437)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.81839 + (((tickAnim - 3) / 2) * (-17.75-(6.81839)));
            yy = -5.05894 + (((tickAnim - 3) / 2) * (0-(-5.05894)));
            zz = 46.75391 + (((tickAnim - 3) / 2) * (0-(46.75391)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.75 + (((tickAnim - 5) / 5) * (46.04584-(-17.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (-19.85474-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (17.86437-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+140))*12-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.8876-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-16.10586-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+140))*12 + (((tickAnim - 3) / 0) * (-16.8421-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+140))*12)));
            yy = -5.8876 + (((tickAnim - 3) / 0) * (-1.96253-(-5.8876)));
            zz = -16.10586 + (((tickAnim - 3) / 0) * (-5.36862-(-16.10586)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.8421 + (((tickAnim - 3) / 2) * (37-(-16.8421)));
            yy = -1.96253 + (((tickAnim - 3) / 2) * (0-(-1.96253)));
            zz = -5.36862 + (((tickAnim - 3) / 2) * (0-(-5.36862)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 37 + (((tickAnim - 5) / 3) * (23.467-(37)));
            yy = 0 + (((tickAnim - 5) / 3) * (-5.63978-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-9.45952-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.467 + (((tickAnim - 8) / 2) * (22.5-(23.467)));
            yy = -5.63978 + (((tickAnim - 8) / 2) * (0-(-5.63978)));
            zz = -9.45952 + (((tickAnim - 8) / 2) * (0-(-9.45952)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 46.5 + (((tickAnim - 0) / 3) * (67.25-(46.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 67.25 + (((tickAnim - 3) / 0) * (61.5-(67.25)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 61.5 + (((tickAnim - 3) / 2) * (4.25-(61.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.25 + (((tickAnim - 5) / 3) * (-41.75-(4.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -41.75 + (((tickAnim - 8) / 2) * (46.5-(-41.75)));
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
            zz = -0.575 + (((tickAnim - 0) / 3) * (-0.475-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -0.475 + (((tickAnim - 3) / 0) * (-0.56-(-0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.56 + (((tickAnim - 3) / 2) * (0-(-0.56)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.575-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.29-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 2) * (0-(0.575)));
            zz = -0.29 + (((tickAnim - 8) / 2) * (-0.575-(-0.29)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-290))*-10), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0.325);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*-9), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+220))*10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+340))*4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+390))*-10), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }




        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAraripesuchus e = (EntityPrehistoricFloraAraripesuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
            animator.startKeyframe(5);
            animator.rotate(this.body3, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) -Math.toRadians(36), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
