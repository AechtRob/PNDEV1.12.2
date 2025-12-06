package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPterodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelPterodactylus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended chest_r1;
    private final AdvancedModelRendererExtended rightwing1;
    private final AdvancedModelRendererExtended rightwing2;
    private final AdvancedModelRendererExtended rightmembrane2;
    private final AdvancedModelRendererExtended rightmembrane2b;
    private final AdvancedModelRendererExtended rightwing3;
    private final AdvancedModelRendererExtended rightmembrane3;
    private final AdvancedModelRendererExtended rightmembrane3b;
    private final AdvancedModelRendererExtended rightwing4;
    private final AdvancedModelRendererExtended rightwing5;
    private final AdvancedModelRendererExtended rightmembrane5;
    private final AdvancedModelRendererExtended rightmembrane4;
    private final AdvancedModelRendererExtended rightmembrane4b;
    private final AdvancedModelRendererExtended handR3;
    private final AdvancedModelRendererExtended rightmembrane;
    private final AdvancedModelRendererExtended rightmembraneb;
    private final AdvancedModelRendererExtended leftwing1;
    private final AdvancedModelRendererExtended leftwing2;
    private final AdvancedModelRendererExtended leftmembrane2;
    private final AdvancedModelRendererExtended leftmembrane2b;
    private final AdvancedModelRendererExtended leftwing3;
    private final AdvancedModelRendererExtended leftmembrane3;
    private final AdvancedModelRendererExtended leftmembrane3b;
    private final AdvancedModelRendererExtended leftwing4;
    private final AdvancedModelRendererExtended leftwing5;
    private final AdvancedModelRendererExtended leftmembrane5;
    private final AdvancedModelRendererExtended leftmembrane4;
    private final AdvancedModelRendererExtended leftmembrane4b;
    private final AdvancedModelRendererExtended handR2;
    private final AdvancedModelRendererExtended leftmembrane;
    private final AdvancedModelRendererExtended leftmembraneb;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended throat;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended body1_r1;
    private final AdvancedModelRendererExtended rightleg;
    private final AdvancedModelRendererExtended rightleg2;
    private final AdvancedModelRendererExtended rightleg3;
    private final AdvancedModelRendererExtended rightlegmembrane;
    private final AdvancedModelRendererExtended rightleg_r1;
    private final AdvancedModelRendererExtended leftleg;
    private final AdvancedModelRendererExtended leftleg2;
    private final AdvancedModelRendererExtended leftleg3;
    private final AdvancedModelRendererExtended leftlegmembrane;
    private final AdvancedModelRendererExtended leftleg_r1;
    private final AdvancedModelRendererExtended tail;

    private ModelAnimator animator;

    public ModelPterodactylus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 17.75F, 2.0F);
        this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.5F, 2.05F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);


        this.chest_r1 = new AdvancedModelRendererExtended(this);
        this.chest_r1.setRotationPoint(0.0F, -0.5898F, -1.0305F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 16, 0, -2.0F, -0.1F, -3.5F, 4, 3, 5, 0.0F, false));

        this.rightwing1 = new AdvancedModelRendererExtended(this);
        this.rightwing1.setRotationPoint(-1.85F, -0.2898F, -4.6305F);
        this.chest.addChild(rightwing1);
        this.setRotateAngle(rightwing1, -0.3054F, 0.3054F, 0.1309F);
        this.rightwing1.cubeList.add(new ModelBox(rightwing1, 10, 16, -3.5F, -0.5F, 0.0F, 4, 1, 4, 0.0F, true));

        this.rightwing2 = new AdvancedModelRendererExtended(this);
        this.rightwing2.setRotationPoint(-2.45F, 0.05F, 0.4F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.7854F, -0.3491F, -0.3054F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 16, 29, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, true));

        this.rightmembrane2 = new AdvancedModelRendererExtended(this);
        this.rightmembrane2.setRotationPoint(0.1F, 1.75F, 3.0F);
        this.rightwing2.addChild(rightmembrane2);
        this.setRotateAngle(rightmembrane2, -0.0025F, -3.0892F, -0.0045F);
        this.rightmembrane2.cubeList.add(new ModelBox(rightmembrane2, 20, 47, -0.0102F, -2.75F, 0.0047F, 0, 5, 2, 0.0F, true));

        this.rightmembrane2b = new AdvancedModelRendererExtended(this);
        this.rightmembrane2b.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rightmembrane2.addChild(rightmembrane2b);
        this.setRotateAngle(rightmembrane2b, 0.0F, -3.0892F, 0.0F);
        this.rightmembrane2b.cubeList.add(new ModelBox(rightmembrane2b, 47, 47, -0.0186F, -2.745F, -0.0111F, 0, 5, 2, 0.0F, true));

        this.rightwing3 = new AdvancedModelRendererExtended(this);
        this.rightwing3.setRotationPoint(-0.05F, 3.9F, -0.1F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -0.6545F, 0.0F, 0.0873F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 0, 30, -0.5F, -2.0573F, 0.0608F, 1, 2, 4, 0.0F, true));

        this.rightmembrane3 = new AdvancedModelRendererExtended(this);
        this.rightmembrane3.setRotationPoint(0.0F, -2.0573F, 2.0608F);
        this.rightwing3.addChild(rightmembrane3);
        this.setRotateAngle(rightmembrane3, 0.0F, 0.0F, 3.0892F);
        this.rightmembrane3.cubeList.add(new ModelBox(rightmembrane3, 13, 53, 0.0F, -2.0F, -2.0F, 0, 2, 4, 0.0F, true));

        this.rightmembrane3b = new AdvancedModelRendererExtended(this);
        this.rightmembrane3b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightmembrane3.addChild(rightmembrane3b);
        this.setRotateAngle(rightmembrane3b, 0.0F, 0.0F, 3.0892F);
        this.rightmembrane3b.cubeList.add(new ModelBox(rightmembrane3b, 13, 51, 0.0F, -2.0F, -2.0F, 0, 2, 4, 0.0F, true));

        this.rightwing4 = new AdvancedModelRendererExtended(this);
        this.rightwing4.setRotationPoint(0.05F, -0.0323F, 3.9858F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 1.5708F, 0.1745F, -0.0873F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 10, 10, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.rightwing5 = new AdvancedModelRendererExtended(this);
        this.rightwing5.setRotationPoint(0.65F, -0.2F, 2.7F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 1.0472F, 0.0436F, -0.0436F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 3, 3, -1.1222F, -1.882F, -0.0728F, 1, 2, 10, 0.003F, true));

        this.rightmembrane5 = new AdvancedModelRendererExtended(this);
        this.rightmembrane5.setRotationPoint(-0.6222F, -1.882F, 4.9272F);
        this.rightwing5.addChild(rightmembrane5);
        this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 3.0892F);
        this.rightmembrane5.cubeList.add(new ModelBox(rightmembrane5, 33, 50, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, true));

        this.rightmembrane4 = new AdvancedModelRendererExtended(this);
        this.rightmembrane4.setRotationPoint(0.0F, -2.0F, 1.5F);
        this.rightwing4.addChild(rightmembrane4);
        this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, 3.0892F);
        this.rightmembrane4.cubeList.add(new ModelBox(rightmembrane4, 9, 58, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.rightmembrane4b = new AdvancedModelRendererExtended(this);
        this.rightmembrane4b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightmembrane4.addChild(rightmembrane4b);
        this.setRotateAngle(rightmembrane4b, 0.0F, 0.0F, 3.0892F);
        this.rightmembrane4b.cubeList.add(new ModelBox(rightmembrane4b, 9, 57, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.handR3 = new AdvancedModelRendererExtended(this);
        this.handR3.setRotationPoint(0.05F, -0.4573F, 3.6608F);
        this.rightwing3.addChild(handR3);
        this.setRotateAngle(handR3, -1.5272F, -0.1745F, 1.309F);
        this.handR3.cubeList.add(new ModelBox(handR3, 23, 38, -0.5F, -0.5F, 0.2F, 1, 1, 2, -0.025F, true));

        this.rightmembrane = new AdvancedModelRendererExtended(this);
        this.rightmembrane.setRotationPoint(-1.475F, 0.0F, 3.9F);
        this.rightwing1.addChild(rightmembrane);
        this.setRotateAngle(rightmembrane, -2.8326F, 0.9657F, -2.7962F);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 10, 46, -1.9981F, 0.0436F, -1.225F, 4, 0, 3, 0.0F, true));

        this.rightmembraneb = new AdvancedModelRendererExtended(this);
        this.rightmembraneb.setRotationPoint(0.0F, 0.05F, 1.775F);
        this.rightmembrane.addChild(rightmembraneb);
        this.rightmembraneb.cubeList.add(new ModelBox(rightmembraneb, 10, 43, -1.9981F, -0.0064F, 0.0F, 4, 0, 3, 0.0F, true));

        this.leftwing1 = new AdvancedModelRendererExtended(this);
        this.leftwing1.setRotationPoint(1.85F, -0.2898F, -4.6305F);
        this.chest.addChild(leftwing1);
        this.setRotateAngle(leftwing1, -0.3054F, -0.3054F, -0.1309F);
        this.leftwing1.cubeList.add(new ModelBox(leftwing1, 10, 16, -0.5F, -0.5F, 0.0F, 4, 1, 4, 0.0F, false));

        this.leftwing2 = new AdvancedModelRendererExtended(this);
        this.leftwing2.setRotationPoint(2.45F, 0.05F, 0.4F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.7854F, 0.3491F, 0.3054F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 16, 29, -0.5F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

        this.leftmembrane2 = new AdvancedModelRendererExtended(this);
        this.leftmembrane2.setRotationPoint(-0.1F, 1.75F, 3.0F);
        this.leftwing2.addChild(leftmembrane2);
        this.setRotateAngle(leftmembrane2, 0.0F, 3.0892F, 0.0F);
        this.leftmembrane2.cubeList.add(new ModelBox(leftmembrane2, 20, 47, 0.0102F, -2.75F, 0.0047F, 0, 5, 2, 0.0F, false));

        this.leftmembrane2b = new AdvancedModelRendererExtended(this);
        this.leftmembrane2b.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.leftmembrane2.addChild(leftmembrane2b);
        this.setRotateAngle(leftmembrane2b, 0.0F, 3.0892F, 0.0F);
        this.leftmembrane2b.cubeList.add(new ModelBox(leftmembrane2b, 47, 47, 0.0186F, -2.745F, -0.0111F, 0, 5, 2, 0.0F, false));

        this.leftwing3 = new AdvancedModelRendererExtended(this);
        this.leftwing3.setRotationPoint(0.05F, 3.9F, -0.1F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -0.6545F, 0.0F, -0.0873F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 0, 30, -0.5F, -2.0573F, 0.0608F, 1, 2, 4, 0.0F, false));

        this.leftmembrane3 = new AdvancedModelRendererExtended(this);
        this.leftmembrane3.setRotationPoint(0.0F, -2.0573F, 2.0608F);
        this.leftwing3.addChild(leftmembrane3);
        this.setRotateAngle(leftmembrane3, 0.0F, 0.0F, -3.0892F);
        this.leftmembrane3.cubeList.add(new ModelBox(leftmembrane3, 13, 53, 0.0F, -2.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.leftmembrane3b = new AdvancedModelRendererExtended(this);
        this.leftmembrane3b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftmembrane3.addChild(leftmembrane3b);
        this.setRotateAngle(leftmembrane3b, 0.0F, 0.0F, -3.0892F);
        this.leftmembrane3b.cubeList.add(new ModelBox(leftmembrane3b, 13, 51, 0.0F, -2.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.leftwing4 = new AdvancedModelRendererExtended(this);
        this.leftwing4.setRotationPoint(-0.05F, -0.0323F, 3.9858F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 1.5708F, -0.1745F, 0.0873F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 10, 10, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.leftwing5 = new AdvancedModelRendererExtended(this);
        this.leftwing5.setRotationPoint(-0.65F, -0.2F, 2.7F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 1.0472F, -0.0436F, 0.0436F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 3, 3, 0.1222F, -1.882F, -0.0728F, 1, 2, 10, 0.003F, false));

        this.leftmembrane5 = new AdvancedModelRendererExtended(this);
        this.leftmembrane5.setRotationPoint(0.6222F, -1.882F, 4.9272F);
        this.leftwing5.addChild(leftmembrane5);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -3.0892F);
        this.leftmembrane5.cubeList.add(new ModelBox(leftmembrane5, 33, 50, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, false));

        this.leftmembrane4 = new AdvancedModelRendererExtended(this);
        this.leftmembrane4.setRotationPoint(0.0F, -2.0F, 1.5F);
        this.leftwing4.addChild(leftmembrane4);
        this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, -3.0892F);
        this.leftmembrane4.cubeList.add(new ModelBox(leftmembrane4, 9, 58, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.leftmembrane4b = new AdvancedModelRendererExtended(this);
        this.leftmembrane4b.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftmembrane4.addChild(leftmembrane4b);
        this.setRotateAngle(leftmembrane4b, 0.0F, 0.0F, -3.0892F);
        this.leftmembrane4b.cubeList.add(new ModelBox(leftmembrane4b, 9, 57, 0.0F, -1.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.handR2 = new AdvancedModelRendererExtended(this);
        this.handR2.setRotationPoint(-0.05F, -0.4573F, 3.6608F);
        this.leftwing3.addChild(handR2);
        this.setRotateAngle(handR2, -1.5272F, 0.1745F, -1.309F);
        this.handR2.cubeList.add(new ModelBox(handR2, 23, 38, -0.5F, -0.5F, 0.2F, 1, 1, 2, -0.025F, false));

        this.leftmembrane = new AdvancedModelRendererExtended(this);
        this.leftmembrane.setRotationPoint(1.475F, 0.0F, 3.9F);
        this.leftwing1.addChild(leftmembrane);
        this.setRotateAngle(leftmembrane, -2.8362F, -0.9599F, 2.7925F);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 10, 46, -2.0019F, 0.0436F, -1.225F, 4, 0, 3, 0.0F, false));

        this.leftmembraneb = new AdvancedModelRendererExtended(this);
        this.leftmembraneb.setRotationPoint(0.0F, 0.05F, 1.775F);
        this.leftmembrane.addChild(leftmembraneb);
        this.leftmembraneb.cubeList.add(new ModelBox(leftmembraneb, 10, 43, -2.0019F, -0.0064F, 0.0F, 4, 0, 3, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -0.4398F, -3.5805F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.5236F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 25, 12, -1.0F, -0.7395F, -4.4772F, 2, 2, 4, -0.01F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.7395F, -3.7272F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 32, 6, -1.0F, 0.0F, -2.75F, 2, 2, 3, -0.02F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.45F, -2.3F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 33, 19, -1.0F, -0.616F, -2.567F, 2, 1, 3, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.1F, -0.566F, -1.867F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.1F, -0.566F, -1.867F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.384F, -2.567F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 22, -0.5F, -1.0F, -6.9F, 1, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 30, -1.0F, -1.0F, -1.9F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 26, 0.0F, -0.7769F, -2.5436F, 0, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.5F, 0.7656F, -6.9067F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 26, 0.0F, -0.7769F, -2.5436F, 0, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -0.8035F, -1.2079F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 34, 0.0F, 0.8F, 0.5F, 0, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 0.0F, -3.2F, -5.5F, 0, 4, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.116F, -1.067F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 16, -0.5F, -0.7F, -1.55F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 0.3907F, -1.0549F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 0, -1.0F, -0.0068F, -1.537F, 2, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 9, -1.0F, -0.8068F, -1.612F, 2, 1, 2, -0.03F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -0.0068F, -1.512F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, -1.0F, 0.0F, -1.9F, 2, 1, 2, -0.012F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.0F, -6.9F, 1, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.5529F, -7.9313F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 19, 0.0F, -0.2481F, -0.4564F, 0, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, 0.5529F, -7.9313F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 19, 0.0F, -0.2481F, -0.4564F, 0, 1, 5, 0.0F, false));

        this.throat = new AdvancedModelRendererExtended(this);
        this.throat.setRotationPoint(0.0F, 1.0002F, -2.6988F);
        this.jaw.addChild(throat);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.493F, 2.6868F);
        this.throat.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -1.0F, -0.625F, -2.375F, 2, 1, 4, -0.03F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 1.75F, -0.3F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);


        this.body1_r1 = new AdvancedModelRendererExtended(this);
        this.body1_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.body1.addChild(body1_r1);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.body1_r1.cubeList.add(new ModelBox(body1_r1, 33, 26, -1.5F, -0.75F, -1.0F, 3, 2, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRendererExtended(this);
        this.rightleg.setRotationPoint(-1.0F, -0.45F, 0.8F);
        this.body1.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, 0.4363F, 0.6545F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 31, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRendererExtended(this);
        this.rightleg2.setRotationPoint(-0.0276F, 1.6927F, -0.4558F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.1309F, 0.2618F, -0.5672F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 37, -0.4306F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, true));

        this.rightleg3 = new AdvancedModelRendererExtended(this);
        this.rightleg3.setRotationPoint(0.0694F, 3.4345F, -0.0498F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0436F, -0.2182F, -0.0873F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 25, 33, -0.8876F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, true));

        this.rightlegmembrane = new AdvancedModelRendererExtended(this);
        this.rightlegmembrane.setRotationPoint(-0.0306F, -1.3655F, 0.4002F);
        this.rightleg2.addChild(rightlegmembrane);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);


        this.rightleg_r1 = new AdvancedModelRendererExtended(this);
        this.rightleg_r1.setRotationPoint(0.0F, 3.25F, 0.775F);
        this.rightlegmembrane.addChild(rightleg_r1);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.rightleg_r1.cubeList.add(new ModelBox(rightleg_r1, 34, 36, 0.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, true));

        this.leftleg = new AdvancedModelRendererExtended(this);
        this.leftleg.setRotationPoint(1.0F, -0.45F, 0.8F);
        this.body1.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.0F, -0.4363F, -0.6545F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 31, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRendererExtended(this);
        this.leftleg2.setRotationPoint(0.0276F, 1.6927F, -0.4558F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.1309F, -0.2618F, 0.5672F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 37, -0.5694F, -0.1405F, -0.4998F, 1, 4, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRendererExtended(this);
        this.leftleg3.setRotationPoint(-0.0694F, 3.4345F, -0.0498F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0436F, 0.2182F, 0.0873F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 25, 33, -1.1124F, -0.4472F, -2.507F, 2, 1, 3, 0.0F, false));

        this.leftlegmembrane = new AdvancedModelRendererExtended(this);
        this.leftlegmembrane.setRotationPoint(0.0306F, -1.3655F, 0.4002F);
        this.leftleg2.addChild(leftlegmembrane);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);


        this.leftleg_r1 = new AdvancedModelRendererExtended(this);
        this.leftleg_r1.setRotationPoint(0.0F, 3.25F, 0.775F);
        this.leftlegmembrane.addChild(leftleg_r1);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 34, 36, 0.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.425F, 1.8F);
        this.body1.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 12, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

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
        this.root.offsetY = -1.2F;
        this.root.offsetX = 0F;
        this.root.rotateAngleY = (float)Math.toRadians(125);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.5F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.8F, -0.2F);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);
        this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);
        this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);
        this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);
        this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing1, -0.3044F, -0.0745F, 0.0466F);
        this.setRotateAngle(leftwing2, -0.2245F, -0.0123F, -1.6342F);
        this.setRotateAngle(leftwing3, -1.4832F, -0.0869F, -0.0076F);
        this.setRotateAngle(leftwing4, 0.1685F, -0.1181F, -0.0116F);
        this.setRotateAngle(leftwing5, 0.3065F, -0.0832F, -0.0263F);
        this.setRotateAngle(handR2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing1, -0.3044F, 0.0745F, -0.0466F);
        this.setRotateAngle(rightwing2, -0.2245F, 0.0123F, 1.6342F);
        this.setRotateAngle(rightwing3, -1.4832F, 0.0869F, 0.0076F);
        this.setRotateAngle(rightwing4, 0.1685F, 0.1181F, 0.0116F);
        this.setRotateAngle(rightwing5, 0.3065F, 0.0832F, 0.0263F);
        this.setRotateAngle(handR3, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(root, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing5, -0.0457F, 0.3052F, -0.0555F);
        this.setRotateAngle(rightwing4, 0.0615F, 0.3466F, -0.0329F);
        this.setRotateAngle(rightwing3, -1.6083F, 0.0817F, -0.2616F);
        this.setRotateAngle(rightwing2, -0.2843F, -0.0122F, 1.508F);
        this.setRotateAngle(rightwing1, -0.3352F, -0.0703F, 0.2465F);
        this.setRotateAngle(rightmembrane5, 0.0F, -0.0436F, -0.0524F);
        this.setRotateAngle(rightmembrane4b, 0.0436F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane4, -0.1309F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane3b, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane3, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane2b, 0.0F, 0.0524F, 0.0F);
        this.setRotateAngle(rightmembrane2, 0.0023F, 0.0523F, 0.0437F);
        this.setRotateAngle(rightmembrane, -0.1804F, 0.279F, 0.0461F);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 1.5181F, -0.4131F, -0.0085F);
        this.setRotateAngle(rightleg2, 0.2129F, 0.2014F, -0.2138F);
        this.setRotateAngle(rightleg, 0.7244F, 0.1612F, 1.4361F);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing5, -0.0457F, -0.3052F, 0.0555F);
        this.setRotateAngle(leftwing4, 0.0615F, -0.3466F, 0.0329F);
        this.setRotateAngle(leftwing3, -1.6083F, -0.0817F, 0.2616F);
        this.setRotateAngle(leftwing2, -0.2843F, 0.0122F, -1.508F);
        this.setRotateAngle(leftwing1, -0.3352F, 0.0703F, -0.2465F);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0436F, 0.0524F);
        this.setRotateAngle(leftmembrane4b, 0.0436F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane4, -0.1309F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane3b, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane3, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane2b, 0.0F, -0.0524F, 0.0F);
        this.setRotateAngle(leftmembrane2, 0.0023F, -0.0523F, -0.0437F);
        this.setRotateAngle(leftmembrane, -0.1804F, -0.279F, -0.0461F);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 1.5181F, 0.4131F, 0.0085F);
        this.setRotateAngle(leftleg2, 0.2129F, -0.2014F, 0.2138F);
        this.setRotateAngle(leftleg, 0.7244F, -0.1612F, -1.4361F);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(handR3, -0.3391F, 0.1548F, 0.1504F);
        this.setRotateAngle(handR2, -0.3391F, -0.1548F, -0.1504F);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.root.offsetY = -0.45F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(throat, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(root, -1.1781F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing5, 0.307F, -0.0018F, -0.0133F);
        this.setRotateAngle(rightwing4, 0.0859F, -0.0031F, -0.0589F);
        this.setRotateAngle(rightwing3, -1.5712F, 0.0379F, 0.0855F);
        this.setRotateAngle(rightwing2, -0.1194F, 0.0184F, 1.6574F);
        this.setRotateAngle(rightwing1, -0.2906F, -0.0589F, -0.1671F);
        this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0349F);
        this.setRotateAngle(rightmembrane4b, 0.0F, 0.0F, 0.1658F);
        this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane3b, 0.0F, 0.0F, -0.0087F);
        this.setRotateAngle(rightmembrane3, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane2b, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(rightmembrane2, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(rightmembrane, -0.0474F, 0.2361F, 0.0542F);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.1931F, -1.3104F, 1.6252F);
        this.setRotateAngle(rightleg2, 0.1277F, 0.1608F, 0.2726F);
        this.setRotateAngle(rightleg, 0.9671F, 0.4111F, 1.1118F);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing5, 0.307F, 0.0018F, 0.0133F);
        this.setRotateAngle(leftwing4, 0.0859F, 0.0031F, 0.0589F);
        this.setRotateAngle(leftwing3, -1.5712F, -0.0379F, -0.0855F);
        this.setRotateAngle(leftwing2, -0.1194F, -0.0184F, -1.6574F);
        this.setRotateAngle(leftwing1, -0.2906F, 0.0589F, 0.1671F);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0349F);
        this.setRotateAngle(leftmembrane4b, 0.0F, 0.0F, -0.1658F);
        this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane3b, 0.0F, 0.0F, 0.0087F);
        this.setRotateAngle(leftmembrane3, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane2b, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(leftmembrane2, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(leftmembrane, -0.0474F, -0.2361F, -0.0542F);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.1931F, 1.3104F, -1.6252F);
        this.setRotateAngle(leftleg2, 0.1277F, -0.1608F, -0.2726F);
        this.setRotateAngle(leftleg, 0.9671F, -0.4111F, -1.1118F);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(handR3, -1.5272F, -0.1745F, 1.309F);
        this.setRotateAngle(handR2, -1.5272F, 0.1745F, -1.309F);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.rotateAngleY = (float)Math.toRadians(180);
        this.root.offsetY = -0.15F;
        this.root.offsetZ = -0.15F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(root, 0.4408F, -0.1964F, 0.3922F);
        this.setRotateAngle(rightwing5, 0.308F, 0.0814F, 0.0131F);
        this.setRotateAngle(rightwing4, 0.0873F, 0.1745F, -0.0873F);
        this.setRotateAngle(rightwing3, -1.5762F, 0.0375F, -0.0455F);
        this.setRotateAngle(rightwing2, -0.12F, 0.0131F, 1.6141F);
        this.setRotateAngle(rightwing1, -0.2913F, 0.0551F, 0.2089F);
        this.setRotateAngle(rightmembrane5, 0.0F, 0.0F, 0.0349F);
        this.setRotateAngle(rightmembrane4b, 0.0F, 0.0F, 0.1658F);
        this.setRotateAngle(rightmembrane4, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane3b, 0.0F, 0.0F, -0.0087F);
        this.setRotateAngle(rightmembrane3, 0.0F, 0.0F, -0.0524F);
        this.setRotateAngle(rightmembrane2b, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(rightmembrane2, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(rightmembrane, -0.0474F, 0.2361F, 0.0542F);
        this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 1.309F, -0.2182F, -0.0873F);
        this.setRotateAngle(rightleg2, 0.1277F, 0.1608F, 0.2726F);
        this.setRotateAngle(rightleg, 0.9943F, 0.3022F, 1.1894F);
        this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.5253F, -0.0756F, 0.0437F);
        this.setRotateAngle(neck, -0.6619F, -0.1382F, 0.1069F);
        this.setRotateAngle(leftwing5, 0.308F, -0.0814F, -0.0131F);
        this.setRotateAngle(leftwing4, 0.0873F, -0.1745F, 0.0873F);
        this.setRotateAngle(leftwing3, -1.5762F, -0.0375F, 0.0455F);
        this.setRotateAngle(leftwing2, -0.12F, -0.0131F, -1.6141F);
        this.setRotateAngle(leftwing1, -0.2913F, -0.0551F, -0.2089F);
        this.setRotateAngle(leftmembrane5, 0.0F, 0.0F, -0.0349F);
        this.setRotateAngle(leftmembrane4b, 0.0F, 0.0F, -0.1658F);
        this.setRotateAngle(leftmembrane4, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane3b, 0.0F, 0.0F, 0.0087F);
        this.setRotateAngle(leftmembrane3, 0.0F, 0.0F, 0.0524F);
        this.setRotateAngle(leftmembrane2b, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(leftmembrane2, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(leftmembrane, -0.0474F, -0.2361F, -0.0542F);
        this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 1.309F, 0.2182F, 0.0873F);
        this.setRotateAngle(leftleg2, 0.1277F, -0.1608F, -0.2726F);
        this.setRotateAngle(leftleg, 0.9943F, -0.3022F, -1.1894F);
        this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(handR3, -1.5272F, -0.1745F, 1.309F);
        this.setRotateAngle(handR2, -1.5272F, 0.1745F, -1.309F);
        this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
        this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
        this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
        this.root.offsetY = 0.175F;
        this.root.render(0.01F);
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
        this.rightwing1.setScale(1,1,1);
        this.leftwing1.setScale(1,1,1);
        EntityPrehistoricFloraPterodactylus ee = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
//            this.setRotateAngle(root, 0.2618F, 0.0F, 0.0F);
//            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
//            this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
//            this.setRotateAngle(leftleg, 0.5633F, -0.0702F, -1.242F);
//            this.setRotateAngle(leftleg2, 0.4808F, -0.2184F, 0.1965F);
//            this.setRotateAngle(leftleg3, 1.2162F, 0.2407F, 0.2122F);
//            this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
//            this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(rightleg, 0.5633F, 0.0702F, 1.242F);
//            this.setRotateAngle(rightleg2, 0.4808F, 0.2184F, -0.1965F);
//            this.setRotateAngle(rightleg3, 1.2162F, -0.2407F, -0.2122F);
//            this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
//            this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
//            this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
//            this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
//            this.setRotateAngle(leftwing1, -0.3044F, -0.0745F, 0.0466F);
//            this.setRotateAngle(leftwing2, -0.2245F, -0.0123F, -1.6342F);
//            this.setRotateAngle(leftwing3, -1.4832F, -0.0869F, -0.0076F);
//            this.setRotateAngle(leftwing4, 0.1685F, -0.1181F, -0.0116F);
//            this.setRotateAngle(leftwing5, 0.3065F, -0.0832F, -0.0263F);
//            this.setRotateAngle(handR2, -0.3054F, 0.0F, 0.0F);
//            this.setRotateAngle(rightwing1, -0.3044F, 0.0745F, -0.0466F);
//            this.setRotateAngle(rightwing2, -0.2245F, 0.0123F, 1.6342F);
//            this.setRotateAngle(rightwing3, -1.4832F, 0.0869F, 0.0076F);
//            this.setRotateAngle(rightwing4, 0.1685F, 0.1181F, 0.0116F);
//            this.setRotateAngle(rightwing5, 0.3065F, 0.0832F, 0.0263F);
//            this.setRotateAngle(handR3, -0.3054F, 0.0F, 0.0F);
//            this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
//            this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
//            this.setRotateAngle(head, 0.8727F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
//            this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
//            this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
//            this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
//            this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose
                this.setRotateAngle(root, 0.1745F, 0.0F, 0.0F);
                this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
                this.setRotateAngle(body1_r1, -0.2618F, 0.0F, 0.0F);
                this.setRotateAngle(rightleg, 0.546F, 0.1623F, 1.0927F);
                this.setRotateAngle(rightleg2, 0.427F, 0.3144F, -0.3997F);
                this.setRotateAngle(rightleg3, -0.5943F, -1.0489F, -0.2481F);
                this.setRotateAngle(rightlegmembrane, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(rightleg_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(leftleg, 0.546F, -0.1623F, -1.0927F);
                this.setRotateAngle(leftleg2, 0.427F, -0.3144F, 0.3997F);
                this.setRotateAngle(leftleg3, -0.5943F, 1.0489F, 0.2481F);
                this.setRotateAngle(leftlegmembrane, -0.0911F, 0.0F, 0.0F);
                this.setRotateAngle(leftleg_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
                this.setRotateAngle(chest, -0.0892F, 0.0F, 0.0F);
                this.setRotateAngle(chest_r1, -0.3054F, 0.0F, 0.0F);
                this.setRotateAngle(rightwing1, -0.4763F, -0.3985F, -0.277F);
                this.setRotateAngle(rightwing2, -0.5549F, -0.2558F, 1.3426F);
                this.setRotateAngle(rightwing3, -1.4703F, -0.1991F, -0.2728F);
                this.setRotateAngle(rightwing4, 1.4338F, 0.1181F, 0.0116F);
                this.setRotateAngle(rightwing5, 1.5177F, 0.077F, -0.1049F);
                this.setRotateAngle(handR3, -0.5976F, -0.2849F, -0.3917F);
                this.setRotateAngle(leftwing1, -0.4763F, 0.3985F, 0.277F);
                this.setRotateAngle(leftwing2, -0.5549F, 0.2558F, -1.3426F);
                this.setRotateAngle(leftwing3, -1.4703F, 0.1991F, 0.2728F);
                this.setRotateAngle(leftwing4, 1.4338F, -0.1181F, -0.0116F);
                this.setRotateAngle(leftwing5, 1.5177F, -0.077F, 0.1049F);
                this.setRotateAngle(handR2, -0.5976F, 0.2849F, 0.3917F);
                this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
                this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r2, 0.0791F, -0.0368F, 0.4349F);
                this.setRotateAngle(cube_r3, 0.0791F, 0.0368F, -0.4349F);
                this.setRotateAngle(cube_r4, 0.1047F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r7, 0.0852F, 0.0189F, -0.2174F);
                this.setRotateAngle(cube_r8, 0.0852F, -0.0189F, 0.2174F);
                this.setRotateAngle(throat, 0.1745F, 0.0F, 0.0F);
                this.setRotateAngle(cube_r9, -0.3403F, 0.0F, 0.0F);
            }
        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
            else { //Flying regular but straight upwards
                animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 20) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 100) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 110) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 0) / 50) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 50) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 60) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 70) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 90) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 100) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 110) / 50) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 70) / 20) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 90) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.5)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 100) / 10) * (-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = -3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(-3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
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
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 0) / 50) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 50) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5 + (((tickAnim - 60) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 70) / 20) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 90) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5 + (((tickAnim - 100) / 10) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 110) / 50) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 0) / 50) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 50) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5 + (((tickAnim - 60) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 70) / 20) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 90) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5 + (((tickAnim - 100) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 110) / 50) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 0) / 50) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 50) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5 + (((tickAnim - 60) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 70) / 20) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 90) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5 + (((tickAnim - 100) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 110) / 50) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 50) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 60) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 70) / 20) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 90) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5 + (((tickAnim - 100) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 110) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 50) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 0) / 50) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 0) / 50) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 50) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 50) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 50) / 10) * (70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 60) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 60) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            zz = 70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 20) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 70) / 20) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 70) / 20) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 90) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 90) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 90) / 10) * (70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 100) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 100) / 10) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            zz = 70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 100) / 10) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 110) / 50) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 110) / 50) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 110) / 50) * (50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 50) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 90) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 0) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 0) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 0) / 50) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 50) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 50) / 10) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5 + (((tickAnim - 60) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 70) / 20) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 70) / 20) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 70) / 20) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 90) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 90) / 10) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5 + (((tickAnim - 100) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5 + (((tickAnim - 100) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*2.5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 100) / 10) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 110) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 110) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 110) / 50) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 90 + (((tickAnim - 0) / 50) * (90-(90)));
            yy = -20 + (((tickAnim - 0) / 50) * (-20-(-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 90 + (((tickAnim - 50) / 10) * (90-(90)));
            yy = -20 + (((tickAnim - 50) / 10) * (-20-(-20)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 90 + (((tickAnim - 60) / 10) * (90-(90)));
            yy = -20 + (((tickAnim - 60) / 10) * (-20-(-20)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 90 + (((tickAnim - 70) / 20) * (90-(90)));
            yy = -20 + (((tickAnim - 70) / 20) * (-20-(-20)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 90 + (((tickAnim - 90) / 10) * (90-(90)));
            yy = -20 + (((tickAnim - 90) / 10) * (-20-(-20)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 90 + (((tickAnim - 100) / 10) * (90-(90)));
            yy = -20 + (((tickAnim - 100) / 10) * (-20-(-20)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 90 + (((tickAnim - 110) / 50) * (90-(90)));
            yy = -20 + (((tickAnim - 110) / 50) * (-20-(-20)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 50) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 0) / 50) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 0) / 50) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 50) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 50) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 50) / 10) * (-70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 60) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5 + (((tickAnim - 60) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5)));
            zz = -70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 60) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(-70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 20) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 70) / 20) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 70) / 20) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 90) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 90) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 90) / 10) * (-70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 100) / 10) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5 + (((tickAnim - 100) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-2.5)));
            zz = -70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5 + (((tickAnim - 100) / 10) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(-70+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 110) / 50) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 110) / 50) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 110) / 50) * (-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(-50+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 50) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 90) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 0) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 0) / 50) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 0) / 50) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 50) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 50) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 50) / 10) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5 + (((tickAnim - 60) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 70) / 20) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 70) / 20) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 70) / 20) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 90) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 90) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 90) / 10) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5 + (((tickAnim - 100) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5 + (((tickAnim - 100) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-180))*-2.5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 100) / 10) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5 + (((tickAnim - 110) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 110) / 50) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 110) / 50) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 90 + (((tickAnim - 0) / 50) * (90-(90)));
            yy = 20 + (((tickAnim - 0) / 50) * (20-(20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 90 + (((tickAnim - 50) / 10) * (90-(90)));
            yy = 20 + (((tickAnim - 50) / 10) * (20-(20)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 90 + (((tickAnim - 60) / 10) * (90-(90)));
            yy = 20 + (((tickAnim - 60) / 10) * (20-(20)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 90 + (((tickAnim - 70) / 20) * (90-(90)));
            yy = 20 + (((tickAnim - 70) / 20) * (20-(20)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 90 + (((tickAnim - 90) / 10) * (90-(90)));
            yy = 20 + (((tickAnim - 90) / 10) * (20-(20)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 90 + (((tickAnim - 100) / 10) * (90-(90)));
            yy = 20 + (((tickAnim - 100) / 10) * (20-(20)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 90 + (((tickAnim - 110) / 50) * (90-(90)));
            yy = 20 + (((tickAnim - 110) / 50) * (20-(20)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

        animFly2(tickAnim); //Divided code into two as it's too long!
    }

    public void animFly2(double tickAnim) {
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 0) / 50) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 50) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 70) / 20) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 90) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 100) / 10) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 110) / 50) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing1.rotationPointX = this.rightwing1.rotationPointX + (float)(xx);
        this.rightwing1.rotationPointY = this.rightwing1.rotationPointY - (float)(yy);
        this.rightwing1.rotationPointZ = this.rightwing1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 1.2 + (((tickAnim - 0) / 50) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 0) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 50) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1.2 + (((tickAnim - 50) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 50) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 10) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 1.2 + (((tickAnim - 60) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 60) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 10) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 1.2 + (((tickAnim - 70) / 20) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 70) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 20) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1.2 + (((tickAnim - 90) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 90) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 90) / 10) * (1-(1)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 1.2 + (((tickAnim - 100) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 100) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 100) / 10) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 1.2 + (((tickAnim - 110) / 50) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 110) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 50) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.rightwing1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 0) / 50) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 0) / 50) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = 107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 0) / 50) * (107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 45 + (((tickAnim - 50) / 10) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 50) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = 107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 50) / 10) * (100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 45 + (((tickAnim - 60) / 10) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 60) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 45 + (((tickAnim - 70) / 20) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 70) / 20) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = 107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 70) / 20) * (107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 45 + (((tickAnim - 90) / 10) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 90) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = 107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 90) / 10) * (100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 45 + (((tickAnim - 100) / 10) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 100) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 100) / 10) * (107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 45 + (((tickAnim - 110) / 50) * (45-(45)));
            yy = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 110) / 50) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = 107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 110) / 50) * (107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30 + (((tickAnim - 0) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30)));
            zz = 0 + (((tickAnim - 50) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 60) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30 + (((tickAnim - 70) / 20) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30)));
            zz = 0 + (((tickAnim - 90) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 100) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (0-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30 + (((tickAnim - 110) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-30)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane2, rightmembrane2.rotateAngleX + (float) Math.toRadians(xx), rightmembrane2.rotateAngleY + (float) Math.toRadians(yy), rightmembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 50) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 60) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 70) / 20) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 90) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 100) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 110) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane2.rotationPointX = this.rightmembrane2.rotationPointX + (float)(xx);
        this.rightmembrane2.rotationPointY = this.rightmembrane2.rotationPointY - (float)(yy);
        this.rightmembrane2.rotationPointZ = this.rightmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (-170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (-170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = -170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane2b, rightmembrane2b.rotateAngleX + (float) Math.toRadians(xx), rightmembrane2b.rotateAngleY + (float) Math.toRadians(yy), rightmembrane2b.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 50) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 70) / 20) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 90) / 10) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 110) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane2b.rotationPointX = this.rightmembrane2b.rotationPointX + (float)(xx);
        this.rightmembrane2b.rotationPointY = this.rightmembrane2b.rotationPointY - (float)(yy);
        this.rightmembrane2b.rotationPointZ = this.rightmembrane2b.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 0) / 50) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 0) / 50) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 50) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 70) / 20) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 20) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 90) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 100) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 110) / 50) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 110) / 50) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0 + (((tickAnim - 60) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 70) / 20) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 90) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0 + (((tickAnim - 100) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane3, rightmembrane3.rotateAngleX + (float) Math.toRadians(xx), rightmembrane3.rotateAngleY + (float) Math.toRadians(yy), rightmembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 0) / 50) * (177-(177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177 + (((tickAnim - 70) / 20) * (177-(177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 110) / 50) * (177-(177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane3b, rightmembrane3b.rotateAngleX + (float) Math.toRadians(xx), rightmembrane3b.rotateAngleY + (float) Math.toRadians(yy), rightmembrane3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 0) / 50) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30 + (((tickAnim - 0) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 50) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30 + (((tickAnim - 50) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 70) / 20) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30 + (((tickAnim - 70) / 20) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 90) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30 + (((tickAnim - 90) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25 + (((tickAnim - 100) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25 + (((tickAnim - 100) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-1.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 110) / 50) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30 + (((tickAnim - 110) / 50) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*30)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -55 + (((tickAnim - 0) / 50) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 50) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -55 + (((tickAnim - 50) / 10) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 50) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 50) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -55 + (((tickAnim - 60) / 10) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -55 + (((tickAnim - 70) / 20) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 20) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 20) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -55 + (((tickAnim - 90) / 10) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 90) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 90) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -55 + (((tickAnim - 100) / 10) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5 + (((tickAnim - 100) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 100) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -55 + (((tickAnim - 110) / 50) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 110) / 50) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 110) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -177 + (((tickAnim - 0) / 50) * (-177-(-177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -177 + (((tickAnim - 50) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (-177-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = -177 + (((tickAnim - 70) / 20) * (-177-(-177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -177 + (((tickAnim - 90) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (-177-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = -177 + (((tickAnim - 110) / 50) * (-177-(-177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane5, rightmembrane5.rotateAngleX + (float) Math.toRadians(xx), rightmembrane5.rotateAngleY + (float) Math.toRadians(yy), rightmembrane5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0 + (((tickAnim - 60) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0 + (((tickAnim - 100) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane4, rightmembrane4.rotateAngleX + (float) Math.toRadians(xx), rightmembrane4.rotateAngleY + (float) Math.toRadians(yy), rightmembrane4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -177 + (((tickAnim - 0) / 50) * (-177-(-177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = -177 + (((tickAnim - 50) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (-177-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = -177 + (((tickAnim - 70) / 20) * (-177-(-177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -177 + (((tickAnim - 90) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(-177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (-177-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = -177 + (((tickAnim - 110) / 50) * (-177-(-177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane4b, rightmembrane4b.rotateAngleX + (float) Math.toRadians(xx), rightmembrane4b.rotateAngleY + (float) Math.toRadians(yy), rightmembrane4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 60 + (((tickAnim - 0) / 50) * (60-(60)));
            yy = 10 + (((tickAnim - 0) / 50) * (10-(10)));
            zz = -75 + (((tickAnim - 0) / 50) * (-75-(-75)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 60 + (((tickAnim - 50) / 10) * (60-(60)));
            yy = 10 + (((tickAnim - 50) / 10) * (10-(10)));
            zz = -75 + (((tickAnim - 50) / 10) * (-75-(-75)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 60 + (((tickAnim - 60) / 10) * (60-(60)));
            yy = 10 + (((tickAnim - 60) / 10) * (10-(10)));
            zz = -75 + (((tickAnim - 60) / 10) * (-75-(-75)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 60 + (((tickAnim - 70) / 20) * (60-(60)));
            yy = 10 + (((tickAnim - 70) / 20) * (10-(10)));
            zz = -75 + (((tickAnim - 70) / 20) * (-75-(-75)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 60 + (((tickAnim - 90) / 10) * (60-(60)));
            yy = 10 + (((tickAnim - 90) / 10) * (10-(10)));
            zz = -75 + (((tickAnim - 90) / 10) * (-75-(-75)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 60 + (((tickAnim - 100) / 10) * (60-(60)));
            yy = 10 + (((tickAnim - 100) / 10) * (10-(10)));
            zz = -75 + (((tickAnim - 100) / 10) * (-75-(-75)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 60 + (((tickAnim - 110) / 50) * (60-(60)));
            yy = 10 + (((tickAnim - 110) / 50) * (10-(10)));
            zz = -75 + (((tickAnim - 110) / 50) * (-75-(-75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 50) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15 + (((tickAnim - 0) / 50) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15)));
            zz = 160 + (((tickAnim - 0) / 50) * (160-(160)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 50) / 10) * (160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15 + (((tickAnim - 50) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15)));
            zz = 160 + (((tickAnim - 50) / 10) * (160-(160)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0 + (((tickAnim - 60) / 10) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 60) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = 160 + (((tickAnim - 60) / 10) * (160-(160)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 20) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15 + (((tickAnim - 70) / 20) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15)));
            zz = 160 + (((tickAnim - 70) / 20) * (160-(160)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 90) / 10) * (160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15 + (((tickAnim - 90) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15)));
            zz = 160 + (((tickAnim - 90) / 10) * (160-(160)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0 + (((tickAnim - 100) / 10) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 100) / 10) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = 160 + (((tickAnim - 100) / 10) * (160-(160)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 110) / 50) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = -40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15 + (((tickAnim - 110) / 50) * (-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15-(-40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*15)));
            zz = 160 + (((tickAnim - 110) / 50) * (160-(160)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembrane, rightmembrane.rotateAngleX + (float) Math.toRadians(xx), rightmembrane.rotateAngleY + (float) Math.toRadians(yy), rightmembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightmembraneb, rightmembraneb.rotateAngleX + (float) Math.toRadians(xx), rightmembraneb.rotateAngleY + (float) Math.toRadians(yy), rightmembraneb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 0) / 50) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 70) / 20) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 70) / 20) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 90) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 100) / 10) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 100) / 10) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(17.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 110) / 50) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*-0.1)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing1.rotationPointX = this.leftwing1.rotationPointX + (float)(xx);
        this.leftwing1.rotationPointY = this.leftwing1.rotationPointY - (float)(yy);
        this.leftwing1.rotationPointZ = this.leftwing1.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 1.2 + (((tickAnim - 0) / 50) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 0) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 50) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 1.2 + (((tickAnim - 50) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 50) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 10) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 1.2 + (((tickAnim - 60) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 60) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 10) * (1-(1)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 1.2 + (((tickAnim - 70) / 20) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 70) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 70) / 20) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1.2 + (((tickAnim - 90) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 90) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 90) / 10) * (1-(1)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 1.2 + (((tickAnim - 100) / 10) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 100) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 100) / 10) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 1.2 + (((tickAnim - 110) / 50) * (1.2-(1.2)));
            yy = 1 + (((tickAnim - 110) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 50) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.leftwing1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 0) / 50) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 0) / 50) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = -107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 0) / 50) * (-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 45 + (((tickAnim - 50) / 10) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 50) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = -107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 50) / 10) * (-100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 45 + (((tickAnim - 60) / 10) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
            zz = -100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 45 + (((tickAnim - 70) / 20) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 70) / 20) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = -107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 70) / 20) * (-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 45 + (((tickAnim - 90) / 10) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 90) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = -107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 90) / 10) * (-100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 45 + (((tickAnim - 100) / 10) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 100) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
            zz = -100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-100+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 45 + (((tickAnim - 110) / 50) * (45-(45)));
            yy = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 110) / 50) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = -107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 110) / 50) * (-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-107.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30 + (((tickAnim - 0) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30 + (((tickAnim - 50) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30)));
            zz = 0 + (((tickAnim - 50) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 60) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30 + (((tickAnim - 70) / 20) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30 + (((tickAnim - 90) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30)));
            zz = 0 + (((tickAnim - 90) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 100) / 10) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 100) / 10) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = -177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30 + (((tickAnim - 110) / 50) * (-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30-(-177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*30)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane2, leftmembrane2.rotateAngleX + (float) Math.toRadians(xx), leftmembrane2.rotateAngleY + (float) Math.toRadians(yy), leftmembrane2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 50) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 60) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 70) / 20) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 90) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 100) / 10) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = -0.5 + (((tickAnim - 110) / 50) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftmembrane2.rotationPointX = this.leftmembrane2.rotationPointX + (float)(xx);
        this.leftmembrane2.rotationPointY = this.leftmembrane2.rotationPointY - (float)(yy);
        this.leftmembrane2.rotationPointZ = this.leftmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 0) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 50) / 10) * (170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 70) / 20) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 90) / 10) * (170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(170+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 110) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane2b, leftmembrane2b.rotateAngleX + (float) Math.toRadians(xx), leftmembrane2b.rotateAngleY + (float) Math.toRadians(yy), leftmembrane2b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 0) / 50) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 50) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 50) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 50) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 70) / 20) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 90) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 90) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5 + (((tickAnim - 100) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 110) / 50) * (-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-52.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 110) / 50) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0 + (((tickAnim - 60) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0 + (((tickAnim - 100) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane3, leftmembrane3.rotateAngleX + (float) Math.toRadians(xx), leftmembrane3.rotateAngleY + (float) Math.toRadians(yy), leftmembrane3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 0) / 50) * (177-(177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177 + (((tickAnim - 70) / 20) * (177-(177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 110) / 50) * (177-(177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane3b, leftmembrane3b.rotateAngleX + (float) Math.toRadians(xx), leftmembrane3b.rotateAngleY + (float) Math.toRadians(yy), leftmembrane3b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 0) / 50) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30 + (((tickAnim - 0) / 50) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 50) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 70) / 20) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30 + (((tickAnim - 70) / 20) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 70) / 20) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 90) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 90) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 100) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25 + (((tickAnim - 100) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 110) / 50) * (-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(-85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30 + (((tickAnim - 110) / 50) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-30)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -55 + (((tickAnim - 0) / 50) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 0) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 50) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -55 + (((tickAnim - 50) / 10) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 50) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 50) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -55 + (((tickAnim - 60) / 10) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 60) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -55 + (((tickAnim - 70) / 20) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 20) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 20) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -55 + (((tickAnim - 90) / 10) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 90) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 90) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -55 + (((tickAnim - 100) / 10) * (-55-(-55)));
            yy = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 100) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -55 + (((tickAnim - 110) / 50) * (-55-(-55)));
            yy = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 110) / 50) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 110) / 50) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 0) / 50) * (177-(177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177 + (((tickAnim - 70) / 20) * (177-(177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 110) / 50) * (177-(177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane5, leftmembrane5.rotateAngleX + (float) Math.toRadians(xx), leftmembrane5.rotateAngleY + (float) Math.toRadians(yy), leftmembrane5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 0) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0 + (((tickAnim - 60) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 70) / 20) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0 + (((tickAnim - 100) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 110) / 50) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane4, leftmembrane4.rotateAngleX + (float) Math.toRadians(xx), leftmembrane4.rotateAngleY + (float) Math.toRadians(yy), leftmembrane4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 0) / 50) * (177-(177)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 50) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 177 + (((tickAnim - 70) / 20) * (177-(177)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 177 + (((tickAnim - 90) / 10) * (177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(177)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (177-(177+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 177 + (((tickAnim - 110) / 50) * (177-(177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane4b, leftmembrane4b.rotateAngleX + (float) Math.toRadians(xx), leftmembrane4b.rotateAngleY + (float) Math.toRadians(yy), leftmembrane4b.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 60 + (((tickAnim - 0) / 50) * (60-(60)));
            yy = -10 + (((tickAnim - 0) / 50) * (-10-(-10)));
            zz = 75 + (((tickAnim - 0) / 50) * (75-(75)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 60 + (((tickAnim - 50) / 10) * (60-(60)));
            yy = -10 + (((tickAnim - 50) / 10) * (-10-(-10)));
            zz = 75 + (((tickAnim - 50) / 10) * (75-(75)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 60 + (((tickAnim - 60) / 10) * (60-(60)));
            yy = -10 + (((tickAnim - 60) / 10) * (-10-(-10)));
            zz = 75 + (((tickAnim - 60) / 10) * (75-(75)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 60 + (((tickAnim - 70) / 20) * (60-(60)));
            yy = -10 + (((tickAnim - 70) / 20) * (-10-(-10)));
            zz = 75 + (((tickAnim - 70) / 20) * (75-(75)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 60 + (((tickAnim - 90) / 10) * (60-(60)));
            yy = -10 + (((tickAnim - 90) / 10) * (-10-(-10)));
            zz = 75 + (((tickAnim - 90) / 10) * (75-(75)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 60 + (((tickAnim - 100) / 10) * (60-(60)));
            yy = -10 + (((tickAnim - 100) / 10) * (-10-(-10)));
            zz = 75 + (((tickAnim - 100) / 10) * (75-(75)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 60 + (((tickAnim - 110) / 50) * (60-(60)));
            yy = -10 + (((tickAnim - 110) / 50) * (-10-(-10)));
            zz = 75 + (((tickAnim - 110) / 50) * (75-(75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 50) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15 + (((tickAnim - 0) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15)));
            zz = -160 + (((tickAnim - 0) / 50) * (-160-(-160)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 50) / 10) * (160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15 + (((tickAnim - 50) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15)));
            zz = -160 + (((tickAnim - 50) / 10) * (-160-(-160)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0 + (((tickAnim - 60) / 10) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 60) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = -160 + (((tickAnim - 60) / 10) * (-160-(-160)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 20) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15 + (((tickAnim - 70) / 20) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15)));
            zz = -160 + (((tickAnim - 70) / 20) * (-160-(-160)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 90) / 10) * (160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15 + (((tickAnim - 90) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15)));
            zz = -160 + (((tickAnim - 90) / 10) * (-160-(-160)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0 + (((tickAnim - 100) / 10) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(160+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*0)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0 + (((tickAnim - 100) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*0)));
            zz = -160 + (((tickAnim - 100) / 10) * (-160-(-160)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 110) / 50) * (150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(150+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
            yy = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15 + (((tickAnim - 110) / 50) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-15)));
            zz = -160 + (((tickAnim - 110) / 50) * (-160-(-160)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(xx), leftmembrane.rotateAngleY + (float) Math.toRadians(yy), leftmembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-20)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftmembraneb, leftmembraneb.rotateAngleX + (float) Math.toRadians(xx), leftmembraneb.rotateAngleY + (float) Math.toRadians(yy), leftmembraneb.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 0) / 50) * (15-(15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 50) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 15 + (((tickAnim - 60) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 15 + (((tickAnim - 70) / 20) * (15-(15)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 15 + (((tickAnim - 90) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 15 + (((tickAnim - 100) / 10) * (15-(15)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 110) / 50) * (15-(15)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*-2.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1.25);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.75))*-2);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+30))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+150))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-50+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*2.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(0);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-0.5);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(0);

        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(90), rightleg3.rotateAngleY + (float) Math.toRadians(-20), rightleg3.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(0);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-0.5);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(0);

        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(90), leftleg3.rotateAngleY + (float) Math.toRadians(20), leftleg3.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightwing1.rotationPointX = this.rightwing1.rotationPointX + (float)(0);
        this.rightwing1.rotationPointY = this.rightwing1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1);
        this.rightwing1.rotationPointZ = this.rightwing1.rotationPointZ + (float)(0);



        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(45), rightwing2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*10), rightwing2.rotateAngleZ + (float) Math.toRadians(107.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-20));


        this.setRotateAngle(rightmembrane2, rightmembrane2.rotateAngleX + (float) Math.toRadians(0), rightmembrane2.rotateAngleY + (float) Math.toRadians(177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*-30), rightmembrane2.rotateAngleZ + (float) Math.toRadians(0));
        this.rightmembrane2.rotationPointX = this.rightmembrane2.rotationPointX + (float)(0);
        this.rightmembrane2.rotationPointY = this.rightmembrane2.rotationPointY - (float)(-0.5);
        this.rightmembrane2.rotationPointZ = this.rightmembrane2.rotationPointZ + (float)(0);


        this.setRotateAngle(rightmembrane2b, rightmembrane2b.rotateAngleX + (float) Math.toRadians(0), rightmembrane2b.rotateAngleY + (float) Math.toRadians(-177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*20), rightmembrane2b.rotateAngleZ + (float) Math.toRadians(0));
        this.rightmembrane2b.rotationPointX = this.rightmembrane2b.rotationPointX + (float)(0);
        this.rightmembrane2b.rotationPointY = this.rightmembrane2b.rotationPointY - (float)(-0.5);
        this.rightmembrane2b.rotationPointZ = this.rightmembrane2b.rotationPointZ + (float)(0);

        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightmembrane3, rightmembrane3.rotateAngleX + (float) Math.toRadians(0), rightmembrane3.rotateAngleY + (float) Math.toRadians(0), rightmembrane3.rotateAngleZ + (float) Math.toRadians(-177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*10));


        this.setRotateAngle(rightmembrane3b, rightmembrane3b.rotateAngleX + (float) Math.toRadians(0), rightmembrane3b.rotateAngleY + (float) Math.toRadians(0), rightmembrane3b.rotateAngleZ + (float) Math.toRadians(177));


        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(-55), rightwing5.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*10), rightwing5.rotateAngleZ + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-5));


        this.setRotateAngle(rightmembrane5, rightmembrane5.rotateAngleX + (float) Math.toRadians(0), rightmembrane5.rotateAngleY + (float) Math.toRadians(0), rightmembrane5.rotateAngleZ + (float) Math.toRadians(-177));


        this.setRotateAngle(rightmembrane4, rightmembrane4.rotateAngleX + (float) Math.toRadians(0), rightmembrane4.rotateAngleY + (float) Math.toRadians(0), rightmembrane4.rotateAngleZ + (float) Math.toRadians(-177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*20));


        this.setRotateAngle(rightmembrane4b, rightmembrane4b.rotateAngleX + (float) Math.toRadians(0), rightmembrane4b.rotateAngleY + (float) Math.toRadians(0), rightmembrane4b.rotateAngleZ + (float) Math.toRadians(-177));


        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(60), handR3.rotateAngleY + (float) Math.toRadians(10), handR3.rotateAngleZ + (float) Math.toRadians(-75));


        this.setRotateAngle(rightmembrane, rightmembrane.rotateAngleX + (float) Math.toRadians(150+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*10), rightmembrane.rotateAngleY + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*15), rightmembrane.rotateAngleZ + (float) Math.toRadians(160));


        this.setRotateAngle(rightmembraneb, rightmembraneb.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-20), rightmembraneb.rotateAngleY + (float) Math.toRadians(0), rightmembraneb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*20), leftwing1.rotateAngleY + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*10), leftwing1.rotateAngleZ + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*30));
        this.leftwing1.rotationPointX = this.leftwing1.rotationPointX + (float)(0);
        this.leftwing1.rotationPointY = this.leftwing1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1);
        this.leftwing1.rotationPointZ = this.leftwing1.rotationPointZ + (float)(0);



        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(45), leftwing2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*-10), leftwing2.rotateAngleZ + (float) Math.toRadians(-107.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*20));


        this.setRotateAngle(leftmembrane2, leftmembrane2.rotateAngleX + (float) Math.toRadians(0), leftmembrane2.rotateAngleY + (float) Math.toRadians(-177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*30), leftmembrane2.rotateAngleZ + (float) Math.toRadians(0));
        this.leftmembrane2.rotationPointX = this.leftmembrane2.rotationPointX + (float)(0);
        this.leftmembrane2.rotationPointY = this.leftmembrane2.rotationPointY - (float)(-0.5);
        this.leftmembrane2.rotationPointZ = this.leftmembrane2.rotationPointZ + (float)(0);


        this.setRotateAngle(leftmembrane2b, leftmembrane2b.rotateAngleX + (float) Math.toRadians(0), leftmembrane2b.rotateAngleY + (float) Math.toRadians(177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-20), leftmembrane2b.rotateAngleZ + (float) Math.toRadians(0));

        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftmembrane3, leftmembrane3.rotateAngleX + (float) Math.toRadians(0), leftmembrane3.rotateAngleY + (float) Math.toRadians(0), leftmembrane3.rotateAngleZ + (float) Math.toRadians(177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*-10));


        this.setRotateAngle(leftmembrane3b, leftmembrane3b.rotateAngleX + (float) Math.toRadians(0), leftmembrane3b.rotateAngleY + (float) Math.toRadians(0), leftmembrane3b.rotateAngleZ + (float) Math.toRadians(177));

        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(-55), leftwing5.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-10), leftwing5.rotateAngleZ + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*5));


        this.setRotateAngle(leftmembrane5, leftmembrane5.rotateAngleX + (float) Math.toRadians(0), leftmembrane5.rotateAngleY + (float) Math.toRadians(0), leftmembrane5.rotateAngleZ + (float) Math.toRadians(177));


        this.setRotateAngle(leftmembrane4, leftmembrane4.rotateAngleX + (float) Math.toRadians(0), leftmembrane4.rotateAngleY + (float) Math.toRadians(0), leftmembrane4.rotateAngleZ + (float) Math.toRadians(177+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-20));


        this.setRotateAngle(leftmembrane4b, leftmembrane4b.rotateAngleX + (float) Math.toRadians(0), leftmembrane4b.rotateAngleY + (float) Math.toRadians(0), leftmembrane4b.rotateAngleZ + (float) Math.toRadians(177));


        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(60), handR2.rotateAngleY + (float) Math.toRadians(-10), handR2.rotateAngleZ + (float) Math.toRadians(75));


        this.setRotateAngle(leftmembrane, leftmembrane.rotateAngleX + (float) Math.toRadians(150+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*10), leftmembrane.rotateAngleY + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*-15), leftmembrane.rotateAngleZ + (float) Math.toRadians(-160));


        this.setRotateAngle(leftmembraneb, leftmembraneb.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-20), leftmembraneb.rotateAngleY + (float) Math.toRadians(0), leftmembraneb.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(15), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-0.5);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-2);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-7.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*7.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-20-(-17.5)));
            yy = -15 + (((tickAnim - 0) / 2) * (0-(-15)));
            zz = 20 + (((tickAnim - 0) / 2) * (27.5-(20)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-65-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (10-(0)));
            zz = 27.5 + (((tickAnim - 2) / 1) * (-5-(27.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -65 + (((tickAnim - 3) / 1) * (-35-(-65)));
            yy = 10 + (((tickAnim - 3) / 1) * (0-(10)));
            zz = -5 + (((tickAnim - 3) / 1) * (-15-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 4) / 1) * (-20-(-35)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 4) / 1) * (-15-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -20 + (((tickAnim - 5) / 2) * (0-(-20)));
            yy = 0 + (((tickAnim - 5) / 2) * (-5-(0)));
            zz = -15 + (((tickAnim - 5) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (25-(0)));
            yy = -5 + (((tickAnim - 7) / 1) * (-15-(-5)));
            zz = -10 + (((tickAnim - 7) / 1) * (-5-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 8) / 1) * (10-(25)));
            yy = -15 + (((tickAnim - 8) / 1) * (-15-(-15)));
            zz = -5 + (((tickAnim - 8) / 1) * (5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (-17.5-(10)));
            yy = -15 + (((tickAnim - 9) / 1) * (-15-(-15)));
            zz = 5 + (((tickAnim - 9) / 1) * (20-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (1-(0.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 2) / 1) * (0-(1)));
            zz = -0.5 + (((tickAnim - 2) / 1) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.5-(0)));
            zz = -0.5 + (((tickAnim - 3) / 1) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 4) / 1) * (0-(-0.5)));
            zz = -0.5 + (((tickAnim - 4) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 7) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 8) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 9) / 1) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25 + (((tickAnim - 0) / 2) * (10-(25)));
            yy = 15 + (((tickAnim - 0) / 2) * (15-(15)));
            zz = 5 + (((tickAnim - 0) / 2) * (-5-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-17.5-(10)));
            yy = 15 + (((tickAnim - 2) / 1) * (15-(15)));
            zz = -5 + (((tickAnim - 2) / 1) * (-20-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.5 + (((tickAnim - 3) / 1) * (-20-(-17.5)));
            yy = 15 + (((tickAnim - 3) / 1) * (0-(15)));
            zz = -20 + (((tickAnim - 3) / 1) * (-27.5-(-20)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 4) / 1) * (-65-(-20)));
            yy = 0 + (((tickAnim - 4) / 1) * (-10-(0)));
            zz = -27.5 + (((tickAnim - 4) / 1) * (5-(-27.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -65 + (((tickAnim - 5) / 2) * (-35-(-65)));
            yy = -10 + (((tickAnim - 5) / 2) * (0-(-10)));
            zz = 5 + (((tickAnim - 5) / 2) * (15-(5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -35 + (((tickAnim - 7) / 1) * (-20-(-35)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 15 + (((tickAnim - 7) / 1) * (15-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 8) / 1) * (0-(-20)));
            yy = 0 + (((tickAnim - 8) / 1) * (5-(0)));
            zz = 15 + (((tickAnim - 8) / 1) * (10-(15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (25-(0)));
            yy = 5 + (((tickAnim - 9) / 1) * (15-(5)));
            zz = 10 + (((tickAnim - 9) / 1) * (5-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (-0.5-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 4) / 1) * (0-(1)));
            zz = -0.5 + (((tickAnim - 4) / 1) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.5-(0)));
            zz = -0.5 + (((tickAnim - 5) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.5 + (((tickAnim - 7) / 1) * (0-(-0.5)));
            zz = -0.5 + (((tickAnim - 7) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0.5 + (((tickAnim - 9) / 1) * (0.5-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 0) / 2) * (10-(10)));
            yy = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (10-(10)));
            yy = 10 + (((tickAnim - 2) / 1) * (10-(10)));
            zz = 15 + (((tickAnim - 2) / 1) * (15-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 3) / 1) * (10-(10)));
            yy = 10 + (((tickAnim - 3) / 1) * (10-(10)));
            zz = 15 + (((tickAnim - 3) / 1) * (27.5-(15)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 4) / 1) * (0-(10)));
            yy = 10 + (((tickAnim - 4) / 1) * (-10-(10)));
            zz = 27.5 + (((tickAnim - 4) / 1) * (27.5-(27.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -10 + (((tickAnim - 5) / 2) * (-20-(-10)));
            zz = 27.5 + (((tickAnim - 5) / 2) * (15-(27.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 1) * (-20-(-20)));
            zz = 15 + (((tickAnim - 7) / 1) * (-15-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (10-(0)));
            yy = -20 + (((tickAnim - 8) / 1) * (-10-(-20)));
            zz = -15 + (((tickAnim - 8) / 1) * (-15-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (10-(10)));
            yy = -10 + (((tickAnim - 9) / 1) * (0-(-10)));
            zz = -15 + (((tickAnim - 9) / 1) * (0-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (22.5-(-5)));
            yy = 5 + (((tickAnim - 0) / 2) * (5-(5)));
            zz = 7.5 + (((tickAnim - 0) / 2) * (-7.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 2) / 1) * (60-(22.5)));
            yy = 5 + (((tickAnim - 2) / 1) * (5-(5)));
            zz = -7.5 + (((tickAnim - 2) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 60 + (((tickAnim - 3) / 1) * (45-(60)));
            yy = 5 + (((tickAnim - 3) / 1) * (5-(5)));
            zz = -7.5 + (((tickAnim - 3) / 1) * (0-(-7.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 4) / 1) * (5-(45)));
            yy = 5 + (((tickAnim - 4) / 1) * (10-(5)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 5) / 2) * (-20-(5)));
            yy = 10 + (((tickAnim - 5) / 2) * (20-(10)));
            zz = 0 + (((tickAnim - 5) / 2) * (10-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 7) / 1) * (-10-(-20)));
            yy = 20 + (((tickAnim - 7) / 1) * (15-(20)));
            zz = 10 + (((tickAnim - 7) / 1) * (25-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 8) / 1) * (-25-(-10)));
            yy = 15 + (((tickAnim - 8) / 1) * (10-(15)));
            zz = 25 + (((tickAnim - 8) / 1) * (25-(25)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 9) / 1) * (-5-(-25)));
            yy = 10 + (((tickAnim - 9) / 1) * (5-(10)));
            zz = 25 + (((tickAnim - 9) / 1) * (7.5-(25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(0);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(0);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (10-(0)));
            yy = 20 + (((tickAnim - 0) / 2) * (10-(20)));
            zz = 15 + (((tickAnim - 0) / 2) * (15-(15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (10-(10)));
            yy = 10 + (((tickAnim - 2) / 1) * (0-(10)));
            zz = 15 + (((tickAnim - 2) / 1) * (0-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10 + (((tickAnim - 3) / 1) * (10-(10)));
            yy = 0 + (((tickAnim - 3) / 1) * (-10-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-15-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 4) / 1) * (10-(10)));
            yy = -10 + (((tickAnim - 4) / 1) * (-10-(-10)));
            zz = -15 + (((tickAnim - 4) / 1) * (-15-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 5) / 2) * (10-(10)));
            yy = -10 + (((tickAnim - 5) / 2) * (-10-(-10)));
            zz = -15 + (((tickAnim - 5) / 2) * (-27.5-(-15)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 7) / 1) * (0-(10)));
            yy = -10 + (((tickAnim - 7) / 1) * (10-(-10)));
            zz = -27.5 + (((tickAnim - 7) / 1) * (-27.5-(-27.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 10 + (((tickAnim - 8) / 1) * (20-(10)));
            zz = -27.5 + (((tickAnim - 8) / 1) * (-15-(-27.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 9) / 1) * (20-(20)));
            zz = -15 + (((tickAnim - 9) / 1) * (15-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 0) / 2) * (-10-(-10)));
            yy = -15 + (((tickAnim - 0) / 2) * (-10-(-15)));
            zz = -25 + (((tickAnim - 0) / 2) * (-25-(-25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 2) / 1) * (0-(-10)));
            yy = -10 + (((tickAnim - 2) / 1) * (-5-(-10)));
            zz = -25 + (((tickAnim - 2) / 1) * (-7.5-(-25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (22.5-(0)));
            yy = -5 + (((tickAnim - 3) / 1) * (-5-(-5)));
            zz = -7.5 + (((tickAnim - 3) / 1) * (7.5-(-7.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 22.5 + (((tickAnim - 4) / 1) * (60-(22.5)));
            yy = -5 + (((tickAnim - 4) / 1) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 4) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 60 + (((tickAnim - 5) / 2) * (45-(60)));
            yy = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 5) / 2) * (0-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 45 + (((tickAnim - 7) / 1) * (5-(45)));
            yy = -5 + (((tickAnim - 7) / 1) * (-10-(-5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 8) / 1) * (-20-(5)));
            yy = -10 + (((tickAnim - 8) / 1) * (-20-(-10)));
            zz = 0 + (((tickAnim - 8) / 1) * (-10-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 9) / 1) * (-10-(-20)));
            yy = -20 + (((tickAnim - 9) / 1) * (-15-(-20)));
            zz = -10 + (((tickAnim - 9) / 1) * (-25-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(0);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(0);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-1-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 1) * (-1-(-1)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 1) * (1-(-1)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 2) * (1-(1)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            zz = -0.5 + (((tickAnim - 7) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 1) * (1.75-(1)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.75 + (((tickAnim - 9) / 1) * (1-(1.75)));
            zz = -0.5 + (((tickAnim - 9) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane2.rotationPointX = this.rightmembrane2.rotationPointX + (float)(xx);
        this.rightmembrane2.rotationPointY = this.rightmembrane2.rotationPointY - (float)(yy);
        this.rightmembrane2.rotationPointZ = this.rightmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 12.5 + (((tickAnim - 0) / 2) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (-17.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.5 + (((tickAnim - 3) / 1) * (7.5-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (-20-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 4) / 1) * (20-(7.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (10-(0)));
            zz = -20 + (((tickAnim - 4) / 1) * (-10-(-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 5) / 2) * (0-(20)));
            yy = 10 + (((tickAnim - 5) / 2) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (-15-(0)));
            yy = 10 + (((tickAnim - 7) / 1) * (0-(10)));
            zz = -10 + (((tickAnim - 7) / 1) * (0-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -15 + (((tickAnim - 8) / 1) * (15-(-15)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 9) / 1) * (12.5-(15)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -17.5 + (((tickAnim - 0) / 2) * (-25-(-17.5)));
            yy = -5 + (((tickAnim - 0) / 2) * (-10-(-5)));
            zz = -5 + (((tickAnim - 0) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 2) / 1) * (-25-(-25)));
            yy = -10 + (((tickAnim - 2) / 1) * (-15-(-10)));
            zz = -10 + (((tickAnim - 2) / 1) * (-15-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -25 + (((tickAnim - 3) / 1) * (-25-(-25)));
            yy = -15 + (((tickAnim - 3) / 1) * (-15-(-15)));
            zz = -15 + (((tickAnim - 3) / 1) * (-15-(-15)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 4) / 1) * (-25-(-25)));
            yy = -15 + (((tickAnim - 4) / 1) * (-5-(-15)));
            zz = -15 + (((tickAnim - 4) / 1) * (-5-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 5) / 2) * (-10-(-25)));
            yy = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
            zz = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 7) / 1) * (0-(-10)));
            yy = -5 + (((tickAnim - 7) / 1) * (0-(-5)));
            zz = -5 + (((tickAnim - 7) / 1) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-5-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 9) / 1) * (-17.5-(-5)));
            yy = 0 + (((tickAnim - 9) / 1) * (-5-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (-5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20 + (((tickAnim - 0) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-27.5-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 3) / 1) * (-40-(-27.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -40 + (((tickAnim - 4) / 1) * (-12.5-(-40)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -12.5 + (((tickAnim - 5) / 2) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-20-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 9) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 2) * (1.75-(1)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.75 + (((tickAnim - 2) / 1) * (1-(1.75)));
            zz = -0.5 + (((tickAnim - 2) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 1) * (0-(1)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (-1-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 5) / 2) * (-1-(-1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 1) * (1-(-1)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 8) / 1) * (-0.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 9) / 1) * (1-(1)));
            zz = -0.5 + (((tickAnim - 9) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftmembrane2.rotationPointX = this.leftmembrane2.rotationPointX + (float)(xx);
        this.leftmembrane2.rotationPointY = this.leftmembrane2.rotationPointY - (float)(yy);
        this.leftmembrane2.rotationPointZ = this.leftmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -15 + (((tickAnim - 0) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 3) / 1) * (2.5-(-5)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 4) / 1) * (-17.5-(2.5)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -17.5 + (((tickAnim - 5) / 2) * (7.5-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (20-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 7) / 1) * (20-(7.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (-10-(0)));
            zz = 20 + (((tickAnim - 7) / 1) * (10-(20)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 20 + (((tickAnim - 8) / 1) * (0-(20)));
            yy = -10 + (((tickAnim - 8) / 1) * (-10-(-10)));
            zz = 10 + (((tickAnim - 8) / 1) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-15-(0)));
            yy = -10 + (((tickAnim - 9) / 1) * (0-(-10)));
            zz = 10 + (((tickAnim - 9) / 1) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 2) / 1) * (-17.5-(-5)));
            yy = 0 + (((tickAnim - 2) / 1) * (5-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17.5 + (((tickAnim - 3) / 1) * (-25-(-17.5)));
            yy = 5 + (((tickAnim - 3) / 1) * (10-(5)));
            zz = 5 + (((tickAnim - 3) / 1) * (10-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 4) / 1) * (-25-(-25)));
            yy = 10 + (((tickAnim - 4) / 1) * (15-(10)));
            zz = 10 + (((tickAnim - 4) / 1) * (15-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 5) / 2) * (-25-(-25)));
            yy = 15 + (((tickAnim - 5) / 2) * (15-(15)));
            zz = 15 + (((tickAnim - 5) / 2) * (15-(15)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 7) / 1) * (-25-(-25)));
            yy = 15 + (((tickAnim - 7) / 1) * (5-(15)));
            zz = 15 + (((tickAnim - 7) / 1) * (5-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -25 + (((tickAnim - 8) / 1) * (-10-(-25)));
            yy = 5 + (((tickAnim - 8) / 1) * (5-(5)));
            zz = 5 + (((tickAnim - 8) / 1) * (5-(5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 9) / 1) * (0-(-10)));
            yy = 5 + (((tickAnim - 9) / 1) * (0-(5)));
            zz = 5 + (((tickAnim - 9) / 1) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -20 + (((tickAnim - 3) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 4) / 1) * (-27.5-(-20)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -27.5 + (((tickAnim - 5) / 2) * (-40-(-27.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -40 + (((tickAnim - 7) / 1) * (-12.5-(-40)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -12.5 + (((tickAnim - 8) / 1) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 57.5 + (((tickAnim - 0) / 2) * (40-(57.5)));
            yy = -5 + (((tickAnim - 0) / 2) * (0-(-5)));
            zz = -5 + (((tickAnim - 0) / 2) * (-22.5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 2) / 1) * (30-(40)));
            yy = 0 + (((tickAnim - 2) / 1) * (-5-(0)));
            zz = -22.5 + (((tickAnim - 2) / 1) * (-10-(-22.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 30 + (((tickAnim - 3) / 1) * (-7.5-(30)));
            yy = -5 + (((tickAnim - 3) / 1) * (-5-(-5)));
            zz = -10 + (((tickAnim - 3) / 1) * (5-(-10)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 4) / 1) * (0-(-7.5)));
            yy = -5 + (((tickAnim - 4) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 4) / 1) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (7.5-(0)));
            yy = -5 + (((tickAnim - 5) / 2) * (-10-(-5)));
            zz = 5 + (((tickAnim - 5) / 2) * (5-(5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 7) / 1) * (15-(7.5)));
            yy = -10 + (((tickAnim - 7) / 1) * (-10-(-10)));
            zz = 5 + (((tickAnim - 7) / 1) * (10-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 8) / 1) * (42.5-(15)));
            yy = -10 + (((tickAnim - 8) / 1) * (-12.5-(-10)));
            zz = 10 + (((tickAnim - 8) / 1) * (5-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 42.5 + (((tickAnim - 9) / 1) * (57.5-(42.5)));
            yy = -12.5 + (((tickAnim - 9) / 1) * (-5-(-12.5)));
            zz = 5 + (((tickAnim - 9) / 1) * (-5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -20 + (((tickAnim - 0) / 2) * (-30-(-20)));
            yy = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
            zz = -2.5 + (((tickAnim - 0) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -30 + (((tickAnim - 2) / 1) * (45-(-30)));
            yy = -5 + (((tickAnim - 2) / 1) * (15-(-5)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (0-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 45 + (((tickAnim - 3) / 1) * (35-(45)));
            yy = 15 + (((tickAnim - 3) / 1) * (-5-(15)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 35 + (((tickAnim - 4) / 1) * (10-(35)));
            yy = -5 + (((tickAnim - 4) / 1) * (-10-(-5)));
            zz = 0 + (((tickAnim - 4) / 1) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 10 + (((tickAnim - 5) / 2) * (-17.5-(10)));
            yy = -10 + (((tickAnim - 5) / 2) * (-10-(-10)));
            zz = 5 + (((tickAnim - 5) / 2) * (10-(5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 7) / 1) * (0-(-17.5)));
            yy = -10 + (((tickAnim - 7) / 1) * (-10-(-10)));
            zz = 10 + (((tickAnim - 7) / 1) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (30-(0)));
            yy = -10 + (((tickAnim - 8) / 1) * (-10-(-10)));
            zz = 10 + (((tickAnim - 8) / 1) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 9) / 1) * (-20-(30)));
            yy = -10 + (((tickAnim - 9) / 1) * (-5-(-10)));
            zz = 10 + (((tickAnim - 9) / 1) * (-2.5-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (42.5-(15)));
            yy = 10 + (((tickAnim - 0) / 2) * (12.5-(10)));
            zz = -10 + (((tickAnim - 0) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 42.5 + (((tickAnim - 2) / 1) * (57.5-(42.5)));
            yy = 12.5 + (((tickAnim - 2) / 1) * (5-(12.5)));
            zz = -5 + (((tickAnim - 2) / 1) * (5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 57.5 + (((tickAnim - 3) / 1) * (40-(57.5)));
            yy = 5 + (((tickAnim - 3) / 1) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 1) * (22.5-(5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 40 + (((tickAnim - 4) / 1) * (30-(40)));
            yy = 0 + (((tickAnim - 4) / 1) * (5-(0)));
            zz = 22.5 + (((tickAnim - 4) / 1) * (10-(22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30 + (((tickAnim - 5) / 2) * (-7.5-(30)));
            yy = 5 + (((tickAnim - 5) / 2) * (5-(5)));
            zz = 10 + (((tickAnim - 5) / 2) * (-5-(10)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 7) / 1) * (0-(-7.5)));
            yy = 5 + (((tickAnim - 7) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 7) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (7.5-(0)));
            yy = 5 + (((tickAnim - 8) / 1) * (10-(5)));
            zz = -5 + (((tickAnim - 8) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 9) / 1) * (15-(7.5)));
            yy = 10 + (((tickAnim - 9) / 1) * (10-(10)));
            zz = -5 + (((tickAnim - 9) / 1) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (30-(0)));
            yy = 10 + (((tickAnim - 0) / 2) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 2) / 1) * (-20-(30)));
            yy = 10 + (((tickAnim - 2) / 1) * (5-(10)));
            zz = -10 + (((tickAnim - 2) / 1) * (2.5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -20 + (((tickAnim - 3) / 1) * (-30-(-20)));
            yy = 5 + (((tickAnim - 3) / 1) * (5-(5)));
            zz = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -30 + (((tickAnim - 4) / 1) * (45-(-30)));
            yy = 5 + (((tickAnim - 4) / 1) * (-15-(5)));
            zz = 2.5 + (((tickAnim - 4) / 1) * (0-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 45 + (((tickAnim - 5) / 2) * (35-(45)));
            yy = -15 + (((tickAnim - 5) / 2) * (5-(-15)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 7) / 1) * (10-(35)));
            yy = 5 + (((tickAnim - 7) / 1) * (10-(5)));
            zz = 0 + (((tickAnim - 7) / 1) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10 + (((tickAnim - 8) / 1) * (-17.5-(10)));
            yy = 10 + (((tickAnim - 8) / 1) * (10-(10)));
            zz = -5 + (((tickAnim - 8) / 1) * (-10-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 9) / 1) * (0-(-17.5)));
            yy = 10 + (((tickAnim - 9) / 1) * (10-(10)));
            zz = -10 + (((tickAnim - 9) / 1) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.5);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*0.5);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-7.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*7.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -65 + (((tickAnim - 0) / 3) * (-35-(-65)));
            yy = 10 + (((tickAnim - 0) / 3) * (0-(10)));
            zz = -5 + (((tickAnim - 0) / 3) * (-15-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 3) / 2) * (-20-(-35)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 3) / 2) * (-15-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (0-(-20)));
            yy = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
            zz = -15 + (((tickAnim - 5) / 3) * (-10-(-15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (25-(0)));
            yy = -5 + (((tickAnim - 8) / 2) * (-15-(-5)));
            zz = -10 + (((tickAnim - 8) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (10-(25)));
            yy = -15 + (((tickAnim - 10) / 3) * (-15-(-15)));
            zz = -5 + (((tickAnim - 10) / 3) * (5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 13) / 2) * (-17.5-(10)));
            yy = -15 + (((tickAnim - 13) / 2) * (-15-(-15)));
            zz = 5 + (((tickAnim - 13) / 2) * (20-(5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.5 + (((tickAnim - 15) / 3) * (-20-(-17.5)));
            yy = -15 + (((tickAnim - 15) / 3) * (0-(-15)));
            zz = 20 + (((tickAnim - 15) / 3) * (27.5-(20)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (-65-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (10-(0)));
            zz = 27.5 + (((tickAnim - 18) / 2) * (-5-(27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
            zz = -0.5 + (((tickAnim - 0) / 3) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
            zz = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 8) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 10) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0-(0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 2) * (0-(1)));
            zz = -0.5 + (((tickAnim - 18) / 2) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg.rotationPointX = this.rightleg.rotationPointX + (float)(xx);
        this.rightleg.rotationPointY = this.rightleg.rotationPointY - (float)(yy);
        this.rightleg.rotationPointZ = this.rightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (10-(25)));
            yy = 15 + (((tickAnim - 0) / 3) * (15-(15)));
            zz = 5 + (((tickAnim - 0) / 3) * (-5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-17.5-(10)));
            yy = 15 + (((tickAnim - 3) / 2) * (15-(15)));
            zz = -5 + (((tickAnim - 3) / 2) * (-20-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 5) / 3) * (-20-(-17.5)));
            yy = 15 + (((tickAnim - 5) / 3) * (0-(15)));
            zz = -20 + (((tickAnim - 5) / 3) * (-27.5-(-20)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (-65-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
            zz = -27.5 + (((tickAnim - 8) / 2) * (5-(-27.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -65 + (((tickAnim - 10) / 3) * (-35-(-65)));
            yy = -10 + (((tickAnim - 10) / 3) * (0-(-10)));
            zz = 5 + (((tickAnim - 10) / 3) * (15-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -35 + (((tickAnim - 13) / 2) * (-20-(-35)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 13) / 2) * (15-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 15) / 3) * (0-(-20)));
            yy = 0 + (((tickAnim - 15) / 3) * (5-(0)));
            zz = 15 + (((tickAnim - 15) / 3) * (10-(15)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (25-(0)));
            yy = 5 + (((tickAnim - 18) / 2) * (15-(5)));
            zz = 10 + (((tickAnim - 18) / 2) * (5-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 3) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            zz = -0.5 + (((tickAnim - 8) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.5-(0)));
            zz = -0.5 + (((tickAnim - 10) / 3) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
            zz = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 18) / 2) * (0.5-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg.rotationPointX = this.leftleg.rotationPointX + (float)(xx);
        this.leftleg.rotationPointY = this.leftleg.rotationPointY - (float)(yy);
        this.leftleg.rotationPointZ = this.leftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 0) / 3) * (10-(10)));
            yy = 10 + (((tickAnim - 0) / 3) * (10-(10)));
            zz = 15 + (((tickAnim - 0) / 3) * (27.5-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (0-(10)));
            yy = 10 + (((tickAnim - 3) / 2) * (-10-(10)));
            zz = 27.5 + (((tickAnim - 3) / 2) * (27.5-(27.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -10 + (((tickAnim - 5) / 3) * (-20-(-10)));
            zz = 27.5 + (((tickAnim - 5) / 3) * (15-(27.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 2) * (-20-(-20)));
            zz = 15 + (((tickAnim - 8) / 2) * (-15-(15)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (10-(0)));
            yy = -20 + (((tickAnim - 10) / 3) * (-10-(-20)));
            zz = -15 + (((tickAnim - 10) / 3) * (-15-(-15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 13) / 2) * (10-(10)));
            yy = -10 + (((tickAnim - 13) / 2) * (0-(-10)));
            zz = -15 + (((tickAnim - 13) / 2) * (0-(-15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 3) * (10-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (10-(10)));
            yy = 10 + (((tickAnim - 18) / 2) * (10-(10)));
            zz = 15 + (((tickAnim - 18) / 2) * (15-(15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 60 + (((tickAnim - 0) / 3) * (45-(60)));
            yy = 5 + (((tickAnim - 0) / 3) * (5-(5)));
            zz = -7.5 + (((tickAnim - 0) / 3) * (0-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 45 + (((tickAnim - 3) / 2) * (5-(45)));
            yy = 5 + (((tickAnim - 3) / 2) * (10-(5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (-20-(5)));
            yy = 10 + (((tickAnim - 5) / 3) * (20-(10)));
            zz = 0 + (((tickAnim - 5) / 3) * (10-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (-10-(-20)));
            yy = 20 + (((tickAnim - 8) / 2) * (15-(20)));
            zz = 10 + (((tickAnim - 8) / 2) * (25-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 10) / 3) * (-25-(-10)));
            yy = 15 + (((tickAnim - 10) / 3) * (10-(15)));
            zz = 25 + (((tickAnim - 10) / 3) * (25-(25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25 + (((tickAnim - 13) / 2) * (-5-(-25)));
            yy = 10 + (((tickAnim - 13) / 2) * (5-(10)));
            zz = 25 + (((tickAnim - 13) / 2) * (7.5-(25)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 15) / 3) * (22.5-(-5)));
            yy = 5 + (((tickAnim - 15) / 3) * (5-(5)));
            zz = 7.5 + (((tickAnim - 15) / 3) * (-7.5-(7.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 18) / 2) * (60-(22.5)));
            yy = 5 + (((tickAnim - 18) / 2) * (5-(5)));
            zz = -7.5 + (((tickAnim - 18) / 2) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightwing2.rotationPointX = this.rightwing2.rotationPointX + (float)(0);
        this.rightwing2.rotationPointY = this.rightwing2.rotationPointY - (float)(0);
        this.rightwing2.rotationPointZ = this.rightwing2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (10-(0)));
            yy = 20 + (((tickAnim - 0) / 3) * (10-(20)));
            zz = 15 + (((tickAnim - 0) / 3) * (15-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (10-(10)));
            yy = 10 + (((tickAnim - 3) / 2) * (0-(10)));
            zz = 15 + (((tickAnim - 3) / 2) * (0-(15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (-10-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (10-(10)));
            yy = -10 + (((tickAnim - 8) / 2) * (-10-(-10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-15-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 10) / 3) * (10-(10)));
            yy = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
            zz = -15 + (((tickAnim - 10) / 3) * (-27.5-(-15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 13) / 2) * (0-(10)));
            yy = -10 + (((tickAnim - 13) / 2) * (10-(-10)));
            zz = -27.5 + (((tickAnim - 13) / 2) * (-27.5-(-27.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 10 + (((tickAnim - 15) / 3) * (20-(10)));
            zz = -27.5 + (((tickAnim - 15) / 3) * (-15-(-27.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 2) * (20-(20)));
            zz = -15 + (((tickAnim - 18) / 2) * (15-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (-25-(-10)));
            yy = -15 + (((tickAnim - 0) / 3) * (-10-(-15)));
            zz = -25 + (((tickAnim - 0) / 3) * (-25-(-25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 3) / 2) * (-5-(-25)));
            yy = -10 + (((tickAnim - 3) / 2) * (-5-(-10)));
            zz = -25 + (((tickAnim - 3) / 2) * (-7.5-(-25)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 5) / 3) * (22.5-(-5)));
            yy = -5 + (((tickAnim - 5) / 3) * (-5-(-5)));
            zz = -7.5 + (((tickAnim - 5) / 3) * (7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 8) / 2) * (60-(22.5)));
            yy = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 8) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 60 + (((tickAnim - 10) / 3) * (45-(60)));
            yy = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 10) / 3) * (0-(7.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 45 + (((tickAnim - 13) / 2) * (5-(45)));
            yy = -5 + (((tickAnim - 13) / 2) * (-10-(-5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 15) / 3) * (-20-(5)));
            yy = -10 + (((tickAnim - 15) / 3) * (-20-(-10)));
            zz = 0 + (((tickAnim - 15) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (-10-(-20)));
            yy = -20 + (((tickAnim - 18) / 2) * (-15-(-20)));
            zz = -10 + (((tickAnim - 18) / 2) * (-25-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftwing2.rotationPointX = this.leftwing2.rotationPointX + (float)(0);
        this.leftwing2.rotationPointY = this.leftwing2.rotationPointY - (float)(0);
        this.leftwing2.rotationPointZ = this.leftwing2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 3) * (-1-(-1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 3) / 2) * (1-(-1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 3) * (1-(1)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            zz = -0.5 + (((tickAnim - 8) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 3) * (1.75-(1)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.75 + (((tickAnim - 13) / 2) * (1-(1.75)));
            zz = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-1-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightmembrane2.rotationPointX = this.rightmembrane2.rotationPointX + (float)(xx);
        this.rightmembrane2.rotationPointY = this.rightmembrane2.rotationPointY - (float)(yy);
        this.rightmembrane2.rotationPointZ = this.rightmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (7.5-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (20-(7.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -20 + (((tickAnim - 3) / 2) * (-10-(-20)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 5) / 3) * (0-(20)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-15-(0)));
            yy = 10 + (((tickAnim - 8) / 2) * (0-(10)));
            zz = -10 + (((tickAnim - 8) / 2) * (0-(-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 10) / 3) * (15-(-15)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (12.5-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 12.5 + (((tickAnim - 15) / 3) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 18) / 2) * (-17.5-(2.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 0) / 3) * (-25-(-25)));
            yy = -15 + (((tickAnim - 0) / 3) * (-15-(-15)));
            zz = -15 + (((tickAnim - 0) / 3) * (-15-(-15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -25 + (((tickAnim - 3) / 2) * (-25-(-25)));
            yy = -15 + (((tickAnim - 3) / 2) * (-5-(-15)));
            zz = -15 + (((tickAnim - 3) / 2) * (-5-(-15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 5) / 3) * (-10-(-25)));
            yy = -5 + (((tickAnim - 5) / 3) * (-5-(-5)));
            zz = -5 + (((tickAnim - 5) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (0-(-10)));
            yy = -5 + (((tickAnim - 8) / 2) * (0-(-5)));
            zz = -5 + (((tickAnim - 8) / 2) * (0-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 13) / 2) * (-17.5-(-5)));
            yy = 0 + (((tickAnim - 13) / 2) * (-5-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.5 + (((tickAnim - 15) / 3) * (-25-(-17.5)));
            yy = -5 + (((tickAnim - 15) / 3) * (-10-(-5)));
            zz = -5 + (((tickAnim - 15) / 3) * (-10-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25 + (((tickAnim - 18) / 2) * (-25-(-25)));
            yy = -10 + (((tickAnim - 18) / 2) * (-15-(-10)));
            zz = -10 + (((tickAnim - 18) / 2) * (-15-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.5 + (((tickAnim - 0) / 3) * (-40-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -40 + (((tickAnim - 3) / 2) * (-12.5-(-40)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 5) / 3) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 13) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 15) / 3) * (-20-(-20)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 18) / 2) * (-27.5-(-20)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (1.75-(1)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.75 + (((tickAnim - 3) / 2) * (1-(1.75)));
            zz = -0.5 + (((tickAnim - 3) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 3) * (-1-(-1)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 2) * (1-(-1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 2) * (1-(1)));
            zz = -0.5 + (((tickAnim - 18) / 2) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftmembrane2.rotationPointX = this.leftmembrane2.rotationPointX + (float)(xx);
        this.leftmembrane2.rotationPointY = this.leftmembrane2.rotationPointY - (float)(yy);
        this.leftmembrane2.rotationPointZ = this.leftmembrane2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (15-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 15 + (((tickAnim - 3) / 2) * (12.5-(15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 5) / 3) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (-17.5-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 10) / 3) * (7.5-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (20-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 7.5 + (((tickAnim - 13) / 2) * (20-(7.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (-10-(0)));
            zz = 20 + (((tickAnim - 13) / 2) * (10-(20)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 15) / 3) * (0-(20)));
            yy = -10 + (((tickAnim - 15) / 3) * (-10-(-10)));
            zz = 10 + (((tickAnim - 15) / 3) * (10-(10)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (-15-(0)));
            yy = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            zz = 10 + (((tickAnim - 18) / 2) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -5 + (((tickAnim - 3) / 2) * (-17.5-(-5)));
            yy = 0 + (((tickAnim - 3) / 2) * (5-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 5) / 3) * (-25-(-17.5)));
            yy = 5 + (((tickAnim - 5) / 3) * (10-(5)));
            zz = 5 + (((tickAnim - 5) / 3) * (10-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (-25-(-25)));
            yy = 10 + (((tickAnim - 8) / 2) * (15-(10)));
            zz = 10 + (((tickAnim - 8) / 2) * (15-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -25 + (((tickAnim - 10) / 3) * (-25-(-25)));
            yy = 15 + (((tickAnim - 10) / 3) * (15-(15)));
            zz = 15 + (((tickAnim - 10) / 3) * (15-(15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25 + (((tickAnim - 13) / 2) * (-25-(-25)));
            yy = 15 + (((tickAnim - 13) / 2) * (5-(15)));
            zz = 15 + (((tickAnim - 13) / 2) * (5-(15)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -25 + (((tickAnim - 15) / 3) * (-10-(-25)));
            yy = 5 + (((tickAnim - 15) / 3) * (5-(5)));
            zz = 5 + (((tickAnim - 15) / 3) * (5-(5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 18) / 2) * (0-(-10)));
            yy = 5 + (((tickAnim - 18) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 18) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 3) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (-20-(-20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (-27.5-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 10) / 3) * (-40-(-27.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -40 + (((tickAnim - 13) / 2) * (-12.5-(-40)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 15) / 3) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));







        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (-7.5-(30)));
            yy = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
            zz = -10 + (((tickAnim - 0) / 3) * (5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.5 + (((tickAnim - 3) / 2) * (0-(-7.5)));
            yy = -5 + (((tickAnim - 3) / 2) * (-5-(-5)));
            zz = 5 + (((tickAnim - 3) / 2) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (7.5-(0)));
            yy = -5 + (((tickAnim - 5) / 3) * (-10-(-5)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 8) / 2) * (15-(7.5)));
            yy = -10 + (((tickAnim - 8) / 2) * (-10-(-10)));
            zz = 5 + (((tickAnim - 8) / 2) * (10-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15 + (((tickAnim - 10) / 3) * (42.5-(15)));
            yy = -10 + (((tickAnim - 10) / 3) * (-12.5-(-10)));
            zz = 10 + (((tickAnim - 10) / 3) * (5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 42.5 + (((tickAnim - 13) / 2) * (57.5-(42.5)));
            yy = -12.5 + (((tickAnim - 13) / 2) * (-5-(-12.5)));
            zz = 5 + (((tickAnim - 13) / 2) * (-5-(5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 57.5 + (((tickAnim - 15) / 3) * (40-(57.5)));
            yy = -5 + (((tickAnim - 15) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 15) / 3) * (-22.5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 18) / 2) * (30-(40)));
            yy = 0 + (((tickAnim - 18) / 2) * (-5-(0)));
            zz = -22.5 + (((tickAnim - 18) / 2) * (-10-(-22.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 45 + (((tickAnim - 0) / 3) * (35-(45)));
            yy = 15 + (((tickAnim - 0) / 3) * (-5-(15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 35 + (((tickAnim - 3) / 2) * (10-(35)));
            yy = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
            zz = 0 + (((tickAnim - 3) / 2) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (-17.5-(10)));
            yy = -10 + (((tickAnim - 5) / 3) * (-10-(-10)));
            zz = 5 + (((tickAnim - 5) / 3) * (10-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (0-(-17.5)));
            yy = -10 + (((tickAnim - 8) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 8) / 2) * (10-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (30-(0)));
            yy = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
            zz = 10 + (((tickAnim - 10) / 3) * (10-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 13) / 2) * (-20-(30)));
            yy = -10 + (((tickAnim - 13) / 2) * (-5-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (-2.5-(10)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 15) / 3) * (-30-(-20)));
            yy = -5 + (((tickAnim - 15) / 3) * (-5-(-5)));
            zz = -2.5 + (((tickAnim - 15) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 18) / 2) * (45-(-30)));
            yy = -5 + (((tickAnim - 18) / 2) * (15-(-5)));
            zz = -2.5 + (((tickAnim - 18) / 2) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 0) / 3) * (42.5-(15)));
            yy = 10 + (((tickAnim - 0) / 3) * (12.5-(10)));
            zz = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 3) / 2) * (57.5-(42.5)));
            yy = 12.5 + (((tickAnim - 3) / 2) * (5-(12.5)));
            zz = -5 + (((tickAnim - 3) / 2) * (5-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 57.5 + (((tickAnim - 5) / 3) * (40-(57.5)));
            yy = 5 + (((tickAnim - 5) / 3) * (0-(5)));
            zz = 5 + (((tickAnim - 5) / 3) * (22.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (30-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (5-(0)));
            zz = 22.5 + (((tickAnim - 8) / 2) * (10-(22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 10) / 3) * (-7.5-(30)));
            yy = 5 + (((tickAnim - 10) / 3) * (5-(5)));
            zz = 10 + (((tickAnim - 10) / 3) * (-5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 13) / 2) * (0-(-7.5)));
            yy = 5 + (((tickAnim - 13) / 2) * (5-(5)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (7.5-(0)));
            yy = 5 + (((tickAnim - 15) / 3) * (10-(5)));
            zz = -5 + (((tickAnim - 15) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 18) / 2) * (15-(7.5)));
            yy = 10 + (((tickAnim - 18) / 2) * (10-(10)));
            zz = -5 + (((tickAnim - 18) / 2) * (-10-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30-(0)));
            yy = 10 + (((tickAnim - 0) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30 + (((tickAnim - 3) / 2) * (-20-(30)));
            yy = 10 + (((tickAnim - 3) / 2) * (5-(10)));
            zz = -10 + (((tickAnim - 3) / 2) * (2.5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (-30-(-20)));
            yy = 5 + (((tickAnim - 5) / 3) * (5-(5)));
            zz = 2.5 + (((tickAnim - 5) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (45-(-30)));
            yy = 5 + (((tickAnim - 8) / 2) * (-15-(5)));
            zz = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 45 + (((tickAnim - 10) / 3) * (35-(45)));
            yy = -15 + (((tickAnim - 10) / 3) * (5-(-15)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 35 + (((tickAnim - 13) / 2) * (10-(35)));
            yy = 5 + (((tickAnim - 13) / 2) * (10-(5)));
            zz = 0 + (((tickAnim - 13) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 15) / 3) * (-17.5-(10)));
            yy = 10 + (((tickAnim - 15) / 3) * (10-(10)));
            zz = -5 + (((tickAnim - 15) / 3) * (-10-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 18) / 2) * (0-(-17.5)));
            yy = 10 + (((tickAnim - 18) / 2) * (10-(10)));
            zz = -10 + (((tickAnim - 18) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPterodactylus entity = (EntityPrehistoricFloraPterodactylus) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 10) / 10) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 2 + (((tickAnim - 30) / 10) * (-2-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.5 + (((tickAnim - 0) / 5) * (0.5-(-0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 5) / 5) * (0-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 18) / 7) * (0.75-(-0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0.75 + (((tickAnim - 25) / 5) * (0-(0.75)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = -0.5 + (((tickAnim - 38) / 2) * (-0.5-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -24.34 + (((tickAnim - 0) / 14) * (0-(-24.34)));
            yy = 0.7 + (((tickAnim - 0) / 14) * (0-(0.7)));
            zz = 3.08 + (((tickAnim - 0) / 14) * (0-(3.08)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (-58.69056-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.6976-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (7.4219-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -58.69056 + (((tickAnim - 20) / 20) * (-24.34-(-58.69056)));
            yy = 1.6976 + (((tickAnim - 20) / 20) * (0.7-(1.6976)));
            zz = 7.4219 + (((tickAnim - 20) / 20) * (3.08-(7.4219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -17.56 + (((tickAnim - 0) / 14) * (-30-(-17.56)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 14) / 6) * (0-(-30)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (-17.56-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 37.71 + (((tickAnim - 0) / 14) * (31.6085-(37.71)));
            yy = 38.68 + (((tickAnim - 0) / 14) * (9.1655-(38.68)));
            zz = -22.83 + (((tickAnim - 0) / 14) * (-24.6702-(-22.83)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 31.6085 + (((tickAnim - 14) / 6) * (46.32298-(31.6085)));
            yy = 9.1655 + (((tickAnim - 14) / 6) * (80.3556-(9.1655)));
            zz = -24.6702 + (((tickAnim - 14) / 6) * (-20.2332-(-24.6702)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 46.32298 + (((tickAnim - 20) / 20) * (37.71-(46.32298)));
            yy = 80.3556 + (((tickAnim - 20) / 20) * (38.68-(80.3556)));
            zz = -20.2332 + (((tickAnim - 20) / 20) * (-22.83-(-20.2332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -58.69056 + (((tickAnim - 0) / 34) * (0-(-58.69056)));
            yy = -1.69759 + (((tickAnim - 0) / 34) * (0-(-1.69759)));
            zz = -7.42189 + (((tickAnim - 0) / 34) * (0-(-7.42189)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (-58.69056-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (-1.69759-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (-7.42189-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 34) / 6) * (0-(-30)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 46.32298 + (((tickAnim - 0) / 34) * (31.6085-(46.32298)));
            yy = -80.35555 + (((tickAnim - 0) / 34) * (-9.16551-(-80.35555)));
            zz = 20.23324 + (((tickAnim - 0) / 34) * (24.67017-(20.23324)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 31.6085 + (((tickAnim - 34) / 6) * (46.32298-(31.6085)));
            yy = -9.16551 + (((tickAnim - 34) / 6) * (-80.35555-(-9.16551)));
            zz = 24.67017 + (((tickAnim - 34) / 6) * (20.23324-(24.67017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftlegmembrane, leftlegmembrane.rotateAngleX + (float) Math.toRadians(xx), leftlegmembrane.rotateAngleY + (float) Math.toRadians(yy), leftlegmembrane.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.13 + (((tickAnim - 0) / 10) * (40.70129-(27.13)));
            yy = 44.07 + (((tickAnim - 0) / 10) * (66.1105-(44.07)));
            zz = 39.78 + (((tickAnim - 0) / 10) * (59.6737-(39.78)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 40.70129 + (((tickAnim - 10) / 6) * (1.3373-(40.70129)));
            yy = 66.1105 + (((tickAnim - 10) / 6) * (30.4277-(66.1105)));
            zz = 59.6737 + (((tickAnim - 10) / 6) * (42.2246-(59.6737)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.3373 + (((tickAnim - 16) / 4) * (0-(1.3373)));
            yy = 30.4277 + (((tickAnim - 16) / 4) * (0-(30.4277)));
            zz = 42.2246 + (((tickAnim - 16) / 4) * (0-(42.2246)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (27.13-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (44.07-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (39.78-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.67 + (((tickAnim - 0) / 10) * (-11.70638-(-5.67)));
            yy = -6.86 + (((tickAnim - 0) / 10) * (-11.3368-(-6.86)));
            zz = -34.65 + (((tickAnim - 0) / 10) * (-54.3071-(-34.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -11.70638 + (((tickAnim - 10) / 6) * (-4.88-(-11.70638)));
            yy = -11.3368 + (((tickAnim - 10) / 6) * (-4.72-(-11.3368)));
            zz = -54.3071 + (((tickAnim - 10) / 6) * (-22.63-(-54.3071)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.88 + (((tickAnim - 16) / 4) * (6.40105-(-4.88)));
            yy = -4.72 + (((tickAnim - 16) / 4) * (2.1017-(-4.72)));
            zz = -22.63 + (((tickAnim - 16) / 4) * (4.6682-(-22.63)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 6.40105 + (((tickAnim - 20) / 20) * (-5.67-(6.40105)));
            yy = 2.1017 + (((tickAnim - 20) / 20) * (-6.86-(2.1017)));
            zz = 4.6682 + (((tickAnim - 20) / 20) * (-34.65-(4.6682)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -18.33 + (((tickAnim - 0) / 10) * (-16.67-(-18.33)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -16.67 + (((tickAnim - 10) / 5) * (16.66-(-16.67)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 16.66 + (((tickAnim - 15) / 5) * (0-(16.66)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-20-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 10) * (-18.33-(-20)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (40.70129-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-66.11053-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-59.67368-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 40.70129 + (((tickAnim - 30) / 6) * (1.3373-(40.70129)));
            yy = -66.11053 + (((tickAnim - 30) / 6) * (-30.42773-(-66.11053)));
            zz = -59.67368 + (((tickAnim - 30) / 6) * (-42.22459-(-59.67368)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 1.3373 + (((tickAnim - 36) / 4) * (0-(1.3373)));
            yy = -30.42773 + (((tickAnim - 36) / 4) * (0-(-30.42773)));
            zz = -42.22459 + (((tickAnim - 36) / 4) * (0-(-42.22459)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 6.40105 + (((tickAnim - 0) / 30) * (-11.70638-(6.40105)));
            yy = -2.10171 + (((tickAnim - 0) / 30) * (11.33677-(-2.10171)));
            zz = -4.66821 + (((tickAnim - 0) / 30) * (54.3071-(-4.66821)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -11.70638 + (((tickAnim - 30) / 6) * (-4.88-(-11.70638)));
            yy = 11.33677 + (((tickAnim - 30) / 6) * (4.72-(11.33677)));
            zz = 54.3071 + (((tickAnim - 30) / 6) * (22.63-(54.3071)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -4.88 + (((tickAnim - 36) / 4) * (6.40105-(-4.88)));
            yy = 4.72 + (((tickAnim - 36) / 4) * (-2.10171-(4.72)));
            zz = 22.63 + (((tickAnim - 36) / 4) * (-4.66821-(22.63)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 20) * (16.67-(20)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 16.67 + (((tickAnim - 30) / 5) * (-16.66-(16.67)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -16.66 + (((tickAnim - 35) / 5) * (0-(-16.66)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -4 + (((tickAnim - 13) / 12) * (-5-(-4)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -4 + (((tickAnim - 9) / 10) * (-5-(-4)));
            yy = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 19) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 30) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 26) / 14) * (0-(10)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(root, ((0.2618F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body1_r1, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg, ((0.5633F)-(0.4391F)), ((-0.0702F)-(-0.3715F)),((-1.242F)-(-0.6947F)));
        animator.rotate(leftleg2, ((0.4808F)-(0.3264F)), ((-0.2184F)-(-0.3322F)),((0.1965F)-(0.4417F)));
        animator.rotate(leftleg3, ((1.2162F)-(-0.4597F)), ((0.2407F)-(0.7739F)),((0.2122F)-(-0.1433F)));
        animator.rotate(leftlegmembrane, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftleg_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg, ((0.5633F)-(0.4391F)), ((0.0702F)-(0.3715F)),((1.242F)-(0.6947F)));
        animator.rotate(rightleg2, ((0.4808F)-(0.3264F)), ((0.2184F)-(0.3322F)),((-0.1965F)-(-0.4417F)));
        animator.rotate(rightleg3, ((1.2162F)-(-0.4597F)), ((-0.2407F)-(-0.7739F)),((-0.2122F)-(0.1433F)));
        animator.rotate(rightlegmembrane, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightleg_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0892F)-(-0.0892F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest_r1, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing1, ((-0.3044F)-(-0.3124F)), ((-0.0745F)-(-0.0215F)),((0.0466F)-(0.213F)));
        animator.rotate(leftwing2, ((-0.2245F)-(-0.4707F)), ((-0.0123F)-(0.1588F)),((-1.6342F)-(-0.5911F)));
        animator.rotate(leftwing3, ((-1.4832F)-(-0.8118F)), ((-0.0869F)-(-0.2253F)),((-0.0076F)-(0.1633F)));
        animator.rotate(leftwing4, ((0.1685F)-(1.6089F)), ((-0.1181F)-(-0.2053F)),((-0.0116F)-(-0.015F)));
        animator.rotate(leftwing5, ((0.3065F)-(0.9993F)), ((-0.0832F)-(0.011F)),((-0.0263F)-(0.1208F)));
        animator.rotate(handR2, ((-0.3054F)-(-1.5272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing1, ((-0.3044F)-(-0.3124F)), ((0.0745F)-(0.0215F)),((-0.0466F)-(-0.213F)));
        animator.rotate(rightwing2, ((-0.2245F)-(-0.4707F)), ((0.0123F)-(-0.1588F)),((1.6342F)-(0.5911F)));
        animator.rotate(rightwing3, ((-1.4832F)-(-0.8118F)), ((0.0869F)-(0.2253F)),((0.0076F)-(-0.1633F)));
        animator.rotate(rightwing4, ((0.1685F)-(1.6089F)), ((0.1181F)-(0.2053F)),((0.0116F)-(0.015F)));
        animator.rotate(rightwing5, ((0.3065F)-(0.9993F)), ((0.0832F)-(-0.011F)),((0.0263F)-(-0.1208F)));
        animator.rotate(handR3, ((-0.3054F)-(-1.5272F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck, ((-0.3927F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.3491F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((0.8727F)-(0.8727F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0791F)-(0.0791F)), ((-0.0368F)-(-0.0368F)),((0.4349F)-(0.4349F)));
        animator.rotate(cube_r3, ((0.0791F)-(0.0791F)), ((0.0368F)-(0.0368F)),((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r4, ((0.1047F)-(0.1047F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0852F)-(0.0852F)), ((0.0189F)-(0.0189F)),((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r8, ((0.0852F)-(0.0852F)), ((-0.0189F)-(-0.0189F)),((0.2174F)-(0.2174F)));
        animator.rotate(cube_r9, ((-0.3403F)-(-0.3403F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(root, -((0.2618F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body1_r1, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg, -((0.5633F)-(0.4391F)), -((-0.0702F)-(-0.3715F)),-((-1.242F)-(-0.6947F)));
        animator.rotate(leftleg2, -((0.4808F)-(0.3264F)), -((-0.2184F)-(-0.3322F)),-((0.1965F)-(0.4417F)));
        animator.rotate(leftleg3, -((1.2162F)-(-0.4597F)), -((0.2407F)-(0.7739F)),-((0.2122F)-(-0.1433F)));
        animator.rotate(leftlegmembrane, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftleg_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg, -((0.5633F)-(0.4391F)), -((0.0702F)-(0.3715F)),-((1.242F)-(0.6947F)));
        animator.rotate(rightleg2, -((0.4808F)-(0.3264F)), -((0.2184F)-(0.3322F)),-((-0.1965F)-(-0.4417F)));
        animator.rotate(rightleg3, -((1.2162F)-(-0.4597F)), -((-0.2407F)-(-0.7739F)),-((-0.2122F)-(0.1433F)));
        animator.rotate(rightlegmembrane, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightleg_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0892F)-(-0.0892F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest_r1, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing1, -((-0.3044F)-(-0.3124F)), -((-0.0745F)-(-0.0215F)),-((0.0466F)-(0.213F)));
        animator.rotate(leftwing2, -((-0.2245F)-(-0.4707F)), -((-0.0123F)-(0.1588F)),-((-1.6342F)-(-0.5911F)));
        animator.rotate(leftwing3, -((-1.4832F)-(-0.8118F)), -((-0.0869F)-(-0.2253F)),-((-0.0076F)-(0.1633F)));
        animator.rotate(leftwing4, -((0.1685F)-(1.6089F)), -((-0.1181F)-(-0.2053F)),-((-0.0116F)-(-0.015F)));
        animator.rotate(leftwing5, -((0.3065F)-(0.9993F)), -((-0.0832F)-(0.011F)),-((-0.0263F)-(0.1208F)));
        animator.rotate(handR2, -((-0.3054F)-(-1.5272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing1, -((-0.3044F)-(-0.3124F)), -((0.0745F)-(0.0215F)),-((-0.0466F)-(-0.213F)));
        animator.rotate(rightwing2, -((-0.2245F)-(-0.4707F)), -((0.0123F)-(-0.1588F)),-((1.6342F)-(0.5911F)));
        animator.rotate(rightwing3, -((-1.4832F)-(-0.8118F)), -((0.0869F)-(0.2253F)),-((0.0076F)-(-0.1633F)));
        animator.rotate(rightwing4, -((0.1685F)-(1.6089F)), -((0.1181F)-(0.2053F)),-((0.0116F)-(0.015F)));
        animator.rotate(rightwing5, -((0.3065F)-(0.9993F)), -((0.0832F)-(-0.011F)),-((0.0263F)-(-0.1208F)));
        animator.rotate(handR3, -((-0.3054F)-(-1.5272F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck, -((-0.3927F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.3491F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((0.8727F)-(0.8727F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0791F)-(0.0791F)), -((-0.0368F)-(-0.0368F)),-((0.4349F)-(0.4349F)));
        animator.rotate(cube_r3, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r4, -((0.1047F)-(0.1047F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0852F)-(0.0852F)), -((0.0189F)-(0.0189F)),-((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r8, -((0.0852F)-(0.0852F)), -((-0.0189F)-(-0.0189F)),-((0.2174F)-(0.2174F)));
        animator.rotate(cube_r9, -((-0.3403F)-(-0.3403F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
