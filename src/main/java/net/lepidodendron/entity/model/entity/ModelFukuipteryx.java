package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFukuipteryx;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelFukuipteryx extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer fukuipteryx;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer headfluff3;
    private final AdvancedModelRenderer headfluff2;
    private final AdvancedModelRenderer headfluff1;
    private final AdvancedModelRenderer backfluff1;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backfluff2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer armLeft1;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tertialsLeftToHide;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer secondaryLeft;
    private final AdvancedModelRenderer secondaryLeftToHide1;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer secondaryLeftToHide2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer secondaryLeft2;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer primaryLeft1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer primaryLeft2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer primaryLeft3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer PrimaryLeft4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer PrimaryLeft5;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer PrimaryLeft6;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer PrimaryLeft7;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer armRight1;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tertialsRightToHide;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer secondaryRight;
    private final AdvancedModelRenderer secondaryRightToHide1;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer secondaryRightToHide2;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer secondaryRight2;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer primaryRight1;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer primaryRight2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer primaryRight3;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer PrimaryRight4;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer PrimaryRight5;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer PrimaryRight6;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer PrimaryRight7;
    private final AdvancedModelRenderer cube_r61;

    private ModelAnimator animator;

    public ModelFukuipteryx() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fukuipteryx = new AdvancedModelRenderer(this);
        this.fukuipteryx.setRotationPoint(0.0F, 11.6847F, 1.73F);


        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.9F, 0.1653F, 1.27F);
        this.fukuipteryx.addChild(legright);
        this.setRotateAngle(legright, -1.2217F, 0.0F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 40, 73, -0.8F, -0.75F, -0.45F, 2, 7, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 5.8F, 0.85F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 1.8762F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 30, 54, -0.3F, -0.522F, 0.0367F, 1, 8, 1, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 72, 84, -0.8F, -1.022F, -0.4633F, 2, 4, 2, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 7.2F, 0.6F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -1.1345F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 88, 47, -0.3F, -0.2577F, -0.5224F, 1, 4, 1, -0.01F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(0.0F, 3.7423F, -0.0724F);
        this.legright3.addChild(legright4);
        this.setRotateAngle(legright4, 0.48F, 0.0F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 72, 62, -1.4F, -0.25F, -4.45F, 3, 1, 6, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.9F, 0.1653F, 1.27F);
        this.fukuipteryx.addChild(legleft);
        this.setRotateAngle(legleft, -1.2217F, 0.0F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 40, 73, -1.2F, -0.75F, -0.45F, 2, 7, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 5.8F, 0.85F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 1.8762F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 30, 54, -0.7F, -0.522F, 0.0367F, 1, 8, 1, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 72, 84, -1.2F, -1.022F, -0.4633F, 2, 4, 2, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 7.2F, 0.6F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -1.1345F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 88, 47, -0.7F, -0.2577F, -0.5224F, 1, 4, 1, -0.01F, true));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.0F, 3.7423F, -0.0724F);
        this.legleft3.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.48F, 0.0F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 72, 62, -1.6F, -0.25F, -4.45F, 3, 1, 6, 0.0F, true));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.fukuipteryx.addChild(hip);
        this.setRotateAngle(hip, -0.3054F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.6847F, 0.02F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 64, -3.0F, 0.0F, -1.0F, 6, 7, 5, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 41, -3.0F, 0.0F, 2.0F, 6, 6, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4347F, 5.77F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, 0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 72, 69, -1.5F, -0.6F, -0.2F, 3, 2, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 14, 79, -1.0F, -0.35F, 4.8F, 2, 0, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.6F, 1.3F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0908F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 79, -1.0F, -2.0F, 1.0F, 2, 2, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 5.2F, 1.1F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5795F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 16, -3.0F, -2.0F, 0.0F, 4, 3, 6, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.225F, 4.8F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1154F, 0.603F, 0.4431F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 79, 0.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.225F, 4.8F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1154F, -0.603F, -0.4431F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 79, -2.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.3F, 4.8F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0493F, 0.1602F, 0.2296F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 79, 0.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.3F, 4.8F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0493F, -0.1602F, -0.2296F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 79, -2.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.9847F, -0.73F);
        this.hip.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 63, -3.0F, -1.7F, -5.75F, 6, 5, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 3.4F, -6.05F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3752F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 8, -4.0F, -2.0F, 0.0F, 6, 2, 6, 0.03F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 3.5F, -5.75F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.288F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 0, -4.0F, -2.0F, 0.0F, 6, 2, 6, -0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.4F, -5.3F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.7854F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 74, -1.5F, -1.364F, -2.4075F, 3, 3, 4, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 1.0359F, -1.4075F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 79, -2.0F, 0.0F, -1.0F, 3, 1, 4, 0.02F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.164F, -2.3075F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.8F, -0.75F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 84, -2.0F, -0.8F, -0.9F, 3, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.1F, -1.35F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 81, -2.0F, -1.8F, -0.9F, 3, 2, 3, -0.03F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.25F, -1.85F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 84, -2.0F, 0.0F, -2.0F, 3, 2, 2, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.9F, -1.25F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 74, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 1.4399F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 84, -1.5F, -0.8235F, -1.8871F, 3, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 26, -1.5F, -1.0235F, -2.4121F, 3, 1, 1, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 76, 39, -1.6F, -1.3235F, -2.2121F, 1, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 76, 39, 0.6F, -1.3235F, -2.2121F, 1, 1, 1, 0.02F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.7485F, -2.3371F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1833F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 84, -2.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.0735F, -2.9371F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.7941F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 64, 62, -2.0F, 0.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.7235F, -3.1621F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6632F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 26, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.8235F, 1.1379F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 86, -2.0F, 0.0F, -2.0F, 3, 1, 2, -0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.5F, -0.8617F, -2.5718F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.6981F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.5169F, 0.0543F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.4363F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 88, 39, 0.0F, -0.4787F, -2.9947F, 1, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -1.1581F, -2.4457F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4538F, 0.192F, -0.1265F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 88, -1.0F, -0.0417F, -0.0252F, 1, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, -1.1581F, -2.4457F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3665F, 0.2094F, -0.1309F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 88, 43, -1.0F, -0.0417F, -0.1252F, 1, 1, 3, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.1581F, -2.4457F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3665F, -0.2094F, 0.1309F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 88, 43, 0.0F, -0.0417F, -0.1252F, 1, 1, 3, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.1581F, -2.4457F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.4538F, -0.192F, 0.1265F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 88, 0.0F, -0.0417F, -0.0252F, 1, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.2169F, 0.0543F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 88, 0.0F, -0.4787F, -2.9447F, 1, 1, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0765F, 0.1379F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 85, -1.5F, -0.1F, -1.025F, 3, 1, 2, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 82, 76, -1.5F, -0.1F, -2.55F, 3, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 88, -1.5F, -1.075F, -2.05F, 3, 1, 2, -0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 88, -0.5F, -0.1143F, -5.15F, 1, 1, 3, -0.02F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.875F, -5.25F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 28, 88, -1.0F, -1.002F, 0.15F, 1, 1, 3, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.875F, -5.25F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.1745F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 88, 0.0F, -1.002F, 0.15F, 1, 1, 3, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.4F, 0.7F, -4.45F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.2531F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 81, 0.0F, -2.001F, 2.0F, 0, 2, 1, -0.01F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.4F, 0.7F, -4.45F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.2531F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 81, 0.0F, -2.001F, 2.0F, 0, 2, 1, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.724F, -2.4094F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.6632F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 1.7983F, -0.2618F);
        this.throat.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0611F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 80, 84, -2.0F, -1.8F, 0.1F, 3, 3, 2, -0.04F, false));

        this.headfluff3 = new AdvancedModelRenderer(this);
        this.headfluff3.setRotationPoint(0.0F, -1.8235F, -1.2621F);
        this.head.addChild(headfluff3);
        this.setRotateAngle(headfluff3, 0.3927F, 0.0F, 0.0F);
        this.headfluff3.cubeList.add(new ModelBox(headfluff3, 68, 39, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.headfluff2 = new AdvancedModelRenderer(this);
        this.headfluff2.setRotationPoint(0.0F, -1.9735F, -0.2621F);
        this.head.addChild(headfluff2);
        this.setRotateAngle(headfluff2, -0.0873F, 0.0F, 0.0F);
        this.headfluff2.cubeList.add(new ModelBox(headfluff2, 46, 26, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.headfluff1 = new AdvancedModelRenderer(this);
        this.headfluff1.setRotationPoint(0.0F, -1.9735F, -0.2621F);
        this.head.addChild(headfluff1);
        this.setRotateAngle(headfluff1, -0.3927F, 0.0F, 0.0F);
        this.headfluff1.cubeList.add(new ModelBox(headfluff1, 36, 26, -1.5F, 0.1F, 0.4F, 3, 0, 2, 0.0F, false));

        this.backfluff1 = new AdvancedModelRenderer(this);
        this.backfluff1.setRotationPoint(0.0F, -1.7058F, -4.7599F);
        this.chest.addChild(backfluff1);
        this.setRotateAngle(backfluff1, 0.1571F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -0.0362F, 0.0107F);
        this.backfluff1.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 50, 76, -2.5F, 0.0522F, -1.1034F, 5, 0, 3, 0.0F, false));

        this.backfluff2 = new AdvancedModelRenderer(this);
        this.backfluff2.setRotationPoint(0.0F, -1.7624F, -2.7562F);
        this.chest.addChild(backfluff2);
        this.setRotateAngle(backfluff2, 0.1396F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0278F, -0.202F);
        this.backfluff2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 76, -2.5F, 0.0522F, -1.1034F, 5, 0, 3, 0.0F, false));

        this.armLeft1 = new AdvancedModelRenderer(this);
        this.armLeft1.setRotationPoint(3.0927F, 0.0F, -5.0194F);
        this.chest.addChild(armLeft1);
        this.setRotateAngle(armLeft1, 0.0175F, -0.8147F, 1.4659F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.8371F, -0.9F, -0.8553F);
        this.armLeft1.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.8029F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 52, -3.8F, -0.1F, -1.0F, 4, 2, 8, 0.0F, true));

        this.tertialsLeftToHide = new AdvancedModelRenderer(this);
        this.tertialsLeftToHide.setRotationPoint(0.8371F, -0.9F, -0.8553F);
        this.armLeft1.addChild(tertialsLeftToHide);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tertialsLeftToHide.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.8029F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 54, -10.8F, 0.42F, -1.0F, 7, 1, 8, 0.0F, true));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(4.7942F, -0.7F, 4.7341F);
        this.armLeft1.addChild(armLeft2);
        this.setRotateAngle(armLeft2, 0.0F, 1.0036F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.1626F, -0.2F, -0.442F);
        this.armLeft2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.8465F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 68, 35, -1.6974F, 0.5F, -1.1547F, 8, 1, 3, 0.0F, true));

        this.secondaryLeft = new AdvancedModelRenderer(this);
        this.secondaryLeft.setRotationPoint(0.1626F, -0.2F, -0.442F);
        this.armLeft2.addChild(secondaryLeft);


        this.secondaryLeftToHide1 = new AdvancedModelRenderer(this);
        this.secondaryLeftToHide1.setRotationPoint(0.2711F, 0.729F, 2.5482F);
        this.secondaryLeft.addChild(secondaryLeftToHide1);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.7F, 0.0F, 4.8F);
        this.secondaryLeftToHide1.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.8465F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 64, -2.5F, 0.011F, -4.5F, 5, 1, 8, 0.0F, true));

        this.secondaryLeftToHide2 = new AdvancedModelRenderer(this);
        this.secondaryLeftToHide2.setRotationPoint(5.3552F, 0.73F, -3.6572F);
        this.secondaryLeft.addChild(secondaryLeftToHide2);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-6.3552F, -0.73F, 4.6572F);
        this.secondaryLeftToHide2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.8465F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 34, 52, 4.3026F, 0.73F, 1.8453F, 4, 1, 11, 0.0F, true));

        this.secondaryLeft2 = new AdvancedModelRenderer(this);
        this.secondaryLeft2.setRotationPoint(3.5681F, 0.0F, -1.0993F);
        this.secondaryLeft.addChild(secondaryLeft2);
        this.setRotateAngle(secondaryLeft2, 0.0F, -1.0036F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-3.5681F, 0.0F, 1.0993F);
        this.secondaryLeft2.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.8465F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 41, -1.6974F, 0.72F, 1.8453F, 5, 0, 11, 0.0F, true));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(3.9309F, 0.8F, -3.5274F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 0.0F, -0.9163F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.7432F, 0.0F, -0.6978F);
        this.armLeft3.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.9338F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 24, 73, -0.2462F, 0.1066F, 0.1934F, 2, 0, 6, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(4.6432F, 0.0F, 4.1022F);
        this.armLeft3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.8639F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 68, 26, -1.4035F, 0.0259F, -5.4966F, 3, 0, 9, 0.0F, true));

        this.primaryLeft1 = new AdvancedModelRenderer(this);
        this.primaryLeft1.setRotationPoint(2.3432F, 0.0518F, 3.0998F);
        this.armLeft3.addChild(primaryLeft1);
        this.setRotateAngle(primaryLeft1, 0.0F, 0.2182F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.7646F, 0.0F, 8.592F);
        this.primaryLeft1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.4974F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 28, 0.7F, -0.1218F, -7.2F, 4, 0, 13, 0.0F, true));

        this.primaryLeft2 = new AdvancedModelRenderer(this);
        this.primaryLeft2.setRotationPoint(5.1618F, 0.0F, 5.9446F);
        this.armLeft3.addChild(primaryLeft2);
        this.setRotateAngle(primaryLeft2, 0.0F, 0.2618F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.7646F, 0.0F, 8.592F);
        this.primaryLeft2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.4974F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 34, 28, 0.7F, -0.06F, -7.2F, 4, 0, 13, 0.0F, true));

        this.primaryLeft3 = new AdvancedModelRenderer(this);
        this.primaryLeft3.setRotationPoint(6.2966F, 0.0F, 6.5812F);
        this.armLeft3.addChild(primaryLeft3);
        this.setRotateAngle(primaryLeft3, 0.0F, 0.2094F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0969F, 0.0F, 7.5806F);
        this.primaryLeft3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.4974F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 41, -1.3F, -0.05F, -7.2F, 4, 0, 13, 0.0F, true));

        this.PrimaryLeft4 = new AdvancedModelRenderer(this);
        this.PrimaryLeft4.setRotationPoint(6.6992F, 0.0F, 6.5861F);
        this.armLeft3.addChild(PrimaryLeft4);
        this.setRotateAngle(PrimaryLeft4, 0.0F, 0.1658F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.3301F, 0.0F, 8.256F);
        this.PrimaryLeft4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.4974F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 36, 0, 0.3F, -0.04F, -7.2F, 4, 0, 13, 0.0F, true));

        this.PrimaryLeft5 = new AdvancedModelRenderer(this);
        this.PrimaryLeft5.setRotationPoint(6.7995F, 0.0F, 6.755F);
        this.armLeft3.addChild(PrimaryLeft5);
        this.setRotateAngle(PrimaryLeft5, 0.0F, 0.1222F, 0.0F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.2816F, 0.0F, 8.2861F);
        this.PrimaryLeft5.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.4974F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 36, 13, 0.3F, -0.03F, -7.2F, 4, 0, 13, 0.0F, true));

        this.PrimaryLeft6 = new AdvancedModelRenderer(this);
        this.PrimaryLeft6.setRotationPoint(7.1458F, 0.0F, 6.3901F);
        this.armLeft3.addChild(PrimaryLeft6);
        this.setRotateAngle(PrimaryLeft6, 0.0F, 0.1222F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0849F, 0.0F, 7.5168F);
        this.PrimaryLeft6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.4974F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 0, -1.3F, -0.02F, -7.2F, 4, 0, 14, 0.0F, true));

        this.PrimaryLeft7 = new AdvancedModelRenderer(this);
        this.PrimaryLeft7.setRotationPoint(7.7629F, 0.0F, 5.8852F);
        this.armLeft3.addChild(PrimaryLeft7);
        this.setRotateAngle(PrimaryLeft7, 0.0F, 0.0873F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.1221F, 0.0F, 7.8103F);
        this.PrimaryLeft7.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.4974F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 14, -2.1F, -0.01F, -8.0F, 4, 0, 14, 0.0F, true));

        this.armRight1 = new AdvancedModelRenderer(this);
        this.armRight1.setRotationPoint(-3.0927F, 0.0F, -5.0194F);
        this.chest.addChild(armRight1);
        this.setRotateAngle(armRight1, 0.0175F, 0.8147F, -1.4659F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.8371F, -0.9F, -0.8553F);
        this.armRight1.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.8029F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 64, 52, -0.2F, -0.1F, -1.0F, 4, 2, 8, 0.0F, false));

        this.tertialsRightToHide = new AdvancedModelRenderer(this);
        this.tertialsRightToHide.setRotationPoint(-0.8371F, -0.9F, -0.8553F);
        this.armRight1.addChild(tertialsRightToHide);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tertialsRightToHide.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.8029F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 54, 3.8F, 0.42F, -1.0F, 7, 1, 8, 0.0F, false));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-4.7942F, -0.7F, 4.7341F);
        this.armRight1.addChild(armRight2);
        this.setRotateAngle(armRight2, 0.0F, -1.0036F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.1626F, -0.2F, -0.442F);
        this.armRight2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.8465F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 68, 35, -6.3026F, 0.5F, -1.1547F, 8, 1, 3, 0.0F, false));

        this.secondaryRight = new AdvancedModelRenderer(this);
        this.secondaryRight.setRotationPoint(-0.1626F, -0.2F, -0.442F);
        this.armRight2.addChild(secondaryRight);


        this.secondaryRightToHide1 = new AdvancedModelRenderer(this);
        this.secondaryRightToHide1.setRotationPoint(-0.2711F, 0.729F, 2.5482F);
        this.secondaryRight.addChild(secondaryRightToHide1);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-1.7F, 0.0F, 4.8F);
        this.secondaryRightToHide1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, -0.8465F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 64, -2.5F, 0.011F, -4.5F, 5, 1, 8, 0.0F, false));

        this.secondaryRightToHide2 = new AdvancedModelRenderer(this);
        this.secondaryRightToHide2.setRotationPoint(-5.3552F, 0.73F, -3.6572F);
        this.secondaryRight.addChild(secondaryRightToHide2);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(6.3552F, -0.73F, 4.6572F);
        this.secondaryRightToHide2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.8465F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 34, 52, -8.3026F, 0.73F, 1.8453F, 4, 1, 11, 0.0F, false));

        this.secondaryRight2 = new AdvancedModelRenderer(this);
        this.secondaryRight2.setRotationPoint(-3.5681F, 0.0F, -1.0993F);
        this.secondaryRight.addChild(secondaryRight2);
        this.setRotateAngle(secondaryRight2, 0.0F, 1.0036F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(3.5681F, 0.0F, 1.0993F);
        this.secondaryRight2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.8465F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 34, 41, -3.3026F, 0.72F, 1.8453F, 5, 0, 11, 0.0F, false));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-3.9309F, 0.8F, -3.5274F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 0.0F, 0.9163F, 0.0F);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.7432F, 0.0F, -0.6978F);
        this.armRight3.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.9338F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 24, 73, -1.7538F, 0.1066F, 0.1934F, 2, 0, 6, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-4.6432F, 0.0F, 4.1022F);
        this.armRight3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.8639F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 26, -1.5965F, 0.0259F, -5.4966F, 3, 0, 9, 0.0F, false));

        this.primaryRight1 = new AdvancedModelRenderer(this);
        this.primaryRight1.setRotationPoint(-2.3432F, 0.0518F, 3.0998F);
        this.armRight3.addChild(primaryRight1);
        this.setRotateAngle(primaryRight1, 0.0F, -0.2182F, 0.0F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.7646F, 0.0F, 8.592F);
        this.primaryRight1.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.4974F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 28, -4.7F, -0.1218F, -7.2F, 4, 0, 13, 0.0F, false));

        this.primaryRight2 = new AdvancedModelRenderer(this);
        this.primaryRight2.setRotationPoint(-5.1618F, 0.0F, 5.9446F);
        this.armRight3.addChild(primaryRight2);
        this.setRotateAngle(primaryRight2, 0.0F, -0.2618F, 0.0F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.7646F, 0.0F, 8.592F);
        this.primaryRight2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.4974F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 34, 28, -4.7F, -0.06F, -7.2F, 4, 0, 13, 0.0F, false));

        this.primaryRight3 = new AdvancedModelRenderer(this);
        this.primaryRight3.setRotationPoint(-6.2966F, 0.0F, 6.5812F);
        this.armRight3.addChild(primaryRight3);
        this.setRotateAngle(primaryRight3, 0.0F, -0.2094F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0969F, 0.0F, 7.5806F);
        this.primaryRight3.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.4974F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 41, -2.7F, -0.05F, -7.2F, 4, 0, 13, 0.0F, false));

        this.PrimaryRight4 = new AdvancedModelRenderer(this);
        this.PrimaryRight4.setRotationPoint(-6.6992F, 0.0F, 6.5861F);
        this.armRight3.addChild(PrimaryRight4);
        this.setRotateAngle(PrimaryRight4, 0.0F, -0.1658F, 0.0F);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.3301F, 0.0F, 8.256F);
        this.PrimaryRight4.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.4974F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 36, 0, -4.3F, -0.04F, -7.2F, 4, 0, 13, 0.0F, false));

        this.PrimaryRight5 = new AdvancedModelRenderer(this);
        this.PrimaryRight5.setRotationPoint(-6.7995F, 0.0F, 6.755F);
        this.armRight3.addChild(PrimaryRight5);
        this.setRotateAngle(PrimaryRight5, 0.0F, -0.1222F, 0.0F);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.2816F, 0.0F, 8.2861F);
        this.PrimaryRight5.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.4974F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 36, 13, -4.3F, -0.03F, -7.2F, 4, 0, 13, 0.0F, false));

        this.PrimaryRight6 = new AdvancedModelRenderer(this);
        this.PrimaryRight6.setRotationPoint(-7.1458F, 0.0F, 6.3901F);
        this.armRight3.addChild(PrimaryRight6);
        this.setRotateAngle(PrimaryRight6, 0.0F, -0.1222F, 0.0F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.0849F, 0.0F, 7.5168F);
        this.PrimaryRight6.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.4974F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 0, -2.7F, -0.02F, -7.2F, 4, 0, 14, 0.0F, false));

        this.PrimaryRight7 = new AdvancedModelRenderer(this);
        this.PrimaryRight7.setRotationPoint(-7.7629F, 0.0F, 5.8852F);
        this.armRight3.addChild(PrimaryRight7);
        this.setRotateAngle(PrimaryRight7, 0.0F, -0.0873F, 0.0F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-2.1221F, 0.0F, 7.8103F);
        this.PrimaryRight7.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.4974F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 14, -1.9F, -0.01F, -8.0F, 4, 0, 14, 0.0F, false));

        this.cube_r33.setScale((float)0,(float)0,(float)1);
        this.cube_r35.setScale((float)0,(float)1,(float)1);
        this.cube_r36.setScale((float)0,(float)1,(float)1);
        this.cube_r48.setScale((float)0,(float)1,(float)1);
        this.cube_r50.setScale((float)0,(float)0,(float)1);
        this.cube_r51.setScale((float)0,(float)0,(float)1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.fukuipteryx.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.fukuipteryx.offsetY = -2.30F;
        this.fukuipteryx.offsetX = -0.05F;
        this.fukuipteryx.rotateAngleY = (float)Math.toRadians(210);
        this.fukuipteryx.rotateAngleX = (float)Math.toRadians(8);
        this.fukuipteryx.rotateAngleZ = (float)Math.toRadians(-8);
        this.fukuipteryx.scaleChildren = true;
        float scaler = 2.9F;
        this.fukuipteryx.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.fukuipteryx.render(f);
        //Reset rotations, positions and sizing:
        this.fukuipteryx.setScale(1.0F, 1.0F, 1.0F);
        this.fukuipteryx.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraFukuipteryx ee = (EntityPrehistoricFloraFukuipteryx) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainWave(Tail, 0.5F, -0.01F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();




        EntityPrehistoricFloraFukuipteryx ee = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;

        if (ee.getIsFlying() || ee.getIsLaunching()) {

            this.cube_r33.setScale((float)1,(float)1,(float)1);
            this.cube_r35.setScale((float)1,(float)1,(float)1);
            this.cube_r36.setScale((float)1,(float)1,(float)1);
            this.cube_r48.setScale((float)1,(float)1,(float)1);
            this.cube_r50.setScale((float)1,(float)1,(float)1);
            this.cube_r51.setScale((float)1,(float)1,(float)1);


        } else {
            this.head.setScale(1,1,1);
            this.cube_r33.setScale((float)0,(float)0,(float)1);
            this.cube_r35.setScale((float)0,(float)1,(float)1);
            this.cube_r36.setScale((float)0,(float)1,(float)1);
            this.cube_r48.setScale((float)0,(float)1,(float)1);
            this.cube_r50.setScale((float)0,(float)0,(float)1);
            this.cube_r51.setScale((float)0,(float)0,(float)1);
        }

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
                else {
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
            if (ee.getIsLaunching()) {
                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 10) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (58.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 58.5 + (((tickAnim - 10) / 10) * (0-(58.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 24.25 + (((tickAnim - 10) / 10) * (0-(24.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 5) / 3) * (-30-(13.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30 + (((tickAnim - 8) / 2) * (-23.5-(-30)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.5 + (((tickAnim - 10) / 10) * (0-(-23.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 0 + (((tickAnim - 5) / 3) * (23.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.75 + (((tickAnim - 8) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (21.94956-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.51444-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.17562-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 21.94956 + (((tickAnim - 20) / 10) * (21.94956-(21.94956)));
            yy = -0.51444 + (((tickAnim - 20) / 10) * (-0.51444-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 20) / 10) * (0.17562-(0.17562)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 21.94956 + (((tickAnim - 30) / 20) * (0-(21.94956)));
            yy = -0.51444 + (((tickAnim - 30) / 20) * (0-(-0.51444)));
            zz = 0.17562 + (((tickAnim - 30) / 20) * (0-(0.17562)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(fukuipteryx, fukuipteryx.rotateAngleX + (float) Math.toRadians(xx), fukuipteryx.rotateAngleY + (float) Math.toRadians(yy), fukuipteryx.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.fukuipteryx.rotationPointX = this.fukuipteryx.rotationPointX + (float)(xx);
        this.fukuipteryx.rotationPointY = this.fukuipteryx.rotationPointY - (float)(yy);
        this.fukuipteryx.rotationPointZ = this.fukuipteryx.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -31.75 + (((tickAnim - 20) / 10) * (-31.75-(-31.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -31.75 + (((tickAnim - 30) / 20) * (0-(-31.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 47.5 + (((tickAnim - 20) / 10) * (47.5-(47.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 30) / 20) * (0-(47.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-98.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -98.75 + (((tickAnim - 20) / 10) * (-98.75-(-98.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -98.75 + (((tickAnim - 30) / 20) * (0-(-98.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 63.5 + (((tickAnim - 20) / 10) * (63.5-(63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 63.5 + (((tickAnim - 30) / 20) * (0-(63.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -31.75 + (((tickAnim - 20) / 10) * (-31.75-(-31.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -31.75 + (((tickAnim - 30) / 20) * (0-(-31.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 47.5 + (((tickAnim - 20) / 10) * (47.5-(47.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 47.5 + (((tickAnim - 30) / 20) * (0-(47.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-98.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -98.75 + (((tickAnim - 20) / 10) * (-98.75-(-98.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -98.75 + (((tickAnim - 30) / 20) * (0-(-98.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 63.5 + (((tickAnim - 20) / 10) * (63.5-(63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 63.5 + (((tickAnim - 30) / 20) * (0-(63.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.25 + (((tickAnim - 20) / 10) * (-10.25-(-10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.25 + (((tickAnim - 30) / 20) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7 + (((tickAnim - 20) / 10) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 30) / 20) * (0-(-7)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.25 + (((tickAnim - 20) / 10) * (-8.25-(-8.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.25 + (((tickAnim - 30) / 20) * (0-(-8.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(xx), armLeft1.rotateAngleY + (float) Math.toRadians(yy), armLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (8.25-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 8.25 + (((tickAnim - 20) / 10) * (8.25-(8.25)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 8.25 + (((tickAnim - 30) / 20) * (0-(8.25)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(xx), armRight1.rotateAngleY + (float) Math.toRadians(yy), armRight1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.25 + (((tickAnim - 10) / 8) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -3.25 + (((tickAnim - 25) / 4) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -3.25 + (((tickAnim - 34) / 6) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -4.25 + (((tickAnim - 10) / 8) * (3.75-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 3.75 + (((tickAnim - 18) / 7) * (11.75-(3.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 11.75 + (((tickAnim - 25) / 4) * (0-(11.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (11.75-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 34) / 6) * (0-(11.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 10) / 8) * (-14.75-(-4)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -14.75 + (((tickAnim - 18) / 7) * (-24-(-14.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -24 + (((tickAnim - 25) / 4) * (0-(-24)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (-24-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -24 + (((tickAnim - 34) / 6) * (0-(-24)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -11.5 + (((tickAnim - 10) / 8) * (13.25-(-11.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 13.25 + (((tickAnim - 18) / 7) * (-3.75-(13.25)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -3.75 + (((tickAnim - 25) / 4) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 34) / 6) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0), upperjaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (23.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 23.5 + (((tickAnim - 10) / 8) * (0-(23.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (18.75-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 18.75 + (((tickAnim - 25) / 4) * (0-(18.75)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (18.75-(0)));
            yy = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 18.75 + (((tickAnim - 34) / 6) * (0-(18.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(fukuipteryx, fukuipteryx.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-6), fukuipteryx.rotateAngleY + (float) Math.toRadians(0), fukuipteryx.rotateAngleZ + (float) Math.toRadians(0));
        this.fukuipteryx.rotationPointX = this.fukuipteryx.rotationPointX + (float)(0);
        this.fukuipteryx.rotationPointY = this.fukuipteryx.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*0.7);
        this.fukuipteryx.rotationPointZ = this.fukuipteryx.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-0.5);


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(57.25), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-50.5), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(19.75), legright4.rotateAngleY + (float) Math.toRadians(0), legright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(57.25), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-50.5), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(19.75), legleft4.rotateAngleY + (float) Math.toRadians(0), legleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*6), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(51.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*-4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-230))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0.325);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-52+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(26.25), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0.375);


        this.setRotateAngle(headfluff3, headfluff3.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff3.rotateAngleY + (float) Math.toRadians(0), headfluff3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff2, headfluff2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff2.rotateAngleY + (float) Math.toRadians(0), headfluff2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff1, headfluff1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff1.rotateAngleY + (float) Math.toRadians(0), headfluff1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(1.3254590346+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*30), armLeft1.rotateAngleY + (float) Math.toRadians(88.1449709781+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-10), armLeft1.rotateAngleZ + (float) Math.toRadians(-82.4015970357+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-35));


        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*25), armLeft2.rotateAngleY + (float) Math.toRadians(-122.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-15), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*-25));


        this.setRotateAngle(secondaryLeftToHide2, secondaryLeftToHide2.rotateAngleX + (float) Math.toRadians(0), secondaryLeftToHide2.rotateAngleY + (float) Math.toRadians(-14.25), secondaryLeftToHide2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondaryLeft2, secondaryLeft2.rotateAngleX + (float) Math.toRadians(0), secondaryLeft2.rotateAngleY + (float) Math.toRadians(49), secondaryLeft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*10), armLeft3.rotateAngleY + (float) Math.toRadians(118.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-15), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-10));


        this.setRotateAngle(primaryLeft1, primaryLeft1.rotateAngleX + (float) Math.toRadians(-1.0150647947+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-5), primaryLeft1.rotateAngleY + (float) Math.toRadians(-71.9075474846+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5), primaryLeft1.rotateAngleZ + (float) Math.toRadians(2.0020346496+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-5));


        this.setRotateAngle(primaryLeft2, primaryLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-3), primaryLeft2.rotateAngleY + (float) Math.toRadians(-76.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-160))*-5), primaryLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-5));


        this.setRotateAngle(primaryLeft3, primaryLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-1), primaryLeft3.rotateAngleY + (float) Math.toRadians(-66+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-180))*-10), primaryLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-5));


        this.setRotateAngle(PrimaryLeft4, PrimaryLeft4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-5), PrimaryLeft4.rotateAngleY + (float) Math.toRadians(-50.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-15), PrimaryLeft4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*-5));


        this.setRotateAngle(PrimaryLeft5, PrimaryLeft5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-350))*10), PrimaryLeft5.rotateAngleY + (float) Math.toRadians(-34+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*-15), PrimaryLeft5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-180))*10));


        this.setRotateAngle(PrimaryLeft6, PrimaryLeft6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*15), PrimaryLeft6.rotateAngleY + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-20), PrimaryLeft6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-15));


        this.setRotateAngle(PrimaryLeft7, PrimaryLeft7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-350))*20), PrimaryLeft7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*-25), PrimaryLeft7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*-20));


        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(1.3254590346+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*30), armRight1.rotateAngleY + (float) Math.toRadians(-88.1449709781+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*10), armRight1.rotateAngleZ + (float) Math.toRadians(82.4015970357+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*35));


        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*25), armRight2.rotateAngleY + (float) Math.toRadians(122.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*15), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*25));


        this.setRotateAngle(secondaryRightToHide2, secondaryRightToHide2.rotateAngleX + (float) Math.toRadians(0), secondaryRightToHide2.rotateAngleY + (float) Math.toRadians(14.25), secondaryRightToHide2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(secondaryRight2, secondaryRight2.rotateAngleX + (float) Math.toRadians(0), secondaryRight2.rotateAngleY + (float) Math.toRadians(-49), secondaryRight2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*10), armRight3.rotateAngleY + (float) Math.toRadians(-118.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*15), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*10));


        this.setRotateAngle(primaryRight1, primaryRight1.rotateAngleX + (float) Math.toRadians(1.0150647947+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*5), primaryRight1.rotateAngleY + (float) Math.toRadians(71.9075474846+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*5), primaryRight1.rotateAngleZ + (float) Math.toRadians(2.0020346496+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*5));


        this.setRotateAngle(primaryRight2, primaryRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-3), primaryRight2.rotateAngleY + (float) Math.toRadians(76.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-160))*5), primaryRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*5));


        this.setRotateAngle(primaryRight3, primaryRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*1), primaryRight3.rotateAngleY + (float) Math.toRadians(66+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-180))*10), primaryRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*5));


        this.setRotateAngle(PrimaryRight4, PrimaryRight4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*5), PrimaryRight4.rotateAngleY + (float) Math.toRadians(50.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*15), PrimaryRight4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-280))*5));


        this.setRotateAngle(PrimaryRight5, PrimaryRight5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-350))*10), PrimaryRight5.rotateAngleY + (float) Math.toRadians(34+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*15), PrimaryRight5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-180))*10));


        this.setRotateAngle(PrimaryRight6, PrimaryRight6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*15), PrimaryRight6.rotateAngleY + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*20), PrimaryRight6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*15));


        this.setRotateAngle(PrimaryRight7, PrimaryRight7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-350))*20), PrimaryRight7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-190))*25), PrimaryRight7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*20));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 89;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(fukuipteryx, fukuipteryx.rotateAngleX + (float) Math.toRadians(-2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80))*0.2), fukuipteryx.rotateAngleY + (float) Math.toRadians(0), fukuipteryx.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80-50))*-2));
        this.fukuipteryx.rotationPointX = this.fukuipteryx.rotationPointX + (float)(0);
        this.fukuipteryx.rotationPointY = this.fukuipteryx.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80))*0.1);
        this.fukuipteryx.rotationPointZ = this.fukuipteryx.rotationPointZ + (float)(0);
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(57.25), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-50.5), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(19.75), legright4.rotateAngleY + (float) Math.toRadians(0), legright4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(57.25), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-50.5), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(19.75), legleft4.rotateAngleY + (float) Math.toRadians(0), legleft4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80-50))*0.4), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80-150))*-2));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80-100))*1), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80-150))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(51.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(4.25), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0.325);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-52), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(26.25), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0.375);
        this.setRotateAngle(headfluff3, headfluff3.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff3.rotateAngleY + (float) Math.toRadians(0), headfluff3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(headfluff2, headfluff2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff2.rotateAngleY + (float) Math.toRadians(0), headfluff2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(headfluff1, headfluff1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), headfluff1.rotateAngleY + (float) Math.toRadians(0), headfluff1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(-3.677268805+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80/0.5))*0.5), armLeft1.rotateAngleY + (float) Math.toRadians(89.9452), armLeft1.rotateAngleZ + (float) Math.toRadians(-85.04745));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80/0.5-100))*0.2), armLeft2.rotateAngleY + (float) Math.toRadians(-122.75), armLeft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(secondaryLeftToHide2, secondaryLeftToHide2.rotateAngleX + (float) Math.toRadians(0), secondaryLeftToHide2.rotateAngleY + (float) Math.toRadians(-14.25), secondaryLeftToHide2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(secondaryLeft2, secondaryLeft2.rotateAngleX + (float) Math.toRadians(0), secondaryLeft2.rotateAngleY + (float) Math.toRadians(49), secondaryLeft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.4-150))*0.5), armLeft3.rotateAngleY + (float) Math.toRadians(118.75), armLeft3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(primaryLeft1, primaryLeft1.rotateAngleX + (float) Math.toRadians(-1.01506), primaryLeft1.rotateAngleY + (float) Math.toRadians(-71.90755), primaryLeft1.rotateAngleZ + (float) Math.toRadians(2.00203));
        this.setRotateAngle(primaryLeft2, primaryLeft2.rotateAngleX + (float) Math.toRadians(0), primaryLeft2.rotateAngleY + (float) Math.toRadians(-76.5), primaryLeft2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(primaryLeft3, primaryLeft3.rotateAngleX + (float) Math.toRadians(0), primaryLeft3.rotateAngleY + (float) Math.toRadians(-66), primaryLeft3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(PrimaryLeft4, PrimaryLeft4.rotateAngleX + (float) Math.toRadians(0), PrimaryLeft4.rotateAngleY + (float) Math.toRadians(-50.75), PrimaryLeft4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(PrimaryLeft5, PrimaryLeft5.rotateAngleX + (float) Math.toRadians(3.5823+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*-0.5), PrimaryLeft5.rotateAngleY + (float) Math.toRadians(-23.30079), PrimaryLeft5.rotateAngleZ + (float) Math.toRadians(-7.66151));
        this.setRotateAngle(PrimaryLeft6, PrimaryLeft6.rotateAngleX + (float) Math.toRadians(4.0742+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*-0.5), PrimaryLeft6.rotateAngleY + (float) Math.toRadians(-5.02685), PrimaryLeft6.rotateAngleZ + (float) Math.toRadians(-6.58582));
        this.setRotateAngle(PrimaryLeft7, PrimaryLeft7.rotateAngleX + (float) Math.toRadians(6.7099+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*-0.5), PrimaryLeft7.rotateAngleY + (float) Math.toRadians(12.89128), PrimaryLeft7.rotateAngleZ + (float) Math.toRadians(-4.63908));
        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(-3.677268805+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80/0.5))*0.5), armRight1.rotateAngleY + (float) Math.toRadians(-89.9452), armRight1.rotateAngleZ + (float) Math.toRadians(85.04745));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*80/0.5-100))*0.2), armRight2.rotateAngleY + (float) Math.toRadians(122.75), armRight2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(secondaryRightToHide2, secondaryRightToHide2.rotateAngleX + (float) Math.toRadians(0), secondaryRightToHide2.rotateAngleY + (float) Math.toRadians(14.25), secondaryRightToHide2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(secondaryRight2, secondaryRight2.rotateAngleX + (float) Math.toRadians(0), secondaryRight2.rotateAngleY + (float) Math.toRadians(-49), secondaryRight2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.4-150))*0.5), armRight3.rotateAngleY + (float) Math.toRadians(-118.75), armRight3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(primaryRight1, primaryRight1.rotateAngleX + (float) Math.toRadians(1.01506), primaryRight1.rotateAngleY + (float) Math.toRadians(71.90755), primaryRight1.rotateAngleZ + (float) Math.toRadians(2.00203));
        this.setRotateAngle(primaryRight2, primaryRight2.rotateAngleX + (float) Math.toRadians(0), primaryRight2.rotateAngleY + (float) Math.toRadians(76.5), primaryRight2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(primaryRight3, primaryRight3.rotateAngleX + (float) Math.toRadians(0), primaryRight3.rotateAngleY + (float) Math.toRadians(66), primaryRight3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(PrimaryRight4, PrimaryRight4.rotateAngleX + (float) Math.toRadians(0), PrimaryRight4.rotateAngleY + (float) Math.toRadians(46.5), PrimaryRight4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(PrimaryRight5, PrimaryRight5.rotateAngleX + (float) Math.toRadians(3.5823+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*0.5), PrimaryRight5.rotateAngleY + (float) Math.toRadians(23.30079), PrimaryRight5.rotateAngleZ + (float) Math.toRadians(7.66151));
        this.setRotateAngle(PrimaryRight6, PrimaryRight6.rotateAngleX + (float) Math.toRadians(4.0742+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*0.5), PrimaryRight6.rotateAngleY + (float) Math.toRadians(5.02685), PrimaryRight6.rotateAngleZ + (float) Math.toRadians(6.58582));
        this.setRotateAngle(PrimaryRight7, PrimaryRight7.rotateAngleX + (float) Math.toRadians(6.7099+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*65/0.2-150))*0.5), PrimaryRight7.rotateAngleY + (float) Math.toRadians(-12.89128), PrimaryRight7.rotateAngleZ + (float) Math.toRadians(4.63908));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFukuipteryx entity = (EntityPrehistoricFloraFukuipteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(fukuipteryx, fukuipteryx.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), fukuipteryx.rotateAngleY + (float) Math.toRadians(0), fukuipteryx.rotateAngleZ + (float) Math.toRadians(0));
        this.fukuipteryx.rotationPointX = this.fukuipteryx.rotationPointX + (float)(0);
        this.fukuipteryx.rotationPointY = this.fukuipteryx.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-10))*-0.3);
        this.fukuipteryx.rotationPointZ = this.fukuipteryx.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-0.2);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.75 + (((tickAnim - 0) / 10) * (-6.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.75 + (((tickAnim - 10) / 10) * (13.75-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 0) / 10) * (-30.75-(21)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.75 + (((tickAnim - 10) / 10) * (21-(-30.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.75 + (((tickAnim - 0) / 4) * (-49.33-(2.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -49.33 + (((tickAnim - 4) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -43.83 + (((tickAnim - 7) / 3) * (9.75-(-43.83)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (2.75-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24.25 + (((tickAnim - 0) / 4) * (63.19-(24.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 63.19 + (((tickAnim - 4) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 76.69 + (((tickAnim - 7) / 3) * (29.5-(76.69)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.5 + (((tickAnim - 10) / 3) * (5.5-(29.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5.5 + (((tickAnim - 13) / 4) * (-5.87-(5.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5.87 + (((tickAnim - 17) / 3) * (24.25-(-5.87)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (1.64-(0.6)));
            zz = 0.275 + (((tickAnim - 0) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.64 + (((tickAnim - 3) / 1) * (1.075-(1.64)));
            zz = 0.11 + (((tickAnim - 3) / 1) * (0-(0.11)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 4) / 3) * (0-(1.075)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.94-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.05-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.94 + (((tickAnim - 12) / 1) * (0.875-(0.94)));
            zz = 0.05 + (((tickAnim - 12) / 1) * (0.09-(0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 13) / 7) * (0.6-(0.875)));
            zz = 0.09 + (((tickAnim - 13) / 7) * (0.275-(0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright4.rotationPointX = this.legright4.rotationPointX + (float)(xx);
        this.legright4.rotationPointY = this.legright4.rotationPointY - (float)(yy);
        this.legright4.rotationPointZ = this.legright4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6.75 + (((tickAnim - 0) / 10) * (13.75-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 10) / 10) * (-6.75-(13.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -30.75 + (((tickAnim - 0) / 10) * (21-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 10) / 10) * (-30.75-(21)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9.75 + (((tickAnim - 0) / 10) * (2.75-(9.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 2.75 + (((tickAnim - 10) / 4) * (-49.33-(2.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -49.33 + (((tickAnim - 14) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -43.83 + (((tickAnim - 17) / 3) * (9.75-(-43.83)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.5 + (((tickAnim - 0) / 3) * (5.5-(29.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5.5 + (((tickAnim - 3) / 4) * (-5.87-(5.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -5.87 + (((tickAnim - 7) / 3) * (24.25-(-5.87)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 24.25 + (((tickAnim - 10) / 4) * (63.19-(24.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 63.19 + (((tickAnim - 14) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 76.69 + (((tickAnim - 17) / 3) * (29.5-(76.69)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.94-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.94 + (((tickAnim - 2) / 1) * (0.875-(0.94)));
            zz = 0.05 + (((tickAnim - 2) / 1) * (0.09-(0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.875 + (((tickAnim - 3) / 7) * (0.6-(0.875)));
            zz = 0.09 + (((tickAnim - 3) / 7) * (0.275-(0.09)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 10) / 3) * (1.64-(0.6)));
            zz = 0.275 + (((tickAnim - 10) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.64 + (((tickAnim - 13) / 1) * (1.075-(1.64)));
            zz = 0.11 + (((tickAnim - 13) / 1) * (0-(0.11)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 14) / 3) * (0-(1.075)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft4.rotationPointX = this.legleft4.rotationPointX + (float)(xx);
        this.legleft4.rotationPointY = this.legleft4.rotationPointY - (float)(yy);
        this.legleft4.rotationPointZ = this.legleft4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*1.5), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-0.2);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff3, headfluff3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*-3), headfluff3.rotateAngleY + (float) Math.toRadians(0), headfluff3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff2, headfluff2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-430))*-3), headfluff2.rotateAngleY + (float) Math.toRadians(0), headfluff2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff1, headfluff1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-3), headfluff1.rotateAngleY + (float) Math.toRadians(0), headfluff1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(0), armLeft1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-1.5), armLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(0), armRight1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*1.5), armRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.tertialsLeftToHide.setScale((float)0,(float)1,(float)1);


        this.secondaryLeftToHide1.setScale((float)0,(float)1,(float)1);


        this.secondaryLeftToHide2.setScale((float)0,(float)1,(float)1);


        this.tertialsRightToHide.setScale((float)0,(float)1,(float)1);


        this.secondaryRightToHide1.setScale((float)0,(float)0,(float)1);


        this.secondaryRightToHide2.setScale((float)0,(float)0,(float)1);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
