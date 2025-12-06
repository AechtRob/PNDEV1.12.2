package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTricerichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
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
    private final AdvancedModelRenderer leftCleithrum;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightCleithrum;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail3;

    public ModelTricerichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -6.0F, -1.0F, 4, 4, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.7256F, -5.1925F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 19, -0.5F, -1.0F, 0.0F, 2, 1, 3, 0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.208F, -7.1243F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 5, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.7791F, -4.0601F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 18, -0.5F, -1.0F, -4.0F, 2, 1, 4, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -4.9746F, -3.636F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 30, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -6.2425F, -0.917F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 44, -3.025F, 1.0F, -1.55F, 1, 1, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 44, 0.025F, 1.0F, -1.55F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, -2.5F, 0.0F, -3.0F, 3, 2, 3, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -5.3972F, -2.7296F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 44, -1.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -7.0889F, 0.8384F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 40, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -10.0175F, 4.7264F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 35, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.0889F, 1.2384F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 0, -0.5F, -0.2F, -0.45F, 1, 1, 5, 0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -6.2966F, -0.673F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 40, 0.5F, -0.875F, -0.125F, 1, 1, 2, 0.006F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -7.0F, 2.5F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 9, -0.5F, 0.0F, -3.5F, 3, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -2.0F, -1.0F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 24, -0.5F, -2.0F, -2.875F, 3, 2, 3, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.183F, 1.092F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 13, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -1.0F, -1.0F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 16, -0.5F, -1.0F, 0.1F, 3, 1, 4, 0.0F, false));

        this.leftCleithrum = new AdvancedModelRenderer(this);
        this.leftCleithrum.setRotationPoint(1.5688F, -2.2626F, 0.9301F);
        this.main.addChild(leftCleithrum);
        this.setRotateAngle(leftCleithrum, 0.0F, -0.0611F, -0.1309F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.1188F, 1.2685F, -1.5465F);
        this.leftCleithrum.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 21, 0.475F, -1.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.1188F, 1.1813F, 0.4516F);
        this.leftCleithrum.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 40, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.1188F, -0.2374F, 2.5699F);
        this.leftCleithrum.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.1345F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 40, -0.5F, -0.5F, -2.475F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.1188F, -0.2374F, 2.5699F);
        this.leftCleithrum.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 30, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.003F, false));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(-0.109F, 0.6249F, -0.1619F);
        this.leftCleithrum.addChild(spine);
        this.setRotateAngle(spine, -1.0056F, 0.0686F, -0.8419F);
        this.spine.cubeList.add(new ModelBox(spine, 28, 7, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.spine.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 30, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.003F, false));

        this.rightCleithrum = new AdvancedModelRenderer(this);
        this.rightCleithrum.setRotationPoint(-1.5688F, -2.2626F, 0.9301F);
        this.main.addChild(rightCleithrum);
        this.setRotateAngle(rightCleithrum, 0.0F, 0.0611F, 0.1309F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.1188F, 1.2685F, -1.5465F);
        this.rightCleithrum.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 21, -0.475F, -1.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.1188F, 1.1813F, 0.4516F);
        this.rightCleithrum.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 40, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.1188F, -0.2374F, 2.5699F);
        this.rightCleithrum.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.1345F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 16, 40, -0.5F, -0.5F, -2.475F, 1, 1, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.1188F, -0.2374F, 2.5699F);
        this.rightCleithrum.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3927F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 29, 30, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.003F, true));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(0.109F, 0.6249F, -0.1619F);
        this.rightCleithrum.addChild(spine2);
        this.setRotateAngle(spine2, -1.0056F, -0.0686F, 0.8419F);
        this.spine2.cubeList.add(new ModelBox(spine2, 28, 7, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.spine2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 30, -0.5F, 0.0F, -3.0F, 1, 1, 3, -0.003F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.7F, -1.25F);
        this.main.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 1.0547F, -3.6213F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.6109F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 9, -0.5F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.2912F, -2.133F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 38, -0.5F, 0.2F, 0.15F, 2, 1, 2, -0.006F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 1.0437F, -3.6223F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 24, -0.5F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.1565F, 2.0135F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 9, -1.5F, -2.0935F, -0.0135F, 3, 5, 3, -0.006F, false));
        this.tail.cubeList.add(new ModelBox(tail, 28, 13, -1.5F, -2.0935F, 2.0116F, 3, 3, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, -1.7549F, 5.0353F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.8324F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 40, 1.0F, -0.5F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -2.3213F, 3.8933F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.6579F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 27, 35, -1.0F, 0.0F, 0.75F, 2, 2, 2, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 42, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 1.9065F, 4.7186F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.5236F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 36, 35, -0.5F, -2.0F, -0.3F, 2, 2, 2, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -2.5935F, 2.4865F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0863F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 0, -1.0F, -0.35F, -1.575F, 2, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 1.4952F, 5.6285F);
        this.tail.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.8727F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 44, 0.0F, -1.025F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0F, 2.2815F, 4.0691F);
        this.tail.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.5236F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 39, 26, 0.5F, -0.85F, -0.15F, 1, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 2.9065F, 2.9865F);
        this.tail.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.5236F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 9, 30, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 3.4911F, 1.0104F);
        this.tail.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3011F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 39, 17, -1.5F, -1.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.5F, 2.3017F, 2.1713F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.5131F, 0.3463F, -0.189F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 16, 44, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.5F, 2.3017F, 2.1713F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.5131F, -0.3463F, 0.189F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 16, 44, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1F, 5.6F);
        this.tail.addChild(tail2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 0.2787F, 0.7933F);
        this.tail2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 35, 0.0F, -0.375F, -1.1F, 1, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -0.8476F, -0.1329F);
        this.tail2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3183F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 41, 0, 0.0F, -0.075F, 0.0F, 1, 1, 2, -0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, 0.0F, -2.8F, 0.0F, 0, 5, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.25F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.125F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(backRightFin, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(270);
                this.main.offsetX = 0.250F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
