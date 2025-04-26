package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDesmatosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Desmatosuchus;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended leftBackLeg;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftBjoint;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended leftBfoot;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended rightBackLeg;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended rightBjoint;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended rightBfoot;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended leftFrontLeg;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended LeftFjoint;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended LeftFFoot;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended rightFrontLeg;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended RightFjoint;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended RightFFoot;
    private final AdvancedModelRendererExtended cube_r29;

    private ModelAnimator animator;

    public ModelDesmatosuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Desmatosuchus = new AdvancedModelRendererExtended(this);
        this.Desmatosuchus.setRotationPoint(0.0F, 12.025F, 4.0F);


        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -8.6835F, 7.7253F);
        this.Desmatosuchus.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 46, -5.5F, -3.2982F, -0.4613F, 11, 12, 10, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.2982F, 9.7887F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 42, 56, -3.5F, -1.75F, -0.25F, 7, 8, 10, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 51, 65, -3.5F, -1.75F, -1.25F, 7, 8, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 68, -2.0F, -1.5F, -0.25F, 4, 6, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 7, 75, -2.0F, -1.5F, -1.25F, 4, 6, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 68, -1.5F, -1.25F, 0.0F, 3, 5, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 74, -1.5F, -1.25F, -1.0F, 3, 5, 1, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 67, 66, -1.0F, -1.0F, 0.0F, 2, 3, 9, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 75, 74, -1.0F, -1.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 53, 78, -0.5F, -0.75F, 0.0F, 1, 2, 9, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 72, 97, -0.5F, -0.75F, 9.0F, 1, 2, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 62, 86, -0.5F, -0.75F, -1.0F, 1, 2, 1, 0.0F, false));

        this.leftBackLeg = new AdvancedModelRendererExtended(this);
        this.leftBackLeg.setRotationPoint(5.25F, 0.9518F, 1.7887F);
        this.body3.addChild(leftBackLeg);
        this.setRotateAngle(leftBackLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(2.0F, 1.75F, 0.0F);
        this.leftBackLeg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2986F, 0.0651F, -0.2084F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 112, -3.25F, 9.0F, -2.25F, 4, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 81, 105, -3.25F, -3.0F, 2.75F, 4, 13, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 90, -3.25F, -3.0F, -2.25F, 4, 12, 5, 0.0F, false));

        this.leftBjoint = new AdvancedModelRendererExtended(this);
        this.leftBjoint.setRotationPoint(3.3F, 10.5F, 3.25F);
        this.leftBackLeg.addChild(leftBjoint);
        this.setRotateAngle(leftBjoint, 0.5236F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -5.433F, -2.616F);
        this.leftBjoint.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 113, -1.75F, 5.0F, -1.25F, 3, 1, 4, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 1, -1.75F, 6.0F, -1.25F, 3, 8, 4, 0.0F, false));

        this.leftBfoot = new AdvancedModelRendererExtended(this);
        this.leftBfoot.setRotationPoint(-0.25F, 6.9697F, 1.8901F);
        this.leftBjoint.addChild(leftBfoot);
        this.setRotateAngle(leftBfoot, -0.2618F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.25F, -1.25F);
        this.leftBfoot.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 56, -2.0F, -1.0F, -4.0F, 4, 2, 8, 0.0F, false));

        this.rightBackLeg = new AdvancedModelRendererExtended(this);
        this.rightBackLeg.setRotationPoint(-5.25F, 0.9518F, 1.7887F);
        this.body3.addChild(rightBackLeg);
        this.setRotateAngle(rightBackLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-2.0F, 1.75F, 0.0F);
        this.rightBackLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2986F, -0.0651F, 0.2084F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 81, 105, -0.75F, -3.0F, 2.75F, 4, 13, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 112, -0.75F, 9.0F, -2.25F, 4, 1, 5, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 90, -0.75F, -3.0F, -2.25F, 4, 12, 5, 0.0F, true));

        this.rightBjoint = new AdvancedModelRendererExtended(this);
        this.rightBjoint.setRotationPoint(-3.3F, 10.5F, 3.25F);
        this.rightBackLeg.addChild(rightBjoint);
        this.setRotateAngle(rightBjoint, 0.5236F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -5.433F, -2.616F);
        this.rightBjoint.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 113, -1.25F, 5.0F, -1.25F, 3, 1, 4, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 1, -1.25F, 6.0F, -1.25F, 3, 8, 4, 0.0F, true));

        this.rightBfoot = new AdvancedModelRendererExtended(this);
        this.rightBfoot.setRotationPoint(0.25F, 6.9697F, 1.8901F);
        this.rightBjoint.addChild(rightBfoot);
        this.setRotateAngle(rightBfoot, -0.2618F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.25F, -1.25F);
        this.rightBfoot.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 56, -2.0F, -1.0F, -4.0F, 4, 2, 8, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -2.1202F, 0.279F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.2443F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -7.5F, -0.6298F, -15.779F, 15, 12, 16, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8702F, -0.279F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 28, -4.5F, -2.5F, -15.5F, 9, 1, 16, -0.01F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, -0.6963F, -15.8543F);
        this.body2.addChild(bodyfront);
        this.setRotateAngle(bodyfront, -0.0873F, 0.0F, 0.0F);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 39, 34, -5.5F, 0.9859F, -9.8267F, 11, 11, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 2.4859F, 1.6733F);
        this.bodyfront.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 1, -4.49F, -2.6F, -11.25F, 9, 1, 10, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(-10.3042F, -0.9157F, -4.5524F);
        this.bodyfront.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.119F, 0.734F, 0.5258F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 28, -1.75F, -0.75F, -0.25F, 5, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-3.75F, 1.7359F, -6.8267F);
        this.bodyfront.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2182F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 39, -4.75F, -0.75F, -1.75F, 4, 2, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(10.3042F, -0.9157F, -4.5524F);
        this.bodyfront.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.119F, -0.734F, -0.5258F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 28, -3.25F, -0.75F, -0.25F, 5, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(3.75F, 1.7359F, -6.8267F);
        this.bodyfront.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2182F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 39, 0.75F, -0.75F, -1.75F, 4, 2, 3, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 1.9859F, -9.8267F);
        this.bodyfront.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 62, 12, -4.0F, 0.0F, -6.0F, 8, 7, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 97, -4.0F, 0.0F, 0.0F, 8, 7, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 97, -4.0F, 0.0F, 1.0F, 8, 7, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 63, 13, -0.5F, 0.0F, -6.01F, 1, 1, 0, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 1, 89, -0.5F, -0.001F, -6.0F, 1, 0, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 8.0F, -3.0F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 47, -3.0F, -2.25F, 3.25F, 6, 2, 2, -0.01F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 55, 25, -3.0F, -2.25F, -3.75F, 6, 2, 7, -0.01F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(-3.0F, 0.5F, -0.5F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0807F, 0.1194F, 0.261F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 12, -5.75F, -0.25F, -1.0F, 5, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-4.0F, 0.5F, -2.5F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.2182F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 14, -2.75F, 0.0F, -0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-4.2479F, 0.4674F, -4.0F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.7854F, 0.1309F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 0, -0.25F, 0.5F, -1.0F, 2, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(3.0F, 0.5F, -0.5F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0807F, -0.1194F, -0.261F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 12, 0.75F, -0.25F, -1.0F, 5, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(4.0F, 0.5F, -2.5F);
        this.neck.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.2182F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 14, -0.25F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(4.2479F, 0.4674F, -4.0F);
        this.neck.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.7854F, -0.1309F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 0, -1.75F, 0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 75, 0, -3.0F, -2.0F, -4.25F, 6, 4, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 80, -2.5F, -1.0F, -8.0F, 5, 3, 5, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 38, -1.5F, 1.0F, -11.25F, 3, 1, 4, 0.02F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, 0.5F, -11.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.7854F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 86, -2.0F, 0.25F, -1.0F, 4, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, -1.75F, -8.25F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 80, 66, -1.0F, 0.9F, -3.75F, 2, 2, 4, 0.02F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, -2.0F, -4.25F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 34, 33, -2.0F, 0.0341F, -3.8662F, 4, 1, 4, 0.02F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.2008F, 0.6204F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 28, -2.5F, -0.2008F, -8.6204F, 5, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 45, -1.5F, -0.2008F, -9.8704F, 3, 1, 2, 0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 45, -1.5F, -0.2008F, -11.8704F, 3, 1, 2, 0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 68, -2.0F, -4.2008F, -3.1204F, 4, 4, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 74, 25, -3.0F, -0.2008F, -4.8704F, 6, 2, 5, 0.011F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 2.2992F, -7.1204F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 92, 84, -1.5F, -2.0F, -1.5F, 3, 1, 4, 0.01F, false));

        this.leftFrontLeg = new AdvancedModelRendererExtended(this);
        this.leftFrontLeg.setRotationPoint(5.5F, 9.251F, -6.0207F);
        this.bodyfront.addChild(leftFrontLeg);
        this.setRotateAngle(leftFrontLeg, 0.3491F, 0.2618F, -0.3491F);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.016F, 0.048F);
        this.leftFrontLeg.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2616F, 0.0113F, -0.0421F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 113, -3.25F, 5.25F, -2.0F, 4, 2, 4, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 73, 78, -3.25F, -0.75F, -2.0F, 4, 6, 4, 0.0F, false));

        this.LeftFjoint = new AdvancedModelRendererExtended(this);
        this.LeftFjoint.setRotationPoint(-0.5F, 7.016F, 1.298F);
        this.leftFrontLeg.addChild(LeftFjoint);
        this.setRotateAngle(LeftFjoint, -0.5672F, -0.0436F, 0.3491F);


        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, -3.0F, 0.25F);
        this.LeftFjoint.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 115, -2.5F, 2.5F, -1.0F, 3, 1, 3, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 28, -2.5F, 3.5F, -1.0F, 3, 5, 3, 0.0F, false));

        this.LeftFFoot = new AdvancedModelRendererExtended(this);
        this.LeftFFoot.setRotationPoint(-1.0F, 4.8042F, -0.7206F);
        this.LeftFjoint.addChild(LeftFFoot);
        this.setRotateAngle(LeftFFoot, 0.5672F, 0.0F, 0.0436F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0658F, -0.2566F);
        this.LeftFFoot.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4363F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 75, 36, -2.0F, -0.2172F, -3.3345F, 4, 2, 4, -0.01F, false));

        this.rightFrontLeg = new AdvancedModelRendererExtended(this);
        this.rightFrontLeg.setRotationPoint(-5.5F, 9.251F, -6.0207F);
        this.bodyfront.addChild(rightFrontLeg);
        this.setRotateAngle(rightFrontLeg, 0.3491F, -0.2618F, 0.3491F);


        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(0.5F, 0.016F, 0.048F);
        this.rightFrontLeg.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2616F, -0.0113F, 0.0421F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 113, -0.75F, 5.25F, -2.0F, 4, 2, 4, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 73, 78, -0.75F, -0.75F, -2.0F, 4, 6, 4, 0.0F, true));

        this.RightFjoint = new AdvancedModelRendererExtended(this);
        this.RightFjoint.setRotationPoint(0.5F, 7.016F, 1.298F);
        this.rightFrontLeg.addChild(RightFjoint);
        this.setRotateAngle(RightFjoint, -0.5672F, 0.0436F, -0.3491F);


        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, -3.0F, 0.25F);
        this.RightFjoint.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 28, -0.5F, 3.5F, -1.0F, 3, 5, 3, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 115, -0.5F, 2.5F, -1.0F, 3, 1, 3, 0.0F, true));

        this.RightFFoot = new AdvancedModelRendererExtended(this);
        this.RightFFoot.setRotationPoint(1.0F, 4.8042F, -0.7206F);
        this.RightFjoint.addChild(RightFFoot);
        this.setRotateAngle(RightFFoot, 0.5672F, 0.0F, -0.0436F);


        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0658F, -0.2566F);
        this.RightFFoot.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4363F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 75, 36, -2.0F, -0.2172F, -3.3345F, 4, 2, 4, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Desmatosuchus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck.offsetY = -0.07F;
        this.jaw.rotateAngleX = (float) Math.toRadians(32.5);
        this.head.rotateAngleX = (float) Math.toRadians(-12.5);
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(leftBackLeg, -0.0451F, -0.0301F, 0.0006F);
        this.setRotateAngle(leftBjoint, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(leftBfoot, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(rightBackLeg, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(rightBjoint, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(rightBfoot, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, -0.0886F, -0F, 0.0154F);
        this.setRotateAngle(neck, 0.2712F, -0.0497F, -0.1492F);
        this.setRotateAngle(head, 0.0473F, -0.2556F, -0.0458F);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(leftFrontLeg, -0.48F, 0.2618F, -0.3491F);
        this.setRotateAngle(LeftFjoint, -0.5672F, -0.0436F, 0.3491F);
        this.setRotateAngle(LeftFFoot, 1.3577F, -0.0983F, -0.1562F);
        this.setRotateAngle(rightFrontLeg, 0.7854F, -0.2618F, 0.3491F);
        this.setRotateAngle(RightFjoint, -0.3491F, 0.0436F, -0.3491F);
        this.setRotateAngle(RightFFoot, 0.436F, 0.0184F, -0.0832F);
        this.Desmatosuchus.rotateAngleY = (float) Math.toRadians(90);
        this.Desmatosuchus.offsetY = -0.11F;
        this.Desmatosuchus.offsetZ = -0.04F;
        this.Desmatosuchus.render(0.01F);
        resetToDefaultPose();
    }


    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Desmatosuchus.offsetY = 0.2F;
        this.Desmatosuchus.offsetX = 0.3F;
        this.Desmatosuchus.offsetZ = 2.0F;
        this.Desmatosuchus.rotateAngleY = (float)Math.toRadians(120);
        this.Desmatosuchus.rotateAngleX = (float)Math.toRadians(1);
        this.Desmatosuchus.rotateAngleZ = (float)Math.toRadians(0);
        this.Desmatosuchus.scaleChildren = true;
        float scaler = 0.45F;
        this.Desmatosuchus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Desmatosuchus, 0.2F, 3.8F, -0.0F);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(leftBackLeg, -0.0451F, -0.0301F, 0.0006F);
        this.setRotateAngle(leftBjoint, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(leftBfoot, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(rightBackLeg, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(rightBjoint, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(rightBfoot, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(bodyfront, -0.0886F, -0F, 0.0154F);
        this.setRotateAngle(neck, 0.2712F, -0.0497F, -0.1492F);
        this.setRotateAngle(head, 0.0473F, -0.2556F, -0.0458F);
        this.setRotateAngle(jaw, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(leftFrontLeg, -0.48F, 0.2618F, -0.3491F);
        this.setRotateAngle(LeftFjoint, -0.5672F, -0.0436F, 0.3491F);
        this.setRotateAngle(LeftFFoot, 1.3577F, -0.0983F, -0.1562F);
        this.setRotateAngle(rightFrontLeg, 0.7854F, -0.2618F, 0.3491F);
        this.setRotateAngle(RightFjoint, -0.3491F, 0.0436F, -0.3491F);
        this.setRotateAngle(RightFFoot, 0.436F, 0.0184F, -0.0832F);
        //End of pose, now render the model:
        this.Desmatosuchus.render(f);
        //Reset rotations, positions and sizing:
        this.Desmatosuchus.setScale(1.0F, 1.0F, 1.0F);
        this.Desmatosuchus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Desmatosuchus.offsetY = 0.40F;
        //float ZOffsetter = 0.60F;

        EntityPrehistoricFloraDesmatosuchus entityDesmatosuchus = (EntityPrehistoricFloraDesmatosuchus) e;
        float masterSpeed = entityDesmatosuchus.getTravelSpeed();

        if (entityDesmatosuchus.isDrinking()) {
            this.faceTarget(f3, f4, 6, Desmatosuchus);
        }

        //System.err.println("PFDrink " + entityDesmatosuchus.getPFDrinking());

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        entityDesmatosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityDesmatosuchus.getAnimation() == entityDesmatosuchus.LAY_ANIMATION) {
            this.Desmatosuchus.offsetY = 0F;
            //this.Desmatosuchus.offsetZ = ZOffsetter;
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            return;
         }

        if (f3 == 0.0F || !entityDesmatosuchus.getIsMoving()) { //Not moving
            this.Desmatosuchus.offsetY = 0F;
            //this.Desmatosuchus.offsetZ = ZOffsetter;
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
         }



    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDesmatosuchus ee = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

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
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 3.25 + (((tickAnim - 5) / 7) * (-2.49658-(3.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0.1308-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75+250))*3-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -2.49658 + (((tickAnim - 12) / 11) * (0-(-2.49658)));
            yy = 0.1308 + (((tickAnim - 12) / 11) * (0-(0.1308)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75+250))*3 + (((tickAnim - 12) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75+250))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 4.5 + (((tickAnim - 5) / 7) * (1.49036-(4.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0.16979-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.75-250))*7-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 1.49036 + (((tickAnim - 12) / 11) * (0-(1.49036)));
            yy = 0.16979 + (((tickAnim - 12) / 11) * (0-(0.16979)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.75-250))*7 + (((tickAnim - 12) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.75-250))*7)));
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
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (17.75-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 17.75 + (((tickAnim - 12) / 11) * (0-(17.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.075-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.075 + (((tickAnim - 13) / 0) * (0-(0.075)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 1) * (0.075-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 16) / 1) * (0-(0.075)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0.075-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 19) / 1) * (0-(0.075)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-185))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBackLeg, rightBackLeg.rotateAngleX + (float) Math.toRadians(xx), rightBackLeg.rotateAngleY + (float) Math.toRadians(yy), rightBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBjoint, rightBjoint.rotateAngleX + (float) Math.toRadians(xx), rightBjoint.rotateAngleY + (float) Math.toRadians(yy), rightBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBfoot, rightBfoot.rotateAngleX + (float) Math.toRadians(xx), rightBfoot.rotateAngleY + (float) Math.toRadians(yy), rightBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 3.25 + (((tickAnim - 23) / 24) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 23) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 24) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 3.25 + (((tickAnim - 47) / 23) * (0-(3.25)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 10.5 + (((tickAnim - 23) / 24) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 23) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 24) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 10.5 + (((tickAnim - 47) / 23) * (0-(10.5)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 23.75 + (((tickAnim - 23) / 4) * (21.54842-(23.75)));
            yy = 0 + (((tickAnim - 23) / 4) * (-0.67716-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (1.19238-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 21.54842 + (((tickAnim - 27) / 4) * (20.60984-(21.54842)));
            yy = -0.67716 + (((tickAnim - 27) / 4) * (2.13681-(-0.67716)));
            zz = 1.19238 + (((tickAnim - 27) / 4) * (-6.14442-(1.19238)));
        }
        else if (tickAnim >= 31 && tickAnim < 47) {
            xx = 20.60984 + (((tickAnim - 31) / 16) * (14.20304-(20.60984)));
            yy = 2.13681 + (((tickAnim - 31) / 16) * (1.16797-(2.13681)));
            zz = -6.14442 + (((tickAnim - 31) / 16) * (-4.60449-(-6.14442)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 14.20304 + (((tickAnim - 47) / 23) * (0-(14.20304)));
            yy = 1.16797 + (((tickAnim - 47) / 23) * (0-(1.16797)));
            zz = -4.60449 + (((tickAnim - 47) / 23) * (0-(-4.60449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (23.86364-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (-0.90909-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 23.86364 + (((tickAnim - 27) / 3) * (-10.5-(23.86364)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = -0.90909 + (((tickAnim - 27) / 3) * (0-(-0.90909)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 30) / 3) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (5.69118-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (-1.17647-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 47) {
            xx = 5.69118 + (((tickAnim - 37) / 10) * (12.25-(5.69118)));
            yy = 0 + (((tickAnim - 37) / 10) * (0-(0)));
            zz = -1.17647 + (((tickAnim - 37) / 10) * (-10-(-1.17647)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 12.25 + (((tickAnim - 47) / 23) * (0-(12.25)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = -10 + (((tickAnim - 47) / 23) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 7.5 + (((tickAnim - 38) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (7.5-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 7.5 + (((tickAnim - 45) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.77184-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.06341-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-29.95386-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -13.77184 + (((tickAnim - 5) / 6) * (-27.41744-(-13.77184)));
            yy = 2.06341 + (((tickAnim - 5) / 6) * (-0.42419-(2.06341)));
            zz = -29.95386 + (((tickAnim - 5) / 6) * (-31.09326-(-29.95386)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -27.41744 + (((tickAnim - 11) / 12) * (-29.74162-(-27.41744)));
            yy = -0.42419 + (((tickAnim - 11) / 12) * (-1.8449-(-0.42419)));
            zz = -31.09326 + (((tickAnim - 11) / 12) * (-40.7693-(-31.09326)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = -29.74162 + (((tickAnim - 23) / 24) * (-29.74162-(-29.74162)));
            yy = -1.8449 + (((tickAnim - 23) / 24) * (-1.8449-(-1.8449)));
            zz = -40.7693 + (((tickAnim - 23) / 24) * (-40.7693-(-40.7693)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -29.74162 + (((tickAnim - 47) / 23) * (0-(-29.74162)));
            yy = -1.8449 + (((tickAnim - 47) / 23) * (0-(-1.8449)));
            zz = -40.7693 + (((tickAnim - 47) / 23) * (0-(-40.7693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.09454-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.89122-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (7.33016-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -8.09454 + (((tickAnim - 5) / 6) * (2.2324-(-8.09454)));
            yy = -1.89122 + (((tickAnim - 5) / 6) * (-4.72805-(-1.89122)));
            zz = 7.33016 + (((tickAnim - 5) / 6) * (18.3254-(7.33016)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 2.2324 + (((tickAnim - 11) / 12) * (0.7773-(2.2324)));
            yy = -4.72805 + (((tickAnim - 11) / 12) * (-9.4561-(-4.72805)));
            zz = 18.3254 + (((tickAnim - 11) / 12) * (36.6508-(18.3254)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 0.7773 + (((tickAnim - 23) / 24) * (0.7773-(0.7773)));
            yy = -9.4561 + (((tickAnim - 23) / 24) * (-9.4561-(-9.4561)));
            zz = 36.6508 + (((tickAnim - 23) / 24) * (36.6508-(36.6508)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 0.7773 + (((tickAnim - 47) / 23) * (0-(0.7773)));
            yy = -9.4561 + (((tickAnim - 47) / 23) * (0-(-9.4561)));
            zz = 36.6508 + (((tickAnim - 47) / 23) * (0-(36.6508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.98489-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.76975-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.10622-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.98489 + (((tickAnim - 5) / 3) * (1.12182-(14.98489)));
            yy = -1.76975 + (((tickAnim - 5) / 3) * (-1.83505-(-1.76975)));
            zz = 2.10622 + (((tickAnim - 5) / 3) * (2.18393-(2.10622)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1.12182 + (((tickAnim - 8) / 3) * (7.46979-(1.12182)));
            yy = -1.83505 + (((tickAnim - 8) / 3) * (-3.53949-(-1.83505)));
            zz = 2.18393 + (((tickAnim - 8) / 3) * (4.21243-(2.18393)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 7.46979 + (((tickAnim - 11) / 12) * (4.75-(7.46979)));
            yy = -3.53949 + (((tickAnim - 11) / 12) * (0-(-3.53949)));
            zz = 4.21243 + (((tickAnim - 11) / 12) * (0-(4.21243)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 4.75 + (((tickAnim - 23) / 24) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 23) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 24) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 47) / 23) * (0-(4.75)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.45323-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.02779-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (22.45873-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -13.45323 + (((tickAnim - 10) / 5) * (-23.41857-(-13.45323)));
            yy = -0.02779 + (((tickAnim - 10) / 5) * (0.95603-(-0.02779)));
            zz = 22.45873 + (((tickAnim - 10) / 5) * (46.87465-(22.45873)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -23.41857 + (((tickAnim - 15) / 5) * (-22.95842-(-23.41857)));
            yy = 0.95603 + (((tickAnim - 15) / 5) * (0.62877-(0.95603)));
            zz = 46.87465 + (((tickAnim - 15) / 5) * (38.47137-(46.87465)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -22.95842 + (((tickAnim - 20) / 3) * (-29.74162-(-22.95842)));
            yy = 0.62877 + (((tickAnim - 20) / 3) * (1.84489-(0.62877)));
            zz = 38.47137 + (((tickAnim - 20) / 3) * (40.76931-(38.47137)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = -29.74162 + (((tickAnim - 23) / 24) * (-29.74162-(-29.74162)));
            yy = 1.84489 + (((tickAnim - 23) / 24) * (1.84489-(1.84489)));
            zz = 40.76931 + (((tickAnim - 23) / 24) * (40.76931-(40.76931)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -29.74162 + (((tickAnim - 47) / 23) * (0-(-29.74162)));
            yy = 1.84489 + (((tickAnim - 47) / 23) * (0-(1.84489)));
            zz = 40.76931 + (((tickAnim - 47) / 23) * (0-(40.76931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.18909-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.78244-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-14.66034-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.18909 + (((tickAnim - 10) / 10) * (-12.53504-(1.18909)));
            yy = 3.78244 + (((tickAnim - 10) / 10) * (5.51679-(3.78244)));
            zz = -14.66034 + (((tickAnim - 10) / 10) * (-21.3825-(-14.66034)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -12.53504 + (((tickAnim - 20) / 3) * (-0.77727-(-12.53504)));
            yy = 5.51679 + (((tickAnim - 20) / 3) * (9.4561-(5.51679)));
            zz = -21.3825 + (((tickAnim - 20) / 3) * (-36.65084-(-21.3825)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = -0.77727 + (((tickAnim - 23) / 24) * (-0.77727-(-0.77727)));
            yy = 9.4561 + (((tickAnim - 23) / 24) * (9.4561-(9.4561)));
            zz = -36.65084 + (((tickAnim - 23) / 24) * (-36.65084-(-36.65084)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = -0.77727 + (((tickAnim - 47) / 23) * (0-(-0.77727)));
            yy = 9.4561 + (((tickAnim - 47) / 23) * (0-(9.4561)));
            zz = -36.65084 + (((tickAnim - 47) / 23) * (0-(-36.65084)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.75343-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.38558-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.95646-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.75343 + (((tickAnim - 10) / 5) * (21.75229-(1.75343)));
            yy = 3.38558 + (((tickAnim - 10) / 5) * (2.25705-(3.38558)));
            zz = -4.95646 + (((tickAnim - 10) / 5) * (-3.3043-(-4.95646)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 21.75229 + (((tickAnim - 15) / 5) * (-3.74886-(21.75229)));
            yy = 2.25705 + (((tickAnim - 15) / 5) * (1.12853-(2.25705)));
            zz = -3.3043 + (((tickAnim - 15) / 5) * (-1.65215-(-3.3043)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -3.74886 + (((tickAnim - 20) / 3) * (4.75-(-3.74886)));
            yy = 1.12853 + (((tickAnim - 20) / 3) * (0-(1.12853)));
            zz = -1.65215 + (((tickAnim - 20) / 3) * (0-(-1.65215)));
        }
        else if (tickAnim >= 23 && tickAnim < 47) {
            xx = 4.75 + (((tickAnim - 23) / 24) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 23) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 24) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 70) {
            xx = 4.75 + (((tickAnim - 47) / 23) * (0-(4.75)));
            yy = 0 + (((tickAnim - 47) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.78049-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (-8.49014-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0.41083-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.78049 + (((tickAnim - 35) / 15) * (0-(-2.78049)));
            yy = -8.49014 + (((tickAnim - 35) / 15) * (0-(-8.49014)));
            zz = 0.41083 + (((tickAnim - 35) / 15) * (0-(0.41083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2 + (((tickAnim - 15) / 20) * (-2.02601-(-2)));
            yy = 3.25 + (((tickAnim - 15) / 20) * (-9.74205-(3.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0.4564-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.02601 + (((tickAnim - 35) / 15) * (0-(-2.02601)));
            yy = -9.74205 + (((tickAnim - 35) / 15) * (0-(-9.74205)));
            zz = 0.4564 + (((tickAnim - 35) / 15) * (0-(0.4564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.50479-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.9944-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.18331-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.50479 + (((tickAnim - 15) / 20) * (-3.50083-(-3.50479)));
            yy = 2.9944 + (((tickAnim - 15) / 20) * (-1.24767-(2.9944)));
            zz = -0.18331 + (((tickAnim - 15) / 20) * (0.07632-(-0.18331)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.50083 + (((tickAnim - 35) / 5) * (-3.53877-(-3.50083)));
            yy = -1.24767 + (((tickAnim - 35) / 5) * (-8.48403-(-1.24767)));
            zz = 0.07632 + (((tickAnim - 35) / 5) * (0.52274-(0.07632)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.53877 + (((tickAnim - 40) / 10) * (0-(-3.53877)));
            yy = -8.48403 + (((tickAnim - 40) / 10) * (0-(-8.48403)));
            zz = 0.52274 + (((tickAnim - 40) / 10) * (0-(0.52274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 15) / 20) * (-3.00232-(-3)));
            yy = 3 + (((tickAnim - 15) / 20) * (3.74897-(3)));
            zz = 0 + (((tickAnim - 15) / 20) * (-0.03934-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.00232 + (((tickAnim - 35) / 5) * (-3.00511-(-3.00232)));
            yy = 3.74897 + (((tickAnim - 35) / 5) * (-4.48973-(3.74897)));
            zz = -0.03934 + (((tickAnim - 35) / 5) * (0.39261-(-0.03934)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.00511 + (((tickAnim - 40) / 10) * (0-(-3.00511)));
            yy = -4.48973 + (((tickAnim - 40) / 10) * (0-(-4.48973)));
            zz = 0.39261 + (((tickAnim - 40) / 10) * (0-(0.39261)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 11.5 + (((tickAnim - 15) / 20) * (5-(11.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 5 + (((tickAnim - 35) / 5) * (-11.25-(5)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -11.25 + (((tickAnim - 40) / 10) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 25) / 10) * (-1.36243-(23)));
            yy = 0 + (((tickAnim - 25) / 10) * (-7.98358-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-5.86231-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -1.36243 + (((tickAnim - 35) / 15) * (0-(-1.36243)));
            yy = -7.98358 + (((tickAnim - 35) / 15) * (0-(-7.98358)));
            zz = -5.86231 + (((tickAnim - 35) / 15) * (0-(-5.86231)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (1.075-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.075 + (((tickAnim - 35) / 8) * (1.51-(1.075)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 1.51 + (((tickAnim - 43) / 7) * (0-(1.51)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBackLeg.rotationPointX = this.leftBackLeg.rotationPointX + (float)(xx);
        this.leftBackLeg.rotationPointY = this.leftBackLeg.rotationPointY - (float)(yy);
        this.leftBackLeg.rotationPointZ = this.leftBackLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (27.73153-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-5.92478-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-9.28466-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 27.73153 + (((tickAnim - 25) / 10) * (31.73931-(27.73153)));
            yy = -5.92478 + (((tickAnim - 25) / 10) * (-4.12098-(-5.92478)));
            zz = -9.28466 + (((tickAnim - 25) / 10) * (-10.80195-(-9.28466)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 31.73931 + (((tickAnim - 35) / 8) * (-10.38035-(31.73931)));
            yy = -4.12098 + (((tickAnim - 35) / 8) * (-2.06049-(-4.12098)));
            zz = -10.80195 + (((tickAnim - 35) / 8) * (-5.40097-(-10.80195)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.38035 + (((tickAnim - 43) / 7) * (0-(-10.38035)));
            yy = -2.06049 + (((tickAnim - 43) / 7) * (0-(-2.06049)));
            zz = -5.40097 + (((tickAnim - 43) / 7) * (0-(-5.40097)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -13.4 + (((tickAnim - 10) / 8) * (-9.57-(-13.4)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.57 + (((tickAnim - 18) / 7) * (45.25-(-9.57)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 45.25 + (((tickAnim - 25) / 10) * (6.93-(45.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 46) {
            xx = 6.93 + (((tickAnim - 35) / 11) * (-11.67-(6.93)));
            yy = 0 + (((tickAnim - 35) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 11) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -11.67 + (((tickAnim - 46) / 4) * (0-(-11.67)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -6.25 + (((tickAnim - 15) / 20) * (-6.25-(-6.25)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -6.25 + (((tickAnim - 35) / 15) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.46948-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-13.88582-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.80221-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 7.46948 + (((tickAnim - 15) / 10) * (8.3275-(7.46948)));
            yy = -13.88582 + (((tickAnim - 15) / 10) * (-16.86-(-13.88582)));
            zz = -1.80221 + (((tickAnim - 15) / 10) * (-2.20954-(-1.80221)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 8.3275 + (((tickAnim - 25) / 10) * (7.46948-(8.3275)));
            yy = -16.86 + (((tickAnim - 25) / 10) * (-13.88582-(-16.86)));
            zz = -2.20954 + (((tickAnim - 25) / 10) * (-1.80221-(-2.20954)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.46948 + (((tickAnim - 35) / 15) * (0-(7.46948)));
            yy = -13.88582 + (((tickAnim - 35) / 15) * (0-(-13.88582)));
            zz = -1.80221 + (((tickAnim - 35) / 15) * (0-(-1.80221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (3.25-(0)));
            yy = -20.25 + (((tickAnim - 15) / 10) * (-20.25-(-20.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 3.25 + (((tickAnim - 25) / 10) * (0-(3.25)));
            yy = -20.25 + (((tickAnim - 25) / 10) * (-20.25-(-20.25)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -20.25 + (((tickAnim - 35) / 15) * (0-(-20.25)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-22.75-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -22.75 + (((tickAnim - 8) / 7) * (0-(-22.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-22.75-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = -22.75 + (((tickAnim - 43) / 7) * (0-(-22.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17.17845-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.48902-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.49363-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -17.17845 + (((tickAnim - 8) / 7) * (0-(-17.17845)));
            yy = 6.48902 + (((tickAnim - 8) / 7) * (0-(6.48902)));
            zz = 5.49363 + (((tickAnim - 8) / 7) * (0-(5.49363)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (-14.66525-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (11.46342-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (10.13481-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -14.66525 + (((tickAnim - 43) / 7) * (0-(-14.66525)));
            yy = 11.46342 + (((tickAnim - 43) / 7) * (0-(11.46342)));
            zz = 10.13481 + (((tickAnim - 43) / 7) * (0-(10.13481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 20.25 + (((tickAnim - 8) / 7) * (0-(20.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (20.25-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 20.25 + (((tickAnim - 43) / 7) * (0-(20.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.5648-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (9.05104-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.84769-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.5648 + (((tickAnim - 15) / 20) * (-0.5648-(-0.5648)));
            yy = 9.05104 + (((tickAnim - 15) / 20) * (9.05104-(9.05104)));
            zz = 6.84769 + (((tickAnim - 15) / 20) * (6.84769-(6.84769)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.5648 + (((tickAnim - 35) / 15) * (0-(-0.5648)));
            yy = 9.05104 + (((tickAnim - 35) / 15) * (0-(9.05104)));
            zz = 6.84769 + (((tickAnim - 35) / 15) * (0-(6.84769)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.49636-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11.43294-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.67868-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.49636 + (((tickAnim - 15) / 20) * (3.49636-(3.49636)));
            yy = 11.43294 + (((tickAnim - 15) / 20) * (11.43294-(11.43294)));
            zz = -8.67868 + (((tickAnim - 15) / 20) * (-8.67868-(-8.67868)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.49636 + (((tickAnim - 35) / 15) * (0-(3.49636)));
            yy = 11.43294 + (((tickAnim - 35) / 15) * (0-(11.43294)));
            zz = -8.67868 + (((tickAnim - 35) / 15) * (0-(-8.67868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -2.25 + (((tickAnim - 15) / 20) * (-2.25-(-2.25)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -2.25 + (((tickAnim - 35) / 15) * (0-(-2.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -12.75 + (((tickAnim - 23) / 5) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 28) / 22) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -3.75 + (((tickAnim - 23) / 5) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -3.75 + (((tickAnim - 28) / 22) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(xx);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(yy);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1.75 + (((tickAnim - 23) / 5) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 28) / 22) * (0-(1.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1.75 + (((tickAnim - 23) / 5) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 28) / 22) * (0-(1.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.25 + (((tickAnim - 23) / 5) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 28) / 22) * (0-(3.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.75 + (((tickAnim - 23) / 5) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 28) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.25 + (((tickAnim - 23) / 5) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 28) / 22) * (0-(5.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -15.5 + (((tickAnim - 23) / 5) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 28) / 22) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (56.6602-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.81451-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-10.0898-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 56.6602 + (((tickAnim - 23) / 5) * (56.6602-(56.6602)));
            yy = -1.81451 + (((tickAnim - 23) / 5) * (-1.81451-(-1.81451)));
            zz = -10.0898 + (((tickAnim - 23) / 5) * (-10.0898-(-10.0898)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 56.6602 + (((tickAnim - 28) / 22) * (0-(56.6602)));
            yy = -1.81451 + (((tickAnim - 28) / 22) * (0-(-1.81451)));
            zz = -10.0898 + (((tickAnim - 28) / 22) * (0-(-10.0898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-27.2041-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.18455-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.40688-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -27.2041 + (((tickAnim - 23) / 5) * (-27.2041-(-27.2041)));
            yy = 2.18455 + (((tickAnim - 23) / 5) * (2.18455-(2.18455)));
            zz = 2.40688 + (((tickAnim - 23) / 5) * (2.40688-(2.40688)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.2041 + (((tickAnim - 28) / 22) * (0-(-27.2041)));
            yy = 2.18455 + (((tickAnim - 28) / 22) * (0-(2.18455)));
            zz = 2.40688 + (((tickAnim - 28) / 22) * (0-(2.40688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -14 + (((tickAnim - 23) / 5) * (-14-(-14)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -14 + (((tickAnim - 28) / 22) * (0-(-14)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBackLeg, rightBackLeg.rotateAngleX + (float) Math.toRadians(xx), rightBackLeg.rotateAngleY + (float) Math.toRadians(yy), rightBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (56.81737-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (3.09977-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (9.66592-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 56.81737 + (((tickAnim - 23) / 5) * (56.81737-(56.81737)));
            yy = 3.09977 + (((tickAnim - 23) / 5) * (3.09977-(3.09977)));
            zz = 9.66592 + (((tickAnim - 23) / 5) * (9.66592-(9.66592)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 56.81737 + (((tickAnim - 28) / 22) * (0-(56.81737)));
            yy = 3.09977 + (((tickAnim - 28) / 22) * (0-(3.09977)));
            zz = 9.66592 + (((tickAnim - 28) / 22) * (0-(9.66592)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBjoint, rightBjoint.rotateAngleX + (float) Math.toRadians(xx), rightBjoint.rotateAngleY + (float) Math.toRadians(yy), rightBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-28.99019-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.04193-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-1.07913-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -28.99019 + (((tickAnim - 23) / 5) * (-28.99019-(-28.99019)));
            yy = -1.04193 + (((tickAnim - 23) / 5) * (-1.04193-(-1.04193)));
            zz = -1.07913 + (((tickAnim - 23) / 5) * (-1.07913-(-1.07913)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -28.99019 + (((tickAnim - 28) / 22) * (0-(-28.99019)));
            yy = -1.04193 + (((tickAnim - 28) / 22) * (0-(-1.04193)));
            zz = -1.07913 + (((tickAnim - 28) / 22) * (0-(-1.07913)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBfoot, rightBfoot.rotateAngleX + (float) Math.toRadians(xx), rightBfoot.rotateAngleY + (float) Math.toRadians(yy), rightBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.25 + (((tickAnim - 23) / 5) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 28) / 22) * (0-(4.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.5 + (((tickAnim - 23) / 5) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.5 + (((tickAnim - 28) / 22) * (0-(11.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -3.75 + (((tickAnim - 23) / 5) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -3.75 + (((tickAnim - 28) / 22) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (24.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 13) / 20) * (-2-(5.5)));
            yy = 24.5 + (((tickAnim - 13) / 20) * (-8.75-(24.5)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 33) / 17) * (0-(-2)));
            yy = -8.75 + (((tickAnim - 33) / 17) * (0-(-8.75)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (6.15832-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (8.96143-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-5.28597-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 6.15832 + (((tickAnim - 23) / 5) * (6.15832-(6.15832)));
            yy = 8.96143 + (((tickAnim - 23) / 5) * (8.96143-(8.96143)));
            zz = -5.28597 + (((tickAnim - 23) / 5) * (-5.28597-(-5.28597)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 6.15832 + (((tickAnim - 28) / 22) * (0-(6.15832)));
            yy = 8.96143 + (((tickAnim - 28) / 22) * (0-(8.96143)));
            zz = -5.28597 + (((tickAnim - 28) / 22) * (0-(-5.28597)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-31-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -31 + (((tickAnim - 23) / 5) * (-31-(-31)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -31 + (((tickAnim - 28) / 22) * (0-(-31)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.42741-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.51343-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.42502-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 19.42741 + (((tickAnim - 23) / 5) * (19.42741-(19.42741)));
            yy = -1.51343 + (((tickAnim - 23) / 5) * (-1.51343-(-1.51343)));
            zz = 2.42502 + (((tickAnim - 23) / 5) * (2.42502-(2.42502)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 19.42741 + (((tickAnim - 28) / 22) * (0-(19.42741)));
            yy = -1.51343 + (((tickAnim - 28) / 22) * (0-(-1.51343)));
            zz = 2.42502 + (((tickAnim - 28) / 22) * (0-(2.42502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (2.56378-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-11.41766-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (4.07102-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.56378 + (((tickAnim - 23) / 5) * (2.56378-(2.56378)));
            yy = -11.41766 + (((tickAnim - 23) / 5) * (-11.41766-(-11.41766)));
            zz = 4.07102 + (((tickAnim - 23) / 5) * (4.07102-(4.07102)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 2.56378 + (((tickAnim - 28) / 22) * (0-(2.56378)));
            yy = -11.41766 + (((tickAnim - 28) / 22) * (0-(-11.41766)));
            zz = 4.07102 + (((tickAnim - 28) / 22) * (0-(4.07102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-34.73303-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-1.33125-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (4.48794-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -34.73303 + (((tickAnim - 23) / 5) * (-34.73303-(-34.73303)));
            yy = -1.33125 + (((tickAnim - 23) / 5) * (-1.33125-(-1.33125)));
            zz = 4.48794 + (((tickAnim - 23) / 5) * (4.48794-(4.48794)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -34.73303 + (((tickAnim - 28) / 22) * (0-(-34.73303)));
            yy = -1.33125 + (((tickAnim - 28) / 22) * (0-(-1.33125)));
            zz = 4.48794 + (((tickAnim - 28) / 22) * (0-(4.48794)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.29898-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (5.74686-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-4.00342-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24.29898 + (((tickAnim - 23) / 5) * (24.29898-(24.29898)));
            yy = 5.74686 + (((tickAnim - 23) / 5) * (5.74686-(5.74686)));
            zz = -4.00342 + (((tickAnim - 23) / 5) * (-4.00342-(-4.00342)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 24.29898 + (((tickAnim - 28) / 22) * (0-(24.29898)));
            yy = 5.74686 + (((tickAnim - 28) / 22) * (0-(5.74686)));
            zz = -4.00342 + (((tickAnim - 28) / 22) * (0-(-4.00342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*150/0.75-185))*5), tail5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBackLeg, rightBackLeg.rotateAngleX + (float) Math.toRadians(xx), rightBackLeg.rotateAngleY + (float) Math.toRadians(yy), rightBackLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBjoint, rightBjoint.rotateAngleX + (float) Math.toRadians(xx), rightBjoint.rotateAngleY + (float) Math.toRadians(yy), rightBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBfoot, rightBfoot.rotateAngleX + (float) Math.toRadians(xx), rightBfoot.rotateAngleY + (float) Math.toRadians(yy), rightBfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 3.25 + (((tickAnim - 22) / 15) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 22) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 15) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 3.25 + (((tickAnim - 37) / 18) * (0-(3.25)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 10.5 + (((tickAnim - 22) / 15) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 22) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 15) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 10.5 + (((tickAnim - 37) / 18) * (0-(10.5)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(xx), bodyfront.rotateAngleY + (float) Math.toRadians(yy), bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (14.20304-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.16797-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-4.60449-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 14.20304 + (((tickAnim - 22) / 15) * (14.20304-(14.20304)));
            yy = 1.16797 + (((tickAnim - 22) / 15) * (1.16797-(1.16797)));
            zz = -4.60449 + (((tickAnim - 22) / 15) * (-4.60449-(-4.60449)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 14.20304 + (((tickAnim - 37) / 18) * (0-(14.20304)));
            yy = 1.16797 + (((tickAnim - 37) / 18) * (0-(1.16797)));
            zz = -4.60449 + (((tickAnim - 37) / 18) * (0-(-4.60449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-10-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 12.25 + (((tickAnim - 21) / 4) * (16.75-(12.25)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = -10 + (((tickAnim - 21) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 16.75 + (((tickAnim - 25) / 5) * (7.75-(16.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -10 + (((tickAnim - 25) / 5) * (-10-(-10)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7.75 + (((tickAnim - 30) / 5) * (16.75-(7.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -10 + (((tickAnim - 30) / 5) * (-10-(-10)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 16.75 + (((tickAnim - 35) / 4) * (12.25-(16.75)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = -10 + (((tickAnim - 35) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 12.25 + (((tickAnim - 39) / 16) * (0-(12.25)));
            yy = 0 + (((tickAnim - 39) / 16) * (0-(0)));
            zz = -10 + (((tickAnim - 39) / 16) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (7.75-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 25) / 5) * (0-(7.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (7.75-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 7.75 + (((tickAnim - 35) / 4) * (0-(7.75)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 39) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.77184-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.06341-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-29.95386-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -13.77184 + (((tickAnim - 3) / 6) * (-27.41744-(-13.77184)));
            yy = 2.06341 + (((tickAnim - 3) / 6) * (-0.42419-(2.06341)));
            zz = -29.95386 + (((tickAnim - 3) / 6) * (-31.09326-(-29.95386)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -27.41744 + (((tickAnim - 9) / 13) * (-29.74162-(-27.41744)));
            yy = -0.42419 + (((tickAnim - 9) / 13) * (-1.8449-(-0.42419)));
            zz = -31.09326 + (((tickAnim - 9) / 13) * (-40.7693-(-31.09326)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = -29.74162 + (((tickAnim - 22) / 15) * (-29.74162-(-29.74162)));
            yy = -1.8449 + (((tickAnim - 22) / 15) * (-1.8449-(-1.8449)));
            zz = -40.7693 + (((tickAnim - 22) / 15) * (-40.7693-(-40.7693)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = -29.74162 + (((tickAnim - 37) / 18) * (0-(-29.74162)));
            yy = -1.8449 + (((tickAnim - 37) / 18) * (0-(-1.8449)));
            zz = -40.7693 + (((tickAnim - 37) / 18) * (0-(-40.7693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8.09454-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.89122-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (7.33016-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = -8.09454 + (((tickAnim - 3) / 6) * (2.2324-(-8.09454)));
            yy = -1.89122 + (((tickAnim - 3) / 6) * (-4.72805-(-1.89122)));
            zz = 7.33016 + (((tickAnim - 3) / 6) * (18.3254-(7.33016)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 2.2324 + (((tickAnim - 9) / 13) * (0.7773-(2.2324)));
            yy = -4.72805 + (((tickAnim - 9) / 13) * (-9.4561-(-4.72805)));
            zz = 18.3254 + (((tickAnim - 9) / 13) * (36.6508-(18.3254)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 0.7773 + (((tickAnim - 22) / 15) * (0.7773-(0.7773)));
            yy = -9.4561 + (((tickAnim - 22) / 15) * (-9.4561-(-9.4561)));
            zz = 36.6508 + (((tickAnim - 22) / 15) * (36.6508-(36.6508)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 0.7773 + (((tickAnim - 37) / 18) * (0-(0.7773)));
            yy = -9.4561 + (((tickAnim - 37) / 18) * (0-(-9.4561)));
            zz = 36.6508 + (((tickAnim - 37) / 18) * (0-(36.6508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (14.98489-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.76975-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.10622-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 14.98489 + (((tickAnim - 3) / 4) * (1.12182-(14.98489)));
            yy = -1.76975 + (((tickAnim - 3) / 4) * (-1.83505-(-1.76975)));
            zz = 2.10622 + (((tickAnim - 3) / 4) * (2.18393-(2.10622)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.12182 + (((tickAnim - 7) / 2) * (7.46979-(1.12182)));
            yy = -1.83505 + (((tickAnim - 7) / 2) * (-3.53949-(-1.83505)));
            zz = 2.18393 + (((tickAnim - 7) / 2) * (4.21243-(2.18393)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 7.46979 + (((tickAnim - 9) / 13) * (4.75-(7.46979)));
            yy = -3.53949 + (((tickAnim - 9) / 13) * (0-(-3.53949)));
            zz = 4.21243 + (((tickAnim - 9) / 13) * (0-(4.21243)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 4.75 + (((tickAnim - 22) / 15) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 22) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 15) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 4.75 + (((tickAnim - 37) / 18) * (0-(4.75)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-13.45323-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.02779-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (22.45873-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -13.45323 + (((tickAnim - 7) / 5) * (-23.41857-(-13.45323)));
            yy = -0.02779 + (((tickAnim - 7) / 5) * (0.95603-(-0.02779)));
            zz = 22.45873 + (((tickAnim - 7) / 5) * (46.87465-(22.45873)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -23.41857 + (((tickAnim - 12) / 5) * (-22.95842-(-23.41857)));
            yy = 0.95603 + (((tickAnim - 12) / 5) * (0.62877-(0.95603)));
            zz = 46.87465 + (((tickAnim - 12) / 5) * (38.47137-(46.87465)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -22.95842 + (((tickAnim - 17) / 5) * (-29.74162-(-22.95842)));
            yy = 0.62877 + (((tickAnim - 17) / 5) * (1.84489-(0.62877)));
            zz = 38.47137 + (((tickAnim - 17) / 5) * (40.76931-(38.47137)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = -29.74162 + (((tickAnim - 22) / 15) * (-29.74162-(-29.74162)));
            yy = 1.84489 + (((tickAnim - 22) / 15) * (1.84489-(1.84489)));
            zz = 40.76931 + (((tickAnim - 22) / 15) * (40.76931-(40.76931)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = -29.74162 + (((tickAnim - 37) / 18) * (0-(-29.74162)));
            yy = 1.84489 + (((tickAnim - 37) / 18) * (0-(1.84489)));
            zz = 40.76931 + (((tickAnim - 37) / 18) * (0-(40.76931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (1.18909-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.78244-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-14.66034-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 1.18909 + (((tickAnim - 7) / 10) * (-12.53504-(1.18909)));
            yy = 3.78244 + (((tickAnim - 7) / 10) * (5.51679-(3.78244)));
            zz = -14.66034 + (((tickAnim - 7) / 10) * (-21.3825-(-14.66034)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -12.53504 + (((tickAnim - 17) / 5) * (-0.77727-(-12.53504)));
            yy = 5.51679 + (((tickAnim - 17) / 5) * (9.4561-(5.51679)));
            zz = -21.3825 + (((tickAnim - 17) / 5) * (-36.65084-(-21.3825)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = -0.77727 + (((tickAnim - 22) / 15) * (-0.77727-(-0.77727)));
            yy = 9.4561 + (((tickAnim - 22) / 15) * (9.4561-(9.4561)));
            zz = -36.65084 + (((tickAnim - 22) / 15) * (-36.65084-(-36.65084)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = -0.77727 + (((tickAnim - 37) / 18) * (0-(-0.77727)));
            yy = 9.4561 + (((tickAnim - 37) / 18) * (0-(9.4561)));
            zz = -36.65084 + (((tickAnim - 37) / 18) * (0-(-36.65084)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (1.75343-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.38558-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-4.95646-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 1.75343 + (((tickAnim - 7) / 5) * (21.75229-(1.75343)));
            yy = 3.38558 + (((tickAnim - 7) / 5) * (2.25705-(3.38558)));
            zz = -4.95646 + (((tickAnim - 7) / 5) * (-3.3043-(-4.95646)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 21.75229 + (((tickAnim - 12) / 5) * (-3.74886-(21.75229)));
            yy = 2.25705 + (((tickAnim - 12) / 5) * (1.12853-(2.25705)));
            zz = -3.3043 + (((tickAnim - 12) / 5) * (-1.65215-(-3.3043)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -3.74886 + (((tickAnim - 17) / 5) * (4.75-(-3.74886)));
            yy = 1.12853 + (((tickAnim - 17) / 5) * (0-(1.12853)));
            zz = -1.65215 + (((tickAnim - 17) / 5) * (0-(-1.65215)));
        }
        else if (tickAnim >= 22 && tickAnim < 37) {
            xx = 4.75 + (((tickAnim - 22) / 15) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 22) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 15) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 55) {
            xx = 4.75 + (((tickAnim - 37) / 18) * (0-(4.75)));
            yy = 0 + (((tickAnim - 37) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 2 + (((tickAnim - 5) / 6) * (3.08-(2)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 3.08 + (((tickAnim - 11) / 9) * (0-(3.08)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 15) / 5) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 9) / 11) * (0-(0.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 2) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 3) / 2) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.05 + (((tickAnim - 7) / 1) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 2) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 2) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.05 + (((tickAnim - 17) / 1) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-1))*0.3), bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*-2), bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+250))*1), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-1.5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+50))*1.5), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+250))*-3), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+150))*2));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+250))*1.8), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-4.5), body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-50))*2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-3), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+15))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-250))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+360))*2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+360))*-8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-360))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+360))*3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+360))*-10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-150))*5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 36.57424 + (((tickAnim - 0) / 5) * (-0.41456-(36.57424)));
            yy = -27.51489 + (((tickAnim - 0) / 5) * (-19.0779-(-27.51489)));
            zz = -5.40491 + (((tickAnim - 0) / 5) * (-7.06575-(-5.40491)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.41456 + (((tickAnim - 5) / 3) * (0-(-0.41456)));
            yy = -19.0779 + (((tickAnim - 5) / 3) * (0-(-19.0779)));
            zz = -7.06575 + (((tickAnim - 5) / 3) * (0-(-7.06575)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (36.57424-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-27.51489-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-5.40491-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.225 + (((tickAnim - 5) / 3) * (0-(2.225)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 8) / 1) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 10) / 1) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBackLeg.rotationPointX = this.leftBackLeg.rotationPointX + (float)(xx);
        this.leftBackLeg.rotationPointY = this.leftBackLeg.rotationPointY - (float)(yy);
        this.leftBackLeg.rotationPointZ = this.leftBackLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.55921 + (((tickAnim - 0) / 3) * (17.93407-(32.55921)));
            yy = -10.24778 + (((tickAnim - 0) / 3) * (-6.70359-(-10.24778)));
            zz = -12.35419 + (((tickAnim - 0) / 3) * (-5.86731-(-12.35419)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.93407 + (((tickAnim - 3) / 2) * (-6.29278-(17.93407)));
            yy = -6.70359 + (((tickAnim - 3) / 2) * (-2.32265-(-6.70359)));
            zz = -5.86731 + (((tickAnim - 3) / 2) * (-2.0329-(-5.86731)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -6.29278 + (((tickAnim - 5) / 3) * (0-(-6.29278)));
            yy = -2.32265 + (((tickAnim - 5) / 3) * (0-(-2.32265)));
            zz = -2.0329 + (((tickAnim - 5) / 3) * (0-(-2.0329)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (32.55921-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-10.24778-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-12.35419-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 5) * (0-(-0.275)));
            zz = 0.325 + (((tickAnim - 10) / 5) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBjoint.rotationPointX = this.leftBjoint.rotationPointX + (float)(xx);
        this.leftBjoint.rotationPointY = this.leftBjoint.rotationPointY - (float)(yy);
        this.leftBjoint.rotationPointZ = this.leftBjoint.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (-1.75-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.75 + (((tickAnim - 3) / 3) * (-26.24-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -26.24 + (((tickAnim - 6) / 2) * (0-(-26.24)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.25 + (((tickAnim - 10) / 3) * (-17.62-(-18.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -17.62 + (((tickAnim - 13) / 2) * (19.75-(-17.62)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBfoot.rotationPointX = this.leftBfoot.rotationPointX + (float)(xx);
        this.leftBfoot.rotationPointY = this.leftBfoot.rotationPointY - (float)(yy);
        this.leftBfoot.rotationPointZ = this.leftBfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (36.97619-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (28.33262-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.04038-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 36.97619 + (((tickAnim - 8) / 5) * (-4.56215-(36.97619)));
            yy = 28.33262 + (((tickAnim - 8) / 5) * (17.49683-(28.33262)));
            zz = 5.04038 + (((tickAnim - 8) / 5) * (1.31705-(5.04038)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -4.56215 + (((tickAnim - 13) / 2) * (0-(-4.56215)));
            yy = 17.49683 + (((tickAnim - 13) / 2) * (0-(17.49683)));
            zz = 1.31705 + (((tickAnim - 13) / 2) * (0-(1.31705)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBackLeg, rightBackLeg.rotateAngleX + (float) Math.toRadians(xx), rightBackLeg.rotateAngleY + (float) Math.toRadians(yy), rightBackLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.405-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -0.405 + (((tickAnim - 1) / 1) * (0-(-0.405)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (-0.405-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.405 + (((tickAnim - 3) / 0) * (0-(-0.405)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (1.725-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.725 + (((tickAnim - 13) / 2) * (0-(1.725)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightBackLeg.rotationPointX = this.rightBackLeg.rotationPointX + (float)(xx);
        this.rightBackLeg.rotationPointY = this.rightBackLeg.rotationPointY - (float)(yy);
        this.rightBackLeg.rotationPointZ = this.rightBackLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.04695-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.94034-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5.05928-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.04695 + (((tickAnim - 3) / 5) * (30.81602-(1.04695)));
            yy = 1.94034 + (((tickAnim - 3) / 5) * (4.34938-(1.94034)));
            zz = 5.05928 + (((tickAnim - 3) / 5) * (7.36576-(5.05928)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 30.81602 + (((tickAnim - 8) / 5) * (-3.13059-(30.81602)));
            yy = 4.34938 + (((tickAnim - 8) / 5) * (1.61652-(4.34938)));
            zz = 7.36576 + (((tickAnim - 8) / 5) * (5.49243-(7.36576)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -3.13059 + (((tickAnim - 13) / 2) * (0-(-3.13059)));
            yy = 1.61652 + (((tickAnim - 13) / 2) * (0-(1.61652)));
            zz = 5.49243 + (((tickAnim - 13) / 2) * (0-(5.49243)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBjoint, rightBjoint.rotateAngleX + (float) Math.toRadians(xx), rightBjoint.rotateAngleY + (float) Math.toRadians(yy), rightBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.83-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13.83 + (((tickAnim - 3) / 2) * (-7.16-(-13.83)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -7.16 + (((tickAnim - 5) / 3) * (27.75-(-7.16)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 8) / 5) * (-21.58-(27.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -21.58 + (((tickAnim - 13) / 2) * (0-(-21.58)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBfoot, rightBfoot.rotateAngleX + (float) Math.toRadians(xx), rightBfoot.rotateAngleY + (float) Math.toRadians(yy), rightBfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightBfoot.rotationPointX = this.rightBfoot.rotationPointX + (float)(xx);
        this.rightBfoot.rotationPointY = this.rightBfoot.rotationPointY - (float)(yy);
        this.rightBfoot.rotationPointZ = this.rightBfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -9.31472 + (((tickAnim - 0) / 8) * (27.93528-(-9.31472)));
            yy = -5.24174 + (((tickAnim - 0) / 8) * (-5.24174-(-5.24174)));
            zz = -0.30159 + (((tickAnim - 0) / 8) * (-0.30159-(-0.30159)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.93528 + (((tickAnim - 8) / 4) * (-2.63276-(27.93528)));
            yy = -5.24174 + (((tickAnim - 8) / 4) * (8.35288-(-5.24174)));
            zz = -0.30159 + (((tickAnim - 8) / 4) * (-33.80576-(-0.30159)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2.63276 + (((tickAnim - 12) / 3) * (-9.31472-(-2.63276)));
            yy = 8.35288 + (((tickAnim - 12) / 3) * (-5.24174-(8.35288)));
            zz = -33.80576 + (((tickAnim - 12) / 3) * (-0.30159-(-33.80576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 1) * (0-(0.3)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 1) * (0.3-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 2) / 1) * (-0.2-(0.3)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (1.17-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.17 + (((tickAnim - 12) / 3) * (0.3-(1.17)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFrontLeg.rotationPointX = this.leftFrontLeg.rotationPointX + (float)(xx);
        this.leftFrontLeg.rotationPointY = this.leftFrontLeg.rotationPointY - (float)(yy);
        this.leftFrontLeg.rotationPointZ = this.leftFrontLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.32611 + (((tickAnim - 0) / 3) * (5.22538-(-4.32611)));
            yy = -2.72795 + (((tickAnim - 0) / 3) * (5.73781-(-2.72795)));
            zz = -2.5792 + (((tickAnim - 0) / 3) * (-1.31007-(-2.5792)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5.22538 + (((tickAnim - 3) / 5) * (17.83506-(5.22538)));
            yy = 5.73781 + (((tickAnim - 3) / 5) * (20.13519-(5.73781)));
            zz = -1.31007 + (((tickAnim - 3) / 5) * (9.6793-(-1.31007)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 17.83506 + (((tickAnim - 8) / 4) * (21.23783-(17.83506)));
            yy = 20.13519 + (((tickAnim - 8) / 4) * (11.36074-(20.13519)));
            zz = 9.6793 + (((tickAnim - 8) / 4) * (12.95116-(9.6793)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 21.23783 + (((tickAnim - 12) / 3) * (-4.32611-(21.23783)));
            yy = 11.36074 + (((tickAnim - 12) / 3) * (-2.72795-(11.36074)));
            zz = 12.95116 + (((tickAnim - 12) / 3) * (-2.5792-(12.95116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 2) / 1) * (0-(0.2)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftFjoint.rotationPointX = this.LeftFjoint.rotationPointX + (float)(xx);
        this.LeftFjoint.rotationPointY = this.LeftFjoint.rotationPointY - (float)(yy);
        this.LeftFjoint.rotationPointZ = this.LeftFjoint.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 14.48409 + (((tickAnim - 0) / 3) * (-10.11217-(14.48409)));
            yy = -1.46325 + (((tickAnim - 0) / 3) * (-0.61356-(-1.46325)));
            zz = 1.36496 + (((tickAnim - 0) / 3) * (-0.98662-(1.36496)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10.11217 + (((tickAnim - 3) / 2) * (-1.60243-(-10.11217)));
            yy = -0.61356 + (((tickAnim - 3) / 2) * (-0.84423-(-0.61356)));
            zz = -0.98662 + (((tickAnim - 3) / 2) * (-0.34821-(-0.98662)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.60243 + (((tickAnim - 5) / 3) * (39.48409-(-1.60243)));
            yy = -0.84423 + (((tickAnim - 5) / 3) * (-1.46325-(-0.84423)));
            zz = -0.34821 + (((tickAnim - 5) / 3) * (1.36496-(-0.34821)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 39.48409 + (((tickAnim - 8) / 3) * (27.75-(39.48409)));
            yy = -1.46325 + (((tickAnim - 8) / 3) * (0-(-1.46325)));
            zz = 1.36496 + (((tickAnim - 8) / 3) * (0-(1.36496)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 27.75 + (((tickAnim - 11) / 2) * (-32.62049-(27.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (-2.51444-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.87565-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -32.62049 + (((tickAnim - 13) / 2) * (14.48409-(-32.62049)));
            yy = -2.51444 + (((tickAnim - 13) / 2) * (-1.46325-(-2.51444)));
            zz = 0.87565 + (((tickAnim - 13) / 2) * (1.36496-(0.87565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.75 + (((tickAnim - 0) / 3) * (-18.57003-(27.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-7.07322-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (42.50298-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.57003 + (((tickAnim - 3) / 5) * (-34.12144-(-18.57003)));
            yy = -7.07322 + (((tickAnim - 3) / 5) * (1.74293-(-7.07322)));
            zz = 42.50298 + (((tickAnim - 3) / 5) * (11.72349-(42.50298)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -34.12144 + (((tickAnim - 8) / 7) * (27.75-(-34.12144)));
            yy = 1.74293 + (((tickAnim - 8) / 7) * (0-(1.74293)));
            zz = 11.72349 + (((tickAnim - 8) / 7) * (0-(11.72349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 5) * (0-(1.1)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.3-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 9) / 6) * (0-(0.3)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFrontLeg.rotationPointX = this.rightFrontLeg.rotationPointX + (float)(xx);
        this.rightFrontLeg.rotationPointY = this.rightFrontLeg.rotationPointY - (float)(yy);
        this.rightFrontLeg.rotationPointZ = this.rightFrontLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.18094 + (((tickAnim - 0) / 3) * (42.48297-(30.18094)));
            yy = 2.89326 + (((tickAnim - 0) / 3) * (1.20166-(2.89326)));
            zz = -15.31973 + (((tickAnim - 0) / 3) * (-15.17951-(-15.31973)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 42.48297 + (((tickAnim - 3) / 3) * (11.02749-(42.48297)));
            yy = 1.20166 + (((tickAnim - 3) / 3) * (10.18077-(1.20166)));
            zz = -15.17951 + (((tickAnim - 3) / 3) * (-15.9563-(-15.17951)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 11.02749 + (((tickAnim - 6) / 2) * (4.93462-(11.02749)));
            yy = 10.18077 + (((tickAnim - 6) / 2) * (11.32767-(10.18077)));
            zz = -15.9563 + (((tickAnim - 6) / 2) * (-9.21996-(-15.9563)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.93462 + (((tickAnim - 8) / 7) * (30.18094-(4.93462)));
            yy = 11.32767 + (((tickAnim - 8) / 7) * (2.89326-(11.32767)));
            zz = -9.21996 + (((tickAnim - 8) / 7) * (-15.31973-(-9.21996)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 2) * (0-(-0.275)));
            zz = -0.2 + (((tickAnim - 6) / 2) * (0-(-0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0.175-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 11) / 4) * (0-(0.325)));
            zz = 0.175 + (((tickAnim - 11) / 4) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightFjoint.rotationPointX = this.RightFjoint.rotationPointX + (float)(xx);
        this.RightFjoint.rotationPointY = this.RightFjoint.rotationPointY - (float)(yy);
        this.RightFjoint.rotationPointZ = this.RightFjoint.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35.03667-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.89155-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.87459-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 35.03667 + (((tickAnim - 3) / 3) * (-11.99655-(35.03667)));
            yy = 2.89155 + (((tickAnim - 3) / 3) * (2.92391-(2.89155)));
            zz = 1.87459 + (((tickAnim - 3) / 3) * (1.89558-(1.87459)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -11.99655 + (((tickAnim - 6) / 2) * (23.7075-(-11.99655)));
            yy = 2.92391 + (((tickAnim - 6) / 2) * (6.50598-(2.92391)));
            zz = 1.89558 + (((tickAnim - 6) / 2) * (4.21783-(1.89558)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 23.7075 + (((tickAnim - 8) / 3) * (-11.82917-(23.7075)));
            yy = 6.50598 + (((tickAnim - 8) / 3) * (3.61443-(6.50598)));
            zz = 4.21783 + (((tickAnim - 8) / 3) * (2.34324-(4.21783)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.82917 + (((tickAnim - 11) / 4) * (0-(-11.82917)));
            yy = 3.61443 + (((tickAnim - 11) / 4) * (0-(3.61443)));
            zz = 2.34324 + (((tickAnim - 11) / 4) * (0-(2.34324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 9) / 2) * (0-(0.325)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightFFoot.rotationPointX = this.RightFFoot.rotationPointX + (float)(xx);
        this.RightFFoot.rotationPointY = this.RightFFoot.rotationPointY - (float)(yy);
        this.RightFFoot.rotationPointZ = this.RightFFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+15))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDesmatosuchus entity = (EntityPrehistoricFloraDesmatosuchus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(bodyfront, bodyfront.rotateAngleX + (float) Math.toRadians(0), bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-25))*-1.5), bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75-150))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-1.8), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+150))*1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-1.5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+250))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+150))*1.8));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*154/0.75+250))*0.3), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-1.5), body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-50))*1.8));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-1.5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-1.5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-250))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+125))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+360))*-4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-360))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+2250))*3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75+360))*-5), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-150))*5));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 35.87579 + (((tickAnim - 0) / 7) * (12.43004-(35.87579)));
            yy = -19.42203 + (((tickAnim - 0) / 7) * (-22.75314-(-19.42203)));
            zz = -3.65556 + (((tickAnim - 0) / 7) * (-9.89931-(-3.65556)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 12.43004 + (((tickAnim - 7) / 6) * (-16.35665-(12.43004)));
            yy = -22.75314 + (((tickAnim - 7) / 6) * (-7.58438-(-22.75314)));
            zz = -9.89931 + (((tickAnim - 7) / 6) * (-3.29977-(-9.89931)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -16.35665 + (((tickAnim - 13) / 4) * (0-(-16.35665)));
            yy = -7.58438 + (((tickAnim - 13) / 4) * (0-(-7.58438)));
            zz = -3.29977 + (((tickAnim - 13) / 4) * (0-(-3.29977)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (16.55718-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (-8.8282-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (-1.66162-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 16.55718 + (((tickAnim - 25) / 10) * (35.87579-(16.55718)));
            yy = -8.8282 + (((tickAnim - 25) / 10) * (-19.42203-(-8.8282)));
            zz = -1.66162 + (((tickAnim - 25) / 10) * (-3.65556-(-1.66162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBackLeg, leftBackLeg.rotateAngleX + (float) Math.toRadians(xx), leftBackLeg.rotateAngleY + (float) Math.toRadians(yy), leftBackLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 14) / 3) * (0-(1.25)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 20) / 2) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 1) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 23) / 2) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -0.15 + (((tickAnim - 27) / 1) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBackLeg.rotationPointX = this.leftBackLeg.rotationPointX + (float)(xx);
        this.leftBackLeg.rotationPointY = this.leftBackLeg.rotationPointY - (float)(yy);
        this.leftBackLeg.rotationPointZ = this.leftBackLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.87165 + (((tickAnim - 0) / 4) * (48.68787-(17.87165)));
            yy = -6.96794 + (((tickAnim - 0) / 4) * (-5.63091-(-6.96794)));
            zz = -6.09869 + (((tickAnim - 0) / 4) * (-10.97639-(-6.09869)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 48.68787 + (((tickAnim - 4) / 10) * (1.9093-(48.68787)));
            yy = -5.63091 + (((tickAnim - 4) / 10) * (-3.81095-(-5.63091)));
            zz = -10.97639 + (((tickAnim - 4) / 10) * (-6.35487-(-10.97639)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 1.9093 + (((tickAnim - 14) / 3) * (0-(1.9093)));
            yy = -3.81095 + (((tickAnim - 14) / 3) * (0-(-3.81095)));
            zz = -6.35487 + (((tickAnim - 14) / 3) * (-4.25-(-6.35487)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (7.43643-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (-2.21707-(0)));
            zz = -4.25 + (((tickAnim - 17) / 6) * (-4.83822-(-4.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 7.43643 + (((tickAnim - 23) / 12) * (17.87165-(7.43643)));
            yy = -2.21707 + (((tickAnim - 23) / 12) * (-6.96794-(-2.21707)));
            zz = -4.83822 + (((tickAnim - 23) / 12) * (-6.09869-(-4.83822)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBjoint, leftBjoint.rotateAngleX + (float) Math.toRadians(xx), leftBjoint.rotateAngleY + (float) Math.toRadians(yy), leftBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (38.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 38.75 + (((tickAnim - 7) / 5) * (-2.79-(38.75)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -2.79 + (((tickAnim - 12) / 2) * (-22-(-2.79)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -22 + (((tickAnim - 14) / 3) * (0-(-22)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (2.25-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-10.95165-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (1.64294-(0)));
            zz = 2.25 + (((tickAnim - 17) / 6) * (3.3714-(2.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -10.95165 + (((tickAnim - 23) / 4) * (-18.01062-(-10.95165)));
            yy = 1.64294 + (((tickAnim - 23) / 4) * (2.17662-(1.64294)));
            zz = 3.3714 + (((tickAnim - 23) / 4) * (3.6512-(3.3714)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -18.01062 + (((tickAnim - 27) / 8) * (0-(-18.01062)));
            yy = 2.17662 + (((tickAnim - 27) / 8) * (0-(2.17662)));
            zz = 3.6512 + (((tickAnim - 27) / 8) * (0-(3.6512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftBfoot, leftBfoot.rotateAngleX + (float) Math.toRadians(xx), leftBfoot.rotateAngleY + (float) Math.toRadians(yy), leftBfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.075 + (((tickAnim - 23) / 4) * (-0.305-(-0.075)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = -0.305 + (((tickAnim - 27) / 8) * (0-(-0.305)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftBfoot.rotationPointX = this.leftBfoot.rotationPointX + (float)(xx);
        this.leftBfoot.rotationPointY = this.leftBfoot.rotationPointY - (float)(yy);
        this.leftBfoot.rotationPointZ = this.leftBfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 2.30718 + (((tickAnim - 0) / 18) * (35.87579-(2.30718)));
            yy = 8.8282 + (((tickAnim - 0) / 18) * (19.422-(8.8282)));
            zz = -1.66162 + (((tickAnim - 0) / 18) * (-3.65556-(-1.66162)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 35.87579 + (((tickAnim - 18) / 5) * (-1.65106-(35.87579)));
            yy = 19.422 + (((tickAnim - 18) / 5) * (21.48912-(19.422)));
            zz = -3.65556 + (((tickAnim - 18) / 5) * (3.57557-(-3.65556)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -1.65106 + (((tickAnim - 23) / 6) * (-16.35665-(-1.65106)));
            yy = 21.48912 + (((tickAnim - 23) / 6) * (7.5844-(21.48912)));
            zz = 3.57557 + (((tickAnim - 23) / 6) * (3.2998-(3.57557)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -16.35665 + (((tickAnim - 29) / 4) * (0-(-16.35665)));
            yy = 7.5844 + (((tickAnim - 29) / 4) * (0-(7.5844)));
            zz = 3.2998 + (((tickAnim - 29) / 4) * (0-(3.2998)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (2.30718-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (8.8282-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (-1.66162-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBackLeg, rightBackLeg.rotateAngleX + (float) Math.toRadians(xx), rightBackLeg.rotateAngleY + (float) Math.toRadians(yy), rightBackLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.075 + (((tickAnim - 2) / 1) * (-0.25-(-0.075)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 3) / 2) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 13) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 13) * (1.25-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 1.25 + (((tickAnim - 31) / 2) * (0-(1.25)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightBackLeg.rotationPointX = this.rightBackLeg.rotationPointX + (float)(xx);
        this.rightBackLeg.rotationPointY = this.rightBackLeg.rotationPointY - (float)(yy);
        this.rightBackLeg.rotationPointZ = this.rightBackLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 2.16241 + (((tickAnim - 0) / 18) * (14.95382-(2.16241)));
            yy = 0.73581 + (((tickAnim - 0) / 18) * (7.86332-(0.73581)));
            zz = 3.90604 + (((tickAnim - 0) / 18) * (6.59579-(3.90604)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 14.95382 + (((tickAnim - 18) / 3) * (48.68787-(14.95382)));
            yy = 7.86332 + (((tickAnim - 18) / 3) * (5.6309-(7.86332)));
            zz = 6.59579 + (((tickAnim - 18) / 3) * (10.9764-(6.59579)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 48.68787 + (((tickAnim - 21) / 12) * (0-(48.68787)));
            yy = 5.6309 + (((tickAnim - 21) / 12) * (0-(5.6309)));
            zz = 10.9764 + (((tickAnim - 21) / 12) * (0-(10.9764)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (2.16241-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0.73581-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (3.90604-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBjoint, rightBjoint.rotateAngleX + (float) Math.toRadians(xx), rightBjoint.rotateAngleY + (float) Math.toRadians(yy), rightBjoint.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -5.5 + (((tickAnim - 0) / 8) * (-16.06-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -16.06 + (((tickAnim - 8) / 10) * (7.25-(-16.06)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 7.25 + (((tickAnim - 18) / 6) * (38.75-(7.25)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 38.75 + (((tickAnim - 24) / 5) * (-2.79-(38.75)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -2.79 + (((tickAnim - 29) / 3) * (-22-(-2.79)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -22 + (((tickAnim - 32) / 3) * (-5.5-(-22)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightBfoot, rightBfoot.rotateAngleX + (float) Math.toRadians(xx), rightBfoot.rotateAngleY + (float) Math.toRadians(yy), rightBfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.185-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.185 + (((tickAnim - 8) / 10) * (0-(0.185)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightBfoot.rotationPointX = this.rightBfoot.rotationPointX + (float)(xx);
        this.rightBfoot.rotationPointY = this.rightBfoot.rotationPointY - (float)(yy);
        this.rightBfoot.rotationPointZ = this.rightBfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -9.31472 + (((tickAnim - 0) / 17) * (13.55392-(-9.31472)));
            yy = -5.24174 + (((tickAnim - 0) / 17) * (14.98209-(-5.24174)));
            zz = -0.30159 + (((tickAnim - 0) / 17) * (4.27853-(-0.30159)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 13.55392 + (((tickAnim - 17) / 6) * (-16.75663-(13.55392)));
            yy = 14.98209 + (((tickAnim - 17) / 6) * (2.40667-(14.98209)));
            zz = 4.27853 + (((tickAnim - 17) / 6) * (-23.85929-(4.27853)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -16.75663 + (((tickAnim - 23) / 9) * (-16.81472-(-16.75663)));
            yy = 2.40667 + (((tickAnim - 23) / 9) * (-5.24174-(2.40667)));
            zz = -23.85929 + (((tickAnim - 23) / 9) * (-0.30159-(-23.85929)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -16.81472 + (((tickAnim - 32) / 3) * (-9.31472-(-16.81472)));
            yy = -5.24174 + (((tickAnim - 32) / 3) * (-5.24174-(-5.24174)));
            zz = -0.30159 + (((tickAnim - 32) / 3) * (-0.30159-(-0.30159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFrontLeg, leftFrontLeg.rotateAngleX + (float) Math.toRadians(xx), leftFrontLeg.rotateAngleY + (float) Math.toRadians(yy), leftFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 2) * (0.075-(0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 2) / 1) * (-0.175-(0.075)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 2) * (-0.15-(-0.175)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 2) * (-0.55-(-0.15)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.55 + (((tickAnim - 7) / 1) * (-0.85-(-0.55)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 8) / 5) * (-0.555-(-0.85)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.555 + (((tickAnim - 13) / 4) * (-1.05-(-0.555)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -1.05 + (((tickAnim - 17) / 6) * (1.895-(-1.05)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 1.895 + (((tickAnim - 23) / 9) * (0.35-(1.895)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 32) / 3) * (0.175-(0.35)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFrontLeg.rotationPointX = this.leftFrontLeg.rotationPointX + (float)(xx);
        this.leftFrontLeg.rotationPointY = this.leftFrontLeg.rotationPointY - (float)(yy);
        this.leftFrontLeg.rotationPointZ = this.leftFrontLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -4.32611 + (((tickAnim - 0) / 8) * (7.23121-(-4.32611)));
            yy = -2.72795 + (((tickAnim - 0) / 8) * (-1.48797-(-2.72795)));
            zz = -2.5792 + (((tickAnim - 0) / 8) * (-1.40684-(-2.5792)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 7.23121 + (((tickAnim - 8) / 9) * (21.43504-(7.23121)));
            yy = -1.48797 + (((tickAnim - 8) / 9) * (-11.77643-(-1.48797)));
            zz = -1.40684 + (((tickAnim - 8) / 9) * (5.6675-(-1.40684)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 21.43504 + (((tickAnim - 17) / 6) * (17.28092-(21.43504)));
            yy = -11.77643 + (((tickAnim - 17) / 6) * (-8.32444-(-11.77643)));
            zz = 5.6675 + (((tickAnim - 17) / 6) * (-7.43559-(5.6675)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 17.28092 + (((tickAnim - 23) / 5) * (1.89977-(17.28092)));
            yy = -8.32444 + (((tickAnim - 23) / 5) * (-1.16459-(-8.32444)));
            zz = -7.43559 + (((tickAnim - 23) / 5) * (4.31923-(-7.43559)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 1.89977 + (((tickAnim - 28) / 4) * (-4.32611-(1.89977)));
            yy = -1.16459 + (((tickAnim - 28) / 4) * (-2.72795-(-1.16459)));
            zz = 4.31923 + (((tickAnim - 28) / 4) * (-2.5792-(4.31923)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -4.32611 + (((tickAnim - 32) / 3) * (-4.32611-(-4.32611)));
            yy = -2.72795 + (((tickAnim - 32) / 3) * (-2.72795-(-2.72795)));
            zz = -2.5792 + (((tickAnim - 32) / 3) * (-2.5792-(-2.5792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFjoint, LeftFjoint.rotateAngleX + (float) Math.toRadians(xx), LeftFjoint.rotateAngleY + (float) Math.toRadians(yy), LeftFjoint.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.625 + (((tickAnim - 8) / 9) * (0-(0.625)));
            zz = 0.775 + (((tickAnim - 8) / 9) * (0-(0.775)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0.95-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.95 + (((tickAnim - 23) / 9) * (0-(0.95)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LeftFjoint.rotationPointX = this.LeftFjoint.rotationPointX + (float)(xx);
        this.LeftFjoint.rotationPointY = this.LeftFjoint.rotationPointY - (float)(yy);
        this.LeftFjoint.rotationPointZ = this.LeftFjoint.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 14.48409 + (((tickAnim - 0) / 8) * (-5.44241-(14.48409)));
            yy = -1.46325 + (((tickAnim - 0) / 8) * (-6.52388-(-1.46325)));
            zz = 1.36496 + (((tickAnim - 0) / 8) * (-1.75883-(1.36496)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -5.44241 + (((tickAnim - 8) / 9) * (-35.24598-(-5.44241)));
            yy = -6.52388 + (((tickAnim - 8) / 9) * (0.16782-(-6.52388)));
            zz = -1.75883 + (((tickAnim - 8) / 9) * (2.74488-(-1.75883)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -35.24598 + (((tickAnim - 17) / 6) * (33.20877-(-35.24598)));
            yy = 0.16782 + (((tickAnim - 17) / 6) * (0.08008-(0.16782)));
            zz = 2.74488 + (((tickAnim - 17) / 6) * (1.30976-(2.74488)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 33.20877 + (((tickAnim - 23) / 5) * (-10.42096-(33.20877)));
            yy = 0.08008 + (((tickAnim - 23) / 5) * (0.06858-(0.08008)));
            zz = 1.30976 + (((tickAnim - 23) / 5) * (1.12174-(1.30976)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -10.42096 + (((tickAnim - 28) / 4) * (22.75-(-10.42096)));
            yy = 0.06858 + (((tickAnim - 28) / 4) * (0-(0.06858)));
            zz = 1.12174 + (((tickAnim - 28) / 4) * (0-(1.12174)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 32) / 3) * (14.48409-(22.75)));
            yy = 0 + (((tickAnim - 32) / 3) * (-1.46325-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (1.36496-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftFFoot, LeftFFoot.rotateAngleX + (float) Math.toRadians(xx), LeftFFoot.rotateAngleY + (float) Math.toRadians(yy), LeftFFoot.rotateAngleZ + (float) Math.toRadians(zz));

        this.LeftFFoot.rotationPointX = this.LeftFFoot.rotationPointX + (float)(0);
        this.LeftFFoot.rotationPointY = this.LeftFFoot.rotationPointY - (float)(-0.3);
        this.LeftFFoot.rotationPointZ = this.LeftFFoot.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 27.75 + (((tickAnim - 0) / 8) * (-1.47102-(27.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.25699-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (27.19705-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.47102 + (((tickAnim - 8) / 10) * (-19.75-(-1.47102)));
            yy = -11.25699 + (((tickAnim - 8) / 10) * (0-(-11.25699)));
            zz = 27.19705 + (((tickAnim - 8) / 10) * (0-(27.19705)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -19.75 + (((tickAnim - 18) / 17) * (27.75-(-19.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFrontLeg, rightFrontLeg.rotateAngleX + (float) Math.toRadians(xx), rightFrontLeg.rotateAngleY + (float) Math.toRadians(yy), rightFrontLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0.875 + (((tickAnim - 8) / 10) * (-0.225-(0.875)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 2) * (-0.425-(-0.225)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 20) / 2) * (-0.125-(-0.425)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.125 + (((tickAnim - 22) / 1) * (-0.35-(-0.125)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 23) / 2) * (-0.05-(-0.35)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 25) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFrontLeg.rotationPointX = this.rightFrontLeg.rotationPointX + (float)(xx);
        this.rightFrontLeg.rotationPointY = this.rightFrontLeg.rotationPointY - (float)(yy);
        this.rightFrontLeg.rotationPointZ = this.rightFrontLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 30.18094 + (((tickAnim - 0) / 8) * (37.38148-(30.18094)));
            yy = 2.89326 + (((tickAnim - 0) / 8) * (4.72115-(2.89326)));
            zz = -15.31973 + (((tickAnim - 0) / 8) * (-9.29774-(-15.31973)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 37.38148 + (((tickAnim - 8) / 6) * (-3.44454-(37.38148)));
            yy = 4.72115 + (((tickAnim - 8) / 6) * (6.34594-(4.72115)));
            zz = -9.29774 + (((tickAnim - 8) / 6) * (-3.94486-(-9.29774)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -3.44454 + (((tickAnim - 14) / 4) * (-10.2733-(-3.44454)));
            yy = 6.34594 + (((tickAnim - 14) / 4) * (7.36143-(6.34594)));
            zz = -3.94486 + (((tickAnim - 14) / 4) * (-0.59931-(-3.94486)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -10.2733 + (((tickAnim - 18) / 17) * (30.18094-(-10.2733)));
            yy = 7.36143 + (((tickAnim - 18) / 17) * (2.89326-(7.36143)));
            zz = -0.59931 + (((tickAnim - 18) / 17) * (-15.31973-(-0.59931)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFjoint, RightFjoint.rotateAngleX + (float) Math.toRadians(xx), RightFjoint.rotateAngleY + (float) Math.toRadians(yy), RightFjoint.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 8) / 6) * (0-(0.45)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightFjoint.rotationPointX = this.RightFjoint.rotationPointX + (float)(xx);
        this.RightFjoint.rotationPointY = this.RightFjoint.rotationPointY - (float)(yy);
        this.RightFjoint.rotationPointZ = this.RightFjoint.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24.64014-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.11371-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.59296-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 24.64014 + (((tickAnim - 8) / 6) * (-14.13914-(24.64014)));
            yy = 1.11371 + (((tickAnim - 8) / 6) * (2.10367-(1.11371)));
            zz = 1.59296 + (((tickAnim - 8) / 6) * (3.00893-(1.59296)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -14.13914 + (((tickAnim - 14) / 4) * (27.84256-(-14.13914)));
            yy = 2.10367 + (((tickAnim - 14) / 4) * (2.72239-(2.10367)));
            zz = 3.00893 + (((tickAnim - 14) / 4) * (3.8939-(3.00893)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 27.84256 + (((tickAnim - 18) / 7) * (-8.74643-(27.84256)));
            yy = 2.72239 + (((tickAnim - 18) / 7) * (0.72805-(2.72239)));
            zz = 3.8939 + (((tickAnim - 18) / 7) * (4.66716-(3.8939)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -8.74643 + (((tickAnim - 25) / 10) * (0-(-8.74643)));
            yy = 0.72805 + (((tickAnim - 25) / 10) * (0-(0.72805)));
            zz = 4.66716 + (((tickAnim - 25) / 10) * (0-(4.66716)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightFFoot, RightFFoot.rotateAngleX + (float) Math.toRadians(xx), RightFFoot.rotateAngleY + (float) Math.toRadians(yy), RightFFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0.25-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 22) / 3) * (0-(0.25)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightFFoot.rotationPointX = this.RightFFoot.rotationPointX + (float)(xx);
        this.RightFFoot.rotationPointY = this.RightFFoot.rotationPointY - (float)(yy);
        this.RightFFoot.rotationPointZ = this.RightFFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*155/0.75-150))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDesmatosuchus e = (EntityPrehistoricFloraDesmatosuchus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bodyfront, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.bodyfront, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

    }
}
