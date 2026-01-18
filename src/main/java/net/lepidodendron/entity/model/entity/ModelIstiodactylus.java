package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraIstiodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelIstiodactylus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer body2;
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
    private final AdvancedModelRenderer rightWing7;
    private final AdvancedModelRenderer rightMembrane9;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer leftMembrane;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftMembrane2;
    private final AdvancedModelRenderer leftMembrane8;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftMembrane3;
    private final AdvancedModelRenderer hand3;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftMembrane4;
    private final AdvancedModelRenderer leftWing5;
    private final AdvancedModelRenderer leftMembrane5;
    private final AdvancedModelRenderer leftMembrane6;
    private final AdvancedModelRenderer leftWing6;
    private final AdvancedModelRenderer leftMembrane7;
    private final AdvancedModelRenderer leftWing7;
    private final AdvancedModelRenderer leftMembrane9;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
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

    private ModelAnimator animator;

    public ModelIstiodactylus() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 12.8322F, 5.6209F);
        this.setRotateAngle(main, -0.4581F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.425F, 0.025F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 70, -1.5F, -0.2F, -1.1F, 3, 3, 2, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.9417F, 0.6241F, -1.0374F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.2297F, -0.0742F, -0.3767F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 11, 68, -1.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, true));

        this.leftLegMembrane = new AdvancedModelRenderer(this);
        this.leftLegMembrane.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.leftLeg.addChild(leftLegMembrane);
        this.leftLegMembrane.cubeList.add(new ModelBox(leftLegMembrane, 67, 75, -0.5F, -3.5F, 0.0F, 1, 6, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.5F, 5.5F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.7228F, -0.0876F, 0.1097F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 62, 72, -1.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 45, 55, -0.5F, 0.0F, 1.0F, 0, 7, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.487F, 6.1937F, 0.2568F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.421F, 0.2782F, 0.079F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 40, 72, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.9417F, 0.6241F, -1.0374F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.2297F, 0.0742F, 0.3767F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 11, 68, -1.0F, -0.5F, -1.0F, 2, 6, 2, 0.0F, false));

        this.rightLegMembrane = new AdvancedModelRenderer(this);
        this.rightLegMembrane.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.rightLeg.addChild(rightLegMembrane);
        this.rightLegMembrane.cubeList.add(new ModelBox(rightLegMembrane, 67, 75, -0.5F, -3.5F, 0.0F, 1, 6, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, 5.5F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.7228F, 0.0876F, -0.1097F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 62, 72, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 45, 55, 0.5F, 0.0F, 1.0F, 0, 7, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.487F, 6.1937F, 0.2568F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.421F, -0.2782F, -0.079F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 40, 72, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -1.3546F, 0.8681F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 76, 36, -0.5F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, -1.5173F, -0.4694F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 30, 55, -2.0F, -0.4352F, -2.9811F, 4, 4, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2352F, -1.7811F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 30, -2.5F, -0.25F, -5.95F, 5, 5, 6, 0.01F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-2.5836F, 1.8397F, -4.9855F);
        this.body2.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.0845F, -0.0218F, 1.8229F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 66, -0.5F, -1.25F, -0.5F, 1, 4, 4, 0.0F, false));

        this.rightMembrane = new AdvancedModelRenderer(this);
        this.rightMembrane.setRotationPoint(-0.5F, 0.75F, 3.5F);
        this.rightWing.addChild(rightMembrane);
        this.setRotateAngle(rightMembrane, 0.0F, 0.0436F, 0.0F);
        this.rightMembrane.cubeList.add(new ModelBox(rightMembrane, 63, 12, 0.0F, -3.0F, 0.0F, 1, 5, 4, 0.0F, false));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, -0.0099F, -0.0779F, -1.4439F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 60, 59, -0.5F, 0.0F, -0.5F, 1, 9, 3, 0.001F, false));

        this.rightMembrane2 = new AdvancedModelRenderer(this);
        this.rightMembrane2.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.rightWing2.addChild(rightMembrane2);
        this.setRotateAngle(rightMembrane2, 0.0F, 0.0436F, 0.0F);
        this.rightMembrane2.cubeList.add(new ModelBox(rightMembrane2, 49, 52, 0.0F, 0.0F, 0.0F, 1, 9, 4, 0.001F, false));

        this.rightMembrane8 = new AdvancedModelRenderer(this);
        this.rightMembrane8.setRotationPoint(0.5727F, 7.6221F, 3.4598F);
        this.rightMembrane2.addChild(rightMembrane8);
        this.setRotateAngle(rightMembrane8, -0.9173F, 0.0218F, -0.0495F);
        this.rightMembrane8.cubeList.add(new ModelBox(rightMembrane8, 0, 42, 0.0F, -8.0F, -6.0F, 0, 8, 7, 0.0F, false));
        this.rightMembrane8.cubeList.add(new ModelBox(rightMembrane8, 15, 44, -0.05F, -8.0F, -6.0F, 0, 8, 7, 0.0F, false));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.4831F, 8.9999F, -0.5F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.2414F, 0.0226F, -0.2608F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 69, 65, 0.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

        this.rightMembrane3 = new AdvancedModelRenderer(this);
        this.rightMembrane3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightWing3.addChild(rightMembrane3);
        this.setRotateAngle(rightMembrane3, 0.0F, 0.0873F, 0.0F);
        this.rightMembrane3.cubeList.add(new ModelBox(rightMembrane3, 50, 12, 0.0F, 0.0F, 0.0F, 1, 7, 5, 0.0F, false));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(0.925F, 6.425F, 0.1F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, -1.9418F, -0.2134F, 1.4632F);
        this.hand2.cubeList.add(new ModelBox(hand2, 76, 22, 0.0F, -1.5F, 0.0F, 1, 2, 2, 0.002F, false));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -0.0309F, 0.0082F, -0.0781F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 0, 75, 0.0F, -2.0F, 0.0F, 1, 2, 3, 0.002F, false));

        this.rightMembrane4 = new AdvancedModelRenderer(this);
        this.rightMembrane4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightWing4.addChild(rightMembrane4);
        this.setRotateAngle(rightMembrane4, 0.0F, 0.0F, 0.096F);
        this.rightMembrane4.cubeList.add(new ModelBox(rightMembrane4, 20, 68, 0.0F, -5.0F, 0.0F, 1, 5, 3, 0.002F, false));

        this.rightWing5 = new AdvancedModelRenderer(this);
        this.rightWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 0.672F, 0.0F, 0.0F);
        this.rightWing5.cubeList.add(new ModelBox(rightWing5, 30, 44, 0.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.rightMembrane5 = new AdvancedModelRenderer(this);
        this.rightMembrane5.setRotationPoint(0.5F, -4.0F, 0.0F);
        this.rightWing5.addChild(rightMembrane5);
        this.rightMembrane5.cubeList.add(new ModelBox(rightMembrane5, 48, 29, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.rightMembrane6 = new AdvancedModelRenderer(this);
        this.rightMembrane6.setRotationPoint(-0.1305F, -0.0086F, 4.0F);
        this.rightMembrane5.addChild(rightMembrane6);
        this.setRotateAngle(rightMembrane6, 0.0F, 0.0F, 0.1309F);
        this.rightMembrane6.cubeList.add(new ModelBox(rightMembrane6, 49, 40, 0.0F, -3.0F, -4.0F, 0, 3, 8, 0.0F, false));
        this.rightMembrane6.cubeList.add(new ModelBox(rightMembrane6, 50, 0, 0.05F, -3.0F, -4.0F, 0, 3, 8, 0.0F, false));

        this.rightWing6 = new AdvancedModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.6765F, 0.0426F, 0.0094F);
        this.rightWing6.cubeList.add(new ModelBox(rightWing6, 25, 15, 0.0F, -2.0F, 0.0F, 1, 2, 11, 0.002F, false));

        this.rightMembrane7 = new AdvancedModelRenderer(this);
        this.rightMembrane7.setRotationPoint(0.5F, -2.0F, 6.0F);
        this.rightWing6.addChild(rightMembrane7);
        this.rightMembrane7.cubeList.add(new ModelBox(rightMembrane7, 27, 0, 0.0F, -3.0F, -6.0F, 0, 3, 11, 0.0F, false));
        this.rightMembrane7.cubeList.add(new ModelBox(rightMembrane7, 25, 29, 0.05F, -3.0F, -6.0F, 0, 3, 11, 0.0F, false));

        this.rightWing7 = new AdvancedModelRenderer(this);
        this.rightWing7.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.rightWing6.addChild(rightWing7);
        this.setRotateAngle(rightWing7, 0.0886F, 0.0806F, 0.0335F);
        this.rightWing7.cubeList.add(new ModelBox(rightWing7, 0, 0, 0.0F, -2.0F, 0.0F, 1, 2, 12, 0.0F, false));

        this.rightMembrane9 = new AdvancedModelRenderer(this);
        this.rightMembrane9.setRotationPoint(0.5F, -2.0F, 6.0F);
        this.rightWing7.addChild(rightMembrane9);
        this.rightMembrane9.cubeList.add(new ModelBox(rightMembrane9, 0, 15, 0.0F, -2.0F, -6.0F, 0, 2, 12, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(2.5836F, 1.8397F, -4.9855F);
        this.body2.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.0845F, 0.0218F, -1.8229F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 66, -0.5F, -1.25F, -0.5F, 1, 4, 4, 0.0F, true));

        this.leftMembrane = new AdvancedModelRenderer(this);
        this.leftMembrane.setRotationPoint(0.5F, 0.75F, 3.5F);
        this.leftWing.addChild(leftMembrane);
        this.setRotateAngle(leftMembrane, 0.0F, -0.0436F, 0.0F);
        this.leftMembrane.cubeList.add(new ModelBox(leftMembrane, 63, 12, -1.0F, -3.0F, 0.0F, 1, 5, 4, 0.0F, true));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, -0.0099F, 0.0779F, 1.4439F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 60, 59, -0.5F, 0.0F, -0.5F, 1, 9, 3, 0.001F, true));

        this.leftMembrane2 = new AdvancedModelRenderer(this);
        this.leftMembrane2.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.leftWing2.addChild(leftMembrane2);
        this.setRotateAngle(leftMembrane2, 0.0F, -0.0436F, 0.0F);
        this.leftMembrane2.cubeList.add(new ModelBox(leftMembrane2, 49, 52, -1.0F, 0.0F, 0.0F, 1, 9, 4, 0.001F, true));

        this.leftMembrane8 = new AdvancedModelRenderer(this);
        this.leftMembrane8.setRotationPoint(-0.5727F, 7.6221F, 3.4598F);
        this.leftMembrane2.addChild(leftMembrane8);
        this.setRotateAngle(leftMembrane8, -0.9173F, -0.0218F, 0.0495F);
        this.leftMembrane8.cubeList.add(new ModelBox(leftMembrane8, 0, 42, 0.0F, -8.0F, -6.0F, 0, 8, 7, 0.0F, true));
        this.leftMembrane8.cubeList.add(new ModelBox(leftMembrane8, 15, 44, 0.05F, -8.0F, -6.0F, 0, 8, 7, 0.0F, true));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(0.4831F, 8.9999F, -0.5F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.2414F, -0.0226F, 0.2608F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 69, 65, -1.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F, true));

        this.leftMembrane3 = new AdvancedModelRenderer(this);
        this.leftMembrane3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftWing3.addChild(leftMembrane3);
        this.setRotateAngle(leftMembrane3, 0.0F, -0.0873F, 0.0F);
        this.leftMembrane3.cubeList.add(new ModelBox(leftMembrane3, 50, 12, -1.0F, 0.0F, 0.0F, 1, 7, 5, 0.0F, true));

        this.hand3 = new AdvancedModelRenderer(this);
        this.hand3.setRotationPoint(-0.925F, 6.425F, 0.1F);
        this.leftWing3.addChild(hand3);
        this.setRotateAngle(hand3, -1.9418F, 0.2134F, -1.4632F);
        this.hand3.cubeList.add(new ModelBox(hand3, 76, 22, -1.0F, -1.5F, 0.0F, 1, 2, 2, 0.002F, true));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -0.0309F, -0.0082F, 0.0781F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 0, 75, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.002F, true));

        this.leftMembrane4 = new AdvancedModelRenderer(this);
        this.leftMembrane4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftWing4.addChild(leftMembrane4);
        this.setRotateAngle(leftMembrane4, 0.0F, 0.0F, -0.096F);
        this.leftMembrane4.cubeList.add(new ModelBox(leftMembrane4, 20, 68, -1.0F, -5.0F, 0.0F, 1, 5, 3, 0.002F, true));

        this.leftWing5 = new AdvancedModelRenderer(this);
        this.leftWing5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 0.672F, 0.0F, 0.0F);
        this.leftWing5.cubeList.add(new ModelBox(leftWing5, 30, 44, -1.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.leftMembrane5 = new AdvancedModelRenderer(this);
        this.leftMembrane5.setRotationPoint(-0.5F, -4.0F, 0.0F);
        this.leftWing5.addChild(leftMembrane5);
        this.leftMembrane5.cubeList.add(new ModelBox(leftMembrane5, 48, 29, -0.5F, 0.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.leftMembrane6 = new AdvancedModelRenderer(this);
        this.leftMembrane6.setRotationPoint(0.1305F, -0.0086F, 4.0F);
        this.leftMembrane5.addChild(leftMembrane6);
        this.setRotateAngle(leftMembrane6, 0.0F, 0.0F, -0.1309F);
        this.leftMembrane6.cubeList.add(new ModelBox(leftMembrane6, 49, 40, 0.0F, -3.0F, -4.0F, 0, 3, 8, 0.0F, true));
        this.leftMembrane6.cubeList.add(new ModelBox(leftMembrane6, 50, 0, -0.05F, -3.0F, -4.0F, 0, 3, 8, 0.0F, true));

        this.leftWing6 = new AdvancedModelRenderer(this);
        this.leftWing6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.6765F, -0.0426F, -0.0094F);
        this.leftWing6.cubeList.add(new ModelBox(leftWing6, 25, 15, -1.0F, -2.0F, 0.0F, 1, 2, 11, 0.002F, true));

        this.leftMembrane7 = new AdvancedModelRenderer(this);
        this.leftMembrane7.setRotationPoint(-0.5F, -2.0F, 6.0F);
        this.leftWing6.addChild(leftMembrane7);
        this.leftMembrane7.cubeList.add(new ModelBox(leftMembrane7, 27, 0, 0.0F, -3.0F, -6.0F, 0, 3, 11, 0.0F, true));
        this.leftMembrane7.cubeList.add(new ModelBox(leftMembrane7, 25, 29, -0.05F, -3.0F, -6.0F, 0, 3, 11, 0.0F, true));

        this.leftWing7 = new AdvancedModelRenderer(this);
        this.leftWing7.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.leftWing6.addChild(leftWing7);
        this.setRotateAngle(leftWing7, 0.0886F, -0.0806F, -0.0335F);
        this.leftWing7.cubeList.add(new ModelBox(leftWing7, 0, 0, -1.0F, -2.0F, 0.0F, 1, 2, 12, 0.0F, true));

        this.leftMembrane9 = new AdvancedModelRenderer(this);
        this.leftMembrane9.setRotationPoint(-0.5F, -2.0F, 6.0F);
        this.leftWing7.addChild(leftMembrane9);
        this.leftMembrane9.cubeList.add(new ModelBox(leftMembrane9, 0, 15, 0.0F, -2.0F, -6.0F, 0, 2, 12, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, 0.0085F, -5.6353F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 63, 22, -1.0F, -0.25F, -2.0F, 3, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 3.0118F, -0.5076F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 72, -1.0F, -0.675F, -1.425F, 2, 1, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 67, 29, -0.5F, -0.25F, -2.0F, 2, 3, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0754F, -1.6378F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 1.0254F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 63, -1.0F, -1.5F, -1.75F, 3, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 25, -1.0F, -1.5F, -2.75F, 3, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 67, 6, -0.5F, 0.7F, -1.75F, 2, 2, 3, 0.006F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 66, -0.5F, -0.5F, -6.75F, 2, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 74, 12, -0.5F, -1.5F, -5.4F, 2, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.0522F, -6.9521F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 75, 52, -0.5F, -0.025F, -2.75F, 1, 1, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.2024F, -3.3041F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 46, -0.5F, 0.0F, -3.825F, 2, 1, 4, 0.005F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.2284F, -0.485F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 40, -0.5F, 0.0F, -3.0F, 3, 2, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.025F, -0.968F, -0.428F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.611F, 0.0179F, 0.0125F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 25, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.1F, -1.566F, -0.3138F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 25, 0.075F, -0.425F, -0.8F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 25, 3.125F, -0.425F, -0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.9565F, -0.4003F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 65, -1.6F, -0.6F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 65, 0.6F, -0.6F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.025F, -0.968F, -0.428F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.611F, -0.0179F, -0.0125F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 25, 0.0F, -1.0F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -3.0F, 1.25F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 74, 17, -0.5F, 0.0F, -1.75F, 3, 2, 2, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.1627F, -11.2418F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0567F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 76, -0.4F, -0.5F, -1.4F, 0, 1, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 29, 76, 0.4F, -0.5F, -1.4F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.5F, -6.75F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0305F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 58, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -1.75F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 67, 36, -1.0F, 0.0F, -1.0F, 3, 1, 1, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 69, 59, -0.5F, -1.7F, -2.5F, 2, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 67, 0, -0.5F, 0.0F, -5.0F, 2, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.3433F, -9.4798F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 75, -0.375F, -0.8F, -1.45F, 0, 1, 3, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 72, 75, 0.375F, -0.8F, -1.45F, 0, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.0F, -5.0F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 60, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 1.0F, -4.5F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 52, -1.0F, -1.0F, 0.0F, 2, 1, 5, -0.006F, false));



        this.leftMembrane.scaleChildren = true;
        this.leftMembrane2.scaleChildren = true;
        this.leftMembrane3.scaleChildren = true;
        this.leftMembrane4.scaleChildren = true;
        this.leftMembrane5.scaleChildren = true;
        this.leftMembrane6.scaleChildren = true;
        this.leftMembrane7.scaleChildren = true;
        this.rightMembrane.scaleChildren = true;
        this.rightMembrane2.scaleChildren = true;
        this.rightMembrane3.scaleChildren = true;
        this.rightMembrane4.scaleChildren = true;
        this.rightMembrane5.scaleChildren = true;
        this.rightMembrane6.scaleChildren = true;
        this.rightMembrane7.scaleChildren = true;
        this.leftMembrane2.setScale((float)1,(float)0,(float)0);
        this.leftMembrane3.setScale((float)1,(float)0,(float)0);
        this.leftMembrane4.setScale((float)1,(float)0,(float)0);
        this.leftMembrane5.setScale((float)1,(float)0,(float)0);
        this.rightMembrane2.setScale((float)1,(float)0,(float)0);
        this.rightMembrane3.setScale((float)1,(float)0,(float)0);
        this.rightMembrane4.setScale((float)1,(float)0,(float)0);
        this.rightMembrane5.setScale((float)1,(float)0,(float)0);
        this.rightMembrane6.setScale((float)1,(float)0,(float)0);
        this.rightMembrane7.setScale((float)1,(float)0,(float)0);
        this.rightMembrane8.setScale((float)1,(float)0,(float)0);
        this.rightMembrane9.setScale((float)1,(float)0,(float)0);
        this.leftMembrane6.setScale((float)1,(float)0,(float)0);
        this.leftMembrane7.setScale((float)1,(float)0,(float)0);
        this.leftMembrane8.setScale((float)1,(float)0,(float)0);
        this.leftMembrane9.setScale((float)1,(float)0,(float)0);


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
//            this.faceTarget(f3, f4, 8, neck);
//            this.faceTarget(f3, f4, 8, neck2);
//            this.faceTarget(f3, f4, 8, neck3);
//            this.faceTarget(f3, f4, 4, head);

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
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraIstiodactylus ee = (EntityPrehistoricFloraIstiodactylus) entitylivingbaseIn;

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
            this.rightMembrane.setScale((float)1,(float)1,(float)1);
            this.rightMembrane2.setScale((float)1,(float)1,(float)1);
            this.rightMembrane3.setScale((float)1,(float)1,(float)1);
            this.rightMembrane4.setScale((float)1,(float)1,(float)1);
            this.rightMembrane5.setScale((float)1,(float)1,(float)1);
            this.rightMembrane6.setScale((float)1,(float)1,(float)1);
            this.rightMembrane7.setScale((float)1,(float)1,(float)1);
            this.rightMembrane8.setScale((float)1,(float)1,(float)1);
            this.rightMembrane9.setScale((float)1,(float)1,(float)1);
            this.leftMembrane6.setScale((float)1,(float)1,(float)1);
            this.leftMembrane7.setScale((float)1,(float)1,(float)1);
            this.leftMembrane8.setScale((float)1,(float)1,(float)1);
            this.leftMembrane9.setScale((float)1,(float)1,(float)1);



            //And now the pose:

            this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(body2, 0.0698F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.0567F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.0305F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.611F, 0.0179F, 0.0125F);
            this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.611F, -0.0179F, -0.0125F);
            this.setRotateAngle(hand2, 1.6735F, 0.2516F, 3.0814F);
            this.setRotateAngle(hand3, 1.6735F, -0.2516F, -3.0814F);
            this.setRotateAngle(head, 0.6021F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.7533F, 0.2447F, -1.6095F);
            this.setRotateAngle(leftLeg2, 0.0596F, -0.0876F, 0.1097F);
            this.setRotateAngle(leftLeg3, 0.8138F, 0.2782F, 0.079F);
            this.setRotateAngle(leftMembrane, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(leftMembrane2, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(leftMembrane3, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(leftMembrane4, 0.0F, 0.0F, -0.096F);
            this.setRotateAngle(leftMembrane6, 0.0F, 0.0F, -0.1309F);
            this.setRotateAngle(leftMembrane8, -0.9173F, -0.0218F, 0.0495F);
            this.setRotateAngle(leftWing, -0.0088F, 0.0042F, -1.6186F);
            this.setRotateAngle(leftWing2, -0.0785F, -0.001F, -0.013F);
            this.setRotateAngle(leftWing3, 0.0925F, 0.0276F, 0.0575F);
            this.setRotateAngle(leftWing4, -1.5275F, -0.0082F, 0.0781F);
            this.setRotateAngle(leftWing5, 0.192F, 0.0F, 0.0F);
            this.setRotateAngle(leftWing6, 0.0787F, -0.0426F, -0.0094F);
            this.setRotateAngle(leftWing7, 0.0886F, -0.0806F, -0.0335F);
            this.setRotateAngle(main, -0.2487F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.1396F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, 0.7533F, -0.2447F, 1.6095F);
            this.setRotateAngle(rightLeg2, 0.0596F, 0.0876F, -0.1097F);
            this.setRotateAngle(rightLeg3, 0.8138F, -0.2782F, -0.079F);
            this.setRotateAngle(rightMembrane, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(rightMembrane2, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(rightMembrane3, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(rightMembrane4, 0.0F, 0.0F, 0.096F);
            this.setRotateAngle(rightMembrane6, 0.0F, 0.0F, 0.1309F);
            this.setRotateAngle(rightMembrane8, -0.9173F, 0.0218F, -0.0495F);
            this.setRotateAngle(rightWing, -0.0088F, -0.0042F, 1.6186F);
            this.setRotateAngle(rightWing2, -0.0785F, 0.001F, 0.013F);
            this.setRotateAngle(rightWing3, 0.0925F, -0.0276F, -0.0575F);
            this.setRotateAngle(rightWing4, -1.5275F, 0.0082F, -0.0781F);
            this.setRotateAngle(rightWing5, 0.192F, 0.0F, 0.0F);
            this.setRotateAngle(rightWing6, 0.0787F, 0.0426F, 0.0094F);
            this.setRotateAngle(rightWing7, 0.0886F, 0.0806F, 0.0335F);
            this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);



            



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                //this.leftMembrane.setScale((float)1,(float)0,(float)0);
                this.leftMembrane2.setScale((float)1,(float)0,(float)0);
                this.leftMembrane3.setScale((float)1,(float)0,(float)0);
                this.leftMembrane4.setScale((float)1,(float)0,(float)0);
                this.leftMembrane5.setScale((float)1,(float)0,(float)0);
                //this.rightMembrane.setScale((float)1,(float)0,(float)0);
                this.rightMembrane2.setScale((float)1,(float)0,(float)0);
                this.rightMembrane3.setScale((float)1,(float)0,(float)0);
                this.rightMembrane4.setScale((float)1,(float)0,(float)0);
                this.rightMembrane5.setScale((float)1,(float)0,(float)0);
                this.rightMembrane6.setScale((float)1,(float)0,(float)0);
                this.rightMembrane7.setScale((float)1,(float)0,(float)0);
                this.rightMembrane8.setScale((float)1,(float)0,(float)0);
                this.rightMembrane9.setScale((float)1,(float)0,(float)0);
                this.leftMembrane6.setScale((float)1,(float)0,(float)0);
                this.leftMembrane7.setScale((float)1,(float)0,(float)0);
                this.leftMembrane8.setScale((float)1,(float)0,(float)0);
                this.leftMembrane9.setScale((float)1,(float)0,(float)0);

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

        if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIstiodactylus entity = (EntityPrehistoricFloraIstiodactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 10) / 10) * (0-(15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.05905-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (19.22585-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.70419-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.05905 + (((tickAnim - 10) / 10) * (0-(-13.05905)));
            yy = 19.22585 + (((tickAnim - 10) / 10) * (0-(19.22585)));
            zz = 4.70419 + (((tickAnim - 10) / 10) * (0-(4.70419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.05905-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-19.22585-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.70419-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.05905 + (((tickAnim - 10) / 10) * (0-(-13.05905)));
            yy = -19.22585 + (((tickAnim - 10) / 10) * (0-(-19.22585)));
            zz = -4.70419 + (((tickAnim - 10) / 10) * (0-(-4.70419)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.25 + (((tickAnim - 10) / 10) * (0-(24.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.25 + (((tickAnim - 10) / 10) * (0-(23.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 15.38 + (((tickAnim - 5) / 5) * (-7.75-(15.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.75 + (((tickAnim - 10) / 10) * (0-(-7.75)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17 + (((tickAnim - 5) / 5) * (0-(17)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraIstiodactylus entity = (EntityPrehistoricFloraIstiodactylus) entitylivingbaseIn;
        int animCycle = 37;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.5 + (((tickAnim - 13) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 33) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7 + (((tickAnim - 13) / 5) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (-7-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -7 + (((tickAnim - 33) / 5) * (0-(-7)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -17.75 + (((tickAnim - 6) / 7) * (-9.5-(-17.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.5 + (((tickAnim - 13) / 5) * (-15-(-9.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -15 + (((tickAnim - 18) / 8) * (-17.75-(-15)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -17.75 + (((tickAnim - 26) / 7) * (-9.5-(-17.75)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -9.5 + (((tickAnim - 33) / 5) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 6) / 7) * (35.25-(30)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35.25 + (((tickAnim - 13) / 5) * (0-(35.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (30-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 26) / 7) * (35.25-(30)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 35.25 + (((tickAnim - 33) / 5) * (0-(35.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIstiodactylus entity = (EntityPrehistoricFloraIstiodactylus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-3), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-50))*-0.3);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-100))*-0.6);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30.11582 + (((tickAnim - 0) / 6) * (-31.69209-(30.11582)));
            yy = 1.88341 + (((tickAnim - 0) / 6) * (0.9417-(1.88341)));
            zz = -2.00725 + (((tickAnim - 0) / 6) * (-1.00363-(-2.00725)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -31.69209 + (((tickAnim - 6) / 7) * (-22-(-31.69209)));
            yy = 0.9417 + (((tickAnim - 6) / 7) * (0-(0.9417)));
            zz = -1.00363 + (((tickAnim - 6) / 7) * (0-(-1.00363)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -22 + (((tickAnim - 13) / 15) * (30.11582-(-22)));
            yy = 0 + (((tickAnim - 13) / 15) * (1.88341-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (-2.00725-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.5 + (((tickAnim - 0) / 6) * (34.75-(10.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 34.75 + (((tickAnim - 6) / 7) * (-12-(34.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -12 + (((tickAnim - 13) / 15) * (10.5-(-12)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(-0.3);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 41.5 + (((tickAnim - 0) / 6) * (74.08373-(41.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (-1.65259-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (2.08062-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 74.08373 + (((tickAnim - 6) / 4) * (0-(74.08373)));
            yy = -1.65259 + (((tickAnim - 6) / 4) * (0-(-1.65259)));
            zz = 2.08062 + (((tickAnim - 6) / 4) * (0-(2.08062)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (30.16747-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-3.30518-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (4.16123-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 30.16747 + (((tickAnim - 13) / 5) * (0-(30.16747)));
            yy = -3.30518 + (((tickAnim - 13) / 5) * (0-(-3.30518)));
            zz = 4.16123 + (((tickAnim - 13) / 5) * (0-(4.16123)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (41.5-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.06-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 6) / 4) * (0-(1.06)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 13) / 5) * (0.175-(-0.475)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 10) * (0-(0.175)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -22 + (((tickAnim - 0) / 15) * (30.11582-(-22)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.88341-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.00725-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 30.11582 + (((tickAnim - 15) / 6) * (-31.69209-(30.11582)));
            yy = 1.88341 + (((tickAnim - 15) / 6) * (0.9417-(1.88341)));
            zz = -2.00725 + (((tickAnim - 15) / 6) * (-1.00363-(-2.00725)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -31.69209 + (((tickAnim - 21) / 7) * (-22-(-31.69209)));
            yy = 0.9417 + (((tickAnim - 21) / 7) * (0-(0.9417)));
            zz = -1.00363 + (((tickAnim - 21) / 7) * (0-(-1.00363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -12 + (((tickAnim - 0) / 15) * (10.5-(-12)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 10.5 + (((tickAnim - 15) / 6) * (34.75-(10.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 34.75 + (((tickAnim - 21) / 7) * (-12-(34.75)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 15) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 13) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30.16747 + (((tickAnim - 0) / 6) * (0-(30.16747)));
            yy = 3.30518 + (((tickAnim - 0) / 6) * (0-(3.30518)));
            zz = -4.16123 + (((tickAnim - 0) / 6) * (0-(-4.16123)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (41.5-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 41.5 + (((tickAnim - 15) / 6) * (74.08373-(41.5)));
            yy = 0 + (((tickAnim - 15) / 6) * (-1.65259-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (2.08062-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 74.08373 + (((tickAnim - 21) / 4) * (0-(74.08373)));
            yy = -1.65259 + (((tickAnim - 21) / 4) * (0-(-1.65259)));
            zz = 2.08062 + (((tickAnim - 21) / 4) * (0-(2.08062)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (30.16747-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (3.30518-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (-4.16123-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.475 + (((tickAnim - 0) / 6) * (0.175-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 9) * (0-(0.175)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (1.06-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.06 + (((tickAnim - 21) / 4) * (0-(1.06)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*-7), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-150))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-120))*2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-250))*-3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*2), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-120))*-4));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 23.31479 + (((tickAnim - 0) / 14) * (-18.00196-(23.31479)));
            yy = -7.06621 + (((tickAnim - 0) / 14) * (2.95965-(-7.06621)));
            zz = 3.76638 + (((tickAnim - 0) / 14) * (-0.49042-(3.76638)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -18.00196 + (((tickAnim - 14) / 14) * (23.31479-(-18.00196)));
            yy = 2.95965 + (((tickAnim - 14) / 14) * (-7.06621-(2.95965)));
            zz = -0.49042 + (((tickAnim - 14) / 14) * (3.76638-(-0.49042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.15711 + (((tickAnim - 0) / 6) * (-33.5268-(18.15711)));
            yy = -6.99556 + (((tickAnim - 0) / 6) * (-7.02467-(-6.99556)));
            zz = 20.27624 + (((tickAnim - 0) / 6) * (10.63508-(20.27624)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -33.5268 + (((tickAnim - 6) / 4) * (-40.2355-(-33.5268)));
            yy = -7.02467 + (((tickAnim - 6) / 4) * (7.04287-(-7.02467)));
            zz = 10.63508 + (((tickAnim - 6) / 4) * (-4.60936-(10.63508)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -40.2355 + (((tickAnim - 10) / 4) * (-16-(-40.2355)));
            yy = 7.04287 + (((tickAnim - 10) / 4) * (0-(7.04287)));
            zz = -4.60936 + (((tickAnim - 10) / 4) * (0-(-4.60936)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 14) / 14) * (18.15711-(-16)));
            yy = 0 + (((tickAnim - 14) / 14) * (-6.99556-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (20.27624-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0.525 + (((tickAnim - 6) / 8) * (0-(0.525)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);



        this.rightMembrane2.rotationPointX = this.rightMembrane2.rotationPointX + (float)(0);
        this.rightMembrane2.rotationPointY = this.rightMembrane2.rotationPointY - (float)(0);
        this.rightMembrane2.rotationPointZ = this.rightMembrane2.rotationPointZ + (float)(-0.75);
        this.rightMembrane2.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18.25 + (((tickAnim - 0) / 7) * (46.62-(18.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 46.62 + (((tickAnim - 7) / 7) * (0-(46.62)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (18.25-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMembrane3.rotationPointX = this.rightMembrane3.rotationPointX + (float)(0);
        this.rightMembrane3.rotationPointY = this.rightMembrane3.rotationPointY - (float)(0);
        this.rightMembrane3.rotationPointZ = this.rightMembrane3.rotationPointZ + (float)(-0.5);
        this.rightMembrane3.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -35.55826 + (((tickAnim - 0) / 7) * (18.97264-(-35.55826)));
            yy = -32.97293 + (((tickAnim - 0) / 7) * (-44.13883-(-32.97293)));
            zz = -19.69646 + (((tickAnim - 0) / 7) * (-78.97712-(-19.69646)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 18.97264 + (((tickAnim - 7) / 7) * (-16.58567-(18.97264)));
            yy = -44.13883 + (((tickAnim - 7) / 7) * (-9.74956-(-44.13883)));
            zz = -78.97712 + (((tickAnim - 7) / 7) * (-9.48976-(-78.97712)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -16.58567 + (((tickAnim - 14) / 6) * (-41.89546-(-16.58567)));
            yy = -9.74956 + (((tickAnim - 14) / 6) * (15.83146-(-9.74956)));
            zz = -9.48976 + (((tickAnim - 14) / 6) * (-6.81162-(-9.48976)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -41.89546 + (((tickAnim - 20) / 8) * (-35.55826-(-41.89546)));
            yy = 15.83146 + (((tickAnim - 20) / 8) * (-32.97293-(15.83146)));
            zz = -6.81162 + (((tickAnim - 20) / 8) * (-19.69646-(-6.81162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 7) * (0-(0.625)));
            zz = 0.55 + (((tickAnim - 0) / 7) * (0-(0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (-1.475-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.9-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -1.475 + (((tickAnim - 14) / 4) * (-0.375-(-1.475)));
            zz = 0.9 + (((tickAnim - 14) / 4) * (1.1-(0.9)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 18) / 2) * (-0.505-(-0.375)));
            zz = 1.1 + (((tickAnim - 18) / 2) * (1.265-(1.1)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -0.505 + (((tickAnim - 20) / 8) * (0.625-(-0.505)));
            zz = 1.265 + (((tickAnim - 20) / 8) * (0.55-(1.265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 17.75 + (((tickAnim - 0) / 7) * (21.25-(17.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 21.25 + (((tickAnim - 7) / 7) * (-49.75-(21.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -49.75 + (((tickAnim - 14) / 14) * (17.75-(-49.75)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 14) * (0-(-0.375)));
            zz = 1.125 + (((tickAnim - 0) / 14) * (0-(1.125)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 14) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (1.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing4.rotationPointX = this.rightWing4.rotationPointX + (float)(xx);
        this.rightWing4.rotationPointY = this.rightWing4.rotationPointY - (float)(yy);
        this.rightWing4.rotationPointZ = this.rightWing4.rotationPointZ + (float)(zz);



        this.rightMembrane4.rotationPointX = this.rightMembrane4.rotationPointX + (float)(0);
        this.rightMembrane4.rotationPointY = this.rightMembrane4.rotationPointY - (float)(-0.25);
        this.rightMembrane4.rotationPointZ = this.rightMembrane4.rotationPointZ + (float)(0);
        this.rightMembrane4.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (92.75-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 92.75 + (((tickAnim - 14) / 14) * (0-(92.75)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (1.725-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            yy = 1.725 + (((tickAnim - 14) / 14) * (0-(1.725)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing5.rotationPointX = this.rightWing5.rotationPointX + (float)(xx);
        this.rightWing5.rotationPointY = this.rightWing5.rotationPointY - (float)(yy);
        this.rightWing5.rotationPointZ = this.rightWing5.rotationPointZ + (float)(zz);



        this.rightMembrane5.rotationPointX = this.rightMembrane5.rotationPointX + (float)(0);
        this.rightMembrane5.rotationPointY = this.rightMembrane5.rotationPointY - (float)(-2.25);
        this.rightMembrane5.rotationPointZ = this.rightMembrane5.rotationPointZ + (float)(0);
        this.rightMembrane5.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -32.25 + (((tickAnim - 0) / 13) * (-33.25-(-32.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -33.25 + (((tickAnim - 13) / 15) * (-32.25-(-33.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing6, rightWing6.rotateAngleX + (float) Math.toRadians(xx), rightWing6.rotateAngleY + (float) Math.toRadians(yy), rightWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMembrane7.rotationPointX = this.rightMembrane7.rotationPointX + (float)(0);
        this.rightMembrane7.rotationPointY = this.rightMembrane7.rotationPointY - (float)(-0.5);
        this.rightMembrane7.rotationPointZ = this.rightMembrane7.rotationPointZ + (float)(0);
        this.rightMembrane7.setScale((float)1,(float)0,(float)1);


        this.rightMembrane9.rotationPointX = this.rightMembrane9.rotationPointX + (float)(0);
        this.rightMembrane9.rotationPointY = this.rightMembrane9.rotationPointY - (float)(-0.5);
        this.rightMembrane9.rotationPointZ = this.rightMembrane9.rotationPointZ + (float)(0);
        this.rightMembrane9.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -18.00196 + (((tickAnim - 0) / 13) * (23.31479-(-18.00196)));
            yy = -2.95965 + (((tickAnim - 0) / 13) * (7.06621-(-2.95965)));
            zz = 0.49042 + (((tickAnim - 0) / 13) * (-3.76638-(0.49042)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 23.31479 + (((tickAnim - 13) / 15) * (-18.00196-(23.31479)));
            yy = 7.06621 + (((tickAnim - 13) / 15) * (-2.95965-(7.06621)));
            zz = -3.76638 + (((tickAnim - 13) / 15) * (0.49042-(-3.76638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -16 + (((tickAnim - 0) / 13) * (18.15711-(-16)));
            yy = 0 + (((tickAnim - 0) / 13) * (6.99556-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-20.27624-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.15711 + (((tickAnim - 13) / 7) * (-33.5268-(18.15711)));
            yy = 6.99556 + (((tickAnim - 13) / 7) * (7.02467-(6.99556)));
            zz = -20.27624 + (((tickAnim - 13) / 7) * (-10.63508-(-20.27624)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -33.5268 + (((tickAnim - 20) / 4) * (-40.2355-(-33.5268)));
            yy = 7.02467 + (((tickAnim - 20) / 4) * (7.04287-(7.02467)));
            zz = -10.63508 + (((tickAnim - 20) / 4) * (-4.60936-(-10.63508)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -40.2355 + (((tickAnim - 24) / 4) * (-16-(-40.2355)));
            yy = 7.04287 + (((tickAnim - 24) / 4) * (0-(7.04287)));
            zz = -4.60936 + (((tickAnim - 24) / 4) * (0-(-4.60936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0.525-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0.525 + (((tickAnim - 20) / 8) * (0-(0.525)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);



        this.leftMembrane2.rotationPointX = this.leftMembrane2.rotationPointX + (float)(0);
        this.leftMembrane2.rotationPointY = this.leftMembrane2.rotationPointY - (float)(0);
        this.leftMembrane2.rotationPointZ = this.leftMembrane2.rotationPointZ + (float)(-1);
        this.leftMembrane2.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.25 + (((tickAnim - 13) / 7) * (46.62-(18.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 46.62 + (((tickAnim - 20) / 8) * (0-(46.62)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMembrane3.rotationPointX = this.leftMembrane3.rotationPointX + (float)(0);
        this.leftMembrane3.rotationPointY = this.leftMembrane3.rotationPointY - (float)(-0.1);
        this.leftMembrane3.rotationPointZ = this.leftMembrane3.rotationPointZ + (float)(-0.825);
        this.leftMembrane3.setScale((float)1,(float)1,(float)0.1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -16.58567 + (((tickAnim - 0) / 6) * (-43.34037-(-16.58567)));
            yy = 9.74956 + (((tickAnim - 0) / 6) * (-19.35348-(9.74956)));
            zz = 9.48976 + (((tickAnim - 0) / 6) * (4.89048-(9.48976)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -43.34037 + (((tickAnim - 6) / 7) * (-35.55826-(-43.34037)));
            yy = -19.35348 + (((tickAnim - 6) / 7) * (32.97293-(-19.35348)));
            zz = 4.89048 + (((tickAnim - 6) / 7) * (19.69646-(4.89048)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -35.55826 + (((tickAnim - 13) / 7) * (18.97264-(-35.55826)));
            yy = 32.97293 + (((tickAnim - 13) / 7) * (44.13883-(32.97293)));
            zz = 19.69646 + (((tickAnim - 13) / 7) * (78.97712-(19.69646)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 18.97264 + (((tickAnim - 20) / 8) * (-16.58567-(18.97264)));
            yy = 44.13883 + (((tickAnim - 20) / 8) * (9.74956-(44.13883)));
            zz = 78.97712 + (((tickAnim - 20) / 8) * (9.48976-(78.97712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand3, hand3.rotateAngleX + (float) Math.toRadians(xx), hand3.rotateAngleY + (float) Math.toRadians(yy), hand3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.675 + (((tickAnim - 0) / 3) * (-0.485-(-1.675)));
            zz = 0.9 + (((tickAnim - 0) / 3) * (1.19-(0.9)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.485 + (((tickAnim - 3) / 3) * (-0.595-(-0.485)));
            zz = 1.19 + (((tickAnim - 3) / 3) * (1.575-(1.19)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.595 + (((tickAnim - 6) / 7) * (-0.625-(-0.595)));
            zz = 1.575 + (((tickAnim - 6) / 7) * (0.55-(1.575)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.625 + (((tickAnim - 13) / 7) * (0-(-0.625)));
            zz = 0.55 + (((tickAnim - 13) / 7) * (0-(0.55)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-1.675-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand3.rotationPointX = this.hand3.rotationPointX + (float)(xx);
        this.hand3.rotationPointY = this.hand3.rotationPointY - (float)(yy);
        this.hand3.rotationPointZ = this.hand3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -49.75 + (((tickAnim - 0) / 13) * (17.75-(-49.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.75 + (((tickAnim - 13) / 7) * (21.25-(17.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 21.25 + (((tickAnim - 20) / 8) * (-49.75-(21.25)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 15) * (0-(-0.375)));
            zz = 1.125 + (((tickAnim - 13) / 15) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing4.rotationPointX = this.leftWing4.rotationPointX + (float)(xx);
        this.leftWing4.rotationPointY = this.leftWing4.rotationPointY - (float)(yy);
        this.leftWing4.rotationPointZ = this.leftWing4.rotationPointZ + (float)(zz);



        this.leftMembrane4.rotationPointX = this.leftMembrane4.rotationPointX + (float)(0);
        this.leftMembrane4.rotationPointY = this.leftMembrane4.rotationPointY - (float)(-0.25);
        this.leftMembrane4.rotationPointZ = this.leftMembrane4.rotationPointZ + (float)(0);
        this.leftMembrane4.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 92.75 + (((tickAnim - 0) / 13) * (0-(92.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (92.75-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 1.725 + (((tickAnim - 0) / 13) * (0-(1.725)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (1.725-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing5.rotationPointX = this.leftWing5.rotationPointX + (float)(xx);
        this.leftWing5.rotationPointY = this.leftWing5.rotationPointY - (float)(yy);
        this.leftWing5.rotationPointZ = this.leftWing5.rotationPointZ + (float)(zz);



        this.leftMembrane5.rotationPointX = this.leftMembrane5.rotationPointX + (float)(0);
        this.leftMembrane5.rotationPointY = this.leftMembrane5.rotationPointY - (float)(-2.5);
        this.leftMembrane5.rotationPointZ = this.leftMembrane5.rotationPointZ + (float)(0);
        this.leftMembrane5.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -23 + (((tickAnim - 0) / 13) * (-33.25-(-23)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -33.25 + (((tickAnim - 13) / 15) * (-23-(-33.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing6, leftWing6.rotateAngleX + (float) Math.toRadians(xx), leftWing6.rotateAngleY + (float) Math.toRadians(yy), leftWing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMembrane7.rotationPointX = this.leftMembrane7.rotationPointX + (float)(0);
        this.leftMembrane7.rotationPointY = this.leftMembrane7.rotationPointY - (float)(-0.25);
        this.leftMembrane7.rotationPointZ = this.leftMembrane7.rotationPointZ + (float)(0);
        this.leftMembrane7.setScale((float)1,(float)-0.1,(float)1);


        this.leftMembrane9.rotationPointX = this.leftMembrane9.rotationPointX + (float)(0);
        this.leftMembrane9.rotationPointY = this.leftMembrane9.rotationPointY - (float)(-0.175);
        this.leftMembrane9.rotationPointZ = this.leftMembrane9.rotationPointZ + (float)(0);
        this.leftMembrane9.setScale((float)1,(float)-0.1,(float)1);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-350))*-3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-120))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-400))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-550))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraIstiodactylus entity = (EntityPrehistoricFloraIstiodactylus) entitylivingbaseIn;
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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4-(0)));
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
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 96) {
            xx = 0 + (((tickAnim - 50) / 46) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 50) / 46) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 50) / 46) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 96) / 64) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 96) / 64) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMembrane, rightMembrane.rotateAngleX + (float) Math.toRadians(xx), rightMembrane.rotateAngleY + (float) Math.toRadians(yy), rightMembrane.rotateAngleZ + (float) Math.toRadians(zz));




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


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraIstiodactylus e = (EntityPrehistoricFloraIstiodactylus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body2, ((0.0698F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.0567F)-(0.0567F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.0305F)-(-0.0305F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.611F)-(0.611F)), ((0.0179F)-(0.0179F)),((0.0125F)-(0.0125F)));
        animator.rotate(cube_r7, ((-0.5236F)-(-0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.611F)-(0.611F)), ((-0.0179F)-(-0.0179F)),((-0.0125F)-(-0.0125F)));
        animator.rotate(hand2, ((1.6735F)-(-1.9418F)), ((0.2516F)-(-0.2134F)),((3.0814F)-(1.4632F)));
        animator.rotate(hand3, ((1.6735F)-(-1.9418F)), ((-0.2516F)-(0.2134F)),((-3.0814F)-(-1.4632F)));
        animator.rotate(head, ((0.6021F)-(1.0254F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg, ((0.7533F)-(0.2297F)), ((0.2447F)-(-0.0742F)),((-1.6095F)-(-0.3767F)));
        animator.rotate(leftLeg2, ((0.0596F)-(0.7228F)), ((-0.0876F)-(-0.0876F)),((0.1097F)-(0.1097F)));
        animator.rotate(leftLeg3, ((0.8138F)-(-0.421F)), ((0.2782F)-(0.2782F)),((0.079F)-(0.079F)));
        animator.rotate(leftMembrane, ((0.0F)-(0.0F)), ((-0.0436F)-(-0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane2, ((0.0F)-(0.0F)), ((-0.0436F)-(-0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane3, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(leftMembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.096F)-(-0.096F)));
        animator.rotate(leftMembrane6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1309F)-(-0.1309F)));
        animator.rotate(leftMembrane8, ((-0.9173F)-(-0.9173F)), ((-0.0218F)-(-0.0218F)),((0.0495F)-(0.0495F)));
        animator.rotate(leftWing, ((-0.0088F)-(0.0845F)), ((0.0042F)-(0.0218F)),((-1.6186F)-(-1.8229F)));
        animator.rotate(leftWing2, ((-0.0785F)-(-0.0099F)), ((-0.001F)-(0.0779F)),((-0.013F)-(1.4439F)));
        animator.rotate(leftWing3, ((0.0925F)-(0.2414F)), ((0.0276F)-(-0.0226F)),((0.0575F)-(0.2608F)));
        animator.rotate(leftWing4, ((-1.5275F)-(-0.0309F)), ((-0.0082F)-(-0.0082F)),((0.0781F)-(0.0781F)));
        animator.rotate(leftWing5, ((0.192F)-(0.672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftWing6, ((0.0787F)-(0.6765F)), ((-0.0426F)-(-0.0426F)),((-0.0094F)-(-0.0094F)));
        animator.rotate(leftWing7, ((0.0886F)-(0.0886F)), ((-0.0806F)-(-0.0806F)),((-0.0335F)-(-0.0335F)));
        animator.rotate(main, ((-0.2487F)-(-0.4581F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.1396F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg, ((0.7533F)-(0.2297F)), ((-0.2447F)-(0.0742F)),((1.6095F)-(0.3767F)));
        animator.rotate(rightLeg2, ((0.0596F)-(0.7228F)), ((0.0876F)-(0.0876F)),((-0.1097F)-(-0.1097F)));
        animator.rotate(rightLeg3, ((0.8138F)-(-0.421F)), ((-0.2782F)-(-0.2782F)),((-0.079F)-(-0.079F)));
        animator.rotate(rightMembrane, ((0.0F)-(0.0F)), ((0.0436F)-(0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane2, ((0.0F)-(0.0F)), ((0.0436F)-(0.0436F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane3, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(rightMembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.096F)-(0.096F)));
        animator.rotate(rightMembrane6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1309F)-(0.1309F)));
        animator.rotate(rightMembrane8, ((-0.9173F)-(-0.9173F)), ((0.0218F)-(0.0218F)),((-0.0495F)-(-0.0495F)));
        animator.rotate(rightWing, ((-0.0088F)-(0.0845F)), ((-0.0042F)-(-0.0218F)),((1.6186F)-(1.8229F)));
        animator.rotate(rightWing2, ((-0.0785F)-(-0.0099F)), ((0.001F)-(-0.0779F)),((0.013F)-(-1.4439F)));
        animator.rotate(rightWing3, ((0.0925F)-(0.2414F)), ((-0.0276F)-(0.0226F)),((-0.0575F)-(-0.2608F)));
        animator.rotate(rightWing4, ((-1.5275F)-(-0.0309F)), ((0.0082F)-(0.0082F)),((-0.0781F)-(-0.0781F)));
        animator.rotate(rightWing5, ((0.192F)-(0.672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightWing6, ((0.0787F)-(0.6765F)), ((0.0426F)-(0.0426F)),((0.0094F)-(0.0094F)));
        animator.rotate(rightWing7, ((0.0886F)-(0.0886F)), ((0.0806F)-(0.0806F)),((0.0335F)-(0.0335F)));
        animator.rotate(tail, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body2, -((0.0698F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.0567F)-(0.0567F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.0305F)-(-0.0305F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.611F)-(0.611F)), -((0.0179F)-(0.0179F)),-((0.0125F)-(0.0125F)));
        animator.rotate(cube_r7, -((-0.5236F)-(-0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.611F)-(0.611F)), -((-0.0179F)-(-0.0179F)),-((-0.0125F)-(-0.0125F)));
        animator.rotate(hand2, -((1.6735F)-(-1.9418F)), -((0.2516F)-(-0.2134F)),-((3.0814F)-(1.4632F)));
        animator.rotate(hand3, -((1.6735F)-(-1.9418F)), -((-0.2516F)-(0.2134F)),-((-3.0814F)-(-1.4632F)));
        animator.rotate(head, -((0.6021F)-(1.0254F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg, -((0.7533F)-(0.2297F)), -((0.2447F)-(-0.0742F)),-((-1.6095F)-(-0.3767F)));
        animator.rotate(leftLeg2, -((0.0596F)-(0.7228F)), -((-0.0876F)-(-0.0876F)),-((0.1097F)-(0.1097F)));
        animator.rotate(leftLeg3, -((0.8138F)-(-0.421F)), -((0.2782F)-(0.2782F)),-((0.079F)-(0.079F)));
        animator.rotate(leftMembrane, -((0.0F)-(0.0F)), -((-0.0436F)-(-0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane2, -((0.0F)-(0.0F)), -((-0.0436F)-(-0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane3, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.096F)-(-0.096F)));
        animator.rotate(leftMembrane6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1309F)-(-0.1309F)));
        animator.rotate(leftMembrane8, -((-0.9173F)-(-0.9173F)), -((-0.0218F)-(-0.0218F)),-((0.0495F)-(0.0495F)));
        animator.rotate(leftWing, -((-0.0088F)-(0.0845F)), -((0.0042F)-(0.0218F)),-((-1.6186F)-(-1.8229F)));
        animator.rotate(leftWing2, -((-0.0785F)-(-0.0099F)), -((-0.001F)-(0.0779F)),-((-0.013F)-(1.4439F)));
        animator.rotate(leftWing3, -((0.0925F)-(0.2414F)), -((0.0276F)-(-0.0226F)),-((0.0575F)-(0.2608F)));
        animator.rotate(leftWing4, -((-1.5275F)-(-0.0309F)), -((-0.0082F)-(-0.0082F)),-((0.0781F)-(0.0781F)));
        animator.rotate(leftWing5, -((0.192F)-(0.672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftWing6, -((0.0787F)-(0.6765F)), -((-0.0426F)-(-0.0426F)),-((-0.0094F)-(-0.0094F)));
        animator.rotate(leftWing7, -((0.0886F)-(0.0886F)), -((-0.0806F)-(-0.0806F)),-((-0.0335F)-(-0.0335F)));
        animator.rotate(main, -((-0.2487F)-(-0.4581F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.1396F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg, -((0.7533F)-(0.2297F)), -((-0.2447F)-(0.0742F)),-((1.6095F)-(0.3767F)));
        animator.rotate(rightLeg2, -((0.0596F)-(0.7228F)), -((0.0876F)-(0.0876F)),-((-0.1097F)-(-0.1097F)));
        animator.rotate(rightLeg3, -((0.8138F)-(-0.421F)), -((-0.2782F)-(-0.2782F)),-((-0.079F)-(-0.079F)));
        animator.rotate(rightMembrane, -((0.0F)-(0.0F)), -((0.0436F)-(0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane2, -((0.0F)-(0.0F)), -((0.0436F)-(0.0436F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane3, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.096F)-(0.096F)));
        animator.rotate(rightMembrane6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1309F)-(0.1309F)));
        animator.rotate(rightMembrane8, -((-0.9173F)-(-0.9173F)), -((0.0218F)-(0.0218F)),-((-0.0495F)-(-0.0495F)));
        animator.rotate(rightWing, -((-0.0088F)-(0.0845F)), -((-0.0042F)-(-0.0218F)),-((1.6186F)-(1.8229F)));
        animator.rotate(rightWing2, -((-0.0785F)-(-0.0099F)), -((0.001F)-(-0.0779F)),-((0.013F)-(-1.4439F)));
        animator.rotate(rightWing3, -((0.0925F)-(0.2414F)), -((-0.0276F)-(0.0226F)),-((-0.0575F)-(-0.2608F)));
        animator.rotate(rightWing4, -((-1.5275F)-(-0.0309F)), -((0.0082F)-(0.0082F)),-((-0.0781F)-(-0.0781F)));
        animator.rotate(rightWing5, -((0.192F)-(0.672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightWing6, -((0.0787F)-(0.6765F)), -((0.0426F)-(0.0426F)),-((0.0094F)-(0.0094F)));
        animator.rotate(rightWing7, -((0.0886F)-(0.0886F)), -((0.0806F)-(0.0806F)),-((0.0335F)-(0.0335F)));
        animator.rotate(tail, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));



        
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
