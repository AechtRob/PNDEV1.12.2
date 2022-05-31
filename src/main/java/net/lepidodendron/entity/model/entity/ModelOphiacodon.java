package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOphiacodon;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOphiacodon extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended ophiacodon;
    private final AdvancedModelRendererExtended back_body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended right_thigh;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended right_shin;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended right_foot;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended left_thigh;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended left_shin;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended left_foot;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended middle_body;
    private final AdvancedModelRendererExtended front_body;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended lower_jaw;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended right_upper_arm;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended right_lower_arm;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended right_paw;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended left_upper_arm;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended left_lower_arm;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended left_paw;
    private final AdvancedModelRendererExtended cube_r27;

    private ModelAnimator animator;

    public ModelOphiacodon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.ophiacodon = new AdvancedModelRendererExtended(this);
        this.ophiacodon.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.setRotateAngle(ophiacodon, -0.0873F, 0.0F, 0.0F);


        this.back_body = new AdvancedModelRendererExtended(this);
        this.back_body.setRotationPoint(0.0F, -2.0F, 8.0F);
        this.ophiacodon.addChild(back_body);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4638F, 4.9478F);
        this.back_body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 30, -5.0F, -6.25F, -4.75F, 10, 14, 9, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.back_body.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.2869F, 3.8021F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 0, -4.0F, -5.5F, -4.5F, 8, 11, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.2348F, 4.5887F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 62, -3.0F, -4.5F, -4.5F, 6, 9, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.5F, 1.4408F, 1.9352F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 41, -3.0F, -4.75F, -5.75F, 5, 7, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 3.0F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7959F, 2.7068F);
        this.tail4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 30, -2.0F, -1.25F, -8.25F, 4, 5, 16, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 38, 53, -1.5F, -1.6665F, -2.9735F, 3, 4, 16, 0.0F, false));

        this.right_thigh = new AdvancedModelRendererExtended(this);
        this.right_thigh.setRotationPoint(-5.0F, 2.0F, 3.0F);
        this.back_body.addChild(right_thigh);
        this.setRotateAngle(right_thigh, 0.0F, 0.0F, 0.1309F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-2.0554F, 1.4923F, 0.6107F);
        this.right_thigh.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1653F, -0.0681F, -0.3875F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 21, -5.0F, -2.5F, -3.0F, 10, 5, 6, 0.0F, false));

        this.right_shin = new AdvancedModelRendererExtended(this);
        this.right_shin.setRotationPoint(-7.0F, 3.0F, 0.0F);
        this.right_thigh.addChild(right_shin);
        this.setRotateAngle(right_shin, -0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.2928F, 3.6547F, 1.1077F);
        this.right_shin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2003F, 0.2155F, -0.0844F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 96, -2.2928F, -5.0F, -2.5F, 4, 8, 5, 0.0F, false));

        this.right_foot = new AdvancedModelRendererExtended(this);
        this.right_foot.setRotationPoint(1.0F, 6.0F, 3.0F);
        this.right_shin.addChild(right_foot);
        this.setRotateAngle(right_foot, 0.1745F, 0.0F, -0.1309F);


        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.4176F, 1.026F, -2.7388F);
        this.right_foot.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0469F, 0.5664F, -0.0436F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 82, 82, -3.0F, -1.0F, -4.5F, 6, 2, 8, 0.0F, false));

        this.left_thigh = new AdvancedModelRendererExtended(this);
        this.left_thigh.setRotationPoint(5.0F, 2.0F, 3.0F);
        this.back_body.addChild(left_thigh);
        this.setRotateAngle(left_thigh, 0.0F, 0.0F, -0.1309F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(2.0554F, 1.4923F, 0.6107F);
        this.left_thigh.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1653F, 0.0681F, 0.3875F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 21, -5.0F, -2.5F, -3.0F, 10, 5, 6, 0.0F, true));

        this.left_shin = new AdvancedModelRendererExtended(this);
        this.left_shin.setRotationPoint(7.0F, 3.0F, 0.0F);
        this.left_thigh.addChild(left_shin);
        this.setRotateAngle(left_shin, -0.0873F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(-1.2928F, 3.6547F, 1.1077F);
        this.left_shin.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2003F, -0.2155F, 0.0844F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 96, -1.7072F, -5.0F, -2.5F, 4, 8, 5, 0.0F, true));

        this.left_foot = new AdvancedModelRendererExtended(this);
        this.left_foot.setRotationPoint(-1.0F, 6.0F, 3.0F);
        this.left_shin.addChild(left_foot);
        this.setRotateAngle(left_foot, 0.1745F, 0.0F, 0.1309F);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.4176F, 1.026F, -2.7388F);
        this.left_foot.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0469F, -0.5664F, 0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 82, -3.0F, -1.0F, -4.5F, 6, 2, 8, 0.0F, true));

        this.middle_body = new AdvancedModelRendererExtended(this);
        this.middle_body.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.back_body.addChild(middle_body);
        this.middle_body.cubeList.add(new ModelBox(middle_body, 0, 0, -6.0F, -8.104F, -7.2394F, 12, 15, 15, 0.0F, false));

        this.front_body = new AdvancedModelRendererExtended(this);
        this.front_body.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.middle_body.addChild(front_body);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.8141F, -3.9412F);
        this.front_body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 51, -5.5F, -6.75F, -4.0F, 11, 14, 8, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -7.0F);
        this.front_body.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 5.7021F, -2.1057F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 38, 0.0F, -1.5F, -2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.5F, -0.7732F, -1.5392F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 78, 92, -4.0F, -4.0F, -2.0F, 7, 10, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 32, 73, -4.0F, -4.0F, -7.0F, 8, 6, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.5F, -1.1609F, -10.7669F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 86, -3.0F, -2.5F, -4.0F, 5, 4, 8, -0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0774F, -17.4791F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 1, -1.9F, 1.5F, -4.0209F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -2.0F, 1.5F, -4.0209F, 4, 1, 0, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 2, 1.9F, 1.5F, -4.0209F, 0, 1, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 91, -2.0F, -1.5F, -4.0F, 4, 3, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, 0.6089F, -16.6695F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.9F, 1.5F, -2.5F, 0, 1, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 6, 1.9F, 1.5F, -2.5F, 0, 1, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 99, 70, -2.5F, -1.5F, -2.5F, 5, 3, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4062F, -12.3582F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, -2.4F, 2.5F, -2.0F, 0, 1, 6, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 8, 2.4F, 2.5F, -2.0F, 0, 1, 6, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 82, -3.0F, -1.5F, -2.0F, 6, 4, 8, 0.0F, false));

        this.lower_jaw = new AdvancedModelRendererExtended(this);
        this.lower_jaw.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.head.addChild(lower_jaw);
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 78, 32, -4.0F, -0.51F, -6.99F, 8, 2, 7, -0.01F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 90, 10, -3.5F, -3.5F, -6.0F, 7, 3, 6, -0.01F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 88, 60, -2.5F, -0.5F, -15.0F, 5, 2, 8, -0.01F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 24, 32, 2.25F, -1.5F, -15.0F, 0, 1, 8, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 24, 31, -2.25F, -1.5F, -15.0F, 0, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 1.329F, -3.4461F);
        this.lower_jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3491F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 94, -3.5F, -0.75F, -3.0F, 7, 2, 6, -0.01F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, 3.0828F, -4.4754F);
        this.lower_jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.0F, -2.5F, -3.5F, 0, 5, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(-0.1F, 1.0058F, -17.7727F);
        this.lower_jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 1, -1.9F, -3.0F, -2.7273F, 4, 1, 0, -0.02F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -1.8F, -3.0F, -2.7273F, 0, 1, 5, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 36, 2.0F, -3.0F, -2.7273F, 0, 1, 5, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 95, 19, -1.9F, -2.0F, -3.0F, 4, 2, 6, -0.02F, false));

        this.right_upper_arm = new AdvancedModelRendererExtended(this);
        this.right_upper_arm.setRotationPoint(-4.0F, 4.0F, -4.0F);
        this.front_body.addChild(right_upper_arm);
        this.setRotateAngle(right_upper_arm, 0.0F, 0.0F, -0.0436F);


        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-3.8863F, 0.4393F, 1.4244F);
        this.right_upper_arm.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.197F, 0.5765F, -0.5072F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 0, -3.5F, -1.4393F, -1.4244F, 9, 5, 5, 0.0F, false));

        this.right_lower_arm = new AdvancedModelRendererExtended(this);
        this.right_lower_arm.setRotationPoint(-6.0F, 3.0F, 4.0F);
        this.right_upper_arm.addChild(right_lower_arm);


        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.8139F, 1.6784F, -0.8276F);
        this.right_lower_arm.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.144F, 0.4775F, 0.0056F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 30, -2.0F, -3.1784F, -2.1724F, 4, 8, 4, 0.0F, false));

        this.right_paw = new AdvancedModelRendererExtended(this);
        this.right_paw.setRotationPoint(0.9605F, 6.6857F, 0.2769F);
        this.right_lower_arm.addChild(right_paw);
        this.setRotateAngle(right_paw, 0.0873F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-1.8308F, -0.5367F, -4.8301F);
        this.right_paw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.4363F, 0.0436F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 30, -2.5F, -0.5F, -1.4807F, 5, 2, 7, 0.0F, false));

        this.left_upper_arm = new AdvancedModelRendererExtended(this);
        this.left_upper_arm.setRotationPoint(4.0F, 4.0F, -4.0F);
        this.front_body.addChild(left_upper_arm);
        this.setRotateAngle(left_upper_arm, 0.0F, 0.0F, 0.0436F);


        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(3.8863F, 0.4393F, 1.4244F);
        this.left_upper_arm.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.197F, -0.5765F, 0.5072F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 80, 0, -5.5F, -1.4393F, -1.4244F, 9, 5, 5, 0.0F, true));

        this.left_lower_arm = new AdvancedModelRendererExtended(this);
        this.left_lower_arm.setRotationPoint(6.0F, 3.0F, 4.0F);
        this.left_upper_arm.addChild(left_lower_arm);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-0.8139F, 1.6784F, -0.8276F);
        this.left_lower_arm.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.144F, -0.4775F, -0.0056F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 30, -2.0F, -3.1784F, -2.1724F, 4, 8, 4, 0.0F, true));

        this.left_paw = new AdvancedModelRendererExtended(this);
        this.left_paw.setRotationPoint(-0.967F, 6.7118F, -0.7285F);
        this.left_lower_arm.addChild(left_paw);
        this.setRotateAngle(left_paw, 0.0873F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(1.8373F, -0.3879F, -3.8301F);
        this.left_paw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.4363F, -0.0436F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 30, -2.5F, -0.6749F, -1.4807F, 5, 2, 7, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.ophiacodon.render(f5 * 0.385f);
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
        this.ophiacodon.offsetY = 0.91F;

        EntityPrehistoricFloraOphiacodon Ophiacodon = (EntityPrehistoricFloraOphiacodon) e;
        float masterSpeed = Ophiacodon.getTravelSpeed();

        //masterSpeed = 0.315F;

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRendererExtended[] Body = {this.neck, this.front_body, this.middle_body, this.back_body};

        if (Ophiacodon.getAnimation() == Ophiacodon.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Ophiacodon.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 1.655F;
        //if (Ophiacodon.getIsFast()) {
        //    speed = speed * 2;
        //}

        this.left_upper_arm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.right_upper_arm.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.left_thigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.right_thigh.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(left_upper_arm, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(right_upper_arm, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(left_thigh, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(right_thigh, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(left_upper_arm, speed, 0.30F, true, 5, 0.20F, f2, 1F);
        this.walk(right_upper_arm, speed, 0.30F, true, 8, 0.20F, f2, 1F);
        this.walk(left_thigh, speed, 0.25F, true, 8, 0F, f2, 1F);
        this.walk(right_thigh, speed, 0.25F, true, 5, 0F, f2, 1F);

        this.walk(left_lower_arm, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(right_lower_arm, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(left_shin, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(right_shin, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(left_lower_arm, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(right_lower_arm, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(left_shin, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(right_shin, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(left_paw, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(right_paw, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(left_foot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(right_foot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(ophiacodon, speed * 2F, 0.05F, false, 2.5F,  f2, 1F);

        this.flap(back_body, speed, 0.10F, false, 5.0F,0.05F, f2, 1.0F);
        this.flap(middle_body, speed, -0.10F, false, 5.0F,-0.05F, f2, 1.0F);
        this.flap(front_body, speed, -0.14F, false, 5.0F,-0.07F, f2, 1.0F);

        this.walk(front_body, speed * 2, 0.03F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainWave(Tail, (0.06F*0.9F), 0.025F, 0.1F, f2, 1F);
        this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.07F, 0.06F, f2, 1F);
        this.chainWave(Body, (0.06F*0.9F), 0.018F, 0.08F, f2, 1F);

        this.ophiacodon.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.12), false, 2.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOphiacodon e = (EntityPrehistoricFloraOphiacodon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(5), 0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), 0,0);
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(4);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lower_jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(15);
        animator.rotate(this.ophiacodon, (float) Math.toRadians(-12.5), 0,0);
        animator.rotate(this.left_paw, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.right_paw, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.tail, (float) Math.toRadians(17.5),0, 0);
        animator.rotate(this.left_thigh, 0, 0, (float) Math.toRadians(25));
        animator.rotate(this.right_thigh, 0, 0, (float) Math.toRadians(-25));
        animator.rotate(this.left_shin, 0, 0, (float) Math.toRadians(-22.5));
        animator.rotate(this.right_shin, 0, 0, (float) Math.toRadians(22.5));
        animator.rotate(this.left_foot, (float) Math.toRadians(12.5),0, 0);
        animator.rotate(this.right_foot, (float) Math.toRadians(12.5),0, 0);
        animator.move(this.left_upper_arm, 0, 3,0);
        animator.move(this.right_upper_arm, 0, 3,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(15);

    }
}
