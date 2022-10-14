package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCyamodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelCyamodus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegR;
    private final AdvancedModelRendererExtended hindlegR2;
    private final AdvancedModelRendererExtended hindlegR3;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegL3;
    private final AdvancedModelRendererExtended forelegR;
    private final AdvancedModelRendererExtended forelegR2;
    private final AdvancedModelRendererExtended forelegR3;

    private ModelAnimator animator;

    public ModelCyamodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -4.5F, 3.5F, 14, 3, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 38, -4.5F, -2.0F, 3.6F, 9, 2, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 41, 0, -5.0F, -2.0F, 14.6F, 10, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 16, -6.0F, -2.0F, 6.6F, 12, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 32, 6.5F, -3.5F, 4.55F, 2, 1, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 26, -8.5F, -3.5F, 4.55F, 2, 1, 11, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -2.5F, 3.5F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 38, 47, -2.0F, -1.49F, -3.75F, 4, 3, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 1.5F, -3.75F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 49, 40, -1.5F, -0.975F, 0.0F, 3, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.neck.addChild(head);


        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 58, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 51, 30, -2.0F, -2.0F, -5.0F, 4, 2, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 16, 47, -3.0F, -2.0F, -4.0F, 6, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3316F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 48, -1.0F, -1.01F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, 1.41F, -2.015F, 3.0F, 1, 2, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 34, 0.41F, -1.51F, 7.0F, 5, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 45, 1.41F, -2.01F, 7.0F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 24, 2.41F, -2.01F, 5.0F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 45, -4.41F, -2.01F, 7.0F, 3, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 32, -5.41F, -1.51F, 7.0F, 5, 0, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 59, -4.41F, -2.015F, 5.0F, 2, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 34, -2.41F, -2.015F, 3.0F, 1, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3316F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 51, 0.0F, -1.01F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 40, -1.5F, -1.45F, 2.075F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 59, 57, -1.0F, -1.0F, 0.25F, 2, 1, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 11, 57, -1.0F, 0.0F, -8.0F, 2, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 15, 53, -1.5F, 0.0F, -5.0F, 3, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 40, 24, -2.0F, 0.0F, -4.1F, 4, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 49, 36, -3.0F, 0.0F, -3.1F, 6, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 33, 2.66F, -0.015F, 5.0F, 2, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 54, 1.66F, -0.015F, 3.0F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 59, -4.66F, -0.015F, 5.0F, 2, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 55, 9, -2.66F, -0.015F, 3.0F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 3, -2.175F, -2.5F, -4.625F, 1, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 19, 1.175F, -2.5F, -4.625F, 1, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3316F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 24, 0.25F, -1.01F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3316F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 51, -1.25F, -1.01F, 0.0F, 1, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 16.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 44, -3.5F, -2.6F, -0.6F, 7, 4, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 32, 16, -4.5F, -3.0F, 2.0F, 9, 2, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 26, -5.5F, -2.0F, 2.5F, 11, 0, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 1.5F, -16.5F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 26, -3.0F, -1.9F, 17.7F, 6, 3, 7, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 34, 36, -1.5F, -1.0F, -1.0F, 3, 2, 9, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 17, 36, 0.0F, -2.0F, 0.0F, 0, 1, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 26, 35, 0.0F, 0.75F, 0.0F, 0, 1, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 2, 0, 1.5F, 0.0F, 0.0F, 1, 0, 8, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, -2.5F, 0.0F, 0.0F, 1, 0, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 16, 0.75F, 0.0F, 0.025F, 1, 0, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 5, 0.0F, -1.75F, 0.025F, 0, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.75F, 0.0F, 0.025F, 1, 0, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 4, 0.0F, 0.5F, 0.025F, 0, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 4, -1.0F, -0.99F, -1.0F, 2, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 47, -0.5F, -0.5F, -1.0F, 1, 1, 7, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 2, 0.0F, -1.0F, -0.075F, 0, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 16, -1.0F, 0.0F, -0.1F, 2, 0, 6, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(2.0F, -0.25F, 4.0F);
        this.body2.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, -0.6981F, 0.4363F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 18, 55, 0.0F, -1.0F, -1.25F, 4, 2, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(4.0F, 0.0F, -0.25F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -0.6981F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 51, 55, 0.0F, -0.99F, -1.0F, 3, 2, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.0F, 0.5672F, 0.0F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 35, 59, 0.0F, -1.5F, 0.0F, 3, 3, 1, 0.0F, false));

        this.hindlegR = new AdvancedModelRendererExtended(this);
        this.hindlegR.setRotationPoint(-2.0F, -0.25F, 4.0F);
        this.body2.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, 0.6981F, -0.4363F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 52, 4, -4.0F, -1.0F, -1.25F, 4, 2, 2, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRendererExtended(this);
        this.hindlegR2.setRotationPoint(-4.0F, 0.0F, -0.25F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 0.6981F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 30, 55, -3.0F, -0.99F, -1.0F, 3, 2, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRendererExtended(this);
        this.hindlegR3.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, 0.0F, -0.5672F, 0.0F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 27, 59, -3.0F, -1.5F, 0.0F, 3, 3, 1, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(4.0F, -1.25F, 6.0F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.3491F, 0.4363F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 56, 49, 0.0F, -1.0F, -1.25F, 3, 2, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(3.0F, 0.0F, -0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 0.7854F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 56, 45, 0.0F, -0.99F, -1.0F, 3, 2, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, -0.3927F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 43, 59, 0.0F, -1.5F, 0.0F, 3, 3, 1, 0.0F, false));

        this.forelegR = new AdvancedModelRendererExtended(this);
        this.forelegR.setRotationPoint(-4.0F, -1.25F, 6.0F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.3491F, -0.4363F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 56, 18, -3.0F, -1.0F, -1.25F, 3, 2, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRendererExtended(this);
        this.forelegR2.setRotationPoint(-3.0F, 0.0F, -0.25F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -0.7854F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 56, 14, -3.0F, -0.99F, -1.0F, 3, 2, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRendererExtended(this);
        this.forelegR3.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0F, 0.3927F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 59, 40, -3.0F, -1.5F, 0.0F, 3, 3, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.42f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.offsetZ = -1.31F;
        this.body.render(0.1F);
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
        this.body.offsetY = 0.85F;
        this.body.offsetZ = -0.5F;

        EntityPrehistoricFloraCyamodus Cyamodus = (EntityPrehistoricFloraCyamodus) e;

        //this.faceTarget(f3, f4, 5, neckbase);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        AdvancedModelRenderer[] FL = {this.forelegL, this.forelegL2, this.forelegL3};
        AdvancedModelRenderer[] FR = {this.forelegR, this.forelegR2, this.forelegR3};
        AdvancedModelRenderer[] BL = {this.hindlegL, this.hindlegL2, this.hindlegL3};
        AdvancedModelRenderer[] BR = {this.hindlegR, this.hindlegR2, this.hindlegR3};

        if (!Cyamodus.isReallyInWater()) {

            if (f3 == 0.0F || !Cyamodus.getIsMoving()) {
                return;
            }

            this.swing(this.forelegR, speed * 0.6F, 0.5F,false, -0.8F,0.6F, f2, 1F);
            this.swing(this.forelegL, speed * 0.6F, 0.5F,true, 0.8F,0.6F, f2, 1F);

            this.swing(this.hindlegR, speed * 0.6F, 0.3F,false, -0.8F,0.4F, f2, 1F);
            this.swing(this.hindlegL, speed * 0.6F, 0.3F,true, 0.8F,0.4F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);

        }
        else {

            if (f3 == 0.0F) {
                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.8F, 0.06F, -3, f2, 0.8F);
                return;
            }

            speed = speed * 2F;

            this.chainWaveExtended(FR, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);

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
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
