package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraUktenadactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelUktenadactylus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftlegwing1;
    private final AdvancedModelRenderer leftlegwing2;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightlegwing1;
    private final AdvancedModelRenderer rightlegwing2;
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer throat;

    private ModelAnimator animator;

    public ModelUktenadactylus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.0F, -6.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -3.825F, 7.075F);
        this.main.addChild(hips);
        this.setRotateAngle(hips, -0.2138F, 0.0F, 0.0F);


        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 29, -1.0F, 0.3439F, -4.5009F, 3, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 3, -1.0F, -0.6561F, -4.5009F, 3, 2, 2, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
        this.tail.addChild(tail1);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.2F, 4.25F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 69, -1.0F, -0.1564F, -4.6539F, 1, 1, 3, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.1617F, -0.3296F, -0.375F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 35, 65, -1.2166F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.2309F, 0.0429F, 0.3343F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 44, 65, -0.3433F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.7884F, 0.0341F, -0.0703F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 40, 59, -0.9797F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, false));

        this.leftlegwing1 = new AdvancedModelRenderer(this);
        this.leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
        this.leftleg2.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
        this.leftlegwing1.cubeList.add(new ModelBox(leftlegwing1, 51, 69, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, false));

        this.leftlegwing2 = new AdvancedModelRenderer(this);
        this.leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
        this.leftleg1.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 69, 21, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.1617F, 0.3296F, 0.375F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 35, 65, -0.7834F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.2309F, -0.0429F, -0.3343F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 44, 65, -0.6567F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.7884F, -0.0341F, 0.0703F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 40, 59, -1.0204F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, true));

        this.rightlegwing1 = new AdvancedModelRenderer(this);
        this.rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
        this.rightleg2.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
        this.rightlegwing1.cubeList.add(new ModelBox(rightlegwing1, 51, 69, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, true));

        this.rightlegwing2 = new AdvancedModelRenderer(this);
        this.rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
        this.rightleg1.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 69, 21, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.4588F, 1.2125F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.2618F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -0.8912F, -5.3625F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -2.0F, -2.0F, -1.0F, 5, 2, 6, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.6088F, -6.2125F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, -2.0F, -4.0F, -1.0F, 5, 4, 7, 0.0F, false));

        this.leftwing1 = new AdvancedModelRenderer(this);
        this.leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4375F);
        this.body.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.2875F, -0.6908F, -0.8886F);
        this.leftwing1.cubeList.add(new ModelBox(leftwing1, 40, 51, 0.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, false));

        this.leftwing1membrane = new AdvancedModelRenderer(this);
        this.leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
        this.leftwing1.addChild(leftwing1membrane);
        this.setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
        this.leftwing1membrane.cubeList.add(new ModelBox(leftwing1membrane, 25, 22, -4.25F, -0.25F, 0.0F, 8, 1, 6, 0.0F, false));

        this.leftwing1planemembrane = new AdvancedModelRenderer(this);
        this.leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 6.0F);
        this.leftwing1membrane.addChild(leftwing1planemembrane);
        this.setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        this.leftwing1planemembrane.cubeList.add(new ModelBox(leftwing1planemembrane, 0, 43, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.4638F, -0.4369F, 2.215F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 50, 37, -0.1F, -0.25F, -0.75F, 9, 1, 2, 0.0F, false));

        this.leftwing2membrane = new AdvancedModelRenderer(this);
        this.leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
        this.leftwing2.addChild(leftwing2membrane);
        this.setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
        this.leftwing2membrane.cubeList.add(new ModelBox(leftwing2membrane, 25, 30, -0.1F, -0.25F, 1.25F, 9, 1, 5, 0.0F, false));

        this.leftwing2planemembrane = new AdvancedModelRenderer(this);
        this.leftwing2planemembrane.setRotationPoint(4.5F, 0.4F, 6.225F);
        this.leftwing2membrane.addChild(leftwing2planemembrane);
        this.setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
        this.leftwing2planemembrane.cubeList.add(new ModelBox(leftwing2planemembrane, 31, 16, -4.6F, 0.0F, 0.0F, 9, 0, 5, 0.0F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.0151F, -0.5525F, 0.3F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 40, 56, 0.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, false));

        this.leftwing3membrane = new AdvancedModelRenderer(this);
        this.leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.leftwing3.addChild(leftwing3membrane);
        this.leftwing3membrane.cubeList.add(new ModelBox(leftwing3membrane, 35, 9, 0.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, false));

        this.leftwing3planemembrane = new AdvancedModelRenderer(this);
        this.leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
        this.leftwing3membrane.addChild(leftwing3planemembrane);
        this.setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        this.leftwing3planemembrane.cubeList.add(new ModelBox(leftwing3planemembrane, 0, 50, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, -2.9433F, -1.4943F, 2.923F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 41, 0, 0.0F, -0.15F, -0.45F, 12, 1, 1, 0.001F, false));

        this.leftwing4membrane = new AdvancedModelRenderer(this);
        this.leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwing4.addChild(leftwing4membrane);
        this.leftwing4membrane.cubeList.add(new ModelBox(leftwing4membrane, 0, 9, 0.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, false));

        this.leftwing4planemembrane = new AdvancedModelRenderer(this);
        this.leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
        this.leftwing4membrane.addChild(leftwing4planemembrane);
        this.setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        this.leftwing4planemembrane.cubeList.add(new ModelBox(leftwing4planemembrane, 23, 37, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
        this.leftwing4.addChild(lefthand);
        this.setRotateAngle(lefthand, -1.5534F, 0.0793F, -1.6385F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 69, 33, 0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, -0.0782F, -1.2897F, 0.1732F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 39, 5, 0.0F, -0.15F, -0.45F, 11, 1, 2, 0.001F, false));

        this.leftwing5membrane = new AdvancedModelRenderer(this);
        this.leftwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.leftwing5.addChild(leftwing5membrane);
        this.leftwing5membrane.cubeList.add(new ModelBox(leftwing5membrane, 0, 16, 0.0F, -0.15F, 0.05F, 11, 1, 4, 0.0F, false));

        this.leftwing6 = new AdvancedModelRenderer(this);
        this.leftwing6.setRotationPoint(11.0935F, 0.1091F, -0.4648F);
        this.leftwing5.addChild(leftwing6);
        this.setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
        this.leftwing6.cubeList.add(new ModelBox(leftwing6, 0, 5, -0.1F, -0.15F, 0.05F, 17, 1, 2, 0.0F, false));

        this.leftwing6membrane = new AdvancedModelRenderer(this);
        this.leftwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftwing6.addChild(leftwing6membrane);
        this.leftwing6membrane.cubeList.add(new ModelBox(leftwing6membrane, 0, 0, -0.1F, -0.15F, 0.05F, 17, 1, 3, 0.0F, false));

        this.rightwing1 = new AdvancedModelRenderer(this);
        this.rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4375F);
        this.body.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.2875F, 0.6908F, 0.8886F);
        this.rightwing1.cubeList.add(new ModelBox(rightwing1, 40, 51, -7.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, true));

        this.rightwing1membrane = new AdvancedModelRenderer(this);
        this.rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
        this.rightwing1.addChild(rightwing1membrane);
        this.setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
        this.rightwing1membrane.cubeList.add(new ModelBox(rightwing1membrane, 25, 22, -3.75F, -0.25F, 0.0F, 8, 1, 6, 0.0F, true));

        this.rightwing1planemembrane = new AdvancedModelRenderer(this);
        this.rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 6.0F);
        this.rightwing1membrane.addChild(rightwing1planemembrane);
        this.setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        this.rightwing1planemembrane.cubeList.add(new ModelBox(rightwing1planemembrane, 0, 43, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.4638F, 0.4369F, -2.215F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 50, 37, -8.9F, -0.25F, -0.75F, 9, 1, 2, 0.0F, true));

        this.rightwing2membrane = new AdvancedModelRenderer(this);
        this.rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
        this.rightwing2.addChild(rightwing2membrane);
        this.setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
        this.rightwing2membrane.cubeList.add(new ModelBox(rightwing2membrane, 25, 30, -8.9F, -0.25F, 1.25F, 9, 1, 5, 0.0F, true));

        this.rightwing2planemembrane = new AdvancedModelRenderer(this);
        this.rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
        this.rightwing2membrane.addChild(rightwing2planemembrane);
        this.setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
        this.rightwing2planemembrane.cubeList.add(new ModelBox(rightwing2planemembrane, 31, 16, -4.4F, 0.0F, 0.0F, 9, 0, 5, 0.0F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.0151F, 0.5525F, -0.3F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 40, 56, -7.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, true));

        this.rightwing3membrane = new AdvancedModelRenderer(this);
        this.rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        this.rightwing3.addChild(rightwing3membrane);
        this.rightwing3membrane.cubeList.add(new ModelBox(rightwing3membrane, 35, 9, -7.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, true));

        this.rightwing3planemembrane = new AdvancedModelRenderer(this);
        this.rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
        this.rightwing3membrane.addChild(rightwing3planemembrane);
        this.setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        this.rightwing3planemembrane.cubeList.add(new ModelBox(rightwing3planemembrane, 0, 50, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, -2.9433F, 1.4943F, -2.923F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 41, 0, -12.0F, -0.15F, -0.45F, 12, 1, 1, 0.001F, true));

        this.rightwing4membrane = new AdvancedModelRenderer(this);
        this.rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwing4.addChild(rightwing4membrane);
        this.rightwing4membrane.cubeList.add(new ModelBox(rightwing4membrane, 0, 9, -12.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, true));

        this.rightwing4planemembrane = new AdvancedModelRenderer(this);
        this.rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
        this.rightwing4membrane.addChild(rightwing4planemembrane);
        this.setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        this.rightwing4planemembrane.cubeList.add(new ModelBox(rightwing4planemembrane, 23, 37, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
        this.rightwing4.addChild(righthand);
        this.setRotateAngle(righthand, -1.5534F, -0.0793F, 1.6385F);
        this.righthand.cubeList.add(new ModelBox(righthand, 69, 33, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, -0.0782F, 1.2897F, -0.1732F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 39, 5, -11.0F, -0.15F, -0.45F, 11, 1, 2, 0.001F, true));

        this.rightwing5membrane = new AdvancedModelRenderer(this);
        this.rightwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.rightwing5.addChild(rightwing5membrane);
        this.rightwing5membrane.cubeList.add(new ModelBox(rightwing5membrane, 0, 16, -11.0F, -0.15F, 0.05F, 11, 1, 4, 0.0F, true));

        this.rightwing6 = new AdvancedModelRenderer(this);
        this.rightwing6.setRotationPoint(-11.0935F, 0.1091F, -0.4648F);
        this.rightwing5.addChild(rightwing6);
        this.setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
        this.rightwing6.cubeList.add(new ModelBox(rightwing6, 0, 5, -16.9F, -0.15F, 0.05F, 17, 1, 2, 0.0F, true));

        this.rightwing6membrane = new AdvancedModelRenderer(this);
        this.rightwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightwing6.addChild(rightwing6membrane);
        this.rightwing6membrane.cubeList.add(new ModelBox(rightwing6membrane, 0, 0, -16.9F, -0.15F, 0.05F, 17, 1, 3, 0.0F, true));

        this.shoulder = new AdvancedModelRenderer(this);
        this.shoulder.setRotationPoint(0.0F, -0.7412F, -5.8125F);
        this.body.addChild(shoulder);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.7F, 0.6F);
        this.shoulder.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6589F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 41, -2.0F, -2.0F, -4.0F, 4, 4, 5, -0.1F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.975F, 0.125F);
        this.shoulder.addChild(neck);
        this.setRotateAngle(neck, 0.0829F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.425F, -4.275F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9032F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 55, -1.0F, -2.8322F, -1.4813F, 3, 7, 2, -0.002F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -1.175F, -4.2F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 41, -1.0F, -2.2F, -2.2F, 3, 3, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -2.6777F, -5.3142F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 24, 60, -1.0F, -2.5F, -0.5F, 3, 4, 2, 0.005F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 60, -0.5F, -0.8F, -8.125F, 2, 1, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 66, -1.0F, -0.8F, -4.125F, 3, 1, 2, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 55, -1.0F, -0.8F, -2.125F, 3, 2, 2, 0.004F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.8054F, -4.4392F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 15, -0.5F, 0.025F, -3.75F, 2, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -2.5F, -0.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1789F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 60, -2.75F, 0.5F, -1.7F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 68, 0, -0.25F, 0.5F, -1.7F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 30, -2.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, -0.753F, -14.6153F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5888F, 0.1733F, 0.2528F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 71, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.15F, -0.9206F, -13.4186F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2559F, 0.056F, 0.211F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 53, 59, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.105F, -11.6117F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0865F, 0.0114F, 0.1304F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 61, 48, 0.0F, -0.75F, -1.5F, 0, 1, 5, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.45F, 0.05F, -5.625F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 70, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.75F, -0.753F, -14.6153F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5888F, -0.1733F, -0.2528F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 71, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.85F, -0.9206F, -13.4186F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2559F, -0.056F, -0.211F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 59, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -0.105F, -11.6117F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0865F, -0.0114F, -0.1304F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 48, 0.0F, -0.75F, -1.5F, 0, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -2.6091F, -11.1963F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 64, 63, -0.5F, 0.0F, 0.0F, 1, 1, 4, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -1.4063F, -15.0112F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 63, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.2F, -8.125F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 65, -0.5F, -1.75F, -5.0F, 1, 1, 4, -0.006F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 51, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.45F, 0.05F, -5.625F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 70, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.2F, -2.125F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 9, -0.5F, 0.0F, -6.0F, 2, 1, 4, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 67, -1.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 69, -0.5F, -1.5F, -1.75F, 2, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.3674F, -0.4766F, -11.9036F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.242F, -0.1453F, -0.5277F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 7, 71, -0.225F, -1.5F, -0.625F, 0, 2, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.2577F, -8.9014F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0843F, -0.0226F, -0.2608F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 61, 41, 0.0F, -0.25F, -3.0F, 0, 1, 5, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.45F, 0.2F, -4.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.3491F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 55, 0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.6325F, -0.4766F, -11.9036F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.242F, 0.1453F, 0.5277F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 71, 0.225F, -1.5F, -0.625F, 0, 2, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.4771F, -11.9772F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.3927F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 35, 60, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, -0.2577F, -8.9014F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0843F, 0.0226F, 0.2608F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 61, 41, 0.0F, -0.25F, -3.0F, 0, 1, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 1.4006F, -10.2031F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 71, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.4771F, -11.9772F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.48F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 71, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.006F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 22, -0.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.45F, 0.2F, -4.5F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.3491F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 55, -0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.7199F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 57, 56, -0.5F, -2.0F, 0.0F, 2, 2, 4, -0.003F, false));

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
        this.main.offsetY = 0.0F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.7F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, -0.1F);
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

        AdvancedModelRenderer[] tailFull = {this.tail1};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 12, neck);
            this.faceTarget(f3, f4, 8, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 14, neck);
            this.faceTarget(f3, f4, 10, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraUktenadactylus ee = (EntityPrehistoricFloraUktenadactylus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.leftwing5membrane.setScale((float)1,(float)1,(float)1);
            this.leftwing6membrane.setScale((float)1,(float)1,(float)1);
            this.rightwing5membrane.setScale((float)1,(float)1,(float)1);
            this.rightwing6membrane.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r10, 0.1789F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, -0.0865F, 0.0114F, 0.1304F);
            this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
            this.setRotateAngle(cube_r13, -0.2559F, 0.056F, 0.211F);
            this.setRotateAngle(cube_r14, -0.5888F, 0.1733F, 0.2528F);
            this.setRotateAngle(cube_r15, -0.5888F, -0.1733F, -0.2528F);
            this.setRotateAngle(cube_r16, -0.2559F, -0.056F, -0.211F);
            this.setRotateAngle(cube_r17, -0.0865F, -0.0114F, -0.1304F);
            this.setRotateAngle(cube_r18, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r19, 0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, -0.2443F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
            this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3491F);
            this.setRotateAngle(cube_r23, -0.0843F, -0.0226F, -0.2608F);
            this.setRotateAngle(cube_r24, 0.242F, -0.1453F, -0.5277F);
            this.setRotateAngle(cube_r25, 0.242F, 0.1453F, 0.5277F);
            this.setRotateAngle(cube_r26, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r27, -0.0843F, 0.0226F, 0.2608F);
            this.setRotateAngle(cube_r28, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r29, -0.48F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.3491F);
            this.setRotateAngle(cube_r4, -0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.6589F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.9032F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.672F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);
            this.setRotateAngle(hips, -0.2138F, 0.0F, 0.0F);
            this.setRotateAngle(leftfoot, 1.0036F, 0.0F, 0.0F);
            this.setRotateAngle(lefthand, 0.6035F, 1.0349F, 0.4488F);
            this.setRotateAngle(leftleg1, 0.4853F, -0.3675F, -1.7024F);
            this.setRotateAngle(leftleg2, 0.7837F, -0.0468F, 0.0737F);
            this.setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing1, -0.236F, 0.0508F, -0.0721F);
            this.setRotateAngle(leftwing1membrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing1planemembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing2membrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing2planemembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing3, 0.0F, -0.0436F, 0.0F);
            this.setRotateAngle(leftwing3planemembrane, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing4, -0.0047F, -0.2618F, 0.0181F);
            this.setRotateAngle(leftwing4planemembrane, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing5, 0.0089F, -0.1745F, -0.0015F);
            this.setRotateAngle(leftwing6, -0.0088F, -0.1309F, 0.0011F);
            this.setRotateAngle(neck, 0.0829F, 0.0F, 0.0F);
            this.setRotateAngle(rightfoot, 1.0036F, 0.0F, 0.0F);
            this.setRotateAngle(righthand, 0.6035F, -1.0349F, -0.4488F);
            this.setRotateAngle(rightleg1, 0.4853F, 0.3675F, 1.7024F);
            this.setRotateAngle(rightleg2, 0.7837F, 0.0468F, -0.0737F);
            this.setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing1, -0.236F, -0.0508F, 0.0721F);
            this.setRotateAngle(rightwing1membrane, -0.0F, -0.0F, 0.0F);
            this.setRotateAngle(rightwing1planemembrane, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing2membrane, -0.0F, -0.0F, 0.0F);
            this.setRotateAngle(rightwing2planemembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing3, 0.0F, 0.0436F, 0.0F);
            this.setRotateAngle(rightwing3planemembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing4, -0.0047F, 0.2618F, -0.0181F);
            this.setRotateAngle(rightwing4planemembrane, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing5, 0.0089F, 0.1745F, 0.0015F);
            this.setRotateAngle(rightwing6, -0.0088F, 0.1309F, -0.0011F);
            this.setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
            this.setRotateAngle(throat, -0.7199F, 0.0F, 0.0F);
            this.setRotateAngle(main, 0.4363F, 0.0F, 0.0F);



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB wont have done that
                this.leftwing5membrane.setScale((float)1,(float)1,(float)0);
                this.leftwing6membrane.setScale((float)1,(float)1,(float)0);
                this.rightwing5membrane.setScale((float)1,(float)1,(float)0);
                this.rightwing6membrane.setScale((float)1,(float)1,(float)0);

            }
            else {
                //Climb pose
                //Anhang does not climb
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
        EntityPrehistoricFloraUktenadactylus entity = (EntityPrehistoricFloraUktenadactylus) entitylivingbaseIn;
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
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraUktenadactylus entity = (EntityPrehistoricFloraUktenadactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 27 + (((tickAnim - 8) / 12) * (0-(27)));
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

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUktenadactylus entity = (EntityPrehistoricFloraUktenadactylus) entitylivingbaseIn;
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*4 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*4)));
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
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*10-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*10 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*10)));
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
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*4-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*4 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*4)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*30-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*30 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*30)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
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
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-30-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-30 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*-30)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-20 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*-20)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-15 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-15)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-20 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*-20)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*-25 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*-25)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing6, leftwing6.rotateAngleX + (float) Math.toRadians(xx), leftwing6.rotateAngleY + (float) Math.toRadians(yy), leftwing6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 6.5 + (((tickAnim - 0) / 17) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 17) / 23) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4-(6.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4 + (((tickAnim - 40) / 22) * (6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 22) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 121) {
            xx = 6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 62) / 59) * (6.5-(6.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
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
            xx = -13 + (((tickAnim - 17) / 23) * (-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4-(-13)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = -13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4 + (((tickAnim - 40) / 22) * (-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*2-(-13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*-4)));
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
            xx = 5.25 + (((tickAnim - 17) / 23) * (5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*4-(5.25)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*4 + (((tickAnim - 40) / 22) * (5.25-(5.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-50))*4)));
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
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-10-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 22) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-10 + (((tickAnim - 40) / 22) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-10)));
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
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 0) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5 + (((tickAnim - 0) / 17) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 17) / 23) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-30-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-30 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+80))*-30)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)) + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220)))));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2))*0.2)));
            zz = 0 + (((tickAnim - 40) / 25) * (0-(0)));
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
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*30-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*30 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+150))*30)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5 + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-80))*0.5)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
            zz = 0 + (((tickAnim - 17) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*20-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*20 + (((tickAnim - 40) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+120))*20)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2 + (((tickAnim - 65) / 56) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-150))*0.2)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5 + (((tickAnim - 65) / 56) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*1.5)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*15 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*15)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*20 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+100))*20)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*25 + (((tickAnim - 40) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2+50))*25)));
        }
        else if (tickAnim >= 65 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 56) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing6, rightwing6.rotateAngleX + (float) Math.toRadians(xx), rightwing6.rotateAngleY + (float) Math.toRadians(yy), rightwing6.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraUktenadactylus entity = (EntityPrehistoricFloraUktenadactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+30))*2.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.35);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+170))*5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2.5));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 23.5 + (((tickAnim - 0) / 7) * (-23.25-(23.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 7) / 13) * (23.5-(-23.25)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6.07 + (((tickAnim - 3) / 1) * (-8.68-(6.07)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -8.68 + (((tickAnim - 4) / 3) * (-4.5-(-8.68)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 7) / 13) * (-12.25-(-4.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 1) * (1.275-(1.1)));
            zz = -0.175 + (((tickAnim - 3) / 1) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.275 + (((tickAnim - 4) / 3) * (0-(1.275)));
            zz = -0.175 + (((tickAnim - 4) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 27.79366 + (((tickAnim - 3) / 1) * (36.79366-(27.79366)));
            yy = 1.15771 + (((tickAnim - 3) / 1) * (1.15771-(1.15771)));
            zz = 3.23287 + (((tickAnim - 3) / 1) * (3.23287-(3.23287)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 36.79366 + (((tickAnim - 4) / 2) * (58.37859-(36.79366)));
            yy = 1.15771 + (((tickAnim - 4) / 2) * (2.08388-(1.15771)));
            zz = 3.23287 + (((tickAnim - 4) / 2) * (5.81917-(3.23287)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 58.37859 + (((tickAnim - 6) / 1) * (27.93521-(58.37859)));
            yy = 2.08388 + (((tickAnim - 6) / 1) * (2.70132-(2.08388)));
            zz = 5.81917 + (((tickAnim - 6) / 1) * (7.54337-(5.81917)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 27.93521 + (((tickAnim - 7) / 13) * (-6-(27.93521)));
            yy = 2.70132 + (((tickAnim - 7) / 13) * (0-(2.70132)));
            zz = 7.54337 + (((tickAnim - 7) / 13) * (0-(7.54337)));
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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.175 + (((tickAnim - 3) / 1) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 4) / 2) * (2.655-(1.175)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 2.655 + (((tickAnim - 6) / 1) * (0.475-(2.655)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 8) * (0.535-(0.475)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.535 + (((tickAnim - 15) / 5) * (0-(0.535)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+170))*1.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*2.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -19.58575 + (((tickAnim - 0) / 10) * (0-(-19.58575)));
            yy = 24.22819 + (((tickAnim - 0) / 10) * (0-(24.22819)));
            zz = 44.76409 + (((tickAnim - 0) / 10) * (0-(44.76409)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (-19.61982-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (27.54087-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (24.29413-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -19.61982 + (((tickAnim - 16) / 4) * (-19.58575-(-19.61982)));
            yy = 27.54087 + (((tickAnim - 16) / 4) * (24.22819-(27.54087)));
            zz = 24.29413 + (((tickAnim - 16) / 4) * (44.76409-(24.29413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing1planemembrane.rotationPointX = this.leftwing1planemembrane.rotationPointX + (float)(0);
        this.leftwing1planemembrane.rotationPointY = this.leftwing1planemembrane.rotationPointY - (float)(0);
        this.leftwing1planemembrane.rotationPointZ = this.leftwing1planemembrane.rotationPointZ + (float)(-5.95);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13.79375 + (((tickAnim - 0) / 10) * (0-(-13.79375)));
            yy = 18.3192 + (((tickAnim - 0) / 10) * (0-(18.3192)));
            zz = -28.7991 + (((tickAnim - 0) / 10) * (0-(-28.7991)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (2.57377-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (14.41748-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (-24.77689-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.57377 + (((tickAnim - 16) / 4) * (-13.79375-(2.57377)));
            yy = 14.41748 + (((tickAnim - 16) / 4) * (18.3192-(14.41748)));
            zz = -24.77689 + (((tickAnim - 16) / 4) * (-28.7991-(-24.77689)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing2planemembrane.rotationPointX = this.leftwing2planemembrane.rotationPointX + (float)(0);
        this.leftwing2planemembrane.rotationPointY = this.leftwing2planemembrane.rotationPointY - (float)(0);
        this.leftwing2planemembrane.rotationPointZ = this.leftwing2planemembrane.rotationPointZ + (float)(-5.95);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.24051 + (((tickAnim - 0) / 10) * (0-(1.24051)));
            yy = -19.06399 + (((tickAnim - 0) / 10) * (0-(-19.06399)));
            zz = -9.0438 + (((tickAnim - 0) / 10) * (0-(-9.0438)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (-19.78094-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (-17.25407-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (27.23133-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -19.78094 + (((tickAnim - 16) / 4) * (1.24051-(-19.78094)));
            yy = -17.25407 + (((tickAnim - 16) / 4) * (-19.06399-(-17.25407)));
            zz = 27.23133 + (((tickAnim - 16) / 4) * (-9.0438-(27.23133)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0.45 + (((tickAnim - 16) / 4) * (0-(0.45)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (50.5-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 50.5 + (((tickAnim - 16) / 4) * (0-(50.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (11.25-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 11.25 + (((tickAnim - 16) / 4) * (0-(11.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing5membrane.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (6.75-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 6.75 + (((tickAnim - 16) / 4) * (0-(6.75)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing6, leftwing6.rotateAngleX + (float) Math.toRadians(xx), leftwing6.rotateAngleY + (float) Math.toRadians(yy), leftwing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwing6membrane.setScale((float)1,(float)1,(float)0);


        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*1), shoulder.rotateAngleY + (float) Math.toRadians(0), shoulder.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-19.61982-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-27.5409-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-24.2941-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -19.61982 + (((tickAnim - 6) / 5) * (-19.58575-(-19.61982)));
            yy = -27.5409 + (((tickAnim - 6) / 5) * (-24.2282-(-27.5409)));
            zz = -24.2941 + (((tickAnim - 6) / 5) * (-44.7641-(-24.2941)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -19.58575 + (((tickAnim - 11) / 9) * (0-(-19.58575)));
            yy = -24.2282 + (((tickAnim - 11) / 9) * (0-(-24.2282)));
            zz = -44.7641 + (((tickAnim - 11) / 9) * (0-(-44.7641)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightwing1planemembrane.rotationPointX = this.rightwing1planemembrane.rotationPointX + (float)(0);
        this.rightwing1planemembrane.rotationPointY = this.rightwing1planemembrane.rotationPointY - (float)(0);
        this.rightwing1planemembrane.rotationPointZ = this.rightwing1planemembrane.rotationPointZ + (float)(-5.95);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.57377-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-14.4175-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (24.7769-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 2.57377 + (((tickAnim - 6) / 5) * (-13.79375-(2.57377)));
            yy = -14.4175 + (((tickAnim - 6) / 5) * (-18.3192-(-14.4175)));
            zz = 24.7769 + (((tickAnim - 6) / 5) * (28.7991-(24.7769)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -13.79375 + (((tickAnim - 11) / 9) * (0-(-13.79375)));
            yy = -18.3192 + (((tickAnim - 11) / 9) * (0-(-18.3192)));
            zz = 28.7991 + (((tickAnim - 11) / 9) * (0-(28.7991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightwing2planemembrane.rotationPointX = this.rightwing2planemembrane.rotationPointX + (float)(0);
        this.rightwing2planemembrane.rotationPointY = this.rightwing2planemembrane.rotationPointY - (float)(0);
        this.rightwing2planemembrane.rotationPointZ = this.rightwing2planemembrane.rotationPointZ + (float)(-5.95);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-19.78094-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (17.2541-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-27.2313-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -19.78094 + (((tickAnim - 6) / 5) * (1.24051-(-19.78094)));
            yy = 17.2541 + (((tickAnim - 6) / 5) * (19.064-(17.2541)));
            zz = -27.2313 + (((tickAnim - 6) / 5) * (9.0438-(-27.2313)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 1.24051 + (((tickAnim - 11) / 9) * (0-(1.24051)));
            yy = 19.064 + (((tickAnim - 11) / 9) * (0-(19.064)));
            zz = 9.0438 + (((tickAnim - 11) / 9) * (0-(9.0438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0.45 + (((tickAnim - 6) / 5) * (0-(0.45)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-50.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -50.5 + (((tickAnim - 6) / 5) * (0-(-50.5)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -11.25 + (((tickAnim - 6) / 5) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightwing5membrane.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-6.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -6.75 + (((tickAnim - 6) / 5) * (0-(-6.75)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing6, rightwing6.rotateAngleX + (float) Math.toRadians(xx), rightwing6.rotateAngleY + (float) Math.toRadians(yy), rightwing6.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightwing6membrane.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -9.25 + (((tickAnim - 0) / 9) * (23.5-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 23.5 + (((tickAnim - 9) / 7) * (-23.25-(23.5)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 16) / 4) * (-9.25-(-23.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -6.5 + (((tickAnim - 0) / 9) * (-12.25-(-6.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -12.25 + (((tickAnim - 9) / 3) * (6.07-(-12.25)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6.07 + (((tickAnim - 12) / 1) * (-8.68-(6.07)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -8.68 + (((tickAnim - 13) / 3) * (-4.5-(-8.68)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.5 + (((tickAnim - 16) / 4) * (-6.5-(-4.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 9) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.1-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.1 + (((tickAnim - 12) / 1) * (1.275-(1.1)));
            zz = -0.175 + (((tickAnim - 12) / 1) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.275 + (((tickAnim - 13) / 3) * (0-(1.275)));
            zz = -0.175 + (((tickAnim - 13) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 18.97558 + (((tickAnim - 0) / 9) * (-6-(18.97558)));
            yy = -2.34434 + (((tickAnim - 0) / 9) * (0-(-2.34434)));
            zz = -4.13761 + (((tickAnim - 0) / 9) * (0-(-4.13761)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 9) / 3) * (27.79366-(-6)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.15771-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (3.23287-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 27.79366 + (((tickAnim - 12) / 1) * (36.79366-(27.79366)));
            yy = 1.15771 + (((tickAnim - 12) / 1) * (1.15771-(1.15771)));
            zz = 3.23287 + (((tickAnim - 12) / 1) * (3.23287-(3.23287)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.79366 + (((tickAnim - 13) / 2) * (58.37859-(36.79366)));
            yy = 1.15771 + (((tickAnim - 13) / 2) * (2.08388-(1.15771)));
            zz = 3.23287 + (((tickAnim - 13) / 2) * (5.81917-(3.23287)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 58.37859 + (((tickAnim - 15) / 1) * (28.23008-(58.37859)));
            yy = 2.08388 + (((tickAnim - 15) / 1) * (-1.35724-(2.08388)));
            zz = 5.81917 + (((tickAnim - 15) / 1) * (-5.60004-(5.81917)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 28.23008 + (((tickAnim - 16) / 4) * (18.97558-(28.23008)));
            yy = -1.35724 + (((tickAnim - 16) / 4) * (-2.34434-(-1.35724)));
            zz = -5.60004 + (((tickAnim - 16) / 4) * (-4.13761-(-5.60004)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 9) * (0-(0.575)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (1.175-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.175 + (((tickAnim - 12) / 1) * (1.175-(1.175)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 13) / 2) * (2.655-(1.175)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 2.655 + (((tickAnim - 15) / 1) * (0.475-(2.655)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 16) / 4) * (0.575-(0.475)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraUktenadactylus e = (EntityPrehistoricFloraUktenadactylus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.1789F)-(0.1789F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((-0.0865F)-(-0.5888F)), ((0.0114F)-(0.1733F)),((0.1304F)-(0.2528F)));
        animator.rotate(cube_r12, ((0.0F)-(-0.2559F)), ((0.0F)-(0.056F)),((0.3491F)-(0.211F)));
        animator.rotate(cube_r13, ((-0.2559F)-(-0.0865F)), ((0.056F)-(0.0114F)),((0.211F)-(0.1304F)));
        animator.rotate(cube_r14, ((-0.5888F)-(0.0F)), ((0.1733F)-(0.0F)),((0.2528F)-(0.3491F)));
        animator.rotate(cube_r15, ((-0.5888F)-(-0.5888F)), ((-0.1733F)-(-0.1733F)),((-0.2528F)-(-0.2528F)));
        animator.rotate(cube_r16, ((-0.2559F)-(-0.2559F)), ((-0.056F)-(-0.056F)),((-0.211F)-(-0.211F)));
        animator.rotate(cube_r17, ((-0.0865F)-(-0.0865F)), ((-0.0114F)-(-0.0114F)),((-0.1304F)-(-0.1304F)));
        animator.rotate(cube_r18, ((-0.3491F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.3054F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((-0.2443F)-(-0.2443F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r21, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3491F)-(-0.3491F)));
        animator.rotate(cube_r22, ((0.0F)-(0.242F)), ((0.0F)-(-0.1453F)),((-0.3491F)-(-0.5277F)));
        animator.rotate(cube_r23, ((-0.0843F)-(-0.0843F)), ((-0.0226F)-(-0.0226F)),((-0.2608F)-(-0.2608F)));
        animator.rotate(cube_r24, ((0.242F)-(0.0F)), ((-0.1453F)-(0.0F)),((-0.5277F)-(-0.3491F)));
        animator.rotate(cube_r25, ((0.242F)-(0.242F)), ((0.1453F)-(0.1453F)),((0.5277F)-(0.5277F)));
        animator.rotate(cube_r26, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r27, ((-0.0843F)-(-0.0843F)), ((0.0226F)-(0.0226F)),((0.2608F)-(0.2608F)));
        animator.rotate(cube_r28, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r29, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.1047F)-(-0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r30, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r31, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3491F)-(0.3491F)));
        animator.rotate(cube_r4, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.6589F)-(0.6589F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.9032F)-(0.9032F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((-0.672F)-(-0.672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.5672F)-(0.5672F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.2138F)-(-0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((1.0036F)-(-0.7884F)), ((0.0F)-(0.0341F)),((0.0F)-(-0.0703F)));
        animator.rotate(lefthand, ((0.6035F)-(-1.5534F)), ((1.0349F)-(0.0793F)),((0.4488F)-(-1.6385F)));
        animator.rotate(leftleg1, ((0.4853F)-(-0.1617F)), ((-0.3675F)-(-0.3296F)),((-1.7024F)-(-0.375F)));
        animator.rotate(leftleg2, ((0.7837F)-(1.2309F)), ((-0.0468F)-(0.0429F)),((0.0737F)-(0.3343F)));
        animator.rotate(leftlegwing1, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftlegwing2, ((0.1367F)-(0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing1, ((-0.236F)-(-0.2875F)), ((0.0508F)-(-0.6908F)),((-0.0721F)-(-0.8886F)));
        animator.rotate(leftwing1membrane, ((0.0F)-(-0.0884F)), ((0.0F)-(0.1959F)),((0.0F)-(-0.0936F)));
        animator.rotate(leftwing1planemembrane, ((0.0F)-(-0.0393F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing2, ((0.0F)-(0.4638F)), ((0.0F)-(-0.4369F)),((0.0F)-(2.215F)));
        animator.rotate(leftwing2membrane, ((0.0F)-(-0.0218F)), ((0.0F)-(0.0742F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing2planemembrane, ((0.0F)-(-0.1658F)), ((0.0F)-(-0.0016F)),((0.0F)-(-0.013F)));
        animator.rotate(leftwing3, ((0.0F)-(-0.0151F)), ((-0.0436F)-(-0.5525F)),((0.0F)-(0.3F)));
        animator.rotate(leftwing3planemembrane, ((-0.0F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing4, ((-0.0047F)-(-2.9433F)), ((-0.2618F)-(-1.4943F)),((0.0181F)-(2.923F)));
        animator.rotate(leftwing4planemembrane, ((-0.0F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing5, ((0.0089F)-(-0.0782F)), ((-0.1745F)-(-1.2897F)),((-0.0015F)-(0.1732F)));
        animator.rotate(leftwing6, ((-0.0088F)-(-0.0193F)), ((-0.1309F)-(-0.1997F)),((0.0011F)-(0.1113F)));
        animator.rotate(neck, ((0.0829F)-(0.0829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((1.0036F)-(-0.7884F)), ((0.0F)-(-0.0341F)),((0.0F)-(0.0703F)));
        animator.rotate(righthand, ((0.6035F)-(-1.5534F)), ((-1.0349F)-(-0.0793F)),((-0.4488F)-(1.6385F)));
        animator.rotate(rightleg1, ((0.4853F)-(-0.1617F)), ((0.3675F)-(0.3296F)),((1.7024F)-(0.375F)));
        animator.rotate(rightleg2, ((0.7837F)-(1.2309F)), ((0.0468F)-(-0.0429F)),((-0.0737F)-(-0.3343F)));
        animator.rotate(rightlegwing1, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightlegwing2, ((0.1367F)-(0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing1, ((-0.236F)-(-0.2875F)), ((-0.0508F)-(0.6908F)),((0.0721F)-(0.8886F)));
        animator.rotate(rightwing1membrane, ((-0.0F)-(-0.0884F)), ((-0.0F)-(-0.1959F)),((0.0F)-(0.0936F)));
        animator.rotate(rightwing1planemembrane, ((-0.0F)-(-0.0393F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing2, ((0.0F)-(0.4638F)), ((0.0F)-(0.4369F)),((0.0F)-(-2.215F)));
        animator.rotate(rightwing2membrane, ((-0.0F)-(-0.0218F)), ((-0.0F)-(-0.0742F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing2planemembrane, ((0.0F)-(-0.1658F)), ((0.0F)-(0.0016F)),((0.0F)-(0.013F)));
        animator.rotate(rightwing3, ((0.0F)-(-0.0151F)), ((0.0436F)-(0.5525F)),((0.0F)-(-0.3F)));
        animator.rotate(rightwing3planemembrane, ((0.0F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing4, ((-0.0047F)-(-2.9433F)), ((0.2618F)-(1.4943F)),((-0.0181F)-(-2.923F)));
        animator.rotate(rightwing4planemembrane, ((0.0F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing5, ((0.0089F)-(-0.0782F)), ((0.1745F)-(1.2897F)),((0.0015F)-(-0.1732F)));
        animator.rotate(rightwing6, ((-0.0088F)-(-0.0193F)), ((0.1309F)-(0.1997F)),((-0.0011F)-(-0.1113F)));
        animator.rotate(tail, ((-0.1222F)-(-0.1222F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((-0.7199F)-(-0.7199F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(main, ((0.4363F)-(0.F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.1789F)-(0.1789F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((-0.0865F)-(-0.5888F)), -((0.0114F)-(0.1733F)),-((0.1304F)-(0.2528F)));
        animator.rotate(cube_r12, -((0.0F)-(-0.2559F)), -((0.0F)-(0.056F)),-((0.3491F)-(0.211F)));
        animator.rotate(cube_r13, -((-0.2559F)-(-0.0865F)), -((0.056F)-(0.0114F)),-((0.211F)-(0.1304F)));
        animator.rotate(cube_r14, -((-0.5888F)-(0.0F)), -((0.1733F)-(0.0F)),-((0.2528F)-(0.3491F)));
        animator.rotate(cube_r15, -((-0.5888F)-(-0.5888F)), -((-0.1733F)-(-0.1733F)),-((-0.2528F)-(-0.2528F)));
        animator.rotate(cube_r16, -((-0.2559F)-(-0.2559F)), -((-0.056F)-(-0.056F)),-((-0.211F)-(-0.211F)));
        animator.rotate(cube_r17, -((-0.0865F)-(-0.0865F)), -((-0.0114F)-(-0.0114F)),-((-0.1304F)-(-0.1304F)));
        animator.rotate(cube_r18, -((-0.3491F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.3054F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((-0.2443F)-(-0.2443F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r21, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3491F)-(-0.3491F)));
        animator.rotate(cube_r22, -((0.0F)-(0.242F)), -((0.0F)-(-0.1453F)),-((-0.3491F)-(-0.5277F)));
        animator.rotate(cube_r23, -((-0.0843F)-(-0.0843F)), -((-0.0226F)-(-0.0226F)),-((-0.2608F)-(-0.2608F)));
        animator.rotate(cube_r24, -((0.242F)-(0.0F)), -((-0.1453F)-(0.0F)),-((-0.5277F)-(-0.3491F)));
        animator.rotate(cube_r25, -((0.242F)-(0.242F)), -((0.1453F)-(0.1453F)),-((0.5277F)-(0.5277F)));
        animator.rotate(cube_r26, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r27, -((-0.0843F)-(-0.0843F)), -((0.0226F)-(0.0226F)),-((0.2608F)-(0.2608F)));
        animator.rotate(cube_r28, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r29, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.1047F)-(-0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r30, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r31, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3491F)-(0.3491F)));
        animator.rotate(cube_r4, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.6589F)-(0.6589F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.9032F)-(0.9032F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((-0.672F)-(-0.672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.5672F)-(0.5672F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.2138F)-(-0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((1.0036F)-(-0.7884F)), -((0.0F)-(0.0341F)),-((0.0F)-(-0.0703F)));
        animator.rotate(lefthand, -((0.6035F)-(-1.5534F)), -((1.0349F)-(0.0793F)),-((0.4488F)-(-1.6385F)));
        animator.rotate(leftleg1, -((0.4853F)-(-0.1617F)), -((-0.3675F)-(-0.3296F)),-((-1.7024F)-(-0.375F)));
        animator.rotate(leftleg2, -((0.7837F)-(1.2309F)), -((-0.0468F)-(0.0429F)),-((0.0737F)-(0.3343F)));
        animator.rotate(leftlegwing1, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftlegwing2, -((0.1367F)-(0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing1, -((-0.236F)-(-0.2875F)), -((0.0508F)-(-0.6908F)),-((-0.0721F)-(-0.8886F)));
        animator.rotate(leftwing1membrane, -((0.0F)-(-0.0884F)), -((0.0F)-(0.1959F)),-((0.0F)-(-0.0936F)));
        animator.rotate(leftwing1planemembrane, -((0.0F)-(-0.0393F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing2, -((0.0F)-(0.4638F)), -((0.0F)-(-0.4369F)),-((0.0F)-(2.215F)));
        animator.rotate(leftwing2membrane, -((0.0F)-(-0.0218F)), -((0.0F)-(0.0742F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing2planemembrane, -((0.0F)-(-0.1658F)), -((0.0F)-(-0.0016F)),-((0.0F)-(-0.013F)));
        animator.rotate(leftwing3, -((0.0F)-(-0.0151F)), -((-0.0436F)-(-0.5525F)),-((0.0F)-(0.3F)));
        animator.rotate(leftwing3planemembrane, -((-0.0F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing4, -((-0.0047F)-(-2.9433F)), -((-0.2618F)-(-1.4943F)),-((0.0181F)-(2.923F)));
        animator.rotate(leftwing4planemembrane, -((-0.0F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing5, -((0.0089F)-(-0.0782F)), -((-0.1745F)-(-1.2897F)),-((-0.0015F)-(0.1732F)));
        animator.rotate(leftwing6, -((-0.0088F)-(-0.0193F)), -((-0.1309F)-(-0.1997F)),-((0.0011F)-(0.1113F)));
        animator.rotate(neck, -((0.0829F)-(0.0829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((1.0036F)-(-0.7884F)), -((0.0F)-(-0.0341F)),-((0.0F)-(0.0703F)));
        animator.rotate(righthand, -((0.6035F)-(-1.5534F)), -((-1.0349F)-(-0.0793F)),-((-0.4488F)-(1.6385F)));
        animator.rotate(rightleg1, -((0.4853F)-(-0.1617F)), -((0.3675F)-(0.3296F)),-((1.7024F)-(0.375F)));
        animator.rotate(rightleg2, -((0.7837F)-(1.2309F)), -((0.0468F)-(-0.0429F)),-((-0.0737F)-(-0.3343F)));
        animator.rotate(rightlegwing1, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightlegwing2, -((0.1367F)-(0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing1, -((-0.236F)-(-0.2875F)), -((-0.0508F)-(0.6908F)),-((0.0721F)-(0.8886F)));
        animator.rotate(rightwing1membrane, -((-0.0F)-(-0.0884F)), -((-0.0F)-(-0.1959F)),-((0.0F)-(0.0936F)));
        animator.rotate(rightwing1planemembrane, -((-0.0F)-(-0.0393F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing2, -((0.0F)-(0.4638F)), -((0.0F)-(0.4369F)),-((0.0F)-(-2.215F)));
        animator.rotate(rightwing2membrane, -((-0.0F)-(-0.0218F)), -((-0.0F)-(-0.0742F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing2planemembrane, -((0.0F)-(-0.1658F)), -((0.0F)-(0.0016F)),-((0.0F)-(0.013F)));
        animator.rotate(rightwing3, -((0.0F)-(-0.0151F)), -((0.0436F)-(0.5525F)),-((0.0F)-(-0.3F)));
        animator.rotate(rightwing3planemembrane, -((0.0F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing4, -((-0.0047F)-(-2.9433F)), -((0.2618F)-(1.4943F)),-((-0.0181F)-(-2.923F)));
        animator.rotate(rightwing4planemembrane, -((0.0F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing5, -((0.0089F)-(-0.0782F)), -((0.1745F)-(1.2897F)),-((0.0015F)-(-0.1732F)));
        animator.rotate(rightwing6, -((-0.0088F)-(-0.0193F)), -((0.1309F)-(0.1997F)),-((-0.0011F)-(-0.1113F)));
        animator.rotate(tail, -((-0.1222F)-(-0.1222F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((-0.7199F)-(-0.7199F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(main, -((0.4363F)-(0.F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
