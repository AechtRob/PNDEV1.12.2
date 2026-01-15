package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTupandactylus_navigans;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelTupandactylus_navigans extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer leftMem12;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftMem3;
    private final AdvancedModelRenderer leftMem8;
    private final AdvancedModelRenderer hand;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftMem4;
    private final AdvancedModelRenderer leftMem9;
    private final AdvancedModelRenderer leftWing5;
    private final AdvancedModelRenderer leftMem5;
    private final AdvancedModelRenderer leftMem10;
    private final AdvancedModelRenderer leftWing6;
    private final AdvancedModelRenderer leftMem6;
    private final AdvancedModelRenderer leftMem11;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightMem;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightMem2;
    private final AdvancedModelRenderer rightMem7;
    private final AdvancedModelRenderer rightMem12;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightMem3;
    private final AdvancedModelRenderer rightMem8;
    private final AdvancedModelRenderer hand2;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer rightMem4;
    private final AdvancedModelRenderer rightMem9;
    private final AdvancedModelRenderer rightWing5;
    private final AdvancedModelRenderer rightMem5;
    private final AdvancedModelRenderer rightMem10;
    private final AdvancedModelRenderer rightWing6;
    private final AdvancedModelRenderer rightMem6;
    private final AdvancedModelRenderer rightMem11;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;

    public ModelTupandactylus_navigans() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 14.4072F, 6.6209F);
        this.setRotateAngle(main, -0.7112F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 34, 24, -1.0F, -1.5F, -2.75F, 3, 3, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(2.25F, 0.2F, -1.425F);
        this.main.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.4254F, 0.1086F, -0.2985F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 44, 47, -1.0F, -1.0F, 0.0F, 2, 6, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.1261F, 4.6645F, -0.0348F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 1.0191F, -0.0205F, 0.316F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 54, 18, -0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 26, 53, 0.0F, 0.0F, 1.0F, 0, 8, 1, 0.0F, false));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 60, 53, -0.025F, 0.0F, 1.0F, 0, 8, 1, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0076F, 7.5952F, 0.2065F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7341F, -0.1621F, 0.0737F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 34, 52, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.25F, 0.2F, -1.425F);
        this.main.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.4254F, -0.1086F, 0.2985F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 44, 47, -1.0F, -1.0F, 0.0F, 2, 6, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.1261F, 4.6645F, -0.0348F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 1.0191F, 0.0205F, -0.316F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 54, 18, -0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 26, 53, 0.0F, 0.0F, 1.0F, 0, 8, 1, 0.0F, true));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 60, 53, 0.025F, 0.0F, 1.0F, 0, 8, 1, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.0076F, 7.5952F, 0.2065F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7341F, 0.1621F, -0.0737F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 34, 52, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -0.9F, 0.0F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 55, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5F, -1.5F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1658F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 21, -1.5F, -0.25F, -5.0F, 4, 4, 5, 0.0F, false));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(2.2734F, 1.3943F, -4.0F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, -0.0256F, 0.0996F, -0.8584F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 38, 0, -0.5F, -1.25F, -0.5F, 1, 5, 4, 0.0F, false));

        this.leftMem = new AdvancedModelRenderer(this);
        this.leftMem.setRotationPoint(0.5F, 1.75F, 3.5F);
        this.leftWing.addChild(leftMem);
        this.setRotateAngle(leftMem, 0.0F, -0.2182F, 0.0F);
        this.leftMem.cubeList.add(new ModelBox(leftMem, 50, 28, -1.0F, -2.0F, 0.0F, 1, 4, 3, -0.001F, false));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, 0.096F, 0.0F, 0.6152F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 0, 47, -0.5F, 0.0F, -0.5F, 1, 5, 3, 0.001F, false));

        this.leftMem2 = new AdvancedModelRenderer(this);
        this.leftMem2.setRotationPoint(0.5F, 0.0F, 2.5F);
        this.leftWing2.addChild(leftMem2);
        this.setRotateAngle(leftMem2, 0.0F, -0.1745F, 0.0F);
        this.leftMem2.cubeList.add(new ModelBox(leftMem2, 48, 0, -1.0F, 0.0F, 0.0F, 1, 5, 3, -0.001F, false));

        this.leftMem7 = new AdvancedModelRenderer(this);
        this.leftMem7.setRotationPoint(-0.6095F, -2.0998F, 2.7008F);
        this.leftMem2.addChild(leftMem7);
        this.setRotateAngle(leftMem7, -0.5247F, 0.0832F, -0.0263F);
        this.leftMem7.cubeList.add(new ModelBox(leftMem7, 28, 41, 0.0F, -1.0F, 1.0F, 0, 7, 4, 0.0F, false));
        this.leftMem7.cubeList.add(new ModelBox(leftMem7, 36, 41, 0.05F, -1.0F, 1.0F, 0, 7, 4, 0.0F, false));

        this.leftMem12 = new AdvancedModelRenderer(this);
        this.leftMem12.setRotationPoint(-3.0F, 0.5F, 5.25F);
        this.leftMem7.addChild(leftMem12);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftMem12.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 18, 3.05F, -6.5F, -3.25F, 0, 7, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 43, 3.1F, -6.5F, -3.25F, 0, 7, 3, 0.0F, false));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(0.5F, 5.0F, -0.5F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 0.3567F, -0.0567F, 0.2581F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 28, 52, -1.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.leftMem3 = new AdvancedModelRenderer(this);
        this.leftMem3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftWing3.addChild(leftMem3);
        this.setRotateAngle(leftMem3, 0.0F, -0.1309F, 0.0F);
        this.leftMem3.cubeList.add(new ModelBox(leftMem3, 42, 31, -1.0F, 0.0F, 0.0F, 1, 6, 3, -0.002F, false));

        this.leftMem8 = new AdvancedModelRenderer(this);
        this.leftMem8.setRotationPoint(-1.036F, 4.0F, 4.8895F);
        this.leftWing3.addChild(leftMem8);
        this.setRotateAngle(leftMem8, 0.0F, -0.1309F, 0.0F);
        this.leftMem8.cubeList.add(new ModelBox(leftMem8, 8, 55, 0.25F, -4.0F, 0.0F, 0, 6, 2, 0.0F, false));
        this.leftMem8.cubeList.add(new ModelBox(leftMem8, 12, 55, 0.2F, -4.0F, 0.0F, 0, 6, 2, 0.0F, false));

        this.hand = new AdvancedModelRenderer(this);
        this.hand.setRotationPoint(-0.825F, 5.7F, 0.5F);
        this.leftWing3.addChild(hand);
        this.setRotateAngle(hand, -1.3994F, 0.018F, -1.5168F);
        this.hand.cubeList.add(new ModelBox(hand, 54, 44, -0.991F, -0.5074F, -0.0853F, 1, 1, 2, 0.002F, false));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -0.2671F, 0.03F, 0.1292F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 58, 18, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));

        this.leftMem4 = new AdvancedModelRenderer(this);
        this.leftMem4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftWing4.addChild(leftMem4);
        this.setRotateAngle(leftMem4, 0.0F, 0.0F, -0.1745F);
        this.leftMem4.cubeList.add(new ModelBox(leftMem4, 16, 58, -1.0F, -3.0F, 0.0F, 1, 3, 2, -0.001F, false));

        this.leftMem9 = new AdvancedModelRenderer(this);
        this.leftMem9.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.leftMem4.addChild(leftMem9);
        this.leftMem9.cubeList.add(new ModelBox(leftMem9, 14, 30, -0.25F, -2.0F, -3.0F, 0, 2, 2, 0.0F, false));
        this.leftMem9.cubeList.add(new ModelBox(leftMem9, 22, 58, -0.2F, -2.0F, -3.0F, 0, 2, 2, 0.0F, false));

        this.leftWing5 = new AdvancedModelRenderer(this);
        this.leftWing5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 1.545F, 0.005F, -0.0104F);
        this.leftWing5.cubeList.add(new ModelBox(leftWing5, 28, 34, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.leftMem5 = new AdvancedModelRenderer(this);
        this.leftMem5.setRotationPoint(-0.5F, -0.925F, -0.5F);
        this.leftWing5.addChild(leftMem5);
        this.setRotateAngle(leftMem5, 0.0F, 0.0F, -0.0873F);
        this.leftMem5.cubeList.add(new ModelBox(leftMem5, 14, 34, -0.5F, -3.0F, 0.5F, 1, 3, 6, 0.001F, false));

        this.leftMem10 = new AdvancedModelRenderer(this);
        this.leftMem10.setRotationPoint(0.1514F, -2.9848F, 1.0F);
        this.leftMem5.addChild(leftMem10);
        this.leftMem10.cubeList.add(new ModelBox(leftMem10, 12, 43, 0.0F, -2.0F, -0.5F, 0, 2, 5, 0.0F, false));
        this.leftMem10.cubeList.add(new ModelBox(leftMem10, 44, 40, -0.075F, -2.0F, -0.5F, 0, 2, 5, 0.0F, false));

        this.leftWing6 = new AdvancedModelRenderer(this);
        this.leftWing6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.leftWing5.addChild(leftWing6);
        this.setRotateAngle(leftWing6, 0.1614F, 0.0F, 0.0F);
        this.leftWing6.cubeList.add(new ModelBox(leftWing6, 0, 11, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.001F, false));

        this.leftMem6 = new AdvancedModelRenderer(this);
        this.leftMem6.setRotationPoint(-0.5F, -0.95F, 0.0F);
        this.leftWing6.addChild(leftMem6);
        this.setRotateAngle(leftMem6, 0.0F, 0.0F, -0.0873F);
        this.leftMem6.cubeList.add(new ModelBox(leftMem6, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.leftMem11 = new AdvancedModelRenderer(this);
        this.leftMem11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftMem6.addChild(leftMem11);
        this.leftMem11.cubeList.add(new ModelBox(leftMem11, 20, 0, 0.05F, -2.0F, -2.0F, 0, 2, 9, 0.0F, false));
        this.leftMem11.cubeList.add(new ModelBox(leftMem11, 14, 21, 0.075F, -2.0F, -2.0F, 0, 2, 9, 0.0F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.2734F, 1.3943F, -4.0F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, -0.0256F, -0.0996F, 0.8584F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 38, 0, -0.5F, -1.25F, -0.5F, 1, 5, 4, 0.0F, true));

        this.rightMem = new AdvancedModelRenderer(this);
        this.rightMem.setRotationPoint(-0.5F, 1.75F, 3.5F);
        this.rightWing.addChild(rightMem);
        this.setRotateAngle(rightMem, 0.0F, 0.2182F, 0.0F);
        this.rightMem.cubeList.add(new ModelBox(rightMem, 50, 28, 0.0F, -2.0F, 0.0F, 1, 4, 3, -0.001F, true));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0F, 3.25F, 0.0F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, 0.096F, 0.0F, -0.6152F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 0, 47, -0.5F, 0.0F, -0.5F, 1, 5, 3, 0.001F, true));

        this.rightMem2 = new AdvancedModelRenderer(this);
        this.rightMem2.setRotationPoint(-0.5F, 0.0F, 2.5F);
        this.rightWing2.addChild(rightMem2);
        this.setRotateAngle(rightMem2, 0.0F, 0.1745F, 0.0F);
        this.rightMem2.cubeList.add(new ModelBox(rightMem2, 48, 0, 0.0F, 0.0F, 0.0F, 1, 5, 3, -0.001F, true));

        this.rightMem7 = new AdvancedModelRenderer(this);
        this.rightMem7.setRotationPoint(0.6095F, -2.0998F, 2.7008F);
        this.rightMem2.addChild(rightMem7);
        this.setRotateAngle(rightMem7, -0.5247F, -0.0832F, 0.0263F);
        this.rightMem7.cubeList.add(new ModelBox(rightMem7, 28, 41, 0.0F, -1.0F, 1.0F, 0, 7, 4, 0.0F, true));
        this.rightMem7.cubeList.add(new ModelBox(rightMem7, 36, 41, -0.05F, -1.0F, 1.0F, 0, 7, 4, 0.0F, true));

        this.rightMem12 = new AdvancedModelRenderer(this);
        this.rightMem12.setRotationPoint(3.0F, 0.5F, 5.25F);
        this.rightMem7.addChild(rightMem12);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightMem12.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 18, -3.05F, -6.5F, -3.25F, 0, 7, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 43, -3.1F, -6.5F, -3.25F, 0, 7, 3, 0.0F, true));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-0.5F, 5.0F, -0.5F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 0.3567F, 0.0567F, -0.2581F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 28, 52, 0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F, true));

        this.rightMem3 = new AdvancedModelRenderer(this);
        this.rightMem3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightWing3.addChild(rightMem3);
        this.setRotateAngle(rightMem3, 0.0F, 0.1309F, 0.0F);
        this.rightMem3.cubeList.add(new ModelBox(rightMem3, 42, 31, 0.0F, 0.0F, 0.0F, 1, 6, 3, -0.002F, true));

        this.rightMem8 = new AdvancedModelRenderer(this);
        this.rightMem8.setRotationPoint(1.036F, 4.0F, 4.8895F);
        this.rightWing3.addChild(rightMem8);
        this.setRotateAngle(rightMem8, 0.0F, 0.1309F, 0.0F);
        this.rightMem8.cubeList.add(new ModelBox(rightMem8, 8, 55, -0.25F, -4.0F, 0.0F, 0, 6, 2, 0.0F, true));
        this.rightMem8.cubeList.add(new ModelBox(rightMem8, 12, 55, -0.2F, -4.0F, 0.0F, 0, 6, 2, 0.0F, true));

        this.hand2 = new AdvancedModelRenderer(this);
        this.hand2.setRotationPoint(0.825F, 5.7F, 0.5F);
        this.rightWing3.addChild(hand2);
        this.setRotateAngle(hand2, -1.3994F, -0.018F, 1.5168F);
        this.hand2.cubeList.add(new ModelBox(hand2, 54, 44, -0.009F, -0.5074F, -0.0853F, 1, 1, 2, 0.002F, true));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -0.2671F, -0.03F, -0.1292F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 58, 18, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, true));

        this.rightMem4 = new AdvancedModelRenderer(this);
        this.rightMem4.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightWing4.addChild(rightMem4);
        this.setRotateAngle(rightMem4, 0.0F, 0.0F, 0.1745F);
        this.rightMem4.cubeList.add(new ModelBox(rightMem4, 16, 58, 0.0F, -3.0F, 0.0F, 1, 3, 2, -0.001F, true));

        this.rightMem9 = new AdvancedModelRenderer(this);
        this.rightMem9.setRotationPoint(0.0F, -3.0F, 3.0F);
        this.rightMem4.addChild(rightMem9);
        this.rightMem9.cubeList.add(new ModelBox(rightMem9, 14, 30, 0.25F, -2.0F, -3.0F, 0, 2, 2, 0.0F, true));
        this.rightMem9.cubeList.add(new ModelBox(rightMem9, 22, 58, 0.2F, -2.0F, -3.0F, 0, 2, 2, 0.0F, true));

        this.rightWing5 = new AdvancedModelRenderer(this);
        this.rightWing5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 1.545F, -0.005F, 0.0104F);
        this.rightWing5.cubeList.add(new ModelBox(rightWing5, 28, 34, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, true));

        this.rightMem5 = new AdvancedModelRenderer(this);
        this.rightMem5.setRotationPoint(0.5F, -0.925F, -0.5F);
        this.rightWing5.addChild(rightMem5);
        this.setRotateAngle(rightMem5, 0.0F, 0.0F, 0.0873F);
        this.rightMem5.cubeList.add(new ModelBox(rightMem5, 14, 34, -0.5F, -3.0F, 0.5F, 1, 3, 6, 0.001F, true));

        this.rightMem10 = new AdvancedModelRenderer(this);
        this.rightMem10.setRotationPoint(-0.1514F, -2.9848F, 1.0F);
        this.rightMem5.addChild(rightMem10);
        this.rightMem10.cubeList.add(new ModelBox(rightMem10, 12, 43, 0.0F, -2.0F, -0.5F, 0, 2, 5, 0.0F, true));
        this.rightMem10.cubeList.add(new ModelBox(rightMem10, 44, 40, 0.075F, -2.0F, -0.5F, 0, 2, 5, 0.0F, true));

        this.rightWing6 = new AdvancedModelRenderer(this);
        this.rightWing6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.rightWing5.addChild(rightWing6);
        this.setRotateAngle(rightWing6, 0.1614F, 0.0F, 0.0F);
        this.rightWing6.cubeList.add(new ModelBox(rightWing6, 0, 11, 0.0F, -1.0F, 0.0F, 1, 1, 9, 0.001F, true));

        this.rightMem6 = new AdvancedModelRenderer(this);
        this.rightMem6.setRotationPoint(0.5F, -0.95F, 0.0F);
        this.rightWing6.addChild(rightMem6);
        this.setRotateAngle(rightMem6, 0.0F, 0.0F, 0.0873F);
        this.rightMem6.cubeList.add(new ModelBox(rightMem6, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 9, 0.0F, true));

        this.rightMem11 = new AdvancedModelRenderer(this);
        this.rightMem11.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightMem6.addChild(rightMem11);
        this.rightMem11.cubeList.add(new ModelBox(rightMem11, 20, 0, -0.05F, -2.0F, -2.0F, 0, 2, 9, 0.0F, true));
        this.rightMem11.cubeList.add(new ModelBox(rightMem11, 14, 21, -0.075F, -2.0F, -2.0F, 0, 2, 9, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2826F, -4.2521F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0654F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 36, 18, -1.0F, -0.25F, -3.0F, 3, 3, 3, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.025F, -2.15F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2705F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 42, -1.0F, -0.25F, -3.0F, 3, 2, 3, 0.002F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 35, -0.5F, 1.5F, -3.0F, 2, 1, 3, -0.001F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2574F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 50, 8, -0.5F, -0.2F, -3.0F, 2, 2, 3, 0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.275F, 0.125F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, 0.0698F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.6832F, -0.5886F);
        this.throat.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 53, -0.5F, -1.15F, -2.175F, 1, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.9229F, -2.1828F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.9861F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 50, 13, -0.5F, -2.025F, -1.75F, 2, 2, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 31, -0.5F, -2.225F, -0.75F, 2, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 9, -0.5F, -1.625F, -0.6F, 2, 1, 1, 0.04F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.9273F, -3.8072F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.9722F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 11, 0.5F, -0.5F, -4.0F, 0, 5, 8, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 30, 0.5F, -1.0F, 4.0F, 0, 5, 7, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 11, 0.0F, -1.0F, 0.0F, 1, 1, 6, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.9359F, -3.9377F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.9635F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 29, 0.0F, -0.95F, -1.8F, 1, 1, 2, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.953F, -4.1988F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.4399F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 57, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0691F, -6.7386F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 26, 0.0F, 1.0F, 1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 56, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.7161F, -4.3238F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 0, 0.0F, 0.0F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -2.31F, -0.448F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 50, -1.25F, 0.1F, -3.9F, 1, 1, 4, -0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 50, -0.75F, 0.1F, -3.9F, 1, 1, 4, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.025F, -0.75F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 39, -1.25F, -2.0F, -3.5F, 1, 2, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 39, -0.75F, -2.0F, -3.5F, 1, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.225F, -0.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 32, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, -0.085F, -0.6742F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 47, -1.0F, -0.19F, -1.0758F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 55, -0.25F, -0.19F, -3.5758F, 1, 1, 3, -0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 55, -0.75F, -0.19F, -3.5758F, 1, 1, 3, -0.011F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.19F, -3.4258F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 52, 51, 0.5F, 0.95F, -3.0F, 0, 2, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 4, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.19F, -1.8258F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.1345F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 22, -0.75F, 0.0F, 0.0F, 1, 2, 2, -0.02F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 22, -0.25F, 0.0F, 0.0F, 1, 2, 2, -0.02F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(-1.0F, 0.7523F, -2.4347F);
        this.jaw.addChild(throat2);
        this.setRotateAngle(throat2, 1.6581F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -0.775F, -0.925F);
        this.throat2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 59, 0.0F, 0.25F, 1.0F, 1, 3, 1, -0.002F, false));



        this.leftMem.scaleChildren = true;
        this.leftMem2.scaleChildren = true;
        this.leftMem3.scaleChildren = true;
        this.leftMem4.scaleChildren = true;
        this.leftMem5.scaleChildren = true;
        this.leftMem6.scaleChildren = true;
        this.leftMem7.scaleChildren = true;
        this.leftMem8.scaleChildren = true;
        this.leftMem9.scaleChildren = true;
        this.leftMem10.scaleChildren = true;
        this.leftMem11.scaleChildren = true;
        this.leftMem12.scaleChildren = true;
        this.rightMem.scaleChildren = true;
        this.rightMem2.scaleChildren = true;
        this.rightMem3.scaleChildren = true;
        this.rightMem4.scaleChildren = true;
        this.rightMem5.scaleChildren = true;
        this.rightMem6.scaleChildren = true;
        this.rightMem7.scaleChildren = true;
        this.rightMem8.scaleChildren = true;
        this.rightMem9.scaleChildren = true;
        this.rightMem10.scaleChildren = true;
        this.rightMem11.scaleChildren = true;
        this.rightMem12.scaleChildren = true;
        this.leftMem.setScale((float)1,(float)0,(float)0);
        this.leftMem2.setScale((float)1,(float)0,(float)0);
        this.leftMem3.setScale((float)1,(float)0,(float)0);
        this.leftMem4.setScale((float)1,(float)0,(float)0);
        this.leftMem5.setScale((float)1,(float)0,(float)0);
        this.leftMem6.setScale((float)1,(float)0,(float)0);
        this.leftMem7.setScale((float)1,(float)0,(float)0);
        this.leftMem8.setScale((float)1,(float)0,(float)0);
        this.leftMem9.setScale((float)1,(float)0,(float)0);
        this.leftMem10.setScale((float)1,(float)0,(float)0);
        this.leftMem11.setScale((float)1,(float)0,(float)0);
        this.leftMem12.setScale((float)1,(float)0,(float)0);
        this.rightMem.setScale((float)1,(float)0,(float)0);
        this.rightMem2.setScale((float)1,(float)0,(float)0);
        this.rightMem3.setScale((float)1,(float)0,(float)0);
        this.rightMem4.setScale((float)1,(float)0,(float)0);
        this.rightMem5.setScale((float)1,(float)0,(float)0);
        this.rightMem6.setScale((float)1,(float)0,(float)0);
        this.rightMem7.setScale((float)1,(float)0,(float)0);
        this.rightMem8.setScale((float)1,(float)0,(float)0);
        this.rightMem9.setScale((float)1,(float)0,(float)0);
        this.rightMem10.setScale((float)1,(float)0,(float)0);
        this.rightMem11.setScale((float)1,(float)0,(float)0);
        this.rightMem12.setScale((float)1,(float)0,(float)0);


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
        EntityPrehistoricFloraTupandactylus_navigans ee = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftMem.setScale((float)1,(float)1,(float)1);
            this.leftMem2.setScale((float)1,(float)1,(float)1);
            this.leftMem3.setScale((float)1,(float)1,(float)1);
            this.leftMem4.setScale((float)1,(float)1,(float)1);
            this.leftMem5.setScale((float)1,(float)1,(float)1);
            this.leftMem6.setScale((float)1,(float)1,(float)1);
            this.leftMem7.setScale((float)1,(float)1,(float)1);
            this.leftMem8.setScale((float)1,(float)1,(float)1);
            this.leftMem9.setScale((float)1,(float)1,(float)1);
            this.leftMem10.setScale((float)1,(float)1,(float)1);
            this.leftMem11.setScale((float)1,(float)1,(float)1);
            this.leftMem12.setScale((float)1,(float)1,(float)1);
            this.rightMem.setScale((float)1,(float)1,(float)1);
            this.rightMem2.setScale((float)1,(float)1,(float)1);
            this.rightMem3.setScale((float)1,(float)1,(float)1);
            this.rightMem4.setScale((float)1,(float)1,(float)1);
            this.rightMem5.setScale((float)1,(float)1,(float)1);
            this.rightMem6.setScale((float)1,(float)1,(float)1);
            this.rightMem7.setScale((float)1,(float)1,(float)1);
            this.rightMem8.setScale((float)1,(float)1,(float)1);
            this.rightMem9.setScale((float)1,(float)1,(float)1);
            this.rightMem10.setScale((float)1,(float)1,(float)1);
            this.rightMem11.setScale((float)1,(float)1,(float)1);
            this.rightMem12.setScale((float)1,(float)1,(float)1);



            //And now the pose:

            this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 1.1345F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 1.9722F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 1.9635F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 1.4399F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(hand, -2.0657F, -0.0752F, 0.3193F);
            this.setRotateAngle(hand2, -2.0657F, 0.0752F, -0.3193F);
            this.setRotateAngle(head, 0.6327F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg, 0.9803F, 0.0027F, -1.5224F);
            this.setRotateAngle(leftLeg2, 0.6084F, -0.0393F, 0.1249F);
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
            this.setRotateAngle(neck, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2705F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.2574F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg, 0.9803F, -0.0027F, 1.5224F);
            this.setRotateAngle(rightLeg2, 0.6084F, 0.0393F, -0.1249F);
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
            this.setRotateAngle(throat, 0.0698F, 0.0F, 0.0F);
            this.setRotateAngle(throat2, 1.6581F, 0.0F, 0.0F);


            



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftMem.setScale((float)1,(float)0,(float)0);
                this.leftMem2.setScale((float)1,(float)0,(float)0);
                this.leftMem3.setScale((float)1,(float)0,(float)0);
                this.leftMem4.setScale((float)1,(float)0,(float)0);
                this.leftMem5.setScale((float)1,(float)0,(float)0);
                this.leftMem6.setScale((float)1,(float)0,(float)0);
                this.leftMem7.setScale((float)1,(float)0,(float)0);
                this.leftMem8.setScale((float)1,(float)0,(float)0);
                this.leftMem9.setScale((float)1,(float)0,(float)0);
                this.leftMem10.setScale((float)1,(float)0,(float)0);
                this.leftMem11.setScale((float)1,(float)0,(float)0);
                this.leftMem12.setScale((float)1,(float)0,(float)0);
                this.rightMem.setScale((float)1,(float)0,(float)0);
                this.rightMem2.setScale((float)1,(float)0,(float)0);
                this.rightMem3.setScale((float)1,(float)0,(float)0);
                this.rightMem4.setScale((float)1,(float)0,(float)0);
                this.rightMem5.setScale((float)1,(float)0,(float)0);
                this.rightMem6.setScale((float)1,(float)0,(float)0);
                this.rightMem7.setScale((float)1,(float)0,(float)0);
                this.rightMem8.setScale((float)1,(float)0,(float)0);
                this.rightMem9.setScale((float)1,(float)0,(float)0);
                this.rightMem10.setScale((float)1,(float)0,(float)0);
                this.rightMem11.setScale((float)1,(float)0,(float)0);
                this.rightMem12.setScale((float)1,(float)0,(float)0);

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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animIdleAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdlePreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (17.75-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.75 + (((tickAnim - 10) / 10) * (0-(17.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -4.25 + (((tickAnim - 3) / 7) * (8.34544-(-4.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (2.09094-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (-3.17055-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.34544 + (((tickAnim - 10) / 10) * (0-(8.34544)));
            yy = 2.09094 + (((tickAnim - 10) / 10) * (0-(2.09094)));
            zz = -3.17055 + (((tickAnim - 10) / 10) * (0-(-3.17055)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 3) / 7) * (23-(-12)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23 + (((tickAnim - 10) / 10) * (0-(23)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 7) * (0-(-0.225)));
            zz = 0.35 + (((tickAnim - 3) / 7) * (0-(0.35)));
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
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 3) / 7) * (21-(17.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 10) / 3) * (31.25-(21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 31.25 + (((tickAnim - 13) / 7) * (0-(31.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.225-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 10) / 10) * (0-(0.075)));
            zz = -0.225 + (((tickAnim - 10) / 10) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 3) / 5) * (-4.19-(30)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.19 + (((tickAnim - 8) / 2) * (4.75-(-4.19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 10) / 3) * (26.25-(4.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 26.25 + (((tickAnim - 13) / 4) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 26.25 + (((tickAnim - 17) / 3) * (0-(26.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 5) * (-0.44-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.44 + (((tickAnim - 8) / 2) * (0-(-0.44)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 13) / 4) * (-0.15-(-0.15)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 17) / 3) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20.25 + (((tickAnim - 8) / 2) * (0-(20.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (-21.28484-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (-1.34582-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (-11.49351-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.28484 + (((tickAnim - 10) / 10) * (0-(-21.28484)));
            yy = -1.34582 + (((tickAnim - 10) / 10) * (0-(-1.34582)));
            zz = -11.49351 + (((tickAnim - 10) / 10) * (0-(-11.49351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMem.setScale((float)1,(float)1,(float)0.7);


        this.leftMem2.setScale((float)1,(float)0,(float)0);


        this.leftMem3.rotationPointX = this.leftMem3.rotationPointX + (float)(0);
        this.leftMem3.rotationPointY = this.leftMem3.rotationPointY - (float)(0);
        this.leftMem3.rotationPointZ = this.leftMem3.rotationPointZ + (float)(-1);
        this.leftMem3.setScale((float)1,(float)1,(float)0);


        this.leftMem8.rotationPointX = this.leftMem8.rotationPointX + (float)(0);
        this.leftMem8.rotationPointY = this.leftMem8.rotationPointY - (float)(0);
        this.leftMem8.rotationPointZ = this.leftMem8.rotationPointZ + (float)(-3.75);
        this.leftMem8.setScale((float)1,(float)1,(float)0);


        this.leftMem4.rotationPointX = this.leftMem4.rotationPointX + (float)(-0.5);
        this.leftMem4.rotationPointY = this.leftMem4.rotationPointY - (float)(0);
        this.leftMem4.rotationPointZ = this.leftMem4.rotationPointZ + (float)(0);
        this.leftMem4.setScale((float)0,(float)1,(float)0);


        this.leftMem5.setScale((float)1,(float)0,(float)1);


        this.leftMem6.rotationPointX = this.leftMem6.rotationPointX + (float)(0);
        this.leftMem6.rotationPointY = this.leftMem6.rotationPointY - (float)(-0.5);
        this.leftMem6.rotationPointZ = this.leftMem6.rotationPointZ + (float)(0);
        this.leftMem6.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (-21.28484-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (1.34582-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (11.49351-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.28484 + (((tickAnim - 10) / 10) * (0-(-21.28484)));
            yy = 1.34582 + (((tickAnim - 10) / 10) * (0-(1.34582)));
            zz = 11.49351 + (((tickAnim - 10) / 10) * (0-(11.49351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem.setScale((float)1,(float)1,(float)0.7);


        this.rightMem2.setScale((float)1,(float)0,(float)0);


        this.rightMem3.setScale((float)1,(float)0,(float)0);


        this.rightMem8.rotationPointX = this.rightMem8.rotationPointX + (float)(0);
        this.rightMem8.rotationPointY = this.rightMem8.rotationPointY - (float)(0);
        this.rightMem8.rotationPointZ = this.rightMem8.rotationPointZ + (float)(-4);
        this.rightMem8.setScale((float)1,(float)1,(float)0);


        this.rightMem4.rotationPointX = this.rightMem4.rotationPointX + (float)(0.5);
        this.rightMem4.rotationPointY = this.rightMem4.rotationPointY - (float)(0);
        this.rightMem4.rotationPointZ = this.rightMem4.rotationPointZ + (float)(0);
        this.rightMem4.setScale((float)0,(float)1,(float)0);


        this.rightMem5.rotationPointX = this.rightMem5.rotationPointX + (float)(0);
        this.rightMem5.rotationPointY = this.rightMem5.rotationPointY - (float)(-0.5);
        this.rightMem5.rotationPointZ = this.rightMem5.rotationPointZ + (float)(0);
        this.rightMem5.setScale((float)1,(float)0,(float)1);


        this.rightMem6.rotationPointX = this.rightMem6.rotationPointX + (float)(0);
        this.rightMem6.rotationPointY = this.rightMem6.rotationPointY - (float)(-0.5);
        this.rightMem6.rotationPointZ = this.rightMem6.rotationPointZ + (float)(0);
        this.rightMem6.setScale((float)1,(float)0,(float)1);


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 0) / 25) * (-16-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -16 + (((tickAnim - 25) / 8) * (-18.75-(-16)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -18.75 + (((tickAnim - 33) / 10) * (-1.815-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*-5-(-18.75)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.815-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*-5 + (((tickAnim - 43) / 7) * (0-(-1.815-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*-5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 29.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-30 + (((tickAnim - 0) / 25) * (3.5-(29.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-100))*-30)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 3.5 + (((tickAnim - 25) / 8) * (-5-(3.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -15.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-230))*-20 + (((tickAnim - 0) / 25) * (0-(-15.325-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-230))*-20)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 33) / 17) * (0-(-4)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 49.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-280))*50 + (((tickAnim - 0) / 25) * (48.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50-(49.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-280))*50)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 48.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50 + (((tickAnim - 25) / 8) * (8.98694-(48.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*50)));
            yy = 0 + (((tickAnim - 25) / 8) * (0.057-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (-0.09794-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 8.98694 + (((tickAnim - 33) / 9) * (-3.1065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*10-(8.98694)));
            yy = 0.057 + (((tickAnim - 33) / 9) * (0.0285-(0.057)));
            zz = -0.09794 + (((tickAnim - 33) / 9) * (-0.04897-(-0.09794)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -3.1065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*10 + (((tickAnim - 42) / 8) * (0-(-3.1065-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.2-50))*10)));
            yy = 0.0285 + (((tickAnim - 42) / 8) * (0-(0.0285)));
            zz = -0.04897 + (((tickAnim - 42) / 8) * (0-(-0.04897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (17.13-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 17.13 + (((tickAnim - 6) / 6) * (0-(17.13)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 12) / 21) * (42.25-(0)));
            yy = 0 + (((tickAnim - 12) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 21) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 42.25 + (((tickAnim - 33) / 5) * (0-(42.25)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (14.25-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 14.25 + (((tickAnim - 42) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 42) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 4) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (9-(0)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 48) / 2) * (0-(9)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMem2.setScale((float)1,(float)0,(float)0);


        this.leftMem3.setScale((float)1,(float)1,(float)0);


        this.leftMem8.rotationPointX = this.leftMem8.rotationPointX + (float)(0);
        this.leftMem8.rotationPointY = this.leftMem8.rotationPointY - (float)(0);
        this.leftMem8.rotationPointZ = this.leftMem8.rotationPointZ + (float)(-4);
        this.leftMem8.setScale((float)1,(float)1,(float)0);


        this.leftMem4.setScale((float)1,(float)0,(float)1);


        this.leftMem5.setScale((float)1,(float)0,(float)1);


        this.leftMem6.setScale((float)1,(float)0,(float)1);


        this.rightMem2.setScale((float)1,(float)0,(float)0);


        this.rightMem3.setScale((float)1,(float)1,(float)0);


        this.rightMem8.rotationPointX = this.rightMem8.rotationPointX + (float)(0);
        this.rightMem8.rotationPointY = this.rightMem8.rotationPointY - (float)(0);
        this.rightMem8.rotationPointZ = this.rightMem8.rotationPointZ + (float)(-4);
        this.rightMem8.setScale((float)1,(float)1,(float)0);


        this.rightMem4.setScale((float)1,(float)0,(float)1);


        this.rightMem5.setScale((float)1,(float)0,(float)1);


        this.rightMem6.setScale((float)1,(float)0,(float)1);


    }
    public void animIdleAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -7.5 + (((tickAnim - 38) / 25) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = -7.5 + (((tickAnim - 63) / 32) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -7.5 + (((tickAnim - 95) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = 0.725 + (((tickAnim - 38) / 25) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = 0.725 + (((tickAnim - 63) / 14) * (0.73-(0.725)));
            zz = 0 + (((tickAnim - 63) / 14) * (0.175-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0.73 + (((tickAnim - 77) / 18) * (0.73-(0.73)));
            zz = 0.175 + (((tickAnim - 77) / 18) * (0.175-(0.175)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0.73 + (((tickAnim - 95) / 20) * (0-(0.73)));
            zz = 0.175 + (((tickAnim - 95) / 20) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 14) * (-4-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = -4 + (((tickAnim - 77) / 18) * (-4-(-4)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = -4 + (((tickAnim - 95) / 20) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.0012-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.77485-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.38496-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 9.0012-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30 + (((tickAnim - 20) / 18) * (-21.233-(9.0012-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*30)));
            yy = 0.77485 + (((tickAnim - 20) / 18) * (1.14061-(0.77485)));
            zz = 1.38496 + (((tickAnim - 20) / 18) * (3.44413-(1.38496)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -21.233 + (((tickAnim - 38) / 25) * (-21.233-(-21.233)));
            yy = 1.14061 + (((tickAnim - 38) / 25) * (1.14061-(1.14061)));
            zz = 3.44413 + (((tickAnim - 38) / 25) * (3.44413-(3.44413)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -21.233 + (((tickAnim - 63) / 7) * (-20.5339587106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-21.233)));
            yy = 1.14061 + (((tickAnim - 63) / 7) * (-2.22107-(1.14061)));
            zz = 3.44413 + (((tickAnim - 63) / 7) * (1.09905-(3.44413)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = -20.5339587106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 70) / 7) * (-21.33492-(-20.5339587106-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = -2.22107 + (((tickAnim - 70) / 7) * (-5.58274-(-2.22107)));
            zz = 1.09905 + (((tickAnim - 70) / 7) * (-1.24603-(1.09905)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -21.33492 + (((tickAnim - 77) / 18) * (-21.33492-(-21.33492)));
            yy = -5.58274 + (((tickAnim - 77) / 18) * (-5.58274-(-5.58274)));
            zz = -1.24603 + (((tickAnim - 77) / 18) * (-1.24603-(-1.24603)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -21.33492 + (((tickAnim - 95) / 20) * (0-(-21.33492)));
            yy = -5.58274 + (((tickAnim - 95) / 20) * (0-(-5.58274)));
            zz = -1.24603 + (((tickAnim - 95) / 20) * (0-(-1.24603)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0.125-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0.125 + (((tickAnim - 38) / 25) * (0.125-(0.125)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0.125 + (((tickAnim - 63) / 32) * (0.125-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.9835-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.24131-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.56106-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -2.9835 + (((tickAnim - 20) / 18) * (-1.7335-(-2.9835)));
            yy = 1.24131 + (((tickAnim - 20) / 18) * (2.21631-(1.24131)));
            zz = 1.56106 + (((tickAnim - 20) / 18) * (2.68606-(1.56106)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -1.7335 + (((tickAnim - 38) / 25) * (-1.7335-(-1.7335)));
            yy = 2.21631 + (((tickAnim - 38) / 25) * (2.21631-(2.21631)));
            zz = 2.68606 + (((tickAnim - 38) / 25) * (2.68606-(2.68606)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -1.7335 + (((tickAnim - 63) / 7) * (0.1044-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20-(-1.7335)));
            yy = 2.21631 + (((tickAnim - 63) / 7) * (-0.36942-(2.21631)));
            zz = 2.68606 + (((tickAnim - 63) / 7) * (1.52857-(2.68606)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0.1044-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 70) / 7) * (-1.85775-(0.1044-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = -0.36942 + (((tickAnim - 70) / 7) * (-2.95515-(-0.36942)));
            zz = 1.52857 + (((tickAnim - 70) / 7) * (0.37108-(1.52857)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -1.85775 + (((tickAnim - 77) / 18) * (-1.85775-(-1.85775)));
            yy = -2.95515 + (((tickAnim - 77) / 18) * (-2.95515-(-2.95515)));
            zz = 0.37108 + (((tickAnim - 77) / 18) * (0.37108-(0.37108)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -1.85775 + (((tickAnim - 95) / 20) * (0-(-1.85775)));
            yy = -2.95515 + (((tickAnim - 95) / 20) * (0-(-2.95515)));
            zz = 0.37108 + (((tickAnim - 95) / 20) * (0-(0.37108)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.5803-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.10125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.06897-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -4.5803-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10 + (((tickAnim - 20) / 18) * (6.71974-(-4.5803-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-10)));
            yy = 2.10125 + (((tickAnim - 20) / 18) * (3.62625-(2.10125)));
            zz = 2.06897 + (((tickAnim - 20) / 18) * (4.29397-(2.06897)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 6.71974 + (((tickAnim - 38) / 2) * (6.71974-(6.71974)));
            yy = 3.62625 + (((tickAnim - 38) / 2) * (3.62625-(3.62625)));
            zz = 4.29397 + (((tickAnim - 38) / 2) * (4.29397-(4.29397)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 6.71974 + (((tickAnim - 40) / 6) * (6.85009-(6.71974)));
            yy = 3.62625 + (((tickAnim - 40) / 6) * (3.90342-(3.62625)));
            zz = 4.29397 + (((tickAnim - 40) / 6) * (6.27895-(4.29397)));
        }
        else if (tickAnim >= 46 && tickAnim < 52) {
            xx = 6.85009 + (((tickAnim - 46) / 6) * (6.85009-(6.85009)));
            yy = 3.90342 + (((tickAnim - 46) / 6) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 46) / 6) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 6.85009 + (((tickAnim - 52) / 2) * (7.85009-(6.85009)));
            yy = 3.90342 + (((tickAnim - 52) / 2) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 52) / 2) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 7.85009 + (((tickAnim - 54) / 3) * (6.85009-(7.85009)));
            yy = 3.90342 + (((tickAnim - 54) / 3) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 54) / 3) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 6.85009 + (((tickAnim - 57) / 2) * (7.85009-(6.85009)));
            yy = 3.90342 + (((tickAnim - 57) / 2) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 57) / 2) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 7.85009 + (((tickAnim - 59) / 3) * (6.85009-(7.85009)));
            yy = 3.90342 + (((tickAnim - 59) / 3) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 59) / 3) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 6.85009 + (((tickAnim - 62) / 1) * (6.85009-(6.85009)));
            yy = 3.90342 + (((tickAnim - 62) / 1) * (3.90342-(3.90342)));
            zz = 6.27895 + (((tickAnim - 62) / 1) * (6.27895-(6.27895)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 6.85009 + (((tickAnim - 63) / 7) * (7.9669-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10-(6.85009)));
            yy = 3.90342 + (((tickAnim - 63) / 7) * (3.75895-(3.90342)));
            zz = 6.27895 + (((tickAnim - 63) / 7) * (-0.78825-(6.27895)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 7.9669-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10 + (((tickAnim - 70) / 7) * (6.13363-(7.9669-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*10)));
            yy = 3.75895 + (((tickAnim - 70) / 7) * (3.61447-(3.75895)));
            zz = -0.78825 + (((tickAnim - 70) / 7) * (-7.85545-(-0.78825)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 6.13363 + (((tickAnim - 77) / 1) * (6.13363-(6.13363)));
            yy = 3.61447 + (((tickAnim - 77) / 1) * (3.61447-(3.61447)));
            zz = -7.85545 + (((tickAnim - 77) / 1) * (-7.85545-(-7.85545)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 6.13363 + (((tickAnim - 78) / 5) * (5.99152-(6.13363)));
            yy = 3.61447 + (((tickAnim - 78) / 5) * (2.47088-(3.61447)));
            zz = -7.85545 + (((tickAnim - 78) / 5) * (-10.46424-(-7.85545)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 5.99152 + (((tickAnim - 83) / 2) * (5.99152-(5.99152)));
            yy = 2.47088 + (((tickAnim - 83) / 2) * (2.47088-(2.47088)));
            zz = -10.46424 + (((tickAnim - 83) / 2) * (-10.46424-(-10.46424)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 5.99152 + (((tickAnim - 85) / 10) * (5.99152-(5.99152)));
            yy = 2.47088 + (((tickAnim - 85) / 10) * (2.47088-(2.47088)));
            zz = -10.46424 + (((tickAnim - 85) / 10) * (-10.46424-(-10.46424)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 5.99152 + (((tickAnim - 95) / 20) * (0-(5.99152)));
            yy = 2.47088 + (((tickAnim - 95) / 20) * (0-(2.47088)));
            zz = -10.46424 + (((tickAnim - 95) / 20) * (0-(-10.46424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -6.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30 + (((tickAnim - 20) / 18) * (25-(-6.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-30)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 38) / 2) * (25-(25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 25 + (((tickAnim - 40) / 12) * (25-(25)));
            yy = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 25 + (((tickAnim - 52) / 2) * (22.75-(25)));
            yy = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 22.75 + (((tickAnim - 54) / 3) * (25-(22.75)));
            yy = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 25 + (((tickAnim - 57) / 2) * (22.75-(25)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 22.75 + (((tickAnim - 59) / 3) * (25-(22.75)));
            yy = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 25 + (((tickAnim - 62) / 1) * (25-(25)));
            yy = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 1) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 25 + (((tickAnim - 63) / 7) * (24.25-(25)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 24.25 + (((tickAnim - 70) / 7) * (25-(24.25)));
            yy = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 7) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 25 + (((tickAnim - 77) / 1) * (25-(25)));
            yy = 0 + (((tickAnim - 77) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 1) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 25 + (((tickAnim - 78) / 5) * (25-(25)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 25 + (((tickAnim - 83) / 2) * (25-(25)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 95) {
            xx = 25 + (((tickAnim - 85) / 10) * (25-(25)));
            yy = 0 + (((tickAnim - 85) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 10) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 25 + (((tickAnim - 95) / 20) * (0-(25)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 38) / 2) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 40) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 40) / 12) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 40) / 12) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 52) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 52) / 5) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 52) / 5) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 57) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 57) / 5) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 57) / 5) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 62) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 62) / 1) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 62) / 1) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = -0.225 + (((tickAnim - 63) / 14) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 77) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 77) / 1) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 77) / 1) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 78) / 37) * (0-(0)));
            yy = -0.225 + (((tickAnim - 78) / 37) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 78) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 10) / 15) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 1.75 + (((tickAnim - 43) / 4) * (0-(1.75)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 31) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 78) / 5) * (1.75-(0)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 85) {
            xx = 1.75 + (((tickAnim - 83) / 2) * (0-(1.75)));
            yy = 0 + (((tickAnim - 83) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 2) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 85) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-0.14014-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-1.37864-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (24.43063-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -0.14014 + (((tickAnim - 38) / 25) * (-0.14014-(-0.14014)));
            yy = -1.37864 + (((tickAnim - 38) / 25) * (-1.37864-(-1.37864)));
            zz = 24.43063 + (((tickAnim - 38) / 25) * (24.43063-(24.43063)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -0.14014 + (((tickAnim - 63) / 7) * (4.65032-(-0.14014)));
            yy = -1.37864 + (((tickAnim - 63) / 7) * (0.32096-(-1.37864)));
            zz = 24.43063 + (((tickAnim - 63) / 7) * (1.64906-(24.43063)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 4.65032 + (((tickAnim - 70) / 7) * (13.60986-(4.65032)));
            yy = 0.32096 + (((tickAnim - 70) / 7) * (-1.37864-(0.32096)));
            zz = 1.64906 + (((tickAnim - 70) / 7) * (24.43063-(1.64906)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 13.60986 + (((tickAnim - 77) / 18) * (13.60986-(13.60986)));
            yy = -1.37864 + (((tickAnim - 77) / 18) * (-1.37864-(-1.37864)));
            zz = 24.43063 + (((tickAnim - 77) / 18) * (24.43063-(24.43063)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 13.60986 + (((tickAnim - 95) / 10) * (-0.09599-(13.60986)));
            yy = -1.37864 + (((tickAnim - 95) / 10) * (-0.07671-(-1.37864)));
            zz = 24.43063 + (((tickAnim - 95) / 10) * (5.21186-(24.43063)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -0.09599 + (((tickAnim - 105) / 10) * (0-(-0.09599)));
            yy = -0.07671 + (((tickAnim - 105) / 10) * (0-(-0.07671)));
            zz = 5.21186 + (((tickAnim - 105) / 10) * (0-(5.21186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0.7 + (((tickAnim - 0) / 115) * (0.7-(0.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (15.86668-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (3.34487-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-26.58189-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 15.86668 + (((tickAnim - 38) / 25) * (15.86668-(15.86668)));
            yy = 3.34487 + (((tickAnim - 38) / 25) * (3.34487-(3.34487)));
            zz = -26.58189 + (((tickAnim - 38) / 25) * (-26.58189-(-26.58189)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 15.86668 + (((tickAnim - 63) / 7) * (7.7575-(15.86668)));
            yy = 3.34487 + (((tickAnim - 63) / 7) * (-5.45101-(3.34487)));
            zz = -26.58189 + (((tickAnim - 63) / 7) * (-0.76059-(-26.58189)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 7.7575 + (((tickAnim - 70) / 7) * (10.61668-(7.7575)));
            yy = -5.45101 + (((tickAnim - 70) / 7) * (3.34487-(-5.45101)));
            zz = -0.76059 + (((tickAnim - 70) / 7) * (-26.58189-(-0.76059)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 10.61668 + (((tickAnim - 77) / 18) * (10.61668-(10.61668)));
            yy = 3.34487 + (((tickAnim - 77) / 18) * (3.34487-(3.34487)));
            zz = -26.58189 + (((tickAnim - 77) / 18) * (-26.58189-(-26.58189)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 10.61668 + (((tickAnim - 95) / 10) * (-3.19166-(10.61668)));
            yy = 3.34487 + (((tickAnim - 95) / 10) * (1.67244-(3.34487)));
            zz = -26.58189 + (((tickAnim - 95) / 10) * (-13.29094-(-26.58189)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -3.19166 + (((tickAnim - 105) / 10) * (0-(-3.19166)));
            yy = 1.67244 + (((tickAnim - 105) / 10) * (0-(1.67244)));
            zz = -13.29094 + (((tickAnim - 105) / 10) * (0-(-13.29094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.375 + (((tickAnim - 38) / 25) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = -0.375 + (((tickAnim - 63) / 14) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-5.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -5.5 + (((tickAnim - 38) / 25) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = -5.75 + (((tickAnim - 38) / 25) * (-5.75-(-5.75)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = -5.5 + (((tickAnim - 63) / 7) * (21.5-(-5.5)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = -5.75 + (((tickAnim - 63) / 7) * (-5.75-(-5.75)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 21.5 + (((tickAnim - 70) / 7) * (-5.5-(21.5)));
            yy = 0 + (((tickAnim - 70) / 7) * (0-(0)));
            zz = -5.75 + (((tickAnim - 70) / 7) * (-5.75-(-5.75)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -5.5 + (((tickAnim - 77) / 18) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = -5.75 + (((tickAnim - 77) / 18) * (-5.75-(-5.75)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = -5.5 + (((tickAnim - 95) / 10) * (26.75-(-5.5)));
            yy = 0 + (((tickAnim - 95) / 10) * (0-(0)));
            zz = -5.75 + (((tickAnim - 95) / 10) * (-2.875-(-5.75)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 26.75 + (((tickAnim - 105) / 10) * (0-(26.75)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = -2.875 + (((tickAnim - 105) / 10) * (0-(-2.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.075 + (((tickAnim - 38) / 25) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = -0.075 + (((tickAnim - 63) / 14) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.04581-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-1.41272-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (9.62848-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0.04581 + (((tickAnim - 38) / 25) * (0.04581-(0.04581)));
            yy = -1.41272 + (((tickAnim - 38) / 25) * (-1.41272-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 38) / 25) * (9.62848-(9.62848)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0.04581 + (((tickAnim - 63) / 7) * (-4.65937-(0.04581)));
            yy = -1.41272 + (((tickAnim - 63) / 7) * (-9.45742-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 63) / 7) * (65.78107-(9.62848)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = -4.65937 + (((tickAnim - 70) / 7) * (0.04581-(-4.65937)));
            yy = -9.45742 + (((tickAnim - 70) / 7) * (-1.41272-(-9.45742)));
            zz = 65.78107 + (((tickAnim - 70) / 7) * (9.62848-(65.78107)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0.04581 + (((tickAnim - 77) / 18) * (0.04581-(0.04581)));
            yy = -1.41272 + (((tickAnim - 77) / 18) * (-1.41272-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 77) / 18) * (9.62848-(9.62848)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0.04581 + (((tickAnim - 95) / 10) * (-4.65937-(0.04581)));
            yy = -1.41272 + (((tickAnim - 95) / 10) * (-9.45742-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 95) / 10) * (65.78107-(9.62848)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = -4.65937 + (((tickAnim - 105) / 10) * (0-(-4.65937)));
            yy = -9.45742 + (((tickAnim - 105) / 10) * (0-(-9.45742)));
            zz = 65.78107 + (((tickAnim - 105) / 10) * (0-(65.78107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.325 + (((tickAnim - 38) / 25) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0.75-(0)));
            yy = -0.325 + (((tickAnim - 63) / 7) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 77) {
            xx = 0.75 + (((tickAnim - 70) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 70) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 70) / 7) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.325 + (((tickAnim - 77) / 18) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 95) / 10) * (0.75-(0)));
            yy = -0.325 + (((tickAnim - 95) / 10) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 95) / 10) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 115) {
            xx = 0.75 + (((tickAnim - 105) / 10) * (0-(0.75)));
            yy = 0 + (((tickAnim - 105) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftMem6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 12 + (((tickAnim - 38) / 25) * (12-(12)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 12 + (((tickAnim - 63) / 32) * (12-(12)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 12 + (((tickAnim - 95) / 20) * (0-(12)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -9.75 + (((tickAnim - 38) / 25) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = -9.75 + (((tickAnim - 63) / 32) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -9.75 + (((tickAnim - 95) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 6 + (((tickAnim - 38) / 25) * (6-(6)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 63) / 32) * (6-(6)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 6 + (((tickAnim - 95) / 20) * (0-(6)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 12 + (((tickAnim - 38) / 25) * (12-(12)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 12 + (((tickAnim - 63) / 14) * (6-(12)));
            yy = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 77) / 18) * (6-(6)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 6 + (((tickAnim - 95) / 20) * (0-(6)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -9.75 + (((tickAnim - 38) / 25) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = -9.75 + (((tickAnim - 63) / 14) * (-5-(-9.75)));
            yy = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -5 + (((tickAnim - 77) / 18) * (-5-(-5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -5 + (((tickAnim - 95) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 6 + (((tickAnim - 38) / 25) * (6-(6)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 95) {
            xx = 6 + (((tickAnim - 63) / 32) * (6-(6)));
            yy = 0 + (((tickAnim - 63) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 32) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 6 + (((tickAnim - 95) / 20) * (0-(6)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-0.14014-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.37864-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-24.43063-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -0.14014 + (((tickAnim - 38) / 25) * (-0.14014-(-0.14014)));
            yy = 1.37864 + (((tickAnim - 38) / 25) * (1.37864-(1.37864)));
            zz = -24.43063 + (((tickAnim - 38) / 25) * (-24.43063-(-24.43063)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = -0.14014 + (((tickAnim - 63) / 14) * (-0.46255-(-0.14014)));
            yy = 1.37864 + (((tickAnim - 63) / 14) * (1.60097-(1.37864)));
            zz = -24.43063 + (((tickAnim - 63) / 14) * (-16.66273-(-24.43063)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -0.46255 + (((tickAnim - 77) / 18) * (-0.46255-(-0.46255)));
            yy = 1.60097 + (((tickAnim - 77) / 18) * (1.60097-(1.60097)));
            zz = -16.66273 + (((tickAnim - 77) / 18) * (-16.66273-(-16.66273)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -0.46255 + (((tickAnim - 95) / 20) * (0-(-0.46255)));
            yy = 1.60097 + (((tickAnim - 95) / 20) * (0-(1.60097)));
            zz = -16.66273 + (((tickAnim - 95) / 20) * (0-(-16.66273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0.7 + (((tickAnim - 0) / 115) * (0.7-(0.7)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (15.86668-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-3.34487-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (26.58189-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 15.86668 + (((tickAnim - 38) / 25) * (15.86668-(15.86668)));
            yy = -3.34487 + (((tickAnim - 38) / 25) * (-3.34487-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 38) / 25) * (26.58189-(26.58189)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 15.86668 + (((tickAnim - 63) / 14) * (13.36668-(15.86668)));
            yy = -3.34487 + (((tickAnim - 63) / 14) * (-3.34487-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 63) / 14) * (26.58189-(26.58189)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 13.36668 + (((tickAnim - 77) / 18) * (13.36668-(13.36668)));
            yy = -3.34487 + (((tickAnim - 77) / 18) * (-3.34487-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 77) / 18) * (26.58189-(26.58189)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 13.36668 + (((tickAnim - 95) / 20) * (0-(13.36668)));
            yy = -3.34487 + (((tickAnim - 95) / 20) * (0-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 95) / 20) * (0-(26.58189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.375 + (((tickAnim - 38) / 25) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = -0.375 + (((tickAnim - 63) / 14) * (-0.37-(-0.375)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.37 + (((tickAnim - 77) / 18) * (-0.37-(-0.37)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = -0.37 + (((tickAnim - 95) / 20) * (0-(-0.37)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (5.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = -5.5 + (((tickAnim - 38) / 25) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = 5.75 + (((tickAnim - 38) / 25) * (5.75-(5.75)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = -5.5 + (((tickAnim - 63) / 14) * (-9.75-(-5.5)));
            yy = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            zz = 5.75 + (((tickAnim - 63) / 14) * (5.75-(5.75)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -9.75 + (((tickAnim - 77) / 18) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 5.75 + (((tickAnim - 77) / 18) * (5.75-(5.75)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -9.75 + (((tickAnim - 95) / 20) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            zz = 5.75 + (((tickAnim - 95) / 20) * (0-(5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.075 + (((tickAnim - 38) / 25) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (0-(0)));
            yy = -0.075 + (((tickAnim - 63) / 14) * (-0.17-(-0.075)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.17 + (((tickAnim - 77) / 18) * (-0.17-(-0.17)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 95) / 20) * (0-(0)));
            yy = -0.17 + (((tickAnim - 95) / 20) * (0-(-0.17)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.04581-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.41272-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-9.62848-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0.04581 + (((tickAnim - 38) / 25) * (0.04581-(0.04581)));
            yy = 1.41272 + (((tickAnim - 38) / 25) * (1.41272-(1.41272)));
            zz = -9.62848 + (((tickAnim - 38) / 25) * (-9.62848-(-9.62848)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0.04581 + (((tickAnim - 63) / 14) * (5.94119-(0.04581)));
            yy = 1.41272 + (((tickAnim - 63) / 14) * (-4.09969-(1.41272)));
            zz = -9.62848 + (((tickAnim - 63) / 14) * (-46.31392-(-9.62848)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 5.94119 + (((tickAnim - 77) / 18) * (5.94119-(5.94119)));
            yy = -4.09969 + (((tickAnim - 77) / 18) * (-4.09969-(-4.09969)));
            zz = -46.31392 + (((tickAnim - 77) / 18) * (-46.31392-(-46.31392)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = 5.94119 + (((tickAnim - 95) / 20) * (0-(5.94119)));
            yy = -4.09969 + (((tickAnim - 95) / 20) * (0-(-4.09969)));
            zz = -46.31392 + (((tickAnim - 95) / 20) * (0-(-46.31392)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            yy = -0.325 + (((tickAnim - 38) / 25) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 38) / 25) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 63) / 14) * (-0.275-(0)));
            yy = -0.325 + (((tickAnim - 63) / 14) * (0.055-(-0.325)));
            zz = 0 + (((tickAnim - 63) / 14) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -0.275 + (((tickAnim - 77) / 18) * (-0.275-(-0.275)));
            yy = 0.055 + (((tickAnim - 77) / 18) * (0.055-(0.055)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 115) {
            xx = -0.275 + (((tickAnim - 95) / 20) * (0-(-0.275)));
            yy = 0.055 + (((tickAnim - 95) / 20) * (0-(0.055)));
            zz = 0 + (((tickAnim - 95) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 0) / 115) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 115) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 115) * (0-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem6.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animIdlePreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 105;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -7.5 + (((tickAnim - 38) / 37) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -7.5 + (((tickAnim - 75) / 30) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = 0.725 + (((tickAnim - 38) / 37) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = 0.725 + (((tickAnim - 75) / 30) * (0-(0.725)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 8.25 + (((tickAnim - 38) / 37) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 8.25 + (((tickAnim - 75) / 30) * (0-(8.25)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 52) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 52) * (36.1432-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 52) * (7.01335-(0)));
            zz = 0 + (((tickAnim - 0) / 52) * (33.88868-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 36.1432 + (((tickAnim - 52) / 3) * (32.3932-(36.1432)));
            yy = 7.01335 + (((tickAnim - 52) / 3) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 52) / 3) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 32.3932 + (((tickAnim - 55) / 3) * (36.1432-(32.3932)));
            yy = 7.01335 + (((tickAnim - 55) / 3) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 55) / 3) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 36.1432 + (((tickAnim - 58) / 4) * (32.3932-(36.1432)));
            yy = 7.01335 + (((tickAnim - 58) / 4) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 58) / 4) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 32.3932 + (((tickAnim - 62) / 3) * (36.1432-(32.3932)));
            yy = 7.01335 + (((tickAnim - 62) / 3) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 62) / 3) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 36.1432 + (((tickAnim - 65) / 3) * (32.3932-(36.1432)));
            yy = 7.01335 + (((tickAnim - 65) / 3) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 65) / 3) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 32.3932 + (((tickAnim - 68) / 4) * (36.1432-(32.3932)));
            yy = 7.01335 + (((tickAnim - 68) / 4) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 68) / 4) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 36.1432 + (((tickAnim - 72) / 3) * (32.3932-(36.1432)));
            yy = 7.01335 + (((tickAnim - 72) / 3) * (7.01335-(7.01335)));
            zz = 33.88868 + (((tickAnim - 72) / 3) * (33.88868-(33.88868)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 32.3932 + (((tickAnim - 75) / 30) * (0-(32.3932)));
            yy = 7.01335 + (((tickAnim - 75) / 30) * (0-(7.01335)));
            zz = 33.88868 + (((tickAnim - 75) / 30) * (0-(33.88868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (-0.275-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0.75 + (((tickAnim - 48) / 7) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = -0.275 + (((tickAnim - 48) / 7) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 0.75 + (((tickAnim - 55) / 7) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            zz = -0.275 + (((tickAnim - 55) / 7) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0.75 + (((tickAnim - 62) / 6) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = -0.275 + (((tickAnim - 62) / 6) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0.75 + (((tickAnim - 68) / 7) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = -0.275 + (((tickAnim - 68) / 7) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.75 + (((tickAnim - 75) / 30) * (0-(0.75)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = -0.275 + (((tickAnim - 75) / 30) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (39.75234-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (32.15009-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (15.25808-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 39.75234 + (((tickAnim - 48) / 4) * (36.25234-(39.75234)));
            yy = 32.15009 + (((tickAnim - 48) / 4) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 48) / 4) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 36.25234 + (((tickAnim - 52) / 3) * (39.75234-(36.25234)));
            yy = 32.15009 + (((tickAnim - 52) / 3) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 52) / 3) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 39.75234 + (((tickAnim - 55) / 3) * (36.25234-(39.75234)));
            yy = 32.15009 + (((tickAnim - 55) / 3) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 55) / 3) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 36.25234 + (((tickAnim - 58) / 4) * (39.75234-(36.25234)));
            yy = 32.15009 + (((tickAnim - 58) / 4) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 58) / 4) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 39.75234 + (((tickAnim - 62) / 3) * (36.25234-(39.75234)));
            yy = 32.15009 + (((tickAnim - 62) / 3) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 62) / 3) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 36.25234 + (((tickAnim - 65) / 3) * (39.75234-(36.25234)));
            yy = 32.15009 + (((tickAnim - 65) / 3) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 65) / 3) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 39.75234 + (((tickAnim - 68) / 4) * (36.25234-(39.75234)));
            yy = 32.15009 + (((tickAnim - 68) / 4) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 68) / 4) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 36.25234 + (((tickAnim - 72) / 3) * (39.75234-(36.25234)));
            yy = 32.15009 + (((tickAnim - 72) / 3) * (32.15009-(32.15009)));
            zz = 15.25808 + (((tickAnim - 72) / 3) * (15.25808-(15.25808)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 39.75234 + (((tickAnim - 75) / 30) * (0-(39.75234)));
            yy = 32.15009 + (((tickAnim - 75) / 30) * (0-(32.15009)));
            zz = 15.25808 + (((tickAnim - 75) / 30) * (0-(15.25808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0.2-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0.325 + (((tickAnim - 48) / 7) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0.2 + (((tickAnim - 48) / 7) * (0.2-(0.2)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 0.325 + (((tickAnim - 55) / 7) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            zz = 0.2 + (((tickAnim - 55) / 7) * (0.2-(0.2)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0.325 + (((tickAnim - 62) / 6) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0.2 + (((tickAnim - 62) / 6) * (0.2-(0.2)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 0.325 + (((tickAnim - 68) / 7) * (0.325-(0.325)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0.2 + (((tickAnim - 68) / 7) * (0.2-(0.2)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.325 + (((tickAnim - 75) / 30) * (0-(0.325)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0.2 + (((tickAnim - 75) / 30) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (29.82908-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (27.65884-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (11.44334-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 29.82908 + (((tickAnim - 38) / 10) * (29.82908-(29.82908)));
            yy = 27.65884 + (((tickAnim - 38) / 10) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 38) / 10) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 29.82908 + (((tickAnim - 48) / 4) * (31.07908-(29.82908)));
            yy = 27.65884 + (((tickAnim - 48) / 4) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 48) / 4) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 31.07908 + (((tickAnim - 52) / 3) * (29.82908-(31.07908)));
            yy = 27.65884 + (((tickAnim - 52) / 3) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 52) / 3) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 29.82908 + (((tickAnim - 55) / 3) * (31.07908-(29.82908)));
            yy = 27.65884 + (((tickAnim - 55) / 3) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 55) / 3) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 31.07908 + (((tickAnim - 58) / 4) * (29.82908-(31.07908)));
            yy = 27.65884 + (((tickAnim - 58) / 4) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 58) / 4) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 29.82908 + (((tickAnim - 62) / 3) * (31.07908-(29.82908)));
            yy = 27.65884 + (((tickAnim - 62) / 3) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 62) / 3) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 31.07908 + (((tickAnim - 65) / 3) * (29.82908-(31.07908)));
            yy = 27.65884 + (((tickAnim - 65) / 3) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 65) / 3) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 29.82908 + (((tickAnim - 68) / 4) * (31.07908-(29.82908)));
            yy = 27.65884 + (((tickAnim - 68) / 4) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 68) / 4) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 31.07908 + (((tickAnim - 72) / 3) * (29.82908-(31.07908)));
            yy = 27.65884 + (((tickAnim - 72) / 3) * (27.65884-(27.65884)));
            zz = 11.44334 + (((tickAnim - 72) / 3) * (11.44334-(11.44334)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 29.82908 + (((tickAnim - 75) / 30) * (0-(29.82908)));
            yy = 27.65884 + (((tickAnim - 75) / 30) * (0-(27.65884)));
            zz = 11.44334 + (((tickAnim - 75) / 30) * (0-(11.44334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0.275-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0.5 + (((tickAnim - 38) / 37) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0.275 + (((tickAnim - 38) / 37) * (0.275-(0.275)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.5 + (((tickAnim - 75) / 30) * (0-(0.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0.275 + (((tickAnim - 75) / 30) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-27.14083-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (13.74735-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-1.02408-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = -27.14083 + (((tickAnim - 38) / 10) * (-34.21221-(-27.14083)));
            yy = 13.74735 + (((tickAnim - 38) / 10) * (7.93469-(13.74735)));
            zz = -1.02408 + (((tickAnim - 38) / 10) * (14.43554-(-1.02408)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -34.21221 + (((tickAnim - 48) / 4) * (-34.96221-(-34.21221)));
            yy = 7.93469 + (((tickAnim - 48) / 4) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 48) / 4) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -34.96221 + (((tickAnim - 52) / 3) * (-34.21221-(-34.96221)));
            yy = 7.93469 + (((tickAnim - 52) / 3) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 52) / 3) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -34.21221 + (((tickAnim - 55) / 3) * (-34.96221-(-34.21221)));
            yy = 7.93469 + (((tickAnim - 55) / 3) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 55) / 3) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -34.96221 + (((tickAnim - 58) / 4) * (-34.21221-(-34.96221)));
            yy = 7.93469 + (((tickAnim - 58) / 4) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 58) / 4) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = -34.21221 + (((tickAnim - 62) / 3) * (-34.96221-(-34.21221)));
            yy = 7.93469 + (((tickAnim - 62) / 3) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 62) / 3) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -34.96221 + (((tickAnim - 65) / 3) * (-34.21221-(-34.96221)));
            yy = 7.93469 + (((tickAnim - 65) / 3) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 65) / 3) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = -34.21221 + (((tickAnim - 68) / 4) * (-34.96221-(-34.21221)));
            yy = 7.93469 + (((tickAnim - 68) / 4) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 68) / 4) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = -34.96221 + (((tickAnim - 72) / 3) * (-34.21221-(-34.96221)));
            yy = 7.93469 + (((tickAnim - 72) / 3) * (7.93469-(7.93469)));
            zz = 14.43554 + (((tickAnim - 72) / 3) * (14.43554-(14.43554)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -34.21221 + (((tickAnim - 75) / 30) * (0-(-34.21221)));
            yy = 7.93469 + (((tickAnim - 75) / 30) * (0-(7.93469)));
            zz = 14.43554 + (((tickAnim - 75) / 30) * (0-(14.43554)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0.225 + (((tickAnim - 38) / 37) * (0.125-(0.225)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.125 + (((tickAnim - 75) / 30) * (0-(0.125)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (13.75-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 13.75 + (((tickAnim - 48) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 52) / 3) * (13.75-(0)));
            yy = 0 + (((tickAnim - 52) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 3) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 13.75 + (((tickAnim - 55) / 3) * (0-(13.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 58) / 4) * (13.75-(0)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 13.75 + (((tickAnim - 62) / 3) * (0-(13.75)));
            yy = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 65) / 3) * (13.75-(0)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 13.75 + (((tickAnim - 68) / 4) * (0-(13.75)));
            yy = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 72) / 3) * (13.75-(0)));
            yy = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 85) {
            xx = 13.75 + (((tickAnim - 75) / 10) * (0-(13.75)));
            yy = 0 + (((tickAnim - 75) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 10) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-7.8046-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-2.36404-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (18.24484-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -7.8046 + (((tickAnim - 38) / 37) * (-7.8046-(-7.8046)));
            yy = -2.36404 + (((tickAnim - 38) / 37) * (-2.36404-(-2.36404)));
            zz = 18.24484 + (((tickAnim - 38) / 37) * (18.24484-(18.24484)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -7.8046 + (((tickAnim - 75) / 30) * (0-(-7.8046)));
            yy = -2.36404 + (((tickAnim - 75) / 30) * (0-(-2.36404)));
            zz = 18.24484 + (((tickAnim - 75) / 30) * (0-(18.24484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftWing.rotationPointX = this.leftWing.rotationPointX + (float)(0);
        this.leftWing.rotationPointY = this.leftWing.rotationPointY - (float)(0);
        this.leftWing.rotationPointZ = this.leftWing.rotationPointZ + (float)(0);


        this.leftMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (15.86668-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (3.34487-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-26.58189-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 15.86668 + (((tickAnim - 38) / 37) * (15.86668-(15.86668)));
            yy = 3.34487 + (((tickAnim - 38) / 37) * (3.34487-(3.34487)));
            zz = -26.58189 + (((tickAnim - 38) / 37) * (-26.58189-(-26.58189)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 15.86668 + (((tickAnim - 75) / 30) * (0-(15.86668)));
            yy = 3.34487 + (((tickAnim - 75) / 30) * (0-(3.34487)));
            zz = -26.58189 + (((tickAnim - 75) / 30) * (0-(-26.58189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -0.375 + (((tickAnim - 38) / 37) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = -0.375 + (((tickAnim - 75) / 30) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);



        this.leftMem2.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-5.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -5.5 + (((tickAnim - 38) / 37) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = -5.75 + (((tickAnim - 38) / 37) * (-5.75-(-5.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -5.5 + (((tickAnim - 75) / 30) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = -5.75 + (((tickAnim - 75) / 30) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -0.075 + (((tickAnim - 38) / 37) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = -0.075 + (((tickAnim - 75) / 30) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);



        this.leftMem3.rotationPointX = this.leftMem3.rotationPointX + (float)(0);
        this.leftMem3.rotationPointY = this.leftMem3.rotationPointY - (float)(0);
        this.leftMem3.rotationPointZ = this.leftMem3.rotationPointZ + (float)(-0.5);
        this.leftMem3.setScale((float)1,(float)1,(float)0);


        this.leftMem8.rotationPointX = this.leftMem8.rotationPointX + (float)(0);
        this.leftMem8.rotationPointY = this.leftMem8.rotationPointY - (float)(0);
        this.leftMem8.rotationPointZ = this.leftMem8.rotationPointZ + (float)(-4);
        this.leftMem8.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0.04581-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-1.41272-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (9.62848-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0.04581 + (((tickAnim - 38) / 37) * (0.04581-(0.04581)));
            yy = -1.41272 + (((tickAnim - 38) / 37) * (-1.41272-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 38) / 37) * (9.62848-(9.62848)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.04581 + (((tickAnim - 75) / 30) * (0-(0.04581)));
            yy = -1.41272 + (((tickAnim - 75) / 30) * (0-(-1.41272)));
            zz = 9.62848 + (((tickAnim - 75) / 30) * (0-(9.62848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -0.325 + (((tickAnim - 38) / 37) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = -0.325 + (((tickAnim - 75) / 30) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);



        this.leftMem4.setScale((float)0,(float)1,(float)0);


        this.leftMem5.rotationPointX = this.leftMem5.rotationPointX + (float)(0);
        this.leftMem5.rotationPointY = this.leftMem5.rotationPointY - (float)(-0.25);
        this.leftMem5.rotationPointZ = this.leftMem5.rotationPointZ + (float)(0);
        this.leftMem5.setScale((float)1,(float)0,(float)1);


        this.leftMem6.rotationPointX = this.leftMem6.rotationPointX + (float)(0);
        this.leftMem6.rotationPointY = this.leftMem6.rotationPointY - (float)(-0.25);
        this.leftMem6.rotationPointZ = this.leftMem6.rotationPointZ + (float)(0);
        this.leftMem6.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 12 + (((tickAnim - 38) / 37) * (12-(12)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 12 + (((tickAnim - 75) / 30) * (0-(12)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -9.75 + (((tickAnim - 38) / 37) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -9.75 + (((tickAnim - 75) / 30) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 6 + (((tickAnim - 38) / 37) * (6-(6)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 6 + (((tickAnim - 75) / 30) * (0-(6)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 12 + (((tickAnim - 38) / 37) * (12-(12)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 12 + (((tickAnim - 75) / 30) * (0-(12)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -9.75 + (((tickAnim - 38) / 37) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -9.75 + (((tickAnim - 75) / 30) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 6 + (((tickAnim - 38) / 37) * (6-(6)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 6 + (((tickAnim - 75) / 30) * (0-(6)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (-13.534-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (10.44413-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (26.6304+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*40-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = -13.534-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20 + (((tickAnim - 48) / 1) * (-0.534-(-13.534-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20)));
            yy = 10.44413 + (((tickAnim - 48) / 1) * (10.44413-(10.44413)));
            zz = 26.6304+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*40 + (((tickAnim - 48) / 1) * (53.6304-(26.6304+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*40)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -0.534 + (((tickAnim - 49) / 3) * (-0.5372-(-0.534)));
            yy = 10.44413 + (((tickAnim - 49) / 3) * (11.44352-(10.44413)));
            zz = 53.6304 + (((tickAnim - 49) / 3) * (53.59534-(53.6304)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -0.5372 + (((tickAnim - 52) / 3) * (-0.534-(-0.5372)));
            yy = 11.44352 + (((tickAnim - 52) / 3) * (10.44413-(11.44352)));
            zz = 53.59534 + (((tickAnim - 52) / 3) * (53.6304-(53.59534)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.534 + (((tickAnim - 55) / 3) * (-0.5372-(-0.534)));
            yy = 10.44413 + (((tickAnim - 55) / 3) * (11.44352-(10.44413)));
            zz = 53.6304 + (((tickAnim - 55) / 3) * (53.59534-(53.6304)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -0.5372 + (((tickAnim - 58) / 4) * (-0.534-(-0.5372)));
            yy = 11.44352 + (((tickAnim - 58) / 4) * (10.44413-(11.44352)));
            zz = 53.59534 + (((tickAnim - 58) / 4) * (53.6304-(53.59534)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = -0.534 + (((tickAnim - 62) / 3) * (-0.5372-(-0.534)));
            yy = 10.44413 + (((tickAnim - 62) / 3) * (11.44352-(10.44413)));
            zz = 53.6304 + (((tickAnim - 62) / 3) * (53.59534-(53.6304)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -0.5372 + (((tickAnim - 65) / 3) * (-0.534-(-0.5372)));
            yy = 11.44352 + (((tickAnim - 65) / 3) * (10.44413-(11.44352)));
            zz = 53.59534 + (((tickAnim - 65) / 3) * (53.6304-(53.59534)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = -0.534 + (((tickAnim - 68) / 4) * (-0.5372-(-0.534)));
            yy = 10.44413 + (((tickAnim - 68) / 4) * (11.44352-(10.44413)));
            zz = 53.6304 + (((tickAnim - 68) / 4) * (53.59534-(53.6304)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = -0.5372 + (((tickAnim - 72) / 3) * (-0.534-(-0.5372)));
            yy = 11.44352 + (((tickAnim - 72) / 3) * (10.44413-(11.44352)));
            zz = 53.59534 + (((tickAnim - 72) / 3) * (53.6304-(53.59534)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -0.534 + (((tickAnim - 75) / 20) * (0-(-0.534)));
            yy = 10.44413 + (((tickAnim - 75) / 20) * (0-(10.44413)));
            zz = 53.6304 + (((tickAnim - 75) / 20) * (0-(53.6304)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing.rotationPointX = this.rightWing.rotationPointX + (float)(xx);
        this.rightWing.rotationPointY = this.rightWing.rotationPointY - (float)(yy);
        this.rightWing.rotationPointZ = this.rightWing.rotationPointZ + (float)(zz);



        this.rightMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (5.36668-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-3.34487-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (26.58189-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 5.36668 + (((tickAnim - 38) / 11) * (2.36668-(5.36668)));
            yy = -3.34487 + (((tickAnim - 38) / 11) * (-3.34487-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 38) / 11) * (26.58189-(26.58189)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = 2.36668 + (((tickAnim - 49) / 26) * (2.36668-(2.36668)));
            yy = -3.34487 + (((tickAnim - 49) / 26) * (-3.34487-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 49) / 26) * (26.58189-(26.58189)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 2.36668 + (((tickAnim - 75) / 20) * (0-(2.36668)));
            yy = -3.34487 + (((tickAnim - 75) / 20) * (0-(-3.34487)));
            zz = 26.58189 + (((tickAnim - 75) / 20) * (0-(26.58189)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -0.375 + (((tickAnim - 38) / 37) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = -0.375 + (((tickAnim - 75) / 30) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (13.25-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 33) / 42) * (0-(0)));
            yy = 13.25 + (((tickAnim - 33) / 42) * (13.25-(13.25)));
            zz = 0 + (((tickAnim - 33) / 42) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 13.25 + (((tickAnim - 75) / 20) * (0-(13.25)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem2, rightMem2.rotateAngleX + (float) Math.toRadians(xx), rightMem2.rotateAngleY + (float) Math.toRadians(yy), rightMem2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 18) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 15) * (1-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 33) / 42) * (1-(1)));
            yy = 1 + (((tickAnim - 33) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 33) / 42) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (0-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-9.99093-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (16.69759-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-2.95348-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -9.99093 + (((tickAnim - 38) / 11) * (-1.02141-(-9.99093)));
            yy = 16.69759 + (((tickAnim - 38) / 11) * (17.99513-(16.69759)));
            zz = -2.95348 + (((tickAnim - 38) / 11) * (-3.88756-(-2.95348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem7, rightMem7.rotateAngleX + (float) Math.toRadians(xx), rightMem7.rotateAngleY + (float) Math.toRadians(yy), rightMem7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0.4-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-0.725-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 49) {
            xx = 0.4 + (((tickAnim - 33) / 16) * (0.3-(0.4)));
            yy = 0 + (((tickAnim - 33) / 16) * (0-(0)));
            zz = -0.725 + (((tickAnim - 33) / 16) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem7.rotationPointX = this.rightMem7.rotationPointX + (float)(xx);
        this.rightMem7.rotationPointY = this.rightMem7.rotationPointY - (float)(yy);
        this.rightMem7.rotationPointZ = this.rightMem7.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 1 + (((tickAnim - 0) / 33) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.9333-(0)));
            zz = 0.8 + (((tickAnim - 0) / 33) * (1.2067-(0.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 33) / 16) * (1-(1)));
            yy = 0.9333 + (((tickAnim - 33) / 16) * (1-(0.9333)));
            zz = 1.2067 + (((tickAnim - 33) / 16) * (1-(1.2067)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem7.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-16.65895-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (7.5274-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (14.46624-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -16.65895 + (((tickAnim - 38) / 11) * (-20.65895-(-16.65895)));
            yy = 7.5274 + (((tickAnim - 38) / 11) * (7.5274-(7.5274)));
            zz = 14.46624 + (((tickAnim - 38) / 11) * (14.46624-(14.46624)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = -20.65895 + (((tickAnim - 49) / 26) * (-20.65895-(-20.65895)));
            yy = 7.5274 + (((tickAnim - 49) / 26) * (7.5274-(7.5274)));
            zz = 14.46624 + (((tickAnim - 49) / 26) * (14.46624-(14.46624)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -20.65895 + (((tickAnim - 75) / 20) * (0-(-20.65895)));
            yy = 7.5274 + (((tickAnim - 75) / 20) * (0-(7.5274)));
            zz = 14.46624 + (((tickAnim - 75) / 20) * (0-(14.46624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (-0.02-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            yy = -0.02 + (((tickAnim - 49) / 26) * (-0.02-(-0.02)));
            zz = 0 + (((tickAnim - 49) / 26) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = -0.02 + (((tickAnim - 75) / 20) * (0-(-0.02)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -7.5 + (((tickAnim - 38) / 37) * (-7.5-(-7.5)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = -7.5 + (((tickAnim - 75) / 20) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem3, rightMem3.rotateAngleX + (float) Math.toRadians(xx), rightMem3.rotateAngleY + (float) Math.toRadians(yy), rightMem3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 38) * (0-(-0.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 20) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem3.rotationPointX = this.rightMem3.rotationPointX + (float)(xx);
        this.rightMem3.rotationPointY = this.rightMem3.rotationPointY - (float)(yy);
        this.rightMem3.rotationPointZ = this.rightMem3.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 20) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 37) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem3.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (15.5-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = 15.5 + (((tickAnim - 38) / 37) * (15.5-(15.5)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 15.5 + (((tickAnim - 75) / 20) * (0-(15.5)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem8, rightMem8.rotateAngleX + (float) Math.toRadians(xx), rightMem8.rotateAngleY + (float) Math.toRadians(yy), rightMem8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 18) * (0-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 18) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 20) * (0.175-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (-0.425-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = 0.175 + (((tickAnim - 38) / 37) * (0.175-(0.175)));
            zz = -0.425 + (((tickAnim - 38) / 37) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 0.175 + (((tickAnim - 75) / 20) * (0-(0.175)));
            zz = -0.425 + (((tickAnim - 75) / 20) * (-5-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem8.rotationPointX = this.rightMem8.rotationPointX + (float)(xx);
        this.rightMem8.rotationPointY = this.rightMem8.rotationPointY - (float)(yy);
        this.rightMem8.rotationPointZ = this.rightMem8.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 20) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 37) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem8.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-194.54358-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-11.32579-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (8.95242-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = -194.54358 + (((tickAnim - 38) / 37) * (-194.54358-(-194.54358)));
            yy = -11.32579 + (((tickAnim - 38) / 37) * (-11.32579-(-11.32579)));
            zz = 8.95242 + (((tickAnim - 38) / 37) * (8.95242-(8.95242)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -194.54358 + (((tickAnim - 75) / 20) * (0-(-194.54358)));
            yy = -11.32579 + (((tickAnim - 75) / 20) * (0-(-11.32579)));
            zz = 8.95242 + (((tickAnim - 75) / 20) * (0-(8.95242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 38) / 37) * (0-(0)));
            yy = -0.325 + (((tickAnim - 38) / 37) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 38) / 37) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 75) / 20) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-77.8869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-7.76205-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (16.35052-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -77.8869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 38) / 11) * (-66.33468-(-77.8869-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = -7.76205 + (((tickAnim - 38) / 11) * (0-(-7.76205)));
            zz = 16.35052 + (((tickAnim - 38) / 11) * (0-(16.35052)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = -66.33468 + (((tickAnim - 49) / 26) * (-66.33468-(-66.33468)));
            yy = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 26) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = -66.33468 + (((tickAnim - 75) / 7) * (-37.75205-(-66.33468)));
            yy = 0 + (((tickAnim - 75) / 7) * (-7.30495-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (9.56911-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 95) {
            xx = -37.75205 + (((tickAnim - 82) / 13) * (0-(-37.75205)));
            yy = -7.30495 + (((tickAnim - 82) / 13) * (0-(-7.30495)));
            zz = 9.56911 + (((tickAnim - 82) / 13) * (0-(9.56911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 18) * (1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 20) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 37) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (0-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem4.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem9.rotationPointX = this.rightMem9.rotationPointX + (float)(xx);
        this.rightMem9.rotationPointY = this.rightMem9.rotationPointY - (float)(yy);
        this.rightMem9.rotationPointZ = this.rightMem9.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-29.52-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 49) {
            xx = -29.52 + (((tickAnim - 20) / 29) * (-83-(-29.52)));
            yy = 0 + (((tickAnim - 20) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 29) * (-7-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = -83 + (((tickAnim - 49) / 26) * (-83-(-83)));
            yy = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            zz = -7 + (((tickAnim - 49) / 26) * (-7-(-7)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -83 + (((tickAnim - 75) / 20) * (0-(-83)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = -7 + (((tickAnim - 75) / 20) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (8.5-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 8.5 + (((tickAnim - 48) / 27) * (8.5-(8.5)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 8.5 + (((tickAnim - 75) / 20) * (0-(8.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem5, rightMem5.rotateAngleX + (float) Math.toRadians(xx), rightMem5.rotateAngleY + (float) Math.toRadians(yy), rightMem5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 38) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            yy = -0.075 + (((tickAnim - 48) / 27) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 75) / 20) * (-0.5-(-0.075)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem5.rotationPointX = this.rightMem5.rotationPointX + (float)(xx);
        this.rightMem5.rotationPointY = this.rightMem5.rotationPointY - (float)(yy);
        this.rightMem5.rotationPointZ = this.rightMem5.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 20) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 37) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (0-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem5.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem10.rotationPointX = this.rightMem10.rotationPointX + (float)(xx);
        this.rightMem10.rotationPointY = this.rightMem10.rotationPointY - (float)(yy);
        this.rightMem10.rotationPointZ = this.rightMem10.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (53.94-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 49) {
            xx = 53.94 + (((tickAnim - 29) / 20) * (0-(53.94)));
            yy = 0 + (((tickAnim - 29) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 20) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 26) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 75) / 8) * (39-(0)));
            yy = 0 + (((tickAnim - 75) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 8) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 95) {
            xx = 39 + (((tickAnim - 83) / 12) * (0-(39)));
            yy = 0 + (((tickAnim - 83) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing6, rightWing6.rotateAngleX + (float) Math.toRadians(xx), rightWing6.rotateAngleY + (float) Math.toRadians(yy), rightWing6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (6.25-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            zz = 6.25 + (((tickAnim - 48) / 27) * (6.25-(6.25)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 6.25 + (((tickAnim - 75) / 20) * (0-(6.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem6, rightMem6.rotateAngleX + (float) Math.toRadians(xx), rightMem6.rotateAngleY + (float) Math.toRadians(yy), rightMem6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 38) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 38) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 10) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 38) / 10) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 48) / 27) * (0-(0)));
            yy = -0.125 + (((tickAnim - 48) / 27) * (-0.125-(-0.125)));
            zz = 0 + (((tickAnim - 48) / 27) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = -0.125 + (((tickAnim - 75) / 20) * (-0.5-(-0.125)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem6.rotationPointX = this.rightMem6.rotationPointX + (float)(xx);
        this.rightMem6.rotationPointY = this.rightMem6.rotationPointY - (float)(yy);
        this.rightMem6.rotationPointZ = this.rightMem6.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 18) / 20) * (1-(1)));
        }
        else if (tickAnim >= 38 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            yy = 1 + (((tickAnim - 38) / 37) * (1-(1)));
            zz = 1 + (((tickAnim - 38) / 37) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 1 + (((tickAnim - 75) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 20) * (0-(1)));
            zz = 1 + (((tickAnim - 75) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightMem6.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightMem11.rotationPointX = this.rightMem11.rotationPointX + (float)(xx);
        this.rightMem11.rotationPointY = this.rightMem11.rotationPointY - (float)(yy);
        this.rightMem11.rotationPointZ = this.rightMem11.rotationPointZ + (float)(zz);


    }
    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 2.5 + (((tickAnim - 60) / 58) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 58) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 2.5 + (((tickAnim - 118) / 22) * (0-(2.5)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            yy = -1.75 + (((tickAnim - 60) / 58) * (-1.75-(-1.75)));
            zz = 0 + (((tickAnim - 60) / 58) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            yy = -1.75 + (((tickAnim - 118) / 22) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 21 + (((tickAnim - 80) / 20) * (27-(21)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 27 + (((tickAnim - 100) / 18) * (17.25-(27)));
            yy = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 17.25 + (((tickAnim - 118) / 22) * (0-(17.25)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.775-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = -0.775 + (((tickAnim - 60) / 58) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = -0.775 + (((tickAnim - 118) / 22) * (0-(-0.775)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (-1.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 100) {
            xx = -1.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*20 + (((tickAnim - 30) / 70) * (32.5-(-1.275-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*20)));
            yy = 0 + (((tickAnim - 30) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 70) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 123) {
            xx = 32.5 + (((tickAnim - 100) / 23) * (-27.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*50-(32.5)));
            yy = 0 + (((tickAnim - 100) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 23) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 140) {
            xx = -27.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*50 + (((tickAnim - 123) / 17) * (0-(-27.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*50)));
            yy = 0 + (((tickAnim - 123) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-20.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -20.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50 + (((tickAnim - 30) / 50) * (25.74101-(-20.605-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-50)));
            yy = 0 + (((tickAnim - 30) / 50) * (-0.05158-(0)));
            zz = 0 + (((tickAnim - 30) / 50) * (0.19324-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 25.74101 + (((tickAnim - 80) / 20) * (18.74101-(25.74101)));
            yy = -0.05158 + (((tickAnim - 80) / 20) * (-0.05158-(-0.05158)));
            zz = 0.19324 + (((tickAnim - 80) / 20) * (0.19324-(0.19324)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 18.74101 + (((tickAnim - 100) / 40) * (0-(18.74101)));
            yy = -0.05158 + (((tickAnim - 100) / 40) * (0-(-0.05158)));
            zz = 0.19324 + (((tickAnim - 100) / 40) * (0-(0.19324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-1 + (((tickAnim - 18) / 12) * (0.25-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 30) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 50) * (0.05-(0)));
            zz = 0.25 + (((tickAnim - 30) / 50) * (-0.55-(0.25)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0.05 + (((tickAnim - 80) / 20) * (0-(0.05)));
            zz = -0.55 + (((tickAnim - 80) / 20) * (0-(-0.55)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 100) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 18) * (0.05-(0)));
            zz = 0 + (((tickAnim - 100) / 18) * (-0.05-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            yy = 0.05 + (((tickAnim - 118) / 22) * (0-(0.05)));
            zz = -0.05 + (((tickAnim - 118) / 22) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 21.75 + (((tickAnim - 30) / 30) * (10.5-(21.75)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10.5 + (((tickAnim - 60) / 20) * (20-(10.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 20 + (((tickAnim - 80) / 30) * (38.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40-(20)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 38.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40 + (((tickAnim - 110) / 30) * (0-(38.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-40)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 30.25 + (((tickAnim - 30) / 30) * (10-(30.25)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (-15.75-(10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -15.75 + (((tickAnim - 80) / 20) * (-46.25-(-15.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -46.25 + (((tickAnim - 100) / 10) * (-69-(-46.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 116) {
            xx = -69 + (((tickAnim - 110) / 6) * (-69-(-69)));
            yy = 0 + (((tickAnim - 110) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 6) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 140) {
            xx = -69 + (((tickAnim - 116) / 24) * (0-(-69)));
            yy = 0 + (((tickAnim - 116) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 30) / 88) * (0-(0)));
            yy = -0.225 + (((tickAnim - 30) / 88) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 30) / 88) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            yy = -0.225 + (((tickAnim - 118) / 22) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (7.25-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 7.25 + (((tickAnim - 80) / 10) * (19.25-(7.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 19.25 + (((tickAnim - 90) / 10) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 105) {
            xx = 19.25 + (((tickAnim - 100) / 5) * (0-(19.25)));
            yy = 0 + (((tickAnim - 100) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 5) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 105) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 105) / 9) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 105) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 9) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 118) {
            xx = -4.5 + (((tickAnim - 114) / 4) * (-1.56-(-4.5)));
            yy = 0 + (((tickAnim - 114) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 4) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = -1.56 + (((tickAnim - 118) / 22) * (0-(-1.56)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 105) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 105) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 114) {
            xx = 0 + (((tickAnim - 105) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 9) * (0.25-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 114) / 26) * (0-(0)));
            zz = 0.25 + (((tickAnim - 114) / 26) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-11.12007-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-7.16121-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-29.23216-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -11.12007 + (((tickAnim - 60) / 20) * (-11.111-(-11.12007)));
            yy = -7.16121 + (((tickAnim - 60) / 20) * (-13.88639-(-7.16121)));
            zz = -29.23216 + (((tickAnim - 60) / 20) * (-31.83389-(-29.23216)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -11.111 + (((tickAnim - 80) / 20) * (-11.02667-(-11.111)));
            yy = -13.88639 + (((tickAnim - 80) / 20) * (-20.08831-(-13.88639)));
            zz = -31.83389 + (((tickAnim - 80) / 20) * (-35.59766-(-31.83389)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = -11.02667 + (((tickAnim - 100) / 18) * (-10.25362-(-11.02667)));
            yy = -20.08831 + (((tickAnim - 100) / 18) * (-9.38254-(-20.08831)));
            zz = -35.59766 + (((tickAnim - 100) / 18) * (-28.32523-(-35.59766)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -10.25362 + (((tickAnim - 118) / 5) * (-6.84021-(-10.25362)));
            yy = -9.38254 + (((tickAnim - 118) / 5) * (-8.49488-(-9.38254)));
            zz = -28.32523 + (((tickAnim - 118) / 5) * (-26.49149-(-28.32523)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -6.84021 + (((tickAnim - 123) / 5) * (-4.32889-(-6.84021)));
            yy = -8.49488 + (((tickAnim - 123) / 5) * (-1.84284-(-8.49488)));
            zz = -26.49149 + (((tickAnim - 123) / 5) * (13.42317-(-26.49149)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = -4.32889 + (((tickAnim - 128) / 12) * (0-(-4.32889)));
            yy = -1.84284 + (((tickAnim - 128) / 12) * (0-(-1.84284)));
            zz = 13.42317 + (((tickAnim - 128) / 12) * (0-(13.42317)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftWing.rotationPointX = this.leftWing.rotationPointX + (float)(0);
        this.leftWing.rotationPointY = this.leftWing.rotationPointY - (float)(0);
        this.leftWing.rotationPointZ = this.leftWing.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-29.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -29.25 + (((tickAnim - 60) / 50) * (-29.25-(-29.25)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -29.25 + (((tickAnim - 110) / 30) * (0-(-29.25)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftMem, leftMem.rotateAngleX + (float) Math.toRadians(xx), leftMem.rotateAngleY + (float) Math.toRadians(yy), leftMem.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = -1.5 + (((tickAnim - 60) / 58) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 118) / 5) * (-9.09122-(0)));
            yy = 0 + (((tickAnim - 118) / 5) * (0.82281-(0)));
            zz = -1.5 + (((tickAnim - 118) / 5) * (23.19339-(-1.5)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -9.09122 + (((tickAnim - 123) / 5) * (-18.09807-(-9.09122)));
            yy = 0.82281 + (((tickAnim - 123) / 5) * (-1.97851-(0.82281)));
            zz = 23.19339 + (((tickAnim - 123) / 5) * (-9.00033-(23.19339)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = -18.09807 + (((tickAnim - 128) / 12) * (0-(-18.09807)));
            yy = -1.97851 + (((tickAnim - 128) / 12) * (0-(-1.97851)));
            zz = -9.00033 + (((tickAnim - 128) / 12) * (0-(-9.00033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(0);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(0);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(0);


        this.leftMem2.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7.63314-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.98983-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (31.79462-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -7.63314 + (((tickAnim - 60) / 40) * (-7.63314-(-7.63314)));
            yy = -1.98983 + (((tickAnim - 60) / 40) * (-1.98983-(-1.98983)));
            zz = 31.79462 + (((tickAnim - 60) / 40) * (31.79462-(31.79462)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = -7.63314 + (((tickAnim - 100) / 18) * (-6.93415-(-7.63314)));
            yy = -1.98983 + (((tickAnim - 100) / 18) * (0.29116-(-1.98983)));
            zz = 31.79462 + (((tickAnim - 100) / 18) * (22.0326-(31.79462)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -6.93415 + (((tickAnim - 118) / 5) * (36.5-(-6.93415)));
            yy = 0.29116 + (((tickAnim - 118) / 5) * (0-(0.29116)));
            zz = 22.0326 + (((tickAnim - 118) / 5) * (0-(22.0326)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 36.5 + (((tickAnim - 123) / 5) * (40.29533-(36.5)));
            yy = 0 + (((tickAnim - 123) / 5) * (3.0342-(0)));
            zz = 0 + (((tickAnim - 123) / 5) * (2.22276-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 40.29533 + (((tickAnim - 128) / 12) * (0-(40.29533)));
            yy = 3.0342 + (((tickAnim - 128) / 12) * (0-(3.0342)));
            zz = 2.22276 + (((tickAnim - 128) / 12) * (0-(2.22276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(0);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(0);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(0);


        this.leftMem3.setScale((float)1,(float)1,(float)0);


        this.leftMem8.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 0) / 105) * (-0.2578-(0)));
            yy = 0 + (((tickAnim - 0) / 105) * (-4.12587-(0)));
            zz = 0 + (((tickAnim - 0) / 105) * (1.42153-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = -0.2578 + (((tickAnim - 105) / 13) * (-0.07609-(-0.2578)));
            yy = -4.12587 + (((tickAnim - 105) / 13) * (-3.89324-(-4.12587)));
            zz = 1.42153 + (((tickAnim - 105) / 13) * (-2.84715-(1.42153)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -0.07609 + (((tickAnim - 118) / 5) * (-14.36564-(-0.07609)));
            yy = -3.89324 + (((tickAnim - 118) / 5) * (-16.02238-(-3.89324)));
            zz = -2.84715 + (((tickAnim - 118) / 5) * (50.07214-(-2.84715)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -14.36564 + (((tickAnim - 123) / 5) * (1.3218-(-14.36564)));
            yy = -16.02238 + (((tickAnim - 123) / 5) * (-28.49138-(-16.02238)));
            zz = 50.07214 + (((tickAnim - 123) / 5) * (-14.03596-(50.07214)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 1.3218 + (((tickAnim - 128) / 12) * (0-(1.3218)));
            yy = -28.49138 + (((tickAnim - 128) / 12) * (0-(-28.49138)));
            zz = -14.03596 + (((tickAnim - 128) / 12) * (0-(-14.03596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 118) / 5) * (0.525-(0)));
            yy = 0 + (((tickAnim - 118) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 118) / 5) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 140) {
            xx = 0.525 + (((tickAnim - 123) / 17) * (0-(0.525)));
            yy = 0.7 + (((tickAnim - 123) / 17) * (0-(0.7)));
            zz = 0 + (((tickAnim - 123) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);



        this.leftMem4.rotationPointX = this.leftMem4.rotationPointX + (float)(-0.5);
        this.leftMem4.rotationPointY = this.leftMem4.rotationPointY - (float)(0);
        this.leftMem4.rotationPointZ = this.leftMem4.rotationPointZ + (float)(0);
        this.leftMem4.setScale((float)0,(float)1,(float)0);


        this.leftMem5.rotationPointX = this.leftMem5.rotationPointX + (float)(0);
        this.leftMem5.rotationPointY = this.leftMem5.rotationPointY - (float)(-0.25);
        this.leftMem5.rotationPointZ = this.leftMem5.rotationPointZ + (float)(0);
        this.leftMem5.setScale((float)1,(float)0,(float)1);


        this.leftMem6.rotationPointX = this.leftMem6.rotationPointX + (float)(0);
        this.leftMem6.rotationPointY = this.leftMem6.rotationPointY - (float)(-0.25);
        this.leftMem6.rotationPointZ = this.leftMem6.rotationPointZ + (float)(0);
        this.leftMem6.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-34.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -8.75 + (((tickAnim - 15) / 45) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = -34.5 + (((tickAnim - 15) / 45) * (-34.5-(-34.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = -8.75 + (((tickAnim - 60) / 58) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = -34.5 + (((tickAnim - 60) / 58) * (-34.5-(-34.5)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = -8.75 + (((tickAnim - 118) / 10) * (-12.45895-(-8.75)));
            yy = 0 + (((tickAnim - 118) / 10) * (-1.31923-(0)));
            zz = -34.5 + (((tickAnim - 118) / 10) * (19.91005-(-34.5)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = -12.45895 + (((tickAnim - 128) / 12) * (0-(-12.45895)));
            yy = -1.31923 + (((tickAnim - 128) / 12) * (0-(-1.31923)));
            zz = 19.91005 + (((tickAnim - 128) / 12) * (0-(19.91005)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 18 + (((tickAnim - 8) / 7) * (-8.5-(18)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = -8.5 + (((tickAnim - 15) / 45) * (0.08642-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 45) * (6.82841-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (-4.17375-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0.08642 + (((tickAnim - 60) / 58) * (0.08642-(0.08642)));
            yy = 6.82841 + (((tickAnim - 60) / 58) * (6.82841-(6.82841)));
            zz = -4.17375 + (((tickAnim - 60) / 58) * (-4.17375-(-4.17375)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 0.08642 + (((tickAnim - 118) / 5) * (43.06146-(0.08642)));
            yy = 6.82841 + (((tickAnim - 118) / 5) * (7.32913-(6.82841)));
            zz = -4.17375 + (((tickAnim - 118) / 5) * (-12.29079-(-4.17375)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 43.06146 + (((tickAnim - 123) / 5) * (23.46379-(43.06146)));
            yy = 7.32913 + (((tickAnim - 123) / 5) * (3.39362-(7.32913)));
            zz = -12.29079 + (((tickAnim - 123) / 5) * (-16.14041-(-12.29079)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 23.46379 + (((tickAnim - 128) / 12) * (0-(23.46379)));
            yy = 3.39362 + (((tickAnim - 128) / 12) * (0-(3.39362)));
            zz = -16.14041 + (((tickAnim - 128) / 12) * (0-(-16.14041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 118) / 5) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 118) / 5) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 118) / 5) * (0.5-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -0.325 + (((tickAnim - 123) / 5) * (0-(-0.325)));
            yy = -0.675 + (((tickAnim - 123) / 5) * (0-(-0.675)));
            zz = 0.5 + (((tickAnim - 123) / 5) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (34.18922-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (8.04639-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.10096-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 34.18922 + (((tickAnim - 3) / 5) * (78.11325-(34.18922)));
            yy = 8.04639 + (((tickAnim - 3) / 5) * (18.10437-(8.04639)));
            zz = 3.10096 + (((tickAnim - 3) / 5) * (6.97715-(3.10096)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 78.11325 + (((tickAnim - 8) / 3) * (74.05247-(78.11325)));
            yy = 18.10437 + (((tickAnim - 8) / 3) * (26.15076-(18.10437)));
            zz = 6.97715 + (((tickAnim - 8) / 3) * (10.07811-(6.97715)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 74.05247 + (((tickAnim - 11) / 4) * (21.7265-(74.05247)));
            yy = 26.15076 + (((tickAnim - 11) / 4) * (36.20875-(26.15076)));
            zz = 10.07811 + (((tickAnim - 11) / 4) * (13.95431-(10.07811)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 21.7265 + (((tickAnim - 15) / 45) * (4.82889-(21.7265)));
            yy = 36.20875 + (((tickAnim - 15) / 45) * (39.56782-(36.20875)));
            zz = 13.95431 + (((tickAnim - 15) / 45) * (16.02406-(13.95431)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 4.82889 + (((tickAnim - 60) / 58) * (4.82889-(4.82889)));
            yy = 39.56782 + (((tickAnim - 60) / 58) * (39.56782-(39.56782)));
            zz = 16.02406 + (((tickAnim - 60) / 58) * (16.02406-(16.02406)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 4.82889 + (((tickAnim - 118) / 5) * (69.66444-(4.82889)));
            yy = 39.56782 + (((tickAnim - 118) / 5) * (19.78391-(39.56782)));
            zz = 16.02406 + (((tickAnim - 118) / 5) * (8.01203-(16.02406)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 69.66444 + (((tickAnim - 123) / 5) * (-10.36495-(69.66444)));
            yy = 19.78391 + (((tickAnim - 123) / 5) * (2.98453-(19.78391)));
            zz = 8.01203 + (((tickAnim - 123) / 5) * (2.68838-(8.01203)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = -10.36495 + (((tickAnim - 128) / 12) * (0-(-10.36495)));
            yy = 2.98453 + (((tickAnim - 128) / 12) * (0-(2.98453)));
            zz = 2.68838 + (((tickAnim - 128) / 12) * (0-(2.68838)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.435-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 3) * (0.945-(0.575)));
            zz = 0.435 + (((tickAnim - 8) / 3) * (0.39-(0.435)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.945 + (((tickAnim - 11) / 4) * (0-(0.945)));
            zz = 0.39 + (((tickAnim - 11) / 4) * (0.325-(0.39)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0.325 + (((tickAnim - 15) / 45) * (0.325-(0.325)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = 0.325 + (((tickAnim - 60) / 58) * (0.325-(0.325)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 118) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 5) * (0.525-(0)));
            zz = 0.325 + (((tickAnim - 118) / 5) * (0.16-(0.325)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 123) / 5) * (0-(0.525)));
            zz = 0.16 + (((tickAnim - 123) / 5) * (-0.175-(0.16)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = -0.175 + (((tickAnim - 128) / 12) * (0-(-0.175)));
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
            xx = 0 + (((tickAnim - 0) / 30) * (-10.72005-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.47587-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.95499-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -10.72005 + (((tickAnim - 30) / 8) * (-11.00785-(-10.72005)));
            yy = -0.47587 + (((tickAnim - 30) / 8) * (-2.6025-(-0.47587)));
            zz = 1.95499 + (((tickAnim - 30) / 8) * (27.77215-(1.95499)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -11.00785 + (((tickAnim - 38) / 7) * (-8.75-(-11.00785)));
            yy = -2.6025 + (((tickAnim - 38) / 7) * (0-(-2.6025)));
            zz = 27.77215 + (((tickAnim - 38) / 7) * (34.5-(27.77215)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -8.75 + (((tickAnim - 45) / 15) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 34.5 + (((tickAnim - 45) / 15) * (34.5-(34.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = -8.75 + (((tickAnim - 60) / 58) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = 34.5 + (((tickAnim - 60) / 58) * (34.5-(34.5)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = -8.75 + (((tickAnim - 118) / 22) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 34.5 + (((tickAnim - 118) / 22) * (0-(34.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (17.74922-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.62158-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-6.05541-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 17.74922 + (((tickAnim - 30) / 8) * (18-(17.74922)));
            yy = 2.62158 + (((tickAnim - 30) / 8) * (0-(2.62158)));
            zz = -6.05541 + (((tickAnim - 30) / 8) * (0-(-6.05541)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 38) / 7) * (-4.49389-(18)));
            yy = 0 + (((tickAnim - 38) / 7) * (-1.8179-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (1.32586-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -4.49389 + (((tickAnim - 45) / 15) * (0.58921-(-4.49389)));
            yy = -1.8179 + (((tickAnim - 45) / 15) * (-9.68086-(-1.8179)));
            zz = 1.32586 + (((tickAnim - 45) / 15) * (-1.00784-(1.32586)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0.58921 + (((tickAnim - 60) / 58) * (0.58921-(0.58921)));
            yy = -9.68086 + (((tickAnim - 60) / 58) * (-9.68086-(-9.68086)));
            zz = -1.00784 + (((tickAnim - 60) / 58) * (-1.00784-(-1.00784)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0.58921 + (((tickAnim - 118) / 22) * (0-(0.58921)));
            yy = -9.68086 + (((tickAnim - 118) / 22) * (0-(-9.68086)));
            zz = -1.00784 + (((tickAnim - 118) / 22) * (0-(-1.00784)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = -0.125 + (((tickAnim - 30) / 15) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 45) / 95) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 95) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -9.75 + (((tickAnim - 30) / 3) * (34.18922-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 3) * (-8.04639-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (-3.10096-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 34.18922 + (((tickAnim - 33) / 5) * (78.11325-(34.18922)));
            yy = -8.04639 + (((tickAnim - 33) / 5) * (-18.10437-(-8.04639)));
            zz = -3.10096 + (((tickAnim - 33) / 5) * (-6.97715-(-3.10096)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 78.11325 + (((tickAnim - 38) / 3) * (33.30247-(78.11325)));
            yy = -18.10437 + (((tickAnim - 38) / 3) * (-26.15076-(-18.10437)));
            zz = -6.97715 + (((tickAnim - 38) / 3) * (-10.07811-(-6.97715)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 33.30247 + (((tickAnim - 41) / 4) * (14.7265-(33.30247)));
            yy = -26.15076 + (((tickAnim - 41) / 4) * (-36.20875-(-26.15076)));
            zz = -10.07811 + (((tickAnim - 41) / 4) * (-13.95431-(-10.07811)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 14.7265 + (((tickAnim - 45) / 15) * (3.28704-(14.7265)));
            yy = -36.20875 + (((tickAnim - 45) / 15) * (-37.4122-(-36.20875)));
            zz = -13.95431 + (((tickAnim - 45) / 15) * (-12.86478-(-13.95431)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 3.28704 + (((tickAnim - 60) / 58) * (3.28704-(3.28704)));
            yy = -37.4122 + (((tickAnim - 60) / 58) * (-37.4122-(-37.4122)));
            zz = -12.86478 + (((tickAnim - 60) / 58) * (-12.86478-(-12.86478)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 3.28704 + (((tickAnim - 118) / 22) * (0-(3.28704)));
            yy = -37.4122 + (((tickAnim - 118) / 22) * (0-(-37.4122)));
            zz = -12.86478 + (((tickAnim - 118) / 22) * (0-(-12.86478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0.435-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 38) / 3) * (0.42-(0.575)));
            zz = 0.435 + (((tickAnim - 38) / 3) * (0.39-(0.435)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 41) / 4) * (-0.225-(0)));
            yy = 0.42 + (((tickAnim - 41) / 4) * (0.4-(0.42)));
            zz = 0.39 + (((tickAnim - 41) / 4) * (0.475-(0.39)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = -0.225 + (((tickAnim - 45) / 15) * (0-(-0.225)));
            yy = 0.4 + (((tickAnim - 45) / 15) * (0-(0.4)));
            zz = 0.475 + (((tickAnim - 45) / 15) * (0.325-(0.475)));
        }
        else if (tickAnim >= 60 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 58) * (0-(0)));
            zz = 0.325 + (((tickAnim - 60) / 58) * (0.325-(0.325)));
        }
        else if (tickAnim >= 118 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 22) * (0-(0)));
            zz = 0.325 + (((tickAnim - 118) / 22) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.62754-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.5498-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (26.42633-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -3.62754 + (((tickAnim - 15) / 8) * (-7.49906-(-3.62754)));
            yy = 3.5498 + (((tickAnim - 15) / 8) * (6.81308-(3.5498)));
            zz = 26.42633 + (((tickAnim - 15) / 8) * (40.01771-(26.42633)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -7.49906 + (((tickAnim - 23) / 7) * (-10.99226-(-7.49906)));
            yy = 6.81308 + (((tickAnim - 23) / 7) * (3.39423-(6.81308)));
            zz = 40.01771 + (((tickAnim - 23) / 7) * (12.39497-(40.01771)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -10.99226 + (((tickAnim - 30) / 30) * (-11.16631-(-10.99226)));
            yy = 3.39423 + (((tickAnim - 30) / 30) * (6.67001-(3.39423)));
            zz = 12.39497 + (((tickAnim - 30) / 30) * (27.03594-(12.39497)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -11.16631 + (((tickAnim - 60) / 20) * (-11.111-(-11.16631)));
            yy = 6.67001 + (((tickAnim - 60) / 20) * (13.88639-(6.67001)));
            zz = 27.03594 + (((tickAnim - 60) / 20) * (31.83389-(27.03594)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -11.111 + (((tickAnim - 80) / 20) * (-11.45825-(-11.111)));
            yy = 13.88639 + (((tickAnim - 80) / 20) * (19.70332-(13.88639)));
            zz = 31.83389 + (((tickAnim - 80) / 20) * (33.83682-(31.83389)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = -11.45825 + (((tickAnim - 100) / 18) * (-10.34397-(-11.45825)));
            yy = 19.70332 + (((tickAnim - 100) / 18) * (9.0767-(19.70332)));
            zz = 33.83682 + (((tickAnim - 100) / 18) * (26.85396-(33.83682)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = -10.34397 + (((tickAnim - 118) / 10) * (-5.3727-(-10.34397)));
            yy = 9.0767 + (((tickAnim - 118) / 10) * (3.85909-(9.0767)));
            zz = 26.85396 + (((tickAnim - 118) / 10) * (6.0199-(26.85396)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = -5.3727 + (((tickAnim - 128) / 6) * (-3.56565-(-5.3727)));
            yy = 3.85909 + (((tickAnim - 128) / 6) * (3.21862-(3.85909)));
            zz = 6.0199 + (((tickAnim - 128) / 6) * (18.98234-(6.0199)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = -3.56565 + (((tickAnim - 134) / 6) * (0-(-3.56565)));
            yy = 3.21862 + (((tickAnim - 134) / 6) * (0-(3.21862)));
            zz = 18.98234 + (((tickAnim - 134) / 6) * (0-(18.98234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (29.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = 29.25 + (((tickAnim - 60) / 50) * (29.25-(29.25)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 29.25 + (((tickAnim - 110) / 30) * (0-(29.25)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightMem, rightMem.rotateAngleX + (float) Math.toRadians(xx), rightMem.rotateAngleY + (float) Math.toRadians(yy), rightMem.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-35.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = -35.25 + (((tickAnim - 15) / 8) * (-16.375-(-35.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -13.5 + (((tickAnim - 23) / 7) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = -16.375 + (((tickAnim - 23) / 7) * (2.5-(-16.375)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 2.5 + (((tickAnim - 30) / 30) * (5.5-(2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 5.5 + (((tickAnim - 60) / 20) * (0-(5.5)));
        }
        else if (tickAnim >= 80 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 38) * (2.5-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 118) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 10) * (0-(0)));
            zz = 2.5 + (((tickAnim - 118) / 10) * (18.85-(2.5)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 128) / 6) * (-21.37442-(0)));
            yy = 0 + (((tickAnim - 128) / 6) * (-1.45392-(0)));
            zz = 18.85 + (((tickAnim - 128) / 6) * (-19.54169-(18.85)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = -21.37442 + (((tickAnim - 134) / 6) * (0-(-21.37442)));
            yy = -1.45392 + (((tickAnim - 134) / 6) * (0-(-1.45392)));
            zz = -19.54169 + (((tickAnim - 134) / 6) * (0-(-19.54169)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem2.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.56519-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.09243-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.54987-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -1.56519 + (((tickAnim - 15) / 8) * (14.52104-(-1.56519)));
            yy = -4.09243 + (((tickAnim - 15) / 8) * (1.35581-(-4.09243)));
            zz = 5.54987 + (((tickAnim - 15) / 8) * (-19.46766-(5.54987)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 14.52104 + (((tickAnim - 23) / 7) * (-6.62264-(14.52104)));
            yy = 1.35581 + (((tickAnim - 23) / 7) * (-3.49284-(1.35581)));
            zz = -19.46766 + (((tickAnim - 23) / 7) * (-8.91236-(-19.46766)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -6.62264 + (((tickAnim - 30) / 30) * (-7.63314-(-6.62264)));
            yy = -3.49284 + (((tickAnim - 30) / 30) * (1.98983-(-3.49284)));
            zz = -8.91236 + (((tickAnim - 30) / 30) * (-31.79462-(-8.91236)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = -7.63314 + (((tickAnim - 60) / 40) * (-7.63314-(-7.63314)));
            yy = 1.98983 + (((tickAnim - 60) / 40) * (1.98983-(1.98983)));
            zz = -31.79462 + (((tickAnim - 60) / 40) * (-31.79462-(-31.79462)));
        }
        else if (tickAnim >= 100 && tickAnim < 118) {
            xx = -7.63314 + (((tickAnim - 100) / 18) * (-6.86335-(-7.63314)));
            yy = 1.98983 + (((tickAnim - 100) / 18) * (-0.64231-(1.98983)));
            zz = -31.79462 + (((tickAnim - 100) / 18) * (-20.57256-(-31.79462)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = -6.86335 + (((tickAnim - 118) / 10) * (-3.46546-(-6.86335)));
            yy = -0.64231 + (((tickAnim - 118) / 10) * (-2.59621-(-0.64231)));
            zz = -20.57256 + (((tickAnim - 118) / 10) * (-3.65743-(-20.57256)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = -3.46546 + (((tickAnim - 128) / 6) * (35.01727-(-3.46546)));
            yy = -2.59621 + (((tickAnim - 128) / 6) * (-1.29811-(-2.59621)));
            zz = -3.65743 + (((tickAnim - 128) / 6) * (-1.82872-(-3.65743)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = 35.01727 + (((tickAnim - 134) / 6) * (0-(35.01727)));
            yy = -1.29811 + (((tickAnim - 134) / 6) * (0-(-1.29811)));
            zz = -1.82872 + (((tickAnim - 134) / 6) * (0-(-1.82872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem3.rotationPointX = this.rightMem3.rotationPointX + (float)(0);
        this.rightMem3.rotationPointY = this.rightMem3.rotationPointY - (float)(0);
        this.rightMem3.rotationPointZ = this.rightMem3.rotationPointZ + (float)(-0.25);
        this.rightMem3.setScale((float)1,(float)1,(float)0);


        this.rightMem8.rotationPointX = this.rightMem8.rotationPointX + (float)(0);
        this.rightMem8.rotationPointY = this.rightMem8.rotationPointY - (float)(0);
        this.rightMem8.rotationPointZ = this.rightMem8.rotationPointZ + (float)(-3.5);
        this.rightMem8.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-3.11255-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (8.29049-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (-55.48549-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -3.11255 + (((tickAnim - 23) / 7) * (0-(-3.11255)));
            yy = 8.29049 + (((tickAnim - 23) / 7) * (0-(8.29049)));
            zz = -55.48549 + (((tickAnim - 23) / 7) * (0-(-55.48549)));
        }
        else if (tickAnim >= 30 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 30) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 88) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 118) / 10) * (-0.04078-(0)));
            yy = 0 + (((tickAnim - 118) / 10) * (2.39448-(0)));
            zz = 0 + (((tickAnim - 118) / 10) * (-12.04478-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = -0.04078 + (((tickAnim - 128) / 6) * (-7.00965-(-0.04078)));
            yy = 2.39448 + (((tickAnim - 128) / 6) * (10.42217-(2.39448)));
            zz = -12.04478 + (((tickAnim - 128) / 6) * (-78.30588-(-12.04478)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = -7.00965 + (((tickAnim - 134) / 6) * (0-(-7.00965)));
            yy = 10.42217 + (((tickAnim - 134) / 6) * (0-(10.42217)));
            zz = -78.30588 + (((tickAnim - 134) / 6) * (0-(-78.30588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.475-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.35 + (((tickAnim - 23) / 7) * (0-(-0.35)));
            yy = 0.475 + (((tickAnim - 23) / 7) * (0-(0.475)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 30) / 88) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 88) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 118) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 10) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 128) / 6) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 128) / 6) * (0.475-(0)));
            zz = 0 + (((tickAnim - 128) / 6) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = -0.75 + (((tickAnim - 134) / 6) * (0-(-0.75)));
            yy = 0.475 + (((tickAnim - 134) / 6) * (0-(0.475)));
            zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);



        this.rightMem4.rotationPointX = this.rightMem4.rotationPointX + (float)(0.25);
        this.rightMem4.rotationPointY = this.rightMem4.rotationPointY - (float)(0);
        this.rightMem4.rotationPointZ = this.rightMem4.rotationPointZ + (float)(0);
        this.rightMem4.setScale((float)0,(float)1,(float)0);


        this.rightMem5.rotationPointX = this.rightMem5.rotationPointX + (float)(0);
        this.rightMem5.rotationPointY = this.rightMem5.rotationPointY - (float)(-0.5);
        this.rightMem5.rotationPointZ = this.rightMem5.rotationPointZ + (float)(0);
        this.rightMem5.setScale((float)1,(float)0,(float)1);


        this.rightMem6.rotationPointX = this.rightMem6.rotationPointX + (float)(0);
        this.rightMem6.rotationPointY = this.rightMem6.rotationPointY - (float)(-0.25);
        this.rightMem6.rotationPointZ = this.rightMem6.rotationPointZ + (float)(0);
        this.rightMem6.setScale((float)1,(float)0,(float)1);


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-0.05);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0.125+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*-3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+50))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-1050))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+67))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*-3), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -15.53061 + (((tickAnim - 0) / 16) * (9.94425-(-15.53061)));
            yy = -7.28061 + (((tickAnim - 0) / 16) * (0.79984-(-7.28061)));
            zz = 10.21433 + (((tickAnim - 0) / 16) * (-9.21841-(10.21433)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.94425 + (((tickAnim - 16) / 7) * (119.0196-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(9.94425)));
            yy = 0.79984 + (((tickAnim - 16) / 7) * (-5.36995-(0.79984)));
            zz = -9.21841 + (((tickAnim - 16) / 7) * (-22.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(-9.21841)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 119.0196-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 23) / 7) * (-15.53061-(119.0196-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -5.36995 + (((tickAnim - 23) / 7) * (-7.28061-(-5.36995)));
            zz = -22.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 23) / 7) * (10.21433-(-22.4742+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 20.75 + (((tickAnim - 16) / 7) * (196.8873-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(20.75)));
            yy = 3.25 + (((tickAnim - 16) / 7) * (-7.59951-(3.25)));
            zz = 0 + (((tickAnim - 16) / 7) * (15.2355768516+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 196.8873-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 23) / 7) * (0-(196.8873-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = -7.59951 + (((tickAnim - 23) / 7) * (0-(-7.59951)));
            zz = 15.2355768516+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 23) / 7) * (0-(15.2355768516+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -0.05 + (((tickAnim - 0) / 16) * (0-(-0.05)));
            yy = -0.325 + (((tickAnim - 0) / 16) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);



        this.leftMem2.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -10.93583 + (((tickAnim - 0) / 16) * (9.75-(-10.93583)));
            yy = 1.09711 + (((tickAnim - 0) / 16) * (0-(1.09711)));
            zz = -6.66774 + (((tickAnim - 0) / 16) * (0-(-6.66774)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.75 + (((tickAnim - 16) / 7) * (33.86248-(9.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (6.68578-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (-11.75061-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 33.86248 + (((tickAnim - 23) / 7) * (-10.93583-(33.86248)));
            yy = 6.68578 + (((tickAnim - 23) / 7) * (1.09711-(6.68578)));
            zz = -11.75061 + (((tickAnim - 23) / 7) * (-6.66774-(-11.75061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 16) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);



        this.leftMem3.rotationPointX = this.leftMem3.rotationPointX + (float)(0);
        this.leftMem3.rotationPointY = this.leftMem3.rotationPointY - (float)(0);
        this.leftMem3.rotationPointZ = this.leftMem3.rotationPointZ + (float)(-1);
        this.leftMem3.setScale((float)1,(float)1,(float)0);


        this.leftMem8.rotationPointX = this.leftMem8.rotationPointX + (float)(0);
        this.leftMem8.rotationPointY = this.leftMem8.rotationPointY - (float)(0);
        this.leftMem8.rotationPointZ = this.leftMem8.rotationPointZ + (float)(-4);
        this.leftMem8.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.29976 + (((tickAnim - 0) / 4) * (0.21852-(-1.29976)));
            yy = -6.45217 + (((tickAnim - 0) / 4) * (11.10097-(-6.45217)));
            zz = 62.5251 + (((tickAnim - 0) / 4) * (1.73595-(62.5251)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.21852 + (((tickAnim - 4) / 4) * (-0.85047-(0.21852)));
            yy = 11.10097 + (((tickAnim - 4) / 4) * (2.34842-(11.10097)));
            zz = 1.73595 + (((tickAnim - 4) / 4) * (-0.91169-(1.73595)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -0.85047 + (((tickAnim - 8) / 8) * (-5.69036-(-0.85047)));
            yy = 2.34842 + (((tickAnim - 8) / 8) * (-10.00474-(2.34842)));
            zz = -0.91169 + (((tickAnim - 8) / 8) * (72.33732-(-0.91169)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -5.69036 + (((tickAnim - 16) / 14) * (-1.29976-(-5.69036)));
            yy = -10.00474 + (((tickAnim - 16) / 14) * (-6.45217-(-10.00474)));
            zz = 72.33732 + (((tickAnim - 16) / 14) * (62.5251-(72.33732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand, hand.rotateAngleX + (float) Math.toRadians(xx), hand.rotateAngleY + (float) Math.toRadians(yy), hand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.75 + (((tickAnim - 0) / 4) * (0-(0.75)));
            yy = 0.125 + (((tickAnim - 0) / 4) * (0-(0.125)));
            zz = 0.125 + (((tickAnim - 0) / 4) * (0-(0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0.35-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.375-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0.35 + (((tickAnim - 12) / 4) * (0.7-(0.35)));
            yy = 0.375 + (((tickAnim - 12) / 4) * (0-(0.375)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0.7 + (((tickAnim - 16) / 14) * (0.75-(0.7)));
            yy = 0 + (((tickAnim - 16) / 14) * (0.125-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand.rotationPointX = this.hand.rotationPointX + (float)(xx);
        this.hand.rotationPointY = this.hand.rotationPointY - (float)(yy);
        this.hand.rotationPointZ = this.hand.rotationPointZ + (float)(zz);



        this.leftMem4.rotationPointX = this.leftMem4.rotationPointX + (float)(-1);
        this.leftMem4.rotationPointY = this.leftMem4.rotationPointY - (float)(0);
        this.leftMem4.rotationPointZ = this.leftMem4.rotationPointZ + (float)(0);
        this.leftMem4.setScale((float)0,(float)1,(float)0);


        this.leftMem5.rotationPointX = this.leftMem5.rotationPointX + (float)(0);
        this.leftMem5.rotationPointY = this.leftMem5.rotationPointY - (float)(-0.25);
        this.leftMem5.rotationPointZ = this.leftMem5.rotationPointZ + (float)(0);
        this.leftMem5.setScale((float)1,(float)0,(float)1);


        this.leftMem6.rotationPointX = this.leftMem6.rotationPointX + (float)(0);
        this.leftMem6.rotationPointY = this.leftMem6.rotationPointY - (float)(-0.25);
        this.leftMem6.rotationPointZ = this.leftMem6.rotationPointZ + (float)(0);
        this.leftMem6.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -25 + (((tickAnim - 0) / 13) * (17-(-25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 17 + (((tickAnim - 13) / 6) * (106.575-9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15-(17)));
            yy = 0 + (((tickAnim - 13) / 6) * (-4.05441-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (-14.33413-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 106.575-9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15 + (((tickAnim - 19) / 8) * (-35-(106.575-9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*15)));
            yy = -4.05441 + (((tickAnim - 19) / 8) * (0-(-4.05441)));
            zz = -14.33413 + (((tickAnim - 19) / 8) * (0-(-14.33413)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 27) / 3) * (-25-(-35)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 16.5 + (((tickAnim - 0) / 13) * (1.75-(16.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.75 + (((tickAnim - 13) / 4) * (20.69-(1.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 20.69 + (((tickAnim - 17) / 6) * (-15.67-(20.69)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -15.67 + (((tickAnim - 23) / 4) * (16.5-(-15.67)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 16.5 + (((tickAnim - 27) / 3) * (16.5-(16.5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 13) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (1.62-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -0.25 + (((tickAnim - 23) / 4) * (0-(-0.25)));
            yy = 1.62 + (((tickAnim - 23) / 4) * (-0.25-(1.62)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 27) / 3) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
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
            xx = 6.51516 + (((tickAnim - 0) / 5) * (9.11199-(6.51516)));
            yy = 1.39905 + (((tickAnim - 0) / 5) * (3.46606-(1.39905)));
            zz = 3.24472 + (((tickAnim - 0) / 5) * (3.16445-(3.24472)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 9.11199 + (((tickAnim - 5) / 3) * (22.54426-(9.11199)));
            yy = 3.46606 + (((tickAnim - 5) / 3) * (-0.4418-(3.46606)));
            zz = 3.16445 + (((tickAnim - 5) / 3) * (-1.02465-(3.16445)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.54426 + (((tickAnim - 8) / 5) * (83.75-(22.54426)));
            yy = -0.4418 + (((tickAnim - 8) / 5) * (0-(-0.4418)));
            zz = -1.02465 + (((tickAnim - 8) / 5) * (0-(-1.02465)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 83.75 + (((tickAnim - 13) / 4) * (111.40419-(83.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (-0.65838-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-1.52693-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 111.40419 + (((tickAnim - 17) / 3) * (96.81462-(111.40419)));
            yy = -0.65838 + (((tickAnim - 17) / 3) * (-0.98756-(-0.65838)));
            zz = -1.52693 + (((tickAnim - 17) / 3) * (-2.29039-(-1.52693)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 96.81462 + (((tickAnim - 20) / 7) * (15.01516-(96.81462)));
            yy = -0.98756 + (((tickAnim - 20) / 7) * (1.39905-(-0.98756)));
            zz = -2.29039 + (((tickAnim - 20) / 7) * (3.24472-(-2.29039)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 15.01516 + (((tickAnim - 27) / 3) * (6.51516-(15.01516)));
            yy = 1.39905 + (((tickAnim - 27) / 3) * (1.39905-(1.39905)));
            zz = 3.24472 + (((tickAnim - 27) / 3) * (3.24472-(3.24472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0.325 + (((tickAnim - 5) / 8) * (0-(0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.275-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 17) / 3) * (1.6-(0.65)));
            zz = -0.275 + (((tickAnim - 17) / 3) * (0.07-(-0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.6 + (((tickAnim - 20) / 7) * (0-(1.6)));
            zz = 0.07 + (((tickAnim - 20) / 7) * (0-(0.07)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 17 + (((tickAnim - 0) / 7) * (-9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(17)));
            yy = 0 + (((tickAnim - 0) / 7) * (-4.05441-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (6.35913-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 7) / 6) * (-35-(-9.5396335551*Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
            yy = -4.05441 + (((tickAnim - 7) / 6) * (0-(-4.05441)));
            zz = 6.35913 + (((tickAnim - 7) / 6) * (0-(6.35913)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -35 + (((tickAnim - 13) / 17) * (17-(-35)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.75 + (((tickAnim - 0) / 4) * (20.69-(1.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 20.69 + (((tickAnim - 4) / 5) * (-15.67-(20.69)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -15.67 + (((tickAnim - 9) / 4) * (16.5-(-15.67)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 16.5 + (((tickAnim - 13) / 17) * (1.75-(16.5)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (1.62-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.25 + (((tickAnim - 9) / 4) * (0-(-0.25)));
            yy = 1.62 + (((tickAnim - 9) / 4) * (-0.25-(1.62)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = -0.25 + (((tickAnim - 13) / 17) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 83.75 + (((tickAnim - 0) / 4) * (111.40419-(83.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.65838-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.52693-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 111.40419 + (((tickAnim - 4) / 4) * (96.81462-(111.40419)));
            yy = -0.65838 + (((tickAnim - 4) / 4) * (-0.98756-(-0.65838)));
            zz = -1.52693 + (((tickAnim - 4) / 4) * (-2.29039-(-1.52693)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 96.81462 + (((tickAnim - 8) / 5) * (15.01516-(96.81462)));
            yy = -0.98756 + (((tickAnim - 8) / 5) * (-1.39905-(-0.98756)));
            zz = -2.29039 + (((tickAnim - 8) / 5) * (-3.24472-(-2.29039)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 15.01516 + (((tickAnim - 13) / 7) * (2.33852-(15.01516)));
            yy = -1.39905 + (((tickAnim - 13) / 7) * (-0.88361-(-1.39905)));
            zz = -3.24472 + (((tickAnim - 13) / 7) * (-2.04929-(-3.24472)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.33852 + (((tickAnim - 20) / 5) * (22.54426-(2.33852)));
            yy = -0.88361 + (((tickAnim - 20) / 5) * (-0.4418-(-0.88361)));
            zz = -2.04929 + (((tickAnim - 20) / 5) * (-1.02465-(-2.04929)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 22.54426 + (((tickAnim - 25) / 5) * (83.75-(22.54426)));
            yy = -0.4418 + (((tickAnim - 25) / 5) * (0-(-0.4418)));
            zz = -1.02465 + (((tickAnim - 25) / 5) * (0-(-1.02465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.275-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.65 + (((tickAnim - 4) / 4) * (1.6-(0.65)));
            zz = -0.275 + (((tickAnim - 4) / 4) * (0.07-(-0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.6 + (((tickAnim - 8) / 5) * (0-(1.6)));
            zz = 0.07 + (((tickAnim - 8) / 5) * (0-(0.07)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0.325 + (((tickAnim - 20) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.32748 + (((tickAnim - 0) / 3) * (9.77205-(6.32748)));
            yy = -3.037 + (((tickAnim - 0) / 3) * (-1.0188-(-3.037)));
            zz = 10.51892 + (((tickAnim - 0) / 3) * (18.8123-(10.51892)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 9.77205 + (((tickAnim - 3) / 7) * (32.7373-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(9.77205)));
            yy = -1.0188 + (((tickAnim - 3) / 7) * (5.36995-(-1.0188)));
            zz = 18.8123 + (((tickAnim - 3) / 7) * (-29.7008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(18.8123)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 32.7373-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 10) / 7) * (-18.68061-(32.7373-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 5.36995 + (((tickAnim - 10) / 7) * (7.28061-(5.36995)));
            zz = -29.7008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 10) / 7) * (-10.21433-(-29.7008+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -18.68061 + (((tickAnim - 17) / 13) * (6.32748-(-18.68061)));
            yy = 7.28061 + (((tickAnim - 17) / 13) * (-3.037-(7.28061)));
            zz = -10.21433 + (((tickAnim - 17) / 13) * (10.51892-(-10.21433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightMem.setScale((float)1,(float)1,(float)0.7);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.7 + (((tickAnim - 0) / 3) * (18.8834-(14.7)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.0776-(0)));
            zz = -2.075 + (((tickAnim - 0) / 3) * (-5.27448-(-2.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 18.8834 + (((tickAnim - 3) / 7) * (56.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(18.8834)));
            yy = 4.0776 + (((tickAnim - 3) / 7) * (7.59951-(4.0776)));
            zz = -5.27448 + (((tickAnim - 3) / 7) * (23.5856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50-(-5.27448)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 56.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 10) / 7) * (7.5-(56.2623-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 7.59951 + (((tickAnim - 10) / 7) * (0-(7.59951)));
            zz = 23.5856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50 + (((tickAnim - 10) / 7) * (5.425-(23.5856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*50)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 17) / 13) * (14.7-(7.5)));
            yy = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            zz = 5.425 + (((tickAnim - 17) / 13) * (-2.075-(5.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 3) / 14) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 3) / 14) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 3) / 14) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -0.05 + (((tickAnim - 17) / 13) * (0-(-0.05)));
            yy = -0.325 + (((tickAnim - 17) / 13) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);



        this.rightMem2.rotationPointX = this.rightMem2.rotationPointX + (float)(1);
        this.rightMem2.rotationPointY = this.rightMem2.rotationPointY - (float)(-5);
        this.rightMem2.rotationPointZ = this.rightMem2.rotationPointZ + (float)(-1);
        this.rightMem2.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.475 + (((tickAnim - 0) / 3) * (7.46449-(0.475)));
            yy = 0 + (((tickAnim - 0) / 3) * (-2.14216-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.67351-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 7.46449 + (((tickAnim - 3) / 7) * (33.86248-(7.46449)));
            yy = -2.14216 + (((tickAnim - 3) / 7) * (6.68578-(-2.14216)));
            zz = 3.67351 + (((tickAnim - 3) / 7) * (11.75061-(3.67351)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 33.86248 + (((tickAnim - 10) / 7) * (-10.93583-(33.86248)));
            yy = 6.68578 + (((tickAnim - 10) / 7) * (-1.09711-(6.68578)));
            zz = 11.75061 + (((tickAnim - 10) / 7) * (7.64274-(11.75061)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = -10.93583 + (((tickAnim - 17) / 13) * (0.475-(-10.93583)));
            yy = -1.09711 + (((tickAnim - 17) / 13) * (0-(-1.09711)));
            zz = 7.64274 + (((tickAnim - 17) / 13) * (0-(7.64274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 3) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 14) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 14) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = -0.05 + (((tickAnim - 17) / 13) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);



        this.rightMem3.rotationPointX = this.rightMem3.rotationPointX + (float)(0);
        this.rightMem3.rotationPointY = this.rightMem3.rotationPointY - (float)(0);
        this.rightMem3.rotationPointZ = this.rightMem3.rotationPointZ + (float)(-1);
        this.rightMem3.setScale((float)1,(float)1,(float)0);


        this.rightMem8.rotationPointX = this.rightMem8.rotationPointX + (float)(0);
        this.rightMem8.rotationPointY = this.rightMem8.rotationPointY - (float)(0);
        this.rightMem8.rotationPointZ = this.rightMem8.rotationPointZ + (float)(-4);
        this.rightMem8.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -9.26105 + (((tickAnim - 0) / 3) * (-1.29976-(-9.26105)));
            yy = 14.49098 + (((tickAnim - 0) / 3) * (6.45217-(14.49098)));
            zz = -47.18327 + (((tickAnim - 0) / 3) * (-62.5251-(-47.18327)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -1.29976 + (((tickAnim - 3) / 7) * (20.86153-(-1.29976)));
            yy = 6.45217 + (((tickAnim - 3) / 7) * (8.37785-(6.45217)));
            zz = -62.5251 + (((tickAnim - 3) / 7) * (-76.7337-(-62.5251)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 20.86153 + (((tickAnim - 10) / 7) * (-12.42022-(20.86153)));
            yy = 8.37785 + (((tickAnim - 10) / 7) * (7.82777-(8.37785)));
            zz = -76.7337 + (((tickAnim - 10) / 7) * (-77.56093-(-76.7337)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -12.42022 + (((tickAnim - 17) / 4) * (-0.58592-(-12.42022)));
            yy = 7.82777 + (((tickAnim - 17) / 4) * (-6.16797-(7.82777)));
            zz = -77.56093 + (((tickAnim - 17) / 4) * (-24.18801-(-77.56093)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -0.58592 + (((tickAnim - 21) / 3) * (-4.23437-(-0.58592)));
            yy = -6.16797 + (((tickAnim - 21) / 3) * (-1.95925-(-6.16797)));
            zz = -24.18801 + (((tickAnim - 21) / 3) * (-3.56409-(-24.18801)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = -4.23437 + (((tickAnim - 24) / 3) * (-4.17676-(-4.23437)));
            yy = -1.95925 + (((tickAnim - 24) / 3) * (9.73477-(-1.95925)));
            zz = -3.56409 + (((tickAnim - 24) / 3) * (-2.41506-(-3.56409)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -4.17676 + (((tickAnim - 27) / 3) * (-9.26105-(-4.17676)));
            yy = 9.73477 + (((tickAnim - 27) / 3) * (14.49098-(9.73477)));
            zz = -2.41506 + (((tickAnim - 27) / 3) * (-47.18327-(-2.41506)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hand2, hand2.rotateAngleX + (float) Math.toRadians(xx), hand2.rotateAngleY + (float) Math.toRadians(yy), hand2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.5 + (((tickAnim - 0) / 3) * (-0.75-(-0.5)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.125-(0.5)));
            zz = 0.25 + (((tickAnim - 0) / 3) * (0.125-(0.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = -0.75 + (((tickAnim - 3) / 14) * (-0.75-(-0.75)));
            yy = 0.125 + (((tickAnim - 3) / 14) * (0.125-(0.125)));
            zz = 0.125 + (((tickAnim - 3) / 14) * (0.125-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -0.75 + (((tickAnim - 17) / 4) * (-0.375-(-0.75)));
            yy = 0.125 + (((tickAnim - 17) / 4) * (0.075-(0.125)));
            zz = 0.125 + (((tickAnim - 17) / 4) * (0-(0.125)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = -0.375 + (((tickAnim - 21) / 3) * (0-(-0.375)));
            yy = 0.075 + (((tickAnim - 21) / 3) * (-0.05-(0.075)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 24) / 3) * (-0.05-(-0.05)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (-0.5-(0)));
            yy = -0.05 + (((tickAnim - 27) / 3) * (0.5-(-0.05)));
            zz = 0 + (((tickAnim - 27) / 3) * (0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hand2.rotationPointX = this.hand2.rotationPointX + (float)(xx);
        this.hand2.rotationPointY = this.hand2.rotationPointY - (float)(yy);
        this.hand2.rotationPointZ = this.hand2.rotationPointZ + (float)(zz);



        this.rightMem4.rotationPointX = this.rightMem4.rotationPointX + (float)(0);
        this.rightMem4.rotationPointY = this.rightMem4.rotationPointY - (float)(0);
        this.rightMem4.rotationPointZ = this.rightMem4.rotationPointZ + (float)(1.25);
        this.rightMem4.setScale((float)0,(float)1,(float)0);


        this.rightMem5.setScale((float)1,(float)0,(float)1);


        this.rightMem6.rotationPointX = this.rightMem6.rotationPointX + (float)(0);
        this.rightMem6.rotationPointY = this.rightMem6.rotationPointY - (float)(-0.5);
        this.rightMem6.rotationPointZ = this.rightMem6.rotationPointZ + (float)(0);
        this.rightMem6.setScale((float)1,(float)0,(float)1);

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTupandactylus_navigans entity = (EntityPrehistoricFloraTupandactylus_navigans) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-50))*5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-90))*5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-130))*15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-15)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-1)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-140))*-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-190))*-5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-190))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-230))*-5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = -0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-170))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(-0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-170))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*20 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*20)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-210))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*0.5-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing.rotationPointX = this.leftWing.rotationPointX + (float)(xx);
        this.leftWing.rotationPointY = this.leftWing.rotationPointY - (float)(yy);
        this.leftWing.rotationPointZ = this.leftWing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = -0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(-0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*20 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*20)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-160))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 106) / 54) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*35 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*35)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-290))*35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing4.rotationPointX = this.leftWing4.rotationPointX + (float)(xx);
        this.leftWing4.rotationPointY = this.leftWing4.rotationPointY - (float)(yy);
        this.leftWing4.rotationPointZ = this.leftWing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*-10 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*-10)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-340))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing5.rotationPointX = this.leftWing5.rotationPointX + (float)(xx);
        this.leftWing5.rotationPointY = this.leftWing5.rotationPointY - (float)(yy);
        this.leftWing5.rotationPointZ = this.leftWing5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-520))*-5-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-350))*-10 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-350))*-10)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-750))*-10-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = -0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(-0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-20 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-100))*-20)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-0.5)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*0.5)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*0.5-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing.rotationPointX = this.rightWing.rotationPointX + (float)(xx);
        this.rightWing.rotationPointY = this.rightWing.rotationPointY - (float)(yy);
        this.rightWing.rotationPointZ = this.rightWing.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = -0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(-0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-20 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-120))*-20)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-1)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-160))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-30 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-200))*-30)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 59) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5 + (((tickAnim - 106) / 54) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-300))*1.5)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-240))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*-35 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-250))*-35)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-290))*-35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing4.rotationPointX = this.rightWing4.rotationPointX + (float)(xx);
        this.rightWing4.rotationPointY = this.rightWing4.rotationPointY - (float)(yy);
        this.rightWing4.rotationPointZ = this.rightWing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*10 + (((tickAnim - 0) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-300))*10)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500-340))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 47) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing5.rotationPointX = this.rightWing5.rotationPointX + (float)(xx);
        this.rightWing5.rotationPointY = this.rightWing5.rotationPointY - (float)(yy);
        this.rightWing5.rotationPointZ = this.rightWing5.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTupandactylus_navigans e = (EntityPrehistoricFloraTupandactylus_navigans) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((0.0436F)-(0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.5236F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((1.1345F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.6109F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((1.9722F)-(1.9722F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((1.9635F)-(1.9635F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((1.4399F)-(1.4399F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.9599F)-(0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hand, ((-2.0657F)-(-1.3994F)), ((-0.0752F)-(0.018F)),((0.3193F)-(-1.5168F)));
        animator.rotate(hand2, ((-2.0657F)-(-1.3994F)), ((0.0752F)-(-0.018F)),((-0.3193F)-(1.5168F)));
        animator.rotate(head, ((0.6327F)-(0.9861F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftLeg, ((0.9803F)-(0.4254F)), ((0.0027F)-(0.1086F)),((-1.5224F)-(-0.2985F)));
        animator.rotate(leftLeg2, ((0.6084F)-(1.0191F)), ((-0.0393F)-(-0.0205F)),((0.1249F)-(0.316F)));
        animator.rotate(leftLeg3, ((0.5356F)-(-0.7341F)), ((-0.1621F)-(-0.1621F)),((0.0737F)-(0.0737F)));
        animator.rotate(leftMem, ((0.0F)-(0.0F)), ((-0.2182F)-(-0.2182F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem2, ((0.0F)-(0.0F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem3, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(leftMem4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1745F)-(-0.1745F)));
        animator.rotate(leftMem5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem7, ((-0.5247F)-(-0.5247F)), ((0.0832F)-(0.0832F)),((-0.0263F)-(-0.0263F)));
        animator.rotate(leftMem8, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(leftWing, ((-0.0653F)-(-0.0256F)), ((-0.0037F)-(0.0996F)),((-1.6361F)-(-0.8584F)));
        animator.rotate(leftWing2, ((0.0F)-(0.096F)), ((0.0F)-(0.0F)),((-0.0131F)-(0.6152F)));
        animator.rotate(leftWing3, ((0.048F)-(0.3567F)), ((0.0F)-(-0.0567F)),((0.0654F)-(0.2581F)));
        animator.rotate(leftWing4, ((-1.4582F)-(-0.2671F)), ((-0.0136F)-(0.03F)),((0.1302F)-(0.1292F)));
        animator.rotate(leftWing5, ((0.1924F)-(1.545F)), ((-0.0822F)-(0.005F)),((-0.0105F)-(-0.0104F)));
        animator.rotate(leftWing6, ((0.3927F)-(0.1614F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(main, ((-0.1004F)-(-0.7112F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.0349F)-(0.0654F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2705F)-(-0.2705F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.2574F)-(-0.2574F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightLeg, ((0.9803F)-(0.4254F)), ((-0.0027F)-(-0.1086F)),((1.5224F)-(0.2985F)));
        animator.rotate(rightLeg2, ((0.6084F)-(1.0191F)), ((0.0393F)-(0.0205F)),((-0.1249F)-(-0.316F)));
        animator.rotate(rightLeg3, ((0.5356F)-(-0.7341F)), ((0.1621F)-(0.1621F)),((-0.0737F)-(-0.0737F)));
        animator.rotate(rightMem, ((0.0F)-(0.0F)), ((0.2182F)-(0.2182F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem2, ((0.0F)-(0.0F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem3, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(rightMem4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1745F)-(0.1745F)));
        animator.rotate(rightMem5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0873F)-(0.0873F)));
        animator.rotate(rightMem6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0873F)-(0.0873F)));
        animator.rotate(rightMem7, ((-0.5247F)-(-0.5247F)), ((-0.0832F)-(-0.0832F)),((0.0263F)-(0.0263F)));
        animator.rotate(rightMem8, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(rightWing, ((-0.0653F)-(-0.0256F)), ((0.0037F)-(-0.0996F)),((1.6361F)-(0.8584F)));
        animator.rotate(rightWing2, ((0.0F)-(0.096F)), ((0.0F)-(0.0F)),((0.0131F)-(-0.6152F)));
        animator.rotate(rightWing3, ((0.048F)-(0.3567F)), ((0.0F)-(0.0567F)),((-0.0654F)-(-0.2581F)));
        animator.rotate(rightWing4, ((-1.4582F)-(-0.2671F)), ((0.0136F)-(-0.03F)),((-0.1302F)-(-0.1292F)));
        animator.rotate(rightWing5, ((0.1924F)-(1.545F)), ((0.0822F)-(-0.005F)),((0.0105F)-(0.0104F)));
        animator.rotate(rightWing6, ((0.3927F)-(0.1614F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((0.0698F)-(0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat2, ((1.6581F)-(1.6581F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));




        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((0.0436F)-(0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.5236F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((1.1345F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.6109F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((1.9722F)-(1.9722F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((1.9635F)-(1.9635F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((1.4399F)-(1.4399F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.9599F)-(0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hand, -((-2.0657F)-(-1.3994F)), -((-0.0752F)-(0.018F)),-((0.3193F)-(-1.5168F)));
        animator.rotate(hand2, -((-2.0657F)-(-1.3994F)), -((0.0752F)-(-0.018F)),-((-0.3193F)-(1.5168F)));
        animator.rotate(head, -((0.6327F)-(0.9861F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftLeg, -((0.9803F)-(0.4254F)), -((0.0027F)-(0.1086F)),-((-1.5224F)-(-0.2985F)));
        animator.rotate(leftLeg2, -((0.6084F)-(1.0191F)), -((-0.0393F)-(-0.0205F)),-((0.1249F)-(0.316F)));
        animator.rotate(leftLeg3, -((0.5356F)-(-0.7341F)), -((-0.1621F)-(-0.1621F)),-((0.0737F)-(0.0737F)));
        animator.rotate(leftMem, -((0.0F)-(0.0F)), -((-0.2182F)-(-0.2182F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem2, -((0.0F)-(0.0F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem3, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(leftMem4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1745F)-(-0.1745F)));
        animator.rotate(leftMem5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0873F)-(-0.0873F)));
        animator.rotate(leftMem7, -((-0.5247F)-(-0.5247F)), -((0.0832F)-(0.0832F)),-((-0.0263F)-(-0.0263F)));
        animator.rotate(leftMem8, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(leftWing, -((-0.0653F)-(-0.0256F)), -((-0.0037F)-(0.0996F)),-((-1.6361F)-(-0.8584F)));
        animator.rotate(leftWing2, -((0.0F)-(0.096F)), -((0.0F)-(0.0F)),-((-0.0131F)-(0.6152F)));
        animator.rotate(leftWing3, -((0.048F)-(0.3567F)), -((0.0F)-(-0.0567F)),-((0.0654F)-(0.2581F)));
        animator.rotate(leftWing4, -((-1.4582F)-(-0.2671F)), -((-0.0136F)-(0.03F)),-((0.1302F)-(0.1292F)));
        animator.rotate(leftWing5, -((0.1924F)-(1.545F)), -((-0.0822F)-(0.005F)),-((-0.0105F)-(-0.0104F)));
        animator.rotate(leftWing6, -((0.3927F)-(0.1614F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(main, -((-0.1004F)-(-0.7112F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.0349F)-(0.0654F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2705F)-(-0.2705F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.2574F)-(-0.2574F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightLeg, -((0.9803F)-(0.4254F)), -((-0.0027F)-(-0.1086F)),-((1.5224F)-(0.2985F)));
        animator.rotate(rightLeg2, -((0.6084F)-(1.0191F)), -((0.0393F)-(0.0205F)),-((-0.1249F)-(-0.316F)));
        animator.rotate(rightLeg3, -((0.5356F)-(-0.7341F)), -((0.1621F)-(0.1621F)),-((-0.0737F)-(-0.0737F)));
        animator.rotate(rightMem, -((0.0F)-(0.0F)), -((0.2182F)-(0.2182F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem2, -((0.0F)-(0.0F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem3, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(rightMem4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1745F)-(0.1745F)));
        animator.rotate(rightMem5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0873F)-(0.0873F)));
        animator.rotate(rightMem6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0873F)-(0.0873F)));
        animator.rotate(rightMem7, -((-0.5247F)-(-0.5247F)), -((-0.0832F)-(-0.0832F)),-((0.0263F)-(0.0263F)));
        animator.rotate(rightMem8, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(rightWing, -((-0.0653F)-(-0.0256F)), -((0.0037F)-(-0.0996F)),-((1.6361F)-(0.8584F)));
        animator.rotate(rightWing2, -((0.0F)-(0.096F)), -((0.0F)-(0.0F)),-((0.0131F)-(-0.6152F)));
        animator.rotate(rightWing3, -((0.048F)-(0.3567F)), -((0.0F)-(0.0567F)),-((-0.0654F)-(-0.2581F)));
        animator.rotate(rightWing4, -((-1.4582F)-(-0.2671F)), -((0.0136F)-(-0.03F)),-((-0.1302F)-(-0.1292F)));
        animator.rotate(rightWing5, -((0.1924F)-(1.545F)), -((0.0822F)-(-0.005F)),-((0.0105F)-(0.0104F)));
        animator.rotate(rightWing6, -((0.3927F)-(0.1614F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((0.0698F)-(0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat2, -((1.6581F)-(1.6581F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));



        
        

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
