package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraNoripterus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelNoripterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer legmembrane;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer legmembrane2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer legmembrane3;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer legmembrane4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftmembrane2;
    private final AdvancedModelRenderer leftmembrane6;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer leftmembrane4;
    private final AdvancedModelRenderer leftmembrane8;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer leftmembrane5;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftmembrane3;
    private final AdvancedModelRenderer leftmembrane7;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightmembrane2;
    private final AdvancedModelRenderer rightmembrane6;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer rightmembrane4;
    private final AdvancedModelRenderer rightmembrane8;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer rightmembrane5;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightmembrane3;
    private final AdvancedModelRenderer rightmembrane7;
    private final AdvancedModelRenderer neck;
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
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelNoripterus() {
        this.textureWidth = 75;
        this.textureHeight = 85;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-0.5F, 12.5F, 5.75F);
        this.setRotateAngle(main, -0.6109F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 30, 59, -1.0F, -1.0F, -1.0F, 3, 3, 3, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.824F, 1.026F, 0.7755F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.2602F, -0.2975F, -0.6937F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 61, 42, -1.0077F, -0.448F, -0.783F, 2, 5, 2, -0.001F, false));

        this.legmembrane = new AdvancedModelRenderer(this);
        this.legmembrane.setRotationPoint(-1.7577F, -1.448F, -1.783F);
        this.leftleg.addChild(legmembrane);
        this.legmembrane.cubeList.add(new ModelBox(legmembrane, 67, 58, 1.75F, 1.0F, 3.0F, 0, 5, 1, -0.001F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0142F, 4.4255F, -0.4068F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.538F, 0.2671F, 0.3557F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 17, 29, -0.5F, -0.25F, -0.25F, 1, 7, 1, 0.0F, false));

        this.legmembrane2 = new AdvancedModelRenderer(this);
        this.legmembrane2.setRotationPoint(-2.5F, -1.25F, -1.25F);
        this.leftleg2.addChild(legmembrane2);
        this.legmembrane2.cubeList.add(new ModelBox(legmembrane2, 52, 65, 2.5F, 1.0F, 2.0F, 0, 7, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.3225F, 0.5165F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0123F, 0.1931F, 0.1237F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 63, 6, -1.0F, -0.25F, -3.0F, 2, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-0.824F, 1.026F, 0.7755F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.2602F, 0.2975F, 0.6937F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 61, 42, -0.9923F, -0.448F, -0.783F, 2, 5, 2, -0.001F, true));

        this.legmembrane3 = new AdvancedModelRenderer(this);
        this.legmembrane3.setRotationPoint(1.7577F, -1.448F, -1.783F);
        this.rightleg.addChild(legmembrane3);
        this.legmembrane3.cubeList.add(new ModelBox(legmembrane3, 67, 58, -1.75F, 1.0F, 3.0F, 0, 5, 1, -0.001F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0142F, 4.4255F, -0.4068F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.538F, -0.2671F, -0.3557F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 17, 29, -0.5F, -0.25F, -0.25F, 1, 7, 1, 0.0F, true));

        this.legmembrane4 = new AdvancedModelRenderer(this);
        this.legmembrane4.setRotationPoint(2.5F, -1.25F, -1.25F);
        this.rightleg2.addChild(legmembrane4);
        this.legmembrane4.cubeList.add(new ModelBox(legmembrane4, 52, 65, -2.5F, 1.0F, 2.0F, 0, 7, 1, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.3225F, 0.5165F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0123F, -0.1931F, -0.1237F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 63, 6, -1.0F, -0.25F, -3.0F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, 0.0F, 1.75F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 55, 66, 0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -0.75F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.288F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 27, 0, -1.5F, -0.5F, -6.0F, 4, 4, 6, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5011F, 0.8134F, -4.4146F);
        this.body.addChild(leftwing);
        this.setRotateAngle(leftwing, -1.4906F, -0.1869F, -1.1859F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 32, 50, -1.5F, -0.75F, -0.5F, 2, 2, 6, 0.0F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(-0.5F, -0.75F, 2.5F);
        this.leftwing.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 17, 44, -0.5F, -6.0F, -3.0F, 1, 6, 6, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(0.1594F, 0.9269F, 4.952F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.2419F, -1.0607F, 0.0268F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 42, 40, -1.7435F, -1.7557F, -0.0986F, 2, 2, 7, -0.001F, false));

        this.leftmembrane2 = new AdvancedModelRenderer(this);
        this.leftmembrane2.setRotationPoint(-2.9935F, -3.7557F, 4.9014F);
        this.leftwing2.addChild(leftmembrane2);
        this.leftmembrane2.cubeList.add(new ModelBox(leftmembrane2, 0, 29, 2.0F, -3.0F, -5.0F, 1, 5, 7, -0.001F, false));

        this.leftmembrane6 = new AdvancedModelRenderer(this);
        this.leftmembrane6.setRotationPoint(2.5F, -4.0F, -1.5F);
        this.leftmembrane2.addChild(leftmembrane6);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.075F, -3.0F, 0.0F);
        this.leftmembrane6.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 21, 0.0F, -0.2F, -4.0F, 0, 6, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 28, -0.075F, -0.2F, -4.0F, 0, 6, 9, 0.0F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.6436F, -0.0067F, 6.3959F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.5236F, 0.0F, 0.0F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 46, 11, -0.5F, -1.75F, 0.0F, 1, 2, 7, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(-0.0999F, -0.2516F, 6.9957F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 2.3873F, -0.1707F, 0.1099F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 23, 15, -0.446F, -1.5051F, -0.0464F, 1, 2, 10, 0.0F, false));

        this.leftmembrane4 = new AdvancedModelRenderer(this);
        this.leftmembrane4.setRotationPoint(0.054F, -1.5051F, 4.9536F);
        this.leftwing4.addChild(leftmembrane4);
        this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, -0.0436F);
        this.leftmembrane4.cubeList.add(new ModelBox(leftmembrane4, 0, 15, -0.5436F, -3.0009F, -5.0F, 1, 3, 10, 0.001F, false));

        this.leftmembrane8 = new AdvancedModelRenderer(this);
        this.leftmembrane8.setRotationPoint(0.325F, -3.018F, 0.0F);
        this.leftmembrane4.addChild(leftmembrane8);
        this.setRotateAngle(leftmembrane8, 0.0F, 0.0F, -0.0436F);
        this.leftmembrane8.cubeList.add(new ModelBox(leftmembrane8, 59, 28, -0.1F, -2.0F, -5.0F, 0, 2, 6, 0.0F, false));
        this.leftmembrane8.cubeList.add(new ModelBox(leftmembrane8, 59, 25, -0.025F, -2.0F, -5.0F, 0, 2, 6, 0.0F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(0.0386F, 0.5045F, 9.8798F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.7447F, -0.0432F, -0.0508F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 12, 0.0F, false));

        this.leftmembrane5 = new AdvancedModelRenderer(this);
        this.leftmembrane5.setRotationPoint(0.0F, -2.0F, 5.5F);
        this.leftwing5.addChild(leftmembrane5);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0436F);
        this.leftmembrane5.cubeList.add(new ModelBox(leftmembrane5, 49, 50, -0.5436F, -2.0009F, -5.5F, 1, 2, 6, 0.0F, false));
        this.leftmembrane5.cubeList.add(new ModelBox(leftmembrane5, 15, 57, -0.5436F, -1.0009F, 0.5F, 1, 1, 6, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.2F, 0.175F, 6.575F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.2185F, 0.0776F, 3.0358F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 38, 11, -1.25F, 0.0F, -0.5F, 2, 2, 1, 0.0F, false));

        this.leftmembrane3 = new AdvancedModelRenderer(this);
        this.leftmembrane3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftwing3.addChild(leftmembrane3);
        this.leftmembrane3.cubeList.add(new ModelBox(leftmembrane3, 0, 42, -0.5F, -3.75F, 0.0F, 1, 4, 7, -0.001F, false));

        this.leftmembrane7 = new AdvancedModelRenderer(this);
        this.leftmembrane7.setRotationPoint(0.2F, -3.75F, 3.5F);
        this.leftmembrane3.addChild(leftmembrane7);
        this.leftmembrane7.cubeList.add(new ModelBox(leftmembrane7, 48, 0, 0.0F, -3.0F, -3.5F, 0, 3, 7, 0.0F, false));
        this.leftmembrane7.cubeList.add(new ModelBox(leftmembrane7, 48, -4, 0.05F, -3.0F, -3.5F, 0, 3, 7, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-1.5011F, 0.8134F, -4.4146F);
        this.body.addChild(rightwing);
        this.setRotateAngle(rightwing, -1.4906F, 0.1869F, 1.1859F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 32, 50, -0.5F, -0.75F, -0.5F, 2, 2, 6, 0.0F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(0.5F, -0.75F, 2.5F);
        this.rightwing.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 17, 44, -0.5F, -6.0F, -3.0F, 1, 6, 6, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-0.1594F, 0.9269F, 4.952F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.2419F, 1.0607F, -0.0268F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 42, 40, -0.2565F, -1.7557F, -0.0986F, 2, 2, 7, -0.001F, true));

        this.rightmembrane2 = new AdvancedModelRenderer(this);
        this.rightmembrane2.setRotationPoint(2.9935F, -3.7557F, 4.9014F);
        this.rightwing2.addChild(rightmembrane2);
        this.rightmembrane2.cubeList.add(new ModelBox(rightmembrane2, 0, 29, -3.0F, -3.0F, -5.0F, 1, 5, 7, -0.001F, true));

        this.rightmembrane6 = new AdvancedModelRenderer(this);
        this.rightmembrane6.setRotationPoint(-2.5F, -4.0F, -1.5F);
        this.rightmembrane2.addChild(rightmembrane6);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.075F, -3.0F, 0.0F);
        this.rightmembrane6.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 21, 0.0F, -0.2F, -4.0F, 0, 6, 9, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 28, 0.075F, -0.2F, -4.0F, 0, 6, 9, 0.0F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(0.6436F, -0.0067F, 6.3959F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.5236F, 0.0F, 0.0F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 46, 11, -0.5F, -1.75F, 0.0F, 1, 2, 7, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(0.0999F, -0.2516F, 6.9957F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 2.3873F, 0.1707F, -0.1099F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 23, 15, -0.554F, -1.5051F, -0.0464F, 1, 2, 10, 0.0F, true));

        this.rightmembrane4 = new AdvancedModelRenderer(this);
        this.rightmembrane4.setRotationPoint(-0.054F, -1.5051F, 4.9536F);
        this.rightwing4.addChild(rightmembrane4);
        this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, 0.0436F);
        this.rightmembrane4.cubeList.add(new ModelBox(rightmembrane4, 0, 15, -0.4564F, -3.0009F, -5.0F, 1, 3, 10, 0.001F, true));

        this.rightmembrane8 = new AdvancedModelRenderer(this);
        this.rightmembrane8.setRotationPoint(-0.325F, -3.018F, 0.0F);
        this.rightmembrane4.addChild(rightmembrane8);
        this.setRotateAngle(rightmembrane8, 0.0F, 0.0F, 0.0436F);
        this.rightmembrane8.cubeList.add(new ModelBox(rightmembrane8, 59, 28, 0.1F, -2.0F, -5.0F, 0, 2, 6, 0.0F, true));
        this.rightmembrane8.cubeList.add(new ModelBox(rightmembrane8, 59, 25, 0.025F, -2.0F, -5.0F, 0, 2, 6, 0.0F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(-0.0386F, 0.5045F, 9.8798F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.7447F, 0.0432F, 0.0508F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 12, 0.0F, true));

        this.rightmembrane5 = new AdvancedModelRenderer(this);
        this.rightmembrane5.setRotationPoint(0.0F, -2.0F, 5.5F);
        this.rightwing5.addChild(rightmembrane5);
        this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0436F);
        this.rightmembrane5.cubeList.add(new ModelBox(rightmembrane5, 49, 50, -0.4564F, -2.0009F, -5.5F, 1, 2, 6, 0.0F, true));
        this.rightmembrane5.cubeList.add(new ModelBox(rightmembrane5, 15, 57, -0.4564F, -1.0009F, 0.5F, 1, 1, 6, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.2F, 0.175F, 6.575F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, -0.2185F, -0.0776F, -3.0358F);
        this.righthand.cubeList.add(new ModelBox(righthand, 38, 11, -0.75F, 0.0F, -0.5F, 2, 2, 1, 0.0F, true));

        this.rightmembrane3 = new AdvancedModelRenderer(this);
        this.rightmembrane3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightwing3.addChild(rightmembrane3);
        this.rightmembrane3.cubeList.add(new ModelBox(rightmembrane3, 0, 42, -0.5F, -3.75F, 0.0F, 1, 4, 7, -0.001F, true));

        this.rightmembrane7 = new AdvancedModelRenderer(this);
        this.rightmembrane7.setRotationPoint(-0.2F, -3.75F, 3.5F);
        this.rightmembrane3.addChild(rightmembrane7);
        this.rightmembrane7.cubeList.add(new ModelBox(rightmembrane7, 48, 0, 0.0F, -3.0F, -3.5F, 0, 3, 7, 0.0F, true));
        this.rightmembrane7.cubeList.add(new ModelBox(rightmembrane7, 48, -4, -0.05F, -3.0F, -3.5F, 0, 3, 7, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0474F, -5.8154F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 56, 59, 0.25F, -0.35F, -2.25F, 2, 3, 3, 0.001F, false));
        this.neck.cubeList.add(new ModelBox(neck, 61, 21, -1.25F, -0.35F, -2.25F, 2, 3, 3, 0.002F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.1091F, -1.7954F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 54, -1.0F, -0.5F, -3.5F, 3, 3, 4, -0.006F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, 0.047F, -3.3388F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 1.0036F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 43, 59, -1.5F, -1.825F, -2.5F, 3, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.2021F, -2.5756F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4625F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 68, -0.5F, 0.025F, -0.975F, 1, 1, 1, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.1563F, -6.1972F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2574F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 28, -0.5F, -2.0F, -0.9F, 0, 3, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.1563F, -6.1972F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2138F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 11, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.3148F, -6.3755F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7418F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 41, -0.5F, -0.5F, -0.3F, 1, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.3148F, -6.3755F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 21, -0.5F, 0.025F, 0.0F, 2, 1, 5, -0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.4F, 0.3888F, -5.812F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0886F, -0.1739F, -0.0154F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 66, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.4F, 0.3888F, -5.812F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0886F, 0.1739F, 0.0154F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 66, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.5071F, -4.296F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 65, -0.5F, -1.0F, -2.0F, 2, 1, 2, -0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 62, 0.0F, -1.0F, -6.0F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.825F, -2.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 64, 50, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.28F, -0.1291F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 66, -0.5F, 0.25F, -1.325F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, -1.325F, -2.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 37, -0.5F, -0.875F, 0.05F, 3, 1, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.075F, -1.675F, -1.725F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 38, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 38, 1.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.1892F, -1.6218F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 11, -1.5F, -0.0142F, -0.8782F, 3, 1, 2, -0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 16, -1.0F, -1.0142F, -1.7532F, 2, 2, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 0, -0.5F, 0.4884F, -8.5794F, 1, 1, 4, -0.006F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.9557F, -1.0955F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.24F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 44, -0.5F, -2.0F, -0.05F, 2, 2, 2, -0.006F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.3179F, -2.6742F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 65, -0.5F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.25F, 0.6697F, -4.4001F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0894F, -0.2173F, -0.0193F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 29, 66, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.25F, 0.6697F, -4.4001F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0894F, 0.2173F, 0.0193F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 66, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.3179F, -2.6742F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 65, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -1.0142F, -0.8782F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 54, -0.5F, 1.0F, -2.125F, 2, 1, 2, -0.003F, false));


        this.leftmembrane2.setScale((float)1,(float)0,(float)0);
        this.leftmembrane6.setScale((float)1,(float)0,(float)0);
        this.leftmembrane7.setScale((float)1,(float)0,(float)0);
        this.leftmembrane4.setScale((float)1,(float)0,(float)0);
        this.leftmembrane5.setScale((float)1,(float)0,(float)0);
        this.leftmembrane8.setScale((float)1,(float)0,(float)0);
        this.leftmembrane3.setScale((float)1,(float)0,(float)0);
        this.rightmembrane2.setScale((float)1,(float)0,(float)0);
        this.rightmembrane3.setScale((float)1,(float)0,(float)0);
        this.rightmembrane6.setScale((float)1,(float)0,(float)0);
        this.rightmembrane4.setScale((float)1,(float)0,(float)0);
        this.rightmembrane5.setScale((float)1,(float)0,(float)0);
        this.rightmembrane3.setScale((float)1,(float)0,(float)0);
        this.rightmembrane7.setScale((float)1,(float)0,(float)0);
        this.rightmembrane8.setScale((float)1,(float)0,(float)0);
        this.cube_r1.setScale((float)1,(float)0,(float)0);
        this.cube_r2.setScale((float)1,(float)0,(float)0);


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
        this.main.offsetX = -0.3F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(-30);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, -0.2F, 3.8F, -0.2F);

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
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraNoripterus ee = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftmembrane2.setScale((float)1,(float)1,(float)1);
            this.leftmembrane6.setScale((float)1,(float)1,(float)1);
            this.leftmembrane7.setScale((float)1,(float)1,(float)1);
            this.leftmembrane8.setScale((float)1,(float)1,(float)1);
            this.leftmembrane4.setScale((float)1,(float)1,(float)1);
            this.leftmembrane5.setScale((float)1,(float)1,(float)1);
            this.leftmembrane3.setScale((float)1,(float)1,(float)1);
            this.rightmembrane2.setScale((float)1,(float)1,(float)1);
            this.rightmembrane6.setScale((float)1,(float)1,(float)1);
            this.rightmembrane7.setScale((float)1,(float)1,(float)1);
            this.rightmembrane4.setScale((float)1,(float)1,(float)1);
            this.rightmembrane5.setScale((float)1,(float)1,(float)1);
            this.rightmembrane3.setScale((float)1,(float)1,(float)1);
            this.rightmembrane8.setScale((float)1,(float)1,(float)1);
            this.cube_r1.setScale((float)1,(float)1,(float)1);
            this.cube_r2.setScale((float)1,(float)1,(float)1);

            //And now the pose:

            this.setRotateAngle(body, 0.288F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.24F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.0894F, -0.2173F, -0.0193F);
            this.setRotateAngle(cube_r18, 0.0894F, 0.2173F, 0.0193F);
            this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.4625F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, 0.2574F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, 0.2138F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.7418F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0886F, -0.1739F, -0.0154F);
            this.setRotateAngle(cube_r9, 0.0886F, 0.1739F, 0.0154F);
            this.setRotateAngle(head, 1.0036F, 0.0F, 0.0F);
            this.setRotateAngle(lefthand, 2.0075F, -0.0076F, 3.0547F);
            this.setRotateAngle(leftleg, 0.3914F, 0.0334F, -1.6078F);
            this.setRotateAngle(leftleg2, 0.5203F, 0.0573F, -0.0693F);
            this.setRotateAngle(leftleg3, 1.009F, 0.205F, -0.0094F);
            this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, -0.0436F);
            this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0436F);
            this.setRotateAngle(leftmembrane8, 0.0F, 0.0F, -0.0436F);
            this.setRotateAngle(leftwing, -1.6581F, -0.1309F, -1.5708F);
            this.setRotateAngle(leftwing2, -0.0876F, 0.0869F, -0.0076F);
            this.setRotateAngle(leftwing3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing4, 0.2184F, -0.0426F, -0.0094F);
            this.setRotateAngle(leftwing5, 0.1338F, -0.0432F, -0.0508F);
            this.setRotateAngle(main, -0.3883F, 0.0F, 0.0F);
            this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(righthand, 2.0075F, 0.0076F, -3.0547F);
            this.setRotateAngle(rightleg, 0.3914F, -0.0334F, 1.6078F);
            this.setRotateAngle(rightleg2, 0.5203F, -0.0573F, 0.0693F);
            this.setRotateAngle(rightleg3, 1.009F, -0.205F, 0.0094F);
            this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, 0.0436F);
            this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0436F);
            this.setRotateAngle(rightmembrane8, 0.0F, 0.0F, 0.0436F);
            this.setRotateAngle(rightwing, -1.6581F, 0.1309F, 1.5708F);
            this.setRotateAngle(rightwing2, -0.0876F, -0.0869F, 0.0076F);
            this.setRotateAngle(rightwing3, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing4, 0.2184F, 0.0426F, 0.0094F);
            this.setRotateAngle(rightwing5, 0.1338F, 0.0432F, 0.0508F);
            this.setRotateAngle(tail, 0.2618F, 0.0F, 0.0F);




        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftmembrane2.setScale((float)0,(float)0,(float)0);
                this.leftmembrane6.setScale((float)0,(float)0,(float)0);
                this.leftmembrane7.setScale((float)0,(float)0,(float)0);
                this.leftmembrane4.setScale((float)0,(float)0,(float)0);
                this.leftmembrane5.setScale((float)0,(float)0,(float)0);
                this.leftmembrane8.setScale((float)0,(float)0,(float)0);
                this.leftmembrane3.setScale((float)0,(float)0,(float)0);
                this.rightmembrane2.setScale((float)0,(float)0,(float)0);
                this.rightmembrane3.setScale((float)0,(float)0,(float)0);
                this.rightmembrane6.setScale((float)0,(float)0,(float)0);
                this.rightmembrane4.setScale((float)0,(float)0,(float)0);
                this.rightmembrane5.setScale((float)0,(float)0,(float)0);
                this.rightmembrane3.setScale((float)0,(float)0,(float)0);
                this.rightmembrane7.setScale((float)0,(float)0,(float)0);
                this.rightmembrane8.setScale((float)0,(float)0,(float)0);
                this.cube_r1.setScale((float)1,(float)0,(float)0);
                this.cube_r2.setScale((float)1,(float)0,(float)0);
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
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNoripterus entity = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 35.5 + (((tickAnim - 11) / 12) * (-2-(35.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -2 + (((tickAnim - 23) / 6) * (-2-(-2)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2 + (((tickAnim - 29) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 11) / 12) * (-6.5-(21.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -6.5 + (((tickAnim - 23) / 4) * (-4.5-(-6.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -4.5 + (((tickAnim - 27) / 2) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 29) / 6) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.2-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 11) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 24) * (0-(0)));
            zz = -0.2 + (((tickAnim - 11) / 24) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



















        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 14.25 + (((tickAnim - 7) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (23.79-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 23.79 + (((tickAnim - 15) / 7) * (-25.25-(23.79)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -25.25 + (((tickAnim - 22) / 1) * (-2.5-(-25.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 23) / 4) * (-9.25-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -9.25 + (((tickAnim - 27) / 2) * (-2.5-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 29) / 6) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 7) / 4) * (0-(24.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (27-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 22) / 1) * (0-(27)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 11 + (((tickAnim - 27) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNoripterus entity = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.leftmembrane4.rotationPointX = this.leftmembrane4.rotationPointX + (float)(0);
        this.leftmembrane4.rotationPointY = this.leftmembrane4.rotationPointY - (float)(-0.125);
        this.leftmembrane4.rotationPointZ = this.leftmembrane4.rotationPointZ + (float)(0);



        this.leftmembrane5.rotationPointX = this.leftmembrane5.rotationPointX + (float)(0);
        this.leftmembrane5.rotationPointY = this.leftmembrane5.rotationPointY - (float)(-0.025);
        this.leftmembrane5.rotationPointZ = this.leftmembrane5.rotationPointZ + (float)(0);







        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 10) / 5) * (4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9 + (((tickAnim - 15) / 5) * (5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 20) / 3) * (-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9-(5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9 + (((tickAnim - 23) / 4) * (-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 27) / 8) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 35) / 6) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825 + (((tickAnim - 15) / 7) * (-5.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.5 + (((tickAnim - 22) / 5) * (-9.25-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 27) / 8) * (-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15 + (((tickAnim - 35) / 6) * (0-(-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));






        this.rightmembrane4.rotationPointX = this.rightmembrane4.rotationPointX + (float)(0);
        this.rightmembrane4.rotationPointY = this.rightmembrane4.rotationPointY - (float)(-0.025);
        this.rightmembrane4.rotationPointZ = this.rightmembrane4.rotationPointZ + (float)(0);



        this.rightmembrane5.rotationPointX = this.rightmembrane5.rotationPointX + (float)(0);
        this.rightmembrane5.rotationPointY = this.rightmembrane5.rotationPointY - (float)(-0.05);
        this.rightmembrane5.rotationPointZ = this.rightmembrane5.rotationPointZ + (float)(0);







        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 10) / 5) * (24.5-(20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 24.5 + (((tickAnim - 15) / 7) * (14.75-(24.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 14.75 + (((tickAnim - 22) / 5) * (-5.25-(14.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 27) / 3) * (1.75-(-5.25)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 1.75 + (((tickAnim - 30) / 11) * (0-(1.75)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 19.5 + (((tickAnim - 3) / 4) * (0-(19.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (24-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24 + (((tickAnim - 10) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.75 + (((tickAnim - 20) / 7) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5-(0.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5 + (((tickAnim - 27) / 8) * (-0.75-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -0.75 + (((tickAnim - 35) / 6) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraNoripterus entity = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.40087-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.4418-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.649-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -5.40087 + (((tickAnim - 13) / 20) * (-5.40087-(-5.40087)));
            yy = -2.4418 + (((tickAnim - 13) / 20) * (-2.4418-(-2.4418)));
            zz = -4.649 + (((tickAnim - 13) / 20) * (-4.649-(-4.649)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -5.40087 + (((tickAnim - 33) / 10) * (-5.34721-(-5.40087)));
            yy = -2.4418 + (((tickAnim - 33) / 10) * (2.92479-(-2.4418)));
            zz = -4.649 + (((tickAnim - 33) / 10) * (8.01522-(-4.649)));
        }
        else if (tickAnim >= 43 && tickAnim < 57) {
            xx = -5.34721 + (((tickAnim - 43) / 14) * (-5.34721-(-5.34721)));
            yy = 2.92479 + (((tickAnim - 43) / 14) * (2.92479-(2.92479)));
            zz = 8.01522 + (((tickAnim - 43) / 14) * (8.01522-(8.01522)));
        }
        else if (tickAnim >= 57 && tickAnim < 65) {
            xx = -5.34721 + (((tickAnim - 57) / 8) * (0-(-5.34721)));
            yy = 2.92479 + (((tickAnim - 57) / 8) * (0-(2.92479)));
            zz = 8.01522 + (((tickAnim - 57) / 8) * (0-(8.01522)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = -4.25 + (((tickAnim - 13) / 20) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = -6.75 + (((tickAnim - 13) / 20) * (-6.75-(-6.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -4.25 + (((tickAnim - 33) / 10) * (-3.97862-(-4.25)));
            yy = 0 + (((tickAnim - 33) / 10) * (3.28199-(0)));
            zz = -6.75 + (((tickAnim - 33) / 10) * (2.70127-(-6.75)));
        }
        else if (tickAnim >= 43 && tickAnim < 57) {
            xx = -3.97862 + (((tickAnim - 43) / 14) * (-3.97862-(-3.97862)));
            yy = 3.28199 + (((tickAnim - 43) / 14) * (3.28199-(3.28199)));
            zz = 2.70127 + (((tickAnim - 43) / 14) * (2.70127-(2.70127)));
        }
        else if (tickAnim >= 57 && tickAnim < 65) {
            xx = -3.97862 + (((tickAnim - 57) / 8) * (0-(-3.97862)));
            yy = 3.28199 + (((tickAnim - 57) / 8) * (0-(3.28199)));
            zz = 2.70127 + (((tickAnim - 57) / 8) * (0-(2.70127)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-13.46026-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (-4.84262-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (-22.82231-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -13.46026 + (((tickAnim - 13) / 6) * (-13.46026-(-13.46026)));
            yy = -4.84262 + (((tickAnim - 13) / 6) * (-4.84262-(-4.84262)));
            zz = -22.82231 + (((tickAnim - 13) / 6) * (-22.82231-(-22.82231)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -13.46026 + (((tickAnim - 19) / 3) * (-13.46026-(-13.46026)));
            yy = -4.84262 + (((tickAnim - 19) / 3) * (-4.84262-(-4.84262)));
            zz = -22.82231 + (((tickAnim - 19) / 3) * (-22.82231-(-22.82231)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -13.46026 + (((tickAnim - 22) / 5) * (-13.25543-(-13.46026)));
            yy = -4.84262 + (((tickAnim - 22) / 5) * (-0.83635-(-4.84262)));
            zz = -22.82231 + (((tickAnim - 22) / 5) * (-26.95283-(-22.82231)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -13.25543 + (((tickAnim - 27) / 4) * (-13.25543-(-13.25543)));
            yy = -0.83635 + (((tickAnim - 27) / 4) * (-0.83635-(-0.83635)));
            zz = -26.95283 + (((tickAnim - 27) / 4) * (-26.95283-(-26.95283)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -13.25543 + (((tickAnim - 31) / 2) * (-13.46026-(-13.25543)));
            yy = -0.83635 + (((tickAnim - 31) / 2) * (-4.84262-(-0.83635)));
            zz = -26.95283 + (((tickAnim - 31) / 2) * (-22.82231-(-26.95283)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -13.46026 + (((tickAnim - 33) / 2) * (-15.83347-(-13.46026)));
            yy = -4.84262 + (((tickAnim - 33) / 2) * (-16.35193-(-4.84262)));
            zz = -22.82231 + (((tickAnim - 33) / 2) * (-10.25422-(-22.82231)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -15.83347 + (((tickAnim - 35) / 8) * (-15.43673-(-15.83347)));
            yy = -16.35193 + (((tickAnim - 35) / 8) * (13.53931-(-16.35193)));
            zz = -10.25422 + (((tickAnim - 35) / 8) * (27.66848-(-10.25422)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -15.43673 + (((tickAnim - 43) / 3) * (-15.43673-(-15.43673)));
            yy = 13.53931 + (((tickAnim - 43) / 3) * (13.53931-(13.53931)));
            zz = 27.66848 + (((tickAnim - 43) / 3) * (27.66848-(27.66848)));
        }
        else if (tickAnim >= 46 && tickAnim < 49) {
            xx = -15.43673 + (((tickAnim - 46) / 3) * (-23.18673-(-15.43673)));
            yy = 13.53931 + (((tickAnim - 46) / 3) * (13.53931-(13.53931)));
            zz = 27.66848 + (((tickAnim - 46) / 3) * (27.66848-(27.66848)));
        }
        else if (tickAnim >= 49 && tickAnim < 58) {
            xx = -23.18673 + (((tickAnim - 49) / 9) * (-15.43673-(-23.18673)));
            yy = 13.53931 + (((tickAnim - 49) / 9) * (13.53931-(13.53931)));
            zz = 27.66848 + (((tickAnim - 49) / 9) * (27.66848-(27.66848)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -15.43673 + (((tickAnim - 58) / 2) * (-5.34939-(-15.43673)));
            yy = 13.53931 + (((tickAnim - 58) / 2) * (10.83145-(13.53931)));
            zz = 27.66848 + (((tickAnim - 58) / 2) * (22.13478-(27.66848)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -5.34939 + (((tickAnim - 60) / 5) * (0-(-5.34939)));
            yy = 10.83145 + (((tickAnim - 60) / 5) * (0-(10.83145)));
            zz = 22.13478 + (((tickAnim - 60) / 5) * (0-(22.13478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 48) / 1) * (3.25-(0)));
            yy = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 3.25 + (((tickAnim - 49) / 2) * (0-(3.25)));
            yy = 0 + (((tickAnim - 49) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 2) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 51) / 2) * (3.25-(0)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 54) {
            xx = 3.25 + (((tickAnim - 53) / 1) * (0-(3.25)));
            yy = 0 + (((tickAnim - 53) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 1) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNoripterus entity = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;
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
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1 + (((tickAnim - 0) / 50) * (-3.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 0) / 50) * (-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = -3.25 + (((tickAnim - 50) / 70) * (-3.25-(-3.25)));
            zz = -3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1 + (((tickAnim - 50) / 70) * (-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = -3.25 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1-(-3.25)));
            zz = -1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
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
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(0), leftleg3.rotateAngleY + (float) Math.toRadians(0), leftleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-140))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(0), leftmembrane.rotateAngleY + (float) Math.toRadians(0), leftmembrane.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-3)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-15-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0.5 + (((tickAnim - 0) / 50) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0.5 + (((tickAnim - 50) / 70) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0.5 + (((tickAnim - 120) / 40) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-25-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-30-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));






        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(134.9843), lefthand.rotateAngleY + (float) Math.toRadians(-82.29915), lefthand.rotateAngleZ + (float) Math.toRadians(-417.38922));
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(-0.275);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(0.575);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(0);






        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+80))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
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
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+160))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*-4-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*3 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*3)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*15-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*-2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 0) / 50) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -0.5 + (((tickAnim - 50) / 70) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -0.5 + (((tickAnim - 120) / 40) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(xx);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(yy);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*25-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*30-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*10-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));






        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(134.9843), righthand.rotateAngleY + (float) Math.toRadians(82.29915), righthand.rotateAngleZ + (float) Math.toRadians(417.38922));
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(0.4);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(0.575);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(0);






        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+290))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.625-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = -0.25 + (((tickAnim - 50) / 70) * (-0.25-(-0.25)));
            zz = 0.625 + (((tickAnim - 50) / 70) * (0.625-(0.625)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = -0.25 + (((tickAnim - 120) / 40) * (0-(-0.25)));
            zz = 0.625 + (((tickAnim - 120) / 40) * (0-(0.625)));
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
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraNoripterus entity = (EntityPrehistoricFloraNoripterus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.rightmembrane6.setScale((float)0,(float)0,(float)0);
        this.leftmembrane6.setScale((float)0,(float)0,(float)0);

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 16.25 + (((tickAnim - 0) / 3) * (6.86722-(16.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.28409-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-9.54617-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 6.86722 + (((tickAnim - 3) / 9) * (-8-(6.86722)));
            yy = 7.28409 + (((tickAnim - 3) / 9) * (0-(7.28409)));
            zz = -9.54617 + (((tickAnim - 3) / 9) * (0-(-9.54617)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 12) / 10) * (16.25-(-8)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.75 + (((tickAnim - 0) / 3) * (-3.72-(29.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -3.72 + (((tickAnim - 3) / 5) * (-31.5-(-3.72)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -31.5 + (((tickAnim - 8) / 4) * (-24.5-(-31.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -24.5 + (((tickAnim - 12) / 10) * (29.75-(-24.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.225 + (((tickAnim - 3) / 5) * (0-(0.225)));
            yy = 1.525 + (((tickAnim - 3) / 5) * (0.875-(1.525)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.875 + (((tickAnim - 8) / 4) * (0-(0.875)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 79.25 + (((tickAnim - 0) / 3) * (81.0036-(79.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.47446-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.56068-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 81.0036 + (((tickAnim - 3) / 9) * (18.31942-(81.0036)));
            yy = 4.47446 + (((tickAnim - 3) / 9) * (11.21462-(4.47446)));
            zz = 1.56068 + (((tickAnim - 3) / 9) * (7.05702-(1.56068)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 18.31942 + (((tickAnim - 12) / 5) * (-4.08623-(18.31942)));
            yy = 11.21462 + (((tickAnim - 12) / 5) * (6.19224-(11.21462)));
            zz = 7.05702 + (((tickAnim - 12) / 5) * (-2.35661-(7.05702)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -4.08623 + (((tickAnim - 17) / 5) * (79.25-(-4.08623)));
            yy = 6.19224 + (((tickAnim - 17) / 5) * (0-(6.19224)));
            zz = -2.35661 + (((tickAnim - 17) / 5) * (0-(-2.35661)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 1.525 + (((tickAnim - 3) / 9) * (-0.275-(1.525)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 12) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -4.55096 + (((tickAnim - 0) / 14) * (22.01716-(-4.55096)));
            yy = -5.84229 + (((tickAnim - 0) / 14) * (7.31503-(-5.84229)));
            zz = 21.53714 + (((tickAnim - 0) / 14) * (13.49623-(21.53714)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 22.01716 + (((tickAnim - 14) / 8) * (-4.55096-(22.01716)));
            yy = 7.31503 + (((tickAnim - 14) / 8) * (-5.84229-(7.31503)));
            zz = 13.49623 + (((tickAnim - 14) / 8) * (21.53714-(13.49623)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.81619 + (((tickAnim - 0) / 8) * (-5.0902-(0.81619)));
            yy = -8.47651 + (((tickAnim - 0) / 8) * (-2.97796-(-8.47651)));
            zz = -2.6319 + (((tickAnim - 0) / 8) * (-2.13592-(-2.6319)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5.0902 + (((tickAnim - 8) / 4) * (-6.60291-(-5.0902)));
            yy = -2.97796 + (((tickAnim - 8) / 4) * (-8.6808-(-2.97796)));
            zz = -2.13592 + (((tickAnim - 8) / 4) * (-10.46858-(-2.13592)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -6.60291 + (((tickAnim - 12) / 2) * (-13.51054-(-6.60291)));
            yy = -8.6808 + (((tickAnim - 12) / 2) * (-12.10251-(-8.6808)));
            zz = -10.46858 + (((tickAnim - 12) / 2) * (-15.46819-(-10.46858)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -13.51054 + (((tickAnim - 14) / 8) * (0.81619-(-13.51054)));
            yy = -12.10251 + (((tickAnim - 14) / 8) * (-8.47651-(-12.10251)));
            zz = -15.46819 + (((tickAnim - 14) / 8) * (-2.6319-(-15.46819)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(xx), leftmembrane.rotateAngleY + (float) Math.toRadians(yy), leftmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.82-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -0.82 + (((tickAnim - 8) / 4) * (-1.59-(-0.82)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.685-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -1.59 + (((tickAnim - 12) / 2) * (-1.045-(-1.59)));
            zz = -0.685 + (((tickAnim - 12) / 2) * (-0.5-(-0.685)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -1.045 + (((tickAnim - 14) / 8) * (0-(-1.045)));
            zz = -0.5 + (((tickAnim - 14) / 8) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftmembrane.rotationPointX = this.leftmembrane.rotationPointX + (float)(xx);
        this.leftmembrane.rotationPointY = this.leftmembrane.rotationPointY - (float)(yy);
        this.leftmembrane.rotationPointZ = this.leftmembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -2.10093 + (((tickAnim - 0) / 14) * (-36.11226-(-2.10093)));
            yy = 22.3976 + (((tickAnim - 0) / 14) * (13.40748-(22.3976)));
            zz = -3.62709 + (((tickAnim - 0) / 14) * (1.08844-(-3.62709)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -36.11226 + (((tickAnim - 14) / 4) * (-40.63728-(-36.11226)));
            yy = 13.40748 + (((tickAnim - 14) / 4) * (11.79969-(13.40748)));
            zz = 1.08844 + (((tickAnim - 14) / 4) * (-5.99676-(1.08844)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -40.63728 + (((tickAnim - 18) / 1) * (-40.63728-(-40.63728)));
            yy = 11.79969 + (((tickAnim - 18) / 1) * (11.79969-(11.79969)));
            zz = -5.99676 + (((tickAnim - 18) / 1) * (-5.99676-(-5.99676)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -40.63728 + (((tickAnim - 19) / 3) * (-2.10093-(-40.63728)));
            yy = 11.79969 + (((tickAnim - 19) / 3) * (22.3976-(11.79969)));
            zz = -5.99676 + (((tickAnim - 19) / 3) * (-3.62709-(-5.99676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-0.125-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0.225 + (((tickAnim - 14) / 8) * (0-(0.225)));
            yy = 0.725 + (((tickAnim - 14) / 8) * (0-(0.725)));
            zz = -0.125 + (((tickAnim - 14) / 8) * (0-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(xx);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(yy);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -5.5 + (((tickAnim - 0) / 14) * (36-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 36 + (((tickAnim - 14) / 4) * (50.75-(36)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 50.75 + (((tickAnim - 18) / 1) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 36.25 + (((tickAnim - 19) / 3) * (-5.5-(36.25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 16.96629 + (((tickAnim - 0) / 14) * (3.26552-(16.96629)));
            yy = -4.28463 + (((tickAnim - 0) / 14) * (23.83356-(-4.28463)));
            zz = 1.37621 + (((tickAnim - 0) / 14) * (44.2933-(1.37621)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 3.26552 + (((tickAnim - 14) / 5) * (8.74348-(3.26552)));
            yy = 23.83356 + (((tickAnim - 14) / 5) * (-10.15112-(23.83356)));
            zz = 44.2933 + (((tickAnim - 14) / 5) * (4.57599-(44.2933)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 8.74348 + (((tickAnim - 19) / 3) * (16.96629-(8.74348)));
            yy = -10.15112 + (((tickAnim - 19) / 3) * (-4.28463-(-10.15112)));
            zz = 4.57599 + (((tickAnim - 19) / 3) * (1.37621-(4.57599)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0.375 + (((tickAnim - 0) / 22) * (0.375-(0.375)));
            yy = 0.5 + (((tickAnim - 0) / 22) * (0.5-(0.5)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing4.rotationPointX = this.leftwing4.rotationPointX + (float)(xx);
        this.leftwing4.rotationPointY = this.leftwing4.rotationPointY - (float)(yy);
        this.leftwing4.rotationPointZ = this.leftwing4.rotationPointZ + (float)(zz);



        this.leftmembrane4.rotationPointX = this.leftmembrane4.rotationPointX + (float)(0);
        this.leftmembrane4.rotationPointY = this.leftmembrane4.rotationPointY - (float)(-0.075);
        this.leftmembrane4.rotationPointZ = this.leftmembrane4.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -3.5 + (((tickAnim - 14) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembrane5.rotationPointX = this.leftmembrane5.rotationPointX + (float)(0);
        this.leftmembrane5.rotationPointY = this.leftmembrane5.rotationPointY - (float)(-0.05);
        this.leftmembrane5.rotationPointZ = this.leftmembrane5.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 31.62808 + (((tickAnim - 0) / 14) * (-0.44679-(31.62808)));
            yy = -2.59155 + (((tickAnim - 0) / 14) * (-12.67727-(-2.59155)));
            zz = -185.16097 + (((tickAnim - 0) / 14) * (-185.9501-(-185.16097)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.44679 + (((tickAnim - 14) / 4) * (46.55899-(-0.44679)));
            yy = -12.67727 + (((tickAnim - 14) / 4) * (-8.19464-(-12.67727)));
            zz = -185.9501 + (((tickAnim - 14) / 4) * (-185.59937-(-185.9501)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 46.55899 + (((tickAnim - 18) / 4) * (31.62808-(46.55899)));
            yy = -8.19464 + (((tickAnim - 18) / 4) * (-2.59155-(-8.19464)));
            zz = -185.59937 + (((tickAnim - 18) / 4) * (-185.16097-(-185.59937)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (0.3-(0.3)));
            zz = -0.425 + (((tickAnim - 0) / 3) * (-0.77-(-0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 4) * (0.3-(0.3)));
            zz = -0.77 + (((tickAnim - 3) / 4) * (0.325-(-0.77)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 7) / 4) * (0.3-(0.3)));
            zz = 0.325 + (((tickAnim - 7) / 4) * (-0.64-(0.325)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 11) / 3) * (0.3-(0.3)));
            zz = -0.64 + (((tickAnim - 11) / 3) * (-0.245-(-0.64)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.3 + (((tickAnim - 14) / 8) * (0.3-(0.3)));
            zz = -0.245 + (((tickAnim - 14) / 8) * (-0.425-(-0.245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);






        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+170))*-2), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542))*-2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*-3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.325+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271))*-0.2);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271-60))*-0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+90))*5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+90))*3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+30))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+170))*3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+20))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.271+220))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.542+100))*3));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -4 + (((tickAnim - 0) / 12) * (16.25-(-4)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 16.25 + (((tickAnim - 12) / 3) * (6.86722-(16.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (7.28409-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (9.5462-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 6.86722 + (((tickAnim - 15) / 4) * (-8-(6.86722)));
            yy = 7.28409 + (((tickAnim - 15) / 4) * (0-(7.28409)));
            zz = 9.5462 + (((tickAnim - 15) / 4) * (0-(9.5462)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -8 + (((tickAnim - 19) / 3) * (-4-(-8)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -16.48466 + (((tickAnim - 0) / 12) * (29.75-(-16.48466)));
            yy = 2.7959 + (((tickAnim - 0) / 12) * (0-(2.7959)));
            zz = -14.77136 + (((tickAnim - 0) / 12) * (0-(-14.77136)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.75 + (((tickAnim - 12) / 3) * (-3.72-(29.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3.72 + (((tickAnim - 15) / 3) * (-27.42329-(-3.72)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.35864-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-15.53695-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -27.42329 + (((tickAnim - 18) / 1) * (-24.5-(-27.42329)));
            yy = 0.35864 + (((tickAnim - 18) / 1) * (0-(0.35864)));
            zz = -15.53695 + (((tickAnim - 18) / 1) * (-15.53695-(-15.53695)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -24.5 + (((tickAnim - 19) / 3) * (-16.48466-(-24.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (2.7959-(0)));
            zz = -15.53695 + (((tickAnim - 19) / 3) * (-14.77136-(-15.53695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0.225-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.225 + (((tickAnim - 15) / 3) * (0-(0.225)));
            yy = 1.525 + (((tickAnim - 15) / 3) * (0.875-(1.525)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0-(0.875)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);







        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.31942 + (((tickAnim - 0) / 5) * (-4.08623-(18.31942)));
            yy = 11.21462 + (((tickAnim - 0) / 5) * (6.19224-(11.21462)));
            zz = 7.05702 + (((tickAnim - 0) / 5) * (-2.35661-(7.05702)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.08623 + (((tickAnim - 5) / 5) * (79.25-(-4.08623)));
            yy = 6.19224 + (((tickAnim - 5) / 5) * (0-(6.19224)));
            zz = -2.35661 + (((tickAnim - 5) / 5) * (0-(-2.35661)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 79.25 + (((tickAnim - 10) / 3) * (81.0036-(79.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (4.47446-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (1.56068-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 81.0036 + (((tickAnim - 13) / 9) * (18.31942-(81.0036)));
            yy = 4.47446 + (((tickAnim - 13) / 9) * (11.21462-(4.47446)));
            zz = 1.56068 + (((tickAnim - 13) / 9) * (7.05702-(1.56068)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.525-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 1.525 + (((tickAnim - 13) / 9) * (-0.275-(1.525)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 21.66387 + (((tickAnim - 0) / 9) * (-4.55096-(21.66387)));
            yy = -5.0878 + (((tickAnim - 0) / 9) * (5.84229-(-5.0878)));
            zz = -17.98696 + (((tickAnim - 0) / 9) * (-21.53714-(-17.98696)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -4.55096 + (((tickAnim - 9) / 13) * (21.66387-(-4.55096)));
            yy = 5.84229 + (((tickAnim - 9) / 13) * (-5.0878-(5.84229)));
            zz = -21.53714 + (((tickAnim - 9) / 13) * (-17.98696-(-21.53714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -16.04238 + (((tickAnim - 0) / 6) * (0.27705-(-16.04238)));
            yy = 16.87132 + (((tickAnim - 0) / 6) * (9.26123-(16.87132)));
            zz = 18.63966 + (((tickAnim - 0) / 6) * (5.41004-(18.63966)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0.27705 + (((tickAnim - 6) / 3) * (6.42471-(0.27705)));
            yy = 9.26123 + (((tickAnim - 6) / 3) * (10.86335-(9.26123)));
            zz = 5.41004 + (((tickAnim - 6) / 3) * (8.19522-(5.41004)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 6.42471 + (((tickAnim - 9) / 2) * (3.87354-(6.42471)));
            yy = 10.86335 + (((tickAnim - 9) / 2) * (11.66442-(10.86335)));
            zz = 8.19522 + (((tickAnim - 9) / 2) * (9.58782-(8.19522)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 3.87354 + (((tickAnim - 11) / 3) * (-4.83821-(3.87354)));
            yy = 11.66442 + (((tickAnim - 11) / 3) * (12.56825-(11.66442)));
            zz = 9.58782 + (((tickAnim - 11) / 3) * (0.85211-(9.58782)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -4.83821 + (((tickAnim - 14) / 4) * (-6.72391-(-4.83821)));
            yy = 12.56825 + (((tickAnim - 14) / 4) * (13.42988-(12.56825)));
            zz = 0.85211 + (((tickAnim - 14) / 4) * (2.93235-(0.85211)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.72391 + (((tickAnim - 18) / 4) * (-16.04238-(-6.72391)));
            yy = 13.42988 + (((tickAnim - 18) / 4) * (16.87132-(13.42988)));
            zz = 2.93235 + (((tickAnim - 18) / 4) * (18.63966-(2.93235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane, rightmembrane.rotateAngleX + (float) Math.toRadians(xx), rightmembrane.rotateAngleY + (float) Math.toRadians(yy), rightmembrane.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = -1.175 + (((tickAnim - 0) / 22) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane.rotationPointX = this.rightmembrane.rotationPointX + (float)(xx);
        this.rightmembrane.rotationPointY = this.rightmembrane.rotationPointY - (float)(yy);
        this.rightmembrane.rotationPointZ = this.rightmembrane.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -52.62529 + (((tickAnim - 0) / 2) * (-52.62529-(-52.62529)));
            yy = -27.65446 + (((tickAnim - 0) / 2) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 0) / 2) * (-27.16747-(-27.16747)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -52.62529 + (((tickAnim - 2) / 3) * (-52.62529-(-52.62529)));
            yy = -27.65446 + (((tickAnim - 2) / 3) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 2) / 3) * (-27.16747-(-27.16747)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -52.62529 + (((tickAnim - 5) / 2) * (-52.62529-(-52.62529)));
            yy = -27.65446 + (((tickAnim - 5) / 2) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 5) / 2) * (-27.16747-(-27.16747)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -52.62529 + (((tickAnim - 7) / 2) * (-31.12529-(-52.62529)));
            yy = -27.65446 + (((tickAnim - 7) / 2) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 7) / 2) * (-27.16747-(-27.16747)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -31.12529 + (((tickAnim - 9) / 9) * (-41.20862-(-31.12529)));
            yy = -27.65446 + (((tickAnim - 9) / 9) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 9) / 9) * (-27.16747-(-27.16747)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -41.20862 + (((tickAnim - 18) / 4) * (-52.62529-(-41.20862)));
            yy = -27.65446 + (((tickAnim - 18) / 4) * (-27.65446-(-27.65446)));
            zz = -27.16747 + (((tickAnim - 18) / 4) * (-27.16747-(-27.16747)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32.5 + (((tickAnim - 0) / 2) * (37.25-(32.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 37.25 + (((tickAnim - 2) / 3) * (50.75-(37.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 50.75 + (((tickAnim - 5) / 2) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 36.25 + (((tickAnim - 7) / 2) * (14.33681-(36.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (-5.10815-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-2.20822-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 14.33681 + (((tickAnim - 9) / 13) * (32.5-(14.33681)));
            yy = -5.10815 + (((tickAnim - 9) / 13) * (0-(-5.10815)));
            zz = -2.20822 + (((tickAnim - 9) / 13) * (0-(-2.20822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.41712-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.73199-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.50669-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -1.41712 + (((tickAnim - 10) / 12) * (0-(-1.41712)));
            yy = 0.73199 + (((tickAnim - 10) / 12) * (0-(0.73199)));
            zz = -2.50669 + (((tickAnim - 10) / 12) * (0-(-2.50669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing4.rotationPointX = this.rightwing4.rotationPointX + (float)(xx);
        this.rightwing4.rotationPointY = this.rightwing4.rotationPointY - (float)(yy);
        this.rightwing4.rotationPointZ = this.rightwing4.rotationPointZ + (float)(zz);



        this.rightmembrane4.rotationPointX = this.rightmembrane4.rotationPointX + (float)(0);
        this.rightmembrane4.rotationPointY = this.rightmembrane4.rotationPointY - (float)(-0.1);
        this.rightmembrane4.rotationPointZ = this.rightmembrane4.rotationPointZ + (float)(0);
        this.rightmembrane4.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = -4 + (((tickAnim - 10) / 12) * (0-(-4)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightmembrane5.rotationPointX = this.rightmembrane5.rotationPointX + (float)(0);
        this.rightmembrane5.rotationPointY = this.rightmembrane5.rotationPointY - (float)(-0.1);
        this.rightmembrane5.rotationPointZ = this.rightmembrane5.rotationPointZ + (float)(0);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.60805 + (((tickAnim - 0) / 4) * (51.35805-(7.60805)));
            yy = 19.32815 + (((tickAnim - 0) / 4) * (19.32815-(19.32815)));
            zz = -146.3726 + (((tickAnim - 0) / 4) * (-146.3726-(-146.3726)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 51.35805 + (((tickAnim - 4) / 5) * (40.35805-(51.35805)));
            yy = 19.32815 + (((tickAnim - 4) / 5) * (19.32815-(19.32815)));
            zz = -146.3726 + (((tickAnim - 4) / 5) * (-146.3726-(-146.3726)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 40.35805 + (((tickAnim - 9) / 4) * (21.46221-(40.35805)));
            yy = 19.32815 + (((tickAnim - 9) / 4) * (16.73777-(19.32815)));
            zz = -146.3726 + (((tickAnim - 9) / 4) * (-148.38116-(-146.3726)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 21.46221 + (((tickAnim - 13) / 9) * (7.60805-(21.46221)));
            yy = 16.73777 + (((tickAnim - 13) / 9) * (19.32815-(16.73777)));
            zz = -148.38116 + (((tickAnim - 13) / 9) * (-146.3726-(-148.38116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.475 + (((tickAnim - 0) / 9) * (0.48-(0.475)));
            zz = -0.95 + (((tickAnim - 0) / 9) * (-0.075-(-0.95)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.48 + (((tickAnim - 9) / 4) * (0.48-(0.48)));
            zz = -0.075 + (((tickAnim - 9) / 4) * (-0.725-(-0.075)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 13) / 5) * (0.48-(0.48)));
            zz = -0.725 + (((tickAnim - 13) / 5) * (-0.045-(-0.725)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.48 + (((tickAnim - 18) / 4) * (0.475-(0.48)));
            zz = -0.045 + (((tickAnim - 18) / 4) * (-0.95-(-0.045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);







    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraNoripterus e = (EntityPrehistoricFloraNoripterus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, ((0.288F)-(0.288F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.5672F)-(-0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.24F)-(-0.24F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.0894F)-(0.0894F)), ((-0.2173F)-(-0.2173F)),((-0.0193F)-(-0.0193F)));
        animator.rotate(cube_r18, ((0.0894F)-(0.0894F)), ((0.2173F)-(0.2173F)),((0.0193F)-(0.0193F)));
        animator.rotate(cube_r19, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.5672F)-(-0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.4625F)-(0.4625F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((0.2574F)-(0.2574F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.2138F)-(0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.7418F)-(0.7418F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.0886F)-(0.0886F)), ((-0.1739F)-(-0.1739F)),((-0.0154F)-(-0.0154F)));
        animator.rotate(cube_r9, ((0.0886F)-(0.0886F)), ((0.1739F)-(0.1739F)),((0.0154F)-(0.0154F)));
        animator.rotate(head, ((1.0036F)-(1.0036F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lefthand, ((2.0075F)-(-0.2185F)), ((-0.0076F)-(0.0776F)),((3.0547F)-(3.0358F)));
        animator.rotate(leftleg, ((0.3914F)-(0.2602F)), ((0.0334F)-(-0.2975F)),((-1.6078F)-(-0.6937F)));
        animator.rotate(leftleg2, ((0.5203F)-(0.538F)), ((0.0573F)-(0.2671F)),((-0.0693F)-(0.3557F)));
        animator.rotate(leftleg3, ((1.009F)-(-0.0123F)), ((0.205F)-(0.1931F)),((-0.0094F)-(0.1237F)));
        animator.rotate(leftmembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane8, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0436F)-(-0.0436F)));
        animator.rotate(leftwing, ((-1.6581F)-(-1.4906F)), ((-0.1309F)-(-0.1869F)),((-1.5708F)-(-1.1859F)));
        animator.rotate(leftwing2, ((-0.0876F)-(-0.2419F)), ((0.0869F)-(-1.0607F)),((-0.0076F)-(0.0268F)));
        animator.rotate(leftwing3, ((0.1309F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing4, ((0.2184F)-(2.3873F)), ((-0.0426F)-(-0.1707F)),((-0.0094F)-(0.1099F)));
        animator.rotate(leftwing5, ((0.1338F)-(0.7447F)), ((-0.0432F)-(-0.0432F)),((-0.0508F)-(-0.0508F)));
        animator.rotate(main, ((-0.3883F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(righthand, ((2.0075F)-(-0.2185F)), ((0.0076F)-(-0.0776F)),((-3.0547F)-(-3.0358F)));
        animator.rotate(rightleg, ((0.3914F)-(0.2602F)), ((-0.0334F)-(0.2975F)),((1.6078F)-(0.6937F)));
        animator.rotate(rightleg2, ((0.5203F)-(0.538F)), ((-0.0573F)-(-0.2671F)),((0.0693F)-(-0.3557F)));
        animator.rotate(rightleg3, ((1.009F)-(-0.0123F)), ((-0.205F)-(-0.1931F)),((0.0094F)-(-0.1237F)));
        animator.rotate(rightmembrane4, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane8, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0436F)-(0.0436F)));
        animator.rotate(rightwing, ((-1.6581F)-(-1.4906F)), ((0.1309F)-(0.1869F)),((1.5708F)-(1.1859F)));
        animator.rotate(rightwing2, ((-0.0876F)-(-0.2419F)), ((-0.0869F)-(1.0607F)),((0.0076F)-(-0.0268F)));
        animator.rotate(rightwing3, ((0.1309F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing4, ((0.2184F)-(2.3873F)), ((0.0426F)-(0.1707F)),((0.0094F)-(-0.1099F)));
        animator.rotate(rightwing5, ((0.1338F)-(0.7447F)), ((0.0432F)-(0.0432F)),((0.0508F)-(0.0508F)));
        animator.rotate(tail, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(body, -((0.288F)-(0.288F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.5672F)-(-0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.24F)-(-0.24F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.0894F)-(0.0894F)), -((-0.2173F)-(-0.2173F)),-((-0.0193F)-(-0.0193F)));
        animator.rotate(cube_r18, -((0.0894F)-(0.0894F)), -((0.2173F)-(0.2173F)),-((0.0193F)-(0.0193F)));
        animator.rotate(cube_r19, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.5672F)-(-0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.4625F)-(0.4625F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((0.2574F)-(0.2574F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.2138F)-(0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.7418F)-(0.7418F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.0886F)-(0.0886F)), -((-0.1739F)-(-0.1739F)),-((-0.0154F)-(-0.0154F)));
        animator.rotate(cube_r9, -((0.0886F)-(0.0886F)), -((0.1739F)-(0.1739F)),-((0.0154F)-(0.0154F)));
        animator.rotate(head, -((1.0036F)-(1.0036F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lefthand, -((2.0075F)-(-0.2185F)), -((-0.0076F)-(0.0776F)),-((3.0547F)-(3.0358F)));
        animator.rotate(leftleg, -((0.3914F)-(0.2602F)), -((0.0334F)-(-0.2975F)),-((-1.6078F)-(-0.6937F)));
        animator.rotate(leftleg2, -((0.5203F)-(0.538F)), -((0.0573F)-(0.2671F)),-((-0.0693F)-(0.3557F)));
        animator.rotate(leftleg3, -((1.009F)-(-0.0123F)), -((0.205F)-(0.1931F)),-((-0.0094F)-(0.1237F)));
        animator.rotate(leftmembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0436F)-(-0.0436F)));
        animator.rotate(leftmembrane8, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0436F)-(-0.0436F)));
        animator.rotate(leftwing, -((-1.6581F)-(-1.4906F)), -((-0.1309F)-(-0.1869F)),-((-1.5708F)-(-1.1859F)));
        animator.rotate(leftwing2, -((-0.0876F)-(-0.2419F)), -((0.0869F)-(-1.0607F)),-((-0.0076F)-(0.0268F)));
        animator.rotate(leftwing3, -((0.1309F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing4, -((0.2184F)-(2.3873F)), -((-0.0426F)-(-0.1707F)),-((-0.0094F)-(0.1099F)));
        animator.rotate(leftwing5, -((0.1338F)-(0.7447F)), -((-0.0432F)-(-0.0432F)),-((-0.0508F)-(-0.0508F)));
        animator.rotate(main, -((-0.3883F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(righthand, -((2.0075F)-(-0.2185F)), -((0.0076F)-(-0.0776F)),-((-3.0547F)-(-3.0358F)));
        animator.rotate(rightleg, -((0.3914F)-(0.2602F)), -((-0.0334F)-(0.2975F)),-((1.6078F)-(0.6937F)));
        animator.rotate(rightleg2, -((0.5203F)-(0.538F)), -((-0.0573F)-(-0.2671F)),-((0.0693F)-(-0.3557F)));
        animator.rotate(rightleg3, -((1.009F)-(-0.0123F)), -((-0.205F)-(-0.1931F)),-((0.0094F)-(-0.1237F)));
        animator.rotate(rightmembrane4, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0436F)-(0.0436F)));
        animator.rotate(rightmembrane8, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0436F)-(0.0436F)));
        animator.rotate(rightwing, -((-1.6581F)-(-1.4906F)), -((0.1309F)-(0.1869F)),-((1.5708F)-(1.1859F)));
        animator.rotate(rightwing2, -((-0.0876F)-(-0.2419F)), -((-0.0869F)-(1.0607F)),-((0.0076F)-(-0.0268F)));
        animator.rotate(rightwing3, -((0.1309F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing4, -((0.2184F)-(2.3873F)), -((0.0426F)-(0.1707F)),-((0.0094F)-(-0.1099F)));
        animator.rotate(rightwing5, -((0.1338F)-(0.7447F)), -((0.0432F)-(0.0432F)),-((0.0508F)-(0.0508F)));
        animator.rotate(tail, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
