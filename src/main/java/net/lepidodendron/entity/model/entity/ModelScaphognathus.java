package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraScaphognathus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelScaphognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer rightlegwing;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer leftlegwing;
    private final AdvancedModelRenderer wing1left;
    private final AdvancedModelRenderer wing2left;
    private final AdvancedModelRenderer wing3left;
    private final AdvancedModelRenderer wing4left;
    private final AdvancedModelRenderer leftmembranetip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer handR2;
    private final AdvancedModelRenderer leftmembranemiddle;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer wing1right;
    private final AdvancedModelRenderer wing2right;
    private final AdvancedModelRenderer wing3right;
    private final AdvancedModelRenderer wing4right;
    private final AdvancedModelRenderer rightmembranetip;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer handR3;
    private final AdvancedModelRenderer rightmembranemiddle;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelScaphognathus() {
        this.textureWidth = 54;
        this.textureHeight = 54;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 1.575F, 2.0F);


        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 16.5F, -3.45F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0456F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 26, 34, -2.0F, -1.9757F, -1.0003F, 4, 4, 4, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.4257F, 2.1997F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 16, 0, -1.5F, -0.2606F, -1.0184F, 3, 3, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.0394F, 2.0816F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 42, 37, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.05F, 4.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 45, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 42, 37, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 28, 0.0F, -1.0F, 3.25F, 0, 2, 4, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.0F, 1.2894F, 2.3816F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.2799F, -0.1238F, -0.9067F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 28, 28, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.15F, 2.65F, -0.525F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7176F, -0.0895F, 0.9739F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 9, 44, -0.5F, -0.2F, -0.5F, 1, 5, 1, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.05F, 0.025F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.3731F, -0.0277F, -0.0444F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 16, 7, -1.0F, -0.75F, -3.0F, 2, 1, 4, 0.0F, false));

        this.rightlegwing = new AdvancedModelRenderer(this);
        this.rightlegwing.setRotationPoint(-0.05F, 0.2F, 0.4F);
        this.leftleg2.addChild(rightlegwing);
        this.setRotateAngle(rightlegwing, -0.0911F, 0.0F, 0.0F);
        this.rightlegwing.cubeList.add(new ModelBox(rightlegwing, 11, 27, 0.0F, -0.25F, 0.0F, 0, 5, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.0F, 1.2894F, 2.3816F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2799F, 0.1238F, 0.9067F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 28, 28, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.15F, 2.65F, -0.525F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7176F, 0.0895F, -0.9739F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 9, 44, -0.5F, -0.2F, -0.5F, 1, 5, 1, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.05F, 0.025F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.3731F, 0.0277F, 0.0444F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 16, 7, -1.0F, -0.75F, -3.0F, 2, 1, 4, 0.0F, true));

        this.leftlegwing = new AdvancedModelRenderer(this);
        this.leftlegwing.setRotationPoint(0.05F, 0.2F, 0.4F);
        this.rightleg2.addChild(leftlegwing);
        this.setRotateAngle(leftlegwing, -0.0911F, 0.0F, 0.0F);
        this.leftlegwing.cubeList.add(new ModelBox(leftlegwing, 11, 27, 0.0F, -0.25F, 0.0F, 0, 5, 2, 0.0F, true));

        this.wing1left = new AdvancedModelRenderer(this);
        this.wing1left.setRotationPoint(1.85F, -0.1757F, -1.1003F);
        this.chest.addChild(wing1left);
        this.setRotateAngle(wing1left, 0.0F, 0.0F, 0.0393F);
        this.wing1left.cubeList.add(new ModelBox(wing1left, 26, 43, -1.5F, -0.5F, 0.0F, 5, 1, 4, 0.0F, false));

        this.wing2left = new AdvancedModelRenderer(this);
        this.wing2left.setRotationPoint(2.975F, 0.025F, 0.0F);
        this.wing1left.addChild(wing2left);
        this.setRotateAngle(wing2left, -0.0175F, 0.0F, -0.0175F);
        this.wing2left.cubeList.add(new ModelBox(wing2left, 1, 0, -0.5F, 0.0F, 0.0F, 1, 6, 4, 0.01F, false));

        this.wing3left = new AdvancedModelRenderer(this);
        this.wing3left.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.wing2left.addChild(wing3left);
        this.setRotateAngle(wing3left, -0.0179F, 0.0865F, -0.0114F);
        this.wing3left.cubeList.add(new ModelBox(wing3left, 38, 8, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.wing4left = new AdvancedModelRenderer(this);
        this.wing4left.setRotationPoint(-0.1F, 0.0F, 5.7F);
        this.wing3left.addChild(wing4left);
        this.setRotateAngle(wing4left, 1.4683F, 0.0F, 0.0F);
        this.wing4left.cubeList.add(new ModelBox(wing4left, 0, 15, -0.5F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));

        this.leftmembranetip = new AdvancedModelRenderer(this);
        this.leftmembranetip.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.wing4left.addChild(leftmembranetip);
        this.leftmembranetip.cubeList.add(new ModelBox(leftmembranetip, 0, 0, -0.5F, -2.5F, -9.0F, 1, 2, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.925F, -2.475F);
        this.leftmembranetip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.2051F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 11, -0.025F, -4.0F, -6.0F, 0, 4, 12, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 7, 0.0F, -4.0F, -6.0F, 0, 4, 12, 0.0F, false));

        this.handR2 = new AdvancedModelRenderer(this);
        this.handR2.setRotationPoint(-0.0827F, -0.4072F, 0.1062F);
        this.wing3left.addChild(handR2);
        this.setRotateAngle(handR2, 0.0584F, 0.8015F, -3.085F);
        this.handR2.cubeList.add(new ModelBox(handR2, 35, 31, -2.022F, -0.4346F, -0.2241F, 2, 1, 1, 0.0F, false));

        this.leftmembranemiddle = new AdvancedModelRenderer(this);
        this.leftmembranemiddle.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.wing3left.addChild(leftmembranemiddle);
        this.leftmembranemiddle.cubeList.add(new ModelBox(leftmembranemiddle, 39, 16, -0.5F, -3.5F, -3.75F, 1, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.15F, -3.575F, -0.725F);
        this.leftmembranemiddle.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3447F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, -0.075F, -4.5F, -3.0F, 0, 5, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 42, 0.0F, -4.5F, -3.0F, 0, 5, 6, 0.0F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(-0.9005F, 0.875F, 6.6307F);
        this.wing2left.addChild(leftmembrane);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.9005F, 1.5F, -2.8557F);
        this.leftmembrane.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 28, 0.0805F, -6.5F, -0.0086F, 0, 10, 6, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, 0.1305F, -6.5F, -0.0086F, 0, 10, 6, 0.0F, false));

        this.wing1right = new AdvancedModelRenderer(this);
        this.wing1right.setRotationPoint(-1.85F, -0.1757F, -1.1003F);
        this.chest.addChild(wing1right);
        this.setRotateAngle(wing1right, 0.0F, 0.0F, -0.0393F);
        this.wing1right.cubeList.add(new ModelBox(wing1right, 26, 43, -3.5F, -0.5F, 0.0F, 5, 1, 4, 0.0F, true));

        this.wing2right = new AdvancedModelRenderer(this);
        this.wing2right.setRotationPoint(-2.975F, 0.025F, 0.0F);
        this.wing1right.addChild(wing2right);
        this.setRotateAngle(wing2right, -0.0175F, 0.0F, 0.0175F);
        this.wing2right.cubeList.add(new ModelBox(wing2right, 1, 0, -0.5F, 0.0F, 0.0F, 1, 6, 4, 0.01F, true));

        this.wing3right = new AdvancedModelRenderer(this);
        this.wing3right.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.wing2right.addChild(wing3right);
        this.setRotateAngle(wing3right, -0.0179F, -0.0865F, 0.0114F);
        this.wing3right.cubeList.add(new ModelBox(wing3right, 38, 8, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, true));

        this.wing4right = new AdvancedModelRenderer(this);
        this.wing4right.setRotationPoint(0.1F, 0.0F, 5.7F);
        this.wing3right.addChild(wing4right);
        this.setRotateAngle(wing4right, 1.4683F, 0.0F, 0.0F);
        this.wing4right.cubeList.add(new ModelBox(wing4right, 0, 15, -0.5F, -1.0F, 0.0F, 1, 1, 13, 0.0F, true));

        this.rightmembranetip = new AdvancedModelRenderer(this);
        this.rightmembranetip.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.wing4right.addChild(rightmembranetip);
        this.rightmembranetip.cubeList.add(new ModelBox(rightmembranetip, 0, 0, -0.5F, -2.5F, -9.0F, 1, 2, 13, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.925F, -2.475F);
        this.rightmembranetip.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2051F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 11, 0.025F, -4.0F, -6.0F, 0, 4, 12, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 7, 0.0F, -4.0F, -6.0F, 0, 4, 12, 0.0F, true));

        this.handR3 = new AdvancedModelRenderer(this);
        this.handR3.setRotationPoint(0.0827F, -0.4072F, 0.1062F);
        this.wing3right.addChild(handR3);
        this.setRotateAngle(handR3, 0.0584F, -0.8015F, 3.085F);
        this.handR3.cubeList.add(new ModelBox(handR3, 35, 31, 0.022F, -0.4346F, -0.2241F, 2, 1, 1, 0.0F, true));

        this.rightmembranemiddle = new AdvancedModelRenderer(this);
        this.rightmembranemiddle.setRotationPoint(0.0F, -0.5F, 3.75F);
        this.wing3right.addChild(rightmembranemiddle);
        this.rightmembranemiddle.cubeList.add(new ModelBox(rightmembranemiddle, 39, 16, -0.5F, -3.5F, -3.75F, 1, 3, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.15F, -3.575F, -0.725F);
        this.rightmembranemiddle.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.3447F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, 0.075F, -4.5F, -3.0F, 0, 5, 6, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 42, 0.0F, -4.5F, -3.0F, 0, 5, 6, 0.0F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(0.9005F, 0.875F, 6.6307F);
        this.wing2right.addChild(rightmembrane);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.9005F, 1.5F, -2.8557F);
        this.rightmembrane.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 28, -0.0805F, -6.5F, -0.0086F, 0, 10, 6, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 28, -0.1305F, -6.5F, -0.0086F, 0, 10, 6, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.2243F, -0.3003F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, 0.0305F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 13, -1.5F, -2.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.05F, -2.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5061F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 29, 7, -1.0F, -0.75F, -3.0F, 2, 2, 3, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 39, 32, -1.0F, 0.05F, -3.0F, 2, 2, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.775F, -2.925F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.6589F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 18, -1.0F, 0.3839F, -4.8589F, 2, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 47, -1.5F, -0.5661F, -0.8839F, 3, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 0, -0.5F, 0.4839F, -6.7839F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3636F, 1.2636F, -5.1706F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0322F, -0.0295F, 0.7413F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 27, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.3636F, 1.2636F, -5.1706F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0322F, 0.0295F, -0.7413F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 27, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.504F, -6.21F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0387F, -0.0201F, 0.4796F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 27, 0.0F, -0.7019F, -0.5436F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.504F, -6.21F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0387F, 0.0201F, -0.4796F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 27, 0.0F, -0.7019F, -0.5436F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5589F, -2.0839F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 6, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6966F, -7.0938F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1789F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 26, -1.5F, 0.0F, 5.0F, 3, 2, 2, -0.03F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5466F, -6.7438F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1789F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 47, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3839F, -1.8839F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 31, -1.5F, 0.0F, 0.0F, 3, 1, 2, -0.01F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -0.975F);
        this.jaw.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 17, 29, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.jaw2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2705F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 2, -1.0F, -1.3F, -0.75F, 2, 1, 4, -0.03F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.0873F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 40, 2, -0.5F, 0.0F, -1.925F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.0F, -1.4F);
        this.jaw3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2618F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 27, 0.0F, -0.25F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.0F, -1.4F);
        this.jaw3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.48F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 27, 0.0F, -0.25F, 0.7F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, -1.4F);
        this.jaw3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.48F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 27, 0.0F, -0.25F, 0.7F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.0F, -1.4F);
        this.jaw3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.2618F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 27, 0.0F, -0.25F, -0.5F, 0, 1, 1, 0.0F, false));

        this.leftmembranetip.scaleChildren = true;
        this.leftmembranemiddle.scaleChildren = true;
        this.leftmembrane.scaleChildren = true;
        this.rightmembrane.scaleChildren = true;
        this.rightmembranetip.scaleChildren = true;
        this.rightmembranemiddle.scaleChildren = true;

        this.leftmembranetip.setScale((float)1,(float)0,(float)1);
        this.leftmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);
        this.leftmembrane.setScale((float)0,(float)1,(float)0);
        this.rightmembrane.setScale((float)0,(float)1,(float)0);
        this.rightmembranetip.setScale((float)1,(float)0,(float)1);
        this.rightmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.root.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.7F;
        this.root.offsetX = -0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(125);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        //this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3};

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
        EntityPrehistoricFloraScaphognathus ee = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!

            this.leftmembranetip.setScale((float)1,(float)1,(float)1);
            this.leftmembranemiddle.setScale((float)1,(float)1,(float)1);
            this.leftmembrane.setScale((float)1,(float)1,(float)1);
            this.rightmembrane.setScale((float)1,(float)1,(float)1);
            this.rightmembranetip.setScale((float)1,(float)1,(float)1);
            this.rightmembranemiddle.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(chest, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.2051F);
            this.setRotateAngle(cube_r10, 0.0387F, -0.0201F, 0.4796F);
            this.setRotateAngle(cube_r11, 0.0387F, 0.0201F, -0.4796F);
            this.setRotateAngle(cube_r12, 0.1047F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r13, 0.1789F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r14, 0.1789F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.2705F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.2618F);
            this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.48F);
            this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.48F);
            this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.2618F);
            this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3447F);
            this.setRotateAngle(cube_r3, 0.0F, 0.3491F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.2051F);
            this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.3447F);
            this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
            this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0322F, -0.0295F, 0.7413F);
            this.setRotateAngle(cube_r9, 0.0322F, 0.0295F, -0.7413F);
            this.setRotateAngle(handR2, 0.3258F, 1.0057F, -1.1709F);
            this.setRotateAngle(handR3, 0.3258F, -1.0057F, 1.1709F);
            this.setRotateAngle(head, 0.6589F, 0.0F, 0.0F);
            this.setRotateAngle(jaw3, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(leftfoot, 0.8442F, -0.0277F, -0.0444F);
            this.setRotateAngle(leftleg, 0.1616F, -0.0774F, -1.5522F);
            this.setRotateAngle(leftleg2, 0.8337F, -0.0491F, 0.1983F);
            this.setRotateAngle(leftlegwing, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(neck, 0.0305F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.5061F, 0.0F, 0.0F);
            this.setRotateAngle(rightfoot, 0.8442F, 0.0277F, 0.0444F);
            this.setRotateAngle(rightleg, 0.1616F, 0.0774F, 1.5522F);
            this.setRotateAngle(rightleg2, 0.8337F, 0.0491F, -0.1983F);
            this.setRotateAngle(rightlegwing, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(wing1left, 0.0F, 0.0F, -0.0305F);
            this.setRotateAngle(wing1right, 0.0F, 0.0F, 0.0305F);
            this.setRotateAngle(wing2left, -0.0175F, 0.0F, -1.6101F);
            this.setRotateAngle(wing2right, -0.0175F, 0.0F, 1.6101F);
            this.setRotateAngle(wing3left, -1.4734F, -0.0154F, 0.115F);
            this.setRotateAngle(wing3right, -1.4734F, 0.0154F, -0.115F);
            this.setRotateAngle(wing4left, 0.1639F, -0.0517F, -0.0085F);
            this.setRotateAngle(wing4right, 0.1639F, 0.0517F, 0.0085F);

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.leftmembranetip.setScale((float)1,(float)0,(float)1);
                this.leftmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);
                this.leftmembrane.setScale((float)0,(float)1,(float)0);
                this.rightmembrane.setScale((float)0,(float)1,(float)0);
                this.rightmembranetip.setScale((float)1,(float)0,(float)1);
                this.rightmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);

            }
            else {
                //Climb pose

                this.leftmembranetip.setScale((float)1,(float)0,(float)1);
                this.leftmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);
                this.leftmembrane.setScale((float)0,(float)1,(float)0);
                this.rightmembrane.setScale((float)0,(float)1,(float)0);
                this.rightmembranetip.setScale((float)1,(float)0,(float)1);
                this.rightmembranemiddle.setScale((float)0.5,(float)0.8,(float)1);

            }
        }

        if (ee.getAttachmentPos() == null || ee.getAttachmentFacing() == EnumFacing.UP) { //set wing membranes to their proper scale for flight

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
            else if (!ee.getHeadCollided()){
                //Climbing
                animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScaphognathus entity = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -17 + (((tickAnim - 4) / 5) * (12.46-(-17)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12.46 + (((tickAnim - 9) / 4) * (-7.8-(12.46)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.8 + (((tickAnim - 13) / 5) * (13.5-(-7.8)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 18) / 12) * (0-(13.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.25 + (((tickAnim - 4) / 4) * (1.02-(0.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1.02 + (((tickAnim - 8) / 5) * (2.89-(1.02)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.89 + (((tickAnim - 13) / 5) * (-2.5-(2.89)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -2.5 + (((tickAnim - 18) / 12) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -8.25 + (((tickAnim - 4) / 5) * (-14.25-(-8.25)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -14.25 + (((tickAnim - 9) / 4) * (-12.94-(-14.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12.94 + (((tickAnim - 13) / 5) * (0.25-(-12.94)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.25 + (((tickAnim - 18) / 7) * (12.86-(0.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 12.86 + (((tickAnim - 25) / 5) * (0-(12.86)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 18.75 + (((tickAnim - 4) / 3) * (31.25-(18.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 31.25 + (((tickAnim - 7) / 2) * (0-(31.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (33.75-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 33.75 + (((tickAnim - 13) / 5) * (0-(33.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (11.75-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 11.75 + (((tickAnim - 20) / 2) * (0-(11.75)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (11.75-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 11.75 + (((tickAnim - 23) / 2) * (0-(11.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (11.75-(0)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 11.75 + (((tickAnim - 27) / 1) * (0-(11.75)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*4 + (((tickAnim - 0) / 18) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*4)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500)) + (((tickAnim - 18) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500)))));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraScaphognathus entity = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 7 + (((tickAnim - 5) / 10) * (0-(7)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 5) / 5) * (24.63-(17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.63 + (((tickAnim - 10) / 5) * (0-(24.63)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.5 + (((tickAnim - 5) / 3) * (17.75-(8.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.75 + (((tickAnim - 8) / 2) * (24.00229-(17.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4248-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.61811-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24.00229 + (((tickAnim - 10) / 5) * (0-(24.00229)));
            yy = 0.4248 + (((tickAnim - 10) / 5) * (0-(0.4248)));
            zz = 0.61811 + (((tickAnim - 10) / 5) * (0-(0.61811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (0-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScaphognathus entity = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 50) / 38) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 38) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing1left.rotationPointX = this.wing1left.rotationPointX + (float)(xx);
        this.wing1left.rotationPointY = this.wing1left.rotationPointY - (float)(yy);
        this.wing1left.rotationPointZ = this.wing1left.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5 + (((tickAnim - 50) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-0.5-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8 + (((tickAnim - 50) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8)));
            yy = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 78) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5 + (((tickAnim - 0) / 78) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5)));
            zz = -8.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10))*8 + (((tickAnim - 0) / 78) * (4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5-(-8.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10))*8)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5 + (((tickAnim - 78) / 10) * (0-(4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-5)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (-0.8-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 99) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 41) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*1.5-(0)));
            zz = -0.8 + (((tickAnim - 99) / 41) * (-2.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-8-(-0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10 + (((tickAnim - 50) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10)));
            yy = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1 + (((tickAnim - 78) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-1)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 0) / 50) * (14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
            yy = 2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 0) / 50) * (2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = -7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20 + (((tickAnim - 0) / 50) * (-7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20-(-7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 50) / 28) * (0-(14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
            yy = 2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 50) / 28) * (0-(2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = -7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20 + (((tickAnim - 50) / 28) * (0-(-7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (-7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 38) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20)));
        }
        else if (tickAnim >= 88 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 88) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 88) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 88) / 20) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 108) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 32) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(xx), wing2left.rotateAngleY + (float) Math.toRadians(yy), wing2left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3left, wing3left.rotateAngleX + (float) Math.toRadians(xx), wing3left.rotateAngleY + (float) Math.toRadians(yy), wing3left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30)));
            zz = 0 + (((tickAnim - 50) / 38) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*30-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4left, wing4left.rotateAngleX + (float) Math.toRadians(xx), wing4left.rotateAngleY + (float) Math.toRadians(yy), wing4left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 50) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2 + (((tickAnim - 78) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5 + (((tickAnim - 50) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5)));
            yy = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2 + (((tickAnim - 78) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-100))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5 + (((tickAnim - 50) / 28) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5)));
            yy = 0 + (((tickAnim - 50) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 28) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2 + (((tickAnim - 78) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1 + (((tickAnim - 0) / 50) * (14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1-(14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1)));
            yy = 2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 0) / 50) * (2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = 7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20 + (((tickAnim - 0) / 50) * (7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20-(7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20)));
        }
        else if (tickAnim >= 50 && tickAnim < 78) {
            xx = 14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1 + (((tickAnim - 50) / 28) * (0-(14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1)));
            yy = 2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7 + (((tickAnim - 50) / 28) * (0-(2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7)));
            zz = 7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20 + (((tickAnim - 50) / 28) * (0-(7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20)));
        }
        else if (tickAnim >= 78 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 10) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (14.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*-1-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (2.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*7-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (7.7285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 50) / 38) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-7-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 38) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-0.5-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing1right.rotationPointX = this.wing1right.rotationPointX + (float)(xx);
        this.wing1right.rotationPointY = this.wing1right.rotationPointY - (float)(yy);
        this.wing1right.rotationPointZ = this.wing1right.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 38) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20)));
        }
        else if (tickAnim >= 88 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 88) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 88) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 88) / 20) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 108) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 32) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(xx), wing2right.rotateAngleY + (float) Math.toRadians(yy), wing2right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(xx), wing3right.rotateAngleY + (float) Math.toRadians(yy), wing3right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30 + (((tickAnim - 50) / 38) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30)));
            zz = 0 + (((tickAnim - 50) / 38) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 88) / 52) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-30-(0)));
            zz = 0 + (((tickAnim - 88) / 52) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4right, wing4right.rotateAngleX + (float) Math.toRadians(xx), wing4right.rotateAngleY + (float) Math.toRadians(yy), wing4right.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScaphognathus entity = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 39.34077 + (((tickAnim - 0) / 4) * (10.42526-(39.34077)));
            yy = 15.88047 + (((tickAnim - 0) / 4) * (4.45951-(15.88047)));
            zz = -12.89601 + (((tickAnim - 0) / 4) * (-31.22907-(-12.89601)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.42526 + (((tickAnim - 4) / 4) * (-19.6618-(10.42526)));
            yy = 4.45951 + (((tickAnim - 4) / 4) * (-1.6259-(4.45951)));
            zz = -31.22907 + (((tickAnim - 4) / 4) * (1.1759-(-31.22907)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.6618 + (((tickAnim - 8) / 2) * (-20.35494-(-19.6618)));
            yy = -1.6259 + (((tickAnim - 8) / 2) * (-2.7917-(-1.6259)));
            zz = 1.1759 + (((tickAnim - 8) / 2) * (-7.27785-(1.1759)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -20.35494 + (((tickAnim - 10) / 10) * (39.34077-(-20.35494)));
            yy = -2.7917 + (((tickAnim - 10) / 10) * (15.88047-(-2.7917)));
            zz = -7.27785 + (((tickAnim - 10) / 10) * (-12.89601-(-7.27785)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 10) / 10) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.25993 + (((tickAnim - 0) / 4) * (-9.01149-(11.25993)));
            yy = 10.37972 + (((tickAnim - 0) / 4) * (-8.33791-(10.37972)));
            zz = 4.53036 + (((tickAnim - 0) / 4) * (20.41657-(4.53036)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -9.01149 + (((tickAnim - 4) / 4) * (-19.10028-(-9.01149)));
            yy = -8.33791 + (((tickAnim - 4) / 4) * (-14.0309-(-8.33791)));
            zz = 20.41657 + (((tickAnim - 4) / 4) * (-6.4589-(20.41657)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.10028 + (((tickAnim - 8) / 2) * (-29.42322-(-19.10028)));
            yy = -14.0309 + (((tickAnim - 8) / 2) * (-15.47647-(-14.0309)));
            zz = -6.4589 + (((tickAnim - 8) / 2) * (3.61391-(-6.4589)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -29.42322 + (((tickAnim - 10) / 8) * (26.60943-(-29.42322)));
            yy = -15.47647 + (((tickAnim - 10) / 8) * (3.6505-(-15.47647)));
            zz = 3.61391 + (((tickAnim - 10) / 8) * (0.78563-(3.61391)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 26.60943 + (((tickAnim - 18) / 2) * (11.25993-(26.60943)));
            yy = 3.6505 + (((tickAnim - 18) / 2) * (10.37972-(3.6505)));
            zz = 0.78563 + (((tickAnim - 18) / 2) * (4.53036-(0.78563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.275 + (((tickAnim - 4) / 4) * (0-(0.275)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 64 + (((tickAnim - 0) / 4) * (33.75-(64)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 33.75 + (((tickAnim - 4) / 4) * (48.5-(33.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 48.5 + (((tickAnim - 8) / 2) * (43.25-(48.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 43.25 + (((tickAnim - 10) / 3) * (10.29486-(43.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (3.09371-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (6.83303-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.29486 + (((tickAnim - 13) / 7) * (64-(10.29486)));
            yy = 3.09371 + (((tickAnim - 13) / 7) * (0-(3.09371)));
            zz = 6.83303 + (((tickAnim - 13) / 7) * (0-(6.83303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 0) / 4) * (0.765-(-0.45)));
            zz = 0.125 + (((tickAnim - 0) / 4) * (0.06-(0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.765 + (((tickAnim - 4) / 4) * (0.525-(0.765)));
            zz = 0.06 + (((tickAnim - 4) / 4) * (0-(0.06)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 2) * (-0.325-(0.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.325 + (((tickAnim - 10) / 3) * (0.38-(-0.325)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.05-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.38 + (((tickAnim - 13) / 7) * (-0.45-(0.38)));
            zz = 0.05 + (((tickAnim - 13) / 7) * (0.125-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*0.3);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*2), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*4), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.90849 + (((tickAnim - 0) / 8) * (3.09052-(-1.90849)));
            yy = 13.32017 + (((tickAnim - 0) / 8) * (-24.86439-(13.32017)));
            zz = 7.42403 + (((tickAnim - 0) / 8) * (-4.50775-(7.42403)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 3.09052 + (((tickAnim - 8) / 5) * (-1.00407-(3.09052)));
            yy = -24.86439 + (((tickAnim - 8) / 5) * (3.99265-(-24.86439)));
            zz = -4.50775 + (((tickAnim - 8) / 5) * (-31.02389-(-4.50775)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -1.00407 + (((tickAnim - 13) / 5) * (-1.30301-(-1.00407)));
            yy = 3.99265 + (((tickAnim - 13) / 5) * (20.39433-(3.99265)));
            zz = -31.02389 + (((tickAnim - 13) / 5) * (10.08621-(-31.02389)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -1.30301 + (((tickAnim - 18) / 2) * (-1.90849-(-1.30301)));
            yy = 20.39433 + (((tickAnim - 18) / 2) * (13.32017-(20.39433)));
            zz = 10.08621 + (((tickAnim - 18) / 2) * (7.42403-(10.08621)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.24924 + (((tickAnim - 0) / 8) * (6.40185-(1.24924)));
            yy = -0.04362 + (((tickAnim - 0) / 8) * (1.92152-(-0.04362)));
            zz = -27.00048 + (((tickAnim - 0) / 8) * (-7.98872-(-27.00048)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6.40185 + (((tickAnim - 8) / 5) * (9.64837-(6.40185)));
            yy = 1.92152 + (((tickAnim - 8) / 5) * (-2.1003-(1.92152)));
            zz = -7.98872 + (((tickAnim - 8) / 5) * (16.03323-(-7.98872)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 9.64837 + (((tickAnim - 13) / 5) * (1.24924-(9.64837)));
            yy = -2.1003 + (((tickAnim - 13) / 5) * (-0.04362-(-2.1003)));
            zz = 16.03323 + (((tickAnim - 13) / 5) * (-27.00048-(16.03323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(xx), wing2left.rotateAngleY + (float) Math.toRadians(yy), wing2left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 8) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3left, wing3left.rotateAngleX + (float) Math.toRadians(xx), wing3left.rotateAngleY + (float) Math.toRadians(yy), wing3left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 0) / 8) * (12-(1.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12 + (((tickAnim - 8) / 5) * (-2.75-(12)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.75 + (((tickAnim - 13) / 5) * (1.75-(-2.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4left, wing4left.rotateAngleX + (float) Math.toRadians(xx), wing4left.rotateAngleY + (float) Math.toRadians(yy), wing4left.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0.325 + (((tickAnim - 0) / 8) * (0.425-(0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.425 + (((tickAnim - 8) / 10) * (0.325-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing4left.rotationPointX = this.wing4left.rotationPointX + (float)(xx);
        this.wing4left.rotationPointY = this.wing4left.rotationPointY - (float)(yy);
        this.wing4left.rotationPointZ = this.wing4left.rotationPointZ + (float)(zz);



        this.leftmembranetip.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -15.90382 + (((tickAnim - 0) / 8) * (14.08248-(-15.90382)));
            yy = 1.22976 + (((tickAnim - 0) / 8) * (-2.5792-(1.22976)));
            zz = 6.67262 + (((tickAnim - 0) / 8) * (48.8235-(6.67262)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.08248 + (((tickAnim - 8) / 5) * (29.92752-(14.08248)));
            yy = -2.5792 + (((tickAnim - 8) / 5) * (-10.22394-(-2.5792)));
            zz = 48.8235 + (((tickAnim - 8) / 5) * (72.254-(48.8235)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 29.92752 + (((tickAnim - 13) / 5) * (-15.90382-(29.92752)));
            yy = -10.22394 + (((tickAnim - 13) / 5) * (1.22976-(-10.22394)));
            zz = 72.254 + (((tickAnim - 13) / 5) * (6.67262-(72.254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembranemiddle.setScale((float)0.5,(float)0.8,(float)0.9);


        this.leftmembrane.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -20.35494 + (((tickAnim - 0) / 12) * (39.34077-(-20.35494)));
            yy = -2.79172 + (((tickAnim - 0) / 12) * (-15.8805-(-2.79172)));
            zz = -7.27785 + (((tickAnim - 0) / 12) * (12.896-(-7.27785)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 39.34077 + (((tickAnim - 12) / 2) * (13.74693-(39.34077)));
            yy = -15.8805 + (((tickAnim - 12) / 2) * (-7.67187-(-15.8805)));
            zz = 12.896 + (((tickAnim - 12) / 2) * (25.60448-(12.896)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 13.74693 + (((tickAnim - 14) / 4) * (-19.6618-(13.74693)));
            yy = -7.67187 + (((tickAnim - 14) / 4) * (1.62586-(-7.67187)));
            zz = 25.60448 + (((tickAnim - 14) / 4) * (-1.17595-(25.60448)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -19.6618 + (((tickAnim - 18) / 2) * (-20.35494-(-19.6618)));
            yy = 1.62586 + (((tickAnim - 18) / 2) * (-2.79172-(1.62586)));
            zz = -1.17595 + (((tickAnim - 18) / 2) * (-7.27785-(-1.17595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 12) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 14) / 4) * (0-(0.55)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -24.16671 + (((tickAnim - 0) / 8) * (26.60943-(-24.16671)));
            yy = 11.49032 + (((tickAnim - 0) / 8) * (-3.65046-(11.49032)));
            zz = 12.74669 + (((tickAnim - 0) / 8) * (0.78563-(12.74669)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 26.60943 + (((tickAnim - 8) / 4) * (11.25993-(26.60943)));
            yy = -3.65046 + (((tickAnim - 8) / 4) * (-10.3797-(-3.65046)));
            zz = 0.78563 + (((tickAnim - 8) / 4) * (-4.5304-(0.78563)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.25993 + (((tickAnim - 12) / 2) * (-4.4164-(11.25993)));
            yy = -10.3797 + (((tickAnim - 12) / 2) * (11.07522-(-10.3797)));
            zz = -4.5304 + (((tickAnim - 12) / 2) * (-14.02902-(-4.5304)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -4.4164 + (((tickAnim - 14) / 4) * (-19.10028-(-4.4164)));
            yy = 11.07522 + (((tickAnim - 14) / 4) * (14.03091-(11.07522)));
            zz = -14.02902 + (((tickAnim - 14) / 4) * (6.45888-(-14.02902)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -19.10028 + (((tickAnim - 18) / 2) * (-24.16671-(-19.10028)));
            yy = 14.03091 + (((tickAnim - 18) / 2) * (11.49032-(14.03091)));
            zz = 6.45888 + (((tickAnim - 18) / 2) * (12.74669-(6.45888)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.175 + (((tickAnim - 14) / 4) * (0-(-0.175)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
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
            xx = 39.5 + (((tickAnim - 0) / 5) * (0.31-(39.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0.31 + (((tickAnim - 5) / 7) * (64-(0.31)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 64 + (((tickAnim - 12) / 2) * (33.18208-(64)));
            yy = 0 + (((tickAnim - 12) / 2) * (-8.07719-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (-1.68269-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 33.18208 + (((tickAnim - 14) / 4) * (48.5-(33.18208)));
            yy = -8.07719 + (((tickAnim - 14) / 4) * (0-(-8.07719)));
            zz = -1.68269 + (((tickAnim - 14) / 4) * (0-(-1.68269)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 48.5 + (((tickAnim - 18) / 2) * (39.5-(48.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 3) * (0.975-(0.325)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.03-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.975 + (((tickAnim - 3) / 2) * (0.765-(0.975)));
            zz = 0.03 + (((tickAnim - 3) / 2) * (0.06-(0.03)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.765 + (((tickAnim - 5) / 7) * (-0.45-(0.765)));
            zz = 0.06 + (((tickAnim - 5) / 7) * (0.125-(0.06)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 12) / 2) * (0.57-(-0.45)));
            zz = 0.125 + (((tickAnim - 12) / 2) * (0.07-(0.125)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.57 + (((tickAnim - 14) / 4) * (0.525-(0.57)));
            zz = 0.07 + (((tickAnim - 14) / 4) * (0-(0.07)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 2) * (0.325-(0.525)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.71581 + (((tickAnim - 0) / 7) * (-3.87825-(8.71581)));
            yy = -4.98151 + (((tickAnim - 0) / 7) * (-22.10994-(-4.98151)));
            zz = 32.50433 + (((tickAnim - 0) / 7) * (-3.29048-(32.50433)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -3.87825 + (((tickAnim - 7) / 9) * (3.01615-(-3.87825)));
            yy = -22.10994 + (((tickAnim - 7) / 9) * (21.619-(-22.10994)));
            zz = -3.29048 + (((tickAnim - 7) / 9) * (4.31935-(-3.29048)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 3.01615 + (((tickAnim - 16) / 4) * (8.71581-(3.01615)));
            yy = 21.619 + (((tickAnim - 16) / 4) * (-4.98151-(21.619)));
            zz = 4.31935 + (((tickAnim - 16) / 4) * (32.50433-(4.31935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (6.48287-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.20627-(0)));
            zz = -13.25 + (((tickAnim - 0) / 7) * (19.50224-(-13.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 6.48287 + (((tickAnim - 7) / 9) * (7.35768-(6.48287)));
            yy = 0.20627 + (((tickAnim - 7) / 9) * (0.91569-(0.20627)));
            zz = 19.50224 + (((tickAnim - 7) / 9) * (14.03735-(19.50224)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 7.35768 + (((tickAnim - 16) / 2) * (10.17884-(7.35768)));
            yy = 0.91569 + (((tickAnim - 16) / 2) * (0.45785-(0.91569)));
            zz = 14.03735 + (((tickAnim - 16) / 2) * (4.14367-(14.03735)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.17884 + (((tickAnim - 18) / 2) * (0-(10.17884)));
            yy = 0.45785 + (((tickAnim - 18) / 2) * (0-(0.45785)));
            zz = 4.14367 + (((tickAnim - 18) / 2) * (-13.25-(4.14367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(xx), wing2right.rotateAngleY + (float) Math.toRadians(yy), wing2right.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 20) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing2right.rotationPointX = this.wing2right.rotationPointX + (float)(xx);
        this.wing2right.rotationPointY = this.wing2right.rotationPointY - (float)(yy);
        this.wing2right.rotationPointZ = this.wing2right.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -1.25 + (((tickAnim - 0) / 7) * (0.5-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0.5 + (((tickAnim - 7) / 9) * (-10.24-(0.5)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -10.24 + (((tickAnim - 16) / 4) * (-1.25-(-10.24)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(xx), wing3right.rotateAngleY + (float) Math.toRadians(yy), wing3right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -12.5 + (((tickAnim - 0) / 7) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 7) / 9) * (1.75-(0)));
            yy = 0 + (((tickAnim - 7) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 9) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 16) / 4) * (-12.5-(1.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4right, wing4right.rotateAngleX + (float) Math.toRadians(xx), wing4right.rotateAngleY + (float) Math.toRadians(yy), wing4right.rotateAngleZ + (float) Math.toRadians(zz));

        this.wing4right.rotationPointX = this.wing4right.rotationPointX + (float)(0);
        this.wing4right.rotationPointY = this.wing4right.rotationPointY - (float)(0);
        this.wing4right.rotationPointZ = this.wing4right.rotationPointZ + (float)(0.175);


        this.rightmembranetip.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-15.90382-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.22976-(0)));
            zz = -70.25 + (((tickAnim - 0) / 7) * (-6.6726-(-70.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 16) {
            xx = -15.90382 + (((tickAnim - 7) / 9) * (8.71199-(-15.90382)));
            yy = 1.22976 + (((tickAnim - 7) / 9) * (4.07774-(1.22976)));
            zz = -6.6726 + (((tickAnim - 7) / 9) * (-38.87561-(-6.6726)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 8.71199 + (((tickAnim - 16) / 4) * (0-(8.71199)));
            yy = 4.07774 + (((tickAnim - 16) / 4) * (0-(4.07774)));
            zz = -38.87561 + (((tickAnim - 16) / 4) * (-70.25-(-38.87561)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightmembranemiddle.setScale((float)0.5,(float)0.8,(float)0.9825);


        this.rightmembrane.setScale((float)0,(float)1,(float)0);

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraScaphognathus entity = (EntityPrehistoricFloraScaphognathus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-82.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*280))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+40))*2), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(6.725+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-2), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*3), body1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 30.68683 + (((tickAnim - 0) / 5) * (3.09225-(30.68683)));
            yy = 5.37351 + (((tickAnim - 0) / 5) * (-3.63663-(5.37351)));
            zz = -21.66431 + (((tickAnim - 0) / 5) * (-42.76925-(-21.66431)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.09225 + (((tickAnim - 5) / 5) * (-24.83979-(3.09225)));
            yy = -3.63663 + (((tickAnim - 5) / 5) * (0.6539-(-3.63663)));
            zz = -42.76925 + (((tickAnim - 5) / 5) * (-15.7381-(-42.76925)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -24.83979 + (((tickAnim - 10) / 15) * (30.68683-(-24.83979)));
            yy = 0.6539 + (((tickAnim - 10) / 15) * (5.37351-(0.6539)));
            zz = -15.7381 + (((tickAnim - 10) / 15) * (-21.66431-(-15.7381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-23.35091-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.50116-(0)));
            zz = -42.75 + (((tickAnim - 0) / 5) * (-36.76968-(-42.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -23.35091 + (((tickAnim - 5) / 5) * (0-(-23.35091)));
            yy = -2.50116 + (((tickAnim - 5) / 5) * (0-(-2.50116)));
            zz = -36.76968 + (((tickAnim - 5) / 5) * (-45.75-(-36.76968)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = -45.75 + (((tickAnim - 10) / 15) * (-42.75-(-45.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 5) / 20) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 20) * (0-(1)));
            zz = 0 + (((tickAnim - 5) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.73949 + (((tickAnim - 0) / 5) * (58.20224-(7.73949)));
            yy = 19.40854 + (((tickAnim - 0) / 5) * (8.96102-(19.40854)));
            zz = 67.99402 + (((tickAnim - 0) / 5) * (60.60767-(67.99402)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 58.20224 + (((tickAnim - 5) / 5) * (18.92244-(58.20224)));
            yy = 8.96102 + (((tickAnim - 5) / 5) * (0.603-(8.96102)));
            zz = 60.60767 + (((tickAnim - 5) / 5) * (54.6986-(60.60767)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 18.92244 + (((tickAnim - 10) / 15) * (7.73949-(18.92244)));
            yy = 0.603 + (((tickAnim - 10) / 15) * (19.40854-(0.603)));
            zz = 54.6986 + (((tickAnim - 10) / 15) * (67.99402-(54.6986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5+40))*-1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-80))*1), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-140))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*-0.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-190))*-3), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.35);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -9.49248 + (((tickAnim - 0) / 13) * (-4.82345-(-9.49248)));
            yy = 13.86449 + (((tickAnim - 0) / 13) * (-12.3555-(13.86449)));
            zz = -34.90675 + (((tickAnim - 0) / 13) * (-23.7276-(-34.90675)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -4.82345 + (((tickAnim - 13) / 6) * (-7.16501-(-4.82345)));
            yy = -12.3555 + (((tickAnim - 13) / 6) * (-0.68392-(-12.3555)));
            zz = -23.7276 + (((tickAnim - 13) / 6) * (-40.72716-(-23.7276)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -7.16501 + (((tickAnim - 19) / 6) * (-9.49248-(-7.16501)));
            yy = -0.68392 + (((tickAnim - 19) / 6) * (13.86449-(-0.68392)));
            zz = -40.72716 + (((tickAnim - 19) / 6) * (-34.90675-(-40.72716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.23372 + (((tickAnim - 0) / 5) * (-7.62771-(-12.23372)));
            yy = -0.63626 + (((tickAnim - 0) / 5) * (-1.96417-(-0.63626)));
            zz = -9.93181 + (((tickAnim - 0) / 5) * (-24.92476-(-9.93181)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -7.62771 + (((tickAnim - 5) / 8) * (0-(-7.62771)));
            yy = -1.96417 + (((tickAnim - 5) / 8) * (0-(-1.96417)));
            zz = -24.92476 + (((tickAnim - 5) / 8) * (-20-(-24.92476)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (-6.06244-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (-0.87546-(0)));
            zz = -20 + (((tickAnim - 13) / 6) * (-20.18654-(-20)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -6.06244 + (((tickAnim - 19) / 6) * (-12.23372-(-6.06244)));
            yy = -0.87546 + (((tickAnim - 19) / 6) * (-0.63626-(-0.87546)));
            zz = -20.18654 + (((tickAnim - 19) / 6) * (-9.93181-(-20.18654)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(xx), wing2left.rotateAngleY + (float) Math.toRadians(yy), wing2left.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing2left.rotationPointX = this.wing2left.rotationPointX + (float)(xx);
        this.wing2left.rotationPointY = this.wing2left.rotationPointY - (float)(yy);
        this.wing2left.rotationPointZ = this.wing2left.rotationPointZ + (float)(zz);



        this.leftmembranetip.setScale((float)0.4,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.92232 + (((tickAnim - 0) / 5) * (9.95729-(-0.92232)));
            yy = -29.71493 + (((tickAnim - 0) / 5) * (-36.26988-(-29.71493)));
            zz = 26.52255 + (((tickAnim - 0) / 5) * (72.55599-(26.52255)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 9.95729 + (((tickAnim - 5) / 8) * (-5.74453-(9.95729)));
            yy = -36.26988 + (((tickAnim - 5) / 8) * (-13.86571-(-36.26988)));
            zz = 72.55599 + (((tickAnim - 5) / 8) * (26.42647-(72.55599)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -5.74453 + (((tickAnim - 13) / 6) * (27.89686-(-5.74453)));
            yy = -13.86571 + (((tickAnim - 13) / 6) * (-42.1054-(-13.86571)));
            zz = 26.42647 + (((tickAnim - 13) / 6) * (80.72813-(26.42647)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 27.89686 + (((tickAnim - 19) / 6) * (-0.92232-(27.89686)));
            yy = -42.1054 + (((tickAnim - 19) / 6) * (-29.71493-(-42.1054)));
            zz = 80.72813 + (((tickAnim - 19) / 6) * (26.52255-(80.72813)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftmembranemiddle.setScale((float)1,(float)0.9,(float)1);


        this.leftmembrane.setScale((float)0,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -24.83979 + (((tickAnim - 0) / 13) * (30.68683-(-24.83979)));
            yy = -0.65387 + (((tickAnim - 0) / 13) * (-5.3735-(-0.65387)));
            zz = 15.73808 + (((tickAnim - 0) / 13) * (21.6643-(15.73808)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 30.68683 + (((tickAnim - 13) / 6) * (2.46489-(30.68683)));
            yy = -5.3735 + (((tickAnim - 13) / 6) * (1.11173-(-5.3735)));
            zz = 21.6643 + (((tickAnim - 13) / 6) * (33.81588-(21.6643)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 2.46489 + (((tickAnim - 19) / 6) * (-24.83979-(2.46489)));
            yy = 1.11173 + (((tickAnim - 19) / 6) * (-0.65387-(1.11173)));
            zz = 33.81588 + (((tickAnim - 19) / 6) * (15.73808-(33.81588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 45.75 + (((tickAnim - 0) / 13) * (42.75-(45.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 42.75 + (((tickAnim - 13) / 12) * (45.75-(42.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(0);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(0);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 18.92244 + (((tickAnim - 0) / 13) * (7.73949-(18.92244)));
            yy = -0.60296 + (((tickAnim - 0) / 13) * (-19.4085-(-0.60296)));
            zz = -54.69856 + (((tickAnim - 0) / 13) * (-67.994-(-54.69856)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 7.73949 + (((tickAnim - 13) / 6) * (31.9369-(7.73949)));
            yy = -19.4085 + (((tickAnim - 13) / 6) * (-35.64967-(-19.4085)));
            zz = -67.994 + (((tickAnim - 13) / 6) * (-90.98722-(-67.994)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 31.9369 + (((tickAnim - 19) / 6) * (18.92244-(31.9369)));
            yy = -35.64967 + (((tickAnim - 19) / 6) * (-0.60296-(-35.64967)));
            zz = -90.98722 + (((tickAnim - 19) / 6) * (-54.69856-(-90.98722)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0.35-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0.35 + (((tickAnim - 19) / 6) * (0-(0.35)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.82345 + (((tickAnim - 0) / 5) * (-6.97147-(-4.82345)));
            yy = 12.35552 + (((tickAnim - 0) / 5) * (1.79364-(12.35552)));
            zz = 23.7276 + (((tickAnim - 0) / 5) * (49.66069-(23.7276)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -6.97147 + (((tickAnim - 5) / 6) * (-9.49248-(-6.97147)));
            yy = 1.79364 + (((tickAnim - 5) / 6) * (-13.8645-(1.79364)));
            zz = 49.66069 + (((tickAnim - 5) / 6) * (34.9067-(49.66069)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -9.49248 + (((tickAnim - 11) / 14) * (-4.82345-(-9.49248)));
            yy = -13.8645 + (((tickAnim - 11) / 14) * (12.35552-(-13.8645)));
            zz = 34.9067 + (((tickAnim - 11) / 14) * (23.7276-(34.9067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6.06933-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.82622-(0)));
            zz = 20 + (((tickAnim - 0) / 5) * (4.2767-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -6.06933 + (((tickAnim - 5) / 6) * (-12.23372-(-6.06933)));
            yy = -0.82622 + (((tickAnim - 5) / 6) * (0.6363-(-0.82622)));
            zz = 4.2767 + (((tickAnim - 5) / 6) * (9.9318-(4.2767)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -12.23372 + (((tickAnim - 11) / 14) * (0-(-12.23372)));
            yy = 0.6363 + (((tickAnim - 11) / 14) * (0-(0.6363)));
            zz = 9.9318 + (((tickAnim - 11) / 14) * (20-(9.9318)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(xx), wing2right.rotateAngleY + (float) Math.toRadians(yy), wing2right.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.45 + (((tickAnim - 0) / 5) * (-0.23-(-0.45)));
            yy = 0.25 + (((tickAnim - 0) / 5) * (0.73-(0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.23 + (((tickAnim - 5) / 6) * (0-(-0.23)));
            yy = 0.73 + (((tickAnim - 5) / 6) * (0-(0.73)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (-0.45-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0.25-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing2right.rotationPointX = this.wing2right.rotationPointX + (float)(xx);
        this.wing2right.rotationPointY = this.wing2right.rotationPointY - (float)(yy);
        this.wing2right.rotationPointZ = this.wing2right.rotationPointZ + (float)(zz);



        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(0), wing3right.rotateAngleY + (float) Math.toRadians(0), wing3right.rotateAngleZ + (float) Math.toRadians(0));
        this.wing3right.rotationPointX = this.wing3right.rotationPointX + (float)(0);
        this.wing3right.rotationPointY = this.wing3right.rotationPointY - (float)(0);
        this.wing3right.rotationPointZ = this.wing3right.rotationPointZ + (float)(0);


        this.rightmembranetip.setScale((float)0.2,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.20237 + (((tickAnim - 0) / 5) * (28.7255-(-2.20237)));
            yy = 0.67563 + (((tickAnim - 0) / 5) * (12.08934-(0.67563)));
            zz = -25.70062 + (((tickAnim - 0) / 5) * (-72.46651-(-25.70062)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 28.7255 + (((tickAnim - 5) / 6) * (0-(28.7255)));
            yy = 12.08934 + (((tickAnim - 5) / 6) * (0-(12.08934)));
            zz = -72.46651 + (((tickAnim - 5) / 6) * (0-(-72.46651)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 11) / 14) * (-2.20237-(0)));
            yy = 0 + (((tickAnim - 11) / 14) * (0.67563-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (-25.70062-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 0) / 6) * (1-(1)));
            yy = 0.9 + (((tickAnim - 0) / 6) * (0.7-(0.9)));
            zz = 1 + (((tickAnim - 0) / 6) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 6) / 6) * (1-(1)));
            yy = 0.7 + (((tickAnim - 6) / 6) * (0.7-(0.7)));
            zz = 1 + (((tickAnim - 6) / 6) * (1-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 12) / 13) * (1-(1)));
            yy = 0.7 + (((tickAnim - 12) / 13) * (0.9-(0.7)));
            zz = 1 + (((tickAnim - 12) / 13) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightmembranemiddle.setScale((float)xx, (float)yy, (float)zz);



        this.rightmembrane.setScale((float)0,(float)1,(float)0);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraScaphognathus e = (EntityPrehistoricFloraScaphognathus) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(cube_r1, ((0.0F)-(0.0F)), ((0.0F)-(-0.3491F)),((0.2051F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.3447F)-(-0.2051F)));
        animator.rotate(cube_r3, ((0.0F)-(0.0F)), ((0.3491F)-(0.0F)),((0.0F)-(-0.3447F)));
        animator.rotate(cube_r4, ((0.0F)-(0.0F)), ((0.0F)-(0.3491F)),((-0.2051F)-(0.0F)));
        animator.rotate(cube_r5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.3447F)-(0.2051F)));
        animator.rotate(cube_r6, ((0.0F)-(0.0F)), ((-0.3491F)-(0.0F)),((0.0F)-(0.3447F)));
        animator.rotate(handR2, ((0.3258F)-(0.0584F)), ((1.0057F)-(0.8015F)),((-1.1709F)-(-3.085F)));
        animator.rotate(handR3, ((0.3258F)-(0.0584F)), ((-1.0057F)-(-0.8015F)),((1.1709F)-(3.085F)));
        animator.rotate(head, ((0.6589F)-(0.7069F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((0.8442F)-(-0.3731F)), ((-0.0277F)-(-0.0277F)),((-0.0444F)-(-0.0444F)));
        animator.rotate(leftleg, ((0.1616F)-(-0.2799F)), ((-0.0774F)-(-0.1238F)),((-1.5522F)-(-0.9067F)));
        animator.rotate(leftleg2, ((0.8337F)-(0.7176F)), ((-0.0491F)-(-0.0895F)),((0.1983F)-(0.9739F)));
        animator.rotate(neck, ((0.0305F)-(-0.2313F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.5061F)-(-0.3185F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((0.8442F)-(-0.3731F)), ((0.0277F)-(0.0277F)),((0.0444F)-(0.0444F)));
        animator.rotate(rightleg, ((0.1616F)-(-0.2799F)), ((0.0774F)-(0.1238F)),((1.5522F)-(0.9067F)));
        animator.rotate(rightleg2, ((0.8337F)-(0.7176F)), ((0.0491F)-(0.0895F)),((-0.1983F)-(-0.9739F)));
        animator.rotate(wing1left, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0305F)-(0.0393F)));
        animator.rotate(wing1right, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.0305F)-(-0.0393F)));
        animator.rotate(wing2left, ((-0.0175F)-(0.0F)), ((0.0F)-(0.0F)),((-1.6101F)-(-0.0175F)));
        animator.rotate(wing2right, ((-0.0175F)-(0.0F)), ((0.0F)-(0.0F)),((1.6101F)-(0.0175F)));
        animator.rotate(wing3left, ((-1.4734F)-(-0.0179F)), ((-0.0154F)-(0.0865F)),((0.115F)-(-0.0114F)));
        animator.rotate(wing3right, ((-1.4734F)-(-0.0179F)), ((0.0154F)-(-0.0865F)),((-0.115F)-(0.0114F)));
        animator.rotate(wing4left, ((0.1639F)-(1.4683F)), ((-0.0517F)-(0.0F)),((-0.0085F)-(0.0F)));
        animator.rotate(wing4right, ((0.1639F)-(1.4683F)), ((0.0517F)-(0.0F)),((0.0085F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(cube_r1, -((0.0F)-(0.0F)), -((0.0F)-(-0.3491F)),-((0.2051F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.3447F)-(-0.2051F)));
        animator.rotate(cube_r3, -((0.0F)-(0.0F)), -((0.3491F)-(0.0F)),-((0.0F)-(-0.3447F)));
        animator.rotate(cube_r4, -((0.0F)-(0.0F)), -((0.0F)-(0.3491F)),-((-0.2051F)-(0.0F)));
        animator.rotate(cube_r5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.3447F)-(0.2051F)));
        animator.rotate(cube_r6, -((0.0F)-(0.0F)), -((-0.3491F)-(0.0F)),-((0.0F)-(0.3447F)));
        animator.rotate(handR2, -((0.3258F)-(0.0584F)), -((1.0057F)-(0.8015F)),-((-1.1709F)-(-3.085F)));
        animator.rotate(handR3, -((0.3258F)-(0.0584F)), -((-1.0057F)-(-0.8015F)),-((1.1709F)-(3.085F)));
        animator.rotate(head, -((0.6589F)-(0.7069F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((0.8442F)-(-0.3731F)), -((-0.0277F)-(-0.0277F)),-((-0.0444F)-(-0.0444F)));
        animator.rotate(leftleg, -((0.1616F)-(-0.2799F)), -((-0.0774F)-(-0.1238F)),-((-1.5522F)-(-0.9067F)));
        animator.rotate(leftleg2, -((0.8337F)-(0.7176F)), -((-0.0491F)-(-0.0895F)),-((0.1983F)-(0.9739F)));
        animator.rotate(neck, -((0.0305F)-(-0.2313F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.5061F)-(-0.3185F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((0.8442F)-(-0.3731F)), -((0.0277F)-(0.0277F)),-((0.0444F)-(0.0444F)));
        animator.rotate(rightleg, -((0.1616F)-(-0.2799F)), -((0.0774F)-(0.1238F)),-((1.5522F)-(0.9067F)));
        animator.rotate(rightleg2, -((0.8337F)-(0.7176F)), -((0.0491F)-(0.0895F)),-((-0.1983F)-(-0.9739F)));
        animator.rotate(wing1left, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0305F)-(0.0393F)));
        animator.rotate(wing1right, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0305F)-(-0.0393F)));
        animator.rotate(wing2left, -((-0.0175F)-(0.0F)), -((0.0F)-(0.0F)),-((-1.6101F)-(-0.0175F)));
        animator.rotate(wing2right, -((-0.0175F)-(0.0F)), -((0.0F)-(0.0F)),-((1.6101F)-(0.0175F)));
        animator.rotate(wing3left, -((-1.4734F)-(-0.0179F)), -((-0.0154F)-(0.0865F)),-((0.115F)-(-0.0114F)));
        animator.rotate(wing3right, -((-1.4734F)-(-0.0179F)), -((0.0154F)-(-0.0865F)),-((-0.115F)-(0.0114F)));
        animator.rotate(wing4left, -((0.1639F)-(1.4683F)), -((-0.0517F)-(0.0F)),-((-0.0085F)-(0.0F)));
        animator.rotate(wing4right, -((0.1639F)-(1.4683F)), -((0.0517F)-(0.0F)),-((0.0085F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
