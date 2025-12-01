package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEoconfuciusornis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEoconfuciusornis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer confuciusornis;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tailfeatherright;
    private final AdvancedModelRenderer tailfeatherleft2;
    private final AdvancedModelRenderer tailfeatherright3;
    private final AdvancedModelRenderer tailfeatherright4;
    private final AdvancedModelRenderer tailfeatherright5;
    private final AdvancedModelRenderer tailfeatherright6;
    private final AdvancedModelRenderer tailfeatherleft;
    private final AdvancedModelRenderer tailfeatherright2;
    private final AdvancedModelRenderer tailfeatherleft3;
    private final AdvancedModelRenderer tailfeatherleft4;
    private final AdvancedModelRenderer tailfeatherleft5;
    private final AdvancedModelRenderer tailfeatherleft6;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer headfluff3;
    private final AdvancedModelRenderer headfluff2;
    private final AdvancedModelRenderer headfluff1;
    private final AdvancedModelRenderer backfluff1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backfluff2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer chestfluff2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer chestfluff1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer chestfluff3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer armleft1;
    private final AdvancedModelRenderer tertialsleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer secondariesleft;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer secondariesleftfoldable;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer primariesleft;
    private final AdvancedModelRenderer primaryleft7;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer primaryleft6;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer primaryleft5;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer primaryleft4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer primaryleft3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer primaryleft2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer primaryleft1;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer armright1;
    private final AdvancedModelRenderer tertialsright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer secondariesright;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer secondariesrightfoldable;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer primariesright;
    private final AdvancedModelRenderer primaryright7;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer primaryright6;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer primaryright5;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer primaryright4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer primaryright3;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer primaryright2;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer primaryright1;
    private final AdvancedModelRenderer cube_r41;

    private ModelAnimator animator;

    public ModelEoconfuciusornis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.confuciusornis = new AdvancedModelRenderer(this);
        this.confuciusornis.setRotationPoint(0.0F, 15.7847F, 1.73F);


        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.9F, 1.5153F, -2.33F);
        this.confuciusornis.addChild(legright);
        this.setRotateAngle(legright, 0.5672F, 0.0F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 35, -0.8F, -0.75F, -0.45F, 2, 6, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, 1.05F);
        this.legright.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 6, -1.1F, 0.95F, -0.6F, 3, 3, 4, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 5.35F, 1.35F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, -1.1781F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 7, 19, -0.3F, -0.022F, -0.9633F, 1, 4, 1, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 3.728F, -0.5133F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.6109F, 0.0F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 52, 0, -1.4F, -0.25F, -3.45F, 3, 1, 5, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.9F, 1.5153F, -2.33F);
        this.confuciusornis.addChild(legleft);
        this.setRotateAngle(legleft, 0.5672F, 0.0F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 55, 63, -1.2F, -0.75F, -0.45F, 2, 6, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, 1.05F);
        this.legleft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 7, -1.9F, 0.95F, -0.6F, 3, 3, 4, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 5.35F, 1.35F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, -1.1781F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 7, 25, -0.7F, -0.022F, -0.9633F, 1, 4, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 3.728F, -0.5133F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.6109F, 0.0F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 53, 39, -1.6F, -0.25F, -3.45F, 3, 1, 5, 0.0F, false));

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.confuciusornis.addChild(hip);
        this.setRotateAngle(hip, -0.2138F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.6847F, 0.02F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 35, -3.0F, 0.0F, -1.0F, 6, 6, 5, 0.02F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 41, -2.0F, 0.0F, 0.0F, 4, 6, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4347F, 5.77F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 53, 23, -1.5F, -0.5F, -0.75F, 3, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 4.0F, -0.45F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9163F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.0F, -2.0F, 0.0F, 3, 3, 4, -0.01F, false));

        this.tailfeatherright = new AdvancedModelRenderer(this);
        this.tailfeatherright.setRotationPoint(-0.7F, -0.2F, 4.25F);
        this.tail.addChild(tailfeatherright);
        this.setRotateAngle(tailfeatherright, -0.0873F, -0.0873F, 0.0F);
        this.tailfeatherright.cubeList.add(new ModelBox(tailfeatherright, 0, 53, -0.5027F, 0.0039F, -1.0478F, 1, 0, 7, 0.0F, false));

        this.tailfeatherleft2 = new AdvancedModelRenderer(this);
        this.tailfeatherleft2.setRotationPoint(-0.0027F, 0.0039F, 5.9522F);
        this.tailfeatherright.addChild(tailfeatherleft2);
        this.setRotateAngle(tailfeatherleft2, 0.1309F, 0.0F, 0.0F);
        this.tailfeatherleft2.cubeList.add(new ModelBox(tailfeatherleft2, 32, 10, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, false));

        this.tailfeatherright3 = new AdvancedModelRenderer(this);
        this.tailfeatherright3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tailfeatherleft2.addChild(tailfeatherright3);
        this.setRotateAngle(tailfeatherright3, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherright3.cubeList.add(new ModelBox(tailfeatherright3, 52, 47, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, false));

        this.tailfeatherright4 = new AdvancedModelRenderer(this);
        this.tailfeatherright4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tailfeatherright3.addChild(tailfeatherright4);
        this.setRotateAngle(tailfeatherright4, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherright4.cubeList.add(new ModelBox(tailfeatherright4, 66, 5, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.tailfeatherright5 = new AdvancedModelRenderer(this);
        this.tailfeatherright5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tailfeatherright4.addChild(tailfeatherright5);
        this.setRotateAngle(tailfeatherright5, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherright5.cubeList.add(new ModelBox(tailfeatherright5, 64, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.tailfeatherright6 = new AdvancedModelRenderer(this);
        this.tailfeatherright6.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tailfeatherright5.addChild(tailfeatherright6);
        this.setRotateAngle(tailfeatherright6, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 21, 35, 0.25F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 33, 2, -0.25F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 27, 28, -0.25F, 0.0F, 1.0F, 1, 0, 1, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 33, 0, 0.25F, 0.0F, 1.0F, 1, 0, 1, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 64, 69, -0.5F, 0.0F, 2.0F, 2, 0, 2, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 22, 60, 0.0F, -0.0074F, 0.0F, 1, 0, 5, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 22, 47, 0.0F, 0.0126F, 0.0F, 1, 0, 5, 0.0F, false));
        this.tailfeatherright6.cubeList.add(new ModelBox(tailfeatherright6, 22, 28, 0.0F, 0.0F, 5.0F, 1, 0, 1, 0.0F, false));

        this.tailfeatherleft = new AdvancedModelRenderer(this);
        this.tailfeatherleft.setRotationPoint(0.7F, -0.2F, 4.25F);
        this.tail.addChild(tailfeatherleft);
        this.setRotateAngle(tailfeatherleft, -0.0873F, 0.0873F, 0.0F);
        this.tailfeatherleft.cubeList.add(new ModelBox(tailfeatherleft, 0, 53, -0.4973F, 0.0039F, -1.0478F, 1, 0, 7, 0.0F, true));

        this.tailfeatherright2 = new AdvancedModelRenderer(this);
        this.tailfeatherright2.setRotationPoint(0.0027F, 0.0039F, 5.9522F);
        this.tailfeatherleft.addChild(tailfeatherright2);
        this.setRotateAngle(tailfeatherright2, 0.1309F, 0.0F, 0.0F);
        this.tailfeatherright2.cubeList.add(new ModelBox(tailfeatherright2, 32, 10, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, true));

        this.tailfeatherleft3 = new AdvancedModelRenderer(this);
        this.tailfeatherleft3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tailfeatherright2.addChild(tailfeatherleft3);
        this.setRotateAngle(tailfeatherleft3, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherleft3.cubeList.add(new ModelBox(tailfeatherleft3, 52, 47, -0.5F, 0.0F, 0.0F, 1, 0, 7, 0.0F, true));

        this.tailfeatherleft4 = new AdvancedModelRenderer(this);
        this.tailfeatherleft4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tailfeatherleft3.addChild(tailfeatherleft4);
        this.setRotateAngle(tailfeatherleft4, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherleft4.cubeList.add(new ModelBox(tailfeatherleft4, 66, 5, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.tailfeatherleft5 = new AdvancedModelRenderer(this);
        this.tailfeatherleft5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tailfeatherleft4.addChild(tailfeatherleft5);
        this.setRotateAngle(tailfeatherleft5, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherleft5.cubeList.add(new ModelBox(tailfeatherleft5, 64, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.tailfeatherleft6 = new AdvancedModelRenderer(this);
        this.tailfeatherleft6.setRotationPoint(0.5F, 0.0F, 4.0F);
        this.tailfeatherleft5.addChild(tailfeatherleft6);
        this.setRotateAngle(tailfeatherleft6, 0.0873F, 0.0F, 0.0F);
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 21, 35, -1.25F, 0.0F, 4.0F, 1, 0, 1, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 33, 2, -0.75F, 0.0F, 4.0F, 1, 0, 1, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 27, 28, -0.75F, 0.0F, 1.0F, 1, 0, 1, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 33, 0, -1.25F, 0.0F, 1.0F, 1, 0, 1, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 64, 69, -1.5F, 0.0F, 2.0F, 2, 0, 2, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 22, 60, -1.0F, -0.0074F, 0.0F, 1, 0, 5, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 22, 47, -1.0F, 0.0126F, 0.0F, 1, 0, 5, 0.0F, true));
        this.tailfeatherleft6.cubeList.add(new ModelBox(tailfeatherleft6, 22, 28, -1.0F, 0.0F, 5.0F, 1, 0, 1, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.9847F, -0.73F);
        this.hip.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 25, 23, -3.0F, -1.7F, -6.25F, 6, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 2.2F, -6.25F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 0, -4.0F, -2.0F, 0.0F, 6, 2, 7, -0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.9F, -5.8F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.829F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 61, -1.5F, -2.864F, -2.4075F, 3, 4, 3, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.564F, -1.9075F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 51, 55, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, -1.9F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 67, 53, -2.0F, 0.0F, -2.0F, 3, 2, 2, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 2.05F, -2.45F);
        this.neck2.addChild(throat);
        this.setRotateAngle(throat, 0.8727F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.4F, 0.25F);
        this.throat.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 8, -2.0F, -1.8F, -0.9F, 3, 2, 4, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.75F, -3.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 1.4399F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 35, -1.5F, -1.0235F, -1.6621F, 3, 1, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 53, -1.5F, -1.0235F, -2.3121F, 3, 1, 1, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 13, 19, -1.6F, -1.3235F, -1.2121F, 1, 1, 1, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 14, 0.6F, -1.3235F, -1.2121F, 1, 1, 1, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.4485F, -2.1121F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4014F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 68, -2.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.3235F, -2.4371F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3578F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 69, 45, -2.0F, 0.0F, 0.0F, 3, 1, 1, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.3985F, -4.1121F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4887F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 10, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -1.0235F, 1.3379F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6545F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 29, -2.0F, 0.0F, -2.0F, 3, 1, 2, -0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.5F, -0.7617F, -2.5718F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.3491F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 64, 15, 0.0F, -0.2618F, -3.0154F, 1, 1, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.6169F, -2.7957F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0884F, 0.1298F, -0.0172F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 64, 0.0F, -0.8587F, 0.0417F, 1, 1, 4, -0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.6169F, -2.7957F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0884F, -0.1298F, 0.0172F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 65, 21, -1.0F, -0.8587F, 0.0417F, 1, 1, 4, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.6419F, -2.7207F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1091F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 64, 0.0F, -0.883F, 0.0417F, 1, 1, 4, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.7382F, -2.8904F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1658F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 64, 63, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.7382F, -2.8904F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1658F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 65, 35, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0765F, 0.1379F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 60, -1.5F, -1.1F, -1.8F, 3, 2, 1, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 55, 15, -1.5F, -0.1F, -0.8F, 3, 1, 2, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 10, -1.5F, -1.1F, -0.8F, 3, 1, 1, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 65, 41, -1.5F, -0.1F, -2.45F, 3, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 46, -0.5F, -0.1143F, -5.275F, 1, 1, 4, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4F, 0.7F, -4.45F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.2531F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -2.001F, 2.0F, 0, 2, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.4F, 0.7F, -4.45F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.2531F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 8, 0.0F, -2.001F, 2.0F, 0, 2, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.9F, -5.2F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.1658F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 11, 40, 0.0F, -1.001F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.9F, -5.2F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1658F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 69, -1.0F, -1.001F, 0.0F, 1, 1, 3, -0.01F, false));

        this.headfluff3 = new AdvancedModelRenderer(this);
        this.headfluff3.setRotationPoint(0.0F, -1.8235F, -1.2621F);
        this.head.addChild(headfluff3);
        this.setRotateAngle(headfluff3, 0.3927F, 0.0F, 0.0F);
        this.headfluff3.cubeList.add(new ModelBox(headfluff3, 31, 70, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.headfluff2 = new AdvancedModelRenderer(this);
        this.headfluff2.setRotationPoint(0.0F, -2.2235F, -0.2621F);
        this.head.addChild(headfluff2);
        this.setRotateAngle(headfluff2, -0.0873F, 0.0F, 0.0F);
        this.headfluff2.cubeList.add(new ModelBox(headfluff2, 13, 28, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.headfluff1 = new AdvancedModelRenderer(this);
        this.headfluff1.setRotationPoint(0.0F, -2.2235F, -0.2621F);
        this.head.addChild(headfluff1);
        this.setRotateAngle(headfluff1, -0.3927F, 0.0F, 0.0F);
        this.headfluff1.cubeList.add(new ModelBox(headfluff1, 10, 53, -1.5F, 0.1F, 0.4F, 3, 0, 2, 0.0F, false));

        this.backfluff1 = new AdvancedModelRenderer(this);
        this.backfluff1.setRotationPoint(1.5F, -1.7F, -5.25F);
        this.chest.addChild(backfluff1);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.5F, -0.0653F, 0.0957F);
        this.backfluff1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 31, -2.5F, 0.0522F, -1.1034F, 5, 0, 3, 0.0F, false));

        this.backfluff2 = new AdvancedModelRenderer(this);
        this.backfluff2.setRotationPoint(1.5F, -1.7F, -3.25F);
        this.chest.addChild(backfluff2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -0.0653F, 0.0957F);
        this.backfluff2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 49, -2.5F, 0.0522F, -1.1034F, 5, 0, 3, 0.0F, false));

        this.chestfluff2 = new AdvancedModelRenderer(this);
        this.chestfluff2.setRotationPoint(0.0F, 2.3434F, -6.3873F);
        this.chest.addChild(chestfluff2);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, -0.8434F, 0.5373F);
        this.chestfluff2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.5672F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 23, -4.0F, 0.0F, 0.0F, 6, 1, 3, -0.02F, false));

        this.chestfluff1 = new AdvancedModelRenderer(this);
        this.chestfluff1.setRotationPoint(0.0F, 2.3391F, -6.3876F);
        this.chest.addChild(chestfluff1);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, -0.6428F, 0.766F);
        this.chestfluff1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.8727F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 45, 23, -4.0F, 0.0F, 0.0F, 5, 1, 1, -0.01F, false));

        this.chestfluff3 = new AdvancedModelRenderer(this);
        this.chestfluff3.setRotationPoint(1.0F, 2.2F, -4.15F);
        this.chest.addChild(chestfluff3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.5F, 0.2F);
        this.chestfluff3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.3491F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 0, -4.0F, -0.4014F, -0.359F, 6, 1, 4, -0.03F, false));

        this.armleft1 = new AdvancedModelRenderer(this);
        this.armleft1.setRotationPoint(2.3F, -0.4F, -5.2F);
        this.chest.addChild(armleft1);
        this.setRotateAngle(armleft1, -0.0269F, 0.1151F, -0.0563F);
        this.armleft1.cubeList.add(new ModelBox(armleft1, 57, 55, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.tertialsleft = new AdvancedModelRenderer(this);
        this.tertialsleft.setRotationPoint(1.7F, 0.0F, 0.0F);
        this.armleft1.addChild(tertialsleft);
        this.tertialsleft.cubeList.add(new ModelBox(tertialsleft, 31, 48, -1.0F, -9.0F, -1.0F, 0, 9, 6, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.armleft1.addChild(armleft2);
        this.setRotateAngle(armleft2, -2.4216F, 0.0F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 42, 10, -0.25F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.secondariesleft = new AdvancedModelRenderer(this);
        this.secondariesleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft2.addChild(secondariesleft);
        this.setRotateAngle(secondariesleft, 0.6065F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, 0.3F, -0.2F);
        this.secondariesleft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.24F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 60, 0.01F, -8.0F, 0.0F, 0, 8, 4, 0.0F, true));

        this.secondariesleftfoldable = new AdvancedModelRenderer(this);
        this.secondariesleftfoldable.setRotationPoint(0.5F, -3.2F, 2.8F);
        this.secondariesleft.addChild(secondariesleftfoldable);
        this.secondariesleftfoldable.cubeList.add(new ModelBox(secondariesleftfoldable, 0, 19, 0.0F, -4.5F, -3.0F, 0, 8, 3, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.25F, 0.0F, 4.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 2.2384F, 0.0F, 0.0F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 43, 53, 0.0F, -0.75F, -0.75F, 0, 3, 7, 0.0F, true));

        this.primariesleft = new AdvancedModelRenderer(this);
        this.primariesleft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft3.addChild(primariesleft);


        this.primaryleft7 = new AdvancedModelRenderer(this);
        this.primaryleft7.setRotationPoint(0.1253F, 0.962F, 5.0792F);
        this.primariesleft.addChild(primaryleft7);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft7.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -0.06F, -3.0F, -1.0F, 0, 3, 15, 0.0F, true));

        this.primaryleft6 = new AdvancedModelRenderer(this);
        this.primaryleft6.setRotationPoint(0.1253F, 0.962F, 5.0792F);
        this.primariesleft.addChild(primaryleft6);
        this.setRotateAngle(primaryleft6, 0.0349F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 6, -0.05F, -3.0F, -1.0F, 0, 3, 13, 0.0F, true));

        this.primaryleft5 = new AdvancedModelRenderer(this);
        this.primaryleft5.setRotationPoint(0.1253F, 1.162F, 3.3792F);
        this.primariesleft.addChild(primaryleft5);
        this.setRotateAngle(primaryleft5, 0.0436F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.0253F, -0.162F, 1.1208F);
        this.primaryleft5.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2182F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 19, -0.04F, -3.0F, -1.0F, 0, 3, 12, 0.0F, true));

        this.primaryleft4 = new AdvancedModelRenderer(this);
        this.primaryleft4.setRotationPoint(0.1253F, 0.662F, 3.3792F);
        this.primariesleft.addChild(primaryleft4);
        this.setRotateAngle(primaryleft4, 0.0436F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2182F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 35, -0.03F, -3.0F, -1.0F, 0, 3, 10, 0.0F, true));

        this.primaryleft3 = new AdvancedModelRenderer(this);
        this.primaryleft3.setRotationPoint(0.1253F, 1.162F, 4.4792F);
        this.primariesleft.addChild(primaryleft3);
        this.setRotateAngle(primaryleft3, 0.0524F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.2182F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 45, 10, -0.02F, -3.0F, -1.0F, 0, 3, 9, 0.0F, true));

        this.primaryleft2 = new AdvancedModelRenderer(this);
        this.primaryleft2.setRotationPoint(0.1253F, 1.162F, 3.7792F);
        this.primariesleft.addChild(primaryleft2);
        this.setRotateAngle(primaryleft2, 0.1527F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 12, 47, -0.01F, -3.0F, -1.0F, 0, 3, 9, 0.0F, true));

        this.primaryleft1 = new AdvancedModelRenderer(this);
        this.primaryleft1.setRotationPoint(0.1253F, 0.962F, 2.1792F);
        this.primariesleft.addChild(primaryleft1);
        this.setRotateAngle(primaryleft1, 0.0393F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.0253F, 0.038F, 0.9208F);
        this.primaryleft1.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2182F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 43, 26, 0.0F, -3.0F, -1.0F, 0, 3, 9, 0.0F, true));

        this.armright1 = new AdvancedModelRenderer(this);
        this.armright1.setRotationPoint(-2.3F, -0.4F, -5.2F);
        this.chest.addChild(armright1);
        this.setRotateAngle(armright1, -0.0269F, -0.1151F, 0.0563F);
        this.armright1.cubeList.add(new ModelBox(armright1, 57, 55, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tertialsright = new AdvancedModelRenderer(this);
        this.tertialsright.setRotationPoint(-1.7F, 0.0F, 0.0F);
        this.armright1.addChild(tertialsright);
        this.tertialsright.cubeList.add(new ModelBox(tertialsright, 31, 48, 1.0F, -9.0F, -1.0F, 0, 9, 6, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.armright1.addChild(armright2);
        this.setRotateAngle(armright2, -2.4216F, 0.0F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 42, 10, -0.75F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.secondariesright = new AdvancedModelRenderer(this);
        this.secondariesright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright2.addChild(secondariesright);
        this.setRotateAngle(secondariesright, 0.6065F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.3F, -0.2F);
        this.secondariesright.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.24F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 13, 60, -0.01F, -8.0F, 0.0F, 0, 8, 4, 0.0F, false));

        this.secondariesrightfoldable = new AdvancedModelRenderer(this);
        this.secondariesrightfoldable.setRotationPoint(-0.5F, -3.2F, 2.8F);
        this.secondariesright.addChild(secondariesrightfoldable);
        this.secondariesrightfoldable.cubeList.add(new ModelBox(secondariesrightfoldable, 0, 19, 0.0F, -4.5F, -3.0F, 0, 8, 3, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-0.25F, 0.0F, 4.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 2.2384F, 0.0F, 0.0F);
        this.armright3.cubeList.add(new ModelBox(armright3, 43, 53, 0.0F, -0.75F, -0.75F, 0, 3, 7, 0.0F, false));

        this.primariesright = new AdvancedModelRenderer(this);
        this.primariesright.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright3.addChild(primariesright);


        this.primaryright7 = new AdvancedModelRenderer(this);
        this.primaryright7.setRotationPoint(-0.1253F, 0.962F, 5.0792F);
        this.primariesright.addChild(primaryright7);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright7.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2182F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 0, 0.06F, -3.0F, -1.0F, 0, 3, 15, 0.0F, false));

        this.primaryright6 = new AdvancedModelRenderer(this);
        this.primaryright6.setRotationPoint(-0.1253F, 0.962F, 5.0792F);
        this.primariesright.addChild(primaryright6);
        this.setRotateAngle(primaryright6, 0.0349F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright6.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2182F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 6, 0.05F, -3.0F, -1.0F, 0, 3, 13, 0.0F, false));

        this.primaryright5 = new AdvancedModelRenderer(this);
        this.primaryright5.setRotationPoint(-0.1253F, 1.162F, 3.3792F);
        this.primariesright.addChild(primaryright5);
        this.setRotateAngle(primaryright5, 0.0436F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0253F, -0.162F, 1.1208F);
        this.primaryright5.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.2182F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 19, 0.04F, -3.0F, -1.0F, 0, 3, 12, 0.0F, false));

        this.primaryright4 = new AdvancedModelRenderer(this);
        this.primaryright4.setRotationPoint(-0.1253F, 0.662F, 3.3792F);
        this.primariesright.addChild(primaryright4);
        this.setRotateAngle(primaryright4, 0.0436F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 35, 0.03F, -3.0F, -1.0F, 0, 3, 10, 0.0F, false));

        this.primaryright3 = new AdvancedModelRenderer(this);
        this.primaryright3.setRotationPoint(-0.1253F, 1.162F, 4.4792F);
        this.primariesright.addChild(primaryright3);
        this.setRotateAngle(primaryright3, 0.0524F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright3.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.2182F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 45, 10, 0.02F, -3.0F, -1.0F, 0, 3, 9, 0.0F, false));

        this.primaryright2 = new AdvancedModelRenderer(this);
        this.primaryright2.setRotationPoint(-0.1253F, 1.162F, 3.7792F);
        this.primariesright.addChild(primaryright2);
        this.setRotateAngle(primaryright2, 0.1527F, 0.0F, 0.0F);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.2182F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 12, 47, 0.01F, -3.0F, -1.0F, 0, 3, 9, 0.0F, false));

        this.primaryright1 = new AdvancedModelRenderer(this);
        this.primaryright1.setRotationPoint(-0.1253F, 0.962F, 2.1792F);
        this.primariesright.addChild(primaryright1);
        this.setRotateAngle(primaryright1, 0.0393F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0253F, 0.038F, 0.9208F);
        this.primaryright1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.2182F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 43, 26, 0.0F, -3.0F, -1.0F, 0, 3, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.confuciusornis.render(f5);
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
        this.confuciusornis.offsetY = -2.30F;
        this.confuciusornis.offsetX = 0.1F;
        this.confuciusornis.rotateAngleY = (float)Math.toRadians(220);
        this.confuciusornis.rotateAngleX = (float)Math.toRadians(8);
        this.confuciusornis.rotateAngleZ = (float)Math.toRadians(-8);
        this.tertialsleft.rotateAngleZ = (float)Math.toRadians(-90);
        this.tertialsleft.rotateAngleX = (float)Math.toRadians(-30);
        this.tertialsright.rotateAngleZ = (float)Math.toRadians(90);
        this.tertialsright.rotateAngleX = (float)Math.toRadians(30);
        this.confuciusornis.scaleChildren = true;
        float scaler = 2.9F;
        this.confuciusornis.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.confuciusornis.render(f);
        //Reset rotations, positions and sizing:
        this.confuciusornis.setScale(1.0F, 1.0F, 1.0F);
        this.confuciusornis.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraEoconfuciusornis ee = (EntityPrehistoricFloraEoconfuciusornis) e;

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
        this.head.setScale(1,1,1);
