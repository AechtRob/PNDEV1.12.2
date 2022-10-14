package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSmilosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSmilosuchus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended tail6;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegL3;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegR3;

    private ModelAnimator animator;

    public ModelSmilosuchus() {
        this.textureWidth = 164;
        this.textureHeight = 164;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -3.65F, -28.25F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, 0.0F, 9.25F, 14, 15, 21, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 92, 53, -1.5F, -1.25F, 11.75F, 3, 2, 19, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 6.0F, 29.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 36, -6.5F, -5.75F, -2.0F, 13, 14, 21, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 112, -1.49F, -7.15F, 1.5F, 3, 2, 18, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 7.25F, 19.0F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 36, -6.0F, 0.0F, -20.0F, 12, 1, 20, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -5.0F, 19.0F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.1047F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 134, 133, -1.5F, -2.5F, 0.5F, 3, 3, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 74, 99, -5.0F, -0.5F, -2.0F, 10, 13, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 8.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 116, 13, -0.99F, -3.25F, -0.5F, 2, 3, 17, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 70, 0, -4.0F, -1.1F, -0.7F, 8, 13, 17, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 17.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 89, -1.0F, -3.0F, -0.75F, 2, 3, 20, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 57, -3.0F, -1.0F, -1.0F, 6, 12, 20, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 4.0F, 18.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 114, -0.99F, -5.5F, 1.25F, 2, 3, 18, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 71, -2.5F, -3.5F, -1.0F, 5, 9, 20, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 2.0F, 19.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 124, 116, -1.0F, -5.5F, 0.25F, 2, 2, 13, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 93, 32, -2.0F, -3.5F, -1.0F, 4, 6, 15, 0.0F, false));

        this.tail6 = new AdvancedModelRendererExtended(this);
        this.tail6.setRotationPoint(0.0F, -1.0F, 13.5F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 111, 8, -0.5F, -3.25F, 0.0F, 1, 2, 5, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 8, 129, -1.5F, -1.5F, -1.0F, 3, 4, 7, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(6.0F, 1.0F, 17.25F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.1745F, 0.0F, -0.5236F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 88, 124, -4.984F, -0.4174F, -3.7717F, 6, 13, 6, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(-2.0F, 12.0F, -0.5F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.1745F, -0.1309F, 0.48F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 0, 71, -2.5416F, -0.9898F, -2.7854F, 5, 9, 5, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(0.0F, 7.5F, 0.5F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.0175F, 0.0F, 0.0262F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 118, 99, -4.2916F, 0.0102F, -9.5354F, 9, 2, 12, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-6.0F, 1.0F, 17.25F);
        this.body2.addChild(hindlegR);
        this.setRotateAngle(hindlegR, -0.1745F, 0.0F, 0.5236F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 54, 89, -1.016F, -0.4174F, -3.7717F, 6, 13, 6, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(2.0F, 12.0F, -0.5F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.1745F, 0.1309F, -0.48F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 47, 36, -2.4584F, -0.9898F, -2.7854F, 5, 9, 5, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(0.0F, 7.5F, 0.5F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.0175F, 0.0F, -0.0262F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 116, 33, -4.7084F, 0.0102F, -9.5354F, 9, 2, 12, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 5.25F, 11.25F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 88, 77, -5.5F, -4.75F, -11.5F, 11, 10, 12, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 80, 57, -1.49F, -6.0F, -11.51F, 3, 2, 12, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 5.0F, -11.5F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 117, 53, -4.5F, -1.7F, 0.0F, 9, 4, 12, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 3.0F, -11.5F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 122, 74, -3.0F, -4.5F, -7.75F, 6, 6, 8, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(-1.0F, -1.5F, 0.5F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 62, 14, -0.4F, 1.49F, -28.01F, 1, 2, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 70, 30, 0.4F, 1.5F, -28.0F, 2, 2, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 17, 0, 2.15F, -0.25F, -27.0F, 0, 2, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 15, 0, -0.15F, -0.25F, -27.0F, 0, 2, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 98, 57, 0.1F, 1.49F, -25.01F, 1, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 80, 57, 0.9F, 1.5F, -25.0F, 1, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 9, 47, 1.65F, 0.5F, -25.5F, 0, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 9, 46, 0.35F, 0.5F, -25.5F, 0, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 140, 0, -0.5F, 1.5F, -20.0F, 3, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 17, 35, 2.15F, 0.5F, -20.0F, 0, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 15, 35, -0.15F, 0.5F, -20.0F, 0, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 49, 14, -1.0F, 1.5F, -15.0F, 4, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 137, 10, -2.0F, 1.5F, -10.0F, 6, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 70, 122, -2.5F, 1.5F, -5.0F, 7, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(1.0F, 1.5F, -9.5F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -3.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 100, -4.0F, 0.0F, 1.0F, 8, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.5F, 3.5F, -18.5F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2199F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 100, 0.0F, -2.01F, 0.0F, 2, 2, 19, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.5F, 3.5F, -18.5F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 5, 0.25F, -3.015F, 0.5F, 0, 1, 10, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(2.5F, 3.5F, -18.5F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, -0.25F, -3.015F, 0.5F, 0, 1, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(2.5F, 3.5F, -18.5F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2199F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 95, 103, -2.0F, -2.015F, 0.0F, 2, 2, 19, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(1.0F, 3.5F, -20.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 132, -2.5F, -3.725F, 11.7F, 5, 2, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, 3.5F, -20.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 112, -1.5F, -2.0F, 6.0F, 3, 2, 6, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 120, -1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.5F, -28.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 36, -0.4F, -1.8F, 0.2F, 1, 2, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 36, 1.4F, -1.8F, 0.2F, 1, 2, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(1.0F, 1.5F, -9.5F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 134, 88, -4.5F, -2.75F, 5.0F, 9, 3, 5, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(-1.0F, -1.5F, 0.5F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.1745F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 43, 71, 3.0F, -9.0F, 14.0F, 1, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 121, -3.5F, -8.0F, 13.0F, 9, 7, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 0, -4.0F, -8.0F, 14.0F, 10, 7, 7, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, -1.25F, -1.5F, 5.25F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 1, 3.25F, -1.5F, 5.25F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 140, -1.5F, -5.5F, 5.25F, 5, 4, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 15, -0.75F, -1.5F, 2.25F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 16, 2.75F, -1.5F, 2.25F, 0, 1, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 152, -0.5F, -2.5F, 2.24F, 3, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 121, -1.0F, -5.5F, 2.25F, 4, 4, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, 0.25F, -1.5F, -5.75F, 0, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 15, 1.75F, -1.5F, -5.75F, 0, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 128, 0.0F, -3.5F, -6.25F, 2, 2, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 59, 50, -2.0F, -9.0F, 14.0F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 13, 4.25F, -1.75F, 8.0F, 0, 1, 4, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 49, -2.25F, -1.75F, 8.0F, 0, 1, 4, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 135, -2.5F, -5.75F, 8.0F, 7, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -1.25F, -20.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 0, -0.49F, -2.86F, 8.75F, 3, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 71, -0.99F, -2.85F, 6.25F, 4, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, -1.25F, -20.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 47, 50, -1.0F, -8.1F, 8.2F, 4, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -1.25F, -20.0F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 112, -1.5F, -7.65F, 7.75F, 5, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -1.25F, -20.0F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 118, 113, -0.5F, -4.5F, 4.0F, 3, 2, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 1, 2.25F, -1.25F, 1.25F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 0, -0.25F, -1.25F, 1.25F, 0, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.25F, -1.75F, -0.75F, 0, 2, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 2, 2.25F, -1.75F, -0.75F, 0, 2, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 159, 0.0F, -2.25F, -0.76F, 2, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 137, 17, -0.5F, -4.25F, -0.75F, 3, 3, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 80, 0.1F, -4.73F, -5.25F, 1, 1, 9, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 71, 136, 0.9F, -4.74F, -5.25F, 1, 1, 9, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 0, -0.25F, -4.0F, -6.0F, 0, 2, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 2, 2.25F, -4.0F, -6.0F, 0, 2, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.0F, -1.5F, -21.0F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 51, -0.5F, -6.25F, -6.0F, 3, 2, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(6.0F, 10.0F, 11.5F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.48F, 0.0F, -0.6981F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 0, 36, -3.984F, 0.5826F, -2.7717F, 5, 10, 5, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(-2.0F, 10.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.3491F, 0.0F, 0.7418F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 100, -1.2916F, -0.9898F, -2.2854F, 4, 9, 4, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(0.0F, 7.5F, 0.5F);
        this.forelegL2.addChild(forelegL3);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 112, 131, -2.7916F, 0.0102F, -6.5354F, 7, 2, 8, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-6.0F, 10.0F, 11.5F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.48F, 0.0F, 0.6981F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 0, 0, -1.016F, 0.5826F, -2.7717F, 5, 10, 5, 0.0F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(2.0F, 10.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, -0.3491F, 0.0F, -0.7418F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 91, 30, -2.7084F, -0.9898F, -2.2854F, 4, 9, 4, 0.0F, false));

        this.forelegR3 = new AdvancedModelRendererExtended(this);
        this.forelegR3.setRotationPoint(0.0F, 7.5F, 0.5F);
        this.forelegR2.addChild(forelegR3);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 118, 0, -4.2084F, 0.0102F, -6.5354F, 7, 2, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.85F);
    }
    
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.neck.offsetY = -0.08F;
        this.head.rotateAngleX = (float)Math.toRadians(-10);
        this.lowerjaw.rotateAngleX = (float)Math.toRadians(12.5);
        this.neck.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0.23F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraSmilosuchus Smilosuchus = (EntityPrehistoricFloraSmilosuchus) e;
        float masterSpeed = Smilosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] SwimBody = {this.body2, this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        AdvancedModelRenderer[] ArmR = {this.forelegR, this.forelegR2, this.forelegR2};
        AdvancedModelRenderer[] ArmL = {this.forelegL, this.forelegL2, this.forelegL2};
        AdvancedModelRenderer[] LegR = {this.hindlegR, this.hindlegR2, this.hindlegR2};
        AdvancedModelRenderer[] LegL = {this.hindlegL, this.hindlegL2, this.hindlegL2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Smilosuchus.getAnimation() == Smilosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Smilosuchus.isInWater()) {

            if (f3 == 0.0F || !Smilosuchus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Smilosuchus.getIsFast()) { //Running
                float speed = masterSpeed / 2F;

                this.hindlegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.hindlegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.walk(forelegL, speed, (float)Math.toRadians(22), true, 8.0F, -(float)Math.toRadians(15), f2, 1.0F);
                this.walk(forelegR, speed, (float)Math.toRadians(22), true, 5.0F, -(float)Math.toRadians(15), f2, 1.0F);

                this.walk(forelegL2, speed, 0.56F, true, 3.5F, 0F, f2, 1F);
                this.walk(forelegR2, speed, 0.56F, true, 6.5F, 0F, f2, 1F);

                this.walk(forelegL3, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(forelegR3, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);

                this.walk(hindlegL, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(hindlegR, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(hindlegL2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(hindlegR2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(hindlegL3, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(hindlegR3, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.bobExtended(body, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(hindlegL2, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(hindlegR2, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(body, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body2, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(neck, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);

                this.flap(hindlegL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(hindlegR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body2, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(body, speed * 2, -0.009F, false, 2.5F, 0.01F, f2, 0.8F);
                this.walk(tail, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                this.walk(neck, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(head, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 2.5F;

                this.hindlegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.hindlegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.walk(forelegL, speed, (float)Math.toRadians(18), true, 5.0F, (float)Math.toRadians(9), f2, 1.0F);
                this.walk(forelegR, speed, (float)Math.toRadians(18), true, 8.0F, (float)Math.toRadians(9), f2, 1.0F);

                this.walk(forelegL2, speed, 0.46F, true, 3.5F, 0F, f2, 1F);
                this.walk(forelegR2, speed, 0.46F, true, 6.5F, 0F, f2, 1F);

                this.walk(forelegL3, speed, (float)Math.toRadians(5), false, 4.0F, (float)Math.toRadians(3), f2, 1F);
                this.walk(forelegR3, speed, (float)Math.toRadians(5), false, 1.0F, (float)Math.toRadians(3), f2, 1F);

                this.walk(hindlegL, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
                this.walk(hindlegR, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);

                this.walk(hindlegL2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(hindlegR2, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(hindlegL3, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(hindlegR3, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.bobExtended(body, speed * 2F, 0.87F, false, 3.5F, f2, 1F);

                this.bobExtended(hindlegL2, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(hindlegR2, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(body, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body2, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(neck, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);

                this.flap(hindlegL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(hindlegR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body2, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(body, speed * 2, -0.009F, false, 2.5F, 0.01F, f2, 0.8F);
                this.walk(tail, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.5), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else { //in water:
            this.body.offsetY = 0.8F;
            float speed = masterSpeed / 2.5F;
            //In water:
            this.tail.rotateAngleX = 0;
            this.tail2.rotateAngleX = 0;
            this.tail3.rotateAngleX = 0;
            this.tail4.rotateAngleX = 0;
            this.tail5.rotateAngleX = 0;
            this.tail6.rotateAngleX = 0;
            this.neck.rotateAngleX = 0;

            this.hindlegL.rotateAngleX = (float) Math.toRadians(75);
            this.hindlegR.rotateAngleX = (float) Math.toRadians(75);
            this.hindlegL2.rotateAngleZ = 0;
            this.hindlegR2.rotateAngleZ = 0;
            this.hindlegL3.rotateAngleX = (float) Math.toRadians(69);
            this.hindlegR3.rotateAngleX = (float) Math.toRadians(69);

            this.forelegL.rotateAngleX = (float) Math.toRadians(77.5);
            this.forelegR.rotateAngleX = (float) Math.toRadians(77.5);
            this.forelegL2.rotateAngleZ = 0;
            this.forelegR2.rotateAngleZ = 0;
            this.forelegL3.rotateAngleX = (float) Math.toRadians(75);
            this.forelegR3.rotateAngleX = (float) Math.toRadians(75);

            this.bobExtended(body, speed * 0.25F, 0.1F, false, 0, f2, 1);
            this.chainWave(SwimBody, speed * 0.25F, 0.05F, -3, f2, 1);
            this.chainSwing(SwimBody, speed * 0.5F, 0.3F, -3, f2, 1);
            this.chainSwing(Neck, speed * 0.5F, 0.2F, -3, f2, 1);

            this.chainWaveExtended(ArmR, speed * 0.5F, 0.4F, -3, 1.5F, f2, 1);
            this.chainWaveExtended(ArmL, speed * 0.5F, 0.4F, -3, 4.5F, f2, 1);

            this.chainWaveExtended(LegL, speed * 0.5F, 0.2F, -3, 1.5F, f2, 1);
            this.chainWaveExtended(LegR, speed * 0.5F, 0.2F, -3, 4.5F, f2, 1);
            this.chainFlapExtended(LegL, speed * 0.5F, 0.2F, -3, 3F, f2, 1);
            this.chainFlapExtended(LegR, speed * 0.5F, 0.2F, -3, 0F, f2, 1);


        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSmilosuchus e = (EntityPrehistoricFloraSmilosuchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(lowerjaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(lowerjaw, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
