package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRechnisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRechnisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftTusk;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer rightTusk;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;


    private ModelAnimator animator;

    public ModelRechnisaurus() {
        this.textureWidth = 150;
        this.textureHeight = 140;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -4.9518F, 8.771F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.9518F, 15.229F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 61, 0, -6.0F, -0.1487F, -14.8175F, 12, 2, 15, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.0482F, 1.229F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 46, -8.0F, -0.25F, -1.5F, 16, 15, 16, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 4.9518F, 14.229F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.7418F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 56, 120, -3.0F, 0.0F, -4.0F, 6, 9, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 39, -2.0F, 0.0F, -3.0F, 4, 7, 3, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(8.0F, 6.7018F, 6.729F);
        this.hips.addChild(legL);
        this.setRotateAngle(legL, -0.215F, 0.0376F, -0.3531F);
        this.legL.cubeList.add(new ModelBox(legL, 30, 99, -4.5359F, -2.0474F, -4.0671F, 6, 13, 9, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(-1.0283F, 10.5459F, -3.7772F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.3681F, -0.0541F, 0.3185F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 108, -3.3117F, -0.2336F, 0.0125F, 5, 12, 7, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.6698F, 11.5821F, 4.9145F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.1744F, 0.0061F, 0.0344F);
        this.legL3.cubeList.add(new ModelBox(legL3, 96, 78, -5.091F, -0.6055F, -9.9906F, 8, 3, 11, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-8.0F, 6.7018F, 6.729F);
        this.hips.addChild(legR);
        this.setRotateAngle(legR, -0.215F, -0.0376F, 0.3531F);
        this.legR.cubeList.add(new ModelBox(legR, 30, 99, -1.4641F, -2.0474F, -4.0671F, 6, 13, 9, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(1.0283F, 10.5459F, -3.7772F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.3681F, 0.0541F, -0.3185F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 108, -1.6883F, -0.2336F, 0.0125F, 5, 12, 7, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.6698F, 11.5821F, 4.9145F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.1744F, -0.0061F, -0.0344F);
        this.legR3.cubeList.add(new ModelBox(legR3, 96, 78, -2.909F, -0.6055F, -9.9906F, 8, 3, 11, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.834F, 0.32F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -10.5F, -0.2143F, -17.091F, 21, 20, 18, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.2143F, 0.909F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -9.5F, -0.5F, -17.7F, 19, 4, 18, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 4.7863F, -17.6845F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.0006F, 0.5935F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 78, -7.5F, -0.5F, -11.5F, 15, 17, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 62, -9.5F, -0.5F, -6.5F, 19, 17, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -7.4006F, 0.9935F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 101, 0, -6.5F, -0.1207F, -12.5479F, 13, 4, 6, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 32, -8.5F, -0.1207F, -6.5479F, 17, 4, 7, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-8.15F, 7.9994F, -6.3065F);
        this.chest.addChild(armR);
        this.setRotateAngle(armR, 0.7219F, -0.6769F, 0.4505F);
        this.armR.cubeList.add(new ModelBox(armR, 61, 101, -1.5F, -1.0F, -3.75F, 6, 11, 7, 0.0F, true));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(3.2F, 10.0F, 0.8F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -1.1571F, 0.2507F, -0.9071F);
        this.armR2.cubeList.add(new ModelBox(armR2, 88, 112, -3.0F, -1.15F, -5.85F, 6, 11, 6, 0.0F, true));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(0.0776F, 9.6982F, -0.5231F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.1801F, -0.1688F, -0.048F);
        this.armR3.cubeList.add(new ModelBox(armR3, 79, 18, -4.2412F, -0.6215F, -8.9477F, 8, 3, 10, 0.0F, true));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(8.15F, 7.9994F, -6.3065F);
        this.chest.addChild(armL);
        this.setRotateAngle(armL, 0.7219F, 0.6769F, -0.4505F);
        this.armL.cubeList.add(new ModelBox(armL, 61, 101, -4.5F, -1.0F, -3.75F, 6, 11, 7, 0.0F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(-3.2F, 10.0F, 0.8F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -1.1571F, -0.2507F, 0.9071F);
        this.armL2.cubeList.add(new ModelBox(armL2, 88, 112, -3.0F, -1.15F, -5.85F, 6, 11, 6, 0.0F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(-0.0776F, 9.6982F, -0.5231F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.1801F, 0.1688F, 0.048F);
        this.armL3.cubeList.add(new ModelBox(armL3, 79, 18, -3.7588F, -0.6215F, -8.9477F, 8, 3, 10, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5006F, -9.4065F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 88, -6.0F, 0.8743F, -3.6084F, 12, 12, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.6073F, -7.2658F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 88, 93, -4.5F, -0.3106F, -0.212F, 9, 10, 8, -0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 7.5743F, -1.0584F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.3491F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 108, 44, -6.0F, -7.625F, -4.7446F, 12, 7, 5, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.0F, -6.325F, -9.7446F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, -0.48F, -0.0436F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 62, 0.9F, -0.45F, -0.55F, 2, 4, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.0F, -4.125F, -5.2446F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5672F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.3F, -3.5F, -4.5F, 3, 7, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, -6.325F, -9.7446F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.48F, 0.0436F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 62, -2.9F, -0.45F, -0.55F, 2, 4, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0836F, -13.9088F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.7453F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 57, 39, -2.0F, -1.7F, -1.3F, 4, 7, 3, 0.004F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.0F, -3.725F, -16.0446F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9338F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 61, 8, 2.5F, -0.0671F, -0.0364F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, -6.325F, -7.7446F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7418F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 113, 124, 1.0F, -3.375F, -7.9F, 4, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -6.9254F, -13.7268F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4451F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 108, -0.5F, -0.009F, 0.0392F, 1, 1, 3, 0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -7.1254F, -10.7268F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5236F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 78, -2.5F, -0.0299F, -2.9675F, 5, 5, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -8.2254F, -11.0268F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1222F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 79, 18, -0.5F, -0.0253F, -0.0096F, 1, 6, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7145F, 0.2955F, -0.7241F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 50, -0.7563F, -0.3412F, -0.5867F, 1, 2, 4, 0.003F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6364F, 0.0971F, -0.9525F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 101, 0.1759F, -0.4751F, 3.1607F, 1, 2, 3, 0.003F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1303F, 0.0971F, -0.9525F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 50, 0.1759F, -3.3879F, 5.1022F, 1, 2, 4, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.7145F, -0.2955F, 0.7241F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 50, -0.2437F, -0.3412F, -0.5867F, 1, 2, 4, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6364F, -0.0971F, 0.9525F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 101, -1.1759F, -0.4751F, 3.1607F, 1, 2, 3, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.7992F, -4.0362F, -15.6182F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1303F, -0.0971F, 0.9525F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 57, 50, -1.1759F, -3.3879F, 5.1022F, 1, 2, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -4.9254F, -8.8268F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 124, 68, -3.0F, -2.5F, -1.5F, 6, 6, 3, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -11.025F, -2.7446F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0524F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 114, 28, -4.5F, 0.1172F, -0.0459F, 9, 5, 4, -0.008F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -7.625F, -7.7446F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.6109F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 113, 112, -4.5F, 0.0F, 0.0F, 9, 5, 6, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.875F, -3.2446F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 111, 13, -5.0F, -3.5F, -2.5F, 10, 6, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(6.0F, -4.125F, -5.2446F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.5672F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -3.3F, -3.5F, -4.5F, 3, 7, 5, 0.0F, false));

        this.leftTusk = new AdvancedModelRenderer(this);
        this.leftTusk.setRotationPoint(3.159F, -3.7352F, -10.0383F);
        this.head.addChild(leftTusk);
        this.setRotateAngle(leftTusk, -0.264F, 0.1264F, -0.0341F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.2862F, 4.716F, -2.9782F);
        this.leftTusk.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3519F, 0.1577F, -0.2075F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -1.0F, -1.063F, -1.2348F, 1, 3, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.2862F, 4.716F, -2.9782F);
        this.leftTusk.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.0444F, 0.1577F, -0.2075F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 62, -1.0F, -1.4886F, -0.2517F, 1, 2, 2, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.1662F, 4.9941F, -2.0136F);
        this.leftTusk.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3128F, 0.243F, -0.1333F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 12, 0, -0.5198F, 0.5439F, -0.8008F, 1, 3, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.1662F, 4.9941F, -2.0136F);
        this.leftTusk.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5135F, 0.243F, -0.1333F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 11, 50, -0.5198F, -3.2266F, -1.0672F, 1, 4, 2, 0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.7862F, 0.016F, 0.4218F);
        this.leftTusk.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.9571F, 0.1577F, -0.3994F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 96, 78, -1.6343F, -4.5519F, -0.8534F, 1, 6, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.7862F, 0.016F, 0.4218F);
        this.leftTusk.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3462F, 0.1577F, -0.3994F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 39, 88, -1.6343F, -0.4666F, -3.4476F, 1, 6, 4, 0.003F, false));

        this.rightTusk = new AdvancedModelRenderer(this);
        this.rightTusk.setRotationPoint(-3.159F, -3.7352F, -10.0383F);
        this.head.addChild(rightTusk);
        this.setRotateAngle(rightTusk, -0.264F, -0.1264F, 0.0341F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.2862F, 4.716F, -2.9782F);
        this.rightTusk.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3519F, -0.1577F, 0.2075F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, 0.0F, -1.063F, -1.2348F, 1, 3, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.2862F, 4.716F, -2.9782F);
        this.rightTusk.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.0444F, -0.1577F, 0.2075F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 62, 0.0F, -1.4886F, -0.2517F, 1, 2, 2, -0.003F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.1662F, 4.9941F, -2.0136F);
        this.rightTusk.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.3128F, -0.243F, 0.1333F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 0, -0.4802F, 0.5439F, -0.8008F, 1, 3, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.1662F, 4.9941F, -2.0136F);
        this.rightTusk.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.5135F, -0.243F, 0.1333F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 11, 50, -0.4802F, -3.2266F, -1.0672F, 1, 4, 2, 0.003F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.7862F, 0.016F, 0.4218F);
        this.rightTusk.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.9571F, -0.1577F, 0.3994F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 96, 78, 0.6343F, -4.5519F, -0.8534F, 1, 6, 2, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7862F, 0.016F, 0.4218F);
        this.rightTusk.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3462F, -0.1577F, 0.3994F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 39, 88, 0.6343F, -0.4666F, -3.4476F, 1, 6, 4, 0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.725F, -3.7446F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 124, 57, -3.0F, -4.0364F, -4.8763F, 6, 5, 5, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 123, 93, -5.0F, -0.0864F, -2.8763F, 10, 5, 3, -0.006F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 4.5636F, -10.1263F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.3927F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 61, 0, -1.5F, -3.1F, -0.1F, 3, 3, 4, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.2864F, -0.8763F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.5236F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 13, -3.0F, 1.0F, -3.35F, 6, 1, 1, 0.004F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.7136F, -7.8763F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.6545F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 123, 102, -3.0F, 0.0855F, -0.636F, 6, 2, 5, -0.02F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 6.0136F, -6.5763F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3316F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 19, 122, -3.0F, -4.006F, 0.0363F, 6, 4, 6, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.neck.offsetZ = -0.05F;
        this.neck.offsetY = -0.04F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.neck.offsetZ = 0.02F;
        this.hips.offsetY = 0.13F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = -0.3F;
        this.hips.rotateAngleY = (float)Math.toRadians(130);
        this.hips.rotateAngleX = (float)Math.toRadians(2);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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
        //this.hips.offsetY = 1.50F;

        EntityPrehistoricFloraRechnisaurus entityRechnisaurus = (EntityPrehistoricFloraRechnisaurus) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};


        if (entityRechnisaurus.getAnimation() == entityRechnisaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityRechnisaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityRechnisaurus.getIsMoving()) {
                    if (entityRechnisaurus.getAnimation() != entityRechnisaurus.EAT_ANIMATION
                            && entityRechnisaurus.getAnimation() != entityRechnisaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityRechnisaurus.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRechnisaurus ee = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 323;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 1.75 + (((tickAnim - 59) / 231) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 1.75 + (((tickAnim - 290) / 33) * (0-(1.75)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-0.35-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            yy = -0.225 + (((tickAnim - 59) / 231) * (-0.225-(-0.225)));
            zz = -0.35 + (((tickAnim - 59) / 231) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            yy = -0.225 + (((tickAnim - 290) / 33) * (0-(-0.225)));
            zz = -0.35 + (((tickAnim - 290) / 33) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 323) {
            xx = -9.75 + (((tickAnim - 59) / 264) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 59) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 264) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 323) {
            xx = -18.75 + (((tickAnim - 59) / 264) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 59) / 264) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 264) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -1.5 + (((tickAnim - 59) / 231) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -1.5 + (((tickAnim - 290) / 33) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -1.5 + (((tickAnim - 59) / 231) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -1.5 + (((tickAnim - 290) / 33) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 2 + (((tickAnim - 59) / 231) * (2-(2)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 2 + (((tickAnim - 290) / 33) * (0-(2)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 3 + (((tickAnim - 59) / 231) * (3-(3)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 3 + (((tickAnim - 290) / 33) * (0-(3)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0.075-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 0.075 + (((tickAnim - 59) / 231) * (0.075-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (9.5-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -6 + (((tickAnim - 59) / 231) * (-6-(-6)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = 9.5 + (((tickAnim - 59) / 231) * (9.5-(9.5)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -6 + (((tickAnim - 290) / 33) * (0-(-6)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 9.5 + (((tickAnim - 290) / 33) * (0-(9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-7.44611-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-8.3919-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-2.51964-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -7.44611 + (((tickAnim - 59) / 231) * (-7.44611-(-7.44611)));
            yy = -8.3919 + (((tickAnim - 59) / 231) * (-8.3919-(-8.3919)));
            zz = -2.51964 + (((tickAnim - 59) / 231) * (-2.51964-(-2.51964)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -7.44611 + (((tickAnim - 290) / 33) * (0-(-7.44611)));
            yy = -8.3919 + (((tickAnim - 290) / 33) * (0-(-8.3919)));
            zz = -2.51964 + (((tickAnim - 290) / 33) * (0-(-2.51964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (7.0442-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.22121-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-1.63266-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 7.0442 + (((tickAnim - 59) / 231) * (7.0442-(7.0442)));
            yy = -0.22121 + (((tickAnim - 59) / 231) * (-0.22121-(-0.22121)));
            zz = -1.63266 + (((tickAnim - 59) / 231) * (-1.63266-(-1.63266)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 7.0442 + (((tickAnim - 290) / 33) * (0-(7.0442)));
            yy = -0.22121 + (((tickAnim - 290) / 33) * (0-(-0.22121)));
            zz = -1.63266 + (((tickAnim - 290) / 33) * (0-(-1.63266)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            yy = 0.975 + (((tickAnim - 59) / 231) * (0.975-(0.975)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            yy = 0.975 + (((tickAnim - 290) / 33) * (0-(0.975)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-9.5-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -6 + (((tickAnim - 59) / 231) * (-6-(-6)));
            yy = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            zz = -9.5 + (((tickAnim - 59) / 231) * (-9.5-(-9.5)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -6 + (((tickAnim - 290) / 33) * (0-(-6)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = -9.5 + (((tickAnim - 290) / 33) * (0-(-9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-7.44611-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (8.3919-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (2.51964-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = -7.44611 + (((tickAnim - 59) / 231) * (-7.44611-(-7.44611)));
            yy = 8.3919 + (((tickAnim - 59) / 231) * (8.3919-(8.3919)));
            zz = 2.51964 + (((tickAnim - 59) / 231) * (2.51964-(2.51964)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = -7.44611 + (((tickAnim - 290) / 33) * (0-(-7.44611)));
            yy = 8.3919 + (((tickAnim - 290) / 33) * (0-(8.3919)));
            zz = 2.51964 + (((tickAnim - 290) / 33) * (0-(2.51964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (7.0442-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.22121-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (-1.63266-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 7.0442 + (((tickAnim - 59) / 231) * (7.0442-(7.0442)));
            yy = -0.22121 + (((tickAnim - 59) / 231) * (-0.22121-(-0.22121)));
            zz = -1.63266 + (((tickAnim - 59) / 231) * (-1.63266-(-1.63266)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 7.0442 + (((tickAnim - 290) / 33) * (0-(7.0442)));
            yy = -0.22121 + (((tickAnim - 290) / 33) * (0-(-0.22121)));
            zz = -1.63266 + (((tickAnim - 290) / 33) * (0-(-1.63266)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 59) / 231) * (0-(0)));
            yy = 0.975 + (((tickAnim - 59) / 231) * (0.975-(0.975)));
            zz = 0 + (((tickAnim - 59) / 231) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            yy = 0.975 + (((tickAnim - 290) / 33) * (0-(0.975)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 75) {
            xx = 11.25 + (((tickAnim - 59) / 16) * (15.75-(11.25)));
            yy = 0 + (((tickAnim - 59) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 16) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 15.75 + (((tickAnim - 75) / 15) * (11.25-(15.75)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 106) {
            xx = 11.25 + (((tickAnim - 90) / 16) * (15.75-(11.25)));
            yy = 0 + (((tickAnim - 90) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 16) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 121) {
            xx = 15.75 + (((tickAnim - 106) / 15) * (11.25-(15.75)));
            yy = 0 + (((tickAnim - 106) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 15) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 160) {
            xx = 11.25 + (((tickAnim - 121) / 39) * (-5.5-(11.25)));
            yy = 0 + (((tickAnim - 121) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 39) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 190) {
            xx = -5.5 + (((tickAnim - 160) / 30) * (-7.75-(-5.5)));
            yy = 0 + (((tickAnim - 160) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 30) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 228) {
            xx = -7.75 + (((tickAnim - 190) / 38) * (11.25-(-7.75)));
            yy = 0 + (((tickAnim - 190) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 38) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 244) {
            xx = 11.25 + (((tickAnim - 228) / 16) * (15.75-(11.25)));
            yy = 0 + (((tickAnim - 228) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 16) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 259) {
            xx = 15.75 + (((tickAnim - 244) / 15) * (11.25-(15.75)));
            yy = 0 + (((tickAnim - 244) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 15) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 275) {
            xx = 11.25 + (((tickAnim - 259) / 16) * (15.75-(11.25)));
            yy = 0 + (((tickAnim - 259) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 16) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 15.75 + (((tickAnim - 275) / 15) * (11.25-(15.75)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 11.25 + (((tickAnim - 290) / 33) * (0-(11.25)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 59) / 31) * (0-(0)));
            yy = -0.1 + (((tickAnim - 59) / 31) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 59) / 31) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 90) / 31) * (0-(0)));
            yy = -0.1 + (((tickAnim - 90) / 31) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 90) / 31) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 121) / 69) * (0-(0)));
            yy = -0.1 + (((tickAnim - 121) / 69) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 121) / 69) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 190) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 190) / 38) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 190) / 38) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 228) / 31) * (0-(0)));
            yy = -0.1 + (((tickAnim - 228) / 31) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 228) / 31) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 259) / 31) * (0-(0)));
            yy = -0.1 + (((tickAnim - 259) / 31) * (-0.1-(-0.1)));
            zz = 0 + (((tickAnim - 259) / 31) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            yy = -0.1 + (((tickAnim - 290) / 33) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 75) {
            xx = 19.75 + (((tickAnim - 59) / 16) * (12.25-(19.75)));
            yy = 0 + (((tickAnim - 59) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 16) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 12.25 + (((tickAnim - 75) / 15) * (19.75-(12.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 106) {
            xx = 19.75 + (((tickAnim - 90) / 16) * (12.25-(19.75)));
            yy = 0 + (((tickAnim - 90) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 16) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 121) {
            xx = 12.25 + (((tickAnim - 106) / 15) * (19.75-(12.25)));
            yy = 0 + (((tickAnim - 106) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 15) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 160) {
            xx = 19.75 + (((tickAnim - 121) / 39) * (0-(19.75)));
            yy = 0 + (((tickAnim - 121) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 39) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 160) / 3) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 160) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 3) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 165) {
            xx = -0.55 + (((tickAnim - 163) / 2) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 163) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 2) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 165) / 3) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 170) {
            xx = -0.55 + (((tickAnim - 168) / 2) * (0-(-0.55)));
            yy = 0 + (((tickAnim - 168) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 2) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 5) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 175) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 15) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 190) / 38) * (19.75-(0)));
            yy = 0 + (((tickAnim - 190) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 38) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 244) {
            xx = 19.75 + (((tickAnim - 228) / 16) * (12.25-(19.75)));
            yy = 0 + (((tickAnim - 228) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 16) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 259) {
            xx = 12.25 + (((tickAnim - 244) / 15) * (19.75-(12.25)));
            yy = 0 + (((tickAnim - 244) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 15) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 275) {
            xx = 19.75 + (((tickAnim - 259) / 16) * (12.25-(19.75)));
            yy = 0 + (((tickAnim - 259) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 16) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 12.25 + (((tickAnim - 275) / 15) * (19.75-(12.25)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 19.75 + (((tickAnim - 290) / 33) * (0-(19.75)));
            yy = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 59) / 16) * (0-(0)));
            yy = 0.75 + (((tickAnim - 59) / 16) * (-0.025-(0.75)));
            zz = 0 + (((tickAnim - 59) / 16) * (-1.275-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 75) / 15) * (0.75-(-0.025)));
            zz = -1.275 + (((tickAnim - 75) / 15) * (0-(-1.275)));
        }
        else if (tickAnim >= 90 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 90) / 16) * (0-(0)));
            yy = 0.75 + (((tickAnim - 90) / 16) * (-0.025-(0.75)));
            zz = 0 + (((tickAnim - 90) / 16) * (-1.275-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 106) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 106) / 15) * (0.75-(-0.025)));
            zz = -1.275 + (((tickAnim - 106) / 15) * (0-(-1.275)));
        }
        else if (tickAnim >= 121 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 121) / 39) * (0-(0)));
            yy = 0.75 + (((tickAnim - 121) / 39) * (0-(0.75)));
            zz = 0 + (((tickAnim - 121) / 39) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 160) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 3) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 163) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 163) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 12) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 175) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 53) * (0.75-(0)));
            zz = 0 + (((tickAnim - 175) / 53) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 244) {
            xx = 0 + (((tickAnim - 228) / 16) * (0-(0)));
            yy = 0.75 + (((tickAnim - 228) / 16) * (-0.025-(0.75)));
            zz = 0 + (((tickAnim - 228) / 16) * (-1.275-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 244) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 244) / 15) * (0.75-(-0.025)));
            zz = -1.275 + (((tickAnim - 244) / 15) * (0-(-1.275)));
        }
        else if (tickAnim >= 259 && tickAnim < 275) {
            xx = 0 + (((tickAnim - 259) / 16) * (0-(0)));
            yy = 0.75 + (((tickAnim - 259) / 16) * (-0.025-(0.75)));
            zz = 0 + (((tickAnim - 259) / 16) * (-1.275-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 275) / 15) * (0.75-(-0.025)));
            zz = -1.275 + (((tickAnim - 275) / 15) * (0-(-1.275)));
        }
        else if (tickAnim >= 290 && tickAnim < 323) {
            xx = 0 + (((tickAnim - 290) / 33) * (0-(0)));
            yy = 0.75 + (((tickAnim - 290) / 33) * (0-(0.75)));
            zz = 0 + (((tickAnim - 290) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (22.5-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 22.5 + (((tickAnim - 53) / 6) * (0-(22.5)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 59) / 12) * (25.75-(0)));
            yy = 0 + (((tickAnim - 59) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 12) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 75) {
            xx = 25.75 + (((tickAnim - 71) / 4) * (0-(25.75)));
            yy = 0 + (((tickAnim - 71) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 4) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 90) / 9) * (25.75-(0)));
            yy = 0 + (((tickAnim - 90) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 9) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 106) {
            xx = 25.75 + (((tickAnim - 99) / 7) * (0-(25.75)));
            yy = 0 + (((tickAnim - 99) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 7) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 121) {
            xx = 0 + (((tickAnim - 106) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 106) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 15) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 121) / 9) * (10.75-(0)));
            yy = 0 + (((tickAnim - 121) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 9) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 10.75 + (((tickAnim - 130) / 10) * (0-(10.75)));
            yy = 0 + (((tickAnim - 130) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 10) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 160) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 68) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 228) / 10) * (25.75-(0)));
            yy = 0 + (((tickAnim - 228) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 10) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 244) {
            xx = 25.75 + (((tickAnim - 238) / 6) * (0-(25.75)));
            yy = 0 + (((tickAnim - 238) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 6) * (0-(0)));
        }
        else if (tickAnim >= 244 && tickAnim < 259) {
            xx = 0 + (((tickAnim - 244) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 244) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 244) / 15) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 259) / 9) * (25.75-(0)));
            yy = 0 + (((tickAnim - 259) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 9) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 275) {
            xx = 25.75 + (((tickAnim - 268) / 7) * (0-(25.75)));
            yy = 0 + (((tickAnim - 268) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 7) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 130;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -1.75 + (((tickAnim - 30) / 35) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -1.75 + (((tickAnim - 95) / 35) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 65) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60-105))*10), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80+10))*-10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 2.75 + (((tickAnim - 30) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (2.75-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 2.75 + (((tickAnim - 95) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 2.75 + (((tickAnim - 30) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (2.75-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 2.75 + (((tickAnim - 95) / 35) * (0-(2.75)));
            yy = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -2 + (((tickAnim - 30) / 35) * (0-(-2)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-2-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -2 + (((tickAnim - 95) / 35) * (0-(-2)));
            yy = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -2.75 + (((tickAnim - 30) / 35) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -2.75 + (((tickAnim - 95) / 35) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (6.17909-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-2.85187-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-9.84564-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 6.17909 + (((tickAnim - 30) / 35) * (0-(6.17909)));
            yy = -2.85187 + (((tickAnim - 30) / 35) * (0-(-2.85187)));
            zz = -9.84564 + (((tickAnim - 30) / 35) * (0-(-9.84564)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (6.17909-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-2.85187-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (-9.84564-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 6.17909 + (((tickAnim - 95) / 35) * (0-(6.17909)));
            yy = -2.85187 + (((tickAnim - 95) / 35) * (0-(-2.85187)));
            zz = -9.84564 + (((tickAnim - 95) / 35) * (0-(-9.84564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.03425-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (11.20631-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (10.73216-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 11.03425 + (((tickAnim - 30) / 35) * (0-(11.03425)));
            yy = 11.20631 + (((tickAnim - 30) / 35) * (0-(11.20631)));
            zz = 10.73216 + (((tickAnim - 30) / 35) * (0-(10.73216)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (9.30401-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (4.97575-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (6.21114-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 9.30401 + (((tickAnim - 95) / 35) * (0-(9.30401)));
            yy = 4.97575 + (((tickAnim - 95) / 35) * (0-(4.97575)));
            zz = 6.21114 + (((tickAnim - 95) / 35) * (0-(6.21114)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.45-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 0.325 + (((tickAnim - 30) / 35) * (0-(0.325)));
            yy = -0.825 + (((tickAnim - 30) / 35) * (0-(-0.825)));
            zz = -0.45 + (((tickAnim - 30) / 35) * (0-(-0.45)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0.325-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (-0.45-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 0.325 + (((tickAnim - 95) / 35) * (0-(0.325)));
            yy = -0.825 + (((tickAnim - 95) / 35) * (0-(-0.825)));
            zz = -0.45 + (((tickAnim - 95) / 35) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-5.30358-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.19769-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-8.43716-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -5.30358 + (((tickAnim - 30) / 35) * (0-(-5.30358)));
            yy = 1.19769 + (((tickAnim - 30) / 35) * (0-(1.19769)));
            zz = -8.43716 + (((tickAnim - 30) / 35) * (0-(-8.43716)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-6.69753-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0.51834-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0.64462-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -6.69753 + (((tickAnim - 95) / 35) * (0-(-6.69753)));
            yy = 0.51834 + (((tickAnim - 95) / 35) * (0-(0.51834)));
            zz = 0.64462 + (((tickAnim - 95) / 35) * (0-(0.64462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 30) / 35) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            yy = -0.175 + (((tickAnim - 95) / 35) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (1.92909-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.85187-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (9.84564-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 1.92909 + (((tickAnim - 30) / 35) * (0-(1.92909)));
            yy = 2.85187 + (((tickAnim - 30) / 35) * (0-(2.85187)));
            zz = 9.84564 + (((tickAnim - 30) / 35) * (0-(9.84564)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (1.92909-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (2.85187-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (9.84564-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 1.92909 + (((tickAnim - 95) / 35) * (0-(1.92909)));
            yy = 2.85187 + (((tickAnim - 95) / 35) * (0-(2.85187)));
            zz = 9.84564 + (((tickAnim - 95) / 35) * (0-(9.84564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (17.53425-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-11.20631-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-10.73216-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 17.53425 + (((tickAnim - 30) / 35) * (0-(17.53425)));
            yy = -11.20631 + (((tickAnim - 30) / 35) * (0-(-11.20631)));
            zz = -10.73216 + (((tickAnim - 30) / 35) * (0-(-10.73216)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (17.53425-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-11.20631-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (-10.73216-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 17.53425 + (((tickAnim - 95) / 35) * (0-(17.53425)));
            yy = -11.20631 + (((tickAnim - 95) / 35) * (0-(-11.20631)));
            zz = -10.73216 + (((tickAnim - 95) / 35) * (0-(-10.73216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.45-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -0.325 + (((tickAnim - 30) / 35) * (0-(-0.325)));
            yy = -0.825 + (((tickAnim - 30) / 35) * (0-(-0.825)));
            zz = -0.45 + (((tickAnim - 30) / 35) * (0-(-0.45)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-0.325-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (-0.45-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -0.325 + (((tickAnim - 95) / 35) * (0-(-0.325)));
            yy = -0.825 + (((tickAnim - 95) / 35) * (0-(-0.825)));
            zz = -0.45 + (((tickAnim - 95) / 35) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-8.80358-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.19769-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (8.43716-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -8.80358 + (((tickAnim - 30) / 35) * (0-(-8.80358)));
            yy = -1.19769 + (((tickAnim - 30) / 35) * (0-(-1.19769)));
            zz = 8.43716 + (((tickAnim - 30) / 35) * (0-(8.43716)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (-8.80358-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (-1.19769-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (8.43716-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = -8.80358 + (((tickAnim - 95) / 35) * (0-(-8.80358)));
            yy = -1.19769 + (((tickAnim - 95) / 35) * (0-(-1.19769)));
            zz = 8.43716 + (((tickAnim - 95) / 35) * (0-(8.43716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            yy = 0.65 + (((tickAnim - 30) / 35) * (0-(0.65)));
            zz = 0 + (((tickAnim - 30) / 35) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 65) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 30) * (0.65-(0)));
            zz = 0 + (((tickAnim - 65) / 30) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            yy = 0.65 + (((tickAnim - 95) / 35) * (0-(0.65)));
            zz = 0 + (((tickAnim - 95) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5.75 + (((tickAnim - 15) / 15) * (-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*10-(-5.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = -1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*10 + (((tickAnim - 30) / 35) * (9.5-(-1.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2 + (((tickAnim - 30) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2 + (((tickAnim - 30) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 9.5 + (((tickAnim - 65) / 15) * (-5.75-(9.5)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -5.75 + (((tickAnim - 80) / 15) * (7.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20-(-5.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 7.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20 + (((tickAnim - 95) / 35) * (0-(7.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2 + (((tickAnim - 95) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2 + (((tickAnim - 95) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-150))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-10.83-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -10.83 + (((tickAnim - 5) / 5) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.75 + (((tickAnim - 15) / 15) * (18.75-(-7.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 18.75 + (((tickAnim - 30) / 35) * (2.75-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6 + (((tickAnim - 30) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6 + (((tickAnim - 30) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 2.75 + (((tickAnim - 65) / 5) * (-10.83-(2.75)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -10.83 + (((tickAnim - 70) / 5) * (0-(-10.83)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -7.75 + (((tickAnim - 80) / 15) * (18.75-(-7.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 18.75 + (((tickAnim - 95) / 35) * (0-(18.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6 + (((tickAnim - 95) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*6)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6 + (((tickAnim - 95) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280-50))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.66-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.335-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.66 + (((tickAnim - 5) / 5) * (0-(-0.66)));
            zz = -1.335 + (((tickAnim - 5) / 5) * (0-(-1.335)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-1.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.625 + (((tickAnim - 15) / 15) * (0.38-(-0.625)));
            zz = -1.225 + (((tickAnim - 15) / 15) * (-0.455-(-1.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 30) / 35) * (0-(0)));
            yy = 0.38 + (((tickAnim - 30) / 35) * (0.25-(0.38)));
            zz = -0.455 + (((tickAnim - 30) / 35) * (0-(-0.455)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 65) / 5) * (-0.66-(0.25)));
            zz = 0 + (((tickAnim - 65) / 5) * (-1.335-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = -0.66 + (((tickAnim - 70) / 5) * (0-(-0.66)));
            zz = -1.335 + (((tickAnim - 70) / 5) * (0-(-1.335)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (-1.225-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 80) / 15) * (0-(0)));
            yy = -0.625 + (((tickAnim - 80) / 15) * (0.38-(-0.625)));
            zz = -1.225 + (((tickAnim - 80) / 15) * (-0.455-(-1.225)));
        }
        else if (tickAnim >= 95 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 95) / 35) * (0-(0)));
            yy = 0.38 + (((tickAnim - 95) / 35) * (0-(0.38)));
            zz = -0.455 + (((tickAnim - 95) / 35) * (0-(-0.455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 19.5 + (((tickAnim - 5) / 5) * (0-(19.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 29.25 + (((tickAnim - 15) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 45) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (19.5-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 19.5 + (((tickAnim - 70) / 5) * (0-(19.5)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 75) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 29.25 + (((tickAnim - 80) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*5 + (((tickAnim - 18) / 17) * (0-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-190))*5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*5 + (((tickAnim - 18) / 17) * (0-(-8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.65-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -0.425 + (((tickAnim - 18) / 17) * (0-(-0.425)));
            zz = -0.65 + (((tickAnim - 18) / 17) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 31.25 + (((tickAnim - 13) / 6) * (40.75-(31.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 40.75 + (((tickAnim - 19) / 11) * (0-(40.75)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = 37.25 + (((tickAnim - 25) / 18) * (48.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55-(37.25)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 48.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55 + (((tickAnim - 43) / 7) * (0-(48.88+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*55)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 17 + (((tickAnim - 25) / 16) * (31.93-(17)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 31.93 + (((tickAnim - 41) / 9) * (0-(31.93)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.legL2.rotationPointX = this.legL2.rotationPointX + (float)(xx);
        this.legL2.rotationPointY = this.legL2.rotationPointY - (float)(yy);
        this.legL2.rotationPointZ = this.legL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (11.09-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 11.09 + (((tickAnim - 11) / 14) * (45.36-(11.09)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 45.36 + (((tickAnim - 25) / 16) * (30.92-(45.36)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 30.92 + (((tickAnim - 41) / 9) * (0-(30.92)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (2.075-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.225-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            yy = 2.075 + (((tickAnim - 25) / 16) * (3.73-(2.075)));
            zz = 0.225 + (((tickAnim - 25) / 16) * (0.23-(0.225)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 3.73 + (((tickAnim - 41) / 9) * (0-(3.73)));
            zz = 0.23 + (((tickAnim - 41) / 9) * (0-(0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -3 + (((tickAnim - 20) / 10) * (-3-(-3)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.7-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -5.7 + (((tickAnim - 20) / 10) * (-5.7-(-5.7)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -5.7 + (((tickAnim - 30) / 20) * (0-(-5.7)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 20) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 30) / 20) * (0-(18.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -20.75 + (((tickAnim - 20) / 10) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.75 + (((tickAnim - 30) / 20) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.5 + (((tickAnim - 20) / 10) * (-16.5-(-16.5)));
            yy = -12.5 + (((tickAnim - 20) / 10) * (-12.5-(-12.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 30) / 20) * (0-(-16.5)));
            yy = -12.5 + (((tickAnim - 30) / 20) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.75 + (((tickAnim - 20) / 10) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 30) / 20) * (0-(39.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.5 + (((tickAnim - 20) / 10) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 30) / 20) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.5 + (((tickAnim - 20) / 10) * (-16.5-(-16.5)));
            yy = 12.5 + (((tickAnim - 20) / 10) * (12.5-(12.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 30) / 20) * (0-(-16.5)));
            yy = 12.5 + (((tickAnim - 30) / 20) * (0-(12.5)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (39.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 39.75 + (((tickAnim - 20) / 10) * (39.75-(39.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 39.75 + (((tickAnim - 30) / 20) * (0-(39.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.5 + (((tickAnim - 20) / 10) * (-16.5-(-16.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 30) / 20) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4 + (((tickAnim - 20) / 10) * (-4-(-4)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 20) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.75 + (((tickAnim - 20) / 10) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 30) / 20) * (0-(10.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 20) / 10) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 30) / 20) * (0-(5.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.5 + (((tickAnim - 10) / 10) * (0-(13.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 10) * (0-(-0.3)));
            zz = -0.6 + (((tickAnim - 10) / 10) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20.75 + (((tickAnim - 10) / 3) * (25.25-(20.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 25.25 + (((tickAnim - 13) / 7) * (0-(25.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 3) * (1.02-(0.575)));
            zz = -0.2 + (((tickAnim - 10) / 3) * (0.275-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 1.02 + (((tickAnim - 13) / 7) * (0-(1.02)));
            zz = 0.275 + (((tickAnim - 13) / 7) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 29.25 + (((tickAnim - 5) / 5) * (0-(29.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -56.85174 + (((tickAnim - 0) / 21) * (28.50079-(-56.85174)));
            yy = -2.75634 + (((tickAnim - 0) / 21) * (-15.21605-(-2.75634)));
            zz = -23.41368 + (((tickAnim - 0) / 21) * (9.55986-(-23.41368)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 28.50079 + (((tickAnim - 21) / 11) * (-30.59447-(28.50079)));
            yy = -15.21605 + (((tickAnim - 21) / 11) * (-6.09264-(-15.21605)));
            zz = 9.55986 + (((tickAnim - 21) / 11) * (-26.00628-(9.55986)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -30.59447 + (((tickAnim - 32) / 8) * (-56.85174-(-30.59447)));
            yy = -6.09264 + (((tickAnim - 32) / 8) * (-2.75634-(-6.09264)));
            zz = -26.00628 + (((tickAnim - 32) / 8) * (-23.41368-(-26.00628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 27.76659 + (((tickAnim - 0) / 21) * (27.33926-(27.76659)));
            yy = -18.23393 + (((tickAnim - 0) / 21) * (4.97536-(-18.23393)));
            zz = -7.55788 + (((tickAnim - 0) / 21) * (-23.13169-(-7.55788)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 27.33926 + (((tickAnim - 21) / 11) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35-(27.33926)));
            yy = 4.97536 + (((tickAnim - 21) / 11) * (0-(4.97536)));
            zz = -23.13169 + (((tickAnim - 21) / 11) * (0-(-23.13169)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35 + (((tickAnim - 32) / 8) * (27.76659-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*35)));
            yy = 0 + (((tickAnim - 32) / 8) * (-18.23393-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (-7.55788-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0.85 + (((tickAnim - 0) / 21) * (0-(0.85)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 11) * (2.275-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (1.05-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 2.275 + (((tickAnim - 32) / 8) * (0.85-(2.275)));
            zz = 1.05 + (((tickAnim - 32) / 8) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.39182 + (((tickAnim - 0) / 10) * (-8.14678-(12.39182)));
            yy = -11.30271 + (((tickAnim - 0) / 10) * (-7.48707-(-11.30271)));
            zz = 0.42824 + (((tickAnim - 0) / 10) * (11.11948-(0.42824)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -8.14678 + (((tickAnim - 10) / 11) * (39.25-(-8.14678)));
            yy = -7.48707 + (((tickAnim - 10) / 11) * (0-(-7.48707)));
            zz = 11.11948 + (((tickAnim - 10) / 11) * (0-(11.11948)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = 39.25 + (((tickAnim - 21) / 11) * (62.75-(39.25)));
            yy = 0 + (((tickAnim - 21) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 11) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 62.75 + (((tickAnim - 32) / 8) * (12.39182-(62.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (-11.30271-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.42824-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 2.4 + (((tickAnim - 0) / 10) * (1.95-(2.4)));
            zz = -0.575 + (((tickAnim - 0) / 10) * (0-(-0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            yy = 1.95 + (((tickAnim - 10) / 11) * (3.6-(1.95)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 3.6 + (((tickAnim - 21) / 6) * (5.885-(3.6)));
            zz = 0 + (((tickAnim - 21) / 6) * (-1.1-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 5.885 + (((tickAnim - 27) / 5) * (4.525-(5.885)));
            zz = -1.1 + (((tickAnim - 27) / 5) * (-2.2-(-1.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 4.525 + (((tickAnim - 32) / 8) * (2.4-(4.525)));
            zz = -2.2 + (((tickAnim - 32) / 8) * (-0.575-(-2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 28.50079 + (((tickAnim - 0) / 9) * (-30.59447-(28.50079)));
            yy = 15.21605 + (((tickAnim - 0) / 9) * (6.09264-(15.21605)));
            zz = -9.55986 + (((tickAnim - 0) / 9) * (26.00628-(-9.55986)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = -30.59447 + (((tickAnim - 9) / 9) * (-56.85174-(-30.59447)));
            yy = 6.09264 + (((tickAnim - 9) / 9) * (2.75634-(6.09264)));
            zz = 26.00628 + (((tickAnim - 9) / 9) * (23.41368-(26.00628)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -56.85174 + (((tickAnim - 18) / 22) * (28.50079-(-56.85174)));
            yy = 2.75634 + (((tickAnim - 18) / 22) * (15.21605-(2.75634)));
            zz = 23.41368 + (((tickAnim - 18) / 22) * (-9.55986-(23.41368)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 27.33926 + (((tickAnim - 0) / 9) * (30.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-55-(27.33926)));
            yy = -4.97536 + (((tickAnim - 0) / 9) * (0-(-4.97536)));
            zz = 23.13169 + (((tickAnim - 0) / 9) * (0-(23.13169)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 30.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-55 + (((tickAnim - 9) / 9) * (27.76659-(30.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-55)));
            yy = 0 + (((tickAnim - 9) / 9) * (18.23393-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (7.55788-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 27.76659 + (((tickAnim - 18) / 22) * (27.33926-(27.76659)));
            yy = 18.23393 + (((tickAnim - 18) / 22) * (-4.97536-(18.23393)));
            zz = 7.55788 + (((tickAnim - 18) / 22) * (23.13169-(7.55788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (1.125-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (1.05-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 1.125 + (((tickAnim - 9) / 9) * (0-(1.125)));
            yy = 0.8 + (((tickAnim - 9) / 9) * (0.85-(0.8)));
            zz = 1.05 + (((tickAnim - 9) / 9) * (0-(1.05)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            yy = 0.85 + (((tickAnim - 18) / 22) * (0-(0.85)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 39.25 + (((tickAnim - 0) / 9) * (62.75-(39.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 62.75 + (((tickAnim - 9) / 9) * (12.39182-(62.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (11.30271-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (-0.42824-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 12.39182 + (((tickAnim - 18) / 10) * (-6.47226-(12.39182)));
            yy = 11.30271 + (((tickAnim - 18) / 10) * (-0.1959-(11.30271)));
            zz = -0.42824 + (((tickAnim - 18) / 10) * (-9.71664-(-0.42824)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -6.47226 + (((tickAnim - 28) / 12) * (39.25-(-6.47226)));
            yy = -0.1959 + (((tickAnim - 28) / 12) * (0-(-0.1959)));
            zz = -9.71664 + (((tickAnim - 28) / 12) * (0-(-9.71664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 3.6 + (((tickAnim - 0) / 4) * (5.885-(3.6)));
            zz = 0 + (((tickAnim - 0) / 4) * (-1.1-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 5.885 + (((tickAnim - 4) / 5) * (4.525-(5.885)));
            zz = -1.1 + (((tickAnim - 4) / 5) * (-2.2-(-1.1)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 4.525 + (((tickAnim - 9) / 9) * (2.4-(4.525)));
            zz = -2.2 + (((tickAnim - 9) / 9) * (-0.575-(-2.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 2.4 + (((tickAnim - 18) / 10) * (1.675-(2.4)));
            zz = -0.575 + (((tickAnim - 18) / 10) * (0-(-0.575)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 1.675 + (((tickAnim - 28) / 12) * (3.6-(1.675)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-110))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*0.15);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+40))*0.35);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-140))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*-6));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-100))*-4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-160))*-8));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 0) / 13) * (23-(1.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 13) / 10) * (-12.76137-(23)));
            yy = 0 + (((tickAnim - 13) / 10) * (-6.17225-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (-2.84854-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -12.76137 + (((tickAnim - 23) / 5) * (-15.5-(-12.76137)));
            yy = -6.17225 + (((tickAnim - 23) / 5) * (0-(-6.17225)));
            zz = -2.84854 + (((tickAnim - 23) / 5) * (0-(-2.84854)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 28) / 12) * (1.5-(-15.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 0) / 13) * (21.75-(6.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 21.75 + (((tickAnim - 13) / 10) * (9-(21.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 9 + (((tickAnim - 23) / 5) * (-7-(9)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 28) / 12) * (6.75-(-7)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 28) / 12) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL2.rotationPointX = this.legL2.rotationPointX + (float)(xx);
        this.legL2.rotationPointY = this.legL2.rotationPointY - (float)(yy);
        this.legL2.rotationPointZ = this.legL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 0) / 13) * (32.5-(6)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 32.5 + (((tickAnim - 13) / 3) * (51.33-(32.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 51.33 + (((tickAnim - 16) / 4) * (46.32-(51.33)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 46.32 + (((tickAnim - 20) / 3) * (32.5-(46.32)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 32.5 + (((tickAnim - 23) / 5) * (20.5-(32.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 28) / 5) * (10.7-(20.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 10.7 + (((tickAnim - 33) / 7) * (6-(10.7)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 13) * (2.175-(0.625)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 2.175 + (((tickAnim - 13) / 3) * (3.865-(2.175)));
            zz = 1.025 + (((tickAnim - 13) / 3) * (0.72-(1.025)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 3.865 + (((tickAnim - 16) / 4) * (5.105-(3.865)));
            zz = 0.72 + (((tickAnim - 16) / 4) * (0.31-(0.72)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 5.105 + (((tickAnim - 20) / 3) * (3.4-(5.105)));
            zz = 0.31 + (((tickAnim - 20) / 3) * (0-(0.31)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 3.4 + (((tickAnim - 23) / 5) * (0-(3.4)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0.625-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.76137 + (((tickAnim - 0) / 5) * (-15.5-(-12.76137)));
            yy = 6.17225 + (((tickAnim - 0) / 5) * (0-(6.17225)));
            zz = 2.84854 + (((tickAnim - 0) / 5) * (0-(2.84854)));
        }
        else if (tickAnim >= 5 && tickAnim < 29) {
            xx = -15.5 + (((tickAnim - 5) / 24) * (22.75-(-15.5)));
            yy = 0 + (((tickAnim - 5) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 24) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 22.75 + (((tickAnim - 29) / 11) * (-12.76137-(22.75)));
            yy = 0 + (((tickAnim - 29) / 11) * (6.17225-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (2.84854-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9 + (((tickAnim - 0) / 5) * (-7-(9)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 29) {
            xx = -7 + (((tickAnim - 5) / 24) * (21.75-(-7)));
            yy = 0 + (((tickAnim - 5) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 24) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 21.75 + (((tickAnim - 29) / 11) * (9-(21.75)));
            yy = 0 + (((tickAnim - 29) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 5) / 35) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 35) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR2.rotationPointX = this.legR2.rotationPointX + (float)(xx);
        this.legR2.rotationPointY = this.legR2.rotationPointY - (float)(yy);
        this.legR2.rotationPointZ = this.legR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 0) / 5) * (20.5-(32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 20.5 + (((tickAnim - 5) / 11) * (0-(20.5)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 16) / 13) * (32.5-(0)));
            yy = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 13) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 32.5 + (((tickAnim - 29) / 4) * (51.33-(32.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 51.33 + (((tickAnim - 33) / 4) * (46.32-(51.33)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 46.32 + (((tickAnim - 37) / 3) * (32.5-(46.32)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 3.4 + (((tickAnim - 0) / 5) * (0-(3.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 11) * (0.05-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 16) / 13) * (0-(0)));
            yy = 0.05 + (((tickAnim - 16) / 13) * (2.7-(0.05)));
            zz = 0 + (((tickAnim - 16) / 13) * (1.025-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 2.7 + (((tickAnim - 29) / 4) * (3.865-(2.7)));
            zz = 1.025 + (((tickAnim - 29) / 4) * (0.72-(1.025)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 3.865 + (((tickAnim - 33) / 4) * (5.105-(3.865)));
            zz = 0.72 + (((tickAnim - 33) / 4) * (0.31-(0.72)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 5.105 + (((tickAnim - 37) / 3) * (3.4-(5.105)));
            zz = 0.31 + (((tickAnim - 37) / 3) * (0-(0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-118))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-190))*1.2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-230))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*-1.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-1), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-190))*-3));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRechnisaurus entity = (EntityPrehistoricFloraRechnisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -77.44125 + (((tickAnim - 0) / 11) * (28.50079-(-77.44125)));
            yy = -5.60185 + (((tickAnim - 0) / 11) * (-15.21605-(-5.60185)));
            zz = -28.41027 + (((tickAnim - 0) / 11) * (9.55986-(-28.41027)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 28.50079 + (((tickAnim - 11) / 5) * (-30.59447-(28.50079)));
            yy = -15.21605 + (((tickAnim - 11) / 5) * (-6.09264-(-15.21605)));
            zz = 9.55986 + (((tickAnim - 11) / 5) * (-26.00628-(9.55986)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -30.59447 + (((tickAnim - 16) / 4) * (-77.44125-(-30.59447)));
            yy = -6.09264 + (((tickAnim - 16) / 4) * (-5.60185-(-6.09264)));
            zz = -26.00628 + (((tickAnim - 16) / 4) * (-28.41027-(-26.00628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 1.625 + (((tickAnim - 0) / 20) * (1.625-(1.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL.rotationPointX = this.armL.rotationPointX + (float)(xx);
        this.armL.rotationPointY = this.armL.rotationPointY - (float)(yy);
        this.armL.rotationPointZ = this.armL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 36.77601 + (((tickAnim - 0) / 11) * (27.33926-(36.77601)));
            yy = -26.40251 + (((tickAnim - 0) / 11) * (4.97536-(-26.40251)));
            zz = -22.54591 + (((tickAnim - 0) / 11) * (-23.13169-(-22.54591)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 27.33926 + (((tickAnim - 11) / 5) * (93.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-100-(27.33926)));
            yy = 4.97536 + (((tickAnim - 11) / 5) * (0-(4.97536)));
            zz = -23.13169 + (((tickAnim - 11) / 5) * (0-(-23.13169)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 93.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-100 + (((tickAnim - 16) / 4) * (36.77601-(93.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-100)));
            yy = 0 + (((tickAnim - 16) / 4) * (-26.40251-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-22.54591-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 11) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (2.275-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (1.05-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 2.275 + (((tickAnim - 16) / 4) * (-0.425-(2.275)));
            zz = 1.05 + (((tickAnim - 16) / 4) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 26.31565 + (((tickAnim - 0) / 5) * (-8.14678-(26.31565)));
            yy = -15.19897 + (((tickAnim - 0) / 5) * (-7.48707-(-15.19897)));
            zz = 5.64225 + (((tickAnim - 0) / 5) * (11.11948-(5.64225)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -8.14678 + (((tickAnim - 5) / 6) * (39.25-(-8.14678)));
            yy = -7.48707 + (((tickAnim - 5) / 6) * (0-(-7.48707)));
            zz = 11.11948 + (((tickAnim - 5) / 6) * (0-(11.11948)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 39.25 + (((tickAnim - 11) / 5) * (62.75-(39.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 62.75 + (((tickAnim - 16) / 4) * (26.31565-(62.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (-15.19897-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (5.64225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 2.4 + (((tickAnim - 0) / 5) * (1.95-(2.4)));
            zz = -0.575 + (((tickAnim - 0) / 5) * (0-(-0.575)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 1.95 + (((tickAnim - 5) / 6) * (3.6-(1.95)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 3.6 + (((tickAnim - 11) / 2) * (5.885-(3.6)));
            zz = 0 + (((tickAnim - 11) / 2) * (-1.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 5.885 + (((tickAnim - 13) / 3) * (4.525-(5.885)));
            zz = -1.1 + (((tickAnim - 13) / 3) * (-2.2-(-1.1)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 4.525 + (((tickAnim - 16) / 4) * (2.4-(4.525)));
            zz = -2.2 + (((tickAnim - 16) / 4) * (-0.575-(-2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 28.50079 + (((tickAnim - 0) / 4) * (-30.59447-(28.50079)));
            yy = 15.21605 + (((tickAnim - 0) / 4) * (6.09264-(15.21605)));
            zz = -9.55986 + (((tickAnim - 0) / 4) * (26.00628-(-9.55986)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -30.59447 + (((tickAnim - 4) / 5) * (-77.44125-(-30.59447)));
            yy = 6.09264 + (((tickAnim - 4) / 5) * (5.60185-(6.09264)));
            zz = 26.00628 + (((tickAnim - 4) / 5) * (28.41027-(26.00628)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -77.44125 + (((tickAnim - 9) / 11) * (28.50079-(-77.44125)));
            yy = 5.60185 + (((tickAnim - 9) / 11) * (15.21605-(5.60185)));
            zz = 28.41027 + (((tickAnim - 9) / 11) * (-9.55986-(28.41027)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.33926 + (((tickAnim - 0) / 4) * (23.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-95-(27.33926)));
            yy = -4.97536 + (((tickAnim - 0) / 4) * (0-(-4.97536)));
            zz = 23.13169 + (((tickAnim - 0) / 4) * (0-(23.13169)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 23.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-95 + (((tickAnim - 4) / 5) * (36.77601-(23.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-95)));
            yy = 0 + (((tickAnim - 4) / 5) * (26.40251-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (22.54591-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 36.77601 + (((tickAnim - 9) / 11) * (27.33926-(36.77601)));
            yy = 26.40251 + (((tickAnim - 9) / 11) * (-4.97536-(26.40251)));
            zz = 22.54591 + (((tickAnim - 9) / 11) * (23.13169-(22.54591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.125-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.05-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1.125 + (((tickAnim - 4) / 5) * (0-(1.125)));
            yy = 0.8 + (((tickAnim - 4) / 5) * (0.85-(0.8)));
            zz = 1.05 + (((tickAnim - 4) / 5) * (0-(1.05)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.85 + (((tickAnim - 9) / 11) * (0-(0.85)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 39.25 + (((tickAnim - 0) / 4) * (62.75-(39.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 62.75 + (((tickAnim - 4) / 5) * (26.31565-(62.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (15.19897-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-5.64225-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 26.31565 + (((tickAnim - 9) / 5) * (-6.47226-(26.31565)));
            yy = 15.19897 + (((tickAnim - 9) / 5) * (-0.1959-(15.19897)));
            zz = -5.64225 + (((tickAnim - 9) / 5) * (-9.71664-(-5.64225)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -6.47226 + (((tickAnim - 14) / 6) * (39.25-(-6.47226)));
            yy = -0.1959 + (((tickAnim - 14) / 6) * (0-(-0.1959)));
            zz = -9.71664 + (((tickAnim - 14) / 6) * (0-(-9.71664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 3.6 + (((tickAnim - 0) / 2) * (5.885-(3.6)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.1-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 5.885 + (((tickAnim - 2) / 2) * (4.525-(5.885)));
            zz = -1.1 + (((tickAnim - 2) / 2) * (-2.2-(-1.1)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 4.525 + (((tickAnim - 4) / 5) * (0.825-(4.525)));
            zz = -2.2 + (((tickAnim - 4) / 5) * (-0.975-(-2.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 9) / 5) * (1.675-(0.825)));
            zz = -0.975 + (((tickAnim - 9) / 5) * (0-(-0.975)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 1.675 + (((tickAnim - 14) / 6) * (3.6-(1.675)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-110))*4), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*0.25);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*-0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+40))*1.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-6));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*-6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-8));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.5 + (((tickAnim - 0) / 7) * (38.75-(1.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 38.75 + (((tickAnim - 7) / 5) * (-12.76137-(38.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (-6.17225-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (-2.84854-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -12.76137 + (((tickAnim - 12) / 2) * (-20.71422-(-12.76137)));
            yy = -6.17225 + (((tickAnim - 12) / 2) * (-9.28327-(-6.17225)));
            zz = -2.84854 + (((tickAnim - 12) / 2) * (4.91626-(-2.84854)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -20.71422 + (((tickAnim - 14) / 6) * (1.5-(-20.71422)));
            yy = -9.28327 + (((tickAnim - 14) / 6) * (0-(-9.28327)));
            zz = 4.91626 + (((tickAnim - 14) / 6) * (0-(4.91626)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (21.75-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 21.75 + (((tickAnim - 7) / 5) * (9-(21.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 9 + (((tickAnim - 12) / 2) * (-7-(9)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 14) / 6) * (6.75-(-7)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 14) / 6) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL2.rotationPointX = this.legL2.rotationPointX + (float)(xx);
        this.legL2.rotationPointY = this.legL2.rotationPointY - (float)(yy);
        this.legL2.rotationPointZ = this.legL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6 + (((tickAnim - 0) / 7) * (32.5-(6)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 7) / 1) * (51.33-(32.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 51.33 + (((tickAnim - 8) / 2) * (46.32-(51.33)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 46.32 + (((tickAnim - 10) / 2) * (32.5-(46.32)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 32.5 + (((tickAnim - 12) / 2) * (38.25-(32.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 38.25 + (((tickAnim - 14) / 3) * (10.7-(38.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 10.7 + (((tickAnim - 17) / 3) * (6-(10.7)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 7) * (2.175-(0.625)));
            zz = 0 + (((tickAnim - 0) / 7) * (1.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 2.175 + (((tickAnim - 7) / 1) * (3.865-(2.175)));
            zz = 1.025 + (((tickAnim - 7) / 1) * (0.72-(1.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 3.865 + (((tickAnim - 8) / 2) * (5.105-(3.865)));
            zz = 0.72 + (((tickAnim - 8) / 2) * (0.31-(0.72)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 5.105 + (((tickAnim - 10) / 2) * (3.4-(5.105)));
            zz = 0.31 + (((tickAnim - 10) / 2) * (0-(0.31)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 3.4 + (((tickAnim - 12) / 2) * (0-(3.4)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.625-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -12.76137 + (((tickAnim - 0) / 3) * (-20.71422-(-12.76137)));
            yy = 6.17225 + (((tickAnim - 0) / 3) * (9.28327-(6.17225)));
            zz = 2.84854 + (((tickAnim - 0) / 3) * (4.91626-(2.84854)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -20.71422 + (((tickAnim - 3) / 11) * (37-(-20.71422)));
            yy = 9.28327 + (((tickAnim - 3) / 11) * (0-(9.28327)));
            zz = 4.91626 + (((tickAnim - 3) / 11) * (0-(4.91626)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 37 + (((tickAnim - 14) / 6) * (-12.76137-(37)));
            yy = 0 + (((tickAnim - 14) / 6) * (6.17225-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (2.84854-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9 + (((tickAnim - 0) / 3) * (-7-(9)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 14) {
            xx = -7 + (((tickAnim - 3) / 11) * (21.75-(-7)));
            yy = 0 + (((tickAnim - 3) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 11) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 21.75 + (((tickAnim - 14) / 6) * (9-(21.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 17) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR2.rotationPointX = this.legR2.rotationPointX + (float)(xx);
        this.legR2.rotationPointY = this.legR2.rotationPointY - (float)(yy);
        this.legR2.rotationPointZ = this.legR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.5 + (((tickAnim - 0) / 3) * (44.5-(32.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 44.5 + (((tickAnim - 3) / 2) * (11.25-(44.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 5) / 3) * (-8-(11.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -8 + (((tickAnim - 8) / 6) * (32.5-(-8)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 14) / 3) * (51.33-(32.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 51.33 + (((tickAnim - 17) / 1) * (46.32-(51.33)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 46.32 + (((tickAnim - 18) / 2) * (32.5-(46.32)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 3.4 + (((tickAnim - 0) / 3) * (0-(3.4)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.79-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.79 + (((tickAnim - 5) / 3) * (-0.8-(-0.79)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.8 + (((tickAnim - 8) / 6) * (2.7-(-0.8)));
            zz = 0 + (((tickAnim - 8) / 6) * (1.025-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 2.7 + (((tickAnim - 14) / 3) * (3.865-(2.7)));
            zz = 1.025 + (((tickAnim - 14) / 3) * (0.72-(1.025)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 3.865 + (((tickAnim - 17) / 1) * (5.105-(3.865)));
            zz = 0.72 + (((tickAnim - 17) / 1) * (0.31-(0.72)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 5.105 + (((tickAnim - 18) / 2) * (3.4-(5.105)));
            zz = 0.31 + (((tickAnim - 18) / 2) * (0-(0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-118))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*6));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-190))*4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-230))*-3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-4), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*-6));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraRechnisaurus e = (EntityPrehistoricFloraRechnisaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
