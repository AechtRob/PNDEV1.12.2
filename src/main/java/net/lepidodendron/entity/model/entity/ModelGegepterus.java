package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGegepterus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelGegepterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer leftMem;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftMem2;
    private final AdvancedModelRenderer leftMem7;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftMem3;
    private final AdvancedModelRenderer leftMem8;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftMem4;
    private final AdvancedModelRenderer leftMem9;
    private final AdvancedModelRenderer leftWing5;
    private final AdvancedModelRenderer leftMem5;
    private final AdvancedModelRenderer leftMem10;
    private final AdvancedModelRenderer leftWing6;
    private final AdvancedModelRenderer leftMem6;
    private final AdvancedModelRenderer leftMem11;
    private final AdvancedModelRenderer hand;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightMem;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightMem2;
    private final AdvancedModelRenderer rightMem7;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightMem3;
    private final AdvancedModelRenderer rightMem8;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer rightMem4;
    private final AdvancedModelRenderer rightMem9;
    private final AdvancedModelRenderer rightWing5;
    private final AdvancedModelRenderer rightMem5;
    private final AdvancedModelRenderer rightMem10;
    private final AdvancedModelRenderer rightWing6;
    private final AdvancedModelRenderer rightMem6;
    private final AdvancedModelRenderer rightMem11;
    private final AdvancedModelRenderer hand2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r8;

    private ModelAnimator animator;

    public ModelGegepterus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 16.0822F, 6.6209F);
        this.setRotateAngle(main, -0.48F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 48, -1.0F, -1.5F, -2.5F, 3, 3, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.0F, 0.2F, -1.425F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0871F, 0.2341F, -0.0732F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 18, 59, -1.0F, -1.0F, 0.0F, 2, 4, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.1261F, 2.6645F, -0.0348F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7393F, -0.0393F, 0.1249F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 64, -0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 21, 27, 0.0F, 0.0F, 1.0F, 0, 6, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0076F, 5.5952F, 0.2065F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1843F, -0.1621F, 0.0737F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 57, 40, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.0F, 0.2F, -1.425F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0871F, -0.2341F, 0.0732F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 18, 59, -1.0F, -1.0F, 0.0F, 2, 4, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.1261F, 2.6645F, -0.0348F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7393F, 0.0393F, -0.1249F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 64, -0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 21, 27, 0.0F, 0.0F, 1.0F, 0, 6, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.0076F, 5.5952F, 0.2065F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1843F, 0.1621F, -0.0737F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 57, 40, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.9F, 0.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 57, 34, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5F, -1.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 38, -1.5F, -0.25F, -5.0F, 4, 4, 5, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(2.2734F, 1.3944F, -4.0F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.0F, 0.0F, -0.7854F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 46, 22, -0.5F, -1.25F, -0.5F, 1, 5, 4, 0.0F, false));

        this.leftMem = new AdvancedModelRenderer(this);
        this.leftMem.setRotationPoint(0.5F, 1.75F, 3.5F);
        this.leftWing.addChild(leftMem);
        this.setRotateAngle(leftMem, 0.0F, -0.6545F, 0.0F);
        this.leftMem.cubeList.add(new ModelBox(leftMem, 39, 58, -1.0F, -2.0F, 0.0F, 1, 4, 3, -0.001F, false));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, 0.1315F, -0.0171F, 0.7409F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 28, 47, -0.5F, 0.0F, -0.5F, 1, 5, 3, 0.001F, false));

        this.leftMem2 = new AdvancedModelRenderer(this);
        this.leftMem2.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.leftWing2.addChild(leftMem2);
        this.setRotateAngle(leftMem2, 0.0F, -0.1745F, 0.0F);
        this.leftMem2.cubeList.add(new ModelBox(leftMem2, 0, 55, -1.0F, 0.0F, 0.0F, 1, 5, 3, -0.001F, false));

        this.leftMem7 = new AdvancedModelRenderer(this);
        this.leftMem7.setRotationPoint(-0.6095F, -2.0998F, 2.7008F);
        this.leftMem2.addChild(leftMem7);
        this.setRotateAngle(leftMem7, -0.5247F, 0.0832F, -0.0263F);
        this.leftMem7.cubeList.add(new ModelBox(leftMem7, 40, 46, 0.0F, -1.0F, 1.0F, 0, 7, 4, 0.0F, false));
        this.leftMem7.cubeList.add(new ModelBox(leftMem7, 19, 47, 0.05F, -1.0F, 1.0F, 0, 7, 4, 0.0F, false));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(0.5F, 5.0F, -0.5F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.4361F, -0.0131F, 0.0416F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 63, 0, -1.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

        this.leftMem3 = new AdvancedModelRenderer(this);
        this.leftMem3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftWing3.addChild(leftMem3);
        this.setRotateAngle(leftMem3, 0.0F, -0.1309F, 0.0F);
        this.leftMem3.cubeList.add(new ModelBox(leftMem3, 9, 55, -1.0F, 0.0F, 0.0F, 1, 4, 3, -0.002F, false));

        this.leftMem8 = new AdvancedModelRenderer(this);
        this.leftMem8.setRotationPoint(-1.036F, 4.0F, 4.8895F);
        this.leftWing3.addChild(leftMem8);
        this.setRotateAngle(leftMem8, 0.0F, -0.1309F, 0.0F);
        this.leftMem8.cubeList.add(new ModelBox(leftMem8, 13, 48, 0.25F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));
        this.leftMem8.cubeList.add(new ModelBox(leftMem8, 48, 64, 0.2F, -4.0F, 0.0F, 0, 4, 2, 0.0F, false));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -0.1745F, 0.0F, 0.0F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 62, 45, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.001F, false));

        this.leftMem4 = new AdvancedModelRenderer(this);
        this.leftMem4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftWing4.addChild(leftMem4);
        this.setRotateAngle(leftMem4, 0.0F, 0.0F, -0.1745F);
        this.leftMem4.cubeList.add(new ModelBox(leftMem4, 59, 59, -1.0F, -3.0F, 0.0F, 1, 3, 3, -0.001F, false));

        this.leftMem9 = new AdvancedModelRenderer(this);
        this.leftMem9.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.leftMem4.addChild(leftMem9);
        this.leftMem9.cubeList.add(new ModelBox(leftMem9, 63, 7, -0.25F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));
        this.leftMem9.cubeList.add(new ModelBox(leftMem9, 9, 63, -0.2F, -2.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.leftWing5 = new AdvancedModelRenderer(this);
        this.leftWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 1.0472F, 0.0F, 0.0F);
        this.leftWing5.cubeList.add(new ModelBox(leftWing5, 25, 13, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.leftMem5 = new AdvancedModelRenderer(this);
        this.leftMem5.setRotationPoint(-0.5F, -0.925F, -0.5F);
        this.leftWing5.addChild(leftMem5);
        this.setRotateAngle(leftMem5, 0.0F, 0.0F, -0.0873F);
        this.leftMem5.cubeList.add(new ModelBox(leftMem5, 25, 0, -0.5F, -3.0F, 0.5F, 1, 3, 9, 0.001F, false));

        this.leftMem10 = new AdvancedModelRenderer(this);
        this.leftMem10.setRotationPoint(0.1514F, -2.9848F, 1.0F);
        this.leftMem5.addChild(leftMem10);
        this.leftMem10.cubeList.add(new ModelBox(leftMem10, 22, 36, 0.0F, -2.0F, -0.5F, 0, 2, 8, 0.0F, false));
        this.leftMem10.cubeList.add(new ModelBox(leftMem10, 46, 11, -0.075F, -2.0F, -0.5F, 0, 2, 8, 0.0F, false));

        this.leftWing6 = new AdvancedModelRenderer(this);
        this.leftWing6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.3927F, 0.0F, 0.0F);
        this.leftWing6.cubeList.add(new ModelBox(leftWing6, 0, 14, -1.0F, -1.0F, 0.0F, 1, 1, 11, 0.001F, false));

        this.leftMem6 = new AdvancedModelRenderer(this);
        this.leftMem6.setRotationPoint(-0.5F, -0.95F, 0.0F);
        this.leftWing6.addChild(leftMem6);
        this.setRotateAngle(leftMem6, 0.0F, 0.0F, -0.0873F);
        this.leftMem6.cubeList.add(new ModelBox(leftMem6, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 11, 0.0F, false));

        this.leftMem11 = new AdvancedModelRenderer(this);
        this.leftMem11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftMem6.addChild(leftMem11);
        this.leftMem11.cubeList.add(new ModelBox(leftMem11, 40, 35, 0.05F, -2.0F, 0.0F, 0, 2, 8, 0.0F, false));
        this.leftMem11.cubeList.add(new ModelBox(leftMem11, 46, 0, 0.075F, -2.0F, 0.0F, 0, 2, 8, 0.0F, false));

        this.hand = new AdvancedModelRenderer(this);
        this.hand.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftWing4.addChild(hand);
        this.setRotateAngle(hand, -0.1501F, 0.5859F, 0.0598F);
        this.hand.cubeList.add(new ModelBox(hand, 53, 66, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.2734F, 1.3944F, -4.0F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.0F, 0.0F, 0.7854F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 46, 22, -0.5F, -1.25F, -0.5F, 1, 5, 4, 0.0F, true));

        this.rightMem = new AdvancedModelRenderer(this);
        this.rightMem.setRotationPoint(-0.5F, 1.75F, 3.5F);
        this.rightWing.addChild(rightMem);
        this.setRotateAngle(rightMem, 0.0F, 0.6545F, 0.0F);
        this.rightMem.cubeList.add(new ModelBox(rightMem, 39, 58, 0.0F, -2.0F, 0.0F, 1, 4, 3, -0.001F, true));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, 0.1315F, 0.0171F, -0.7409F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 28, 47, -0.5F, 0.0F, -0.5F, 1, 5, 3, 0.001F, true));

        this.rightMem2 = new AdvancedModelRenderer(this);
        this.rightMem2.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.rightWing2.addChild(rightMem2);
        this.setRotateAngle(rightMem2, 0.0F, 0.1745F, 0.0F);
        this.rightMem2.cubeList.add(new ModelBox(rightMem2, 0, 55, 0.0F, 0.0F, 0.0F, 1, 5, 3, -0.001F, true));

        this.rightMem7 = new AdvancedModelRenderer(this);
        this.rightMem7.setRotationPoint(0.6095F, -2.0998F, 2.7008F);
        this.rightMem2.addChild(rightMem7);
        this.setRotateAngle(rightMem7, -0.5247F, -0.0832F, 0.0263F);
        this.rightMem7.cubeList.add(new ModelBox(rightMem7, 40, 46, 0.0F, -1.0F, 1.0F, 0, 7, 4, 0.0F, true));
        this.rightMem7.cubeList.add(new ModelBox(rightMem7, 19, 47, -0.05F, -1.0F, 1.0F, 0, 7, 4, 0.0F, true));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.5F, 5.0F, -0.5F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.4361F, 0.0131F, -0.0416F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 63, 0, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, true));

        this.rightMem3 = new AdvancedModelRenderer(this);
        this.rightMem3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightWing3.addChild(rightMem3);
        this.setRotateAngle(rightMem3, 0.0F, 0.1309F, 0.0F);
        this.rightMem3.cubeList.add(new ModelBox(rightMem3, 9, 55, 0.0F, 0.0F, 0.0F, 1, 4, 3, -0.002F, true));

        this.rightMem8 = new AdvancedModelRenderer(this);
        this.rightMem8.setRotationPoint(1.036F, 4.0F, 4.8895F);
        this.rightWing3.addChild(rightMem8);
        this.setRotateAngle(rightMem8, 0.0F, 0.1309F, 0.0F);
        this.rightMem8.cubeList.add(new ModelBox(rightMem8, 13, 48, -0.25F, -4.0F, 0.0F, 0, 4, 2, 0.0F, true));
        this.rightMem8.cubeList.add(new ModelBox(rightMem8, 48, 64, -0.2F, -4.0F, 0.0F, 0, 4, 2, 0.0F, true));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -0.1745F, 0.0F, 0.0F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 62, 45, 0.0F, -2.0F, 0.0F, 1, 2, 3, 0.001F, true));

        this.rightMem4 = new AdvancedModelRenderer(this);
        this.rightMem4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightWing4.addChild(rightMem4);
        this.setRotateAngle(rightMem4, 0.0F, 0.0F, 0.1745F);
        this.rightMem4.cubeList.add(new ModelBox(rightMem4, 59, 59, 0.0F, -3.0F, 0.0F, 1, 3, 3, -0.001F, true));

        this.rightMem9 = new AdvancedModelRenderer(this);
        this.rightMem9.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.rightMem4.addChild(rightMem9);
        this.rightMem9.cubeList.add(new ModelBox(rightMem9, 63, 7, 0.25F, -2.0F, -3.0F, 0, 2, 3, 0.0F, true));
        this.rightMem9.cubeList.add(new ModelBox(rightMem9, 9, 63, 0.2F, -2.0F, -3.0F, 0, 2, 3, 0.0F, true));

        this.rightWing5 = new AdvancedModelRenderer(this);
        this.rightWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 1.0472F, 0.0F, 0.0F);
        this.rightWing5.cubeList.add(new ModelBox(rightWing5, 25, 13, 0.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, true));

        this.rightMem5 = new AdvancedModelRenderer(this);
        this.rightMem5.setRotationPoint(0.5F, -0.925F, -0.5F);
        this.rightWing5.addChild(rightMem5);
        this.setRotateAngle(rightMem5, 0.0F, 0.0F, 0.0873F);
        this.rightMem5.cubeList.add(new ModelBox(rightMem5, 25, 0, -0.5F, -3.0F, 0.5F, 1, 3, 9, 0.001F, true));

        this.rightMem10 = new AdvancedModelRenderer(this);
        this.rightMem10.setRotationPoint(-0.1514F, -2.9848F, 1.0F);
        this.rightMem5.addChild(rightMem10);
        this.rightMem10.cubeList.add(new ModelBox(rightMem10, 22, 36, 0.0F, -2.0F, -0.5F, 0, 2, 8, 0.0F, true));
        this.rightMem10.cubeList.add(new ModelBox(rightMem10, 46, 11, 0.075F, -2.0F, -0.5F, 0, 2, 8, 0.0F, true));

        this.rightWing6 = new AdvancedModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.3927F, 0.0F, 0.0F);
        this.rightWing6.cubeList.add(new ModelBox(rightWing6, 0, 14, 0.0F, -1.0F, 0.0F, 1, 1, 11, 0.001F, true));

        this.rightMem6 = new AdvancedModelRenderer(this);
        this.rightMem6.setRotationPoint(0.5F, -0.95F, 0.0F);
        this.rightWing6.addChild(rightMem6);
        this.setRotateAngle(rightMem6, 0.0F, 0.0F, 0.0873F);
        this.rightMem6.cubeList.add(new ModelBox(rightMem6, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 11, 0.0F, true));

        this.rightMem11 = new AdvancedModelRenderer(this);
        this.rightMem11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightMem6.addChild(rightMem11);
        this.rightMem11.cubeList.add(new ModelBox(rightMem11, 40, 35, -0.05F, -2.0F, 0.0F, 0, 2, 8, 0.0F, true));
        this.rightMem11.cubeList.add(new ModelBox(rightMem11, 46, 0, -0.075F, -2.0F, 0.0F, 0, 2, 8, 0.0F, true));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightWing4.addChild(hand2);
        this.setRotateAngle(hand2, -0.1501F, -0.5859F, -0.0598F);
        this.hand2.cubeList.add(new ModelBox(hand2, 53, 66, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.002F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2826F, -4.2521F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 49, 46, -1.0F, -0.25F, -3.0F, 3, 3, 3, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.025F, -2.15F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3011F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 49, 53, -1.0F, -0.25F, -3.0F, 3, 2, 3, 0.002F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 48, 59, -0.5F, 1.5F, -3.0F, 2, 1, 3, -0.001F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 28, 56, -0.5F, -0.2F, -3.0F, 2, 2, 3, 0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, 0.3883F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.2F, 1.425F);
        this.throat.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 61, -0.5F, -1.05F, -4.175F, 1, 2, 4, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.1479F, -2.1828F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1789F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 57, 22, -0.5F, -0.2F, -2.5F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.775F, -2.25F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 1.7453F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 57, 28, -0.5F, -1.775F, -1.5F, 2, 2, 3, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 32, 0.75F, -1.625F, -0.6F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 32, -0.75F, -1.625F, -0.6F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.775F, -1.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 24, -0.5F, 0.0F, -8.75F, 1, 1, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -2.7837F, -10.2983F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4451F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 13, -0.5F, 0.0185F, -0.0375F, 0, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0288F, -9.7343F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 47, -0.25F, -0.175F, -0.45F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 47, 0.25F, -0.175F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0288F, -9.7343F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 66, -0.25F, -0.175F, 0.85F, 0, 1, 3, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 66, 0.25F, -0.175F, 0.85F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -0.835F, -1.1742F);
        this.head.addChild(jaw);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.369F, -9.1572F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 51, -0.4F, -1.2F, 0.0F, 0, 1, 4, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 51, 0.4F, -1.2F, 0.0F, 0, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0568F, -0.242F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 27, -0.5F, -1.0F, -9.025F, 1, 1, 9, -0.001F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(-1.0F, 0.1273F, -1.8597F);
        this.jaw.addChild(throat2);
        this.setRotateAngle(throat2, 0.3491F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -0.25F, -0.975F);
        this.throat2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 66, 0.0F, 0.0F, 1.0F, 1, 3, 2, -0.002F, false));


        this.leftMem11.setScale((float)1,(float)0,(float)0);
        this.leftMem6.setScale((float)1,(float)0,(float)0);
        this.leftMem5.setScale((float)1,(float)0,(float)0);
        this.leftMem10.setScale((float)1,(float)0,(float)0);
        this.leftMem2.setScale((float)1,(float)0,(float)0);
        this.leftMem7.setScale((float)1,(float)0,(float)0);
        this.leftMem3.setScale((float)1,(float)0,(float)0);
        this.leftMem8.setScale((float)1,(float)0,(float)0);
        this.leftMem4.setScale((float)1,(float)0,(float)0);
        this.leftMem9.setScale((float)1,(float)0,(float)0);
        this.leftMem.setScale((float)1,(float)0,(float)0);
        this.rightMem11.setScale((float)1,(float)0,(float)0);
        this.rightMem6.setScale((float)1,(float)0,(float)0);
        this.rightMem5.setScale((float)1,(float)0,(float)0);
        this.rightMem10.setScale((float)1,(float)0,(float)0);
        this.rightMem2.setScale((float)1,(float)0,(float)0);
        this.rightMem7.setScale((float)1,(float)0,(float)0);
        this.rightMem3.setScale((float)1,(float)0,(float)0);
        this.rightMem8.setScale((float)1,(float)0,(float)0);
        this.rightMem4.setScale((float)1,(float)0,(float)0);
        this.rightMem9.setScale((float)1,(float)0,(float)0);
        this.rightMem.setScale((float)1,(float)0,(float)0);


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.main.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.4F, 3.8F, -0.0F);
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
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 8, neck3);
            this.faceTarget(f3, f4, 4, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 12, neck3);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGegepterus ee = (EntityPrehistoricFloraGegepterus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftMem11.setScale((float)1,(float)1,(float)1);
            this.leftMem6.setScale((float)1,(float)1,(float)1);
            this.leftMem5.setScale((float)1,(float)1,(float)1);
            this.leftMem10.setScale((float)1,(float)1,(float)1);
            this.leftMem2.setScale((float)1,(float)1,(float)1);
            this.leftMem7.setScale((float)1,(float)1,(float)1);
            this.leftMem3.setScale((float)1,(float)1,(float)1);
            this.leftMem8.setScale((float)1,(float)1,(float)1);
            this.leftMem4.setScale((float)1,(float)1,(float)1);
            this.leftMem9.setScale((float)1,(float)1,(float)1);
            this.leftMem.setScale((float)1,(float)1,(float)1);
            this.rightMem11.setScale((float)1,(float)1,(float)1);
            this.rightMem6.setScale((float)1,(float)1,(float)1);
            this.rightMem5.setScale((float)1,(float)1,(float)1);
            this.rightMem10.setScale((float)1,(float)1,(float)1);
            this.rightMem2.setScale((float)1,(float)1,(float)1);
            this.rightMem7.setScale((float)1,(float)1,(float)1);
            this.rightMem3.setScale((float)1,(float)1,(float)1);
            this.rightMem8.setScale((float)1,(float)1,(float)1);
            this.rightMem4.setScale((float)1,(float)1,(float)1);
            this.rightMem9.setScale((float)1,(float)1,(float)1);
            this.rightMem.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.4451F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(hand, -0.1501F, 0.5859F, 0.0598F);
            this.setRotateAngle(hand2, -0.1501F, -0.5859F, -0.0598F);
            this.setRotateAngle(head, 1.6799F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.4567F, 0.0027F, -1.5224F);
            this.setRotateAngle(leftLeg2, 0.7393F, -0.0393F, 0.1249F);
            this.setRotateAngle(leftLeg3, 0.5356F, -0.1621F, 0.0737F);
            this.setRotateAngle(leftMem, 0.0F, -0.2182F, 0.0F);
            this.setRotateAngle(leftMem2, 0.0F, -0.1745F, 0.0F);
            this.setRotateAngle(leftMem3, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(leftMem4, 0.0F, 0.0F, -0.1745F);
            this.setRotateAngle(leftMem5, 0.0F, 0.0F, -0.0873F);
            this.setRotateAngle(leftMem6, 0.0F, 0.0F, -0.0873F);
            this.setRotateAngle(leftMem7, -0.5247F, 0.0832F, -0.0263F);
            this.setRotateAngle(leftMem8, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(leftWing, -0.0653F, -0.0037F, -1.6361F);
            this.setRotateAngle(leftWing2, 0.0F, 0.0F, -0.0131F);
            this.setRotateAngle(leftWing3, 0.048F, 0.0F, 0.0654F);
            this.setRotateAngle(leftWing4, -1.4582F, -0.0136F, 0.1302F);
            this.setRotateAngle(leftWing5, 0.1924F, -0.0822F, -0.0105F);
            this.setRotateAngle(leftWing6, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(main, -0.1004F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.0087F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2705F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.2574F, 0.0F, 0.0F);
            this.setRotateAngle(neck4, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, 0.4567F, -0.0027F, 1.5224F);
            this.setRotateAngle(rightLeg2, 0.7393F, 0.0393F, -0.1249F);
            this.setRotateAngle(rightLeg3, 0.5356F, 0.1621F, -0.0737F);
            this.setRotateAngle(rightMem, 0.0F, 0.2182F, 0.0F);
            this.setRotateAngle(rightMem2, 0.0F, 0.1745F, 0.0F);
            this.setRotateAngle(rightMem3, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(rightMem4, 0.0F, 0.0F, 0.1745F);
            this.setRotateAngle(rightMem5, 0.0F, 0.0F, 0.0873F);
            this.setRotateAngle(rightMem6, 0.0F, 0.0F, 0.0873F);
            this.setRotateAngle(rightMem7, -0.5247F, -0.0832F, 0.0263F);
            this.setRotateAngle(rightMem8, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(rightWing, -0.0653F, 0.0037F, 1.6361F);
            this.setRotateAngle(rightWing2, 0.0F, 0.0F, 0.0131F);
            this.setRotateAngle(rightWing3, 0.048F, 0.0F, -0.0654F);
            this.setRotateAngle(rightWing4, -1.4582F, 0.0136F, -0.1302F);
            this.setRotateAngle(rightWing5, 0.1924F, 0.0822F, 0.0105F);
            this.setRotateAngle(rightWing6, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(throat, 0.288F, 0.0F, 0.0F);
            this.setRotateAngle(throat2, 0.384F, 0.0F, 0.0F);
            



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftMem11.setScale((float)1,(float)0,(float)0);
                this.leftMem6.setScale((float)1,(float)0,(float)0);
                this.leftMem5.setScale((float)1,(float)0,(float)0);
                this.leftMem10.setScale((float)1,(float)0,(float)0);
                this.leftMem2.setScale((float)1,(float)0,(float)0);
                this.leftMem7.setScale((float)1,(float)0,(float)0);
                this.leftMem3.setScale((float)1,(float)0,(float)0);
                this.leftMem8.setScale((float)1,(float)0,(float)0);
                this.leftMem4.setScale((float)1,(float)0,(float)0);
                this.leftMem9.setScale((float)1,(float)0,(float)0);
                this.leftMem.setScale((float)1,(float)0,(float)0);
                this.rightMem11.setScale((float)1,(float)0,(float)0);
                this.rightMem6.setScale((float)1,(float)0,(float)0);
                this.rightMem5.setScale((float)1,(float)0,(float)0);
                this.rightMem10.setScale((float)1,(float)0,(float)0);
                this.rightMem2.setScale((float)1,(float)0,(float)0);
                this.rightMem7.setScale((float)1,(float)0,(float)0);
                this.rightMem3.setScale((float)1,(float)0,(float)0);
                this.rightMem8.setScale((float)1,(float)0,(float)0);
                this.rightMem4.setScale((float)1,(float)0,(float)0);
                this.rightMem9.setScale((float)1,(float)0,(float)0);
                this.rightMem.setScale((float)1,(float)0,(float)0);
            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) {

        } else {

        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGegepterus entity = (EntityPrehistoricFloraGegepterus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 13) / 12) * (0-(17.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.75 + (((tickAnim - 13) / 12) * (0-(9.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -0.75 + (((tickAnim - 13) / 12) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 14.25 + (((tickAnim - 13) / 12) * (0-(14.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 15.25 + (((tickAnim - 13) / 12) * (0-(15.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.175 + (((tickAnim - 13) / 12) * (0-(0.175)));
            zz = -0.4 + (((tickAnim - 13) / 12) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 8.25 + (((tickAnim - 17) / 8) * (0-(8.25)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 14.25 + (((tickAnim - 13) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGegepterus entity = (EntityPrehistoricFloraGegepterus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.75 + (((tickAnim - 13) / 7) * (-5.5-(-1.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -5.5 + (((tickAnim - 20) / 8) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 13) / 7) * (2-(-3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 2 + (((tickAnim - 20) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0.25 + (((tickAnim - 20) / 8) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 13) / 7) * (-11.5-(-3.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -11.5 + (((tickAnim - 20) / 8) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -5.5 + (((tickAnim - 13) / 7) * (1.5-(-5.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1.5 + (((tickAnim - 20) / 8) * (0-(1.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -22 + (((tickAnim - 13) / 3) * (-14.47-(-22)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -14.47 + (((tickAnim - 16) / 3) * (-22-(-14.47)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -22 + (((tickAnim - 19) / 9) * (0-(-22)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 8) / 5) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 20.25 + (((tickAnim - 13) / 3) * (0-(20.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 20.25 + (((tickAnim - 19) / 4) * (0-(20.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.89-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.89 + (((tickAnim - 8) / 5) * (-2.25-(-6.89)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -2.25 + (((tickAnim - 13) / 3) * (-0.75-(-2.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 16) / 3) * (-15.75-(-0.75)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -15.75 + (((tickAnim - 19) / 9) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 13) / 3) * (-0.55-(-0.55)));
            zz = -0.275 + (((tickAnim - 13) / 3) * (0.55-(-0.275)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 16) / 3) * (-0.265-(-0.55)));
            zz = 0.55 + (((tickAnim - 16) / 3) * (0.39-(0.55)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -0.265 + (((tickAnim - 19) / 4) * (-0.13-(-0.265)));
            zz = 0.39 + (((tickAnim - 19) / 4) * (0.74-(0.39)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.13 + (((tickAnim - 23) / 5) * (0-(-0.13)));
            zz = 0.74 + (((tickAnim - 23) / 5) * (0-(0.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 10) * (-0.1-(-0.1)));
            zz = -0.275 + (((tickAnim - 13) / 10) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 23) / 5) * (0-(-0.1)));
            zz = -0.275 + (((tickAnim - 23) / 5) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGegepterus entity = (EntityPrehistoricFloraGegepterus) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*1 + (((tickAnim - 0) / 50) * (-3.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 0) / 50) * (-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = -3.25 + (((tickAnim - 50) / 46) * (-3.25-(-3.25)));
            zz = -3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1 + (((tickAnim - 50) / 46) * (-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = -3.25 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*1-(-3.25)));
            zz = -1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 0) / 50) * (4-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 4 + (((tickAnim - 50) / 46) * (4-(4)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 4 + (((tickAnim - 96) / 64) * (-1.5-(4)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 50) * (0.75-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0.75 + (((tickAnim - 50) / 46) * (0.75-(0.75)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0.75 + (((tickAnim - 96) / 64) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 160) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 160) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-20-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(-109.12058), hand.rotateAngleY + (float) Math.toRadians(-55.9361), hand.rotateAngleZ + (float) Math.toRadians(3.50968));
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(0.225);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(0);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(0.45);



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-40 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-40)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing6, leftWing6.rotateAngleX + (float) Math.toRadians(xx), leftWing6.rotateAngleY + (float) Math.toRadians(yy), leftWing6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 160) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 160) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*20-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = -109.12058 + (((tickAnim - 0) / 160) * (-158.87058-(-109.12058)));
            yy = 55.9361 + (((tickAnim - 0) / 160) * (-55.9361-(55.9361)));
            zz = 3.50968 + (((tickAnim - 0) / 160) * (3.50968-(3.50968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 0.225 + (((tickAnim - 0) / 160) * (0.95-(0.225)));
            yy = 0 + (((tickAnim - 0) / 160) * (0-(0)));
            zz = 0.45 + (((tickAnim - 0) / 160) * (0.45-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*40 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*40)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30-(0)));
            zz = 0 + (((tickAnim - 96) / 64) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing6, rightWing6.rotateAngleX + (float) Math.toRadians(xx), rightWing6.rotateAngleY + (float) Math.toRadians(yy), rightWing6.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGegepterus entity = (EntityPrehistoricFloraGegepterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.leftMem2.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 32.84498 + (((tickAnim - 0) / 8) * (-22.40821-(32.84498)));
            yy = 3.46939 + (((tickAnim - 0) / 8) * (0.57239-(3.46939)));
            zz = -13.31327 + (((tickAnim - 0) / 8) * (2.48263-(-13.31327)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -22.40821 + (((tickAnim - 8) / 7) * (1.96131-(-22.40821)));
            yy = 0.57239 + (((tickAnim - 8) / 7) * (2.75115-(0.57239)));
            zz = 2.48263 + (((tickAnim - 8) / 7) * (-6.097-(2.48263)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1.96131 + (((tickAnim - 15) / 5) * (32.84498-(1.96131)));
            yy = 2.75115 + (((tickAnim - 15) / 5) * (3.46939-(2.75115)));
            zz = -6.097 + (((tickAnim - 15) / 5) * (-13.31327-(-6.097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 8) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.3954 + (((tickAnim - 0) / 4) * (-20.53417-(4.3954)));
            yy = -3.88855 + (((tickAnim - 0) / 4) * (-0.98975-(-3.88855)));
            zz = 5.53259 + (((tickAnim - 0) / 4) * (1.4082-(5.53259)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -20.53417 + (((tickAnim - 4) / 4) * (-9-(-20.53417)));
            yy = -0.98975 + (((tickAnim - 4) / 4) * (0-(-0.98975)));
            zz = 1.4082 + (((tickAnim - 4) / 4) * (0-(1.4082)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9 + (((tickAnim - 8) / 7) * (0.11747-(-9)));
            yy = 0 + (((tickAnim - 8) / 7) * (2.4067-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (10.17731-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0.11747 + (((tickAnim - 15) / 5) * (4.3954-(0.11747)));
            yy = 2.4067 + (((tickAnim - 15) / 5) * (-3.88855-(2.4067)));
            zz = 10.17731 + (((tickAnim - 15) / 5) * (5.53259-(10.17731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 4) * (0.99-(0.725)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.25-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.99 + (((tickAnim - 4) / 4) * (-0.425-(0.99)));
            zz = -0.25 + (((tickAnim - 4) / 4) * (0.2-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 8) / 7) * (0-(-0.425)));
            zz = 0.2 + (((tickAnim - 8) / 7) * (0-(0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.725-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 74 + (((tickAnim - 0) / 4) * (39.11-(74)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 39.11 + (((tickAnim - 4) / 2) * (16.68-(39.11)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.68 + (((tickAnim - 6) / 2) * (30.92093-(16.68)));
            yy = 0 + (((tickAnim - 6) / 2) * (2.23355-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-6.95215-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 30.92093 + (((tickAnim - 8) / 7) * (0-(30.92093)));
            yy = 2.23355 + (((tickAnim - 8) / 7) * (0-(2.23355)));
            zz = -6.95215 + (((tickAnim - 8) / 7) * (0-(-6.95215)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (74-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 4) * (0.735-(0.85)));
            zz = 0.225 + (((tickAnim - 0) / 4) * (0.12-(0.225)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.735 + (((tickAnim - 4) / 2) * (0-(0.735)));
            zz = 0.12 + (((tickAnim - 4) / 2) * (0-(0.12)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 8) / 5) * (0.295-(-0.475)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.295 + (((tickAnim - 13) / 2) * (-0.175-(0.295)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 15) / 5) * (0.85-(-0.175)));
            zz = 0 + (((tickAnim - 15) / 5) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -14.28083 + (((tickAnim - 0) / 9) * (33.8642-(-14.28083)));
            yy = 13.98464 + (((tickAnim - 0) / 9) * (-1.67379-(13.98464)));
            zz = 23.28742 + (((tickAnim - 0) / 9) * (4.72745-(23.28742)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 33.8642 + (((tickAnim - 9) / 7) * (-4.59477-(33.8642)));
            yy = -1.67379 + (((tickAnim - 9) / 7) * (-2.5286-(-1.67379)));
            zz = 4.72745 + (((tickAnim - 9) / 7) * (-26.3971-(4.72745)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.59477 + (((tickAnim - 16) / 4) * (-14.28083-(-4.59477)));
            yy = -2.5286 + (((tickAnim - 16) / 4) * (13.9846-(-2.5286)));
            zz = -26.3971 + (((tickAnim - 16) / 4) * (23.2874-(-26.3971)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMem.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -11.57429 + (((tickAnim - 0) / 9) * (2-(-11.57429)));
            yy = -13.59448 + (((tickAnim - 0) / 9) * (6.5-(-13.59448)));
            zz = -25.87158 + (((tickAnim - 0) / 9) * (0-(-25.87158)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 2 + (((tickAnim - 9) / 7) * (-24.18318-(2)));
            yy = 6.5 + (((tickAnim - 9) / 7) * (-8.6354-(6.5)));
            zz = 0 + (((tickAnim - 9) / 7) * (13.1366-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -24.18318 + (((tickAnim - 16) / 4) * (-11.57429-(-24.18318)));
            yy = -8.6354 + (((tickAnim - 16) / 4) * (-13.59448-(-8.6354)));
            zz = 13.1366 + (((tickAnim - 16) / 4) * (-25.87158-(13.1366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.375 + (((tickAnim - 0) / 9) * (0-(-0.375)));
            yy = -0.225 + (((tickAnim - 0) / 9) * (0-(-0.225)));
            zz = 0.15 + (((tickAnim - 0) / 9) * (0-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0.16-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (-0.19-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.08-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.16 + (((tickAnim - 16) / 4) * (-0.375-(0.16)));
            yy = -0.19 + (((tickAnim - 16) / 4) * (-0.225-(-0.19)));
            zz = 0.08 + (((tickAnim - 16) / 4) * (0.15-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 0) / 9) * (13.5-(0.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 13.5 + (((tickAnim - 9) / 3) * (29.60966-(13.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (-6.93707-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (6.49791-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 29.60966 + (((tickAnim - 12) / 4) * (31.82-(29.60966)));
            yy = -6.93707 + (((tickAnim - 12) / 4) * (0-(-6.93707)));
            zz = 6.49791 + (((tickAnim - 12) / 4) * (0-(6.49791)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 31.82 + (((tickAnim - 16) / 4) * (0.75-(31.82)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 9) * (0-(-0.2)));
            zz = 0.025 + (((tickAnim - 0) / 9) * (0-(0.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.29-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.01-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.29 + (((tickAnim - 16) / 4) * (-0.2-(0.29)));
            zz = 0.01 + (((tickAnim - 16) / 4) * (0.025-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -8.67471 + (((tickAnim - 0) / 9) * (-8.33681-(-8.67471)));
            yy = 7.16656 + (((tickAnim - 0) / 9) * (2.8246-(7.16656)));
            zz = -1.10004 + (((tickAnim - 0) / 9) * (-1.4352-(-1.10004)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -8.33681 + (((tickAnim - 9) / 3) * (2.4865-(-8.33681)));
            yy = 2.8246 + (((tickAnim - 9) / 3) * (0.60291-(2.8246)));
            zz = -1.4352 + (((tickAnim - 9) / 3) * (2.39633-(-1.4352)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 2.4865 + (((tickAnim - 12) / 3) * (16.90933-(2.4865)));
            yy = 0.60291 + (((tickAnim - 12) / 3) * (-0.40621-(0.60291)));
            zz = 2.39633 + (((tickAnim - 12) / 3) * (-3.59556-(2.39633)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 16.90933 + (((tickAnim - 15) / 1) * (16.90933-(16.90933)));
            yy = -0.40621 + (((tickAnim - 15) / 1) * (-0.40621-(-0.40621)));
            zz = -3.59556 + (((tickAnim - 15) / 1) * (-3.59556-(-3.59556)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 16.90933 + (((tickAnim - 16) / 2) * (1.59181-(16.90933)));
            yy = -0.40621 + (((tickAnim - 16) / 2) * (6.17793-(-0.40621)));
            zz = -3.59556 + (((tickAnim - 16) / 2) * (-3.54368-(-3.59556)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.59181 + (((tickAnim - 18) / 2) * (-8.67471-(1.59181)));
            yy = 6.17793 + (((tickAnim - 18) / 2) * (7.16656-(6.17793)));
            zz = -3.54368 + (((tickAnim - 18) / 2) * (-1.10004-(-3.54368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMem3, leftMem3.rotateAngleX + (float) Math.toRadians(xx), leftMem3.rotateAngleY + (float) Math.toRadians(yy), leftMem3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -0.1 + (((tickAnim - 0) / 9) * (-0.15-(-0.1)));
            yy = 0.375 + (((tickAnim - 0) / 9) * (0.375-(0.375)));
            zz = -1.325 + (((tickAnim - 0) / 9) * (-1.2-(-1.325)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -0.15 + (((tickAnim - 9) / 3) * (-0.215-(-0.15)));
            yy = 0.375 + (((tickAnim - 9) / 3) * (0.22-(0.375)));
            zz = -1.2 + (((tickAnim - 9) / 3) * (-1.52-(-1.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.215 + (((tickAnim - 12) / 1) * (-0.22-(-0.215)));
            yy = 0.22 + (((tickAnim - 12) / 1) * (0.12-(0.22)));
            zz = -1.52 + (((tickAnim - 12) / 1) * (-1.73-(-1.52)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.22 + (((tickAnim - 13) / 2) * (-0.125-(-0.22)));
            yy = 0.12 + (((tickAnim - 13) / 2) * (0.02-(0.12)));
            zz = -1.73 + (((tickAnim - 13) / 2) * (-1.95-(-1.73)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -0.125 + (((tickAnim - 15) / 1) * (-0.12-(-0.125)));
            yy = 0.02 + (((tickAnim - 15) / 1) * (0.04-(0.02)));
            zz = -1.95 + (((tickAnim - 15) / 1) * (-1.84-(-1.95)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.12 + (((tickAnim - 16) / 2) * (-0.26-(-0.12)));
            yy = 0.04 + (((tickAnim - 16) / 2) * (0.24-(0.04)));
            zz = -1.84 + (((tickAnim - 16) / 2) * (-1.53-(-1.84)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.26 + (((tickAnim - 18) / 2) * (-0.1-(-0.26)));
            yy = 0.24 + (((tickAnim - 18) / 2) * (0.375-(0.24)));
            zz = -1.53 + (((tickAnim - 18) / 2) * (-1.325-(-1.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftMem3.rotationPointX = this.leftMem3.rotationPointX + (float)(xx);
        this.leftMem3.rotationPointY = this.leftMem3.rotationPointY - (float)(yy);
        this.leftMem3.rotationPointZ = this.leftMem3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 9) * (1-(1)));
            zz = 0.8 + (((tickAnim - 0) / 9) * (0.8-(0.8)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 9) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 9) / 6) * (1-(1)));
            zz = 0.8 + (((tickAnim - 9) / 6) * (1-(0.8)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 15) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 15) / 5) * (0.8-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem3.setScale((float)xx, (float)yy, (float)zz);



        this.leftMem8.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.53783 + (((tickAnim - 0) / 3) * (-17.71627-(-4.53783)));
            yy = -24.49717 + (((tickAnim - 0) / 3) * (-19.06983-(-24.49717)));
            zz = 3.95323 + (((tickAnim - 0) / 3) * (-9.56013-(3.95323)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -17.71627 + (((tickAnim - 3) / 6) * (-28.64151-(-17.71627)));
            yy = -19.06983 + (((tickAnim - 3) / 6) * (-7.20613-(-19.06983)));
            zz = -9.56013 + (((tickAnim - 3) / 6) * (6.70435-(-9.56013)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -28.64151 + (((tickAnim - 9) / 7) * (-55.5-(-28.64151)));
            yy = -7.20613 + (((tickAnim - 9) / 7) * (0-(-7.20613)));
            zz = 6.70435 + (((tickAnim - 9) / 7) * (0-(6.70435)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -55.5 + (((tickAnim - 16) / 4) * (-4.53783-(-55.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (-24.49717-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (3.95323-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.125 + (((tickAnim - 0) / 3) * (0.08-(0.125)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (1.425-(0.55)));
            zz = -0.575 + (((tickAnim - 0) / 3) * (-0.695-(-0.575)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0.08 + (((tickAnim - 3) / 6) * (0-(0.08)));
            yy = 1.425 + (((tickAnim - 3) / 6) * (0-(1.425)));
            zz = -0.695 + (((tickAnim - 3) / 6) * (0-(-0.695)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.7-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (-0.5-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0.125-(0)));
            yy = 0.7 + (((tickAnim - 16) / 4) * (0.55-(0.7)));
            zz = -0.5 + (((tickAnim - 16) / 4) * (-0.575-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 43 + (((tickAnim - 0) / 9) * (-8.5-(43)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -8.5 + (((tickAnim - 9) / 7) * (14.95-(-8.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.95 + (((tickAnim - 16) / 4) * (43-(14.95)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.175 + (((tickAnim - 0) / 3) * (0.14-(-1.175)));
            zz = 1.375 + (((tickAnim - 0) / 3) * (0.87-(1.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 0.14 + (((tickAnim - 3) / 6) * (-0.625-(0.14)));
            zz = 0.87 + (((tickAnim - 3) / 6) * (0-(0.87)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 9) / 7) * (-1.13-(-0.625)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.3-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = -1.13 + (((tickAnim - 16) / 4) * (-1.175-(-1.13)));
            zz = 0.3 + (((tickAnim - 16) / 4) * (1.375-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing4.rotationPointX = this.leftWing4.rotationPointX + (float)(xx);
        this.leftWing4.rotationPointY = this.leftWing4.rotationPointY - (float)(yy);
        this.leftWing4.rotationPointZ = this.leftWing4.rotationPointZ + (float)(zz);



        this.leftMem4.setScale((float)0,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -1.21315 + (((tickAnim - 0) / 9) * (26.5-(-1.21315)));
            yy = -0.8103 + (((tickAnim - 0) / 9) * (0-(-0.8103)));
            zz = 6.33374 + (((tickAnim - 0) / 9) * (0-(6.33374)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 26.5 + (((tickAnim - 9) / 7) * (-0.21937-(26.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (1.34701-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (4.59462-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.21937 + (((tickAnim - 16) / 4) * (-1.21315-(-0.21937)));
            yy = 1.34701 + (((tickAnim - 16) / 4) * (-0.8103-(1.34701)));
            zz = 4.59462 + (((tickAnim - 16) / 4) * (6.33374-(4.59462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftMem5, leftMem5.rotateAngleX + (float) Math.toRadians(-6.5), leftMem5.rotateAngleY + (float) Math.toRadians(0), leftMem5.rotateAngleZ + (float) Math.toRadians(0));
        this.leftMem5.setScale((float)0,(float)0.1875,(float)1);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -22.25 + (((tickAnim - 0) / 9) * (-11-(-22.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -11 + (((tickAnim - 9) / 7) * (-16.1839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15-(-11)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.91925-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.70666-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -16.1839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15 + (((tickAnim - 16) / 4) * (-22.25-(-16.1839+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15)));
            yy = 0.91925 + (((tickAnim - 16) / 4) * (0-(0.91925)));
            zz = 0.70666 + (((tickAnim - 16) / 4) * (0-(0.70666)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing6, leftWing6.rotateAngleX + (float) Math.toRadians(xx), leftWing6.rotateAngleY + (float) Math.toRadians(yy), leftWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMem6.setScale((float)0,(float)0,(float)1);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*1.5), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*8.5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-4.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*-4.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*-1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-6.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-1.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -15.3642 + (((tickAnim - 0) / 8) * (39.87194-(-15.3642)));
            yy = 1.6738 + (((tickAnim - 0) / 8) * (4.56382-(1.6738)));
            zz = 4.7274 + (((tickAnim - 0) / 8) * (0.91816-(4.7274)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 39.87194 + (((tickAnim - 8) / 9) * (-22.3642-(39.87194)));
            yy = 4.56382 + (((tickAnim - 8) / 9) * (1.6738-(4.56382)));
            zz = 0.91816 + (((tickAnim - 8) / 9) * (4.7274-(0.91816)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -22.3642 + (((tickAnim - 17) / 3) * (-15.3642-(-22.3642)));
            yy = 1.6738 + (((tickAnim - 17) / 3) * (1.6738-(1.6738)));
            zz = 4.7274 + (((tickAnim - 17) / 3) * (4.7274-(4.7274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = -0.35 + (((tickAnim - 8) / 9) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.25 + (((tickAnim - 0) / 8) * (4.3954-(-6.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.8885-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.5326-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.3954 + (((tickAnim - 8) / 5) * (-33.9273-(4.3954)));
            yy = 3.8885 + (((tickAnim - 8) / 5) * (1.94425-(3.8885)));
            zz = -5.5326 + (((tickAnim - 8) / 5) * (-2.7663-(-5.5326)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -33.9273 + (((tickAnim - 13) / 4) * (-13.25-(-33.9273)));
            yy = 1.94425 + (((tickAnim - 13) / 4) * (0-(1.94425)));
            zz = -2.7663 + (((tickAnim - 13) / 4) * (0-(-2.7663)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -13.25 + (((tickAnim - 17) / 3) * (-6.25-(-13.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 8) * (0.725-(-0.375)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 8) / 5) * (1.315-(0.725)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.08-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.315 + (((tickAnim - 13) / 4) * (-0.35-(1.315)));
            zz = -0.08 + (((tickAnim - 13) / 4) * (0.3-(-0.08)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 17) / 3) * (-0.375-(-0.35)));
            zz = 0.3 + (((tickAnim - 17) / 3) * (0.2-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.65989 + (((tickAnim - 0) / 3) * (0.41192-(20.65989)));
            yy = 0.85818 + (((tickAnim - 0) / 3) * (0.60073-(0.85818)));
            zz = -3.16136 + (((tickAnim - 0) / 3) * (-2.21295-(-3.16136)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.41192 + (((tickAnim - 3) / 5) * (74-(0.41192)));
            yy = 0.60073 + (((tickAnim - 3) / 5) * (0-(0.60073)));
            zz = -2.21295 + (((tickAnim - 3) / 5) * (0-(-2.21295)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 74 + (((tickAnim - 8) / 5) * (81.41396-(74)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.34327-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-1.26454-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 81.41396 + (((tickAnim - 13) / 2) * (15.03692-(81.41396)));
            yy = 0.34327 + (((tickAnim - 13) / 2) * (0.60073-(0.34327)));
            zz = -1.26454 + (((tickAnim - 13) / 2) * (-2.21295-(-1.26454)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 15.03692 + (((tickAnim - 15) / 2) * (34.76083-(15.03692)));
            yy = 0.60073 + (((tickAnim - 15) / 2) * (-2.92628-(0.60073)));
            zz = -2.21295 + (((tickAnim - 15) / 2) * (2.54287-(-2.21295)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 34.76083 + (((tickAnim - 17) / 3) * (20.65989-(34.76083)));
            yy = -2.92628 + (((tickAnim - 17) / 3) * (0.85818-(-2.92628)));
            zz = 2.54287 + (((tickAnim - 17) / 3) * (-3.16136-(2.54287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 3) * (-0.195-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.07-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.195 + (((tickAnim - 3) / 5) * (0.85-(-0.195)));
            zz = 0.07 + (((tickAnim - 3) / 5) * (0.225-(0.07)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 8) / 5) * (1.08-(0.85)));
            zz = 0.225 + (((tickAnim - 8) / 5) * (0.14-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.08 + (((tickAnim - 13) / 2) * (0-(1.08)));
            zz = 0.14 + (((tickAnim - 13) / 2) * (0-(0.14)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.375 + (((tickAnim - 17) / 3) * (-0.325-(-0.375)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 33.8642 + (((tickAnim - 0) / 7) * (-4.59477-(33.8642)));
            yy = -1.67379 + (((tickAnim - 0) / 7) * (2.52858-(-1.67379)));
            zz = 4.72745 + (((tickAnim - 0) / 7) * (26.39708-(4.72745)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -4.59477 + (((tickAnim - 7) / 4) * (-14.28083-(-4.59477)));
            yy = 2.52858 + (((tickAnim - 7) / 4) * (-13.9846-(2.52858)));
            zz = 26.39708 + (((tickAnim - 7) / 4) * (-23.2874-(26.39708)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -14.28083 + (((tickAnim - 11) / 9) * (33.8642-(-14.28083)));
            yy = -13.9846 + (((tickAnim - 11) / 9) * (-1.67379-(-13.9846)));
            zz = -23.2874 + (((tickAnim - 11) / 9) * (4.72745-(-23.2874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2 + (((tickAnim - 0) / 7) * (-24.18318-(2)));
            yy = -6.5 + (((tickAnim - 0) / 7) * (8.63544-(-6.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.13656-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -24.18318 + (((tickAnim - 7) / 4) * (-0.4283-(-24.18318)));
            yy = 8.63544 + (((tickAnim - 7) / 4) * (12.82928-(8.63544)));
            zz = -13.13656 + (((tickAnim - 7) / 4) * (24.27969-(-13.13656)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -0.4283 + (((tickAnim - 11) / 9) * (2-(-0.4283)));
            yy = 12.82928 + (((tickAnim - 11) / 9) * (-6.5-(12.82928)));
            zz = 24.27969 + (((tickAnim - 11) / 9) * (0-(24.27969)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.39-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.19-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.08-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -0.39 + (((tickAnim - 7) / 4) * (-0.25-(-0.39)));
            yy = -0.19 + (((tickAnim - 7) / 4) * (-0.35-(-0.19)));
            zz = 0.08 + (((tickAnim - 7) / 4) * (0.15-(0.08)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 11) / 9) * (0-(-0.25)));
            yy = -0.35 + (((tickAnim - 11) / 9) * (0-(-0.35)));
            zz = 0.15 + (((tickAnim - 11) / 9) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);



        this.rightMem2.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (29.60966-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.93707-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (6.49791-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 29.60966 + (((tickAnim - 3) / 4) * (31.82-(29.60966)));
            yy = -6.93707 + (((tickAnim - 3) / 4) * (0-(-6.93707)));
            zz = 6.49791 + (((tickAnim - 3) / 4) * (0-(6.49791)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 31.82 + (((tickAnim - 7) / 4) * (0.75-(31.82)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 11) / 9) * (13.5-(0.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.29-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.01-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.29 + (((tickAnim - 7) / 4) * (-0.2-(0.29)));
            zz = 0.01 + (((tickAnim - 7) / 4) * (0.025-(0.01)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = -0.2 + (((tickAnim - 11) / 9) * (0-(-0.2)));
            zz = 0.025 + (((tickAnim - 11) / 9) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.33681 + (((tickAnim - 0) / 3) * (2.4865-(-8.33681)));
            yy = -2.82458 + (((tickAnim - 0) / 3) * (0.60291-(-2.82458)));
            zz = 1.43522 + (((tickAnim - 0) / 3) * (2.39633-(1.43522)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.4865 + (((tickAnim - 3) / 3) * (16.88976-(2.4865)));
            yy = 0.60291 + (((tickAnim - 3) / 3) * (-0.07219-(0.60291)));
            zz = 2.39633 + (((tickAnim - 3) / 3) * (3.44892-(2.39633)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 16.88976 + (((tickAnim - 6) / 1) * (15.4518-(16.88976)));
            yy = -0.07219 + (((tickAnim - 6) / 1) * (0.97086-(-0.07219)));
            zz = 3.44892 + (((tickAnim - 6) / 1) * (3.66617-(3.44892)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 15.4518 + (((tickAnim - 7) / 13) * (-8.33681-(15.4518)));
            yy = 0.97086 + (((tickAnim - 7) / 13) * (-2.82458-(0.97086)));
            zz = 3.66617 + (((tickAnim - 7) / 13) * (1.43522-(3.66617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem3, rightMem3.rotateAngleX + (float) Math.toRadians(xx), rightMem3.rotateAngleY + (float) Math.toRadians(yy), rightMem3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.15 + (((tickAnim - 0) / 6) * (0.075-(0.15)));
            yy = 0.375 + (((tickAnim - 0) / 6) * (-0.02-(0.375)));
            zz = -1.2 + (((tickAnim - 0) / 6) * (-1.95-(-1.2)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.075 + (((tickAnim - 6) / 4) * (0.15-(0.075)));
            yy = -0.02 + (((tickAnim - 6) / 4) * (0.12-(-0.02)));
            zz = -1.95 + (((tickAnim - 6) / 4) * (-1.4-(-1.95)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.15 + (((tickAnim - 10) / 10) * (0.15-(0.15)));
            yy = 0.12 + (((tickAnim - 10) / 10) * (0.375-(0.12)));
            zz = -1.4 + (((tickAnim - 10) / 10) * (-1.2-(-1.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem3.rotationPointX = this.rightMem3.rotationPointX + (float)(xx);
        this.rightMem3.rotationPointY = this.rightMem3.rotationPointY - (float)(yy);
        this.rightMem3.rotationPointZ = this.rightMem3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            zz = 0.8 + (((tickAnim - 0) / 6) * (1-(0.8)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 6) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 6) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 6) / 4) * (0.8-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            zz = 0.8 + (((tickAnim - 10) / 10) * (0.8-(0.8)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem3.setScale((float)xx, (float)yy, (float)zz);



        this.rightMem8.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -8.5 + (((tickAnim - 0) / 7) * (14.95-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 14.95 + (((tickAnim - 7) / 4) * (20.5-(14.95)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 20.5 + (((tickAnim - 11) / 9) * (-8.5-(20.5)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 7) * (-1.13-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = -1.13 + (((tickAnim - 7) / 4) * (-0.875-(-1.13)));
            zz = -0.1 + (((tickAnim - 7) / 4) * (0.225-(-0.1)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.875 + (((tickAnim - 11) / 4) * (0.065-(-0.875)));
            zz = 0.225 + (((tickAnim - 11) / 4) * (0.12-(0.225)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.065 + (((tickAnim - 15) / 5) * (-0.625-(0.065)));
            zz = 0.12 + (((tickAnim - 15) / 5) * (0-(0.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing4.rotationPointX = this.rightWing4.rotationPointX + (float)(xx);
        this.rightWing4.rotationPointY = this.rightWing4.rotationPointY - (float)(yy);
        this.rightWing4.rotationPointZ = this.rightWing4.rotationPointZ + (float)(zz);



        this.rightMem4.setScale((float)0,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 26.5 + (((tickAnim - 0) / 7) * (6.06202-(26.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (-5.44476-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-8.77653-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 6.06202 + (((tickAnim - 7) / 4) * (5.60819-(6.06202)));
            yy = -5.44476 + (((tickAnim - 7) / 4) * (-5.97318-(-5.44476)));
            zz = -8.77653 + (((tickAnim - 7) / 4) * (-3.38565-(-8.77653)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 5.60819 + (((tickAnim - 11) / 9) * (26.5-(5.60819)));
            yy = -5.97318 + (((tickAnim - 11) / 9) * (0-(-5.97318)));
            zz = -3.38565 + (((tickAnim - 11) / 9) * (0-(-3.38565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightMem5, rightMem5.rotateAngleX + (float) Math.toRadians(-6.25051), rightMem5.rotateAngleY + (float) Math.toRadians(0.74589), rightMem5.rotateAngleZ + (float) Math.toRadians(-0.0784));
        this.rightMem5.setScale((float)1,(float)0.3125,(float)1);


        this.rightMem10.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -11 + (((tickAnim - 0) / 7) * (-9.963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15-(-11)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.83135-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.63909-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -9.963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15 + (((tickAnim - 7) / 4) * (-16.89929-(-9.963+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*15)));
            yy = 0.83135 + (((tickAnim - 7) / 4) * (3.37057-(0.83135)));
            zz = 0.63909 + (((tickAnim - 7) / 4) * (2.5911-(0.63909)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -16.89929 + (((tickAnim - 11) / 9) * (-11-(-16.89929)));
            yy = 3.37057 + (((tickAnim - 11) / 9) * (0-(3.37057)));
            zz = 2.5911 + (((tickAnim - 11) / 9) * (0-(2.5911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing6, rightWing6.rotateAngleX + (float) Math.toRadians(xx), rightWing6.rotateAngleY + (float) Math.toRadians(yy), rightWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem6.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -46.25 + (((tickAnim - 0) / 5) * (-55.25-(-46.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -55.25 + (((tickAnim - 5) / 6) * (0.97729-(-55.25)));
            yy = 0 + (((tickAnim - 5) / 6) * (-8.34337-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-4.65976-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.97729 + (((tickAnim - 11) / 4) * (-20.55822-(0.97729)));
            yy = -8.34337 + (((tickAnim - 11) / 4) * (10.75211-(-8.34337)));
            zz = -4.65976 + (((tickAnim - 11) / 4) * (14.07526-(-4.65976)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -20.55822 + (((tickAnim - 15) / 3) * (-37.11121-(-20.55822)));
            yy = 10.75211 + (((tickAnim - 15) / 3) * (3.84143-(10.75211)));
            zz = 14.07526 + (((tickAnim - 15) / 3) * (-3.07216-(14.07526)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.11121 + (((tickAnim - 18) / 2) * (-46.25-(-37.11121)));
            yy = 3.84143 + (((tickAnim - 18) / 2) * (0-(3.84143)));
            zz = -3.07216 + (((tickAnim - 18) / 2) * (0-(-3.07216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.225 + (((tickAnim - 0) / 5) * (0.225-(0.225)));
            yy = 0.675 + (((tickAnim - 0) / 5) * (0.8-(0.675)));
            zz = -0.875 + (((tickAnim - 0) / 5) * (-0.55-(-0.875)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0.225 + (((tickAnim - 5) / 6) * (0-(0.225)));
            yy = 0.8 + (((tickAnim - 5) / 6) * (0.7-(0.8)));
            zz = -0.55 + (((tickAnim - 5) / 6) * (-0.075-(-0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 11) / 2) * (1.53-(0.7)));
            zz = -0.075 + (((tickAnim - 11) / 2) * (-0.28-(-0.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.53 + (((tickAnim - 13) / 2) * (1.02-(1.53)));
            zz = -0.28 + (((tickAnim - 13) / 2) * (-0.58-(-0.28)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.02 + (((tickAnim - 15) / 3) * (0.805-(1.02)));
            zz = -0.58 + (((tickAnim - 15) / 3) * (-0.58-(-0.58)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0.225-(0)));
            yy = 0.805 + (((tickAnim - 18) / 2) * (0.675-(0.805)));
            zz = -0.58 + (((tickAnim - 18) / 2) * (-0.875-(-0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);



        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(-0.425);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGegepterus e = (EntityPrehistoricFloraGegepterus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.4451F)-(0.4451F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.5672F)-(-0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hand, ((-0.1501F)-(-0.1501F)), ((0.5859F)-(0.5859F)),((0.0598F)-(0.0598F)));
        animator.rotate(hand2, ((-0.1501F)-(-0.1501F)), ((-0.5859F)-(-0.5859F)),((-0.0598F)-(-0.0598F)));
        animator.rotate(head, ((1.6799F)-(1.7453F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg, ((0.4567F)-(-0.0871F)), ((0.0027F)-(0.2341F)),((-1.5224F)-(-0.0732F)));
        animator.rotate(leftLeg2, ((0.7393F)-(0.7393F)), ((-0.0393F)-(-0.0393F)),((0.1249F)-(0.1249F)));
        animator.rotate(leftLeg3, ((0.5356F)-(-0.1843F)), ((-0.1621F)-(-0.1621F)),((0.0737F)-(0.0737F)));
        animator.rotate(leftMem, ((0.0F)-(0.0F)), ((-0.2182F)-(-0.6545F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem2, ((0.0F)-(0.0F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem3, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(leftMem5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem7, ((-0.5247F)-(-0.5247F)), ((0.0832F)-(0.0832F)),((-0.0263F)-(-0.0263F)));
        animator.rotate(leftMem8, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(leftWing, ((-0.0653F)-(0.0F)), ((-0.0037F)-(0.0F)),((-1.6361F)-(-0.7854F)));
        animator.rotate(leftWing2, ((0.0F)-(0.1315F)), ((0.0F)-(-0.0171F)),((-0.0131F)-(0.7409F)));
        animator.rotate(leftWing3, ((0.048F)-(0.4361F)), ((0.0F)-(-0.0131F)),((0.0654F)-(0.0416F)));
        animator.rotate(leftWing4, ((-1.4582F)-(-0.1745F)), ((-0.0136F)-(0.0F)),((0.1302F)-(0.0F)));
        animator.rotate(leftWing5, ((0.1924F)-(1.0472F)), ((-0.0822F)-(0.0F)),((-0.0105F)-(0.0F)));
        animator.rotate(leftWing6, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(main, ((-0.1004F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((0.0087F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2705F)-(-0.3011F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.2574F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck4, ((-0.4363F)-(-0.1789F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg, ((0.4567F)-(-0.0871F)), ((-0.0027F)-(-0.2341F)),((1.5224F)-(0.0732F)));
        animator.rotate(rightLeg2, ((0.7393F)-(0.7393F)), ((0.0393F)-(0.0393F)),((-0.1249F)-(-0.1249F)));
        animator.rotate(rightLeg3, ((0.5356F)-(-0.1843F)), ((0.1621F)-(0.1621F)),((-0.0737F)-(-0.0737F)));
        animator.rotate(rightMem, ((0.0F)-(0.0F)), ((0.2182F)-(0.6545F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem2, ((0.0F)-(0.0F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem3, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(rightMem5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0873F)-(0.0873F)));
        animator.rotate(rightMem6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0873F)-(0.0873F)));
        animator.rotate(rightMem7, ((-0.5247F)-(-0.5247F)), ((-0.0832F)-(-0.0832F)),((0.0263F)-(0.0263F)));
        animator.rotate(rightMem8, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(rightWing, ((-0.0653F)-(0.0F)), ((0.0037F)-(0.0F)),((1.6361F)-(0.7854F)));
        animator.rotate(rightWing2, ((0.0F)-(0.1315F)), ((0.0F)-(0.0171F)),((0.0131F)-(-0.7409F)));
        animator.rotate(rightWing3, ((0.048F)-(0.4361F)), ((0.0F)-(0.0131F)),((-0.0654F)-(-0.0416F)));
        animator.rotate(rightWing4, ((-1.4582F)-(-0.1745F)), ((0.0136F)-(0.0F)),((-0.1302F)-(0.0F)));
        animator.rotate(rightWing5, ((0.1924F)-(1.0472F)), ((0.0822F)-(0.0F)),((0.0105F)-(0.0F)));
        animator.rotate(rightWing6, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((0.288F)-(0.3883F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat2, ((0.384F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.4451F)-(0.4451F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.5672F)-(-0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hand, -((-0.1501F)-(-0.1501F)), -((0.5859F)-(0.5859F)),-((0.0598F)-(0.0598F)));
        animator.rotate(hand2, -((-0.1501F)-(-0.1501F)), -((-0.5859F)-(-0.5859F)),-((-0.0598F)-(-0.0598F)));
        animator.rotate(head, -((1.6799F)-(1.7453F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg, -((0.4567F)-(-0.0871F)), -((0.0027F)-(0.2341F)),-((-1.5224F)-(-0.0732F)));
        animator.rotate(leftLeg2, -((0.7393F)-(0.7393F)), -((-0.0393F)-(-0.0393F)),-((0.1249F)-(0.1249F)));
        animator.rotate(leftLeg3, -((0.5356F)-(-0.1843F)), -((-0.1621F)-(-0.1621F)),-((0.0737F)-(0.0737F)));
        animator.rotate(leftMem, -((0.0F)-(0.0F)), -((-0.2182F)-(-0.6545F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem2, -((0.0F)-(0.0F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem3, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(leftMem5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem7, -((-0.5247F)-(-0.5247F)), -((0.0832F)-(0.0832F)),-((-0.0263F)-(-0.0263F)));
        animator.rotate(leftMem8, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(leftWing, -((-0.0653F)-(0.0F)), -((-0.0037F)-(0.0F)),-((-1.6361F)-(-0.7854F)));
        animator.rotate(leftWing2, -((0.0F)-(0.1315F)), -((0.0F)-(-0.0171F)),-((-0.0131F)-(0.7409F)));
        animator.rotate(leftWing3, -((0.048F)-(0.4361F)), -((0.0F)-(-0.0131F)),-((0.0654F)-(0.0416F)));
        animator.rotate(leftWing4, -((-1.4582F)-(-0.1745F)), -((-0.0136F)-(0.0F)),-((0.1302F)-(0.0F)));
        animator.rotate(leftWing5, -((0.1924F)-(1.0472F)), -((-0.0822F)-(0.0F)),-((-0.0105F)-(0.0F)));
        animator.rotate(leftWing6, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(main, -((-0.1004F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((0.0087F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2705F)-(-0.3011F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.2574F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck4, -((-0.4363F)-(-0.1789F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg, -((0.4567F)-(-0.0871F)), -((-0.0027F)-(-0.2341F)),-((1.5224F)-(0.0732F)));
        animator.rotate(rightLeg2, -((0.7393F)-(0.7393F)), -((0.0393F)-(0.0393F)),-((-0.1249F)-(-0.1249F)));
        animator.rotate(rightLeg3, -((0.5356F)-(-0.1843F)), -((0.1621F)-(0.1621F)),-((-0.0737F)-(-0.0737F)));
        animator.rotate(rightMem, -((0.0F)-(0.0F)), -((0.2182F)-(0.6545F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem2, -((0.0F)-(0.0F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem3, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(rightMem5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0873F)-(0.0873F)));
        animator.rotate(rightMem6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0873F)-(0.0873F)));
        animator.rotate(rightMem7, -((-0.5247F)-(-0.5247F)), -((-0.0832F)-(-0.0832F)),-((0.0263F)-(0.0263F)));
        animator.rotate(rightMem8, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(rightWing, -((-0.0653F)-(0.0F)), -((0.0037F)-(0.0F)),-((1.6361F)-(0.7854F)));
        animator.rotate(rightWing2, -((0.0F)-(0.1315F)), -((0.0F)-(0.0171F)),-((0.0131F)-(-0.7409F)));
        animator.rotate(rightWing3, -((0.048F)-(0.4361F)), -((0.0F)-(0.0131F)),-((-0.0654F)-(-0.0416F)));
        animator.rotate(rightWing4, -((-1.4582F)-(-0.1745F)), -((0.0136F)-(0.0F)),-((-0.1302F)-(0.0F)));
        animator.rotate(rightWing5, -((0.1924F)-(1.0472F)), -((0.0822F)-(0.0F)),-((0.0105F)-(0.0F)));
        animator.rotate(rightWing6, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((0.288F)-(0.3883F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat2, -((0.384F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
