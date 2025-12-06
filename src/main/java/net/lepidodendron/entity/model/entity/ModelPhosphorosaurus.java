package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPhosphorosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPhosphorosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tongue;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelPhosphorosaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.0465F, -2.843F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.6035F, -3.907F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.5F, -7.0F, -1.0F, 7, 7, 10, 0.0F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-3.25F, 1.3535F, -2.857F);
        this.main.addChild(armright);
        this.setRotateAngle(armright, 0.6981F, -0.48F, 0.4363F);
        this.armright.cubeList.add(new ModelBox(armright, 60, 55, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.01F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0873F, 0.0F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 42, 58, -0.5F, -0.75F, -1.0F, 1, 3, 2, 0.0F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 28, 51, 0.0F, -0.75F, -2.15F, 0, 6, 4, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(3.25F, 1.3535F, -2.857F);
        this.main.addChild(armleft);
        this.setRotateAngle(armleft, 0.6981F, 0.48F, -0.4363F);
        this.armleft.cubeList.add(new ModelBox(armleft, 60, 55, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.01F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0873F, 0.0F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 42, 58, -0.5F, -0.75F, -1.0F, 1, 3, 2, 0.0F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 28, 51, 0.0F, -0.75F, -2.15F, 0, 6, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3965F, -4.907F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 18, 42, -2.5F, -1.7F, -3.0F, 5, 5, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 36, 42, -2.0F, -1.55F, -3.0F, 4, 4, 4, 0.0F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 2.5F, -2.825F);
        this.neck2.addChild(throat2);
        this.setRotateAngle(throat2, -0.1745F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 50, 50, -1.5F, -1.0F, -0.5F, 3, 1, 4, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.45F, -3.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.0785F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 34, 11, -2.0F, -1.7F, -2.1F, 4, 2, 3, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 23, -1.5F, -0.7F, -3.75F, 3, 1, 2, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 51, -0.5F, -0.7F, -8.6F, 1, 1, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.7F, -8.6F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1353F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 39, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.475F, -0.575F, -2.95F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.24F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 54, 9, 0.05F, -0.8F, 1.1F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.3F, -8.6F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.144F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 54, -1.0F, -1.0F, 0.0F, 1, 1, 5, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 0.55F, -8.6F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1614F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 50, -0.25F, -1.0F, 0.0F, 0, 1, 7, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.55F, -8.6F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1614F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 50, 0.25F, -1.0F, 0.0F, 0, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.3F, -8.6F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.144F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 54, 0.0F, -1.0F, 0.0F, 1, 1, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.825F, -2.2F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1222F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 45, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.475F, -0.575F, -2.95F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.24F, -0.6981F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 9, -1.05F, -0.8F, 1.1F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.6F, -2.9F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 60, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.525F, 0.3F, -3.75F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2443F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 9, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.525F, 0.3F, -3.75F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2443F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 9, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.7F, 1.175F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 11, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 0, -0.5F, 0.5F, -9.75F, 1, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.95F, -7.625F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 57, -1.5F, -1.0F, 3.0F, 3, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.7F, -7.825F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 60, 0.0F, -1.0F, 3.0F, 2, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.475F, 1.5F, -9.8F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.144F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 46, -1.0F, -1.0F, 0.05F, 1, 1, 7, -0.01F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 46, -1.0F, -1.0F, 0.05F, 1, 1, 7, -0.01F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.3F, 1.5F, -9.7F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1484F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 36, 0.0F, -1.25F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.3F, 1.5F, -9.7F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1484F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 36, 0.0F, -1.25F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.475F, 1.5F, -9.8F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.144F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 46, 0.0F, -1.0F, 0.05F, 1, 1, 7, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.3F, -2.1F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9599F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 18, -1.0F, 0.0F, -2.4F, 3, 2, 2, 0.01F, false));

        this.tongue = new AdvancedModelRenderer(this);
        this.tongue.setRotationPoint(0.0F, 0.25F, 0.075F);
        this.jaw.addChild(tongue);
        this.setRotateAngle(tongue, 0.0436F, 0.0F, 0.0F);
        this.tongue.cubeList.add(new ModelBox(tongue, -9, 0, -0.5F, 0.0F, -9.0F, 1, 0, 9, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.3491F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 56, 26, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.55F, -0.25F, -2.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.5323F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.075F, 0.05F, -0.375F);
        this.eyeright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 54, -0.925F, -1.0F, 0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.05F, 0.0F, -0.075F);
        this.eyeright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 61, -0.925F, -1.0F, -0.75F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.55F, -0.25F, -2.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.5323F, 0.0F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.075F, 0.05F, -0.375F);
        this.eyeleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 12, 54, -0.075F, -1.0F, 0.1F, 1, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.05F, 0.0F, -0.075F);
        this.eyeleft.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 61, -0.075F, -1.0F, -0.75F, 1, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.1965F, 5.093F);
        this.main.addChild(body);
        this.setRotateAngle(body, -0.0087F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 28, 17, -3.0F, -1.25F, -1.0F, 6, 6, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.75F, 7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0087F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 28, 31, -2.5F, -1.575F, -1.0F, 5, 5, 6, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.25F, 2.675F, 3.25F);
        this.body2.addChild(legright);
        this.setRotateAngle(legright, 0.4363F, 0.0F, 0.7418F);
        this.legright.cubeList.add(new ModelBox(legright, 60, 59, -0.5F, -0.25F, -1.0F, 1, 2, 2, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.1309F, 0.0F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 36, 58, -0.5F, -0.25F, -1.0F, 1, 4, 2, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 12, 57, 0.0F, -0.5F, -1.25F, 0, 6, 3, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.25F, 2.675F, 3.25F);
        this.body2.addChild(legleft);
        this.setRotateAngle(legleft, 0.4363F, 0.0F, -0.7418F);
        this.legleft.cubeList.add(new ModelBox(legleft, 60, 59, -0.5F, -0.25F, -1.0F, 1, 2, 2, 0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.1309F, 0.0F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 36, 58, -0.5F, -0.25F, -1.0F, 1, 4, 2, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 12, 57, 0.0F, -0.5F, -1.25F, 0, 6, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.525F, 5.0F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0349F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 34, 0, -1.5F, -2.0F, -1.0F, 3, 4, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 36, -1.0F, -1.65F, -1.0F, 2, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 50, 55, -0.5F, -1.65F, -0.5F, 1, 3, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 56, 16, -0.5F, -1.65F, -0.5F, 1, 3, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.55F, 5.125F);
        this.tail4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, 0.0F, -4.0F, -6.0F, 0, 5, 14, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 31, -0.5F, -1.0F, -2.0F, 1, 2, 6, 0.0F, false));
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
        this.main.offsetY = 0.0F;
        this.main.offsetX = 0.15F;
        this.main.offsetZ = 1.0F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
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
        EntityPrehistoricFloraPhosphorosaurus ee = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;

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
        EntityPrehistoricFloraPhosphorosaurus entity = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;
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
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 5) / 5) * (0-(12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.56-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.56 + (((tickAnim - 3) / 2) * (-9.75-(6.56)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -9.75 + (((tickAnim - 5) / 3) * (-15.87-(-9.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15.87 + (((tickAnim - 8) / 2) * (0-(-15.87)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0.3 + (((tickAnim - 8) / 2) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 6.5 + (((tickAnim - 1) / 4) * (4-(6.5)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 5) / 3) * (-8.15237-(4)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.47349-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-3.52363-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.15237 + (((tickAnim - 8) / 2) * (0-(-8.15237)));
            yy = 0.47349 + (((tickAnim - 8) / 2) * (0-(0.47349)));
            zz = -3.52363 + (((tickAnim - 8) / 2) * (0-(-3.52363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14 + (((tickAnim - 5) / 3) * (41-(14)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 41 + (((tickAnim - 8) / 2) * (0-(41)));
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
        EntityPrehistoricFloraPhosphorosaurus entity = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;
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
            zz = 0 + (((tickAnim - 0) / 20) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.47 + (((tickAnim - 20) / 20) * (-0.325-(-0.47)));
            zz = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-2 + (((tickAnim - 20) / 20) * (0-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-2)));
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
        EntityPrehistoricFloraPhosphorosaurus entity = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(6.25), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(-2.675);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(-43.55051), armright.rotateAngleY + (float) Math.toRadians(17.71583), armright.rotateAngleZ + (float) Math.toRadians(32.73072));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(1.30313), armright2.rotateAngleY + (float) Math.toRadians(8.53507), armright2.rotateAngleZ + (float) Math.toRadians(35.73036));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(-43.55051), armleft.rotateAngleY + (float) Math.toRadians(-17.71583), armleft.rotateAngleZ + (float) Math.toRadians(-32.73072));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(1.30313), armleft2.rotateAngleY + (float) Math.toRadians(-8.53507), armleft2.rotateAngleZ + (float) Math.toRadians(-35.73036));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(21.72297), neck.rotateAngleY + (float) Math.toRadians(1.11123), neck.rotateAngleZ + (float) Math.toRadians(-2.78678));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(-0.35);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-10), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.93918892+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1), head.rotateAngleY + (float) Math.toRadians(-0.98012), head.rotateAngleZ + (float) Math.toRadians(-4.9175));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.35);
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(2.5000428377+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1), jaw.rotateAngleY + (float) Math.toRadians(-0.74997), jaw.rotateAngleZ + (float) Math.toRadians(-0.00655));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-11.75), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0.125);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(-1.85);
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.015),(float)1,(float)1);
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-8.75), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.015),(float)1,(float)1);
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(2.53717), legright.rotateAngleY + (float) Math.toRadians(7.41989), legright.rotateAngleZ + (float) Math.toRadians(44.06008));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(12.5));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-0.57595), legleft.rotateAngleY + (float) Math.toRadians(-2.33098), legleft.rotateAngleZ + (float) Math.toRadians(-48.68628));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(-1.75));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1.72798), tail.rotateAngleY + (float) Math.toRadians(-4.5283), tail.rotateAngleZ + (float) Math.toRadians(23.6228));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5.04603), tail2.rotateAngleY + (float) Math.toRadians(-9.00154), tail2.rotateAngleZ + (float) Math.toRadians(18.40541));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-5.48825), tail3.rotateAngleY + (float) Math.toRadians(-6.16366), tail3.rotateAngleZ + (float) Math.toRadians(14.58681));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(19.0056), tail4.rotateAngleY + (float) Math.toRadians(-1.77499), tail4.rotateAngleZ + (float) Math.toRadians(20.27512));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhosphorosaurus entity = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*3), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), armright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), armright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-5));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*3), armleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), armleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-3), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*6), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*9), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), legright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-5));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*3), legright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-5));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*3), legleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-5));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*3), legleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-5));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*12), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*15), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*18), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*21), tail4.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPhosphorosaurus entity = (EntityPrehistoricFloraPhosphorosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*5), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-0.6);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), armright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-5));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-1), armright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), armright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*3), armleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-5));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-1), armleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), armleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*6), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*6), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-6), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*11), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-1), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), legright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-1), legright2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*3), legright2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-5));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-1), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), legleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-5));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-1), legleft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*3), legleft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-5));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*14), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*17), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*21), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*24), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraPhosphorosaurus ee = (EntityPrehistoricFloraPhosphorosaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

