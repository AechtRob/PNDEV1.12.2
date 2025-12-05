package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChaoyangopterus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelChaoyangopterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLegMembrane;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLegMembrane;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer leftMembrane;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftMembrane2;
    private final AdvancedModelRenderer leftMembrane8;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftMembrane3;
    private final AdvancedModelRenderer hand;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftMembrane4;
    private final AdvancedModelRenderer leftWing5;
    private final AdvancedModelRenderer leftMembrane5;
    private final AdvancedModelRenderer leftMembrane6;
    private final AdvancedModelRenderer leftWing6;
    private final AdvancedModelRenderer leftMembrane7;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightMembrane;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightMembrane2;
    private final AdvancedModelRenderer rightMembrane8;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightMembrane3;
    private final AdvancedModelRenderer hand2;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer rightMembrane4;
    private final AdvancedModelRenderer rightWing5;
    private final AdvancedModelRenderer rightMembrane5;
    private final AdvancedModelRenderer rightMembrane6;
    private final AdvancedModelRenderer rightWing6;
    private final AdvancedModelRenderer rightMembrane7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelChaoyangopterus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 12.5822F, 5.8709F);
        this.setRotateAngle(main, -0.48F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.5F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 42, -1.5F, -0.2F, -3.1F, 3, 3, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.877F, 0.165F, -0.7252F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.258F, 0.045F, -0.3869F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 59, 8, -1.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, false));

        this.leftLegMembrane = new AdvancedModelRenderer(this);
        this.leftLegMembrane.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.leftLeg.addChild(leftLegMembrane);
        this.leftLegMembrane.cubeList.add(new ModelBox(leftLegMembrane, 37, 66, -0.5F, -3.0F, 0.0F, 1, 6, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 5.5F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.378F, -0.1125F, 0.2359F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 22, 58, -1.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 42, 66, -0.5F, 0.0F, 1.0F, 0, 7, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.4924F, 6.2871F, 0.0886F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.1655F, 0.1462F, 0.0911F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 60, 41, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.877F, 0.165F, -0.7252F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.258F, -0.045F, 0.3869F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 59, 8, -1.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, true));

        this.rightLegMembrane = new AdvancedModelRenderer(this);
        this.rightLegMembrane.setRotationPoint(0.0F, 2.5F, 1.0F);
        this.rightLeg.addChild(rightLegMembrane);
        this.rightLegMembrane.cubeList.add(new ModelBox(rightLegMembrane, 37, 66, -0.5F, -3.0F, 0.0F, 1, 6, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 5.5F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.378F, 0.1125F, -0.2359F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 22, 58, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 42, 66, 0.5F, 0.0F, 1.0F, 0, 7, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.4924F, 6.2871F, 0.0886F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.1655F, -0.1462F, -0.0911F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 60, 41, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.6046F, 0.8681F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 67, -0.5F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -1.5F, -2.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 23, 25, -2.0F, -0.1763F, -5.0152F, 4, 4, 5, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(1.7734F, 1.568F, -3.7652F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, -0.1346F, 0.1512F, -1.0678F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 45, 50, -0.5F, -1.25F, -0.5F, 1, 4, 4, 0.0F, false));

        this.leftMembrane = new AdvancedModelRenderer(this);
        this.leftMembrane.setRotationPoint(0.5F, 0.75F, 3.5F);
        this.leftWing.addChild(leftMembrane);
        this.setRotateAngle(leftMembrane, 0.0F, -0.0436F, 0.0F);
        this.leftMembrane.cubeList.add(new ModelBox(leftMembrane, 55, 20, -1.0F, -2.0F, 0.0F, 1, 4, 4, 0.0F, false));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, 0.0116F, 0.0133F, 0.9339F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 28, 56, -0.5F, 0.0F, -0.5F, 1, 7, 3, 0.001F, false));

        this.leftMembrane2 = new AdvancedModelRenderer(this);
        this.leftMembrane2.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.leftWing2.addChild(leftMembrane2);
        this.setRotateAngle(leftMembrane2, 0.0F, -0.0436F, 0.0F);
        this.leftMembrane2.cubeList.add(new ModelBox(leftMembrane2, 42, 20, -1.0F, 0.0F, 0.0F, 1, 7, 5, 0.001F, false));

        this.leftMembrane8 = new AdvancedModelRenderer(this);
        this.leftMembrane8.setRotationPoint(-0.5185F, 7.0125F, 4.3272F);
        this.leftMembrane2.addChild(leftMembrane8);
        this.setRotateAngle(leftMembrane8, -0.8197F, -0.1614F, -0.054F);
        this.leftMembrane8.cubeList.add(new ModelBox(leftMembrane8, 17, 35, 0.0F, -8.0F, -5.0F, 0, 8, 6, 0.0F, false));
        this.leftMembrane8.cubeList.add(new ModelBox(leftMembrane8, 50, 69, -0.075F, -8.0F, -5.0F, 0, 8, 6, 0.0F, false));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(0.4831F, 6.9999F, -0.5F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.1315F, 0.0293F, 0.0076F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 48, 59, -1.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.leftMembrane3 = new AdvancedModelRenderer(this);
        this.leftMembrane3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftWing3.addChild(leftMembrane3);
        this.setRotateAngle(leftMembrane3, 0.0F, -0.0873F, 0.0F);
        this.leftMembrane3.cubeList.add(new ModelBox(leftMembrane3, 30, 35, -1.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F, false));

        this.hand = new AdvancedModelRenderer(this);
        this.hand.setRotationPoint(0.0787F, 5.0034F, -0.0236F);
        this.leftWing3.addChild(hand);
        this.setRotateAngle(hand, 0.1715F, -0.0463F, 1.7786F);
        this.hand.cubeList.add(new ModelBox(hand, 16, 67, 0.0F, -1.5F, 0.0F, 1, 2, 2, 0.002F, false));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -0.0436F, 0.0F, 0.0F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 55, 63, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.002F, false));

        this.leftMembrane4 = new AdvancedModelRenderer(this);
        this.leftMembrane4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftWing4.addChild(leftMembrane4);
        this.setRotateAngle(leftMembrane4, 0.0F, 0.0F, -0.096F);
        this.leftMembrane4.cubeList.add(new ModelBox(leftMembrane4, 13, 58, -1.0F, -5.0F, 0.0F, 1, 5, 3, 0.002F, false));

        this.leftWing5 = new AdvancedModelRenderer(this);
        this.leftWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 1.0949F, 0.0775F, 0.2286F);
        this.leftWing5.cubeList.add(new ModelBox(leftWing5, 23, 14, -1.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.leftMembrane5 = new AdvancedModelRenderer(this);
        this.leftMembrane5.setRotationPoint(-0.5F, -4.0F, 0.0F);
        this.leftWing5.addChild(leftMembrane5);
        this.leftMembrane5.cubeList.add(new ModelBox(leftMembrane5, 25, 0, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.leftMembrane6 = new AdvancedModelRenderer(this);
        this.leftMembrane6.setRotationPoint(0.1305F, -0.0086F, 4.0F);
        this.leftMembrane5.addChild(leftMembrane6);
        this.setRotateAngle(leftMembrane6, 0.0F, 0.0F, -0.1309F);
        this.leftMembrane6.cubeList.add(new ModelBox(leftMembrane6, 0, 29, 0.0F, -3.0F, -4.0F, 0, 3, 8, 0.0F, false));
        this.leftMembrane6.cubeList.add(new ModelBox(leftMembrane6, 0, 75, -0.05F, -3.0F, -4.0F, 0, 3, 8, 0.0F, false));

        this.leftWing6 = new AdvancedModelRenderer(this);
        this.leftWing6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.4808F, -0.0413F, -0.0169F);
        this.leftWing6.cubeList.add(new ModelBox(leftWing6, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 11, 0.002F, false));

        this.leftMembrane7 = new AdvancedModelRenderer(this);
        this.leftMembrane7.setRotationPoint(-0.5F, -2.0F, 6.0F);
        this.leftWing6.addChild(leftMembrane7);
        this.leftMembrane7.cubeList.add(new ModelBox(leftMembrane7, 0, 14, 0.0F, -3.0F, -6.0F, 0, 3, 11, 0.0F, false));
        this.leftMembrane7.cubeList.add(new ModelBox(leftMembrane7, 0, 66, -0.025F, -3.0F, -6.0F, 0, 3, 11, 0.0F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.7734F, 1.568F, -3.7652F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, -0.1346F, -0.1512F, 1.0678F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 45, 50, -0.5F, -1.25F, -0.5F, 1, 4, 4, 0.0F, true));

        this.rightMembrane = new AdvancedModelRenderer(this);
        this.rightMembrane.setRotationPoint(-0.5F, 0.75F, 3.5F);
        this.rightWing.addChild(rightMembrane);
        this.setRotateAngle(rightMembrane, 0.0F, 0.0436F, 0.0F);
        this.rightMembrane.cubeList.add(new ModelBox(rightMembrane, 55, 20, 0.0F, -2.0F, 0.0F, 1, 4, 4, 0.0F, true));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, 0.0116F, -0.0133F, -0.9339F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 28, 56, -0.5F, 0.0F, -0.5F, 1, 7, 3, 0.001F, true));

        this.rightMembrane2 = new AdvancedModelRenderer(this);
        this.rightMembrane2.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.rightWing2.addChild(rightMembrane2);
        this.setRotateAngle(rightMembrane2, 0.0F, 0.0436F, 0.0F);
        this.rightMembrane2.cubeList.add(new ModelBox(rightMembrane2, 42, 20, 0.0F, 0.0F, 0.0F, 1, 7, 5, 0.001F, true));

        this.rightMembrane8 = new AdvancedModelRenderer(this);
        this.rightMembrane8.setRotationPoint(0.5185F, 7.0125F, 4.3272F);
        this.rightMembrane2.addChild(rightMembrane8);
        this.setRotateAngle(rightMembrane8, -0.8197F, 0.1614F, 0.054F);
        this.rightMembrane8.cubeList.add(new ModelBox(rightMembrane8, 17, 35, 0.0F, -8.0F, -5.0F, 0, 8, 6, 0.0F, true));
        this.rightMembrane8.cubeList.add(new ModelBox(rightMembrane8, 50, 69, 0.075F, -8.0F, -5.0F, 0, 8, 6, 0.0F, true));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.4831F, 6.9999F, -0.5F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.1315F, -0.0293F, -0.0076F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 48, 59, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, true));

        this.rightMembrane3 = new AdvancedModelRenderer(this);
        this.rightMembrane3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightWing3.addChild(rightMembrane3);
        this.setRotateAngle(rightMembrane3, 0.0F, 0.0873F, 0.0F);
        this.rightMembrane3.cubeList.add(new ModelBox(rightMembrane3, 30, 35, 0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F, true));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(-0.0787F, 5.0034F, -0.0236F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, 0.1715F, 0.0463F, -1.7786F);
        this.hand2.cubeList.add(new ModelBox(hand2, 16, 67, -1.0F, -1.5F, 0.0F, 1, 2, 2, 0.002F, true));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -0.0436F, 0.0F, 0.0F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 55, 63, 0.0F, -2.0F, 0.0F, 1, 2, 3, 0.002F, true));

        this.rightMembrane4 = new AdvancedModelRenderer(this);
        this.rightMembrane4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightWing4.addChild(rightMembrane4);
        this.setRotateAngle(rightMembrane4, 0.0F, 0.0F, 0.096F);
        this.rightMembrane4.cubeList.add(new ModelBox(rightMembrane4, 13, 58, 0.0F, -5.0F, 0.0F, 1, 5, 3, 0.002F, true));

        this.rightWing5 = new AdvancedModelRenderer(this);
        this.rightWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 1.0949F, -0.0775F, -0.2286F);
        this.rightWing5.cubeList.add(new ModelBox(rightWing5, 23, 14, 0.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.rightMembrane5 = new AdvancedModelRenderer(this);
        this.rightMembrane5.setRotationPoint(0.5F, -4.0F, 0.0F);
        this.rightWing5.addChild(rightMembrane5);
        this.rightMembrane5.cubeList.add(new ModelBox(rightMembrane5, 25, 0, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.rightMembrane6 = new AdvancedModelRenderer(this);
        this.rightMembrane6.setRotationPoint(-0.1305F, -0.0086F, 4.0F);
        this.rightMembrane5.addChild(rightMembrane6);
        this.setRotateAngle(rightMembrane6, 0.0F, 0.0F, 0.1309F);
        this.rightMembrane6.cubeList.add(new ModelBox(rightMembrane6, 0, 29, 0.0F, -3.0F, -4.0F, 0, 3, 8, 0.0F, true));
        this.rightMembrane6.cubeList.add(new ModelBox(rightMembrane6, 0, 75, 0.05F, -3.0F, -4.0F, 0, 3, 8, 0.0F, true));

        this.rightWing6 = new AdvancedModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.4808F, 0.0413F, 0.0169F);
        this.rightWing6.cubeList.add(new ModelBox(rightWing6, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 11, 0.002F, true));

        this.rightMembrane7 = new AdvancedModelRenderer(this);
        this.rightMembrane7.setRotationPoint(0.5F, -2.0F, 6.0F);
        this.rightWing6.addChild(rightMembrane7);
        this.rightMembrane7.cubeList.add(new ModelBox(rightMembrane7, 0, 14, 0.0F, -3.0F, -6.0F, 0, 3, 11, 0.0F, true));
        this.rightMembrane7.cubeList.add(new ModelBox(rightMembrane7, 0, 66, 0.025F, -3.0F, -6.0F, 0, 3, 11, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2563F, -4.2673F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.1702F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 30, 48, -1.5F, -0.25F, -4.0F, 3, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 37, 59, -1.0F, -0.25F, -3.0F, 2, 3, 3, 0.003F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 45, 33, -1.0F, -0.25F, -5.0F, 2, 3, 5, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.75F, -4.25F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.021F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 56, 50, -1.0F, -1.0F, -7.25F, 2, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 50, -1.5F, -2.0F, -3.25F, 3, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 11, -0.5F, 0.0F, -8.25F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.2F, 0.05F, -1.55F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 11, -0.5F, -0.4F, -1.0F, 1, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 11, 1.9F, -0.4F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.327F, -1.3191F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3534F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 29, -0.5F, 0.0F, 0.0F, 2, 2, 3, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.8941F, -3.2717F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 22, -0.5F, 0.0F, 0.0F, 1, 2, 2, 0.006F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1296F, 0.4957F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 44, 8, -0.5F, 0.0F, -0.3F, 1, 1, 1, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.5123F, -0.4282F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 32, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.5123F, -0.4282F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2138F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 11, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.6218F, -5.471F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 64, -0.5F, -1.0F, 0.0F, 1, 2, 3, -0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.3422F, -8.0466F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 67, -1.0F, -1.025F, 0.75F, 1, 1, 2, -0.009F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 29, -1.0F, -1.025F, -0.225F, 1, 1, 1, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0423F, -9.599F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 64, 63, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.0F, -8.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 41, -1.0F, -1.0F, -7.0F, 1, 1, 7, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.0F, -3.225F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 57, -1.0F, -2.0F, 0.0F, 3, 2, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -1.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 49, 8, -0.5F, -0.975F, -6.7F, 1, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 58, -1.5F, -1.0F, -1.75F, 3, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 46, -1.0F, -0.975F, -5.75F, 2, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 35, -1.0F, -0.975F, -3.975F, 2, 2, 3, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 66, 17, -1.0F, -2.475F, -2.475F, 2, 2, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.9585F, -1.2396F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 0, -1.0F, -1.375F, -0.725F, 2, 1, 3, -0.009F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.3388F, -5.9768F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 0, -1.0F, -1.0F, 0.0F, 2, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.96F, -6.6215F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 8, -0.5F, 0.0F, 0.05F, 1, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.96F, -6.6215F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 11, -0.5F, 0.0F, -6.95F, 1, 1, 7, -0.006F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.635F, -2.188F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.0393F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.0061F, -0.0068F);
        this.throat.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5934F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 50, -1.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 2.802F, 4.1384F);
        this.throat.addChild(throat2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.throat2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4625F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 67, -1.0F, -2.0F, 0.0F, 1, 2, 2, -0.01F, false));


        this.leftMembrane.setScale((float)1,(float)0,(float)0);
        this.leftMembrane2.setScale((float)1,(float)0,(float)0);
        this.leftMembrane3.setScale((float)1,(float)0,(float)0);
        this.leftMembrane4.setScale((float)1,(float)0,(float)0);
        this.leftMembrane5.setScale((float)1,(float)0,(float)0);
        this.leftMembrane6.setScale((float)1,(float)0,(float)0);
        this.leftMembrane7.setScale((float)1,(float)0,(float)0);
        this.leftMembrane8.setScale((float)1,(float)0,(float)0);
        this.rightMembrane.setScale((float)1,(float)0,(float)0);
        this.rightMembrane2.setScale((float)1,(float)0,(float)0);
        this.rightMembrane3.setScale((float)1,(float)0,(float)0);
        this.rightMembrane4.setScale((float)1,(float)0,(float)0);
        this.rightMembrane5.setScale((float)1,(float)0,(float)0);
        this.rightMembrane6.setScale((float)1,(float)0,(float)0);
        this.rightMembrane7.setScale((float)1,(float)0,(float)0);
        this.rightMembrane8.setScale((float)1,(float)0,(float)0);



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
        this.main.offsetY = -0.8F;
        this.main.offsetX = -0.4F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(-20);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.0F, 3.8F, -0.2F);

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
        EntityPrehistoricFloraChaoyangopterus ee = (EntityPrehistoricFloraChaoyangopterus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftMembrane.setScale((float)1,(float)1,(float)1);
            this.leftMembrane2.setScale((float)1,(float)1,(float)1);
            this.leftMembrane3.setScale((float)1,(float)1,(float)1);
            this.leftMembrane4.setScale((float)1,(float)1,(float)1);
            this.leftMembrane5.setScale((float)1,(float)1,(float)1);
            this.leftMembrane6.setScale((float)1,(float)1,(float)1);
            this.leftMembrane7.setScale((float)1,(float)1,(float)1);
            this.leftMembrane8.setScale((float)1,(float)1,(float)1);
            this.rightMembrane.setScale((float)1,(float)1,(float)1);
            this.rightMembrane2.setScale((float)1,(float)1,(float)1);
            this.rightMembrane3.setScale((float)1,(float)1,(float)1);
            this.rightMembrane4.setScale((float)1,(float)1,(float)1);
            this.rightMembrane5.setScale((float)1,(float)1,(float)1);
            this.rightMembrane6.setScale((float)1,(float)1,(float)1);
            this.rightMembrane7.setScale((float)1,(float)1,(float)1);
            this.rightMembrane8.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, -0.5934F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, -0.4625F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.3534F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.2138F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(hand, -3.0847F, -0.2482F, -3.0743F);
            this.setRotateAngle(hand2, -3.0847F, 0.2482F, 3.0743F);
            this.setRotateAngle(head, 1.021F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.8712F, 0.1549F, -1.5735F);
            this.setRotateAngle(leftLeg2, 0.378F, -0.1125F, 0.2359F);
            this.setRotateAngle(leftLeg3, 0.8904F, 0.1462F, 0.0911F);
            this.setRotateAngle(leftMembrane, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(leftMembrane2, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(leftMembrane3, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(leftMembrane4, 0.0F, 0.0F, -0.096F);
            this.setRotateAngle(leftMembrane6, 0.0F, 0.0F, -0.1309F);
            this.setRotateAngle(leftMembrane8, -0.8197F, -0.1614F, -0.054F);
            this.setRotateAngle(leftWing, -0.0697F, -0.0289F, -1.6535F);
            this.setRotateAngle(leftWing2, 0.0354F, 0.0173F, -0.0043F);
            this.setRotateAngle(leftWing3, 0.0137F, 0.0293F, 0.0076F);
            this.setRotateAngle(leftWing4, -1.4879F, 0.0F, 0.0F);
            this.setRotateAngle(leftWing5, 0.179F, -0.0885F, -0.0206F);
            this.setRotateAngle(leftWing6, 0.4808F, -0.0413F, -0.0169F);
            this.setRotateAngle(main, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.288F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.2793F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, 0.8712F, -0.1549F, 1.5735F);
            this.setRotateAngle(rightLeg2, 0.378F, 0.1125F, -0.2359F);
            this.setRotateAngle(rightLeg3, 0.8904F, -0.1462F, -0.0911F);
            this.setRotateAngle(rightMembrane, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(rightMembrane2, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(rightMembrane3, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(rightMembrane4, 0.0F, 0.0F, 0.096F);
            this.setRotateAngle(rightMembrane6, 0.0F, 0.0F, 0.1309F);
            this.setRotateAngle(rightMembrane8, -0.8197F, 0.1614F, 0.054F);
            this.setRotateAngle(rightWing, -0.0697F, 0.0289F, 1.6535F);
            this.setRotateAngle(rightWing2, 0.0354F, -0.0173F, 0.0043F);
            this.setRotateAngle(rightWing3, 0.0137F, -0.0293F, -0.0076F);
            this.setRotateAngle(rightWing4, -1.4879F, 0.0F, 0.0F);
            this.setRotateAngle(rightWing5, 0.179F, 0.0885F, 0.0206F);
            this.setRotateAngle(rightWing6, 0.4808F, 0.0413F, 0.0169F);
            this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(throat, 0.1745F, 0.0F, 0.0F);




        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftMembrane.setScale((float)1,(float)0,(float)0);
                this.leftMembrane2.setScale((float)1,(float)0,(float)0);
                this.leftMembrane3.setScale((float)1,(float)0,(float)0);
                this.leftMembrane4.setScale((float)1,(float)0,(float)0);
                this.leftMembrane5.setScale((float)1,(float)0,(float)0);
                this.leftMembrane6.setScale((float)1,(float)0,(float)0);
                this.leftMembrane7.setScale((float)1,(float)0,(float)0);
                this.leftMembrane8.setScale((float)1,(float)0,(float)0);
                this.rightMembrane.setScale((float)1,(float)0,(float)0);
                this.rightMembrane2.setScale((float)1,(float)0,(float)0);
                this.rightMembrane3.setScale((float)1,(float)0,(float)0);
                this.rightMembrane4.setScale((float)1,(float)0,(float)0);
                this.rightMembrane5.setScale((float)1,(float)0,(float)0);
                this.rightMembrane6.setScale((float)1,(float)0,(float)0);
                this.rightMembrane7.setScale((float)1,(float)0,(float)0);
                this.rightMembrane8.setScale((float)1,(float)0,(float)0);
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChaoyangopterus entity = (EntityPrehistoricFloraChaoyangopterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 10.5 + (((tickAnim - 26) / 7) * (2.25-(10.5)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.25 + (((tickAnim - 33) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 26) / 7) * (-0.5-(6)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 33) / 7) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -2.25 + (((tickAnim - 26) / 7) * (2-(-2.25)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 33) / 7) * (0-(2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -25.75 + (((tickAnim - 26) / 7) * (-41.25-(-25.75)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -41.25 + (((tickAnim - 33) / 7) * (0-(-41.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 13.25 + (((tickAnim - 3) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 13.25 + (((tickAnim - 8) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 13.25 + (((tickAnim - 13) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 18) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 23) / 2) * (0-(13.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (29.75-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 29.75 + (((tickAnim - 33) / 7) * (0-(29.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.82-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.82 + (((tickAnim - 3) / 2) * (3.5-(-7.82)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 5) / 3) * (-7.82-(3.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.82 + (((tickAnim - 8) / 2) * (6-(-7.82)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 10) / 3) * (-4.82-(6)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.82 + (((tickAnim - 13) / 2) * (9.5-(-4.82)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 9.5 + (((tickAnim - 15) / 3) * (-1.57-(9.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.57 + (((tickAnim - 18) / 2) * (14.5-(-1.57)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 20) / 3) * (3.68-(14.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 3.68 + (((tickAnim - 23) / 3) * (22.5-(3.68)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 22.5 + (((tickAnim - 26) / 7) * (10.75-(22.5)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 33) / 7) * (0-(10.75)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (1.8-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.475 + (((tickAnim - 26) / 7) * (0-(-0.475)));
            zz = 1.8 + (((tickAnim - 26) / 7) * (0-(1.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraChaoyangopterus entity = (EntityPrehistoricFloraChaoyangopterus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.5 + (((tickAnim - 10) / 10) * (0-(14.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 20.25 + (((tickAnim - 10) / 10) * (0-(20.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 10) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.13 + (((tickAnim - 5) / 5) * (2.25-(19.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 10) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 18 + (((tickAnim - 5) / 5) * (0-(18)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-50.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -50.75 + (((tickAnim - 5) / 5) * (0-(-50.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0-(0.45)));
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
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChaoyangopterus entity = (EntityPrehistoricFloraChaoyangopterus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.25 + (((tickAnim - 0) / 5) * (-1.76769-(33.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.13805-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-4.87619-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.76769 + (((tickAnim - 5) / 3) * (-15.98373-(-1.76769)));
            yy = 1.13805 + (((tickAnim - 5) / 3) * (-0.09781-(1.13805)));
            zz = -4.87619 + (((tickAnim - 5) / 3) * (2.39931-(-4.87619)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -15.98373 + (((tickAnim - 8) / 17) * (33.25-(-15.98373)));
            yy = -0.09781 + (((tickAnim - 8) / 17) * (0-(-0.09781)));
            zz = 2.39931 + (((tickAnim - 8) / 17) * (0-(2.39931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.5 + (((tickAnim - 0) / 5) * (-1.19-(29.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.19 + (((tickAnim - 5) / 3) * (12-(-1.19)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 12 + (((tickAnim - 8) / 17) * (29.5-(12)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.9-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.9 + (((tickAnim - 5) / 3) * (-0.55-(1.9)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = -0.55 + (((tickAnim - 8) / 17) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
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
            xx = 63.25 + (((tickAnim - 0) / 5) * (70.94-(63.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 70.94 + (((tickAnim - 5) / 3) * (6.75-(70.94)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 8) / 5) * (-12.77-(6.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.77 + (((tickAnim - 13) / 12) * (63.25-(-12.77)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.08-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.08 + (((tickAnim - 5) / 3) * (-0.275-(1.08)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = -0.275 + (((tickAnim - 8) / 17) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 4.63573 + (((tickAnim - 0) / 10) * (33.25-(4.63573)));
            yy = 1.49171 + (((tickAnim - 0) / 10) * (0-(1.49171)));
            zz = -4.24785 + (((tickAnim - 0) / 10) * (0-(-4.24785)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 33.25 + (((tickAnim - 10) / 5) * (-1.76769-(33.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.13805-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-4.87619-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.76769 + (((tickAnim - 15) / 3) * (-15.98373-(-1.76769)));
            yy = 1.13805 + (((tickAnim - 15) / 3) * (0.09781-(1.13805)));
            zz = -4.87619 + (((tickAnim - 15) / 3) * (-2.39931-(-4.87619)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -15.98373 + (((tickAnim - 18) / 7) * (4.63573-(-15.98373)));
            yy = 0.09781 + (((tickAnim - 18) / 7) * (1.49171-(0.09781)));
            zz = -2.39931 + (((tickAnim - 18) / 7) * (-4.24785-(-2.39931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 0) / 10) * (29.5-(12)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.5 + (((tickAnim - 10) / 5) * (-1.19-(29.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.19 + (((tickAnim - 15) / 3) * (12-(-1.19)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12 + (((tickAnim - 18) / 7) * (12-(12)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 10) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.9-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.9 + (((tickAnim - 15) / 3) * (-0.55-(1.9)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.55 + (((tickAnim - 18) / 7) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
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
            xx = -14.25 + (((tickAnim - 0) / 3) * (-12.87-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12.87 + (((tickAnim - 3) / 7) * (63.25-(-12.87)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 63.25 + (((tickAnim - 10) / 5) * (70.94-(63.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 70.94 + (((tickAnim - 15) / 3) * (6.75-(70.94)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 18) / 7) * (-14.25-(6.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 10) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (1.08-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.08 + (((tickAnim - 15) / 3) * (-0.275-(1.08)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.275 + (((tickAnim - 18) / 7) * (0.225-(-0.275)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -8.33597 + (((tickAnim - 0) / 13) * (28.4654-(-8.33597)));
            yy = 4.3542 + (((tickAnim - 0) / 13) * (1.25568-(4.3542)));
            zz = 14.08708 + (((tickAnim - 0) / 13) * (-3.3105-(14.08708)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 28.4654 + (((tickAnim - 13) / 8) * (-8.89938-(28.4654)));
            yy = 1.25568 + (((tickAnim - 13) / 8) * (-23.21157-(1.25568)));
            zz = -3.3105 + (((tickAnim - 13) / 8) * (-12.45465-(-3.3105)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -8.89938 + (((tickAnim - 21) / 4) * (-8.33597-(-8.89938)));
            yy = -23.21157 + (((tickAnim - 21) / 4) * (4.3542-(-23.21157)));
            zz = -12.45465 + (((tickAnim - 21) / 4) * (14.08708-(-12.45465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 16 + (((tickAnim - 0) / 13) * (-16-(16)));
            yy = -23.75 + (((tickAnim - 0) / 13) * (-23.75-(-23.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -16 + (((tickAnim - 13) / 8) * (14.92832-(-16)));
            yy = -23.75 + (((tickAnim - 13) / 8) * (2.20857-(-23.75)));
            zz = 0 + (((tickAnim - 13) / 8) * (28.95261-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 14.92832 + (((tickAnim - 21) / 4) * (16-(14.92832)));
            yy = 2.20857 + (((tickAnim - 21) / 4) * (-23.75-(2.20857)));
            zz = 28.95261 + (((tickAnim - 21) / 4) * (0-(28.95261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane, leftMembrane.rotateAngleX + (float) Math.toRadians(xx), leftMembrane.rotateAngleY + (float) Math.toRadians(yy), leftMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 13) * (0-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftMembrane.rotationPointX = this.leftMembrane.rotationPointX + (float)(xx);
        this.leftMembrane.rotationPointY = this.leftMembrane.rotationPointY - (float)(yy);
        this.leftMembrane.rotationPointZ = this.leftMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -18.82395 + (((tickAnim - 0) / 13) * (12.5-(-18.82395)));
            yy = -3.45352 + (((tickAnim - 0) / 13) * (0-(-3.45352)));
            zz = -10.44687 + (((tickAnim - 0) / 13) * (0-(-10.44687)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 12.5 + (((tickAnim - 13) / 8) * (-1.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(12.5)));
            yy = 0 + (((tickAnim - 13) / 8) * (-1.56981-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (13.47607-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -1.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 21) / 4) * (-18.82395-(-1.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = -1.56981 + (((tickAnim - 21) / 4) * (-3.45352-(-1.56981)));
            zz = 13.47607 + (((tickAnim - 21) / 4) * (-10.44687-(13.47607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -0.025 + (((tickAnim - 13) / 8) * (-0.21-(-0.025)));
            yy = -0.4 + (((tickAnim - 13) / 8) * (-0.18-(-0.4)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.21 + (((tickAnim - 21) / 4) * (0-(-0.21)));
            yy = -0.18 + (((tickAnim - 21) / 4) * (0-(-0.18)));
            zz = 0.3 + (((tickAnim - 21) / 4) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);



        this.leftMembrane2.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 22.75 + (((tickAnim - 0) / 13) * (11.25-(22.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.25 + (((tickAnim - 13) / 5) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*30-(11.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*30 + (((tickAnim - 18) / 3) * (53-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*30)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 53 + (((tickAnim - 21) / 4) * (22.75-(53)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMembrane3.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 10.25 + (((tickAnim - 0) / 6) * (21-(10.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 21 + (((tickAnim - 6) / 7) * (0-(21)));
            zz = 0 + (((tickAnim - 6) / 7) * (66.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 66.25 + (((tickAnim - 13) / 8) * (72.36-(66.25)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (10.25-(0)));
            zz = 72.36 + (((tickAnim - 21) / 4) * (0-(72.36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -1.225 + (((tickAnim - 0) / 6) * (0.835-(-1.225)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.835 + (((tickAnim - 6) / 7) * (0.05-(0.835)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 12) * (-1.225-(0.05)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 4.75 + (((tickAnim - 13) / 8) * (16.36-(4.75)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 16.36 + (((tickAnim - 21) / 4) * (0-(16.36)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.075 + (((tickAnim - 0) / 13) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 8) * (-0.88-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0.55-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -0.88 + (((tickAnim - 21) / 4) * (-1.075-(-0.88)));
            zz = 0.55 + (((tickAnim - 21) / 4) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing4.rotationPointX = this.leftWing4.rotationPointX + (float)(xx);
        this.leftWing4.rotationPointY = this.leftWing4.rotationPointY - (float)(yy);
        this.leftWing4.rotationPointZ = this.leftWing4.rotationPointZ + (float)(zz);



        this.leftMembrane4.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 0) / 13) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 11.25 + (((tickAnim - 13) / 8) * (-12.23-(11.25)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -12.23 + (((tickAnim - 21) / 4) * (14.5-(-12.23)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMembrane5.setScale((float)0,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -19 + (((tickAnim - 0) / 13) * (-10-(-19)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 13) / 12) * (-19-(-10)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing6, leftWing6.rotateAngleX + (float) Math.toRadians(xx), leftWing6.rotateAngleY + (float) Math.toRadians(yy), leftWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMembrane7.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 28.4654 + (((tickAnim - 0) / 8) * (3.0591-(28.4654)));
            yy = -1.25568 + (((tickAnim - 0) / 8) * (36.61966-(-1.25568)));
            zz = 3.3105 + (((tickAnim - 0) / 8) * (14.33471-(3.3105)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 3.0591 + (((tickAnim - 8) / 5) * (-8.33597-(3.0591)));
            yy = 36.61966 + (((tickAnim - 8) / 5) * (-4.3542-(36.61966)));
            zz = 14.33471 + (((tickAnim - 8) / 5) * (-14.08708-(14.33471)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -8.33597 + (((tickAnim - 13) / 12) * (28.4654-(-8.33597)));
            yy = -4.3542 + (((tickAnim - 13) / 12) * (-1.25568-(-4.3542)));
            zz = -14.08708 + (((tickAnim - 13) / 12) * (3.3105-(-14.08708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -13.75 + (((tickAnim - 0) / 8) * (15.59356-(-13.75)));
            yy = 23.75 + (((tickAnim - 0) / 8) * (-19.10081-(23.75)));
            zz = 0 + (((tickAnim - 0) / 8) * (-33.58913-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.59356 + (((tickAnim - 8) / 5) * (25.5-(15.59356)));
            yy = -19.10081 + (((tickAnim - 8) / 5) * (23.75-(-19.10081)));
            zz = -33.58913 + (((tickAnim - 8) / 5) * (0-(-33.58913)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 25.5 + (((tickAnim - 13) / 12) * (-13.75-(25.5)));
            yy = 23.75 + (((tickAnim - 13) / 12) * (23.75-(23.75)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane, rightMembrane.rotateAngleX + (float) Math.toRadians(xx), rightMembrane.rotateAngleY + (float) Math.toRadians(yy), rightMembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 8) * (-0.695-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.8 + (((tickAnim - 8) / 5) * (0-(-0.8)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.695 + (((tickAnim - 8) / 5) * (0-(-0.695)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMembrane.rotationPointX = this.rightMembrane.rotationPointX + (float)(xx);
        this.rightMembrane.rotationPointY = this.rightMembrane.rotationPointY - (float)(yy);
        this.rightMembrane.rotationPointZ = this.rightMembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 0) / 8) * (-0.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(12.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.56981-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-13.47607-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 8) / 5) * (-18.82395-(-0.6985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 1.56981 + (((tickAnim - 8) / 5) * (3.45352-(1.56981)));
            zz = -13.47607 + (((tickAnim - 8) / 5) * (10.44687-(-13.47607)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -18.82395 + (((tickAnim - 13) / 12) * (12.5-(-18.82395)));
            yy = 3.45352 + (((tickAnim - 13) / 12) * (0-(3.45352)));
            zz = 10.44687 + (((tickAnim - 13) / 12) * (0-(10.44687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.025 + (((tickAnim - 0) / 8) * (-0.21-(-0.025)));
            yy = -0.4 + (((tickAnim - 0) / 8) * (-0.18-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.21 + (((tickAnim - 8) / 5) * (0-(-0.21)));
            yy = -0.18 + (((tickAnim - 8) / 5) * (0-(-0.18)));
            zz = 0.3 + (((tickAnim - 8) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-0.025-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);



        this.rightMembrane2.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.25 + (((tickAnim - 0) / 4) * (8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*-30-(11.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*-30 + (((tickAnim - 4) / 4) * (54.25-(8.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-130))*-30)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 54.25 + (((tickAnim - 8) / 5) * (15.25-(54.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 15.25 + (((tickAnim - 13) / 12) * (11.25-(15.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMembrane3.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -66.25 + (((tickAnim - 0) / 8) * (-72.36-(-66.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (10.25-(0)));
            zz = -72.36 + (((tickAnim - 8) / 5) * (0-(-72.36)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0.35507-(0)));
            yy = 10.25 + (((tickAnim - 13) / 5) * (-17.97714-(10.25)));
            zz = 0 + (((tickAnim - 13) / 5) * (10.24304-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.35507 + (((tickAnim - 18) / 7) * (0-(0.35507)));
            yy = -17.97714 + (((tickAnim - 18) / 7) * (0-(-17.97714)));
            zz = 10.24304 + (((tickAnim - 18) / 7) * (-66.25-(10.24304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 13) * (-1.75-(-0.45)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -1.75 + (((tickAnim - 13) / 5) * (0.23-(-1.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.23 + (((tickAnim - 18) / 3) * (0.835-(0.23)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.835 + (((tickAnim - 21) / 4) * (-0.45-(0.835)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4.75 + (((tickAnim - 0) / 8) * (16.36-(4.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16.36 + (((tickAnim - 8) / 5) * (0-(16.36)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.88-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.55-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.88 + (((tickAnim - 8) / 5) * (-1.075-(-0.88)));
            zz = 0.55 + (((tickAnim - 8) / 5) * (0-(0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -1.075 + (((tickAnim - 13) / 12) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing4.rotationPointX = this.rightWing4.rotationPointX + (float)(xx);
        this.rightWing4.rotationPointY = this.rightWing4.rotationPointY - (float)(yy);
        this.rightWing4.rotationPointZ = this.rightWing4.rotationPointZ + (float)(zz);



        this.rightMembrane4.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 0) / 8) * (-12.23-(11.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -12.23 + (((tickAnim - 8) / 5) * (14.5-(-12.23)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 14.5 + (((tickAnim - 13) / 12) * (11.25-(14.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMembrane5.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 0) / 13) * (-19-(-10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -19 + (((tickAnim - 13) / 12) * (-10-(-19)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing6, rightWing6.rotateAngleX + (float) Math.toRadians(xx), rightWing6.rotateAngleY + (float) Math.toRadians(yy), rightWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMembrane7.setScale((float)0,(float)1,(float)0);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-80))*-4), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*4));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*-0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*0.7);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*7), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*9));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*-4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+200))*-3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-300))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*1));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-350))*2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+350))*1));

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChaoyangopterus entity = (EntityPrehistoricFloraChaoyangopterus) entitylivingbaseIn;
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
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMembrane, leftMembrane.rotateAngleX + (float) Math.toRadians(xx), leftMembrane.rotateAngleY + (float) Math.toRadians(yy), leftMembrane.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30)));
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
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30)));
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

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraChaoyangopterus e = (EntityPrehistoricFloraChaoyangopterus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((-0.1571F)-(-0.1571F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.3316F)-(-0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((-0.5934F)-(-0.5934F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((-0.4625F)-(-0.4625F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.3534F)-(-0.3534F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.2138F)-(0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hand, ((-3.0847F)-(0.1715F)), ((-0.2482F)-(-0.0463F)),((-3.0743F)-(1.7786F)));
        animator.rotate(hand2, ((-3.0847F)-(0.1715F)), ((0.2482F)-(0.0463F)),((3.0743F)-(-1.7786F)));
        animator.rotate(head, ((1.021F)-(1.021F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg, ((0.8712F)-(0.258F)), ((0.1549F)-(0.045F)),((-1.5735F)-(-0.3869F)));
        animator.rotate(leftLeg2, ((0.378F)-(0.378F)), ((-0.1125F)-(-0.1125F)),((0.2359F)-(0.2359F)));
        animator.rotate(leftLeg3, ((0.8904F)-(-0.1655F)), ((0.1462F)-(0.1462F)),((0.0911F)-(0.0911F)));
        animator.rotate(leftMembrane, ((0.0F)-(0.0F)), ((-0.0436F)-(-0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane2, ((0.0F)-(0.0F)), ((-0.0436F)-(-0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane3, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.096F)-(-0.096F)));
        animator.rotate(leftMembrane6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1309F)-(-0.1309F)));
        animator.rotate(leftMembrane8, ((-0.8197F)-(-0.8197F)), ((-0.1614F)-(-0.1614F)),((-0.054F)-(-0.054F)));
        animator.rotate(leftWing, ((-0.0697F)-(-0.1346F)), ((-0.0289F)-(0.1512F)),((-1.6535F)-(-1.0678F)));
        animator.rotate(leftWing2, ((0.0354F)-(0.0116F)), ((0.0173F)-(0.0133F)),((-0.0043F)-(0.9339F)));
        animator.rotate(leftWing3, ((0.0137F)-(0.1315F)), ((0.0293F)-(0.0293F)),((0.0076F)-(0.0076F)));
        animator.rotate(leftWing4, ((-1.4879F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftWing5, ((0.179F)-(1.0949F)), ((-0.0885F)-(0.0775F)),((-0.0206F)-(0.2286F)));
        animator.rotate(leftWing6, ((0.4808F)-(0.4808F)), ((-0.0413F)-(-0.0413F)),((-0.0169F)-(-0.0169F)));
        animator.rotate(main, ((-0.2182F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.288F)-(-0.1702F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.2793F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg, ((0.8712F)-(0.258F)), ((-0.1549F)-(-0.045F)),((1.5735F)-(0.3869F)));
        animator.rotate(rightLeg2, ((0.378F)-(0.378F)), ((0.1125F)-(0.1125F)),((-0.2359F)-(-0.2359F)));
        animator.rotate(rightLeg3, ((0.8904F)-(-0.1655F)), ((-0.1462F)-(-0.1462F)),((-0.0911F)-(-0.0911F)));
        animator.rotate(rightMembrane, ((0.0F)-(0.0F)), ((0.0436F)-(0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane2, ((0.0F)-(0.0F)), ((0.0436F)-(0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane3, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.096F)-(0.096F)));
        animator.rotate(rightMembrane6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1309F)-(0.1309F)));
        animator.rotate(rightMembrane8, ((-0.8197F)-(-0.8197F)), ((0.1614F)-(0.1614F)),((0.054F)-(0.054F)));
        animator.rotate(rightWing, ((-0.0697F)-(-0.1346F)), ((0.0289F)-(-0.1512F)),((1.6535F)-(1.0678F)));
        animator.rotate(rightWing2, ((0.0354F)-(0.0116F)), ((-0.0173F)-(-0.0133F)),((0.0043F)-(-0.9339F)));
        animator.rotate(rightWing3, ((0.0137F)-(0.1315F)), ((-0.0293F)-(-0.0293F)),((-0.0076F)-(-0.0076F)));
        animator.rotate(rightWing4, ((-1.4879F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightWing5, ((0.179F)-(1.0949F)), ((0.0885F)-(-0.0775F)),((0.0206F)-(-0.2286F)));
        animator.rotate(rightWing6, ((0.4808F)-(0.4808F)), ((0.0413F)-(0.0413F)),((0.0169F)-(0.0169F)));
        animator.rotate(tail, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((0.1745F)-(0.0393F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((-0.1571F)-(-0.1571F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.3316F)-(-0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((-0.5934F)-(-0.5934F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((-0.4625F)-(-0.4625F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.3534F)-(-0.3534F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.2138F)-(0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hand, -((-3.0847F)-(0.1715F)), -((-0.2482F)-(-0.0463F)),-((-3.0743F)-(1.7786F)));
        animator.rotate(hand2, -((-3.0847F)-(0.1715F)), -((0.2482F)-(0.0463F)),-((3.0743F)-(-1.7786F)));
        animator.rotate(head, -((1.021F)-(1.021F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg, -((0.8712F)-(0.258F)), -((0.1549F)-(0.045F)),-((-1.5735F)-(-0.3869F)));
        animator.rotate(leftLeg2, -((0.378F)-(0.378F)), -((-0.1125F)-(-0.1125F)),-((0.2359F)-(0.2359F)));
        animator.rotate(leftLeg3, -((0.8904F)-(-0.1655F)), -((0.1462F)-(0.1462F)),-((0.0911F)-(0.0911F)));
        animator.rotate(leftMembrane, -((0.0F)-(0.0F)), -((-0.0436F)-(-0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane2, -((0.0F)-(0.0F)), -((-0.0436F)-(-0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane3, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.096F)-(-0.096F)));
        animator.rotate(leftMembrane6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1309F)-(-0.1309F)));
        animator.rotate(leftMembrane8, -((-0.8197F)-(-0.8197F)), -((-0.1614F)-(-0.1614F)),-((-0.054F)-(-0.054F)));
        animator.rotate(leftWing, -((-0.0697F)-(-0.1346F)), -((-0.0289F)-(0.1512F)),-((-1.6535F)-(-1.0678F)));
        animator.rotate(leftWing2, -((0.0354F)-(0.0116F)), -((0.0173F)-(0.0133F)),-((-0.0043F)-(0.9339F)));
        animator.rotate(leftWing3, -((0.0137F)-(0.1315F)), -((0.0293F)-(0.0293F)),-((0.0076F)-(0.0076F)));
        animator.rotate(leftWing4, -((-1.4879F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftWing5, -((0.179F)-(1.0949F)), -((-0.0885F)-(0.0775F)),-((-0.0206F)-(0.2286F)));
        animator.rotate(leftWing6, -((0.4808F)-(0.4808F)), -((-0.0413F)-(-0.0413F)),-((-0.0169F)-(-0.0169F)));
        animator.rotate(main, -((-0.2182F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.288F)-(-0.1702F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.2793F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg, -((0.8712F)-(0.258F)), -((-0.1549F)-(-0.045F)),-((1.5735F)-(0.3869F)));
        animator.rotate(rightLeg2, -((0.378F)-(0.378F)), -((0.1125F)-(0.1125F)),-((-0.2359F)-(-0.2359F)));
        animator.rotate(rightLeg3, -((0.8904F)-(-0.1655F)), -((-0.1462F)-(-0.1462F)),-((-0.0911F)-(-0.0911F)));
        animator.rotate(rightMembrane, -((0.0F)-(0.0F)), -((0.0436F)-(0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane2, -((0.0F)-(0.0F)), -((0.0436F)-(0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane3, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.096F)-(0.096F)));
        animator.rotate(rightMembrane6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1309F)-(0.1309F)));
        animator.rotate(rightMembrane8, -((-0.8197F)-(-0.8197F)), -((0.1614F)-(0.1614F)),-((0.054F)-(0.054F)));
        animator.rotate(rightWing, -((-0.0697F)-(-0.1346F)), -((0.0289F)-(-0.1512F)),-((1.6535F)-(1.0678F)));
        animator.rotate(rightWing2, -((0.0354F)-(0.0116F)), -((-0.0173F)-(-0.0133F)),-((0.0043F)-(-0.9339F)));
        animator.rotate(rightWing3, -((0.0137F)-(0.1315F)), -((-0.0293F)-(-0.0293F)),-((-0.0076F)-(-0.0076F)));
        animator.rotate(rightWing4, -((-1.4879F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightWing5, -((0.179F)-(1.0949F)), -((0.0885F)-(-0.0775F)),-((0.0206F)-(-0.2286F)));
        animator.rotate(rightWing6, -((0.4808F)-(0.4808F)), -((0.0413F)-(0.0413F)),-((0.0169F)-(0.0169F)));
        animator.rotate(tail, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((0.1745F)-(0.0393F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
