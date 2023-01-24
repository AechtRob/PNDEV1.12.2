package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDesmatosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDesmatosuchus extends AdvancedModelBaseExtended {
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


    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Desmatosuchus.offsetY = 0.40F;
        //float ZOffsetter = 0.60F;

        EntityPrehistoricFloraDesmatosuchus entityDesmatosuchus = (EntityPrehistoricFloraDesmatosuchus) e;
        float masterSpeed = entityDesmatosuchus.getTravelSpeed();

        if (entityDesmatosuchus.isDrinking()) {
            this.faceTarget(f3, f4, 1, Desmatosuchus);
        }

        //System.err.println("PFDrink " + entityDesmatosuchus.getPFDrinking());

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

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

        this.Desmatosuchus.offsetY = 0F;
        float speed = masterSpeed / 2.225F;
        if (entityDesmatosuchus.getIsFast()) {
            speed = speed * 2;
        }

        this.leftFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.rightFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.leftBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.rightBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(leftFrontLeg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(rightFrontLeg, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(leftBackLeg, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(rightBackLeg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftFrontLeg, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(rightFrontLeg, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(leftBackLeg, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(rightBackLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(LeftFjoint, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(RightFFoot, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leftBjoint, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(rightBjoint, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(LeftFjoint, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(RightFFoot, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leftBjoint, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(rightBjoint, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(LeftFFoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(RightFFoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(leftBfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(rightBfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Desmatosuchus, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(body3, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body2, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(bodyfront, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(bodyfront, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Desmatosuchus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDesmatosuchus e = (EntityPrehistoricFloraDesmatosuchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
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

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.DRINK_ANIMATION); //66 ticks
        animator.startKeyframe(10);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        //frame 2:
        animator.startKeyframe(5);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 3:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 4:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 5:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 6:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 7:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 8:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 9:
        animator.startKeyframe(5);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        //end:
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
