package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKeichousaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraTanystropheus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelTanystropheus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegL6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended neckbase;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended neck4;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegL3;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegR3;

    private ModelAnimator animator;

    public ModelTanystropheus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, 10.8F, 27.0F);
        this.body3.cubeList.add(new ModelBox(body3, 82, 67, -5.5F, -1.0F, 0.0F, 11, 6, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 100, 85, -5.5F, -1.0F, -1.0F, 11, 6, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 71, -4.5F, 0.0F, -7.0F, 9, 2, 7, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(5.5F, 1.3F, 2.5F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, -0.7854F, 0.0F, -1.0472F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 29, 29, -3.5F, 0.0F, -2.0F, 4, 9, 4, 0.01F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(-1.5F, 9.0F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 1.4835F, -0.5672F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 41, 9, -1.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.2793F, 0.0F, 0.5672F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 26, 55, -2.5F, 0.0F, -7.0F, 5, 1, 8, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-5.5F, 1.3F, 2.5F);
        this.body3.addChild(hindlegR);
        this.setRotateAngle(hindlegR, -0.7854F, 0.0F, 1.0472F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 0, 29, -0.5F, 0.0F, -2.0F, 4, 9, 4, 0.01F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(1.5F, 9.0F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 1.4835F, 0.5672F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 32, 0, -1.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F, false));

        this.hindlegL6 = new AdvancedModelRendererExtended(this);
        this.hindlegL6.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.hindlegR2.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.2793F, 0.0F, -0.5672F);
        this.hindlegL6.cubeList.add(new ModelBox(hindlegL6, 0, 11, -2.5F, 0.0F, -7.0F, 5, 1, 8, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 1.5F, 6.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 80, -3.0F, -2.0F, -1.0F, 6, 5, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 78, 87, -2.0F, -1.75F, -1.0F, 4, 4, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 0, -1.5F, -1.25F, -1.0F, 3, 3, 21, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 20.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 59, 0, -1.0F, -1.0F, -1.0F, 2, 2, 18, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 48, -0.5F, -0.5F, -1.0F, 1, 1, 22, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, 1.3F, 0.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 54, 48, -6.5F, -3.5F, -18.0F, 13, 8, 11, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 29, 29, -5.5F, -4.25F, -17.99F, 11, 1, 18, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 81, 10, -6.0F, 2.0F, -3.0F, 12, 2, 3, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 77, -6.5F, -3.5F, -7.0F, 13, 6, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.0F, 4.75F, -7.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 40, -7.0F, -2.25F, 0.0F, 12, 2, 5, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 1.0F, -17.5F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 69, 24, -5.5F, -4.0F, -8.5F, 11, 7, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -4.25F, -8.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 87, -4.5F, 0.25F, 0.0F, 9, 1, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 2.75F, -8.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 81, 0, -4.5F, -0.75F, 0.025F, 9, 1, 9, 0.0F, false));

        this.neckbase = new AdvancedModelRendererExtended(this);
        this.neckbase.setRotationPoint(0.0F, -0.75F, -8.5F);
        this.body.addChild(neckbase);
        this.neckbase.cubeList.add(new ModelBox(neckbase, 0, 0, -3.0F, -1.5F, -6.0F, 6, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 3.5F, -6.0F);
        this.neckbase.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 91, 47, -2.5F, -1.75F, 0.0F, 5, 1, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, -6.0F);
        this.neckbase.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 90, -2.5F, -0.5F, 0.0F, 5, 2, 7, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.neckbase.addChild(neck);
        this.setRotateAngle(neck, -0.3491F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 55, -2.0F, -2.0F, -18.0F, 4, 4, 18, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -17.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 29, -1.5F, -1.5F, -23.0F, 3, 3, 23, 0.01F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -23.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 0, -1.5F, -1.5F, -26.0F, 3, 3, 26, 0.0F, false));

        this.neck4 = new AdvancedModelRendererExtended(this);
        this.neck4.setRotationPoint(0.0F, 0.0F, -26.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1745F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 59, 67, -1.5F, -1.5F, -17.0F, 3, 3, 17, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -17.0F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 12, 29, -1.5F, -0.525F, -2.01F, 3, 2, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 29, 48, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 29, 42, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 5, 1, 1.65F, -0.764F, -4.95F, 0, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 5, -1.65F, -0.764F, -4.95F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6109F, -0.4363F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 0, 1.0F, -0.76F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6109F, 0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 11, -2.0F, -0.76F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -2.0F, -1.01F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, 0.0F, -1.015F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0611F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 0, 0.1F, -1.016F, -2.95F, 1, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(2.0F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0611F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 4, -1.1F, -1.014F, -2.95F, 1, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 42, -2.0F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 39, 48, -1.0F, -1.0F, -6.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 4, -2.0F, -1.01F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6109F, 0.4363F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 12, -1.25F, -0.015F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, -0.4363F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 6, 12, 0.25F, -0.015F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.4363F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 0, 0.0F, -1.015F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-2.0F, 0.0F, -3.0F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0611F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 48, 0.0F, -1.016F, -2.95F, 1, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(-1.75F, 0.0F, -5.5F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 4, 5, 0.0F, -0.264F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(-1.75F, 0.0F, -5.5F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.0436F, 0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 2, 5, -0.1F, -0.264F, 1.55F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(1.75F, 0.0F, -5.5F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0436F, -0.3491F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 5, 3, 0.1F, -0.264F, 1.55F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(1.75F, 0.0F, -5.5F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.3491F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 10, 0.0F, -0.264F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0611F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 54, 48, -1.0F, -1.014F, -2.95F, 1, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5236F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 24, -2.0F, 0.0F, -1.0F, 4, 1, 1, -0.01F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.upperjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.192F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 104, 80, -1.5F, 0.34F, -2.9F, 3, 0, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 47, -1.5F, 0.35F, -3.4F, 3, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(5.5F, 1.0F, -6.0F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.5236F, 0.0F, -0.4363F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 32, 12, -1.5F, 0.0F, -1.0F, 2, 7, 2, 0.01F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -1.3526F, 0.5236F, 0.1745F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 0, 11, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.829F, -0.2182F, -0.2182F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 20, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-5.5F, 1.0F, -6.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.5236F, 0.0F, 0.4363F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 14, 40, -0.5F, 0.0F, -1.0F, 2, 7, 2, 0.01F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, -1.3526F, -0.5236F, -0.1745F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 18, 11, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRendererExtended(this);
        this.forelegR3.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.829F, 0.1745F, 0.2182F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 10, 21, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body3.render(f5 * 0.25f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(10);
        this.neck2.rotateAngleY = (float) Math.toRadians(18);
        this.neck.rotateAngleY = (float) Math.toRadians(15);
        this.head.rotateAngleY = (float) Math.toRadians(10);
        this.body3.rotateAngleY = (float) Math.toRadians(10);
        this.tail.rotateAngleY = (float) Math.toRadians(10);
        this.tail2.rotateAngleY = (float) Math.toRadians(20);
        this.tail3.rotateAngleY = (float) Math.toRadians(15);
        this.body3.offsetZ = -0.1F;
        this.body3.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body3.offsetY = 1.1F;

        EntityPrehistoricFloraTanystropheus Tanystropheus = (EntityPrehistoricFloraTanystropheus) e;

        this.faceTarget(f3, f4, 4, neck4);
        this.faceTarget(f3, f4, 4, neck3);
        this.faceTarget(f3, f4, 4, neck2);
        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, head);

        float masterSpeed = 0.1F;
        float speed = masterSpeed;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck4, this.neck3, this.neck2, this.neck, this.neckbase};

        AdvancedModelRenderer[] FL = {this.forelegL, this.forelegL2, this.forelegL3};
        AdvancedModelRenderer[] FR = {this.forelegR, this.forelegR2, this.forelegR3};
        AdvancedModelRenderer[] BL = {this.hindlegL, this.hindlegL2, this.hindlegL3};
        AdvancedModelRenderer[] BR = {this.hindlegR, this.hindlegR2, this.hindlegL6};

        if (!Tanystropheus.isReallyInWater()) {
            speed = masterSpeed / 2.5F;

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
            this.walk(hindlegL6, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

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
        else {
            speed = masterSpeed * 2F;
            this.forelegL.rotateAngleX = (float) Math.toRadians(-16.9135);
            this.forelegR.rotateAngleX = (float) Math.toRadians(-16.9135);
            this.forelegL2.rotateAngleX = 0;
            this.forelegR2.rotateAngleX = 0;
            this.forelegL3.rotateAngleX = (float) Math.toRadians(69);
            this.forelegR3.rotateAngleX = (float) Math.toRadians(69);

            this.forelegL.rotateAngleY = (float) Math.toRadians(-21.6251);
            this.forelegR.rotateAngleY = (float) Math.toRadians(-21.6251);
            this.forelegL2.rotateAngleY = 0;
            this.forelegR2.rotateAngleY = 0;
            this.forelegL3.rotateAngleY = (float) Math.toRadians(75);
            this.forelegR3.rotateAngleY = (float) Math.toRadians(75);

            this.forelegL.rotateAngleZ = (float) Math.toRadians(-21.6251);
            this.forelegR.rotateAngleZ = (float) Math.toRadians(-21.6251);
            this.forelegL2.rotateAngleZ = 0;
            this.forelegR2.rotateAngleZ = 0;
            this.forelegL3.rotateAngleZ = (float) Math.toRadians(75);
            this.forelegR3.rotateAngleZ = (float) Math.toRadians(75);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.08F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.08F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.08F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.08F, -1.5, 0, f2, 0.8F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
       // animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}
