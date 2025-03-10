package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnatosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAnatosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer leftside;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightside;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer horn;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer crustacean;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;

    private ModelAnimator animator;

    public ModelAnatosuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 14.2F, 2.75F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 34, -1.0F, -1.25F, 0.25F, 2, 1, 4, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.75F, -1.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 0, -1.0F, -0.5F, 0.25F, 3, 4, 4, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.0F, 0.5F, 1.5F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.48F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 32, 0, -1.0F, -0.75F, -1.5F, 2, 5, 3, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 4.1597F, -1.4826F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6981F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 41, 22, -1.0F, 0.0F, 0.0F, 2, 6, 2, -0.003F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.25F, 5.7929F, 1.6851F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2182F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 22, 46, -1.25F, 0.0F, -2.0F, 3, 1, 2, 0.001F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.25F, 1.0F, -2.0F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 0, 48, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.0F, 0.5F, 1.5F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.48F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 32, 0, -1.0F, -0.75F, -1.5F, 2, 5, 3, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 4.1597F, -1.4826F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6981F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 41, 22, -1.0F, 0.0F, 0.0F, 2, 6, 2, -0.003F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.25F, 5.7929F, 1.6851F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2182F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 22, 46, -1.75F, 0.0F, -2.0F, 3, 1, 2, 0.001F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(-0.25F, 1.0F, -2.0F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 0, 48, -1.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.025F, -0.25F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -0.225F, -4.0F, 4, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 16, -1.0F, -0.775F, -4.0F, 2, 1, 4, -0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 35, -1.0F, -1.775F, -4.0F, 2, 1, 4, -0.004F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 10, -2.0F, -1.225F, -4.0F, 4, 5, 4, -0.003F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.125F, -3.25F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 17, 18, -1.5F, 0.0F, -4.0F, 3, 4, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 40, -1.0F, -0.5F, -4.0F, 2, 1, 4, -0.01F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(1.5F, 3.5F, -1.75F);
        this.body3.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 45, 6, -1.0F, -0.75F, -1.0F, 2, 4, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 3.1905F, 0.4398F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.829F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 11, 48, -1.0F, -0.25F, -1.0F, 2, 5, 1, -0.01F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 4.3195F, -0.4624F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.2574F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 48, 41, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.5F, 3.5F, -1.75F);
        this.body3.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 45, 6, -1.0F, -0.75F, -1.0F, 2, 4, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 3.1905F, 0.4398F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.829F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 11, 48, -1.0F, -0.25F, -1.0F, 2, 5, 1, -0.01F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 4.3195F, -0.4624F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.2574F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 48, 41, -1.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.1872F, -3.4962F);
        this.body3.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 12, 35, -0.75F, 0.0F, -3.75F, 2, 3, 4, 0.002F, false));
        this.neck.cubeList.add(new ModelBox(neck, 12, 35, -1.25F, 0.0F, -3.75F, 2, 3, 4, 0.0F, true));
        this.neck.cubeList.add(new ModelBox(neck, 43, 0, -0.5F, -0.5F, -3.75F, 1, 1, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -1.5F);
        this.neck.addChild(neck2);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.05F, -2.275F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 45, 13, -1.5F, -0.262F, -1.4753F, 3, 1, 2, 0.004F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 50, -0.5F, -0.262F, -3.4753F, 1, 1, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.2219F, -5.4429F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 52, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.8033F, -1.7586F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.096F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 22, -0.5F, -0.025F, -0.025F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.8033F, -1.7586F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2487F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 52, -0.5F, -0.025F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.262F, -3.4753F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 25, -0.5F, -0.125F, -2.0F, 1, 1, 2, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7132F, -0.2715F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 17, -1.5F, 0.0248F, -1.2037F, 3, 1, 2, 0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 37, -1.0F, -0.9752F, -1.3037F, 2, 1, 2, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 29, -0.5F, 0.0248F, -3.2037F, 1, 1, 2, 0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 45, -1.5F, 0.0248F, -4.118F, 3, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.3744F, -1.1863F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1178F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 43, -1.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.1469F, -1.2308F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 48, -1.5F, -0.775F, 0.0F, 2, 1, 2, -0.007F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.9F, 0.2506F, -5.083F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0852F, -0.0189F, -0.2174F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.2602F, 0.3498F, -1.8836F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0189F, 0.0852F, -0.219F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 52, 0.075F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.2437F, 0.2748F, -3.593F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 35, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.9F, 0.2506F, -5.083F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0852F, 0.0189F, 0.2174F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 0, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.1616F, -5.5269F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 38, -0.5F, -0.475F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0248F, -3.118F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 48, -1.0F, -0.9F, -2.575F, 2, 1, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.2437F, 0.2748F, -3.593F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 35, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2602F, 0.3498F, -1.8836F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0189F, -0.0852F, 0.219F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 52, -0.075F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.5248F, -1.2037F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0873F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 21, -0.325F, -0.5F, -1.95F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.5248F, -1.2037F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0873F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 21, -0.675F, -0.5F, -1.95F, 1, 1, 2, 0.0F, false));

        this.leftside = new AdvancedModelRenderer(this);
        this.leftside.setRotationPoint(0.5174F, -0.3604F, -1.4796F);
        this.head.addChild(leftside);
        this.setRotateAngle(leftside, 0.043F, -0.0076F, 0.1744F);
        this.leftside.cubeList.add(new ModelBox(leftside, 51, 48, -0.5F, -0.0018F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.237F, 0.5F, -1.8656F);
        this.leftside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 33, -0.75F, -0.5018F, -2.05F, 1, 1, 2, -0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0316F, 0.7347F, -1.2015F);
        this.leftside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1244F, -0.1585F, -0.1715F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 50, 0.0118F, -0.5376F, -2.4513F, 0, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.6177F, 0.7183F, -4.3295F);
        this.leftside.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.444F, 0.6775F, -0.6213F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 52, -0.05F, -0.5F, -0.8F, 0, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.4751F, 0.0006F, -3.7111F);
        this.leftside.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0119F, 0.8284F, -0.056F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 52, -0.95F, 0.0F, -2.0F, 1, 1, 2, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.leftside.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1309F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 41, 31, -1.0F, -0.5F, -3.775F, 1, 1, 4, -0.001F, false));

        this.rightside = new AdvancedModelRenderer(this);
        this.rightside.setRotationPoint(-0.5174F, -0.3604F, -1.4796F);
        this.head.addChild(rightside);
        this.setRotateAngle(rightside, 0.043F, 0.0076F, -0.1744F);
        this.rightside.cubeList.add(new ModelBox(rightside, 51, 48, -0.5F, -0.0018F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.237F, 0.5F, -1.8656F);
        this.rightside.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.2182F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 33, -0.25F, -0.5018F, -2.05F, 1, 1, 2, -0.001F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0316F, 0.7347F, -1.2015F);
        this.rightside.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1244F, 0.1585F, 0.1715F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 18, 50, -0.0118F, -0.5376F, -2.4513F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.6177F, 0.7183F, -4.3295F);
        this.rightside.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.444F, -0.6775F, 0.6213F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 52, 0.05F, -0.5F, -0.8F, 0, 1, 2, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.4751F, 0.0006F, -3.7111F);
        this.rightside.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0119F, -0.8284F, 0.056F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 52, -0.05F, 0.0F, -2.0F, 1, 1, 2, -0.003F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.rightside.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.1309F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 41, 31, 0.0F, -0.5F, -3.775F, 1, 1, 4, -0.001F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.5565F, -0.7282F, -1.8086F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.0218F, -0.1309F, -0.0654F);
        this.eye.cubeList.add(new ModelBox(eye, 41, 37, -0.425F, 0.0F, -0.5F, 1, 1, 1, -0.02F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.5565F, -0.7282F, -1.8086F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.0218F, 0.1309F, 0.0654F);
        this.eye2.cubeList.add(new ModelBox(eye2, 41, 37, -0.575F, 0.0F, -0.5F, 1, 1, 1, -0.02F, true));

        this.horn = new AdvancedModelRenderer(this);
        this.horn.setRotationPoint(0.0F, 0.3521F, -6.4568F);
        this.head.addChild(horn);
        this.setRotateAngle(horn, 0.1091F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.horn.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 49, 52, -0.5F, -0.45F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.2241F, 3.0321F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 9, -0.5F, 0.0F, 0.025F, 2, 3, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 0.2F, 0.0F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0131F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 27, 0.5F, -0.95F, 0.025F, 1, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0065F, 4.5496F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 20, -0.5F, 0.0F, 0.025F, 2, 2, 5, -0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 0.5F, 0.75F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 9, 0.5F, -1.1F, -0.725F, 1, 1, 5, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 15, 27, 0.0F, 0.0F, 0.025F, 1, 2, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.5F, 0.75F);
        this.tail3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 41, 0.5F, -0.9F, -0.725F, 0, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0985F, 4.7674F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, 0.0F, 0.0F, 0.025F, 1, 1, 5, -0.001F, false));

        this.crustacean = new AdvancedModelRenderer(this);
        this.crustacean.setRotationPoint(-0.0613F, -0.1153F, -3.7135F);
        this.main.addChild(crustacean);
        this.crustacean.cubeList.add(new ModelBox(crustacean, 57, 53, -0.6528F, -0.1597F, -0.1945F, 1, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.2077F, -0.1097F, 0.7555F);
        this.crustacean.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4971F, -0.4251F, 0.2201F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 52, 56, -0.5F, -0.0432F, -0.1049F, 1, 0, 2, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.0778F, -0.1097F, 0.7555F);
        this.crustacean.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4971F, 0.4251F, -0.2201F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 56, -0.5F, -0.0432F, -0.1049F, 1, 0, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.6278F, 0.2653F, 1.6805F);
        this.crustacean.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4494F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 54, 56, 1.0F, 0.0F, -1.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 1.4F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg2, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.4F, 0.0F);
        this.setRotateAngle(tail2, -0.2F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.1F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.01F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.0F;
        this.main.offsetX = 0.1F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.6F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 1.4F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 1.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg2, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.4F, 0.0F);
        this.setRotateAngle(tail2, -0.2F, 0.3F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.1F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

        EntityPrehistoricFloraAnatosuchus proteros = (EntityPrehistoricFloraAnatosuchus) e;

        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck2, this.head};
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
        EntityPrehistoricFloraAnatosuchus ee = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animForage(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animForage(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.25 + (((tickAnim - 10) / 10) * (19.5-(-16.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.5 + (((tickAnim - 20) / 10) * (-16.25-(19.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.25 + (((tickAnim - 30) / 10) * (19.5-(-16.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 40) / 10) * (0-(19.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.87 + (((tickAnim - 5) / 5) * (-11.75-(-8.87)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.75 + (((tickAnim - 10) / 10) * (25.75-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 25.75 + (((tickAnim - 20) / 5) * (-6.75-(25.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 25) / 5) * (-11.75-(-6.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -11.75 + (((tickAnim - 30) / 10) * (25.75-(-11.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 40) / 10) * (0-(25.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.625 + (((tickAnim - 25) / 5) * (0-(0.625)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.25 + (((tickAnim - 5) / 5) * (28-(34.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 28 + (((tickAnim - 10) / 4) * (1-(28)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 14) / 6) * (67-(1)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 67 + (((tickAnim - 20) / 5) * (34.75-(67)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 34.75 + (((tickAnim - 25) / 5) * (28-(34.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 28 + (((tickAnim - 30) / 4) * (1-(28)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 34) / 6) * (67-(1)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 67 + (((tickAnim - 40) / 5) * (17.75-(67)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 45) / 5) * (0-(17.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.825-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.825 + (((tickAnim - 5) / 5) * (0-(1.825)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 14) / 4) * (1.62-(-0.325)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.32-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.62 + (((tickAnim - 18) / 2) * (1.225-(1.62)));
            zz = 0.32 + (((tickAnim - 18) / 2) * (-0.375-(0.32)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 20) / 5) * (2.36-(1.225)));
            zz = -0.375 + (((tickAnim - 20) / 5) * (0.235-(-0.375)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 2.36 + (((tickAnim - 25) / 5) * (0-(2.36)));
            zz = 0.235 + (((tickAnim - 25) / 5) * (0-(0.235)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 34) / 4) * (1.62-(-0.325)));
            zz = 0 + (((tickAnim - 34) / 4) * (0.32-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1.62 + (((tickAnim - 38) / 2) * (1.225-(1.62)));
            zz = 0.32 + (((tickAnim - 38) / 2) * (-0.375-(0.32)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 40) / 5) * (1.66-(1.225)));
            zz = -0.375 + (((tickAnim - 40) / 5) * (0.385-(-0.375)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.66 + (((tickAnim - 45) / 5) * (0-(1.66)));
            zz = 0.385 + (((tickAnim - 45) / 5) * (0-(0.385)));
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
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 15) / 20) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 35) / 15) * (0-(-5.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-2.575-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.575 + (((tickAnim - 15) / 20) * (-2.575-(-2.575)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.575 + (((tickAnim - 35) / 15) * (0-(-2.575)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-18-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 35) / 15) * (0-(-18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 15) / 20) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 35) / 15) * (0-(35.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-18-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 35) / 15) * (0-(-18)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 15) / 20) * (35.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 35.5 + (((tickAnim - 35) / 15) * (0-(35.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.49553-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.49553 + (((tickAnim - 15) / 20) * (-3.49553-(-3.49553)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.49553 + (((tickAnim - 35) / 15) * (0-(-3.49553)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.25 + (((tickAnim - 15) / 20) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 35) / 15) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -21 + (((tickAnim - 15) / 20) * (-21-(-21)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 35) / 15) * (0-(-21)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 25.25 + (((tickAnim - 15) / 20) * (25.25-(25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 25.25 + (((tickAnim - 35) / 15) * (0-(25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 15) / 20) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 35) / 15) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 15) / 20) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 35) / 15) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.5 + (((tickAnim - 15) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.67-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -1.67 + (((tickAnim - 3) / 4) * (2.47-(-1.67)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 2.47 + (((tickAnim - 7) / 8) * (14-(2.47)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 15) / 20) * (14-(14)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 14 + (((tickAnim - 35) / 3) * (5.14-(14)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 5.14 + (((tickAnim - 38) / 4) * (6.42-(5.14)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 6.42 + (((tickAnim - 42) / 8) * (0-(6.42)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (1.84-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 1.84 + (((tickAnim - 38) / 4) * (-5.75-(1.84)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -5.75 + (((tickAnim - 42) / 2) * (-13.52-(-5.75)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -13.52 + (((tickAnim - 44) / 6) * (0-(-13.52)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -2.75 + (((tickAnim - 6) / 7) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 6) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 6) / 4) * (0-(17.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 9.25 + (((tickAnim - 9) / 12) * (0-(9.25)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-2.10163-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (13.37603-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-10.67662-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -2.10163 + (((tickAnim - 9) / 12) * (0-(-2.10163)));
            yy = 13.37603 + (((tickAnim - 9) / 12) * (0-(13.37603)));
            zz = -10.67662 + (((tickAnim - 9) / 12) * (0-(-10.67662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-20.20044-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (4.33969-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (5.82771-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -20.20044 + (((tickAnim - 9) / 12) * (0-(-20.20044)));
            yy = 4.33969 + (((tickAnim - 9) / 12) * (0-(4.33969)));
            zz = 5.82771 + (((tickAnim - 9) / 12) * (0-(5.82771)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 9) / 12) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 9) / 12) * (0-(12)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.5 + (((tickAnim - 9) / 12) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 9) * (-7.12744-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-15.11468-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (16.87081-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -7.12744 + (((tickAnim - 9) / 12) * (0-(-7.12744)));
            yy = -15.11468 + (((tickAnim - 9) / 12) * (0-(-15.11468)));
            zz = 16.87081 + (((tickAnim - 9) / 12) * (0-(16.87081)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-19.88007-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-10.34763-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-8.33032-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -19.88007 + (((tickAnim - 9) / 12) * (0-(-19.88007)));
            yy = -10.34763 + (((tickAnim - 9) / 12) * (0-(-10.34763)));
            zz = -8.33032 + (((tickAnim - 9) / 12) * (0-(-8.33032)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.425-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 9) / 12) * (0-(-0.475)));
            zz = -0.425 + (((tickAnim - 9) / 12) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 12 + (((tickAnim - 9) / 12) * (0-(12)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 32.25 + (((tickAnim - 9) / 7) * (2.5-(32.25)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 2.5 + (((tickAnim - 16) / 3) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -2.5 + (((tickAnim - 19) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.375-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = -0.375 + (((tickAnim - 9) / 7) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (21.91-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 21.91 + (((tickAnim - 7) / 2) * (9.5-(21.91)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 9.5 + (((tickAnim - 9) / 3) * (11.25-(9.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 11.25 + (((tickAnim - 12) / 4) * (-13.5-(11.25)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -13.5 + (((tickAnim - 16) / 3) * (-6.75-(-13.5)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -6.75 + (((tickAnim - 19) / 2) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (16-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16 + (((tickAnim - 8) / 1) * (0-(16)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (14-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 14 + (((tickAnim - 16) / 3) * (0-(14)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFish(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 592;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 3.5 + (((tickAnim - 50) / 500) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 3.5 + (((tickAnim - 550) / 8) * (9.5-(3.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 9.5 + (((tickAnim - 558) / 35) * (0-(9.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.645-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = -0.645 + (((tickAnim - 23) / 27) * (-2.175-(-0.645)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = -2.175 + (((tickAnim - 50) / 500) * (-2.175-(-2.175)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -2.175 + (((tickAnim - 550) / 8) * (-2.18-(-2.175)));
            zz = 0 + (((tickAnim - 550) / 8) * (-2.675-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = -2.18 + (((tickAnim - 558) / 35) * (0-(-2.18)));
            zz = -2.675 + (((tickAnim - 558) / 35) * (0-(-2.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -14.25 + (((tickAnim - 50) / 500) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -14.25 + (((tickAnim - 550) / 8) * (9.25-(-14.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 9.25 + (((tickAnim - 558) / 35) * (0-(9.25)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 24 + (((tickAnim - 50) / 500) * (29.75-(24)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 29.75 + (((tickAnim - 550) / 8) * (17.75-(29.75)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 17.75 + (((tickAnim - 558) / 35) * (0-(17.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -14 + (((tickAnim - 50) / 500) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -18.75 + (((tickAnim - 550) / 8) * (-29.75-(-18.75)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -29.75 + (((tickAnim - 558) / 35) * (0-(-29.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 554) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 17) * (0.4-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            yy = 0.4 + (((tickAnim - 575) / 18) * (0-(0.4)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 18.25 + (((tickAnim - 50) / 500) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 18.25 + (((tickAnim - 550) / 8) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 18.25 + (((tickAnim - 558) / 35) * (0-(18.25)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 17.25 + (((tickAnim - 50) / 500) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 17.25 + (((tickAnim - 550) / 8) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 17.25 + (((tickAnim - 558) / 35) * (0-(17.25)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -9.5 + (((tickAnim - 50) / 500) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -9.5 + (((tickAnim - 550) / 8) * (33.75-(-9.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 33.75 + (((tickAnim - 558) / 10) * (-22.83-(33.75)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = -22.83 + (((tickAnim - 568) / 25) * (0-(-22.83)));
            yy = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            yy = 0.6 + (((tickAnim - 50) / 500) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = 0.6 + (((tickAnim - 550) / 8) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 558) / 10) * (0.23-(0.6)));
            zz = 0 + (((tickAnim - 558) / 10) * (0.75-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            yy = 0.23 + (((tickAnim - 568) / 25) * (0-(0.23)));
            zz = 0.75 + (((tickAnim - 568) / 25) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = -24.5 + (((tickAnim - 50) / 500) * (-24.5-(-24.5)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -24.5 + (((tickAnim - 550) / 3) * (-38.5-(-24.5)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = -38.5 + (((tickAnim - 553) / 5) * (-68.5-(-38.5)));
            yy = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = -68.5 + (((tickAnim - 558) / 10) * (10.23-(-68.5)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 10.23 + (((tickAnim - 568) / 25) * (0-(10.23)));
            yy = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 10) * (0.075-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0.425-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 568) / 25) * (0-(0)));
            yy = 0.075 + (((tickAnim - 568) / 25) * (0-(0.075)));
            zz = 0.425 + (((tickAnim - 568) / 25) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 5.75 + (((tickAnim - 50) / 500) * (5.5-(5.75)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 5.5 + (((tickAnim - 550) / 8) * (-2-(5.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = -2 + (((tickAnim - 558) / 17) * (0-(-2)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 550) {
            xx = 8 + (((tickAnim - 50) / 500) * (8-(8)));
            yy = 0 + (((tickAnim - 50) / 500) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 500) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 8 + (((tickAnim - 550) / 8) * (13.5-(8)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 13.5 + (((tickAnim - 558) / 17) * (0-(13.5)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (38.67962-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (4.3797-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-1.84046-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 38.67962 + (((tickAnim - 50) / 430) * (38.67962-(38.67962)));
            yy = 4.3797 + (((tickAnim - 50) / 430) * (4.3797-(4.3797)));
            zz = -1.84046 + (((tickAnim - 50) / 430) * (-1.84046-(-1.84046)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = 38.67962 + (((tickAnim - 480) / 18) * (40.69124-(38.67962)));
            yy = 4.3797 + (((tickAnim - 480) / 18) * (8.85406-(4.3797)));
            zz = -1.84046 + (((tickAnim - 480) / 18) * (-3.40209-(-1.84046)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = 40.69124 + (((tickAnim - 498) / 18) * (38.21371-(40.69124)));
            yy = 8.85406 + (((tickAnim - 498) / 18) * (13.12504-(8.85406)));
            zz = -3.40209 + (((tickAnim - 498) / 18) * (-4.89273-(-3.40209)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 38.21371 + (((tickAnim - 516) / 34) * (38.21371-(38.21371)));
            yy = 13.12504 + (((tickAnim - 516) / 34) * (13.12504-(13.12504)));
            zz = -4.89273 + (((tickAnim - 516) / 34) * (-4.89273-(-4.89273)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 38.21371 + (((tickAnim - 550) / 8) * (38.21371-(38.21371)));
            yy = 13.12504 + (((tickAnim - 550) / 8) * (13.12504-(13.12504)));
            zz = -4.89273 + (((tickAnim - 550) / 8) * (-4.89273-(-4.89273)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 38.21371 + (((tickAnim - 558) / 35) * (0-(38.21371)));
            yy = 13.12504 + (((tickAnim - 558) / 35) * (0-(13.12504)));
            zz = -4.89273 + (((tickAnim - 558) / 35) * (0-(-4.89273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-87.5-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 290) {
            xx = -87.5 + (((tickAnim - 50) / 240) * (-87-(-87.5)));
            yy = 0 + (((tickAnim - 50) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 240) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = -87 + (((tickAnim - 290) / 55) * (-87-(-87)));
            yy = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 55) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = -87 + (((tickAnim - 345) / 95) * (-87-(-87)));
            yy = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 95) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = -87 + (((tickAnim - 440) / 40) * (-87.5-(-87)));
            yy = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 40) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = -87.5 + (((tickAnim - 480) / 18) * (-99.5-(-87.5)));
            yy = 0 + (((tickAnim - 480) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 18) * (0-(0)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = -99.5 + (((tickAnim - 498) / 18) * (-87.5-(-99.5)));
            yy = 0 + (((tickAnim - 498) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 498) / 18) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = -87.5 + (((tickAnim - 516) / 34) * (-87.5-(-87.5)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -87.5 + (((tickAnim - 550) / 8) * (-45.75-(-87.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -45.75 + (((tickAnim - 558) / 35) * (0-(-45.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-0.4-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = -0.6 + (((tickAnim - 50) / 430) * (-0.6-(-0.6)));
            zz = -0.4 + (((tickAnim - 50) / 430) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = -0.6 + (((tickAnim - 480) / 36) * (-0.6-(-0.6)));
            zz = -0.4 + (((tickAnim - 480) / 36) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = -0.6 + (((tickAnim - 516) / 34) * (-0.6-(-0.6)));
            zz = -0.4 + (((tickAnim - 516) / 34) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -0.6 + (((tickAnim - 550) / 8) * (-0.175-(-0.6)));
            zz = -0.4 + (((tickAnim - 550) / 8) * (1.025-(-0.4)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 558) / 35) * (0-(-0.175)));
            zz = 1.025 + (((tickAnim - 558) / 35) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 34.25 + (((tickAnim - 50) / 430) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 498) {
            xx = 34.25 + (((tickAnim - 480) / 18) * (65.75-(34.25)));
            yy = 0 + (((tickAnim - 480) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 18) * (0-(0)));
        }
        else if (tickAnim >= 498 && tickAnim < 516) {
            xx = 65.75 + (((tickAnim - 498) / 18) * (34.25-(65.75)));
            yy = 0 + (((tickAnim - 498) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 498) / 18) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 34.25 + (((tickAnim - 516) / 34) * (34.25-(34.25)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 34.25 + (((tickAnim - 550) / 8) * (-12.5-(34.25)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -12.5 + (((tickAnim - 558) / 35) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0.125 + (((tickAnim - 23) / 15) * (0.26-(0.125)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.26 + (((tickAnim - 38) / 12) * (0-(0.26)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 36) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 553) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 553) / 1) * (0.325-(0.3)));
            zz = 0 + (((tickAnim - 553) / 1) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 556) {
            xx = 0 + (((tickAnim - 554) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 554) / 2) * (0.24-(0.325)));
            zz = 0 + (((tickAnim - 554) / 2) * (0-(0)));
        }
        else if (tickAnim >= 556 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 556) / 2) * (0-(0)));
            yy = 0.24 + (((tickAnim - 556) / 2) * (0-(0.24)));
            zz = 0 + (((tickAnim - 556) / 2) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            yy = 0.4 + (((tickAnim - 568) / 7) * (0.12-(0.4)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 575) / 5) * (0-(0)));
            yy = 0.12 + (((tickAnim - 575) / 5) * (0.175-(0.12)));
            zz = 0 + (((tickAnim - 575) / 5) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 580) / 13) * (0-(0)));
            yy = 0.175 + (((tickAnim - 580) / 13) * (0-(0.175)));
            zz = 0 + (((tickAnim - 580) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (37.73594-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-2.11758-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.76066-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 37.73594 + (((tickAnim - 50) / 430) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 50) / 430) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 50) / 430) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 37.73594 + (((tickAnim - 480) / 70) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 480) / 70) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 480) / 70) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 37.73594 + (((tickAnim - 550) / 8) * (37.73594-(37.73594)));
            yy = -2.11758 + (((tickAnim - 550) / 8) * (-2.11758-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 550) / 8) * (0.76066-(0.76066)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 37.73594 + (((tickAnim - 558) / 35) * (0-(37.73594)));
            yy = -2.11758 + (((tickAnim - 558) / 35) * (0-(-2.11758)));
            zz = 0.76066 + (((tickAnim - 558) / 35) * (0-(0.76066)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-67-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = -67 + (((tickAnim - 50) / 430) * (-67-(-67)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = -67 + (((tickAnim - 480) / 70) * (-67-(-67)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -67 + (((tickAnim - 550) / 8) * (-27.75-(-67)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -27.75 + (((tickAnim - 558) / 35) * (0-(-27.75)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.925-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            yy = -0.8 + (((tickAnim - 50) / 430) * (-0.8-(-0.8)));
            zz = 0.925 + (((tickAnim - 50) / 430) * (0.925-(0.925)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            yy = -0.8 + (((tickAnim - 480) / 70) * (-0.8-(-0.8)));
            zz = 0.925 + (((tickAnim - 480) / 70) * (0.925-(0.925)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            yy = -0.8 + (((tickAnim - 550) / 8) * (0-(-0.8)));
            zz = 0.925 + (((tickAnim - 550) / 8) * (0.7-(0.925)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0.7 + (((tickAnim - 558) / 35) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 480) {
            xx = 16 + (((tickAnim - 50) / 430) * (16-(16)));
            yy = 0 + (((tickAnim - 50) / 430) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 430) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 16 + (((tickAnim - 480) / 70) * (16-(16)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 16 + (((tickAnim - 550) / 8) * (-30.5-(16)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 593) {
            xx = -30.5 + (((tickAnim - 558) / 35) * (0-(-30.5)));
            yy = 0 + (((tickAnim - 558) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 550) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 550) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 3) * (0.435-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            yy = 0.435 + (((tickAnim - 553) / 5) * (0.15-(0.435)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0.15 + (((tickAnim - 558) / 10) * (0.6-(0.15)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            yy = 0.6 + (((tickAnim - 568) / 7) * (0.51-(0.6)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 580) {
            xx = 0 + (((tickAnim - 575) / 5) * (0-(0)));
            yy = 0.51 + (((tickAnim - 575) / 5) * (0.425-(0.51)));
            zz = 0 + (((tickAnim - 575) / 5) * (0-(0)));
        }
        else if (tickAnim >= 580 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 580) / 13) * (0-(0)));
            yy = 0.425 + (((tickAnim - 580) / 13) * (0-(0.425)));
            zz = 0 + (((tickAnim - 580) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = -7.25 + (((tickAnim - 50) / 65) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 65) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 125) {
            xx = -7.25 + (((tickAnim - 115) / 10) * (-8.70187-(-7.25)));
            yy = 0 + (((tickAnim - 115) / 10) * (19.99821-(0)));
            zz = 0 + (((tickAnim - 115) / 10) * (0.27297-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -8.70187 + (((tickAnim - 125) / 3) * (-8.70187-(-8.70187)));
            yy = 19.99821 + (((tickAnim - 125) / 3) * (19.99821-(19.99821)));
            zz = 0.27297 + (((tickAnim - 125) / 3) * (0.27297-(0.27297)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = -8.70187 + (((tickAnim - 128) / 7) * (-7.25-(-8.70187)));
            yy = 19.99821 + (((tickAnim - 128) / 7) * (0-(19.99821)));
            zz = 0.27297 + (((tickAnim - 128) / 7) * (0-(0.27297)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -7.25 + (((tickAnim - 135) / 30) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 30) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 205) {
            xx = -7.25 + (((tickAnim - 165) / 40) * (18.5-(-7.25)));
            yy = 0 + (((tickAnim - 165) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 40) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = 18.5 + (((tickAnim - 205) / 85) * (18-(18.5)));
            yy = 0 + (((tickAnim - 205) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 85) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = 18 + (((tickAnim - 290) / 55) * (17-(18)));
            yy = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 55) * (0-(0)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = 17 + (((tickAnim - 345) / 95) * (15.25-(17)));
            yy = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 345) / 95) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = 15.25 + (((tickAnim - 440) / 40) * (14-(15.25)));
            yy = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 40) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 14 + (((tickAnim - 480) / 36) * (13.5-(14)));
            yy = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 36) * (0-(0)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 13.5 + (((tickAnim - 516) / 34) * (12.25-(13.5)));
            yy = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 516) / 34) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 12.25 + (((tickAnim - 550) / 4) * (-7.42-(12.25)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = -7.42 + (((tickAnim - 554) / 4) * (32.25-(-7.42)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 32.25 + (((tickAnim - 558) / 10) * (8.54-(32.25)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 8.54 + (((tickAnim - 568) / 7) * (-5-(8.54)));
            yy = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = -5 + (((tickAnim - 575) / 7) * (-12-(-5)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = -12 + (((tickAnim - 582) / 5) * (-5-(-12)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 593) {
            xx = -5 + (((tickAnim - 587) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 587) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.175-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            zz = 0.175 + (((tickAnim - 50) / 65) * (0.175-(0.175)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 115) / 20) * (0-(0)));
            zz = 0.175 + (((tickAnim - 115) / 20) * (0.175-(0.175)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            zz = 0.175 + (((tickAnim - 135) / 30) * (0.175-(0.175)));
        }
        else if (tickAnim >= 165 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 165) / 385) * (0-(0)));
            yy = 0 + (((tickAnim - 165) / 385) * (0-(0)));
            zz = 0.175 + (((tickAnim - 165) / 385) * (0-(0.175)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0.34-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0.34 + (((tickAnim - 554) / 4) * (-0.545-(0.34)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = -0.545 + (((tickAnim - 558) / 17) * (0.055-(-0.545)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0.055 + (((tickAnim - 575) / 7) * (0.405-(0.055)));
        }
        else if (tickAnim >= 582 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            zz = 0.405 + (((tickAnim - 582) / 11) * (0-(0.405)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.08405-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-13.98355-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.68536-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 3.08405 + (((tickAnim - 10) / 40) * (-7.16595-(3.08405)));
            yy = -13.98355 + (((tickAnim - 10) / 40) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 10) / 40) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = -7.16595 + (((tickAnim - 50) / 65) * (-4.91595-(-7.16595)));
            yy = -13.98355 + (((tickAnim - 50) / 65) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 50) / 65) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -4.91595 + (((tickAnim - 115) / 5) * (-8.4943-(-4.91595)));
            yy = -13.98355 + (((tickAnim - 115) / 5) * (7.76074-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 115) / 5) * (2.39242-(-0.68536)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = -8.4943 + (((tickAnim - 120) / 5) * (-4.66674-(-8.4943)));
            yy = 7.76074 + (((tickAnim - 120) / 5) * (13.76363-(7.76074)));
            zz = 2.39242 + (((tickAnim - 120) / 5) * (-0.28554-(2.39242)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = -4.66674 + (((tickAnim - 125) / 3) * (-4.66674-(-4.66674)));
            yy = 13.76363 + (((tickAnim - 125) / 3) * (13.76363-(13.76363)));
            zz = -0.28554 + (((tickAnim - 125) / 3) * (-0.28554-(-0.28554)));
        }
        else if (tickAnim >= 128 && tickAnim < 132) {
            xx = -4.66674 + (((tickAnim - 128) / 4) * (-4.4475-(-4.66674)));
            yy = 13.76363 + (((tickAnim - 128) / 4) * (-21.87535-(13.76363)));
            zz = -0.28554 + (((tickAnim - 128) / 4) * (-1.56418-(-0.28554)));
        }
        else if (tickAnim >= 132 && tickAnim < 135) {
            xx = -4.4475 + (((tickAnim - 132) / 3) * (-3.66595-(-4.4475)));
            yy = -21.87535 + (((tickAnim - 132) / 3) * (-13.98355-(-21.87535)));
            zz = -1.56418 + (((tickAnim - 132) / 3) * (-0.68536-(-1.56418)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = -3.66595 + (((tickAnim - 135) / 30) * (-3.66595-(-3.66595)));
            yy = -13.98355 + (((tickAnim - 135) / 30) * (-13.98355-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 135) / 30) * (-0.68536-(-0.68536)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = -3.66595 + (((tickAnim - 165) / 10) * (-0.88357-(-3.66595)));
            yy = -13.98355 + (((tickAnim - 165) / 10) * (-12.35268-(-13.98355)));
            zz = -0.68536 + (((tickAnim - 165) / 10) * (-0.63246-(-0.68536)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -0.88357 + (((tickAnim - 175) / 13) * (2.19421-(-0.88357)));
            yy = -12.35268 + (((tickAnim - 175) / 13) * (-11.73468-(-12.35268)));
            zz = -0.63246 + (((tickAnim - 175) / 13) * (-0.61242-(-0.63246)));
        }
        else if (tickAnim >= 188 && tickAnim < 205) {
            xx = 2.19421 + (((tickAnim - 188) / 17) * (-8.77037-(2.19421)));
            yy = -11.73468 + (((tickAnim - 188) / 17) * (-11.44081-(-11.73468)));
            zz = -0.61242 + (((tickAnim - 188) / 17) * (1.14078-(-0.61242)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = -8.77037 + (((tickAnim - 205) / 85) * (-10.32009-(-8.77037)));
            yy = -11.44081 + (((tickAnim - 205) / 85) * (-11.63454-(-11.44081)));
            zz = 1.14078 + (((tickAnim - 205) / 85) * (0.13949-(1.14078)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = -10.32009 + (((tickAnim - 290) / 55) * (-9.32009-(-10.32009)));
            yy = -11.63454 + (((tickAnim - 290) / 55) * (-11.63454-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 290) / 55) * (0.13949-(0.13949)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = -9.32009 + (((tickAnim - 345) / 95) * (-6.07009-(-9.32009)));
            yy = -11.63454 + (((tickAnim - 345) / 95) * (-11.63454-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 345) / 95) * (0.13949-(0.13949)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = -6.07009 + (((tickAnim - 440) / 40) * (-4.82009-(-6.07009)));
            yy = -11.63454 + (((tickAnim - 440) / 40) * (-11.63454-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 440) / 40) * (0.13949-(0.13949)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = -4.82009 + (((tickAnim - 480) / 36) * (-3.32009-(-4.82009)));
            yy = -11.63454 + (((tickAnim - 480) / 36) * (-11.63454-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 480) / 36) * (0.13949-(0.13949)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = -3.32009 + (((tickAnim - 516) / 34) * (-2.57009-(-3.32009)));
            yy = -11.63454 + (((tickAnim - 516) / 34) * (-11.63454-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 516) / 34) * (0.13949-(0.13949)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = -2.57009 + (((tickAnim - 550) / 4) * (19.05436-(-2.57009)));
            yy = -11.63454 + (((tickAnim - 550) / 4) * (-9.48581-(-11.63454)));
            zz = 0.13949 + (((tickAnim - 550) / 4) * (-0.53949-(0.13949)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 19.05436 + (((tickAnim - 554) / 4) * (-1.19564-(19.05436)));
            yy = -9.48581 + (((tickAnim - 554) / 4) * (-9.48581-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 554) / 4) * (-0.53949-(-0.53949)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = -1.19564 + (((tickAnim - 558) / 10) * (21.04452-(-1.19564)));
            yy = -9.48581 + (((tickAnim - 558) / 10) * (-3.61364-(-9.48581)));
            zz = -0.53949 + (((tickAnim - 558) / 10) * (-0.20552-(-0.53949)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 21.04452 + (((tickAnim - 568) / 7) * (-15-(21.04452)));
            yy = -3.61364 + (((tickAnim - 568) / 7) * (0-(-3.61364)));
            zz = -0.20552 + (((tickAnim - 568) / 7) * (0-(-0.20552)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = -15 + (((tickAnim - 575) / 7) * (2-(-15)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = 2 + (((tickAnim - 582) / 5) * (-9.75-(2)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 589) {
            xx = -9.75 + (((tickAnim - 587) / 2) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 587) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 2) * (0-(0)));
        }
        else if (tickAnim >= 589 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 589) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 589) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 589) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.01-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 50) / 65) * (0-(0)));
            yy = -0.45 + (((tickAnim - 50) / 65) * (-0.45-(-0.45)));
            zz = 0.01 + (((tickAnim - 50) / 65) * (0.01-(0.01)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 115) / 5) * (0.475-(0)));
            yy = -0.45 + (((tickAnim - 115) / 5) * (-0.45-(-0.45)));
            zz = 0.01 + (((tickAnim - 115) / 5) * (0.435-(0.01)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0.475 + (((tickAnim - 120) / 5) * (0.525-(0.475)));
            yy = -0.45 + (((tickAnim - 120) / 5) * (-0.45-(-0.45)));
            zz = 0.435 + (((tickAnim - 120) / 5) * (0.435-(0.435)));
        }
        else if (tickAnim >= 125 && tickAnim < 128) {
            xx = 0.525 + (((tickAnim - 125) / 3) * (0.525-(0.525)));
            yy = -0.45 + (((tickAnim - 125) / 3) * (-0.45-(-0.45)));
            zz = 0.435 + (((tickAnim - 125) / 3) * (0.435-(0.435)));
        }
        else if (tickAnim >= 128 && tickAnim < 132) {
            xx = 0.525 + (((tickAnim - 128) / 4) * (0.25-(0.525)));
            yy = -0.45 + (((tickAnim - 128) / 4) * (-0.45-(-0.45)));
            zz = 0.435 + (((tickAnim - 128) / 4) * (0.335-(0.435)));
        }
        else if (tickAnim >= 132 && tickAnim < 135) {
            xx = 0.25 + (((tickAnim - 132) / 3) * (0-(0.25)));
            yy = -0.45 + (((tickAnim - 132) / 3) * (-0.45-(-0.45)));
            zz = 0.335 + (((tickAnim - 132) / 3) * (0.335-(0.335)));
        }
        else if (tickAnim >= 135 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 135) / 30) * (0-(0)));
            yy = -0.45 + (((tickAnim - 135) / 30) * (-0.45-(-0.45)));
            zz = 0.335 + (((tickAnim - 135) / 30) * (0.335-(0.335)));
        }
        else if (tickAnim >= 165 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 165) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 165) / 10) * (-0.095-(-0.45)));
            zz = 0.335 + (((tickAnim - 165) / 10) * (0.01-(0.335)));
        }
        else if (tickAnim >= 175 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 175) / 30) * (0-(0)));
            yy = -0.095 + (((tickAnim - 175) / 30) * (0.65-(-0.095)));
            zz = 0.01 + (((tickAnim - 175) / 30) * (0.085-(0.01)));
        }
        else if (tickAnim >= 205 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 205) / 85) * (0-(0)));
            yy = 0.65 + (((tickAnim - 205) / 85) * (0.65-(0.65)));
            zz = 0.085 + (((tickAnim - 205) / 85) * (0.01-(0.085)));
        }
        else if (tickAnim >= 290 && tickAnim < 345) {
            xx = 0 + (((tickAnim - 290) / 55) * (0-(0)));
            yy = 0.65 + (((tickAnim - 290) / 55) * (0.65-(0.65)));
            zz = 0.01 + (((tickAnim - 290) / 55) * (0.01-(0.01)));
        }
        else if (tickAnim >= 345 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 345) / 95) * (0-(0)));
            yy = 0.65 + (((tickAnim - 345) / 95) * (0.575-(0.65)));
            zz = 0.01 + (((tickAnim - 345) / 95) * (0.01-(0.01)));
        }
        else if (tickAnim >= 440 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 440) / 40) * (0-(0)));
            yy = 0.575 + (((tickAnim - 440) / 40) * (0.525-(0.575)));
            zz = 0.01 + (((tickAnim - 440) / 40) * (0.01-(0.01)));
        }
        else if (tickAnim >= 480 && tickAnim < 516) {
            xx = 0 + (((tickAnim - 480) / 36) * (0-(0)));
            yy = 0.525 + (((tickAnim - 480) / 36) * (0.5-(0.525)));
            zz = 0.01 + (((tickAnim - 480) / 36) * (0.01-(0.01)));
        }
        else if (tickAnim >= 516 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 516) / 34) * (0-(0)));
            yy = 0.5 + (((tickAnim - 516) / 34) * (0.45-(0.5)));
            zz = 0.01 + (((tickAnim - 516) / 34) * (0.01-(0.01)));
        }
        else if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 550) / 4) * (-0.3-(0.45)));
            zz = 0.01 + (((tickAnim - 550) / 4) * (0.01-(0.01)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 554) / 4) * (0.73-(-0.3)));
            zz = 0.01 + (((tickAnim - 554) / 4) * (0.835-(0.01)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0.73 + (((tickAnim - 558) / 10) * (0.35-(0.73)));
            zz = 0.835 + (((tickAnim - 558) / 10) * (0.58-(0.835)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 568) / 7) * (-0.575-(0.35)));
            zz = 0.58 + (((tickAnim - 568) / 7) * (0.58-(0.58)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            yy = -0.575 + (((tickAnim - 575) / 18) * (0-(-0.575)));
            zz = 0.58 + (((tickAnim - 575) / 18) * (0-(0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 550 && tickAnim < 554) {
            xx = 0 + (((tickAnim - 550) / 4) * (22.75-(0)));
            yy = 0 + (((tickAnim - 550) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 4) * (0-(0)));
        }
        else if (tickAnim >= 554 && tickAnim < 558) {
            xx = 22.75 + (((tickAnim - 554) / 4) * (0-(22.75)));
            yy = 0 + (((tickAnim - 554) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 554) / 4) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 568) {
            xx = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 558) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 10) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 568) / 7) * (17.5-(0)));
            yy = 0 + (((tickAnim - 568) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 7) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 582) {
            xx = 17.5 + (((tickAnim - 575) / 7) * (0-(17.5)));
            yy = 0 + (((tickAnim - 575) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 7) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 587) {
            xx = 0 + (((tickAnim - 582) / 5) * (15.75-(0)));
            yy = 0 + (((tickAnim - 582) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 5) * (0-(0)));
        }
        else if (tickAnim >= 587 && tickAnim < 589) {
            xx = 15.75 + (((tickAnim - 587) / 2) * (0-(15.75)));
            yy = 0 + (((tickAnim - 587) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 587) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = 11 + (((tickAnim - 50) / 59) * (11.25-(11)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = 11.25 + (((tickAnim - 109) / 26) * (8.25-(11.25)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = 8.25 + (((tickAnim - 135) / 345) * (5.39273-(8.25)));
            yy = 0 + (((tickAnim - 135) / 345) * (0.76943-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (-0.51371-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 5.39273 + (((tickAnim - 480) / 70) * (8.5-(5.39273)));
            yy = 0.76943 + (((tickAnim - 480) / 70) * (0-(0.76943)));
            zz = -0.51371 + (((tickAnim - 480) / 70) * (0-(-0.51371)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = 8.5 + (((tickAnim - 550) / 8) * (11.5-(8.5)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 11.5 + (((tickAnim - 558) / 17) * (7.5-(11.5)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = 7.5 + (((tickAnim - 575) / 18) * (0-(7.5)));
            yy = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = 1 + (((tickAnim - 50) / 59) * (-0.25-(1)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -0.25 + (((tickAnim - 109) / 26) * (-4-(-0.25)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -4 + (((tickAnim - 135) / 345) * (1.5-(-4)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 1.5 + (((tickAnim - 480) / 70) * (-1-(1.5)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 558) {
            xx = -1 + (((tickAnim - 550) / 8) * (11-(-1)));
            yy = 0 + (((tickAnim - 550) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 8) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 575) {
            xx = 11 + (((tickAnim - 558) / 17) * (-4.75-(11)));
            yy = 0 + (((tickAnim - 558) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 17) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 593) {
            xx = -4.75 + (((tickAnim - 575) / 18) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 575) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 135) * (-0.075-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 593) {
            xx = 0 + (((tickAnim - 135) / 458) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 458) * (0-(0)));
            zz = -0.075 + (((tickAnim - 135) / 458) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = -5.25 + (((tickAnim - 50) / 59) * (-11.25-(-5.25)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -11.25 + (((tickAnim - 109) / 26) * (-7.5-(-11.25)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -7.5 + (((tickAnim - 135) / 345) * (-11.25-(-7.5)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = -11.25 + (((tickAnim - 480) / 70) * (-10.25-(-11.25)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -10.25 + (((tickAnim - 550) / 3) * (-3.42-(-10.25)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 558) {
            xx = -3.42 + (((tickAnim - 553) / 5) * (14.75-(-3.42)));
            yy = 0 + (((tickAnim - 553) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 5) * (0-(0)));
        }
        else if (tickAnim >= 558 && tickAnim < 570) {
            xx = 14.75 + (((tickAnim - 558) / 12) * (7-(14.75)));
            yy = 0 + (((tickAnim - 558) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 558) / 12) * (0-(0)));
        }
        else if (tickAnim >= 570 && tickAnim < 582) {
            xx = 7 + (((tickAnim - 570) / 12) * (-11.42-(7)));
            yy = 0 + (((tickAnim - 570) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 570) / 12) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 593) {
            xx = -11.42 + (((tickAnim - 582) / 11) * (0-(-11.42)));
            yy = 0 + (((tickAnim - 582) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-27-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 109) {
            xx = -27 + (((tickAnim - 50) / 59) * (-7.75-(-27)));
            yy = 0 + (((tickAnim - 50) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 59) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 135) {
            xx = -7.75 + (((tickAnim - 109) / 26) * (-6.25-(-7.75)));
            yy = 0 + (((tickAnim - 109) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 26) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 480) {
            xx = -6.25 + (((tickAnim - 135) / 345) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 135) / 345) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 345) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 550) {
            xx = 0 + (((tickAnim - 480) / 70) * (-27-(0)));
            yy = 0 + (((tickAnim - 480) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 70) * (0-(0)));
        }
        else if (tickAnim >= 550 && tickAnim < 553) {
            xx = -27 + (((tickAnim - 550) / 3) * (-28.29-(-27)));
            yy = 0 + (((tickAnim - 550) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 550) / 3) * (0-(0)));
        }
        else if (tickAnim >= 553 && tickAnim < 555) {
            xx = -28.29 + (((tickAnim - 553) / 2) * (-23.44-(-28.29)));
            yy = 0 + (((tickAnim - 553) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 553) / 2) * (0-(0)));
        }
        else if (tickAnim >= 555 && tickAnim < 560) {
            xx = -23.44 + (((tickAnim - 555) / 5) * (17.75-(-23.44)));
            yy = 0 + (((tickAnim - 555) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 555) / 5) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 568) {
            xx = 17.75 + (((tickAnim - 560) / 8) * (25.75-(17.75)));
            yy = 0 + (((tickAnim - 560) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 8) * (0-(0)));
        }
        else if (tickAnim >= 568 && tickAnim < 582) {
            xx = 25.75 + (((tickAnim - 568) / 14) * (-22.56-(25.75)));
            yy = 0 + (((tickAnim - 568) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 568) / 14) * (0-(0)));
        }
        else if (tickAnim >= 582 && tickAnim < 583) {
            xx = -22.56 + (((tickAnim - 582) / 1) * (-23.34-(-22.56)));
            yy = 0 + (((tickAnim - 582) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 582) / 1) * (0-(0)));
        }
        else if (tickAnim >= 583 && tickAnim < 593) {
            xx = -23.34 + (((tickAnim - 583) / 10) * (0-(-23.34)));
            yy = 0 + (((tickAnim - 583) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 583) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animForage(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (118.25-(0)));
            yy = -173.5 + (((tickAnim - 0) / 120) * (-6.5-(-173.5)));
            zz = 0 + (((tickAnim - 0) / 120) * (-180-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 118.25 + (((tickAnim - 120) / 15) * (164.25-(118.25)));
            yy = -6.5 + (((tickAnim - 120) / 15) * (-6.5-(-6.5)));
            zz = -180 + (((tickAnim - 120) / 15) * (-180-(-180)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 164.25 + (((tickAnim - 135) / 5) * (185.75-(164.25)));
            yy = -6.5 + (((tickAnim - 135) / 5) * (-6.5-(-6.5)));
            zz = -180 + (((tickAnim - 135) / 5) * (-180-(-180)));
        }
        else if (tickAnim >= 140 && tickAnim < 153) {
            xx = 185.75 + (((tickAnim - 140) / 13) * (175.4545-(185.75)));
            yy = -6.5 + (((tickAnim - 140) / 13) * (-7.39078-(-6.5)));
            zz = -180 + (((tickAnim - 140) / 13) * (-106.62949-(-180)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(crustacean, crustacean.rotateAngleX + (float) Math.toRadians(xx), crustacean.rotateAngleY + (float) Math.toRadians(yy), crustacean.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = -10.675 + (((tickAnim - 0) / 55) * (-9.73-(-10.675)));
            zz = -14.175 + (((tickAnim - 0) / 55) * (-14.17-(-14.175)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            yy = -9.73 + (((tickAnim - 55) / 10) * (-9.38-(-9.73)));
            zz = -14.17 + (((tickAnim - 55) / 10) * (-14.17-(-14.17)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            yy = -9.38 + (((tickAnim - 65) / 47) * (-8.705-(-9.38)));
            zz = -14.17 + (((tickAnim - 65) / 47) * (-14.17-(-14.17)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (-0.625-(0)));
            yy = -8.705 + (((tickAnim - 112) / 8) * (-8.475-(-8.705)));
            zz = -14.17 + (((tickAnim - 112) / 8) * (-11.495-(-14.17)));
        }
        else if (tickAnim >= 120 && tickAnim < 126) {
            xx = -0.625 + (((tickAnim - 120) / 6) * (-0.46-(-0.625)));
            yy = -8.475 + (((tickAnim - 120) / 6) * (-7.8-(-8.475)));
            zz = -11.495 + (((tickAnim - 120) / 6) * (-11.845-(-11.495)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = -0.46 + (((tickAnim - 126) / 9) * (-0.195-(-0.46)));
            yy = -7.8 + (((tickAnim - 126) / 9) * (-2.97-(-7.8)));
            zz = -11.845 + (((tickAnim - 126) / 9) * (-14.665-(-11.845)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = -0.195 + (((tickAnim - 135) / 5) * (-0.19-(-0.195)));
            yy = -2.97 + (((tickAnim - 135) / 5) * (-1.77-(-2.97)));
            zz = -14.665 + (((tickAnim - 135) / 5) * (-12.22-(-14.665)));
        }
        else if (tickAnim >= 140 && tickAnim < 144) {
            xx = -0.19 + (((tickAnim - 140) / 4) * (0.095-(-0.19)));
            yy = -1.77 + (((tickAnim - 140) / 4) * (-1.77-(-1.77)));
            zz = -12.22 + (((tickAnim - 140) / 4) * (-9.66-(-12.22)));
        }
        else if (tickAnim >= 144 && tickAnim < 145) {
            xx = 0.095 + (((tickAnim - 144) / 1) * (0.06-(0.095)));
            yy = -1.77 + (((tickAnim - 144) / 1) * (-1.77-(-1.77)));
            zz = -9.66 + (((tickAnim - 144) / 1) * (-9.12-(-9.66)));
        }
        else if (tickAnim >= 145 && tickAnim < 149) {
            xx = 0.06 + (((tickAnim - 145) / 4) * (0.24-(0.06)));
            yy = -1.77 + (((tickAnim - 145) / 4) * (-1.71-(-1.77)));
            zz = -9.12 + (((tickAnim - 145) / 4) * (-7.71-(-9.12)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = 0.24 + (((tickAnim - 149) / 4) * (0.295-(0.24)));
            yy = -1.71 + (((tickAnim - 149) / 4) * (-1.63-(-1.71)));
            zz = -7.71 + (((tickAnim - 149) / 4) * (-6.08-(-7.71)));
        }
        else if (tickAnim >= 153 && tickAnim < 155) {
            xx = 0.295 + (((tickAnim - 153) / 2) * (0.27-(0.295)));
            yy = -1.63 + (((tickAnim - 153) / 2) * (-1.515-(-1.63)));
            zz = -6.08 + (((tickAnim - 153) / 2) * (-5.54-(-6.08)));
        }
        else if (tickAnim >= 155 && tickAnim < 170) {
            xx = 0.27 + (((tickAnim - 155) / 15) * (0-(0.27)));
            yy = -1.515 + (((tickAnim - 155) / 15) * (0-(-1.515)));
            zz = -5.54 + (((tickAnim - 155) / 15) * (0-(-5.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.crustacean.rotationPointX = this.crustacean.rotationPointX + (float)(xx);
        this.crustacean.rotationPointY = this.crustacean.rotationPointY - (float)(yy);
        this.crustacean.rotationPointZ = this.crustacean.rotationPointZ + (float)(zz);




        if (tickAnim >= 7 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 7) / 23) * (2-(0)));
            yy = 0 + (((tickAnim - 7) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 23) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 2 + (((tickAnim - 30) / 25) * (2-(2)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 55) / 10) * (5.25-(2)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 5.25 + (((tickAnim - 65) / 55) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 5.25 + (((tickAnim - 120) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.325-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (-0.3-(0)));
            zz = -0.325 + (((tickAnim - 9) / 21) * (-0.52-(-0.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 25) * (-0.3-(-0.3)));
            zz = -0.52 + (((tickAnim - 30) / 25) * (-0.52-(-0.52)));
        }
        else if (tickAnim >= 55 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 55) / 99) * (0-(0)));
            yy = -0.3 + (((tickAnim - 55) / 99) * (-0.3-(-0.3)));
            zz = -0.52 + (((tickAnim - 55) / 99) * (-0.52-(-0.52)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            yy = -0.3 + (((tickAnim - 154) / 16) * (0-(-0.3)));
            zz = -0.52 + (((tickAnim - 154) / 16) * (0-(-0.52)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 4.75 + (((tickAnim - 15) / 40) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 4.75 + (((tickAnim - 55) / 10) * (8.75-(4.75)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 8.75 + (((tickAnim - 65) / 55) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 8.75 + (((tickAnim - 120) / 15) * (18.5-(8.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 18.5 + (((tickAnim - 135) / 19) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 18.5 + (((tickAnim - 154) / 16) * (0-(18.5)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -2.5 + (((tickAnim - 65) / 55) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -2.5 + (((tickAnim - 120) / 15) * (1.25-(-2.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 1.25 + (((tickAnim - 135) / 19) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 1.25 + (((tickAnim - 154) / 16) * (0-(1.25)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = -4 + (((tickAnim - 15) / 40) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -4 + (((tickAnim - 55) / 10) * (-13.75-(-4)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -13.75 + (((tickAnim - 65) / 55) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -13.75 + (((tickAnim - 120) / 15) * (-18.75-(-13.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -18.75 + (((tickAnim - 135) / 19) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = -18.75 + (((tickAnim - 154) / 16) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            yy = -0.175 + (((tickAnim - 135) / 19) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            yy = -0.175 + (((tickAnim - 154) / 16) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 10.25 + (((tickAnim - 15) / 40) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 10.25 + (((tickAnim - 55) / 10) * (12.5-(10.25)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 65) / 55) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 12.5 + (((tickAnim - 120) / 15) * (20.75-(12.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 20.75 + (((tickAnim - 135) / 19) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 20.75 + (((tickAnim - 154) / 16) * (0-(20.75)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -3 + (((tickAnim - 13) / 17) * (0.25-(-3)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 0.25 + (((tickAnim - 30) / 25) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0.25 + (((tickAnim - 55) / 10) * (-3-(0.25)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -3 + (((tickAnim - 65) / 55) * (-3-(-3)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 154) {
            xx = -3 + (((tickAnim - 120) / 34) * (-3-(-3)));
            yy = 0 + (((tickAnim - 120) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 34) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = -3 + (((tickAnim - 154) / 16) * (0-(-3)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -8 + (((tickAnim - 15) / 15) * (-13-(-8)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -13 + (((tickAnim - 30) / 25) * (-13-(-13)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 120) {
            xx = -13 + (((tickAnim - 55) / 65) * (-13-(-13)));
            yy = 0 + (((tickAnim - 55) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 65) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -13 + (((tickAnim - 120) / 15) * (-17.75-(-13)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -17.75 + (((tickAnim - 135) / 19) * (-17.75-(-17.75)));
            yy = 0 + (((tickAnim - 135) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 19) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = -17.75 + (((tickAnim - 154) / 16) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 55) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 2 + (((tickAnim - 65) / 55) * (2-(2)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 2 + (((tickAnim - 120) / 15) * (0-(2)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
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
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 3.5 + (((tickAnim - 30) / 25) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 3.5 + (((tickAnim - 55) / 10) * (9.5-(3.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 9.5 + (((tickAnim - 65) / 55) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 154) {
            xx = 9.5 + (((tickAnim - 120) / 34) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 120) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 34) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 9.5 + (((tickAnim - 154) / 16) * (0-(9.5)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 6 + (((tickAnim - 15) / 15) * (8.75-(6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 8.75 + (((tickAnim - 30) / 25) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 120) {
            xx = 8.75 + (((tickAnim - 55) / 65) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 55) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 65) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 8.75 + (((tickAnim - 120) / 15) * (0-(8.75)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 135) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-46.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = -46.5 + (((tickAnim - 15) / 40) * (-46.5-(-46.5)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -46.5 + (((tickAnim - 55) / 10) * (-65.25-(-46.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -65.25 + (((tickAnim - 65) / 55) * (-65.25-(-65.25)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -65.25 + (((tickAnim - 120) / 15) * (-39.75-(-65.25)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -39.75 + (((tickAnim - 135) / 18) * (-39.75-(-39.75)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -39.75 + (((tickAnim - 153) / 17) * (0-(-39.75)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-26.12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -26.12 + (((tickAnim - 8) / 7) * (19.75-(-26.12)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.75 + (((tickAnim - 15) / 15) * (-4.25-(19.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -4.25 + (((tickAnim - 30) / 25) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -4.25 + (((tickAnim - 55) / 10) * (-12.25-(-4.25)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -12.25 + (((tickAnim - 65) / 55) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -12.25 + (((tickAnim - 120) / 15) * (-5.5-(-12.25)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -5.5 + (((tickAnim - 135) / 18) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 162) {
            xx = -5.5 + (((tickAnim - 153) / 9) * (4.25-(-5.5)));
            yy = 0 + (((tickAnim - 153) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 9) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 170) {
            xx = 4.25 + (((tickAnim - 162) / 8) * (0-(4.25)));
            yy = 0 + (((tickAnim - 162) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 153) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 153) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 9) * (1.6-(0)));
            zz = 0 + (((tickAnim - 153) / 9) * (0.35-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 162) / 8) * (0-(0)));
            yy = 1.6 + (((tickAnim - 162) / 8) * (0-(1.6)));
            zz = 0.35 + (((tickAnim - 162) / 8) * (0-(0.35)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (82.88-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 82.88 + (((tickAnim - 8) / 7) * (19.25-(82.88)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.25 + (((tickAnim - 15) / 15) * (42-(19.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 42 + (((tickAnim - 30) / 25) * (42-(42)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 42 + (((tickAnim - 55) / 10) * (51.5-(42)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 51.5 + (((tickAnim - 65) / 55) * (51.5-(51.5)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 51.5 + (((tickAnim - 120) / 15) * (35.75-(51.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 35.75 + (((tickAnim - 135) / 18) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 162) {
            xx = 35.75 + (((tickAnim - 153) / 9) * (67.37-(35.75)));
            yy = 0 + (((tickAnim - 153) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 9) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 170) {
            xx = 67.37 + (((tickAnim - 162) / 8) * (0-(67.37)));
            yy = 0 + (((tickAnim - 162) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 153) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 153) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 9) * (-0.375-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 162) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 162) / 8) * (0-(0)));
            zz = -0.375 + (((tickAnim - 162) / 8) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = -5.5 + (((tickAnim - 15) / 40) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -5.5 + (((tickAnim - 55) / 10) * (1.25-(-5.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 1.25 + (((tickAnim - 65) / 55) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 1.25 + (((tickAnim - 120) / 15) * (7.75-(1.25)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = 7.75 + (((tickAnim - 135) / 18) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = 7.75 + (((tickAnim - 153) / 17) * (0-(7.75)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 15) / 15) * (-18.5-(3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -18.5 + (((tickAnim - 30) / 25) * (-18.5-(-18.5)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = -18.5 + (((tickAnim - 55) / 10) * (-44.5-(-18.5)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = -44.5 + (((tickAnim - 65) / 55) * (-44.5-(-44.5)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -44.5 + (((tickAnim - 120) / 15) * (-7.25-(-44.5)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -7.25 + (((tickAnim - 135) / 18) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -7.25 + (((tickAnim - 153) / 17) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6.5 + (((tickAnim - 15) / 15) * (9.25-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 9.25 + (((tickAnim - 30) / 25) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 9.25 + (((tickAnim - 55) / 10) * (20-(9.25)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 120) {
            xx = 20 + (((tickAnim - 65) / 55) * (20-(20)));
            yy = 0 + (((tickAnim - 65) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 55) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 20 + (((tickAnim - 120) / 15) * (-11.5-(20)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -11.5 + (((tickAnim - 135) / 18) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 135) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 170) {
            xx = -11.5 + (((tickAnim - 153) / 17) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 153) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.25 + (((tickAnim - 15) / 15) * (13.5-(11.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 13.5 + (((tickAnim - 30) / 10) * (15.5-(13.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 15.5 + (((tickAnim - 40) / 4) * (16-(15.5)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 16 + (((tickAnim - 44) / 11) * (2-(16)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 2 + (((tickAnim - 55) / 10) * (13.75-(2)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 74) {
            xx = 13.75 + (((tickAnim - 65) / 9) * (-18.5-(13.75)));
            yy = 0 + (((tickAnim - 65) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 9) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = -18.5 + (((tickAnim - 74) / 5) * (-16.37012-(-18.5)));
            yy = 0 + (((tickAnim - 74) / 5) * (7.45139-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (1.59322-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 85) {
            xx = -16.37012 + (((tickAnim - 79) / 6) * (7.23973-(-16.37012)));
            yy = 7.45139 + (((tickAnim - 79) / 6) * (16.14469-(7.45139)));
            zz = 1.59322 + (((tickAnim - 79) / 6) * (3.45198-(1.59322)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 7.23973 + (((tickAnim - 85) / 10) * (-0.15853-(7.23973)));
            yy = 16.14469 + (((tickAnim - 85) / 10) * (11.75514-(16.14469)));
            zz = 3.45198 + (((tickAnim - 85) / 10) * (11.38168-(3.45198)));
        }
        else if (tickAnim >= 95 && tickAnim < 112) {
            xx = -0.15853 + (((tickAnim - 95) / 17) * (-18.97679-(-0.15853)));
            yy = 11.75514 + (((tickAnim - 95) / 17) * (4.31464-(11.75514)));
            zz = 11.38168 + (((tickAnim - 95) / 17) * (3.96128-(11.38168)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = -18.97679 + (((tickAnim - 112) / 8) * (22.52321-(-18.97679)));
            yy = 4.31464 + (((tickAnim - 112) / 8) * (4.31464-(4.31464)));
            zz = 3.96128 + (((tickAnim - 112) / 8) * (3.96128-(3.96128)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 22.52321 + (((tickAnim - 120) / 15) * (0-(22.52321)));
            yy = 4.31464 + (((tickAnim - 120) / 15) * (0-(4.31464)));
            zz = 3.96128 + (((tickAnim - 120) / 15) * (0-(3.96128)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 135) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 135) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 10) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 154) {
            xx = -6 + (((tickAnim - 145) / 9) * (-11.25-(-6)));
            yy = 0 + (((tickAnim - 145) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 9) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 163) {
            xx = -11.25 + (((tickAnim - 154) / 9) * (-7.39-(-11.25)));
            yy = 0 + (((tickAnim - 154) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 9) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 170) {
            xx = -7.39 + (((tickAnim - 163) / 7) * (0-(-7.39)));
            yy = 0 + (((tickAnim - 163) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 27.25 + (((tickAnim - 15) / 15) * (21.75-(27.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 21.75 + (((tickAnim - 30) / 3) * (18.25-(21.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 18.25 + (((tickAnim - 33) / 2) * (20.17-(18.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 20.17 + (((tickAnim - 35) / 3) * (18.25-(20.17)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 18.25 + (((tickAnim - 38) / 2) * (18.75-(18.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 18.75 + (((tickAnim - 40) / 4) * (18-(18.75)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 18 + (((tickAnim - 44) / 11) * (38.5-(18)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 38.5 + (((tickAnim - 55) / 5) * (45.13-(38.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 45.13 + (((tickAnim - 60) / 5) * (2.5-(45.13)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = 2.5 + (((tickAnim - 65) / 4) * (27.75-(2.5)));
            yy = 0 + (((tickAnim - 65) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 4) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 27.75 + (((tickAnim - 69) / 5) * (52.75-(27.75)));
            yy = 0 + (((tickAnim - 69) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 52.75 + (((tickAnim - 74) / 11) * (54.93152-(52.75)));
            yy = 0 + (((tickAnim - 74) / 11) * (-13.83168-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (3.77268-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 54.93152 + (((tickAnim - 85) / 10) * (-6.48634-(54.93152)));
            yy = -13.83168 + (((tickAnim - 85) / 10) * (-21.85641-(-13.83168)));
            zz = 3.77268 + (((tickAnim - 85) / 10) * (5.9748+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(3.77268)));
        }
        else if (tickAnim >= 95 && tickAnim < 103) {
            xx = -6.48634 + (((tickAnim - 95) / 8) * (19.20981-(-6.48634)));
            yy = -21.85641 + (((tickAnim - 95) / 8) * (-9.81546-(-21.85641)));
            zz = 5.9748+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 95) / 8) * (-4.15718-(5.9748+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else if (tickAnim >= 103 && tickAnim < 112) {
            xx = 19.20981 + (((tickAnim - 103) / 9) * (42.92202-(19.20981)));
            yy = -9.81546 + (((tickAnim - 103) / 9) * (0.39572-(-9.81546)));
            zz = -4.15718 + (((tickAnim - 103) / 9) * (-9.7534-(-4.15718)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 42.92202 + (((tickAnim - 112) / 5) * (14.33868-(42.92202)));
            yy = 0.39572 + (((tickAnim - 112) / 5) * (0.39572-(0.39572)));
            zz = -9.7534 + (((tickAnim - 112) / 5) * (-9.7534-(-9.7534)));
        }
        else if (tickAnim >= 117 && tickAnim < 120) {
            xx = 14.33868 + (((tickAnim - 117) / 3) * (9.92202-(14.33868)));
            yy = 0.39572 + (((tickAnim - 117) / 3) * (0.39572-(0.39572)));
            zz = -9.7534 + (((tickAnim - 117) / 3) * (-9.7534-(-9.7534)));
        }
        else if (tickAnim >= 120 && tickAnim < 126) {
            xx = 9.92202 + (((tickAnim - 120) / 6) * (21.09308-(9.92202)));
            yy = 0.39572 + (((tickAnim - 120) / 6) * (0.2577-(0.39572)));
            zz = -9.7534 + (((tickAnim - 120) / 6) * (-6.35171-(-9.7534)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = 21.09308 + (((tickAnim - 126) / 9) * (0-(21.09308)));
            yy = 0.2577 + (((tickAnim - 126) / 9) * (0-(0.2577)));
            zz = -6.35171 + (((tickAnim - 126) / 9) * (0-(-6.35171)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 135) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 135) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -17 + (((tickAnim - 140) / 5) * (-10-(-17)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -10 + (((tickAnim - 145) / 5) * (-4-(-10)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = -4 + (((tickAnim - 150) / 4) * (0-(-4)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 154) / 9) * (12.5-(0)));
            yy = 0 + (((tickAnim - 154) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 9) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 170) {
            xx = 12.5 + (((tickAnim - 163) / 7) * (0-(12.5)));
            yy = 0 + (((tickAnim - 163) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 103 && tickAnim < 112) {
            xx = 0 + (((tickAnim - 103) / 9) * (12.5-(0)));
            yy = 0 + (((tickAnim - 103) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 9) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 12.5 + (((tickAnim - 112) / 5) * (32.67-(12.5)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 120) {
            xx = 32.67 + (((tickAnim - 117) / 3) * (0-(32.67)));
            yy = 0 + (((tickAnim - 117) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 3) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 135) / 5) * (23.70408-(0)));
            yy = 0 + (((tickAnim - 135) / 5) * (-0.07116-(0)));
            zz = 0 + (((tickAnim - 135) / 5) * (-0.19712-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 23.70408 + (((tickAnim - 140) / 5) * (0-(23.70408)));
            yy = -0.07116 + (((tickAnim - 140) / 5) * (0-(-0.07116)));
            zz = -0.19712 + (((tickAnim - 140) / 5) * (0-(-0.19712)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (10.25-(0)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 154) {
            xx = 10.25 + (((tickAnim - 150) / 4) * (0-(10.25)));
            yy = 0 + (((tickAnim - 150) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 4) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 154) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 13) / 17) * (5.25-(1.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = 5.25 + (((tickAnim - 30) / 14) * (7.25-(5.25)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 7.25 + (((tickAnim - 44) / 11) * (5.5-(7.25)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 5.5 + (((tickAnim - 55) / 15) * (-2.25-(5.5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 83) {
            xx = -2.25 + (((tickAnim - 70) / 13) * (-2.25519-(-2.25)));
            yy = 0 + (((tickAnim - 70) / 13) * (1.13516-(0)));
            zz = 0 + (((tickAnim - 70) / 13) * (-0.52339-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = -2.25519 + (((tickAnim - 83) / 9) * (-2.25083-(-2.25519)));
            yy = 1.13516 + (((tickAnim - 83) / 9) * (0.45407-(1.13516)));
            zz = -0.52339 + (((tickAnim - 83) / 9) * (-0.20933-(-0.52339)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = -2.25083 + (((tickAnim - 92) / 10) * (-2.35067-(-2.25083)));
            yy = 0.45407 + (((tickAnim - 92) / 10) * (-4.99344-(0.45407)));
            zz = -0.20933 + (((tickAnim - 92) / 10) * (2.30848-(-0.20933)));
        }
        else if (tickAnim >= 102 && tickAnim < 114) {
            xx = -2.35067 + (((tickAnim - 102) / 12) * (-2.55217-(-2.35067)));
            yy = -4.99344 + (((tickAnim - 102) / 12) * (-8.62037-(-4.99344)));
            zz = 2.30848 + (((tickAnim - 102) / 12) * (4.00757-(2.30848)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = -2.55217 + (((tickAnim - 114) / 11) * (-2.43769-(-2.55217)));
            yy = -8.62037 + (((tickAnim - 114) / 11) * (-6.80765-(-8.62037)));
            zz = 4.00757 + (((tickAnim - 114) / 11) * (3.15481-(4.00757)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -2.43769 + (((tickAnim - 125) / 10) * (-2.30317-(-2.43769)));
            yy = -6.80765 + (((tickAnim - 125) / 10) * (-3.63205-(-6.80765)));
            zz = 3.15481 + (((tickAnim - 125) / 10) * (1.67689-(3.15481)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -2.30317 + (((tickAnim - 135) / 19) * (-2.25747-(-2.30317)));
            yy = -3.63205 + (((tickAnim - 135) / 19) * (1.36219-(-3.63205)));
            zz = 1.67689 + (((tickAnim - 135) / 19) * (-0.62811-(1.67689)));
        }
        else if (tickAnim >= 154 && tickAnim < 170) {
            xx = -2.25747 + (((tickAnim - 154) / 16) * (0-(-2.25747)));
            yy = 1.36219 + (((tickAnim - 154) / 16) * (0-(1.36219)));
            zz = -0.62811 + (((tickAnim - 154) / 16) * (0-(-0.62811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 4.25 + (((tickAnim - 13) / 17) * (7.75-(4.25)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 44) {
            xx = 7.75 + (((tickAnim - 30) / 14) * (11-(7.75)));
            yy = 0 + (((tickAnim - 30) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 14) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 11 + (((tickAnim - 44) / 11) * (14.5-(11)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 14.5 + (((tickAnim - 55) / 15) * (6.25-(14.5)));
            yy = 0 + (((tickAnim - 55) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 15) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 83) {
            xx = 6.25 + (((tickAnim - 70) / 13) * (6.21865-(6.25)));
            yy = 0 + (((tickAnim - 70) / 13) * (5.71571-(0)));
            zz = 0 + (((tickAnim - 70) / 13) * (-0.62807-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = 6.21865 + (((tickAnim - 83) / 9) * (6.13397-(6.21865)));
            yy = 5.71571 + (((tickAnim - 83) / 9) * (10.93381-(5.71571)));
            zz = -0.62807 + (((tickAnim - 83) / 9) * (-1.21229-(-0.62807)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = 6.13397 + (((tickAnim - 92) / 10) * (6.15914-(6.13397)));
            yy = 10.93381 + (((tickAnim - 92) / 10) * (9.69149-(10.93381)));
            zz = -1.21229 + (((tickAnim - 92) / 10) * (-1.07169-(-1.21229)));
        }
        else if (tickAnim >= 102 && tickAnim < 114) {
            xx = 6.15914 + (((tickAnim - 102) / 12) * (6.22132-(6.15914)));
            yy = 9.69149 + (((tickAnim - 102) / 12) * (-5.46721-(9.69149)));
            zz = -1.07169 + (((tickAnim - 102) / 12) * (0.60059-(-1.07169)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = 6.22132 + (((tickAnim - 114) / 11) * (6.0995-(6.22132)));
            yy = -5.46721 + (((tickAnim - 114) / 11) * (-12.42451-(-5.46721)));
            zz = 0.60059 + (((tickAnim - 114) / 11) * (1.38258-(0.60059)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 6.0995 + (((tickAnim - 125) / 10) * (6.17272-(6.0995)));
            yy = -12.42451 + (((tickAnim - 125) / 10) * (-8.94607-(-12.42451)));
            zz = 1.38258 + (((tickAnim - 125) / 10) * (0.98784-(1.38258)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = 6.17272 + (((tickAnim - 135) / 19) * (6.24994-(6.17272)));
            yy = -8.94607 + (((tickAnim - 135) / 19) * (0.24851-(-8.94607)));
            zz = 0.98784 + (((tickAnim - 135) / 19) * (-0.02722-(0.98784)));
        }
        else if (tickAnim >= 154 && tickAnim < 160) {
            xx = 6.24994 + (((tickAnim - 154) / 6) * (2.58287-(6.24994)));
            yy = 0.24851 + (((tickAnim - 154) / 6) * (4.98549-(0.24851)));
            zz = -0.02722 + (((tickAnim - 154) / 6) * (-0.81495-(-0.02722)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = 2.58287 + (((tickAnim - 160) / 10) * (0-(2.58287)));
            yy = 4.98549 + (((tickAnim - 160) / 10) * (0-(4.98549)));
            zz = -0.81495 + (((tickAnim - 160) / 10) * (0-(-0.81495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -7.25 + (((tickAnim - 13) / 17) * (-13.5-(-7.25)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 30) / 5) * (-15.29-(-13.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = -15.29 + (((tickAnim - 35) / 9) * (-6.25-(-15.29)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = -6.25 + (((tickAnim - 44) / 11) * (1.75-(-6.25)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = 1.75 + (((tickAnim - 55) / 8) * (-11.25-(1.75)));
            yy = 0 + (((tickAnim - 55) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 8) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -11.25 + (((tickAnim - 63) / 7) * (-8.25-(-11.25)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 78) {
            xx = -8.25 + (((tickAnim - 70) / 8) * (-8.26578-(-8.25)));
            yy = 0 + (((tickAnim - 70) / 8) * (-4.31629-(0)));
            zz = 0 + (((tickAnim - 70) / 8) * (0.24576-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -8.26578 + (((tickAnim - 78) / 5) * (-8.28391-(-8.26578)));
            yy = -4.31629 + (((tickAnim - 78) / 5) * (8.23664-(-4.31629)));
            zz = 0.24576 + (((tickAnim - 78) / 5) * (-0.47096-(0.24576)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = -8.28391 + (((tickAnim - 83) / 9) * (-8.44202-(-8.28391)));
            yy = 8.23664 + (((tickAnim - 83) / 9) * (19.21782-(8.23664)));
            zz = -0.47096 + (((tickAnim - 83) / 9) * (-1.13419-(-0.47096)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = -8.44202 + (((tickAnim - 92) / 10) * (-8.52999-(-8.44202)));
            yy = 19.21782 + (((tickAnim - 92) / 10) * (22.96089-(19.21782)));
            zz = -1.13419 + (((tickAnim - 92) / 10) * (-1.37854-(-1.13419)));
        }
        else if (tickAnim >= 102 && tickAnim < 114) {
            xx = -8.52999 + (((tickAnim - 102) / 12) * (-8.28602-(-8.52999)));
            yy = 22.96089 + (((tickAnim - 102) / 12) * (8.48623-(22.96089)));
            zz = -1.37854 + (((tickAnim - 102) / 12) * (-0.48544-(-1.37854)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = -8.28602 + (((tickAnim - 114) / 11) * (-8.32245-(-8.28602)));
            yy = 8.48623 + (((tickAnim - 114) / 11) * (-11.98041-(8.48623)));
            zz = -0.48544 + (((tickAnim - 114) / 11) * (0.69041-(-0.48544)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -8.32245 + (((tickAnim - 125) / 10) * (-8.60741-(-8.32245)));
            yy = -11.98041 + (((tickAnim - 125) / 10) * (-25.70556-(-11.98041)));
            zz = 0.69041 + (((tickAnim - 125) / 10) * (1.56638-(0.69041)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -8.60741 + (((tickAnim - 135) / 19) * (-8.25198-(-8.60741)));
            yy = -25.70556 + (((tickAnim - 135) / 19) * (1.99678-(-25.70556)));
            zz = 1.56638 + (((tickAnim - 135) / 19) * (-0.11343-(1.56638)));
        }
        else if (tickAnim >= 154 && tickAnim < 160) {
            xx = -8.25198 + (((tickAnim - 154) / 6) * (-2.34938-(-8.25198)));
            yy = 1.99678 + (((tickAnim - 154) / 6) * (12.08755-(1.99678)));
            zz = -0.11343 + (((tickAnim - 154) / 6) * (0.24693-(-0.11343)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -2.34938 + (((tickAnim - 160) / 10) * (0-(-2.34938)));
            yy = 12.08755 + (((tickAnim - 160) / 10) * (0-(12.08755)));
            zz = 0.24693 + (((tickAnim - 160) / 10) * (0-(0.24693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10.15762-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.65055-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.58407-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -10.15762 + (((tickAnim - 13) / 17) * (-21.15762-(-10.15762)));
            yy = -2.65055 + (((tickAnim - 13) / 17) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 13) / 17) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -21.15762 + (((tickAnim - 30) / 5) * (-18.70084-(-21.15762)));
            yy = -2.65055 + (((tickAnim - 30) / 5) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 30) / 5) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -18.70084 + (((tickAnim - 35) / 4) * (-21.40424-(-18.70084)));
            yy = -2.65055 + (((tickAnim - 35) / 4) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 35) / 4) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -21.40424 + (((tickAnim - 39) / 5) * (-17.90762-(-21.40424)));
            yy = -2.65055 + (((tickAnim - 39) / 5) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 39) / 5) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = -17.90762 + (((tickAnim - 44) / 11) * (-2.23215-(-17.90762)));
            yy = -2.65055 + (((tickAnim - 44) / 11) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 44) / 11) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 55 && tickAnim < 63) {
            xx = -2.23215 + (((tickAnim - 55) / 8) * (11.51785-(-2.23215)));
            yy = -2.65055 + (((tickAnim - 55) / 8) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 55) / 8) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 11.51785 + (((tickAnim - 63) / 7) * (-18.23215-(11.51785)));
            yy = -2.65055 + (((tickAnim - 63) / 7) * (-2.65055-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 63) / 7) * (0.58407-(0.58407)));
        }
        else if (tickAnim >= 70 && tickAnim < 83) {
            xx = -18.23215 + (((tickAnim - 70) / 13) * (-18.45112-(-18.23215)));
            yy = -2.65055 + (((tickAnim - 70) / 13) * (-13.2875-(-2.65055)));
            zz = 0.58407 + (((tickAnim - 70) / 13) * (2.15658-(0.58407)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = -18.45112 + (((tickAnim - 83) / 9) * (-18.27066-(-18.45112)));
            yy = -13.2875 + (((tickAnim - 83) / 9) * (-6.11434-(-13.2875)));
            zz = 2.15658 + (((tickAnim - 83) / 9) * (1.08778-(2.15658)));
        }
        else if (tickAnim >= 92 && tickAnim < 102) {
            xx = -18.27066 + (((tickAnim - 92) / 10) * (-18.5636-(-18.27066)));
            yy = -6.11434 + (((tickAnim - 92) / 10) * (16.14946-(-6.11434)));
            zz = 1.08778 + (((tickAnim - 92) / 10) * (-2.19766-(1.08778)));
        }
        else if (tickAnim >= 102 && tickAnim < 114) {
            xx = -18.5636 + (((tickAnim - 102) / 12) * (-19.52825-(-18.5636)));
            yy = 16.14946 + (((tickAnim - 102) / 12) * (30.22451-(16.14946)));
            zz = -2.19766 + (((tickAnim - 102) / 12) * (-4.62892-(-2.19766)));
        }
        else if (tickAnim >= 114 && tickAnim < 125) {
            xx = -19.52825 + (((tickAnim - 114) / 11) * (-18.24136-(-19.52825)));
            yy = 30.22451 + (((tickAnim - 114) / 11) * (3.78254-(30.22451)));
            zz = -4.62892 + (((tickAnim - 114) / 11) * (-0.3467-(-4.62892)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = -18.24136 + (((tickAnim - 125) / 10) * (-18.44253-(-18.24136)));
            yy = 3.78254 + (((tickAnim - 125) / 10) * (-13.04021-(3.78254)));
            zz = -0.3467 + (((tickAnim - 125) / 10) * (2.11886-(-0.3467)));
        }
        else if (tickAnim >= 135 && tickAnim < 154) {
            xx = -18.44253 + (((tickAnim - 135) / 19) * (4.05747-(-18.44253)));
            yy = -13.04021 + (((tickAnim - 135) / 19) * (-13.04021-(-13.04021)));
            zz = 2.11886 + (((tickAnim - 135) / 19) * (2.11886-(2.11886)));
        }
        else if (tickAnim >= 154 && tickAnim < 160) {
            xx = 4.05747 + (((tickAnim - 154) / 6) * (2.50724-(4.05747)));
            yy = -13.04021 + (((tickAnim - 154) / 6) * (19.49077-(-13.04021)));
            zz = 2.11886 + (((tickAnim - 154) / 6) * (6.50458-(2.11886)));
        }
        else if (tickAnim >= 160 && tickAnim < 164) {
            xx = 2.50724 + (((tickAnim - 160) / 4) * (1.63581-(2.50724)));
            yy = 19.49077 + (((tickAnim - 160) / 4) * (19.91542-(19.49077)));
            zz = 6.50458 + (((tickAnim - 160) / 4) * (5.00234-(6.50458)));
        }
        else if (tickAnim >= 164 && tickAnim < 170) {
            xx = 1.63581 + (((tickAnim - 164) / 6) * (0-(1.63581)));
            yy = 19.91542 + (((tickAnim - 164) / 6) * (0-(19.91542)));
            zz = 5.00234 + (((tickAnim - 164) / 6) * (0-(5.00234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 26.75 + (((tickAnim - 0) / 4) * (8.87868-(26.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-6.331-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.54612-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.87868 + (((tickAnim - 4) / 4) * (-9.5-(8.87868)));
            yy = -6.331 + (((tickAnim - 4) / 4) * (0-(-6.331)));
            zz = -1.54612 + (((tickAnim - 4) / 4) * (0-(-1.54612)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -9.5 + (((tickAnim - 8) / 12) * (26.75-(-9.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 18.25 + (((tickAnim - 0) / 2) * (20.6-(18.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 20.6 + (((tickAnim - 2) / 3) * (-16.82-(20.6)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.82 + (((tickAnim - 5) / 3) * (-11.25-(-16.82)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 8) / 12) * (18.25-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.15 + (((tickAnim - 2) / 3) * (1.85-(0.15)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.85 + (((tickAnim - 5) / 3) * (0-(1.85)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
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
            xx = 35.75 + (((tickAnim - 0) / 3) * (79.58-(35.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 79.58 + (((tickAnim - 3) / 2) * (37.15-(79.58)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 37.15 + (((tickAnim - 5) / 2) * (9.95-(37.15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 9.95 + (((tickAnim - 7) / 1) * (19.75-(9.95)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 19.75 + (((tickAnim - 8) / 4) * (2-(19.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 12) / 3) * (-0.5-(2)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (35.75-(-0.5)));
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
            yy = 0.25 + (((tickAnim - 0) / 3) * (1.865-(0.25)));
            zz = -0.6 + (((tickAnim - 0) / 3) * (-0.63-(-0.6)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.865 + (((tickAnim - 3) / 0) * (2.125-(1.865)));
            zz = -0.63 + (((tickAnim - 3) / 0) * (-0.52-(-0.63)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 2.125 + (((tickAnim - 3) / 1) * (1.895-(2.125)));
            zz = -0.52 + (((tickAnim - 3) / 1) * (-0.41-(-0.52)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.895 + (((tickAnim - 4) / 1) * (1.215-(1.895)));
            zz = -0.41 + (((tickAnim - 4) / 1) * (-0.3-(-0.41)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 5) / 2) * (-0.04-(1.215)));
            zz = -0.3 + (((tickAnim - 5) / 2) * (-0.01-(-0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.04 + (((tickAnim - 7) / 1) * (0-(-0.04)));
            zz = -0.01 + (((tickAnim - 7) / 1) * (0.275-(-0.01)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.075-(0)));
            zz = 0.275 + (((tickAnim - 8) / 4) * (0.25-(0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.075 + (((tickAnim - 12) / 3) * (-0.2-(0.075)));
            zz = 0.25 + (((tickAnim - 12) / 3) * (-0.09-(0.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 15) / 5) * (0.25-(-0.2)));
            zz = -0.09 + (((tickAnim - 15) / 5) * (-0.6-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -38.5 + (((tickAnim - 0) / 3) * (7.45-(-38.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.45 + (((tickAnim - 3) / 2) * (25.22-(7.45)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.22 + (((tickAnim - 5) / 2) * (-6-(25.22)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 7) / 1) * (0-(-6)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.125-(0)));
            zz = 0.375 + (((tickAnim - 3) / 2) * (0.48-(0.375)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 5) / 2) * (0-(0.125)));
            zz = 0.48 + (((tickAnim - 5) / 2) * (0-(0.48)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9.5 + (((tickAnim - 0) / 10) * (26.75-(-9.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 26.75 + (((tickAnim - 10) / 5) * (8.87868-(26.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (6.331-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.5461-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 8.87868 + (((tickAnim - 15) / 5) * (-9.5-(8.87868)));
            yy = 6.331 + (((tickAnim - 15) / 5) * (0-(6.331)));
            zz = 1.5461 + (((tickAnim - 15) / 5) * (0-(1.5461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -11.25 + (((tickAnim - 0) / 10) * (18.25-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 10) / 3) * (20.6-(18.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 20.6 + (((tickAnim - 13) / 4) * (-16.82-(20.6)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -16.82 + (((tickAnim - 17) / 3) * (-11.25-(-16.82)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.15-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 4) * (1.85-(0.15)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.85 + (((tickAnim - 17) / 3) * (0-(1.85)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (-0.85-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -0.85 + (((tickAnim - 3) / 7) * (35.75-(-0.85)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 35.75 + (((tickAnim - 10) / 2) * (79.58-(35.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 79.58 + (((tickAnim - 12) / 3) * (37.15-(79.58)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 37.15 + (((tickAnim - 15) / 3) * (9.95-(37.15)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.95 + (((tickAnim - 18) / 2) * (19.75-(9.95)));
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
            yy = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
            zz = 0.275 + (((tickAnim - 0) / 3) * (-0.07-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 3) / 7) * (0.25-(-0.05)));
            zz = -0.07 + (((tickAnim - 3) / 7) * (-0.6-(-0.07)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 2) * (1.615-(0.25)));
            zz = -0.6 + (((tickAnim - 10) / 2) * (-0.63-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.615 + (((tickAnim - 12) / 1) * (2.125-(1.615)));
            zz = -0.63 + (((tickAnim - 12) / 1) * (-0.52-(-0.63)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 2.125 + (((tickAnim - 13) / 1) * (1.895-(2.125)));
            zz = -0.52 + (((tickAnim - 13) / 1) * (-0.41-(-0.52)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.895 + (((tickAnim - 14) / 1) * (1.215-(1.895)));
            zz = -0.41 + (((tickAnim - 14) / 1) * (-0.3-(-0.41)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.215 + (((tickAnim - 15) / 3) * (-0.04-(1.215)));
            zz = -0.3 + (((tickAnim - 15) / 3) * (-0.01-(-0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.04 + (((tickAnim - 18) / 2) * (0-(-0.04)));
            zz = -0.01 + (((tickAnim - 18) / 2) * (0.275-(-0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -30.67 + (((tickAnim - 0) / 2) * (-43-(-30.67)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -43 + (((tickAnim - 2) / 8) * (31-(-43)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 31 + (((tickAnim - 10) / 10) * (-30.67-(31)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -6.38 + (((tickAnim - 0) / 2) * (26.25-(-6.38)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 26.25 + (((tickAnim - 2) / 8) * (-9.25-(26.25)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -9.25 + (((tickAnim - 10) / 3) * (6.45-(-9.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.45 + (((tickAnim - 13) / 5) * (-28.25-(6.45)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -28.25 + (((tickAnim - 18) / 2) * (-6.38-(-28.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.02 + (((tickAnim - 0) / 10) * (0-(0.02)));
            zz = 0.12 + (((tickAnim - 0) / 10) * (0-(0.12)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 5) * (0.025-(0.5)));
            zz = 0.15 + (((tickAnim - 13) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 2) * (0.02-(0.025)));
            zz = 0.15 + (((tickAnim - 18) / 2) * (0.12-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 59.27 + (((tickAnim - 0) / 2) * (15-(59.27)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 15 + (((tickAnim - 2) / 4) * (-2.25-(15)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -2.25 + (((tickAnim - 6) / 4) * (59.5-(-2.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 59.5 + (((tickAnim - 10) / 3) * (105.21-(59.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 105.21 + (((tickAnim - 13) / 5) * (76.92-(105.21)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 76.92 + (((tickAnim - 18) / 2) * (59.27-(76.92)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -0.32 + (((tickAnim - 0) / 2) * (0-(-0.32)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0.3-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0.275-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 6) / 4) * (0-(0.3)));
            zz = 0.275 + (((tickAnim - 6) / 4) * (-0.4-(0.275)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.25-(0)));
            zz = -0.4 + (((tickAnim - 10) / 3) * (-0.46-(-0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 13) / 1) * (0.325-(-0.25)));
            zz = -0.46 + (((tickAnim - 13) / 1) * (-0.505-(-0.46)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 14) / 4) * (0-(0.325)));
            zz = -0.505 + (((tickAnim - 14) / 4) * (-0.505-(-0.505)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -0.505 + (((tickAnim - 18) / 2) * (-0.32-(-0.505)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 0) / 10) * (-43-(31)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -43 + (((tickAnim - 10) / 10) * (31-(-43)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -9.25 + (((tickAnim - 0) / 2) * (6.45-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 6.45 + (((tickAnim - 2) / 3) * (-28.25-(6.45)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -28.25 + (((tickAnim - 5) / 3) * (-22.7-(-28.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.7 + (((tickAnim - 8) / 2) * (26.25-(-22.7)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.25 + (((tickAnim - 10) / 10) * (-9.25-(26.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 3) * (0.025-(0.5)));
            zz = 0.15 + (((tickAnim - 2) / 3) * (0.15-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 15) * (0-(0.025)));
            zz = 0.15 + (((tickAnim - 5) / 15) * (0-(0.15)));
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
            xx = 59.5 + (((tickAnim - 0) / 3) * (105.21-(59.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 105.21 + (((tickAnim - 3) / 2) * (76.92-(105.21)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 76.92 + (((tickAnim - 5) / 3) * (81.4-(76.92)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 81.4 + (((tickAnim - 8) / 2) * (15-(81.4)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 15 + (((tickAnim - 10) / 4) * (1.87-(15)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.87 + (((tickAnim - 14) / 6) * (59.5-(1.87)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
            zz = -0.4 + (((tickAnim - 0) / 3) * (-0.46-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 3) / 2) * (0-(0.35)));
            zz = -0.46 + (((tickAnim - 3) / 2) * (-0.505-(-0.46)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -0.505 + (((tickAnim - 5) / 3) * (-0.475-(-0.505)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -0.475 + (((tickAnim - 8) / 2) * (0-(-0.475)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.325-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 14) / 6) * (0-(0.45)));
            zz = 0.325 + (((tickAnim - 14) / 6) * (-0.4-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-0.28);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -40.25 + (((tickAnim - 7) / 3) * (-38.5-(-40.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.5 + (((tickAnim - 10) / 3) * (7.45-(-38.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.45 + (((tickAnim - 13) / 2) * (25.22-(7.45)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 25.22 + (((tickAnim - 15) / 2) * (-6-(25.22)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -6 + (((tickAnim - 17) / 1) * (0-(-6)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
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
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.375-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.125-(0)));
            zz = 0.375 + (((tickAnim - 13) / 2) * (0.48-(0.375)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 15) / 2) * (0-(0.125)));
            zz = 0.48 + (((tickAnim - 15) / 2) * (0-(0.48)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
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
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-2), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*2), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-240))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+280))*-2), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*-2), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
       

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnatosuchus entity = (EntityPrehistoricFloraAnatosuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-40))*-6), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-0.4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-10))*-2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+35))*1.5);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15.57467 + (((tickAnim - 0) / 4) * (42.41302-(-15.57467)));
            yy = -13.4554 + (((tickAnim - 0) / 4) * (-4.6067-(-13.4554)));
            zz = -2.1789 + (((tickAnim - 0) / 4) * (-0.5129-(-2.1789)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 42.41302 + (((tickAnim - 4) / 5) * (-21.43182-(42.41302)));
            yy = -4.6067 + (((tickAnim - 4) / 5) * (-13.4554-(-4.6067)));
            zz = -0.5129 + (((tickAnim - 4) / 5) * (-2.1789-(-0.5129)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -21.43182 + (((tickAnim - 9) / 1) * (-15.57467-(-21.43182)));
            yy = -13.4554 + (((tickAnim - 9) / 1) * (-13.4554-(-13.4554)));
            zz = -2.1789 + (((tickAnim - 9) / 1) * (-2.1789-(-2.1789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -16 + (((tickAnim - 0) / 4) * (12.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 12.75 + (((tickAnim - 4) / 3) * (-21.32-(12.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -21.32 + (((tickAnim - 7) / 3) * (-16-(-21.32)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (1.475-(-0.05)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0.13-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 3) * (-0.05-(1.475)));
            zz = 0.13 + (((tickAnim - 7) / 3) * (0.125-(0.13)));
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
            xx = 29.5 + (((tickAnim - 0) / 2) * (0.08-(29.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.08 + (((tickAnim - 2) / 1) * (22.91-(0.08)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 22.91 + (((tickAnim - 3) / 1) * (76.75-(22.91)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 76.75 + (((tickAnim - 4) / 2) * (89.74-(76.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 89.74 + (((tickAnim - 6) / 2) * (72.35-(89.74)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.35 + (((tickAnim - 8) / 2) * (29.5-(72.35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 2) * (1.47-(0.025)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.24-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.47 + (((tickAnim - 2) / 1) * (2.425-(1.47)));
            zz = 0.24 + (((tickAnim - 2) / 1) * (0.255-(0.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.425 + (((tickAnim - 3) / 0) * (1.78-(2.425)));
            zz = 0.255 + (((tickAnim - 3) / 0) * (0.065-(0.255)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.78 + (((tickAnim - 3) / 1) * (1.145-(1.78)));
            zz = 0.065 + (((tickAnim - 3) / 1) * (-0.575-(0.065)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.145 + (((tickAnim - 4) / 1) * (1.725-(1.145)));
            zz = -0.575 + (((tickAnim - 4) / 1) * (-0.23-(-0.575)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.725 + (((tickAnim - 5) / 1) * (2.75-(1.725)));
            zz = -0.23 + (((tickAnim - 5) / 1) * (-0.82-(-0.23)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 2.75 + (((tickAnim - 6) / 1) * (2.77-(2.75)));
            zz = -0.82 + (((tickAnim - 6) / 1) * (-0.75-(-0.82)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.77 + (((tickAnim - 7) / 1) * (2.275-(2.77)));
            zz = -0.75 + (((tickAnim - 7) / 1) * (-0.62-(-0.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.275 + (((tickAnim - 8) / 2) * (0.025-(2.275)));
            zz = -0.62 + (((tickAnim - 8) / 2) * (0-(-0.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -35.5 + (((tickAnim - 3) / 0) * (-41.35-(-35.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -41.35 + (((tickAnim - 3) / 2) * (0-(-41.35)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.425 + (((tickAnim - 3) / 7) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15.57467 + (((tickAnim - 0) / 4) * (42.41302-(-15.57467)));
            yy = 13.4554 + (((tickAnim - 0) / 4) * (4.6067-(13.4554)));
            zz = 2.1789 + (((tickAnim - 0) / 4) * (0.5129-(2.1789)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 42.41302 + (((tickAnim - 4) / 5) * (-21.43182-(42.41302)));
            yy = 4.6067 + (((tickAnim - 4) / 5) * (13.4554-(4.6067)));
            zz = 0.5129 + (((tickAnim - 4) / 5) * (2.1789-(0.5129)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -21.43182 + (((tickAnim - 9) / 1) * (-15.57467-(-21.43182)));
            yy = 13.4554 + (((tickAnim - 9) / 1) * (13.4554-(13.4554)));
            zz = 2.1789 + (((tickAnim - 9) / 1) * (2.1789-(2.1789)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -16 + (((tickAnim - 0) / 4) * (12.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 12.75 + (((tickAnim - 4) / 3) * (-21.32-(12.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -21.32 + (((tickAnim - 7) / 3) * (-16-(-21.32)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 7) * (1.475-(-0.05)));
            zz = 0.125 + (((tickAnim - 0) / 7) * (0.13-(0.125)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 7) / 3) * (-0.05-(1.475)));
            zz = 0.13 + (((tickAnim - 7) / 3) * (0.125-(0.13)));
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
            xx = 29.5 + (((tickAnim - 0) / 2) * (-3.75-(29.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -3.75 + (((tickAnim - 2) / 1) * (22.91-(-3.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 22.91 + (((tickAnim - 3) / 1) * (76.75-(22.91)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 76.75 + (((tickAnim - 4) / 2) * (89.74-(76.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 89.74 + (((tickAnim - 6) / 2) * (72.35-(89.74)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 72.35 + (((tickAnim - 8) / 2) * (29.5-(72.35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 2) * (1.32-(0.025)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.24-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.32 + (((tickAnim - 2) / 1) * (2.425-(1.32)));
            zz = 0.24 + (((tickAnim - 2) / 1) * (0.255-(0.24)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.425 + (((tickAnim - 3) / 0) * (1.78-(2.425)));
            zz = 0.255 + (((tickAnim - 3) / 0) * (0.065-(0.255)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.78 + (((tickAnim - 3) / 1) * (1.145-(1.78)));
            zz = 0.065 + (((tickAnim - 3) / 1) * (-0.575-(0.065)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.145 + (((tickAnim - 4) / 1) * (1.725-(1.145)));
            zz = -0.575 + (((tickAnim - 4) / 1) * (-0.23-(-0.575)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.725 + (((tickAnim - 5) / 1) * (2.75-(1.725)));
            zz = -0.23 + (((tickAnim - 5) / 1) * (-0.82-(-0.23)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 2.75 + (((tickAnim - 6) / 1) * (2.77-(2.75)));
            zz = -0.82 + (((tickAnim - 6) / 1) * (-0.75-(-0.82)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.77 + (((tickAnim - 7) / 1) * (2.275-(2.77)));
            zz = -0.75 + (((tickAnim - 7) / 1) * (-0.62-(-0.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.275 + (((tickAnim - 8) / 2) * (0.025-(2.275)));
            zz = -0.62 + (((tickAnim - 8) / 2) * (0-(-0.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-35.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -35.5 + (((tickAnim - 3) / 0) * (-41.35-(-35.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -41.35 + (((tickAnim - 3) / 2) * (0-(-41.35)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.425 + (((tickAnim - 3) / 7) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*-8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*615-80))*-0.2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.125);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*6), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.20546 + (((tickAnim - 0) / 3) * (8.48084-(31.20546)));
            yy = -3.42012 + (((tickAnim - 0) / 3) * (9.54401-(-3.42012)));
            zz = 1.53908 + (((tickAnim - 0) / 3) * (-17.65519-(1.53908)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.48084 + (((tickAnim - 3) / 3) * (-63-(8.48084)));
            yy = 9.54401 + (((tickAnim - 3) / 3) * (0-(9.54401)));
            zz = -17.65519 + (((tickAnim - 3) / 3) * (0-(-17.65519)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -63 + (((tickAnim - 6) / 4) * (31.20546-(-63)));
            yy = 0 + (((tickAnim - 6) / 4) * (-3.42012-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (1.53908-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 6) * (0-(0.6)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.6-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20.75 + (((tickAnim - 0) / 1) * (35.92-(20.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 35.92 + (((tickAnim - 1) / 2) * (-9.1-(35.92)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -9.1 + (((tickAnim - 3) / 1) * (-17.32-(-9.1)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -17.32 + (((tickAnim - 4) / 2) * (27.75-(-17.32)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 27.75 + (((tickAnim - 6) / 4) * (20.75-(27.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 1) / 1) * (0.64-(0.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.64 + (((tickAnim - 2) / 1) * (0.705-(0.64)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.705 + (((tickAnim - 3) / 3) * (-0.175-(0.705)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 6) / 2) * (0.55-(-0.175)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 8) / 2) * (0-(0.55)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.25 + (((tickAnim - 0) / 1) * (78.88-(58.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 78.88 + (((tickAnim - 1) / 2) * (84.18-(78.88)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 84.18 + (((tickAnim - 3) / 1) * (76.04-(84.18)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 76.04 + (((tickAnim - 4) / 2) * (26.75-(76.04)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 26.75 + (((tickAnim - 6) / 1) * (-3.96-(26.75)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -3.96 + (((tickAnim - 7) / 1) * (-8.03-(-3.96)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.03 + (((tickAnim - 8) / 2) * (58.25-(-8.03)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0.45-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 2) / 1) * (0-(0.45)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 1) * (0.825-(0.5)));
            zz = 0 + (((tickAnim - 6) / 1) * (0.3-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 7) / 1) * (-0.3-(0.825)));
            zz = 0.3 + (((tickAnim - 7) / 1) * (0.425-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 8) / 2) * (0-(-0.3)));
            zz = 0.425 + (((tickAnim - 8) / 2) * (0-(0.425)));
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
            xx = 31.20546 + (((tickAnim - 0) / 3) * (3.80945-(31.20546)));
            yy = 3.4201 + (((tickAnim - 0) / 3) * (-5.24285-(3.4201)));
            zz = -1.5391 + (((tickAnim - 0) / 3) * (13.60969-(-1.5391)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 3.80945 + (((tickAnim - 3) / 1) * (-51.5-(3.80945)));
            yy = -5.24285 + (((tickAnim - 3) / 1) * (0-(-5.24285)));
            zz = 13.60969 + (((tickAnim - 3) / 1) * (0-(13.60969)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -51.5 + (((tickAnim - 4) / 6) * (31.20546-(-51.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (3.4201-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-1.5391-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 4) * (0-(0.6)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.6-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 20.75 + (((tickAnim - 0) / 1) * (35.92-(20.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 35.92 + (((tickAnim - 1) / 2) * (-28.1-(35.92)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -28.1 + (((tickAnim - 3) / 1) * (39-(-28.1)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 39 + (((tickAnim - 4) / 6) * (20.75-(39)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 1) / 1) * (0.64-(0.275)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.64 + (((tickAnim - 2) / 1) * (0.705-(0.64)));
            zz = 0.075 + (((tickAnim - 2) / 1) * (0-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.705 + (((tickAnim - 3) / 1) * (0-(0.705)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.375-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.375 + (((tickAnim - 6) / 4) * (0-(0.375)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 58.25 + (((tickAnim - 0) / 1) * (78.88-(58.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 78.88 + (((tickAnim - 1) / 2) * (84.18-(78.88)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 84.18 + (((tickAnim - 3) / 1) * (23.25-(84.18)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 23.25 + (((tickAnim - 4) / 1) * (-4.97-(23.25)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -4.97 + (((tickAnim - 5) / 1) * (-20.46-(-4.97)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.46 + (((tickAnim - 6) / 2) * (-3.28-(-20.46)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -3.28 + (((tickAnim - 8) / 0) * (28.36-(-3.28)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28.36 + (((tickAnim - 8) / 2) * (58.25-(28.36)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0.7-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 2) / 1) * (0-(0.7)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.225-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.225 + (((tickAnim - 4) / 1) * (0.595-(0.225)));
            zz = 0 + (((tickAnim - 4) / 1) * (0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.595 + (((tickAnim - 5) / 1) * (0.45-(0.595)));
            zz = 0.125 + (((tickAnim - 5) / 1) * (0.125-(0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 2) * (0-(0.45)));
            zz = 0.125 + (((tickAnim - 6) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0.575-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (-0.32-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 2) * (0-(0.575)));
            zz = -0.32 + (((tickAnim - 8) / 2) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-20))*15), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0.1);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-310))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-6), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-140))*-6), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-9), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-9), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnatosuchus e = (EntityPrehistoricFloraAnatosuchus) entity;
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
