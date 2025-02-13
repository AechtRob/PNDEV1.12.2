package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHaliskia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelHaliskia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer fossil;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightlegwing1;
    private final AdvancedModelRenderer rightlegwing2;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftlegwing1;
    private final AdvancedModelRenderer leftlegwing2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftwing1;
    private final AdvancedModelRenderer leftwing1membrane;
    private final AdvancedModelRenderer leftwing1planemembrane;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing2membrane;
    private final AdvancedModelRenderer leftwing2planemembrane;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftwing3membrane;
    private final AdvancedModelRenderer leftwing3planemembrane;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer leftwing4membrane;
    private final AdvancedModelRenderer leftwing4planemembrane;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer leftwing5membrane;
    private final AdvancedModelRenderer leftwing6;
    private final AdvancedModelRenderer leftwing6membrane;
    private final AdvancedModelRenderer shoulder;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer rightwing1;
    private final AdvancedModelRenderer rightwing1membrane;
    private final AdvancedModelRenderer rightwing1planemembrane;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing2membrane;
    private final AdvancedModelRenderer rightwing2planemembrane;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightwing3membrane;
    private final AdvancedModelRenderer rightwing3planemembrane;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer rightwing4membrane;
    private final AdvancedModelRenderer rightwing4planemembrane;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer rightwing5membrane;
    private final AdvancedModelRenderer rightwing6;
    private final AdvancedModelRenderer rightwing6membrane;

    private ModelAnimator animator;

    public ModelHaliskia() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.fossil = new AdvancedModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 20.0F, -6.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -3.825F, 7.075F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.2138F, 0.0F, 0.0F);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 63, 49, -1.0F, 0.3439F, -4.5009F, 3, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 36, -1.0F, -0.6561F, -4.5009F, 3, 2, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
        this.tail.addChild(tail1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.2F, 4.25F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 55, -1.0F, -0.1564F, -4.6539F, 1, 1, 3, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.1617F, 0.3296F, 0.375F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 20, 64, -0.7834F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.2309F, -0.0429F, -0.3343F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 60, 64, -0.6567F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.7884F, -0.0341F, 0.0703F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 58, 19, -1.0203F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, false));

        this.rightlegwing1 = new AdvancedModelRenderer(this);
        this.rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
        this.rightleg2.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
        this.rightlegwing1.cubeList.add(new ModelBox(rightlegwing1, 0, 66, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, false));

        this.rightlegwing2 = new AdvancedModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
        this.rightleg1.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 65, 0, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1617F, -0.3296F, -0.375F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 20, 64, -1.2166F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.2309F, 0.0429F, 0.3343F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 60, 64, -0.3433F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, true));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.7884F, 0.0341F, -0.0703F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 58, 19, -0.9797F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, true));

        this.leftlegwing1 = new AdvancedModelRenderer(this);
        this.leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
        this.leftleg2.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
        this.leftlegwing1.cubeList.add(new ModelBox(leftlegwing1, 0, 66, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, true));

        this.leftlegwing2 = new AdvancedModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
        this.leftleg1.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 65, 0, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4588F, 1.2124F);
        this.hips.addChild(chest);
        this.setRotateAngle(chest, -0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.8912F, -5.3624F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 32, -2.0F, -2.0F, -1.0F, 5, 2, 6, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.6088F, -6.2124F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -2.0F, -4.0F, -1.0F, 5, 4, 7, 0.0F, false));

        this.leftwing1 = new AdvancedModelRenderer(this);
        this.leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4374F);
        this.chest.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.2875F, -0.6908F, -0.8886F);
        this.leftwing1.cubeList.add(new ModelBox(leftwing1, 41, 47, 0.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, true));

        this.leftwing1membrane = new AdvancedModelRenderer(this);
        this.leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
        this.leftwing1.addChild(leftwing1membrane);
        this.setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
        this.leftwing1membrane.cubeList.add(new ModelBox(leftwing1membrane, 25, 17, -4.25F, -0.25F, 0.0F, 8, 1, 6, 0.0F, true));

        this.leftwing1planemembrane = new AdvancedModelRenderer(this);
        this.leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 0.0F);
        this.leftwing1membrane.addChild(leftwing1planemembrane);
        this.setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        this.leftwing1planemembrane.cubeList.add(new ModelBox(leftwing1planemembrane, 36, 36, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, true));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.4638F, -0.4369F, 2.215F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 38, 43, -0.1F, -0.25F, -0.75F, 9, 1, 2, 0.0F, true));

        this.leftwing2membrane = new AdvancedModelRenderer(this);
        this.leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
        this.leftwing2.addChild(leftwing2membrane);
        this.setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
        this.leftwing2membrane.cubeList.add(new ModelBox(leftwing2membrane, 25, 25, -0.1F, -0.25F, 1.25F, 9, 1, 5, 0.0F, true));

        this.leftwing2planemembrane = new AdvancedModelRenderer(this);
        this.leftwing2planemembrane.setRotationPoint(4.5F, -0.1F, 1.225F);
        this.leftwing2membrane.addChild(leftwing2planemembrane);
        this.setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
        this.leftwing2planemembrane.cubeList.add(new ModelBox(leftwing2planemembrane, 30, 11, -4.6F, 0.0F, 0.0F, 9, 0, 5, 0.0F, true));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.0151F, -0.5525F, 0.3F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 49, 27, 0.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, true));

        this.leftwing3membrane = new AdvancedModelRenderer(this);
        this.leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.leftwing3.addChild(leftwing3membrane);
        this.leftwing3membrane.cubeList.add(new ModelBox(leftwing3membrane, 36, 1, 0.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, true));

        this.leftwing3planemembrane = new AdvancedModelRenderer(this);
        this.leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
        this.leftwing3membrane.addChild(leftwing3planemembrane);
        this.setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        this.leftwing3planemembrane.cubeList.add(new ModelBox(leftwing3planemembrane, 15, 41, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, true));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, -2.9433F, -1.4943F, 2.923F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 30, 8, 0.0F, -0.15F, -0.45F, 12, 1, 1, 0.0F, true));

        this.leftwing4membrane = new AdvancedModelRenderer(this);
        this.leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwing4.addChild(leftwing4membrane);
        this.leftwing4membrane.cubeList.add(new ModelBox(leftwing4membrane, 0, 6, 0.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, true));

        this.leftwing4planemembrane = new AdvancedModelRenderer(this);
        this.leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
        this.leftwing4membrane.addChild(leftwing4planemembrane);
        this.setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        this.leftwing4planemembrane.cubeList.add(new ModelBox(leftwing4planemembrane, 36, 32, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
        this.leftwing4.addChild(lefthand);
        this.setRotateAngle(lefthand, -1.5534F, 0.0793F, -1.6385F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 67, 58, 0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, -0.8642F, -1.5423F, 0.962F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 46, 0.0F, -0.15F, -0.45F, 10, 1, 1, 0.0F, true));

        this.leftwing5membrane = new AdvancedModelRenderer(this);
        this.leftwing5membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwing5.addChild(leftwing5membrane);
        this.leftwing5membrane.cubeList.add(new ModelBox(leftwing5membrane, -1, 16, 0.0F, -0.15F, 0.5F, 10, 1, 5, 0.0F, true));

        this.leftwing6 = new AdvancedModelRenderer(this);
        this.leftwing6.setRotationPoint(10.0F, 0.0F, 0.0F);
        this.leftwing5.addChild(leftwing6);
        this.setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
        this.leftwing6.cubeList.add(new ModelBox(leftwing6, 0, 13, -0.1F, -0.15F, -0.45F, 16, 1, 1, 0.0F, true));

        this.leftwing6membrane = new AdvancedModelRenderer(this);
        this.leftwing6membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwing6.addChild(leftwing6membrane);
        this.leftwing6membrane.cubeList.add(new ModelBox(leftwing6membrane, -1, -1, -0.1F, -0.15F, 0.45F, 16, 1, 4, 0.0F, true));

        this.shoulder = new AdvancedModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -0.7412F, -5.8124F);
        this.chest.addChild(shoulder);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.7F, 0.6F);
        this.shoulder.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6589F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 35, -2.0F, -2.0F, -4.0F, 4, 4, 5, -0.1F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.975F, 0.125F);
        this.shoulder.addChild(neck);
        this.setRotateAngle(neck, 0.3447F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.425F, -4.275F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9032F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 10, -1.0F, 0.2429F, -1.5313F, 3, 4, 2, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.175F, -4.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 56, -1.0F, -2.2F, -0.2F, 3, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.05F, -3.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.425F, 5.3F, -9.4F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 69, -1.25F, 0.0527F, 3.8344F, 1, 1, 2, -0.1F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 69, -0.6F, 0.0527F, 3.8344F, 1, 1, 2, -0.1F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.425F, 5.3F, -9.4F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 63, -1.25F, -0.1973F, 0.0094F, 1, 1, 4, -0.1F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 9, 63, -0.6F, -0.1973F, 0.0094F, 1, 1, 4, -0.1F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.425F, 5.3F, -9.4F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 11, -1.25F, -0.1973F, -5.7906F, 1, 1, 6, -0.1F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 53, 11, -0.6F, -0.1973F, -5.7906F, 1, 1, 6, -0.1F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 19, -1.225F, -0.9473F, -6.0156F, 1, 1, 6, 0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 52, -0.625F, -0.9473F, -6.0156F, 1, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.075F, 1.85F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 60, -1.0F, -0.024F, -2.9976F, 3, 2, 3, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2F, 4.3F, -5.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3316F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 53, -1.0F, -0.9907F, -0.0415F, 1, 1, 3, 0.001F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 67, 17, -0.4F, -0.9907F, -0.0415F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2F, 5.1F, -8.4F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 23, -1.0F, -1.0129F, -1.0333F, 1, 1, 4, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 46, -0.4F, -1.0129F, -1.0333F, 1, 1, 4, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.2F, 1.1F, -4.9F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.4538F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 46, -1.0F, 0.048F, -4.9325F, 1, 2, 6, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 47, -0.4F, 0.048F, -4.9325F, 1, 2, 6, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 2.9F, -11.5F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.192F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 65, 36, 0.0F, -0.0193F, 0.0001F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 3.1F, -12.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2094F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 16, 0.0F, -0.0071F, 0.0198F, 1, 1, 1, -0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 3.7F, -13.1F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7679F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 49, 0.0F, -0.0219F, -0.1318F, 1, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 5.4F, -15.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6283F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 67, 64, 0.0F, 0.0135F, 0.0091F, 1, 1, 3, -0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 3.4F, -9.3F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.192F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 36, 0.0F, 0.0096F, -4.3696F, 1, 1, 5, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, -2.1F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3316F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 43, -1.0F, 0.0195F, -2.0132F, 2, 2, 3, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.1F, -3.2F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.6283F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 64, -1.0F, 0.0195F, -2.0132F, 2, 2, 3, 0.005F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.25F, -0.5F, -1.65F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 46, 0.9F, -0.1057F, 0.439F, 1, 1, 1, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 46, -1.4F, -0.1057F, 0.439F, 1, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.75F, 0.35F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6283F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 49, -1.0F, -2.8557F, -2.961F, 3, 4, 4, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.35F, 2.05F);
        this.head.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.05F, 0.8F, -2.125F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3316F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 69, -0.9F, -2.479F, -5.5044F, 1, 1, 2, -0.1F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 5, 69, -0.2F, -2.479F, -5.5044F, 1, 1, 2, -0.1F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 69, -0.95F, -1.754F, -5.2794F, 1, 1, 2, -0.1F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 69, 23, -0.15F, -1.754F, -5.2794F, 1, 1, 2, -0.1F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.05F, 2.15F, -3.6F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 60, 58, -0.9F, -3.0221F, -7.6398F, 1, 1, 4, -0.1F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 60, 58, -0.2F, -3.0221F, -7.6398F, 1, 1, 4, -0.1F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 26, -0.95F, -2.3221F, -7.3398F, 1, 1, 4, -0.1F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 62, -0.15F, -2.3221F, -7.3398F, 1, 1, 4, -0.1F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.05F, 2.15F, -6.875F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 47, -0.8F, -1.799F, -10.3562F, 1, 1, 6, -0.1F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 47, -0.1F, -1.799F, -10.3562F, 1, 1, 6, -0.1F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.5F, 1.0F, 0.975F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0349F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 60, -1.0F, -2.3594F, -4.7327F, 3, 2, 3, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.225F, -0.075F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3316F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 70, 6, -1.1F, -1.8732F, -6.056F, 1, 1, 2, -0.09F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 49, 68, -0.9F, -1.8732F, -6.056F, 2, 1, 2, -0.1F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.875F, -6.175F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2574F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 6, -0.9F, -2.3413F, -5.3505F, 1, 1, 1, -0.1F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 16, -0.1F, -2.3413F, -5.3505F, 1, 1, 1, -0.1F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 3.15F, -6.875F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 51, 55, -0.9F, -2.049F, -9.4562F, 1, 1, 5, -0.1F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 35, -0.9F, -2.049F, -10.2562F, 1, 1, 1, -0.1F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 57, 3, -0.1F, -2.049F, -9.4562F, 1, 1, 5, -0.1F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 14, 35, -0.1F, -2.049F, -10.2562F, 1, 1, 1, -0.1F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, 4.55F, -11.35F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4887F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 17, -1.0F, -2.9881F, -2.5329F, 1, 1, 2, -0.1F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 4.6F, -11.475F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3447F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 49, -1.0F, -2.6275F, -3.4138F, 1, 1, 1, -0.11F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 4.35F, -12.775F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2138F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 27, 70, -1.0F, -0.6058F, -4.3018F, 1, 1, 2, -0.1F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.25F, -0.1F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3316F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 63, 32, -1.5F, -1.8732F, -5.056F, 3, 1, 2, -0.1F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 0.5F, -4.1F);
        this.jaw.addChild(throat1);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.175F, 3.05F);
        this.throat1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.0821F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 66, -1.0F, 1.0529F, -3.1776F, 2, 2, 2, -0.1F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.6F, 0.25F);
        this.throat1.addChild(throat2);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.25F, 3.3F);
        this.throat2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3403F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 10, 55, -1.0F, -1.0777F, -3.7405F, 2, 2, 5, -0.15F, false));

        this.rightwing1 = new AdvancedModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4374F);
        this.chest.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.2875F, 0.6908F, 0.8886F);
        this.rightwing1.cubeList.add(new ModelBox(rightwing1, 41, 47, -7.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, false));

        this.rightwing1membrane = new AdvancedModelRenderer(this);
        this.rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
        this.rightwing1.addChild(rightwing1membrane);
        this.setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
        this.rightwing1membrane.cubeList.add(new ModelBox(rightwing1membrane, 25, 17, -3.75F, -0.25F, 0.0F, 8, 1, 6, 0.0F, false));

        this.rightwing1planemembrane = new AdvancedModelRenderer(this);
        this.rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 0.0F);
        this.rightwing1membrane.addChild(rightwing1planemembrane);
        this.setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        this.rightwing1planemembrane.cubeList.add(new ModelBox(rightwing1planemembrane, 36, 36, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, false));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.4638F, 0.4369F, -2.215F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 38, 43, -8.9F, -0.25F, -0.75F, 9, 1, 2, 0.0F, false));

        this.rightwing2membrane = new AdvancedModelRenderer(this);
        this.rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
        this.rightwing2.addChild(rightwing2membrane);
        this.setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
        this.rightwing2membrane.cubeList.add(new ModelBox(rightwing2membrane, 25, 25, -8.9F, -0.25F, 1.25F, 9, 1, 5, 0.0F, false));

        this.rightwing2planemembrane = new AdvancedModelRenderer(this);
        this.rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
        this.rightwing2membrane.addChild(rightwing2planemembrane);
        this.setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
        this.rightwing2planemembrane.cubeList.add(new ModelBox(rightwing2planemembrane, 30, 11, -4.4F, 0.0F, -5.0F, 9, 0, 5, 0.0F, false));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0151F, 0.5525F, -0.3F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 49, 27, -7.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, false));

        this.rightwing3membrane = new AdvancedModelRenderer(this);
        this.rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.rightwing3.addChild(rightwing3membrane);
        this.rightwing3membrane.cubeList.add(new ModelBox(rightwing3membrane, 36, 1, -7.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, false));

        this.rightwing3planemembrane = new AdvancedModelRenderer(this);
        this.rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
        this.rightwing3membrane.addChild(rightwing3planemembrane);
        this.setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        this.rightwing3planemembrane.cubeList.add(new ModelBox(rightwing3planemembrane, 15, 41, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, false));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, -2.9433F, 1.4943F, -2.923F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 30, 8, -12.0F, -0.15F, -0.45F, 12, 1, 1, 0.0F, false));

        this.rightwing4membrane = new AdvancedModelRenderer(this);
        this.rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwing4.addChild(rightwing4membrane);
        this.rightwing4membrane.cubeList.add(new ModelBox(rightwing4membrane, 0, 6, -12.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, false));

        this.rightwing4planemembrane = new AdvancedModelRenderer(this);
        this.rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
        this.rightwing4membrane.addChild(rightwing4planemembrane);
        this.setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        this.rightwing4planemembrane.cubeList.add(new ModelBox(rightwing4planemembrane, 36, 32, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
        this.rightwing4.addChild(righthand);
        this.setRotateAngle(righthand, -1.5534F, -0.0793F, 1.6385F);
        this.righthand.cubeList.add(new ModelBox(righthand, 67, 58, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, -0.8642F, 1.5423F, -0.962F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 0, 46, -10.0F, -0.15F, -0.45F, 10, 1, 1, 0.0F, false));

        this.rightwing5membrane = new AdvancedModelRenderer(this);
        this.rightwing5membrane.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.rightwing5.addChild(rightwing5membrane);
        this.rightwing5membrane.cubeList.add(new ModelBox(rightwing5membrane, -1, 16, -10.0F, -0.15F, 0.5F, 10, 1, 5, 0.0F, false));

        this.rightwing6 = new AdvancedModelRenderer(this);
        this.rightwing6.setRotationPoint(-10.0F, 0.0F, 0.0F);
        this.rightwing5.addChild(rightwing6);
        this.setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
        this.rightwing6.cubeList.add(new ModelBox(rightwing6, 0, 13, -15.9F, -0.15F, -0.45F, 16, 1, 1, 0.0F, false));

        this.rightwing6membrane = new AdvancedModelRenderer(this);
        this.rightwing6membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwing6.addChild(rightwing6membrane);
        this.rightwing6membrane.cubeList.add(new ModelBox(rightwing6membrane, -1, -1, -15.9F, -0.15F, 0.45F, 16, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.fossil.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.fossil.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.fossil.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.fossil.offsetY = -0.7F;
        this.fossil.offsetX = 0F;
        this.fossil.rotateAngleY = (float)Math.toRadians(125);
        this.fossil.rotateAngleX = (float)Math.toRadians(0);
        this.fossil.rotateAngleZ = (float)Math.toRadians(0);
        this.fossil.scaleChildren = true;
        float scaler = 1.5F;
        this.fossil.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.fossil.render(f);
        //Reset rotations, positions and sizing:
        this.fossil.setScale(1.0F, 1.0F, 1.0F);
        this.fossil.scaleChildren = false;
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

        AdvancedModelRenderer[] tailFull = {this.tail1};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            //this.faceTarget(f3, f4, 8, neck);
            //this.faceTarget(f3, f4, 4, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHaliskia ee = (EntityPrehistoricFloraHaliskia) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, 0.4538F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, -0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r17, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r18, 0.7679F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, 0.6283F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, 0.192F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r22, 0.6283F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r24, 0.6283F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r25, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r26, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r28, -0.0349F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r29, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, 0.2574F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r32, 0.4887F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r33, 0.3447F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r34, -0.2138F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r35, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r36, -1.0821F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r37, -0.3403F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.6589F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.9032F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.3316F, 0.0F, 0.0F);
            this.setRotateAngle(head, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(leftfoot, 1.1254F, 0.0804F, -0.024F);
            this.setRotateAngle(lefthand, 0.5806F, 0.825F, 0.3218F);
            this.setRotateAngle(leftleg1, 0.1323F, -0.1934F, -1.7129F);
            this.setRotateAngle(leftleg2, 1.0026F, -0.0258F, 0.0676F);
            this.setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing1, -0.1063F, 0.0897F, -0.1075F);
            this.setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
            this.setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing2, 0.0033F, 0.1483F, -0.0216F);
            this.setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
            this.setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
            this.setRotateAngle(leftwing3, -0.0018F, -0.0523F, 0.0786F);
            this.setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing4, -0.0222F, -0.3484F, 0.065F);
            this.setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing5, -0.0222F, -0.2171F, 0.1028F);
            this.setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
            this.setRotateAngle(rightfoot, 1.1254F, -0.0804F, 0.024F);
            this.setRotateAngle(righthand, 0.5806F, -0.825F, -0.3218F);
            this.setRotateAngle(rightleg1, 0.1323F, 0.1934F, 1.7129F);
            this.setRotateAngle(rightleg2, 1.0026F, 0.0258F, -0.0676F);
            this.setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing1, -0.1063F, -0.0897F, 0.1075F);
            this.setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
            this.setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing2, 0.0033F, -0.1483F, 0.0216F);
            this.setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
            this.setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
            this.setRotateAngle(rightwing3, -0.0018F, 0.0523F, -0.0786F);
            this.setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing4, -0.0222F, 0.3484F, -0.065F);
            this.setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing5, -0.0222F, 0.2171F, -0.1028F);
            this.setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
            this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) { //set wing membranes to their proper scale for flight
            this.rightwing1.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing2.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing3.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing4.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing5.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing6.setScale((float) 1, (float) 1, (float) 1);
            this.rightlegwing1.setScale((float) 1, (float) 1, (float) 1);
            this.rightlegwing2.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing1membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing2membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing3membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing4membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing5membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing6membrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing1planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing2planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing3planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.rightwing4planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing1.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing2.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing3.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing4.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing5.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing6.setScale((float) 1, (float) 1, (float) 1);
            this.leftlegwing1.setScale((float) 1, (float) 1, (float) 1);
            this.leftlegwing2.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing1membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing2membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing3membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing4membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing5membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing6membrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing1planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing2planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing3planemembrane.setScale((float) 1, (float) 1, (float) 1);
            this.leftwing4planemembrane.setScale((float) 1, (float) 1, (float) 1);

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
        EntityPrehistoricFloraHaliskia entity = (EntityPrehistoricFloraHaliskia) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -2.75 + (((tickAnim - 7) / 18) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(xx), shoulder.rotateAngleY + (float) Math.toRadians(yy), shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 7) / 18) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 7) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -13.25 + (((tickAnim - 7) / 2) * (-16.5-(-13.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -16.5 + (((tickAnim - 9) / 3) * (-13.25-(-16.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -13.25 + (((tickAnim - 12) / 2) * (-16.5-(-13.25)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -16.5 + (((tickAnim - 14) / 3) * (-13.25-(-16.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 17) / 8) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.5 + (((tickAnim - 7) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 12.5 + (((tickAnim - 12) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 7.75 + (((tickAnim - 7) / 2) * (16-(7.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 9) / 3) * (7.5-(16)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 7.5 + (((tickAnim - 12) / 2) * (14-(7.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 14 + (((tickAnim - 14) / 11) * (0-(14)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing5membrane.setScale((float)1,(float)1,(float)0);


        this.leftwing6membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing5membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing6membrane.setScale((float)1,(float)1,(float)0);


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHaliskia entity = (EntityPrehistoricFloraHaliskia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 14.75 + (((tickAnim - 8) / 7) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 15) / 5) * (0-(14.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.21493-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.514-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.9154-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.21493 + (((tickAnim - 8) / 7) * (-14.21493-(-14.21493)));
            yy = -11.514 + (((tickAnim - 8) / 7) * (-11.514-(-11.514)));
            zz = 0.9154 + (((tickAnim - 8) / 7) * (0.9154-(0.9154)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.21493 + (((tickAnim - 15) / 5) * (0-(-14.21493)));
            yy = -11.514 + (((tickAnim - 15) / 5) * (0-(-11.514)));
            zz = 0.9154 + (((tickAnim - 15) / 5) * (0-(0.9154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 17 + (((tickAnim - 8) / 12) * (0-(17)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(xx), shoulder.rotateAngleY + (float) Math.toRadians(yy), shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -23.75 + (((tickAnim - 8) / 4) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -23.75 + (((tickAnim - 12) / 4) * (-32-(-23.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -32 + (((tickAnim - 16) / 4) * (0-(-32)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21.75 + (((tickAnim - 8) / 4) * (28-(21.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 28 + (((tickAnim - 12) / 4) * (4.66-(28)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 4.66 + (((tickAnim - 16) / 4) * (0-(4.66)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 12 + (((tickAnim - 8) / 4) * (0-(12)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (13.25-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 16) / 4) * (0-(13.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-14.21493-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (11.51399-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.91543-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -14.21493 + (((tickAnim - 8) / 7) * (-14.21493-(-14.21493)));
            yy = 11.51399 + (((tickAnim - 8) / 7) * (11.51399-(11.51399)));
            zz = -0.91543 + (((tickAnim - 8) / 7) * (-0.91543-(-0.91543)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -14.21493 + (((tickAnim - 15) / 5) * (0-(-14.21493)));
            yy = 11.51399 + (((tickAnim - 15) / 5) * (0-(11.51399)));
            zz = -0.91543 + (((tickAnim - 15) / 5) * (0-(-0.91543)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing5membrane.setScale((float)1,(float)1,(float)0);


        this.leftwing6membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing5membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing6membrane.setScale((float)1,(float)1,(float)0);


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHaliskia entity = (EntityPrehistoricFloraHaliskia) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.25 + (((tickAnim - 0) / 13) * (23.5-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 23.5 + (((tickAnim - 13) / 10) * (-23.25-(23.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 23) / 7) * (-9.25-(-23.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6.5 + (((tickAnim - 0) / 13) * (-12.25-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -12.25 + (((tickAnim - 13) / 4) * (6.07-(-12.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 6.07 + (((tickAnim - 17) / 2) * (-8.68-(6.07)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -8.68 + (((tickAnim - 19) / 4) * (-4.5-(-8.68)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -4.5 + (((tickAnim - 23) / 7) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 13) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (1.1-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (-0.175-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.1 + (((tickAnim - 17) / 2) * (1.275-(1.1)));
            zz = -0.175 + (((tickAnim - 17) / 2) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 19) / 4) * (0-(1.275)));
            zz = -0.175 + (((tickAnim - 19) / 4) * (0-(-0.175)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.97558 + (((tickAnim - 0) / 13) * (-6-(18.97558)));
            yy = -2.34434 + (((tickAnim - 0) / 13) * (0-(-2.34434)));
            zz = -4.13761 + (((tickAnim - 0) / 13) * (0-(-4.13761)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -6 + (((tickAnim - 13) / 4) * (27.79366-(-6)));
            yy = 0 + (((tickAnim - 13) / 4) * (1.15771-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (3.23287-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 27.79366 + (((tickAnim - 17) / 2) * (36.79366-(27.79366)));
            yy = 1.15771 + (((tickAnim - 17) / 2) * (1.15771-(1.15771)));
            zz = 3.23287 + (((tickAnim - 17) / 2) * (3.23287-(3.23287)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 36.79366 + (((tickAnim - 19) / 3) * (58.37859-(36.79366)));
            yy = 1.15771 + (((tickAnim - 19) / 3) * (2.08388-(1.15771)));
            zz = 3.23287 + (((tickAnim - 19) / 3) * (5.81917-(3.23287)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 58.37859 + (((tickAnim - 22) / 1) * (28.23008-(58.37859)));
            yy = 2.08388 + (((tickAnim - 22) / 1) * (-1.35724-(2.08388)));
            zz = 5.81917 + (((tickAnim - 22) / 1) * (-5.60004-(5.81917)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 28.23008 + (((tickAnim - 23) / 7) * (18.97558-(28.23008)));
            yy = -1.35724 + (((tickAnim - 23) / 7) * (-2.34434-(-1.35724)));
            zz = -5.60004 + (((tickAnim - 23) / 7) * (-4.13761-(-5.60004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 13) * (0-(0.575)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (1.175-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 17) / 2) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 19) / 3) * (2.655-(1.175)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 2.655 + (((tickAnim - 22) / 1) * (0.475-(2.655)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.475 + (((tickAnim - 23) / 7) * (0.575-(0.475)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -19.58575 + (((tickAnim - 0) / 14) * (0-(-19.58575)));
            yy = 24.22819 + (((tickAnim - 0) / 14) * (0-(24.22819)));
            zz = 44.76409 + (((tickAnim - 0) / 14) * (0-(44.76409)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (-19.61982-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (27.54087-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (24.29413-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -19.61982 + (((tickAnim - 23) / 7) * (-19.58575-(-19.61982)));
            yy = 27.54087 + (((tickAnim - 23) / 7) * (24.22819-(27.54087)));
            zz = 24.29413 + (((tickAnim - 23) / 7) * (44.76409-(24.29413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -13.79375 + (((tickAnim - 0) / 14) * (0-(-13.79375)));
            yy = 18.3192 + (((tickAnim - 0) / 14) * (0-(18.3192)));
            zz = -28.7991 + (((tickAnim - 0) / 14) * (0-(-28.7991)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (2.57377-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (14.41748-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (-24.77689-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.57377 + (((tickAnim - 23) / 7) * (-13.79375-(2.57377)));
            yy = 14.41748 + (((tickAnim - 23) / 7) * (18.3192-(14.41748)));
            zz = -24.77689 + (((tickAnim - 23) / 7) * (-28.7991-(-24.77689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 1.24051 + (((tickAnim - 0) / 14) * (0-(1.24051)));
            yy = -19.06399 + (((tickAnim - 0) / 14) * (0-(-19.06399)));
            zz = -9.0438 + (((tickAnim - 0) / 14) * (0-(-9.0438)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (-19.78094-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (-17.25407-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (27.23133-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -19.78094 + (((tickAnim - 23) / 7) * (1.24051-(-19.78094)));
            yy = -17.25407 + (((tickAnim - 23) / 7) * (-19.06399-(-17.25407)));
            zz = 27.23133 + (((tickAnim - 23) / 7) * (-9.0438-(27.23133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.45-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0.45 + (((tickAnim - 23) / 7) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 23.5 + (((tickAnim - 0) / 10) * (-23.25-(23.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 10) / 20) * (23.5-(-23.25)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.25 + (((tickAnim - 0) / 3) * (6.07-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.07 + (((tickAnim - 3) / 3) * (-8.68-(6.07)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -8.68 + (((tickAnim - 6) / 4) * (-4.5-(-8.68)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -4.5 + (((tickAnim - 10) / 20) * (-12.25-(-4.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 3) * (1.275-(1.1)));
            zz = -0.175 + (((tickAnim - 3) / 3) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 6) / 4) * (0-(1.275)));
            zz = -0.175 + (((tickAnim - 6) / 4) * (0-(-0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
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
            xx = -6 + (((tickAnim - 0) / 3) * (27.79366-(-6)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.15771-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (3.23287-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 27.79366 + (((tickAnim - 3) / 3) * (36.79366-(27.79366)));
            yy = 1.15771 + (((tickAnim - 3) / 3) * (1.15771-(1.15771)));
            zz = 3.23287 + (((tickAnim - 3) / 3) * (3.23287-(3.23287)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 36.79366 + (((tickAnim - 6) / 2) * (58.37859-(36.79366)));
            yy = 1.15771 + (((tickAnim - 6) / 2) * (2.08388-(1.15771)));
            zz = 3.23287 + (((tickAnim - 6) / 2) * (5.81917-(3.23287)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 58.37859 + (((tickAnim - 8) / 2) * (27.93521-(58.37859)));
            yy = 2.08388 + (((tickAnim - 8) / 2) * (2.70132-(2.08388)));
            zz = 5.81917 + (((tickAnim - 8) / 2) * (7.54337-(5.81917)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 27.93521 + (((tickAnim - 10) / 20) * (-6-(27.93521)));
            yy = 2.70132 + (((tickAnim - 10) / 20) * (0-(2.70132)));
            zz = 7.54337 + (((tickAnim - 10) / 20) * (0-(7.54337)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 3) / 3) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 6) / 2) * (2.655-(1.175)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 2.655 + (((tickAnim - 8) / 2) * (0.475-(2.655)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = 0.475 + (((tickAnim - 10) / 12) * (0.535-(0.475)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0.535 + (((tickAnim - 22) / 8) * (0-(0.535)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (50.5-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 50.5 + (((tickAnim - 23) / 7) * (0-(50.5)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (11.25-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 11.25 + (((tickAnim - 23) / 7) * (0-(11.25)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (6.75-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 6.75 + (((tickAnim - 23) / 7) * (0-(6.75)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing6, leftwing6.rotateAngleX + (float) Math.toRadians(xx), leftwing6.rotateAngleY + (float) Math.toRadians(yy), leftwing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+30))*2.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.375))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25+170))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.5-20))*2.5));


        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-20))*1), shoulder.rotateAngleY + (float) Math.toRadians(0), shoulder.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-60))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.25-60))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-19.61982-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-27.5409-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-24.2941-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -19.61982 + (((tickAnim - 9) / 7) * (-19.58575-(-19.61982)));
            yy = -27.5409 + (((tickAnim - 9) / 7) * (-24.2282-(-27.5409)));
            zz = -24.2941 + (((tickAnim - 9) / 7) * (-44.7641-(-24.2941)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -19.58575 + (((tickAnim - 16) / 14) * (0-(-19.58575)));
            yy = -24.2282 + (((tickAnim - 16) / 14) * (0-(-24.2282)));
            zz = -44.7641 + (((tickAnim - 16) / 14) * (0-(-44.7641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (2.57377-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-14.4175-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (24.7769-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 2.57377 + (((tickAnim - 9) / 7) * (-13.79375-(2.57377)));
            yy = -14.4175 + (((tickAnim - 9) / 7) * (-18.3192-(-14.4175)));
            zz = 24.7769 + (((tickAnim - 9) / 7) * (28.7991-(24.7769)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = -13.79375 + (((tickAnim - 16) / 14) * (0-(-13.79375)));
            yy = -18.3192 + (((tickAnim - 16) / 14) * (0-(-18.3192)));
            zz = 28.7991 + (((tickAnim - 16) / 14) * (0-(28.7991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-19.78094-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (17.2541-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-27.2313-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -19.78094 + (((tickAnim - 9) / 7) * (1.24051-(-19.78094)));
            yy = 17.2541 + (((tickAnim - 9) / 7) * (19.064-(17.2541)));
            zz = -27.2313 + (((tickAnim - 9) / 7) * (9.0438-(-27.2313)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 1.24051 + (((tickAnim - 16) / 14) * (0-(1.24051)));
            yy = 19.064 + (((tickAnim - 16) / 14) * (0-(19.064)));
            zz = 9.0438 + (((tickAnim - 16) / 14) * (0-(9.0438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.45-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0.45 + (((tickAnim - 9) / 7) * (0-(0.45)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-50.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -50.5 + (((tickAnim - 9) / 7) * (0-(-50.5)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -11.25 + (((tickAnim - 9) / 7) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = -6.75 + (((tickAnim - 9) / 7) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing6, rightwing6.rotateAngleX + (float) Math.toRadians(xx), rightwing6.rotateAngleY + (float) Math.toRadians(yy), rightwing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing5membrane.setScale((float)1,(float)1,(float)0);


        this.leftwing6membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing5membrane.setScale((float)1,(float)1,(float)0);


        this.rightwing6membrane.setScale((float)1,(float)1,(float)0);

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHaliskia entity = (EntityPrehistoricFloraHaliskia) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*2 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*2)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 0) / 18) * (0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*3 + (((tickAnim - 18) / 10) * (-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6-(0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*3)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            zz = -1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6 + (((tickAnim - 28) / 13) * (-3.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6-(-1.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6)));
        }
        else if (tickAnim >= 41 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 29) * (0-(0)));
            zz = -3.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6 + (((tickAnim - 41) / 29) * (-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+90))*6-(-3.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+40))*6)));
        }
        else if (tickAnim >= 70 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            zz = -8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+90))*6 + (((tickAnim - 70) / 51) * (0.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-1-(-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90+90))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 41) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 15) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 56) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 14) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 41) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 41) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 15) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 56) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 14) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*2-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*2 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*2)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-20 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing1.rotationPointX = this.rightwing1.rotationPointX + (float)(xx);
        this.rightwing1.rotationPointY = this.rightwing1.rotationPointY - (float)(yy);
        this.rightwing1.rotationPointZ = this.rightwing1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*20 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*10-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*10 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*10)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*15-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*15 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*15)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*20 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*25 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*25)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing6, rightwing6.rotateAngleX + (float) Math.toRadians(xx), rightwing6.rotateAngleY + (float) Math.toRadians(yy), rightwing6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*20 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing1.rotationPointX = this.leftwing1.rotationPointX + (float)(xx);
        this.leftwing1.rotationPointY = this.leftwing1.rotationPointY - (float)(yy);
        this.leftwing1.rotationPointZ = this.leftwing1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-20 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-10-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-10 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-10)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 62) / 59) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-15-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-15 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-15)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-20 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-20)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*-25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*-25 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*-25)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing6, leftwing6.rotateAngleX + (float) Math.toRadians(xx), leftwing6.rotateAngleY + (float) Math.toRadians(yy), leftwing6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2 + (((tickAnim - 40) / 22) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 62) / 59) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(xx), shoulder.rotateAngleY + (float) Math.toRadians(yy), shoulder.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -13 + (((tickAnim - 0) / 17) * (-13-(-13)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -13 + (((tickAnim - 17) / 23) * (-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2-(-13)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = -13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2 + (((tickAnim - 40) / 22) * (-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2-(-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-2)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = -13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2 + (((tickAnim - 62) / 59) * (-13-(-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 5.25 + (((tickAnim - 0) / 17) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 5.25 + (((tickAnim - 17) / 23) * (5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*2-(5.25)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*2 + (((tickAnim - 40) / 22) * (5.25-(5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*2)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 5.25 + (((tickAnim - 62) / 59) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-5 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-5)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-0.5-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*5 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*5)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-0.5-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 6.5 + (((tickAnim - 0) / 17) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 17) / 23) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 6.5 + (((tickAnim - 40) / 22) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 6.5 + (((tickAnim - 62) / 59) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 62) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.rotate(chest, ((0.0F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r12, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((0.4538F)-(0.4538F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((-0.192F)-(-0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r17, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r18, ((0.7679F)-(0.7679F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.6283F)-(0.6283F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.192F)-(0.192F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.6283F)-(0.6283F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((0.6283F)-(0.6283F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r25, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r26, ((0.2618F)-(0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r28, ((-0.0349F)-(-0.0349F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r29, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((0.2574F)-(0.2574F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r32, ((0.4887F)-(0.4887F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r33, ((0.3447F)-(0.3447F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r34, ((-0.2138F)-(-0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r35, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r36, ((-1.0821F)-(-1.0821F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r37, ((-0.3403F)-(-0.3403F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.6589F)-(0.6589F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.9032F)-(0.9032F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.672F)-(-0.672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.3316F)-(0.3316F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((0.0F)-(-0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((1.1254F)-(-0.7884F)), ((0.0804F)-(0.0341F)),((-0.024F)-(-0.0703F)));
        animator.rotate(lefthand, ((0.5806F)-(-1.5534F)), ((0.825F)-(0.0793F)),((0.3218F)-(-1.6385F)));
        animator.rotate(leftleg1, ((0.1323F)-(-0.1617F)), ((-0.1934F)-(-0.3296F)),((-1.7129F)-(-0.375F)));
        animator.rotate(leftleg2, ((1.0026F)-(1.2309F)), ((-0.0258F)-(0.0429F)),((0.0676F)-(0.3343F)));
        animator.rotate(leftlegwing1, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftlegwing2, ((0.1367F)-(0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing1, ((-0.1063F)-(-0.2875F)), ((0.0897F)-(-0.6908F)),((-0.1075F)-(-0.8886F)));
        animator.rotate(leftwing1membrane, ((-0.0884F)-(-0.0884F)), ((0.1959F)-(0.1959F)),((-0.0936F)-(-0.0936F)));
        animator.rotate(leftwing1planemembrane, ((-0.0393F)-(-0.0393F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing2, ((0.0033F)-(0.4638F)), ((0.1483F)-(-0.4369F)),((-0.0216F)-(2.215F)));
        animator.rotate(leftwing2membrane, ((-0.0218F)-(-0.0218F)), ((0.0742F)-(0.0742F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing2planemembrane, ((-0.1658F)-(-0.1658F)), ((-0.0016F)-(-0.0016F)),((-0.013F)-(-0.013F)));
        animator.rotate(leftwing3, ((-0.0018F)-(-0.0151F)), ((-0.0523F)-(-0.5525F)),((0.0786F)-(0.3F)));
        animator.rotate(leftwing3planemembrane, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing4, ((-0.0222F)-(-2.9433F)), ((-0.3484F)-(-1.4943F)),((0.065F)-(2.923F)));
        animator.rotate(leftwing4planemembrane, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing5, ((-0.0222F)-(-0.8642F)), ((-0.2171F)-(-1.5423F)),((0.1028F)-(0.962F)));
        animator.rotate(leftwing6, ((-0.0193F)-(-0.0193F)), ((-0.1997F)-(-0.1997F)),((0.1113F)-(0.1113F)));
        animator.rotate(neck, ((0.0F)-(0.3447F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((1.1254F)-(-0.7884F)), ((-0.0804F)-(-0.0341F)),((0.024F)-(0.0703F)));
        animator.rotate(righthand, ((0.5806F)-(-1.5534F)), ((-0.825F)-(-0.0793F)),((-0.3218F)-(1.6385F)));
        animator.rotate(rightleg1, ((0.1323F)-(-0.1617F)), ((0.1934F)-(0.3296F)),((1.7129F)-(0.375F)));
        animator.rotate(rightleg2, ((1.0026F)-(1.2309F)), ((0.0258F)-(-0.0429F)),((-0.0676F)-(-0.3343F)));
        animator.rotate(rightlegwing1, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightlegwing2, ((0.1367F)-(0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing1, ((-0.1063F)-(-0.2875F)), ((-0.0897F)-(0.6908F)),((0.1075F)-(0.8886F)));
        animator.rotate(rightwing1membrane, ((-0.0884F)-(-0.0884F)), ((-0.1959F)-(-0.1959F)),((0.0936F)-(0.0936F)));
        animator.rotate(rightwing1planemembrane, ((-0.0393F)-(-0.0393F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing2, ((0.0033F)-(0.4638F)), ((-0.1483F)-(0.4369F)),((0.0216F)-(-2.215F)));
        animator.rotate(rightwing2membrane, ((-0.0218F)-(-0.0218F)), ((-0.0742F)-(-0.0742F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing2planemembrane, ((-0.1658F)-(-0.1658F)), ((0.0016F)-(0.0016F)),((0.013F)-(0.013F)));
        animator.rotate(rightwing3, ((-0.0018F)-(-0.0151F)), ((0.0523F)-(0.5525F)),((-0.0786F)-(-0.3F)));
        animator.rotate(rightwing3planemembrane, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing4, ((-0.0222F)-(-2.9433F)), ((0.3484F)-(1.4943F)),((-0.065F)-(-2.923F)));
        animator.rotate(rightwing4planemembrane, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing5, ((-0.0222F)-(-0.8642F)), ((0.2171F)-(1.5423F)),((-0.1028F)-(-0.962F)));
        animator.rotate(rightwing6, ((-0.0193F)-(-0.0193F)), ((0.1997F)-(0.1997F)),((-0.1113F)-(-0.1113F)));
        animator.rotate(tail, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(chest, -((0.0F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r12, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((0.4538F)-(0.4538F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((-0.192F)-(-0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r17, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r18, -((0.7679F)-(0.7679F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.6283F)-(0.6283F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.192F)-(0.192F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.6283F)-(0.6283F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((0.6283F)-(0.6283F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r25, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r26, -((0.2618F)-(0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r28, -((-0.0349F)-(-0.0349F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r29, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((0.2574F)-(0.2574F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r32, -((0.4887F)-(0.4887F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r33, -((0.3447F)-(0.3447F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r34, -((-0.2138F)-(-0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r35, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r36, -((-1.0821F)-(-1.0821F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r37, -((-0.3403F)-(-0.3403F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.6589F)-(0.6589F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.9032F)-(0.9032F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.672F)-(-0.672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.3316F)-(0.3316F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((0.0F)-(-0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((1.1254F)-(-0.7884F)), -((0.0804F)-(0.0341F)),-((-0.024F)-(-0.0703F)));
        animator.rotate(lefthand, -((0.5806F)-(-1.5534F)), -((0.825F)-(0.0793F)),-((0.3218F)-(-1.6385F)));
        animator.rotate(leftleg1, -((0.1323F)-(-0.1617F)), -((-0.1934F)-(-0.3296F)),-((-1.7129F)-(-0.375F)));
        animator.rotate(leftleg2, -((1.0026F)-(1.2309F)), -((-0.0258F)-(0.0429F)),-((0.0676F)-(0.3343F)));
        animator.rotate(leftlegwing1, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftlegwing2, -((0.1367F)-(0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing1, -((-0.1063F)-(-0.2875F)), -((0.0897F)-(-0.6908F)),-((-0.1075F)-(-0.8886F)));
        animator.rotate(leftwing1membrane, -((-0.0884F)-(-0.0884F)), -((0.1959F)-(0.1959F)),-((-0.0936F)-(-0.0936F)));
        animator.rotate(leftwing1planemembrane, -((-0.0393F)-(-0.0393F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing2, -((0.0033F)-(0.4638F)), -((0.1483F)-(-0.4369F)),-((-0.0216F)-(2.215F)));
        animator.rotate(leftwing2membrane, -((-0.0218F)-(-0.0218F)), -((0.0742F)-(0.0742F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing2planemembrane, -((-0.1658F)-(-0.1658F)), -((-0.0016F)-(-0.0016F)),-((-0.013F)-(-0.013F)));
        animator.rotate(leftwing3, -((-0.0018F)-(-0.0151F)), -((-0.0523F)-(-0.5525F)),-((0.0786F)-(0.3F)));
        animator.rotate(leftwing3planemembrane, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing4, -((-0.0222F)-(-2.9433F)), -((-0.3484F)-(-1.4943F)),-((0.065F)-(2.923F)));
        animator.rotate(leftwing4planemembrane, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing5, -((-0.0222F)-(-0.8642F)), -((-0.2171F)-(-1.5423F)),-((0.1028F)-(0.962F)));
        animator.rotate(leftwing6, -((-0.0193F)-(-0.0193F)), -((-0.1997F)-(-0.1997F)),-((0.1113F)-(0.1113F)));
        animator.rotate(neck, -((0.0F)-(0.3447F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((1.1254F)-(-0.7884F)), -((-0.0804F)-(-0.0341F)),-((0.024F)-(0.0703F)));
        animator.rotate(righthand, -((0.5806F)-(-1.5534F)), -((-0.825F)-(-0.0793F)),-((-0.3218F)-(1.6385F)));
        animator.rotate(rightleg1, -((0.1323F)-(-0.1617F)), -((0.1934F)-(0.3296F)),-((1.7129F)-(0.375F)));
        animator.rotate(rightleg2, -((1.0026F)-(1.2309F)), -((0.0258F)-(-0.0429F)),-((-0.0676F)-(-0.3343F)));
        animator.rotate(rightlegwing1, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightlegwing2, -((0.1367F)-(0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing1, -((-0.1063F)-(-0.2875F)), -((-0.0897F)-(0.6908F)),-((0.1075F)-(0.8886F)));
        animator.rotate(rightwing1membrane, -((-0.0884F)-(-0.0884F)), -((-0.1959F)-(-0.1959F)),-((0.0936F)-(0.0936F)));
        animator.rotate(rightwing1planemembrane, -((-0.0393F)-(-0.0393F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing2, -((0.0033F)-(0.4638F)), -((-0.1483F)-(0.4369F)),-((0.0216F)-(-2.215F)));
        animator.rotate(rightwing2membrane, -((-0.0218F)-(-0.0218F)), -((-0.0742F)-(-0.0742F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing2planemembrane, -((-0.1658F)-(-0.1658F)), -((0.0016F)-(0.0016F)),-((0.013F)-(0.013F)));
        animator.rotate(rightwing3, -((-0.0018F)-(-0.0151F)), -((0.0523F)-(0.5525F)),-((-0.0786F)-(-0.3F)));
        animator.rotate(rightwing3planemembrane, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing4, -((-0.0222F)-(-2.9433F)), -((0.3484F)-(1.4943F)),-((-0.065F)-(-2.923F)));
        animator.rotate(rightwing4planemembrane, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing5, -((-0.0222F)-(-0.8642F)), -((0.2171F)-(1.5423F)),-((-0.1028F)-(-0.962F)));
        animator.rotate(rightwing6, -((-0.0193F)-(-0.0193F)), -((0.1997F)-(0.1997F)),-((-0.1113F)-(-0.1113F)));
        animator.rotate(tail, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
