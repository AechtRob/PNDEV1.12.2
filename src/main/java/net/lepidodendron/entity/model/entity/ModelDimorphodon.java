package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDimorphodon;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelDimorphodon extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer upperlegleft;
    private final AdvancedModelRenderer lowerlegleft;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer legwing2;
    private final AdvancedModelRenderer legwing3;
    private final AdvancedModelRenderer upperlegright;
    private final AdvancedModelRenderer lowerlegright;
    private final AdvancedModelRenderer footright;
    private final AdvancedModelRenderer legwing4;
    private final AdvancedModelRenderer legwing5;
    private final AdvancedModelRenderer wingleft1;
    private final AdvancedModelRenderer wingleft2;
    private final AdvancedModelRenderer wingleft3;
    private final AdvancedModelRenderer wingleft3Membrane;
    private final AdvancedModelRenderer wingleft4;
    private final AdvancedModelRenderer wingleft4Membrane;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer wingright1;
    private final AdvancedModelRenderer wingright2;
    private final AdvancedModelRenderer wingright3;
    private final AdvancedModelRenderer wingright3Membrane;
    private final AdvancedModelRenderer wingright4;
    private final AdvancedModelRenderer wingright4Membrane;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head2;
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer bb_main;

    private ModelAnimator animator;

    public ModelDimorphodon() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -11.5F, -4.7F);
        this.root.addChild(chest);
        this.setRotateAngle(chest, -0.2618F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 28, 32, -3.0F, -2.0F, -1.5F, 6, 7, 7, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.chest.addChild(body1);
        this.setRotateAngle(body1, -0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 42, 0, -2.5F, -2.0F, 1.0F, 5, 6, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 6.1F);
        this.body1.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 15, 61, -1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1F, 3.6F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 49, 50, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.4F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 40, -0.5F, -0.5F, -1.0F, 1, 1, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.7F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 26, -0.5F, -0.5F, 0.0F, 1, 1, 7, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.1F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 38, 47, -0.5F, -0.4215F, -0.2017F, 1, 1, 7, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 45, 65, 0.0F, -1.4215F, 4.9483F, 0, 3, 4, 0.0F, false));

        this.upperlegleft = new AdvancedModelRenderer(this);
        this.upperlegleft.setRotationPoint(2.0F, 0.55F, 4.9F);
        this.body1.addChild(upperlegleft);
        this.setRotateAngle(upperlegleft, -0.3054F, 0.0F, -0.48F);
        this.upperlegleft.cubeList.add(new ModelBox(upperlegleft, 0, 67, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.lowerlegleft = new AdvancedModelRenderer(this);
        this.lowerlegleft.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.upperlegleft.addChild(lowerlegleft);
        this.setRotateAngle(lowerlegleft, 1.309F, 0.0F, 0.5236F);
        this.lowerlegleft.cubeList.add(new ModelBox(lowerlegleft, 9, 67, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, false));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegleft.addChild(footleft);
        this.setRotateAngle(footleft, -0.7332F, -0.4066F, 0.3856F);
        this.footleft.cubeList.add(new ModelBox(footleft, 59, 0, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

        this.legwing2 = new AdvancedModelRenderer(this);
        this.legwing2.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.lowerlegleft.addChild(legwing2);
        this.setRotateAngle(legwing2, -0.0873F, 0.0F, 0.0F);
        this.legwing2.cubeList.add(new ModelBox(legwing2, 38, 65, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, false));

        this.legwing3 = new AdvancedModelRenderer(this);
        this.legwing3.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.upperlegleft.addChild(legwing3);
        this.legwing3.cubeList.add(new ModelBox(legwing3, 0, 24, -0.5F, 0.0F, -0.25F, 1, 4, 3, -0.01F, false));

        this.upperlegright = new AdvancedModelRenderer(this);
        this.upperlegright.setRotationPoint(-2.0F, 0.55F, 4.9F);
        this.body1.addChild(upperlegright);
        this.setRotateAngle(upperlegright, -0.3054F, 0.0F, 0.48F);
        this.upperlegright.cubeList.add(new ModelBox(upperlegright, 0, 67, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.lowerlegright = new AdvancedModelRenderer(this);
        this.lowerlegright.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.upperlegright.addChild(lowerlegright);
        this.setRotateAngle(lowerlegright, 1.309F, 0.0F, -0.5236F);
        this.lowerlegright.cubeList.add(new ModelBox(lowerlegright, 9, 67, -0.5F, -0.2F, -0.5F, 1, 7, 1, 0.0F, true));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(0.0F, 6.6F, -0.3F);
        this.lowerlegright.addChild(footright);
        this.setRotateAngle(footright, -0.7332F, 0.4066F, -0.3856F);
        this.footright.cubeList.add(new ModelBox(footright, 59, 0, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, true));

        this.legwing4 = new AdvancedModelRenderer(this);
        this.legwing4.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.lowerlegright.addChild(legwing4);
        this.setRotateAngle(legwing4, -0.0873F, 0.0F, 0.0F);
        this.legwing4.cubeList.add(new ModelBox(legwing4, 38, 65, 0.0F, 0.0F, 0.0F, 0, 6, 3, 0.001F, true));

        this.legwing5 = new AdvancedModelRenderer(this);
        this.legwing5.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.upperlegright.addChild(legwing5);
        this.legwing5.cubeList.add(new ModelBox(legwing5, 0, 24, -0.5F, 0.0F, -0.25F, 1, 4, 3, -0.01F, true));

        this.wingleft1 = new AdvancedModelRenderer(this);
        this.wingleft1.setRotationPoint(2.85F, 0.8F, -0.1F);
        this.chest.addChild(wingleft1);
        this.setRotateAngle(wingleft1, -0.0436F, 0.1309F, -0.0436F);
        this.wingleft1.cubeList.add(new ModelBox(wingleft1, 0, 26, -1.5F, -1.0F, -1.0F, 7, 2, 10, 0.0F, false));

        this.wingleft2 = new AdvancedModelRenderer(this);
        this.wingleft2.setRotationPoint(4.7F, 0.1F, -0.7F);
        this.wingleft1.addChild(wingleft2);
        this.setRotateAngle(wingleft2, 0.2618F, 0.0F, -0.0436F);
        this.wingleft2.cubeList.add(new ModelBox(wingleft2, 0, 39, -0.5F, 0.0F, 0.0F, 1, 11, 8, 0.0F, false));

        this.wingleft3 = new AdvancedModelRenderer(this);
        this.wingleft3.setRotationPoint(0.1F, 11.0F, 0.3F);
        this.wingleft2.addChild(wingleft3);
        this.setRotateAngle(wingleft3, 0.043F, 0.0438F, 0.0816F);
        this.wingleft3.cubeList.add(new ModelBox(wingleft3, 42, 13, -0.5F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

        this.wingleft3Membrane = new AdvancedModelRenderer(this);
        this.wingleft3Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingleft3.addChild(wingleft3Membrane);
        this.wingleft3Membrane.cubeList.add(new ModelBox(wingleft3Membrane, 19, 47, -0.5F, -7.0F, 0.0F, 1, 5, 8, 0.0F, false));

        this.wingleft4 = new AdvancedModelRenderer(this);
        this.wingleft4.setRotationPoint(-0.1F, 0.0F, 7.95F);
        this.wingleft3.addChild(wingleft4);
        this.setRotateAngle(wingleft4, 1.2654F, 0.0F, 0.0F);
        this.wingleft4.cubeList.add(new ModelBox(wingleft4, 21, 6, -0.5F, -1.0F, 0.0F, 1, 1, 18, 0.0F, false));

        this.wingleft4Membrane = new AdvancedModelRenderer(this);
        this.wingleft4Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingleft4.addChild(wingleft4Membrane);
        this.wingleft4Membrane.cubeList.add(new ModelBox(wingleft4Membrane, 0, 0, -0.5F, -6.0F, 0.0F, 1, 5, 18, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 25.0F);
        this.wingleft4.addChild(bone);


        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.wingleft3.addChild(handleft);
        this.setRotateAngle(handleft, 0.0F, 0.6109F, 0.0436F);
        this.handleft.cubeList.add(new ModelBox(handleft, 64, 56, -1.5F, -0.5F, 0.2F, 3, 1, 3, -0.01F, false));

        this.wingright1 = new AdvancedModelRenderer(this);
        this.wingright1.setRotationPoint(-2.85F, 0.8F, -0.1F);
        this.chest.addChild(wingright1);
        this.setRotateAngle(wingright1, -0.0436F, -0.1309F, 0.0436F);
        this.wingright1.cubeList.add(new ModelBox(wingright1, 0, 26, -5.5F, -1.0F, -1.0F, 7, 2, 10, 0.0F, true));

        this.wingright2 = new AdvancedModelRenderer(this);
        this.wingright2.setRotationPoint(-4.7F, 0.1F, -0.7F);
        this.wingright1.addChild(wingright2);
        this.setRotateAngle(wingright2, 0.2618F, 0.0F, 0.0436F);
        this.wingright2.cubeList.add(new ModelBox(wingright2, 0, 39, -0.5F, 0.0F, 0.0F, 1, 11, 8, 0.0F, true));

        this.wingright3 = new AdvancedModelRenderer(this);
        this.wingright3.setRotationPoint(-0.1F, 11.0F, 0.3F);
        this.wingright2.addChild(wingright3);
        this.setRotateAngle(wingright3, 0.043F, -0.0438F, -0.0816F);
        this.wingright3.cubeList.add(new ModelBox(wingright3, 42, 13, -0.5F, -2.0F, 0.0F, 1, 2, 8, 0.0F, true));

        this.wingright3Membrane = new AdvancedModelRenderer(this);
        this.wingright3Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingright3.addChild(wingright3Membrane);
        this.wingright3Membrane.cubeList.add(new ModelBox(wingright3Membrane, 19, 47, -0.5F, -7.0F, 0.0F, 1, 5, 8, 0.0F, true));

        this.wingright4 = new AdvancedModelRenderer(this);
        this.wingright4.setRotationPoint(0.1F, 0.0F, 7.95F);
        this.wingright3.addChild(wingright4);
        this.setRotateAngle(wingright4, 1.2654F, 0.0F, 0.0F);
        this.wingright4.cubeList.add(new ModelBox(wingright4, 21, 6, -0.5F, -1.0F, 0.0F, 1, 1, 18, 0.0F, true));

        this.wingright4Membrane = new AdvancedModelRenderer(this);
        this.wingright4Membrane.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.wingright4.addChild(wingright4Membrane);
        this.wingright4Membrane.cubeList.add(new ModelBox(wingright4Membrane, 0, 0, -0.5F, -6.0F, 0.0F, 1, 5, 18, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 25.0F);
        this.wingright4.addChild(bone2);


        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(0.4F, -0.4F, 2.0F);
        this.wingright3.addChild(handright);
        this.setRotateAngle(handright, 0.0F, -0.6109F, -0.0436F);
        this.handright.cubeList.add(new ModelBox(handright, 64, 56, -2.9745F, -0.5174F, -1.2091F, 3, 1, 3, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.5F, -1.3F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0436F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 58, 23, -2.0F, -2.0F, -2.25F, 4, 6, 3, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 58, 23, -2.0F, -2.0F, -1.25F, 4, 6, 3, -0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 56, -1.5F, -1.1F, -2.9F, 3, 4, 4, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.8F, 1.15F);
        this.neck2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.288F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 59, -1.5F, -3.087F, -3.1F, 3, 3, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 15.0F, 12.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 0, -2.0F, -14.55F, -14.55F, 4, 1, 4, -0.002F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 53, 13, -2.0F, -17.25F, -14.55F, 4, 3, 4, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 2.0F, -4.75F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.492F, -5.394F);
        this.head2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.8814F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 4, -0.5F, -0.0114F, -0.6604F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.1F, -2.2F);
        this.head2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1484F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 49, -0.5F, -0.0538F, 0.0756F, 1, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.1F, -2.2F);
        this.head2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5411F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 61, -0.5F, -0.0538F, -3.9244F, 1, 1, 4, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0254F, -0.1659F, 0.6151F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.25F, 1.85F, -9.3F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0262F, -0.1658F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.5F, 2.35F, -5.5F, 0, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0326F, -0.1647F, 0.6594F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 9, -0.1F, 1.6F, -7.9F, 0, 2, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0262F, -0.1222F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 0, -0.0393F, -0.0309F, -0.0855F, 1, 1, 7, -0.018F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1571F, -0.1222F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 9, -0.0393F, -0.0437F, -0.0843F, 1, 1, 7, -0.015F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.288F, -0.1222F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 9, -0.0393F, -0.0563F, -0.0814F, 1, 1, 7, -0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0254F, 0.1659F, -0.6151F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.25F, 1.85F, -9.3F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0326F, 0.1647F, -0.6594F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 9, 0.1F, 1.6F, -7.9F, 0, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0262F, 0.1658F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 1.5F, 2.35F, -5.5F, 0, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.9F, 0.8F, 1.3F);
        this.head2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2967F, -0.192F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 10, 0, 0.0775F, 0.4019F, -5.6977F, 1, 1, 2, 0.0022F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.9F, 0.8F, 1.3F);
        this.head2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0262F, -0.192F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 63, 0.0775F, -0.8534F, -3.9334F, 1, 1, 4, 0.002F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.9F, 0.8F, 1.3F);
        this.head2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0262F, 0.192F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 63, -1.0775F, -0.8534F, -3.9334F, 1, 1, 4, 0.002F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.9F, 0.8F, 1.3F);
        this.head2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2967F, 0.192F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 0, -1.0775F, 0.4019F, -5.6977F, 1, 1, 2, 0.0022F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1571F, 0.1222F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 9, -0.9607F, -0.0437F, -0.0843F, 1, 1, 7, -0.015F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0262F, 0.1222F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 0, -0.9607F, -0.0309F, -0.0855F, 1, 1, 7, -0.018F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.7F, -4.7F);
        this.head2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.288F, 0.1222F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 9, -0.9607F, -0.0563F, -0.0814F, 1, 1, 7, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -2.0F, 4.0F);
        this.head2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0262F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 42, 26, -0.5F, 1.8F, -5.7F, 2, 1, 4, 0.002F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 59, 0.0F, 1.1F, -8.7F, 1, 1, 6, 0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.05F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 26, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 59, 36, -1.5F, -2.0F, -2.7F, 3, 3, 3, 0.014F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 30, 47, -0.5F, 0.0F, -6.0F, 1, 1, 5, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 65, 6, -1.0F, 0.0F, -1.5F, 2, 1, 3, 0.012F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.7287F, 0.0364F, -4.5791F);
        this.jaw2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, -0.1396F, -0.6894F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 9, 0.0F, -1.3F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.8727F, -0.1396F, -0.9163F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 12, 0.0F, -0.5F, -0.25F, 0, 2, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1396F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 9, 59, 0.05F, -0.15F, 2.5F, 0, 1, 4, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.2094F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.014F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.7287F, 0.0364F, -4.5791F);
        this.jaw2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.1396F, 0.6894F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 9, 0.0F, -1.3F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.8727F, 0.1396F, 0.9163F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 12, 0.0F, -0.5F, -0.25F, 0, 2, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.1396F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 9, 59, -0.05F, -0.15F, 2.5F, 0, 1, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.5F, 0.0F, -6.0F);
        this.jaw2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.2094F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.013F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.jaw2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.4363F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 5, -0.5F, 2.4F, -5.25F, 1, 0, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.9F, -3.0F);
        this.jaw2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 32, -1.0F, -1.9F, 3.9F, 2, 1, 2, -0.003F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 32, -1.0F, -1.9F, 2.9F, 2, 1, 2, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 11, 39, -1.0F, -0.9F, -0.1F, 2, 1, 6, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 1.6F, -5.1F);
        this.jaw2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1571F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 9, -0.5F, -1.1F, -0.4F, 1, 1, 2, 0.0F, false));

        this.bb_main = new AdvancedModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -23.0F, -53.0F, -17.0F, 46, 62, 2, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
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

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraDimorphodon ee = (EntityPrehistoricFloraDimorphodon) e;

        this.faceTarget(f3, f4, 9, neck1);
        this.faceTarget(f3, f4, 9, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainSwing(Tail, 0.15F, 0.02F, 0.4, f2, 0.4F);
            this.chainWave(Tail, 0.30F, -0.01F, 0.4F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDimorphodon ee = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //Set to flight pose:
                    this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);
                    this.setRotateAngle(body1, -0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
                    this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
                    this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(upperlegleft, 0.303F, -0.2572F, -1.5943F);
                    this.setRotateAngle(lowerlegleft, 0.5551F, 0.0992F, 0.2809F);
                    this.setRotateAngle(footleft, 0.8294F, -0.5675F, 0.6802F);
                    this.setRotateAngle(legwing2, -0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(upperlegright, 0.303F, 0.2572F, 1.5943F);
                    this.setRotateAngle(lowerlegright, 0.5551F, -0.0992F, -0.2809F);
                    this.setRotateAngle(footright, 0.8294F, 0.5675F, -0.6802F);
                    this.setRotateAngle(legwing4, -0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(wingleft1, -0.0604F, 0.1241F, -0.1754F);
                    this.setRotateAngle(wingleft2, -0.1083F, -0.001F, -1.5301F);
                    this.setRotateAngle(wingleft3, -1.3171F, -0.0756F, 0.1933F);
                    this.setRotateAngle(wingleft4, 0.1745F, 0.0F, 0.0F);
                    this.setRotateAngle(handleft, -0.0071F, 0.0125F, 1.4716F);
                    this.setRotateAngle(wingright1, -0.0604F, -0.1241F, 0.1754F);
                    this.setRotateAngle(wingright2, -0.1083F, 0.001F, 1.5301F);
                    this.setRotateAngle(wingright3, -1.3171F, 0.0756F, -0.1933F);
                    this.setRotateAngle(wingright4, 0.1745F, 0.0F, 0.0F);
                    this.setRotateAngle(handright, -0.0071F, -0.0125F, -1.4716F);
                    this.setRotateAngle(neck1, -0.0436F, 0.0F, 0.0F);
                    this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r1, 0.288F, 0.0F, 0.0F);
                    this.setRotateAngle(head, 0.5672F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(head2, 0.1309F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r3, 0.8814F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r4, 0.1484F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r5, 0.5411F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r6, -0.0254F, -0.1659F, 0.6151F);
                    this.setRotateAngle(cube_r7, 0.0262F, -0.1658F, 0.0F);
                    this.setRotateAngle(cube_r8, -0.0326F, -0.1647F, 0.6594F);
                    this.setRotateAngle(cube_r9, 0.0262F, -0.1222F, 0.0F);
                    this.setRotateAngle(cube_r10, 0.1571F, -0.1222F, 0.0F);
                    this.setRotateAngle(cube_r11, 0.288F, -0.1222F, 0.0F);
                    this.setRotateAngle(cube_r12, -0.0254F, 0.1659F, -0.6151F);
                    this.setRotateAngle(cube_r13, -0.0326F, 0.1647F, -0.6594F);
                    this.setRotateAngle(cube_r14, 0.0262F, 0.1658F, 0.0F);
                    this.setRotateAngle(cube_r15, -0.2967F, -0.192F, 0.0F);
                    this.setRotateAngle(cube_r16, 0.0262F, -0.192F, 0.0F);
                    this.setRotateAngle(cube_r17, 0.0262F, 0.192F, 0.0F);
                    this.setRotateAngle(cube_r18, -0.2967F, 0.192F, 0.0F);
                    this.setRotateAngle(cube_r19, 0.1571F, 0.1222F, 0.0F);
                    this.setRotateAngle(cube_r20, 0.0262F, 0.1222F, 0.0F);
                    this.setRotateAngle(cube_r21, 0.288F, 0.1222F, 0.0F);
                    this.setRotateAngle(cube_r22, 0.0262F, 0.0F, 0.0F);
                    this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r23, 0.0873F, -0.1396F, -0.6894F);
                    this.setRotateAngle(cube_r24, 0.8727F, -0.1396F, -0.9163F);
                    this.setRotateAngle(cube_r25, 0.0F, -0.1396F, 0.0F);
                    this.setRotateAngle(cube_r26, 0.0F, -0.2094F, 0.0F);
                    this.setRotateAngle(cube_r27, 0.0873F, 0.1396F, 0.6894F);
                    this.setRotateAngle(cube_r28, 0.8727F, 0.1396F, 0.9163F);
                    this.setRotateAngle(cube_r29, 0.0F, 0.1396F, 0.0F);
                    this.setRotateAngle(cube_r30, 0.0F, 0.2094F, 0.0F);
                    this.setRotateAngle(cube_r31, -0.4363F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r32, -0.3054F, 0.0F, 0.0F);
                    this.setRotateAngle(cube_r33, 0.1571F, 0.0F, 0.0F);

                    if (ee.getIsLaunching()) {
                        animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 16) / 7) * (5-(-10)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 23) / 7) * (-10-(5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 11) / 12) * (-6-(-10)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -6 + (((tickAnim - 23) / 6) * (-15-(-6)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 29) / 11) * (0-(-15)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (-20-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -20 + (((tickAnim - 20) / 20) * (0-(-20)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 5) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 10 + (((tickAnim - 9) / 7) * (8-(10)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 16) / 4) * (20-(8)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 20) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (20-(0)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 20 + (((tickAnim - 24) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (20-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 20 + (((tickAnim - 28) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

        int animCycle = 34;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        if (!isMoving) {
            tickAnim = 0;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-58) + (float) Math.toRadians(90), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 15.7 + (((tickAnim - 0) / 5) * (15.7-(15.7)));
            zz = -15.7 + (((tickAnim - 0) / 5) * (-15.1-(-15.7)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 15.7 + (((tickAnim - 5) / 10) * (15.7-(15.7)));
            zz = -15.1 + (((tickAnim - 5) / 10) * (-15.7-(-15.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 15.7 + (((tickAnim - 15) / 10) * (15.7-(15.7)));
            zz = -15.7 + (((tickAnim - 15) / 10) * (-15.1-(-15.7)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 15.7 + (((tickAnim - 25) / 9) * (15.7-(15.7)));
            zz = -15.1 + (((tickAnim - 25) / 9) * (-15.7-(-15.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.3862 + (((tickAnim - 0) / 5) * (-0.23291-(-0.3862)));
            yy = 4.65387 + (((tickAnim - 0) / 5) * (-1.60883-(4.65387)));
            zz = -5.10513 + (((tickAnim - 0) / 5) * (6.11037-(-5.10513)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -0.23291 + (((tickAnim - 5) / 10) * (-0.3862-(-0.23291)));
            yy = -1.60883 + (((tickAnim - 5) / 10) * (-4.65387-(-1.60883)));
            zz = 6.11037 + (((tickAnim - 5) / 10) * (5.10513-(6.11037)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -0.3862 + (((tickAnim - 15) / 10) * (-0.23291-(-0.3862)));
            yy = -4.65387 + (((tickAnim - 15) / 10) * (1.60883-(-4.65387)));
            zz = 5.10513 + (((tickAnim - 15) / 10) * (-6.11037-(5.10513)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -0.23291 + (((tickAnim - 25) / 9) * (-0.3862-(-0.23291)));
            yy = 1.60883 + (((tickAnim - 25) / 9) * (4.65387-(1.60883)));
            zz = -6.11037 + (((tickAnim - 25) / 9) * (-5.10513-(-6.11037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.84805-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.52992-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 0.84805 + (((tickAnim - 5) / 10) * (0-(0.84805)));
            zz = 0.52992 + (((tickAnim - 5) / 10) * (0-(0.52992)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0.84805-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0.52992-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            yy = 0.84805 + (((tickAnim - 25) / 9) * (0-(0.84805)));
            zz = 0.52992 + (((tickAnim - 25) / 9) * (0-(0.52992)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -25.59592 + (((tickAnim - 0) / 6) * (-24.18354-(-25.59592)));
            yy = 22.09888 + (((tickAnim - 0) / 6) * (16.92407-(22.09888)));
            zz = -26.30407 + (((tickAnim - 0) / 6) * (-26.24769-(-26.30407)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -24.18354 + (((tickAnim - 6) / 7) * (-16.6213-(-24.18354)));
            yy = 16.92407 + (((tickAnim - 6) / 7) * (11.34163-(16.92407)));
            zz = -26.24769 + (((tickAnim - 6) / 7) * (-25.36516-(-26.24769)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -16.6213 + (((tickAnim - 13) / 7) * (-4.12792-(-16.6213)));
            yy = 11.34163 + (((tickAnim - 13) / 7) * (8.22805-(11.34163)));
            zz = -25.36516 + (((tickAnim - 13) / 7) * (-9.91402-(-25.36516)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -4.12792 + (((tickAnim - 20) / 2) * (-5.34132-(-4.12792)));
            yy = 8.22805 + (((tickAnim - 20) / 2) * (1.63749-(8.22805)));
            zz = -9.91402 + (((tickAnim - 20) / 2) * (-27.96428-(-9.91402)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -5.34132 + (((tickAnim - 22) / 1) * (-3.15761-(-5.34132)));
            yy = 1.63749 + (((tickAnim - 22) / 1) * (-10.6747-(1.63749)));
            zz = -27.96428 + (((tickAnim - 22) / 1) * (-26.88773-(-27.96428)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -3.15761 + (((tickAnim - 23) / 1) * (-2.52239-(-3.15761)));
            yy = -10.6747 + (((tickAnim - 23) / 1) * (-11.60772-(-10.6747)));
            zz = -26.88773 + (((tickAnim - 23) / 1) * (-36.86441-(-26.88773)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -2.52239 + (((tickAnim - 24) / 2) * (-2.85944-(-2.52239)));
            yy = -11.60772 + (((tickAnim - 24) / 2) * (13.29306-(-11.60772)));
            zz = -36.86441 + (((tickAnim - 24) / 2) * (-39.13253-(-36.86441)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -2.85944 + (((tickAnim - 26) / 2) * (-0.36741-(-2.85944)));
            yy = 13.29306 + (((tickAnim - 26) / 2) * (25.21474-(13.29306)));
            zz = -39.13253 + (((tickAnim - 26) / 2) * (0.19216-(-39.13253)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -0.36741 + (((tickAnim - 28) / 6) * (-25.59592-(-0.36741)));
            yy = 25.21474 + (((tickAnim - 28) / 6) * (22.09888-(25.21474)));
            zz = 0.19216 + (((tickAnim - 28) / 6) * (-26.30407-(0.19216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -23.10891 + (((tickAnim - 0) / 6) * (-22.7385-(-23.10891)));
            yy = 3.67037 + (((tickAnim - 0) / 6) * (4.51138-(3.67037)));
            zz = -35.9086 + (((tickAnim - 0) / 6) * (-31.34777-(-35.9086)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -22.7385 + (((tickAnim - 6) / 7) * (-28.37512-(-22.7385)));
            yy = 4.51138 + (((tickAnim - 6) / 7) * (5.48705-(4.51138)));
            zz = -31.34777 + (((tickAnim - 6) / 7) * (-34.5292-(-31.34777)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -28.37512 + (((tickAnim - 13) / 7) * (-33.67532-(-28.37512)));
            yy = 5.48705 + (((tickAnim - 13) / 7) * (3.56158-(5.48705)));
            zz = -34.5292 + (((tickAnim - 13) / 7) * (-48.58582-(-34.5292)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -33.67532 + (((tickAnim - 20) / 2) * (-28.53732-(-33.67532)));
            yy = 3.56158 + (((tickAnim - 20) / 2) * (11.71392-(3.56158)));
            zz = -48.58582 + (((tickAnim - 20) / 2) * (-18.74026-(-48.58582)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -28.53732 + (((tickAnim - 22) / 1) * (-27.72941-(-28.53732)));
            yy = 11.71392 + (((tickAnim - 22) / 1) * (14.22376-(11.71392)));
            zz = -18.74026 + (((tickAnim - 22) / 1) * (-11.59468-(-18.74026)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -27.72941 + (((tickAnim - 23) / 1) * (-31.91049-(-27.72941)));
            yy = 14.22376 + (((tickAnim - 23) / 1) * (8.79183-(14.22376)));
            zz = -11.59468 + (((tickAnim - 23) / 1) * (-32.30944-(-11.59468)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -31.91049 + (((tickAnim - 24) / 2) * (-44.15405-(-31.91049)));
            yy = 8.79183 + (((tickAnim - 24) / 2) * (-0.34878-(8.79183)));
            zz = -32.30944 + (((tickAnim - 24) / 2) * (-49.02995-(-32.30944)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -44.15405 + (((tickAnim - 26) / 2) * (-31.19265-(-44.15405)));
            yy = -0.34878 + (((tickAnim - 26) / 2) * (-6.79838-(-0.34878)));
            zz = -49.02995 + (((tickAnim - 26) / 2) * (-63.34129-(-49.02995)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -31.19265 + (((tickAnim - 28) / 6) * (-23.10891-(-31.19265)));
            yy = -6.79838 + (((tickAnim - 28) / 6) * (3.67037-(-6.79838)));
            zz = -63.34129 + (((tickAnim - 28) / 6) * (-35.9086-(-63.34129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(xx), wingleft2.rotateAngleY + (float) Math.toRadians(yy), wingleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 6) / 7) * (10-(5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 13) / 7) * (11-(10)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11 + (((tickAnim - 20) / 3) * (-2-(11)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -2 + (((tickAnim - 23) / 4) * (-48-(-2)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -48 + (((tickAnim - 27) / 7) * (0-(-48)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(xx), wingleft4.rotateAngleY + (float) Math.toRadians(yy), wingleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -1.76701 + (((tickAnim - 0) / 6) * (1.35771-(-1.76701)));
            yy = -19.46535 + (((tickAnim - 0) / 6) * (-14.84307-(-19.46535)));
            zz = 50.14106 + (((tickAnim - 0) / 6) * (56.40464-(50.14106)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.35771 + (((tickAnim - 6) / 7) * (-4.99009-(1.35771)));
            yy = -14.84307 + (((tickAnim - 6) / 7) * (-5.80282-(-14.84307)));
            zz = 56.40464 + (((tickAnim - 6) / 7) * (48.61875-(56.40464)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -4.99009 + (((tickAnim - 13) / 7) * (-6.30409-(-4.99009)));
            yy = -5.80282 + (((tickAnim - 13) / 7) * (-10.55669-(-5.80282)));
            zz = 48.61875 + (((tickAnim - 13) / 7) * (51.72972-(48.61875)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -6.30409 + (((tickAnim - 20) / 3) * (-13.52959-(-6.30409)));
            yy = -10.55669 + (((tickAnim - 20) / 3) * (-1.17407-(-10.55669)));
            zz = 51.72972 + (((tickAnim - 20) / 3) * (21.661-(51.72972)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -13.52959 + (((tickAnim - 23) / 1) * (27.63186-(-13.52959)));
            yy = -1.17407 + (((tickAnim - 23) / 1) * (-35.38896-(-1.17407)));
            zz = 21.661 + (((tickAnim - 23) / 1) * (116.9378-(21.661)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 27.63186 + (((tickAnim - 24) / 2) * (-9.76691-(27.63186)));
            yy = -35.38896 + (((tickAnim - 24) / 2) * (-24.98819-(-35.38896)));
            zz = 116.9378 + (((tickAnim - 24) / 2) * (59.52768-(116.9378)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -9.76691 + (((tickAnim - 26) / 2) * (-2.76468-(-9.76691)));
            yy = -24.98819 + (((tickAnim - 26) / 2) * (-24.86846-(-24.98819)));
            zz = 59.52768 + (((tickAnim - 26) / 2) * (59.41065-(59.52768)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -2.76468 + (((tickAnim - 28) / 6) * (-1.76701-(-2.76468)));
            yy = -24.86846 + (((tickAnim - 28) / 6) * (-19.46535-(-24.86846)));
            zz = 59.41065 + (((tickAnim - 28) / 6) * (50.14106-(59.41065)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.53715 + (((tickAnim - 0) / 3) * (-3.15761-(-7.53715)));
            yy = -6.33533 + (((tickAnim - 0) / 3) * (10.6747-(-6.33533)));
            zz = 23.2184 + (((tickAnim - 0) / 3) * (26.88773-(23.2184)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -3.15761 + (((tickAnim - 3) / 1) * (-2.52239-(-3.15761)));
            yy = 10.6747 + (((tickAnim - 3) / 1) * (11.60772-(10.6747)));
            zz = 26.88773 + (((tickAnim - 3) / 1) * (36.86441-(26.88773)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -2.52239 + (((tickAnim - 4) / 2) * (-2.85944-(-2.52239)));
            yy = 11.60772 + (((tickAnim - 4) / 2) * (-13.29306-(11.60772)));
            zz = 36.86441 + (((tickAnim - 4) / 2) * (39.13253-(36.86441)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.85944 + (((tickAnim - 6) / 2) * (-7.24717-(-2.85944)));
            yy = -13.29306 + (((tickAnim - 6) / 2) * (-35.58761-(-13.29306)));
            zz = 39.13253 + (((tickAnim - 6) / 2) * (11.30291-(39.13253)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.24717 + (((tickAnim - 8) / 2) * (-30.32906-(-7.24717)));
            yy = -35.58761 + (((tickAnim - 8) / 2) * (-26.15041-(-35.58761)));
            zz = 11.30291 + (((tickAnim - 8) / 2) * (29.12744-(11.30291)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -30.32906 + (((tickAnim - 10) / 9) * (-18.08867-(-30.32906)));
            yy = -26.15041 + (((tickAnim - 10) / 9) * (-16.90003-(-26.15041)));
            zz = 29.12744 + (((tickAnim - 10) / 9) * (18.42119-(29.12744)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -18.08867 + (((tickAnim - 19) / 4) * (-10.63449-(-18.08867)));
            yy = -16.90003 + (((tickAnim - 19) / 4) * (-7.123-(-16.90003)));
            zz = 18.42119 + (((tickAnim - 19) / 4) * (14.82754-(18.42119)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -10.63449 + (((tickAnim - 23) / 3) * (-8.81836-(-10.63449)));
            yy = -7.123 + (((tickAnim - 23) / 3) * (-5.19344-(-7.123)));
            zz = 14.82754 + (((tickAnim - 23) / 3) * (20.82191-(14.82754)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -8.81836 + (((tickAnim - 26) / 8) * (-7.53715-(-8.81836)));
            yy = -5.19344 + (((tickAnim - 26) / 8) * (-6.33533-(-5.19344)));
            zz = 20.82191 + (((tickAnim - 26) / 8) * (23.2184-(20.82191)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.58628 + (((tickAnim - 0) / 3) * (-27.72941-(-32.58628)));
            yy = -7.30838 + (((tickAnim - 0) / 3) * (-14.22376-(-7.30838)));
            zz = 37.132 + (((tickAnim - 0) / 3) * (11.59468-(37.132)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.72941 + (((tickAnim - 3) / 1) * (-31.91049-(-27.72941)));
            yy = -14.22376 + (((tickAnim - 3) / 1) * (-8.79183-(-14.22376)));
            zz = 11.59468 + (((tickAnim - 3) / 1) * (32.30944-(11.59468)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -31.91049 + (((tickAnim - 4) / 2) * (-44.15405-(-31.91049)));
            yy = -8.79183 + (((tickAnim - 4) / 2) * (0.34878-(-8.79183)));
            zz = 32.30944 + (((tickAnim - 4) / 2) * (49.02995-(32.30944)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -44.15405 + (((tickAnim - 6) / 2) * (-29.29689-(-44.15405)));
            yy = 0.34878 + (((tickAnim - 6) / 2) * (5.26029-(0.34878)));
            zz = 49.02995 + (((tickAnim - 6) / 2) * (57.06484-(49.02995)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -29.29689 + (((tickAnim - 8) / 2) * (-20.81299-(-29.29689)));
            yy = 5.26029 + (((tickAnim - 8) / 2) * (2.14658-(5.26029)));
            zz = 57.06484 + (((tickAnim - 8) / 2) * (38.20535-(57.06484)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -20.81299 + (((tickAnim - 10) / 9) * (-27.51426-(-20.81299)));
            yy = 2.14658 + (((tickAnim - 10) / 9) * (-1.27743-(2.14658)));
            zz = 38.20535 + (((tickAnim - 10) / 9) * (41.69006-(38.20535)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -27.51426 + (((tickAnim - 19) / 4) * (-37.68386-(-27.51426)));
            yy = -1.27743 + (((tickAnim - 19) / 4) * (-1.2645-(-1.27743)));
            zz = 41.69006 + (((tickAnim - 19) / 4) * (43.90816-(41.69006)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -37.68386 + (((tickAnim - 23) / 3) * (-34.56172-(-37.68386)));
            yy = -1.2645 + (((tickAnim - 23) / 3) * (-6.05759-(-1.2645)));
            zz = 43.90816 + (((tickAnim - 23) / 3) * (38.88725-(43.90816)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -34.56172 + (((tickAnim - 26) / 8) * (-32.58628-(-34.56172)));
            yy = -6.05759 + (((tickAnim - 26) / 8) * (-7.30838-(-6.05759)));
            zz = 38.88725 + (((tickAnim - 26) / 8) * (37.132-(38.88725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3 + (((tickAnim - 0) / 6) * (-47-(3)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -47 + (((tickAnim - 6) / 5) * (-40-(-47)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -40 + (((tickAnim - 11) / 6) * (2-(-40)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 2 + (((tickAnim - 17) / 6) * (10-(2)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 10 + (((tickAnim - 23) / 8) * (3-(10)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(xx), wingright4.rotateAngleY + (float) Math.toRadians(yy), wingright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.53474 + (((tickAnim - 0) / 3) * (-13.52959-(-7.53474)));
            yy = -5.32918 + (((tickAnim - 0) / 3) * (1.17407-(-5.32918)));
            zz = -49.45436 + (((tickAnim - 0) / 3) * (-21.661-(-49.45436)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -13.52959 + (((tickAnim - 3) / 1) * (27.63186-(-13.52959)));
            yy = 1.17407 + (((tickAnim - 3) / 1) * (35.38896-(1.17407)));
            zz = -21.661 + (((tickAnim - 3) / 1) * (-116.9378-(-21.661)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 27.63186 + (((tickAnim - 4) / 2) * (-9.76691-(27.63186)));
            yy = 35.38896 + (((tickAnim - 4) / 2) * (24.98819-(35.38896)));
            zz = -116.9378 + (((tickAnim - 4) / 2) * (-59.52768-(-116.9378)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -9.76691 + (((tickAnim - 6) / 4) * (-0.62197-(-9.76691)));
            yy = 24.98819 + (((tickAnim - 6) / 4) * (26.73893-(24.98819)));
            zz = -59.52768 + (((tickAnim - 6) / 4) * (-54.62306-(-59.52768)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -0.62197 + (((tickAnim - 10) / 9) * (1.39974-(-0.62197)));
            yy = 26.73893 + (((tickAnim - 10) / 9) * (9.98429-(26.73893)));
            zz = -54.62306 + (((tickAnim - 10) / 9) * (-55.99907-(-54.62306)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 1.39974 + (((tickAnim - 19) / 4) * (2.3187-(1.39974)));
            yy = 9.98429 + (((tickAnim - 19) / 4) * (2.36854-(9.98429)));
            zz = -55.99907 + (((tickAnim - 19) / 4) * (-51.62453-(-55.99907)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 2.3187 + (((tickAnim - 23) / 3) * (-5.85737-(2.3187)));
            yy = 2.36854 + (((tickAnim - 23) / 3) * (-2.00285-(2.36854)));
            zz = -51.62453 + (((tickAnim - 23) / 3) * (-48.5723-(-51.62453)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -5.85737 + (((tickAnim - 26) / 8) * (-7.53474-(-5.85737)));
            yy = -2.00285 + (((tickAnim - 26) / 8) * (-5.32918-(-2.00285)));
            zz = -48.5723 + (((tickAnim - 26) / 8) * (-49.45436-(-48.5723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = -8 + (((tickAnim - 0) / 5) * (2.86-(-8)));
            zz = 0 + (((tickAnim - 0) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 5) / 10) * (0-(-5)));
            yy = 2.86 + (((tickAnim - 5) / 10) * (8-(2.86)));
            zz = -7 + (((tickAnim - 5) / 10) * (0-(-7)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (-5-(0)));
            yy = 8 + (((tickAnim - 15) / 10) * (-3.86-(8)));
            zz = 0 + (((tickAnim - 15) / 10) * (2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -5 + (((tickAnim - 25) / 9) * (0-(-5)));
            yy = -3.86 + (((tickAnim - 25) / 9) * (-8-(-3.86)));
            zz = 2 + (((tickAnim - 25) / 9) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.7083+150))*-3), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.7083+130))*-4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.7083+110))*-6), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.7083+90))*-7), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.7083+70))*-8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -4.07533 + (((tickAnim - 0) / 4) * (32.89653-(-4.07533)));
            yy = -5.23816 + (((tickAnim - 0) / 4) * (-4.725-(-5.23816)));
            zz = -9.40966 + (((tickAnim - 0) / 4) * (-14.95589-(-9.40966)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 32.89653 + (((tickAnim - 4) / 4) * (29.30761-(32.89653)));
            yy = -4.725 + (((tickAnim - 4) / 4) * (4.45443-(-4.725)));
            zz = -14.95589 + (((tickAnim - 4) / 4) * (-12.51003-(-14.95589)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 29.30761 + (((tickAnim - 8) / 1) * (14.82215-(29.30761)));
            yy = 4.45443 + (((tickAnim - 8) / 1) * (-12.22172-(4.45443)));
            zz = -12.51003 + (((tickAnim - 8) / 1) * (-7.19172-(-12.51003)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 14.82215 + (((tickAnim - 9) / 1) * (-4.97556-(14.82215)));
            yy = -12.22172 + (((tickAnim - 9) / 1) * (-26.48311-(-12.22172)));
            zz = -7.19172 + (((tickAnim - 9) / 1) * (-5.48816-(-7.19172)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.97556 + (((tickAnim - 10) / 2) * (-38.25422-(-4.97556)));
            yy = -26.48311 + (((tickAnim - 10) / 2) * (-40.13041-(-26.48311)));
            zz = -5.48816 + (((tickAnim - 10) / 2) * (-18.85138-(-5.48816)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -38.25422 + (((tickAnim - 12) / 3) * (-38.69691-(-38.25422)));
            yy = -40.13041 + (((tickAnim - 12) / 3) * (-12.8358-(-40.13041)));
            zz = -18.85138 + (((tickAnim - 12) / 3) * (7.87506-(-18.85138)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = -38.69691 + (((tickAnim - 15) / 11) * (-2.12819-(-38.69691)));
            yy = -12.8358 + (((tickAnim - 15) / 11) * (-8.54149-(-12.8358)));
            zz = 7.87506 + (((tickAnim - 15) / 11) * (-1.89456-(7.87506)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -2.12819 + (((tickAnim - 26) / 8) * (-4.07533-(-2.12819)));
            yy = -8.54149 + (((tickAnim - 26) / 8) * (-5.23816-(-8.54149)));
            zz = -1.89456 + (((tickAnim - 26) / 8) * (-9.40966-(-1.89456)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(xx), upperlegleft.rotateAngleY + (float) Math.toRadians(yy), upperlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15.04935 + (((tickAnim - 0) / 4) * (-60.04935-(-15.04935)));
            yy = -1.06442 + (((tickAnim - 0) / 4) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 0) / 4) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -60.04935 + (((tickAnim - 4) / 4) * (-57.04935-(-60.04935)));
            yy = -1.06442 + (((tickAnim - 4) / 4) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 4) / 4) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -57.04935 + (((tickAnim - 8) / 1) * (-22.17435-(-57.04935)));
            yy = -1.06442 + (((tickAnim - 8) / 1) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 8) / 1) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -22.17435 + (((tickAnim - 9) / 1) * (14.70065-(-22.17435)));
            yy = -1.06442 + (((tickAnim - 9) / 1) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 9) / 1) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 14.70065 + (((tickAnim - 10) / 2) * (8.45065-(14.70065)));
            yy = -1.06442 + (((tickAnim - 10) / 2) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 10) / 2) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 8.45065 + (((tickAnim - 12) / 1) * (3.20065-(8.45065)));
            yy = -1.06442 + (((tickAnim - 12) / 1) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 12) / 1) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 3.20065 + (((tickAnim - 13) / 2) * (12.95065-(3.20065)));
            yy = -1.06442 + (((tickAnim - 13) / 2) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 13) / 2) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 12.95065 + (((tickAnim - 15) / 11) * (-23.87544-(12.95065)));
            yy = -1.06442 + (((tickAnim - 15) / 11) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 15) / 11) * (0.14507-(0.14507)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -23.87544 + (((tickAnim - 26) / 8) * (-15.04935-(-23.87544)));
            yy = -1.06442 + (((tickAnim - 26) / 8) * (-1.06442-(-1.06442)));
            zz = 0.14507 + (((tickAnim - 26) / 8) * (0.14507-(0.14507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegleft, lowerlegleft.rotateAngleX + (float) Math.toRadians(xx), lowerlegleft.rotateAngleY + (float) Math.toRadians(yy), lowerlegleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.89298 + (((tickAnim - 0) / 4) * (12.03726-(-0.89298)));
            yy = 27.57847 + (((tickAnim - 0) / 4) * (24.50762-(27.57847)));
            zz = -12.53179 + (((tickAnim - 0) / 4) * (-15.82346-(-12.53179)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 12.03726 + (((tickAnim - 4) / 4) * (-1.03251-(12.03726)));
            yy = 24.50762 + (((tickAnim - 4) / 4) * (21.43676-(24.50762)));
            zz = -15.82346 + (((tickAnim - 4) / 4) * (-19.11513-(-15.82346)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -1.03251 + (((tickAnim - 8) / 1) * (35.80644-(-1.03251)));
            yy = 21.43676 + (((tickAnim - 8) / 1) * (24.64212-(21.43676)));
            zz = -19.11513 + (((tickAnim - 8) / 1) * (-10.92089-(-19.11513)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 35.80644 + (((tickAnim - 9) / 1) * (-23.35461-(35.80644)));
            yy = 24.64212 + (((tickAnim - 9) / 1) * (27.84748-(24.64212)));
            zz = -10.92089 + (((tickAnim - 9) / 1) * (-2.72664-(-10.92089)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -23.35461 + (((tickAnim - 10) / 2) * (-13.67671-(-23.35461)));
            yy = 27.84748 + (((tickAnim - 10) / 2) * (34.25819-(27.84748)));
            zz = -2.72664 + (((tickAnim - 10) / 2) * (13.66184-(-2.72664)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -13.67671 + (((tickAnim - 12) / 1) * (4.17353-(-13.67671)));
            yy = 34.25819 + (((tickAnim - 12) / 1) * (17.90096-(34.25819)));
            zz = 13.66184 + (((tickAnim - 12) / 1) * (7.41345-(13.66184)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 4.17353 + (((tickAnim - 13) / 2) * (-13.97623-(4.17353)));
            yy = 17.90096 + (((tickAnim - 13) / 2) * (1.54373-(17.90096)));
            zz = 7.41345 + (((tickAnim - 13) / 2) * (1.16507-(7.41345)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = -13.97623 + (((tickAnim - 15) / 11) * (5.41865-(-13.97623)));
            yy = 1.54373 + (((tickAnim - 15) / 11) * (16.25902-(1.54373)));
            zz = 1.16507 + (((tickAnim - 15) / 11) * (-6.57664-(1.16507)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 5.41865 + (((tickAnim - 26) / 8) * (-0.89298-(5.41865)));
            yy = 16.25902 + (((tickAnim - 26) / 8) * (27.57847-(16.25902)));
            zz = -6.57664 + (((tickAnim - 26) / 8) * (-12.53179-(-6.57664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -38.69691 + (((tickAnim - 0) / 6) * (-17.03705-(-38.69691)));
            yy = 12.8358 + (((tickAnim - 0) / 6) * (11.14604-(12.8358)));
            zz = -7.87506 + (((tickAnim - 0) / 6) * (-4.40658-(-7.87506)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -17.03705 + (((tickAnim - 6) / 6) * (-14.63878-(-17.03705)));
            yy = 11.14604 + (((tickAnim - 6) / 6) * (6.81766-(11.14604)));
            zz = -4.40658 + (((tickAnim - 6) / 6) * (-5.22879-(-4.40658)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -14.63878 + (((tickAnim - 12) / 5) * (0.14477-(-14.63878)));
            yy = 6.81766 + (((tickAnim - 12) / 5) * (6.20253-(6.81766)));
            zz = -5.22879 + (((tickAnim - 12) / 5) * (-0.90085-(-5.22879)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 0.14477 + (((tickAnim - 17) / 11) * (44.84245-(0.14477)));
            yy = 6.20253 + (((tickAnim - 17) / 11) * (4.86976-(6.20253)));
            zz = -0.90085 + (((tickAnim - 17) / 11) * (8.47636-(-0.90085)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = 44.84245 + (((tickAnim - 28) / 0) * (35.93344-(44.84245)));
            yy = 4.86976 + (((tickAnim - 28) / 0) * (15.67644-(4.86976)));
            zz = 8.47636 + (((tickAnim - 28) / 0) * (6.98226-(8.47636)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 35.93344 + (((tickAnim - 28) / 1) * (-4.97556-(35.93344)));
            yy = 15.67644 + (((tickAnim - 28) / 1) * (26.48311-(15.67644)));
            zz = 6.98226 + (((tickAnim - 28) / 1) * (5.48816-(6.98226)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -4.97556 + (((tickAnim - 29) / 2) * (-38.25422-(-4.97556)));
            yy = 26.48311 + (((tickAnim - 29) / 2) * (40.13041-(26.48311)));
            zz = 5.48816 + (((tickAnim - 29) / 2) * (18.85138-(5.48816)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -38.25422 + (((tickAnim - 31) / 3) * (-38.69691-(-38.25422)));
            yy = 40.13041 + (((tickAnim - 31) / 3) * (12.8358-(40.13041)));
            zz = 18.85138 + (((tickAnim - 31) / 3) * (-7.87506-(18.85138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.95065 + (((tickAnim - 0) / 6) * (-7.68572-(12.95065)));
            yy = 1.06442 + (((tickAnim - 0) / 6) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 0) / 6) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -7.68572 + (((tickAnim - 6) / 6) * (-11.97593-(-7.68572)));
            yy = 1.06442 + (((tickAnim - 6) / 6) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 6) / 6) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -11.97593 + (((tickAnim - 12) / 5) * (-17.20964-(-11.97593)));
            yy = 1.06442 + (((tickAnim - 12) / 5) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 12) / 5) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -17.20964 + (((tickAnim - 17) / 6) * (-41.66179-(-17.20964)));
            yy = 1.06442 + (((tickAnim - 17) / 6) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 17) / 6) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -41.66179 + (((tickAnim - 23) / 5) * (-57.04935-(-41.66179)));
            yy = 1.06442 + (((tickAnim - 23) / 5) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 23) / 5) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -57.04935 + (((tickAnim - 28) / 0) * (-22.17435-(-57.04935)));
            yy = 1.06442 + (((tickAnim - 28) / 0) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 28) / 0) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -22.17435 + (((tickAnim - 28) / 1) * (14.70065-(-22.17435)));
            yy = 1.06442 + (((tickAnim - 28) / 1) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 28) / 1) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 14.70065 + (((tickAnim - 29) / 2) * (8.45065-(14.70065)));
            yy = 1.06442 + (((tickAnim - 29) / 2) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 29) / 2) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 8.45065 + (((tickAnim - 31) / 2) * (3.20065-(8.45065)));
            yy = 1.06442 + (((tickAnim - 31) / 2) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 31) / 2) * (-0.14507-(-0.14507)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 3.20065 + (((tickAnim - 33) / 1) * (12.95065-(3.20065)));
            yy = 1.06442 + (((tickAnim - 33) / 1) * (1.06442-(1.06442)));
            zz = -0.14507 + (((tickAnim - 33) / 1) * (-0.14507-(-0.14507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegright, lowerlegright.rotateAngleX + (float) Math.toRadians(xx), lowerlegright.rotateAngleY + (float) Math.toRadians(yy), lowerlegright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -13.97623 + (((tickAnim - 0) / 12) * (-8.72738-(-13.97623)));
            yy = -1.54373 + (((tickAnim - 0) / 12) * (-9.9832-(-1.54373)));
            zz = -1.16507 + (((tickAnim - 0) / 12) * (7.43865-(-1.16507)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -8.72738 + (((tickAnim - 12) / 5) * (-10.29742-(-8.72738)));
            yy = -9.9832 + (((tickAnim - 12) / 5) * (-13.60011-(-9.9832)));
            zz = 7.43865 + (((tickAnim - 12) / 5) * (11.12596-(7.43865)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -10.29742 + (((tickAnim - 17) / 6) * (-1.30862-(-10.29742)));
            yy = -13.60011 + (((tickAnim - 17) / 6) * (-17.81985-(-13.60011)));
            zz = 11.12596 + (((tickAnim - 17) / 6) * (15.42782-(11.12596)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -1.30862 + (((tickAnim - 23) / 5) * (-1.03251-(-1.30862)));
            yy = -17.81985 + (((tickAnim - 23) / 5) * (-21.43676-(-17.81985)));
            zz = 15.42782 + (((tickAnim - 23) / 5) * (19.11513-(15.42782)));
        }
        else if (tickAnim >= 28 && tickAnim < 28) {
            xx = -1.03251 + (((tickAnim - 28) / 0) * (35.80644-(-1.03251)));
            yy = -21.43676 + (((tickAnim - 28) / 0) * (-24.64212-(-21.43676)));
            zz = 19.11513 + (((tickAnim - 28) / 0) * (10.92089-(19.11513)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 35.80644 + (((tickAnim - 28) / 1) * (-23.35461-(35.80644)));
            yy = -24.64212 + (((tickAnim - 28) / 1) * (-27.84748-(-24.64212)));
            zz = 10.92089 + (((tickAnim - 28) / 1) * (2.72664-(10.92089)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -23.35461 + (((tickAnim - 29) / 2) * (-13.67671-(-23.35461)));
            yy = -27.84748 + (((tickAnim - 29) / 2) * (-34.25819-(-27.84748)));
            zz = 2.72664 + (((tickAnim - 29) / 2) * (-13.66184-(2.72664)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -13.67671 + (((tickAnim - 31) / 2) * (4.17353-(-13.67671)));
            yy = -34.25819 + (((tickAnim - 31) / 2) * (-17.90096-(-34.25819)));
            zz = -13.66184 + (((tickAnim - 31) / 2) * (-7.41345-(-13.66184)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 4.17353 + (((tickAnim - 33) / 1) * (-13.97623-(4.17353)));
            yy = -17.90096 + (((tickAnim - 33) / 1) * (-1.54373-(-17.90096)));
            zz = -7.41345 + (((tickAnim - 33) / 1) * (-1.16507-(-7.41345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4.15732 + (((tickAnim - 0) / 5) * (-5.82695-(-4.15732)));
            yy = -9.03546 + (((tickAnim - 0) / 5) * (2.31294-(-9.03546)));
            zz = -3.52164 + (((tickAnim - 0) / 5) * (-14.61171-(-3.52164)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5.82695 + (((tickAnim - 5) / 10) * (-6.64061-(-5.82695)));
            yy = 2.31294 + (((tickAnim - 5) / 10) * (5.44161-(2.31294)));
            zz = -14.61171 + (((tickAnim - 5) / 10) * (-13.26398-(-14.61171)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -6.64061 + (((tickAnim - 15) / 10) * (-4.99964-(-6.64061)));
            yy = 5.44161 + (((tickAnim - 15) / 10) * (-7.4946-(5.44161)));
            zz = -13.26398 + (((tickAnim - 15) / 10) * (-1.69435-(-13.26398)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = -4.99964 + (((tickAnim - 25) / 9) * (-4.15732-(-4.99964)));
            yy = -7.4946 + (((tickAnim - 25) / 9) * (-9.03546-(-7.4946)));
            zz = -1.69435 + (((tickAnim - 25) / 9) * (-3.52164-(-1.69435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -11.89663 + (((tickAnim - 0) / 34) * (-11.89663-(-11.89663)));
            yy = -1.50785 + (((tickAnim - 0) / 34) * (-1.50785-(-1.50785)));
            zz = 0.63694 + (((tickAnim - 0) / 34) * (0.63694-(0.63694)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.89995), head.rotateAngleY + (float) Math.toRadians(-1.48836), head.rotateAngleZ + (float) Math.toRadians(0.19333));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/1.5+30)*-0.2);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(-0.025+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*700/1.5+30)*-0.2);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*750/1.5+35)*-0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*0.5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+120))*-3.5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+200))*3), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-200))*2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-250))*-2.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+100))*-3), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*-2), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5+50))*0.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-2.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+50))*-3));



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
            xx = -12.25 + (((tickAnim - 0) / 3) * (16.47396-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-5.6002-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-12.87079-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 16.47396 + (((tickAnim - 3) / 2) * (-18.33791-(16.47396)));
            yy = -5.6002 + (((tickAnim - 3) / 2) * (-5.31288-(-5.6002)));
            zz = -12.87079 + (((tickAnim - 3) / 2) * (-10.57252-(-12.87079)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -18.33791 + (((tickAnim - 5) / 3) * (-15.66812-(-18.33791)));
            yy = -5.31288 + (((tickAnim - 5) / 3) * (-3.25121-(-5.31288)));
            zz = -10.57252 + (((tickAnim - 5) / 3) * (5.91859-(-10.57252)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -15.66812 + (((tickAnim - 8) / 22) * (-12.25-(-15.66812)));
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
            yy = 0.125 + (((tickAnim - 3) / 2) * (1.68-(0.125)));
            zz = -0.35 + (((tickAnim - 3) / 2) * (-0.15-(-0.35)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.2 + (((tickAnim - 5) / 3) * (0.2-(0.2)));
            yy = 1.68 + (((tickAnim - 5) / 3) * (0.3-(1.68)));
            zz = -0.15 + (((tickAnim - 5) / 3) * (-0.275-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = 0.2 + (((tickAnim - 8) / 16) * (0-(0.2)));
            yy = 0.3 + (((tickAnim - 8) / 16) * (0.45-(0.3)));
            zz = -0.275 + (((tickAnim - 8) / 16) * (0-(-0.275)));
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
            xx = -16.7225 + (((tickAnim - 0) / 3) * (57.75117-(-16.7225)));
            yy = 17.32918 + (((tickAnim - 0) / 3) * (23.87256-(17.32918)));
            zz = -19.82012 + (((tickAnim - 0) / 3) * (-15.40035-(-19.82012)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 57.75117 + (((tickAnim - 3) / 2) * (19.50516-(57.75117)));
            yy = 23.87256 + (((tickAnim - 3) / 2) * (21.29388-(23.87256)));
            zz = -15.40035 + (((tickAnim - 3) / 2) * (-16.67368-(-15.40035)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.50516 + (((tickAnim - 5) / 3) * (31.07563-(19.50516)));
            yy = 21.29388 + (((tickAnim - 5) / 3) * (17.00617-(21.29388)));
            zz = -16.67368 + (((tickAnim - 5) / 3) * (-20.35316-(-16.67368)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 31.07563 + (((tickAnim - 8) / 22) * (-16.7225-(31.07563)));
            yy = 17.00617 + (((tickAnim - 8) / 22) * (17.32918-(17.00617)));
            zz = -20.35316 + (((tickAnim - 8) / 22) * (-19.82012-(-20.35316)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 0) / 3) * (-0.15-(0.325)));
            zz = 0.075 + (((tickAnim - 0) / 3) * (0.45-(0.075)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 2) * (-0.125-(-0.15)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0.45-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.125 + (((tickAnim - 5) / 3) * (1.05-(-0.125)));
            zz = 0.45 + (((tickAnim - 5) / 3) * (0-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = 1.05 + (((tickAnim - 8) / 22) * (0.325-(1.05)));
            zz = 0 + (((tickAnim - 8) / 22) * (0.075-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footleft.rotationPointX = this.footleft.rotationPointX + (float)(xx);
        this.footleft.rotationPointY = this.footleft.rotationPointY - (float)(yy);
        this.footleft.rotationPointZ = this.footleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5.47543 + (((tickAnim - 0) / 8) * (41.5692-(-5.47543)));
            yy = -7.97776 + (((tickAnim - 0) / 8) * (-7.4242-(-7.97776)));
            zz = -18.12617 + (((tickAnim - 0) / 8) * (-1.06662-(-18.12617)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 41.5692 + (((tickAnim - 8) / 5) * (13.6472-(41.5692)));
            yy = -7.4242 + (((tickAnim - 8) / 5) * (-5.36192-(-7.4242)));
            zz = -1.06662 + (((tickAnim - 8) / 5) * (-0.77034-(-1.06662)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 13.6472 + (((tickAnim - 13) / 8) * (-13.68007-(13.6472)));
            yy = -5.36192 + (((tickAnim - 13) / 8) * (-2.20331-(-5.36192)));
            zz = -0.77034 + (((tickAnim - 13) / 8) * (-3.63517-(-0.77034)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -13.68007 + (((tickAnim - 21) / 9) * (-5.47543-(-13.68007)));
            yy = -2.20331 + (((tickAnim - 21) / 9) * (-7.97776-(-2.20331)));
            zz = -3.63517 + (((tickAnim - 21) / 9) * (-18.12617-(-3.63517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(xx), upperlegright.rotateAngleY + (float) Math.toRadians(yy), upperlegright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.29-(0)));
            yy = -1.1 + (((tickAnim - 0) / 5) * (-1.325-(-1.1)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.29 + (((tickAnim - 5) / 3) * (0.375-(0.29)));
            yy = -1.325 + (((tickAnim - 5) / 3) * (-1.65-(-1.325)));
            zz = -0.25 + (((tickAnim - 5) / 3) * (-0.325-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.375 + (((tickAnim - 8) / 5) * (0.27-(0.375)));
            yy = -1.65 + (((tickAnim - 8) / 5) * (-1.025-(-1.65)));
            zz = -0.325 + (((tickAnim - 8) / 5) * (-0.23-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0.27 + (((tickAnim - 13) / 8) * (0-(0.27)));
            yy = -1.025 + (((tickAnim - 13) / 8) * (0.15-(-1.025)));
            zz = -0.23 + (((tickAnim - 13) / 8) * (0-(-0.23)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0.15 + (((tickAnim - 21) / 9) * (-1.1-(0.15)));
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
            xx = -11.75 + (((tickAnim - 8) / 5) * (11.40511-(-11.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (9.72421-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (21.84924-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 11.40511 + (((tickAnim - 13) / 5) * (-33.80176-(11.40511)));
            yy = 9.72421 + (((tickAnim - 13) / 5) * (3.73555-(9.72421)));
            zz = 21.84924 + (((tickAnim - 13) / 5) * (14.49663-(21.84924)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -33.80176 + (((tickAnim - 18) / 3) * (-15.66812-(-33.80176)));
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
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = -0.075 + (((tickAnim - 21) / 5) * (0.235-(-0.075)));
            zz = 0.125 + (((tickAnim - 21) / 5) * (0.05-(0.125)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.235 + (((tickAnim - 26) / 4) * (0.075-(0.235)));
            zz = 0.05 + (((tickAnim - 26) / 4) * (0-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegright.rotationPointX = this.lowerlegright.rotationPointX + (float)(xx);
        this.lowerlegright.rotationPointY = this.lowerlegright.rotationPointY - (float)(yy);
        this.lowerlegright.rotationPointZ = this.lowerlegright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.5811 + (((tickAnim - 0) / 5) * (-21.07139-(-2.5811)));
            yy = -3.13233 + (((tickAnim - 0) / 5) * (-12.76337-(-3.13233)));
            zz = 7.0258 + (((tickAnim - 0) / 5) * (13.28299-(7.0258)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -21.07139 + (((tickAnim - 5) / 3) * (-26.31491-(-21.07139)));
            yy = -12.76337 + (((tickAnim - 5) / 3) * (-19.18407-(-12.76337)));
            zz = 13.28299 + (((tickAnim - 5) / 3) * (17.45444-(13.28299)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -26.31491 + (((tickAnim - 8) / 5) * (43.52658-(-26.31491)));
            yy = -19.18407 + (((tickAnim - 8) / 5) * (-34.85269-(-19.18407)));
            zz = 17.45444 + (((tickAnim - 8) / 5) * (8.53987-(17.45444)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 43.52658 + (((tickAnim - 13) / 5) * (27.48678-(43.52658)));
            yy = -34.85269 + (((tickAnim - 13) / 5) * (-25.62692-(-34.85269)));
            zz = 8.53987 + (((tickAnim - 13) / 5) * (6.75952-(8.53987)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 27.48678 + (((tickAnim - 18) / 3) * (24.99949-(27.48678)));
            yy = -25.62692 + (((tickAnim - 18) / 3) * (-12.71775-(-25.62692)));
            zz = 6.75952 + (((tickAnim - 18) / 3) * (7.29603-(6.75952)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 24.99949 + (((tickAnim - 21) / 5) * (12.87882-(24.99949)));
            yy = -12.71775 + (((tickAnim - 21) / 5) * (-3.67957-(-12.71775)));
            zz = 7.29603 + (((tickAnim - 21) / 5) * (7.04123-(7.29603)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.87882 + (((tickAnim - 26) / 4) * (-2.5811-(12.87882)));
            yy = -3.67957 + (((tickAnim - 26) / 4) * (-3.13233-(-3.67957)));
            zz = 7.04123 + (((tickAnim - 26) / 4) * (7.0258-(7.04123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 8) * (0-(0.8)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.85-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.475-(0)));
            zz = 0.85 + (((tickAnim - 13) / 5) * (0-(0.85)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 18) / 3) * (0.4-(0.475)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 21) / 5) * (1.18-(0.4)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 1.18 + (((tickAnim - 26) / 4) * (0.8-(1.18)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footright.rotationPointX = this.footright.rotationPointX + (float)(xx);
        this.footright.rotationPointY = this.footright.rotationPointY - (float)(yy);
        this.footright.rotationPointZ = this.footright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.38707 + (((tickAnim - 0) / 13) * (0.09791-(1.38707)));
            yy = 3.9612 + (((tickAnim - 0) / 13) * (-21.80331-(3.9612)));
            zz = 3.30437 + (((tickAnim - 0) / 13) * (10.50445-(3.30437)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.09791 + (((tickAnim - 13) / 7) * (-7.92792-(0.09791)));
            yy = -21.80331 + (((tickAnim - 13) / 7) * (5.68346-(-21.80331)));
            zz = 10.50445 + (((tickAnim - 13) / 7) * (-21.30745-(10.50445)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -7.92792 + (((tickAnim - 20) / 6) * (1.4752-(-7.92792)));
            yy = 5.68346 + (((tickAnim - 20) / 6) * (13.9581-(5.68346)));
            zz = -21.30745 + (((tickAnim - 20) / 6) * (3.56881-(-21.30745)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 1.4752 + (((tickAnim - 26) / 4) * (1.38707-(1.4752)));
            yy = 13.9581 + (((tickAnim - 26) / 4) * (3.9612-(13.9581)));
            zz = 3.56881 + (((tickAnim - 26) / 4) * (3.30437-(3.56881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(xx), wingleft1.rotateAngleY + (float) Math.toRadians(yy), wingleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -1.725 + (((tickAnim - 0) / 13) * (1.225-(-1.725)));
            yy = -0.425 + (((tickAnim - 0) / 13) * (-0.425-(-0.425)));
            zz = 0.5 + (((tickAnim - 0) / 13) * (0.775-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 1.225 + (((tickAnim - 13) / 7) * (-0.68-(1.225)));
            yy = -0.425 + (((tickAnim - 13) / 7) * (-0.23-(-0.425)));
            zz = 0.775 + (((tickAnim - 13) / 7) * (0.52-(0.775)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -0.68 + (((tickAnim - 20) / 6) * (-3.175-(-0.68)));
            yy = -0.23 + (((tickAnim - 20) / 6) * (-0.425-(-0.23)));
            zz = 0.52 + (((tickAnim - 20) / 6) * (0.15-(0.52)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -3.175 + (((tickAnim - 26) / 4) * (-1.725-(-3.175)));
            yy = -0.425 + (((tickAnim - 26) / 4) * (-0.425-(-0.425)));
            zz = 0.15 + (((tickAnim - 26) / 4) * (0.5-(0.15)));
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
            xx = -8.5 + (((tickAnim - 0) / 13) * (-17.75-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -17.75 + (((tickAnim - 13) / 7) * (-14.25-(-17.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = -4.75 + (((tickAnim - 13) / 7) * (22.13-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -14.25 + (((tickAnim - 20) / 6) * (-8.5-(-14.25)));
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
            yy = 0.125 + (((tickAnim - 0) / 13) * (1.225-(0.125)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0.35-(0)));
            yy = 1.225 + (((tickAnim - 13) / 7) * (0.68-(1.225)));
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




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.08973 + (((tickAnim - 0) / 8) * (16.57891-(10.08973)));
            yy = -0.7583 + (((tickAnim - 0) / 8) * (-11.65285-(-0.7583)));
            zz = 6.31389 + (((tickAnim - 0) / 8) * (1.12434-(6.31389)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16.57891 + (((tickAnim - 8) / 5) * (18.65227-(16.57891)));
            yy = -11.65285 + (((tickAnim - 8) / 5) * (-16.20872-(-11.65285)));
            zz = 1.12434 + (((tickAnim - 8) / 5) * (-7.92173-(1.12434)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 18.65227 + (((tickAnim - 13) / 2) * (2.15991-(18.65227)));
            yy = -16.20872 + (((tickAnim - 13) / 2) * (-2.49449-(-16.20872)));
            zz = -7.92173 + (((tickAnim - 13) / 2) * (-8.29624-(-7.92173)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.15991 + (((tickAnim - 15) / 5) * (0-(2.15991)));
            yy = -2.49449 + (((tickAnim - 15) / 5) * (-20.75-(-2.49449)));
            zz = -8.29624 + (((tickAnim - 15) / 5) * (79.25-(-8.29624)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (10.08973-(0)));
            yy = -20.75 + (((tickAnim - 20) / 6) * (-0.7583-(-20.75)));
            zz = 79.25 + (((tickAnim - 20) / 6) * (6.31389-(79.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.5-(0)));
            yy = 0.075 + (((tickAnim - 0) / 8) * (-0.11-(0.075)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.5 + (((tickAnim - 8) / 5) * (0.475-(0.5)));
            yy = -0.11 + (((tickAnim - 8) / 5) * (-0.42-(-0.11)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.475 + (((tickAnim - 13) / 2) * (0-(0.475)));
            yy = -0.42 + (((tickAnim - 13) / 2) * (-0.25-(-0.42)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            yy = -0.25 + (((tickAnim - 15) / 11) * (0.075-(-0.25)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.41196 + (((tickAnim - 0) / 5) * (-13.21723-(-1.41196)));
            yy = 28.29771 + (((tickAnim - 0) / 5) * (-4.65267-(28.29771)));
            zz = -7.50107 + (((tickAnim - 0) / 5) * (24.26164-(-7.50107)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -13.21723 + (((tickAnim - 5) / 6) * (-3.63033-(-13.21723)));
            yy = -4.65267 + (((tickAnim - 5) / 6) * (-16.8706-(-4.65267)));
            zz = 24.26164 + (((tickAnim - 5) / 6) * (4.98596-(24.26164)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -3.63033 + (((tickAnim - 11) / 19) * (-1.41196-(-3.63033)));
            yy = -16.8706 + (((tickAnim - 11) / 19) * (28.29771-(-16.8706)));
            zz = 4.98596 + (((tickAnim - 11) / 19) * (-7.50107-(4.98596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(xx), wingright1.rotateAngleY + (float) Math.toRadians(yy), wingright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -1.025 + (((tickAnim - 0) / 5) * (1.715-(-1.025)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.545-(0)));
            zz = 0.45 + (((tickAnim - 0) / 5) * (0.655-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 1.715 + (((tickAnim - 5) / 6) * (2.225-(1.715)));
            yy = 0.545 + (((tickAnim - 5) / 6) * (-0.825-(0.545)));
            zz = 0.655 + (((tickAnim - 5) / 6) * (1.125-(0.655)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 2.225 + (((tickAnim - 11) / 19) * (-1.025-(2.225)));
            yy = -0.825 + (((tickAnim - 11) / 19) * (0-(-0.825)));
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
            xx = -7.25 + (((tickAnim - 0) / 5) * (-15.49077-(-7.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.23527-(0)));
            zz = 4 + (((tickAnim - 0) / 5) * (-16.77386-(4)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -15.49077 + (((tickAnim - 5) / 6) * (-12.06275-(-15.49077)));
            yy = -0.23527 + (((tickAnim - 5) / 6) * (0.61066-(-0.23527)));
            zz = -16.77386 + (((tickAnim - 5) / 6) * (-11.73434-(-16.77386)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = -12.06275 + (((tickAnim - 11) / 19) * (-7.25-(-12.06275)));
            yy = 0.61066 + (((tickAnim - 11) / 19) * (0-(0.61066)));
            zz = -11.73434 + (((tickAnim - 11) / 19) * (4-(-11.73434)));
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
            yy = 0 + (((tickAnim - 0) / 11) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = -0.5 + (((tickAnim - 11) / 19) * (0-(-0.5)));
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
            xx = 6.47684 + (((tickAnim - 0) / 6) * (1.31875-(6.47684)));
            yy = 0.44753 + (((tickAnim - 0) / 6) * (35.78893-(0.44753)));
            zz = 6.71488 + (((tickAnim - 0) / 6) * (-75.08624-(6.71488)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 1.31875 + (((tickAnim - 6) / 5) * (17.48535-(1.31875)));
            yy = 35.78893 + (((tickAnim - 6) / 5) * (1.17193-(35.78893)));
            zz = -75.08624 + (((tickAnim - 6) / 5) * (-8.36808-(-75.08624)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 17.48535 + (((tickAnim - 11) / 19) * (6.47684-(17.48535)));
            yy = 1.17193 + (((tickAnim - 11) / 19) * (0.44753-(1.17193)));
            zz = -8.36808 + (((tickAnim - 11) / 19) * (6.71488-(-8.36808)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
            yy = 0.575 + (((tickAnim - 0) / 6) * (0.925-(0.575)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -0.2 + (((tickAnim - 6) / 5) * (0-(-0.2)));
            yy = 0.925 + (((tickAnim - 6) / 5) * (0.5-(0.925)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 11) / 19) * (0-(0)));
            yy = 0.5 + (((tickAnim - 11) / 19) * (0.575-(0.5)));
            zz = 0 + (((tickAnim - 11) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handright.rotationPointX = this.handright.rotationPointX + (float)(xx);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(yy);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(zz);


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

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


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-0.25), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-2.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-2.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-240))*5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-210))*-2.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-2.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+60))*-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.wingleft3Membrane.setScale((float)1,(float)0.7,(float)1);


        this.wingleft4Membrane.setScale((float)0.99,(float)0.5,(float)1);



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
            yy = 0.5 + (((tickAnim - 3) / 1) * (0.75-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 1) * (0.5-(0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 4) / 2) * (0.5-(0.75)));
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
            xx = -6.75 + (((tickAnim - 0) / 1) * (-9.25-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -11.25 + (((tickAnim - 0) / 1) * (-2.5-(-11.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -9.25 + (((tickAnim - 1) / 1) * (-8.75-(-9.25)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 1) / 1) * (-5-(-2.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -8.75 + (((tickAnim - 2) / 1) * (-8.5-(-8.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-20-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.5 + (((tickAnim - 3) / 1) * (-9.25-(-8.5)));
            yy = 0 + (((tickAnim - 3) / 1) * (5-(0)));
            zz = -20 + (((tickAnim - 3) / 1) * (-22.5-(-20)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -9.25 + (((tickAnim - 4) / 2) * (-9-(-9.25)));
            yy = 5 + (((tickAnim - 4) / 2) * (0-(5)));
            zz = -22.5 + (((tickAnim - 4) / 2) * (-7.5-(-22.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 6) / 2) * (-9-(-9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -7.5 + (((tickAnim - 6) / 2) * (-10-(-7.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -9 + (((tickAnim - 8) / 1) * (-6.5-(-9)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 8) / 1) * (-30-(-10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -6.5 + (((tickAnim - 9) / 1) * (-6.75-(-6.5)));
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
            xx = 10.25611 + (((tickAnim - 0) / 1) * (15-(10.25611)));
            yy = 1.04094 + (((tickAnim - 0) / 1) * (0-(1.04094)));
            zz = 8.99026 + (((tickAnim - 0) / 1) * (10-(8.99026)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 1) / 1) * (-2.5-(15)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 1) / 1) * (-2.5-(10)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 2) / 1) * (-10.25-(-2.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -2.5 + (((tickAnim - 2) / 1) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10.25 + (((tickAnim - 3) / 1) * (2.15899-(-10.25)));
            yy = 0 + (((tickAnim - 3) / 1) * (-27.73136-(0)));
            zz = -2.5 + (((tickAnim - 3) / 1) * (14.65178-(-2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 2.15899 + (((tickAnim - 4) / 2) * (-10-(2.15899)));
            yy = -27.73136 + (((tickAnim - 4) / 2) * (0-(-27.73136)));
            zz = 14.65178 + (((tickAnim - 4) / 2) * (15-(14.65178)));
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


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.6-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0.45-(0)));
            yy = 0.6 + (((tickAnim - 3) / 1) * (0.05-(0.6)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.45 + (((tickAnim - 4) / 6) * (0-(0.45)));
            yy = 0.05 + (((tickAnim - 4) / 6) * (-0.2-(0.05)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




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
            xx = 5 + (((tickAnim - 7) / 2) * (-6-(5)));
            yy = 20 + (((tickAnim - 7) / 2) * (-5-(20)));
            zz = 10 + (((tickAnim - 7) / 2) * (10-(10)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 9) / 1) * (-15-(-6)));
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
            yy = 0.5 + (((tickAnim - 3) / 2) * (1.15-(0.5)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 2) * (0.5-(1.15)));
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
            xx = -6 + (((tickAnim - 0) / 1) * (-6.25-(-6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 30 + (((tickAnim - 0) / 1) * (11.25-(30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -6.25 + (((tickAnim - 1) / 1) * (-5.25-(-6.25)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 11.25 + (((tickAnim - 1) / 1) * (2.5-(11.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -5.25 + (((tickAnim - 2) / 1) * (-8.5-(-5.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 2.5 + (((tickAnim - 2) / 1) * (5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -8.5 + (((tickAnim - 3) / 0) * (-8.25-(-8.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 0) * (20-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -8.25 + (((tickAnim - 3) / 2) * (-12-(-8.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5-(0)));
            zz = 20 + (((tickAnim - 3) / 2) * (22.5-(20)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -12 + (((tickAnim - 5) / 2) * (-8-(-12)));
            yy = -5 + (((tickAnim - 5) / 2) * (0-(-5)));
            zz = 22.5 + (((tickAnim - 5) / 2) * (7.5-(22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -8 + (((tickAnim - 7) / 2) * (-8.75-(-8)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 7.5 + (((tickAnim - 7) / 2) * (10-(7.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 9) / 1) * (-6-(-8.75)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 9) / 1) * (30-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(xx), wingright2.rotateAngleY + (float) Math.toRadians(yy), wingright2.rotateAngleZ + (float) Math.toRadians(zz));



        this.wingright3Membrane.setScale((float)1,(float)0.7,(float)1);



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



        this.wingright4Membrane.setScale((float)0.99,(float)0.5,(float)1);



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
            xx = -15 + (((tickAnim - 3) / 2) * (0.5-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 2.5 + (((tickAnim - 3) / 2) * (-7.5-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0.5 + (((tickAnim - 5) / 2) * (-10-(0.5)));
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

    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*20), wingleft1.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-300))*20), wingleft1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*20));


        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-70))*7), wingleft2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+170))*5), wingleft2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*10));


        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*10), wingleft3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+140))*10), wingleft3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*25));


        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(0), wingleft4.rotateAngleY + (float) Math.toRadians(-15-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+80))*25), wingleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-40))*20), wingright1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-300))*20), wingright1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*20));


        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-70))*7), wingright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+170))*5), wingright2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*10));


        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-100))*10), wingright3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+140))*10), wingright3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*25));


        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(0), wingright4.rotateAngleY + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+80))*25), wingright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(wingleft4Membrane, wingleft4Membrane.rotateAngleX + (float) Math.toRadians(0), wingleft4Membrane.rotateAngleY + (float) Math.toRadians(Math.sin((((double)tickAnim/20D))*180/0.25+140)*10), wingleft4Membrane.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+230))*2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+180))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*5));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*0.5);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+180))*0.5);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-27.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(1.3);


        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(0), upperlegleft.rotateAngleY + (float) Math.toRadians(0), upperlegleft.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*10));


        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(0), upperlegright.rotateAngleY + (float) Math.toRadians(0), upperlegright.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*10));

    }

    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDimorphodon entity = (EntityPrehistoricFloraDimorphodon) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(wingleft1, wingleft1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+180))*20), wingleft1.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+110))*20), wingleft1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*30));


        this.setRotateAngle(wingleft2, wingleft2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*10), wingleft2.rotateAngleY + (float) Math.toRadians(0), wingleft2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*10));


        this.setRotateAngle(wingleft3, wingleft3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+240))*25), wingleft3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+120))*25), wingleft3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+280))*50));


        this.setRotateAngle(wingleft4, wingleft4.rotateAngleX + (float) Math.toRadians(0), wingleft4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+60))*50), wingleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230))*5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+180))*5), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*10));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25)));
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+180)));
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+230)));


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+170))*1), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*1), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*2));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+110))*1), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+60))*1), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+50))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*1), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-10))*10), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-240))*20));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-70))*10), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-120))*10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-300))*20));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-130))*20), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-180))*20), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-360))*20));


        this.setRotateAngle(wingright1, wingright1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+180))*20), wingright1.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+110))*20), wingright1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*30));


        this.setRotateAngle(wingright2, wingright2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*10), wingright2.rotateAngleY + (float) Math.toRadians(0), wingright2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*10));


        this.setRotateAngle(wingright3, wingright3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+240))*25), wingright3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+120))*25), wingright3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+280))*50));


        this.setRotateAngle(wingright4, wingright4.rotateAngleX + (float) Math.toRadians(0), wingright4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25+60))*50), wingright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+160))*2.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+190))*2.5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+30))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+70))*2.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+100))*2.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-200))*5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-20))*5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-30))*15), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperlegleft, upperlegleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+170))*10), upperlegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*10), upperlegleft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*20));


        this.setRotateAngle(upperlegright, upperlegright.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+170))*10), upperlegright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+120))*10), upperlegright.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*20));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
