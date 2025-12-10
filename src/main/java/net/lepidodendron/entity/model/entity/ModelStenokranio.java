package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStenokranio;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStenokranio extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body3_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2_r1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2_r1;
    private final AdvancedModelRenderer neck3_r1;
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
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jawslope;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer handright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer handleft;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer footleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer footright;

    private ModelAnimator animator;

    public ModelStenokranio() {
        this.textureWidth = 70;
        this.textureHeight = 65;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 25.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 19, -3.5F, -8.5F, 0.75F, 7, 5, 8, 0.0F, false));

        this.body3_r1 = new AdvancedModelRenderer(this);
        this.body3_r1.setRotationPoint(-0.5F, -2.0F, -15.0F);
        this.hip.addChild(body3_r1);
        this.setRotateAngle(body3_r1, -0.0742F, 0.0F, 0.0F);
        this.body3_r1.cubeList.add(new ModelBox(body3_r1, 0, 27, -2.0F, -8.975F, 15.525F, 5, 2, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -6.75F, 9.0F);
        this.hip.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 21, 32, -2.0F, -2.0007F, -0.9289F, 4, 4, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 13, 47, -1.5F, -1.2479F, -0.6112F, 3, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 50, -1.0F, -0.7507F, -0.6789F, 2, 2, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -2.25F, -10.0F, 9, 6, 10, 0.0F, false));

        this.body2_r1 = new AdvancedModelRenderer(this);
        this.body2_r1.setRotationPoint(-0.5F, 5.0F, -17.0F);
        this.body.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.0611F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 0, 16, -3.0F, -6.825F, 7.325F, 7, 1, 10, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5F, -10.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 28, 0, -4.0F, -2.49F, -2.0F, 8, 5, 3, 0.0F, false));

        this.neck2_r1 = new AdvancedModelRenderer(this);
        this.neck2_r1.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 48, 18, -3.0F, 0.01F, 0.0F, 6, 1, 3, 0.0F, false));

        this.neck3_r1 = new AdvancedModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 4.0F, -7.0F);
        this.neck.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, -0.1222F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 45, 32, -3.5F, -2.775F, 4.8F, 7, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 41, 44, -1.5F, -1.0F, -9.0F, 3, 1, 6, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 8, -1.5F, -0.75F, -8.75F, 3, 1, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 41, -2.5F, -1.0F, -3.85F, 5, 1, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 1, -2.75F, -0.5F, -6.5F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -0.5F, -4.75F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 1, 2.75F, -0.5F, -6.5F, 0, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 3.5F, -0.5F, -4.75F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0349F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 24, 2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 2, -0.75F, -1.0F, 4.2F, 3, 1, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2443F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 3, 1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 19, -1.7F, -1.0F, 2.65F, 3, 1, 2, 0.005F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 19, -0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 0, -3.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2094F, 0.3491F, 0.3491F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.75F, -0.85F, 1.75F, 2, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.0087F, 0.3927F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 9, -0.2F, -1.9F, 4.0F, 2, 1, 6, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 41, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0F, -9.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 10, -2.0F, -0.675F, 3.9F, 4, 2, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2443F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 3, -1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 19, -1.3F, -1.0F, 2.65F, 3, 1, 2, 0.005F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2094F, -0.3491F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.25F, -0.85F, 1.75F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0087F, -0.3927F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 46, 9, -1.8F, -1.9F, 4.0F, 2, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.0349F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 24, -2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 2, -2.25F, -1.0F, 4.2F, 3, 1, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, 0.0F, -9.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.6981F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 19, 0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 0, 0.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 1.1F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -1.5F, -0.25F, -9.85F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 29, 43, -1.5F, 0.0F, -10.1F, 3, 1, 6, 0.005F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 37, -2.5F, 0.0F, -4.95F, 5, 1, 5, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 45, 36, -3.0F, -1.4F, -2.95F, 6, 2, 3, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.2443F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, -1.7F, -1.0F, 2.65F, 3, 1, 2, -0.01F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 2, 1.05F, -1.25F, 2.55F, 0, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0349F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 43, -0.75F, -1.0F, 4.2F, 3, 1, 6, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 24, 2.0F, -1.25F, 4.2F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, 1.0F, -10.1F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.6981F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 55, -3.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 22, -0.25F, -1.25F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0349F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 24, -2.0F, -0.75F, 4.2F, 0, 1, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 43, -2.25F, -0.5F, 4.2F, 3, 1, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.2443F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 2, -1.05F, -0.75F, 2.55F, 0, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 22, -1.3F, -0.5F, 2.65F, 3, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 0.5F, -10.1F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6981F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 22, 0.25F, -0.75F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 55, 0.0F, -0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.jawslope = new AdvancedModelRenderer(this);
        this.jawslope.setRotationPoint(0.0F, 2.0F, -1.1F);
        this.jaw.addChild(jawslope);
        this.setRotateAngle(jawslope, -0.2269F, 0.0F, 0.0F);
        this.jawslope.cubeList.add(new ModelBox(jawslope, 48, 52, -1.5F, 0.0502F, -8.8943F, 3, 1, 4, 0.005F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.8002F, 9.7557F);
        this.jawslope.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1396F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 50, -1.5F, -3.775F, -14.375F, 3, 1, 5, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 1.8002F, -8.9943F);
        this.jawslope.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1396F, 0.0436F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 35, -1.0F, -2.125F, 4.6F, 3, 2, 6, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, 1.0502F, -8.9943F);
        this.jawslope.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0349F, 0.2443F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 16, -1.975F, -0.9F, 2.8F, 3, 1, 2, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 1.0502F, -8.9943F);
        this.jawslope.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.6109F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 56, -3.1F, -1.0F, 0.0F, 3, 1, 3, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, 1.0502F, -8.9943F);
        this.jawslope.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 56, 0.1F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, 1.8002F, -8.9943F);
        this.jawslope.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1396F, -0.0436F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 33, 35, -2.0F, -2.125F, 4.6F, 3, 2, 6, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, 1.0502F, -8.9943F);
        this.jawslope.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0349F, -0.2443F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 16, -1.025F, -0.9F, 2.8F, 3, 1, 2, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeright);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.3F, 1.25F, -6.25F);
        this.eyeright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, -0.2618F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 23, -0.625F, -1.175F, 5.4F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(1.3F, -2.05F, -2.75F);
        this.head.addChild(eyeleft);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.3F, 1.25F, -6.25F);
        this.eyeleft.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.2618F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 23, -0.375F, -1.175F, 5.4F, 1, 1, 2, 0.0F, true));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-4.25F, 2.0F, -7.75F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.0F, 0.6109F, 0.0F);
        this.armright.cubeList.add(new ModelBox(armright, 38, 51, -3.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-2.25F, -0.25F, 0.0F);
        this.armright.addChild(armright2);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 16, -0.99F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.handright = new AdvancedModelRenderer(this);
        this.handright.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armright2.addChild(handright);
        this.handright.cubeList.add(new ModelBox(handright, 56, 4, -1.5F, 0.0864F, -2.0889F, 3, 1, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(4.25F, 2.0F, -7.75F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.0F, -0.6109F, 0.0F);
        this.armleft.cubeList.add(new ModelBox(armleft, 38, 51, -1.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(2.25F, -0.25F, 0.0F);
        this.armleft.addChild(armleft2);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 16, -1.01F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.handleft = new AdvancedModelRenderer(this);
        this.handleft.setRotationPoint(0.0F, 3.2239F, -0.4309F);
        this.armleft2.addChild(handleft);
        this.handleft.cubeList.add(new ModelBox(handleft, 56, 4, -1.5F, 0.0864F, -2.0889F, 3, 1, 3, 0.0F, true));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.75F, -5.25F, 7.0F);
        this.hip.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.5672F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 48, 22, -0.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.legleft.addChild(legleft2);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 4, -0.76F, -0.5179F, -1.2189F, 2, 4, 2, 0.0F, true));

        this.footleft = new AdvancedModelRenderer(this);
        this.footleft.setRotationPoint(0.5F, 3.0F, -0.25F);
        this.legleft2.addChild(footleft);
        this.setRotateAngle(footleft, 0.0F, -1.309F, 0.0F);
        this.footleft.cubeList.add(new ModelBox(footleft, 53, 46, -2.0854F, 0.2886F, -2.2965F, 4, 1, 3, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.75F, -5.25F, 7.0F);
        this.hip.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.5672F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 48, 22, -3.5F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.legright.addChild(legright2);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 4, -1.24F, -0.5179F, -1.2189F, 2, 4, 2, 0.0F, false));

        this.footright = new AdvancedModelRenderer(this);
        this.footright.setRotationPoint(-0.5F, 3.0F, -0.25F);
        this.legright2.addChild(footright);
        this.setRotateAngle(footright, 0.0F, 1.309F, 0.0F);
        this.footright.cubeList.add(new ModelBox(footright, 53, 46, -1.9146F, 0.2886F, -2.2965F, 4, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail3, 0.0886F, -0.1739F, -0.0154F);
        this.setRotateAngle(tail2, 0.0886F, -0.1739F, -0.0154F);
        this.setRotateAngle(tail, -0.2628F, -0.0843F, 0.0226F);
        this.setRotateAngle(neck3_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.0436F, -0.2182F, 0.0F);
        this.setRotateAngle(legright2, 0.1034F, -0.5648F, 0.0754F);
        this.setRotateAngle(legright, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(legleft, 0.0F, 0.5672F, 0.0F);
        this.setRotateAngle(jawslope, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(hip, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(head, -0.2618F, -0.0436F, 0.0019F);
        this.setRotateAngle(handright, 0.2616F, 0.0113F, -0.1294F);
        this.setRotateAngle(footright, -0.1704F, 0.8522F, -0.2414F);
        this.setRotateAngle(footleft, 0.0F, -1.309F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.0087F, 0.3927F);
        this.setRotateAngle(cube_r5, 0.2094F, 0.3491F, 0.3491F);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r28, 0.0873F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0349F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1396F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0349F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1396F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0087F, -0.3927F);
        this.setRotateAngle(cube_r10, 0.2094F, -0.3491F, -0.3491F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body3_r1, -0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(body2_r1, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(armright2, -0.2182F, 0.0F, 0.1309F);
        this.setRotateAngle(armright, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(armleft, 0.0F, -0.6109F, 0.0F);
        this.hip.offsetY = -0.1F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(neck3_r1, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(legright, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(legleft, 0.0F, 0.5672F, 0.0F);
        this.setRotateAngle(jawslope, -0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(footright, 0.0F, 1.309F, 0.0F);
        this.setRotateAngle(footleft, 0.0F, -1.309F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.0087F, 0.3927F);
        this.setRotateAngle(cube_r5, 0.2094F, 0.3491F, 0.3491F);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r28, 0.0873F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r27, 0.0873F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r26, 0.0349F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r25, 0.1396F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r24, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(cube_r23, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0349F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1396F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.2443F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0349F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.2443F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, -0.0349F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0087F, -0.3927F);
        this.setRotateAngle(cube_r10, 0.2094F, -0.3491F, -0.3491F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(body3_r1, -0.0742F, 0.0F, 0.0F);
        this.setRotateAngle(body2_r1, 0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(armright, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(armleft, 0.0F, -0.6109F, 0.0F);
        this.neck.rotateAngleY = (float) Math.toRadians(0);
        this.neck.offsetY = -0.02F;
        this.neck.offsetZ = 0.03F;
        this.neck.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.4F;
        this.hip.offsetX = -0.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(-250);
        this.hip.rotateAngleX = (float)Math.toRadians(3);
        this.hip.rotateAngleZ = (float)Math.toRadians(-1);
        this.hip.scaleChildren = true;
        float scaler = 0.8F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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
       // this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraStenokranio entitySilesaurus = (EntityPrehistoricFloraStenokranio) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
        this.faceTarget(f3, f4, 6, head);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStenokranio ee = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.RELAX_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStenokranio entity = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        int animCycle = 237;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = -13.25 + (((tickAnim - 20) / 62) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = -13.25 + (((tickAnim - 82) / 26) * (-13.24696-(-13.25)));
            yy = 0 + (((tickAnim - 82) / 26) * (-0.28648-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-1.21673-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -13.24696 + (((tickAnim - 108) / 110) * (-13.24696-(-13.24696)));
            yy = -0.28648 + (((tickAnim - 108) / 110) * (-0.28648-(-0.28648)));
            zz = -1.21673 + (((tickAnim - 108) / 110) * (-1.21673-(-1.21673)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -13.24696 + (((tickAnim - 218) / 20) * (0-(-13.24696)));
            yy = -0.28648 + (((tickAnim - 218) / 20) * (0-(-0.28648)));
            zz = -1.21673 + (((tickAnim - 218) / 20) * (0-(-1.21673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            zz = -0.375 + (((tickAnim - 20) / 62) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 82 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 82) / 136) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 136) * (0-(0)));
            zz = -0.375 + (((tickAnim - 82) / 136) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            zz = -0.375 + (((tickAnim - 218) / 20) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = 4.75 + (((tickAnim - 20) / 54) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 108) {
            xx = 4.75 + (((tickAnim - 74) / 34) * (4.80774-(4.75)));
            yy = 0 + (((tickAnim - 74) / 34) * (2.27872-(0)));
            zz = 0 + (((tickAnim - 74) / 34) * (1.36737-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 4.80774 + (((tickAnim - 108) / 110) * (4.80774-(4.80774)));
            yy = 2.27872 + (((tickAnim - 108) / 110) * (2.27872-(2.27872)));
            zz = 1.36737 + (((tickAnim - 108) / 110) * (1.36737-(1.36737)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 4.80774 + (((tickAnim - 218) / 20) * (0-(4.80774)));
            yy = 2.27872 + (((tickAnim - 218) / 20) * (0-(2.27872)));
            zz = 1.36737 + (((tickAnim - 218) / 20) * (0-(1.36737)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 10) / 10) * (6.03939-(-4.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (-15.52472-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-7.614-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 78) {
            xx = 6.03939 + (((tickAnim - 20) / 58) * (6.03939-(6.03939)));
            yy = -15.52472 + (((tickAnim - 20) / 58) * (-15.52472-(-15.52472)));
            zz = -7.614 + (((tickAnim - 20) / 58) * (-7.614-(-7.614)));
        }
        else if (tickAnim >= 78 && tickAnim < 108) {
            xx = 6.03939 + (((tickAnim - 78) / 30) * (5.95203-(6.03939)));
            yy = -15.52472 + (((tickAnim - 78) / 30) * (-13.80684-(-15.52472)));
            zz = -7.614 + (((tickAnim - 78) / 30) * (-7.26899-(-7.614)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 5.95203 + (((tickAnim - 108) / 110) * (5.95203-(5.95203)));
            yy = -13.80684 + (((tickAnim - 108) / 110) * (-13.80684-(-13.80684)));
            zz = -7.26899 + (((tickAnim - 108) / 110) * (-7.26899-(-7.26899)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 5.95203 + (((tickAnim - 218) / 20) * (0-(5.95203)));
            yy = -13.80684 + (((tickAnim - 218) / 20) * (0-(-13.80684)));
            zz = -7.26899 + (((tickAnim - 218) / 20) * (0-(-7.26899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6 + (((tickAnim - 10) / 10) * (6.21346-(-6)));
            yy = 0 + (((tickAnim - 10) / 10) * (-22.26861-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-3.15236-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 85) {
            xx = 6.21346 + (((tickAnim - 20) / 65) * (6.21346-(6.21346)));
            yy = -22.26861 + (((tickAnim - 20) / 65) * (-22.26861-(-22.26861)));
            zz = -3.15236 + (((tickAnim - 20) / 65) * (-3.15236-(-3.15236)));
        }
        else if (tickAnim >= 85 && tickAnim < 108) {
            xx = 6.21346 + (((tickAnim - 85) / 23) * (5.89819-(6.21346)));
            yy = -22.26861 + (((tickAnim - 85) / 23) * (-17.85203-(-22.26861)));
            zz = -3.15236 + (((tickAnim - 85) / 23) * (-2.23391-(-3.15236)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 5.89819 + (((tickAnim - 108) / 110) * (5.89819-(5.89819)));
            yy = -17.85203 + (((tickAnim - 108) / 110) * (-17.85203-(-17.85203)));
            zz = -2.23391 + (((tickAnim - 108) / 110) * (-2.23391-(-2.23391)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 5.89819 + (((tickAnim - 218) / 20) * (0-(5.89819)));
            yy = -17.85203 + (((tickAnim - 218) / 20) * (0-(-17.85203)));
            zz = -2.23391 + (((tickAnim - 218) / 20) * (0-(-2.23391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 11.5 + (((tickAnim - 20) / 62) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 11.5 + (((tickAnim - 82) / 26) * (11.47912-(11.5)));
            yy = 0 + (((tickAnim - 82) / 26) * (0.69737-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-3.42991-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 11.47912 + (((tickAnim - 108) / 110) * (11.47912-(11.47912)));
            yy = 0.69737 + (((tickAnim - 108) / 110) * (0.69737-(0.69737)));
            zz = -3.42991 + (((tickAnim - 108) / 110) * (-3.42991-(-3.42991)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 11.47912 + (((tickAnim - 218) / 20) * (0-(11.47912)));
            yy = 0.69737 + (((tickAnim - 218) / 20) * (0-(0.69737)));
            zz = -3.42991 + (((tickAnim - 218) / 20) * (0-(-3.42991)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = -4.5 + (((tickAnim - 20) / 62) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = -4.5 + (((tickAnim - 82) / 26) * (-7.99126-(-4.5)));
            yy = 0 + (((tickAnim - 82) / 26) * (-1.80898-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-3.87026-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -7.99126 + (((tickAnim - 108) / 110) * (-7.99126-(-7.99126)));
            yy = -1.80898 + (((tickAnim - 108) / 110) * (-1.80898-(-1.80898)));
            zz = -3.87026 + (((tickAnim - 108) / 110) * (-3.87026-(-3.87026)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -7.99126 + (((tickAnim - 218) / 20) * (0-(-7.99126)));
            yy = -1.80898 + (((tickAnim - 218) / 20) * (0-(-1.80898)));
            zz = -3.87026 + (((tickAnim - 218) / 20) * (0-(-3.87026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 82) / 26) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-4-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -2.25 + (((tickAnim - 108) / 110) * (-2.25-(-2.25)));
            yy = -0.75 + (((tickAnim - 108) / 110) * (-0.75-(-0.75)));
            zz = -4 + (((tickAnim - 108) / 110) * (-4-(-4)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -2.25 + (((tickAnim - 218) / 20) * (0-(-2.25)));
            yy = -0.75 + (((tickAnim - 218) / 20) * (0-(-0.75)));
            zz = -4 + (((tickAnim - 218) / 20) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jawslope, jawslope.rotateAngleX + (float) Math.toRadians(0), jawslope.rotateAngleY + (float) Math.toRadians(0), jawslope.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 20 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 20) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 12) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 20) / 12) * (1-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 46) {
            xx = 1 + (((tickAnim - 32) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 32) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 32) / 14) * (1-(1)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 46) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 46) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 46) / 2) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 1 + (((tickAnim - 48) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 11) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 48) / 11) * (1-(1)));
        }
        else if (tickAnim >= 59 && tickAnim < 73) {
            xx = 1 + (((tickAnim - 59) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 59) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 59) / 14) * (1-(1)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 73) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 73) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 73) / 2) * (1-(1)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 1 + (((tickAnim - 75) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 75) / 9) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 75) / 9) * (1-(1)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = 1 + (((tickAnim - 84) / 10) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 84) / 10) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 84) / 10) * (1-(1)));
        }
        else if (tickAnim >= 94 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 94) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 94) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 94) / 14) * (1-(1)));
        }
        else if (tickAnim >= 108 && tickAnim < 119) {
            xx = 1 + (((tickAnim - 108) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 108) / 11) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 108) / 11) * (1-(1)));
        }
        else if (tickAnim >= 119 && tickAnim < 133) {
            xx = 1 + (((tickAnim - 119) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 119) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 119) / 14) * (1-(1)));
        }
        else if (tickAnim >= 133 && tickAnim < 135) {
            xx = 1 + (((tickAnim - 133) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 133) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 133) / 2) * (1-(1)));
        }
        else if (tickAnim >= 135 && tickAnim < 147) {
            xx = 1 + (((tickAnim - 135) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 135) / 12) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 135) / 12) * (1-(1)));
        }
        else if (tickAnim >= 147 && tickAnim < 161) {
            xx = 1 + (((tickAnim - 147) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 147) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 147) / 14) * (1-(1)));
        }
        else if (tickAnim >= 161 && tickAnim < 163) {
            xx = 1 + (((tickAnim - 161) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 161) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 161) / 2) * (1-(1)));
        }
        else if (tickAnim >= 163 && tickAnim < 174) {
            xx = 1 + (((tickAnim - 163) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 163) / 11) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 163) / 11) * (1-(1)));
        }
        else if (tickAnim >= 174 && tickAnim < 188) {
            xx = 1 + (((tickAnim - 174) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 174) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 174) / 14) * (1-(1)));
        }
        else if (tickAnim >= 188 && tickAnim < 190) {
            xx = 1 + (((tickAnim - 188) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 188) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 188) / 2) * (1-(1)));
        }
        else if (tickAnim >= 190 && tickAnim < 202) {
            xx = 1 + (((tickAnim - 190) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 190) / 12) * (0.9275-(1)));
            zz = 1 + (((tickAnim - 190) / 12) * (1-(1)));
        }
        else if (tickAnim >= 202 && tickAnim < 216) {
            xx = 1 + (((tickAnim - 202) / 14) * (1-(1)));
            yy = 0.9275 + (((tickAnim - 202) / 14) * (1-(0.9275)));
            zz = 1 + (((tickAnim - 202) / 14) * (1-(1)));
        }
        else if (tickAnim >= 216 && tickAnim < 218) {
            xx = 1 + (((tickAnim - 216) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 216) / 2) * (1-(1)));
            zz = 1 + (((tickAnim - 216) / 2) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.jawslope.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 90 && tickAnim < 101) {
            xx = 1 + (((tickAnim - 90) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 11) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 90) / 11) * (1-(1)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 101) / 7) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 101) / 7) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 101) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 90 && tickAnim < 101) {
            xx = 1 + (((tickAnim - 90) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 90) / 11) * (0.0125-(1)));
            zz = 1 + (((tickAnim - 90) / 11) * (1-(1)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 1 + (((tickAnim - 101) / 7) * (1-(1)));
            yy = 0.0125 + (((tickAnim - 101) / 7) * (1-(0.0125)));
            zz = 1 + (((tickAnim - 101) / 7) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-28.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            yy = -28.5 + (((tickAnim - 20) / 62) * (-28.5-(-28.5)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (2.6273-(0)));
            yy = -28.5 + (((tickAnim - 82) / 26) * (-29.05255-(-28.5)));
            zz = 0 + (((tickAnim - 82) / 26) * (23.88651-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 2.6273 + (((tickAnim - 108) / 110) * (2.6273-(2.6273)));
            yy = -29.05255 + (((tickAnim - 108) / 110) * (-29.05255-(-29.05255)));
            zz = 23.88651 + (((tickAnim - 108) / 110) * (23.88651-(23.88651)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 2.6273 + (((tickAnim - 218) / 20) * (0-(2.6273)));
            yy = -29.05255 + (((tickAnim - 218) / 20) * (0-(-29.05255)));
            zz = 23.88651 + (((tickAnim - 218) / 20) * (0-(23.88651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-15.25-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            zz = -15.25 + (((tickAnim - 108) / 110) * (-15.25-(-15.25)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            zz = -15.25 + (((tickAnim - 218) / 20) * (0-(-15.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 82) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 82) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 26) * (-4.25-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            zz = -4.25 + (((tickAnim - 108) / 110) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            zz = -4.25 + (((tickAnim - 218) / 20) * (0-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            yy = 0.375 + (((tickAnim - 20) / 62) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            yy = 0.375 + (((tickAnim - 82) / 26) * (0-(0.375)));
            zz = 0 + (((tickAnim - 82) / 26) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handright.rotationPointX = this.handright.rotationPointX + (float)(xx);
        this.handright.rotationPointY = this.handright.rotationPointY - (float)(yy);
        this.handright.rotationPointZ = this.handright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (28.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            yy = 28.5 + (((tickAnim - 20) / 62) * (28.5-(28.5)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (-0.68233-(0)));
            yy = 28.5 + (((tickAnim - 82) / 26) * (28.53576-(28.5)));
            zz = 0 + (((tickAnim - 82) / 26) * (6.03853-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -0.68233 + (((tickAnim - 108) / 110) * (-0.68233-(-0.68233)));
            yy = 28.53576 + (((tickAnim - 108) / 110) * (28.53576-(28.53576)));
            zz = 6.03853 + (((tickAnim - 108) / 110) * (6.03853-(6.03853)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -0.68233 + (((tickAnim - 218) / 20) * (0-(-0.68233)));
            yy = 28.53576 + (((tickAnim - 218) / 20) * (0-(28.53576)));
            zz = 6.03853 + (((tickAnim - 218) / 20) * (0-(6.03853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(0), armleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(0), handleft.rotateAngleY + (float) Math.toRadians(0), handleft.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = 0 + (((tickAnim - 20) / 62) * (0-(0)));
            yy = 0.375 + (((tickAnim - 20) / 62) * (0.375-(0.375)));
            zz = 0 + (((tickAnim - 20) / 62) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 82) / 26) * (0-(0)));
            yy = 0.375 + (((tickAnim - 82) / 26) * (0-(0.375)));
            zz = 0 + (((tickAnim - 82) / 26) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.16343-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.49442-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-13.45959-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.16343 + (((tickAnim - 10) / 10) * (-19.19622-(-8.16343)));
            yy = 9.49442 + (((tickAnim - 10) / 10) * (23.47179-(9.49442)));
            zz = -13.45959 + (((tickAnim - 10) / 10) * (-32.49732-(-13.45959)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = -19.19622 + (((tickAnim - 20) / 62) * (-19.19622-(-19.19622)));
            yy = 23.47179 + (((tickAnim - 20) / 62) * (23.47179-(23.47179)));
            zz = -32.49732 + (((tickAnim - 20) / 62) * (-32.49732-(-32.49732)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = -19.19622 + (((tickAnim - 82) / 26) * (-18.41732-(-19.19622)));
            yy = 23.47179 + (((tickAnim - 82) / 26) * (19.09574-(23.47179)));
            zz = -32.49732 + (((tickAnim - 82) / 26) * (-29.36536-(-32.49732)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -18.41732 + (((tickAnim - 108) / 110) * (-19.19622-(-18.41732)));
            yy = 19.09574 + (((tickAnim - 108) / 110) * (23.47179-(19.09574)));
            zz = -29.36536 + (((tickAnim - 108) / 110) * (-32.49732-(-29.36536)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -19.19622 + (((tickAnim - 218) / 20) * (0-(-19.19622)));
            yy = 23.47179 + (((tickAnim - 218) / 20) * (0-(23.47179)));
            zz = -32.49732 + (((tickAnim - 218) / 20) * (0-(-32.49732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (15.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 20) / 198) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 198) * (0-(0)));
            zz = 15.25 + (((tickAnim - 20) / 198) * (15.25-(15.25)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            zz = 15.25 + (((tickAnim - 218) / 20) * (0-(15.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.73711-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.67779-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-8.26598-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.73711 + (((tickAnim - 10) / 10) * (-15.10603-(12.73711)));
            yy = 0.67779 + (((tickAnim - 10) / 10) * (0.89857-(0.67779)));
            zz = -8.26598 + (((tickAnim - 10) / 10) * (27.29451-(-8.26598)));
        }
        else if (tickAnim >= 20 && tickAnim < 218) {
            xx = -15.10603 + (((tickAnim - 20) / 198) * (-15.10603-(-15.10603)));
            yy = 0.89857 + (((tickAnim - 20) / 198) * (0.89857-(0.89857)));
            zz = 27.29451 + (((tickAnim - 20) / 198) * (27.29451-(27.29451)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -15.10603 + (((tickAnim - 218) / 20) * (0-(-15.10603)));
            yy = 0.89857 + (((tickAnim - 218) / 20) * (0-(0.89857)));
            zz = 27.29451 + (((tickAnim - 218) / 20) * (0-(27.29451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.13622-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-14.27388-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (12.62006-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.13622 + (((tickAnim - 10) / 10) * (-19.19622-(-7.13622)));
            yy = -14.27388 + (((tickAnim - 10) / 10) * (-23.4718-(-14.27388)));
            zz = 12.62006 + (((tickAnim - 10) / 10) * (32.4973-(12.62006)));
        }
        else if (tickAnim >= 20 && tickAnim < 82) {
            xx = -19.19622 + (((tickAnim - 20) / 62) * (-19.19622-(-19.19622)));
            yy = -23.4718 + (((tickAnim - 20) / 62) * (-23.4718-(-23.4718)));
            zz = 32.4973 + (((tickAnim - 20) / 62) * (32.4973-(32.4973)));
        }
        else if (tickAnim >= 82 && tickAnim < 108) {
            xx = -19.19622 + (((tickAnim - 82) / 26) * (-18.09938-(-19.19622)));
            yy = -23.4718 + (((tickAnim - 82) / 26) * (-26.33483-(-23.4718)));
            zz = 32.4973 + (((tickAnim - 82) / 26) * (34.16224-(32.4973)));
        }
        else if (tickAnim >= 108 && tickAnim < 218) {
            xx = -18.09938 + (((tickAnim - 108) / 110) * (-19.19622-(-18.09938)));
            yy = -26.33483 + (((tickAnim - 108) / 110) * (-23.4718-(-26.33483)));
            zz = 34.16224 + (((tickAnim - 108) / 110) * (32.4973-(34.16224)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -19.19622 + (((tickAnim - 218) / 20) * (0-(-19.19622)));
            yy = -23.4718 + (((tickAnim - 218) / 20) * (0-(-23.4718)));
            zz = 32.4973 + (((tickAnim - 218) / 20) * (0-(32.4973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-15.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 20) / 198) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 198) * (0-(0)));
            zz = -15.25 + (((tickAnim - 20) / 198) * (-15.25-(-15.25)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 218) / 20) * (0-(0)));
            zz = -15.25 + (((tickAnim - 218) / 20) * (0-(-15.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.16921-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.16485-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.02309-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.16921 + (((tickAnim - 10) / 10) * (-16.99023-(6.16921)));
            yy = -1.16485 + (((tickAnim - 10) / 10) * (-2.50373-(-1.16485)));
            zz = 1.02309 + (((tickAnim - 10) / 10) * (-28.4824-(1.02309)));
        }
        else if (tickAnim >= 20 && tickAnim < 218) {
            xx = -16.99023 + (((tickAnim - 20) / 198) * (-16.99023-(-16.99023)));
            yy = -2.50373 + (((tickAnim - 20) / 198) * (-2.50373-(-2.50373)));
            zz = -28.4824 + (((tickAnim - 20) / 198) * (-28.4824-(-28.4824)));
        }
        else if (tickAnim >= 218 && tickAnim < 238) {
            xx = -16.99023 + (((tickAnim - 218) / 20) * (0-(-16.99023)));
            yy = -2.50373 + (((tickAnim - 218) / 20) * (0-(-2.50373)));
            zz = -28.4824 + (((tickAnim - 218) / 20) * (0-(-28.4824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStenokranio entity = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        int animCycle = 75;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.15737-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.49725-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.00618-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0.15737 + (((tickAnim - 18) / 17) * (0.32784-(0.15737)));
            yy = -4.49725 + (((tickAnim - 18) / 17) * (4.98927-(-4.49725)));
            zz = -2.00618 + (((tickAnim - 18) / 17) * (3.76428-(-2.00618)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0.32784 + (((tickAnim - 35) / 8) * (0.32825-(0.32784)));
            yy = 4.98927 + (((tickAnim - 35) / 8) * (5.73926-(4.98927)));
            zz = 3.76428 + (((tickAnim - 35) / 8) * (3.7686-(3.76428)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0.32825 + (((tickAnim - 43) / 6) * (0.33001-(0.32825)));
            yy = 5.73926 + (((tickAnim - 43) / 6) * (8.23921-(5.73926)));
            zz = 3.7686 + (((tickAnim - 43) / 6) * (3.78306-(3.7686)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0.33001 + (((tickAnim - 49) / 5) * (0.32887-(0.33001)));
            yy = 8.23921 + (((tickAnim - 49) / 5) * (6.73924-(8.23921)));
            zz = 3.78306 + (((tickAnim - 49) / 5) * (3.77436-(3.78306)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0.32887 + (((tickAnim - 54) / 6) * (0.3327-(0.32887)));
            yy = 6.73924 + (((tickAnim - 54) / 6) * (10.98917-(6.73924)));
            zz = 3.77436 + (((tickAnim - 54) / 6) * (3.79919-(3.77436)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0.3327 + (((tickAnim - 60) / 15) * (0-(0.3327)));
            yy = 10.98917 + (((tickAnim - 60) / 15) * (0-(10.98917)));
            zz = 3.79919 + (((tickAnim - 60) / 15) * (0-(3.79919)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 17) * (2-(0)));
            zz = -2.75 + (((tickAnim - 18) / 17) * (0-(-2.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 35) / 8) * (2.75-(2)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 43) / 6) * (0-(0)));
            yy = 2.75 + (((tickAnim - 43) / 6) * (-4.75-(2.75)));
            zz = 0 + (((tickAnim - 43) / 6) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            yy = -4.75 + (((tickAnim - 49) / 5) * (-1-(-4.75)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 54) / 6) * (-6.25-(-1)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -6.25 + (((tickAnim - 60) / 15) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (2.25-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 2.25 + (((tickAnim - 28) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 5) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 18) / 5) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 23) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 23) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 23) / 4) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 27) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 27) / 4) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 27) / 4) * (1-(1)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 31) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 31) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 31) / 4) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 35) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 14) * (0-(1)));
            zz = 1 + (((tickAnim - 35) / 14) * (1-(1)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 49) / 5) * (1-(1)));
            yy = 0 + (((tickAnim - 49) / 5) * (0.235-(0)));
            zz = 1 + (((tickAnim - 49) / 5) * (1-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 54) / 6) * (1-(1)));
            yy = 0.235 + (((tickAnim - 54) / 6) * (0.0575-(0.235)));
            zz = 1 + (((tickAnim - 54) / 6) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 60) / 15) * (1-(1)));
            yy = 0.0575 + (((tickAnim - 60) / 15) * (1-(0.0575)));
            zz = 1 + (((tickAnim - 60) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 5) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 18) / 5) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 1 + (((tickAnim - 23) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 23) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 23) / 4) * (1-(1)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 27) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 27) / 4) * (0.0325-(1)));
            zz = 1 + (((tickAnim - 27) / 4) * (1-(1)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 31) / 4) * (1-(1)));
            yy = 0.0325 + (((tickAnim - 31) / 4) * (1-(0.0325)));
            zz = 1 + (((tickAnim - 31) / 4) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 35) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 14) * (0.4675-(1)));
            zz = 1 + (((tickAnim - 35) / 14) * (1-(1)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 49) / 5) * (1-(1)));
            yy = 0.4675 + (((tickAnim - 49) / 5) * (1-(0.4675)));
            zz = 1 + (((tickAnim - 49) / 5) * (1-(1)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 54) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 54) / 6) * (0.6325-(1)));
            zz = 1 + (((tickAnim - 54) / 6) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 1 + (((tickAnim - 60) / 15) * (1-(1)));
            yy = 0.6325 + (((tickAnim - 60) / 15) * (1-(0.6325)));
            zz = 1 + (((tickAnim - 60) / 15) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (-31.76195-(0)));
            yy = 0 + (((tickAnim - 25) / 19) * (-51.55822-(0)));
            zz = 0 + (((tickAnim - 25) / 19) * (1.39643-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -31.76195 + (((tickAnim - 44) / 5) * (-33.50573-(-31.76195)));
            yy = -51.55822 + (((tickAnim - 44) / 5) * (-58.93191-(-51.55822)));
            zz = 1.39643 + (((tickAnim - 44) / 5) * (6.42245-(1.39643)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = -33.50573 + (((tickAnim - 49) / 5) * (-32.61243-(-33.50573)));
            yy = -58.93191 + (((tickAnim - 49) / 5) * (-55.57897-(-58.93191)));
            zz = 6.42245 + (((tickAnim - 49) / 5) * (4.06512-(6.42245)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -32.61243 + (((tickAnim - 54) / 6) * (-34.65198-(-32.61243)));
            yy = -55.57897 + (((tickAnim - 54) / 6) * (-62.45273-(-55.57897)));
            zz = 4.06512 + (((tickAnim - 54) / 6) * (9.06477-(4.06512)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -34.65198 + (((tickAnim - 60) / 15) * (0-(-34.65198)));
            yy = -62.45273 + (((tickAnim - 60) / 15) * (0-(-62.45273)));
            zz = 9.06477 + (((tickAnim - 60) / 15) * (0-(9.06477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 25) / 19) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 25) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 19) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = -38.5 + (((tickAnim - 44) / 5) * (-37.29604-(-38.5)));
            yy = 0 + (((tickAnim - 44) / 5) * (10.33519-(0)));
            zz = 0 + (((tickAnim - 44) / 5) * (13.25378-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = -37.29604 + (((tickAnim - 49) / 5) * (-37.69112-(-37.29604)));
            yy = 10.33519 + (((tickAnim - 49) / 5) * (8.50889-(10.33519)));
            zz = 13.25378 + (((tickAnim - 49) / 5) * (10.84106-(13.25378)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -37.69112 + (((tickAnim - 54) / 6) * (-36.68842-(-37.69112)));
            yy = 8.50889 + (((tickAnim - 54) / 6) * (12.59213-(8.50889)));
            zz = 10.84106 + (((tickAnim - 54) / 6) * (16.30975-(10.84106)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -36.68842 + (((tickAnim - 60) / 15) * (0-(-36.68842)));
            yy = 12.59213 + (((tickAnim - 60) / 15) * (0-(12.59213)));
            zz = 16.30975 + (((tickAnim - 60) / 15) * (0-(16.30975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (76.99-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 76.99 + (((tickAnim - 38) / 6) * (6.5-(76.99)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 6.5 + (((tickAnim - 44) / 5) * (52.25-(6.5)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 5) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 52.25 + (((tickAnim - 49) / 5) * (6.5-(52.25)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 6.5 + (((tickAnim - 54) / 6) * (51.75-(6.5)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 51.75 + (((tickAnim - 60) / 15) * (0-(51.75)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStenokranio entity = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        int animCycle = 8;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.84399-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.16554-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-4.83127-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 4.84399 + (((tickAnim - 4) / 3) * (-7.81305-(4.84399)));
            yy = -0.16554 + (((tickAnim - 4) / 3) * (-0.0831-(-0.16554)));
            zz = -4.83127 + (((tickAnim - 4) / 3) * (-1.73322-(-4.83127)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -7.81305 + (((tickAnim - 7) / 1) * (0-(-7.81305)));
            yy = -0.0831 + (((tickAnim - 7) / 1) * (0-(-0.0831)));
            zz = -1.73322 + (((tickAnim - 7) / 1) * (0-(-1.73322)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-21.56965-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.86426-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.20429-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -21.56965 + (((tickAnim - 4) / 3) * (0-(-21.56965)));
            yy = -2.86426 + (((tickAnim - 4) / 3) * (0-(-2.86426)));
            zz = -7.20429 + (((tickAnim - 4) / 3) * (0-(-7.20429)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 23.75 + (((tickAnim - 4) / 3) * (0-(23.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 4) / 3) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 4) / 3) * (0.0225-(0.0225)));
            zz = 1 + (((tickAnim - 4) / 3) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 7) / 1) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 4) / 3) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 4) / 3) * (0.0225-(0.0225)));
            zz = 1 + (((tickAnim - 4) / 3) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 7) / 1) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 7) / 1) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 7) / 1) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStenokranio entity = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20.19137 + (((tickAnim - 0) / 10) * (74.3986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-100-(20.19137)));
            yy = -21.33289 + (((tickAnim - 0) / 10) * (-53.9049-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*120-(-21.33289)));
            zz = -12.4612+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30 + (((tickAnim - 0) / 10) * (-47.6722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(-12.4612+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 74.3986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-100 + (((tickAnim - 10) / 10) * (20.19137-(74.3986+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-100)));
            yy = -53.9049-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*120 + (((tickAnim - 10) / 10) * (-21.33289-(-53.9049-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*120)));
            zz = -47.6722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 10) / 10) * (-38.2112+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30-(-47.6722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 63.25 + (((tickAnim - 0) / 5) * (48.5-(63.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = -17 + (((tickAnim - 5) / 11) * (-81.3719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*-80-(-17)));
            yy = 0 + (((tickAnim - 5) / 11) * (-3.13472-(0)));
            zz = 48.5 + (((tickAnim - 5) / 11) * (105.0719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-80-(48.5)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -81.3719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*-80 + (((tickAnim - 16) / 4) * (0-(-81.3719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+100))*-80)));
            yy = -3.13472 + (((tickAnim - 16) / 4) * (0-(-3.13472)));
            zz = 105.0719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-80 + (((tickAnim - 16) / 4) * (63.25-(105.0719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-80)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 73 + (((tickAnim - 0) / 9) * (127.75-(73)));
            yy = 0 + (((tickAnim - 0) / 9) * (-37.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 127.75 + (((tickAnim - 9) / 5) * (48.75-(127.75)));
            yy = -37.25 + (((tickAnim - 9) / 5) * (0-(-37.25)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 48.75 + (((tickAnim - 14) / 6) * (73-(48.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 20.1914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10 + (((tickAnim - 0) / 10) * (-59.3692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*100-(20.1914+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10)));
            yy = 21.3329 + (((tickAnim - 0) / 10) * (30.2408-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*115-(21.3329)));
            zz = 12.4612+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-30 + (((tickAnim - 0) / 10) * (32.4279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(12.4612+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-30)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -59.3692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*100 + (((tickAnim - 10) / 10) * (3.1046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*10-(-59.3692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*100)));
            yy = 30.2408-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*115 + (((tickAnim - 10) / 10) * (21.00024-(30.2408-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*115)));
            zz = 32.4279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 10) / 10) * (-13.3984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30-(32.4279+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -46.62578 + (((tickAnim - 0) / 8) * (-34.27727-(-46.62578)));
            yy = 6.7513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-20 + (((tickAnim - 0) / 8) * (-13.1808+Math.sin((Math.PI/180)*(((double)tickAnim/20)))-(6.7513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-20)));
            zz = -25.66211 + (((tickAnim - 0) / 8) * (-34.297+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(-25.66211)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -34.27727 + (((tickAnim - 8) / 8) * (2.97223-(-34.27727)));
            yy = -13.1808+Math.sin((Math.PI/180)*(((double)tickAnim/20))) + (((tickAnim - 8) / 8) * (103.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-120-(-13.1808+Math.sin((Math.PI/180)*(((double)tickAnim/20))))));
            zz = -34.297+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 8) / 8) * (-169.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*140-(-34.297+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.97223 + (((tickAnim - 16) / 4) * (-46.62578-(2.97223)));
            yy = 103.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-120 + (((tickAnim - 16) / 4) * (1.02629-(103.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-120)));
            zz = -169.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*140 + (((tickAnim - 16) / 4) * (-25.66211-(-169.3576+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*140)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 113.75 + (((tickAnim - 0) / 8) * (26.5-(113.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 26.5 + (((tickAnim - 8) / 7) * (99.25-(26.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 99.25 + (((tickAnim - 15) / 5) * (113.75-(99.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.17159 + (((tickAnim - 0) / 13) * (-23.5384-(-0.17159)));
            yy = -50.33986 + (((tickAnim - 0) / 13) * (-202.8145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350-(-50.33986)));
            zz = 12.88201 + (((tickAnim - 0) / 13) * (-38.5281+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*100-(12.88201)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -23.5384 + (((tickAnim - 13) / 7) * (-0.17159-(-23.5384)));
            yy = -202.8145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350 + (((tickAnim - 13) / 7) * (-50.33986-(-202.8145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350)));
            zz = -38.5281+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*100 + (((tickAnim - 13) / 7) * (12.88201-(-38.5281+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*100)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 68.8208 + (((tickAnim - 0) / 5) * (47.75449-(68.8208)));
            yy = 31.9637 + (((tickAnim - 0) / 5) * (35.88891-(31.9637)));
            zz = -12.02137 + (((tickAnim - 0) / 5) * (-25.1462-(-12.02137)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 47.75449 + (((tickAnim - 5) / 6) * (0-(47.75449)));
            yy = 35.88891 + (((tickAnim - 5) / 6) * (52.9962-(35.88891)));
            zz = -25.1462 + (((tickAnim - 5) / 6) * (-56.25-(-25.1462)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (68.8208-(0)));
            yy = 52.9962 + (((tickAnim - 11) / 9) * (31.9637-(52.9962)));
            zz = -56.25 + (((tickAnim - 11) / 9) * (-12.02137-(-56.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 116.98106 + (((tickAnim - 0) / 7) * (17.9964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*12-(116.98106)));
            yy = -1.7661 + (((tickAnim - 0) / 7) * (-212.2085+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350-(-1.7661)));
            zz = -19.3013 + (((tickAnim - 0) / 7) * (7.1289-(-19.3013)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 17.9964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*12 + (((tickAnim - 7) / 10) * (172.1982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-200-(17.9964+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*12)));
            yy = -212.2085+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350 + (((tickAnim - 7) / 10) * (-0.80277-(-212.2085+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-60))*-350)));
            zz = 7.1289 + (((tickAnim - 7) / 10) * (-1.77332-(7.1289)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 172.1982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-200 + (((tickAnim - 17) / 3) * (116.98106-(172.1982+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-200)));
            yy = -0.80277 + (((tickAnim - 17) / 3) * (-1.7661-(-0.80277)));
            zz = -1.77332 + (((tickAnim - 17) / 3) * (-19.3013-(-1.77332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -26.78762 + (((tickAnim - 0) / 11) * (-18.649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*30-(-26.78762)));
            yy = 33.96915 + (((tickAnim - 0) / 11) * (208.4981+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-380-(33.96915)));
            zz = 5.60991 + (((tickAnim - 0) / 11) * (-3.6094-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-60-(5.60991)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -18.649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*30 + (((tickAnim - 11) / 9) * (-26.78762-(-18.649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*30)));
            yy = 208.4981+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-380 + (((tickAnim - 11) / 9) * (33.96915-(208.4981+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-380)));
            zz = -3.6094-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-60 + (((tickAnim - 11) / 9) * (5.60991-(-3.6094-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-60)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 3.51552 + (((tickAnim - 0) / 7) * (20.2841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(3.51552)));
            yy = -59.25083 + (((tickAnim - 0) / 7) * (-36.68319-(-59.25083)));
            zz = 61.34313 + (((tickAnim - 0) / 7) * (14.70564-(61.34313)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 20.2841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 7) / 6) * (53.43314-(20.2841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = -36.68319 + (((tickAnim - 7) / 6) * (-31.62012-(-36.68319)));
            zz = 14.70564 + (((tickAnim - 7) / 6) * (30.97624-(14.70564)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 53.43314 + (((tickAnim - 13) / 7) * (3.51552-(53.43314)));
            yy = -31.62012 + (((tickAnim - 13) / 7) * (-59.25083-(-31.62012)));
            zz = 30.97624 + (((tickAnim - 13) / 7) * (61.34313-(30.97624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -77.38815 + (((tickAnim - 0) / 3) * (-55.41902-(-77.38815)));
            yy = -1.23471 + (((tickAnim - 0) / 3) * (-1.03202-(-1.23471)));
            zz = -52.42062 + (((tickAnim - 0) / 3) * (-43.81517-(-52.42062)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -55.41902 + (((tickAnim - 3) / 5) * (91-(-55.41902)));
            yy = -1.03202 + (((tickAnim - 3) / 5) * (0-(-1.03202)));
            zz = -43.81517 + (((tickAnim - 3) / 5) * (0-(-43.81517)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 91 + (((tickAnim - 8) / 5) * (63.22015-(91)));
            yy = 0 + (((tickAnim - 8) / 5) * (-19.29185-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-16.92683-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 63.22015 + (((tickAnim - 13) / 7) * (-77.38815-(63.22015)));
            yy = -19.29185 + (((tickAnim - 13) / 7) * (-1.23471-(-19.29185)));
            zz = -16.92683 + (((tickAnim - 13) / 7) * (-52.42062-(-16.92683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.3), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+30))*-10), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+30))*7));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705))*-0.5);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705))*0.05);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.3), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705-30))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+80))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705-40))*-10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+100))*4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705-60))*-17), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+80))*7));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*-0.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+50))*15), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+5))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*-0.5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+20))*-3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/0.705+5))*-2));


        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(0);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.03);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(0);


        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(0);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.705))*0.03);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(0);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStenokranio entity = (EntityPrehistoricFloraStenokranio) entitylivingbaseIn;

        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.8382 + (((tickAnim - 0) / 6) * (7.91866-(5.8382)));
            yy = 17.27042 + (((tickAnim - 0) / 6) * (-32.34357-(17.27042)));
            zz = 7.36644 + (((tickAnim - 0) / 6) * (37.1303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40-(7.36644)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 7.91866 + (((tickAnim - 6) / 5) * (17.57495-(7.91866)));
            yy = -32.34357 + (((tickAnim - 6) / 5) * (-63.08888-(-32.34357)));
            zz = 37.1303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40 + (((tickAnim - 6) / 5) * (-16.02898-(37.1303+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 17.57495 + (((tickAnim - 11) / 7) * (11.92894-(17.57495)));
            yy = -63.08888 + (((tickAnim - 11) / 7) * (-24.92023-(-63.08888)));
            zz = -16.02898 + (((tickAnim - 11) / 7) * (-5.44365-(-16.02898)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 11.92894 + (((tickAnim - 18) / 10) * (5.8382-(11.92894)));
            yy = -24.92023 + (((tickAnim - 18) / 10) * (17.27042-(-24.92023)));
            zz = -5.44365 + (((tickAnim - 18) / 10) * (7.36644-(-5.44365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.53052 + (((tickAnim - 0) / 6) * (-28.5377+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(12.53052)));
            yy = -7.57033 + (((tickAnim - 0) / 6) * (5.03284-(-7.57033)));
            zz = 18.07403 + (((tickAnim - 0) / 6) * (44.7803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40-(18.07403)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -28.5377+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 6) / 5) * (-29.93574-(-28.5377+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = 5.03284 + (((tickAnim - 6) / 5) * (32.732-(5.03284)));
            zz = 44.7803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40 + (((tickAnim - 6) / 5) * (18.001-(44.7803+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -29.93574 + (((tickAnim - 11) / 7) * (-10.17512-(-29.93574)));
            yy = 32.732 + (((tickAnim - 11) / 7) * (13.381-(32.732)));
            zz = 18.001 + (((tickAnim - 11) / 7) * (16.51632-(18.001)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -10.17512 + (((tickAnim - 18) / 10) * (12.53052-(-10.17512)));
            yy = 13.381 + (((tickAnim - 18) / 10) * (-7.57033-(13.381)));
            zz = 16.51632 + (((tickAnim - 18) / 10) * (18.07403-(16.51632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 5.11035 + (((tickAnim - 0) / 6) * (137.7155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90-(5.11035)));
            yy = -32.22282 + (((tickAnim - 0) / 6) * (-2.50702-(-32.22282)));
            zz = -13.93555 + (((tickAnim - 0) / 6) * (23.0642+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40-(-13.93555)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 137.7155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90 + (((tickAnim - 6) / 3) * (3.91877-(137.7155+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90)));
            yy = -2.50702 + (((tickAnim - 6) / 3) * (-1.68649-(-2.50702)));
            zz = 23.0642+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40 + (((tickAnim - 6) / 3) * (-12.61027-(23.0642+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 3.91877 + (((tickAnim - 9) / 2) * (26.94206-(3.91877)));
            yy = -1.68649 + (((tickAnim - 9) / 2) * (4.52003-(-1.68649)));
            zz = -12.61027 + (((tickAnim - 9) / 2) * (-7.79073-(-12.61027)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 26.94206 + (((tickAnim - 11) / 7) * (-0.13821-(26.94206)));
            yy = 4.52003 + (((tickAnim - 11) / 7) * (-20.70653-(4.52003)));
            zz = -7.79073 + (((tickAnim - 11) / 7) * (-10.15401-(-7.79073)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -0.13821 + (((tickAnim - 18) / 10) * (5.11035-(-0.13821)));
            yy = -20.70653 + (((tickAnim - 18) / 10) * (-32.22282-(-20.70653)));
            zz = -10.15401 + (((tickAnim - 18) / 10) * (-13.93555-(-10.15401)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handright, handright.rotateAngleX + (float) Math.toRadians(xx), handright.rotateAngleY + (float) Math.toRadians(yy), handright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 9.36222 + (((tickAnim - 0) / 12) * (5.8382-(9.36222)));
            yy = 34.78006 + (((tickAnim - 0) / 12) * (-17.2704-(34.78006)));
            zz = 14.81553 + (((tickAnim - 0) / 12) * (7.36644-(14.81553)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 5.8382 + (((tickAnim - 12) / 6) * (-3.41456-(5.8382)));
            yy = -17.2704 + (((tickAnim - 12) / 6) * (18.70864-(-17.2704)));
            zz = 7.36644 + (((tickAnim - 12) / 6) * (2.9569+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20-(7.36644)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -3.41456 + (((tickAnim - 18) / 5) * (10.947-(-3.41456)));
            yy = 18.70864 + (((tickAnim - 18) / 5) * (66.06007-(18.70864)));
            zz = 2.9569+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20 + (((tickAnim - 18) / 5) * (20.55062-(2.9569+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 10.947 + (((tickAnim - 23) / 5) * (9.36222-(10.947)));
            yy = 66.06007 + (((tickAnim - 23) / 5) * (34.78006-(66.06007)));
            zz = 20.55062 + (((tickAnim - 23) / 5) * (14.81553-(20.55062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -29.23331 + (((tickAnim - 0) / 12) * (11.41261-(-29.23331)));
            yy = -14.69432 + (((tickAnim - 0) / 12) * (9.18028-(-14.69432)));
            zz = -11.51598 + (((tickAnim - 0) / 12) * (-25.73704-(-11.51598)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 11.41261 + (((tickAnim - 12) / 6) * (-18.5463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(11.41261)));
            yy = 9.18028 + (((tickAnim - 12) / 6) * (-3.23419-(9.18028)));
            zz = -25.73704 + (((tickAnim - 12) / 6) * (-13.7117+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20-(-25.73704)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -18.5463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 18) / 5) * (-29.93574-(-18.5463+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = -3.23419 + (((tickAnim - 18) / 5) * (-32.73198-(-3.23419)));
            zz = -13.7117+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20 + (((tickAnim - 18) / 5) * (-18.00104-(-13.7117+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -29.93574 + (((tickAnim - 23) / 5) * (-29.23331-(-29.93574)));
            yy = -32.73198 + (((tickAnim - 23) / 5) * (-14.69432-(-32.73198)));
            zz = -18.00104 + (((tickAnim - 23) / 5) * (-11.51598-(-18.00104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 18.75 + (((tickAnim - 0) / 7) * (-9.84239-(18.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (20.53838-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.86487-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -9.84239 + (((tickAnim - 7) / 5) * (-23.89605-(-9.84239)));
            yy = 20.53838 + (((tickAnim - 7) / 5) * (34.74228-(20.53838)));
            zz = 3.86487 + (((tickAnim - 7) / 5) * (-4.80577-(3.86487)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -23.89605 + (((tickAnim - 12) / 6) * (174.0607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90-(-23.89605)));
            yy = 34.74228 + (((tickAnim - 12) / 6) * (13.45688-(34.74228)));
            zz = -4.80577 + (((tickAnim - 12) / 6) * (17.8494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40-(-4.80577)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 174.0607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90 + (((tickAnim - 18) / 4) * (8.25-(174.0607+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-90)));
            yy = 13.45688 + (((tickAnim - 18) / 4) * (0-(13.45688)));
            zz = 17.8494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40 + (((tickAnim - 18) / 4) * (0-(17.8494+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-20))*-40)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 22) / 1) * (30.25-(8.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 30.25 + (((tickAnim - 23) / 5) * (18.75-(30.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handleft, handleft.rotateAngleX + (float) Math.toRadians(xx), handleft.rotateAngleY + (float) Math.toRadians(yy), handleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 7) / 16) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 16) * (0-(0.5)));
            zz = 0 + (((tickAnim - 7) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handleft.rotationPointX = this.handleft.rotationPointX + (float)(xx);
        this.handleft.rotationPointY = this.handleft.rotationPointY - (float)(yy);
        this.handleft.rotationPointZ = this.handleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.5 + (((tickAnim - 0) / 3) * (8.25-(2.5)));
            yy = -37.75 + (((tickAnim - 0) / 3) * (-47-(-37.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 3) / 5) * (-16.85168-(8.25)));
            yy = -47 + (((tickAnim - 3) / 5) * (-14.86172-(-47)));
            zz = 0 + (((tickAnim - 3) / 5) * (-7.2388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -16.85168 + (((tickAnim - 8) / 6) * (12.06408-(-16.85168)));
            yy = -14.86172 + (((tickAnim - 8) / 6) * (24.4298-(-14.86172)));
            zz = -7.2388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50 + (((tickAnim - 8) / 6) * (14.3078-(-7.2388+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-50)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 12.06408 + (((tickAnim - 14) / 14) * (2.5-(12.06408)));
            yy = 24.4298 + (((tickAnim - 14) / 14) * (-37.75-(24.4298)));
            zz = 14.3078 + (((tickAnim - 14) / 14) * (0-(14.3078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.25 + (((tickAnim - 0) / 8) * (-6.36256-(2.25)));
            yy = 14.5 + (((tickAnim - 0) / 8) * (9.8349-(14.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (-23.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -6.36256 + (((tickAnim - 8) / 6) * (-5-(-6.36256)));
            yy = 9.8349 + (((tickAnim - 8) / 6) * (0-(9.8349)));
            zz = -23.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70 + (((tickAnim - 8) / 6) * (-26.25-(-23.4718+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 14) / 14) * (2.25-(-5)));
            yy = 0 + (((tickAnim - 14) / 14) * (14.5-(0)));
            zz = -26.25 + (((tickAnim - 14) / 14) * (0-(-26.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 25 + (((tickAnim - 0) / 3) * (39.25-(25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (69.7184-(0)));
            yy = 39.25 + (((tickAnim - 3) / 5) * (68.15271-(39.25)));
            zz = 0 + (((tickAnim - 3) / 5) * (8.1568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 69.7184 + (((tickAnim - 8) / 5) * (0-(69.7184)));
            yy = 68.15271 + (((tickAnim - 8) / 5) * (0-(68.15271)));
            zz = 8.1568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70 + (((tickAnim - 8) / 5) * (0-(8.1568+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (17.25-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 17.25 + (((tickAnim - 14) / 14) * (0-(17.25)));
            yy = 0 + (((tickAnim - 14) / 14) * (25-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footleft, footleft.rotateAngleX + (float) Math.toRadians(xx), footleft.rotateAngleY + (float) Math.toRadians(yy), footleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 12.06408 + (((tickAnim - 0) / 18) * (8.25-(12.06408)));
            yy = -24.42982 + (((tickAnim - 0) / 18) * (47-(-24.42982)));
            zz = -14.3078 + (((tickAnim - 0) / 18) * (0-(-14.3078)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 8.25 + (((tickAnim - 18) / 5) * (-13.19259-(8.25)));
            yy = 47 + (((tickAnim - 18) / 5) * (-1.9072-(47)));
            zz = 0 + (((tickAnim - 18) / 5) * (-5.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -13.19259 + (((tickAnim - 23) / 5) * (12.06408-(-13.19259)));
            yy = -1.9072 + (((tickAnim - 23) / 5) * (-24.42982-(-1.9072)));
            zz = -5.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50 + (((tickAnim - 23) / 5) * (-14.3078-(-5.1205+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 0) / 18) * (14.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 18) * (14.5-(0)));
            zz = 26.25 + (((tickAnim - 0) / 18) * (0-(26.25)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 14.5 + (((tickAnim - 18) / 5) * (-2.29252-(14.5)));
            yy = 14.5 + (((tickAnim - 18) / 5) * (19.35921-(14.5)));
            zz = 0 + (((tickAnim - 18) / 5) * (-11.5531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*70-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -2.29252 + (((tickAnim - 23) / 5) * (-5-(-2.29252)));
            yy = 19.35921 + (((tickAnim - 23) / 5) * (0-(19.35921)));
            zz = -11.5531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*70 + (((tickAnim - 23) / 5) * (26.25-(-11.5531+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*70)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.10011 + (((tickAnim - 0) / 8) * (-12.19902-(10.10011)));
            yy = -10.95423 + (((tickAnim - 0) / 8) * (-49.0508-(-10.95423)));
            zz = -7.59603 + (((tickAnim - 0) / 8) * (-9.87603-(-7.59603)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.19902 + (((tickAnim - 8) / 10) * (0-(-12.19902)));
            yy = -49.0508 + (((tickAnim - 8) / 10) * (-63.25-(-49.0508)));
            zz = -9.87603 + (((tickAnim - 8) / 10) * (0-(-9.87603)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (78.54262-(0)));
            yy = -63.25 + (((tickAnim - 18) / 5) * (-51.1611-(-63.25)));
            zz = 0 + (((tickAnim - 18) / 5) * (31.9108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 78.54262 + (((tickAnim - 23) / 4) * (-11.42639-(78.54262)));
            yy = -51.1611 + (((tickAnim - 23) / 4) * (-9.64462-(-51.1611)));
            zz = 31.9108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70 + (((tickAnim - 23) / 4) * (-16.53595-(31.9108+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30))*-70)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -11.42639 + (((tickAnim - 27) / 1) * (10.10011-(-11.42639)));
            yy = -9.64462 + (((tickAnim - 27) / 1) * (-10.95423-(-9.64462)));
            zz = -16.53595 + (((tickAnim - 27) / 1) * (-7.59603-(-16.53595)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footright, footright.rotateAngleX + (float) Math.toRadians(xx), footright.rotateAngleY + (float) Math.toRadians(yy), footright.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1))*0.8), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1+20))*1), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255+5))*2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508))*-0.1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1-70))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1+10))*-5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255+10))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1-70))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255+10))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1-100))*-2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1-80))*-8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255+10))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1-30))*0.5), body.rotateAngleY + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1+50))*1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255-30))*1.5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/1-70))*-0.5), neck.rotateAngleY + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255/1+50))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*255-50))*1.3));


        this.jawslope.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-50))*0.1),(float)1);


        this.eyeright.rotationPointX = this.eyeright.rotationPointX + (float)(0);
        this.eyeright.rotationPointY = this.eyeright.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508))*-0.05);
        this.eyeright.rotationPointZ = this.eyeright.rotationPointZ + (float)(0);


        this.eyeleft.rotationPointX = this.eyeleft.rotationPointX + (float)(0);
        this.eyeleft.rotationPointY = this.eyeleft.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508))*-0.05);
        this.eyeleft.rotationPointZ = this.eyeleft.rotationPointZ + (float)(0);


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStenokranio e = (EntityPrehistoricFloraStenokranio) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
