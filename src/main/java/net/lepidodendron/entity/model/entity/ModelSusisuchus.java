package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSusisuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSusisuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer throat;

    private ModelAnimator animator;

    public ModelSusisuchus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 22.75F, 3.925F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.425F, -1.125F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 26, -1.5F, -2.0F, -3.0F, 3, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -1.5F, -2.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.5F, 0.425F, -0.625F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, -0.0436F, 0.6545F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 8, 40, -0.25F, -1.0F, -2.75F, 1, 1, 3, 0.02F, false));
        this.legright.cubeList.add(new ModelBox(legright, 40, 23, -0.25F, -0.5F, -2.75F, 1, 1, 3, 0.01F, false));
        this.legright.cubeList.add(new ModelBox(legright, 36, 40, 0.25F, -1.0F, -2.75F, 1, 1, 3, 0.0F, false));
        this.legright.cubeList.add(new ModelBox(legright, 40, 27, 0.25F, -0.5F, -2.75F, 1, 1, 3, -0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.5F, -1.0F, -2.75F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.6545F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 44, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 44, 0, -0.5F, 0.0F, -2.5F, 1, 1, 1, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 0.575F, -2.5F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.6109F, -0.2182F, 0.1484F);
        this.legright3.cubeList.add(new ModelBox(legright3, 42, 15, -1.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.5F, 0.425F, -0.625F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, -0.0436F, -0.6545F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 8, 40, -0.75F, -1.0F, -2.75F, 1, 1, 3, 0.02F, true));
        this.legleft.cubeList.add(new ModelBox(legleft, 40, 23, -0.75F, -0.5F, -2.75F, 1, 1, 3, 0.01F, true));
        this.legleft.cubeList.add(new ModelBox(legleft, 36, 40, -1.25F, -1.0F, -2.75F, 1, 1, 3, 0.0F, true));
        this.legleft.cubeList.add(new ModelBox(legleft, 40, 27, -1.25F, -0.5F, -2.75F, 1, 1, 3, -0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(-0.5F, -1.0F, -2.75F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.6545F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 44, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 44, 0, -0.5F, 0.0F, -2.5F, 1, 1, 1, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 0.575F, -2.5F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.6109F, 0.2182F, -0.1484F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 42, 15, -1.0F, 0.0F, -2.0F, 2, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.325F, -0.125F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 9, -1.0F, -1.0F, -0.5F, 2, 2, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 0, -0.5F, -1.25F, -0.5F, 0, 1, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 20, 0, 0.5F, -1.25F, -0.5F, 0, 1, 7, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0698F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -0.75F, 0.0F, -0.5F, 1, 1, 7, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 18, -0.25F, 0.0F, -0.5F, 1, 1, 7, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -0.175F, 1.0F);
        this.tail2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -0.25F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -1.25F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.tail2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0262F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 18, -0.25F, -1.0F, -1.0F, 1, 1, 7, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 18, -0.75F, -1.0F, -1.0F, 1, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 18, 9, -0.5F, 0.0F, -0.5F, 1, 1, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 8, 38, 0.0F, 0.0F, 6.5F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.575F, 0.5F);
        this.tail3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 35, -0.5F, -1.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.05F, 1.15F);
        this.tail3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 31, 0.0F, -1.0F, -1.0F, 0, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.575F, -3.375F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.5F, -5.75F, 4, 3, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 17, -1.5F, -1.75F, -5.0F, 0, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 17, 1.5F, -1.75F, -5.0F, 0, 1, 5, 0.0F, true));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -5.75F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.85F, -1.425F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 31, -1.5F, -2.0F, -1.0F, 3, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.4F, -1.75F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 26, -1.5F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.5F, 0.8F, -1.275F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.3054F, -0.4363F);
        this.armright.cubeList.add(new ModelBox(armright, 34, 15, -2.0F, -0.5F, -0.75F, 3, 1, 1, 0.01F, false));
        this.armright.cubeList.add(new ModelBox(armright, 0, 42, -2.0F, -0.5F, -0.25F, 3, 1, 1, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.625F, 0.0F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.3491F, -1.4399F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 20, 35, -1.75F, -0.5F, -0.5F, 2, 1, 1, -0.01F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-1.75F, 0.075F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.0436F, -0.2618F, 0.2182F);
        this.armright3.cubeList.add(new ModelBox(armright3, 18, 17, -0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.5F, 0.8F, -1.275F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0F, -0.3054F, 0.4363F);
        this.armleft.cubeList.add(new ModelBox(armleft, 34, 15, -1.0F, -0.5F, -0.75F, 3, 1, 1, 0.01F, true));
        this.armleft.cubeList.add(new ModelBox(armleft, 0, 42, -1.0F, -0.5F, -0.25F, 3, 1, 1, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.625F, 0.0F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.3491F, 1.4399F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 20, 35, -0.25F, -0.5F, -0.5F, 2, 1, 1, -0.01F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(1.75F, 0.075F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.0436F, 0.2618F, -0.2182F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 18, 17, -0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.6F, -2.125F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 0, -1.0F, -0.5F, -2.925F, 2, 2, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 35, -1.275F, -0.5F, -2.925F, 1, 2, 3, -0.02F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 35, 0.275F, -0.5F, -2.925F, 1, 2, 3, -0.02F, true));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 1.5F, -2.925F);
        this.neck.addChild(throat2);
        this.setRotateAngle(throat2, -0.096F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 36, 31, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.45F, -2.925F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 34, 5, -0.5F, -0.9F, -5.425F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.05F, -0.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 41, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 23, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.775F, 0.1F, -4.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 37, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.1F, -1.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, 0.1484F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 17, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.02F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.1F, -5.45F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2793F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 32, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.775F, 0.1F, -4.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.0873F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 37, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.1F, -5.45F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2793F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 32, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.1F, -1.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, -0.1484F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 17, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.02F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.225F, -0.9F, -1.175F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.0436F, 0.288F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 32, 41, -0.6F, -0.3F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.225F, -0.9F, -1.175F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.0436F, -0.288F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 32, 41, -0.4F, -0.3F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.125F, 0.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 41, -1.0F, -0.4F, -2.0F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 10, -0.5F, -0.4F, -5.85F, 1, 1, 4, -0.015F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.6F, -5.875F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.2793F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 43, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.025F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.775F, 0.6F, -4.95F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0785F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 37, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.02F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.6F, -2.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.1265F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 20, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.6F, -5.875F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.2793F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 43, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.025F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.775F, 0.6F, -4.95F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.0785F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 37, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.6F, -2.0F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1265F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 20, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.6F, -2.85F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.1222F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 0, 38, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.0F;
        this.hips.offsetX = -0.038F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(18);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 2.33F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

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
        this.hips.offsetY = 0.0F;

        EntityPrehistoricFloraSusisuchus proteros = (EntityPrehistoricFloraSusisuchus) e;

//        this.faceTarget(f3, f4, 10, neck1);
//        this.faceTarget(f3, f4, 10, neck2);
//        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eyeleft.setScale(1,1,1);
        this.eyeright.setScale(1,1,1);
        EntityPrehistoricFloraSusisuchus ee = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.BASK_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }  else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13.3125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.0625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -13.3125 + (((tickAnim - 3) / 4) * (-4.3386-(-13.3125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.2048-(0)));
            zz = -1.0625 + (((tickAnim - 3) / 4) * (-5.8262-(-1.0625)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -4.3386 + (((tickAnim - 7) / 3) * (-6.75-(-4.3386)));
            yy = 0.2048 + (((tickAnim - 7) / 3) * (0-(0.2048)));
            zz = -5.8262 + (((tickAnim - 7) / 3) * (-4.25-(-5.8262)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.75 + (((tickAnim - 10) / 3) * (-9.4063-(-6.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 3) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -9.4063 + (((tickAnim - 13) / 5) * (-8.4063-(-9.4063)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 13) / 5) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -8.4063 + (((tickAnim - 18) / 4) * (-13.3125-(-8.4063)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 18) / 4) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -13.3125 + (((tickAnim - 22) / 3) * (0-(-13.3125)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 22) / 3) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.0625-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 35.25 + (((tickAnim - 3) / 4) * (4.9689-(35.25)));
            yy = 0 + (((tickAnim - 3) / 4) * (-0.5076-(0)));
            zz = -3.0625 + (((tickAnim - 3) / 4) * (-13.6432-(-3.0625)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (32.5-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (0-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-12.25-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 32.5 + (((tickAnim - 10) / 3) * (-12.7269-(32.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.772-(0)));
            zz = -12.25 + (((tickAnim - 10) / 3) * (3.4139-(-12.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -12.7269 + (((tickAnim - 13) / 2) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 13) / 2) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 13) / 2) * (0-(3.4139)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1.5 + (((tickAnim - 15) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 18) / 2) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.772-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (3.4139-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -12.7269 + (((tickAnim - 20) / 3) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 20) / 3) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 20) / 3) * (0-(3.4139)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 23) / 2) * (0-(7.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (25.5-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 25.5 + (((tickAnim - 7) / 3) * (0-(25.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 13) / 2) * (0-(22.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (22.5-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 20) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 8) * (0-(36.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 7) / 2) * (-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-37.075-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 50 + (((tickAnim - 7) / 2) * (0-(50)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (4.25-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 4.25 + (((tickAnim - 9) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0.575 + (((tickAnim - 7) / 2) * (0-(0.575)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.7884-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7.4586-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-6.0514-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.7884 + (((tickAnim - 15) / 17) * (0-(-0.7884)));
            yy = 7.4586 + (((tickAnim - 15) / 17) * (-3.75-(7.4586)));
            zz = -6.0514 + (((tickAnim - 15) / 17) * (0-(-6.0514)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -3.75 + (((tickAnim - 32) / 18) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.8313-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.7211-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.0853-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.8313 + (((tickAnim - 15) / 17) * (0-(-0.8313)));
            yy = -11.7211 + (((tickAnim - 15) / 17) * (6.5-(-11.7211)));
            zz = 4.0853 + (((tickAnim - 15) / 17) * (0-(4.0853)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 6.5 + (((tickAnim - 32) / 18) * (0-(6.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (-3.5-(0)));
            zz = 1.75 + (((tickAnim - 15) / 17) * (0-(1.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -3.5 + (((tickAnim - 32) / 18) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -9.5 + (((tickAnim - 15) / 17) * (-9.5-(-9.5)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = -9.5 + (((tickAnim - 32) / 18) * (0-(-9.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -3.25 + (((tickAnim - 15) / 17) * (0-(-3.25)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.5213-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.3754-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.7615-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -0.5213 + (((tickAnim - 15) / 17) * (0-(-0.5213)));
            yy = -5.3754 + (((tickAnim - 15) / 17) * (3.5-(-5.3754)));
            zz = 5.7615 + (((tickAnim - 15) / 17) * (0-(5.7615)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 3.5 + (((tickAnim - 32) / 18) * (0-(3.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (0-(0)));
            yy = -5.75 + (((tickAnim - 15) / 17) * (5.5-(-5.75)));
            zz = 0 + (((tickAnim - 15) / 17) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            yy = 5.5 + (((tickAnim - 32) / 18) * (0-(5.5)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.6793-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-13.1318-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.0691-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = -4.6793 + (((tickAnim - 15) / 17) * (0-(-4.6793)));
            yy = -13.1318 + (((tickAnim - 15) / 17) * (0-(-13.1318)));
            zz = 2.0691 + (((tickAnim - 15) / 17) * (0-(2.0691)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.1272-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.2376-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-41.8612-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 20.1272 + (((tickAnim - 15) / 17) * (121.4901-(20.1272)));
            yy = 6.2376 + (((tickAnim - 15) / 17) * (21.6583-(6.2376)));
            zz = -41.8612 + (((tickAnim - 15) / 17) * (-86.6409-(-41.8612)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 121.4901 + (((tickAnim - 32) / 9) * (48.591-(121.4901)));
            yy = 21.6583 + (((tickAnim - 32) / 9) * (-1.4885-(21.6583)));
            zz = -86.6409 + (((tickAnim - 32) / 9) * (-78.4664-(-86.6409)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 48.591 + (((tickAnim - 41) / 9) * (0-(48.591)));
            yy = -1.4885 + (((tickAnim - 41) / 9) * (0-(-1.4885)));
            zz = -78.4664 + (((tickAnim - 41) / 9) * (0-(-78.4664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (-0.55-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.55 + (((tickAnim - 32) / 18) * (0-(-0.55)));
            yy = 0.825 + (((tickAnim - 32) / 18) * (0-(0.825)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 15) / 17) * (39.9471-(0)));
            yy = 0 + (((tickAnim - 15) / 17) * (-2.2506-(0)));
            zz = 0 + (((tickAnim - 15) / 17) * (-10.0023-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 39.9471 + (((tickAnim - 32) / 18) * (0-(39.9471)));
            yy = -2.2506 + (((tickAnim - 32) / 18) * (0-(-2.2506)));
            zz = -10.0023 + (((tickAnim - 32) / 18) * (0-(-10.0023)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 32) / 9) * (-30.2963-(0)));
            yy = 0 + (((tickAnim - 32) / 9) * (29.6629-(0)));
            zz = 0 + (((tickAnim - 32) / 9) * (13.0183-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -30.2963 + (((tickAnim - 41) / 4) * (-11.3431-(-30.2963)));
            yy = 29.6629 + (((tickAnim - 41) / 4) * (25.2507-(29.6629)));
            zz = 13.0183 + (((tickAnim - 41) / 4) * (16.5168-(13.0183)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -11.3431 + (((tickAnim - 45) / 5) * (0-(-11.3431)));
            yy = 25.2507 + (((tickAnim - 45) / 5) * (0-(25.2507)));
            zz = 16.5168 + (((tickAnim - 45) / 5) * (0-(16.5168)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 13) * (0.425-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0.425 + (((tickAnim - 45) / 3) * (0.39-(0.425)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0.39 + (((tickAnim - 48) / 2) * (0-(0.39)));
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
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 600;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.125-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            yy = -0.4 + (((tickAnim - 35) / 540) * (-0.4-(-0.4)));
            zz = 0.125 + (((tickAnim - 35) / 540) * (0.125-(0.125)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            yy = -0.4 + (((tickAnim - 575) / 25) * (0-(-0.4)));
            zz = 0.125 + (((tickAnim - 575) / 25) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 8 + (((tickAnim - 35) / 540) * (8-(8)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 8 + (((tickAnim - 575) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 3.25 + (((tickAnim - 18) / 17) * (1-(3.25)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 89) {
            xx = 1 + (((tickAnim - 35) / 54) * (1-(1)));
            yy = 0 + (((tickAnim - 35) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 54) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 89) / 1) * (1-(1)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 90) / 30) * (-4-(1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 452) {
            xx = -4 + (((tickAnim - 120) / 332) * (-4-(-4)));
            yy = 0 + (((tickAnim - 120) / 332) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 332) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = -4 + (((tickAnim - 452) / 1) * (-1.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(-4)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 543) {
            xx = -1.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 453) / 90) * (1-(-1.725-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 453) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 90) * (0-(0)));
        }
        else if (tickAnim >= 543 && tickAnim < 575) {
            xx = 1 + (((tickAnim - 543) / 32) * (1-(1)));
            yy = 0 + (((tickAnim - 543) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 543) / 32) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 1 + (((tickAnim - 575) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 18) / 17) * (-0.5-(4.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 89) {
            xx = -0.5 + (((tickAnim - 35) / 54) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 35) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 54) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = -0.5 + (((tickAnim - 89) / 1) * (-29.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30-(-0.5)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -29.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30 + (((tickAnim - 90) / 30) * (-15.25-(-29.4-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*30)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 452) {
            xx = -15.25 + (((tickAnim - 120) / 332) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 120) / 332) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 332) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 453) {
            xx = -15.25 + (((tickAnim - 452) / 1) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 452) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 1) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 543) {
            xx = -15.25 + (((tickAnim - 453) / 90) * (-0.5-(-15.25)));
            yy = 0 + (((tickAnim - 453) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 453) / 90) * (0-(0)));
        }
        else if (tickAnim >= 543 && tickAnim < 575) {
            xx = -0.5 + (((tickAnim - 543) / 32) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 543) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 543) / 32) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -0.5 + (((tickAnim - 575) / 25) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 1 + (((tickAnim - 0) / 103) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 103) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 103) * (1-(1)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 103) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 103) / 17) * (0.0625-(1)));
            zz = 1 + (((tickAnim - 103) / 17) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 260) {
            xx = 1 + (((tickAnim - 120) / 140) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 120) / 140) * (0.0625-(0.0625)));
            zz = 1 + (((tickAnim - 120) / 140) * (1-(1)));
        }
        else if (tickAnim >= 260 && tickAnim < 285) {
            xx = 1 + (((tickAnim - 260) / 25) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 260) / 25) * (1-(0.0625)));
            zz = 1 + (((tickAnim - 260) / 25) * (1-(1)));
        }
        else if (tickAnim >= 285 && tickAnim < 310) {
            xx = 1 + (((tickAnim - 285) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 285) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 285) / 25) * (1-(1)));
        }
        else if (tickAnim >= 310 && tickAnim < 340) {
            xx = 1 + (((tickAnim - 310) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 310) / 30) * (0.0625-(1)));
            zz = 1 + (((tickAnim - 310) / 30) * (1-(1)));
        }
        else if (tickAnim >= 340 && tickAnim < 452) {
            xx = 1 + (((tickAnim - 340) / 112) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 340) / 112) * (0.0625-(0.0625)));
            zz = 1 + (((tickAnim - 340) / 112) * (1-(1)));
        }
        else if (tickAnim >= 452 && tickAnim < 476) {
            xx = 1 + (((tickAnim - 452) / 24) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 452) / 24) * (1-(0.0625)));
            zz = 1 + (((tickAnim - 452) / 24) * (1-(1)));
        }
        else if (tickAnim >= 476 && tickAnim < 600) {
            xx = 1 + (((tickAnim - 476) / 124) * (1-(1)));
            yy = 1 + (((tickAnim - 476) / 124) * (1-(1)));
            zz = 1 + (((tickAnim - 476) / 124) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 0) / 89) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 89) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 89) / 1) * (29.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-30-(0)));
            yy = 0 + (((tickAnim - 89) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 1) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 29.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-30 + (((tickAnim - 90) / 30) * (23.25-(29.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+30))*-30)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 452) {
            xx = 23.25 + (((tickAnim - 120) / 332) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 120) / 332) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 332) * (0-(0)));
        }
        else if (tickAnim >= 452 && tickAnim < 493) {
            xx = 23.25 + (((tickAnim - 452) / 41) * (0-(23.25)));
            yy = 0 + (((tickAnim - 452) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 452) / 41) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 493) / 107) * (0-(0)));
            yy = 0 + (((tickAnim - 493) / 107) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 107) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (57.9003-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (24.0133-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (43.9188-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 57.9003 + (((tickAnim - 18) / 17) * (69.1297-(57.9003)));
            yy = 24.0133 + (((tickAnim - 18) / 17) * (36.2946-(24.0133)));
            zz = 43.9188 + (((tickAnim - 18) / 17) * (42.1288-(43.9188)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 69.1297 + (((tickAnim - 35) / 540) * (69.1297-(69.1297)));
            yy = 36.2946 + (((tickAnim - 35) / 540) * (36.2946-(36.2946)));
            zz = 42.1288 + (((tickAnim - 35) / 540) * (42.1288-(42.1288)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 69.1297 + (((tickAnim - 575) / 25) * (0-(69.1297)));
            yy = 36.2946 + (((tickAnim - 575) / 25) * (0-(36.2946)));
            zz = 42.1288 + (((tickAnim - 575) / 25) * (0-(42.1288)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-56.1373-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (14.463-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (59.2405-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -56.1373 + (((tickAnim - 35) / 540) * (-56.1373-(-56.1373)));
            yy = 14.463 + (((tickAnim - 35) / 540) * (14.463-(14.463)));
            zz = 59.2405 + (((tickAnim - 35) / 540) * (59.2405-(59.2405)));
        }
        else if (tickAnim >= 575 && tickAnim < 591) {
            xx = -56.1373 + (((tickAnim - 575) / 16) * (-67.2245-(-56.1373)));
            yy = 14.463 + (((tickAnim - 575) / 16) * (12.9519-(14.463)));
            zz = 59.2405 + (((tickAnim - 575) / 16) * (70.2951-(59.2405)));
        }
        else if (tickAnim >= 591 && tickAnim < 596) {
            xx = -67.2245 + (((tickAnim - 591) / 5) * (-46.6839-(-67.2245)));
            yy = 12.9519 + (((tickAnim - 591) / 5) * (7.2583-(12.9519)));
            zz = 70.2951 + (((tickAnim - 591) / 5) * (48.5704-(70.2951)));
        }
        else if (tickAnim >= 596 && tickAnim < 600) {
            xx = -46.6839 + (((tickAnim - 596) / 4) * (0-(-46.6839)));
            yy = 7.2583 + (((tickAnim - 596) / 4) * (0-(7.2583)));
            zz = 48.5704 + (((tickAnim - 596) / 4) * (0-(48.5704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.621-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.7817-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (41.9012-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -20.621 + (((tickAnim - 10) / 25) * (-46.3408-(-20.621)));
            yy = 2.7817 + (((tickAnim - 10) / 25) * (-14.0515-(2.7817)));
            zz = 41.9012 + (((tickAnim - 10) / 25) * (52.4983-(41.9012)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -46.3408 + (((tickAnim - 35) / 540) * (-46.3408-(-46.3408)));
            yy = -14.0515 + (((tickAnim - 35) / 540) * (-14.0515-(-14.0515)));
            zz = 52.4983 + (((tickAnim - 35) / 540) * (52.4983-(52.4983)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -46.3408 + (((tickAnim - 575) / 25) * (0-(-46.3408)));
            yy = -14.0515 + (((tickAnim - 575) / 25) * (0-(-14.0515)));
            zz = 52.4983 + (((tickAnim - 575) / 25) * (0-(52.4983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -21.25 + (((tickAnim - 35) / 540) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -21.25 + (((tickAnim - 575) / 25) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 28.75 + (((tickAnim - 35) / 540) * (28.75-(28.75)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 28.75 + (((tickAnim - 575) / 25) * (0-(28.75)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 1 + (((tickAnim - 0) / 103) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 103) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 103) * (1-(1)));
        }
        else if (tickAnim >= 103 && tickAnim < 120) {
            xx = 1 + (((tickAnim - 103) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 103) / 17) * (0.0625-(1)));
            zz = 1 + (((tickAnim - 103) / 17) * (1-(1)));
        }
        else if (tickAnim >= 120 && tickAnim < 260) {
            xx = 1 + (((tickAnim - 120) / 140) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 120) / 140) * (0.0625-(0.0625)));
            zz = 1 + (((tickAnim - 120) / 140) * (1-(1)));
        }
        else if (tickAnim >= 260 && tickAnim < 285) {
            xx = 1 + (((tickAnim - 260) / 25) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 260) / 25) * (1-(0.0625)));
            zz = 1 + (((tickAnim - 260) / 25) * (1-(1)));
        }
        else if (tickAnim >= 285 && tickAnim < 310) {
            xx = 1 + (((tickAnim - 285) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 285) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 285) / 25) * (1-(1)));
        }
        else if (tickAnim >= 310 && tickAnim < 340) {
            xx = 1 + (((tickAnim - 310) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 310) / 30) * (0.0625-(1)));
            zz = 1 + (((tickAnim - 310) / 30) * (1-(1)));
        }
        else if (tickAnim >= 340 && tickAnim < 452) {
            xx = 1 + (((tickAnim - 340) / 112) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 340) / 112) * (0.0625-(0.0625)));
            zz = 1 + (((tickAnim - 340) / 112) * (1-(1)));
        }
        else if (tickAnim >= 452 && tickAnim < 476) {
            xx = 1 + (((tickAnim - 452) / 24) * (1-(1)));
            yy = 0.0625 + (((tickAnim - 452) / 24) * (1-(0.0625)));
            zz = 1 + (((tickAnim - 452) / 24) * (1-(1)));
        }
        else if (tickAnim >= 476 && tickAnim < 600) {
            xx = 1 + (((tickAnim - 476) / 124) * (1-(1)));
            yy = 1 + (((tickAnim - 476) / 124) * (1-(1)));
            zz = 1 + (((tickAnim - 476) / 124) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (57.9003-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-24.0133-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-43.9188-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 57.9003 + (((tickAnim - 18) / 17) * (69.1297-(57.9003)));
            yy = -24.0133 + (((tickAnim - 18) / 17) * (-36.2946-(-24.0133)));
            zz = -43.9188 + (((tickAnim - 18) / 17) * (-42.1288-(-43.9188)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 69.1297 + (((tickAnim - 35) / 540) * (69.1297-(69.1297)));
            yy = -36.2946 + (((tickAnim - 35) / 540) * (-36.2946-(-36.2946)));
            zz = -42.1288 + (((tickAnim - 35) / 540) * (-42.1288-(-42.1288)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 69.1297 + (((tickAnim - 575) / 25) * (0-(69.1297)));
            yy = -36.2946 + (((tickAnim - 575) / 25) * (0-(-36.2946)));
            zz = -42.1288 + (((tickAnim - 575) / 25) * (0-(-42.1288)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-56.1373-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-14.463-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-59.2405-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -56.1373 + (((tickAnim - 35) / 540) * (-56.1373-(-56.1373)));
            yy = -14.463 + (((tickAnim - 35) / 540) * (-14.463-(-14.463)));
            zz = -59.2405 + (((tickAnim - 35) / 540) * (-59.2405-(-59.2405)));
        }
        else if (tickAnim >= 575 && tickAnim < 591) {
            xx = -56.1373 + (((tickAnim - 575) / 16) * (-62.7681-(-56.1373)));
            yy = -14.463 + (((tickAnim - 575) / 16) * (-11.3596-(-14.463)));
            zz = -59.2405 + (((tickAnim - 575) / 16) * (-65.5642-(-59.2405)));
        }
        else if (tickAnim >= 591 && tickAnim < 596) {
            xx = -62.7681 + (((tickAnim - 591) / 5) * (-42.9994-(-62.7681)));
            yy = -11.3596 + (((tickAnim - 591) / 5) * (-6.1223-(-11.3596)));
            zz = -65.5642 + (((tickAnim - 591) / 5) * (-44.6547-(-65.5642)));
        }
        else if (tickAnim >= 596 && tickAnim < 600) {
            xx = -42.9994 + (((tickAnim - 596) / 4) * (0-(-42.9994)));
            yy = -6.1223 + (((tickAnim - 596) / 4) * (0-(-6.1223)));
            zz = -44.6547 + (((tickAnim - 596) / 4) * (0-(-44.6547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20.621-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.7817-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-41.9012-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = -20.621 + (((tickAnim - 10) / 25) * (-46.3408-(-20.621)));
            yy = -2.7817 + (((tickAnim - 10) / 25) * (14.0515-(-2.7817)));
            zz = -41.9012 + (((tickAnim - 10) / 25) * (-52.4983-(-41.9012)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -46.3408 + (((tickAnim - 35) / 540) * (-46.3408-(-46.3408)));
            yy = 14.0515 + (((tickAnim - 35) / 540) * (14.0515-(14.0515)));
            zz = -52.4983 + (((tickAnim - 35) / 540) * (-52.4983-(-52.4983)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -46.3408 + (((tickAnim - 575) / 25) * (0-(-46.3408)));
            yy = 14.0515 + (((tickAnim - 575) / 25) * (0-(14.0515)));
            zz = -52.4983 + (((tickAnim - 575) / 25) * (0-(-52.4983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = -22.25 + (((tickAnim - 35) / 540) * (-22.25-(-22.25)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = -22.25 + (((tickAnim - 575) / 25) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 575) {
            xx = 29.75 + (((tickAnim - 35) / 540) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 35) / 540) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 540) * (0-(0)));
        }
        else if (tickAnim >= 575 && tickAnim < 600) {
            xx = 29.75 + (((tickAnim - 575) / 25) * (0-(29.75)));
            yy = 0 + (((tickAnim - 575) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 575) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*10 + (((tickAnim - 0) / 55) * (-20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*10)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20 + (((tickAnim - 55) / 25) * (0-(-20.775-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-20)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 55) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 0) / 55) * (-22.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 0) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 55) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -22.5 + (((tickAnim - 55) / 25) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 15) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 35) / 20) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 35) / 20) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 35) / 20) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 55) / 25) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 55) / 25) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 55) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 0) / 35) * (25.375-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 25.375 + (((tickAnim - 35) / 20) * (34.75-(25.375)));
            yy = 0 + (((tickAnim - 35) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 20) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 34.75 + (((tickAnim - 55) / 25) * (0-(34.75)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 20) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 20) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 15) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 20) / 15) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 35) / 20) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 35) / 20) * (0.0325-(0.0325)));
            zz = 1 + (((tickAnim - 35) / 20) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 55) / 25) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 55) / 25) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 55) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 51;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20 + (((tickAnim - 0) / 21) * (16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*20)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 52) {
            xx = 16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40 + (((tickAnim - 21) / 31) * (0-(16.7-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*40)));
            yy = 0 + (((tickAnim - 21) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 30) * (-0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 52) {
            xx = -0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20 + (((tickAnim - 30) / 22) * (0-(-0.85-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*20)));
            yy = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 52) {
            xx = 25.25 + (((tickAnim - 22) / 30) * (0-(25.25)));
            yy = 0 + (((tickAnim - 22) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.75 + (((tickAnim - 22) / 5) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02-(0)));
            zz = 0 + (((tickAnim - 16) / 1) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 17) / 9) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02 + (((tickAnim - 17) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02)));
            zz = 0 + (((tickAnim - 17) / 9) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02 + (((tickAnim - 26) / 1) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000/0.5))*0.02)));
            zz = 0 + (((tickAnim - 26) / 1) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-60))*2), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-20))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-20))*-0.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-15))*0.3);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5))*-2), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+40))*3), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-120))*-3), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(7.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+60))*3), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-120))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-3.5092-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+50))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-9.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-30))*-3), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-70))*3), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-20))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+50))*3), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-180))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-140))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5+100))*-3), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-230))*5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-130))*5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 36.2538 + (((tickAnim - 0) / 8) * (-1.3447-(36.2538)));
            yy = 26.8132 + (((tickAnim - 0) / 8) * (27.2158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(26.8132)));
            zz = 2.9488 + (((tickAnim - 0) / 8) * (13.5945-(2.9488)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -1.3447 + (((tickAnim - 8) / 6) * (0.5314-(-1.3447)));
            yy = 27.2158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 6) * (-47.8687-(27.2158-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            zz = 13.5945 + (((tickAnim - 8) / 6) * (-8.5276-(13.5945)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 0.5314 + (((tickAnim - 14) / 21) * (36.2538-(0.5314)));
            yy = -47.8687 + (((tickAnim - 14) / 21) * (26.8132-(-47.8687)));
            zz = -8.5276 + (((tickAnim - 14) / 21) * (2.9488-(-8.5276)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 59.6497 + (((tickAnim - 0) / 8) * (45.4329-(59.6497)));
            yy = 54.1241 + (((tickAnim - 0) / 8) * (20.5421-(54.1241)));
            zz = -20.036 + (((tickAnim - 0) / 8) * (-27.6084-(-20.036)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 45.4329 + (((tickAnim - 8) / 6) * (31.7977-(45.4329)));
            yy = 20.5421 + (((tickAnim - 8) / 6) * (41.4404-(20.5421)));
            zz = -27.6084 + (((tickAnim - 8) / 6) * (-22.8663-(-27.6084)));
        }
        else if (tickAnim >= 14 && tickAnim < 35) {
            xx = 31.7977 + (((tickAnim - 14) / 21) * (59.6497-(31.7977)));
            yy = 41.4404 + (((tickAnim - 14) / 21) * (54.1241-(41.4404)));
            zz = -22.8663 + (((tickAnim - 14) / 21) * (-20.036-(-22.8663)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (9.3732-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (14.723-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-78.2108-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.3732 + (((tickAnim - 4) / 4) * (12.4608-(9.3732)));
            yy = 14.723 + (((tickAnim - 4) / 4) * (13.834-(14.723)));
            zz = -78.2108 + (((tickAnim - 4) / 4) * (-74.1004-(-78.2108)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.4608 + (((tickAnim - 8) / 6) * (-1.8602-(12.4608)));
            yy = 13.834 + (((tickAnim - 8) / 6) * (-0.2312-(13.834)));
            zz = -74.1004 + (((tickAnim - 8) / 6) * (12.0524-(-74.1004)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -1.8602 + (((tickAnim - 14) / 8) * (-17.6589-(-1.8602)));
            yy = -0.2312 + (((tickAnim - 14) / 8) * (-0.7517-(-0.2312)));
            zz = 12.0524 + (((tickAnim - 14) / 8) * (37.5856-(12.0524)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -17.6589 + (((tickAnim - 22) / 8) * (0-(-17.6589)));
            yy = -0.7517 + (((tickAnim - 22) / 8) * (0-(-0.7517)));
            zz = 37.5856 + (((tickAnim - 22) / 8) * (0-(37.5856)));
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
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0.165-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0.47-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0.05-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.165 + (((tickAnim - 18) / 4) * (0.375-(0.165)));
            yy = 0.47 + (((tickAnim - 18) / 4) * (0.65-(0.47)));
            zz = 0.05 + (((tickAnim - 18) / 4) * (0-(0.05)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0.375 + (((tickAnim - 22) / 8) * (0.225-(0.375)));
            yy = 0.65 + (((tickAnim - 22) / 8) * (0-(0.65)));
            zz = 0 + (((tickAnim - 22) / 8) * (0.15-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0.225 + (((tickAnim - 30) / 5) * (0-(0.225)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 30) / 5) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 3.75 + (((tickAnim - 0) / 18) * (84.0793-(3.75)));
            yy = -11.5 + (((tickAnim - 0) / 18) * (13.2373-(-11.5)));
            zz = 0 + (((tickAnim - 0) / 18) * (95.0255-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 84.0793 + (((tickAnim - 18) / 8) * (207.057-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*250-(84.0793)));
            yy = 13.2373 + (((tickAnim - 18) / 8) * (-1.2041-(13.2373)));
            zz = 95.0255 + (((tickAnim - 18) / 8) * (59.4823-(95.0255)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 207.057-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*250 + (((tickAnim - 26) / 9) * (3.75-(207.057-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*250)));
            yy = -1.2041 + (((tickAnim - 26) / 9) * (-11.5-(-1.2041)));
            zz = 59.4823 + (((tickAnim - 26) / 9) * (0-(59.4823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 38 + (((tickAnim - 0) / 18) * (40.5996-(38)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.555-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.338-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 40.5996 + (((tickAnim - 18) / 8) * (11.7998-(40.5996)));
            yy = 1.555 + (((tickAnim - 18) / 8) * (0.7775-(1.555)));
            zz = 7.338 + (((tickAnim - 18) / 8) * (3.669-(7.338)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 11.7998 + (((tickAnim - 26) / 9) * (38-(11.7998)));
            yy = 0.7775 + (((tickAnim - 26) / 9) * (0-(0.7775)));
            zz = 3.669 + (((tickAnim - 26) / 9) * (0-(3.669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -40.1301 + (((tickAnim - 0) / 4) * (-59.3319-(-40.1301)));
            yy = 11.6976 + (((tickAnim - 0) / 4) * (-8.3136-(11.6976)));
            zz = 1.1184 + (((tickAnim - 0) / 4) * (21.771-(1.1184)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -59.3319 + (((tickAnim - 4) / 4) * (-79.4551-(-59.3319)));
            yy = -8.3136 + (((tickAnim - 4) / 4) * (-11.4588-(-8.3136)));
            zz = 21.771 + (((tickAnim - 4) / 4) * (41.6068-(21.771)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -79.4551 + (((tickAnim - 8) / 6) * (-64.7606-(-79.4551)));
            yy = -11.4588 + (((tickAnim - 8) / 6) * (-27.2174-(-11.4588)));
            zz = 41.6068 + (((tickAnim - 8) / 6) * (43.2238-(41.6068)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -64.7606 + (((tickAnim - 14) / 4) * (-0.2959-(-64.7606)));
            yy = -27.2174 + (((tickAnim - 14) / 4) * (-10.154-(-27.2174)));
            zz = 43.2238 + (((tickAnim - 14) / 4) * (46.8411-(43.2238)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.2959 + (((tickAnim - 18) / 2) * (46.3027-(-0.2959)));
            yy = -10.154 + (((tickAnim - 18) / 2) * (2.6436-(-10.154)));
            zz = 46.8411 + (((tickAnim - 18) / 2) * (49.5541-(46.8411)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 46.3027 + (((tickAnim - 20) / 6) * (6.4796-(46.3027)));
            yy = 2.6436 + (((tickAnim - 20) / 6) * (6.2652-(2.6436)));
            zz = 49.5541 + (((tickAnim - 20) / 6) * (30.1798-(49.5541)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 6.4796 + (((tickAnim - 26) / 5) * (-36.8114-(6.4796)));
            yy = 6.2652 + (((tickAnim - 26) / 5) * (-9.1488-(6.2652)));
            zz = 30.1798 + (((tickAnim - 26) / 5) * (-0.1253-(30.1798)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -36.8114 + (((tickAnim - 31) / 4) * (-40.1301-(-36.8114)));
            yy = -9.1488 + (((tickAnim - 31) / 4) * (11.6976-(-9.1488)));
            zz = -0.1253 + (((tickAnim - 31) / 4) * (1.1184-(-0.1253)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0.1 + (((tickAnim - 0) / 4) * (0.55-(0.1)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0.55 + (((tickAnim - 4) / 4) * (0.475-(0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 27) * (0-(0)));
            zz = 0.475 + (((tickAnim - 8) / 27) * (0.1-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 11.7079 + (((tickAnim - 0) / 16) * (36.2538-(11.7079)));
            yy = 33.3022 + (((tickAnim - 0) / 16) * (-26.8132-(33.3022)));
            zz = 8.0732 + (((tickAnim - 0) / 16) * (-2.9488-(8.0732)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 36.2538 + (((tickAnim - 16) / 7) * (-1.3447-(36.2538)));
            yy = -26.8132 + (((tickAnim - 16) / 7) * (-104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-26.8132)));
            zz = -2.9488 + (((tickAnim - 16) / 7) * (-13.5945-(-2.9488)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -1.3447 + (((tickAnim - 23) / 7) * (3.4514-(-1.3447)));
            yy = -104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 23) / 7) * (47.6949-(-104.0092-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            zz = -13.5945 + (((tickAnim - 23) / 7) * (14.3146-(-13.5945)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 3.4514 + (((tickAnim - 30) / 5) * (11.7079-(3.4514)));
            yy = 47.6949 + (((tickAnim - 30) / 5) * (33.3022-(47.6949)));
            zz = 14.3146 + (((tickAnim - 30) / 5) * (8.0732-(14.3146)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -8.8912 + (((tickAnim - 0) / 16) * (59.6497-(-8.8912)));
            yy = -43.7068 + (((tickAnim - 0) / 16) * (-54.1241-(-43.7068)));
            zz = -10.2129 + (((tickAnim - 0) / 16) * (20.036-(-10.2129)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 59.6497 + (((tickAnim - 16) / 7) * (45.4329-(59.6497)));
            yy = -54.1241 + (((tickAnim - 16) / 7) * (-20.5421-(-54.1241)));
            zz = 20.036 + (((tickAnim - 16) / 7) * (27.6084-(20.036)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 45.4329 + (((tickAnim - 23) / 7) * (15.9534-(45.4329)));
            yy = -20.5421 + (((tickAnim - 23) / 7) * (-36.6558-(-20.5421)));
            zz = 27.6084 + (((tickAnim - 23) / 7) * (17.3199-(27.6084)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 15.9534 + (((tickAnim - 30) / 5) * (-8.8912-(15.9534)));
            yy = -36.6558 + (((tickAnim - 30) / 5) * (-43.7068-(-36.6558)));
            zz = 17.3199 + (((tickAnim - 30) / 5) * (-10.2129-(17.3199)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.0347 + (((tickAnim - 0) / 4) * (-30.5101-(0.0347)));
            yy = 0.0371 + (((tickAnim - 0) / 4) * (-5.9596-(0.0371)));
            zz = -4.8034 + (((tickAnim - 0) / 4) * (-15.3805-(-4.8034)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = -30.5101 + (((tickAnim - 4) / 12) * (0-(-30.5101)));
            yy = -5.9596 + (((tickAnim - 4) / 12) * (0-(-5.9596)));
            zz = -15.3805 + (((tickAnim - 4) / 12) * (0-(-15.3805)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (9.3732-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (-14.723-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (78.2108-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9.3732 + (((tickAnim - 19) / 4) * (12.4608-(9.3732)));
            yy = -14.723 + (((tickAnim - 19) / 4) * (-13.834-(-14.723)));
            zz = 78.2108 + (((tickAnim - 19) / 4) * (74.1004-(78.2108)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.4608 + (((tickAnim - 23) / 7) * (1.9843-(12.4608)));
            yy = -13.834 + (((tickAnim - 23) / 7) * (-6.2125-(-13.834)));
            zz = 74.1004 + (((tickAnim - 23) / 7) * (-7.6021-(74.1004)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.9843 + (((tickAnim - 30) / 5) * (0.0347-(1.9843)));
            yy = -6.2125 + (((tickAnim - 30) / 5) * (0.0371-(-6.2125)));
            zz = -7.6021 + (((tickAnim - 30) / 5) * (-4.8034-(-7.6021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.175-(0)));
            yy = 0.125 + (((tickAnim - 0) / 4) * (0.325-(0.125)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = -0.175 + (((tickAnim - 4) / 12) * (0-(-0.175)));
            yy = 0.325 + (((tickAnim - 4) / 12) * (0-(0.325)));
            zz = 0.1 + (((tickAnim - 4) / 12) * (0-(0.1)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.03-(0)));
            yy = 0 + (((tickAnim - 30) / 3) * (0.1-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -0.03 + (((tickAnim - 33) / 2) * (0-(-0.03)));
            yy = 0.1 + (((tickAnim - 33) / 2) * (0.125-(0.1)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 84.0793 + (((tickAnim - 0) / 8) * (72.032-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(84.0793)));
            yy = -13.2373 + (((tickAnim - 0) / 8) * (1.2041-(-13.2373)));
            zz = -95.0255 + (((tickAnim - 0) / 8) * (-59.4823-(-95.0255)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 72.032-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 8) / 10) * (3.75-(72.032-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.2041 + (((tickAnim - 8) / 10) * (11.5-(1.2041)));
            zz = -59.4823 + (((tickAnim - 8) / 10) * (0-(-59.4823)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 18) / 17) * (84.0793-(3.75)));
            yy = 11.5 + (((tickAnim - 18) / 17) * (-13.2373-(11.5)));
            zz = 0 + (((tickAnim - 18) / 17) * (-95.0255-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 41 + (((tickAnim - 0) / 8) * (11.7998-(41)));
            yy = -2 + (((tickAnim - 0) / 8) * (-0.7775-(-2)));
            zz = -7 + (((tickAnim - 0) / 8) * (-3.669-(-7)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 11.7998 + (((tickAnim - 8) / 10) * (38-(11.7998)));
            yy = -0.7775 + (((tickAnim - 8) / 10) * (0-(-0.7775)));
            zz = -3.669 + (((tickAnim - 8) / 10) * (0-(-3.669)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 38 + (((tickAnim - 18) / 17) * (41-(38)));
            yy = 0 + (((tickAnim - 18) / 17) * (-2-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (-7-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.2959 + (((tickAnim - 0) / 4) * (46.3027-(-0.2959)));
            yy = 10.154 + (((tickAnim - 0) / 4) * (-2.6436-(10.154)));
            zz = -46.8411 + (((tickAnim - 0) / 4) * (-49.5541-(-46.8411)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 46.3027 + (((tickAnim - 4) / 4) * (6.4796-(46.3027)));
            yy = -2.6436 + (((tickAnim - 4) / 4) * (-6.2652-(-2.6436)));
            zz = -49.5541 + (((tickAnim - 4) / 4) * (-30.1798-(-49.5541)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 6.4796 + (((tickAnim - 8) / 6) * (-36.8114-(6.4796)));
            yy = -6.2652 + (((tickAnim - 8) / 6) * (9.1488-(-6.2652)));
            zz = -30.1798 + (((tickAnim - 8) / 6) * (0.1253-(-30.1798)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -36.8114 + (((tickAnim - 14) / 4) * (-40.1301-(-36.8114)));
            yy = 9.1488 + (((tickAnim - 14) / 4) * (-11.6976-(9.1488)));
            zz = 0.1253 + (((tickAnim - 14) / 4) * (-1.1184-(0.1253)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -40.1301 + (((tickAnim - 18) / 4) * (-59.3319-(-40.1301)));
            yy = -11.6976 + (((tickAnim - 18) / 4) * (8.3136-(-11.6976)));
            zz = -1.1184 + (((tickAnim - 18) / 4) * (-21.771-(-1.1184)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -59.3319 + (((tickAnim - 22) / 4) * (-79.4551-(-59.3319)));
            yy = 8.3136 + (((tickAnim - 22) / 4) * (11.4588-(8.3136)));
            zz = -21.771 + (((tickAnim - 22) / 4) * (-41.6068-(-21.771)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -79.4551 + (((tickAnim - 26) / 4) * (-69.5106-(-79.4551)));
            yy = 11.4588 + (((tickAnim - 26) / 4) * (27.2174-(11.4588)));
            zz = -41.6068 + (((tickAnim - 26) / 4) * (-43.2238-(-41.6068)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -69.5106 + (((tickAnim - 30) / 5) * (-0.2959-(-69.5106)));
            yy = 27.2174 + (((tickAnim - 30) / 5) * (10.154-(27.2174)));
            zz = -43.2238 + (((tickAnim - 30) / 5) * (-46.8411-(-43.2238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0.1 + (((tickAnim - 18) / 4) * (0.55-(0.1)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0.55 + (((tickAnim - 22) / 4) * (0.475-(0.55)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0.475 + (((tickAnim - 26) / 9) * (0-(0.475)));
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
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-5), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-15), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0.525);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*0.8);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(3.25), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-1.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*10), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*20), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0.4);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-13.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*5), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*25), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.375);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(23-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-120))*-10), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-30), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.275);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*5), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-80))*-25), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*-10), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-50), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*10), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-50), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 71.288 + (((tickAnim - 0) / 3) * (13.9571-(71.288)));
            yy = 29.8576 + (((tickAnim - 0) / 3) * (-146.9286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350-(29.8576)));
            zz = 13.3789 + (((tickAnim - 0) / 3) * (24.4213-(13.3789)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 13.9571 + (((tickAnim - 3) / 5) * (7.7742-(13.9571)));
            yy = -146.9286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350 + (((tickAnim - 3) / 5) * (-38.9471-(-146.9286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350)));
            zz = 24.4213 + (((tickAnim - 3) / 5) * (-20.4744-(24.4213)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 7.7742 + (((tickAnim - 8) / 3) * (36.7875-(7.7742)));
            yy = -38.9471 + (((tickAnim - 8) / 3) * (-21.6779-(-38.9471)));
            zz = -20.4744 + (((tickAnim - 8) / 3) * (12.4585-(-20.4744)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 36.7875 + (((tickAnim - 11) / 4) * (71.288-(36.7875)));
            yy = -21.6779 + (((tickAnim - 11) / 4) * (29.8576-(-21.6779)));
            zz = 12.4585 + (((tickAnim - 11) / 4) * (13.3789-(12.4585)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -14.6768 + (((tickAnim - 0) / 3) * (-8.5145-(-14.6768)));
            yy = 64.6756 + (((tickAnim - 0) / 3) * (-104.2956-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350-(64.6756)));
            zz = -33.7473 + (((tickAnim - 0) / 3) * (134.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350-(-33.7473)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.5145 + (((tickAnim - 3) / 5) * (23.1109-(-8.5145)));
            yy = -104.2956-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350 + (((tickAnim - 3) / 5) * (45.0789-(-104.2956-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350)));
            zz = 134.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350 + (((tickAnim - 3) / 5) * (0.2293-(134.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*350)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 23.1109 + (((tickAnim - 8) / 3) * (-2.6043-(23.1109)));
            yy = 45.0789 + (((tickAnim - 8) / 3) * (47.9703-(45.0789)));
            zz = 0.2293 + (((tickAnim - 8) / 3) * (2.0325-(0.2293)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -2.6043 + (((tickAnim - 11) / 4) * (-14.6768-(-2.6043)));
            yy = 47.9703 + (((tickAnim - 11) / 4) * (64.6756-(47.9703)));
            zz = 2.0325 + (((tickAnim - 11) / 4) * (-33.7473-(2.0325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-2.033-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-73.9028-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -2.033 + (((tickAnim - 2) / 1) * (0.0693-(-2.033)));
            yy = 2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5 + (((tickAnim - 2) / 1) * (34.9679-(2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5)));
            zz = -73.9028 + (((tickAnim - 2) / 1) * (-71.7247-(-73.9028)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0.0693 + (((tickAnim - 3) / 5) * (0-(0.0693)));
            yy = 34.9679 + (((tickAnim - 3) / 5) * (0-(34.9679)));
            zz = -71.7247 + (((tickAnim - 3) / 5) * (0-(-71.7247)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-16.8809-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.4948-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (33.4067-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -16.8809 + (((tickAnim - 9) / 2) * (-34.9622-(-16.8809)));
            yy = 2.4948 + (((tickAnim - 9) / 2) * (-9.6503-(2.4948)));
            zz = 33.4067 + (((tickAnim - 9) / 2) * (19.3059-(33.4067)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -34.9622 + (((tickAnim - 11) / 4) * (0-(-34.9622)));
            yy = -9.6503 + (((tickAnim - 11) / 4) * (0-(-9.6503)));
            zz = 19.3059 + (((tickAnim - 11) / 4) * (0-(19.3059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (58.8363-(2.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.4136-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (67.1575-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 58.8363 + (((tickAnim - 3) / 5) * (126.5352-(58.8363)));
            yy = 4.4136 + (((tickAnim - 3) / 5) * (-7.9073-(4.4136)));
            zz = 67.1575 + (((tickAnim - 3) / 5) * (111.2993-(67.1575)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 126.5352 + (((tickAnim - 8) / 2) * (251.9507-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(126.5352)));
            yy = -7.9073 + (((tickAnim - 8) / 2) * (15.2327-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-250-(-7.9073)));
            zz = 111.2993 + (((tickAnim - 8) / 2) * (87.6289-(111.2993)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 251.9507-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 10) / 5) * (2.5-(251.9507-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = 15.2327-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-250 + (((tickAnim - 10) / 5) * (0-(15.2327-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-250)));
            zz = 87.6289 + (((tickAnim - 10) / 5) * (0-(87.6289)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 8) / 7) * (0-(0.775)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(xx);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(yy);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 21.5 + (((tickAnim - 0) / 8) * (30.7198-(21.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.4201-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (15.6394-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 30.7198 + (((tickAnim - 8) / 2) * (-22.5949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(30.7198)));
            yy = 3.4201 + (((tickAnim - 8) / 2) * (16.4-(3.4201)));
            zz = 15.6394 + (((tickAnim - 8) / 2) * (15.6976-(15.6394)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -22.5949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 10) / 5) * (21.5-(-22.5949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = 16.4 + (((tickAnim - 10) / 5) * (0-(16.4)));
            zz = 15.6976 + (((tickAnim - 10) / 5) * (0-(15.6976)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -19.8459 + (((tickAnim - 0) / 3) * (-78.7995-(-19.8459)));
            yy = 6.6959 + (((tickAnim - 0) / 3) * (-29.8462-(6.6959)));
            zz = 5.307 + (((tickAnim - 0) / 3) * (50.7751-(5.307)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -78.7995 + (((tickAnim - 3) / 5) * (0-(-78.7995)));
            yy = -29.8462 + (((tickAnim - 3) / 5) * (0-(-29.8462)));
            zz = 50.7751 + (((tickAnim - 3) / 5) * (0-(50.7751)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (38.2146-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (22.4505-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (2.8993-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 38.2146 + (((tickAnim - 10) / 3) * (-18.5453-(38.2146)));
            yy = 22.4505 + (((tickAnim - 10) / 3) * (-0.2213-(22.4505)));
            zz = 2.8993 + (((tickAnim - 10) / 3) * (-4.3426-(2.8993)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -18.5453 + (((tickAnim - 13) / 2) * (-19.8459-(-18.5453)));
            yy = -0.2213 + (((tickAnim - 13) / 2) * (6.6959-(-0.2213)));
            zz = -4.3426 + (((tickAnim - 13) / 2) * (5.307-(-4.3426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.175 + (((tickAnim - 2) / 1) * (-0.1-(-0.175)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.475 + (((tickAnim - 2) / 1) * (0.225-(0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.1 + (((tickAnim - 3) / 5) * (0-(-0.1)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0.225 + (((tickAnim - 3) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.7742 + (((tickAnim - 0) / 3) * (30.2571-(7.7742)));
            yy = 38.9471 + (((tickAnim - 0) / 3) * (21.9771-(38.9471)));
            zz = 20.4744 + (((tickAnim - 0) / 3) * (-12.8603-(20.4744)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30.2571 + (((tickAnim - 3) / 5) * (71.288-(30.2571)));
            yy = 21.9771 + (((tickAnim - 3) / 5) * (-29.8576-(21.9771)));
            zz = -12.8603 + (((tickAnim - 3) / 5) * (-13.3789-(-12.8603)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 71.288 + (((tickAnim - 8) / 3) * (13.9571-(71.288)));
            yy = -29.8576 + (((tickAnim - 8) / 3) * (25.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350-(-29.8576)));
            zz = -13.3789 + (((tickAnim - 8) / 3) * (-24.4213-(-13.3789)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 13.9571 + (((tickAnim - 11) / 4) * (7.7742-(13.9571)));
            yy = 25.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350 + (((tickAnim - 11) / 4) * (38.9471-(25.7286-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350)));
            zz = -24.4213 + (((tickAnim - 11) / 4) * (20.4744-(-24.4213)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.1109 + (((tickAnim - 0) / 3) * (-13.273-(23.1109)));
            yy = -45.0789 + (((tickAnim - 0) / 3) * (-48.9984-(-45.0789)));
            zz = -0.2293 + (((tickAnim - 0) / 3) * (1.6874-(-0.2293)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -13.273 + (((tickAnim - 3) / 5) * (-14.6768-(-13.273)));
            yy = -48.9984 + (((tickAnim - 3) / 5) * (-64.6756-(-48.9984)));
            zz = 1.6874 + (((tickAnim - 3) / 5) * (33.7473-(1.6874)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -14.6768 + (((tickAnim - 8) / 3) * (-8.5145-(-14.6768)));
            yy = -64.6756 + (((tickAnim - 8) / 3) * (-6.8544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350-(-64.6756)));
            zz = 33.7473 + (((tickAnim - 8) / 3) * (-19.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350-(33.7473)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.5145 + (((tickAnim - 11) / 4) * (23.1109-(-8.5145)));
            yy = -6.8544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350 + (((tickAnim - 11) / 4) * (-45.0789-(-6.8544-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350)));
            zz = -19.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350 + (((tickAnim - 11) / 4) * (-0.2293-(-19.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*-350)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-16.8809-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-33.4067-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -16.8809 + (((tickAnim - 2) / 1) * (-11.3548-(-16.8809)));
            yy = 2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5 + (((tickAnim - 2) / 1) * (13.5209-(2.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*480+60))*5)));
            zz = -33.4067 + (((tickAnim - 2) / 1) * (-0.773-(-33.4067)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.3548 + (((tickAnim - 3) / 5) * (0-(-11.3548)));
            yy = 13.5209 + (((tickAnim - 3) / 5) * (0-(13.5209)));
            zz = -0.773 + (((tickAnim - 3) / 5) * (0-(-0.773)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-2.033-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-18.5175-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (73.9028-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -2.033 + (((tickAnim - 9) / 2) * (0.0693-(-2.033)));
            yy = -18.5175 + (((tickAnim - 9) / 2) * (-34.9679-(-18.5175)));
            zz = 73.9028 + (((tickAnim - 9) / 2) * (71.7247-(73.9028)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.0693 + (((tickAnim - 11) / 4) * (0-(0.0693)));
            yy = -34.9679 + (((tickAnim - 11) / 4) * (0-(-34.9679)));
            zz = 71.7247 + (((tickAnim - 11) / 4) * (0-(71.7247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 126.5352 + (((tickAnim - 0) / 3) * (127.7257-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450-(126.5352)));
            yy = 7.9073 + (((tickAnim - 0) / 3) * (-112.2923-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*250-(7.9073)));
            zz = -111.2993 + (((tickAnim - 0) / 3) * (-87.6289-(-111.2993)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 127.7257-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450 + (((tickAnim - 3) / 5) * (2.5-(127.7257-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*450)));
            yy = -112.2923-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*250 + (((tickAnim - 3) / 5) * (0-(-112.2923-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-30))*250)));
            zz = -87.6289 + (((tickAnim - 3) / 5) * (0-(-87.6289)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.5 + (((tickAnim - 8) / 3) * (58.8363-(2.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (-4.4136-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-67.1575-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 58.8363 + (((tickAnim - 11) / 4) * (126.5352-(58.8363)));
            yy = -4.4136 + (((tickAnim - 11) / 4) * (7.9073-(-4.4136)));
            zz = -67.1575 + (((tickAnim - 11) / 4) * (-111.2993-(-67.1575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 8) * (0-(0.775)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.775-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(xx);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(yy);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.7198 + (((tickAnim - 0) / 3) * (-67.8949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150-(30.7198)));
            yy = -3.4201 + (((tickAnim - 0) / 3) * (-16.4-(-3.4201)));
            zz = -15.6394 + (((tickAnim - 0) / 3) * (-15.6976-(-15.6394)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -67.8949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150 + (((tickAnim - 3) / 5) * (21.5-(-67.8949-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*150)));
            yy = -16.4 + (((tickAnim - 3) / 5) * (0-(-16.4)));
            zz = -15.6976 + (((tickAnim - 3) / 5) * (0-(-15.6976)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 8) / 7) * (30.7198-(21.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (-3.4201-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-15.6394-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (38.2146-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-22.4505-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.8993-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 38.2146 + (((tickAnim - 3) / 3) * (-18.5453-(38.2146)));
            yy = -22.4505 + (((tickAnim - 3) / 3) * (0.2213-(-22.4505)));
            zz = -2.8993 + (((tickAnim - 3) / 3) * (4.3426-(-2.8993)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.5453 + (((tickAnim - 6) / 2) * (-17.3459-(-18.5453)));
            yy = 0.2213 + (((tickAnim - 6) / 2) * (-6.6959-(0.2213)));
            zz = 4.3426 + (((tickAnim - 6) / 2) * (-5.307-(4.3426)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -17.3459 + (((tickAnim - 8) / 3) * (-60.3466-(-17.3459)));
            yy = -6.6959 + (((tickAnim - 8) / 3) * (45.6951-(-6.6959)));
            zz = -5.307 + (((tickAnim - 8) / 3) * (-31.6227-(-5.307)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -60.3466 + (((tickAnim - 11) / 4) * (0-(-60.3466)));
            yy = 45.6951 + (((tickAnim - 11) / 4) * (0-(45.6951)));
            zz = -31.6227 + (((tickAnim - 11) / 4) * (0-(-31.6227)));
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
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0.175-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.475-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0.175 + (((tickAnim - 9) / 2) * (0-(0.175)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0.475 + (((tickAnim - 9) / 2) * (0.25-(0.475)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0.25 + (((tickAnim - 11) / 4) * (0-(0.25)));
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
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSusisuchus entity = (EntityPrehistoricFloraSusisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*3), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-3), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(2.25), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(2), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*15), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(2), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(80.3379), armright.rotateAngleY + (float) Math.toRadians(32.5735-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), armright.rotateAngleZ + (float) Math.toRadians(11.519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));


        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(-22.517), armright2.rotateAngleY + (float) Math.toRadians(70.6676), armright2.rotateAngleZ + (float) Math.toRadians(-16.6608));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(147.173-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), legright.rotateAngleY + (float) Math.toRadians(-23.0518), legright.rotateAngleZ + (float) Math.toRadians(83.912));
        this.legright.rotationPointX = this.legright.rotationPointX + (float)(0.525);
        this.legright.rotationPointY = this.legright.rotationPointY - (float)(1.05);
        this.legright.rotationPointZ = this.legright.rotationPointZ + (float)(-0.325);


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*5), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(15.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*10), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(80.3379), armleft.rotateAngleY + (float) Math.toRadians(-32.5735-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1), armleft.rotateAngleZ + (float) Math.toRadians(-11.519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5));


        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(-22.517), armleft2.rotateAngleY + (float) Math.toRadians(-70.6676), armleft2.rotateAngleZ + (float) Math.toRadians(16.6608));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(144.673-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-5), legleft.rotateAngleY + (float) Math.toRadians(23.0518), legleft.rotateAngleZ + (float) Math.toRadians(-83.912));
        this.legleft.rotationPointX = this.legleft.rotationPointX + (float)(-0.525);
        this.legleft.rotationPointY = this.legleft.rotationPointY - (float)(1.05);
        this.legleft.rotationPointZ = this.legleft.rotationPointZ + (float)(-0.325);


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(7-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(15.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-10), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSusisuchus e = (EntityPrehistoricFloraSusisuchus) entity;
        animator.update(entity);

    }
}
