package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDorygnathus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelDorygnathus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended upperlegright;
    private final AdvancedModelRendererExtended lowerlegright;
    private final AdvancedModelRendererExtended footright;
    private final AdvancedModelRendererExtended legwing4;
    private final AdvancedModelRendererExtended legwing5;
    private final AdvancedModelRendererExtended upperlegleft;
    private final AdvancedModelRendererExtended lowerlegleft;
    private final AdvancedModelRendererExtended footleft;
    private final AdvancedModelRendererExtended legwing2;
    private final AdvancedModelRendererExtended legwing3;
    private final AdvancedModelRendererExtended wingright1;
    private final AdvancedModelRendererExtended wingright2;
    private final AdvancedModelRendererExtended wingright3;
    private final AdvancedModelRendererExtended wingright3Membrane;
    private final AdvancedModelRendererExtended wingright4;
    private final AdvancedModelRendererExtended wingright4Membrane;
    private final AdvancedModelRendererExtended handright;
    private final AdvancedModelRendererExtended wingleft1;
    private final AdvancedModelRendererExtended wingleft2;
    private final AdvancedModelRendererExtended wingleft3;
    private final AdvancedModelRendererExtended wingleft3Membrane;
    private final AdvancedModelRendererExtended wingleft4;
    private final AdvancedModelRendererExtended wingleft4Membrane;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended handleft;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;

    private ModelAnimator animator;

    public ModelDorygnathus() {

        this.textureWidth = 96;
        this.textureHeight = 64;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -11.5F, -4.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 34, 31, -3.0F, -2.0F, -1.5F, 6, 6, 7, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 27, 0, -2.5F, -2.0F, 1.0F, 5, 5, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 6.1F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, 0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 24, 31, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 3.6F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 42, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 44, -0.5F, -0.5F, -1.0F, 1, 1, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 15, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 40, 19, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 27, 7, 0.0F, -1.5F, 2.25F, 0, 3, 4, 0.0F, false));

        this.upperlegright = new AdvancedModelRendererExtended(this);
        this.upperlegright.setRotationPoint(-2.0F, 0.55F, 4.9F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.3054F, 0.0F, 0.48F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 42, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.lowerlegright = new AdvancedModelRendererExtended(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 0.7854F, 0.0F, -0.5236F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 28, 42, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footright = new AdvancedModelRendererExtended(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.3927F, 0.5672F, -0.2182F);
        this.footright.cubeList.add(new ModelBox(footright, 43, 0, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing4 = new AdvancedModelRendererExtended(this);
        this.legwing4.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegright.addChild(legwing4);
        this.setRotateAngle(legwing4, -0.0873F, 0.0F, 0.0F);
        this.legwing4.cubeList.add(new ModelBox(legwing4, 18, 4, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, false));

        this.legwing5 = new AdvancedModelRendererExtended(this);
        this.legwing5.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegright.addChild(legwing5);
        this.legwing5.cubeList.add(new ModelBox(legwing5, 0, 0, -0.5F, 0.0F, -0.25F, 1, 4, 3, -0.01F, false));

        this.upperlegleft = new AdvancedModelRendererExtended(this);
        this.upperlegleft.setRotationPoint(2.0F, 0.55F, 4.9F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.3054F, 0.0F, -0.48F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 42, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.lowerlegleft = new AdvancedModelRendererExtended(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 0.7854F, 0.0F, 0.5236F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 28, 42, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.footleft = new AdvancedModelRendererExtended(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.3927F, -0.5672F, 0.2182F);
        this.footleft.cubeList.add(new ModelBox(footleft, 43, 0, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing2 = new AdvancedModelRendererExtended(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegleft.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0873F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 18, 4, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, true));

        this.legwing3 = new AdvancedModelRendererExtended(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegleft.addChild(legwing3);
        this.legwing3.cubeList.add(new ModelBox(legwing3, 0, 0, -0.5F, 0.0F, -0.25F, 1, 4, 3, -0.01F, true));

        this.wingright1 = new AdvancedModelRendererExtended(this);
        this.wingright1.setRotationPoint(-2.85F, 0.8F, -0.1F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, 0.0F, -0.1309F, 0.0436F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 30, -5.5F, -1.0F, -1.0F, 7, 2, 10, 0.0F, false));

        this.wingright2 = new AdvancedModelRendererExtended(this);
        this.wingright2.setRotationPoint(-4.7F, 0.1F, -0.7F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, 0.0873F, 0.0F, 0.0436F);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 11, 8, 0.0F, false));

        this.wingright3 = new AdvancedModelRendererExtended(this);
        this.wingright3.setRotationPoint(-0.1F, 11.0F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 0.0F, 0.0F, -0.0873F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 0, 42, -0.5F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.wingright3Membrane = new AdvancedModelRendererExtended(this);
        this.wingright3Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingright3.addChild(wingright3Membrane);
        this.wingright3Membrane.cubeList.add(new ModelBox(wingright3Membrane, 27, 11, -0.5F, -7.0F, 0.0F, 1, 5, 8, 0.0F, false));

        this.wingright4 = new AdvancedModelRendererExtended(this);
        this.wingright4.setRotationPoint(0.1F, 0.0F, 7.95F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 1.0472F, 0.0F, 0.0F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 27, 5, -0.5F, -1.0F, 0.0F, 1, 1, 25, 0.0F, false));

        this.wingright4Membrane = new AdvancedModelRendererExtended(this);
        this.wingright4Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingright4.addChild(wingright4Membrane);
        this.wingright4Membrane.cubeList.add(new ModelBox(wingright4Membrane, 0, 0, -0.5F, -6.0F, 0.0F, 1, 5, 25, 0.0F, false));

        this.handright = new AdvancedModelRendererExtended(this);
        this.handright.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, 0.0F, -0.6109F, -0.0436F);
        this.handright.cubeList.add(new ModelBox(handright, 12, 21, -1.5F, -0.5F, 0.2F, 3, 1, 3, -0.01F, false));

        this.wingleft1 = new AdvancedModelRendererExtended(this);
        this.wingleft1.setRotationPoint(2.85F, 0.8F, -0.1F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, 0.0F, 0.1309F, -0.0436F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 0, 30, -1.5F, -1.0F, -1.0F, 7, 2, 10, 0.0F, true));

        this.wingleft2 = new AdvancedModelRendererExtended(this);
        this.wingleft2.setRotationPoint(4.7F, 0.1F, -0.7F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, 0.0873F, 0.0F, -0.0436F);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 0, 0, -0.5F, 0.0F, 0.0F, 1, 11, 8, 0.0F, true));

        this.wingleft3 = new AdvancedModelRendererExtended(this);
        this.wingleft3.setRotationPoint(0.1F, 11.0F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 0.0F, 0.0F, 0.0873F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 0, 42, -0.5F, -2.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.wingleft3Membrane = new AdvancedModelRendererExtended(this);
        this.wingleft3Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingleft3.addChild(wingleft3Membrane);
        this.wingleft3Membrane.cubeList.add(new ModelBox(wingleft3Membrane, 27, 11, -0.5F, -7.0F, 0.0F, 1, 5, 8, 0.0F, true));

        this.wingleft4 = new AdvancedModelRendererExtended(this);
        this.wingleft4.setRotationPoint(-0.1F, 0.0F, 7.95F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 1.0472F, 0.0F, 0.0F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 27, 5, -0.5F, -1.0F, 0.0F, 1, 1, 25, 0.0F, true));

        this.wingleft4Membrane = new AdvancedModelRendererExtended(this);
        this.wingleft4Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingleft4.addChild(wingleft4Membrane);
        this.wingleft4Membrane.cubeList.add(new ModelBox(wingleft4Membrane, 0, 0, -0.5F, -6.0F, 0.0F, 1, 5, 25, 0.0F, true));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 25.0F);
        this.wingleft4.addChild(bone);


        this.handleft = new AdvancedModelRendererExtended(this);
        this.handleft.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, 0.0F, 0.6109F, 0.0436F);
        this.handleft.cubeList.add(new ModelBox(handleft, 12, 21, -1.5F, -0.5F, 0.2F, 3, 1, 3, -0.01F, true));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 10, 0, -2.0F, -2.0F, -2.25F, 4, 4, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 27, 53, -1.5F, -1.0F, -2.5F, 3, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 15.0F, 12.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 52, -2.0F, -17.25F, -13.55F, 4, 3, 3, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -4.75F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.head2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2705F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -1.0F, 1.85F, 5.3F, 2, 1, 4, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -0.5F, 1.85F, 1.45F, 1, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6196F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, 2.95F, -0.4F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0254F, 0.1659F, -0.6151F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 6, 0.25F, 1.85F, -9.0F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0326F, 0.1647F, -0.6594F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.1F, 1.6F, -6.9F, 0, 2, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0262F, 0.1658F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, 1.5F, 1.35F, -5.0F, 0, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0262F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 44, 0.55F, 1.1F, -8.75F, 1, 1, 8, 0.002F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1571F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 42, 0.55F, -0.1F, -8.75F, 1, 1, 8, -0.01F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1571F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 42, -1.55F, -0.1F, -8.75F, 1, 1, 8, -0.01F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0254F, -0.1659F, 0.6151F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 6, -0.25F, 1.85F, -9.0F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0326F, -0.1647F, 0.6594F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.1F, 1.6F, -6.9F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0262F, -0.1658F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 4, -1.5F, 1.35F, -5.0F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0262F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 44, -1.55F, 1.1F, -8.75F, 1, 1, 8, 0.002F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0262F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 7, -0.5F, 1.1F, -3.7F, 2, 1, 2, 0.002F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 13, 53, 0.0F, 1.1F, -8.7F, 1, 1, 5, 0.002F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.8F, -0.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 0, -2.0F, 0.0F, -2.5F, 4, 1, 3, 0.01F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1963F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 31, -1.5F, -2.0F, 1.5F, 3, 2, 3, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 38, 12, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 54, 4, -1.0F, 0.0F, -0.5F, 2, 1, 2, 0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4363F, 0.1396F, 0.6894F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 5, 0, 0.0F, -0.5F, 2.45F, 0, 2, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.8727F, 0.1396F, 0.9163F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 0, 0.0F, -0.5F, 0.35F, 0, 2, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1396F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 4, -0.05F, -0.25F, 3.5F, 0, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4363F, -0.1396F, -0.6894F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 0, 0.0F, -0.5F, 2.45F, 0, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.8727F, -0.1396F, -0.9163F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 0, 0.0F, -0.5F, 0.35F, 0, 2, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1396F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 4, 0.05F, -0.25F, 3.5F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.2094F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 47, 45, -1.0F, 0.0F, 0.0F, 1, 1, 7, -0.01F, true));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.jaw2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2094F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 47, 45, 0.0F, 0.0F, 0.0F, 1, 1, 7, -0.01F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4363F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 4, 0, -0.5F, 2.4F, -5.25F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.2F;
        this.root.offsetX = 0.2F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;
        if (flier.getAttachmentPos() == null) {
            //flight pose
        } else if (flier.getAttachmentPos() != null) {
            if (flier.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The model is already reset to default each cycle so no need to do more here
            }
            else {
                //Climb pose

            }
        }

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.48F;

        //Animations:

        if (flier.getAttachmentPos() == null) { //flying
            this.faceTarget(f3, f4, 8, neck1);
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
            this.faceTarget(f3, f4, 12, neck1);
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
        EntityPrehistoricFloraDorygnathus ee = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        if (ee.getAttachmentPos() == null && ee.getAnimation() != ee.FLY_ANIMATION) {
            //flight pose
            this.setRotateAngle(chest, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(body1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, 0.0044F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegright, 0.2509F, 0.0332F, 1.4914F);
            this.setRotateAngle(lowerlegright, 0.5767F, -0.1147F, -0.2812F);
            this.setRotateAngle(footright, 1.0606F, 0.5918F, -0.2276F);
            this.setRotateAngle(legwing4, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegleft, 0.2509F, -0.0332F, -1.4914F);
            this.setRotateAngle(lowerlegleft, 0.5767F, 0.1147F, 0.2812F);
            this.setRotateAngle(footleft, 1.0606F, -0.5918F, 0.2276F);
            this.setRotateAngle(legwing2, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(wingleft1, 0.0F, 0.0206F, -0.0911F);
            this.setRotateAngle(wingleft2, 0.0873F, 0.0F, -1.5509F);
            this.setRotateAngle(wingleft3, -1.4748F, 0.0F, 0.0911F);
            this.setRotateAngle(wingleft4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handleft, 0.0524F, -0.0422F, 1.6458F);
            this.setRotateAngle(wingright1, 0.0F, -0.0206F, 0.0911F);
            this.setRotateAngle(wingright2, 0.0873F, 0.0F, 1.5509F);
            this.setRotateAngle(wingright3, -1.4748F, 0.0F, -0.0911F);
            this.setRotateAngle(wingright4, 0.1375F, 0.0F, 0.0F);
            this.setRotateAngle(handright, 0.0173F, 0.1884F, -1.564F);
            this.setRotateAngle(neck1, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.4276F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r2, 0.2705F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.6196F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.0254F, 0.1659F, -0.6151F);
            this.setRotateAngle(cube_r5, -0.0326F, 0.1647F, -0.6594F);
            this.setRotateAngle(cube_r6, 0.0262F, 0.1658F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0262F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r8, 0.1571F, 0.1745F, 0.0F);
            this.setRotateAngle(cube_r9, 0.1571F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r10, -0.0254F, -0.1659F, 0.6151F);
            this.setRotateAngle(cube_r11, -0.0326F, -0.1647F, 0.6594F);
            this.setRotateAngle(cube_r12, 0.0262F, -0.1658F, 0.0F);
            this.setRotateAngle(cube_r13, 0.0262F, -0.1745F, 0.0F);
            this.setRotateAngle(cube_r14, 0.0262F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r15, -0.1963F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r16, 0.4363F, 0.1396F, 0.6894F);
            this.setRotateAngle(cube_r17, 0.8727F, 0.1396F, 0.9163F);
            this.setRotateAngle(cube_r18, 0.0F, 0.1396F, 0.0F);
            this.setRotateAngle(cube_r19, 0.4363F, -0.1396F, -0.6894F);
            this.setRotateAngle(cube_r20, 0.8727F, -0.1396F, -0.9163F);
            this.setRotateAngle(cube_r21, 0.0F, -0.1396F, 0.0F);
            this.setRotateAngle(cube_r22, 0.0F, 0.2094F, 0.0F);
            this.setRotateAngle(cube_r23, 0.0F, -0.2094F, 0.0F);
            this.setRotateAngle(cube_r24, -0.4363F, 0.0F, 0.0F);
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
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else { //Walking regular
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }

            }
            else if (!ee.getHeadCollided()){
                //Climbing
                //animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                //Does not climb
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.PREEN_ANIMATION) { //The noise anim
            animPreen(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 4) / 6) * (0-(-15)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -30 + (((tickAnim - 3) / 4) * (0-(-30)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 3) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
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
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 7) / 13) * (0-(20)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 5) / 5) * (10-(20)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 6) / 10) * (-20-(20)));
            yy = 0 + (((tickAnim - 6) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 10) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 16) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 4) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -23.75 + (((tickAnim - 4) / 3) * (-10-(-23.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 7) / 8) * (0-(-10)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.67-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 6.67 + (((tickAnim - 4) / 6) * (10-(6.67)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 10) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 6) / 5) * (-10-(20)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 11) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 25 + (((tickAnim - 4) / 3) * (25-(25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 25 + (((tickAnim - 7) / 2) * (0-(25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animFlyFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+30))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-120))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 0) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 30) / 30) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5 + (((tickAnim - 60) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-2.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 70) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 0) / 30) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5 + (((tickAnim - 70) / 10) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 30) / 30) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 0) / 30) * (-16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 30) / 30) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5-(-16.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5 + (((tickAnim - 60) / 10) * (-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-30))*5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5 + (((tickAnim - 70) / 10) * (-17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5-(-12.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 30) / 30) * (-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 30) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(-11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 0) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 30) / 30) * (-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            zz = -15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5 + (((tickAnim - 60) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5 + (((tickAnim - 70) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*-5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20 + (((tickAnim - 70) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*-5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.4984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.9968+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-0.0007)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-13-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 0) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 0) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 30) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 30) / 30) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-1.25)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2.5)));
            zz = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5 + (((tickAnim - 60) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+30))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*-5)));
            yy = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+90))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20 + (((tickAnim - 70) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*-0.25)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*0.5)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 0) / 30) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 30) / 30) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5 + (((tickAnim - 60) / 10) * (0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25 + (((tickAnim - 60) / 10) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*1.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 70) / 10) * (-0.2356+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(0.4986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
            yy = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5 + (((tickAnim - 70) / 10) * (-4.234+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 0) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 30) / 30) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25 + (((tickAnim - 60) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-1.25)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5 + (((tickAnim - 60) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*2.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25 + (((tickAnim - 70) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 30) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 0) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 30) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10 + (((tickAnim - 60) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-60))*-10)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-90))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10 + (((tickAnim - 70) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-60))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*10), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*2.5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-10), body1.rotateAngleY + (float) Math.toRadians(0), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-0.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-240))*5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-210))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));















        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25 + (((tickAnim - 0) / 2) * (10-(25)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-15-(10)));
            yy = -2.5 + (((tickAnim - 2) / 1) * (5-(-2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (-7.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-30-(-15)));
            yy = 5 + (((tickAnim - 3) / 2) * (5-(5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -30 + (((tickAnim - 5) / 1) * (0-(-30)));
            yy = 5 + (((tickAnim - 5) / 1) * (5-(5)));
            zz = -5 + (((tickAnim - 5) / 1) * (-7.5-(-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (15-(0)));
            yy = 5 + (((tickAnim - 6) / 1) * (0-(5)));
            zz = -7.5 + (((tickAnim - 6) / 1) * (-2.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 7) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 7) / 1) * (-1.25-(0)));
            zz = -2.5 + (((tickAnim - 7) / 1) * (-1.25-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 8) / 0) * (40-(27.5)));
            yy = -1.25 + (((tickAnim - 8) / 0) * (-2.5-(-1.25)));
            zz = -1.25 + (((tickAnim - 8) / 0) * (0-(-1.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (25-(40)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 2) * (1-(0.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 2) / 1) * (1-(1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 6) / 1) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (20-(7.5)));
            yy = -5 + (((tickAnim - 0) / 2) * (2.5-(-5)));
            zz = 12.5 + (((tickAnim - 0) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 2) / 1) * (27.5-(20)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 12.5 + (((tickAnim - 2) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (25-(27.5)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (5-(2.5)));
            zz = 12.5 + (((tickAnim - 3) / 2) * (12.5-(12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 25 + (((tickAnim - 5) / 1) * (-25-(25)));
            yy = 5 + (((tickAnim - 5) / 1) * (2.5-(5)));
            zz = 12.5 + (((tickAnim - 5) / 1) * (17.5-(12.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -25 + (((tickAnim - 6) / 1) * (-20-(-25)));
            yy = 2.5 + (((tickAnim - 6) / 1) * (0-(2.5)));
            zz = 17.5 + (((tickAnim - 6) / 1) * (12.5-(17.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 7) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 7) / 1) * (-2.5-(0)));
            zz = 12.5 + (((tickAnim - 7) / 1) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 8) / 0) * (-25-(-20)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (-5-(-2.5)));
            zz = 12.5 + (((tickAnim - 8) / 0) * (12.5-(12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (7.5-(-25)));
            yy = -5 + (((tickAnim - 8) / 2) * (-5-(-5)));
            zz = 12.5 + (((tickAnim - 8) / 2) * (12.5-(12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 47.5 + (((tickAnim - 0) / 2) * (10-(47.5)));
            yy = -42.5 + (((tickAnim - 0) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 0) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-2.5-(10)));
            yy = -42.5 + (((tickAnim - 2) / 1) * (-32.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 2) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (30-(-2.5)));
            yy = -32.5 + (((tickAnim - 3) / 2) * (-32.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 30 + (((tickAnim - 5) / 1) * (32.5-(30)));
            yy = -32.5 + (((tickAnim - 5) / 1) * (-37.5-(-32.5)));
            zz = 7.5 + (((tickAnim - 5) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 32.5 + (((tickAnim - 6) / 1) * (10-(32.5)));
            yy = -37.5 + (((tickAnim - 6) / 1) * (-40-(-37.5)));
            zz = 7.5 + (((tickAnim - 6) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 7) / 1) * (-2.5-(10)));
            yy = -40 + (((tickAnim - 7) / 1) * (-41.25-(-40)));
            zz = 7.5 + (((tickAnim - 7) / 1) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 8) / 0) * (10-(-2.5)));
            yy = -41.25 + (((tickAnim - 8) / 0) * (-42.5-(-41.25)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (7.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (47.5-(10)));
            yy = -42.5 + (((tickAnim - 8) / 2) * (-42.5-(-42.5)));
            zz = 7.5 + (((tickAnim - 8) / 2) * (7.5-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 40 + (((tickAnim - 0) / 2) * (25-(40)));
            yy = 2.5 + (((tickAnim - 0) / 2) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 2) / 1) * (10-(25)));
            yy = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-15-(10)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (-5-(2.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (7.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-30-(-15)));
            yy = -5 + (((tickAnim - 5) / 2) * (-5-(-5)));
            zz = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 7) / 1) * (0-(-30)));
            yy = -5 + (((tickAnim - 7) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 7) / 1) * (7.5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (15-(0)));
            yy = -5 + (((tickAnim - 8) / 0) * (0-(-5)));
            zz = 7.5 + (((tickAnim - 8) / 0) * (2.5-(7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 15 + (((tickAnim - 8) / 1) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 1) * (1.25-(0)));
            zz = 2.5 + (((tickAnim - 8) / 1) * (1.25-(2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (40-(27.5)));
            yy = 1.25 + (((tickAnim - 9) / 1) * (2.5-(1.25)));
            zz = 1.25 + (((tickAnim - 9) / 1) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 2) / 1) * (1-(0.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 2) * (1-(1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.25-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 0) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 1) * (0-(0.25)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -25 + (((tickAnim - 0) / 2) * (7.5-(-25)));
            yy = 5 + (((tickAnim - 0) / 2) * (5-(5)));
            zz = -12.5 + (((tickAnim - 0) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 7.5 + (((tickAnim - 2) / 1) * (20-(7.5)));
            yy = 5 + (((tickAnim - 2) / 1) * (-2.5-(5)));
            zz = -12.5 + (((tickAnim - 2) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20 + (((tickAnim - 3) / 2) * (27.5-(20)));
            yy = -2.5 + (((tickAnim - 3) / 2) * (-2.5-(-2.5)));
            zz = -12.5 + (((tickAnim - 3) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 5) / 2) * (25-(27.5)));
            yy = -2.5 + (((tickAnim - 5) / 2) * (-5-(-2.5)));
            zz = -12.5 + (((tickAnim - 5) / 2) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 7) / 1) * (-25-(25)));
            yy = -5 + (((tickAnim - 7) / 1) * (-2.5-(-5)));
            zz = -12.5 + (((tickAnim - 7) / 1) * (-17.5-(-12.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 8) / 0) * (-20-(-25)));
            yy = -2.5 + (((tickAnim - 8) / 0) * (0-(-2.5)));
            zz = -17.5 + (((tickAnim - 8) / 0) * (-12.5-(-17.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -20 + (((tickAnim - 8) / 1) * (-20-(-20)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.5-(0)));
            zz = -12.5 + (((tickAnim - 8) / 1) * (-12.5-(-12.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 9) / 1) * (-25-(-20)));
            yy = 2.5 + (((tickAnim - 9) / 1) * (5-(2.5)));
            zz = -12.5 + (((tickAnim - 9) / 1) * (-12.5-(-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (47.5-(0)));
            yy = 42.5 + (((tickAnim - 0) / 2) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 0) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 47.5 + (((tickAnim - 2) / 1) * (10-(47.5)));
            yy = 42.5 + (((tickAnim - 2) / 1) * (42.5-(42.5)));
            zz = -7.5 + (((tickAnim - 2) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10 + (((tickAnim - 3) / 2) * (-2.5-(10)));
            yy = 42.5 + (((tickAnim - 3) / 2) * (32.5-(42.5)));
            zz = -7.5 + (((tickAnim - 3) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -2.5 + (((tickAnim - 5) / 2) * (30-(-2.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (32.5-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 7) / 1) * (32.5-(30)));
            yy = 32.5 + (((tickAnim - 7) / 1) * (37.5-(32.5)));
            zz = -7.5 + (((tickAnim - 7) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 8) / 0) * (10-(32.5)));
            yy = 37.5 + (((tickAnim - 8) / 0) * (40-(37.5)));
            zz = -7.5 + (((tickAnim - 8) / 0) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 10 + (((tickAnim - 8) / 1) * (-2.5-(10)));
            yy = 40 + (((tickAnim - 8) / 1) * (41.25-(40)));
            zz = -7.5 + (((tickAnim - 8) / 1) * (-7.5-(-7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 9) / 1) * (0-(-2.5)));
            yy = 41.25 + (((tickAnim - 9) / 1) * (42.5-(41.25)));
            zz = -7.5 + (((tickAnim - 9) / 1) * (-7.5-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -15 + (((tickAnim - 0) / 1) * (-10-(-15)));
            yy = -12.5 + (((tickAnim - 0) / 1) * (1.25-(-12.5)));
            zz = -22.5 + (((tickAnim - 0) / 1) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (-10-(-10)));
            yy = 1.25 + (((tickAnim - 1) / 1) * (15-(1.25)));
            zz = -7.5 + (((tickAnim - 1) / 1) * (0-(-7.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 2) / 1) * (0-(-10)));
            yy = 15 + (((tickAnim - 2) / 1) * (20-(15)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (7.5-(0)));
            yy = 20 + (((tickAnim - 3) / 0) * (25-(20)));
            zz = 0 + (((tickAnim - 3) / 0) * (-10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 3) / 2) * (7.5-(7.5)));
            yy = 25 + (((tickAnim - 3) / 2) * (32.5-(25)));
            zz = -10 + (((tickAnim - 3) / 2) * (-7.5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 5) / 2) * (5-(7.5)));
            yy = 32.5 + (((tickAnim - 5) / 2) * (20-(32.5)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (10-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 5 + (((tickAnim - 7) / 2) * (0-(5)));
            yy = 20 + (((tickAnim - 7) / 2) * (-5-(20)));
            zz = 10 + (((tickAnim - 7) / 2) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-15-(0)));
            yy = -5 + (((tickAnim - 9) / 1) * (-12.5-(-5)));
            zz = 10 + (((tickAnim - 9) / 1) * (-22.5-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 1) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 1) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 2) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 3) / 0) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 2) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 5) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 7) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 9) / 1) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.5 + (((tickAnim - 0) / 1) * (1.25-(0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 1) * (11.25-(30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 1.25 + (((tickAnim - 1) / 1) * (0-(1.25)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 11.25 + (((tickAnim - 1) / 1) * (2.5-(11.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 2) / 1) * (5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 0) * (20-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5-(0)));
            zz = 20 + (((tickAnim - 3) / 2) * (22.5-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (0.75-(2.5)));
            yy = -5 + (((tickAnim - 5) / 2) * (0-(-5)));
            zz = 22.5 + (((tickAnim - 5) / 2) * (7.5-(22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 7) / 2) * (0-(0.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 7) / 2) * (10-(7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0.5-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 9) / 1) * (30-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10 + (((tickAnim - 0) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 1) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 3) / 0) * (0-(2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 2.5 + (((tickAnim - 5) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 9) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.5 + (((tickAnim - 0) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -25 + (((tickAnim - 0) / 1) * (-15-(-25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 17.5 + (((tickAnim - 1) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -15 + (((tickAnim - 1) / 1) * (-10-(-15)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 2) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 2) / 1) * (2.5-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 3) / 0) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 0) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 2) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 5) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 5) / 2) * (-15-(-7.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 7) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = -15 + (((tickAnim - 7) / 2) * (-27.5-(-15)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 9) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -27.5 + (((tickAnim - 9) / 1) * (-25-(-27.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
            yy = -1.25 + (((tickAnim - 0) / 1) * (-15-(-1.25)));
            zz = 7.5 + (((tickAnim - 0) / 1) * (0-(7.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -10 + (((tickAnim - 1) / 1) * (0-(-10)));
            yy = -15 + (((tickAnim - 1) / 1) * (-20-(-15)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (7.5-(0)));
            yy = -20 + (((tickAnim - 2) / 1) * (-25-(-20)));
            zz = 0 + (((tickAnim - 2) / 1) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 7.5 + (((tickAnim - 3) / 1) * (7.5-(7.5)));
            yy = -25 + (((tickAnim - 3) / 1) * (-32.5-(-25)));
            zz = 10 + (((tickAnim - 3) / 1) * (7.5-(10)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 7.5 + (((tickAnim - 4) / 2) * (5-(7.5)));
            yy = -32.5 + (((tickAnim - 4) / 2) * (-20-(-32.5)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (-10-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 6) / 2) * (0-(5)));
            yy = -20 + (((tickAnim - 6) / 2) * (5-(-20)));
            zz = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-19.613-(0)));
            yy = 5 + (((tickAnim - 8) / 1) * (16.79306-(5)));
            zz = -10 + (((tickAnim - 8) / 1) * (12.65287-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -19.613 + (((tickAnim - 9) / 1) * (-10-(-19.613)));
            yy = 16.79306 + (((tickAnim - 9) / 1) * (-1.25-(16.79306)));
            zz = 12.65287 + (((tickAnim - 9) / 1) * (7.5-(12.65287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 1) * (-0.25-(0.25)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.5-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 1) / 1) * (0-(-0.25)));
            zz = 0.5 + (((tickAnim - 1) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 2) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (0-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.5-(0)));
            zz = 0.5 + (((tickAnim - 4) / 2) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 6) / 2) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 6) / 2) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-2.325-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (0.5-(0.5)));
            zz = -0.5 + (((tickAnim - 8) / 1) * (0-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.325 + (((tickAnim - 9) / 1) * (0-(-2.325)));
            yy = 0.5 + (((tickAnim - 9) / 1) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.5 + (((tickAnim - 0) / 1) * (0-(0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -11.25 + (((tickAnim - 0) / 1) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 1) / 1) * (-5-(-2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-20-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 2.5 + (((tickAnim - 3) / 1) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (5-(0)));
            zz = -20 + (((tickAnim - 3) / 1) * (-22.5-(-20)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 4) / 2) * (0.5-(2.5)));
            yy = 5 + (((tickAnim - 4) / 2) * (0-(5)));
            zz = -22.5 + (((tickAnim - 4) / 2) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.5 + (((tickAnim - 6) / 2) * (0.75-(0.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 6) / 2) * (-10-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.75 + (((tickAnim - 8) / 1) * (-0.25-(0.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 8) / 1) * (-30-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.25 + (((tickAnim - 9) / 1) * (0.5-(-0.25)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -30 + (((tickAnim - 9) / 1) * (-11.25-(-30)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.5 + (((tickAnim - 0) / 1) * (10-(7.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (2.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 2) / 1) * (0-(2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (2.5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.5 + (((tickAnim - 4) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 2.5 + (((tickAnim - 8) / 1) * (10-(2.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 9) / 1) * (7.5-(10)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 17.5 + (((tickAnim - 0) / 1) * (15-(17.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 15 + (((tickAnim - 0) / 1) * (10-(15)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 1) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 1) / 1) * (-2.5-(10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (-15-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -15 + (((tickAnim - 3) / 1) * (-15-(-15)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 1) * (7.5-(-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15 + (((tickAnim - 4) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 4) / 2) * (15-(7.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 6) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 15 + (((tickAnim - 6) / 2) * (27.5-(15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -10 + (((tickAnim - 8) / 1) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 27.5 + (((tickAnim - 8) / 1) * (25-(27.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 27.5 + (((tickAnim - 9) / 1) * (17.5-(27.5)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 25 + (((tickAnim - 9) / 1) * (15-(25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.5+30))*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)((-0.025+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*700/1.5+30))*-0.2);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)((Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*750/1.5+35))*-0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*0.5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*-3.5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+200))*3), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-250))*-2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 0) / 8) * (41.5692-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-7.4242-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.06662-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 41.5692 + (((tickAnim - 8) / 5) * (13.6472-(41.5692)));
            yy = -7.4242 + (((tickAnim - 8) / 5) * (-5.36192-(-7.4242)));
            zz = -1.06662 + (((tickAnim - 8) / 5) * (-0.77034-(-1.06662)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 13.6472 + (((tickAnim - 13) / 8) * (-13.75-(13.6472)));
            yy = -5.36192 + (((tickAnim - 13) / 8) * (0-(-5.36192)));
            zz = -0.77034 + (((tickAnim - 13) / 8) * (0-(-0.77034)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 21) / 9) * (-6.75-(-13.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.29-(0)));
            yy = -1.1 + (((tickAnim - 0) / 5) * (-0.9-(-1.1)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.29 + (((tickAnim - 5) / 3) * (0.375-(0.29)));
            yy = -0.9 + (((tickAnim - 5) / 3) * (-1.65-(-0.9)));
            zz = -0.25 + (((tickAnim - 5) / 3) * (-0.325-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.375 + (((tickAnim - 8) / 5) * (0.27-(0.375)));
            yy = -1.65 + (((tickAnim - 8) / 5) * (-1.025-(-1.65)));
            zz = -0.325 + (((tickAnim - 8) / 5) * (-0.23-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0.27 + (((tickAnim - 13) / 8) * (0-(0.27)));
            yy = -1.025 + (((tickAnim - 13) / 8) * (-0.75-(-1.025)));
            zz = -0.23 + (((tickAnim - 13) / 8) * (0-(-0.23)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.75 + (((tickAnim - 21) / 9) * (-1.1-(-0.75)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegright.rotationPointX = this.upperlegright.rotationPointX + (float)(xx);
        this.upperlegright.rotationPointY = this.upperlegright.rotationPointY - (float)(yy);
        this.upperlegright.rotationPointZ = this.upperlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.83188 + (((tickAnim - 0) / 8) * (-11.75-(7.83188)));
            yy = -3.25121 + (((tickAnim - 0) / 8) * (0-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 0) / 8) * (0-(5.91859)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -11.75 + (((tickAnim - 8) / 5) * (25.40511-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (9.72421-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (21.84924-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25.40511 + (((tickAnim - 13) / 5) * (-27.30176-(25.40511)));
            yy = 9.72421 + (((tickAnim - 13) / 5) * (3.73555-(9.72421)));
            zz = 21.84924 + (((tickAnim - 13) / 5) * (14.49663-(21.84924)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -27.30176 + (((tickAnim - 18) / 3) * (-15.66812-(-27.30176)));
            yy = 3.73555 + (((tickAnim - 18) / 3) * (-3.25121-(3.73555)));
            zz = 14.49663 + (((tickAnim - 18) / 3) * (5.91859-(14.49663)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -15.66812 + (((tickAnim - 21) / 9) * (7.83188-(-15.66812)));
            yy = -3.25121 + (((tickAnim - 21) / 9) * (-3.25121-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 21) / 9) * (5.91859-(5.91859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (-0.2-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 2) / 6) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.34-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.325-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.15 + (((tickAnim - 13) / 5) * (-0.325-(-0.15)));
            yy = 0.34 + (((tickAnim - 13) / 5) * (1.575-(0.34)));
            zz = -0.325 + (((tickAnim - 13) / 5) * (-0.05-(-0.325)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.325 + (((tickAnim - 18) / 3) * (0-(-0.325)));
            yy = 1.575 + (((tickAnim - 18) / 3) * (-0.075-(1.575)));
            zz = -0.05 + (((tickAnim - 18) / 3) * (0.125-(-0.05)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 21) / 9) * (0.075-(-0.075)));
            zz = 0.125 + (((tickAnim - 21) / 9) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.71927 + (((tickAnim - 0) / 8) * (-23.0426-(-0.71927)));
            yy = -27.0357 + (((tickAnim - 0) / 8) * (-28.029-(-27.0357)));
            zz = 1.42683 + (((tickAnim - 0) / 8) * (13.3479-(1.42683)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -23.0426 + (((tickAnim - 8) / 5) * (36.27658-(-23.0426)));
            yy = -28.029 + (((tickAnim - 8) / 5) * (-34.85269-(-28.029)));
            zz = 13.3479 + (((tickAnim - 8) / 5) * (8.53987-(13.3479)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 36.27658 + (((tickAnim - 13) / 5) * (27.48678-(36.27658)));
            yy = -34.85269 + (((tickAnim - 13) / 5) * (-25.62692-(-34.85269)));
            zz = 8.53987 + (((tickAnim - 13) / 5) * (6.75952-(8.53987)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 27.48678 + (((tickAnim - 18) / 3) * (31.857-(27.48678)));
            yy = -25.62692 + (((tickAnim - 18) / 3) * (-14.86352-(-25.62692)));
            zz = 6.75952 + (((tickAnim - 18) / 3) * (4.68245-(6.75952)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 31.857 + (((tickAnim - 21) / 9) * (-0.71927-(31.857)));
            yy = -14.86352 + (((tickAnim - 21) / 9) * (-27.0357-(-14.86352)));
            zz = 4.68245 + (((tickAnim - 21) / 9) * (1.42683-(4.68245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.65-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.1-(0)));
            zz = 0.65 + (((tickAnim - 13) / 5) * (1.015-(0.65)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 3) * (0.275-(0.1)));
            zz = 1.015 + (((tickAnim - 18) / 3) * (0-(1.015)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 9) * (0-(0.275)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.8192 + (((tickAnim - 0) / 3) * (6.01451-(37.8192)));
            yy = -7.4242 + (((tickAnim - 0) / 3) * (-4.53701-(-7.4242)));
            zz = -1.06662 + (((tickAnim - 0) / 3) * (-0.65183-(-1.06662)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 6.01451 + (((tickAnim - 3) / 5) * (-13.75-(6.01451)));
            yy = -4.53701 + (((tickAnim - 3) / 5) * (0-(-4.53701)));
            zz = -0.65183 + (((tickAnim - 3) / 5) * (0-(-0.65183)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -13.75 + (((tickAnim - 8) / 22) * (37.8192-(-13.75)));
            yy = 0 + (((tickAnim - 8) / 22) * (-7.4242-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (-1.06662-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.075 + (((tickAnim - 0) / 3) * (-0.225-(-1.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 5) * (-0.75-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 8) / 19) * (0-(0)));
            yy = -0.75 + (((tickAnim - 8) / 19) * (-0.385-(-0.75)));
            zz = 0 + (((tickAnim - 8) / 19) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.385 + (((tickAnim - 27) / 3) * (-1.075-(-0.385)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegleft.rotationPointX = this.upperlegleft.rotationPointX + (float)(xx);
        this.upperlegleft.rotationPointY = this.upperlegleft.rotationPointY - (float)(yy);
        this.upperlegleft.rotationPointZ = this.upperlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.75 + (((tickAnim - 0) / 3) * (30.22396-(-8.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.6002-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.87079-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.22396 + (((tickAnim - 3) / 2) * (-7.33791-(30.22396)));
            yy = -5.6002 + (((tickAnim - 3) / 2) * (-5.31288-(-5.6002)));
            zz = -12.87079 + (((tickAnim - 3) / 2) * (-10.57252-(-12.87079)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.33791 + (((tickAnim - 5) / 3) * (-15.66812-(-7.33791)));
            yy = -5.31288 + (((tickAnim - 5) / 3) * (-3.25121-(-5.31288)));
            zz = -10.57252 + (((tickAnim - 5) / 3) * (5.91859-(-10.57252)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -15.66812 + (((tickAnim - 8) / 22) * (-8.75-(-15.66812)));
            yy = -3.25121 + (((tickAnim - 8) / 22) * (0-(-3.25121)));
            zz = 5.91859 + (((tickAnim - 8) / 22) * (0-(5.91859)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0.2-(0)));
            yy = 0.125 + (((tickAnim - 3) / 2) * (1.705-(0.125)));
            zz = -0.35 + (((tickAnim - 3) / 2) * (-0.15-(-0.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.2 + (((tickAnim - 5) / 3) * (0-(0.2)));
            yy = 1.705 + (((tickAnim - 5) / 3) * (0-(1.705)));
            zz = -0.15 + (((tickAnim - 5) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 8) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 16) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 16) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 24) / 6) * (0-(0.45)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegleft.rotationPointX = this.lowerlegleft.rotationPointX + (float)(xx);
        this.lowerlegleft.rotationPointY = this.lowerlegleft.rotationPointY - (float)(yy);
        this.lowerlegleft.rotationPointZ = this.lowerlegleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -16.79259 + (((tickAnim - 0) / 3) * (57.75117-(-16.79259)));
            yy = 28.02905 + (((tickAnim - 0) / 3) * (23.87256-(28.02905)));
            zz = -13.34791 + (((tickAnim - 0) / 3) * (-15.40035-(-13.34791)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 57.75117 + (((tickAnim - 3) / 2) * (36.75516-(57.75117)));
            yy = 23.87256 + (((tickAnim - 3) / 2) * (21.29388-(23.87256)));
            zz = -15.40035 + (((tickAnim - 3) / 2) * (-16.67368-(-15.40035)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.75516 + (((tickAnim - 5) / 3) * (30.89136-(36.75516)));
            yy = 21.29388 + (((tickAnim - 5) / 3) * (17.34093-(21.29388)));
            zz = -16.67368 + (((tickAnim - 5) / 3) * (-18.62562-(-16.67368)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 30.89136 + (((tickAnim - 8) / 22) * (-16.79259-(30.89136)));
            yy = 17.34093 + (((tickAnim - 8) / 22) * (28.02905-(17.34093)));
            zz = -18.62562 + (((tickAnim - 8) / 22) * (-13.34791-(-18.62562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 2) * (0.225-(-0.15)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0.45-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 5) / 3) * (0-(0.225)));
            zz = 0.45 + (((tickAnim - 5) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.34969 + (((tickAnim - 0) / 5) * (-13.21723-(-1.34969)));
            yy = 19.55024 + (((tickAnim - 0) / 5) * (-4.65267-(19.55024)));
            zz = -7.28146 + (((tickAnim - 0) / 5) * (24.26164-(-7.28146)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -13.21723 + (((tickAnim - 5) / 6) * (-0.84255-(-13.21723)));
            yy = -4.65267 + (((tickAnim - 5) / 6) * (-9.61985-(-4.65267)));
            zz = 24.26164 + (((tickAnim - 5) / 6) * (-1.71711-(24.26164)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -0.84255 + (((tickAnim - 11) / 19) * (-1.34969-(-0.84255)));
            yy = -9.61985 + (((tickAnim - 11) / 19) * (19.55024-(-9.61985)));
            zz = -1.71711 + (((tickAnim - 11) / 19) * (-7.28146-(-1.71711)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.3 + (((tickAnim - 0) / 5) * (1.715-(-1.3)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.545-(0)));
            zz = 0.45 + (((tickAnim - 0) / 5) * (0.655-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 1.715 + (((tickAnim - 5) / 6) * (2.1-(1.715)));
            yy = 0.545 + (((tickAnim - 5) / 6) * (0.625-(0.545)));
            zz = 0.655 + (((tickAnim - 5) / 6) * (1.125-(0.655)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 2.1 + (((tickAnim - 11) / 19) * (-1.3-(2.1)));
            yy = 0.625 + (((tickAnim - 11) / 19) * (0-(0.625)));
            zz = 1.125 + (((tickAnim - 11) / 19) * (0.45-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright1.rotationPointX = this.wingright1.rotationPointX + (float)(xx);
        this.wingright1.rotationPointY = this.wingright1.rotationPointY - (float)(yy);
        this.wingright1.rotationPointZ = this.wingright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.99077-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.23527-(0)));
            zz = 4 + (((tickAnim - 0) / 5) * (-16.77386-(4)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -4.99077 + (((tickAnim - 5) / 6) * (0-(-4.99077)));
            yy = -0.23527 + (((tickAnim - 5) / 6) * (0-(-0.23527)));
            zz = -16.77386 + (((tickAnim - 5) / 6) * (0-(-16.77386)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (4-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            yy = 0.4 + (((tickAnim - 0) / 5) * (0.475-(0.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -0.2 + (((tickAnim - 5) / 6) * (0-(-0.2)));
            yy = 0.475 + (((tickAnim - 5) / 6) * (0.6-(0.475)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0.6 + (((tickAnim - 11) / 19) * (0.4-(0.6)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright2.rotationPointX = this.wingright2.rotationPointX + (float)(xx);
        this.wingright2.rotationPointY = this.wingright2.rotationPointY - (float)(yy);
        this.wingright2.rotationPointZ = this.wingright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(xx), wingright3.rotateAngleY + (float) Math.toRadians(yy), wingright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-1.85-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = -1.85 + (((tickAnim - 11) / 19) * (0-(-1.85)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingright3.rotationPointX = this.wingright3.rotationPointX + (float)(xx);
        this.wingright3.rotationPointY = this.wingright3.rotationPointY - (float)(yy);
        this.wingright3.rotationPointZ = this.wingright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 5) / 6) * (15.75-(5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 11) / 19) * (0-(15.75)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.25 + (((tickAnim - 0) / 6) * (1.31875-(5.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (35.78893-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-75.08624-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 1.31875 + (((tickAnim - 6) / 5) * (0-(1.31875)));
            yy = 35.78893 + (((tickAnim - 6) / 5) * (0-(35.78893)));
            zz = -75.08624 + (((tickAnim - 6) / 5) * (0-(-75.08624)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (5.25-(0)));
            yy = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.125-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -0.125 + (((tickAnim - 6) / 5) * (0-(-0.125)));
            yy = 0.55 + (((tickAnim - 6) / 5) * (1.15-(0.55)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 1.15 + (((tickAnim - 11) / 6) * (0.425-(1.15)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0.425 + (((tickAnim - 17) / 13) * (0-(0.425)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handright.rotationPointX = this.handright.rotationPointX + (float)(xx);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(yy);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.67205 + (((tickAnim - 0) / 13) * (0.09594-(0.67205)));
            yy = 6.3419 + (((tickAnim - 0) / 13) * (-16.05332-(6.3419)));
            zz = 1.01847 + (((tickAnim - 0) / 13) * (10.51437-(1.01847)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.09594 + (((tickAnim - 13) / 7) * (-7.92792-(0.09594)));
            yy = -16.05332 + (((tickAnim - 13) / 7) * (5.68346-(-16.05332)));
            zz = 10.51437 + (((tickAnim - 13) / 7) * (-21.30745-(10.51437)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -7.92792 + (((tickAnim - 20) / 6) * (1.43347-(-7.92792)));
            yy = 5.68346 + (((tickAnim - 20) / 6) * (9.20963-(5.68346)));
            zz = -21.30745 + (((tickAnim - 20) / 6) * (3.44128-(-21.30745)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1.43347 + (((tickAnim - 26) / 4) * (0.67205-(1.43347)));
            yy = 9.20963 + (((tickAnim - 26) / 4) * (6.3419-(9.20963)));
            zz = 3.44128 + (((tickAnim - 26) / 4) * (1.01847-(3.44128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1.3 + (((tickAnim - 0) / 13) * (1.275-(-1.3)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.425-(0)));
            zz = 0.45 + (((tickAnim - 0) / 13) * (0.95-(0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.275 + (((tickAnim - 13) / 7) * (-0.68-(1.275)));
            yy = -0.425 + (((tickAnim - 13) / 7) * (-0.23-(-0.425)));
            zz = 0.95 + (((tickAnim - 13) / 7) * (0.52-(0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -0.68 + (((tickAnim - 20) / 6) * (-2.275-(-0.68)));
            yy = -0.23 + (((tickAnim - 20) / 6) * (-0.425-(-0.23)));
            zz = 0.52 + (((tickAnim - 20) / 6) * (0.15-(0.52)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2.275 + (((tickAnim - 26) / 4) * (-1.3-(-2.275)));
            yy = -0.425 + (((tickAnim - 26) / 4) * (0-(-0.425)));
            zz = 0.15 + (((tickAnim - 26) / 4) * (0.45-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft1.rotationPointX = this.wingleft1.rotationPointX + (float)(xx);
        this.wingleft1.rotationPointY = this.wingleft1.rotationPointY - (float)(yy);
        this.wingleft1.rotationPointZ = this.wingleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -4.75 + (((tickAnim - 13) / 7) * (22.13-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -4.75 + (((tickAnim - 20) / 6) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 22.13 + (((tickAnim - 20) / 6) * (0-(22.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 13) * (0.325-(0.125)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0.35-(0)));
            yy = 0.325 + (((tickAnim - 13) / 7) * (0.68-(0.325)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0.35 + (((tickAnim - 20) / 6) * (0-(0.35)));
            yy = 0.68 + (((tickAnim - 20) / 6) * (0.125-(0.68)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.wingleft2.rotationPointX = this.wingleft2.rotationPointX + (float)(xx);
        this.wingleft2.rotationPointY = this.wingleft2.rotationPointY - (float)(yy);
        this.wingleft2.rotationPointZ = this.wingleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 0) / 13) * (0-(10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (10-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.29355-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.04221-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.1067-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 6.29355 + (((tickAnim - 15) / 6) * (0-(6.29355)));
            yy = -3.04221 + (((tickAnim - 15) / 6) * (-20.75-(-3.04221)));
            zz = 4.1067 + (((tickAnim - 15) / 6) * (79.25-(4.1067)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = -20.75 + (((tickAnim - 21) / 5) * (0-(-20.75)));
            zz = 79.25 + (((tickAnim - 21) / 5) * (0-(79.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.975 + (((tickAnim - 13) / 8) * (0.825-(0.975)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 21) / 5) * (0.8-(0.825)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 26) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);

    }

    public void animPreen(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5 + (((tickAnim - 10) / 30) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5 + (((tickAnim - 40) / 5) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*-2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20 + (((tickAnim - 25) / 15) * (-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5 + (((tickAnim - 25) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-22.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*5)));
            yy = -20 + (((tickAnim - 40) / 5) * (0-(-20)));
            zz = -30 + (((tickAnim - 40) / 5) * (0-(-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*20)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20 + (((tickAnim - 20) / 5) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*20)));
            yy = 0 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5 + (((tickAnim - 25) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5 + (((tickAnim - 40) / 5) * (0-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+60))*5)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 20) / 5) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10 + (((tickAnim - 20) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5 + (((tickAnim - 25) / 15) * (27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 25) / 15) * (-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 25) / 15) * (-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5 + (((tickAnim - 40) / 5) * (0-(27.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+120))*5)));
            yy = -15 + (((tickAnim - 40) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 40) / 5) * (0-(-10)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 25) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10 + (((tickAnim - 40) / 5) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440-120))*10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 10) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5 + (((tickAnim - 40) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+120))*10)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10 + (((tickAnim - 13) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 30) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 7) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 50) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5 + (((tickAnim - 57) / 3) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62))*0.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.62+60))*5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*0.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1.9468)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481 + (((tickAnim - 25) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-20.9481)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*1.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30 + (((tickAnim - 40) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.25))*-30)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.37))*2.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (2.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -5 + (((tickAnim - 40) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 2.5 + (((tickAnim - 40) / 5) * (0-(2.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(xx), wingleft3.rotateAngleY + (float) Math.toRadians(yy), wingleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDorygnathus entity = (EntityPrehistoricFloraDorygnathus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-10)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-10)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*1)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30 + (((tickAnim - 5) / 15) * (-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-30)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 20) / 5) * (-40-(-30)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -40 + (((tickAnim - 25) / 10) * (-40-(-40)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 35) / 5) * (0-(-40)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5 + (((tickAnim - 5) / 15) * (-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.5)));
            yy = 10 + (((tickAnim - 5) / 15) * (10-(10)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.25 + (((tickAnim - 20) / 5) * (10-(-0.25)));
            yy = 10 + (((tickAnim - 20) / 5) * (-10-(10)));
            zz = 5 + (((tickAnim - 20) / 5) * (-5-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 25) / 10) * (10-(10)));
            yy = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
            zz = -5 + (((tickAnim - 25) / 10) * (-5-(-5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 35) / 5) * (0-(10)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = -5 + (((tickAnim - 35) / 5) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30 + (((tickAnim - 5) / 15) * (30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*30)));
            yy = 15 + (((tickAnim - 5) / 15) * (15-(15)));
            zz = 5 + (((tickAnim - 5) / 15) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 20) / 5) * (40-(30+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = 15 + (((tickAnim - 20) / 5) * (-15-(15)));
            zz = 5 + (((tickAnim - 20) / 5) * (-10-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 40 + (((tickAnim - 25) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3-(40)));
            yy = -15 + (((tickAnim - 25) / 10) * (-15-(-15)));
            zz = -10 + (((tickAnim - 25) / 10) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3 + (((tickAnim - 35) / 5) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440))*3)));
            yy = -15 + (((tickAnim - 35) / 5) * (0-(-15)));
            zz = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 5) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3 + (((tickAnim - 25) / 5) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440*2))*3)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-2.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*5)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 30) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*15)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5 + (((tickAnim - 5) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.75))*-12.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5 + (((tickAnim - 35) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-12.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(chest, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r1, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r10, ((-0.0254F)-(-0.0254F)), ((-0.1659F)-(-0.1659F)),((0.6151F)-(0.6151F)));
        animator.rotate(cube_r11, ((-0.0326F)-(-0.0326F)), ((-0.1647F)-(-0.1647F)),((0.6594F)-(0.6594F)));
        animator.rotate(cube_r12, ((0.0262F)-(0.0262F)), ((-0.1658F)-(-0.1658F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r13, ((0.0262F)-(0.0262F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r14, ((0.0262F)-(0.0262F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r15, ((-0.1963F)-(-0.1963F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r16, ((0.4363F)-(0.4363F)), ((0.1396F)-(0.1396F)),((0.6894F)-(0.6894F)));
        animator.rotate(cube_r17, ((0.8727F)-(0.8727F)), ((0.1396F)-(0.1396F)),((0.9163F)-(0.9163F)));
        animator.rotate(cube_r18, ((0.0F)-(0.0F)), ((0.1396F)-(0.1396F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r19, ((0.4363F)-(0.4363F)), ((-0.1396F)-(-0.1396F)),((-0.6894F)-(-0.6894F)));
        animator.rotate(cube_r2, ((0.2705F)-(0.2705F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r20, ((0.8727F)-(0.8727F)), ((-0.1396F)-(-0.1396F)),((-0.9163F)-(-0.9163F)));
        animator.rotate(cube_r21, ((0.0F)-(0.0F)), ((-0.1396F)-(-0.1396F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r22, ((0.0F)-(0.0F)), ((0.2094F)-(0.2094F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r23, ((0.0F)-(0.0F)), ((-0.2094F)-(-0.2094F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r24, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.6196F)-(0.6196F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r4, ((-0.0254F)-(-0.0254F)), ((0.1659F)-(0.1659F)),((-0.6151F)-(-0.6151F)));
        animator.rotate(cube_r5, ((-0.0326F)-(-0.0326F)), ((0.1647F)-(0.1647F)),((-0.6594F)-(-0.6594F)));
        animator.rotate(cube_r6, ((0.0262F)-(0.0262F)), ((0.1658F)-(0.1658F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r7, ((0.0262F)-(0.0262F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r8, ((0.1571F)-(0.1571F)), ((0.1745F)-(0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r9, ((0.1571F)-(0.1571F)), ((-0.1745F)-(-0.1745F)),((0.0F)-(0.0F)));
        animator.rotate(footleft, ((1.0606F)-(-0.3927F)), ((-0.5918F)-(-0.5672F)),((0.2276F)-(0.2182F)));
        animator.rotate(footright, ((1.0606F)-(-0.3927F)), ((0.5918F)-(0.5672F)),((-0.2276F)-(-0.2182F)));
        animator.rotate(handleft, ((0.0524F)-(0.0F)), ((-0.0422F)-(0.6109F)),((1.6458F)-(0.0436F)));
        animator.rotate(handright, ((0.0173F)-(0.0F)), ((0.1884F)-(-0.6109F)),((-1.564F)-(-0.0436F)));
        animator.rotate(head, ((0.4276F)-(0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing2, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legwing4, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(lowerlegleft, ((0.5767F)-(0.7854F)), ((0.1147F)-(0.0F)),((0.2812F)-(0.5236F)));
        animator.rotate(lowerlegright, ((0.5767F)-(0.7854F)), ((-0.1147F)-(0.0F)),((-0.2812F)-(-0.5236F)));
        animator.rotate(neck1, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.1745F)-(-0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail1, ((0.0044F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail2, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail3, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail4, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail5, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperlegleft, ((0.2509F)-(-0.3054F)), ((-0.0332F)-(0.0F)),((-1.4914F)-(-0.48F)));
        animator.rotate(upperlegright, ((0.2509F)-(-0.3054F)), ((0.0332F)-(0.0F)),((1.4914F)-(0.48F)));
        animator.rotate(wingleft1, ((0.0F)-(0.0F)), ((0.0206F)-(0.1309F)),((-0.0911F)-(-0.0436F)));
        animator.rotate(wingleft2, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((-1.5509F)-(-0.0436F)));
        animator.rotate(wingleft3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((0.0911F)-(0.0873F)));
        animator.rotate(wingleft4, ((0.1375F)-(1.0472F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(wingright1, ((0.0F)-(0.0F)), ((-0.0206F)-(-0.1309F)),((0.0911F)-(0.0436F)));
        animator.rotate(wingright2, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((1.5509F)-(0.0436F)));
        animator.rotate(wingright3, ((-1.4748F)-(0.0F)), ((0.0F)-(0.0F)),((-0.0911F)-(-0.0873F)));
        animator.rotate(wingright4, ((0.1375F)-(1.0472F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(chest, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r1, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r10, -((-0.0254F)-(-0.0254F)), -((-0.1659F)-(-0.1659F)),-((0.6151F)-(0.6151F)));
        animator.rotate(cube_r11, -((-0.0326F)-(-0.0326F)), -((-0.1647F)-(-0.1647F)),-((0.6594F)-(0.6594F)));
        animator.rotate(cube_r12, -((0.0262F)-(0.0262F)), -((-0.1658F)-(-0.1658F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r13, -((0.0262F)-(0.0262F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r14, -((0.0262F)-(0.0262F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r15, -((-0.1963F)-(-0.1963F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r16, -((0.4363F)-(0.4363F)), -((0.1396F)-(0.1396F)),-((0.6894F)-(0.6894F)));
        animator.rotate(cube_r17, -((0.8727F)-(0.8727F)), -((0.1396F)-(0.1396F)),-((0.9163F)-(0.9163F)));
        animator.rotate(cube_r18, -((0.0F)-(0.0F)), -((0.1396F)-(0.1396F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r19, -((0.4363F)-(0.4363F)), -((-0.1396F)-(-0.1396F)),-((-0.6894F)-(-0.6894F)));
        animator.rotate(cube_r2, -((0.2705F)-(0.2705F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r20, -((0.8727F)-(0.8727F)), -((-0.1396F)-(-0.1396F)),-((-0.9163F)-(-0.9163F)));
        animator.rotate(cube_r21, -((0.0F)-(0.0F)), -((-0.1396F)-(-0.1396F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r22, -((0.0F)-(0.0F)), -((0.2094F)-(0.2094F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r23, -((0.0F)-(0.0F)), -((-0.2094F)-(-0.2094F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r24, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.6196F)-(0.6196F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r4, -((-0.0254F)-(-0.0254F)), -((0.1659F)-(0.1659F)),-((-0.6151F)-(-0.6151F)));
        animator.rotate(cube_r5, -((-0.0326F)-(-0.0326F)), -((0.1647F)-(0.1647F)),-((-0.6594F)-(-0.6594F)));
        animator.rotate(cube_r6, -((0.0262F)-(0.0262F)), -((0.1658F)-(0.1658F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r7, -((0.0262F)-(0.0262F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r8, -((0.1571F)-(0.1571F)), -((0.1745F)-(0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r9, -((0.1571F)-(0.1571F)), -((-0.1745F)-(-0.1745F)),-((0.0F)-(0.0F)));
        animator.rotate(footleft, -((1.0606F)-(-0.3927F)), -((-0.5918F)-(-0.5672F)),-((0.2276F)-(0.2182F)));
        animator.rotate(footright, -((1.0606F)-(-0.3927F)), -((0.5918F)-(0.5672F)),-((-0.2276F)-(-0.2182F)));
        animator.rotate(handleft, -((0.0524F)-(0.0F)), -((-0.0422F)-(0.6109F)),-((1.6458F)-(0.0436F)));
        animator.rotate(handright, -((0.0173F)-(0.0F)), -((0.1884F)-(-0.6109F)),-((-1.564F)-(-0.0436F)));
        animator.rotate(head, -((0.4276F)-(0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing2, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legwing4, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(lowerlegleft, -((0.5767F)-(0.7854F)), -((0.1147F)-(0.0F)),-((0.2812F)-(0.5236F)));
        animator.rotate(lowerlegright, -((0.5767F)-(0.7854F)), -((-0.1147F)-(0.0F)),-((-0.2812F)-(-0.5236F)));
        animator.rotate(neck1, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.1745F)-(-0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail1, -((0.0044F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail2, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail3, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail4, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail5, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperlegleft, -((0.2509F)-(-0.3054F)), -((-0.0332F)-(0.0F)),-((-1.4914F)-(-0.48F)));
        animator.rotate(upperlegright, -((0.2509F)-(-0.3054F)), -((0.0332F)-(0.0F)),-((1.4914F)-(0.48F)));
        animator.rotate(wingleft1, -((0.0F)-(0.0F)), -((0.0206F)-(0.1309F)),-((-0.0911F)-(-0.0436F)));
        animator.rotate(wingleft2, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((-1.5509F)-(-0.0436F)));
        animator.rotate(wingleft3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0911F)-(0.0873F)));
        animator.rotate(wingleft4, -((0.1375F)-(1.0472F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(wingright1, -((0.0F)-(0.0F)), -((-0.0206F)-(-0.1309F)),-((0.0911F)-(0.0436F)));
        animator.rotate(wingright2, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((1.5509F)-(0.0436F)));
        animator.rotate(wingright3, -((-1.4748F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.0911F)-(-0.0873F)));
        animator.rotate(wingright4, -((0.1375F)-(1.0472F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
