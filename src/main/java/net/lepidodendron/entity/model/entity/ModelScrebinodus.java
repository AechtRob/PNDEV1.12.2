package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScrebinodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;

    private ModelAnimator animator;

    public ModelScrebinodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 27.0F, 3.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -6.675F, -17.45F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 26, -2.0F, -1.0F, -1.0F, 3, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -7.2F, -17.2F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 40, -3.0F, -1.0F, -1.0F, 4, 1, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -7.5F, -13.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 35, -4.0F, -2.0F, -1.0F, 5, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.75F, -3.75F, -13.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 12, -1.0F, -5.0F, -1.0F, 2, 5, 8, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.9F, -6.525F, -15.7F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -1.0F, -2.0F, -1.0F, 2, 2, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.45F, -5.575F, -17.2F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6109F, 0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 1, -1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.15F, -6.025F, -17.95F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6109F, 0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 8, -1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.4F, -6.25F, -17.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.6109F, 0.48F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.075F, -7.075F, -16.6F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6109F, 0.2182F, -0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 0, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.075F, -7.075F, -16.6F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6109F, -0.2182F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 0, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -6.25F, -17.175F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 12, -2.0F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.45F, -5.575F, -17.2F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6109F, -0.48F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 1, 1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.15F, -6.025F, -17.95F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6109F, -0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 8, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.9F, -6.525F, -15.7F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, -0.3491F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 24, -1.0F, -2.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.4F, -6.25F, -17.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, -0.48F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 44, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.75F, -3.75F, -13.75F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 12, -1.0F, -5.0F, -1.0F, 2, 5, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, -3.5F, -13.75F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 0, -5.0F, -5.0F, -1.0F, 6, 5, 7, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -8.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -3.0F, 0.0F, 7, 7, 12, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, -3.0F, -2.5F, -1.0F, 6, 6, 10, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 3.0F, 2.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.6545F, 0.0F, 0.5236F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 0, -0.5F, -0.25F, -0.75F, 1, 2, 1, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 8, 7, 0.0F, 1.25F, -0.75F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 3.0F, 2.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.6545F, 0.0F, -0.5236F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 0, -0.5F, -0.25F, -0.75F, 1, 2, 1, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 8, 7, 0.0F, 1.25F, -0.75F, 0, 1, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 24, 27, -2.0F, -2.5F, -1.0F, 4, 5, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 3.75F, 7.5F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3927F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 7, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 2.75F, 5.0F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 44, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, -3.0F, 7.5F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.48F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 8, 1.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.8F, 5.25F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.48F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 22, 45, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -1.65F, 0.75F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 8, 2, 0.5F, -0.9992F, 1.4271F, 0, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 41, 45, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -1.0F, -2.25F, -1.0F, 2, 4, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 15, 0.0F, -2.75F, -1.0F, 0, 5, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 46, 46, -0.5F, -0.5F, 5.75F, 1, 1, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 22, 20, -0.5F, -1.25F, 2.75F, 1, 2, 3, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, -0.275F, 6.825F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 22, 11, 0.99F, -1.0F, -5.0F, 0, 1, 8, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.175F, 7.45F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 40, 25, 0.0F, -1.0F, -5.0F, 1, 1, 6, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 1.175F, 7.75F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 18, 1.0F, -1.0F, -5.0F, 0, 1, 7, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.675F, 7.25F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2182F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 40, 0.0F, -1.0F, -5.0F, 1, 1, 6, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.65F, -14.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.4363F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 40, -2.0F, -0.0576F, -2.8132F, 4, 1, 4, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.5F, 0.0174F, -4.7132F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.5236F, 0.48F, -0.2618F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 35, -1.0F, -0.9695F, 0.1176F, 1, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(2.775F, -0.0576F, -4.0382F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.5236F, 0.48F, -0.2618F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 2, -1.0F, -0.9695F, 0.1176F, 0, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, 0.9424F, -2.8132F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.3927F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 45, 0, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.5F, 0.7924F, -3.1632F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 2, -1.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.775F, -0.0576F, -4.0382F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.5236F, -0.48F, 0.2618F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 10, 2, 1.0F, -0.9695F, 0.1176F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.5F, 0.0174F, -4.7132F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.5236F, -0.48F, 0.2618F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 35, 0.0F, -0.9695F, 0.1176F, 1, 1, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 0.0674F, -3.2882F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4363F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 6, -2.0F, -1.0F, -1.0F, 3, 1, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, 0.5174F, -3.7132F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.4363F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 26, -2.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.5F, 0.7924F, -3.1632F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.3927F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 26, 2, 1.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.5F, 0.9424F, -2.8132F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.3927F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 45, 0, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-4.25F, -4.75F, -7.0F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.48F, -0.5672F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 12, 44, 0.0F, -1.0F, -0.25F, 1, 3, 4, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 26, 0, 0.0F, -0.25F, 3.75F, 1, 2, 2, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 17, 33, 0.5F, -0.85F, 4.0F, 0, 3, 2, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 8, 0, 0.5F, 1.25F, 2.0F, 0, 1, 2, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 1, 0.5F, -1.25F, 2.0F, 0, 1, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(4.25F, -4.75F, -7.0F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.48F, 0.5672F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 12, 44, -1.0F, -1.0F, -0.25F, 1, 3, 4, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 26, 0, -1.0F, -0.25F, 3.75F, 1, 2, 2, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 17, 33, -0.5F, -0.85F, 4.0F, 0, 3, 2, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 8, 0, -0.5F, 1.25F, 2.0F, 0, 1, 2, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 1, -0.5F, -1.25F, 2.0F, 0, 1, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetZ = -0.16F;
        this.head.offsetY = -0.2F;
        this.head.offsetX = -0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.head.offsetZ = -0.05F;
        this.head.offsetY = -0.2F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -0.5F;
        this.head.offsetX = 0.1F;
        this.head.rotateAngleY = (float)Math.toRadians(140);
        this.head.rotateAngleX = (float)Math.toRadians(24);
        this.head.rotateAngleZ = (float)Math.toRadians(5);
        this.head.scaleChildren = true;
        float scaler = 0.98F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(head, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Body.offsetY = -0.1F;
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        float speed = 0.125F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.22F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += ((f3 / 2F) / (180F / (float) Math.PI));
        //this.head.rotateAngleX += ((f4 / 2F) / (180F / (float) Math.PI));
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.65, f2, 0.6F * still);
            this.swing(head, speed, 0.1F * still, true, 0, 0, f2, 0.65F);
        }
        else {
            this.swing(head, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.6F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.6F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinL2, (float) (speed * 0.65), 0.4F, true, 1.5F, 0, f2, 0.35F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinR2, (float) (speed * 0.65), -0.4F, true, 1.5F, 0, f2, 0.35F);

        if (!e.isInWater()) {
            //this.Body.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = 0.3f;
            this.bob(head, -speed * 3.8F, 0.25F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}