//        this.feathers.setScale(1,1,1);
//        this.feathers2.setScale(1,1,1);
//        this.feathers3.setScale(1,1,1);
//        this.feathers4.setScale(1,1,1);
        EntityPrehistoricFloraEoconfuciusornis ee = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;

        if (ee.getIsFlying() || ee.getIsLaunching()) {

            this.tertialsleft.setScale((float)1,(float)1,(float)1);
            this.tertialsright.setScale((float)1,(float)1,(float)1);


        } else {
            this.tertialsleft.setScale((float)1,(float)0,(float)0);
            this.tertialsright.setScale((float)1,(float)0,(float)0);
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
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The display
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
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
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15 + (((tickAnim - 30) / 23) * (19-(33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 30) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 19 + (((tickAnim - 53) / 27) * (33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15-(19)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15 + (((tickAnim - 80) / 5) * (27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15-(33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 80) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15 + (((tickAnim - 85) / 23) * (19-(27.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 85) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 19 + (((tickAnim - 108) / 27) * (33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15-(19)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15 + (((tickAnim - 135) / 36) * (0-(33.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*15)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 18.75 + (((tickAnim - 30) / 23) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 18.75 + (((tickAnim - 53) / 27) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 18.75 + (((tickAnim - 80) / 5) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 18.75 + (((tickAnim - 85) / 23) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 18.75 + (((tickAnim - 108) / 27) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 18.75 + (((tickAnim - 135) / 36) * (0-(18.75)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.475-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = -1.475 + (((tickAnim - 30) / 23) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = -1.475 + (((tickAnim - 53) / 27) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = -1.475 + (((tickAnim - 80) / 5) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = -1.475 + (((tickAnim - 85) / 23) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = -1.475 + (((tickAnim - 108) / 27) * (-1.475-(-1.475)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = -1.475 + (((tickAnim - 135) / 36) * (0-(-1.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(xx);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(yy);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright, tailfeatherright.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright2, tailfeatherright2.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright2.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright3, tailfeatherright3.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright3.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright4, tailfeatherright4.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright4.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright5, tailfeatherright5.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright5.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright6, tailfeatherright6.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright6.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft, tailfeatherleft.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft2, tailfeatherleft2.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft2.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft3, tailfeatherleft3.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft3.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft4, tailfeatherleft4.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft4.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-300))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft5, tailfeatherleft5.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft5.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 80) / 5) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 85) / 23) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 108) / 27) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-350))*2)));
            zz = 0 + (((tickAnim - 135) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft6, tailfeatherleft6.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft6.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 5 + (((tickAnim - 30) / 23) * (-10-(5)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 30) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 53) / 27) * (5-(-10)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 5 + (((tickAnim - 80) / 5) * (5-(5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 5 + (((tickAnim - 85) / 23) * (-10-(5)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 85) / 23) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = -10 + (((tickAnim - 108) / 27) * (5-(-10)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 5 + (((tickAnim - 135) / 36) * (0-(5)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (20.875-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.50097-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 20.875 + (((tickAnim - 16) / 14) * (31.5-(20.875)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = -0.50097 + (((tickAnim - 16) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(-0.50097)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 31.5 + (((tickAnim - 30) / 23) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 31.5 + (((tickAnim - 53) / 27) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 31.5 + (((tickAnim - 80) / 5) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 31.5 + (((tickAnim - 85) / 23) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 31.5 + (((tickAnim - 108) / 27) * (31.5-(31.5)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 31.5 + (((tickAnim - 135) / 36) * (0-(31.5)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (50.88194-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-1.03375-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 50.88194 + (((tickAnim - 16) / 14) * (19.25-(50.88194)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = -1.03375 + (((tickAnim - 16) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(-1.03375)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 19.25 + (((tickAnim - 30) / 12) * (-12.61111-(19.25)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 30) / 12) * (1.45475-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -12.61111 + (((tickAnim - 42) / 11) * (7.75-(-12.61111)));
            yy = 0 + (((tickAnim - 42) / 11) * (0-(0)));
            zz = 1.45475 + (((tickAnim - 42) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(1.45475)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 7.75 + (((tickAnim - 53) / 12) * (46.81818-(7.75)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 53) / 12) * (-1.28558-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = 46.81818 + (((tickAnim - 65) / 15) * (27.25-(46.81818)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = -1.28558 + (((tickAnim - 65) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(-1.28558)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = 27.25 + (((tickAnim - 80) / 5) * (19.85-(27.25)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 80) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 85 && tickAnim < 98) {
            xx = 19.85 + (((tickAnim - 85) / 13) * (-15.37222-(19.85)));
            yy = 0 + (((tickAnim - 85) / 13) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 85) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 98 && tickAnim < 108) {
            xx = -15.37222 + (((tickAnim - 98) / 10) * (5.5-(-15.37222)));
            yy = 0 + (((tickAnim - 98) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 98) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = 5.5 + (((tickAnim - 108) / 27) * (45.5-(5.5)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 108) / 27) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = 45.5 + (((tickAnim - 135) / 36) * (0-(45.5)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2 + (((tickAnim - 135) / 36) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-55-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = -55 + (((tickAnim - 30) / 23) * (-55-(-55)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 30) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -55 + (((tickAnim - 53) / 27) * (-55-(-55)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 53) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else if (tickAnim >= 80 && tickAnim < 85) {
            xx = -55 + (((tickAnim - 80) / 5) * (-55-(-55)));
            yy = 0 + (((tickAnim - 80) / 5) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 80) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = -55 + (((tickAnim - 85) / 23) * (-55-(-55)));
            yy = 0 + (((tickAnim - 85) / 23) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 85) / 23) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else if (tickAnim >= 108 && tickAnim < 135) {
            xx = -55 + (((tickAnim - 108) / 27) * (-55-(-55)));
            yy = 0 + (((tickAnim - 108) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 108) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else if (tickAnim >= 135 && tickAnim < 171) {
            xx = -55 + (((tickAnim - 135) / 36) * (0-(-55)));
            yy = 0 + (((tickAnim - 135) / 36) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3 + (((tickAnim - 135) / 36) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-200))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
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

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
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
        this.setRotateAngle(confuciusornis, confuciusornis.rotateAngleX + (float) Math.toRadians(xx), confuciusornis.rotateAngleY + (float) Math.toRadians(yy), confuciusornis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.85-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.85 + (((tickAnim - 20) / 10) * (-4.85-(-4.85)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.85 + (((tickAnim - 30) / 20) * (0-(-4.85)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.confuciusornis.rotationPointX = this.confuciusornis.rotationPointX + (float)(xx);
        this.confuciusornis.rotationPointY = this.confuciusornis.rotationPointY - (float)(yy);
        this.confuciusornis.rotationPointZ = this.confuciusornis.rotationPointZ + (float)(zz);




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
            xx = 0 + (((tickAnim - 0) / 20) * (28.06823-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (27.85646-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-14.76874-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 28.06823 + (((tickAnim - 20) / 10) * (28.06823-(28.06823)));
            yy = 27.85646 + (((tickAnim - 20) / 10) * (27.85646-(27.85646)));
            zz = -14.76874 + (((tickAnim - 20) / 10) * (-14.76874-(-14.76874)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 28.06823 + (((tickAnim - 30) / 20) * (0-(28.06823)));
            yy = 27.85646 + (((tickAnim - 30) / 20) * (0-(27.85646)));
            zz = -14.76874 + (((tickAnim - 30) / 20) * (0-(-14.76874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -63.5 + (((tickAnim - 20) / 10) * (-63.5-(-63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -63.5 + (((tickAnim - 30) / 20) * (0-(-63.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (28.06823-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-27.85646-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (14.76874-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 28.06823 + (((tickAnim - 20) / 10) * (28.06823-(28.06823)));
            yy = -27.85646 + (((tickAnim - 20) / 10) * (-27.85646-(-27.85646)));
            zz = 14.76874 + (((tickAnim - 20) / 10) * (14.76874-(14.76874)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 28.06823 + (((tickAnim - 30) / 20) * (0-(28.06823)));
            yy = -27.85646 + (((tickAnim - 30) / 20) * (0-(-27.85646)));
            zz = 14.76874 + (((tickAnim - 30) / 20) * (0-(14.76874)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-63.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -63.5 + (((tickAnim - 20) / 10) * (-63.5-(-63.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -63.5 + (((tickAnim - 30) / 20) * (0-(-63.5)));
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
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
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
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(confuciusornis, confuciusornis.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-10), confuciusornis.rotateAngleY + (float) Math.toRadians(0), confuciusornis.rotateAngleZ + (float) Math.toRadians(0));
        this.confuciusornis.rotationPointX = this.confuciusornis.rotationPointX + (float)(0);
        this.confuciusornis.rotationPointY = this.confuciusornis.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*0.7);
        this.confuciusornis.rotationPointZ = this.confuciusornis.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-0.5);


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(31.75), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-13.75), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-23.25), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(31.75), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-13.75), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-23.25), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(34.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-190))*-8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-230))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-72.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*-10), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(-90.3264781502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), armright1.rotateAngleY + (float) Math.toRadians(-0.160928972+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*20), armright1.rotateAngleZ + (float) Math.toRadians(82.2463529651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*35));
        this.armright1.rotationPointX = this.armright1.rotationPointX + (float)(0);
        this.armright1.rotationPointY = this.armright1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-0.5);
        this.armright1.rotationPointZ = this.armright1.rotationPointZ + (float)(0);


        this.setRotateAngle(tertialsright, tertialsright.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*5), tertialsright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*10), tertialsright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*15));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(134+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*-5), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*15), armright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*25));


        this.setRotateAngle(secondariesright, secondariesright.rotateAngleX + (float) Math.toRadians(-30.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), secondariesright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10), secondariesright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*15));


        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(-121+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*20), armright3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), armright3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright7, primaryright7.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*20), primaryright7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), primaryright7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright6, primaryright6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-260))*20), primaryright6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), primaryright6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright5, primaryright5.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*20), primaryright5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), primaryright5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright4, primaryright4.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20), primaryright4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), primaryright4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright3, primaryright3.rotateAngleX + (float) Math.toRadians(48.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20), primaryright3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*25), primaryright3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20));


        this.setRotateAngle(primaryright2, primaryright2.rotateAngleX + (float) Math.toRadians(67.75), primaryright2.rotateAngleY + (float) Math.toRadians(0), primaryright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryright1, primaryright1.rotateAngleX + (float) Math.toRadians(79.5), primaryright1.rotateAngleY + (float) Math.toRadians(0), primaryright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(-90.3264781502+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*10), armleft1.rotateAngleY + (float) Math.toRadians(0.160928972+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-20), armleft1.rotateAngleZ + (float) Math.toRadians(-82.2463529651+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*-35));
        this.armleft1.rotationPointX = this.armleft1.rotationPointX + (float)(0);
        this.armleft1.rotationPointY = this.armleft1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-0.5);
        this.armleft1.rotationPointZ = this.armleft1.rotationPointZ + (float)(0);


        this.setRotateAngle(tertialsleft, tertialsleft.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*5), tertialsleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-10), tertialsleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*-15));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(134+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*5), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-15), armleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*-25));


        this.setRotateAngle(secondariesleft, secondariesleft.rotateAngleX + (float) Math.toRadians(-30.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), secondariesleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*10), secondariesleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*-15));


        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(-121+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*20), armleft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), armleft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft7, primaryleft7.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*20), primaryleft7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), primaryleft7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft6, primaryleft6.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-260))*20), primaryleft6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), primaryleft6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft5, primaryleft5.rotateAngleX + (float) Math.toRadians(10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-280))*20), primaryleft5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), primaryleft5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft4, primaryleft4.rotateAngleX + (float) Math.toRadians(24+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20), primaryleft4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), primaryleft4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft3, primaryleft3.rotateAngleX + (float) Math.toRadians(48.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*20), primaryleft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-25), primaryleft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-320))*-20));


        this.setRotateAngle(primaryleft2, primaryleft2.rotateAngleX + (float) Math.toRadians(67.75), primaryleft2.rotateAngleY + (float) Math.toRadians(0), primaryleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(primaryleft1, primaryleft1.rotateAngleX + (float) Math.toRadians(79.5), primaryleft1.rotateAngleY + (float) Math.toRadians(0), primaryleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-190))*15), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailfeatherright, tailfeatherright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-4), tailfeatherright.rotateAngleY + (float) Math.toRadians(0), tailfeatherright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailfeatherright2, tailfeatherright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-4), tailfeatherright2.rotateAngleY + (float) Math.toRadians(0), tailfeatherright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailfeatherleft, tailfeatherleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-4), tailfeatherleft.rotateAngleY + (float) Math.toRadians(0), tailfeatherleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailfeatherleft2, tailfeatherleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-4), tailfeatherleft2.rotateAngleY + (float) Math.toRadians(0), tailfeatherleft2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 0) / 20) * (15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 20) / 6) * (15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-5-(15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-5 + (((tickAnim - 26) / 4) * (25-(15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-5)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 25 + (((tickAnim - 30) / 6) * (25-(25)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 36) / 14) * (15.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(25)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(confuciusornis, confuciusornis.rotateAngleX + (float) Math.toRadians(xx), confuciusornis.rotateAngleY + (float) Math.toRadians(yy), confuciusornis.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7 + (((tickAnim - 20) / 6) * (0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 20) / 6) * (-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            yy = 0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*0.7 + (((tickAnim - 26) / 10) * (-4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-150))*-2-(0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*0.7)));
            zz = -0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 26) / 10) * (-3.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1.2-(-0.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = -4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-150))*-2 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-120))*0.7-(-4.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-150))*-2)));
            zz = -3.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1.2 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(-3.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.confuciusornis.rotationPointX = this.confuciusornis.rotationPointX + (float)(xx);
        this.confuciusornis.rotationPointY = this.confuciusornis.rotationPointY - (float)(yy);
        this.confuciusornis.rotationPointZ = this.confuciusornis.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 31.75 + (((tickAnim - 0) / 20) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 20) / 30) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -13.75 + (((tickAnim - 0) / 20) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 20) / 30) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 0) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 20) / 30) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 31.75 + (((tickAnim - 0) / 20) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 20) / 30) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -13.75 + (((tickAnim - 0) / 20) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 20) / 30) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 0) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 20) / 30) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4 + (((tickAnim - 0) / 20) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4 + (((tickAnim - 20) / 16) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4 + (((tickAnim - 36) / 14) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-4)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8 + (((tickAnim - 0) / 20) * (34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8-(34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8 + (((tickAnim - 20) / 10) * (35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8-(34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8 + (((tickAnim - 30) / 6) * (35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8-(35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8 + (((tickAnim - 36) / 14) * (34.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8-(35.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*-8)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8 + (((tickAnim - 0) / 20) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8 + (((tickAnim - 20) / 10) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8 + (((tickAnim - 30) / 6) * (21.7159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8)));
            yy = 0 + (((tickAnim - 30) / 6) * (0.12717-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0.32168-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 21.7159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8 + (((tickAnim - 36) / 14) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8-(21.7159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-230))*8)));
            yy = 0.12717 + (((tickAnim - 36) / 14) * (0-(0.12717)));
            zz = 0.32168 + (((tickAnim - 36) / 14) * (0-(0.32168)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10 + (((tickAnim - 0) / 20) * (-72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10-(-72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10 + (((tickAnim - 20) / 10) * (-73.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10-(-72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -73.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10 + (((tickAnim - 30) / 6) * (-92.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10-(-73.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -92.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10 + (((tickAnim - 36) / 14) * (-72.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10-(-92.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-10)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 20) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            yy = -0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20 + (((tickAnim - 0) / 20) * (-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20-(-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20)));
            zz = 82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35 + (((tickAnim - 0) / 20) * (82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35-(82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 20) / 10) * (0-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            yy = -0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20 + (((tickAnim - 20) / 10) * (0-(-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20)));
            zz = 82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35 + (((tickAnim - 20) / 10) * (0-(82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (-0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*20-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 20) / 16) * (0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0.25 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0.25)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright1.rotationPointX = this.armright1.rotationPointX + (float)(xx);
        this.armright1.rotationPointY = this.armright1.rotationPointY - (float)(yy);
        this.armright1.rotationPointZ = this.armright1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 0) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 20) / 10) * (-85.5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -85.5 + (((tickAnim - 30) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(-85.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tertialsright, tertialsright.rotateAngleX + (float) Math.toRadians(xx), tertialsright.rotateAngleY + (float) Math.toRadians(yy), tertialsright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 20) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 8) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 8) * (0-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 28) / 8) * (1-(1)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 36) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 36) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (1-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5 + (((tickAnim - 0) / 20) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5 + (((tickAnim - 20) / 10) * (0-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*15-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 0) / 20) * (-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = -30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 20) / 16) * (0-(-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 20) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15 + (((tickAnim - 20) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(secondariesright, secondariesright.rotateAngleX + (float) Math.toRadians(xx), secondariesright.rotateAngleY + (float) Math.toRadians(yy), secondariesright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 20) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 16) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 16) * (1-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 36) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 36) / 14) * (1-(0)));
            zz = 1 + (((tickAnim - 36) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20 + (((tickAnim - 0) / 20) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20 + (((tickAnim - 20) / 10) * (0-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20 + (((tickAnim - 0) / 20) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20 + (((tickAnim - 20) / 10) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright7, primaryright7.rotateAngleX + (float) Math.toRadians(xx), primaryright7.rotateAngleY + (float) Math.toRadians(yy), primaryright7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20 + (((tickAnim - 0) / 20) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20 + (((tickAnim - 20) / 10) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright6, primaryright6.rotateAngleX + (float) Math.toRadians(xx), primaryright6.rotateAngleY + (float) Math.toRadians(yy), primaryright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20 + (((tickAnim - 0) / 20) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20 + (((tickAnim - 20) / 10) * (0-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright5, primaryright5.rotateAngleX + (float) Math.toRadians(xx), primaryright5.rotateAngleY + (float) Math.toRadians(yy), primaryright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright4, primaryright4.rotateAngleX + (float) Math.toRadians(xx), primaryright4.rotateAngleY + (float) Math.toRadians(yy), primaryright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright3, primaryright3.rotateAngleX + (float) Math.toRadians(xx), primaryright3.rotateAngleY + (float) Math.toRadians(yy), primaryright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 67.75 + (((tickAnim - 0) / 20) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 67.75 + (((tickAnim - 20) / 10) * (0-(67.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (67.75-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright2, primaryright2.rotateAngleX + (float) Math.toRadians(xx), primaryright2.rotateAngleY + (float) Math.toRadians(yy), primaryright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 79.5 + (((tickAnim - 0) / 20) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 79.5 + (((tickAnim - 20) / 10) * (0-(79.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (79.5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryright1, primaryright1.rotateAngleX + (float) Math.toRadians(xx), primaryright1.rotateAngleY + (float) Math.toRadians(yy), primaryright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 0) / 20) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            yy = 0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20 + (((tickAnim - 0) / 20) * (0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20-(0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20)));
            zz = -82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35 + (((tickAnim - 0) / 20) * (-82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35-(-82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10 + (((tickAnim - 20) / 10) * (0-(-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10)));
            yy = 0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20 + (((tickAnim - 20) / 10) * (0-(0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20)));
            zz = -82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35 + (((tickAnim - 20) / 10) * (0-(-82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-90.3264781502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*10-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0.160928972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-20-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (-82.2463529651+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5 + (((tickAnim - 20) / 16) * (0.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0.25 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-0.5-(0.25)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft1.rotationPointX = this.armleft1.rotationPointX + (float)(xx);
        this.armleft1.rotationPointY = this.armleft1.rotationPointY - (float)(yy);
        this.armleft1.rotationPointZ = this.armleft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 0) / 20) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5 + (((tickAnim - 20) / 10) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*-10-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tertialsleft, tertialsleft.rotateAngleX + (float) Math.toRadians(xx), tertialsleft.rotateAngleY + (float) Math.toRadians(yy), tertialsleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 20) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 8) * (0.1-(1)));
            zz = 1 + (((tickAnim - 20) / 8) * (0.2-(1)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 28) / 8) * (1-(1)));
            yy = 0.1 + (((tickAnim - 28) / 8) * (0-(0.1)));
            zz = 0.2 + (((tickAnim - 28) / 8) * (0-(0.2)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 36) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 36) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (1-(0)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.tertialsleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5 + (((tickAnim - 0) / 20) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5 + (((tickAnim - 20) / 10) * (0-(134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (134+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-15-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 0) / 20) * (-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5 + (((tickAnim - 20) / 10) * (0-(-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-30.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*10-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*-15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(secondariesleft, secondariesleft.rotateAngleX + (float) Math.toRadians(xx), secondariesleft.rotateAngleY + (float) Math.toRadians(yy), secondariesleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 10) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 10) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 30) / 6) * (1-(1)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 1 + (((tickAnim - 30) / 6) * (1-(1)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 36) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 36) / 14) * (1-(0)));
            zz = 1 + (((tickAnim - 36) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.secondariesleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20 + (((tickAnim - 0) / 20) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20 + (((tickAnim - 20) / 10) * (0-(-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-121+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20 + (((tickAnim - 0) / 20) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20 + (((tickAnim - 20) / 10) * (0-(-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (-7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft7, primaryleft7.rotateAngleX + (float) Math.toRadians(xx), primaryleft7.rotateAngleY + (float) Math.toRadians(yy), primaryleft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20 + (((tickAnim - 0) / 20) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20 + (((tickAnim - 20) / 10) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-260))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft6, primaryleft6.rotateAngleX + (float) Math.toRadians(xx), primaryleft6.rotateAngleY + (float) Math.toRadians(yy), primaryleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20 + (((tickAnim - 0) / 20) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20 + (((tickAnim - 20) / 10) * (0-(10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (10.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-280))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft5, primaryleft5.rotateAngleX + (float) Math.toRadians(xx), primaryleft5.rotateAngleY + (float) Math.toRadians(yy), primaryleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (24+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft4, primaryleft4.rotateAngleX + (float) Math.toRadians(xx), primaryleft4.rotateAngleY + (float) Math.toRadians(yy), primaryleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 0) / 20) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20 + (((tickAnim - 20) / 10) * (0-(48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20 + (((tickAnim - 20) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (48.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*20-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-25-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-320))*-20-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft3, primaryleft3.rotateAngleX + (float) Math.toRadians(xx), primaryleft3.rotateAngleY + (float) Math.toRadians(yy), primaryleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 67.75 + (((tickAnim - 0) / 20) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 67.75 + (((tickAnim - 20) / 10) * (0-(67.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (67.75-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft2, primaryleft2.rotateAngleX + (float) Math.toRadians(xx), primaryleft2.rotateAngleY + (float) Math.toRadians(yy), primaryleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 79.5 + (((tickAnim - 0) / 20) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 79.5 + (((tickAnim - 20) / 10) * (0-(79.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (79.5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryleft1, primaryleft1.rotateAngleX + (float) Math.toRadians(xx), primaryleft1.rotateAngleY + (float) Math.toRadians(yy), primaryleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5 + (((tickAnim - 20) / 16) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-190))*5-(0)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4 + (((tickAnim - 20) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright, tailfeatherright.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4 + (((tickAnim - 20) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherright2, tailfeatherright2.rotateAngleX + (float) Math.toRadians(xx), tailfeatherright2.rotateAngleY + (float) Math.toRadians(yy), tailfeatherright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4 + (((tickAnim - 20) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-200))*-4)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft, tailfeatherleft.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4 + (((tickAnim - 20) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-250))*-4)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tailfeatherleft2, tailfeatherleft2.rotateAngleX + (float) Math.toRadians(xx), tailfeatherleft2.rotateAngleY + (float) Math.toRadians(yy), tailfeatherleft2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEoconfuciusornis entity = (EntityPrehistoricFloraEoconfuciusornis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(confuciusornis, confuciusornis.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), confuciusornis.rotateAngleY + (float) Math.toRadians(0), confuciusornis.rotateAngleZ + (float) Math.toRadians(0));
        this.confuciusornis.rotationPointX = this.confuciusornis.rotationPointX + (float)(0);
        this.confuciusornis.rotationPointY = this.confuciusornis.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-10))*-0.3);
        this.confuciusornis.rotationPointZ = this.confuciusornis.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-0.2);


        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*1.5), hip.rotateAngleY + (float) Math.toRadians(0), hip.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*-0.2);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*-3), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff3, headfluff3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-400))*-3), headfluff3.rotateAngleY + (float) Math.toRadians(0), headfluff3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff2, headfluff2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-430))*-3), headfluff2.rotateAngleY + (float) Math.toRadians(0), headfluff2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headfluff1, headfluff1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-3), headfluff1.rotateAngleY + (float) Math.toRadians(0), headfluff1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 23.5 + (((tickAnim - 0) / 10) * (-23.25-(23.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 10) / 10) * (23.5-(-23.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24 + (((tickAnim - 0) / 4) * (-49.33-(24)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -49.33 + (((tickAnim - 4) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -43.83 + (((tickAnim - 7) / 3) * (-3.25-(-43.83)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 10) / 10) * (24-(-3.25)));
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
            xx = -17 + (((tickAnim - 0) / 4) * (63.19-(-17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 63.19 + (((tickAnim - 4) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 76.69 + (((tickAnim - 7) / 3) * (28-(76.69)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28 + (((tickAnim - 10) / 3) * (-5.75-(28)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5.75 + (((tickAnim - 13) / 4) * (-5.87-(-5.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5.87 + (((tickAnim - 17) / 3) * (-17-(-5.87)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (1.64-(0.125)));
            zz = 0.275 + (((tickAnim - 0) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.64 + (((tickAnim - 3) / 4) * (0-(1.64)));
            zz = 0.11 + (((tickAnim - 3) / 4) * (0-(0.11)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.775-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 10) / 3) * (1.3-(0.775)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 13) / 4) * (0.475-(1.3)));
            zz = 0.09 + (((tickAnim - 13) / 4) * (0.18-(0.09)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 17) / 3) * (0.125-(0.475)));
            zz = 0.18 + (((tickAnim - 17) / 3) * (0.275-(0.18)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -23.25 + (((tickAnim - 0) / 10) * (23.5-(-23.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 23.5 + (((tickAnim - 10) / 10) * (-23.25-(23.5)));
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
            xx = -3.25 + (((tickAnim - 0) / 10) * (24-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 24 + (((tickAnim - 10) / 4) * (-49.33-(24)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -49.33 + (((tickAnim - 14) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -43.83 + (((tickAnim - 17) / 3) * (-3.25-(-43.83)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28 + (((tickAnim - 0) / 3) * (-5.75-(28)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -5.75 + (((tickAnim - 3) / 4) * (-5.87-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -5.87 + (((tickAnim - 7) / 3) * (-17-(-5.87)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -17 + (((tickAnim - 10) / 4) * (63.19-(-17)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 63.19 + (((tickAnim - 14) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 76.69 + (((tickAnim - 17) / 3) * (28-(76.69)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 3) * (1.3-(0.775)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 3) / 4) * (0.475-(1.3)));
            zz = 0.09 + (((tickAnim - 3) / 4) * (0.18-(0.09)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.475 + (((tickAnim - 7) / 3) * (0.125-(0.475)));
            zz = 0.18 + (((tickAnim - 7) / 3) * (0.275-(0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 10) / 3) * (1.64-(0.125)));
            zz = 0.275 + (((tickAnim - 10) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.64 + (((tickAnim - 13) / 4) * (0-(1.64)));
            zz = 0.11 + (((tickAnim - 13) / 4) * (0-(0.11)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0.775-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tailfeatherright, tailfeatherright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*2), tailfeatherright.rotateAngleY + (float) Math.toRadians(0), tailfeatherright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailfeatherleft, tailfeatherleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*2), tailfeatherleft.rotateAngleY + (float) Math.toRadians(0), tailfeatherleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(0), armright1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*1.5), armright1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(0), armleft1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*-1.5), armleft1.rotateAngleZ + (float) Math.toRadians(0));


        this.tertialsright.setScale((float)1,(float)0,(float)1);


        this.tertialsleft.setScale((float)1,(float)0,(float)1);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
