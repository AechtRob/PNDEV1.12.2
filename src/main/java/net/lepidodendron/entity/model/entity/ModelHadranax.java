package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHadranax;
import net.lepidodendron.entity.EntityPrehistoricFloraSiberion;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHadranax extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer leftAppendage1;
    private final AdvancedModelRenderer leftClaw1;
    private final AdvancedModelRenderer LeftAppendage2;
    private final AdvancedModelRenderer leftClaw2;
    private final AdvancedModelRenderer LeftAppendage3;
    private final AdvancedModelRenderer leftClaw3;
    private final AdvancedModelRenderer leftClaw4;
    private final AdvancedModelRenderer rightAppendage1;
    private final AdvancedModelRenderer rightClaw1;
    private final AdvancedModelRenderer RightAppendage2;
    private final AdvancedModelRenderer rightClaw2;
    private final AdvancedModelRenderer RightAppendage3;
    private final AdvancedModelRenderer rightClaw3;
    private final AdvancedModelRenderer rightClaw4;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer rightLeg10;
    private final AdvancedModelRenderer leftLeg11;
    private final AdvancedModelRenderer rightLeg11;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leftLeg12;
    private final AdvancedModelRenderer rightLeg12;
    private final AdvancedModelRenderer leftLeg13;
    private final AdvancedModelRenderer rightLeg13;
    private final AdvancedModelRenderer leftLeg14;
    private final AdvancedModelRenderer rightLeg14;
    private final AdvancedModelRenderer leftLeg15;
    private final AdvancedModelRenderer rightLeg15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftLeg16;
    private final AdvancedModelRenderer rightLeg16;
    private final AdvancedModelRenderer leftLeg17;
    private final AdvancedModelRenderer rightLeg17;

    private ModelAnimator animator;

    public ModelHadranax() {
        this.textureWidth = 38;
        this.textureHeight = 30;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.0F, -2.25F);
        this.head.cubeList.add(new ModelBox(head, 17, 5, -1.0F, -1.0F, -5.75F, 2, 2, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -0.5F, -5.76F, 1, 1, 0, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.0F, -1.75F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.3491F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.0F, -1.75F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.3491F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 0.0F, -0.5F);
        this.head.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3491F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 0.0F, -0.5F);
        this.head.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.3491F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftAppendage1 = new AdvancedModelRenderer(this);
        this.leftAppendage1.setRotationPoint(1.0F, 1.0F, -2.75F);
        this.head.addChild(leftAppendage1);
        this.setRotateAngle(leftAppendage1, 0.0F, 0.7854F, 0.0F);
        this.leftAppendage1.cubeList.add(new ModelBox(leftAppendage1, 28, 14, 0.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, false));

        this.leftClaw1 = new AdvancedModelRenderer(this);
        this.leftClaw1.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.leftAppendage1.addChild(leftClaw1);
        this.setRotateAngle(leftClaw1, 0.0F, -0.6981F, 0.0F);
        this.leftClaw1.cubeList.add(new ModelBox(leftClaw1, 0, 27, -1.0F, -1.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.LeftAppendage2 = new AdvancedModelRenderer(this);
        this.LeftAppendage2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftAppendage1.addChild(LeftAppendage2);
        this.setRotateAngle(LeftAppendage2, 0.0F, 0.3927F, 0.0F);
        this.LeftAppendage2.cubeList.add(new ModelBox(LeftAppendage2, 28, 7, 0.0F, -1.5F, -1.0F, 4, 1, 1, 0.01F, false));

        this.leftClaw2 = new AdvancedModelRenderer(this);
        this.leftClaw2.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.LeftAppendage2.addChild(leftClaw2);
        this.setRotateAngle(leftClaw2, 0.0F, -0.5672F, 0.0F);
        this.leftClaw2.cubeList.add(new ModelBox(leftClaw2, 11, 24, -1.0F, -1.0F, -4.0F, 2, 0, 4, 0.0F, false));

        this.LeftAppendage3 = new AdvancedModelRenderer(this);
        this.LeftAppendage3.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LeftAppendage2.addChild(LeftAppendage3);
        this.setRotateAngle(LeftAppendage3, 0.0F, 0.3054F, 0.0F);
        this.LeftAppendage3.cubeList.add(new ModelBox(LeftAppendage3, 28, 4, 0.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, false));

        this.leftClaw3 = new AdvancedModelRenderer(this);
        this.leftClaw3.setRotationPoint(3.0F, 0.0F, -1.0F);
        this.LeftAppendage3.addChild(leftClaw3);
        this.setRotateAngle(leftClaw3, 0.0F, -0.9163F, 0.0F);
        this.leftClaw3.cubeList.add(new ModelBox(leftClaw3, 0, 21, -1.0F, -1.0F, -5.0F, 2, 0, 5, 0.0F, false));

        this.leftClaw4 = new AdvancedModelRenderer(this);
        this.leftClaw4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LeftAppendage3.addChild(leftClaw4);
        this.setRotateAngle(leftClaw4, 0.0F, 0.1309F, 0.0F);
        this.leftClaw4.cubeList.add(new ModelBox(leftClaw4, 15, 0, 0.0F, -1.01F, -3.0F, 8, 0, 3, 0.0F, false));

        this.rightAppendage1 = new AdvancedModelRenderer(this);
        this.rightAppendage1.setRotationPoint(-1.0F, 1.0F, -2.75F);
        this.head.addChild(rightAppendage1);
        this.setRotateAngle(rightAppendage1, 0.0F, -0.7854F, 0.0F);
        this.rightAppendage1.cubeList.add(new ModelBox(rightAppendage1, 28, 14, -4.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, true));

        this.rightClaw1 = new AdvancedModelRenderer(this);
        this.rightClaw1.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.rightAppendage1.addChild(rightClaw1);
        this.setRotateAngle(rightClaw1, 0.0F, 0.6981F, 0.0F);
        this.rightClaw1.cubeList.add(new ModelBox(rightClaw1, 0, 27, -1.0F, -1.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.RightAppendage2 = new AdvancedModelRenderer(this);
        this.RightAppendage2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightAppendage1.addChild(RightAppendage2);
        this.setRotateAngle(RightAppendage2, 0.0F, -0.3927F, 0.0F);
        this.RightAppendage2.cubeList.add(new ModelBox(RightAppendage2, 28, 7, -4.0F, -1.5F, -1.0F, 4, 1, 1, 0.01F, true));

        this.rightClaw2 = new AdvancedModelRenderer(this);
        this.rightClaw2.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.RightAppendage2.addChild(rightClaw2);
        this.setRotateAngle(rightClaw2, 0.0F, 0.5672F, 0.0F);
        this.rightClaw2.cubeList.add(new ModelBox(rightClaw2, 11, 24, -1.0F, -1.0F, -4.0F, 2, 0, 4, 0.0F, true));

        this.RightAppendage3 = new AdvancedModelRenderer(this);
        this.RightAppendage3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightAppendage2.addChild(RightAppendage3);
        this.setRotateAngle(RightAppendage3, 0.0F, -0.3054F, 0.0F);
        this.RightAppendage3.cubeList.add(new ModelBox(RightAppendage3, 28, 4, -4.0F, -1.5F, -1.0F, 4, 1, 1, 0.0F, true));

        this.rightClaw3 = new AdvancedModelRenderer(this);
        this.rightClaw3.setRotationPoint(-3.0F, 0.0F, -1.0F);
        this.RightAppendage3.addChild(rightClaw3);
        this.setRotateAngle(rightClaw3, 0.0F, 0.9163F, 0.0F);
        this.rightClaw3.cubeList.add(new ModelBox(rightClaw3, 0, 21, -1.0F, -1.0F, -5.0F, 2, 0, 5, 0.0F, true));

        this.rightClaw4 = new AdvancedModelRenderer(this);
        this.rightClaw4.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.RightAppendage3.addChild(rightClaw4);
        this.setRotateAngle(rightClaw4, 0.0F, -0.1309F, 0.0F);
        this.rightClaw4.cubeList.add(new ModelBox(rightClaw4, 15, 0, -8.0F, -1.01F, -3.0F, 8, 0, 3, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 14, 14, -1.5F, -1.0F, 0.0F, 3, 2, 7, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.5F, 0.0F, 1.0F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.3491F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.5F, 0.0F, 1.0F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.3491F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.5F, 0.0F, 2.5F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.3491F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.5F, 0.0F, 2.5F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.3491F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.5F, 0.0F, 4.0F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.3491F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.5F, 0.0F, 4.0F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.3491F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.5F, 0.0F, 5.5F);
        this.body1.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.3491F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.5F, 0.0F, 5.5F);
        this.body1.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.3491F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.0F, 0.0F, 3, 2, 8, 0.02F, false));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.3491F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.3491F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(1.5F, 0.0F, 2.25F);
        this.body2.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, 0.0F, 0.3491F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-1.5F, 0.0F, 2.25F);
        this.body2.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0F, -0.3491F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(1.5F, 0.0F, 4.0F);
        this.body2.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, 0.0F, 0.3491F);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-1.5F, 0.0F, 4.0F);
        this.body2.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.0F, -0.3491F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(1.5F, 0.0F, 5.75F);
        this.body2.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, 0.0F, 0.3491F);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(-1.5F, 0.0F, 5.75F);
        this.body2.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.0F, -0.3491F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg11 = new AdvancedModelRenderer(this);
        this.leftLeg11.setRotationPoint(1.5F, 0.0F, 7.5F);
        this.body2.addChild(leftLeg11);
        this.setRotateAngle(leftLeg11, 0.0F, 0.0F, 0.3491F);
        this.leftLeg11.cubeList.add(new ModelBox(leftLeg11, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg11 = new AdvancedModelRenderer(this);
        this.rightLeg11.setRotationPoint(-1.5F, 0.0F, 7.5F);
        this.body2.addChild(rightLeg11);
        this.setRotateAngle(rightLeg11, 0.0F, 0.0F, -0.3491F);
        this.rightLeg11.cubeList.add(new ModelBox(rightLeg11, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 11, -1.5F, -1.0F, -0.25F, 3, 2, 7, 0.01F, false));

        this.leftLeg12 = new AdvancedModelRenderer(this);
        this.leftLeg12.setRotationPoint(1.5F, 0.0F, 1.25F);
        this.body3.addChild(leftLeg12);
        this.setRotateAngle(leftLeg12, 0.0F, 0.0F, 0.3491F);
        this.leftLeg12.cubeList.add(new ModelBox(leftLeg12, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg12 = new AdvancedModelRenderer(this);
        this.rightLeg12.setRotationPoint(-1.5F, 0.0F, 1.25F);
        this.body3.addChild(rightLeg12);
        this.setRotateAngle(rightLeg12, 0.0F, 0.0F, -0.3491F);
        this.rightLeg12.cubeList.add(new ModelBox(rightLeg12, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg13 = new AdvancedModelRenderer(this);
        this.leftLeg13.setRotationPoint(1.5F, 0.0F, 2.75F);
        this.body3.addChild(leftLeg13);
        this.setRotateAngle(leftLeg13, 0.0F, 0.0F, 0.3491F);
        this.leftLeg13.cubeList.add(new ModelBox(leftLeg13, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg13 = new AdvancedModelRenderer(this);
        this.rightLeg13.setRotationPoint(-1.5F, 0.0F, 2.75F);
        this.body3.addChild(rightLeg13);
        this.setRotateAngle(rightLeg13, 0.0F, 0.0F, -0.3491F);
        this.rightLeg13.cubeList.add(new ModelBox(rightLeg13, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg14 = new AdvancedModelRenderer(this);
        this.leftLeg14.setRotationPoint(1.5F, 0.0F, 4.25F);
        this.body3.addChild(leftLeg14);
        this.setRotateAngle(leftLeg14, 0.0F, 0.0F, 0.3491F);
        this.leftLeg14.cubeList.add(new ModelBox(leftLeg14, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg14 = new AdvancedModelRenderer(this);
        this.rightLeg14.setRotationPoint(-1.5F, 0.0F, 4.25F);
        this.body3.addChild(rightLeg14);
        this.setRotateAngle(rightLeg14, 0.0F, 0.0F, -0.3491F);
        this.rightLeg14.cubeList.add(new ModelBox(rightLeg14, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg15 = new AdvancedModelRenderer(this);
        this.leftLeg15.setRotationPoint(1.5F, 0.0F, 5.75F);
        this.body3.addChild(leftLeg15);
        this.setRotateAngle(leftLeg15, 0.0F, 0.0F, 0.3491F);
        this.leftLeg15.cubeList.add(new ModelBox(leftLeg15, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg15 = new AdvancedModelRenderer(this);
        this.rightLeg15.setRotationPoint(-1.5F, 0.0F, 5.75F);
        this.body3.addChild(rightLeg15);
        this.setRotateAngle(rightLeg15, 0.0F, 0.0F, -0.3491F);
        this.rightLeg15.cubeList.add(new ModelBox(rightLeg15, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 24, 24, -1.0F, -1.0F, -0.25F, 2, 2, 3, 0.0F, false));

        this.leftLeg16 = new AdvancedModelRenderer(this);
        this.leftLeg16.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.tail.addChild(leftLeg16);
        this.setRotateAngle(leftLeg16, 0.0F, 0.0F, 0.3491F);
        this.leftLeg16.cubeList.add(new ModelBox(leftLeg16, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg16 = new AdvancedModelRenderer(this);
        this.rightLeg16.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.tail.addChild(rightLeg16);
        this.setRotateAngle(rightLeg16, 0.0F, 0.0F, -0.3491F);
        this.rightLeg16.cubeList.add(new ModelBox(rightLeg16, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        this.leftLeg17 = new AdvancedModelRenderer(this);
        this.leftLeg17.setRotationPoint(1.0F, 0.0F, 1.75F);
        this.tail.addChild(leftLeg17);
        this.setRotateAngle(leftLeg17, 0.0F, 0.0F, 0.3491F);
        this.leftLeg17.cubeList.add(new ModelBox(leftLeg17, 28, 17, -1.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, false));

        this.rightLeg17 = new AdvancedModelRenderer(this);
        this.rightLeg17.setRotationPoint(-1.0F, 0.0F, 1.75F);
        this.tail.addChild(rightLeg17);
        this.setRotateAngle(rightLeg17, 0.0F, 0.0F, -0.3491F);
        this.rightLeg17.cubeList.add(new ModelBox(rightLeg17, 28, 17, -3.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        //this.head.render(f5 * 0.2F);
        this.head.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.08F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftAppendage1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightAppendage1, 0.0F, 0.0F, 0.0F);
        this.head.offsetZ = -0.03F;
        this.head.offsetY = 0.17F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = 0.4F;
        this.head.offsetX = 0.55F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 0.5F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
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
        //this.head.offsetY = 1.075F;
        //this.head.offsetY = 1.275F;

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8, this.leftLeg9, this.leftLeg10, this.leftLeg11, this.leftLeg12, this.leftLeg13, this.leftLeg14, this.leftLeg15, this.leftLeg16, this.leftLeg17};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8, this.rightLeg9, this.rightLeg10, this.rightLeg11, this.rightLeg12, this.rightLeg13, this.rightLeg14, this.rightLeg15, this.rightLeg16, this.rightLeg17};
        AdvancedModelRenderer[] antennaL = {this.leftAppendage1, this.LeftAppendage2, this.LeftAppendage3};
        AdvancedModelRenderer[] antennaR = {this.rightAppendage1, this.RightAppendage2, this.RightAppendage3};
        AdvancedModelRenderer[] bodyF = {this.body3};
        AdvancedModelRenderer[] bodyA = {this.body1, this.body2, this.body3};

        EntityPrehistoricFloraHadranax ee = (EntityPrehistoricFloraHadranax) e;

            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.3F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.3F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.3F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.3F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.3F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.3F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg8, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg8, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg9, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg9, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg10, 0.3F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg10, 0.3F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg11, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg11, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg12, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg12, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg13, 0.3F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg13, 0.3F, 0.5F, false, 0.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg14, 0.3F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg14, 0.3F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg15, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg15, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg16, 0.3F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg16, 0.3F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg17, 0.3F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg17, 0.3F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

            this.bob(head, 1F, 0.05F, false, f2, 1);
            //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
            this.chainWave(bodyF, 0.4F, 0.02f, 0.2, f2, 0.8F);
            this.chainSwing(bodyA, 0.08F, 0.08f, 0.25, f2, 0.8F);
            this.chainSwing(bodyF, 0.08F, 0.05F, -1, f2, 0.8F);


        this.chainSwing(antennaL, 0.12F, -0.15F, 0.3F, f2, 0.7F);
        this.chainSwing(antennaR, 0.12F, 0.15F, 0.3F, f2, 0.7F);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHadranax e = (EntityPrehistoricFloraHadranax) entity;
        animator.update(entity);


    }
}
