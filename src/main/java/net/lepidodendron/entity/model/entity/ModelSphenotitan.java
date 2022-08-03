package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSphenotitan;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSphenotitan extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended forelegL;
    private final AdvancedModelRendererExtended forelegL1;
    private final AdvancedModelRendererExtended forelegL2;
    private final AdvancedModelRendererExtended forelegL3;
    private final AdvancedModelRendererExtended forelegL4;
    private final AdvancedModelRendererExtended forelegL5;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended hindlegL;
    private final AdvancedModelRendererExtended hindlegL2;
    private final AdvancedModelRendererExtended hindlegL3;
    private final AdvancedModelRendererExtended hindlegL4;
    private final AdvancedModelRendererExtended hindlegL5;
    private final AdvancedModelRendererExtended hindlegL6;

    private ModelAnimator animator;

    public ModelSphenotitan() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 19.125F, 0.5F);
        this.body.cubeList.add(new ModelBox(body, 8, 8, 0.0F, -1.925F, -7.25F, 0, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 6, -2.5F, -1.075F, -8.25F, 5, 5, 2, 0.0F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, 1.925F, -6.25F);
        this.body.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 0, -3.0F, -3.01F, 0.0F, 6, 5, 10, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 18, 32, -2.5F, -3.0F, 10.0F, 5, 5, 2, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 14, 5, 0.0F, -3.95F, 0.0F, 0, 1, 10, 0.0F, false));
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 8, 8, 0.0F, -3.85F, 10.75F, 0, 1, 1, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.1F, 12.75F);
        this.bodyfront.addChild(neck);
        this.setRotateAngle(neck, 0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 15, -1.975F, -1.99F, -1.25F, 1, 4, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, 0.975F, -1.99F, -1.25F, 1, 4, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 28, 38, -1.5F, -2.01F, -1.26F, 3, 1, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 6, 0.0F, -3.01F, -0.26F, 0, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, 2.75F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 7, 0.0F, -0.35F, -4.35F, 0, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, 0.15F, -3.35F, 0, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 18, -1.5F, -1.85F, -4.35F, 3, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -1.25F, 2.25F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 42, 27, -1.5F, 0.05F, 0.1F, 3, 3, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.25F, -0.25F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 38, 38, -1.99F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 13, 32, -0.99F, 0.0F, 3.0F, 2, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 50, 5, -0.5F, 0.01F, 3.25F, 1, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-2.0F, 1.0F, 3.0F);
        this.lowerjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4974F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 6, 0.09F, -1.01F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(2.0F, 1.0F, 3.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4974F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 35, -1.09F, -1.02F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.325F, 4.925F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 15, -0.49F, 0.9F, 1.275F, 1, 1, 0, 0.0F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(0.0F, 1.0F, 6.0F);
        this.lowerjaw.addChild(bone2);
        this.setRotateAngle(bone2, 0.1658F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 43, 32, -0.509F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 27, 6, -0.99F, -1.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 11, 39, -1.49F, -1.0F, -6.0F, 3, 1, 3, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 1, 0.01F, 0.0F, -6.0F, 0, 1, 2, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 6, 8, 0.01F, -0.5F, -4.0F, 0, 1, 1, 0.0F, false));

        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 2.25F, -0.35F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.0873F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 32, -2.0F, -3.0F, 0.1F, 4, 3, 3, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 32, 13, -1.0F, -1.12F, 3.1F, 2, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 5.175F, 3.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 0, 0.375F, -7.85F, -1.65F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-2.0F, 0.0F, 3.1F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1134F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 44, 1.5F, -1.02F, 0.9F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-2.0F, 0.0F, 3.1F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 17, 0.0F, -1.11F, 0.0F, 1, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 0, 0.1F, -0.85F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(2.0F, 0.0F, 3.1F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, -0.5236F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 1, -0.1F, -0.85F, 0.0F, 0, 1, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 22, -1.0F, -1.1F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -1.325F, 5.025F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 15, -0.489F, 0.55F, 1.275F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -1.325F, 5.025F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 47, -0.511F, -0.001F, 0.585F, 1, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 47, -0.489F, 0.0F, 0.575F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -1.325F, 5.025F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -0.51F, -0.75F, 0.375F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -1.3F, 5.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 42, -1.01F, -0.575F, -1.85F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -3.325F, 2.975F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5323F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 43, -1.0F, -0.05F, 1.225F, 2, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, -3.0F, 3.1F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 43, -1.5F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 5.175F, 3.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3054F, 0.1745F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -1.375F, -7.85F, -1.65F, 1, 1, 1, 0.0F, false));

        this.forelegL = new AdvancedModelRendererExtended(this);
        this.forelegL.setRotationPoint(-2.5F, 0.0F, 10.75F);
        this.bodyfront.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.6109F, 0.0F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 14, 23, -3.0F, -0.5F, -1.25F, 4, 2, 2, 0.0F, false));

        this.forelegL1 = new AdvancedModelRendererExtended(this);
        this.forelegL1.setRotationPoint(-2.5F, 0.0F, -0.25F);
        this.forelegL.addChild(forelegL1);
        this.setRotateAngle(forelegL1, 1.4399F, 0.6981F, 1.2217F);
        this.forelegL1.cubeList.add(new ModelBox(forelegL1, 0, 41, -0.75F, 0.0F, -1.01F, 2, 3, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRendererExtended(this);
        this.forelegL2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.forelegL1.addChild(forelegL2);
        this.setRotateAngle(forelegL2, -0.3927F, -0.7418F, -0.5672F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 35, 0, -1.5F, 0.0F, -1.01F, 3, 1, 4, 0.0F, false));

        this.forelegL3 = new AdvancedModelRendererExtended(this);
        this.forelegL3.setRotationPoint(2.5F, 0.0F, 10.75F);
        this.bodyfront.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0F, 0.6109F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 14, 23, -1.0F, -0.5F, -1.25F, 4, 2, 2, 0.0F, true));

        this.forelegL4 = new AdvancedModelRendererExtended(this);
        this.forelegL4.setRotationPoint(2.5F, 0.0F, -0.25F);
        this.forelegL3.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 1.4399F, -0.6981F, -1.2217F);
        this.forelegL4.cubeList.add(new ModelBox(forelegL4, 0, 41, -1.25F, 0.0F, -1.01F, 2, 3, 2, 0.0F, true));

        this.forelegL5 = new AdvancedModelRendererExtended(this);
        this.forelegL5.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.3927F, 0.7418F, 0.5672F);
        this.forelegL5.cubeList.add(new ModelBox(forelegL5, 35, 0, -1.5F, 0.0F, -1.01F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -0.075F, -8.25F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, 0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 17, -1.5F, -0.75F, -3.5F, 3, 4, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 4, 0.0F, -1.5F, -3.5F, 0, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, -3.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2007F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 19, -1.0F, -1.0F, -9.75F, 2, 3, 10, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 8, 0.0F, -1.75F, -9.75F, 0, 1, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, -9.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0698F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 15, -0.5F, -0.5F, -11.0F, 1, 2, 12, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 5, 0.0F, -1.25F, -11.0F, 0, 1, 11, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 15, -0.5F, 0.0F, -13.0F, 1, 1, 2, 0.0F, false));

        this.hindlegL = new AdvancedModelRendererExtended(this);
        this.hindlegL.setRotationPoint(-2.0F, 1.425F, -6.25F);
        this.body.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.829F, 0.0F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 38, 13, -4.0F, -0.5F, -1.25F, 5, 2, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRendererExtended(this);
        this.hindlegL2.setRotationPoint(-3.25F, 0.0F, -0.5F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, -0.8901F, -0.5236F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 21, 41, -1.0F, 0.0F, -1.01F, 2, 4, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRendererExtended(this);
        this.hindlegL3.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 1.1296F, -0.5636F, -0.7848F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 35, 0, -1.5F, 0.0F, -1.01F, 3, 1, 4, 0.0F, false));

        this.hindlegL4 = new AdvancedModelRendererExtended(this);
        this.hindlegL4.setRotationPoint(2.0F, 1.425F, -6.25F);
        this.body.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, 0.0F, -0.829F, 0.0F);
        this.hindlegL4.cubeList.add(new ModelBox(hindlegL4, 38, 13, -1.0F, -0.5F, -1.25F, 5, 2, 2, 0.0F, true));

        this.hindlegL5 = new AdvancedModelRendererExtended(this);
        this.hindlegL5.setRotationPoint(3.25F, 0.0F, -0.5F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, -0.8901F, 0.5236F, 0.0F);
        this.hindlegL5.cubeList.add(new ModelBox(hindlegL5, 21, 41, -1.0F, 0.0F, -1.01F, 2, 4, 2, 0.0F, true));

        this.hindlegL6 = new AdvancedModelRendererExtended(this);
        this.hindlegL6.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, 1.1296F, 0.5636F, 0.7848F);
        this.hindlegL6.cubeList.add(new ModelBox(hindlegL6, 35, 0, -1.5F, 0.0F, -1.01F, 3, 1, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.2f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = 0.6F;
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(-12.5);
        this.head.rotateAngleY = (float) Math.toRadians(15.6);
        this.head.rotateAngleZ = (float) Math.toRadians(-1.7);
        this.neck.rotateAngleY = (float) Math.toRadians(11.9);
        this.bodyfront.rotateAngleY = (float) Math.toRadians(-12.5);
        this.tail.rotateAngleY = (float) Math.toRadians(4.7);
        this.tail2.rotateAngleY = (float) Math.toRadians(14.6);
        this.tail3.rotateAngleY = (float) Math.toRadians(-14.9);
        this.forelegL3.rotateAngleY = (float) Math.toRadians(22.5);
        this.hindlegL4.rotateAngleY = (float) Math.toRadians(-45);
        this.body.render(0.1F);
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
        this.body.rotateAngleY = (float)Math.toRadians(180);
        this.body.offsetY = 1.20F;

        EntityPrehistoricFloraSphenotitan entitySphenotitan = (EntityPrehistoricFloraSphenotitan) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRendererExtended[] Torso = {this.bodyfront, this.body};

        float speed = 0.65F;

        //EntityPrehistoricFloraentitySphenotitan entitySphenotitan = (EntityPrehistoricFloraentitySphenotitan) e;
        if (f3 == 0.0F || !entitySphenotitan.getIsMoving()) { //Not moving
            this.chainWave(Tail, speed * 0.33F, 0.025F, -1.5, f2, 1);
            this.chainSwing(Tail, speed * 0.2F, 0.08F, -1.8, f2, 0.8F);
            return;
        }

        this.flap(hindlegL, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
        this.swing(hindlegL, speed, -0.5F, true, -1, 1F, f2, 0.5F);
        this.walk(hindlegL2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
        this.flap(hindlegL2, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
        this.flap(hindlegL3, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
        this.walk(hindlegL3, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
        this.swing(hindlegL3, speed, 0.2F, false, 3, 0F, f2, 0.5F);

        this.flap(hindlegL4, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
        this.swing(hindlegL4, speed, 0.5F, true, 2, -1F, f2, 0.5F);
        this.walk(hindlegL5, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
        this.flap(hindlegL5, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
        this.flap(hindlegL6, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
        this.walk(hindlegL6, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
        this.swing(hindlegL6, speed, -0.2F, false, 6, 0F, f2, 0.5F);

        this.flap(forelegL, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
        this.swing(forelegL, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
        this.walk(forelegL1, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
        this.flap(forelegL2, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
        this.walk(forelegL2, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
        this.swing(forelegL2, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);

        this.flap(forelegL3, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
        this.swing(forelegL3, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
        this.walk(forelegL4, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
        this.flap(forelegL5, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
        this.walk(forelegL5, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
        this.swing(forelegL5, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);

        this.chainWave(Tail, speed, 0.1F, -3, f2, 1);
        this.chainSwing(Tail, speed * 0.8F, 0.18F, -2.4, f2, 0.8F);
        this.chainSwing(Torso, speed, 0.08F, -2, f2, 0.75F);
        
        this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.5), false, 1.5F, f2, 1);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSphenotitan e = (EntityPrehistoricFloraSphenotitan) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.5F);
        animator.rotate(this.head, (float) Math.toRadians(-17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
