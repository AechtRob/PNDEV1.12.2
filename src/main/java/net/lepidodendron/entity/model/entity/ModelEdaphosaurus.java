package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEdaphosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEdaphosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL1;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegL4;
    private final AdvancedModelRendererExtended hindlegL5;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended hindlegL6;
    private final AdvancedModelRendererExtended hindlegL7;
    private final AdvancedModelRendererExtended frontlegL;
    private final AdvancedModelRendererExtended frontlegL1;
    private final AdvancedModelRendererExtended frontlegL2;
    private final AdvancedModelRendererExtended frontlegL3;
    private final AdvancedModelRendererExtended frontlegL4;
    private final AdvancedModelRendererExtended frontlegL5;
    private final AdvancedModelRendererExtended frontlegL6;
    private final AdvancedModelRendererExtended frontlegL7;

    private ModelAnimator animator;

    public ModelEdaphosaurus() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 23.5F, -12.0F);
        this.body.cubeList.add(new ModelBox(body, 30, 58, -0.5F, -22.25F, 1.25F, 1, 11, 0, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, 0.0F, -25.75F, -1.5F, 0, 14, 16, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -12.25F, -1.5F, 7, 9, 16, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -12.0648F, 13.6443F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8727F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, -0.5F, -1.2916F, -0.3216F, 1, 2, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -12.3087F, 10.9563F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -4.9277F, -0.175F, 1, 7, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -12.2612F, 8.4698F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5672F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 58, -0.5F, -10.3037F, -0.1035F, 1, 11, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -12.2612F, 7.2198F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 58, -0.5F, -12.9813F, -0.6789F, 1, 14, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -12.2612F, 5.9698F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 58, -0.5F, -11.7518F, -0.9585F, 1, 13, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -12.25F, 3.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 58, -0.5F, -11.0F, 0.0F, 1, 12, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -12.0F, -0.75F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 9, -0.5F, -4.25F, 0.0F, 1, 5, 0, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -10.75F, -1.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 42, 47, -2.0F, -1.0F, -3.75F, 4, 4, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 42, 63, 0.0F, -11.0F, -4.0F, 0, 10, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 3.0F, -3.5F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 45, 30, -1.5F, -3.05F, -0.25F, 3, 3, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -1.25F, 0.75F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 12, -0.5F, -8.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -0.8278F, -2.4929F);
        this.neck.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 12, -0.5F, -2.5405F, 0.4871F, 1, 3, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -1.0F, -1.25F);
        this.neck.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 9, -0.5F, -5.5F, 0.25F, 1, 6, 0, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.5F, -3.75F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 30, 7, -1.5F, -0.5F, -1.95F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 77, 39, -1.25F, 0.75F, -4.5F, 0, 1, 3, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 77, 39, 1.25F, 0.75F, -4.5F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 55, 39, -1.5F, 0.5F, -4.75F, 3, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 1.5F, -3.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.5708F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 78, 40, -1.0F, -0.75F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -0.5F, -2.95F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 60, 19, -1.5F, 0.1305F, -2.0086F, 3, 1, 2, -0.02F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -0.5F, -1.95F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 25, -1.5F, 0.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 39, -1.5F, 0.0F, -4.75F, 3, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 77, 39, 1.1F, -0.25F, -4.5F, 0, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 77, 39, -1.1F, -0.25F, -4.5F, 0, 1, 3, 0.0F, true));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 34, 47, -1.0F, -1.5F, -1.45F, 2, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -4.75F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 9, -1.0F, 0.05F, 0.175F, 2, 1, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -1.5708F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 40, -1.0F, -0.25F, -1.0F, 0, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -9.0F, 14.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 36, 0.0F, -15.75F, 0.0F, 0, 13, 11, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 79, 26, 0.0F, -8.75F, 11.0F, 0, 4, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -2.0F, 0.5F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 28, -3.0F, -1.0F, -1.5F, 6, 8, 11, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -2.859F, 5.3937F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.3526F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 4, 0, -0.5F, -4.9631F, 0.1374F, 1, 6, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -13.6341F, 0.8204F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6981F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 64, -0.5F, -2.3522F, -0.0308F, 1, 4, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, -9.8523F, 2.5477F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.8727F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 0, -0.5F, -6.4879F, -0.2453F, 1, 6, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, -3.3087F, -3.5437F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.7418F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 0, -0.5F, -9.6777F, -0.175F, 1, 4, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(0.0F, -7.9264F, 4.5713F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.0908F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 16, -0.5F, -6.0092F, -0.0858F, 1, 6, 0, 0.0F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, -3.0648F, -0.8557F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.8727F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 16, -0.5F, -7.2916F, -0.3216F, 1, 5, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, -2.859F, 1.8937F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -1.0036F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 6, -0.5F, -4.3177F, -0.2465F, 1, 6, 0, 0.0F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.0F, -5.2114F, 5.5895F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.3526F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 6, -0.5F, -3.9367F, -0.2483F, 1, 4, 0, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 9.75F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.2618F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 0, -2.0F, -0.9353F, -0.7415F, 4, 6, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.5647F, 9.2585F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 16, -1.5F, -0.75F, -1.0F, 3, 4, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 47, -1.0F, -1.0F, -1.0F, 2, 3, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.4F, 7.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.9F, -1.0F, 1, 2, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 6.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 5, 64, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(2.5F, 3.5F, 7.0F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.3491F, 0.0F);


        this.hindlegL1 = new AdvancedModelRendererExtended(this);
        this.hindlegL1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.hindlegL.addChild(hindlegL1);
        this.setRotateAngle(hindlegL1, 0.0F, 0.0F, -1.2217F);


        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(1.5F, 2.0F, 0.0F);
        this.hindlegL1.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.1309F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 55, 45, -2.0F, -2.0F, -1.5F, 3, 4, 3, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(1.5F, 4.0F, 0.0F);
        this.hindlegL1.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, 0.0F, 1.2217F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 30, 0, -1.49F, 0.0F, -1.49F, 2, 4, 3, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, -0.6981F, 0.0F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 48, 0, -1.5F, 0.0F, -3.9F, 3, 1, 5, 0.0F, false));

        this.hindlegL4 = new AdvancedModelRendererExtended(this);
        this.hindlegL4.setRotationPoint(-2.5F, 3.5F, 7.0F);
        this.body2.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, -0.3491F, 0.0F);


        this.hindlegL5 = new AdvancedModelRendererExtended(this);
        this.hindlegL5.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, 0.0F, 1.2217F);


        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-1.5F, 2.0F, 0.0F);
        this.hindlegL5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.1309F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 55, 45, -1.0F, -2.0F, -1.5F, 3, 4, 3, 0.0F, true));

        this.hindlegL6 = new AdvancedModelRendererExtended(this);
        this.hindlegL6.setRotationPoint(-1.5F, 4.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 0.0F, 0.0F, -1.2217F);
        this.hindlegL6.cubeList.add(new ModelBox(hindlegL6, 30, 0, -0.51F, 0.0F, -1.49F, 2, 4, 3, 0.0F, true));

        this.hindlegL7 = new AdvancedModelRendererExtended(this);
        this.hindlegL7.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.hindlegL6.addChild(hindlegL7);
        this.setRotateAngle(hindlegL7, 0.0F, 0.6981F, 0.0F);
        this.hindlegL7.cubeList.add(new ModelBox(hindlegL7, 48, 0, -1.5F, 0.0F, -3.9F, 3, 1, 5, 0.0F, true));

        this.frontlegL = new AdvancedModelRendererExtended(this);
        this.frontlegL.setRotationPoint(3.0F, -5.5F, 1.5F);
        this.body.addChild(frontlegL);
        this.setRotateAngle(frontlegL, 0.0F, -0.6981F, 0.0F);


        this.frontlegL1 = new AdvancedModelRendererExtended(this);
        this.frontlegL1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.frontlegL.addChild(frontlegL1);
        this.setRotateAngle(frontlegL1, 0.0F, 0.0F, -1.2217F);
        this.frontlegL1.cubeList.add(new ModelBox(frontlegL1, 57, 29, 0.0F, 0.0F, -1.0F, 3, 4, 3, 0.0F, false));

        this.frontlegL2 = new AdvancedModelRendererExtended(this);
        this.frontlegL2.setRotationPoint(1.5F, 4.0F, 0.5F);
        this.frontlegL1.addChild(frontlegL2);
        this.setRotateAngle(frontlegL2, 0.0F, 0.3491F, 1.2217F);
        this.frontlegL2.cubeList.add(new ModelBox(frontlegL2, 22, 47, -1.49F, -1.0F, -0.99F, 2, 5, 2, 0.0F, false));

        this.frontlegL3 = new AdvancedModelRendererExtended(this);
        this.frontlegL3.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.frontlegL2.addChild(frontlegL3);
        this.frontlegL3.cubeList.add(new ModelBox(frontlegL3, 50, 56, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, false));

        this.frontlegL4 = new AdvancedModelRendererExtended(this);
        this.frontlegL4.setRotationPoint(-3.0F, -5.5F, 1.5F);
        this.body.addChild(frontlegL4);
        this.setRotateAngle(frontlegL4, 0.0F, 0.6981F, 0.0F);


        this.frontlegL5 = new AdvancedModelRendererExtended(this);
        this.frontlegL5.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.frontlegL4.addChild(frontlegL5);
        this.setRotateAngle(frontlegL5, 0.0F, 0.0F, 1.2217F);
        this.frontlegL5.cubeList.add(new ModelBox(frontlegL5, 57, 29, -3.0F, 0.0F, -1.0F, 3, 4, 3, 0.0F, true));

        this.frontlegL6 = new AdvancedModelRendererExtended(this);
        this.frontlegL6.setRotationPoint(-1.5F, 4.0F, 0.5F);
        this.frontlegL5.addChild(frontlegL6);
        this.setRotateAngle(frontlegL6, 0.0F, -0.3491F, -1.2217F);
        this.frontlegL6.cubeList.add(new ModelBox(frontlegL6, 22, 47, -0.51F, -1.0F, -0.99F, 2, 5, 2, 0.0F, true));

        this.frontlegL7 = new AdvancedModelRendererExtended(this);
        this.frontlegL7.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.frontlegL6.addChild(frontlegL7);
        this.frontlegL7.cubeList.add(new ModelBox(frontlegL7, 50, 56, -1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.8f);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(25);
        this.neck.offsetY = 0.1F;
        this.neck.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 0.3F;

        EntityPrehistoricFloraEdaphosaurus Edaphosaurus = (EntityPrehistoricFloraEdaphosaurus) e;
        float masterSpeed = Edaphosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Edaphosaurus.getAnimation() == Edaphosaurus.LAY_ANIMATION) {
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, 0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !Edaphosaurus.getIsMoving()) { //Not moving
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), -0.06F, -0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.225F;
        if (Edaphosaurus.getIsFast()) {
            speed = speed * 2;
        }

        this.frontlegL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.frontlegL4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.hindlegL1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.hindlegL4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(frontlegL1, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(frontlegL4, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(hindlegL1, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(hindlegL4, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(frontlegL1, speed, 0.40F, true, 5, 0.30F, f2, 1F);
        this.walk(frontlegL4, speed, 0.40F, true, 8, 0.30F, f2, 1F);
        this.walk(hindlegL1, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(hindlegL4, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(frontlegL2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(frontlegL5, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(hindlegL2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(hindlegL5, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(frontlegL2, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(frontlegL5, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(hindlegL2, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(hindlegL5, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(frontlegL3, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(frontlegL6, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(hindlegL3, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(hindlegL6, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(body, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.swing(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.swing(body, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.swing(neck, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);

        //this.walk(neck, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        if (Edaphosaurus.getAnimation() != Edaphosaurus.ATTACK_ANIMATION
                && Edaphosaurus.getAnimation() != Edaphosaurus.EAT_ANIMATION) {
            this.swing(neck, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(neck, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }

        //this.chainWave(Tail, (speed*0.6F), -0.085F, -0.2F, f2, 1F);
        this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEdaphosaurus e = (EntityPrehistoricFloraEdaphosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(-16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(3.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(16), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
