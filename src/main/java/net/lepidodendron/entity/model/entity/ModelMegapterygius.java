package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMegapterygius;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMegapterygius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
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
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer tongue;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r47;

    private ModelAnimator animator;

    public ModelMegapterygius() {
        this.textureWidth = 160;
        this.textureHeight = 160;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 9.9F, 0.875F);
        this.main.cubeList.add(new ModelBox(main, 50, 44, -6.5F, 1.6F, -0.875F, 13, 11, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 86, 81, -5.5F, 3.6F, -7.875F, 11, 8, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, 0.4F, -0.3F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.144F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 96, -4.0F, 0.0F, 2.0F, 11, 3, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.05F, -7.875F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2967F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 87, -4.5F, 0.0F, 0.0F, 9, 3, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, 12.05F, -6.875F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4494F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 98, 51, -2.0F, -3.0F, -1.0F, 9, 3, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 15.2F, 0.325F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 70, -4.0F, -4.0F, -1.0F, 11, 4, 10, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-4.75F, 11.35F, -2.275F);
        this.main.addChild(armright);
        this.setRotateAngle(armright, 0.6109F, -0.5236F, 0.3491F);
        this.armright.cubeList.add(new ModelBox(armright, 86, 36, -1.0F, -1.45F, -2.0F, 2, 4, 4, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, -0.0436F, 0.0F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 60, 124, -0.5F, -0.45F, -2.75F, 1, 10, 6, 0.0F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 116, 0.0F, -0.25F, -3.5F, 0, 15, 8, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(4.75F, 11.35F, -2.275F);
        this.main.addChild(armleft);
        this.setRotateAngle(armleft, 0.6109F, 0.5236F, -0.3491F);
        this.armleft.cubeList.add(new ModelBox(armleft, 86, 36, -1.0F, -1.45F, -2.0F, 2, 4, 4, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, -0.0436F, 0.0F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 60, 124, -0.5F, -0.45F, -2.75F, 1, 10, 6, 0.0F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 116, 0.0F, -0.25F, -3.5F, 0, 15, 8, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 6.85F, 9.125F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 44, -6.0F, -6.65F, 0.0F, 12, 13, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 124, 0.0F, -12.3F, 1.6F, 0, 7, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, -5.85F, 6.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.096F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 107, -2.0F, -2.0F, -1.0F, 9, 2, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.0F, 9.1F, -0.9F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1353F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 20, -3.0F, -3.0F, 0.8F, 10, 3, 13, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, -5.875F, -0.9F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 36, -3.0F, -2.0F, 1.0F, 10, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.25F, 12.1F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 54, 0, -5.0F, -2.4F, 0.0F, 10, 8, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 3.75F, 12.6F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 84, -3.0F, -1.0F, -13.2F, 8, 4, 12, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -3.325F, 13.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1265F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 66, -3.0F, 0.0F, -13.0F, 8, 3, 12, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.1F, 11.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 98, 36, -3.5F, -3.0F, 0.0F, 7, 6, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -3.425F, 2.0F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0611F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 107, -2.0F, -1.0F, -2.0F, 6, 2, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 5.3F, 2.3F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 100, -2.0F, -3.0F, -2.0F, 6, 3, 9, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.5F, 2.725F, 6.5F);
        this.body3.addChild(legright);
        this.setRotateAngle(legright, 0.2618F, -0.2618F, 0.5236F);
        this.legright.cubeList.add(new ModelBox(legright, 130, 16, -1.0F, -1.5F, -2.25F, 2, 5, 4, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 4.0F, 0.25F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.2182F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 126, 118, -0.5F, -1.0F, -2.25F, 1, 9, 5, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 58, 100, 0.0F, -2.25F, -3.0F, 0, 15, 9, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.5F, 2.725F, 6.5F);
        this.body3.addChild(legleft);
        this.setRotateAngle(legleft, 0.2618F, 0.2618F, -0.5236F);
        this.legleft.cubeList.add(new ModelBox(legleft, 130, 16, -1.0F, -1.5F, -2.25F, 2, 5, 4, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 4.0F, 0.25F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.2182F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 126, 118, -0.5F, -1.0F, -2.25F, 1, 9, 5, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 58, 100, 0.0F, -2.25F, -3.0F, 0, 15, 9, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, 0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 98, 0, -2.5F, -1.75F, 0.0F, 5, 5, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 1.15F, 1.2F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1658F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 116, 96, -3.0F, 2.0F, -2.0F, 4, 1, 9, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -4.15F, 1.2F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 16, -3.0F, 1.0F, -1.0F, 4, 2, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 100, -1.5F, -2.25F, 0.0F, 3, 5, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -4.65F, 1.0F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 100, 118, -1.0F, 2.0F, -1.0F, 2, 1, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 76, 116, -1.0F, -2.25F, 0.0F, 2, 5, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.15F, 9.7F);
        this.tail3.addChild(tail4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4887F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 66, -0.5F, -1.5F, -1.0F, 1, 4, 17, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.5F, 0.0F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.4887F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.5F, -13.4F, -1.0F, 0, 17, 27, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 4.85F, -7.875F);
        this.main.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 28, 112, -4.0F, -0.3F, -5.0F, 8, 5, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.15F, -4.45F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 123, -4.0F, -1.0F, 0.0F, 7, 2, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 5.4F, -5.0F);
        this.neck.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 122, 81, -4.0F, -3.0F, 0.0F, 7, 3, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.7F, -4.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 100, 29, -3.0F, -2.0F, -4.0F, 6, 2, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 98, 62, -2.0F, -2.0F, -5.75F, 4, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 42, 70, -0.5F, -1.0F, -12.25F, 1, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 116, -1.0F, -1.0F, -9.25F, 2, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -0.625F, -1.75F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 122, 90, -2.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.25F, 0.45F, -13.45F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.192F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 130, 45, 0.0F, -1.0F, 1.6F, 0, 1, 5, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.275F, 0.0F, -13.15F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.2356F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 130, 8, -1.0F, -1.0F, 1.0F, 1, 1, 7, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9F, -0.75F, -12.75F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.4102F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 74, 131, -1.0F, -1.0F, 7.55F, 1, 1, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 120, 130, -1.0F, -1.25F, 7.55F, 1, 2, 2, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.55F, -1.275F, -11.775F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0436F, 0.048F, -0.0698F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 130, 25, -2.0F, -1.0F, 7.55F, 2, 1, 3, -0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.85F, 0.0F, -12.75F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.4102F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 24, 131, -2.0F, -1.0F, 7.55F, 2, 1, 2, -0.01F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.9F, -0.75F, -12.75F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.4102F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 131, 0.0F, -1.0F, 7.55F, 1, 1, 2, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 120, 130, 0.0F, -1.25F, 7.55F, 1, 2, 2, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.55F, -1.275F, -11.775F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0436F, -0.048F, 0.0698F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 25, 0.0F, -1.0F, 7.55F, 2, 1, 3, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.85F, 0.0F, -12.75F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1745F, -0.4102F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 131, 0.0F, -1.0F, 7.55F, 2, 1, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.25F, 0.45F, -13.45F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.192F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 130, 45, 0.0F, -1.0F, 1.6F, 0, 1, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.275F, 0.0F, -13.15F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.2356F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 130, 8, 0.0F, -1.0F, 1.0F, 1, 1, 7, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.275F, -0.875F, -13.15F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1396F, 0.2313F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 130, 0, -1.0F, 0.0F, 0.95F, 1, 1, 7, -0.01F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.275F, -0.875F, -13.15F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1396F, -0.2313F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 130, 0, 0.0F, 0.0F, 0.95F, 1, 1, 7, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -1.225F, -10.65F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1484F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 74, -0.5F, 0.0F, -1.6F, 1, 1, 3, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.25F, -1.75F, -8.05F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.24F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 16, 131, -0.75F, 0.0F, -1.6F, 2, 1, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.25F, -1.2F, -5.975F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2269F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 78, 91, -0.75F, -1.0F, -1.6F, 2, 1, 2, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5F, -1.45F, -3.75F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0873F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 84, 0.0F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0349F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 110, 62, -2.0F, 0.0F, -5.5F, 4, 2, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 126, 71, -2.0F, -2.0F, -5.0F, 4, 2, 6, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 120, 29, -3.0F, 0.0F, -3.75F, 6, 2, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 1.05F, -12.175F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 42, 78, 0.0F, -1.0F, 0.275F, 1, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 1.325F, -9.3F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 130, 40, -1.0F, -1.0F, -0.125F, 2, 1, 4, 0.01F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.3F, -9.0F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0611F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 130, 35, -1.0F, -1.0F, -0.1F, 2, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.275F, 0.975F, -13.125F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0873F, 0.2094F, -0.0305F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 78, 87, -1.0F, -1.0F, 1.275F, 1, 1, 3, -0.01F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.25F, 0.8F, -11.2F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0262F, 0.192F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 100, 130, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.375F, 1.575F, -13.0F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0698F, 0.192F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 110, 130, -1.0F, -1.0F, 4.0F, 1, 1, 4, -0.01F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.9F, 2.0F, -12.5F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.4102F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 32, 131, -1.0F, -2.0F, 7.55F, 1, 2, 2, -0.01F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.375F, 1.575F, -13.0F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0698F, -0.192F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 110, 130, 0.0F, -1.0F, 4.0F, 1, 1, 4, -0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.275F, 0.975F, -13.125F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, -0.2094F, 0.0305F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 78, 87, 0.0F, -1.0F, 1.275F, 1, 1, 3, -0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.9F, 2.0F, -12.5F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.4102F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 32, 131, 0.0F, -2.0F, 7.55F, 1, 2, 2, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.25F, 0.8F, -11.2F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0262F, -0.192F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 100, 130, 0.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.jaw.addChild(tongue);
        this.tongue.cubeList.add(new ModelBox(tongue, -9, 0, -0.5F, 0.0F, -9.0F, 1, 0, 9, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.95F, -5.425F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.1745F, 0.0F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-1.0F, 1.6F, 3.0F);
        this.throat.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.4712F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 126, 62, -1.0F, -3.0F, -3.5F, 4, 3, 6, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.25F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 1.0F;
        this.main.rotateAngleY = (float)Math.toRadians(140);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.35F;
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

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.35F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.main.offsetY = -0.08F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMegapterygius ee = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegapterygius entity = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.25 + (((tickAnim - 5) / 5) * (0-(0.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 5) / 3) * (-4.75-(12)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.75 + (((tickAnim - 8) / 2) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 5) / 3) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.75 + (((tickAnim - 5) / 3) * (22-(6.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22 + (((tickAnim - 8) / 2) * (0-(22)));
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
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMegapterygius entity = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tongue, tongue.rotateAngleX + (float) Math.toRadians(xx), tongue.rotateAngleY + (float) Math.toRadians(yy), tongue.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 20) * (-0.47-(-0.325)));
            zz = -4.375 + (((tickAnim - 0) / 20) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7.8-(-4.375)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.47 + (((tickAnim - 20) / 20) * (-0.325-(-0.47)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7.8 + (((tickAnim - 20) / 20) * (-4.375-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-7.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tongue.rotationPointX = this.tongue.rotationPointX + (float)(xx);
        this.tongue.rotationPointY = this.tongue.rotationPointY - (float)(yy);
        this.tongue.rotationPointZ = this.tongue.rotationPointZ + (float)(zz);

    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegapterygius entity = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(6.25), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0.325);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(-43.55051), armright.rotateAngleY + (float) Math.toRadians(17.71583), armright.rotateAngleZ + (float) Math.toRadians(32.73072));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(1.30313), armright2.rotateAngleY + (float) Math.toRadians(8.53507), armright2.rotateAngleZ + (float) Math.toRadians(35.73036));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(-43.55051), armleft.rotateAngleY + (float) Math.toRadians(-17.71583), armleft.rotateAngleZ + (float) Math.toRadians(-32.73072));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(1.30313), armleft2.rotateAngleY + (float) Math.toRadians(-8.53507), armleft2.rotateAngleZ + (float) Math.toRadians(-35.73036));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-11.75), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0.125);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-1.85);
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.015),(float)1,(float)1);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-8.75), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.015),(float)1,(float)1);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0.04908), body3.rotateAngleY + (float) Math.toRadians(-1.24904), body3.rotateAngleZ + (float) Math.toRadians(2.25054));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(2.53717), legright.rotateAngleY + (float) Math.toRadians(7.41989), legright.rotateAngleZ + (float) Math.toRadians(44.06008));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(12.5));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-0.33975), legleft.rotateAngleY + (float) Math.toRadians(-6.04222), legleft.rotateAngleZ + (float) Math.toRadians(-58.63457));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(-1.75));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.10498), tail.rotateAngleY + (float) Math.toRadians(-4.40009), tail.rotateAngleZ + (float) Math.toRadians(6.06959));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5.04603), tail2.rotateAngleY + (float) Math.toRadians(-9.00154), tail2.rotateAngleZ + (float) Math.toRadians(18.40541));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-5.48825), tail3.rotateAngleY + (float) Math.toRadians(-6.16366), tail3.rotateAngleZ + (float) Math.toRadians(14.58681));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(18.00031), tail4.rotateAngleY + (float) Math.toRadians(-1.4014), tail4.rotateAngleZ + (float) Math.toRadians(40.42881));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(21.72297), neck.rotateAngleY + (float) Math.toRadians(1.11123), neck.rotateAngleZ + (float) Math.toRadians(-2.78678));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(-0.35);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.93918892+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1), head.rotateAngleY + (float) Math.toRadians(-0.98012), head.rotateAngleZ + (float) Math.toRadians(-4.9175));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.35);


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2.5000428377+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1), jaw.rotateAngleY + (float) Math.toRadians(-0.74997), jaw.rotateAngleZ + (float) Math.toRadians(-0.00655));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegapterygius entity = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), armright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.5), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1), armright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-1), armleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-2));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.5), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1), armleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*2), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*4), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*6), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1), legright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), legright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-3));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*1), legleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), legleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-3));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*8), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*12), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*14), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-10))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-2), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMegapterygius entity = (EntityPrehistoricFloraMegapterygius) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*2), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+30))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*1), armright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.5), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1), armright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-1), armleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-2));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.5), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1), armleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*4), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*6), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*8), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1), legright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*2), legright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-3));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*1), legleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-2));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-1), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*2), legleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-3));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*10), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*14), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*16), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-10))*-4), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*-3), head.rotateAngleZ + (float) Math.toRadians(0));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraMegapterygius ee = (EntityPrehistoricFloraMegapterygius) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        this.main.offsetZ = this.main.offsetZ - 0.70F;

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

