package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSchizodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelSchizodactylus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer leftCercus;
    private final AdvancedModelRenderer rightCercus;
    private final AdvancedModelRenderer leftHindwing;
    private final AdvancedModelRenderer leftHindwingFoldable1;
    private final AdvancedModelRenderer hindwingLeftFoldable2;
    private final AdvancedModelRenderer leftHindwing2;
    private final AdvancedModelRenderer rightHindwing;
    private final AdvancedModelRenderer rightHindwingFoldable1;
    private final AdvancedModelRenderer rightHindwingFoldable2;
    private final AdvancedModelRenderer rightHindwing2;
    private final AdvancedModelRenderer leftForewing;
    private final AdvancedModelRenderer leftForewing2;
    private final AdvancedModelRenderer leftForewingCurl1;
    private final AdvancedModelRenderer leftForewingCurl2;
    private final AdvancedModelRenderer leftForewingCurl3;
    private final AdvancedModelRenderer leftForewingCurl4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightForewing;
    private final AdvancedModelRenderer rightForewing2;
    private final AdvancedModelRenderer rightForewingCurl1;
    private final AdvancedModelRenderer rightForewingCurl2;
    private final AdvancedModelRenderer rightForewingCurl3;
    private final AdvancedModelRenderer rightForewingCurl4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftPedipalp;
    private final AdvancedModelRenderer rightPedipalp;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer rightMandible;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftMandible;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg22;
    private final AdvancedModelRenderer leftLeg23;
    private final AdvancedModelRenderer leftLeg24;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg32;
    private final AdvancedModelRenderer leftLeg33;
    private final AdvancedModelRenderer leftLeg34;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg22;
    private final AdvancedModelRenderer rightLeg23;
    private final AdvancedModelRenderer rightLeg24;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg32;
    private final AdvancedModelRenderer rightLeg33;
    private final AdvancedModelRenderer rightLeg34;

    private ModelAnimator animator;

    public ModelSchizodactylus() {
        this.textureWidth = 46;
        this.textureHeight = 41;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 23.0F, -6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.5F, 1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.5F, -3.25F, 5.0F);
        this.main.addChild(abdomen);
        this.setRotateAngle(abdomen, -0.1745F, 0.0F, 0.0F);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 8, -1.5F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 33, 32, -1.0F, 0.25F, 4.0F, 2, 2, 2, 0.0F, false));

        this.leftCercus = new AdvancedModelRenderer(this);
        this.leftCercus.setRotationPoint(0.5F, 1.25F, 6.0F);
        this.abdomen.addChild(leftCercus);
        this.setRotateAngle(leftCercus, 0.0F, 0.0873F, 0.0F);
        this.leftCercus.cubeList.add(new ModelBox(leftCercus, 13, 14, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.rightCercus = new AdvancedModelRenderer(this);
        this.rightCercus.setRotationPoint(-0.5F, 1.25F, 6.0F);
        this.abdomen.addChild(rightCercus);
        this.setRotateAngle(rightCercus, 0.0F, -0.0873F, 0.0F);
        this.rightCercus.cubeList.add(new ModelBox(rightCercus, 13, 14, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.leftHindwing = new AdvancedModelRenderer(this);
        this.leftHindwing.setRotationPoint(2.0003F, -3.2574F, 3.9879F);
        this.main.addChild(leftHindwing);
        this.setRotateAngle(leftHindwing, -0.131F, -0.0437F, 0.0019F);
        this.leftHindwing.cubeList.add(new ModelBox(leftHindwing, 0, 24, -1.8001F, -0.0626F, 0.001F, 2, 0, 7, 0.0F, true));

        this.leftHindwingFoldable1 = new AdvancedModelRenderer(this);
        this.leftHindwingFoldable1.setRotationPoint(-1.8001F, -0.0435F, 3.5009F);
        this.leftHindwing.addChild(leftHindwingFoldable1);
        this.setRotateAngle(leftHindwingFoldable1, 0.0F, 0.0F, -3.098F);
        this.leftHindwingFoldable1.cubeList.add(new ModelBox(leftHindwingFoldable1, 19, 8, -2.0F, -0.0191F, -3.5F, 2, 0, 7, 0.0F, true));

        this.hindwingLeftFoldable2 = new AdvancedModelRenderer(this);
        this.hindwingLeftFoldable2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.leftHindwingFoldable1.addChild(hindwingLeftFoldable2);
        this.setRotateAngle(hindwingLeftFoldable2, 0.0F, 0.0F, 3.1416F);
        this.hindwingLeftFoldable2.cubeList.add(new ModelBox(hindwingLeftFoldable2, 19, 0, -2.0F, -0.0191F, -3.5F, 2, 0, 7, 0.0F, true));

        this.leftHindwing2 = new AdvancedModelRenderer(this);
        this.leftHindwing2.setRotationPoint(-1.2001F, -0.0435F, 7.0009F);
        this.leftHindwing.addChild(leftHindwing2);
        this.leftHindwing2.cubeList.add(new ModelBox(leftHindwing2, 24, 16, 0.0F, -0.0191F, 0.0F, 1, 0, 1, 0.0F, true));

        this.rightHindwing = new AdvancedModelRenderer(this);
        this.rightHindwing.setRotationPoint(-1.0003F, -3.2574F, 3.9879F);
        this.main.addChild(rightHindwing);
        this.setRotateAngle(rightHindwing, -0.131F, 0.0437F, -0.0019F);
        this.rightHindwing.cubeList.add(new ModelBox(rightHindwing, 0, 24, -0.1999F, -0.0535F, 0.001F, 2, 0, 7, 0.0F, false));

        this.rightHindwingFoldable1 = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable1.setRotationPoint(1.8001F, -0.0435F, 3.5009F);
        this.rightHindwing.addChild(rightHindwingFoldable1);
        this.setRotateAngle(rightHindwingFoldable1, 0.0F, 0.0F, 3.098F);
        this.rightHindwingFoldable1.cubeList.add(new ModelBox(rightHindwingFoldable1, 19, 8, 0.0F, 0.0F, -3.5F, 2, 0, 7, 0.0F, false));

        this.rightHindwingFoldable2 = new AdvancedModelRenderer(this);
        this.rightHindwingFoldable2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.rightHindwingFoldable1.addChild(rightHindwingFoldable2);
        this.setRotateAngle(rightHindwingFoldable2, 0.0F, 0.0F, -3.1416F);
        this.rightHindwingFoldable2.cubeList.add(new ModelBox(rightHindwingFoldable2, 19, 0, 0.0F, 0.01F, -3.5F, 2, 0, 7, 0.0F, false));

        this.rightHindwing2 = new AdvancedModelRenderer(this);
        this.rightHindwing2.setRotationPoint(1.2001F, -0.0435F, 7.0009F);
        this.rightHindwing.addChild(rightHindwing2);
        this.rightHindwing2.cubeList.add(new ModelBox(rightHindwing2, 24, 16, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.leftForewing = new AdvancedModelRenderer(this);
        this.leftForewing.setRotationPoint(2.0F, -3.4F, 3.0F);
        this.main.addChild(leftForewing);
        this.setRotateAngle(leftForewing, 0.0435F, -0.0437F, 0.0019F);
        this.leftForewing.cubeList.add(new ModelBox(leftForewing, 25, 26, -2.5F, -0.02F, 0.0F, 3, 0, 4, 0.0F, true));

        this.leftForewing2 = new AdvancedModelRenderer(this);
        this.leftForewing2.setRotationPoint(-1.0F, 0.0F, 4.0F);
        this.leftForewing.addChild(leftForewing2);
        this.setRotateAngle(leftForewing2, -0.3054F, 0.0F, 0.0F);
        this.leftForewing2.cubeList.add(new ModelBox(leftForewing2, 15, 30, -0.8004F, -0.02F, 0.0052F, 2, 0, 4, 0.0F, true));

        this.leftForewingCurl1 = new AdvancedModelRenderer(this);
        this.leftForewingCurl1.setRotationPoint(-0.3F, 0.0F, 4.0F);
        this.leftForewing2.addChild(leftForewingCurl1);
        this.leftForewingCurl1.cubeList.add(new ModelBox(leftForewingCurl1, 19, 16, 0.0F, -0.02F, 0.0F, 1, 0, 1, 0.0F, true));

        this.leftForewingCurl2 = new AdvancedModelRenderer(this);
        this.leftForewingCurl2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftForewingCurl1.addChild(leftForewingCurl2);
        this.setRotateAngle(leftForewingCurl2, 1.0036F, 0.0F, 0.0F);
        this.leftForewingCurl2.cubeList.add(new ModelBox(leftForewingCurl2, 19, 16, 0.0F, -0.02F, 0.0F, 1, 0, 1, 0.0F, true));

        this.leftForewingCurl3 = new AdvancedModelRenderer(this);
        this.leftForewingCurl3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftForewingCurl2.addChild(leftForewingCurl3);
        this.setRotateAngle(leftForewingCurl3, 1.4835F, 0.0F, 0.0F);
        this.leftForewingCurl3.cubeList.add(new ModelBox(leftForewingCurl3, 19, 16, 0.0F, -0.02F, 0.0F, 1, 0, 1, 0.0F, true));

        this.leftForewingCurl4 = new AdvancedModelRenderer(this);
        this.leftForewingCurl4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftForewingCurl3.addChild(leftForewingCurl4);
        this.setRotateAngle(leftForewingCurl4, 1.3526F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.leftForewingCurl4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 16, -0.3F, -0.02F, 0.0F, 1, 0, 1, 0.0F, true));

        this.rightForewing = new AdvancedModelRenderer(this);
        this.rightForewing.setRotationPoint(-1.0F, -3.4F, 3.0F);
        this.main.addChild(rightForewing);
        this.setRotateAngle(rightForewing, 0.0435F, 0.0437F, -0.0019F);
        this.rightForewing.cubeList.add(new ModelBox(rightForewing, 25, 26, -0.5F, 0.0F, 0.0F, 3, 0, 4, 0.0F, false));

        this.rightForewing2 = new AdvancedModelRenderer(this);
        this.rightForewing2.setRotationPoint(1.0F, 0.0F, 4.0F);
        this.rightForewing.addChild(rightForewing2);
        this.setRotateAngle(rightForewing2, -0.3054F, 0.0F, 0.0F);
        this.rightForewing2.cubeList.add(new ModelBox(rightForewing2, 15, 30, -1.1996F, -0.0111F, 0.0052F, 2, 0, 4, 0.0F, false));

        this.rightForewingCurl1 = new AdvancedModelRenderer(this);
        this.rightForewingCurl1.setRotationPoint(0.3F, 0.0F, 4.0F);
        this.rightForewing2.addChild(rightForewingCurl1);
        this.rightForewingCurl1.cubeList.add(new ModelBox(rightForewingCurl1, 19, 16, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.rightForewingCurl2 = new AdvancedModelRenderer(this);
        this.rightForewingCurl2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightForewingCurl1.addChild(rightForewingCurl2);
        this.setRotateAngle(rightForewingCurl2, 1.0036F, 0.0F, 0.0F);
        this.rightForewingCurl2.cubeList.add(new ModelBox(rightForewingCurl2, 19, 16, -1.0F, -0.012F, 0.0F, 1, 0, 1, 0.0F, false));

        this.rightForewingCurl3 = new AdvancedModelRenderer(this);
        this.rightForewingCurl3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightForewingCurl2.addChild(rightForewingCurl3);
        this.setRotateAngle(rightForewingCurl3, 1.4835F, 0.0F, 0.0F);
        this.rightForewingCurl3.cubeList.add(new ModelBox(rightForewingCurl3, 19, 16, -1.0F, 0.012F, 0.0F, 1, 0, 1, 0.0F, false));

        this.rightForewingCurl4 = new AdvancedModelRenderer(this);
        this.rightForewingCurl4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightForewingCurl3.addChild(rightForewingCurl4);
        this.setRotateAngle(rightForewingCurl4, 1.3526F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.rightForewingCurl4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 16, -0.7F, -0.015F, 0.0F, 1, 0, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -3.5F, 1.0F);
        this.main.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 31, 8, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 11, -0.5F, 2.6F, -1.975F, 1, 1, 0, 0.0F, false));

        this.leftPedipalp = new AdvancedModelRenderer(this);
        this.leftPedipalp.setRotationPoint(0.5F, 3.0F, -0.4F);
        this.head.addChild(leftPedipalp);
        this.setRotateAngle(leftPedipalp, -0.6109F, 0.0F, -0.829F);
        this.leftPedipalp.cubeList.add(new ModelBox(leftPedipalp, 19, 8, 0.0F, -0.25F, -0.6F, 0, 2, 2, 0.0F, true));

        this.rightPedipalp = new AdvancedModelRenderer(this);
        this.rightPedipalp.setRotationPoint(-0.5F, 3.0F, -0.4F);
        this.head.addChild(rightPedipalp);
        this.setRotateAngle(rightPedipalp, -0.6109F, 0.0F, 0.829F);
        this.rightPedipalp.cubeList.add(new ModelBox(rightPedipalp, 19, 8, 0.0F, -0.25F, -0.6F, 0, 2, 2, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.5F, 1.0F, -2.0F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.1745F, 0.1309F, 0.1745F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 0, 0.0F, -4.75F, -2.0F, 0, 5, 18, 0.0F, true));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.5F, 1.0F, -2.0F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.1745F, -0.1309F, -0.1745F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 0, 0.0F, -4.75F, -2.0F, 0, 5, 18, 0.0F, false));

        this.rightMandible = new AdvancedModelRenderer(this);
        this.rightMandible.setRotationPoint(-1.5F, 2.75F, -1.4F);
        this.head.addChild(rightMandible);
        this.setRotateAngle(rightMandible, 0.0F, 0.0F, -0.3054F);
        this.rightMandible.cubeList.add(new ModelBox(rightMandible, 5, 38, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.rightMandible.cubeList.add(new ModelBox(rightMandible, 0, 38, 0.0F, 0.35F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.05F, 1.0F, 0.0F);
        this.rightMandible.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.5236F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftMandible = new AdvancedModelRenderer(this);
        this.leftMandible.setRotationPoint(1.5F, 2.75F, -1.4F);
        this.head.addChild(leftMandible);
        this.setRotateAngle(leftMandible, 0.0F, 0.0F, 0.3054F);
        this.leftMandible.cubeList.add(new ModelBox(leftMandible, 33, 37, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.leftMandible.cubeList.add(new ModelBox(leftMandible, 37, 18, -1.0F, 0.35F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.05F, 1.0F, 0.0F);
        this.leftMandible.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.5236F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.5F, -0.5F, 2.5F);
        this.main.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.3927F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 37, 15, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.leftLeg1.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, 0.5672F, -0.6545F);
        this.leftLeg12.cubeList.add(new ModelBox(leftLeg12, 36, 23, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftLeg12.addChild(leftLeg13);
        this.setRotateAngle(leftLeg13, 0.0F, 0.2618F, 1.3526F);
        this.leftLeg13.cubeList.add(new ModelBox(leftLeg13, 18, 35, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.leftLeg13.cubeList.add(new ModelBox(leftLeg13, 0, 32, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftLeg13.addChild(leftLeg14);
        this.setRotateAngle(leftLeg14, -0.1745F, 0.0F, -0.5236F);
        this.leftLeg14.cubeList.add(new ModelBox(leftLeg14, 19, 13, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.leftLeg14.cubeList.add(new ModelBox(leftLeg14, 27, 35, 0.5F, 0.01F, -1.0F, 1, 0, 2, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.5F, -0.5F, 3.4F);
        this.main.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.3491F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 36, 26, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftLeg22 = new AdvancedModelRenderer(this);
        this.leftLeg22.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.leftLeg2.addChild(leftLeg22);
        this.setRotateAngle(leftLeg22, 0.1309F, -0.48F, -0.6545F);
        this.leftLeg22.cubeList.add(new ModelBox(leftLeg22, 9, 35, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.leftLeg23 = new AdvancedModelRenderer(this);
        this.leftLeg23.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftLeg22.addChild(leftLeg23);
        this.setRotateAngle(leftLeg23, 0.3927F, 0.0873F, 1.4835F);
        this.leftLeg23.cubeList.add(new ModelBox(leftLeg23, 0, 35, 0.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));
        this.leftLeg23.cubeList.add(new ModelBox(leftLeg23, 24, 31, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.leftLeg24 = new AdvancedModelRenderer(this);
        this.leftLeg24.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.leftLeg23.addChild(leftLeg24);
        this.setRotateAngle(leftLeg24, 0.1309F, 0.0F, -0.6981F);
        this.leftLeg24.cubeList.add(new ModelBox(leftLeg24, 19, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.leftLeg24.cubeList.add(new ModelBox(leftLeg24, 0, 27, 0.5F, 0.01F, -1.0F, 1, 0, 2, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.75F, -0.5F, 4.65F);
        this.main.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -1.0036F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 24, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        this.leftLeg32 = new AdvancedModelRenderer(this);
        this.leftLeg32.setRotationPoint(1.25F, 0.5F, -0.25F);
        this.leftLeg3.addChild(leftLeg32);
        this.setRotateAngle(leftLeg32, 0.0F, -0.4363F, -0.5672F);
        this.leftLeg32.cubeList.add(new ModelBox(leftLeg32, 12, 27, 0.0F, -0.25F, -0.5F, 7, 1, 1, 0.01F, true));
        this.leftLeg32.cubeList.add(new ModelBox(leftLeg32, 12, 24, 0.0F, -1.0F, -0.5F, 7, 1, 1, 0.0F, true));

        this.leftLeg33 = new AdvancedModelRenderer(this);
        this.leftLeg33.setRotationPoint(6.5F, 0.0F, 0.0F);
        this.leftLeg32.addChild(leftLeg33);
        this.setRotateAngle(leftLeg33, 0.0F, 0.0F, 1.2217F);
        this.leftLeg33.cubeList.add(new ModelBox(leftLeg33, 31, 0, 0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, true));
        this.leftLeg33.cubeList.add(new ModelBox(leftLeg33, 0, 16, 0.5F, -1.0F, 0.0F, 5, 1, 0, 0.0F, true));

        this.leftLeg34 = new AdvancedModelRenderer(this);
        this.leftLeg34.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.leftLeg33.addChild(leftLeg34);
        this.setRotateAngle(leftLeg34, 0.2182F, 0.0F, -0.4363F);
        this.leftLeg34.cubeList.add(new ModelBox(leftLeg34, 31, 3, -0.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, true));
        this.leftLeg34.cubeList.add(new ModelBox(leftLeg34, 11, 8, 1.0F, 0.01F, -1.0F, 1, 0, 2, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.5F, -0.5F, 2.5F);
        this.main.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, -0.3927F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 37, 15, -2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.rightLeg1.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, -0.5672F, 0.6545F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 36, 23, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightLeg12.addChild(rightLeg13);
        this.setRotateAngle(rightLeg13, 0.0F, -0.2618F, -1.3526F);
        this.rightLeg13.cubeList.add(new ModelBox(rightLeg13, 18, 35, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.rightLeg13.cubeList.add(new ModelBox(rightLeg13, 0, 32, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightLeg13.addChild(rightLeg14);
        this.setRotateAngle(rightLeg14, -0.1745F, 0.0F, 0.5236F);
        this.rightLeg14.cubeList.add(new ModelBox(rightLeg14, 19, 13, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.rightLeg14.cubeList.add(new ModelBox(rightLeg14, 27, 35, -1.5F, 0.01F, -1.0F, 1, 0, 2, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.5F, -0.5F, 3.4F);
        this.main.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.3491F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 36, 26, -2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightLeg22 = new AdvancedModelRenderer(this);
        this.rightLeg22.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.rightLeg2.addChild(rightLeg22);
        this.setRotateAngle(rightLeg22, 0.1309F, 0.48F, 0.6545F);
        this.rightLeg22.cubeList.add(new ModelBox(rightLeg22, 9, 35, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.rightLeg23 = new AdvancedModelRenderer(this);
        this.rightLeg23.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightLeg22.addChild(rightLeg23);
        this.setRotateAngle(rightLeg23, 0.3927F, -0.0873F, -1.4835F);
        this.rightLeg23.cubeList.add(new ModelBox(rightLeg23, 0, 35, -3.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
        this.rightLeg23.cubeList.add(new ModelBox(rightLeg23, 24, 31, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.rightLeg24 = new AdvancedModelRenderer(this);
        this.rightLeg24.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.rightLeg23.addChild(rightLeg24);
        this.setRotateAngle(rightLeg24, 0.1309F, 0.0F, 0.6981F);
        this.rightLeg24.cubeList.add(new ModelBox(rightLeg24, 19, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.rightLeg24.cubeList.add(new ModelBox(rightLeg24, 0, 27, -1.5F, 0.01F, -1.0F, 1, 0, 2, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.75F, -0.5F, 4.65F);
        this.main.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 1.0036F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 24, -2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.rightLeg32 = new AdvancedModelRenderer(this);
        this.rightLeg32.setRotationPoint(-1.25F, 0.5F, -0.25F);
        this.rightLeg3.addChild(rightLeg32);
        this.setRotateAngle(rightLeg32, 0.0F, 0.4363F, 0.5672F);
        this.rightLeg32.cubeList.add(new ModelBox(rightLeg32, 12, 27, -7.0F, -0.25F, -0.5F, 7, 1, 1, 0.01F, false));
        this.rightLeg32.cubeList.add(new ModelBox(rightLeg32, 12, 24, -7.0F, -1.0F, -0.5F, 7, 1, 1, 0.0F, false));

        this.rightLeg33 = new AdvancedModelRenderer(this);
        this.rightLeg33.setRotationPoint(-6.5F, 0.0F, 0.0F);
        this.rightLeg32.addChild(rightLeg33);
        this.setRotateAngle(rightLeg33, 0.0F, 0.0F, -1.2217F);
        this.rightLeg33.cubeList.add(new ModelBox(rightLeg33, 31, 0, -6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));
        this.rightLeg33.cubeList.add(new ModelBox(rightLeg33, 0, 16, -5.5F, -1.0F, 0.0F, 5, 1, 0, 0.0F, false));

        this.rightLeg34 = new AdvancedModelRenderer(this);
        this.rightLeg34.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.rightLeg33.addChild(rightLeg34);
        this.setRotateAngle(rightLeg34, 0.2182F, 0.0F, 0.4363F);
        this.rightLeg34.cubeList.add(new ModelBox(rightLeg34, 31, 3, -2.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));
        this.rightLeg34.cubeList.add(new ModelBox(rightLeg34, 11, 8, -2.0F, 0.01F, -1.0F, 1, 0, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(main, 1.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.25F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.30F;
        this.main.offsetX = -0.05F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(40);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.9F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraSchizodactylus ee = (EntityPrehistoricFloraSchizodactylus) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSchizodactylus ee = (EntityPrehistoricFloraSchizodactylus) entitylivingbaseIn;

        if(ee.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }



        if (ee.getAnimation() == ee.JUMP_ANIMATION) {
            animJump(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }


    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSchizodactylus entity = (EntityPrehistoricFloraSchizodactylus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1120+150))*1.5), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1120+60))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+100))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+340))*5), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.67311-(0)));
            yy = 22.5 + (((tickAnim - 0) / 2) * (3.64993-(22.5)));
            zz = -5 + (((tickAnim - 0) / 2) * (7.56644-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.67311 + (((tickAnim - 2) / 1) * (0-(0.67311)));
            yy = 3.64993 + (((tickAnim - 2) / 1) * (-15-(3.64993)));
            zz = 7.56644 + (((tickAnim - 2) / 1) * (0-(7.56644)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -15 + (((tickAnim - 3) / 3) * (22.5-(-15)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0.67311-(0)));
            yy = 22.5 + (((tickAnim - 6) / 2) * (3.64993-(22.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (7.56644-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.67311 + (((tickAnim - 8) / 2) * (9.42961-(0.67311)));
            yy = 3.64993 + (((tickAnim - 8) / 2) * (-13.96498-(3.64993)));
            zz = 7.56644 + (((tickAnim - 8) / 2) * (-15.61249-(7.56644)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.42961 + (((tickAnim - 10) / 3) * (0-(9.42961)));
            yy = -13.96498 + (((tickAnim - 10) / 3) * (22.5-(-13.96498)));
            zz = -15.61249 + (((tickAnim - 10) / 3) * (-5-(-15.61249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.44333 + (((tickAnim - 0) / 2) * (-19.52546-(3.44333)));
            yy = 32.8512 + (((tickAnim - 0) / 2) * (-3.13104-(32.8512)));
            zz = -9.14405 + (((tickAnim - 0) / 2) * (18.82977-(-9.14405)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -19.52546 + (((tickAnim - 2) / 1) * (0-(-19.52546)));
            yy = -3.13104 + (((tickAnim - 2) / 1) * (0-(-3.13104)));
            zz = 18.82977 + (((tickAnim - 2) / 1) * (-25-(18.82977)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (32.8512-(0)));
            zz = -25 + (((tickAnim - 3) / 3) * (-9.14405-(-25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3.44333 + (((tickAnim - 6) / 2) * (-19.52546-(3.44333)));
            yy = 32.8512 + (((tickAnim - 6) / 2) * (-3.13104-(32.8512)));
            zz = -9.14405 + (((tickAnim - 6) / 2) * (18.82977-(-9.14405)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.52546 + (((tickAnim - 8) / 2) * (0-(-19.52546)));
            yy = -3.13104 + (((tickAnim - 8) / 2) * (0-(-3.13104)));
            zz = 18.82977 + (((tickAnim - 8) / 2) * (-20-(18.82977)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (32.8512-(0)));
            zz = -20 + (((tickAnim - 10) / 3) * (-9.14405-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (15-(0)));
            zz = -20 + (((tickAnim - 0) / 3) * (10-(-20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 3) / 3) * (0-(15)));
            zz = 10 + (((tickAnim - 3) / 3) * (-20-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (15-(0)));
            zz = -20 + (((tickAnim - 6) / 4) * (22.5-(-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 10) / 3) * (0-(15)));
            zz = 22.5 + (((tickAnim - 10) / 3) * (-20-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.48848 + (((tickAnim - 0) / 3) * (10-(22.48848)));
            yy = 0.54094 + (((tickAnim - 0) / 3) * (0-(0.54094)));
            zz = 7.55919 + (((tickAnim - 0) / 3) * (2.5-(7.55919)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 3) / 3) * (22.5-(10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 3) * (10-(2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 6) / 4) * (10-(22.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 10 + (((tickAnim - 6) / 4) * (20-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (22.48848-(10)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.54094-(0)));
            zz = 20 + (((tickAnim - 10) / 3) * (7.55919-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg14, rightLeg14.rotateAngleX + (float) Math.toRadians(xx), rightLeg14.rotateAngleY + (float) Math.toRadians(yy), rightLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (20-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 20 + (((tickAnim - 5) / 1) * (0-(20)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-5.72511-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (9.4987-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-11.50839-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5.72511 + (((tickAnim - 10) / 1) * (0-(-5.72511)));
            yy = 9.4987 + (((tickAnim - 10) / 1) * (0-(9.4987)));
            zz = -11.50839 + (((tickAnim - 10) / 1) * (20-(-11.50839)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 20 + (((tickAnim - 11) / 2) * (0-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.69104 + (((tickAnim - 0) / 3) * (-15.5254-(-11.69104)));
            yy = -46.08745 + (((tickAnim - 0) / 3) * (9.9065-(-46.08745)));
            zz = -11.51163 + (((tickAnim - 0) / 3) * (-25.27002-(-11.51163)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.5254 + (((tickAnim - 3) / 2) * (-12.32117-(-15.5254)));
            yy = 9.9065 + (((tickAnim - 3) / 2) * (-17.37517-(9.9065)));
            zz = -25.27002 + (((tickAnim - 3) / 2) * (-10.81499-(-25.27002)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -12.32117 + (((tickAnim - 5) / 1) * (-11.69104-(-12.32117)));
            yy = -17.37517 + (((tickAnim - 5) / 1) * (-46.08745-(-17.37517)));
            zz = -10.81499 + (((tickAnim - 5) / 1) * (-11.51163-(-10.81499)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.69104 + (((tickAnim - 6) / 2) * (-13.60822-(-11.69104)));
            yy = -46.08745 + (((tickAnim - 6) / 2) * (-18.09047-(-46.08745)));
            zz = -11.51163 + (((tickAnim - 6) / 2) * (-18.39083-(-11.51163)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.60822 + (((tickAnim - 8) / 2) * (-13.41919-(-13.60822)));
            yy = -18.09047 + (((tickAnim - 8) / 2) * (-12.14438-(-18.09047)));
            zz = -18.39083 + (((tickAnim - 8) / 2) * (-19.52258-(-18.39083)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -13.41919 + (((tickAnim - 10) / 1) * (-12.32117-(-13.41919)));
            yy = -12.14438 + (((tickAnim - 10) / 1) * (-17.37517-(-12.14438)));
            zz = -19.52258 + (((tickAnim - 10) / 1) * (-10.81499-(-19.52258)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.32117 + (((tickAnim - 11) / 2) * (-11.69104-(-12.32117)));
            yy = -17.37517 + (((tickAnim - 11) / 2) * (-46.08745-(-17.37517)));
            zz = -10.81499 + (((tickAnim - 11) / 2) * (-11.51163-(-10.81499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 17.5 + (((tickAnim - 3) / 2) * (-33.75-(17.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -33.75 + (((tickAnim - 5) / 1) * (0-(-33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-23.58482-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.11881-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (30.04624-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -23.58482 + (((tickAnim - 10) / 1) * (0-(-23.58482)));
            yy = 0.11881 + (((tickAnim - 10) / 1) * (0-(0.11881)));
            zz = 30.04624 + (((tickAnim - 10) / 1) * (-33.75-(30.04624)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -33.75 + (((tickAnim - 11) / 2) * (0-(-33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg23, rightLeg23.rotateAngleX + (float) Math.toRadians(xx), rightLeg23.rotateAngleY + (float) Math.toRadians(yy), rightLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (4.95392-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.08089-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (12.38206-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.95392 + (((tickAnim - 8) / 2) * (10-(4.95392)));
            yy = -1.08089 + (((tickAnim - 8) / 2) * (0-(-1.08089)));
            zz = 12.38206 + (((tickAnim - 8) / 2) * (15-(12.38206)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 10) / 3) * (0-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg24, rightLeg24.rotateAngleX + (float) Math.toRadians(xx), rightLeg24.rotateAngleY + (float) Math.toRadians(yy), rightLeg24.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-15-(0)));
            zz = -20 + (((tickAnim - 0) / 2) * (26.25-(-20)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-1.52635-(0)));
            yy = -15 + (((tickAnim - 2) / 1) * (-8.06665-(-15)));
            zz = 26.25 + (((tickAnim - 2) / 1) * (7.27278-(26.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.52635 + (((tickAnim - 3) / 2) * (0-(-1.52635)));
            yy = -8.06665 + (((tickAnim - 3) / 2) * (-4-(-8.06665)));
            zz = 7.27278 + (((tickAnim - 3) / 2) * (0-(7.27278)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -4 + (((tickAnim - 5) / 1) * (0-(-4)));
            zz = 0 + (((tickAnim - 5) / 1) * (-17.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-20-(0)));
            zz = -17.5 + (((tickAnim - 6) / 2) * (26.25-(-17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 2) * (-8-(-20)));
            zz = 26.25 + (((tickAnim - 8) / 2) * (12.5-(26.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -8 + (((tickAnim - 10) / 3) * (0-(-8)));
            zz = 12.5 + (((tickAnim - 10) / 3) * (-20-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 0) / 2) * (-33.75-(15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -33.75 + (((tickAnim - 2) / 1) * (-62.5-(-33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -62.5 + (((tickAnim - 3) / 3) * (15-(-62.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 6) / 2) * (-33.75-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -33.75 + (((tickAnim - 8) / 2) * (-62.5-(-33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -62.5 + (((tickAnim - 10) / 3) * (15-(-62.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg33, rightLeg33.rotateAngleX + (float) Math.toRadians(xx), rightLeg33.rotateAngleY + (float) Math.toRadians(yy), rightLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 20 + (((tickAnim - 0) / 3) * (57.5-(20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-10.07558-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.86717-(0)));
            zz = 57.5 + (((tickAnim - 3) / 3) * (24.96271-(57.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.07558 + (((tickAnim - 6) / 4) * (0-(-10.07558)));
            yy = -0.86717 + (((tickAnim - 6) / 4) * (0-(-0.86717)));
            zz = 24.96271 + (((tickAnim - 6) / 4) * (55-(24.96271)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 55 + (((tickAnim - 10) / 3) * (20-(55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg34, rightLeg34.rotateAngleX + (float) Math.toRadians(xx), rightLeg34.rotateAngleY + (float) Math.toRadians(yy), rightLeg34.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 0) / 3) * (-22.5-(15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.67311-(0)));
            yy = -22.5 + (((tickAnim - 3) / 2) * (-3.64993-(-22.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (-7.56644-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.67311 + (((tickAnim - 5) / 1) * (12.99301-(0.67311)));
            yy = -3.64993 + (((tickAnim - 5) / 1) * (12.99178-(-3.64993)));
            zz = -7.56644 + (((tickAnim - 5) / 1) * (21.67413-(-7.56644)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 12.99301 + (((tickAnim - 6) / 4) * (0-(12.99301)));
            yy = 12.99178 + (((tickAnim - 6) / 4) * (-22.5-(12.99178)));
            zz = 21.67413 + (((tickAnim - 6) / 4) * (5-(21.67413)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0.67311-(0)));
            yy = -22.5 + (((tickAnim - 10) / 1) * (-3.64993-(-22.5)));
            zz = 5 + (((tickAnim - 10) / 1) * (-7.56644-(5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.67311 + (((tickAnim - 11) / 2) * (0-(0.67311)));
            yy = -3.64993 + (((tickAnim - 11) / 2) * (15-(-3.64993)));
            zz = -7.56644 + (((tickAnim - 11) / 2) * (0-(-7.56644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-32.8512-(0)));
            zz = 25 + (((tickAnim - 0) / 3) * (9.14405-(25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.44333 + (((tickAnim - 3) / 2) * (-19.52546-(3.44333)));
            yy = -32.8512 + (((tickAnim - 3) / 2) * (3.13104-(-32.8512)));
            zz = 9.14405 + (((tickAnim - 3) / 2) * (-18.82977-(9.14405)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -19.52546 + (((tickAnim - 5) / 1) * (0-(-19.52546)));
            yy = 3.13104 + (((tickAnim - 5) / 1) * (0-(3.13104)));
            zz = -18.82977 + (((tickAnim - 5) / 1) * (25-(-18.82977)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-32.8512-(0)));
            zz = 25 + (((tickAnim - 6) / 4) * (9.14405-(25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 3.44333 + (((tickAnim - 10) / 1) * (-19.52546-(3.44333)));
            yy = -32.8512 + (((tickAnim - 10) / 1) * (3.13104-(-32.8512)));
            zz = 9.14405 + (((tickAnim - 10) / 1) * (-18.82977-(9.14405)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -19.52546 + (((tickAnim - 11) / 2) * (0-(-19.52546)));
            yy = 3.13104 + (((tickAnim - 11) / 2) * (0-(3.13104)));
            zz = -18.82977 + (((tickAnim - 11) / 2) * (25-(-18.82977)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 3) * (0-(-15)));
            zz = -10 + (((tickAnim - 0) / 3) * (20-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-15-(0)));
            zz = 20 + (((tickAnim - 3) / 3) * (-22.5-(20)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -15 + (((tickAnim - 6) / 4) * (0-(-15)));
            zz = -22.5 + (((tickAnim - 6) / 4) * (20-(-22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-15-(0)));
            zz = 20 + (((tickAnim - 10) / 3) * (-10-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (22.5-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-10-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22.5 + (((tickAnim - 3) / 3) * (10-(22.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 3) * (-25-(-10)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 6) / 4) * (22.48848-(10)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.54094-(0)));
            zz = -25 + (((tickAnim - 6) / 4) * (-7.55919-(-25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.48848 + (((tickAnim - 10) / 3) * (10-(22.48848)));
            yy = -0.54094 + (((tickAnim - 10) / 3) * (0-(-0.54094)));
            zz = -7.55919 + (((tickAnim - 10) / 3) * (-2.5-(-7.55919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg14, leftLeg14.rotateAngleX + (float) Math.toRadians(xx), leftLeg14.rotateAngleY + (float) Math.toRadians(yy), leftLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 2) * (0-(-10)));
            zz = 0 + (((tickAnim - 0) / 2) * (-20-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -20 + (((tickAnim - 2) / 1) * (0-(-20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-5.72511-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-9.4987-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (11.50839-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5.72511 + (((tickAnim - 6) / 2) * (0-(-5.72511)));
            yy = -9.4987 + (((tickAnim - 6) / 2) * (0-(-9.4987)));
            zz = 11.50839 + (((tickAnim - 6) / 2) * (-20-(11.50839)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -20 + (((tickAnim - 8) / 2) * (0-(-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -14.09539 + (((tickAnim - 0) / 2) * (-12.32117-(-14.09539)));
            yy = 12.41691 + (((tickAnim - 0) / 2) * (17.37517-(12.41691)));
            zz = 22.09803 + (((tickAnim - 0) / 2) * (10.81499-(22.09803)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.32117 + (((tickAnim - 2) / 1) * (-11.69104-(-12.32117)));
            yy = 17.37517 + (((tickAnim - 2) / 1) * (46.08745-(17.37517)));
            zz = 10.81499 + (((tickAnim - 2) / 1) * (11.51163-(10.81499)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.69104 + (((tickAnim - 3) / 2) * (-15.15073-(-11.69104)));
            yy = 46.08745 + (((tickAnim - 3) / 2) * (19.2914-(46.08745)));
            zz = 11.51163 + (((tickAnim - 3) / 2) * (28.43745-(11.51163)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15.15073 + (((tickAnim - 5) / 1) * (-17.23721-(-15.15073)));
            yy = 19.2914 + (((tickAnim - 5) / 1) * (14.2001-(19.2914)));
            zz = 28.43745 + (((tickAnim - 5) / 1) * (34.86185-(28.43745)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -17.23721 + (((tickAnim - 6) / 2) * (-12.32117-(-17.23721)));
            yy = 14.2001 + (((tickAnim - 6) / 2) * (17.37517-(14.2001)));
            zz = 34.86185 + (((tickAnim - 6) / 2) * (10.81499-(34.86185)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.32117 + (((tickAnim - 8) / 2) * (-11.69104-(-12.32117)));
            yy = 17.37517 + (((tickAnim - 8) / 2) * (46.08745-(17.37517)));
            zz = 10.81499 + (((tickAnim - 8) / 2) * (11.51163-(10.81499)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.69104 + (((tickAnim - 10) / 3) * (-15.5254-(-11.69104)));
            yy = 46.08745 + (((tickAnim - 10) / 3) * (-9.9065-(46.08745)));
            zz = 11.51163 + (((tickAnim - 10) / 3) * (25.27002-(11.51163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -17.5 + (((tickAnim - 0) / 2) * (33.75-(-17.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 33.75 + (((tickAnim - 2) / 1) * (0-(33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-23.58482-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.11881-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-30.04624-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -23.58482 + (((tickAnim - 6) / 2) * (0-(-23.58482)));
            yy = -0.11881 + (((tickAnim - 6) / 2) * (0-(-0.11881)));
            zz = -30.04624 + (((tickAnim - 6) / 2) * (33.75-(-30.04624)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 33.75 + (((tickAnim - 8) / 2) * (0-(33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-17.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg23, leftLeg23.rotateAngleX + (float) Math.toRadians(xx), leftLeg23.rotateAngleY + (float) Math.toRadians(yy), leftLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (4.81594-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (2.15393-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-17.26758-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 4.81594 + (((tickAnim - 5) / 1) * (10-(4.81594)));
            yy = 2.15393 + (((tickAnim - 5) / 1) * (0-(2.15393)));
            zz = -17.26758 + (((tickAnim - 5) / 1) * (-15-(-17.26758)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 6) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -15 + (((tickAnim - 6) / 4) * (0-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg24, leftLeg24.rotateAngleX + (float) Math.toRadians(xx), leftLeg24.rotateAngleY + (float) Math.toRadians(yy), leftLeg24.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.91617-(0)));
            yy = 8 + (((tickAnim - 0) / 2) * (4.08367-(8)));
            zz = -12.5 + (((tickAnim - 0) / 2) * (-5.35373-(-12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.91617 + (((tickAnim - 2) / 1) * (0-(1.91617)));
            yy = 4.08367 + (((tickAnim - 2) / 1) * (0-(4.08367)));
            zz = -5.35373 + (((tickAnim - 2) / 1) * (12.5-(-5.35373)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (20-(0)));
            zz = 12.5 + (((tickAnim - 3) / 2) * (-26.25-(12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 1) * (8-(20)));
            zz = -26.25 + (((tickAnim - 5) / 1) * (-12.5-(-26.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 8 + (((tickAnim - 6) / 4) * (0-(8)));
            zz = -12.5 + (((tickAnim - 6) / 4) * (12.5-(-12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (15-(0)));
            zz = 12.5 + (((tickAnim - 10) / 1) * (-26.25-(12.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 15 + (((tickAnim - 11) / 2) * (8-(15)));
            zz = -26.25 + (((tickAnim - 11) / 2) * (-12.5-(-26.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 62.5 + (((tickAnim - 0) / 3) * (-15-(62.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 2) * (33.75-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 33.75 + (((tickAnim - 5) / 1) * (62.5-(33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 62.5 + (((tickAnim - 6) / 4) * (-15-(62.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 1) * (33.75-(-15)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 33.75 + (((tickAnim - 11) / 2) * (62.5-(33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg33, leftLeg33.rotateAngleX + (float) Math.toRadians(xx), leftLeg33.rotateAngleY + (float) Math.toRadians(yy), leftLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 3) * (-15-(-45)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 3) * (-45-(-15)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -45 + (((tickAnim - 6) / 4) * (-15-(-45)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 3) * (-45-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg34, leftLeg34.rotateAngleX + (float) Math.toRadians(xx), leftLeg34.rotateAngleY + (float) Math.toRadians(yy), leftLeg34.rotateAngleZ + (float) Math.toRadians(zz));
        
    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraSchizodactylus entity = (EntityPrehistoricFloraSchizodactylus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1120+150))*1.5), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+150))*2.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1120+60))*0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5), leftAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+60))*5), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+100))*5), rightAntenna.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*560+340))*5), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0.67311-(0)));
            yy = 22.5 + (((tickAnim - 0) / 2) * (3.64993-(22.5)));
            zz = -5 + (((tickAnim - 0) / 2) * (7.56644-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.67311 + (((tickAnim - 2) / 1) * (0-(0.67311)));
            yy = 3.64993 + (((tickAnim - 2) / 1) * (-15-(3.64993)));
            zz = 7.56644 + (((tickAnim - 2) / 1) * (0-(7.56644)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -15 + (((tickAnim - 3) / 3) * (22.5-(-15)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0.67311-(0)));
            yy = 22.5 + (((tickAnim - 6) / 2) * (3.64993-(22.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (7.56644-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.67311 + (((tickAnim - 8) / 2) * (9.42961-(0.67311)));
            yy = 3.64993 + (((tickAnim - 8) / 2) * (-13.96498-(3.64993)));
            zz = 7.56644 + (((tickAnim - 8) / 2) * (-15.61249-(7.56644)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 9.42961 + (((tickAnim - 10) / 3) * (0-(9.42961)));
            yy = -13.96498 + (((tickAnim - 10) / 3) * (22.5-(-13.96498)));
            zz = -15.61249 + (((tickAnim - 10) / 3) * (-5-(-15.61249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 3.44333 + (((tickAnim - 0) / 2) * (-19.52546-(3.44333)));
            yy = 32.8512 + (((tickAnim - 0) / 2) * (-3.13104-(32.8512)));
            zz = -9.14405 + (((tickAnim - 0) / 2) * (18.82977-(-9.14405)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -19.52546 + (((tickAnim - 2) / 1) * (0-(-19.52546)));
            yy = -3.13104 + (((tickAnim - 2) / 1) * (0-(-3.13104)));
            zz = 18.82977 + (((tickAnim - 2) / 1) * (-25-(18.82977)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (32.8512-(0)));
            zz = -25 + (((tickAnim - 3) / 3) * (-9.14405-(-25)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3.44333 + (((tickAnim - 6) / 2) * (-19.52546-(3.44333)));
            yy = 32.8512 + (((tickAnim - 6) / 2) * (-3.13104-(32.8512)));
            zz = -9.14405 + (((tickAnim - 6) / 2) * (18.82977-(-9.14405)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.52546 + (((tickAnim - 8) / 2) * (0-(-19.52546)));
            yy = -3.13104 + (((tickAnim - 8) / 2) * (0-(-3.13104)));
            zz = 18.82977 + (((tickAnim - 8) / 2) * (-20-(18.82977)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (32.8512-(0)));
            zz = -20 + (((tickAnim - 10) / 3) * (-9.14405-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (15-(0)));
            zz = -20 + (((tickAnim - 0) / 3) * (10-(-20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 3) / 3) * (0-(15)));
            zz = 10 + (((tickAnim - 3) / 3) * (-20-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (15-(0)));
            zz = -20 + (((tickAnim - 6) / 4) * (22.5-(-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 10) / 3) * (0-(15)));
            zz = 22.5 + (((tickAnim - 10) / 3) * (-20-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.48848 + (((tickAnim - 0) / 3) * (10-(22.48848)));
            yy = 0.54094 + (((tickAnim - 0) / 3) * (0-(0.54094)));
            zz = 7.55919 + (((tickAnim - 0) / 3) * (2.5-(7.55919)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 3) / 3) * (22.5-(10)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 3) * (10-(2.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 6) / 4) * (10-(22.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 10 + (((tickAnim - 6) / 4) * (20-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (22.48848-(10)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.54094-(0)));
            zz = 20 + (((tickAnim - 10) / 3) * (7.55919-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg14, rightLeg14.rotateAngleX + (float) Math.toRadians(xx), rightLeg14.rotateAngleY + (float) Math.toRadians(yy), rightLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (20-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 20 + (((tickAnim - 5) / 1) * (0-(20)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-5.72511-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (9.4987-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-11.50839-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -5.72511 + (((tickAnim - 10) / 1) * (0-(-5.72511)));
            yy = 9.4987 + (((tickAnim - 10) / 1) * (0-(9.4987)));
            zz = -11.50839 + (((tickAnim - 10) / 1) * (20-(-11.50839)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 20 + (((tickAnim - 11) / 2) * (0-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -11.69104 + (((tickAnim - 0) / 3) * (-15.5254-(-11.69104)));
            yy = -46.08745 + (((tickAnim - 0) / 3) * (9.9065-(-46.08745)));
            zz = -11.51163 + (((tickAnim - 0) / 3) * (-25.27002-(-11.51163)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15.5254 + (((tickAnim - 3) / 2) * (-12.32117-(-15.5254)));
            yy = 9.9065 + (((tickAnim - 3) / 2) * (-17.37517-(9.9065)));
            zz = -25.27002 + (((tickAnim - 3) / 2) * (-10.81499-(-25.27002)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -12.32117 + (((tickAnim - 5) / 1) * (-11.69104-(-12.32117)));
            yy = -17.37517 + (((tickAnim - 5) / 1) * (-46.08745-(-17.37517)));
            zz = -10.81499 + (((tickAnim - 5) / 1) * (-11.51163-(-10.81499)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.69104 + (((tickAnim - 6) / 2) * (-13.60822-(-11.69104)));
            yy = -46.08745 + (((tickAnim - 6) / 2) * (-18.09047-(-46.08745)));
            zz = -11.51163 + (((tickAnim - 6) / 2) * (-18.39083-(-11.51163)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.60822 + (((tickAnim - 8) / 2) * (-13.41919-(-13.60822)));
            yy = -18.09047 + (((tickAnim - 8) / 2) * (-12.14438-(-18.09047)));
            zz = -18.39083 + (((tickAnim - 8) / 2) * (-19.52258-(-18.39083)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -13.41919 + (((tickAnim - 10) / 1) * (-12.32117-(-13.41919)));
            yy = -12.14438 + (((tickAnim - 10) / 1) * (-17.37517-(-12.14438)));
            zz = -19.52258 + (((tickAnim - 10) / 1) * (-10.81499-(-19.52258)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.32117 + (((tickAnim - 11) / 2) * (-11.69104-(-12.32117)));
            yy = -17.37517 + (((tickAnim - 11) / 2) * (-46.08745-(-17.37517)));
            zz = -10.81499 + (((tickAnim - 11) / 2) * (-11.51163-(-10.81499)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 17.5 + (((tickAnim - 3) / 2) * (-33.75-(17.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = -33.75 + (((tickAnim - 5) / 1) * (0-(-33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-23.58482-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0.11881-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (30.04624-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -23.58482 + (((tickAnim - 10) / 1) * (0-(-23.58482)));
            yy = 0.11881 + (((tickAnim - 10) / 1) * (0-(0.11881)));
            zz = 30.04624 + (((tickAnim - 10) / 1) * (-33.75-(30.04624)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -33.75 + (((tickAnim - 11) / 2) * (0-(-33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg23, rightLeg23.rotateAngleX + (float) Math.toRadians(xx), rightLeg23.rotateAngleY + (float) Math.toRadians(yy), rightLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (4.95392-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.08089-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (12.38206-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.95392 + (((tickAnim - 8) / 2) * (10-(4.95392)));
            yy = -1.08089 + (((tickAnim - 8) / 2) * (0-(-1.08089)));
            zz = 12.38206 + (((tickAnim - 8) / 2) * (15-(12.38206)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 15 + (((tickAnim - 10) / 3) * (0-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg24, rightLeg24.rotateAngleX + (float) Math.toRadians(xx), rightLeg24.rotateAngleY + (float) Math.toRadians(yy), rightLeg24.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-15-(0)));
            zz = -20 + (((tickAnim - 0) / 2) * (26.25-(-20)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-1.52635-(0)));
            yy = -15 + (((tickAnim - 2) / 1) * (-8.06665-(-15)));
            zz = 26.25 + (((tickAnim - 2) / 1) * (7.27278-(26.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.52635 + (((tickAnim - 3) / 2) * (0-(-1.52635)));
            yy = -8.06665 + (((tickAnim - 3) / 2) * (-4-(-8.06665)));
            zz = 7.27278 + (((tickAnim - 3) / 2) * (0-(7.27278)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -4 + (((tickAnim - 5) / 1) * (0-(-4)));
            zz = 0 + (((tickAnim - 5) / 1) * (-17.5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-20-(0)));
            zz = -17.5 + (((tickAnim - 6) / 2) * (26.25-(-17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 2) * (-8-(-20)));
            zz = 26.25 + (((tickAnim - 8) / 2) * (12.5-(26.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -8 + (((tickAnim - 10) / 3) * (0-(-8)));
            zz = 12.5 + (((tickAnim - 10) / 3) * (-20-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 0) / 2) * (-33.75-(15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -33.75 + (((tickAnim - 2) / 1) * (-62.5-(-33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -62.5 + (((tickAnim - 3) / 3) * (15-(-62.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 6) / 2) * (-33.75-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -33.75 + (((tickAnim - 8) / 2) * (-62.5-(-33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -62.5 + (((tickAnim - 10) / 3) * (15-(-62.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg33, rightLeg33.rotateAngleX + (float) Math.toRadians(xx), rightLeg33.rotateAngleY + (float) Math.toRadians(yy), rightLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 20 + (((tickAnim - 0) / 3) * (57.5-(20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-10.07558-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.86717-(0)));
            zz = 57.5 + (((tickAnim - 3) / 3) * (24.96271-(57.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.07558 + (((tickAnim - 6) / 4) * (0-(-10.07558)));
            yy = -0.86717 + (((tickAnim - 6) / 4) * (0-(-0.86717)));
            zz = 24.96271 + (((tickAnim - 6) / 4) * (55-(24.96271)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 55 + (((tickAnim - 10) / 3) * (20-(55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg34, rightLeg34.rotateAngleX + (float) Math.toRadians(xx), rightLeg34.rotateAngleY + (float) Math.toRadians(yy), rightLeg34.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 0) / 3) * (-22.5-(15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.67311-(0)));
            yy = -22.5 + (((tickAnim - 3) / 2) * (-3.64993-(-22.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (-7.56644-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0.67311 + (((tickAnim - 5) / 1) * (12.99301-(0.67311)));
            yy = -3.64993 + (((tickAnim - 5) / 1) * (12.99178-(-3.64993)));
            zz = -7.56644 + (((tickAnim - 5) / 1) * (21.67413-(-7.56644)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 12.99301 + (((tickAnim - 6) / 4) * (0-(12.99301)));
            yy = 12.99178 + (((tickAnim - 6) / 4) * (-22.5-(12.99178)));
            zz = 21.67413 + (((tickAnim - 6) / 4) * (5-(21.67413)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0.67311-(0)));
            yy = -22.5 + (((tickAnim - 10) / 1) * (-3.64993-(-22.5)));
            zz = 5 + (((tickAnim - 10) / 1) * (-7.56644-(5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.67311 + (((tickAnim - 11) / 2) * (0-(0.67311)));
            yy = -3.64993 + (((tickAnim - 11) / 2) * (15-(-3.64993)));
            zz = -7.56644 + (((tickAnim - 11) / 2) * (0-(-7.56644)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-32.8512-(0)));
            zz = 25 + (((tickAnim - 0) / 3) * (9.14405-(25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.44333 + (((tickAnim - 3) / 2) * (-19.52546-(3.44333)));
            yy = -32.8512 + (((tickAnim - 3) / 2) * (3.13104-(-32.8512)));
            zz = 9.14405 + (((tickAnim - 3) / 2) * (-18.82977-(9.14405)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -19.52546 + (((tickAnim - 5) / 1) * (0-(-19.52546)));
            yy = 3.13104 + (((tickAnim - 5) / 1) * (0-(3.13104)));
            zz = -18.82977 + (((tickAnim - 5) / 1) * (25-(-18.82977)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (3.44333-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-32.8512-(0)));
            zz = 25 + (((tickAnim - 6) / 4) * (9.14405-(25)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 3.44333 + (((tickAnim - 10) / 1) * (-19.52546-(3.44333)));
            yy = -32.8512 + (((tickAnim - 10) / 1) * (3.13104-(-32.8512)));
            zz = 9.14405 + (((tickAnim - 10) / 1) * (-18.82977-(9.14405)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -19.52546 + (((tickAnim - 11) / 2) * (0-(-19.52546)));
            yy = 3.13104 + (((tickAnim - 11) / 2) * (0-(3.13104)));
            zz = -18.82977 + (((tickAnim - 11) / 2) * (25-(-18.82977)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 3) * (0-(-15)));
            zz = -10 + (((tickAnim - 0) / 3) * (20-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-15-(0)));
            zz = 20 + (((tickAnim - 3) / 3) * (-22.5-(20)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -15 + (((tickAnim - 6) / 4) * (0-(-15)));
            zz = -22.5 + (((tickAnim - 6) / 4) * (20-(-22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-15-(0)));
            zz = 20 + (((tickAnim - 10) / 3) * (-10-(20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (22.5-(10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-10-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 22.5 + (((tickAnim - 3) / 3) * (10-(22.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 3) * (-25-(-10)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 6) / 4) * (22.48848-(10)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.54094-(0)));
            zz = -25 + (((tickAnim - 6) / 4) * (-7.55919-(-25)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.48848 + (((tickAnim - 10) / 3) * (10-(22.48848)));
            yy = -0.54094 + (((tickAnim - 10) / 3) * (0-(-0.54094)));
            zz = -7.55919 + (((tickAnim - 10) / 3) * (-2.5-(-7.55919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg14, leftLeg14.rotateAngleX + (float) Math.toRadians(xx), leftLeg14.rotateAngleY + (float) Math.toRadians(yy), leftLeg14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -10 + (((tickAnim - 0) / 2) * (0-(-10)));
            zz = 0 + (((tickAnim - 0) / 2) * (-20-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -20 + (((tickAnim - 2) / 1) * (0-(-20)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-5.72511-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-9.4987-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (11.50839-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5.72511 + (((tickAnim - 6) / 2) * (0-(-5.72511)));
            yy = -9.4987 + (((tickAnim - 6) / 2) * (0-(-9.4987)));
            zz = 11.50839 + (((tickAnim - 6) / 2) * (-20-(11.50839)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -20 + (((tickAnim - 8) / 2) * (0-(-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -14.09539 + (((tickAnim - 0) / 2) * (-12.32117-(-14.09539)));
            yy = 12.41691 + (((tickAnim - 0) / 2) * (17.37517-(12.41691)));
            zz = 22.09803 + (((tickAnim - 0) / 2) * (10.81499-(22.09803)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -12.32117 + (((tickAnim - 2) / 1) * (-11.69104-(-12.32117)));
            yy = 17.37517 + (((tickAnim - 2) / 1) * (46.08745-(17.37517)));
            zz = 10.81499 + (((tickAnim - 2) / 1) * (11.51163-(10.81499)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.69104 + (((tickAnim - 3) / 2) * (-15.15073-(-11.69104)));
            yy = 46.08745 + (((tickAnim - 3) / 2) * (19.2914-(46.08745)));
            zz = 11.51163 + (((tickAnim - 3) / 2) * (28.43745-(11.51163)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15.15073 + (((tickAnim - 5) / 1) * (-17.23721-(-15.15073)));
            yy = 19.2914 + (((tickAnim - 5) / 1) * (14.2001-(19.2914)));
            zz = 28.43745 + (((tickAnim - 5) / 1) * (34.86185-(28.43745)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -17.23721 + (((tickAnim - 6) / 2) * (-12.32117-(-17.23721)));
            yy = 14.2001 + (((tickAnim - 6) / 2) * (17.37517-(14.2001)));
            zz = 34.86185 + (((tickAnim - 6) / 2) * (10.81499-(34.86185)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12.32117 + (((tickAnim - 8) / 2) * (-11.69104-(-12.32117)));
            yy = 17.37517 + (((tickAnim - 8) / 2) * (46.08745-(17.37517)));
            zz = 10.81499 + (((tickAnim - 8) / 2) * (11.51163-(10.81499)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -11.69104 + (((tickAnim - 10) / 3) * (-15.5254-(-11.69104)));
            yy = 46.08745 + (((tickAnim - 10) / 3) * (-9.9065-(46.08745)));
            zz = 11.51163 + (((tickAnim - 10) / 3) * (25.27002-(11.51163)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -17.5 + (((tickAnim - 0) / 2) * (33.75-(-17.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 33.75 + (((tickAnim - 2) / 1) * (0-(33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-23.58482-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.11881-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-30.04624-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -23.58482 + (((tickAnim - 6) / 2) * (0-(-23.58482)));
            yy = -0.11881 + (((tickAnim - 6) / 2) * (0-(-0.11881)));
            zz = -30.04624 + (((tickAnim - 6) / 2) * (33.75-(-30.04624)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 33.75 + (((tickAnim - 8) / 2) * (0-(33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-17.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg23, leftLeg23.rotateAngleX + (float) Math.toRadians(xx), leftLeg23.rotateAngleY + (float) Math.toRadians(yy), leftLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (4.81594-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (2.15393-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-17.26758-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 4.81594 + (((tickAnim - 5) / 1) * (10-(4.81594)));
            yy = 2.15393 + (((tickAnim - 5) / 1) * (0-(2.15393)));
            zz = -17.26758 + (((tickAnim - 5) / 1) * (-15-(-17.26758)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 6) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -15 + (((tickAnim - 6) / 4) * (0-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg24, leftLeg24.rotateAngleX + (float) Math.toRadians(xx), leftLeg24.rotateAngleY + (float) Math.toRadians(yy), leftLeg24.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.91617-(0)));
            yy = 8 + (((tickAnim - 0) / 2) * (4.08367-(8)));
            zz = -12.5 + (((tickAnim - 0) / 2) * (-5.35373-(-12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.91617 + (((tickAnim - 2) / 1) * (0-(1.91617)));
            yy = 4.08367 + (((tickAnim - 2) / 1) * (0-(4.08367)));
            zz = -5.35373 + (((tickAnim - 2) / 1) * (12.5-(-5.35373)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (20-(0)));
            zz = 12.5 + (((tickAnim - 3) / 2) * (-26.25-(12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 1) * (8-(20)));
            zz = -26.25 + (((tickAnim - 5) / 1) * (-12.5-(-26.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 8 + (((tickAnim - 6) / 4) * (0-(8)));
            zz = -12.5 + (((tickAnim - 6) / 4) * (12.5-(-12.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (15-(0)));
            zz = 12.5 + (((tickAnim - 10) / 1) * (-26.25-(12.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 15 + (((tickAnim - 11) / 2) * (8-(15)));
            zz = -26.25 + (((tickAnim - 11) / 2) * (-12.5-(-26.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 62.5 + (((tickAnim - 0) / 3) * (-15-(62.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 2) * (33.75-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 33.75 + (((tickAnim - 5) / 1) * (62.5-(33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 62.5 + (((tickAnim - 6) / 4) * (-15-(62.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 1) * (33.75-(-15)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 33.75 + (((tickAnim - 11) / 2) * (62.5-(33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg33, leftLeg33.rotateAngleX + (float) Math.toRadians(xx), leftLeg33.rotateAngleY + (float) Math.toRadians(yy), leftLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -45 + (((tickAnim - 0) / 3) * (-15-(-45)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 3) * (-45-(-15)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = -45 + (((tickAnim - 6) / 4) * (-15-(-45)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -15 + (((tickAnim - 10) / 3) * (-45-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg34, leftLeg34.rotateAngleX + (float) Math.toRadians(xx), leftLeg34.rotateAngleY + (float) Math.toRadians(yy), leftLeg34.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animJump(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSchizodactylus entity = (EntityPrehistoricFloraSchizodactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (2.4905-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.21782-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-4.99527-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 2.4905 + (((tickAnim - 2) / 4) * (-24.87739-(2.4905)));
            yy = 0.21782 + (((tickAnim - 2) / 4) * (1.93597-(0.21782)));
            zz = -4.99527 + (((tickAnim - 2) / 4) * (7.24721-(-4.99527)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -24.87739 + (((tickAnim - 6) / 2) * (-27.08129-(-24.87739)));
            yy = 1.93597 + (((tickAnim - 6) / 2) * (-0.24993-(1.93597)));
            zz = 7.24721 + (((tickAnim - 6) / 2) * (-2.86856-(7.24721)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -27.08129 + (((tickAnim - 8) / 9) * (-8.29874-(-27.08129)));
            yy = -0.24993 + (((tickAnim - 8) / 9) * (0.72347-(-0.24993)));
            zz = -2.86856 + (((tickAnim - 8) / 9) * (4.94751-(-2.86856)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.29874 + (((tickAnim - 17) / 3) * (0-(-8.29874)));
            yy = 0.72347 + (((tickAnim - 17) / 3) * (0-(0.72347)));
            zz = 4.94751 + (((tickAnim - 17) / 3) * (0-(4.94751)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 2) / 3) * (6-(-0.05)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 6 + (((tickAnim - 5) / 1) * (7.675-(6)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 7.675 + (((tickAnim - 6) / 8) * (6-(7.675)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 6 + (((tickAnim - 14) / 6) * (0-(6)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-25-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -25 + (((tickAnim - 8) / 9) * (0-(-25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(xx), leftAntenna.rotateAngleY + (float) Math.toRadians(yy), leftAntenna.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-25-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -25 + (((tickAnim - 9) / 7) * (0-(-25)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(xx), rightAntenna.rotateAngleY + (float) Math.toRadians(yy), rightAntenna.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.61644-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.8165-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (10.62758-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -3.61644 + (((tickAnim - 5) / 15) * (0-(-3.61644)));
            yy = 12.8165 + (((tickAnim - 5) / 15) * (0-(12.8165)));
            zz = 10.62758 + (((tickAnim - 5) / 15) * (0-(10.62758)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg12, rightLeg12.rotateAngleX + (float) Math.toRadians(xx), rightLeg12.rotateAngleY + (float) Math.toRadians(yy), rightLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 55 + (((tickAnim - 5) / 15) * (0-(55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg13, rightLeg13.rotateAngleX + (float) Math.toRadians(xx), rightLeg13.rotateAngleY + (float) Math.toRadians(yy), rightLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 5) / 15) * (0-(-15)));
            yy = -12.5 + (((tickAnim - 5) / 15) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg22, rightLeg22.rotateAngleX + (float) Math.toRadians(xx), rightLeg22.rotateAngleY + (float) Math.toRadians(yy), rightLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-26.56961-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-11.51659-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (45.04389-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -26.56961 + (((tickAnim - 5) / 15) * (0-(-26.56961)));
            yy = -11.51659 + (((tickAnim - 5) / 15) * (0-(-11.51659)));
            zz = 45.04389 + (((tickAnim - 5) / 15) * (0-(45.04389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg23, rightLeg23.rotateAngleX + (float) Math.toRadians(xx), rightLeg23.rotateAngleY + (float) Math.toRadians(yy), rightLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (10-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 2) / 3) * (-22.5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -22.5 + (((tickAnim - 5) / 5) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -22.5 + (((tickAnim - 10) / 10) * (0-(-22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg32, rightLeg32.rotateAngleX + (float) Math.toRadians(xx), rightLeg32.rotateAngleY + (float) Math.toRadians(yy), rightLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-47.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -47.5 + (((tickAnim - 2) / 3) * (40-(-47.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 40 + (((tickAnim - 5) / 5) * (40-(40)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 40 + (((tickAnim - 10) / 10) * (0-(40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg33, rightLeg33.rotateAngleX + (float) Math.toRadians(xx), rightLeg33.rotateAngleY + (float) Math.toRadians(yy), rightLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (47.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 2) / 3) * (-10.74373-(5)));
            yy = 0 + (((tickAnim - 2) / 3) * (0.47051-(0)));
            zz = 47.5 + (((tickAnim - 2) / 3) * (26.02994-(47.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -10.74373 + (((tickAnim - 5) / 15) * (0-(-10.74373)));
            yy = 0.47051 + (((tickAnim - 5) / 15) * (0-(0.47051)));
            zz = 26.02994 + (((tickAnim - 5) / 15) * (0-(26.02994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg34, rightLeg34.rotateAngleX + (float) Math.toRadians(xx), rightLeg34.rotateAngleY + (float) Math.toRadians(yy), rightLeg34.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.61644-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-12.8165-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-10.62758-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -3.61644 + (((tickAnim - 5) / 15) * (0-(-3.61644)));
            yy = -12.8165 + (((tickAnim - 5) / 15) * (0-(-12.8165)));
            zz = -10.62758 + (((tickAnim - 5) / 15) * (0-(-10.62758)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg12, leftLeg12.rotateAngleX + (float) Math.toRadians(xx), leftLeg12.rotateAngleY + (float) Math.toRadians(yy), leftLeg12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-55-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = -55 + (((tickAnim - 5) / 15) * (0-(-55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg13, leftLeg13.rotateAngleX + (float) Math.toRadians(xx), leftLeg13.rotateAngleY + (float) Math.toRadians(yy), leftLeg13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 5) / 15) * (0-(-15)));
            yy = 12.5 + (((tickAnim - 5) / 15) * (0-(12.5)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg22, leftLeg22.rotateAngleX + (float) Math.toRadians(xx), leftLeg22.rotateAngleY + (float) Math.toRadians(yy), leftLeg22.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-26.56961-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (11.51659-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-45.04389-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -26.56961 + (((tickAnim - 5) / 15) * (0-(-26.56961)));
            yy = 11.51659 + (((tickAnim - 5) / 15) * (0-(11.51659)));
            zz = -45.04389 + (((tickAnim - 5) / 15) * (0-(-45.04389)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg23, leftLeg23.rotateAngleX + (float) Math.toRadians(xx), leftLeg23.rotateAngleY + (float) Math.toRadians(yy), leftLeg23.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-10-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 2) / 3) * (22.5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 22.5 + (((tickAnim - 5) / 5) * (22.5-(22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 22.5 + (((tickAnim - 10) / 10) * (0-(22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg32, leftLeg32.rotateAngleX + (float) Math.toRadians(xx), leftLeg32.rotateAngleY + (float) Math.toRadians(yy), leftLeg32.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (47.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 47.5 + (((tickAnim - 2) / 3) * (-40-(47.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -40 + (((tickAnim - 5) / 5) * (-40-(-40)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -40 + (((tickAnim - 10) / 10) * (0-(-40)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg33, leftLeg33.rotateAngleX + (float) Math.toRadians(xx), leftLeg33.rotateAngleY + (float) Math.toRadians(yy), leftLeg33.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-47.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 2) / 3) * (-10.74373-(5)));
            yy = 0 + (((tickAnim - 2) / 3) * (-0.47051-(0)));
            zz = -47.5 + (((tickAnim - 2) / 3) * (-26.02994-(-47.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -10.74373 + (((tickAnim - 5) / 15) * (0-(-10.74373)));
            yy = -0.47051 + (((tickAnim - 5) / 15) * (0-(-0.47051)));
            zz = -26.02994 + (((tickAnim - 5) / 15) * (0-(-26.02994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg34, leftLeg34.rotateAngleX + (float) Math.toRadians(xx), leftLeg34.rotateAngleY + (float) Math.toRadians(yy), leftLeg34.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
