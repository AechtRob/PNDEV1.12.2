package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGermanodactylus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelGermanodactylus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended upperlegLeft;
    private final AdvancedModelRendererExtended lowerlegLeft;
    private final AdvancedModelRendererExtended footLeft;
    private final AdvancedModelRendererExtended legwing2;
    private final AdvancedModelRendererExtended legwing3;
    private final AdvancedModelRendererExtended upperlegRight;
    private final AdvancedModelRendererExtended lowerlegRight;
    private final AdvancedModelRendererExtended footRight;
    private final AdvancedModelRendererExtended legwing4;
    private final AdvancedModelRendererExtended legwing5;
    private final AdvancedModelRendererExtended wing1left;
    private final AdvancedModelRendererExtended wing1leftM;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended wing1leftM2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended wing2left;
    private final AdvancedModelRendererExtended wing2leftM;
    private final AdvancedModelRendererExtended wing3left;
    private final AdvancedModelRendererExtended wing4left;
    private final AdvancedModelRendererExtended leftmembranetip;
    private final AdvancedModelRendererExtended handR2;
    private final AdvancedModelRendererExtended leftmembranemiddle;
    private final AdvancedModelRendererExtended wing3leftM;
    private final AdvancedModelRendererExtended wing1right;
    private final AdvancedModelRendererExtended wing1rightM;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended wing1rightM2;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended wing2right;
    private final AdvancedModelRendererExtended wing2rightM;
    private final AdvancedModelRendererExtended wing3right;
    private final AdvancedModelRendererExtended wing4right;
    private final AdvancedModelRendererExtended rightmembranetip;
    private final AdvancedModelRendererExtended handR3;
    private final AdvancedModelRendererExtended rightmembranemiddle;
    private final AdvancedModelRendererExtended wing3rightM;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;

    private ModelAnimator animator;

    public ModelGermanodactylus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 1.95F, -2.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 16.5F, -2.45F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0456F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 20, 0, -2.0F, -2.0F, -0.5F, 4, 4, 6, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 5.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 20, 27, -1.5F, -2.0F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -0.8307F, 4.5943F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 12, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.01F, false));

        this.upperlegLeft = new AdvancedModelRendererExtended(this);
        this.upperlegLeft.setRotationPoint(1.0F, -0.45F, 1.8F);
        this.body1.addChild(upperlegLeft);
        this.setRotateAngle(upperlegLeft, 0.3032F, -0.2463F, -1.447F);
        this.upperlegLeft.cubeList.add(new ModelBox(upperlegLeft, 11, 0, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.lowerlegLeft = new AdvancedModelRendererExtended(this);
        this.lowerlegLeft.setRotationPoint(-0.15F, 2.7F, -0.55F);
        this.upperlegLeft.addChild(lowerlegLeft);
        this.setRotateAngle(lowerlegLeft, 0.581F, 0.0573F, 1.4953F);
        this.lowerlegLeft.cubeList.add(new ModelBox(lowerlegLeft, 20, 20, -0.5F, -0.2F, -0.5F, 1, 5, 1, 0.0F, false));

        this.footLeft = new AdvancedModelRendererExtended(this);
        this.footLeft.setRotationPoint(0.0F, 4.85F, -0.55F);
        this.lowerlegLeft.addChild(footLeft);
        this.setRotateAngle(footLeft, -0.3023F, -0.2248F, -0.0157F);
        this.footLeft.cubeList.add(new ModelBox(footLeft, 30, 25, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing2 = new AdvancedModelRendererExtended(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegLeft.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 0, 18, 0.0F, -0.25F, 0.0F, 0, 5, 2, 0.0F, false));

        this.legwing3 = new AdvancedModelRendererExtended(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegLeft.addChild(legwing3);


        this.upperlegRight = new AdvancedModelRendererExtended(this);
        this.upperlegRight.setRotationPoint(-1.0F, -0.45F, 1.8F);
        this.body1.addChild(upperlegRight);
        this.setRotateAngle(upperlegRight, 0.3068F, 0.2463F, 1.512F);
        this.upperlegRight.cubeList.add(new ModelBox(upperlegRight, 11, 0, -0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.lowerlegRight = new AdvancedModelRendererExtended(this);
        this.lowerlegRight.setRotationPoint(0.15F, 2.7F, -0.55F);
        this.upperlegRight.addChild(lowerlegRight);
        this.setRotateAngle(lowerlegRight, 0.581F, -0.0573F, -1.4953F);
        this.lowerlegRight.cubeList.add(new ModelBox(lowerlegRight, 20, 20, -0.5F, -0.2F, -0.5F, 1, 5, 1, 0.0F, true));

        this.footRight = new AdvancedModelRendererExtended(this);
        this.footRight.setRotationPoint(0.0F, 4.85F, -0.55F);
        this.lowerlegRight.addChild(footRight);
        this.setRotateAngle(footRight, -0.3023F, 0.2248F, 0.0157F);
        this.footRight.cubeList.add(new ModelBox(footRight, 30, 25, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing4 = new AdvancedModelRendererExtended(this);
        this.legwing4.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegRight.addChild(legwing4);
        this.setRotateAngle(legwing4, -0.0911F, 0.0F, 0.0F);
        this.legwing4.cubeList.add(new ModelBox(legwing4, 0, 18, 0.0F, -0.25F, 0.0F, 0, 5, 2, 0.0F, true));

        this.legwing5 = new AdvancedModelRendererExtended(this);
        this.legwing5.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegRight.addChild(legwing5);


        this.wing1left = new AdvancedModelRendererExtended(this);
        this.wing1left.setRotationPoint(1.85F, -0.2F, -0.35F);
        this.chest.addChild(wing1left);
        this.setRotateAngle(wing1left, 0.0F, 0.0873F, 0.0F);
        this.wing1left.cubeList.add(new ModelBox(wing1left, 20, 10, -1.5F, -0.5F, 0.0F, 5, 1, 5, 0.0F, false));

        this.wing1leftM = new AdvancedModelRendererExtended(this);
        this.wing1leftM.setRotationPoint(1.0F, 0.0F, 5.0F);
        this.wing1left.addChild(wing1leftM);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.wing1leftM.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 45, -2.5F, 0.0F, 0.0F, 5, 0, 3, 0.0F, false));

        this.wing1leftM2 = new AdvancedModelRendererExtended(this);
        this.wing1leftM2.setRotationPoint(1.7F, 0.1774F, 7.2827F);
        this.wing1left.addChild(wing1leftM2);
        this.setRotateAngle(wing1leftM2, -0.48F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-0.7F, 0.0F, -3.1F);
        this.wing1leftM2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 29, 45, -0.5F, 0.0F, 3.0F, 3, 0, 4, 0.0F, false));

        this.wing2left = new AdvancedModelRendererExtended(this);
        this.wing2left.setRotationPoint(2.45F, 0.1F, 0.3F);
        this.wing1left.addChild(wing2left);
        this.setRotateAngle(wing2left, 0.0633F, 0.0747F, -0.1253F);
        this.wing2left.cubeList.add(new ModelBox(wing2left, 8, 8, -0.5F, 0.0F, 0.0F, 1, 6, 4, 0.0F, false));

        this.wing2leftM = new AdvancedModelRendererExtended(this);
        this.wing2leftM.setRotationPoint(-9.3F, 10.6F, 11.0F);
        this.wing2left.addChild(wing2leftM);
        this.wing2leftM.cubeList.add(new ModelBox(wing2leftM, 21, 46, 9.3F, -10.575F, -7.0F, 0, 6, 4, 0.0F, false));

        this.wing3left = new AdvancedModelRendererExtended(this);
        this.wing3left.setRotationPoint(0.1F, 6.0F, 0.3F);
        this.wing2left.addChild(wing3left);
        this.setRotateAngle(wing3left, -0.0305F, 0.0F, 0.0F);
        this.wing3left.cubeList.add(new ModelBox(wing3left, 0, 20, -0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.wing4left = new AdvancedModelRendererExtended(this);
        this.wing4left.setRotationPoint(-0.1F, 0.0F, 5.7F);
        this.wing3left.addChild(wing4left);
        this.setRotateAngle(wing4left, 1.1193F, 0.0F, 0.0F);
        this.wing4left.cubeList.add(new ModelBox(wing4left, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 18, 0.0F, false));

        this.leftmembranetip = new AdvancedModelRendererExtended(this);
        this.leftmembranetip.setRotationPoint(0.0F, -0.95F, 9.0F);
        this.wing4left.addChild(leftmembranetip);
        this.leftmembranetip.cubeList.add(new ModelBox(leftmembranetip, 0, 20, -0.5F, -1.95F, -9.0F, 1, 1, 18, -0.01F, false));

        this.handR2 = new AdvancedModelRendererExtended(this);
        this.handR2.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wing3left.addChild(handR2);
        this.setRotateAngle(handR2, -1.6937F, 0.111F, -1.5109F);
        this.handR2.cubeList.add(new ModelBox(handR2, 20, 0, -0.5F, -0.5F, 0.2F, 1, 1, 2, 0.0F, false));

        this.leftmembranemiddle = new AdvancedModelRendererExtended(this);
        this.leftmembranemiddle.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.wing3left.addChild(leftmembranemiddle);
        this.leftmembranemiddle.cubeList.add(new ModelBox(leftmembranemiddle, 20, 20, -0.5F, -1.925F, -2.0F, 1, 1, 6, -0.01F, false));

        this.wing3leftM = new AdvancedModelRendererExtended(this);
        this.wing3leftM.setRotationPoint(-9.4F, -0.4F, 4.7F);
        this.leftmembranemiddle.addChild(wing3leftM);
        this.wing3leftM.cubeList.add(new ModelBox(wing3leftM, 0, 43, 9.4F, -4.525F, -6.7F, 0, 3, 8, 0.0F, false));

        this.wing1right = new AdvancedModelRendererExtended(this);
        this.wing1right.setRotationPoint(-1.85F, -0.2F, -0.35F);
        this.chest.addChild(wing1right);
        this.setRotateAngle(wing1right, 0.0F, -0.0873F, 0.0F);
        this.wing1right.cubeList.add(new ModelBox(wing1right, 20, 10, -3.5F, -0.5F, 0.0F, 5, 1, 5, 0.0F, true));

        this.wing1rightM = new AdvancedModelRendererExtended(this);
        this.wing1rightM.setRotationPoint(-1.0F, 0.0F, 5.0F);
        this.wing1right.addChild(wing1rightM);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.wing1rightM.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, -2.5F, 0.0F, 0.0F, 5, 0, 3, 0.0F, true));

        this.wing1rightM2 = new AdvancedModelRendererExtended(this);
        this.wing1rightM2.setRotationPoint(-1.7F, 0.1774F, 7.5077F);
        this.wing1right.addChild(wing1rightM2);
        this.setRotateAngle(wing1rightM2, -0.48F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.7F, 0.0F, -3.1F);
        this.wing1rightM2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 45, -2.5F, 0.0F, 3.0F, 3, 0, 4, 0.0F, true));

        this.wing2right = new AdvancedModelRendererExtended(this);
        this.wing2right.setRotationPoint(-2.45F, 0.1F, 0.3F);
        this.wing1right.addChild(wing2right);
        this.setRotateAngle(wing2right, 0.0633F, -0.0747F, 0.1253F);
        this.wing2right.cubeList.add(new ModelBox(wing2right, 8, 8, -0.5F, 0.0F, 0.0F, 1, 6, 4, 0.0F, true));

        this.wing2rightM = new AdvancedModelRendererExtended(this);
        this.wing2rightM.setRotationPoint(9.3F, 10.6F, 11.0F);
        this.wing2right.addChild(wing2rightM);
        this.wing2rightM.cubeList.add(new ModelBox(wing2rightM, 21, 46, -9.3F, -10.575F, -7.0F, 0, 6, 4, 0.0F, true));

        this.wing3right = new AdvancedModelRendererExtended(this);
        this.wing3right.setRotationPoint(-0.1F, 6.0F, 0.3F);
        this.wing2right.addChild(wing3right);
        this.setRotateAngle(wing3right, -0.0305F, 0.0F, 0.0F);
        this.wing3right.cubeList.add(new ModelBox(wing3right, 0, 20, -0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F, true));

        this.wing4right = new AdvancedModelRendererExtended(this);
        this.wing4right.setRotationPoint(0.1F, 0.0F, 5.7F);
        this.wing3right.addChild(wing4right);
        this.setRotateAngle(wing4right, 1.1193F, 0.0F, 0.0F);
        this.wing4right.cubeList.add(new ModelBox(wing4right, 0, 0, -0.5F, -2.0F, 0.0F, 1, 2, 18, 0.0F, true));

        this.rightmembranetip = new AdvancedModelRendererExtended(this);
        this.rightmembranetip.setRotationPoint(0.0F, -0.95F, 9.0F);
        this.wing4right.addChild(rightmembranetip);
        this.rightmembranetip.cubeList.add(new ModelBox(rightmembranetip, 0, 20, -0.5F, -1.95F, -9.0F, 1, 1, 18, -0.01F, true));

        this.handR3 = new AdvancedModelRendererExtended(this);
        this.handR3.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wing3right.addChild(handR3);
        this.setRotateAngle(handR3, -1.6937F, -0.111F, 1.5109F);
        this.handR3.cubeList.add(new ModelBox(handR3, 20, 0, -0.5F, -0.5F, 0.2F, 1, 1, 2, 0.0F, true));

        this.rightmembranemiddle = new AdvancedModelRendererExtended(this);
        this.rightmembranemiddle.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.wing3right.addChild(rightmembranemiddle);
        this.rightmembranemiddle.cubeList.add(new ModelBox(rightmembranemiddle, 20, 20, -0.5F, -1.925F, -2.0F, 1, 1, 6, -0.01F, true));

        this.wing3rightM = new AdvancedModelRendererExtended(this);
        this.wing3rightM.setRotationPoint(9.4F, -0.4F, 4.7F);
        this.rightmembranemiddle.addChild(wing3rightM);
        this.wing3rightM.cubeList.add(new ModelBox(wing3rightM, 0, 43, -9.4F, -4.525F, -6.7F, 0, 3, 8, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.15F, -0.05F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, -1.5F, -1.7395F, -4.4772F, 3, 3, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -0.7395F, -3.4772F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 20, -1.0F, -1.0F, -3.0F, 2, 3, 3, 0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.05F, -3.55F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 28, 20, -1.5F, -0.5F, -2.5F, 3, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.55F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.55F, 0.0F, -2.0F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -2.5F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -0.5F, -1.0F, -6.9F, 1, 1, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 36, -1.0F, -1.0F, -2.9F, 2, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.0F, 1.7073F, -3.8473F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0791F, -0.0368F, 0.4349F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 1, 0.0F, -0.8269F, -0.5436F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, 1.8816F, -6.8397F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0791F, -0.0368F, 0.4349F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, 0.0F, -0.7769F, -1.5436F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.5F, 1.8816F, -6.8397F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0791F, 0.0368F, -0.4349F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, 0.0F, -0.7769F, -1.5436F, 0, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.4835F, -2.5079F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2269F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, 0.0F, -3.2367F, -4.1966F, 0, 4, 6, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 28, -1.0F, 0.2633F, -3.1966F, 2, 1, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.0F, 1.7073F, -3.8473F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0791F, 0.0368F, -0.4349F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 1, 0.0F, -0.8269F, -0.5436F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.5068F, -1.488F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 31, -1.5F, -0.0068F, -1.012F, 3, 1, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 0, -1.0F, -0.8068F, -1.012F, 2, 1, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.2043F, -3.4465F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0791F, 0.0368F, -0.4349F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 2, 0.0F, -0.2981F, -0.4564F, 0, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.5529F, -7.4313F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0852F, 0.0189F, -0.2174F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, 0.0F, -0.2481F, 0.5436F, 0, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(1.0F, 0.2043F, -3.4465F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0791F, -0.0368F, 0.4349F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, 0.0F, -0.2981F, -0.4564F, 0, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -0.0068F, -1.012F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 34, -1.0F, 0.0F, -2.9F, 2, 1, 3, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 29, -0.5F, 0.0F, -6.9F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.5F, 0.5529F, -7.4313F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0852F, -0.0189F, 0.2174F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, 0.0F, -0.2481F, 0.5436F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, 1.4932F, 0.488F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 35, 10, -1.0F, -1.025F, -1.575F, 2, 1, 3, 0.0F, false));


        this.leftmembranetip.scaleChildren = true;
        this.rightmembranetip.scaleChildren = true;

        this.leftmembranetip.setScale((float)1,(float)0.2,(float)1);
        this.rightmembranetip.setScale((float)1,(float)0.4,(float)1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.offsetY = -0.15F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.root.offsetY = -0.12F;
        this.root.offsetZ = 0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.2F;
        this.root.offsetX = 0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.2F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.8F, -0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
            this.faceTarget(f3, f4, 8, neck);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

            //if (ee.getIsMoving()) {
            AdvancedModelRenderer[] wingLeft = {this.wing1left, this.wing2left, this.wing3left, this.wing4left};
            AdvancedModelRenderer[] wingRight = {this.wing1right, this.wing2right, this.wing3right, this.wing4right};

            AdvancedModelRenderer[] legLeft = {this.upperlegLeft, this.lowerlegLeft, this.footLeft};
            AdvancedModelRenderer[] legRight = {this.upperlegRight, this.lowerlegRight, this.footRight};

            AdvancedModelRenderer[] tailFullFly = {this.tail1};
            float speedFly = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob
            if (flier.getIsFast()) { //Flying fast
                speedFly = 2.24F;
            }
            else { //Flying regular

            }


        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 6, neck);
            this.faceTarget(f3, f4, 6, neck2);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGermanodactylus ee = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {

            if (ee.getAnimation() != ee.UNFLY_ANIMATION) {
                this.leftmembranetip.setScale((float) 1, (float) 1, (float) 1);
                this.rightmembranetip.setScale((float) 1, (float) 1, (float) 1);
            }

            //flight pose
            this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(chest, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r10, 0.2269F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r11, 0.0791F, 0.0368F, -0.4349F);
            this.setRotateAngle(cube_r12, 0.0791F, 0.0368F, -0.4349F);
            this.setRotateAngle(cube_r13, 0.0852F, 0.0189F, -0.2174F);
            this.setRotateAngle(cube_r14, 0.0791F, -0.0368F, 0.4349F);
            this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.0852F, -0.0189F, 0.2174F);
            this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r4, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0791F, -0.0368F, 0.4349F);
            this.setRotateAngle(cube_r8, 0.0791F, -0.0368F, 0.4349F);
            this.setRotateAngle(cube_r9, 0.0791F, 0.0368F, -0.4349F);
            this.setRotateAngle(footLeft, 0.7886F, -0.2248F, -0.0157F);
            this.setRotateAngle(footRight, 0.7973F, 0.2248F, 0.0157F);
            this.setRotateAngle(handR2, -1.6937F, 0.111F, -1.5109F);
            this.setRotateAngle(handR3, -1.6937F, -0.111F, 1.5109F);
            this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(legwing2, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(legwing4, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(lowerlegLeft, 0.3979F, 0.2002F, 0.2181F);
            this.setRotateAngle(lowerlegRight, 0.3979F, 0.2002F, -0.2181F);
            this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegLeft, 0.2964F, -0.0226F, -1.5101F);
            this.setRotateAngle(upperlegRight, 0.2964F, -0.0226F, 1.5101F);
            this.setRotateAngle(wing1left, 0.0F, 0.0873F, 0.0F);
            this.setRotateAngle(wing1leftM2, -0.48F, 0.0F, 0.0F);
            this.setRotateAngle(wing1right, 0.0F, -0.0873F, 0.0F);
            this.setRotateAngle(wing1rightM2, -0.48F, 0.0F, 0.0F);
            this.setRotateAngle(wing2left, 0.0633F, 0.0316F, -1.5236F);
            this.setRotateAngle(wing2right, -0.0627F, -0.0316F, 1.5236F);
            this.setRotateAngle(wing3left, -1.5577F, 0.0F, 0.0F);
            this.setRotateAngle(wing3right, -1.5446F, 0.0218F, 0.0006F);
            this.setRotateAngle(wing4left, 0.0721F, 0.0F, 0.0F);
            this.setRotateAngle(wing4right, 0.1593F, 0.0F, 0.0F);

            if (ee.getAttachmentPos() == null ) {
                //if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Flying fast
                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else { //Flying regular
                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                //}
            }

        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
                this.leftmembranetip.setScale((float)1,(float)0.2,(float)1);
                this.rightmembranetip.setScale((float)1,(float)0.4,(float)1);
            }
        }

        if (ee.getAttachmentPos() == null ) {
            //if (ee.getIsMoving()) {
//                if (ee.getIsFast()) { //Flying fast
//                    animFlyFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
//                else { //Flying regular
//                    animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
//                }
            //}
        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Walking fast
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -6 + (((tickAnim - 5) / 10) * (0-(-6)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.60017-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (14.16331-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-14.48674-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -3.60017 + (((tickAnim - 5) / 10) * (0-(-3.60017)));
            yy = 14.16331 + (((tickAnim - 5) / 10) * (0-(14.16331)));
            zz = -14.48674 + (((tickAnim - 5) / 10) * (0-(-14.48674)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (12.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 12.75 + (((tickAnim - 5) / 10) * (0-(12.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 5) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -15.25 + (((tickAnim - 5) / 10) * (0-(-15.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -18 + (((tickAnim - 5) / 10) * (0-(-18)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 28.75 + (((tickAnim - 5) / 3) * (4.56-(28.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.56 + (((tickAnim - 8) / 2) * (19.25-(4.56)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 19.25 + (((tickAnim - 10) / 3) * (-4.12-(19.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.12 + (((tickAnim - 13) / 2) * (0-(-4.12)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (21-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 8) / 2) * (0-(21)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (22.75-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.75 + (((tickAnim - 13) / 2) * (0-(22.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.6002-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-14.1633-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (14.4867-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -3.6002 + (((tickAnim - 5) / 10) * (0-(-3.6002)));
            yy = -14.1633 + (((tickAnim - 5) / 10) * (0-(-14.1633)));
            zz = 14.4867 + (((tickAnim - 5) / 10) * (0-(14.4867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-12.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = -12.75 + (((tickAnim - 5) / 10) * (0-(-12.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 5.5 + (((tickAnim - 5) / 10) * (0-(5.5)));
            yy = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -11 + (((tickAnim - 3) / 4) * (-5-(-11)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 7) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.65-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.65 + (((tickAnim - 7) / 3) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20.5 + (((tickAnim - 3) / 4) * (10.5-(-20.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 10.5 + (((tickAnim - 7) / 3) * (0-(10.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -0.625 + (((tickAnim - 7) / 3) * (0-(-0.625)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 28 + (((tickAnim - 3) / 4) * (-31.77643-(28)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.97682-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (-3.09988-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -31.77643 + (((tickAnim - 7) / 3) * (0-(-31.77643)));
            yy = 0.97682 + (((tickAnim - 7) / 3) * (0-(0.97682)));
            zz = -3.09988 + (((tickAnim - 7) / 3) * (0-(-3.09988)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (29.75-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 29.75 + (((tickAnim - 7) / 1) * (0-(29.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -5.75 + (((tickAnim - 5) / 8) * (16.25-(-5.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 16.25 + (((tickAnim - 13) / 6) * (12.25-(16.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.25 + (((tickAnim - 19) / 6) * (0-(12.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -8.5 + (((tickAnim - 5) / 4) * (-9.25-(-8.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -9.25 + (((tickAnim - 9) / 4) * (5-(-9.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 5 + (((tickAnim - 13) / 6) * (-6.25-(5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 19) / 6) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 33.25 + (((tickAnim - 5) / 4) * (15.08-(33.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 15.08 + (((tickAnim - 9) / 4) * (-3.59517-(15.08)));
            yy = 0 + (((tickAnim - 9) / 4) * (-1.06826-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.78297-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -3.59517 + (((tickAnim - 13) / 6) * (-31.34517-(-3.59517)));
            yy = -1.06826 + (((tickAnim - 13) / 6) * (-1.06826-(-1.06826)));
            zz = 0.78297 + (((tickAnim - 13) / 6) * (0.78297-(0.78297)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -31.34517 + (((tickAnim - 19) / 6) * (0-(-31.34517)));
            yy = -1.06826 + (((tickAnim - 19) / 6) * (0-(-1.06826)));
            zz = 0.78297 + (((tickAnim - 19) / 6) * (0-(0.78297)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (20.5-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.5 + (((tickAnim - 9) / 4) * (0-(20.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (24-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 24 + (((tickAnim - 19) / 2) * (0-(24)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }


    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-7.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*7.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.8);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*0.6);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.278-30))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416+40))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.416))*-5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.55195 + (((tickAnim - 0) / 3) * (20.18531-(23.55195)));
            yy = 10.29757 + (((tickAnim - 0) / 3) * (12.42808-(10.29757)));
            zz = 9.23793 + (((tickAnim - 0) / 3) * (6.45772-(9.23793)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20.18531 + (((tickAnim - 3) / 4) * (-16.33893-(20.18531)));
            yy = 12.42808 + (((tickAnim - 3) / 4) * (4.47551-(12.42808)));
            zz = 6.45772 + (((tickAnim - 3) / 4) * (-30.01881-(6.45772)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.33893 + (((tickAnim - 7) / 3) * (-55.17469-(-16.33893)));
            yy = 4.47551 + (((tickAnim - 7) / 3) * (-0.17754-(4.47551)));
            zz = -30.01881 + (((tickAnim - 7) / 3) * (-0.40394-(-30.01881)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -55.17469 + (((tickAnim - 10) / 2) * (-59.95089-(-55.17469)));
            yy = -0.17754 + (((tickAnim - 10) / 2) * (15.7293-(-0.17754)));
            zz = -0.40394 + (((tickAnim - 10) / 2) * (17.6224-(-0.40394)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -59.95089 + (((tickAnim - 12) / 3) * (-26.50873-(-59.95089)));
            yy = 15.7293 + (((tickAnim - 12) / 3) * (13.07894-(15.7293)));
            zz = 17.6224 + (((tickAnim - 12) / 3) * (11.30659-(17.6224)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -26.50873 + (((tickAnim - 15) / 5) * (23.55195-(-26.50873)));
            yy = 13.07894 + (((tickAnim - 15) / 5) * (10.29757-(13.07894)));
            zz = 11.30659 + (((tickAnim - 15) / 5) * (9.23793-(11.30659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 24.76661 + (((tickAnim - 0) / 3) * (33.57714-(24.76661)));
            yy = 21.20113 + (((tickAnim - 0) / 3) * (19.38639-(21.20113)));
            zz = -18.38264 + (((tickAnim - 0) / 3) * (-9.3371-(-18.38264)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 33.57714 + (((tickAnim - 3) / 4) * (1.13797-(33.57714)));
            yy = 19.38639 + (((tickAnim - 3) / 4) * (-4.36605-(19.38639)));
            zz = -9.3371 + (((tickAnim - 3) / 4) * (28.11324-(-9.3371)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1.13797 + (((tickAnim - 7) / 3) * (-20.88111-(1.13797)));
            yy = -4.36605 + (((tickAnim - 7) / 3) * (-23.27101-(-4.36605)));
            zz = 28.11324 + (((tickAnim - 7) / 3) * (-0.49372-(28.11324)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -20.88111 + (((tickAnim - 10) / 2) * (-16.56887-(-20.88111)));
            yy = -23.27101 + (((tickAnim - 10) / 2) * (-25.5894-(-23.27101)));
            zz = -0.49372 + (((tickAnim - 10) / 2) * (-27.3344-(-0.49372)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -16.56887 + (((tickAnim - 12) / 3) * (-0.3982-(-16.56887)));
            yy = -25.5894 + (((tickAnim - 12) / 3) * (-9.603-(-25.5894)));
            zz = -27.3344 + (((tickAnim - 12) / 3) * (-19.54852-(-27.3344)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.3982 + (((tickAnim - 15) / 5) * (24.76661-(-0.3982)));
            yy = -9.603 + (((tickAnim - 15) / 5) * (21.20113-(-9.603)));
            zz = -19.54852 + (((tickAnim - 15) / 5) * (-18.38264-(-19.54852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.32708 + (((tickAnim - 0) / 3) * (33.57708-(14.32708)));
            yy = 12.23301 + (((tickAnim - 0) / 3) * (12.23301-(12.23301)));
            zz = -0.65068 + (((tickAnim - 0) / 3) * (-0.65068-(-0.65068)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 33.57708 + (((tickAnim - 3) / 4) * (19.20092-(33.57708)));
            yy = 12.23301 + (((tickAnim - 3) / 4) * (5.4369-(12.23301)));
            zz = -0.65068 + (((tickAnim - 3) / 4) * (-0.28919-(-0.65068)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 19.20092 + (((tickAnim - 7) / 3) * (41-(19.20092)));
            yy = 5.4369 + (((tickAnim - 7) / 3) * (0-(5.4369)));
            zz = -0.28919 + (((tickAnim - 7) / 3) * (0-(-0.28919)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 41 + (((tickAnim - 10) / 2) * (29.75-(41)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 29.75 + (((tickAnim - 12) / 3) * (-7.9534-(29.75)));
            yy = 0 + (((tickAnim - 12) / 3) * (8.15785-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (6.81308-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -7.9534 + (((tickAnim - 15) / 5) * (14.32708-(-7.9534)));
            yy = 8.15785 + (((tickAnim - 15) / 5) * (12.23301-(8.15785)));
            zz = 6.81308 + (((tickAnim - 15) / 5) * (-0.65068-(6.81308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (15.95545-(0)));
            yy = 22.25 + (((tickAnim - 0) / 10) * (-21.22002-(22.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.08188-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 15.95545 + (((tickAnim - 10) / 5) * (-11.66866-(15.95545)));
            yy = -21.22002 + (((tickAnim - 10) / 5) * (1.92335-(-21.22002)));
            zz = -2.08188 + (((tickAnim - 10) / 5) * (-54.4492-(-2.08188)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -11.66866 + (((tickAnim - 15) / 5) * (0-(-11.66866)));
            yy = 1.92335 + (((tickAnim - 15) / 5) * (22.25-(1.92335)));
            zz = -54.4492 + (((tickAnim - 15) / 5) * (0-(-54.4492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wing1leftM, wing1leftM.rotateAngleX + (float) Math.toRadians(-5.45723), wing1leftM.rotateAngleY + (float) Math.toRadians(-1.66442), wing1leftM.rotateAngleZ + (float) Math.toRadians(11.94942));
        this.wing1leftM.rotationPointX = this.wing1leftM.rotationPointX + (float)(-1.25);
        this.wing1leftM.rotationPointY = this.wing1leftM.rotationPointY - (float)(0.25);
        this.wing1leftM.rotationPointZ = this.wing1leftM.rotationPointZ + (float)(-2.52);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13 + (((tickAnim - 0) / 10) * (15.93889-(-13)));
            yy = 0 + (((tickAnim - 0) / 10) * (13.71049-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.82291-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 15.93889 + (((tickAnim - 10) / 5) * (-1.06659-(15.93889)));
            yy = 13.71049 + (((tickAnim - 10) / 5) * (-0.5342-(13.71049)));
            zz = 4.82291 + (((tickAnim - 10) / 5) * (15.02764-(4.82291)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.06659 + (((tickAnim - 15) / 3) * (-20.95616-(-1.06659)));
            yy = -0.5342 + (((tickAnim - 15) / 3) * (-0.53848-(-0.5342)));
            zz = 15.02764 + (((tickAnim - 15) / 3) * (12.89192-(15.02764)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -20.95616 + (((tickAnim - 18) / 2) * (-13-(-20.95616)));
            yy = -0.53848 + (((tickAnim - 18) / 2) * (0-(-0.53848)));
            zz = 12.89192 + (((tickAnim - 18) / 2) * (0-(12.89192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(xx), wing2left.rotateAngleY + (float) Math.toRadians(yy), wing2left.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.725 + (((tickAnim - 10) / 5) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 18) / 2) * (0-(0.65)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing2left.rotationPointX = this.wing2left.rotationPointX + (float)(xx);
        this.wing2left.rotationPointY = this.wing2left.rotationPointY - (float)(yy);
        this.wing2left.rotationPointZ = this.wing2left.rotationPointZ + (float)(zz);



        this.wing2leftM.rotationPointX = this.wing2leftM.rotationPointX + (float)(0);
        this.wing2leftM.rotationPointY = this.wing2leftM.rotationPointY - (float)(0);
        this.wing2leftM.rotationPointZ = this.wing2leftM.rotationPointZ + (float)(-3.15);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 0) / 10) * (-33.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -33.25 + (((tickAnim - 10) / 10) * (7.5-(-33.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3left, wing3left.rotateAngleX + (float) Math.toRadians(xx), wing3left.rotateAngleY + (float) Math.toRadians(yy), wing3left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 0) / 10) * (35-(11)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 10) / 10) * (11-(35)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4left, wing4left.rotateAngleX + (float) Math.toRadians(xx), wing4left.rotateAngleY + (float) Math.toRadians(yy), wing4left.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.65-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.65 + (((tickAnim - 10) / 10) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing4left.rotationPointX = this.wing4left.rotationPointX + (float)(xx);
        this.wing4left.rotationPointY = this.wing4left.rotationPointY - (float)(yy);
        this.wing4left.rotationPointZ = this.wing4left.rotationPointZ + (float)(zz);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 0) / 10) * (-21.95244-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.32349-(0)));
            zz = 7.5 + (((tickAnim - 0) / 10) * (11.67923-(7.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -21.95244 + (((tickAnim - 10) / 5) * (-6.34406-(-21.95244)));
            yy = 2.32349 + (((tickAnim - 10) / 5) * (20.06309-(2.32349)));
            zz = 11.67923 + (((tickAnim - 10) / 5) * (58.41986-(11.67923)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -6.34406 + (((tickAnim - 15) / 5) * (-22.5-(-6.34406)));
            yy = 20.06309 + (((tickAnim - 15) / 5) * (0-(20.06309)));
            zz = 58.41986 + (((tickAnim - 15) / 5) * (7.5-(58.41986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(xx), handR2.rotateAngleY + (float) Math.toRadians(yy), handR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -56.42063 + (((tickAnim - 0) / 3) * (-59.95089-(-56.42063)));
            yy = 4.4883 + (((tickAnim - 0) / 3) * (-15.7293-(4.4883)));
            zz = 5.60022 + (((tickAnim - 0) / 3) * (-17.62236-(5.60022)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -59.95089 + (((tickAnim - 3) / 1) * (-41.40185-(-59.95089)));
            yy = -15.7293 + (((tickAnim - 3) / 1) * (-11.096-(-15.7293)));
            zz = -17.62236 + (((tickAnim - 3) / 1) * (-14.60433-(-17.62236)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -41.40185 + (((tickAnim - 4) / 3) * (-14.02136-(-41.40185)));
            yy = -11.096 + (((tickAnim - 4) / 3) * (-11.8176-(-11.096)));
            zz = -14.60433 + (((tickAnim - 4) / 3) * (-27.19382-(-14.60433)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -14.02136 + (((tickAnim - 7) / 3) * (23.55195-(-14.02136)));
            yy = -11.8176 + (((tickAnim - 7) / 3) * (-10.2976-(-11.8176)));
            zz = -27.19382 + (((tickAnim - 7) / 3) * (-9.2379-(-27.19382)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 23.55195 + (((tickAnim - 10) / 3) * (21.55195-(23.55195)));
            yy = -10.2976 + (((tickAnim - 10) / 3) * (-10.2976-(-10.2976)));
            zz = -9.2379 + (((tickAnim - 10) / 3) * (-9.2379-(-9.2379)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 21.55195 + (((tickAnim - 13) / 5) * (-25.89688-(21.55195)));
            yy = -10.2976 + (((tickAnim - 13) / 5) * (-0.5178-(-10.2976)));
            zz = -9.2379 + (((tickAnim - 13) / 5) * (25.35799-(-9.2379)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -25.89688 + (((tickAnim - 18) / 2) * (-56.42063-(-25.89688)));
            yy = -0.5178 + (((tickAnim - 18) / 2) * (4.4883-(-0.5178)));
            zz = 25.35799 + (((tickAnim - 18) / 2) * (5.60022-(25.35799)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20.00774 + (((tickAnim - 0) / 3) * (-16.56887-(-20.00774)));
            yy = 22.71508 + (((tickAnim - 0) / 3) * (25.5894-(22.71508)));
            zz = -3.08287 + (((tickAnim - 0) / 3) * (27.33441-(-3.08287)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -16.56887 + (((tickAnim - 3) / 1) * (-4.021-(-16.56887)));
            yy = 25.5894 + (((tickAnim - 3) / 1) * (20.39735-(25.5894)));
            zz = 27.33441 + (((tickAnim - 3) / 1) * (20.92937-(27.33441)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -4.021 + (((tickAnim - 4) / 3) * (6.94851-(-4.021)));
            yy = 20.39735 + (((tickAnim - 4) / 3) * (6.96585-(20.39735)));
            zz = 20.92937 + (((tickAnim - 4) / 3) * (23.64956-(20.92937)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.94851 + (((tickAnim - 7) / 3) * (24.76661-(6.94851)));
            yy = 6.96585 + (((tickAnim - 7) / 3) * (-21.2011-(6.96585)));
            zz = 23.64956 + (((tickAnim - 7) / 3) * (18.3826-(23.64956)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 24.76661 + (((tickAnim - 10) / 3) * (38.74274-(24.76661)));
            yy = -21.2011 + (((tickAnim - 10) / 3) * (-18.43214-(-21.2011)));
            zz = 18.3826 + (((tickAnim - 10) / 3) * (16.53242-(18.3826)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 38.74274 + (((tickAnim - 13) / 5) * (-24.23732-(38.74274)));
            yy = -18.43214 + (((tickAnim - 13) / 5) * (14.68004-(-18.43214)));
            zz = 16.53242 + (((tickAnim - 13) / 5) * (-23.03251-(16.53242)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -24.23732 + (((tickAnim - 18) / 2) * (-20.00774-(-24.23732)));
            yy = 14.68004 + (((tickAnim - 18) / 2) * (22.71508-(14.68004)));
            zz = -23.03251 + (((tickAnim - 18) / 2) * (-3.08287-(-23.03251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41 + (((tickAnim - 0) / 3) * (29.75-(41)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 29.75 + (((tickAnim - 3) / 4) * (-24.06829-(29.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (-6.79611-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.3615-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -24.06829 + (((tickAnim - 7) / 3) * (14.32708-(-24.06829)));
            yy = -6.79611 + (((tickAnim - 7) / 3) * (-12.233-(-6.79611)));
            zz = 0.3615 + (((tickAnim - 7) / 3) * (0.6507-(0.3615)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14.32708 + (((tickAnim - 10) / 3) * (30.32708-(14.32708)));
            yy = -12.233 + (((tickAnim - 10) / 3) * (-12.233-(-12.233)));
            zz = 0.6507 + (((tickAnim - 10) / 3) * (0.6507-(0.6507)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.32708 + (((tickAnim - 13) / 7) * (41-(30.32708)));
            yy = -12.233 + (((tickAnim - 13) / 7) * (0-(-12.233)));
            zz = 0.6507 + (((tickAnim - 13) / 7) * (0-(0.6507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 13.58741 + (((tickAnim - 0) / 20) * (13.58741-(13.58741)));
            yy = -17.74145 + (((tickAnim - 0) / 20) * (-17.74145-(-17.74145)));
            zz = -0.56007 + (((tickAnim - 0) / 20) * (-0.56007-(-0.56007)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1leftM2, wing1leftM2.rotateAngleX + (float) Math.toRadians(xx), wing1leftM2.rotateAngleY + (float) Math.toRadians(yy), wing1leftM2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -4.15 + (((tickAnim - 0) / 10) * (0.125-(-4.15)));
            yy = 0.6 + (((tickAnim - 0) / 10) * (0.6-(0.6)));
            zz = -3.175 + (((tickAnim - 0) / 10) * (-3.995-(-3.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.125 + (((tickAnim - 10) / 10) * (-4.15-(0.125)));
            yy = 0.6 + (((tickAnim - 10) / 10) * (0.6-(0.6)));
            zz = -3.995 + (((tickAnim - 10) / 10) * (-3.175-(-3.995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing1leftM2.rotationPointX = this.wing1leftM2.rotationPointX + (float)(xx);
        this.wing1leftM2.rotationPointY = this.wing1leftM2.rotationPointY - (float)(yy);
        this.wing1leftM2.rotationPointZ = this.wing1leftM2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 72.25 + (((tickAnim - 0) / 20) * (72.25-(72.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3leftM, wing3leftM.rotateAngleX + (float) Math.toRadians(xx), wing3leftM.rotateAngleY + (float) Math.toRadians(yy), wing3leftM.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 4.35 + (((tickAnim - 0) / 10) * (4.35-(4.35)));
            zz = 0.65 + (((tickAnim - 0) / 10) * (-0.6-(0.65)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.35 + (((tickAnim - 10) / 10) * (4.35-(4.35)));
            zz = -0.6 + (((tickAnim - 10) / 10) * (0.65-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing3leftM.rotationPointX = this.wing3leftM.rotationPointX + (float)(xx);
        this.wing3leftM.rotationPointY = this.wing3leftM.rotationPointY - (float)(yy);
        this.wing3leftM.rotationPointZ = this.wing3leftM.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.87295 + (((tickAnim - 0) / 5) * (-7.0603-(14.87295)));
            yy = 26.37346 + (((tickAnim - 0) / 5) * (-14.32737-(26.37346)));
            zz = 3.47816 + (((tickAnim - 0) / 5) * (51.0465-(3.47816)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7.0603 + (((tickAnim - 5) / 5) * (0-(-7.0603)));
            yy = -14.32737 + (((tickAnim - 5) / 5) * (-22.25-(-14.32737)));
            zz = 51.0465 + (((tickAnim - 5) / 5) * (0-(51.0465)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (14.87295-(0)));
            yy = -22.25 + (((tickAnim - 10) / 10) * (26.37346-(-22.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (3.47816-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(wing1rightM, wing1rightM.rotateAngleX + (float) Math.toRadians(0), wing1rightM.rotateAngleY + (float) Math.toRadians(5.75), wing1rightM.rotateAngleZ + (float) Math.toRadians(0));
        this.wing1rightM.rotationPointX = this.wing1rightM.rotationPointX + (float)(0.775);
        this.wing1rightM.rotationPointY = this.wing1rightM.rotationPointY - (float)(0);
        this.wing1rightM.rotationPointZ = this.wing1rightM.rotationPointZ + (float)(-2.55);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1rightM2, wing1rightM2.rotateAngleX + (float) Math.toRadians(xx), wing1rightM2.rotateAngleY + (float) Math.toRadians(yy), wing1rightM2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.345-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.26-(0)));
            zz = -2.5 + (((tickAnim - 0) / 5) * (-2.81-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3.345 + (((tickAnim - 5) / 5) * (4.35-(3.345)));
            yy = 0.26 + (((tickAnim - 5) / 5) * (0.525-(0.26)));
            zz = -2.81 + (((tickAnim - 5) / 5) * (-3.125-(-2.81)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.35 + (((tickAnim - 10) / 10) * (0-(4.35)));
            yy = 0.525 + (((tickAnim - 10) / 10) * (0-(0.525)));
            zz = -3.125 + (((tickAnim - 10) / 10) * (-2.5-(-3.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing1rightM2.rotationPointX = this.wing1rightM2.rotationPointX + (float)(xx);
        this.wing1rightM2.rotationPointY = this.wing1rightM2.rotationPointY - (float)(yy);
        this.wing1rightM2.rotationPointZ = this.wing1rightM2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.65935 + (((tickAnim - 0) / 5) * (1.83562-(-4.65935)));
            yy = -15.30893 + (((tickAnim - 0) / 5) * (-4.87031-(-15.30893)));
            zz = 0.84495 + (((tickAnim - 0) / 5) * (-8.94148-(0.84495)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1.83562 + (((tickAnim - 5) / 3) * (-11.8674-(1.83562)));
            yy = -4.87031 + (((tickAnim - 5) / 3) * (-0.79906-(-4.87031)));
            zz = -8.94148 + (((tickAnim - 5) / 3) * (-17.35581-(-8.94148)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -11.8674 + (((tickAnim - 8) / 2) * (-14-(-11.8674)));
            yy = -0.79906 + (((tickAnim - 8) / 2) * (0-(-0.79906)));
            zz = -17.35581 + (((tickAnim - 8) / 2) * (0-(-17.35581)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 10) / 10) * (-4.65935-(-14)));
            yy = 0 + (((tickAnim - 10) / 10) * (-15.30893-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.84495-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(xx), wing2right.rotateAngleY + (float) Math.toRadians(yy), wing2right.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 2) * (0-(0.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing2right.rotationPointX = this.wing2right.rotationPointX + (float)(xx);
        this.wing2right.rotationPointY = this.wing2right.rotationPointY - (float)(yy);
        this.wing2right.rotationPointZ = this.wing2right.rotationPointZ + (float)(zz);



        this.wing2rightM.rotationPointX = this.wing2rightM.rotationPointX + (float)(0);
        this.wing2rightM.rotationPointY = this.wing2rightM.rotationPointY - (float)(0);
        this.wing2rightM.rotationPointZ = this.wing2rightM.rotationPointZ + (float)(-4);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -13 + (((tickAnim - 0) / 5) * (1.5-(-13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.5 + (((tickAnim - 5) / 5) * (4.5-(1.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 10) / 10) * (-13-(4.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(xx), wing3right.rotateAngleY + (float) Math.toRadians(yy), wing3right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 30 + (((tickAnim - 0) / 11) * (16.13-(30)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 16.13 + (((tickAnim - 11) / 9) * (30-(16.13)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4right, wing4right.rotateAngleX + (float) Math.toRadians(xx), wing4right.rotateAngleY + (float) Math.toRadians(yy), wing4right.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0.525 + (((tickAnim - 0) / 20) * (0.525-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing4right.rotationPointX = this.wing4right.rotationPointX + (float)(xx);
        this.wing4right.rotationPointY = this.wing4right.rotationPointY - (float)(yy);
        this.wing4right.rotationPointZ = this.wing4right.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.493-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.77263-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-64.93814-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.493 + (((tickAnim - 5) / 5) * (0-(4.493)));
            yy = -2.77263 + (((tickAnim - 5) / 5) * (0-(-2.77263)));
            zz = -64.93814 + (((tickAnim - 5) / 5) * (0-(-64.93814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(xx), handR3.rotateAngleY + (float) Math.toRadians(yy), handR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 73.75 + (((tickAnim - 0) / 20) * (73.75-(73.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3rightM, wing3rightM.rotateAngleX + (float) Math.toRadians(xx), wing3rightM.rotateAngleY + (float) Math.toRadians(yy), wing3rightM.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 5.05 + (((tickAnim - 0) / 10) * (5.05-(5.05)));
            zz = -0.25 + (((tickAnim - 0) / 10) * (1.15-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 5.05 + (((tickAnim - 10) / 10) * (5.05-(5.05)));
            zz = 1.15 + (((tickAnim - 10) / 10) * (-0.25-(1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wing3rightM.rotationPointX = this.wing3rightM.rotationPointX + (float)(xx);
        this.wing3rightM.rotationPointY = this.wing3rightM.rotationPointY - (float)(yy);
        this.wing3rightM.rotationPointZ = this.wing3rightM.rotationPointZ + (float)(zz);
        

    }


    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*-2.5));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1.25);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.75))*-2);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+30))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*-2.5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+150))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-21.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.75))*2.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(handR2, handR2.rotateAngleX + (float) Math.toRadians(60), handR2.rotateAngleY + (float) Math.toRadians(-10), handR2.rotateAngleZ + (float) Math.toRadians(75));
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(1.0531+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-5), upperlegRight.rotateAngleY + (float) Math.toRadians(5.6894+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-10), upperlegRight.rotateAngleZ + (float) Math.toRadians(-3.7685+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-10));
        this.upperlegRight.rotationPointX = this.upperlegRight.rotationPointX + (float)(0);
        this.upperlegRight.rotationPointY = this.upperlegRight.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-0.5);
        this.upperlegRight.rotationPointZ = this.upperlegRight.rotationPointZ + (float)(0);
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(3.6137+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), lowerlegRight.rotateAngleY + (float) Math.toRadians(-4.4055+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5), lowerlegRight.rotateAngleZ + (float) Math.toRadians(4.1741+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*5));
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(1.4217+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*20), wing1right.rotateAngleY + (float) Math.toRadians(5.0787+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*10), wing1right.rotateAngleZ + (float) Math.toRadians(5.1081+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-30));
        this.wing1right.rotationPointX = this.wing1right.rotationPointX + (float)(0);
        this.wing1right.rotationPointY = this.wing1right.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1);
        this.wing1right.rotationPointZ = this.wing1right.rotationPointZ + (float)(0);
        this.wing1right.setScale((float)1.2,(float)1,(float)1);
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(0.9253+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*2.5), wing2right.rotateAngleY + (float) Math.toRadians(-3.9729+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-10), wing2right.rotateAngleZ + (float) Math.toRadians(-374.4327+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-100))*-40));
        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(3.9801+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-2.5), wing3right.rotateAngleY + (float) Math.toRadians(1.1842+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-10), wing3right.rotateAngleZ + (float) Math.toRadians(-2.9605+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*-40));
        this.setRotateAngle(wing4right, wing4right.rotateAngleX + (float) Math.toRadians(-10.5106+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-2.5), wing4right.rotateAngleY + (float) Math.toRadians(2.2824+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*-20), wing4right.rotateAngleZ + (float) Math.toRadians(5.1147+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-80))*10));
        this.setRotateAngle(handR3, handR3.rotateAngleX + (float) Math.toRadians(60), handR3.rotateAngleY + (float) Math.toRadians(10), handR3.rotateAngleZ + (float) Math.toRadians(-75));
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(1.0531+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-5), upperlegLeft.rotateAngleY + (float) Math.toRadians(-5.6894+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-10), upperlegLeft.rotateAngleZ + (float) Math.toRadians(-3.7685+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*10));
        this.upperlegLeft.rotationPointX = this.upperlegLeft.rotationPointX + (float)(0);
        this.upperlegLeft.rotationPointY = this.upperlegLeft.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-0.5);
        this.upperlegLeft.rotationPointZ = this.upperlegLeft.rotationPointZ + (float)(0);
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(3.6137+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), lowerlegLeft.rotateAngleY + (float) Math.toRadians(-4.4055+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(4.1741+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*5));
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(1.3859+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*20), wing1left.rotateAngleY + (float) Math.toRadians(-5.1701+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*-10), wing1left.rotateAngleZ + (float) Math.toRadians(-4.8725+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*30));
        this.wing1left.rotationPointX = this.wing1left.rotationPointX + (float)(0);
        this.wing1left.rotationPointY = this.wing1left.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-1);
        this.wing1left.rotationPointZ = this.wing1left.rotationPointZ + (float)(0);
        this.wing1left.setScale((float)1.2,(float)1,(float)1);
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(0.9253+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*2.5), wing2left.rotateAngleY + (float) Math.toRadians(-3.9729+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*10), wing2left.rotateAngleZ + (float) Math.toRadians(374.4327+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-100))*40));
        this.setRotateAngle(wing3left, wing3left.rotateAngleX + (float) Math.toRadians(3.9801+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-2.5), wing3left.rotateAngleY + (float) Math.toRadians(1.1842+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*10), wing3left.rotateAngleZ + (float) Math.toRadians(2.9605+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-50))*40));
        this.setRotateAngle(wing4left, wing4left.rotateAngleX + (float) Math.toRadians(-10.5106+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-2.5), wing4left.rotateAngleY + (float) Math.toRadians(2.2824+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+120))*20), wing4left.rotateAngleZ + (float) Math.toRadians(5.1147+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-80))*10));


    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGermanodactylus entity = (EntityPrehistoricFloraGermanodactylus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 50) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5 + (((tickAnim - 60) / 10) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 20) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5 + (((tickAnim - 100) / 10) * (-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-1.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 110) / 50) * (-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(-6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
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
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 0) / 50) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 50) / 10) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 60) / 10) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 70) / 20) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 70) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 90) / 10) * (-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 100) / 10) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(-0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 110) / 50) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 110) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
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
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 50) / 10) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 90) / 10) * (0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-5)));
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
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 0) / 50) * (12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
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
            xx = 12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5 + (((tickAnim - 110) / 50) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5-(12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-5)));
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
            xx = 7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 0) / 50) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 50) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5 + (((tickAnim - 60) / 10) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 70) / 20) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 90) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5 + (((tickAnim - 100) / 10) * (9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+150))*-2.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5 + (((tickAnim - 110) / 50) * (7.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5-(9.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+150))*-5)));
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
            xx = -21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 0) / 50) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 50) / 10) * (-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5 + (((tickAnim - 60) / 10) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 70) / 20) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 90) / 10) * (-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5 + (((tickAnim - 100) / 10) * (-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-12+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 110) / 50) * (-21.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.475);



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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5 + (((tickAnim - 110) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*5)));
            yy = 0 + (((tickAnim - 110) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 0) / 50) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 50) / 10) * (-9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 60) / 10) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = 6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(-9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 70) / 20) * (-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 70) / 20) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 90) / 10) * (6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 90) / 10) * (-9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 100) / 10) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = 6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 100) / 10) * (-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(-9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = -3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30 + (((tickAnim - 110) / 50) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1left, wing1left.rotateAngleX + (float) Math.toRadians(xx), wing1left.rotateAngleY + (float) Math.toRadians(yy), wing1left.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.wing1left.rotationPointX = this.wing1left.rotationPointX + (float)(xx);
        this.wing1left.rotationPointY = this.wing1left.rotationPointY - (float)(yy);
        this.wing1left.rotationPointZ = this.wing1left.rotationPointZ + (float)(zz);


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
        this.wing1left.setScale((float)xx, (float)yy, (float)zz);




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
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 0) / 50) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = 10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 0) / 50) * (10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 0) / 50) * (11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 50) / 10) * (-16.5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = 10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 50) / 10) * (0-(10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 50) / 10) * (0-(11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -16.5 + (((tickAnim - 60) / 10) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-16.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 70) / 20) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = 10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 70) / 20) * (10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 70) / 20) * (11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 90) / 10) * (-16.5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = 10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 90) / 10) * (0-(10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 90) / 10) * (0-(11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -16.5 + (((tickAnim - 100) / 10) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-16.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 110) / 50) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = 10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 110) / 50) * (10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = 11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10 + (((tickAnim - 110) / 50) * (11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10-(11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegRight, upperlegRight.rotateAngleX + (float) Math.toRadians(xx), upperlegRight.rotateAngleY + (float) Math.toRadians(yy), upperlegRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
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
        this.upperlegRight.rotationPointX = this.upperlegRight.rotationPointX + (float)(xx);
        this.upperlegRight.rotationPointY = this.upperlegRight.rotationPointY - (float)(yy);
        this.upperlegRight.rotationPointZ = this.upperlegRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 0) / 50) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 0) / 50) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 0) / 50) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 50) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 50) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 50) / 10) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 60) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 60) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 60) / 10) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 70) / 20) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 70) / 20) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 70) / 20) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 90) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 90) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 90) / 10) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 100) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 100) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 100) / 10) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 110) / 50) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 110) / 50) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = 12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 110) / 50) * (12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegRight, lowerlegRight.rotateAngleX + (float) Math.toRadians(xx), lowerlegRight.rotateAngleY + (float) Math.toRadians(yy), lowerlegRight.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(0), footRight.rotateAngleY + (float) Math.toRadians(-18.5), footRight.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 0) / 50) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 0) / 50) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 50) / 10) * (0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 50) / 10) * (9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 60) / 10) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = -6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = 9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 70) / 20) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 70) / 20) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 90) / 10) * (0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 90) / 10) * (9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5 + (((tickAnim - 100) / 10) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(0.1245+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+90))*2.5)));
            yy = -6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 100) / 10) * (3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            zz = 9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 100) / 10) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(9.5167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20 + (((tickAnim - 110) / 50) * (-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20-(-2.7214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*20)));
            yy = 3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(3.8538+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
            zz = 0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30 + (((tickAnim - 110) / 50) * (0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30-(0.133+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing1right, wing1right.rotateAngleX + (float) Math.toRadians(xx), wing1right.rotateAngleY + (float) Math.toRadians(yy), wing1right.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.wing1right.rotationPointX = this.wing1right.rotationPointX + (float)(xx);
        this.wing1right.rotationPointY = this.wing1right.rotationPointY - (float)(yy);
        this.wing1right.rotationPointZ = this.wing1right.rotationPointZ + (float)(zz);


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
        this.wing1right.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 5.37952 + (((tickAnim - 0) / 50) * (5.37952-(5.37952)));
            yy = 7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 0) / 50) * (7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 0) / 50) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5.37952 + (((tickAnim - 50) / 10) * (-4.36915-(5.37952)));
            yy = 7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 50) / 10) * (-5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 50) / 10) * (19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.36915 + (((tickAnim - 60) / 10) * (5.37952-(-4.36915)));
            yy = -5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 60) / 10) * (7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 5.37952 + (((tickAnim - 70) / 20) * (5.37952-(5.37952)));
            yy = 7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 70) / 20) * (7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 70) / 20) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 5.37952 + (((tickAnim - 90) / 10) * (-4.36915-(5.37952)));
            yy = 7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 90) / 10) * (-5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 90) / 10) * (19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -4.36915 + (((tickAnim - 100) / 10) * (5.37952-(-4.36915)));
            yy = -5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 100) / 10) * (7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(-5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 100) / 10) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(19.3209+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 5.37952 + (((tickAnim - 110) / 50) * (5.37952-(5.37952)));
            yy = 7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10 + (((tickAnim - 110) / 50) * (7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10-(7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*-10)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20 + (((tickAnim - 110) / 50) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2right, wing2right.rotateAngleX + (float) Math.toRadians(xx), wing2right.rotateAngleY + (float) Math.toRadians(yy), wing2right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 0) / 50) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = 7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 0) / 50) * (7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 0) / 50) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 50) / 10) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = 7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 50) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 50) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 60) / 10) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 70) / 20) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = 7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 70) / 20) * (7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 70) / 20) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 90) / 10) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = 7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 90) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 90) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 100) / 10) * (7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5 + (((tickAnim - 100) / 10) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-2.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 110) / 50) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = 7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 110) / 50) * (7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 110) / 50) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3right, wing3right.rotateAngleX + (float) Math.toRadians(xx), wing3right.rotateAngleY + (float) Math.toRadians(yy), wing3right.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 0) / 50) * (6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30 + (((tickAnim - 0) / 50) * (17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30-(17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30)));
            zz = -4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 0) / 50) * (-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 50) / 10) * (4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30 + (((tickAnim - 50) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25-(17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30)));
            zz = -4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 50) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25-(-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25 + (((tickAnim - 60) / 10) * (17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25 + (((tickAnim - 60) / 10) * (-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25)));
        }






        if (tickAnim >= 100 && tickAnim < 110) {
            xx = 4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25 + (((tickAnim - 100) / 10) * (17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*1.25)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25 + (((tickAnim - 100) / 10) * (-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*1.25)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5 + (((tickAnim - 110) / 50) * (6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5-(6.6266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*2.5)));
            yy = 17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30 + (((tickAnim - 110) / 50) * (17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30-(17.1555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*30)));
            zz = -4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10 + (((tickAnim - 110) / 50) * (-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10-(-4.1103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4right, wing4right.rotateAngleX + (float) Math.toRadians(xx), wing4right.rotateAngleY + (float) Math.toRadians(yy), wing4right.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 0) / 50) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = -10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 0) / 50) * (-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 0) / 50) * (-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 50) / 10) * (-16.5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = -10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 50) / 10) * (0-(-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 50) / 10) * (0-(-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -16.5 + (((tickAnim - 60) / 10) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-16.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 70) / 20) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = -10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 70) / 20) * (-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 70) / 20) * (-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 90) / 10) * (-16.5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = -10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 90) / 10) * (0-(-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 90) / 10) * (0-(-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -16.5 + (((tickAnim - 100) / 10) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-16.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = -12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5 + (((tickAnim - 110) / 50) * (-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5-(-12.6793+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-5)));
            yy = -10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10 + (((tickAnim - 110) / 50) * (-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10-(-10.2386+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-10)));
            zz = -11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10 + (((tickAnim - 110) / 50) * (-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10-(-11.323+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegLeft, upperlegLeft.rotateAngleX + (float) Math.toRadians(xx), upperlegLeft.rotateAngleY + (float) Math.toRadians(yy), upperlegLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 0) / 50) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 70) / 20) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 70) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 70) / 20) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 90) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5 + (((tickAnim - 100) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-0.5)));
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
        this.upperlegLeft.rotationPointX = this.upperlegLeft.rotationPointX + (float)(xx);
        this.upperlegLeft.rotationPointY = this.upperlegLeft.rotationPointY - (float)(yy);
        this.upperlegLeft.rotationPointZ = this.upperlegLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 0) / 50) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 0) / 50) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 0) / 50) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 50) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 50) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 50) / 10) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 60) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 60) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 60) / 10) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 70) / 20) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 70) / 20) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 70) / 20) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 90) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 90) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 90) / 10) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 100) / 10) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5 + (((tickAnim - 100) / 10) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*-5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 100) / 10) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5 + (((tickAnim - 110) / 50) * (29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5-(29.7303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*5)));
            yy = -14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5 + (((tickAnim - 110) / 50) * (-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5-(-14.3776+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-180))*5)));
            zz = -12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 110) / 50) * (-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-12.8388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegLeft, lowerlegLeft.rotateAngleX + (float) Math.toRadians(xx), lowerlegLeft.rotateAngleY + (float) Math.toRadians(yy), lowerlegLeft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(0), footLeft.rotateAngleY + (float) Math.toRadians(18.5), footLeft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 5.37952 + (((tickAnim - 0) / 50) * (5.37952-(5.37952)));
            yy = -7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 0) / 50) * (-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = -4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 0) / 50) * (-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5.37952 + (((tickAnim - 50) / 10) * (-4.36915-(5.37952)));
            yy = -7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 50) / 10) * (5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = -4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 50) / 10) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.36915 + (((tickAnim - 60) / 10) * (5.37952-(-4.36915)));
            yy = 5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 60) / 10) * (-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 60) / 10) * (-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 5.37952 + (((tickAnim - 70) / 20) * (5.37952-(5.37952)));
            yy = -7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 70) / 20) * (-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = -4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 70) / 20) * (-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 5.37952 + (((tickAnim - 90) / 10) * (-4.36915-(5.37952)));
            yy = -7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 90) / 10) * (5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5-(-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = -4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 90) / 10) * (4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -4.36915 + (((tickAnim - 100) / 10) * (5.37952-(-4.36915)));
            yy = 5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5 + (((tickAnim - 100) / 10) * (-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(5.506+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*2.5)));
            zz = 4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 100) / 10) * (-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 5.37952 + (((tickAnim - 110) / 50) * (5.37952-(5.37952)));
            yy = -7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10 + (((tickAnim - 110) / 50) * (-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10-(-7.6492+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+120))*10)));
            zz = -4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20 + (((tickAnim - 110) / 50) * (-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20-(-4.2756+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing2left, wing2left.rotateAngleX + (float) Math.toRadians(xx), wing2left.rotateAngleY + (float) Math.toRadians(yy), wing2left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 0) / 50) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = -7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 0) / 50) * (-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = -9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 0) / 50) * (-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 50) / 10) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = -7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 50) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = -9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 50) / 10) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 60) / 10) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 60) / 10) * (-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 70) / 20) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = -7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 70) / 20) * (-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = -9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 70) / 20) * (-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 90) / 10) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = -7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 90) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = -9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 90) / 10) * (9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5 + (((tickAnim - 100) / 10) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 100) / 10) * (-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
            zz = 9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 100) / 10) * (-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5 + (((tickAnim - 110) / 50) * (7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5-(7.1803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*2.5)));
            yy = -7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10 + (((tickAnim - 110) / 50) * (-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10-(-7.708+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*10)));
            zz = -9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 110) / 50) * (-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(-9.1011+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing3left, wing3left.rotateAngleX + (float) Math.toRadians(xx), wing3left.rotateAngleY + (float) Math.toRadians(yy), wing3left.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 0) / 50) * (0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 0) / 50) * (-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 0) / 50) * (-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 50) / 10) * (3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 50) / 10) * (-30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 50) / 10) * (-5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 60) / 10) * (0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 60) / 10) * (-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 60) / 10) * (-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 90) {
            xx = 0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 70) / 20) * (0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 70) / 20) * (-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 70) / 20) * (-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 90) / 10) * (3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 90) / 10) * (-30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 90) / 10) * (-5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 100) / 10) * (0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(3.1206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 100) / 10) * (-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-30.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 100) / 10) * (-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-5.4801+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else if (tickAnim >= 110 && tickAnim < 160) {
            xx = 0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5 + (((tickAnim - 110) / 50) * (0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5-(0.4425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-2.5)));
            yy = -7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30 + (((tickAnim - 110) / 50) * (-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30-(-7.0251+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-30)));
            zz = -1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10 + (((tickAnim - 110) / 50) * (-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10-(-1.0381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wing4left, wing4left.rotateAngleX + (float) Math.toRadians(xx), wing4left.rotateAngleY + (float) Math.toRadians(yy), wing4left.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0f)-(0.0f)), ((0.873f)-(0.873f)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((0.2269F)-(0.2269F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r11, ((0.0791F)-(0.0791F)), ((0.0368F)-(0.0368F)),((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r12, ((0.0791F)-(0.0791F)), ((0.0368F)-(0.0368F)),((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r13, ((0.0852F)-(0.0852F)), ((0.0189F)-(0.0189F)),((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r14, ((0.0791F)-(0.0791F)), ((-0.0368F)-(-0.0368F)),((0.4349F)-(0.4349F)));

        animator.rotate(cube_r15, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.0852F)-(0.0852F)), ((-0.0189F)-(-0.0189F)),((0.2174F)-(0.2174F)));
        animator.rotate(cube_r17, ((-0.3056F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.rotate(cube_r2, ((-0.0F)-(-0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((-0.0F)-(-0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.0F)-(-0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r5, ((0.2182F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r6, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0791F)-(0.0791F)), ((-0.0368F)-(-0.0368F)),((0.4349F)-(0.4349F)));
        animator.rotate(cube_r8, ((0.0791F)-(0.0791F)), ((-0.0368F)-(-0.0368F)),((0.4349F)-(0.4349F)));
        animator.rotate(cube_r9, ((0.0791F)-(0.0791F)), ((0.0368F)-(0.0368F)),((-0.4349F)-(-0.4349F)));
        animator.rotate(footLeft, ((0.7886F)-(-0.3023F)), ((-0.2248F)-(-0.2248F)),((-0.0157F)-(-0.0157F)));
        animator.rotate(footRight, ((0.7973F)-(-0.3023F)), ((0.2248F)-(0.2248F)),((0.0157F)-(0.0157F)));
        animator.rotate(handR2, ((-1.6937F)-(-1.6937F)), ((0.111F)-(0.111F)),((-1.5109F)-(-1.5109F)));
        animator.rotate(handR3, ((-1.6937F)-(-1.6937F)), ((-0.111F)-(-0.111F)),((1.5109F)-(1.5109F)));
        animator.rotate(head, ((0.7854F)-(0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.rotate(legwing2, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing4, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lowerlegLeft, ((0.3979F)-(0.581F)), ((0.2002F)-(0.0573F)),((0.2181F)-(1.4953F)));
        animator.rotate(lowerlegRight, ((0.3979F)-(0.581F)), ((0.2002F)-(-0.0573F)),((-0.2181F)-(-1.4953F)));

        animator.rotate(neck, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.3927F)-(-0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail1, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.rotate(upperlegLeft, ((0.2964F)-(0.3032F)), ((-0.0226F)-(-0.2463F)),((-1.5101F)-(-1.447F)));
        animator.rotate(upperlegRight, ((0.2964F)-(0.3068F)), ((-0.0226F)-(0.2463F)),((1.5101F)-(1.512F)));
        animator.rotate(wing1left, ((0.0F)-(0.0F)), ((0.0873F)-(0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(wing1leftM2, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wing1right, ((0.0F)-(0.0F)), ((-0.0873F)-(-0.0873F)),((0.0F)-(0.0F)));
        animator.rotate(wing1rightM2, ((-0.48F)-(-0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));

        animator.rotate(wing2left, ((0.0633F)-(0.0633F)), ((0.0316F)-(0.0747F)),((-1.5236F)-(-0.1253F)));
        animator.rotate(wing2right, ((-0.0627F)-(0.0633F)), ((-0.0316F)-(-0.0747F)),((1.5236F)-(0.1253F)));
        animator.rotate(wing3left, ((-1.5577F)-(-0.0305F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wing3right, ((-1.5446F)-(-0.0305F)), ((0.0218F)-(0.0F)),((0.0006F)-(0.0F)));
        animator.rotate(wing4left, ((0.0721F)-(1.1193F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wing4right, ((0.1593F)-(1.1193F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((-0.0F)-(-0.0F)), -((0.873f)-(0.873f)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((0.2269F)-(0.2269F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r11, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r12, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));
        animator.rotate(cube_r13, -((0.0852F)-(0.0852F)), -((0.0189F)-(0.0189F)),-((-0.2174F)-(-0.2174F)));
        animator.rotate(cube_r14, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));

        animator.rotate(cube_r15, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.0852F)-(0.0852F)), -((-0.0189F)-(-0.0189F)),-((0.2174F)-(0.2174F)));
        animator.rotate(cube_r17, -((-0.3056F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.rotate(cube_r2, -((-0.0F)-(-0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((-0.0F)-(-0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.0F)-(-0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r5, -((0.2182F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r6, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0791F)-(0.0791F)), -((-0.0368F)-(-0.0368F)),-((0.4349F)-(0.4349F)));
        animator.rotate(cube_r8, -((0.0791F)-(0.0791F)), -((-0.0368F)-(-0.0368F)),-((0.4349F)-(0.4349F)));
        animator.rotate(cube_r9, -((0.0791F)-(0.0791F)), -((0.0368F)-(0.0368F)),-((-0.4349F)-(-0.4349F)));
        animator.rotate(footLeft, -((0.7886F)-(-0.3023F)), -((-0.2248F)-(-0.2248F)),-((-0.0157F)-(-0.0157F)));
        animator.rotate(footRight, -((0.7973F)-(-0.3023F)), -((0.2248F)-(0.2248F)),-((0.0157F)-(0.0157F)));
        animator.rotate(handR2, -((-1.6937F)-(-1.6937F)), -((0.111F)-(0.111F)),-((-1.5109F)-(-1.5109F)));
        animator.rotate(handR3, -((-1.6937F)-(-1.6937F)), -((-0.111F)-(-0.111F)),-((1.5109F)-(1.5109F)));
        animator.rotate(head, -((0.7854F)-(0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.rotate(legwing2, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing4, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lowerlegLeft, -((0.3979F)-(0.581F)), -((0.2002F)-(0.0573F)),-((0.2181F)-(1.4953F)));
        animator.rotate(lowerlegRight, -((0.3979F)-(0.581F)), -((0.2002F)-(-0.0573F)),-((-0.2181F)-(-1.4953F)));

        animator.rotate(neck, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.3927F)-(-0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail1, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.rotate(upperlegLeft, -((0.2964F)-(0.3032F)), -((-0.0226F)-(-0.2463F)),-((-1.5101F)-(-1.447F)));
        animator.rotate(upperlegRight, -((0.2964F)-(0.3068F)), -((-0.0226F)-(0.2463F)),-((1.5101F)-(1.512F)));
        animator.rotate(wing1left, -((0.0F)-(0.0F)), -((0.0873F)-(0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(wing1leftM2, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wing1right, -((0.0F)-(0.0F)), -((-0.0873F)-(-0.0873F)),-((0.0F)-(0.0F)));
        animator.rotate(wing1rightM2, -((-0.48F)-(-0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));

        animator.rotate(wing2left, -((0.0633F)-(0.0633F)), -((0.0316F)-(0.0747F)),-((-1.5236F)-(-0.1253F)));
        animator.rotate(wing2right, -((-0.0627F)-(0.0633F)), -((-0.0316F)-(-0.0747F)),-((1.5236F)-(0.1253F)));
        animator.rotate(wing3left, -((-1.5577F)-(-0.0305F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wing3right, -((-1.5446F)-(-0.0305F)), -((0.0218F)-(0.0F)),-((0.0006F)-(0.0F)));
        animator.rotate(wing4left, -((0.0721F)-(1.1193F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wing4right, -((0.1593F)-(1.1193F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
