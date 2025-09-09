package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProtoischnurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelProtoischnurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Protoischnurus;
    private final AdvancedModelRenderer cephalothorax;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftPepipalp1;
    private final AdvancedModelRenderer leftPepipalp1_r1;
    private final AdvancedModelRenderer leftPepipalp2;
    private final AdvancedModelRenderer leftPepipalp2_r1;
    private final AdvancedModelRenderer leftPepipalp3;
    private final AdvancedModelRenderer leftPepipalp3_r1;
    private final AdvancedModelRenderer leftPepipalp4;
    private final AdvancedModelRenderer leftPepipalp4_r1;
    private final AdvancedModelRenderer rightPepipalp1;
    private final AdvancedModelRenderer rightPepipalp_r1;
    private final AdvancedModelRenderer rightPepipalp2;
    private final AdvancedModelRenderer rightPepipalp3_r1;
    private final AdvancedModelRenderer rightPepipalp3;
    private final AdvancedModelRenderer rightPepipalp4_r1;
    private final AdvancedModelRenderer rightPepipalp4;
    private final AdvancedModelRenderer rightPepipalp5_r1;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;

    public ModelProtoischnurus() {
        this.textureWidth = 20;
        this.textureHeight = 28;

        this.Protoischnurus = new AdvancedModelRenderer(this);
        this.Protoischnurus.setRotationPoint(0.0F, 23.3F, 0.6F);


        this.cephalothorax = new AdvancedModelRenderer(this);
        this.cephalothorax.setRotationPoint(0.2F, 0.5F, -2.9F);
        this.Protoischnurus.addChild(cephalothorax);
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 10, 8, -1.7F, -1.0F, 0.7F, 3, 1, 1, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 6, 15, -1.2F, -1.0F, -0.3F, 2, 1, 1, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 12, 6, -0.7F, -1.025F, -0.3F, 1, 0, 2, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 8, 17, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cephalothorax.cubeList.add(new ModelBox(cephalothorax, 8, 17, -0.4F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.3F, -0.5F, 0.725F);
        this.cephalothorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.6119F, 0.2306F, -0.1066F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.9F, 1.4F, -1.0F);
        this.leftLeg1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, -0.0698F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, -1.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.7F, -0.5F, 0.725F);
        this.cephalothorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.6119F, -0.2306F, 0.1066F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.9F, 1.4F, -1.0F);
        this.rightLeg1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0698F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -3.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.2F, -0.5F, 1.2F);
        this.cephalothorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.8354F, -0.2185F, -0.0625F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0617F, 1.3542F, -0.944F);
        this.leftLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1571F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 22, -1.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.6F, -0.5F, 1.2F);
        this.cephalothorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.8354F, 0.2185F, 0.0625F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0617F, 1.3542F, -0.944F);
        this.rightLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1571F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -3.0F, -3.0F, 1.0F, 4, 3, 0, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.3F, -0.5F, 1.8F);
        this.cephalothorax.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.8582F, -0.4074F, 0.3387F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, 0.2F, 0.0F);
        this.leftLeg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1815F, 0.1512F, -0.3274F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -0.0343F, -1.6908F, -0.0288F, 5, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.7F, -0.5F, 1.8F);
        this.cephalothorax.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.8582F, 0.4074F, -0.3387F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1F, 0.2F, 0.0F);
        this.rightLeg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1815F, -0.1512F, 0.3274F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 25, -4.9657F, -1.6908F, -0.0288F, 5, 3, 0, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.3F, -0.5F, 2.0F);
        this.cephalothorax.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.7585F, -0.8583F, -0.0169F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.1238F, -0.1209F, 0.1152F);
        this.leftLeg4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, -0.0698F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 19, -0.0274F, -1.346F, -0.0519F, 6, 3, 0, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.7F, -0.5F, 2.0F);
        this.cephalothorax.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, -0.7585F, 0.8583F, 0.0169F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1238F, -0.1209F, 0.1152F);
        this.rightLeg4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0F, 0.0698F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 19, -5.9726F, -1.346F, -0.0519F, 6, 3, 0, 0.0F, true));

        this.leftPepipalp1 = new AdvancedModelRenderer(this);
        this.leftPepipalp1.setRotationPoint(0.5F, -0.5F, -0.2F);
        this.cephalothorax.addChild(leftPepipalp1);
        this.setRotateAngle(leftPepipalp1, 0.0F, 0.4363F, 0.0F);


        this.leftPepipalp1_r1 = new AdvancedModelRenderer(this);
        this.leftPepipalp1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftPepipalp1.addChild(leftPepipalp1_r1);
        this.setRotateAngle(leftPepipalp1_r1, 0.0F, -0.3491F, 0.0F);
        this.leftPepipalp1_r1.cubeList.add(new ModelBox(leftPepipalp1_r1, 16, 5, -0.1F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftPepipalp2 = new AdvancedModelRenderer(this);
        this.leftPepipalp2.setRotationPoint(1.7F, 0.0F, 0.5F);
        this.leftPepipalp1.addChild(leftPepipalp2);
        this.setRotateAngle(leftPepipalp2, 0.0F, -0.3491F, 0.0F);


        this.leftPepipalp2_r1 = new AdvancedModelRenderer(this);
        this.leftPepipalp2_r1.setRotationPoint(-0.2F, 0.0F, 0.6F);
        this.leftPepipalp2.addChild(leftPepipalp2_r1);
        this.setRotateAngle(leftPepipalp2_r1, 0.0F, 1.1868F, 0.0F);
        this.leftPepipalp2_r1.cubeList.add(new ModelBox(leftPepipalp2_r1, 16, 4, 0.0F, -0.01F, -0.5F, 2, 0, 1, 0.0F, false));

        this.leftPepipalp3 = new AdvancedModelRenderer(this);
        this.leftPepipalp3.setRotationPoint(0.4F, 0.5F, -1.0F);
        this.leftPepipalp2.addChild(leftPepipalp3);
        this.setRotateAngle(leftPepipalp3, 0.0F, 0.3054F, 0.0F);


        this.leftPepipalp3_r1 = new AdvancedModelRenderer(this);
        this.leftPepipalp3_r1.setRotationPoint(-0.1F, 0.0F, -0.8F);
        this.leftPepipalp3.addChild(leftPepipalp3_r1);
        this.setRotateAngle(leftPepipalp3_r1, 0.0F, -0.192F, 0.0F);
        this.leftPepipalp3_r1.cubeList.add(new ModelBox(leftPepipalp3_r1, 12, 12, -0.2F, -0.8F, -3.2F, 1, 0, 2, 0.0F, false));
        this.leftPepipalp3_r1.cubeList.add(new ModelBox(leftPepipalp3_r1, 0, 12, -0.2F, -1.0F, -1.2F, 1, 1, 2, 0.0F, false));

        this.leftPepipalp4 = new AdvancedModelRenderer(this);
        this.leftPepipalp4.setRotationPoint(0.4F, -0.4F, -1.8F);
        this.leftPepipalp3.addChild(leftPepipalp4);
        this.setRotateAngle(leftPepipalp4, -0.0698F, 0.0F, 0.0F);


        this.leftPepipalp4_r1 = new AdvancedModelRenderer(this);
        this.leftPepipalp4_r1.setRotationPoint(0.3F, 0.9F, -0.3F);
        this.leftPepipalp4.addChild(leftPepipalp4_r1);
        this.setRotateAngle(leftPepipalp4_r1, -0.035F, -0.0698F, 0.0024F);
        this.leftPepipalp4_r1.cubeList.add(new ModelBox(leftPepipalp4_r1, 12, 14, -0.7372F, -0.8F, -1.7712F, 1, 0, 2, 0.0F, false));

        this.rightPepipalp1 = new AdvancedModelRenderer(this);
        this.rightPepipalp1.setRotationPoint(-0.9F, -0.5F, -0.2F);
        this.cephalothorax.addChild(rightPepipalp1);
        this.setRotateAngle(rightPepipalp1, 0.0F, -0.4363F, 0.0F);


        this.rightPepipalp_r1 = new AdvancedModelRenderer(this);
        this.rightPepipalp_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightPepipalp1.addChild(rightPepipalp_r1);
        this.setRotateAngle(rightPepipalp_r1, 0.0F, 0.3491F, 0.0F);
        this.rightPepipalp_r1.cubeList.add(new ModelBox(rightPepipalp_r1, 16, 5, -1.9F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightPepipalp2 = new AdvancedModelRenderer(this);
        this.rightPepipalp2.setRotationPoint(-1.7F, 0.0F, 0.5F);
        this.rightPepipalp1.addChild(rightPepipalp2);
        this.setRotateAngle(rightPepipalp2, 0.0F, 0.3491F, 0.0F);


        this.rightPepipalp3_r1 = new AdvancedModelRenderer(this);
        this.rightPepipalp3_r1.setRotationPoint(0.2F, 0.0F, 0.6F);
        this.rightPepipalp2.addChild(rightPepipalp3_r1);
        this.setRotateAngle(rightPepipalp3_r1, 0.0F, -1.1868F, 0.0F);
        this.rightPepipalp3_r1.cubeList.add(new ModelBox(rightPepipalp3_r1, 16, 4, -2.0F, -0.01F, -0.5F, 2, 0, 1, 0.0F, true));

        this.rightPepipalp3 = new AdvancedModelRenderer(this);
        this.rightPepipalp3.setRotationPoint(-0.4F, 0.5F, -1.0F);
        this.rightPepipalp2.addChild(rightPepipalp3);
        this.setRotateAngle(rightPepipalp3, 0.0F, -0.3054F, 0.0F);


        this.rightPepipalp4_r1 = new AdvancedModelRenderer(this);
        this.rightPepipalp4_r1.setRotationPoint(0.1F, 0.0F, -0.8F);
        this.rightPepipalp3.addChild(rightPepipalp4_r1);
        this.setRotateAngle(rightPepipalp4_r1, 0.0F, 0.192F, 0.0F);
        this.rightPepipalp4_r1.cubeList.add(new ModelBox(rightPepipalp4_r1, 12, 12, -0.8F, -0.8F, -3.2F, 1, 0, 2, 0.0F, true));
        this.rightPepipalp4_r1.cubeList.add(new ModelBox(rightPepipalp4_r1, 0, 12, -0.8F, -1.0F, -1.2F, 1, 1, 2, 0.0F, true));

        this.rightPepipalp4 = new AdvancedModelRenderer(this);
        this.rightPepipalp4.setRotationPoint(-0.4F, -0.4F, -1.8F);
        this.rightPepipalp3.addChild(rightPepipalp4);
        this.setRotateAngle(rightPepipalp4, -0.0698F, 0.0F, 0.0F);


        this.rightPepipalp5_r1 = new AdvancedModelRenderer(this);
        this.rightPepipalp5_r1.setRotationPoint(-0.3F, 0.9F, -0.3F);
        this.rightPepipalp4.addChild(rightPepipalp5_r1);
        this.setRotateAngle(rightPepipalp5_r1, -0.035F, 0.0698F, -0.0024F);
        this.rightPepipalp5_r1.cubeList.add(new ModelBox(rightPepipalp5_r1, 12, 14, -0.2628F, -0.8F, -1.7712F, 1, 0, 2, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, 0.5F, 4.4F);
        this.Protoischnurus.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -1.5F, -1.0F, -5.6F, 3, 1, 5, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 15, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.005F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.1562F, -0.97F, -3.9113F);
        this.abdomen.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.8762F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 23, -0.5F, -0.5F, -0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.6099F, -0.97F, -3.2686F);
        this.abdomen.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 23, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.725F, -0.45F, -2.3F);
        this.abdomen.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 23, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -0.45F, -1.7F);
        this.abdomen.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 23, -0.5F, -1.02F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.5F, -0.1F);
        this.abdomen.addChild(tail1);
        this.setRotateAngle(tail1, 0.5236F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 16, 10, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.6981F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 16, -0.5F, -0.5F, -0.1F, 1, 1, 1, -0.015F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3491F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 16, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.02F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 17, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.015F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.3491F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 4, 17, -0.5F, -0.5F, -0.2F, 1, 1, 1, -0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.8727F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 6, 12, -0.5F, -0.5F, -0.2F, 1, 1, 2, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 16, 0, 0.0F, -1.7F, 1.1F, 0, 2, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Protoischnurus.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.Protoischnurus.offsetZ = -0.080F;
        this.Protoischnurus.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Protoischnurus.offsetY = -2.0F;
        this.Protoischnurus.offsetX = 0.0F;
        this.Protoischnurus.offsetZ = 2.0F;
        this.Protoischnurus.rotateAngleY = (float)Math.toRadians(120);
        this.Protoischnurus.rotateAngleX = (float)Math.toRadians(0);
        this.Protoischnurus.rotateAngleZ = (float)Math.toRadians(0);
        this.Protoischnurus.scaleChildren = true;
        float scaler = 5.0F;
        this.Protoischnurus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Protoischnurus, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Protoischnurus.render(f);
        //Reset rotations, positions and sizing:
        this.Protoischnurus.setScale(1.0F, 1.0F, 1.0F);
        this.Protoischnurus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1F;

        //this.Protoischnurus.rotateAngleY = f3 * 0.017453292F;

//        this.leftPepipalp1.swing(0.85F, (float)Math.toRadians(-25), false, 0, 0F, f2, 1.0F);
//        this.rightPepipalp1.swing(0.85F, (float)Math.toRadians(25), false, 0, 0F, f2, 1.0F);

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && !ee.getIsClimbing()) {
            return;
        }

        this.leftLeg1.flap(0.45F, 0.45F, false, 0F, -0.45F, f2, 1F);
        this.rightLeg1.flap(0.45F, 0.45F, true, 3F, -0.45F, f2, 1F);

        this.leftLeg2.flap(0.45F, 0.45F, false, 1F, -0.45F, f2, 1F);
        this.rightLeg2.flap(0.45F, 0.45F, true, 1F, -0.45F, f2, 1F);

        this.leftLeg3.flap(0.45F, 0.45F, false, 2F, -0.45F, f2, 1F);
        this.rightLeg3.flap(0.45F, 0.45F, true, 2F, -0.45F, f2, 1F);

        this.leftLeg4.flap(0.45F, 0.45F, false, 3F, -0.45F, f2, 1F);
        this.rightLeg4.flap(0.45F, 0.45F, true, 0F, -0.45F, f2, 1F);

        this.leftLeg1.swing(0.45F, 0.08F, false, 2F, 0F, f2, 0.75F);
        this.rightLeg1.swing(0.45F, 0.08F, true, 1F, 0F, f2, 0.75F);

        this.leftLeg2.swing(0.45F, 0.08F, false, 3F, 0F, f2, 0.75F);
        this.rightLeg2.swing(0.45F, 0.08F, true, 3F, 0F, f2, 0.75F);

        this.leftLeg3.swing(0.45F, 0.08F, false, 0, 0F, f2, 0.75F);
        this.rightLeg3.swing(0.45F, 0.08F, true, 0, 0F, f2, 0.75F);

        this.leftLeg4.swing(0.45F, 0.08F, false, 1F, 0F, f2, 0.75F);
        this.rightLeg4.swing(0.45F, 0.08F, true, 2F, 0F, f2, 0.75F);

        //pincers:
        AdvancedModelRenderer[] PincerL = {this.leftPepipalp1, this.leftPepipalp2, this.leftPepipalp3};
        AdvancedModelRenderer[] PincerR = {this.rightPepipalp1, this.rightPepipalp2, this.rightPepipalp3};
        this.chainSwing(PincerL, 0.2F, 0.1F, 0.1F, f2, 1F);
        this.chainSwing(PincerR, 0.2F, -0.1F, 0.1F, f2, 1F);

        this.leftPepipalp3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);
        this.rightPepipalp3.walk(0.1F, -(float)Math.toRadians(7.5), false, 0F, -(float)Math.toRadians(6), f2, 1F);

        this.leftPepipalp4.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);
        this.rightPepipalp4.walk(0.1F, (float)Math.toRadians(12.5), false, 0F, (float)Math.toRadians(8), f2, 1F);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        this.chainWave(Tail, 0.6F, 0.05F, 0.3F, f2, 1F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProtoischnurus e = (EntityPrehistoricFloraProtoischnurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //length = 20 ticks
        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.leftPepipalp1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightPepipalp1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftPepipalp2, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.rightPepipalp2, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.leftPepipalp3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightPepipalp3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftPepipalp4, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightPepipalp4, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.startKeyframe(3);
        animator.rotate(this.leftPepipalp1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightPepipalp1, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail6, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.setStaticKeyframe(2);
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(4);

    }
}

