package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnhanguera;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelAnhanguera extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube2_r1;
    private final AdvancedModelRenderer cube1_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube3_r1;
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
    private final AdvancedModelRenderer cube39_r1;
    private final AdvancedModelRenderer cube38_r1;
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
    private final AdvancedModelRenderer cube40_r1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube42_r1;
    private final AdvancedModelRenderer cube41_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube61_r1;
    private final AdvancedModelRenderer cube60_r1;
    private final AdvancedModelRenderer cube59_r1;
    private final AdvancedModelRenderer cube58_r1;
    private final AdvancedModelRenderer cube54_r1;
    private final AdvancedModelRenderer cube53_r1;
    private final AdvancedModelRenderer cube52_r1;
    private final AdvancedModelRenderer cube51_r1;
    private final AdvancedModelRenderer cube50_r1;
    private final AdvancedModelRenderer cube49_r1;
    private final AdvancedModelRenderer cube48_r1;
    private final AdvancedModelRenderer cube46_r1;
    private final AdvancedModelRenderer cube45_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube75_r1;
    private final AdvancedModelRenderer cube74_r1;
    private final AdvancedModelRenderer cube73_r1;
    private final AdvancedModelRenderer cube72_r1;
    private final AdvancedModelRenderer cube71_r1;
    private final AdvancedModelRenderer cube70_r1;
    private final AdvancedModelRenderer cube69_r1;
    private final AdvancedModelRenderer cube68_r1;
    private final AdvancedModelRenderer cube65_r1;
    private final AdvancedModelRenderer cube64_r1;
    private final AdvancedModelRenderer throat;

    private ModelAnimator animator;

    public ModelAnhanguera() {
        textureWidth = 80;
        textureHeight = 80;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 20.0F, -6.0F);


        hips = new AdvancedModelRenderer(this);
        hips.setRotationPoint(0.0F, -3.825F, 7.075F);
        main.addChild(hips);
        setRotateAngle(hips, -0.2138F, 0.0F, 0.0F);


        tail = new AdvancedModelRenderer(this);
        tail.setRotationPoint(0.0F, -0.6F, 1.0F);
        hips.addChild(tail);
        setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);


        cube2_r1 = new AdvancedModelRenderer(this);
        cube2_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
        tail.addChild(cube2_r1);
        setRotateAngle(cube2_r1, -0.2443F, 0.0F, 0.0F);
        cube2_r1.cubeList.add(new ModelBox(cube2_r1, 20, 67, -1.0F, 0.3439F, -4.5009F, 3, 1, 2, -0.001F, false));

        cube1_r1 = new AdvancedModelRenderer(this);
        cube1_r1.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
        tail.addChild(cube1_r1);
        setRotateAngle(cube1_r1, -0.2443F, 0.0F, 0.0F);
        cube1_r1.cubeList.add(new ModelBox(cube1_r1, 0, 65, -1.0F, -0.6561F, -4.5009F, 3, 2, 2, 0.0F, false));

        tail1 = new AdvancedModelRenderer(this);
        tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
        tail.addChild(tail1);


        cube3_r1 = new AdvancedModelRenderer(this);
        cube3_r1.setRotationPoint(0.5F, 0.2F, 4.25F);
        tail1.addChild(cube3_r1);
        setRotateAngle(cube3_r1, -0.1047F, 0.0F, 0.0F);
        cube3_r1.cubeList.add(new ModelBox(cube3_r1, 69, 30, -1.0F, -0.1564F, -4.6539F, 1, 1, 3, 0.0F, false));

        leftleg1 = new AdvancedModelRenderer(this);
        leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
        hips.addChild(leftleg1);
        setRotateAngle(leftleg1, -0.1617F, -0.3296F, -0.375F);
        leftleg1.cubeList.add(new ModelBox(leftleg1, 53, 63, -1.2166F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, false));

        leftleg2 = new AdvancedModelRenderer(this);
        leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
        leftleg1.addChild(leftleg2);
        setRotateAngle(leftleg2, 1.2309F, 0.0429F, 0.3343F);
        leftleg2.cubeList.add(new ModelBox(leftleg2, 62, 63, -0.3433F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, false));

        leftfoot = new AdvancedModelRenderer(this);
        leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
        leftleg2.addChild(leftfoot);
        setRotateAngle(leftfoot, -0.7884F, 0.0341F, -0.0703F);
        leftfoot.cubeList.add(new ModelBox(leftfoot, 40, 59, -0.9797F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, false));

        leftlegwing1 = new AdvancedModelRenderer(this);
        leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
        leftleg2.addChild(leftlegwing1);
        setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
        leftlegwing1.cubeList.add(new ModelBox(leftlegwing1, 69, 21, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, false));

        leftlegwing2 = new AdvancedModelRenderer(this);
        leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
        leftleg1.addChild(leftlegwing2);
        setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
        leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 46, 65, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, false));

        rightleg1 = new AdvancedModelRenderer(this);
        rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
        hips.addChild(rightleg1);
        setRotateAngle(rightleg1, -0.1617F, 0.3296F, 0.375F);
        rightleg1.cubeList.add(new ModelBox(rightleg1, 53, 63, -0.7834F, -0.2193F, -0.7468F, 2, 5, 2, 0.0F, true));

        rightleg2 = new AdvancedModelRenderer(this);
        rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
        rightleg1.addChild(rightleg2);
        setRotateAngle(rightleg2, 1.2309F, -0.0429F, -0.3343F);
        rightleg2.cubeList.add(new ModelBox(rightleg2, 62, 63, -0.6567F, -0.2147F, -0.2048F, 1, 7, 2, 0.0F, true));

        rightfoot = new AdvancedModelRenderer(this);
        rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
        rightleg2.addChild(rightfoot);
        setRotateAngle(rightfoot, -0.7884F, -0.0341F, 0.0703F);
        rightfoot.cubeList.add(new ModelBox(rightfoot, 40, 59, -1.0203F, -0.4862F, -3.6551F, 2, 1, 4, 0.0F, true));

        rightlegwing1 = new AdvancedModelRenderer(this);
        rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
        rightleg2.addChild(rightlegwing1);
        setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
        rightlegwing1.cubeList.add(new ModelBox(rightlegwing1, 69, 21, 0.0F, -3.0127F, -0.1001F, 0, 6, 2, 0.0F, true));

        rightlegwing2 = new AdvancedModelRenderer(this);
        rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
        rightleg1.addChild(rightlegwing2);
        setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
        rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 46, 65, -0.5F, -2.3638F, -0.0093F, 1, 5, 2, 0.0F, true));

        body = new AdvancedModelRenderer(this);
        body.setRotationPoint(0.0F, -0.4588F, 1.2124F);
        hips.addChild(body);
        setRotateAngle(body, -0.2618F, 0.0F, 0.0F);


        cube39_r1 = new AdvancedModelRenderer(this);
        cube39_r1.setRotationPoint(-0.5F, -0.8912F, -5.3624F);
        body.addChild(cube39_r1);
        setRotateAngle(cube39_r1, -0.4363F, 0.0F, 0.0F);
        cube39_r1.cubeList.add(new ModelBox(cube39_r1, 0, 34, -2.0F, -2.0F, -1.0F, 5, 2, 6, -0.001F, false));

        cube38_r1 = new AdvancedModelRenderer(this);
        cube38_r1.setRotationPoint(-0.5F, 2.6088F, -6.2124F);
        body.addChild(cube38_r1);
        setRotateAngle(cube38_r1, -0.1309F, 0.0F, 0.0F);
        cube38_r1.cubeList.add(new ModelBox(cube38_r1, 0, 22, -2.0F, -4.0F, -1.0F, 5, 4, 7, 0.0F, false));

        leftwing1 = new AdvancedModelRenderer(this);
        leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4374F);
        body.addChild(leftwing1);
        setRotateAngle(leftwing1, -0.2875F, -0.6908F, -0.8886F);
        leftwing1.cubeList.add(new ModelBox(leftwing1, 40, 51, 0.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, false));

        leftwing1membrane = new AdvancedModelRenderer(this);
        leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
        leftwing1.addChild(leftwing1membrane);
        setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
        leftwing1membrane.cubeList.add(new ModelBox(leftwing1membrane, 25, 22, -4.25F, -0.25F, 0.0F, 8, 1, 6, 0.0F, false));

        leftwing1planemembrane = new AdvancedModelRenderer(this);
        leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 6.0F);
        leftwing1membrane.addChild(leftwing1planemembrane);
        setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        leftwing1planemembrane.cubeList.add(new ModelBox(leftwing1planemembrane, 0, 43, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, false));

        leftwing2 = new AdvancedModelRenderer(this);
        leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
        leftwing1.addChild(leftwing2);
        setRotateAngle(leftwing2, 0.4638F, -0.4369F, 2.215F);
        leftwing2.cubeList.add(new ModelBox(leftwing2, 50, 37, -0.1F, -0.25F, -0.75F, 9, 1, 2, 0.0F, false));

        leftwing2membrane = new AdvancedModelRenderer(this);
        leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
        leftwing2.addChild(leftwing2membrane);
        setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
        leftwing2membrane.cubeList.add(new ModelBox(leftwing2membrane, 25, 30, -0.1F, -0.25F, 1.25F, 9, 1, 5, 0.0F, false));

        leftwing2planemembrane = new AdvancedModelRenderer(this);
        leftwing2planemembrane.setRotationPoint(4.5F, 0.4F, 6.225F);
        leftwing2membrane.addChild(leftwing2planemembrane);
        setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
        leftwing2planemembrane.cubeList.add(new ModelBox(leftwing2planemembrane, 31, 16, -4.6F, 0.0F, 0.0F, 9, 0, 5, 0.0F, false));

        leftwing3 = new AdvancedModelRenderer(this);
        leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
        leftwing2.addChild(leftwing3);
        setRotateAngle(leftwing3, -0.0151F, -0.5525F, 0.3F);
        leftwing3.cubeList.add(new ModelBox(leftwing3, 40, 56, 0.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, false));

        leftwing3membrane = new AdvancedModelRenderer(this);
        leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        leftwing3.addChild(leftwing3membrane);
        leftwing3membrane.cubeList.add(new ModelBox(leftwing3membrane, 35, 9, 0.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, false));

        leftwing3planemembrane = new AdvancedModelRenderer(this);
        leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
        leftwing3membrane.addChild(leftwing3planemembrane);
        setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        leftwing3planemembrane.cubeList.add(new ModelBox(leftwing3planemembrane, 0, 50, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, false));

        leftwing4 = new AdvancedModelRenderer(this);
        leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
        leftwing3.addChild(leftwing4);
        setRotateAngle(leftwing4, -2.9433F, -1.4943F, 2.923F);
        leftwing4.cubeList.add(new ModelBox(leftwing4, 41, 0, 0.0F, -0.15F, -0.45F, 12, 1, 1, 0.001F, false));

        leftwing4membrane = new AdvancedModelRenderer(this);
        leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftwing4.addChild(leftwing4membrane);
        leftwing4membrane.cubeList.add(new ModelBox(leftwing4membrane, 0, 9, 0.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, false));

        leftwing4planemembrane = new AdvancedModelRenderer(this);
        leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
        leftwing4membrane.addChild(leftwing4planemembrane);
        setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        leftwing4planemembrane.cubeList.add(new ModelBox(leftwing4planemembrane, 23, 37, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, false));

        lefthand = new AdvancedModelRenderer(this);
        lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
        leftwing4.addChild(lefthand);
        setRotateAngle(lefthand, -1.5534F, 0.0793F, -1.6385F);
        lefthand.cubeList.add(new ModelBox(lefthand, 31, 69, 0.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));

        leftwing5 = new AdvancedModelRenderer(this);
        leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
        leftwing4.addChild(leftwing5);
        setRotateAngle(leftwing5, -0.0782F, -1.2897F, 0.1732F);
        leftwing5.cubeList.add(new ModelBox(leftwing5, 39, 5, 0.0F, -0.15F, -0.45F, 11, 1, 2, 0.001F, false));

        leftwing5membrane = new AdvancedModelRenderer(this);
        leftwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        leftwing5.addChild(leftwing5membrane);
        leftwing5membrane.cubeList.add(new ModelBox(leftwing5membrane, 0, 16, 0.0F, -0.15F, 0.05F, 11, 1, 4, 0.0F, false));

        leftwing6 = new AdvancedModelRenderer(this);
        leftwing6.setRotationPoint(11.0935F, 0.1091F, -0.4648F);
        leftwing5.addChild(leftwing6);
        setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
        leftwing6.cubeList.add(new ModelBox(leftwing6, 0, 5, -0.1F, -0.15F, 0.05F, 17, 1, 2, 0.0F, false));

        leftwing6membrane = new AdvancedModelRenderer(this);
        leftwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        leftwing6.addChild(leftwing6membrane);
        leftwing6membrane.cubeList.add(new ModelBox(leftwing6membrane, 0, 0, -0.1F, -0.15F, 0.05F, 17, 1, 3, 0.0F, false));

        rightwing1 = new AdvancedModelRenderer(this);
        rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4374F);
        body.addChild(rightwing1);
        setRotateAngle(rightwing1, -0.2875F, 0.6908F, 0.8886F);
        rightwing1.cubeList.add(new ModelBox(rightwing1, 40, 51, -7.0F, -0.25F, -0.5F, 7, 2, 2, 0.0F, true));

        rightwing1membrane = new AdvancedModelRenderer(this);
        rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
        rightwing1.addChild(rightwing1membrane);
        setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
        rightwing1membrane.cubeList.add(new ModelBox(rightwing1membrane, 25, 22, -3.75F, -0.25F, 0.0F, 8, 1, 6, 0.0F, true));

        rightwing1planemembrane = new AdvancedModelRenderer(this);
        rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 6.0F);
        rightwing1membrane.addChild(rightwing1planemembrane);
        setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        rightwing1planemembrane.cubeList.add(new ModelBox(rightwing1planemembrane, 0, 43, -2.0F, 0.0F, 0.0F, 4, 0, 6, 0.0F, true));

        rightwing2 = new AdvancedModelRenderer(this);
        rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
        rightwing1.addChild(rightwing2);
        setRotateAngle(rightwing2, 0.4638F, 0.4369F, -2.215F);
        rightwing2.cubeList.add(new ModelBox(rightwing2, 50, 37, -8.9F, -0.25F, -0.75F, 9, 1, 2, 0.0F, true));

        rightwing2membrane = new AdvancedModelRenderer(this);
        rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
        rightwing2.addChild(rightwing2membrane);
        setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
        rightwing2membrane.cubeList.add(new ModelBox(rightwing2membrane, 25, 30, -8.9F, -0.25F, 1.25F, 9, 1, 5, 0.0F, true));

        rightwing2planemembrane = new AdvancedModelRenderer(this);
        rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
        rightwing2membrane.addChild(rightwing2planemembrane);
        setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
        rightwing2planemembrane.cubeList.add(new ModelBox(rightwing2planemembrane, 31, 16, -4.4F, 0.0F, 0.0F, 9, 0, 5, 0.0F, true));

        rightwing3 = new AdvancedModelRenderer(this);
        rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
        rightwing2.addChild(rightwing3);
        setRotateAngle(rightwing3, -0.0151F, 0.5525F, -0.3F);
        rightwing3.cubeList.add(new ModelBox(rightwing3, 40, 56, -7.0F, -0.15F, -0.45F, 7, 1, 1, 0.0F, true));

        rightwing3membrane = new AdvancedModelRenderer(this);
        rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        rightwing3.addChild(rightwing3membrane);
        rightwing3membrane.cubeList.add(new ModelBox(rightwing3membrane, 35, 9, -7.0F, -0.15F, 0.5F, 7, 1, 5, 0.0F, true));

        rightwing3planemembrane = new AdvancedModelRenderer(this);
        rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
        rightwing3membrane.addChild(rightwing3planemembrane);
        setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        rightwing3planemembrane.cubeList.add(new ModelBox(rightwing3planemembrane, 0, 50, -3.5F, -0.05F, 0.5F, 7, 0, 4, 0.0F, true));

        rightwing4 = new AdvancedModelRenderer(this);
        rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
        rightwing3.addChild(rightwing4);
        setRotateAngle(rightwing4, -2.9433F, 1.4943F, -2.923F);
        rightwing4.cubeList.add(new ModelBox(rightwing4, 41, 0, -12.0F, -0.15F, -0.45F, 12, 1, 1, 0.001F, true));

        rightwing4membrane = new AdvancedModelRenderer(this);
        rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightwing4.addChild(rightwing4membrane);
        rightwing4membrane.cubeList.add(new ModelBox(rightwing4membrane, 0, 9, -12.0F, -0.15F, 0.5F, 12, 1, 5, 0.0F, true));

        rightwing4planemembrane = new AdvancedModelRenderer(this);
        rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
        rightwing4membrane.addChild(rightwing4planemembrane);
        setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        rightwing4planemembrane.cubeList.add(new ModelBox(rightwing4planemembrane, 23, 37, -5.0F, 0.0F, 0.0F, 10, 0, 3, 0.0F, true));

        righthand = new AdvancedModelRenderer(this);
        righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
        rightwing4.addChild(righthand);
        setRotateAngle(righthand, -1.5534F, -0.0793F, 1.6385F);
        righthand.cubeList.add(new ModelBox(righthand, 31, 69, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, true));

        rightwing5 = new AdvancedModelRenderer(this);
        rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
        rightwing4.addChild(rightwing5);
        setRotateAngle(rightwing5, -0.0782F, 1.2897F, -0.1732F);
        rightwing5.cubeList.add(new ModelBox(rightwing5, 39, 5, -11.0F, -0.15F, -0.45F, 11, 1, 2, 0.001F, true));

        rightwing5membrane = new AdvancedModelRenderer(this);
        rightwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        rightwing5.addChild(rightwing5membrane);
        rightwing5membrane.cubeList.add(new ModelBox(rightwing5membrane, 0, 16, -11.0F, -0.15F, 0.05F, 11, 1, 4, 0.0F, true));

        rightwing6 = new AdvancedModelRenderer(this);
        rightwing6.setRotationPoint(-11.0935F, 0.1091F, -0.4648F);
        rightwing5.addChild(rightwing6);
        setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
        rightwing6.cubeList.add(new ModelBox(rightwing6, 0, 5, -16.9F, -0.15F, 0.05F, 17, 1, 2, 0.0F, true));

        rightwing6membrane = new AdvancedModelRenderer(this);
        rightwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        rightwing6.addChild(rightwing6membrane);
        rightwing6membrane.cubeList.add(new ModelBox(rightwing6membrane, 0, 0, -16.9F, -0.15F, 0.05F, 17, 1, 3, 0.0F, true));

        shoulder = new AdvancedModelRenderer(this);
        shoulder.setRotationPoint(0.0F, -0.7412F, -5.8124F);
        body.addChild(shoulder);


        cube40_r1 = new AdvancedModelRenderer(this);
        cube40_r1.setRotationPoint(0.0F, -0.7F, 0.6F);
        shoulder.addChild(cube40_r1);
        setRotateAngle(cube40_r1, 0.6589F, 0.0F, 0.0F);
        cube40_r1.cubeList.add(new ModelBox(cube40_r1, 23, 41, -2.0F, -2.0F, -4.0F, 4, 4, 5, -0.1F, false));

        neck = new AdvancedModelRenderer(this);
        neck.setRotationPoint(0.0F, -1.975F, 0.125F);
        shoulder.addChild(neck);
        setRotateAngle(neck, 0.0829F, 0.0F, 0.0F);


        cube42_r1 = new AdvancedModelRenderer(this);
        cube42_r1.setRotationPoint(-0.5F, 0.425F, -4.275F);
        neck.addChild(cube42_r1);
        setRotateAngle(cube42_r1, 0.9032F, 0.0F, 0.0F);
        cube42_r1.cubeList.add(new ModelBox(cube42_r1, 0, 55, -1.0F, -2.8321F, -1.4813F, 3, 7, 2, -0.002F, false));

        cube41_r1 = new AdvancedModelRenderer(this);
        cube41_r1.setRotationPoint(-0.5F, -1.175F, -4.2F);
        neck.addChild(cube41_r1);
        setRotateAngle(cube41_r1, -0.672F, 0.0F, 0.0F);
        cube41_r1.cubeList.add(new ModelBox(cube41_r1, 42, 41, -1.0F, -2.2F, -2.2F, 3, 3, 6, 0.0F, false));

        head = new AdvancedModelRenderer(this);
        head.setRotationPoint(-0.5F, -2.8509F, -5.4142F);
        neck.addChild(head);
        setRotateAngle(head, 0.829F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 24, 60, -1.0F, -2.5F, -0.5F, 3, 4, 2, 0.005F, false));
        head.cubeList.add(new ModelBox(head, 11, 60, -0.5F, -0.8F, -8.125F, 2, 1, 4, 0.001F, false));
        head.cubeList.add(new ModelBox(head, 35, 65, -1.0F, -0.8F, -4.125F, 3, 1, 2, 0.003F, false));
        head.cubeList.add(new ModelBox(head, 11, 55, -1.0F, -0.8F, -2.125F, 3, 2, 2, 0.004F, false));

        cube61_r1 = new AdvancedModelRenderer(this);
        cube61_r1.setRotationPoint(0.975F, -2.0165F, -10.4807F);
        head.addChild(cube61_r1);
        setRotateAngle(cube61_r1, 0.1614F, 0.0F, 0.0F);
        cube61_r1.cubeList.add(new ModelBox(cube61_r1, 11, 66, -0.485F, 0.0F, -4.0F, 0, 1, 4, 0.0F, false));

        cube60_r1 = new AdvancedModelRenderer(this);
        cube60_r1.setRotationPoint(1.0F, -1.4537F, -8.1728F);
        head.addChild(cube60_r1);
        setRotateAngle(cube60_r1, -0.2182F, 0.0F, 0.0F);
        cube60_r1.cubeList.add(new ModelBox(cube60_r1, 69, 63, -0.5F, -0.05F, -2.375F, 0, 1, 3, 0.0F, false));

        cube59_r1 = new AdvancedModelRenderer(this);
        cube59_r1.setRotationPoint(0.0F, -1.8054F, -4.4392F);
        head.addChild(cube59_r1);
        setRotateAngle(cube59_r1, 0.0873F, 0.0F, 0.0F);
        cube59_r1.cubeList.add(new ModelBox(cube59_r1, 60, 15, -0.5F, 0.025F, -3.75F, 2, 1, 4, 0.0F, false));

        cube58_r1 = new AdvancedModelRenderer(this);
        cube58_r1.setRotationPoint(1.5F, -2.5F, -0.5F);
        head.addChild(cube58_r1);
        setRotateAngle(cube58_r1, 0.1789F, 0.0F, 0.0F);
        cube58_r1.cubeList.add(new ModelBox(cube58_r1, 70, 60, -2.75F, 0.5F, -1.7F, 1, 1, 1, 0.0F, true));
        cube58_r1.cubeList.add(new ModelBox(cube58_r1, 70, 60, -0.25F, 0.5F, -1.7F, 1, 1, 1, 0.0F, false));
        cube58_r1.cubeList.add(new ModelBox(cube58_r1, 54, 30, -2.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        cube54_r1 = new AdvancedModelRenderer(this);
        cube54_r1.setRotationPoint(0.25F, -0.753F, -14.6153F);
        head.addChild(cube54_r1);
        setRotateAngle(cube54_r1, -0.5888F, 0.1733F, 0.2528F);
        cube54_r1.cubeList.add(new ModelBox(cube54_r1, 20, 71, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        cube53_r1 = new AdvancedModelRenderer(this);
        cube53_r1.setRotationPoint(0.15F, -0.9206F, -13.4186F);
        head.addChild(cube53_r1);
        setRotateAngle(cube53_r1, -0.2559F, 0.056F, 0.211F);
        cube53_r1.cubeList.add(new ModelBox(cube53_r1, 53, 59, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        cube52_r1 = new AdvancedModelRenderer(this);
        cube52_r1.setRotationPoint(0.0F, -0.105F, -11.6117F);
        head.addChild(cube52_r1);
        setRotateAngle(cube52_r1, -0.0865F, 0.0114F, 0.1304F);
        cube52_r1.cubeList.add(new ModelBox(cube52_r1, 61, 48, 0.0F, -0.75F, -1.5F, 0, 1, 5, 0.0F, true));

        cube51_r1 = new AdvancedModelRenderer(this);
        cube51_r1.setRotationPoint(0.75F, -0.753F, -14.6153F);
        head.addChild(cube51_r1);
        setRotateAngle(cube51_r1, -0.5888F, -0.1733F, -0.2528F);
        cube51_r1.cubeList.add(new ModelBox(cube51_r1, 20, 71, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        cube50_r1 = new AdvancedModelRenderer(this);
        cube50_r1.setRotationPoint(0.85F, -0.9206F, -13.4186F);
        head.addChild(cube50_r1);
        setRotateAngle(cube50_r1, -0.2559F, -0.056F, -0.211F);
        cube50_r1.cubeList.add(new ModelBox(cube50_r1, 53, 59, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        cube49_r1 = new AdvancedModelRenderer(this);
        cube49_r1.setRotationPoint(1.0F, -0.105F, -11.6117F);
        head.addChild(cube49_r1);
        setRotateAngle(cube49_r1, -0.0865F, -0.0114F, -0.1304F);
        cube49_r1.cubeList.add(new ModelBox(cube49_r1, 61, 48, 0.0F, -0.75F, -1.5F, 0, 1, 5, 0.0F, false));

        cube48_r1 = new AdvancedModelRenderer(this);
        cube48_r1.setRotationPoint(0.5F, 0.2F, -8.125F);
        head.addChild(cube48_r1);
        setRotateAngle(cube48_r1, -0.0873F, 0.0F, 0.0F);
        cube48_r1.cubeList.add(new ModelBox(cube48_r1, 23, 51, -0.5F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

        cube46_r1 = new AdvancedModelRenderer(this);
        cube46_r1.setRotationPoint(-0.45F, 0.05F, -5.625F);
        head.addChild(cube46_r1);
        setRotateAngle(cube46_r1, 0.0F, 0.0F, 0.3491F);
        cube46_r1.cubeList.add(new ModelBox(cube46_r1, 0, 70, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        cube45_r1 = new AdvancedModelRenderer(this);
        cube45_r1.setRotationPoint(1.45F, 0.05F, -5.625F);
        head.addChild(cube45_r1);
        setRotateAngle(cube45_r1, 0.0F, 0.0F, -0.3491F);
        cube45_r1.cubeList.add(new ModelBox(cube45_r1, 0, 70, 0.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        jaw = new AdvancedModelRenderer(this);
        jaw.setRotationPoint(0.0F, 0.2F, -2.125F);
        head.addChild(jaw);
        jaw.cubeList.add(new ModelBox(jaw, 60, 9, -0.5F, 0.0F, -6.0F, 2, 1, 4, 0.001F, false));
        jaw.cubeList.add(new ModelBox(jaw, 66, 3, -1.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        jaw.cubeList.add(new ModelBox(jaw, 69, 68, -0.5F, -1.5F, -1.75F, 2, 2, 2, 0.0F, false));

        cube75_r1 = new AdvancedModelRenderer(this);
        cube75_r1.setRotationPoint(0.3674F, -0.4766F, -11.9036F);
        jaw.addChild(cube75_r1);
        setRotateAngle(cube75_r1, 0.242F, -0.1453F, -0.5277F);
        cube75_r1.cubeList.add(new ModelBox(cube75_r1, 7, 70, -0.225F, -1.5F, -0.625F, 0, 2, 1, 0.0F, true));

        cube74_r1 = new AdvancedModelRenderer(this);
        cube74_r1.setRotationPoint(0.6326F, -0.4766F, -11.9036F);
        jaw.addChild(cube74_r1);
        setRotateAngle(cube74_r1, 0.242F, 0.1453F, 0.5277F);
        cube74_r1.cubeList.add(new ModelBox(cube74_r1, 7, 70, 0.225F, -1.5F, -0.625F, 0, 2, 1, 0.0F, false));

        cube73_r1 = new AdvancedModelRenderer(this);
        cube73_r1.setRotationPoint(0.5F, 0.4771F, -11.9772F);
        jaw.addChild(cube73_r1);
        setRotateAngle(cube73_r1, -0.3927F, 0.0F, 0.0F);
        cube73_r1.cubeList.add(new ModelBox(cube73_r1, 68, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

        cube72_r1 = new AdvancedModelRenderer(this);
        cube72_r1.setRotationPoint(0.0F, -0.2577F, -8.9014F);
        jaw.addChild(cube72_r1);
        setRotateAngle(cube72_r1, -0.0843F, -0.0226F, -0.2608F);
        cube72_r1.cubeList.add(new ModelBox(cube72_r1, 61, 41, 0.0F, -0.25F, -3.0F, 0, 1, 5, 0.0F, true));

        cube71_r1 = new AdvancedModelRenderer(this);
        cube71_r1.setRotationPoint(1.0F, -0.2577F, -8.9014F);
        jaw.addChild(cube71_r1);
        setRotateAngle(cube71_r1, -0.0843F, 0.0226F, 0.2608F);
        cube71_r1.cubeList.add(new ModelBox(cube71_r1, 61, 41, 0.0F, -0.25F, -3.0F, 0, 1, 5, 0.0F, false));

        cube70_r1 = new AdvancedModelRenderer(this);
        cube70_r1.setRotationPoint(1.0F, 0.9947F, -10.0453F);
        jaw.addChild(cube70_r1);
        setRotateAngle(cube70_r1, 0.0916F, 0.0F, 0.0F);
        cube70_r1.cubeList.add(new ModelBox(cube70_r1, 40, 69, -0.51F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        cube69_r1 = new AdvancedModelRenderer(this);
        cube69_r1.setRotationPoint(1.0F, 0.4771F, -11.9772F);
        jaw.addChild(cube69_r1);
        setRotateAngle(cube69_r1, -0.2618F, 0.0F, 0.0F);
        cube69_r1.cubeList.add(new ModelBox(cube69_r1, 35, 60, -0.5F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        cube68_r1 = new AdvancedModelRenderer(this);
        cube68_r1.setRotationPoint(0.5F, 1.0F, -6.0F);
        jaw.addChild(cube68_r1);
        setRotateAngle(cube68_r1, -0.0873F, 0.0F, 0.0F);
        cube68_r1.cubeList.add(new ModelBox(cube68_r1, 54, 22, -0.5F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

        cube65_r1 = new AdvancedModelRenderer(this);
        cube65_r1.setRotationPoint(-0.45F, 0.2F, -4.5F);
        jaw.addChild(cube65_r1);
        setRotateAngle(cube65_r1, 0.0F, 0.0F, -0.3491F);
        cube65_r1.cubeList.add(new ModelBox(cube65_r1, 70, 55, 0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, true));

        cube64_r1 = new AdvancedModelRenderer(this);
        cube64_r1.setRotationPoint(1.45F, 0.2F, -4.5F);
        jaw.addChild(cube64_r1);
        setRotateAngle(cube64_r1, 0.0F, 0.0F, 0.3491F);
        cube64_r1.cubeList.add(new ModelBox(cube64_r1, 70, 55, -0.025F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        throat = new AdvancedModelRenderer(this);
        throat.setRotationPoint(0.0F, 1.0F, -3.0F);
        jaw.addChild(throat);
        setRotateAngle(throat, -1.0036F, 0.0F, 0.0F);
        throat.cubeList.add(new ModelBox(throat, 57, 56, -0.5F, -2.0F, 0.0F, 2, 2, 4, -0.003F, false));

        this.leftwing5membrane.setScale((float)1,(float)1,(float)0);
        this.leftwing6membrane.setScale((float)1,(float)1,(float)0);
        this.rightwing5membrane.setScale((float)1,(float)1,(float)0);
        this.rightwing6membrane.setScale((float)1,(float)1,(float)0);

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
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(125);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.1F);

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }



    public void renderStaticFloor(float f) {
        body.setRotationPoint(0.0F, -0.4588F, 1.2124F);
        cube1_r1.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
        cube2_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
        cube3_r1.setRotationPoint(0.5F, 0.2F, 4.25F);
        cube38_r1.setRotationPoint(-0.5F, 2.6088F, -6.2124F);
        cube39_r1.setRotationPoint(-0.5F, -0.8912F, -5.3624F);
        cube40_r1.setRotationPoint(0.0F, -0.7F, 0.6F);
        cube41_r1.setRotationPoint(-0.5F, -1.175F, -4.2F);
        cube42_r1.setRotationPoint(-0.5F, 0.425F, -4.275F);
        cube45_r1.setRotationPoint(1.45F, 0.05F, -5.625F);
        cube46_r1.setRotationPoint(-0.45F, 0.05F, -5.625F);
        cube48_r1.setRotationPoint(0.5F, 0.2F, -8.125F);
        cube49_r1.setRotationPoint(1.0F, -0.1051F, -11.6117F);
        cube50_r1.setRotationPoint(0.85F, -0.9206F, -13.4186F);
        cube51_r1.setRotationPoint(0.75F, -0.7531F, -14.6153F);
        cube52_r1.setRotationPoint(0.0F, -0.1051F, -11.6117F);
        cube53_r1.setRotationPoint(0.15F, -0.9206F, -13.4186F);
        cube54_r1.setRotationPoint(0.25F, -0.7531F, -14.6153F);
        cube58_r1.setRotationPoint(1.5F, -2.5F, -0.5F);
        cube59_r1.setRotationPoint(0.0F, -1.8054F, -4.4392F);
        cube60_r1.setRotationPoint(1.0F, -1.4537F, -8.1728F);
        cube61_r1.setRotationPoint(0.975F, -2.0166F, -10.4807F);
        cube64_r1.setRotationPoint(1.45F, 0.2F, -4.5F);
        cube65_r1.setRotationPoint(-0.45F, 0.2F, -4.5F);
        cube68_r1.setRotationPoint(0.5F, 1.0F, -6.0F);
        cube69_r1.setRotationPoint(1.0F, 0.477F, -11.9772F);
        cube70_r1.setRotationPoint(1.0F, 0.9947F, -10.0453F);
        cube71_r1.setRotationPoint(1.0F, -0.2577F, -8.9014F);
        cube72_r1.setRotationPoint(0.0F, -0.2577F, -8.9014F);
        cube73_r1.setRotationPoint(0.5F, 0.477F, -11.9772F);
        cube74_r1.setRotationPoint(0.6326F, -0.4766F, -11.9036F);
        cube75_r1.setRotationPoint(0.3674F, -0.4766F, -11.9036F);
        head.setRotationPoint(-0.5F, -1.7259F, -5.4142F);
        hips.setRotationPoint(0.0F, -3.825F, 7.075F);
        jaw.setRotationPoint(0.0F, 0.2F, -2.125F);
        leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
        lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
        leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
        leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
        leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
        leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
        leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4374F);
        leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
        leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 6.0F);
        leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
        leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
        leftwing2planemembrane.setRotationPoint(4.5F, 0.4F, 6.225F);
        leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
        leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
        leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
        leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
        leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
        leftwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        leftwing6.setRotationPoint(11.0935F, 0.1091F, -0.4648F);
        leftwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        main.setRotationPoint(0.0F, 20.0F, -6.0F);
        neck.setRotationPoint(0.0F, -1.975F, 0.125F);
        rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
        righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
        rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
        rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
        rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
        rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
        rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4374F);
        rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
        rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 6.0F);
        rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
        rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
        rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
        rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
        rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
        rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
        rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
        rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
        rightwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        rightwing6.setRotationPoint(-11.0935F, 0.1091F, -0.4648F);
        rightwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        setRotateAngle(body, -0.2618F, 0.0F, 0.0F);
        setRotateAngle(cube1_r1, -0.2443F, 0.0F, 0.0F);
        setRotateAngle(cube2_r1, -0.2443F, 0.0F, 0.0F);
        setRotateAngle(cube3_r1, -0.1047F, 0.0F, 0.0F);
        setRotateAngle(cube38_r1, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(cube39_r1, -0.4363F, 0.0F, 0.0F);
        setRotateAngle(cube40_r1, 0.6589F, 0.0F, 0.0F);
        setRotateAngle(cube41_r1, -0.672F, 0.0F, 0.0F);
        setRotateAngle(cube42_r1, 0.9032F, 0.0F, 0.0F);
        setRotateAngle(cube45_r1, 0.0F, 0.0F, -0.3491F);
        setRotateAngle(cube46_r1, 0.0F, 0.0F, 0.3491F);
        setRotateAngle(cube48_r1, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube49_r1, -0.0865F, -0.0114F, -0.1304F);
        setRotateAngle(cube50_r1, -0.2559F, -0.056F, -0.211F);
        setRotateAngle(cube51_r1, -0.5888F, -0.1733F, -0.2528F);
        setRotateAngle(cube52_r1, -0.0865F, 0.0114F, 0.1304F);
        setRotateAngle(cube53_r1, -0.2559F, 0.056F, 0.211F);
        setRotateAngle(cube54_r1, -0.5888F, 0.1733F, 0.2528F);
        setRotateAngle(cube58_r1, 0.1789F, 0.0F, 0.0F);
        setRotateAngle(cube59_r1, 0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube60_r1, -0.2182F, 0.0F, 0.0F);
        setRotateAngle(cube61_r1, 0.1614F, 0.0F, 0.0F);
        setRotateAngle(cube64_r1, 0.0F, 0.0F, 0.3491F);
        setRotateAngle(cube65_r1, 0.0F, 0.0F, -0.3491F);
        setRotateAngle(cube68_r1, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube69_r1, -0.2618F, 0.0F, 0.0F);
        setRotateAngle(cube70_r1, 0.0916F, 0.0F, 0.0F);
        setRotateAngle(cube71_r1, -0.0843F, 0.0226F, 0.2608F);
        setRotateAngle(cube72_r1, -0.0843F, -0.0226F, -0.2608F);
        setRotateAngle(cube73_r1, -0.3927F, 0.0F, 0.0F);
        setRotateAngle(cube74_r1, 0.242F, 0.1453F, 0.5277F);
        setRotateAngle(cube75_r1, 0.242F, -0.1453F, -0.5277F);
        setRotateAngle(head, 0.1963F, 0.0F, 0.0F);
        setRotateAngle(hips, 0.3098F, 0.0F, 0.0F);
        setRotateAngle(leftfoot, 1.1254F, 0.0804F, -0.024F);
        setRotateAngle(lefthand, 0.5806F, 0.825F, 0.3218F);
        setRotateAngle(leftleg1, 0.1323F, -0.1934F, -1.7129F);
        setRotateAngle(leftleg2, 0.9936F, -0.1689F, 0.1602F);
        setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
        setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
        setRotateAngle(leftwing1, -0.1063F, 0.0897F, -0.1075F);
        setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
        setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        setRotateAngle(leftwing2, 0.0033F, 0.1483F, -0.0216F);
        setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
        setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
        setRotateAngle(leftwing3, -0.0018F, -0.0523F, 0.0786F);
        setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(leftwing4, -0.0222F, -0.3484F, 0.065F);
        setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(leftwing5, -0.0222F, -0.2171F, 0.1028F);
        setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
        setRotateAngle(neck, -0.2836F, 0.0F, 0.0F);
        setRotateAngle(rightfoot, 1.1254F, -0.0804F, 0.024F);
        setRotateAngle(righthand, 0.5806F, -0.825F, -0.3218F);
        setRotateAngle(rightleg1, 0.1323F, 0.1934F, 1.7129F);
        setRotateAngle(rightleg2, 0.9936F, 0.1689F, -0.1602F);
        setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
        setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
        setRotateAngle(rightwing1, -0.1063F, -0.0897F, 0.1075F);
        setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
        setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        setRotateAngle(rightwing2, 0.0033F, -0.1483F, 0.0216F);
        setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
        setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
        setRotateAngle(rightwing3, -0.0018F, 0.0523F, -0.0786F);
        setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(rightwing4, -0.0222F, 0.3484F, -0.065F);
        setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(rightwing5, -0.0222F, 0.2171F, -0.1028F);
        setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
        setRotateAngle(shoulder, 0.2182F, 0.0F, 0.0F);
        setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
        setRotateAngle(throat, -0.6196F, 0.0F, 0.0F);
        shoulder.setRotationPoint(0.0F, -0.7412F, -5.8124F);
        tail.setRotationPoint(0.0F, -0.6F, 1.0F);
        tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
        throat.setRotationPoint(0.0F, 0.95F, -1.4F);
        this.main.offsetY = -0.45F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.rotateAngleY = (float)Math.toRadians(180);
        this.main.offsetY = -0.15F;
        this.main.offsetZ = -0.15F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        body.setRotationPoint(0.0F, -0.4588F, 1.2124F);
        cube1_r1.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
        cube2_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
        cube3_r1.setRotationPoint(0.5F, 0.2F, 4.25F);
        cube38_r1.setRotationPoint(-0.5F, 2.6088F, -6.2124F);
        cube39_r1.setRotationPoint(-0.5F, -0.8912F, -5.3624F);
        cube40_r1.setRotationPoint(0.0F, -0.7F, 0.6F);
        cube41_r1.setRotationPoint(-0.5F, -1.175F, -4.2F);
        cube42_r1.setRotationPoint(-0.5F, 0.425F, -4.275F);
        cube45_r1.setRotationPoint(1.45F, 0.05F, -5.625F);
        cube46_r1.setRotationPoint(-0.45F, 0.05F, -5.625F);
        cube48_r1.setRotationPoint(0.5F, 0.2F, -8.125F);
        cube49_r1.setRotationPoint(1.0F, -0.1051F, -11.6117F);
        cube50_r1.setRotationPoint(0.85F, -0.9206F, -13.4186F);
        cube51_r1.setRotationPoint(0.75F, -0.7531F, -14.6153F);
        cube52_r1.setRotationPoint(0.0F, -0.1051F, -11.6117F);
        cube53_r1.setRotationPoint(0.15F, -0.9206F, -13.4186F);
        cube54_r1.setRotationPoint(0.25F, -0.7531F, -14.6153F);
        cube58_r1.setRotationPoint(1.5F, -2.5F, -0.5F);
        cube59_r1.setRotationPoint(0.0F, -1.8054F, -4.4392F);
        cube60_r1.setRotationPoint(1.0F, -1.4537F, -8.1728F);
        cube61_r1.setRotationPoint(0.975F, -2.0166F, -10.4807F);
        cube64_r1.setRotationPoint(1.45F, 0.2F, -4.5F);
        cube65_r1.setRotationPoint(-0.45F, 0.2F, -4.5F);
        cube68_r1.setRotationPoint(0.5F, 1.0F, -6.0F);
        cube69_r1.setRotationPoint(1.0F, 0.477F, -11.9772F);
        cube70_r1.setRotationPoint(1.0F, 0.9947F, -10.0453F);
        cube71_r1.setRotationPoint(1.0F, -0.2577F, -8.9014F);
        cube72_r1.setRotationPoint(0.0F, -0.2577F, -8.9014F);
        cube73_r1.setRotationPoint(0.5F, 0.477F, -11.9772F);
        cube74_r1.setRotationPoint(0.6326F, -0.4766F, -11.9036F);
        cube75_r1.setRotationPoint(0.3674F, -0.4766F, -11.9036F);
        head.setRotationPoint(-0.5F, -1.7259F, -5.4142F);
        hips.setRotationPoint(0.0F, -3.825F, 7.075F);
        jaw.setRotationPoint(0.0F, 0.2F, -2.125F);
        leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
        lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
        leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
        leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
        leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
        leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
        leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4374F);
        leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
        leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 6.0F);
        leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
        leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
        leftwing2planemembrane.setRotationPoint(4.5F, 0.4F, 6.225F);
        leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
        leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
        leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
        leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
        leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
        leftwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        leftwing6.setRotationPoint(11.0935F, 0.1091F, -0.4648F);
        leftwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        main.setRotationPoint(0.0F, 20.0F, -6.0F);
        neck.setRotationPoint(0.0F, -1.975F, 0.125F);
        rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
        righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
        rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
        rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
        rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
        rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
        rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4374F);
        rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
        rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 6.0F);
        rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
        rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
        rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
        rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
        rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
        rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
        rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
        rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
        rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
        rightwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
        rightwing6.setRotationPoint(-11.0935F, 0.1091F, -0.4648F);
        rightwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
        setRotateAngle(body, -0.2618F, 0.0F, 0.0F);
        setRotateAngle(cube1_r1, -0.2443F, 0.0F, 0.0F);
        setRotateAngle(cube2_r1, -0.2443F, 0.0F, 0.0F);
        setRotateAngle(cube3_r1, -0.1047F, 0.0F, 0.0F);
        setRotateAngle(cube38_r1, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(cube39_r1, -0.4363F, 0.0F, 0.0F);
        setRotateAngle(cube40_r1, 0.6589F, 0.0F, 0.0F);
        setRotateAngle(cube41_r1, -0.672F, 0.0F, 0.0F);
        setRotateAngle(cube42_r1, 0.9032F, 0.0F, 0.0F);
        setRotateAngle(cube45_r1, 0.0F, 0.0F, -0.3491F);
        setRotateAngle(cube46_r1, 0.0F, 0.0F, 0.3491F);
        setRotateAngle(cube48_r1, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube49_r1, -0.0865F, -0.0114F, -0.1304F);
        setRotateAngle(cube50_r1, -0.2559F, -0.056F, -0.211F);
        setRotateAngle(cube51_r1, -0.5888F, -0.1733F, -0.2528F);
        setRotateAngle(cube52_r1, -0.0865F, 0.0114F, 0.1304F);
        setRotateAngle(cube53_r1, -0.2559F, 0.056F, 0.211F);
        setRotateAngle(cube54_r1, -0.5888F, 0.1733F, 0.2528F);
        setRotateAngle(cube58_r1, 0.1789F, 0.0F, 0.0F);
        setRotateAngle(cube59_r1, 0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube60_r1, -0.2182F, 0.0F, 0.0F);
        setRotateAngle(cube61_r1, 0.1614F, 0.0F, 0.0F);
        setRotateAngle(cube64_r1, 0.0F, 0.0F, 0.3491F);
        setRotateAngle(cube65_r1, 0.0F, 0.0F, -0.3491F);
        setRotateAngle(cube68_r1, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(cube69_r1, -0.2618F, 0.0F, 0.0F);
        setRotateAngle(cube70_r1, 0.0916F, 0.0F, 0.0F);
        setRotateAngle(cube71_r1, -0.0843F, 0.0226F, 0.2608F);
        setRotateAngle(cube72_r1, -0.0843F, -0.0226F, -0.2608F);
        setRotateAngle(cube73_r1, -0.3927F, 0.0F, 0.0F);
        setRotateAngle(cube74_r1, 0.242F, 0.1453F, 0.5277F);
        setRotateAngle(cube75_r1, 0.242F, -0.1453F, -0.5277F);
        setRotateAngle(head, 0.1963F, 0.0F, 0.0F);
        setRotateAngle(hips, 0.3098F, 0.0F, 0.0F);
        setRotateAngle(leftfoot, 1.1254F, 0.0804F, -0.024F);
        setRotateAngle(lefthand, 0.5806F, 0.825F, 0.3218F);
        setRotateAngle(leftleg1, 0.1323F, -0.1934F, -1.7129F);
        setRotateAngle(leftleg2, 0.9936F, -0.1689F, 0.1602F);
        setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
        setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
        setRotateAngle(leftwing1, -0.1063F, 0.0897F, -0.1075F);
        setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
        setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        setRotateAngle(leftwing2, 0.0033F, 0.1483F, -0.0216F);
        setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
        setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
        setRotateAngle(leftwing3, -0.0018F, -0.0523F, 0.0786F);
        setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(leftwing4, -0.0222F, -0.3484F, 0.065F);
        setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(leftwing5, -0.0222F, -0.2171F, 0.1028F);
        setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
        setRotateAngle(neck, -0.2836F, 0.0F, 0.0F);
        setRotateAngle(rightfoot, 1.1254F, -0.0804F, 0.024F);
        setRotateAngle(righthand, 0.5806F, -0.825F, -0.3218F);
        setRotateAngle(rightleg1, 0.1323F, 0.1934F, 1.7129F);
        setRotateAngle(rightleg2, 0.9936F, 0.1689F, -0.1602F);
        setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
        setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
        setRotateAngle(rightwing1, -0.1063F, -0.0897F, 0.1075F);
        setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
        setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
        setRotateAngle(rightwing2, 0.0033F, -0.1483F, 0.0216F);
        setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
        setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
        setRotateAngle(rightwing3, -0.0018F, 0.0523F, -0.0786F);
        setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
        setRotateAngle(rightwing4, -0.0222F, 0.3484F, -0.065F);
        setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
        setRotateAngle(rightwing5, -0.0222F, 0.2171F, -0.1028F);
        setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
        setRotateAngle(shoulder, 0.2182F, 0.0F, 0.0F);
        setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
        setRotateAngle(throat, -0.6196F, 0.0F, 0.0F);
        shoulder.setRotationPoint(0.0F, -0.7412F, -5.8124F);
        tail.setRotationPoint(0.0F, -0.6F, 1.0F);
        tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
        throat.setRotationPoint(0.0F, 0.95F, -1.4F);
        this.main.offsetY = 0.175F;
        this.main.offsetZ = 0.015F;
        this.main.render(0.015F);
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
        EntityPrehistoricFloraAnhanguera ee = (EntityPrehistoricFloraAnhanguera) entitylivingbaseIn;

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
            body.setRotationPoint(0.0F, -0.4588F, 1.2124F);
            cube1_r1.setRotationPoint(-0.5F, 1.1393F, 4.3784F);
            cube2_r1.setRotationPoint(-0.5F, 1.7393F, 4.2284F);
            cube3_r1.setRotationPoint(0.5F, 0.2F, 4.25F);
            cube38_r1.setRotationPoint(-0.5F, 2.6088F, -6.2124F);
            cube39_r1.setRotationPoint(-0.5F, -0.8912F, -5.3624F);
            cube40_r1.setRotationPoint(0.0F, -0.7F, 0.6F);
            cube41_r1.setRotationPoint(-0.5F, -1.175F, -4.2F);
            cube42_r1.setRotationPoint(-0.5F, 0.425F, -4.275F);
            cube45_r1.setRotationPoint(1.45F, 0.05F, -5.625F);
            cube46_r1.setRotationPoint(-0.45F, 0.05F, -5.625F);
            cube48_r1.setRotationPoint(0.5F, 0.2F, -8.125F);
            cube49_r1.setRotationPoint(1.0F, -0.1051F, -11.6117F);
            cube50_r1.setRotationPoint(0.85F, -0.9206F, -13.4186F);
            cube51_r1.setRotationPoint(0.75F, -0.7531F, -14.6153F);
            cube52_r1.setRotationPoint(0.0F, -0.1051F, -11.6117F);
            cube53_r1.setRotationPoint(0.15F, -0.9206F, -13.4186F);
            cube54_r1.setRotationPoint(0.25F, -0.7531F, -14.6153F);
            cube58_r1.setRotationPoint(1.5F, -2.5F, -0.5F);
            cube59_r1.setRotationPoint(0.0F, -1.8054F, -4.4392F);
            cube60_r1.setRotationPoint(1.0F, -1.4537F, -8.1728F);
            cube61_r1.setRotationPoint(0.975F, -2.0166F, -10.4807F);
            cube64_r1.setRotationPoint(1.45F, 0.2F, -4.5F);
            cube65_r1.setRotationPoint(-0.45F, 0.2F, -4.5F);
            cube68_r1.setRotationPoint(0.5F, 1.0F, -6.0F);
            cube69_r1.setRotationPoint(1.0F, 0.477F, -11.9772F);
            cube70_r1.setRotationPoint(1.0F, 0.9947F, -10.0453F);
            cube71_r1.setRotationPoint(1.0F, -0.2577F, -8.9014F);
            cube72_r1.setRotationPoint(0.0F, -0.2577F, -8.9014F);
            cube73_r1.setRotationPoint(0.5F, 0.477F, -11.9772F);
            cube74_r1.setRotationPoint(0.6326F, -0.4766F, -11.9036F);
            cube75_r1.setRotationPoint(0.3674F, -0.4766F, -11.9036F);
            head.setRotationPoint(-0.5F, -1.7259F, -5.4142F);
            hips.setRotationPoint(0.0F, -3.825F, 7.075F);
            jaw.setRotationPoint(0.0F, 0.2F, -2.125F);
            leftfoot.setRotationPoint(0.1308F, 6.2913F, 0.6363F);
            lefthand.setRotationPoint(0.2F, 0.375F, 0.0F);
            leftleg1.setRotationPoint(1.7454F, -0.4555F, 0.2462F);
            leftleg2.setRotationPoint(-0.3135F, 4.5915F, -0.425F);
            leftlegwing1.setRotationPoint(0.1567F, 3.2956F, 1.7027F);
            leftlegwing2.setRotationPoint(-0.5166F, 2.1211F, 1.0845F);
            leftwing1.setRotationPoint(2.0F, -1.8912F, -6.4374F);
            leftwing1membrane.setRotationPoint(2.925F, 0.325F, 0.4F);
            leftwing1planemembrane.setRotationPoint(1.75F, 0.275F, 6.0F);
            leftwing2.setRotationPoint(6.675F, 0.075F, 0.25F);
            leftwing2membrane.setRotationPoint(-0.125F, -0.025F, -0.325F);
            leftwing2planemembrane.setRotationPoint(4.5F, 0.4F, 6.225F);
            leftwing3.setRotationPoint(8.75F, -0.05F, -0.3F);
            leftwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
            leftwing3planemembrane.setRotationPoint(3.5F, 0.4F, 5.0F);
            leftwing4.setRotationPoint(6.9F, 0.0F, 0.0F);
            leftwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
            leftwing4planemembrane.setRotationPoint(6.5F, 0.15F, 5.5F);
            leftwing5.setRotationPoint(11.9F, 0.0F, 0.0F);
            leftwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
            leftwing6.setRotationPoint(11.0935F, 0.1091F, -0.4648F);
            leftwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
            main.setRotationPoint(0.0F, 20.0F, -6.0F);
            neck.setRotationPoint(0.0F, -1.975F, 0.125F);
            rightfoot.setRotationPoint(-0.1308F, 6.2913F, 0.6363F);
            righthand.setRotationPoint(-0.2F, 0.375F, 0.0F);
            rightleg1.setRotationPoint(-1.7454F, -0.4555F, 0.2462F);
            rightleg2.setRotationPoint(0.3135F, 4.5915F, -0.425F);
            rightlegwing1.setRotationPoint(-0.1567F, 3.2956F, 1.7027F);
            rightlegwing2.setRotationPoint(0.5166F, 2.1211F, 1.0845F);
            rightwing1.setRotationPoint(-2.0F, -1.8912F, -6.4374F);
            rightwing1membrane.setRotationPoint(-2.925F, 0.325F, 0.4F);
            rightwing1planemembrane.setRotationPoint(-1.75F, 0.275F, 6.0F);
            rightwing2.setRotationPoint(-6.675F, 0.075F, 0.25F);
            rightwing2membrane.setRotationPoint(0.125F, -0.025F, -0.325F);
            rightwing2planemembrane.setRotationPoint(-4.5F, 0.4F, 6.225F);
            rightwing3.setRotationPoint(-8.75F, -0.05F, -0.3F);
            rightwing3membrane.setRotationPoint(0.0F, 0.0F, 0.05F);
            rightwing3planemembrane.setRotationPoint(-3.5F, 0.4F, 5.0F);
            rightwing4.setRotationPoint(-6.9F, 0.0F, 0.0F);
            rightwing4membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
            rightwing4planemembrane.setRotationPoint(-6.5F, 0.15F, 5.5F);
            rightwing5.setRotationPoint(-11.9F, 0.0F, 0.0F);
            rightwing5membrane.setRotationPoint(0.0F, 0.0F, 1.5F);
            rightwing6.setRotationPoint(-11.0935F, 0.1091F, -0.4648F);
            rightwing6membrane.setRotationPoint(0.0F, 0.0F, 2.0F);
            setRotateAngle(body, -0.2618F, 0.0F, 0.0F);
            setRotateAngle(cube1_r1, -0.2443F, 0.0F, 0.0F);
            setRotateAngle(cube2_r1, -0.2443F, 0.0F, 0.0F);
            setRotateAngle(cube3_r1, -0.1047F, 0.0F, 0.0F);
            setRotateAngle(cube38_r1, -0.1309F, 0.0F, 0.0F);
            setRotateAngle(cube39_r1, -0.4363F, 0.0F, 0.0F);
            setRotateAngle(cube40_r1, 0.6589F, 0.0F, 0.0F);
            setRotateAngle(cube41_r1, -0.672F, 0.0F, 0.0F);
            setRotateAngle(cube42_r1, 0.9032F, 0.0F, 0.0F);
            setRotateAngle(cube45_r1, 0.0F, 0.0F, -0.3491F);
            setRotateAngle(cube46_r1, 0.0F, 0.0F, 0.3491F);
            setRotateAngle(cube48_r1, -0.0873F, 0.0F, 0.0F);
            setRotateAngle(cube49_r1, -0.0865F, -0.0114F, -0.1304F);
            setRotateAngle(cube50_r1, -0.2559F, -0.056F, -0.211F);
            setRotateAngle(cube51_r1, -0.5888F, -0.1733F, -0.2528F);
            setRotateAngle(cube52_r1, -0.0865F, 0.0114F, 0.1304F);
            setRotateAngle(cube53_r1, -0.2559F, 0.056F, 0.211F);
            setRotateAngle(cube54_r1, -0.5888F, 0.1733F, 0.2528F);
            setRotateAngle(cube58_r1, 0.1789F, 0.0F, 0.0F);
            setRotateAngle(cube59_r1, 0.0873F, 0.0F, 0.0F);
            setRotateAngle(cube60_r1, -0.2182F, 0.0F, 0.0F);
            setRotateAngle(cube61_r1, 0.1614F, 0.0F, 0.0F);
            setRotateAngle(cube64_r1, 0.0F, 0.0F, 0.3491F);
            setRotateAngle(cube65_r1, 0.0F, 0.0F, -0.3491F);
            setRotateAngle(cube68_r1, -0.0873F, 0.0F, 0.0F);
            setRotateAngle(cube69_r1, -0.2618F, 0.0F, 0.0F);
            setRotateAngle(cube70_r1, 0.0916F, 0.0F, 0.0F);
            setRotateAngle(cube71_r1, -0.0843F, 0.0226F, 0.2608F);
            setRotateAngle(cube72_r1, -0.0843F, -0.0226F, -0.2608F);
            setRotateAngle(cube73_r1, -0.3927F, 0.0F, 0.0F);
            setRotateAngle(cube74_r1, 0.242F, 0.1453F, 0.5277F);
            setRotateAngle(cube75_r1, 0.242F, -0.1453F, -0.5277F);
            setRotateAngle(head, 0.1963F, 0.0F, 0.0F);
            setRotateAngle(hips, 0.3098F, 0.0F, 0.0F);
            setRotateAngle(leftfoot, 1.1254F, 0.0804F, -0.024F);
            setRotateAngle(lefthand, 0.5806F, 0.825F, 0.3218F);
            setRotateAngle(leftleg1, 0.1323F, -0.1934F, -1.7129F);
            setRotateAngle(leftleg2, 0.9936F, -0.1689F, 0.1602F);
            setRotateAngle(leftlegwing1, -0.0141F, 0.0F, 0.0F);
            setRotateAngle(leftlegwing2, 0.1367F, 0.0F, 0.0F);
            setRotateAngle(leftwing1, -0.1063F, 0.0897F, -0.1075F);
            setRotateAngle(leftwing1membrane, -0.0884F, 0.1959F, -0.0936F);
            setRotateAngle(leftwing1planemembrane, -0.0393F, 0.0F, 0.0F);
            setRotateAngle(leftwing2, 0.0033F, 0.1483F, -0.0216F);
            setRotateAngle(leftwing2membrane, -0.0218F, 0.0742F, 0.0F);
            setRotateAngle(leftwing2planemembrane, -0.1658F, -0.0016F, -0.013F);
            setRotateAngle(leftwing3, -0.0018F, -0.0523F, 0.0786F);
            setRotateAngle(leftwing3planemembrane, -0.1309F, 0.0F, 0.0F);
            setRotateAngle(leftwing4, -0.0222F, -0.3484F, 0.065F);
            setRotateAngle(leftwing4planemembrane, -0.0873F, 0.0F, 0.0F);
            setRotateAngle(leftwing5, -0.0222F, -0.2171F, 0.1028F);
            setRotateAngle(leftwing6, -0.0193F, -0.1997F, 0.1113F);
            setRotateAngle(neck, -0.2836F, 0.0F, 0.0F);
            setRotateAngle(rightfoot, 1.1254F, -0.0804F, 0.024F);
            setRotateAngle(righthand, 0.5806F, -0.825F, -0.3218F);
            setRotateAngle(rightleg1, 0.1323F, 0.1934F, 1.7129F);
            setRotateAngle(rightleg2, 0.9936F, 0.1689F, -0.1602F);
            setRotateAngle(rightlegwing1, -0.0141F, 0.0F, 0.0F);
            setRotateAngle(rightlegwing2, 0.1367F, 0.0F, 0.0F);
            setRotateAngle(rightwing1, -0.1063F, -0.0897F, 0.1075F);
            setRotateAngle(rightwing1membrane, -0.0884F, -0.1959F, 0.0936F);
            setRotateAngle(rightwing1planemembrane, -0.0393F, 0.0F, 0.0F);
            setRotateAngle(rightwing2, 0.0033F, -0.1483F, 0.0216F);
            setRotateAngle(rightwing2membrane, -0.0218F, -0.0742F, 0.0F);
            setRotateAngle(rightwing2planemembrane, -0.1658F, 0.0016F, 0.013F);
            setRotateAngle(rightwing3, -0.0018F, 0.0523F, -0.0786F);
            setRotateAngle(rightwing3planemembrane, -0.1309F, 0.0F, 0.0F);
            setRotateAngle(rightwing4, -0.0222F, 0.3484F, -0.065F);
            setRotateAngle(rightwing4planemembrane, -0.0873F, 0.0F, 0.0F);
            setRotateAngle(rightwing5, -0.0222F, 0.2171F, -0.1028F);
            setRotateAngle(rightwing6, -0.0193F, 0.1997F, -0.1113F);
            setRotateAngle(shoulder, 0.2182F, 0.0F, 0.0F);
            setRotateAngle(tail, -0.1222F, 0.0F, 0.0F);
            setRotateAngle(throat, -0.6196F, 0.0F, 0.0F);
            shoulder.setRotationPoint(0.0F, -0.7412F, -5.8124F);
            tail.setRotationPoint(0.0F, -0.6F, 1.0F);
            tail1.setRotationPoint(0.0F, 0.4143F, 1.8284F);
            throat.setRotationPoint(0.0F, 0.95F, -1.4F);


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
        EntityPrehistoricFloraAnhanguera entity = (EntityPrehistoricFloraAnhanguera) entitylivingbaseIn;
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
        EntityPrehistoricFloraAnhanguera entity = (EntityPrehistoricFloraAnhanguera) entitylivingbaseIn;
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
        EntityPrehistoricFloraAnhanguera entity = (EntityPrehistoricFloraAnhanguera) entitylivingbaseIn;
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

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnhanguera entity = (EntityPrehistoricFloraAnhanguera) entitylivingbaseIn;
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

        this.setRotateAngle(shoulder, shoulder.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*1), shoulder.rotateAngleY + (float) Math.toRadians(0), shoulder.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*1), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



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


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnhanguera e = (EntityPrehistoricFloraAnhanguera) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.move(cube49_r1, ((1.0F)-(1.0F)), ((-0.1051F)-(-0.105F)),((-11.6117F)-(-11.6117F)));
        animator.move(cube51_r1, ((0.75F)-(0.75F)), ((-0.7531F)-(-0.753F)),((-14.6153F)-(-14.6153F)));
        animator.move(cube52_r1, ((0.0F)-(0.0F)), ((-0.1051F)-(-0.105F)),((-11.6117F)-(-11.6117F)));
        animator.move(cube54_r1, ((0.25F)-(0.25F)), ((-0.7531F)-(-0.753F)),((-14.6153F)-(-14.6153F)));
        animator.move(cube61_r1, ((0.975F)-(0.975F)), ((-2.0166F)-(-2.0165F)),((-10.4807F)-(-10.4807F)));
        animator.move(cube69_r1, ((1.0F)-(1.0F)), ((0.477F)-(0.4771F)),((-11.9772F)-(-11.9772F)));
        animator.move(cube73_r1, ((0.5F)-(0.5F)), ((0.477F)-(0.4771F)),((-11.9772F)-(-11.9772F)));
        animator.move(head, ((-0.5F)-(-0.5F)), ((-1.7259F)-(-2.8509F)),((-5.4142F)-(-5.4142F)));
        animator.rotate(head, ((0.1963F)-(0.829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((0.3098F)-(-0.2138F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((1.1254F)-(-0.7884F)), ((0.0804F)-(0.0341F)),((-0.024F)-(-0.0703F)));
        animator.rotate(lefthand, ((0.5806F)-(-1.5534F)), ((0.825F)-(0.0793F)),((0.3218F)-(-1.6385F)));
        animator.rotate(leftleg1, ((0.1323F)-(-0.1617F)), ((-0.1934F)-(-0.3296F)),((-1.7129F)-(-0.375F)));
        animator.rotate(leftleg2, ((0.9936F)-(1.2309F)), ((-0.1689F)-(0.0429F)),((0.1602F)-(0.3343F)));
        animator.rotate(leftwing1, ((-0.1063F)-(-0.2875F)), ((0.0897F)-(-0.6908F)),((-0.1075F)-(-0.8886F)));
        animator.rotate(leftwing2, ((0.0033F)-(0.4638F)), ((0.1483F)-(-0.4369F)),((-0.0216F)-(2.215F)));
        animator.rotate(leftwing3, ((-0.0018F)-(-0.0151F)), ((-0.0523F)-(-0.5525F)),((0.0786F)-(0.3F)));
        animator.rotate(leftwing4, ((-0.0222F)-(-2.9433F)), ((-0.3484F)-(-1.4943F)),((0.065F)-(2.923F)));
        animator.rotate(leftwing5, ((-0.0222F)-(-0.0782F)), ((-0.2171F)-(-1.2897F)),((0.1028F)-(0.1732F)));
        animator.rotate(neck, ((-0.2836F)-(0.0829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((1.1254F)-(-0.7884F)), ((-0.0804F)-(-0.0341F)),((0.024F)-(0.0703F)));
        animator.rotate(righthand, ((0.5806F)-(-1.5534F)), ((-0.825F)-(-0.0793F)),((-0.3218F)-(1.6385F)));
        animator.rotate(rightleg1, ((0.1323F)-(-0.1617F)), ((0.1934F)-(0.3296F)),((1.7129F)-(0.375F)));
        animator.rotate(rightleg2, ((0.9936F)-(1.2309F)), ((0.1689F)-(-0.0429F)),((-0.1602F)-(-0.3343F)));
        animator.rotate(rightwing1, ((-0.1063F)-(-0.2875F)), ((-0.0897F)-(0.6908F)),((0.1075F)-(0.8886F)));
        animator.rotate(rightwing2, ((0.0033F)-(0.4638F)), ((-0.1483F)-(0.4369F)),((0.0216F)-(-2.215F)));
        animator.rotate(rightwing3, ((-0.0018F)-(-0.0151F)), ((0.0523F)-(0.5525F)),((-0.0786F)-(-0.3F)));
        animator.rotate(rightwing4, ((-0.0222F)-(-2.9433F)), ((0.3484F)-(1.4943F)),((-0.065F)-(-2.923F)));
        animator.rotate(rightwing5, ((-0.0222F)-(-0.0782F)), ((0.2171F)-(1.2897F)),((-0.1028F)-(-0.1732F)));
        animator.rotate(shoulder, ((0.2182F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((-0.6196F)-(-1.0036F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.move(throat, ((0.0F)-(0.0F)), ((0.95F)-(1.0F)),((-1.4F)-(-3.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.move(cube49_r1, -((1.0F)-(1.0F)), -((-0.1051F)-(-0.105F)),-((-11.6117F)-(-11.6117F)));
        animator.move(cube51_r1, -((0.75F)-(0.75F)), -((-0.7531F)-(-0.753F)),-((-14.6153F)-(-14.6153F)));
        animator.move(cube52_r1, -((0.0F)-(0.0F)), -((-0.1051F)-(-0.105F)),-((-11.6117F)-(-11.6117F)));
        animator.move(cube54_r1, -((0.25F)-(0.25F)), -((-0.7531F)-(-0.753F)),-((-14.6153F)-(-14.6153F)));
        animator.move(cube61_r1, -((0.975F)-(0.975F)), -((-2.0166F)-(-2.0165F)),-((-10.4807F)-(-10.4807F)));
        animator.move(cube69_r1, -((1.0F)-(1.0F)), -((0.477F)-(0.4771F)),-((-11.9772F)-(-11.9772F)));
        animator.move(cube73_r1, -((0.5F)-(0.5F)), -((0.477F)-(0.4771F)),-((-11.9772F)-(-11.9772F)));
        animator.move(head, -((-0.5F)-(-0.5F)), -((-1.7259F)-(-2.8509F)),-((-5.4142F)-(-5.4142F)));
        animator.rotate(head, -((0.1963F)-(0.829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((0.3098F)-(-0.2138F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((1.1254F)-(-0.7884F)), -((0.0804F)-(0.0341F)),-((-0.024F)-(-0.0703F)));
        animator.rotate(lefthand, -((0.5806F)-(-1.5534F)), -((0.825F)-(0.0793F)),-((0.3218F)-(-1.6385F)));
        animator.rotate(leftleg1, -((0.1323F)-(-0.1617F)), -((-0.1934F)-(-0.3296F)),-((-1.7129F)-(-0.375F)));
        animator.rotate(leftleg2, -((0.9936F)-(1.2309F)), -((-0.1689F)-(0.0429F)),-((0.1602F)-(0.3343F)));
        animator.rotate(leftwing1, -((-0.1063F)-(-0.2875F)), -((0.0897F)-(-0.6908F)),-((-0.1075F)-(-0.8886F)));
        animator.rotate(leftwing2, -((0.0033F)-(0.4638F)), -((0.1483F)-(-0.4369F)),-((-0.0216F)-(2.215F)));
        animator.rotate(leftwing3, -((-0.0018F)-(-0.0151F)), -((-0.0523F)-(-0.5525F)),-((0.0786F)-(0.3F)));
        animator.rotate(leftwing4, -((-0.0222F)-(-2.9433F)), -((-0.3484F)-(-1.4943F)),-((0.065F)-(2.923F)));
        animator.rotate(leftwing5, -((-0.0222F)-(-0.0782F)), -((-0.2171F)-(-1.2897F)),-((0.1028F)-(0.1732F)));
        animator.rotate(neck, -((-0.2836F)-(0.0829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((1.1254F)-(-0.7884F)), -((-0.0804F)-(-0.0341F)),-((0.024F)-(0.0703F)));
        animator.rotate(righthand, -((0.5806F)-(-1.5534F)), -((-0.825F)-(-0.0793F)),-((-0.3218F)-(1.6385F)));
        animator.rotate(rightleg1, -((0.1323F)-(-0.1617F)), -((0.1934F)-(0.3296F)),-((1.7129F)-(0.375F)));
        animator.rotate(rightleg2, -((0.9936F)-(1.2309F)), -((0.1689F)-(-0.0429F)),-((-0.1602F)-(-0.3343F)));
        animator.rotate(rightwing1, -((-0.1063F)-(-0.2875F)), -((-0.0897F)-(0.6908F)),-((0.1075F)-(0.8886F)));
        animator.rotate(rightwing2, -((0.0033F)-(0.4638F)), -((-0.1483F)-(0.4369F)),-((0.0216F)-(-2.215F)));
        animator.rotate(rightwing3, -((-0.0018F)-(-0.0151F)), -((0.0523F)-(0.5525F)),-((-0.0786F)-(-0.3F)));
        animator.rotate(rightwing4, -((-0.0222F)-(-2.9433F)), -((0.3484F)-(1.4943F)),-((-0.065F)-(-2.923F)));
        animator.rotate(rightwing5, -((-0.0222F)-(-0.0782F)), -((0.2171F)-(1.2897F)),-((-0.1028F)-(-0.1732F)));
        animator.rotate(shoulder, -((0.2182F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((-0.6196F)-(-1.0036F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.move(throat, -((0.0F)-(0.0F)), -((0.95F)-(1.0F)),-((-1.4F)-(-3.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
