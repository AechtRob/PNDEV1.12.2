package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKannemeyeria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKannemeyeria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tuskL;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tuskR;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;


    private ModelAnimator animator;

    public ModelKannemeyeria() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 1.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(-0.5F, -16.5F, 15.0F);
        this.root.addChild(hip);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -6.5F, -5.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -5.5F, 0.0F, 0.0F, 11, 12, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.2124F, 0.9279F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 84, 0, -2.5F, -0.0155F, 0.0097F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -8.2124F, -4.2471F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 95, -4.5F, -0.0049F, -0.0086F, 8, 2, 6, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(6.5F, 2.8736F, -4.2652F);
        this.hip.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.2131F, 0.1245F, -0.5996F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 54, 71, -3.5F, -2.0F, -3.5F, 6, 8, 7, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.25F, 4.75F, -1.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.2872F, -0.2297F, 0.571F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 96, 89, -1.5F, -0.5F, -2.5F, 3, 10, 6, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(1.0F, 8.25F, 0.5F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.1745F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 78, 47, -3.5F, -1.0F, -5.75F, 5, 3, 8, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-5.5F, 2.8736F, -4.2652F);
        this.hip.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.2131F, -0.1245F, 0.5996F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 69, 14, -2.5F, -2.0F, -3.5F, 6, 8, 7, 0.0F, false));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.25F, 4.75F, -1.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.2872F, 0.2297F, -0.571F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -1.5F, -0.5F, -2.5F, 3, 10, 6, 0.0F, false));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(-1.0F, 8.25F, 0.5F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.1745F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 0, 76, -1.5F, -1.0F, -5.75F, 5, 3, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.5F, -5.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, 0.0F, -19.0F, 15, 14, 19, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 50, 0, -5.5F, -3.5F, -15.0F, 12, 4, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -3.5F, -6.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 55, -5.5F, 0.0F, 0.0F, 11, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.5F, -15.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 30, -4.5F, 0.0F, -5.0F, 11, 4, 5, 0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -19.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 43, 34, -6.0F, 0.1736F, -7.0152F, 13, 12, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 65, 59, -4.0F, -2.4264F, -7.0152F, 9, 3, 8, 0.001F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(6.5F, 9.7736F, -2.5152F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.1796F, 0.1245F, -0.5996F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 44, 87, -2.5F, -2.0F, -3.5F, 5, 8, 6, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.5F, 4.75F, -1.0F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.3668F, 0.0439F, 0.5829F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 0, 103, -1.5F, -0.5F, -2.5F, 3, 9, 5, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(1.0F, 7.25F, 0.5F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, -0.0218F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 97, 40, -3.5F, -1.0F, -5.75F, 5, 3, 7, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-5.5F, 9.7736F, -2.5152F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.1796F, -0.1245F, 0.5996F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 21, 84, -2.5F, -2.0F, -3.5F, 5, 8, 6, 0.0F, false));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.5F, 4.75F, -1.0F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.3668F, -0.0439F, -0.5829F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 44, 102, -1.5F, -0.5F, -2.5F, 3, 9, 5, 0.0F, false));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-1.0F, 7.25F, 0.5F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, -0.0218F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 0, 92, -1.5F, -1.0F, -5.75F, 5, 3, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1736F, -6.0152F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 25, 67, -3.5F, 0.0F, -6.0F, 8, 10, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 19, 99, -2.5F, -2.5F, -6.0F, 6, 3, 6, -0.001F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 0.8444F, -5.2208F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 96, 18, -3.5F, -3.525F, -2.5F, 9, 8, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 8.2764F, -11.7467F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 57, -0.5F, -2.225F, 0.05F, 4, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 7.5264F, -11.1467F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6109F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 62, -0.5F, 0.1F, -0.775F, 4, 1, 2, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 8.2454F, -8.0804F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 86, 40, -0.5F, -3.4085F, -2.2419F, 5, 3, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 6.4204F, -5.8304F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 104, -1.5F, -3.4053F, -2.888F, 6, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3316F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 75, 83, -2.5F, -4.325F, -5.5F, 7, 5, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 3.225F, -10.975F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.1519F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 34, -2.0F, 0.2131F, -3.0426F, 4, 3, 4, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, 2.3843F, -7.8371F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5418F, -0.4205F, -0.1486F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 99, 106, -1.5F, -0.6F, -1.2F, 4, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.25F, 2.3843F, -7.8371F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5418F, 0.4205F, 0.1486F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 109, 7, -2.5F, -0.6F, -1.2F, 4, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.925F, -7.825F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 104, -2.0F, 0.0078F, -2.9901F, 4, 4, 4, 0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.925F, -7.8F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6807F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 89, 7, -3.0F, -0.0107F, -0.007F, 6, 3, 7, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(1.0F, 4.5008F, 1.4672F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 50, 14, -2.5F, 4.1892F, -8.1606F, 5, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 92, 59, -4.5F, -0.0258F, -3.9672F, 9, 4, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 81, 71, -3.5F, -3.7758F, -5.9672F, 7, 5, 6, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.0008F, -2.4672F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3316F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 102, 67, -2.5F, 0.675F, -5.5F, 7, 4, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 3.7445F, -9.5476F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 105, 0, -0.5F, -0.4085F, -2.2419F, 5, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 1.9195F, -7.2976F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.6545F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 105, 51, -1.5F, -0.4053F, -2.838F, 6, 3, 3, 0.0F, false));

        this.tuskL = new AdvancedModelRenderer(this);
        this.tuskL.setRotationPoint(3.375F, 7.115F, -8.7184F);
        this.head.addChild(tuskL);
        this.setRotateAngle(tuskL, 0.4012F, 0.1312F, -0.1334F);
        this.tuskL.cubeList.add(new ModelBox(tuskL, 50, 0, -0.5F, -1.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 2.0F, -0.5F);
        this.tuskL.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3488F, -0.105F, 0.1462F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 0, -1.1F, -0.2F, -0.3F, 1, 2, 1, 0.0F, false));

        this.tuskR = new AdvancedModelRenderer(this);
        this.tuskR.setRotationPoint(-1.375F, 7.115F, -8.7184F);
        this.head.addChild(tuskR);
        this.setRotateAngle(tuskR, 0.4012F, -0.1312F, 0.1334F);
        this.tuskR.cubeList.add(new ModelBox(tuskR, 0, 34, -0.5F, -1.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 2.0F, -0.5F);
        this.tuskR.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3488F, 0.105F, -0.1462F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.1F, -0.2F, -0.3F, 1, 2, 1, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.0F, 2.4501F, -7.8828F);
        this.head.addChild(eye);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.8214F, -0.1167F, 0.3895F);
        this.eye.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5643F, 0.4349F, 0.2145F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 40, -0.6F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.8214F, -0.1167F, 0.3895F);
        this.eye.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5643F, -0.4349F, -0.2145F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 40, -0.4F, -0.6F, -1.0F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -2.05F, 3.8F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -1.1345F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 57, -2.0F, 0.05F, 0.0F, 6, 6, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.55F, 8.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 103, 78, -0.5F, 0.0046F, -0.0521F, 3, 3, 5, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.neck.offsetZ = -0.05F;
        this.neck.offsetY = -0.04F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.15F, 0.1F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -1.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, -0.3F, 0.0F, -0.2F);
        this.setRotateAngle(frontLeftLeg2, -0.4F, 0.0F, 0.2F);
        this.setRotateAngle(frontLeftLeg3, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.9F, 0.0F, 0.2F);
        this.setRotateAngle(frontRightLeg2, -0.7F, 0.0F, -0.2F);
        this.setRotateAngle(frontRightLeg3, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.5F, 0.0F, -0.3F);
        this.setRotateAngle(backLeftLeg2, 0.5F, 0.0F, 0.2F);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.3F, 0.0F, 0.3F);
        this.setRotateAngle(backRightLeg2, 0.3F, 0.0F, -0.3F);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, 0.0F);
        this.neck.offsetZ = 0.02F;
        this.hip.offsetY = 0.13F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.30F;
        this.hip.offsetX = 1.2F;
        this.hip.rotateAngleY = (float)Math.toRadians(130);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 2.0F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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
        this.hip.offsetY = 1.50F;

        EntityPrehistoricFloraKannemeyeria entityKannemeyeria = (EntityPrehistoricFloraKannemeyeria) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};


        if (entityKannemeyeria.getAnimation() == entityKannemeyeria.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityKannemeyeria.isReallyInWater()) {

                if (f3 == 0.0F || !entityKannemeyeria.getIsMoving()) {
                    if (entityKannemeyeria.getAnimation() != entityKannemeyeria.EAT_ANIMATION
                            && entityKannemeyeria.getAnimation() != entityKannemeyeria.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityKannemeyeria.getIsFast()) { //Running


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
        EntityPrehistoricFloraKannemeyeria ee = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 230;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 210) {
            xx = 2 + (((tickAnim - 45) / 165) * (2-(2)));
            yy = 0 + (((tickAnim - 45) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 165) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = 2 + (((tickAnim - 210) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 210) {
            xx = 1.25 + (((tickAnim - 45) / 165) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 45) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 165) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = 1.25 + (((tickAnim - 210) / 20) * (0-(1.25)));
            yy = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = -31.25 + (((tickAnim - 15) / 30) * (-37.25-(-31.25)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 210) {
            xx = -37.25 + (((tickAnim - 45) / 165) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 45) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 165) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = -37.25 + (((tickAnim - 210) / 20) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-44.09621-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.15073-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -44.09621 + (((tickAnim - 8) / 7) * (-4.75-(-44.09621)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -0.15073 + (((tickAnim - 8) / 7) * (-1.25-(-0.15073)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = -4.75 + (((tickAnim - 15) / 30) * (-4.59458-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 30) * (-5.67882-(0)));
            zz = -1.25 + (((tickAnim - 15) / 30) * (-2.67701-(-1.25)));
        }
        else if (tickAnim >= 45 && tickAnim < 210) {
            xx = -4.59458 + (((tickAnim - 45) / 165) * (-4.59458-(-4.59458)));
            yy = -5.67882 + (((tickAnim - 45) / 165) * (-5.67882-(-5.67882)));
            zz = -2.67701 + (((tickAnim - 45) / 165) * (-2.67701-(-2.67701)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = -4.59458 + (((tickAnim - 210) / 10) * (-34.125-(-4.59458)));
            yy = -5.67882 + (((tickAnim - 210) / 10) * (0-(-5.67882)));
            zz = -2.67701 + (((tickAnim - 210) / 10) * (-0.625-(-2.67701)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = -34.125 + (((tickAnim - 220) / 10) * (0-(-34.125)));
            yy = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            zz = -0.625 + (((tickAnim - 220) / 10) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            yy = -0.925 + (((tickAnim - 15) / 195) * (-0.925-(-0.925)));
            zz = 0 + (((tickAnim - 15) / 195) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            yy = -0.925 + (((tickAnim - 210) / 20) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (67.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 67.25 + (((tickAnim - 8) / 7) * (31.5-(67.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 210) {
            xx = 31.5 + (((tickAnim - 15) / 195) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 15) / 195) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 195) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 31.5 + (((tickAnim - 210) / 10) * (90.5-(31.5)));
            yy = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 10) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = 90.5 + (((tickAnim - 220) / 10) * (0-(90.5)));
            yy = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 210) {
            xx = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 210) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 210) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 210) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 210) / 10) * (1.125-(0)));
            zz = 0 + (((tickAnim - 210) / 10) * (-1.225-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 220) / 10) * (0-(0)));
            yy = 1.125 + (((tickAnim - 220) / 10) * (0-(1.125)));
            zz = -1.225 + (((tickAnim - 220) / 10) * (0-(-1.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 210) {
            xx = -6.75 + (((tickAnim - 45) / 165) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 45) / 165) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 165) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = -6.75 + (((tickAnim - 210) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 6.5 + (((tickAnim - 45) / 10) * (7.25-(6.5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7.25 + (((tickAnim - 55) / 5) * (6-(7.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 6 + (((tickAnim - 60) / 5) * (5.25-(6)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 5.25 + (((tickAnim - 65) / 7) * (4.25-(5.25)));
            yy = 0 + (((tickAnim - 65) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 7) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 4.25 + (((tickAnim - 72) / 8) * (10.22266-(4.25)));
            yy = 0 + (((tickAnim - 72) / 8) * (-1.51632-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (-3.40283-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 10.22266 + (((tickAnim - 80) / 8) * (3.75213-(10.22266)));
            yy = -1.51632 + (((tickAnim - 80) / 8) * (-0.2346-(-1.51632)));
            zz = -3.40283 + (((tickAnim - 80) / 8) * (-0.50741-(-3.40283)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 3.75213 + (((tickAnim - 88) / 10) * (-2.8729+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*3-(3.75213)));
            yy = -0.2346 + (((tickAnim - 88) / 10) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 88) / 10) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = -2.8729+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*3 + (((tickAnim - 98) / 17) * (-6.49787-(-2.8729+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*3)));
            yy = -0.2346 + (((tickAnim - 98) / 17) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 98) / 17) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -6.49787 + (((tickAnim - 115) / 10) * (-5.99787-(-6.49787)));
            yy = -0.2346 + (((tickAnim - 115) / 10) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 115) / 10) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -5.99787 + (((tickAnim - 125) / 10) * (-6.49787-(-5.99787)));
            yy = -0.2346 + (((tickAnim - 125) / 10) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 125) / 10) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -6.49787 + (((tickAnim - 135) / 20) * (-5.99787-(-6.49787)));
            yy = -0.2346 + (((tickAnim - 135) / 20) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 135) / 20) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 155 && tickAnim < 178) {
            xx = -5.99787 + (((tickAnim - 155) / 23) * (2.00213-(-5.99787)));
            yy = -0.2346 + (((tickAnim - 155) / 23) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 155) / 23) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 2.00213 + (((tickAnim - 178) / 7) * (3.25213-(2.00213)));
            yy = -0.2346 + (((tickAnim - 178) / 7) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 178) / 7) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 185 && tickAnim < 188) {
            xx = 3.25213 + (((tickAnim - 185) / 3) * (2.00213-(3.25213)));
            yy = -0.2346 + (((tickAnim - 185) / 3) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 185) / 3) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 188 && tickAnim < 195) {
            xx = 2.00213 + (((tickAnim - 188) / 7) * (1.00213-(2.00213)));
            yy = -0.2346 + (((tickAnim - 188) / 7) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 188) / 7) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 1.00213 + (((tickAnim - 195) / 8) * (4.75213-(1.00213)));
            yy = -0.2346 + (((tickAnim - 195) / 8) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 195) / 8) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 203 && tickAnim < 210) {
            xx = 4.75213 + (((tickAnim - 203) / 7) * (1.00213-(4.75213)));
            yy = -0.2346 + (((tickAnim - 203) / 7) * (-0.2346-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 203) / 7) * (-0.50741-(-0.50741)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = 1.00213 + (((tickAnim - 210) / 20) * (0-(1.00213)));
            yy = -0.2346 + (((tickAnim - 210) / 20) * (0-(-0.2346)));
            zz = -0.50741 + (((tickAnim - 210) / 20) * (0-(-0.50741)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 0) / 89) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 89) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 89) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 89) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 26) * (1.1-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 1.1 + (((tickAnim - 115) / 20) * (1.1-(1.1)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 20) * (0-(0)));
            zz = 1.1 + (((tickAnim - 135) / 20) * (1.1-(1.1)));
        }
        else if (tickAnim >= 155 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 155) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 23) * (0-(0)));
            zz = 1.1 + (((tickAnim - 155) / 23) * (0-(1.1)));
        }
        else if (tickAnim >= 178 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 178) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 178) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 10) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 188) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 7.5 + (((tickAnim - 45) / 10) * (5-(7.5)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 55) / 5) * (11-(5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 11 + (((tickAnim - 60) / 12) * (12.75-(11)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 12.75 + (((tickAnim - 72) / 8) * (3.5-(12.75)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 3.5 + (((tickAnim - 80) / 8) * (12.75-(3.5)));
            yy = 0 + (((tickAnim - 80) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 98) {
            xx = 12.75 + (((tickAnim - 88) / 10) * (5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5-(12.75)));
            yy = 0 + (((tickAnim - 88) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 10) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 115) {
            xx = 5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5 + (((tickAnim - 98) / 17) * (-1.51975-(5.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*5)));
            yy = 0 + (((tickAnim - 98) / 17) * (9.2468-(0)));
            zz = 0 + (((tickAnim - 98) / 17) * (-0.24426-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -1.51975 + (((tickAnim - 115) / 10) * (-2.01975-(-1.51975)));
            yy = 9.2468 + (((tickAnim - 115) / 10) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 115) / 10) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -2.01975 + (((tickAnim - 125) / 3) * (-1.64475-(-2.01975)));
            yy = 9.2468 + (((tickAnim - 125) / 3) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 125) / 3) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = -1.64475 + (((tickAnim - 128) / 2) * (-2.01975-(-1.64475)));
            yy = 9.2468 + (((tickAnim - 128) / 2) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 128) / 2) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 130 && tickAnim < 133) {
            xx = -2.01975 + (((tickAnim - 130) / 3) * (-1.64475-(-2.01975)));
            yy = 9.2468 + (((tickAnim - 130) / 3) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 130) / 3) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = -1.64475 + (((tickAnim - 133) / 2) * (-2.01975-(-1.64475)));
            yy = 9.2468 + (((tickAnim - 133) / 2) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 133) / 2) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 135 && tickAnim < 155) {
            xx = -2.01975 + (((tickAnim - 135) / 20) * (-2.01975-(-2.01975)));
            yy = 9.2468 + (((tickAnim - 135) / 20) * (9.2468-(9.2468)));
            zz = -0.24426 + (((tickAnim - 135) / 20) * (-0.24426-(-0.24426)));
        }
        else if (tickAnim >= 155 && tickAnim < 178) {
            xx = -2.01975 + (((tickAnim - 155) / 23) * (9.75-(-2.01975)));
            yy = 9.2468 + (((tickAnim - 155) / 23) * (0-(9.2468)));
            zz = -0.24426 + (((tickAnim - 155) / 23) * (0-(-0.24426)));
        }
        else if (tickAnim >= 178 && tickAnim < 185) {
            xx = 9.75 + (((tickAnim - 178) / 7) * (6.75-(9.75)));
            yy = 0 + (((tickAnim - 178) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 7) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 188) {
            xx = 6.75 + (((tickAnim - 185) / 3) * (9.75-(6.75)));
            yy = 0 + (((tickAnim - 185) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 3) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 195) {
            xx = 9.75 + (((tickAnim - 188) / 7) * (11.25-(9.75)));
            yy = 0 + (((tickAnim - 188) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 7) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 11.25 + (((tickAnim - 195) / 8) * (5-(11.25)));
            yy = 0 + (((tickAnim - 195) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 8) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 210) {
            xx = 5 + (((tickAnim - 203) / 7) * (11.25-(5)));
            yy = 0 + (((tickAnim - 203) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 7) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 230) {
            xx = 11.25 + (((tickAnim - 210) / 20) * (0-(11.25)));
            yy = 0 + (((tickAnim - 210) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 55) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 65) / 3) * (2.5-(0)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 2.5 + (((tickAnim - 68) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 72) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 72) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 8) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 12.25 + (((tickAnim - 80) / 4) * (0-(12.25)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 88) / 5) * (1-(0)));
            yy = 0 + (((tickAnim - 88) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 5) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 98) {
            xx = 1 + (((tickAnim - 93) / 5) * (0-(1)));
            yy = 0 + (((tickAnim - 93) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 5) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 179) {
            xx = 0 + (((tickAnim - 98) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 81) * (0-(0)));
        }
        else if (tickAnim >= 179 && tickAnim < 185) {
            xx = 0 + (((tickAnim - 179) / 6) * (15.25-(0)));
            yy = 0 + (((tickAnim - 179) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 179) / 6) * (0-(0)));
        }
        else if (tickAnim >= 185 && tickAnim < 188) {
            xx = 15.25 + (((tickAnim - 185) / 3) * (0-(15.25)));
            yy = 0 + (((tickAnim - 185) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 185) / 3) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 188) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 7) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 195) / 8) * (18.5-(0)));
            yy = 0 + (((tickAnim - 195) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 8) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 210) {
            xx = 18.5 + (((tickAnim - 203) / 7) * (0-(18.5)));
            yy = 0 + (((tickAnim - 203) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 7) * (0-(0)));
        }
        else if (tickAnim >= 210 && tickAnim < 215) {
            xx = 0 + (((tickAnim - 210) / 5) * (3.5-(0)));
            yy = 0 + (((tickAnim - 210) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 210) / 5) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 220) {
            xx = 3.5 + (((tickAnim - 215) / 5) * (0-(3.5)));
            yy = 0 + (((tickAnim - 215) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 65 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 65) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 3) * (0.0175-(1)));
            zz = 1 + (((tickAnim - 65) / 3) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 1 + (((tickAnim - 68) / 4) * (1-(1)));
            yy = 0.0175 + (((tickAnim - 68) / 4) * (1-(0.0175)));
            zz = 1 + (((tickAnim - 68) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 9) / 11) * (0-(9.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7.68-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 7.68 + (((tickAnim - 5) / 4) * (9.5-(7.68)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 9.5 + (((tickAnim - 9) / 6) * (13.75-(9.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 15) / 5) * (0-(13.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 19.25 + (((tickAnim - 9) / 3) * (0-(19.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0825-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = 0.0825 + (((tickAnim - 3) / 2) * (1-(0.0825)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -31.25 + (((tickAnim - 17) / 8) * (28.75-(-31.25)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 28.75 + (((tickAnim - 25) / 10) * (-31.25-(28.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -31.25 + (((tickAnim - 35) / 8) * (28.75-(-31.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 28.75 + (((tickAnim - 43) / 7) * (0-(28.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-36.62-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -36.62 + (((tickAnim - 8) / 9) * (0.25-(-36.62)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 17) / 8) * (13.25-(0.25)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 13.25 + (((tickAnim - 25) / 5) * (-51-(13.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -51 + (((tickAnim - 30) / 5) * (0.25-(-51)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0.25 + (((tickAnim - 35) / 8) * (13.25-(0.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 13.25 + (((tickAnim - 43) / 4) * (-41.63-(13.25)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -41.63 + (((tickAnim - 47) / 3) * (0-(-41.63)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -1.1 + (((tickAnim - 17) / 8) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = -1.1 + (((tickAnim - 35) / 8) * (0-(-1.1)));
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
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (67.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 67.75 + (((tickAnim - 8) / 9) * (23.5-(67.75)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 23.5 + (((tickAnim - 17) / 4) * (-7.37-(23.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -7.37 + (((tickAnim - 21) / 4) * (76.75-(-7.37)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 76.75 + (((tickAnim - 25) / 5) * (92.88-(76.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 92.88 + (((tickAnim - 30) / 5) * (23.5-(92.88)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 23.5 + (((tickAnim - 35) / 4) * (-7.37-(23.5)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -7.37 + (((tickAnim - 39) / 4) * (76.75-(-7.37)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 76.75 + (((tickAnim - 43) / 4) * (83.12-(76.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 83.12 + (((tickAnim - 47) / 3) * (0-(83.12)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 9) * (0-(1.5)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (1.625-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 1.625 + (((tickAnim - 30) / 5) * (0-(1.625)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 35) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 12) * (2.275-(0)));
            zz = 0 + (((tickAnim - 35) / 12) * (-0.6-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 2.275 + (((tickAnim - 47) / 3) * (0-(2.275)));
            zz = -0.6 + (((tickAnim - 47) / 3) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 17) / 8) * (3.70131-(5)));
            yy = -12.75 + (((tickAnim - 17) / 8) * (-12.68478-(-12.75)));
            zz = 0 + (((tickAnim - 17) / 8) * (5.89436-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 3.70131 + (((tickAnim - 25) / 10) * (5-(3.70131)));
            yy = -12.68478 + (((tickAnim - 25) / 10) * (-12.75-(-12.68478)));
            zz = 5.89436 + (((tickAnim - 25) / 10) * (0-(5.89436)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 35) / 8) * (3.70131-(5)));
            yy = -12.75 + (((tickAnim - 35) / 8) * (-12.68478-(-12.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (5.89436-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.70131 + (((tickAnim - 43) / 7) * (0-(3.70131)));
            yy = -12.68478 + (((tickAnim - 43) / 7) * (0-(-12.68478)));
            zz = 5.89436 + (((tickAnim - 43) / 7) * (0-(5.89436)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 17) / 8) * (6.84138-(6.75)));
            yy = -11.75 + (((tickAnim - 17) / 8) * (-14.97718-(-11.75)));
            zz = 0 + (((tickAnim - 17) / 8) * (-0.39522-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 6.84138 + (((tickAnim - 25) / 10) * (6.75-(6.84138)));
            yy = -14.97718 + (((tickAnim - 25) / 10) * (-11.75-(-14.97718)));
            zz = -0.39522 + (((tickAnim - 25) / 10) * (0-(-0.39522)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 6.75 + (((tickAnim - 35) / 8) * (6.84138-(6.75)));
            yy = -11.75 + (((tickAnim - 35) / 8) * (-14.97718-(-11.75)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.39522-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6.84138 + (((tickAnim - 43) / 7) * (0-(6.84138)));
            yy = -14.97718 + (((tickAnim - 43) / 7) * (0-(-14.97718)));
            zz = -0.39522 + (((tickAnim - 43) / 7) * (0-(-0.39522)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -6.25 + (((tickAnim - 20) / 13) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 33) / 17) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.05-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = -5.05 + (((tickAnim - 20) / 13) * (-5.05-(-5.05)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5.05 + (((tickAnim - 33) / 17) * (0-(-5.05)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -3.75 + (((tickAnim - 20) / 13) * (-3.75-(-3.75)));
            yy = -16.5 + (((tickAnim - 20) / 13) * (-16.5-(-16.5)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 33) / 17) * (0-(-3.75)));
            yy = -16.5 + (((tickAnim - 33) / 17) * (0-(-16.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 37.75 + (((tickAnim - 20) / 13) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 37.75 + (((tickAnim - 33) / 17) * (0-(37.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.475-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0.925 + (((tickAnim - 20) / 13) * (0.925-(0.925)));
            zz = -1.475 + (((tickAnim - 20) / 13) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.925 + (((tickAnim - 33) / 17) * (0-(0.925)));
            zz = -1.475 + (((tickAnim - 33) / 17) * (0-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -17 + (((tickAnim - 20) / 13) * (-17-(-17)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 33) / 17) * (0-(-17)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 13) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.125 + (((tickAnim - 33) / 17) * (0-(1.125)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (16.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -3.75 + (((tickAnim - 20) / 13) * (-3.75-(-3.75)));
            yy = 16.5 + (((tickAnim - 20) / 13) * (16.5-(16.5)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 33) / 17) * (0-(-3.75)));
            yy = 16.5 + (((tickAnim - 33) / 17) * (0-(16.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 37.75 + (((tickAnim - 20) / 13) * (37.75-(37.75)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 37.75 + (((tickAnim - 33) / 17) * (0-(37.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.475-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0.925 + (((tickAnim - 20) / 13) * (0.925-(0.925)));
            zz = -1.475 + (((tickAnim - 20) / 13) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.925 + (((tickAnim - 33) / 17) * (0-(0.925)));
            zz = -1.475 + (((tickAnim - 33) / 17) * (0-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -17 + (((tickAnim - 20) / 13) * (-17-(-17)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 33) / 17) * (0-(-17)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 1.125 + (((tickAnim - 20) / 13) * (1.125-(1.125)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.125 + (((tickAnim - 33) / 17) * (0-(1.125)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 20) / 13) * (-2-(-2)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 20) / 13) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 33) / 17) * (0-(9.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -35.5 + (((tickAnim - 20) / 13) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -35.5 + (((tickAnim - 33) / 17) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 32 + (((tickAnim - 20) / 13) * (32-(32)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 33) / 17) * (0-(32)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -35.5 + (((tickAnim - 20) / 13) * (-35.5-(-35.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -35.5 + (((tickAnim - 33) / 17) * (0-(-35.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 32 + (((tickAnim - 20) / 13) * (32-(32)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 33) / 17) * (0-(32)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 31;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -3.5 + (((tickAnim - 17) / 7) * (-2.11538-(-3.5)));
            yy = -1.25 + (((tickAnim - 17) / 7) * (-0.57692-(-1.25)));
            zz = 0 + (((tickAnim - 17) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*2-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -2.11538 + (((tickAnim - 24) / 8) * (0-(-2.11538)));
            yy = -0.57692 + (((tickAnim - 24) / 8) * (0-(-0.57692)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*2 + (((tickAnim - 24) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+20))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.55-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 15) * (0-(0)));
            zz = 0.55 + (((tickAnim - 17) / 15) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 3) / 14) * (-9.75333-(0)));
            yy = 0 + (((tickAnim - 3) / 14) * (-1.99079-(0)));
            zz = 0 + (((tickAnim - 3) / 14) * (0.19177-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -9.75333 + (((tickAnim - 17) / 7) * (-4.00154-(-9.75333)));
            yy = -1.99079 + (((tickAnim - 17) / 7) * (-0.91883-(-1.99079)));
            zz = 0.19177 + (((tickAnim - 17) / 7) * (0.0885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2-(0.19177)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -4.00154 + (((tickAnim - 24) / 8) * (0-(-4.00154)));
            yy = -0.91883 + (((tickAnim - 24) / 8) * (0-(-0.91883)));
            zz = 0.0885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2 + (((tickAnim - 24) / 8) * (0-(0.0885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-100))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18 + (((tickAnim - 13) / 4) * (19-(18)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 19 + (((tickAnim - 17) / 5) * (0-(19)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.0625-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 3) / 2) * (1-(0.0625)));
            zz = 1 + (((tickAnim - 3) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 23.91612 + (((tickAnim - 0) / 5) * (1.69575-(23.91612)));
            yy = -1.6726 + (((tickAnim - 0) / 5) * (-3.6666-(-1.6726)));
            zz = -4.1582 + (((tickAnim - 0) / 5) * (-12.0583-(-4.1582)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 1.69575 + (((tickAnim - 5) / 7) * (-18.00906-(1.69575)));
            yy = -3.6666 + (((tickAnim - 5) / 7) * (-5.1797-(-3.6666)));
            zz = -12.0583 + (((tickAnim - 5) / 7) * (3.039-(-12.0583)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -18.00906 + (((tickAnim - 12) / 13) * (37.3225-(-18.00906)));
            yy = -5.1797 + (((tickAnim - 12) / 13) * (-0.6388-(-5.1797)));
            zz = 3.039 + (((tickAnim - 12) / 13) * (1.3687-(3.039)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 37.3225 + (((tickAnim - 25) / 3) * (23.91612-(37.3225)));
            yy = -0.6388 + (((tickAnim - 25) / 3) * (-1.6726-(-0.6388)));
            zz = 1.3687 + (((tickAnim - 25) / 3) * (-4.1582-(1.3687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.79217 + (((tickAnim - 0) / 5) * (-2.72089-(16.79217)));
            yy = 0.87246 + (((tickAnim - 0) / 5) * (-2.3266-(0.87246)));
            zz = 0.14569 + (((tickAnim - 0) / 5) * (-0.3885-(0.14569)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -2.72089 + (((tickAnim - 5) / 7) * (-4.91656-(-2.72089)));
            yy = -2.3266 + (((tickAnim - 5) / 7) * (-6.041-(-2.3266)));
            zz = -0.3885 + (((tickAnim - 5) / 7) * (-3.42338-(-0.3885)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -4.91656 + (((tickAnim - 12) / 16) * (16.79217-(-4.91656)));
            yy = -6.041 + (((tickAnim - 12) / 16) * (0.87246-(-6.041)));
            zz = -3.42338 + (((tickAnim - 12) / 16) * (0.14569-(-3.42338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.925-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0.925 + (((tickAnim - 5) / 7) * (0-(0.925)));
            yy = 2.1 + (((tickAnim - 5) / 7) * (-0.6-(2.1)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            yy = -0.6 + (((tickAnim - 12) / 16) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
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
            xx = 75.13271 + (((tickAnim - 0) / 5) * (31.47942-(75.13271)));
            yy = -0.14448 + (((tickAnim - 0) / 5) * (-0.57632-(-0.14448)));
            zz = 0.51279 + (((tickAnim - 0) / 5) * (2.04549-(0.51279)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 31.47942 + (((tickAnim - 5) / 4) * (7.93194-(31.47942)));
            yy = -0.57632 + (((tickAnim - 5) / 4) * (-0.90565-(-0.57632)));
            zz = 2.04549 + (((tickAnim - 5) / 4) * (3.21435-(2.04549)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 7.93194 + (((tickAnim - 9) / 3) * (22.94302-(7.93194)));
            yy = -0.90565 + (((tickAnim - 9) / 3) * (1.35561-(-0.90565)));
            zz = 3.21435 + (((tickAnim - 9) / 3) * (-4.81318-(3.21435)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 22.94302 + (((tickAnim - 12) / 2) * (10.63038-(22.94302)));
            yy = 1.35561 + (((tickAnim - 12) / 2) * (-0.66709-(1.35561)));
            zz = -4.81318 + (((tickAnim - 12) / 2) * (2.36765-(-4.81318)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 10.63038 + (((tickAnim - 14) / 6) * (-8.60803-(10.63038)));
            yy = -0.66709 + (((tickAnim - 14) / 6) * (-0.59815-(-0.66709)));
            zz = 2.36765 + (((tickAnim - 14) / 6) * (2.12298-(2.36765)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -8.60803 + (((tickAnim - 20) / 8) * (75.13271-(-8.60803)));
            yy = -0.59815 + (((tickAnim - 20) / 8) * (-0.14448-(-0.59815)));
            zz = 2.12298 + (((tickAnim - 20) / 8) * (0.51279-(2.12298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.64 + (((tickAnim - 0) / 5) * (0.45-(1.64)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 5) / 4) * (0-(0.45)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 12) / 5) * (0.325-(-0.75)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 17) / 3) * (-0.175-(0.325)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -0.175 + (((tickAnim - 20) / 8) * (1.64-(-0.175)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
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
            xx = -1.00906 + (((tickAnim - 0) / 11) * (37.3225-(-1.00906)));
            yy = 5.17965 + (((tickAnim - 0) / 11) * (0.6388-(5.17965)));
            zz = -3.039 + (((tickAnim - 0) / 11) * (-1.36875-(-3.039)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 37.3225 + (((tickAnim - 11) / 7) * (1.69575-(37.3225)));
            yy = 0.6388 + (((tickAnim - 11) / 7) * (3.66662-(0.6388)));
            zz = -1.36875 + (((tickAnim - 11) / 7) * (12.05834-(-1.36875)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.69575 + (((tickAnim - 18) / 5) * (-18.00906-(1.69575)));
            yy = 3.66662 + (((tickAnim - 18) / 5) * (5.17965-(3.66662)));
            zz = 12.05834 + (((tickAnim - 18) / 5) * (-3.039-(12.05834)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -18.00906 + (((tickAnim - 23) / 5) * (-1.00906-(-18.00906)));
            yy = 5.17965 + (((tickAnim - 23) / 5) * (5.17965-(5.17965)));
            zz = -3.039 + (((tickAnim - 23) / 5) * (-3.039-(-3.039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.69743 + (((tickAnim - 0) / 11) * (26.5-(-0.69743)));
            yy = 6.41825 + (((tickAnim - 0) / 11) * (0-(6.41825)));
            zz = 1.0718 + (((tickAnim - 0) / 11) * (0-(1.0718)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 11) / 2) * (16.79217-(26.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.87246-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.14569-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 16.79217 + (((tickAnim - 13) / 5) * (-2.72089-(16.79217)));
            yy = 0.87246 + (((tickAnim - 13) / 5) * (2.32655-(0.87246)));
            zz = 0.14569 + (((tickAnim - 13) / 5) * (0.38852-(0.14569)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -2.72089 + (((tickAnim - 18) / 5) * (-7.19743-(-2.72089)));
            yy = 2.32655 + (((tickAnim - 18) / 5) * (6.41825-(2.32655)));
            zz = 0.38852 + (((tickAnim - 18) / 5) * (1.0718-(0.38852)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -7.19743 + (((tickAnim - 23) / 5) * (-0.69743-(-7.19743)));
            yy = 6.41825 + (((tickAnim - 23) / 5) * (6.41825-(6.41825)));
            zz = 1.0718 + (((tickAnim - 23) / 5) * (1.0718-(1.0718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 11) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (-0.925-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (2.1-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -0.925 + (((tickAnim - 18) / 5) * (0-(-0.925)));
            yy = 2.1 + (((tickAnim - 18) / 5) * (-0.6-(2.1)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
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
            xx = 4.95883 + (((tickAnim - 0) / 7) * (-8.3217-(4.95883)));
            yy = -1.15264 + (((tickAnim - 0) / 7) * (-1.1507-(-1.15264)));
            zz = 4.09099 + (((tickAnim - 0) / 7) * (4.0841-(4.09099)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -8.3217 + (((tickAnim - 7) / 4) * (49.25-(-8.3217)));
            yy = -1.1507 + (((tickAnim - 7) / 4) * (0-(-1.1507)));
            zz = 4.0841 + (((tickAnim - 7) / 4) * (0-(4.0841)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 49.25 + (((tickAnim - 11) / 2) * (75.13271-(49.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.14448-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.51279-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 75.13271 + (((tickAnim - 13) / 5) * (31.47942-(75.13271)));
            yy = -0.14448 + (((tickAnim - 13) / 5) * (-0.57632-(-0.14448)));
            zz = 0.51279 + (((tickAnim - 13) / 5) * (2.04549-(0.51279)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 31.47942 + (((tickAnim - 18) / 3) * (7.93194-(31.47942)));
            yy = -0.57632 + (((tickAnim - 18) / 3) * (-0.90565-(-0.57632)));
            zz = 2.04549 + (((tickAnim - 18) / 3) * (3.21435-(2.04549)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 7.93194 + (((tickAnim - 21) / 2) * (25.70883-(7.93194)));
            yy = -0.90565 + (((tickAnim - 21) / 2) * (-1.15264-(-0.90565)));
            zz = 3.21435 + (((tickAnim - 21) / 2) * (4.09099-(3.21435)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 25.70883 + (((tickAnim - 23) / 5) * (4.95883-(25.70883)));
            yy = -1.15264 + (((tickAnim - 23) / 5) * (-1.15264-(-1.15264)));
            zz = 4.09099 + (((tickAnim - 23) / 5) * (4.09099-(4.09099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.64-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.64 + (((tickAnim - 13) / 5) * (0.45-(1.64)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 18) / 3) * (0-(0.45)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -32.5 + (((tickAnim - 0) / 13) * (38.5-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 38.5 + (((tickAnim - 13) / 8) * (-1.4802-(38.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (5.12287-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (-26.13418-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -1.4802 + (((tickAnim - 21) / 7) * (-32.5-(-1.4802)));
            yy = 5.12287 + (((tickAnim - 21) / 7) * (0-(5.12287)));
            zz = -26.13418 + (((tickAnim - 21) / 7) * (0-(-26.13418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.37592 + (((tickAnim - 0) / 7) * (-4.17917-(2.37592)));
            yy = -13.29424 + (((tickAnim - 0) / 7) * (-7.47801-(-13.29424)));
            zz = -8.84401 + (((tickAnim - 0) / 7) * (-4.97476-(-8.84401)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -4.17917 + (((tickAnim - 7) / 8) * (9.80486-(-4.17917)));
            yy = -7.47801 + (((tickAnim - 7) / 8) * (-2.49267-(-7.47801)));
            zz = -4.97476 + (((tickAnim - 7) / 8) * (-1.65825-(-4.97476)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 9.80486 + (((tickAnim - 15) / 6) * (-36.93704-(9.80486)));
            yy = -2.49267 + (((tickAnim - 15) / 6) * (-6.64712-(-2.49267)));
            zz = -1.65825 + (((tickAnim - 15) / 6) * (-4.42201-(-1.65825)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -36.93704 + (((tickAnim - 21) / 7) * (2.37592-(-36.93704)));
            yy = -6.64712 + (((tickAnim - 21) / 7) * (-13.29424-(-6.64712)));
            zz = -4.42201 + (((tickAnim - 21) / 7) * (-8.84401-(-4.42201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -1.025 + (((tickAnim - 0) / 7) * (-0.745-(-1.025)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = -0.745 + (((tickAnim - 7) / 14) * (1.185-(-0.745)));
            zz = 0.5 + (((tickAnim - 7) / 14) * (0.15-(0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            yy = 1.185 + (((tickAnim - 21) / 7) * (-1.025-(1.185)));
            zz = 0.15 + (((tickAnim - 21) / 7) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25.48142 + (((tickAnim - 0) / 7) * (4.99479-(25.48142)));
            yy = -7.17962 + (((tickAnim - 0) / 7) * (-4.16867-(-7.17962)));
            zz = 4.99681 + (((tickAnim - 0) / 7) * (7.32039-(4.99681)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.99479 + (((tickAnim - 7) / 3) * (14.80324-(4.99479)));
            yy = -4.16867 + (((tickAnim - 7) / 3) * (-1.85274-(-4.16867)));
            zz = 7.32039 + (((tickAnim - 7) / 3) * (3.25351-(7.32039)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.80324 + (((tickAnim - 10) / 5) * (89.31115-(14.80324)));
            yy = -1.85274 + (((tickAnim - 10) / 5) * (-1.24706-(-1.85274)));
            zz = 3.25351 + (((tickAnim - 10) / 5) * (5.89116-(3.25351)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 89.31115 + (((tickAnim - 15) / 6) * (69.97603-(89.31115)));
            yy = -1.24706 + (((tickAnim - 15) / 6) * (-2.90981-(-1.24706)));
            zz = 5.89116 + (((tickAnim - 15) / 6) * (13.74605-(5.89116)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 69.97603 + (((tickAnim - 21) / 3) * (34.5-(69.97603)));
            yy = -2.90981 + (((tickAnim - 21) / 3) * (0-(-2.90981)));
            zz = 13.74605 + (((tickAnim - 21) / 3) * (0-(13.74605)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 34.5 + (((tickAnim - 24) / 4) * (25.48142-(34.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (-7.17962-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (4.99681-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-0.65-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 21) / 3) * (0-(0.875)));
            zz = -0.65 + (((tickAnim - 21) / 3) * (0-(-0.65)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
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
            xx = 38.5 + (((tickAnim - 0) / 9) * (-6.33976-(38.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.95742-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (24.38809-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -6.33976 + (((tickAnim - 9) / 7) * (-32.5-(-6.33976)));
            yy = -0.95742 + (((tickAnim - 9) / 7) * (0-(-0.95742)));
            zz = 24.38809 + (((tickAnim - 9) / 7) * (0-(24.38809)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -32.5 + (((tickAnim - 16) / 12) * (38.5-(-32.5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.75 + (((tickAnim - 0) / 2) * (-6.75-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = -6.75 + (((tickAnim - 2) / 7) * (-49.10311-(-6.75)));
            yy = 0 + (((tickAnim - 2) / 7) * (2.81598-(0)));
            zz = 0 + (((tickAnim - 2) / 7) * (4.79798-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -49.10311 + (((tickAnim - 9) / 7) * (2.37592-(-49.10311)));
            yy = 2.81598 + (((tickAnim - 9) / 7) * (13.2942-(2.81598)));
            zz = 4.79798 + (((tickAnim - 9) / 7) * (8.844-(4.79798)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 2.37592 + (((tickAnim - 16) / 12) * (-5.75-(2.37592)));
            yy = 13.2942 + (((tickAnim - 16) / 12) * (0-(13.2942)));
            zz = 8.844 + (((tickAnim - 16) / 12) * (0-(8.844)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.36-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0.4 + (((tickAnim - 9) / 7) * (0-(0.4)));
            yy = 0.36 + (((tickAnim - 9) / 7) * (-1.025-(0.36)));
            zz = -0.15 + (((tickAnim - 9) / 7) * (0-(-0.15)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = -1.025 + (((tickAnim - 16) / 12) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
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
            xx = 62.25 + (((tickAnim - 0) / 2) * (87-(62.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 87 + (((tickAnim - 2) / 3) * (105.83501-(87)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.05511-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (-0.26032-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 105.83501 + (((tickAnim - 5) / 4) * (69.97603-(105.83501)));
            yy = 0.05511 + (((tickAnim - 5) / 4) * (2.9098-(0.05511)));
            zz = -0.26032 + (((tickAnim - 5) / 4) * (-13.746-(-0.26032)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 69.97603 + (((tickAnim - 9) / 7) * (25.48142-(69.97603)));
            yy = 2.9098 + (((tickAnim - 9) / 7) * (7.1796-(2.9098)));
            zz = -13.746 + (((tickAnim - 9) / 7) * (-4.9968-(-13.746)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25.48142 + (((tickAnim - 16) / 4) * (7.44883-(25.48142)));
            yy = 7.1796 + (((tickAnim - 16) / 4) * (1.07923-(7.1796)));
            zz = -4.9968 + (((tickAnim - 16) / 4) * (-5.36365-(-4.9968)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 7.44883 + (((tickAnim - 20) / 8) * (62.25-(7.44883)));
            yy = 1.07923 + (((tickAnim - 20) / 8) * (0-(1.07923)));
            zz = -5.36365 + (((tickAnim - 20) / 8) * (0-(-5.36365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.525-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 2) / 3) * (1.815-(0.65)));
            zz = -0.525 + (((tickAnim - 2) / 3) * (-0.58-(-0.525)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.815 + (((tickAnim - 5) / 4) * (0.875-(1.815)));
            zz = -0.58 + (((tickAnim - 5) / 4) * (-0.65-(-0.58)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 9) / 7) * (0-(0.875)));
            zz = -0.65 + (((tickAnim - 9) / 7) * (0-(-0.65)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5))*-1), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*0.5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-40))*-1.5));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+50))*-0.6);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+60))*1.8), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-160))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*2), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254+30))*0.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-220))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5+150))*-0.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-90))*0.5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-320))*1));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*-2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*3), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-90))*-3));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-0.2 + (((tickAnim - 0) / 13) * (1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*-2-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-0.2)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*-2 + (((tickAnim - 13) / 5) * (0-(1.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+80))*-2)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-2-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-2 + (((tickAnim - 25) / 3) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-75))*1-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+50))*-2)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKannemeyeria entity = (EntityPrehistoricFloraKannemeyeria) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.91612 + (((tickAnim - 0) / 3) * (-1.55425-(19.91612)));
            yy = -1.6726 + (((tickAnim - 0) / 3) * (-3.6666-(-1.6726)));
            zz = -4.1582 + (((tickAnim - 0) / 3) * (-12.0583-(-4.1582)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -1.55425 + (((tickAnim - 3) / 5) * (-20.00906-(-1.55425)));
            yy = -3.6666 + (((tickAnim - 3) / 5) * (-5.1797-(-3.6666)));
            zz = -12.0583 + (((tickAnim - 3) / 5) * (3.039-(-12.0583)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -20.00906 + (((tickAnim - 8) / 8) * (43.3225-(-20.00906)));
            yy = -5.1797 + (((tickAnim - 8) / 8) * (-0.6388-(-5.1797)));
            zz = 3.039 + (((tickAnim - 8) / 8) * (1.3687-(3.039)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 43.3225 + (((tickAnim - 16) / 2) * (19.91612-(43.3225)));
            yy = -0.6388 + (((tickAnim - 16) / 2) * (-1.6726-(-0.6388)));
            zz = 1.3687 + (((tickAnim - 16) / 2) * (-4.1582-(1.3687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.54217 + (((tickAnim - 0) / 3) * (-2.72089-(28.54217)));
            yy = 0.87246 + (((tickAnim - 0) / 3) * (-2.3266-(0.87246)));
            zz = 0.14569 + (((tickAnim - 0) / 3) * (-0.3885-(0.14569)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.72089 + (((tickAnim - 3) / 5) * (-4.91656-(-2.72089)));
            yy = -2.3266 + (((tickAnim - 3) / 5) * (-6.041-(-2.3266)));
            zz = -0.3885 + (((tickAnim - 3) / 5) * (-3.42338-(-0.3885)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4.91656 + (((tickAnim - 8) / 10) * (28.54217-(-4.91656)));
            yy = -6.041 + (((tickAnim - 8) / 10) * (0.87246-(-6.041)));
            zz = -3.42338 + (((tickAnim - 8) / 10) * (0.14569-(-3.42338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.925-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.925 + (((tickAnim - 3) / 5) * (-0.675-(0.925)));
            yy = 2.1 + (((tickAnim - 3) / 5) * (-0.825-(2.1)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -0.675 + (((tickAnim - 8) / 10) * (0-(-0.675)));
            yy = -0.825 + (((tickAnim - 8) / 10) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
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
            xx = 75.13271 + (((tickAnim - 0) / 3) * (31.47942-(75.13271)));
            yy = -0.14448 + (((tickAnim - 0) / 3) * (-0.57632-(-0.14448)));
            zz = 0.51279 + (((tickAnim - 0) / 3) * (2.04549-(0.51279)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 31.47942 + (((tickAnim - 3) / 3) * (7.93194-(31.47942)));
            yy = -0.57632 + (((tickAnim - 3) / 3) * (-0.90565-(-0.57632)));
            zz = 2.04549 + (((tickAnim - 3) / 3) * (3.21435-(2.04549)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.93194 + (((tickAnim - 6) / 2) * (25.70883-(7.93194)));
            yy = -0.90565 + (((tickAnim - 6) / 2) * (-1.15264-(-0.90565)));
            zz = 3.21435 + (((tickAnim - 6) / 2) * (4.09099-(3.21435)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 25.70883 + (((tickAnim - 8) / 1) * (6.13038-(25.70883)));
            yy = -1.15264 + (((tickAnim - 8) / 1) * (-0.66709-(-1.15264)));
            zz = 4.09099 + (((tickAnim - 8) / 1) * (2.36765-(4.09099)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.13038 + (((tickAnim - 9) / 4) * (-8.60803-(6.13038)));
            yy = -0.66709 + (((tickAnim - 9) / 4) * (-0.59815-(-0.66709)));
            zz = 2.36765 + (((tickAnim - 9) / 4) * (2.12298-(2.36765)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.60803 + (((tickAnim - 13) / 5) * (75.13271-(-8.60803)));
            yy = -0.59815 + (((tickAnim - 13) / 5) * (-0.14448-(-0.59815)));
            zz = 2.12298 + (((tickAnim - 13) / 5) * (0.51279-(2.12298)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.64 + (((tickAnim - 0) / 3) * (0.45-(1.64)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 3) * (0-(0.45)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 5) * (1.64-(-0.175)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -1.00906 + (((tickAnim - 0) / 7) * (45.8225-(-1.00906)));
            yy = 5.17965 + (((tickAnim - 0) / 7) * (0.6388-(5.17965)));
            zz = -3.039 + (((tickAnim - 0) / 7) * (-1.36875-(-3.039)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 45.8225 + (((tickAnim - 7) / 5) * (1.69575-(45.8225)));
            yy = 0.6388 + (((tickAnim - 7) / 5) * (3.66662-(0.6388)));
            zz = -1.36875 + (((tickAnim - 7) / 5) * (12.05834-(-1.36875)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 1.69575 + (((tickAnim - 12) / 2) * (-18.00906-(1.69575)));
            yy = 3.66662 + (((tickAnim - 12) / 2) * (5.17965-(3.66662)));
            zz = 12.05834 + (((tickAnim - 12) / 2) * (-3.039-(12.05834)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -18.00906 + (((tickAnim - 14) / 4) * (-1.00906-(-18.00906)));
            yy = 5.17965 + (((tickAnim - 14) / 4) * (5.17965-(5.17965)));
            zz = -3.039 + (((tickAnim - 14) / 4) * (-3.039-(-3.039)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -0.69743 + (((tickAnim - 0) / 7) * (26.5-(-0.69743)));
            yy = 6.41825 + (((tickAnim - 0) / 7) * (0-(6.41825)));
            zz = 1.0718 + (((tickAnim - 0) / 7) * (0-(1.0718)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 26.5 + (((tickAnim - 7) / 1) * (16.79217-(26.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.87246-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.14569-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16.79217 + (((tickAnim - 8) / 4) * (-2.72089-(16.79217)));
            yy = 0.87246 + (((tickAnim - 8) / 4) * (2.32655-(0.87246)));
            zz = 0.14569 + (((tickAnim - 8) / 4) * (0.38852-(0.14569)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -2.72089 + (((tickAnim - 12) / 2) * (-7.19743-(-2.72089)));
            yy = 2.32655 + (((tickAnim - 12) / 2) * (6.41825-(2.32655)));
            zz = 0.38852 + (((tickAnim - 12) / 2) * (1.0718-(0.38852)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -7.19743 + (((tickAnim - 14) / 4) * (-0.69743-(-7.19743)));
            yy = 6.41825 + (((tickAnim - 14) / 4) * (6.41825-(6.41825)));
            zz = 1.0718 + (((tickAnim - 14) / 4) * (1.0718-(1.0718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 7) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (-0.925-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (2.1-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.925 + (((tickAnim - 12) / 2) * (0-(-0.925)));
            yy = 2.1 + (((tickAnim - 12) / 2) * (-0.6-(2.1)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.95883 + (((tickAnim - 0) / 4) * (-8.3217-(4.95883)));
            yy = -1.15264 + (((tickAnim - 0) / 4) * (-1.1507-(-1.15264)));
            zz = 4.09099 + (((tickAnim - 0) / 4) * (4.0841-(4.09099)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.3217 + (((tickAnim - 4) / 3) * (49.25-(-8.3217)));
            yy = -1.1507 + (((tickAnim - 4) / 3) * (0-(-1.1507)));
            zz = 4.0841 + (((tickAnim - 4) / 3) * (0-(4.0841)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 49.25 + (((tickAnim - 7) / 1) * (75.13271-(49.25)));
            yy = 0 + (((tickAnim - 7) / 1) * (-0.14448-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.51279-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 75.13271 + (((tickAnim - 8) / 4) * (31.47942-(75.13271)));
            yy = -0.14448 + (((tickAnim - 8) / 4) * (-0.57632-(-0.14448)));
            zz = 0.51279 + (((tickAnim - 8) / 4) * (2.04549-(0.51279)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 31.47942 + (((tickAnim - 12) / 1) * (7.93194-(31.47942)));
            yy = -0.57632 + (((tickAnim - 12) / 1) * (-0.90565-(-0.57632)));
            zz = 2.04549 + (((tickAnim - 12) / 1) * (3.21435-(2.04549)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 7.93194 + (((tickAnim - 13) / 1) * (25.70883-(7.93194)));
            yy = -0.90565 + (((tickAnim - 13) / 1) * (-1.15264-(-0.90565)));
            zz = 3.21435 + (((tickAnim - 13) / 1) * (4.09099-(3.21435)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 25.70883 + (((tickAnim - 14) / 4) * (4.95883-(25.70883)));
            yy = -1.15264 + (((tickAnim - 14) / 4) * (-1.15264-(-1.15264)));
            zz = 4.09099 + (((tickAnim - 14) / 4) * (4.09099-(4.09099)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.64-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1.64 + (((tickAnim - 8) / 4) * (0.45-(1.64)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 1) * (0-(0.45)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -39.75 + (((tickAnim - 0) / 8) * (44.75-(-39.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 44.75 + (((tickAnim - 8) / 5) * (-1.4802-(44.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (5.12287-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-26.13418-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.4802 + (((tickAnim - 13) / 5) * (-39.75-(-1.4802)));
            yy = 5.12287 + (((tickAnim - 13) / 5) * (0-(5.12287)));
            zz = -26.13418 + (((tickAnim - 13) / 5) * (0-(-26.13418)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.37592 + (((tickAnim - 0) / 4) * (-4.17917-(2.37592)));
            yy = -13.29424 + (((tickAnim - 0) / 4) * (-7.47801-(-13.29424)));
            zz = -8.84401 + (((tickAnim - 0) / 4) * (-4.97476-(-8.84401)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -4.17917 + (((tickAnim - 4) / 4) * (-9.52581-(-4.17917)));
            yy = -7.47801 + (((tickAnim - 4) / 4) * (-3.32356-(-7.47801)));
            zz = -4.97476 + (((tickAnim - 4) / 4) * (-2.211-(-4.97476)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.52581 + (((tickAnim - 8) / 5) * (-36.93704-(-9.52581)));
            yy = -3.32356 + (((tickAnim - 8) / 5) * (-6.64712-(-3.32356)));
            zz = -2.211 + (((tickAnim - 8) / 5) * (-4.42201-(-2.211)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -36.93704 + (((tickAnim - 13) / 5) * (2.37592-(-36.93704)));
            yy = -6.64712 + (((tickAnim - 13) / 5) * (-13.29424-(-6.64712)));
            zz = -4.42201 + (((tickAnim - 13) / 5) * (-8.84401-(-4.42201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.025 + (((tickAnim - 0) / 4) * (-0.745-(-1.025)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = -0.745 + (((tickAnim - 4) / 9) * (1.185-(-0.745)));
            zz = 0.5 + (((tickAnim - 4) / 9) * (0.15-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.185 + (((tickAnim - 13) / 5) * (-1.025-(1.185)));
            zz = 0.15 + (((tickAnim - 13) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 37.23142 + (((tickAnim - 0) / 4) * (4.99479-(37.23142)));
            yy = -7.17962 + (((tickAnim - 0) / 4) * (-4.16867-(-7.17962)));
            zz = 4.99681 + (((tickAnim - 0) / 4) * (7.32039-(4.99681)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 4.99479 + (((tickAnim - 4) / 2) * (14.80324-(4.99479)));
            yy = -4.16867 + (((tickAnim - 4) / 2) * (-1.85274-(-4.16867)));
            zz = 7.32039 + (((tickAnim - 4) / 2) * (3.25351-(7.32039)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 14.80324 + (((tickAnim - 6) / 2) * (106.18418-(14.80324)));
            yy = -1.85274 + (((tickAnim - 6) / 2) * (-1.39848-(-1.85274)));
            zz = 3.25351 + (((tickAnim - 6) / 2) * (5.23175-(3.25351)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 106.18418 + (((tickAnim - 8) / 5) * (69.97603-(106.18418)));
            yy = -1.39848 + (((tickAnim - 8) / 5) * (-2.90981-(-1.39848)));
            zz = 5.23175 + (((tickAnim - 8) / 5) * (13.74605-(5.23175)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 69.97603 + (((tickAnim - 13) / 2) * (34.5-(69.97603)));
            yy = -2.90981 + (((tickAnim - 13) / 2) * (0-(-2.90981)));
            zz = 13.74605 + (((tickAnim - 13) / 2) * (0-(13.74605)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 34.5 + (((tickAnim - 15) / 3) * (37.23142-(34.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (-7.17962-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (4.99681-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 2) * (0-(0.875)));
            zz = -0.65 + (((tickAnim - 13) / 2) * (0-(-0.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 46.25 + (((tickAnim - 0) / 6) * (-6.33976-(46.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.95742-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (24.38809-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -6.33976 + (((tickAnim - 6) / 4) * (-39.25-(-6.33976)));
            yy = -0.95742 + (((tickAnim - 6) / 4) * (0-(-0.95742)));
            zz = 24.38809 + (((tickAnim - 6) / 4) * (0-(24.38809)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -39.25 + (((tickAnim - 10) / 8) * (46.25-(-39.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -17.5 + (((tickAnim - 0) / 6) * (-49.10311-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.81598-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (4.79798-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -49.10311 + (((tickAnim - 6) / 4) * (2.37592-(-49.10311)));
            yy = 2.81598 + (((tickAnim - 6) / 4) * (13.2942-(2.81598)));
            zz = 4.79798 + (((tickAnim - 6) / 4) * (8.844-(4.79798)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 2.37592 + (((tickAnim - 10) / 8) * (-17.5-(2.37592)));
            yy = 13.2942 + (((tickAnim - 10) / 8) * (0-(13.2942)));
            zz = 8.844 + (((tickAnim - 10) / 8) * (0-(8.844)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.36-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.15-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.4 + (((tickAnim - 6) / 4) * (0-(0.4)));
            yy = 0.36 + (((tickAnim - 6) / 4) * (-1.025-(0.36)));
            zz = -0.15 + (((tickAnim - 6) / 4) * (0-(-0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -1.025 + (((tickAnim - 10) / 8) * (0-(-1.025)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
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
            xx = 86.75 + (((tickAnim - 0) / 3) * (105.83501-(86.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.05511-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.26032-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 105.83501 + (((tickAnim - 3) / 3) * (69.97603-(105.83501)));
            yy = 0.05511 + (((tickAnim - 3) / 3) * (2.9098-(0.05511)));
            zz = -0.26032 + (((tickAnim - 3) / 3) * (-13.746-(-0.26032)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 69.97603 + (((tickAnim - 6) / 4) * (34.73142-(69.97603)));
            yy = 2.9098 + (((tickAnim - 6) / 4) * (7.1796-(2.9098)));
            zz = -13.746 + (((tickAnim - 6) / 4) * (-4.9968-(-13.746)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.73142 + (((tickAnim - 10) / 3) * (7.44883-(34.73142)));
            yy = 7.1796 + (((tickAnim - 10) / 3) * (1.07923-(7.1796)));
            zz = -4.9968 + (((tickAnim - 10) / 3) * (-5.36365-(-4.9968)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.44883 + (((tickAnim - 13) / 5) * (86.75-(7.44883)));
            yy = 1.07923 + (((tickAnim - 13) / 5) * (0-(1.07923)));
            zz = -5.36365 + (((tickAnim - 13) / 5) * (0-(-5.36365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.815-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.58-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.815 + (((tickAnim - 3) / 3) * (0.875-(1.815)));
            zz = -0.58 + (((tickAnim - 3) / 3) * (-0.65-(-0.58)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 6) / 4) * (0-(0.875)));
            zz = -0.65 + (((tickAnim - 6) / 4) * (0-(-0.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5))*-0.5), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*0.7), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-40))*-4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*0.3);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-40))*-0.5);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-50))*1);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*413/0.5+60))*2), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-160))*-2.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-100))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+30))*0.5), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-220))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+150))*-2.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-50))*0.5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-200))*2));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.575);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5))*-2), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-90))*0.5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-320))*1));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-80))*-4), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-50))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-50))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-150))*-9), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-100))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-90))*-3));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-0.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5+50))*0.2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKannemeyeria e = (EntityPrehistoricFloraKannemeyeria) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
