package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCryolophosaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraGasosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCryolophosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended immobile;
    private final AdvancedModelRendererExtended immobile2;
    private final AdvancedModelRendererExtended immobile3;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended immobile4;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended immobile5;
    private final AdvancedModelRendererExtended immobile6;
    private final AdvancedModelRendererExtended immobile7;
    private final AdvancedModelRendererExtended immobile8;
    private final AdvancedModelRendererExtended immobile9;
    private final AdvancedModelRendererExtended immobile10;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended immobile13;
    private final AdvancedModelRendererExtended immobile14;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended immobile11;
    private final AdvancedModelRendererExtended immobile12;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended throatPouch3;
    private final AdvancedModelRendererExtended throatPouch;
    private final AdvancedModelRendererExtended throatPouch2;
    private final AdvancedModelRendererExtended armLeft;
    private final AdvancedModelRendererExtended armLeft2;
    private final AdvancedModelRendererExtended handLeft;
    private final AdvancedModelRendererExtended armRight;
    private final AdvancedModelRendererExtended armRight2;
    private final AdvancedModelRendererExtended handRight;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended cube_r32;
    private final AdvancedModelRendererExtended cube_r33;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended cube_r34;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended cube_r35;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended legLeft;
    private final AdvancedModelRendererExtended legLeft2;
    private final AdvancedModelRendererExtended legLeft3;
    private final AdvancedModelRendererExtended footLeft;
    private final AdvancedModelRendererExtended footLeft2;
    private final AdvancedModelRendererExtended legRight;
    private final AdvancedModelRendererExtended legRight2;
    private final AdvancedModelRendererExtended legRight3;
    private final AdvancedModelRendererExtended footRight;
    private final AdvancedModelRendererExtended footRight2;

    private ModelAnimator animator;

    public ModelCryolophosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 23.75F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -24.25F, 5.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.1309F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 26, -4.0F, -5.0F, -6.0F, 8, 14, 12, 0.0F, false));
        this.hips.cubeList.add(new ModelBox(hips, 21, 66, -3.0F, 9.0F, -6.0F, 6, 1, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-2.0F, -5.0F, -5.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0434F, 0.0815F, -0.1346F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 87, 15, -0.7438F, -1.0653F, -1.0432F, 3, 2, 12, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(2.0F, -5.0F, -5.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0434F, -0.0815F, 0.1346F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 87, 15, -2.2562F, -1.0653F, -1.0432F, 3, 2, 12, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -3.0F, -6.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -2.0F, -11.0F, 10, 13, 12, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 11.0F, -11.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 51, -4.0F, -1.0F, 0.0F, 8, 2, 12, -0.001F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-3.0F, -2.0F, -11.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0489F, 0.0375F, -0.1347F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 57, -0.4951F, -1.5661F, -0.0218F, 4, 2, 12, 0.0F, true));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(3.0F, -2.0F, -11.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0489F, -0.0375F, 0.1347F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 79, 57, -3.5049F, -1.5661F, -0.0218F, 4, 2, 12, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.2182F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 41, 31, -4.0F, -2.0F, -10.0F, 8, 9, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-2.0F, -2.0F, -10.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0983F, -0.1186F, -0.1351F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 95, -0.492F, -0.8112F, 0.0649F, 4, 2, 10, 0.0F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(2.0F, -2.0F, -10.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0983F, 0.1186F, 0.1351F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 95, -3.508F, -0.8112F, 0.0649F, 4, 2, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, 7.0F, -10.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 87, 0, -2.0F, -3.0F, 0.0F, 5, 4, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 7.0F, -10.0F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 41, -3.5F, -4.0F, 0.0F, 7, 4, 10, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.2182F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 96, 72, -3.0F, -2.0F, -6.0F, 6, 7, 7, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 46, 69, -2.0F, -3.0F, -6.0F, 4, 2, 6, -0.001F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 5.5F, -6.0F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 0, -2.0F, -2.0F, 0.0F, 4, 3, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.5236F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 39, 103, -2.0F, -2.0F, -7.0F, 4, 7, 7, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 100, 56, -1.5F, 4.25F, -7.0F, 3, 2, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 0, -1.5F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 91, -2.0F, -4.0F, 0.0F, 4, 4, 2, -0.001F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.4363F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 102, 104, -1.5F, 0.0F, -7.0F, 3, 6, 7, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 100, 42, -1.5F, 5.5F, -7.0F, 3, 1, 7, -0.001F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 106, 15, -1.0F, 6.5F, -7.0F, 2, 1, 7, -0.001F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 80, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 84, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 23, 53, -2.0F, -1.5F, -4.0F, 4, 4, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -2.0F, -0.65F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 95, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.immobile = new AdvancedModelRendererExtended(this);
        this.immobile.setRotationPoint(0.0F, 2.5F, -4.0F);
        this.head.addChild(immobile);
        this.immobile.cubeList.add(new ModelBox(immobile, 80, 98, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.immobile2 = new AdvancedModelRendererExtended(this);
        this.immobile2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile.addChild(immobile2);
        this.setRotateAngle(immobile2, 0.1745F, 0.0F, 0.0F);
        this.immobile2.cubeList.add(new ModelBox(immobile2, 52, 20, -1.0F, -1.5F, -3.0F, 2, 1, 4, -0.001F, false));
        this.immobile2.cubeList.add(new ModelBox(immobile2, 52, 7, -1.0F, -1.0F, -3.0F, 2, 1, 4, 0.0F, false));

        this.immobile3 = new AdvancedModelRendererExtended(this);
        this.immobile3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile2.addChild(immobile3);
        this.setRotateAngle(immobile3, -0.0873F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-0.7F, -0.25F, 2.25F);
        this.immobile3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.176F, -0.1289F, -0.0229F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 0, 0.0F, 0.0F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.7F, -0.25F, 2.25F);
        this.immobile3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.176F, 0.1289F, 0.0229F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 0, 0.0F, 0.0F, -0.5F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.immobile3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0873F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 0, -0.5F, -0.25F, 0.025F, 0, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.25F);
        this.immobile3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0873F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 0, 0.5F, -0.25F, 0.025F, 0, 1, 2, 0.0F, false));

        this.immobile4 = new AdvancedModelRendererExtended(this);
        this.immobile4.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.immobile2.addChild(immobile4);
        this.setRotateAngle(immobile4, 0.0436F, 0.0F, 0.0F);
        this.immobile4.cubeList.add(new ModelBox(immobile4, 74, 9, -0.5F, -1.0F, -1.25F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.25F, -0.25F, -0.85F);
        this.immobile4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -0.575F, -0.25F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.1F, -0.25F, 0.0F, 0, 1, 1, 0.0F, false));

        this.immobile5 = new AdvancedModelRendererExtended(this);
        this.immobile5.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.immobile4.addChild(immobile5);
        this.setRotateAngle(immobile5, 0.829F, 0.0F, 0.0F);
        this.immobile5.cubeList.add(new ModelBox(immobile5, 0, 35, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.immobile6 = new AdvancedModelRendererExtended(this);
        this.immobile6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile5.addChild(immobile6);
        this.setRotateAngle(immobile6, -0.4669F, 0.0F, 0.0F);
        this.immobile6.cubeList.add(new ModelBox(immobile6, 96, 72, -0.5F, 0.0F, 0.0F, 1, 2, 2, -0.002F, false));

        this.immobile7 = new AdvancedModelRendererExtended(this);
        this.immobile7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile6.addChild(immobile7);
        this.setRotateAngle(immobile7, -0.1745F, 0.0F, 0.0F);
        this.immobile7.cubeList.add(new ModelBox(immobile7, 73, 91, -0.5F, 0.0F, 0.0F, 1, 2, 2, -0.003F, false));

        this.immobile8 = new AdvancedModelRendererExtended(this);
        this.immobile8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.immobile7.addChild(immobile8);
        this.setRotateAngle(immobile8, -0.1658F, 0.0F, 0.0F);
        this.immobile8.cubeList.add(new ModelBox(immobile8, 87, 21, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));
        this.immobile8.cubeList.add(new ModelBox(immobile8, 44, 31, -1.0F, 0.0F, 2.55F, 2, 2, 1, -0.001F, false));

        this.immobile9 = new AdvancedModelRendererExtended(this);
        this.immobile9.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile9);
        this.setRotateAngle(immobile9, 0.0443F, 0.1744F, 0.0077F);
        this.immobile9.cubeList.add(new ModelBox(immobile9, 19, 95, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.immobile10 = new AdvancedModelRendererExtended(this);
        this.immobile10.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile9.addChild(immobile10);
        this.setRotateAngle(immobile10, 0.4816F, -0.0756F, -0.0437F);
        this.immobile10.cubeList.add(new ModelBox(immobile10, 0, 9, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile10.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.5748F, 0.1334F, 0.1129F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 61, 20, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.immobile13 = new AdvancedModelRendererExtended(this);
        this.immobile13.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.immobile8.addChild(immobile13);
        this.setRotateAngle(immobile13, 0.0443F, -0.1744F, -0.0077F);
        this.immobile13.cubeList.add(new ModelBox(immobile13, 19, 95, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.immobile14 = new AdvancedModelRendererExtended(this);
        this.immobile14.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.immobile13.addChild(immobile14);
        this.setRotateAngle(immobile14, 0.4816F, 0.0756F, 0.0437F);
        this.immobile14.cubeList.add(new ModelBox(immobile14, 0, 9, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.immobile14.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5748F, -0.1334F, -0.1129F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 61, 20, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1047F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 96, -2.0F, 0.0F, -4.0F, 4, 2, 4, -0.001F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 49, 0, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3709F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 56, -2.0F, -3.0F, 0.0F, 3, 3, 4, -0.001F, false));

        this.immobile11 = new AdvancedModelRendererExtended(this);
        this.immobile11.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(immobile11);
        this.setRotateAngle(immobile11, 0.2182F, 0.0F, 0.0F);
        this.immobile11.cubeList.add(new ModelBox(immobile11, 24, 110, -1.5F, 0.0F, -3.0F, 3, 1, 3, -0.001F, false));

        this.immobile12 = new AdvancedModelRendererExtended(this);
        this.immobile12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.immobile11.addChild(immobile12);
        this.immobile12.cubeList.add(new ModelBox(immobile12, 62, 110, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(-0.25F, 0.5F, -3.5F);
        this.immobile12.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.1309F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 51, 0.0F, -1.0F, 0.1F, 0, 1, 5, 0.0F, true));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.25F, 0.5F, -3.5F);
        this.immobile12.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.1309F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 58, 51, 0.0F, -1.0F, 0.1F, 0, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.0F, 1.625F, -0.15F);
        this.immobile12.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.288F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 58, 58, -1.0F, -0.6715F, 0.0873F, 2, 1, 3, -0.002F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.immobile12.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1571F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 11, 110, -1.5F, -1.0F, 3.0F, 3, 1, 3, -0.002F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 110, 51, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.5F, 1.0F, -3.0F);
        this.immobile12.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.1309F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 9, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.throatPouch3 = new AdvancedModelRendererExtended(this);
        this.throatPouch3.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.jaw.addChild(throatPouch3);
        this.setRotateAngle(throatPouch3, -0.3054F, 0.0F, 0.0F);
        this.throatPouch3.cubeList.add(new ModelBox(throatPouch3, 79, 72, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.throatPouch = new AdvancedModelRendererExtended(this);
        this.throatPouch.setRotationPoint(0.0F, 6.5F, -2.0F);
        this.neck3.addChild(throatPouch);
        this.setRotateAngle(throatPouch, 0.4363F, 0.0F, 0.0F);
        this.throatPouch.cubeList.add(new ModelBox(throatPouch, 61, 69, -0.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.throatPouch2 = new AdvancedModelRendererExtended(this);
        this.throatPouch2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.throatPouch.addChild(throatPouch2);
        this.setRotateAngle(throatPouch2, -0.3927F, 0.0F, 0.0F);
        this.throatPouch2.cubeList.add(new ModelBox(throatPouch2, 87, 15, -1.5F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.armLeft = new AdvancedModelRendererExtended(this);
        this.armLeft.setRotationPoint(3.5F, 7.0F, -7.0F);
        this.chest.addChild(armLeft);
        this.setRotateAngle(armLeft, 0.5612F, 0.2577F, -0.0465F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 67, 20, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));
        this.armLeft.cubeList.add(new ModelBox(armLeft, 17, 80, -1.0F, -1.0F, 2.0F, 2, 6, 1, 0.0F, false));

        this.armLeft2 = new AdvancedModelRendererExtended(this);
        this.armLeft2.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, -0.7418F, 0.0F, 0.0F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 0, 26, -1.0F, 0.0F, -2.0F, 2, 5, 3, 0.0F, false));
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 33, 0, -0.5F, 0.0F, 1.0F, 1, 5, 1, 0.0F, false));

        this.handLeft = new AdvancedModelRendererExtended(this);
        this.handLeft.setRotationPoint(0.5F, 4.5F, -0.5F);
        this.armLeft2.addChild(handLeft);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.3927F);
        this.handLeft.cubeList.add(new ModelBox(handLeft, 0, 0, -0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F, false));

        this.armRight = new AdvancedModelRendererExtended(this);
        this.armRight.setRotationPoint(-3.5F, 7.0F, -7.0F);
        this.chest.addChild(armRight);
        this.setRotateAngle(armRight, 0.5612F, -0.2577F, 0.0465F);
        this.armRight.cubeList.add(new ModelBox(armRight, 67, 20, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));
        this.armRight.cubeList.add(new ModelBox(armRight, 17, 80, -1.0F, -1.0F, 2.0F, 2, 6, 1, 0.0F, true));

        this.armRight2 = new AdvancedModelRendererExtended(this);
        this.armRight2.setRotationPoint(0.0F, 4.0F, 0.5F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, -0.7418F, 0.0F, 0.0F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 0, 26, -1.0F, 0.0F, -2.0F, 2, 5, 3, 0.0F, true));
        this.armRight2.cubeList.add(new ModelBox(armRight2, 33, 0, -0.5F, 0.0F, 1.0F, 1, 5, 1, 0.0F, true));

        this.handRight = new AdvancedModelRendererExtended(this);
        this.handRight.setRotationPoint(-0.5F, 4.5F, -0.5F);
        this.armRight2.addChild(handRight);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.3927F);
        this.handRight.cubeList.add(new ModelBox(handRight, 0, 0, -0.5F, 0.0F, -2.0F, 1, 4, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.75F, 5.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 56, -3.0F, -3.0F, 0.0F, 6, 11, 10, 0.0F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 98, -1.5F, 0.0F, 0.0F, 3, 1, 10, 0.0F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(0.0F, 8.0F, 10.0F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 100, 30, -2.0F, -1.0F, -9.0F, 4, 2, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 58, 69, -2.5F, -3.0F, 0.0F, 5, 8, 10, 0.0F, false));

        this.cube_r32 = new AdvancedModelRendererExtended(this);
        this.cube_r32.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0436F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 17, 80, -1.5F, 0.25F, 0.0F, 3, 1, 10, 0.0F, false));

        this.cube_r33 = new AdvancedModelRendererExtended(this);
        this.cube_r33.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0873F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 96, 91, -1.5F, -1.0F, -10.0F, 3, 2, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 52, 0, -2.0F, -3.0F, 0.0F, 4, 6, 13, 0.0F, false));

        this.cube_r34 = new AdvancedModelRendererExtended(this);
        this.cube_r34.setRotationPoint(0.0F, 3.0F, 13.0F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 75, -1.5F, -1.0F, -13.0F, 3, 2, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.75F, 12.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 11, -1.5F, -2.0F, 0.0F, 3, 4, 15, 0.0F, false));

        this.cube_r35 = new AdvancedModelRendererExtended(this);
        this.cube_r35.setRotationPoint(0.0F, 2.0F, 15.0F);
        this.tail4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 55, 51, -1.0F, -1.0F, -15.0F, 2, 2, 15, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 68, 20, -1.0F, -2.0F, 0.0F, 2, 3, 14, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 31, 80, -0.5F, 1.0F, 0.0F, 1, 1, 14, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, -0.75F, 13.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.2182F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 78, -0.5F, -1.0F, 0.0F, 1, 2, 14, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 80, 91, -0.5F, 1.0F, 1.0F, 1, 2, 13, 0.0F, false));

        this.legLeft = new AdvancedModelRendererExtended(this);
        this.legLeft.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.hips.addChild(legLeft);
        this.setRotateAngle(legLeft, -0.3054F, 0.0F, 0.0F);
        this.legLeft.cubeList.add(new ModelBox(legLeft, 55, 89, -3.0F, -2.0F, -3.5F, 5, 13, 7, 0.0F, false));
        this.legLeft.cubeList.add(new ModelBox(legLeft, 0, 108, -2.5F, -2.0F, 3.5F, 4, 13, 1, 0.0F, false));

        this.legLeft2 = new AdvancedModelRendererExtended(this);
        this.legLeft2.setRotationPoint(0.0F, 10.0F, -2.5F);
        this.legLeft.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.8727F, 0.0F, 0.0F);
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 76, 107, -2.5F, 0.0F, -1.0F, 4, 12, 4, 0.0F, false));
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 0, 53, -2.0F, 1.0F, 3.0F, 3, 11, 1, 0.0F, false));

        this.legLeft3 = new AdvancedModelRendererExtended(this);
        this.legLeft3.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -0.7854F, 0.0F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 0, 78, -2.0F, 0.0F, -2.0F, 3, 7, 3, 0.0F, false));
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 78, 38, -1.5F, 0.0F, 1.0F, 2, 7, 1, 0.0F, false));

        this.footLeft = new AdvancedModelRendererExtended(this);
        this.footLeft.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.legLeft3.addChild(footLeft);
        this.setRotateAngle(footLeft, 0.3491F, 0.0F, 0.0F);
        this.footLeft.cubeList.add(new ModelBox(footLeft, 108, 0, -3.0F, -1.0F, -2.0F, 5, 2, 3, 0.0F, false));

        this.footLeft2 = new AdvancedModelRendererExtended(this);
        this.footLeft2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footLeft.addChild(footLeft2);
        this.footLeft2.cubeList.add(new ModelBox(footLeft2, 29, 31, -3.0F, -1.0F, -4.0F, 5, 2, 4, -0.001F, false));

        this.legRight = new AdvancedModelRendererExtended(this);
        this.legRight.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.hips.addChild(legRight);
        this.setRotateAngle(legRight, -0.3054F, 0.0F, 0.0F);
        this.legRight.cubeList.add(new ModelBox(legRight, 55, 89, -2.0F, -2.0F, -3.5F, 5, 13, 7, 0.0F, true));
        this.legRight.cubeList.add(new ModelBox(legRight, 0, 108, -1.5F, -2.0F, 3.5F, 4, 13, 1, 0.0F, true));

        this.legRight2 = new AdvancedModelRendererExtended(this);
        this.legRight2.setRotationPoint(0.0F, 10.0F, -2.5F);
        this.legRight.addChild(legRight2);
        this.setRotateAngle(legRight2, 0.8727F, 0.0F, 0.0F);
        this.legRight2.cubeList.add(new ModelBox(legRight2, 76, 107, -1.5F, 0.0F, -1.0F, 4, 12, 4, 0.0F, true));
        this.legRight2.cubeList.add(new ModelBox(legRight2, 0, 53, -1.0F, 1.0F, 3.0F, 3, 11, 1, 0.0F, true));

        this.legRight3 = new AdvancedModelRendererExtended(this);
        this.legRight3.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -0.7854F, 0.0F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 0, 78, -1.0F, 0.0F, -2.0F, 3, 7, 3, 0.0F, true));
        this.legRight3.cubeList.add(new ModelBox(legRight3, 78, 38, -0.5F, 0.0F, 1.0F, 2, 7, 1, 0.0F, true));

        this.footRight = new AdvancedModelRendererExtended(this);
        this.footRight.setRotationPoint(0.0F, 7.0F, -0.5F);
        this.legRight3.addChild(footRight);
        this.setRotateAngle(footRight, 0.3491F, 0.0F, 0.0F);
        this.footRight.cubeList.add(new ModelBox(footRight, 108, 0, -2.0F, -1.0F, -2.0F, 5, 2, 3, 0.0F, true));

        this.footRight2 = new AdvancedModelRendererExtended(this);
        this.footRight2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.footRight.addChild(footRight2);
        this.footRight2.cubeList.add(new ModelBox(footRight2, 29, 31, -2.0F, -1.0F, -4.0F, 5, 2, 4, -0.001F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraCryolophosaurus EntityMegalosaurus = (EntityPrehistoricFloraCryolophosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.armLeft, this.armLeft2, this.handLeft};
        AdvancedModelRenderer[] ArmR = {this.armRight, this.armRight2, this.handRight};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.armLeft, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.armRight, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.armLeft, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.armRight, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.5 + (((tickAnim - 4) / 4) * (1.96-(7.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.96 + (((tickAnim - 8) / 7) * (3.3-(1.96)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.3 + (((tickAnim - 15) / 5) * (0-(3.3)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 4) / 4) * (-8.04-(5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -8.04 + (((tickAnim - 8) / 12) * (0-(-8.04)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -17 + (((tickAnim - 3) / 1) * (-15-(-17)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 4) / 4) * (11.07-(-15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.07 + (((tickAnim - 8) / 3) * (11.6-(11.07)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.6 + (((tickAnim - 11) / 4) * (-1.49-(11.6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.49 + (((tickAnim - 15) / 5) * (0-(-1.49)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (26.61-(-12.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 26.61 + (((tickAnim - 8) / 3) * (29.35-(26.61)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 29.35 + (((tickAnim - 11) / 4) * (15.89-(29.35)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.89 + (((tickAnim - 15) / 5) * (0-(15.89)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 4) / 4) * (-18.57-(27.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -18.57 + (((tickAnim - 8) / 3) * (-8.31-(-18.57)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.31 + (((tickAnim - 11) / 4) * (-3.62-(-8.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.62 + (((tickAnim - 15) / 5) * (0-(-3.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.5 + (((tickAnim - 4) / 2) * (-20.36-(12.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.36 + (((tickAnim - 6) / 2) * (-6.4-(-20.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.4 + (((tickAnim - 8) / 3) * (6.71-(-6.4)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6.71 + (((tickAnim - 11) / 2) * (18.44-(6.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 18.44 + (((tickAnim - 13) / 4) * (11.5-(18.44)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11.5 + (((tickAnim - 17) / 3) * (0-(11.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 17.5 + (((tickAnim - 3) / 4) * (48.45-(17.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 48.45 + (((tickAnim - 7) / 2) * (0-(48.45)));
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




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(xx), handRight.rotateAngleY + (float) Math.toRadians(yy), handRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight2, footRight2.rotateAngleX + (float) Math.toRadians(xx), footRight2.rotateAngleY + (float) Math.toRadians(yy), footRight2.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*4), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*2);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*6), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-7), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-2));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*8), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-7), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-4), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*12), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-10), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*4), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*4), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*-13), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75))*-10), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-60))*-4), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-9), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-4), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-7), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*-10), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-190))*-10), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-190))*-15), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-210))*-4), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-210))*-4), tail6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -39.97365 + (((tickAnim - 0) / 3) * (-17.48956-(-39.97365)));
            yy = 1.5216 + (((tickAnim - 0) / 3) * (0.90566-(1.5216)));
            zz = 1.98385 + (((tickAnim - 0) / 3) * (3.82021-(1.98385)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.48956 + (((tickAnim - 3) / 5) * (12.47864-(-17.48956)));
            yy = 0.90566 + (((tickAnim - 3) / 5) * (-0.32621-(0.90566)));
            zz = 3.82021 + (((tickAnim - 3) / 5) * (7.49294-(3.82021)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 12.47864 + (((tickAnim - 8) / 1) * (13.74881-(12.47864)));
            yy = -0.32621 + (((tickAnim - 8) / 1) * (-0.05452-(-0.32621)));
            zz = 7.49294 + (((tickAnim - 8) / 1) * (2.49941-(7.49294)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 13.74881 + (((tickAnim - 9) / 1) * (6.53-(13.74881)));
            yy = -0.05452 + (((tickAnim - 9) / 1) * (0-(-0.05452)));
            zz = 2.49941 + (((tickAnim - 9) / 1) * (0-(2.49941)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.53 + (((tickAnim - 10) / 3) * (-33-(6.53)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -33 + (((tickAnim - 13) / 2) * (-39.97365-(-33)));
            yy = 0 + (((tickAnim - 13) / 2) * (1.5216-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (1.98385-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -1.33 + (((tickAnim - 0) / 3) * (-1.2-(-1.33)));
            zz = -2 + (((tickAnim - 0) / 3) * (-0.34-(-2)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -1.2 + (((tickAnim - 3) / 0) * (-2.26-(-1.2)));
            zz = -0.34 + (((tickAnim - 3) / 0) * (0-(-0.34)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2.26 + (((tickAnim - 3) / 2) * (-2.02-(-2.26)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.33-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -2.02 + (((tickAnim - 5) / 1) * (-0.575-(-2.02)));
            zz = 0.33 + (((tickAnim - 5) / 1) * (1.08-(0.33)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -0.575 + (((tickAnim - 6) / 1) * (1.47-(-0.575)));
            zz = 1.08 + (((tickAnim - 6) / 1) * (1.83-(1.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.47 + (((tickAnim - 7) / 1) * (0.625-(1.47)));
            zz = 1.83 + (((tickAnim - 7) / 1) * (2-(1.83)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 3) * (1-(0.625)));
            zz = 2 + (((tickAnim - 8) / 3) * (0-(2)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 11) / 4) * (-1.33-(1)));
            zz = 0 + (((tickAnim - 11) / 4) * (-2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(xx);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(yy);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (-16.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.25 + (((tickAnim - 2) / 1) * (10-(-16.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 3) / 5) * (22.5-(10)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22.5 + (((tickAnim - 8) / 3) * (45-(22.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 45 + (((tickAnim - 11) / 2) * (26.25-(45)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.25 + (((tickAnim - 13) / 2) * (7.5-(26.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5 + (((tickAnim - 0) / 2) * (10-(-5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 10 + (((tickAnim - 2) / 1) * (-7.5-(10)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 3) / 5) * (22.5-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 8) / 0) * (18.05-(22.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 18.05 + (((tickAnim - 8) / 1) * (8.33-(18.05)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 8.33 + (((tickAnim - 9) / 2) * (-57.5-(8.33)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -57.5 + (((tickAnim - 11) / 2) * (-42.5-(-57.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -42.5 + (((tickAnim - 13) / 2) * (-5-(-42.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 22.5 + (((tickAnim - 0) / 2) * (19.89247-(22.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (3.21154-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.83424-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.89247 + (((tickAnim - 2) / 1) * (0-(19.89247)));
            yy = 3.21154 + (((tickAnim - 2) / 1) * (0-(3.21154)));
            zz = -3.83424 + (((tickAnim - 2) / 1) * (-5-(-3.83424)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-20.82684-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.07234-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-4.99948-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -20.82684 + (((tickAnim - 5) / 1) * (24.82613-(-20.82684)));
            yy = -0.07234 + (((tickAnim - 5) / 1) * (-5.33449-(-0.07234)));
            zz = -4.99948 + (((tickAnim - 5) / 1) * (-5.27956-(-4.99948)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.82613 + (((tickAnim - 6) / 2) * (20-(24.82613)));
            yy = -5.33449 + (((tickAnim - 6) / 2) * (0-(-5.33449)));
            zz = -5.27956 + (((tickAnim - 6) / 2) * (0-(-5.27956)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 8) / 3) * (80-(20)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 80 + (((tickAnim - 11) / 4) * (22.5-(80)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.5 + (((tickAnim - 0) / 2) * (1.25-(7.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.25 + (((tickAnim - 2) / 1) * (0-(1.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-0.83-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.83 + (((tickAnim - 5) / 1) * (-59.42-(-0.83)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -59.42 + (((tickAnim - 6) / 2) * (5-(-59.42)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 5 + (((tickAnim - 8) / 3) * (41.25-(5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 41.25 + (((tickAnim - 11) / 4) * (7.5-(41.25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft2, footLeft2.rotateAngleX + (float) Math.toRadians(xx), footLeft2.rotateAngleY + (float) Math.toRadians(yy), footLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 14.97864 + (((tickAnim - 0) / 2) * (13.74881-(14.97864)));
            yy = 0.32621 + (((tickAnim - 0) / 2) * (0.05452-(0.32621)));
            zz = -7.49294 + (((tickAnim - 0) / 2) * (-2.49941-(-7.49294)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.74881 + (((tickAnim - 2) / 1) * (6.53-(13.74881)));
            yy = 0.05452 + (((tickAnim - 2) / 1) * (0-(0.05452)));
            zz = -2.49941 + (((tickAnim - 2) / 1) * (0-(-2.49941)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.53 + (((tickAnim - 3) / 3) * (-33-(6.53)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -33 + (((tickAnim - 6) / 2) * (-39.97365-(-33)));
            yy = 0 + (((tickAnim - 6) / 2) * (-1.5216-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-1.98385-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -39.97365 + (((tickAnim - 8) / 1) * (-25.26203-(-39.97365)));
            yy = -1.5216 + (((tickAnim - 8) / 1) * (-1.11097-(-1.5216)));
            zz = -1.98385 + (((tickAnim - 8) / 1) * (-3.20809-(-1.98385)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -25.26203 + (((tickAnim - 9) / 6) * (14.97864-(-25.26203)));
            yy = -1.11097 + (((tickAnim - 9) / 6) * (0.32621-(-1.11097)));
            zz = -3.20809 + (((tickAnim - 9) / 6) * (-7.49294-(-3.20809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            zz = 2 + (((tickAnim - 0) / 3) * (0-(2)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 5) * (-1.33-(1)));
            zz = 0 + (((tickAnim - 3) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -1.33 + (((tickAnim - 8) / 2) * (-1.2-(-1.33)));
            zz = -2 + (((tickAnim - 8) / 2) * (-0.34-(-2)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1.2 + (((tickAnim - 10) / 1) * (-2.26-(-1.2)));
            zz = -0.34 + (((tickAnim - 10) / 1) * (0-(-0.34)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -2.26 + (((tickAnim - 11) / 2) * (-2.02-(-2.26)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.33-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -2.02 + (((tickAnim - 13) / 0) * (-0.35-(-2.02)));
            zz = 0.33 + (((tickAnim - 13) / 0) * (1.08-(0.33)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 1) * (1.045-(-0.35)));
            zz = 1.08 + (((tickAnim - 13) / 1) * (1.83-(1.08)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.045 + (((tickAnim - 14) / 1) * (0-(1.045)));
            zz = 1.83 + (((tickAnim - 14) / 1) * (2-(1.83)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight.rotationPointX = this.legRight.rotationPointX + (float)(xx);
        this.legRight.rotationPointY = this.legRight.rotationPointY - (float)(yy);
        this.legRight.rotationPointZ = this.legRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.5 + (((tickAnim - 0) / 3) * (45-(22.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 45 + (((tickAnim - 3) / 3) * (26.25-(45)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.25 + (((tickAnim - 6) / 2) * (7.5-(26.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 7.5 + (((tickAnim - 8) / 1) * (-16.25-(7.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -16.25 + (((tickAnim - 9) / 2) * (10-(-16.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 11) / 4) * (22.5-(10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.5 + (((tickAnim - 0) / 1) * (18.05-(22.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 18.05 + (((tickAnim - 1) / 1) * (8.33-(18.05)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.33 + (((tickAnim - 2) / 1) * (-35-(8.33)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -35 + (((tickAnim - 3) / 3) * (-42.5-(-35)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -42.5 + (((tickAnim - 6) / 2) * (-5-(-42.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 8) / 1) * (10-(-5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 10 + (((tickAnim - 9) / 2) * (-7.5-(10)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -7.5 + (((tickAnim - 11) / 4) * (22.5-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 0) / 3) * (80-(20)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 80 + (((tickAnim - 3) / 3) * (78-(80)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 78 + (((tickAnim - 6) / 2) * (22.5-(78)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.5 + (((tickAnim - 8) / 1) * (19.89247-(22.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (-3.21154-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (3.83424-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 19.89247 + (((tickAnim - 9) / 2) * (0-(19.89247)));
            yy = -3.21154 + (((tickAnim - 9) / 2) * (0-(-3.21154)));
            zz = 3.83424 + (((tickAnim - 9) / 2) * (5-(3.83424)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-20.82684-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.07234-(0)));
            zz = 5 + (((tickAnim - 11) / 2) * (4.99948-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -20.82684 + (((tickAnim - 13) / 0) * (24.82613-(-20.82684)));
            yy = 0.07234 + (((tickAnim - 13) / 0) * (5.33449-(0.07234)));
            zz = 4.99948 + (((tickAnim - 13) / 0) * (5.27956-(4.99948)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 24.82613 + (((tickAnim - 13) / 2) * (20-(24.82613)));
            yy = 5.33449 + (((tickAnim - 13) / 2) * (0-(5.33449)));
            zz = 5.27956 + (((tickAnim - 13) / 2) * (0-(5.27956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 0) / 3) * (41.25-(5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 41.25 + (((tickAnim - 3) / 2) * (62.75-(41.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 62.75 + (((tickAnim - 5) / 3) * (7.5-(62.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 7.5 + (((tickAnim - 8) / 1) * (1.25-(7.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 1.25 + (((tickAnim - 9) / 2) * (0-(1.25)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-0.83-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -0.83 + (((tickAnim - 13) / 0) * (-53.42-(-0.83)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -53.42 + (((tickAnim - 13) / 2) * (5-(-53.42)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight2, footRight2.rotateAngleX + (float) Math.toRadians(xx), footRight2.rotateAngleY + (float) Math.toRadians(yy), footRight2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*7), armLeft.rotateAngleY + (float) Math.toRadians(0), armLeft.rotateAngleZ + (float) Math.toRadians(5-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*7)));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-20), armLeft2.rotateAngleY + (float) Math.toRadians(0), armLeft2.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+190))*10));
        this.setRotateAngle(handLeft, handLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2), handLeft.rotateAngleY + (float) Math.toRadians(0), handLeft.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-100))*8)));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5), armRight.rotateAngleY + (float) Math.toRadians(0), armRight.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-180))*5));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-150))*-20), armRight2.rotateAngleY + (float) Math.toRadians(0), armRight2.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+220))*-5));
        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-220))*12), handRight.rotateAngleY + (float) Math.toRadians(0), handRight.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-130))*8));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-180))*-1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-4), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*1);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-4), body.rotateAngleY + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*4), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-15))*-2), chest.rotateAngleY + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*4), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*12), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-6), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-900))*-6), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-6), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-6), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-6), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-6), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*-6), tail6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.12842 + (((tickAnim - 0) / 4) * (-17.28592-(-11.12842)));
            yy = 1.10152 + (((tickAnim - 0) / 4) * (1.67379-(1.10152)));
            zz = 2.24438 + (((tickAnim - 0) / 4) * (2.78923-(2.24438)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -17.28592 + (((tickAnim - 4) / 4) * (-12.41063-(-17.28592)));
            yy = 1.67379 + (((tickAnim - 4) / 4) * (2.30644-(1.67379)));
            zz = 2.78923 + (((tickAnim - 4) / 4) * (4.43745-(2.78923)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -12.41063 + (((tickAnim - 8) / 12) * (17.4905-(-12.41063)));
            yy = 2.30644 + (((tickAnim - 8) / 12) * (-0.21782-(2.30644)));
            zz = 4.43745 + (((tickAnim - 8) / 12) * (4.99527-(4.43745)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 17.4905 + (((tickAnim - 20) / 6) * (18.74644-(17.4905)));
            yy = -0.21782 + (((tickAnim - 20) / 6) * (-0.16346-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 20) / 6) * (2.49465-(4.99527)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 18.74644 + (((tickAnim - 26) / 2) * (14.88-(18.74644)));
            yy = -0.16346 + (((tickAnim - 26) / 2) * (0-(-0.16346)));
            zz = 2.49465 + (((tickAnim - 26) / 2) * (0-(2.49465)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 14.88 + (((tickAnim - 28) / 6) * (-2.5-(14.88)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (-2.5-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 34) / 6) * (-11.12842-(-2.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (1.10152-(0)));
            zz = -2.5 + (((tickAnim - 34) / 6) * (2.24438-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.13 + (((tickAnim - 0) / 4) * (0.25-(1.13)));
            zz = -1.36 + (((tickAnim - 0) / 4) * (-2-(-1.36)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.25 + (((tickAnim - 4) / 2) * (0.615-(0.25)));
            zz = -2 + (((tickAnim - 4) / 2) * (-1.68-(-2)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.615 + (((tickAnim - 6) / 2) * (0.335-(0.615)));
            zz = -1.68 + (((tickAnim - 6) / 2) * (-1.37-(-1.68)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.335 + (((tickAnim - 8) / 5) * (-0.36-(0.335)));
            zz = -1.37 + (((tickAnim - 8) / 5) * (-0.42-(-1.37)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.36 + (((tickAnim - 13) / 3) * (1.465-(-0.36)));
            zz = -0.42 + (((tickAnim - 13) / 3) * (0.21-(-0.42)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.465 + (((tickAnim - 16) / 2) * (1.655-(1.465)));
            zz = 0.21 + (((tickAnim - 16) / 2) * (0.61-(0.21)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.655 + (((tickAnim - 18) / 2) * (1-(1.655)));
            zz = 0.61 + (((tickAnim - 18) / 2) * (1-(0.61)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 14) * (-0.45-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 34) / 4) * (1.58-(1)));
            zz = -0.45 + (((tickAnim - 34) / 4) * (-1.1-(-0.45)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1.58 + (((tickAnim - 38) / 2) * (1.13-(1.58)));
            zz = -1.1 + (((tickAnim - 38) / 2) * (-1.36-(-1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(xx);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(yy);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -3.98 + (((tickAnim - 0) / 2) * (-16.61-(-3.98)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -16.61 + (((tickAnim - 2) / 2) * (-17.5-(-16.61)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 4) / 9) * (10.53-(-17.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 10.53 + (((tickAnim - 13) / 7) * (7.5-(10.53)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 20) / 13) * (45-(7.5)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 45 + (((tickAnim - 33) / 3) * (27.6-(45)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 27.6 + (((tickAnim - 36) / 4) * (-3.98-(27.6)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 4) / 2) * (-0.275-(0.15)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 2) * (-0.2-(-0.275)));
            zz = 0.425 + (((tickAnim - 6) / 2) * (0-(0.425)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 1) * (-0.275-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 9) / 2) * (-0.2-(-0.275)));
            zz = 0.425 + (((tickAnim - 9) / 2) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft2.rotationPointX = this.legLeft2.rotationPointX + (float)(xx);
        this.legLeft2.rotationPointY = this.legLeft2.rotationPointY - (float)(yy);
        this.legLeft2.rotationPointZ = this.legLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -13.84 + (((tickAnim - 0) / 2) * (-3.02643-(-13.84)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -3.02643 + (((tickAnim - 2) / 2) * (6.83-(-3.02643)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 6.83 + (((tickAnim - 4) / 9) * (-0.91-(6.83)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.91 + (((tickAnim - 13) / 7) * (30-(-0.91)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 30 + (((tickAnim - 20) / 6) * (5.45-(30)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 5.45 + (((tickAnim - 26) / 7) * (-62.5-(5.45)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -62.5 + (((tickAnim - 33) / 7) * (-13.84-(-62.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.07587 + (((tickAnim - 0) / 4) * (20.7354-(11.07587)));
            yy = 1.29103 + (((tickAnim - 0) / 4) * (1.46084-(1.29103)));
            zz = -2.14103 + (((tickAnim - 0) / 4) * (-1.36875-(-2.14103)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 20.7354 + (((tickAnim - 4) / 9) * (-8.55-(20.7354)));
            yy = 1.46084 + (((tickAnim - 4) / 9) * (0-(1.46084)));
            zz = -1.36875 + (((tickAnim - 4) / 9) * (0-(-1.36875)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -8.55 + (((tickAnim - 13) / 7) * (22.60882-(-8.55)));
            yy = 0 + (((tickAnim - 13) / 7) * (-3.68425-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-3.38262-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 22.60882 + (((tickAnim - 20) / 6) * (61.59-(22.60882)));
            yy = -3.68425 + (((tickAnim - 20) / 6) * (0-(-3.68425)));
            zz = -3.38262 + (((tickAnim - 20) / 6) * (0-(-3.38262)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 61.59 + (((tickAnim - 26) / 7) * (97.5-(61.59)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 97.5 + (((tickAnim - 33) / 5) * (5.54-(97.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 5.54 + (((tickAnim - 38) / 2) * (11.07587-(5.54)));
            yy = 0 + (((tickAnim - 38) / 2) * (1.29103-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (-2.14103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));

        this.footLeft.rotationPointX = this.footLeft.rotationPointX + (float)(0);
        this.footLeft.rotationPointY = this.footLeft.rotationPointY - (float)(0.15);
        this.footLeft.rotationPointZ = this.footLeft.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.57143 + (((tickAnim - 0) / 4) * (0.5-(6.57143)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0.5 + (((tickAnim - 4) / 9) * (-0.89474-(0.5)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.89474 + (((tickAnim - 13) / 7) * (-80-(-0.89474)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -80 + (((tickAnim - 20) / 6) * (-8.18-(-80)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -8.18 + (((tickAnim - 26) / 7) * (17.5-(-8.18)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 33) / 7) * (6.57143-(17.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft2, footLeft2.rotateAngleX + (float) Math.toRadians(xx), footLeft2.rotateAngleY + (float) Math.toRadians(yy), footLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.4905 + (((tickAnim - 0) / 6) * (16.24644-(17.4905)));
            yy = 0.21782 + (((tickAnim - 0) / 6) * (0.16346-(0.21782)));
            zz = -4.99527 + (((tickAnim - 0) / 6) * (-2.49465-(-4.99527)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 16.24644 + (((tickAnim - 6) / 2) * (12.38-(16.24644)));
            yy = 0.16346 + (((tickAnim - 6) / 2) * (0-(0.16346)));
            zz = -2.49465 + (((tickAnim - 6) / 2) * (0-(-2.49465)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.38 + (((tickAnim - 8) / 6) * (-2.5-(12.38)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (2.5-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 14) / 6) * (-11.12842-(-2.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (-1.10152-(0)));
            zz = 2.5 + (((tickAnim - 14) / 6) * (-2.24438-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -11.12842 + (((tickAnim - 20) / 4) * (-17.29166-(-11.12842)));
            yy = -1.10152 + (((tickAnim - 20) / 4) * (-1.53115-(-1.10152)));
            zz = -2.24438 + (((tickAnim - 20) / 4) * (-2.58383-(-2.24438)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -17.29166 + (((tickAnim - 24) / 4) * (-12.41063-(-17.29166)));
            yy = -1.53115 + (((tickAnim - 24) / 4) * (-2.30644-(-1.53115)));
            zz = -2.58383 + (((tickAnim - 24) / 4) * (-4.43745-(-2.58383)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -12.41063 + (((tickAnim - 28) / 12) * (17.4905-(-12.41063)));
            yy = -2.30644 + (((tickAnim - 28) / 12) * (0.21782-(-2.30644)));
            zz = -4.43745 + (((tickAnim - 28) / 12) * (-4.99527-(-4.43745)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 14) * (-0.45-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 14) / 4) * (1.58-(1)));
            zz = -0.45 + (((tickAnim - 14) / 4) * (-1.1-(-0.45)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 1.58 + (((tickAnim - 18) / 6) * (0.375-(1.58)));
            zz = -1.1 + (((tickAnim - 18) / 6) * (-2-(-1.1)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.375 + (((tickAnim - 24) / 2) * (0.545-(0.375)));
            zz = -2 + (((tickAnim - 24) / 2) * (-1.68-(-2)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.545 + (((tickAnim - 26) / 2) * (0.265-(0.545)));
            zz = -1.68 + (((tickAnim - 26) / 2) * (-1.37-(-1.68)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.265 + (((tickAnim - 28) / 5) * (-0.47-(0.265)));
            zz = -1.37 + (((tickAnim - 28) / 5) * (-0.42-(-1.37)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = -0.47 + (((tickAnim - 33) / 2) * (1.07-(-0.47)));
            zz = -0.42 + (((tickAnim - 33) / 2) * (0.05-(-0.42)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 1.07 + (((tickAnim - 35) / 2) * (1.775-(1.07)));
            zz = 0.05 + (((tickAnim - 35) / 2) * (0.37-(0.05)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 1.775 + (((tickAnim - 37) / 1) * (1.7-(1.775)));
            zz = 0.37 + (((tickAnim - 37) / 1) * (0.67-(0.37)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1.7 + (((tickAnim - 38) / 2) * (1-(1.7)));
            zz = 0.67 + (((tickAnim - 38) / 2) * (1-(0.67)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight.rotationPointX = this.legRight.rotationPointX + (float)(xx);
        this.legRight.rotationPointY = this.legRight.rotationPointY - (float)(yy);
        this.legRight.rotationPointZ = this.legRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 0) / 13) * (45-(7.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 45 + (((tickAnim - 13) / 3) * (27.6-(45)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 27.6 + (((tickAnim - 16) / 4) * (-3.98-(27.6)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -3.98 + (((tickAnim - 20) / 2) * (-16.61-(-3.98)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -16.61 + (((tickAnim - 22) / 2) * (-17.5-(-16.61)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -17.5 + (((tickAnim - 24) / 9) * (10.53-(-17.5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 10.53 + (((tickAnim - 33) / 7) * (7.5-(10.53)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 24) / 2) * (-0.275-(0.15)));
            zz = 0 + (((tickAnim - 24) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 26) / 2) * (-0.2-(-0.275)));
            zz = 0.425 + (((tickAnim - 26) / 2) * (0-(0.425)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 28) / 1) * (-0.275-(-0.2)));
            zz = 0 + (((tickAnim - 28) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 29) / 2) * (0.025-(-0.275)));
            zz = 0.425 + (((tickAnim - 29) / 2) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight2.rotationPointX = this.legRight2.rotationPointX + (float)(xx);
        this.legRight2.rotationPointY = this.legRight2.rotationPointY - (float)(yy);
        this.legRight2.rotationPointZ = this.legRight2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 30 + (((tickAnim - 0) / 6) * (5.45-(30)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 5.45 + (((tickAnim - 6) / 7) * (-62.5-(5.45)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -62.5 + (((tickAnim - 13) / 7) * (-13.84-(-62.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -13.84 + (((tickAnim - 20) / 2) * (-3.02643-(-13.84)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -3.02643 + (((tickAnim - 22) / 2) * (6.83-(-3.02643)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 6.83 + (((tickAnim - 24) / 9) * (-0.91-(6.83)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.91 + (((tickAnim - 33) / 7) * (30-(-0.91)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 22.60882 + (((tickAnim - 0) / 6) * (61.59-(22.60882)));
            yy = 3.68425 + (((tickAnim - 0) / 6) * (0-(3.68425)));
            zz = 3.38262 + (((tickAnim - 0) / 6) * (0-(3.38262)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 61.59 + (((tickAnim - 6) / 7) * (97.5-(61.59)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 97.5 + (((tickAnim - 13) / 5) * (5.54-(97.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.54 + (((tickAnim - 18) / 2) * (11.07587-(5.54)));
            yy = 0 + (((tickAnim - 18) / 2) * (-1.29103-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (2.14103-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 11.07587 + (((tickAnim - 20) / 4) * (24.89078-(11.07587)));
            yy = -1.29103 + (((tickAnim - 20) / 4) * (-3.53329-(-1.29103)));
            zz = 2.14103 + (((tickAnim - 20) / 4) * (3.54002-(2.14103)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 24.89078 + (((tickAnim - 24) / 9) * (-8.55-(24.89078)));
            yy = -3.53329 + (((tickAnim - 24) / 9) * (0-(-3.53329)));
            zz = 3.54002 + (((tickAnim - 24) / 9) * (0-(3.54002)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -8.55 + (((tickAnim - 33) / 7) * (22.60882-(-8.55)));
            yy = 0 + (((tickAnim - 33) / 7) * (3.68425-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (3.38262-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -80 + (((tickAnim - 0) / 6) * (-8.18-(-80)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -8.18 + (((tickAnim - 6) / 7) * (17.5-(-8.18)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 13) / 7) * (6.57143-(17.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 6.57143 + (((tickAnim - 20) / 4) * (-2.25-(6.57143)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -2.25 + (((tickAnim - 24) / 9) * (-0.89474-(-2.25)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.89474 + (((tickAnim - 33) / 7) * (-80-(-0.89474)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight2, footRight2.rotateAngleX + (float) Math.toRadians(xx), footRight2.rotateAngleY + (float) Math.toRadians(yy), footRight2.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), throatPouch3.rotateAngleY + (float) Math.toRadians(0), throatPouch3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-10), throatPouch2.rotateAngleY + (float) Math.toRadians(0), throatPouch2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-7), armLeft.rotateAngleY + (float) Math.toRadians(0), armLeft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+10))*13), armLeft2.rotateAngleY + (float) Math.toRadians(0), armLeft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(handLeft, handLeft.rotateAngleX + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*-7), handLeft.rotateAngleY + (float) Math.toRadians(0), handLeft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-7), armRight.rotateAngleY + (float) Math.toRadians(2.5), armRight.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*13), armRight2.rotateAngleY + (float) Math.toRadians(0), armRight2.rotateAngleZ + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2));
        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(00+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-7), handRight.rotateAngleY + (float) Math.toRadians(0), handRight.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*10));

    }


    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-12.5-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 40) / 20) * (-10-(-12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 60) / 20) * (0-(-10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 10) / 10) * (-2.5-(1.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 20) / 20) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 40) / 7) * (-6.67-(-5)));
            yy = 0 + (((tickAnim - 40) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -6.67 + (((tickAnim - 47) / 13) * (-2.5-(-6.67)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -7.5 + (((tickAnim - 40) / 20) * (-5-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 10) / 5) * (-8.75-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 15) / 5) * (-5-(-8.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 40) / 20) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 60) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.25 + (((tickAnim - 10) / 5) * (-10.62-(1.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.62 + (((tickAnim - 15) / 5) * (-2.5-(-10.62)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (-3.75-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 25) / 15) * (2.5-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 40) / 20) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -3.75 + (((tickAnim - 10) / 1) * (-0.31-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -0.31 + (((tickAnim - 11) / 4) * (1.88-(-0.31)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.88 + (((tickAnim - 15) / 3) * (-5.31-(1.88)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.31 + (((tickAnim - 18) / 2) * (-17.5-(-5.31)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 20) / 5) * (-19.37-(-17.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -19.37 + (((tickAnim - 25) / 15) * (-15-(-19.37)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15 + (((tickAnim - 40) / 20) * (-17.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.5 + (((tickAnim - 60) / 20) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 8.75 + (((tickAnim - 10) / 5) * (20.63-(8.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.63 + (((tickAnim - 15) / 3) * (11.57-(20.63)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.57 + (((tickAnim - 18) / 2) * (-2.5-(11.57)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.5 + (((tickAnim - 20) / 5) * (0.63-(-2.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0.63 + (((tickAnim - 25) / 15) * (0-(0.63)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 20) / 20) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(2.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 40) / 20) * (2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 60) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10 + (((tickAnim - 40) / 40) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(xx), throatPouch3.rotateAngleY + (float) Math.toRadians(yy), throatPouch3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10 + (((tickAnim - 40) / 40) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*10)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(xx), throatPouch.rotateAngleY + (float) Math.toRadians(yy), throatPouch.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 0) / 40) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10-(5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10 + (((tickAnim - 40) / 40) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(xx), throatPouch2.rotateAngleY + (float) Math.toRadians(yy), throatPouch2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 20) / 20) * (15-(12.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 40) / 20) * (12.5-(15)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 12.5 + (((tickAnim - 60) / 20) * (0-(12.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (12.5-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 40) / 20) * (10-(12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (12.5-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 40) / 20) * (10-(12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.11-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5.11 + (((tickAnim - 13) / 7) * (20.11-(5.11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 51) {
            xx = 20.11 + (((tickAnim - 20) / 31) * (27.61-(20.11)));
            yy = 0 + (((tickAnim - 20) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 31) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 27.61 + (((tickAnim - 51) / 29) * (0-(27.61)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.66-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 7.66 + (((tickAnim - 13) / 19) * (32.66918-(7.66)));
            yy = 0 + (((tickAnim - 13) / 19) * (0.42711-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (2.46327-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 51) {
            xx = 32.66918 + (((tickAnim - 32) / 19) * (37.66918-(32.66918)));
            yy = 0.42711 + (((tickAnim - 32) / 19) * (0.42711-(0.42711)));
            zz = 2.46327 + (((tickAnim - 32) / 19) * (2.46327-(2.46327)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 37.66918 + (((tickAnim - 51) / 8) * (31.90656-(37.66918)));
            yy = 0.42711 + (((tickAnim - 51) / 8) * (0.30508-(0.42711)));
            zz = 2.46327 + (((tickAnim - 51) / 8) * (1.75948-(2.46327)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 31.90656 + (((tickAnim - 59) / 21) * (0-(31.90656)));
            yy = 0.30508 + (((tickAnim - 59) / 21) * (0-(0.30508)));
            zz = 1.75948 + (((tickAnim - 59) / 21) * (0-(1.75948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 13) / 19) * (10-(0)));
            yy = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (-5-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 53) {
            xx = 10 + (((tickAnim - 32) / 21) * (18.01724-(10)));
            yy = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            zz = -5 + (((tickAnim - 32) / 21) * (-2.75862-(-5)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 18.01724 + (((tickAnim - 53) / 27) * (0-(18.01724)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = -2.75862 + (((tickAnim - 53) / 27) * (0-(-2.75862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handLeft, handLeft.rotateAngleX + (float) Math.toRadians(xx), handLeft.rotateAngleY + (float) Math.toRadians(yy), handLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.11-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5.11 + (((tickAnim - 13) / 7) * (20.11-(5.11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 51) {
            xx = 20.11 + (((tickAnim - 20) / 31) * (27.61-(20.11)));
            yy = 0 + (((tickAnim - 20) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 31) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 27.61 + (((tickAnim - 51) / 29) * (0-(27.61)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.66-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 7.66 + (((tickAnim - 13) / 19) * (32.66918-(7.66)));
            yy = 0 + (((tickAnim - 13) / 19) * (-0.42711-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (-2.46327-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 51) {
            xx = 32.66918 + (((tickAnim - 32) / 19) * (37.66918-(32.66918)));
            yy = -0.42711 + (((tickAnim - 32) / 19) * (-0.42711-(-0.42711)));
            zz = -2.46327 + (((tickAnim - 32) / 19) * (-2.46327-(-2.46327)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 37.66918 + (((tickAnim - 51) / 8) * (31.90656-(37.66918)));
            yy = -0.42711 + (((tickAnim - 51) / 8) * (-0.30508-(-0.42711)));
            zz = -2.46327 + (((tickAnim - 51) / 8) * (-1.75948-(-2.46327)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 31.90656 + (((tickAnim - 59) / 21) * (0-(31.90656)));
            yy = -0.30508 + (((tickAnim - 59) / 21) * (0-(-0.30508)));
            zz = -1.75948 + (((tickAnim - 59) / 21) * (0-(-1.75948)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 13) / 19) * (10-(0)));
            yy = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 19) * (5-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 53) {
            xx = 10 + (((tickAnim - 32) / 21) * (18.01724-(10)));
            yy = 0 + (((tickAnim - 32) / 21) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 21) * (2.75862-(5)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 18.01724 + (((tickAnim - 53) / 27) * (0-(18.01724)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 2.75862 + (((tickAnim - 53) / 27) * (0-(2.75862)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(xx), handRight.rotateAngleY + (float) Math.toRadians(yy), handRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1.75 + (((tickAnim - 20) / 20) * (6-(1.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6 + (((tickAnim - 40) / 20) * (7.25-(6)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 7.25 + (((tickAnim - 60) / 20) * (0-(7.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 9 + (((tickAnim - 20) / 20) * (12.5-(9)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 40) / 20) * (14.55304-(12.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (4.84035-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (1.25489-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 14.55304 + (((tickAnim - 60) / 20) * (0-(14.55304)));
            yy = 4.84035 + (((tickAnim - 60) / 20) * (0-(4.84035)));
            zz = 1.25489 + (((tickAnim - 60) / 20) * (0-(1.25489)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 20) / 40) * (-0.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -0.75 + (((tickAnim - 60) / 10) * (13.63-(-0.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 13.63 + (((tickAnim - 70) / 10) * (0-(13.63)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = -10.25 + (((tickAnim - 20) / 40) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (18-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 18 + (((tickAnim - 70) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 10) / 10) * (-9-(-6)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -9 + (((tickAnim - 20) / 17) * (2-(-9)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
            xx = 2 + (((tickAnim - 37) / 10) * (5-(2)));
            yy = 0 + (((tickAnim - 37) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 10) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 47) / 13) * (0-(5)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 10) / 10) * (-9.25-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -9.25 + (((tickAnim - 20) / 17) * (-2.25-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
            xx = -2.25 + (((tickAnim - 37) / 10) * (4-(-2.25)));
            yy = 0 + (((tickAnim - 37) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 10) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 4 + (((tickAnim - 47) / 13) * (0-(4)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 12) / 8) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = -10.25 + (((tickAnim - 20) / 22) * (10.25-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 10.25 + (((tickAnim - 42) / 18) * (0-(10.25)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 12) / 8) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = -6.25 + (((tickAnim - 20) / 22) * (20-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 20 + (((tickAnim - 42) / 5) * (17.05-(20)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 17.05 + (((tickAnim - 47) / 13) * (0-(17.05)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.3-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 1.3 + (((tickAnim - 5) / 7) * (-6.5-(1.3)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -6.5 + (((tickAnim - 12) / 8) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = -6.5 + (((tickAnim - 20) / 22) * (-14.25-(-6.5)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -14.25 + (((tickAnim - 42) / 5) * (-4.36-(-14.25)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -4.36 + (((tickAnim - 47) / 13) * (0-(-4.36)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.61-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 12.61 + (((tickAnim - 5) / 7) * (-9-(12.61)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 12) / 8) * (-9-(-9)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = -9 + (((tickAnim - 20) / 22) * (-18-(-9)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = -18 + (((tickAnim - 42) / 5) * (-8.09-(-18)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -8.09 + (((tickAnim - 47) / 6) * (3.95-(-8.09)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 3.95 + (((tickAnim - 53) / 7) * (0-(3.95)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 2.5 + (((tickAnim - 13) / 16) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2-(2.5)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 16) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2 + (((tickAnim - 29) / 15) * (2.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720))*2)));
            yy = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 15) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 44) / 16) * (0-(2.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(throatPouch3, throatPouch3.rotateAngleX + (float) Math.toRadians(0), throatPouch3.rotateAngleY + (float) Math.toRadians(0), throatPouch3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throatPouch, throatPouch.rotateAngleX + (float) Math.toRadians(0), throatPouch.rotateAngleY + (float) Math.toRadians(0), throatPouch.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 0) / 30) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10-(5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10 + (((tickAnim - 30) / 30) * (5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1440+30))*-10)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throatPouch2, throatPouch2.rotateAngleX + (float) Math.toRadians(xx), throatPouch2.rotateAngleY + (float) Math.toRadians(yy), throatPouch2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 2.25 + (((tickAnim - 29) / 31) * (0-(2.25)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(0), legLeft.rotateAngleY + (float) Math.toRadians(0), legLeft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(0), legRight.rotateAngleY + (float) Math.toRadians(0), legRight.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 20) / 20) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 18.5 + (((tickAnim - 40) / 20) * (0-(18.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 35 + (((tickAnim - 20) / 20) * (35-(35)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 35 + (((tickAnim - 40) / 20) * (0-(35)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(handLeft, handLeft.rotateAngleX + (float) Math.toRadians(0), handLeft.rotateAngleY + (float) Math.toRadians(0), handLeft.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 20) / 20) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 18.5 + (((tickAnim - 40) / 20) * (0-(18.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 35 + (((tickAnim - 20) / 20) * (35-(35)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 35 + (((tickAnim - 40) / 20) * (0-(35)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(0), handRight.rotateAngleY + (float) Math.toRadians(0), handRight.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 29) / 31) * (0-(5)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = -1.5 + (((tickAnim - 29) / 18) * (8.7-(-1.5)));
            yy = 0 + (((tickAnim - 29) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 18) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 8.7 + (((tickAnim - 47) / 13) * (0-(8.7)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = -2.5 + (((tickAnim - 29) / 18) * (11.78-(-2.5)));
            yy = 0 + (((tickAnim - 29) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 18) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 11.78 + (((tickAnim - 47) / 5) * (11.34-(11.78)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 11.34 + (((tickAnim - 52) / 8) * (0-(11.34)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 47) {
            xx = -5.75 + (((tickAnim - 29) / 18) * (16.03-(-5.75)));
            yy = 0 + (((tickAnim - 29) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 18) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 16.03 + (((tickAnim - 47) / 5) * (13.88-(16.03)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 13.88 + (((tickAnim - 52) / 8) * (0-(13.88)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 4.25 + (((tickAnim - 29) / 31) * (0-(4.25)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(4), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-720))*-1));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0.60681), neck.rotateAngleY + (float) Math.toRadians(-2.28+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), neck.rotateAngleZ + (float) Math.toRadians(10.2559+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0.28486), neck2.rotateAngleY + (float) Math.toRadians(-8.0037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-150))*-1), neck2.rotateAngleZ + (float) Math.toRadians(4.6499+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0.8609), neck3.rotateAngleY + (float) Math.toRadians(-18.2291+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-155))*-1), neck3.rotateAngleZ + (float) Math.toRadians(-0.9738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -1.60186 + (((tickAnim - 0) / 50) * (-1.60186-(-1.60186)));
            yy = -18.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4 + (((tickAnim - 0) / 50) * (-18.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4-(-18.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-500))*-4)));
            zz = 4.3584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))* + (((tickAnim - 0) / 50) * (4.3584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200))*-(4.3584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*108/0.75-200)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 15.25 + (((tickAnim - 27) / 23) * (0-(15.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = -34.25 + (((tickAnim - 27) / 23) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.25 + (((tickAnim - 0) / 5) * (-12.5-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.5 + (((tickAnim - 5) / 5) * (-1.2701-(-12.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (-2.60395-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.88457-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -1.2701 + (((tickAnim - 10) / 15) * (33.57674-(-1.2701)));
            yy = -2.60395 + (((tickAnim - 10) / 15) * (-5.52655-(-2.60395)));
            zz = 0.88457 + (((tickAnim - 10) / 15) * (-1.58985-(0.88457)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 33.57674 + (((tickAnim - 25) / 6) * (30.36394-(33.57674)));
            yy = -5.52655 + (((tickAnim - 25) / 6) * (-6.09433-(-5.52655)));
            zz = -1.58985 + (((tickAnim - 25) / 6) * (-1.38886-(-1.58985)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 30.36394 + (((tickAnim - 31) / 9) * (12.29-(30.36394)));
            yy = -6.09433 + (((tickAnim - 31) / 9) * (0-(-6.09433)));
            zz = -1.38886 + (((tickAnim - 31) / 9) * (0-(-1.38886)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 12.29 + (((tickAnim - 40) / 4) * (0.25-(12.29)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 44) / 6) * (-18.25-(0.25)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(xx);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(yy);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 0) / 5) * (-16.5-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -16.5 + (((tickAnim - 5) / 6) * (0.25-(-16.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.25 + (((tickAnim - 11) / 7) * (8.1-(0.25)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 8.1 + (((tickAnim - 18) / 4) * (2.93-(8.1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 2.93 + (((tickAnim - 22) / 3) * (-8-(2.93)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -8 + (((tickAnim - 25) / 6) * (10.4-(-8)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 10.4 + (((tickAnim - 31) / 6) * (37.5-(10.4)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 37.5 + (((tickAnim - 37) / 6) * (22.69-(37.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 22.69 + (((tickAnim - 43) / 7) * (-0.5-(22.69)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (19.5-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.5 + (((tickAnim - 5) / 3) * (7.95-(19.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.95 + (((tickAnim - 8) / 3) * (0.75-(7.95)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0.75 + (((tickAnim - 11) / 7) * (-1.54-(0.75)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1.54 + (((tickAnim - 18) / 4) * (0.48-(-1.54)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0.48 + (((tickAnim - 22) / 6) * (14.7-(0.48)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 14.7 + (((tickAnim - 28) / 3) * (20.39-(14.7)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 44) {
            xx = 20.39 + (((tickAnim - 31) / 13) * (-54.58-(20.39)));
            yy = 0 + (((tickAnim - 31) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 13) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -54.58 + (((tickAnim - 44) / 6) * (-8-(-54.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (3.5-(16.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.5 + (((tickAnim - 8) / 3) * (-3.00976-(3.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.58463-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-1.91268-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -3.00976 + (((tickAnim - 11) / 2) * (-8.61-(-3.00976)));
            yy = 0.58463 + (((tickAnim - 11) / 2) * (0-(0.58463)));
            zz = -1.91268 + (((tickAnim - 11) / 2) * (0-(-1.91268)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.61 + (((tickAnim - 13) / 1) * (-0.85-(-8.61)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -0.85 + (((tickAnim - 14) / 8) * (39.75-(-0.85)));
            yy = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 39.75 + (((tickAnim - 22) / 3) * (71-(39.75)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 71 + (((tickAnim - 25) / 3) * (76.75-(71)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 76.75 + (((tickAnim - 28) / 3) * (71-(76.75)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 71 + (((tickAnim - 31) / 9) * (91.5-(71)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 91.5 + (((tickAnim - 40) / 10) * (16.75-(91.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 3) * (-0.025-(0.375)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = -0.025 + (((tickAnim - 11) / 7) * (-0.145-(-0.025)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = -0.145 + (((tickAnim - 18) / 7) * (0.15-(-0.145)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0.15 + (((tickAnim - 25) / 15) * (0-(0.15)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footLeft.rotationPointX = this.footLeft.rotationPointX + (float)(xx);
        this.footLeft.rotationPointY = this.footLeft.rotationPointY - (float)(yy);
        this.footLeft.rotationPointZ = this.footLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.75 + (((tickAnim - 0) / 5) * (-6.5-(12.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 5) / 3) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-37.28-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -37.28 + (((tickAnim - 18) / 4) * (-68.39-(-37.28)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -68.39 + (((tickAnim - 22) / 3) * (-104.5-(-68.39)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -104.5 + (((tickAnim - 25) / 3) * (-103.05-(-104.5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -103.05 + (((tickAnim - 28) / 1) * (-81.74-(-103.05)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -81.74 + (((tickAnim - 29) / 2) * (-35.92-(-81.74)));
            yy = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 2) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -35.92 + (((tickAnim - 31) / 3) * (56.08-(-35.92)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 56.08 + (((tickAnim - 34) / 4) * (54.33-(56.08)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 54.33 + (((tickAnim - 38) / 12) * (12.75-(54.33)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft2, footLeft2.rotateAngleX + (float) Math.toRadians(xx), footLeft2.rotateAngleY + (float) Math.toRadians(yy), footLeft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0.4 + (((tickAnim - 25) / 3) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footLeft2.rotationPointX = this.footLeft2.rotationPointX + (float)(xx);
        this.footLeft2.rotationPointY = this.footLeft2.rotationPointY - (float)(yy);
        this.footLeft2.rotationPointZ = this.footLeft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight2, footRight2.rotateAngleX + (float) Math.toRadians(xx), footRight2.rotateAngleY + (float) Math.toRadians(yy), footRight2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-17-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-17 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-17)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 15) / 8) * (5.75-(-8)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 5.75 + (((tickAnim - 23) / 2) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 5.75 + (((tickAnim - 25) / 4) * (-6.92-(5.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -6.92 + (((tickAnim - 29) / 4) * (0-(-6.92)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (10.5-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 10.5 + (((tickAnim - 23) / 2) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 10.5 + (((tickAnim - 25) / 6) * (-2.29-(10.5)));
            yy = 0 + (((tickAnim - 25) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -2.29 + (((tickAnim - 31) / 4) * (0-(-2.29)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (18.25-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 18.25 + (((tickAnim - 23) / 2) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 18.25 + (((tickAnim - 25) / 8) * (0.11-(18.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0.11 + (((tickAnim - 33) / 4) * (0-(0.11)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryolophosaurus entity = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = -2.425 + (((tickAnim - 9) / 9) * (-4.47-(-2.425)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -4.47 + (((tickAnim - 18) / 13) * (-4.47-(-4.47)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 31) / 11) * (0-(0)));
            yy = -4.47 + (((tickAnim - 31) / 11) * (-2.425-(-4.47)));
            zz = 0 + (((tickAnim - 31) / 11) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.425 + (((tickAnim - 42) / 8) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-9.54584-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (19.09042-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (3.78463-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -9.54584 + (((tickAnim - 19) / 9) * (-9.54584-(-9.54584)));
            yy = 19.09042 + (((tickAnim - 19) / 9) * (19.09042-(19.09042)));
            zz = 3.78463 + (((tickAnim - 19) / 9) * (3.78463-(3.78463)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -9.54584 + (((tickAnim - 28) / 22) * (0-(-9.54584)));
            yy = 19.09042 + (((tickAnim - 28) / 22) * (0-(19.09042)));
            zz = 3.78463 + (((tickAnim - 28) / 22) * (0-(3.78463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 32 + (((tickAnim - 19) / 9) * (32-(32)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 28) / 22) * (0-(32)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -26.5 + (((tickAnim - 19) / 9) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 28) / 22) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 6.25 + (((tickAnim - 19) / 9) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 28) / 22) * (0-(6.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.365-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.365 + (((tickAnim - 5) / 5) * (0.625-(0.365)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.625 + (((tickAnim - 10) / 5) * (0.565-(0.625)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.565 + (((tickAnim - 15) / 2) * (0.455-(0.565)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.455 + (((tickAnim - 17) / 2) * (0-(0.455)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0.865-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.865 + (((tickAnim - 33) / 6) * (1.1-(0.865)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 1.1 + (((tickAnim - 39) / 6) * (0.665-(1.1)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0.665 + (((tickAnim - 45) / 3) * (0.455-(0.665)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.455 + (((tickAnim - 48) / 2) * (0-(0.455)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footRight.rotationPointX = this.footRight.rotationPointX + (float)(xx);
        this.footRight.rotationPointY = this.footRight.rotationPointY - (float)(yy);
        this.footRight.rotationPointZ = this.footRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight2, footRight2.rotateAngleX + (float) Math.toRadians(xx), footRight2.rotateAngleY + (float) Math.toRadians(yy), footRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -7 + (((tickAnim - 19) / 9) * (-7-(-7)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 28) / 22) * (0-(-7)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 19) / 9) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 10) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (5.42-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5.42 + (((tickAnim - 38) / 12) * (0-(5.42)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 16) * (0-(0)));
            zz = -6 + (((tickAnim - 13) / 16) * (0-(-6)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 38) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.55933-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-4.63358-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.17494-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 0.55933 + (((tickAnim - 13) / 16) * (0-(0.55933)));
            yy = -4.63358 + (((tickAnim - 13) / 16) * (0-(-4.63358)));
            zz = -6.17494 + (((tickAnim - 13) / 16) * (0-(-6.17494)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (4.5-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 4.5 + (((tickAnim - 38) / 5) * (6-(4.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 43) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 25) / 5) * (12-(12)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 30) / 20) * (0-(12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -26.75 + (((tickAnim - 25) / 5) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 30) / 20) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 25) / 5) * (12-(12)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 30) / 20) * (0-(12)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -26.75 + (((tickAnim - 25) / 5) * (-26.75-(-26.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -26.75 + (((tickAnim - 30) / 20) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -6 + (((tickAnim - 19) / 9) * (-6-(-6)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 28) / 22) * (0-(-6)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 27) / 9) * (-2-(0)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 36) / 14) * (0-(-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 19) / 9) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 3 + (((tickAnim - 28) / 8) * (-1.05-(3)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -1.05 + (((tickAnim - 36) / 7) * (-3.56-(-1.05)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.56 + (((tickAnim - 43) / 7) * (0-(-3.56)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 8.5 + (((tickAnim - 19) / 9) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 8.5 + (((tickAnim - 28) / 8) * (1.27-(8.5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 1.27 + (((tickAnim - 36) / 7) * (-4.58-(1.27)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -4.58 + (((tickAnim - 43) / 7) * (0-(-4.58)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 7.5 + (((tickAnim - 19) / 9) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 28) / 22) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-9.54584-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-19.0904-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (3.78463-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -9.54584 + (((tickAnim - 19) / 9) * (-9.54584-(-9.54584)));
            yy = -19.0904 + (((tickAnim - 19) / 9) * (-19.0904-(-19.0904)));
            zz = 3.78463 + (((tickAnim - 19) / 9) * (3.78463-(3.78463)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -9.54584 + (((tickAnim - 28) / 22) * (0-(-9.54584)));
            yy = -19.0904 + (((tickAnim - 28) / 22) * (0-(-19.0904)));
            zz = 3.78463 + (((tickAnim - 28) / 22) * (0-(3.78463)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 32 + (((tickAnim - 19) / 9) * (32-(32)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 32 + (((tickAnim - 28) / 22) * (0-(32)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-27.16286-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-5.45194-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-1.83003-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -27.16286 + (((tickAnim - 19) / 9) * (-27.16286-(-27.16286)));
            yy = -5.45194 + (((tickAnim - 19) / 9) * (-5.45194-(-5.45194)));
            zz = -1.83003 + (((tickAnim - 19) / 9) * (-1.83003-(-1.83003)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.16286 + (((tickAnim - 28) / 22) * (0-(-27.16286)));
            yy = -5.45194 + (((tickAnim - 28) / 22) * (0-(-5.45194)));
            zz = -1.83003 + (((tickAnim - 28) / 22) * (0-(-1.83003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 4.75 + (((tickAnim - 19) / 9) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 28) / 22) * (0-(4.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.295-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.295 + (((tickAnim - 5) / 5) * (0.575-(0.295)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 5) * (0.565-(0.575)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.565 + (((tickAnim - 15) / 2) * (0.455-(0.565)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.455 + (((tickAnim - 17) / 2) * (0-(0.455)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (0.775-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            yy = 0.775 + (((tickAnim - 33) / 6) * (0.875-(0.775)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0.875 + (((tickAnim - 39) / 6) * (0.615-(0.875)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0.615 + (((tickAnim - 45) / 3) * (0.3-(0.615)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 48) / 2) * (0-(0.3)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.footLeft.rotationPointX = this.footLeft.rotationPointX + (float)(xx);
        this.footLeft.rotationPointY = this.footLeft.rotationPointY - (float)(yy);
        this.footLeft.rotationPointZ = this.footLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.23-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 5.23 + (((tickAnim - 23) / 20) * (7.25-(5.23)));
            yy = 0 + (((tickAnim - 23) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 20) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 43) / 7) * (0-(7.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCryolophosaurus ee = (EntityPrehistoricFloraCryolophosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCryolophosaurus e = (EntityPrehistoricFloraCryolophosaurus) entity;



    }
}
