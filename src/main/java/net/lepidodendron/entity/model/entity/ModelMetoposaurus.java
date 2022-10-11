package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMastodonsaurus;
import net.lepidodendron.entity.EntityPrehistoricFloraMetoposaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelMetoposaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelMetoposaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 21.1F, 21.0F);
        this.body4.cubeList.add(new ModelBox(body4, 42, 42, -3.0F, -1.45F, -1.0F, 6, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.5F, -6.0F);
        this.body4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 21, -2.0F, -1.4F, 4.25F, 5, 1, 5, 0.0F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-3.0F, 0.5F, 0.35F);
        this.body4.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0F, -0.5236F, -0.2967F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 53, 34, -3.5F, -0.75F, -0.75F, 5, 2, 2, 0.0F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-3.5F, 0.25F, -0.35F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 1.5708F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 63, 53, -3.0F, -0.99F, -0.65F, 3, 2, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-3.0F, 0.0F, 0.25F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -1.9373F, -1.3177F, 2.1293F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 61, 10, -2.75F, 0.0F, -1.4F, 3, 1, 3, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(3.0F, 0.5F, 0.35F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0F, 0.5236F, 0.2967F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 56, 27, -1.5F, -0.75F, -1.0F, 5, 2, 2, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(3.5F, 0.25F, -0.35F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -1.5708F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 65, 21, 0.0F, -0.99F, -0.65F, 3, 2, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(3.0F, 0.0F, 0.25F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -1.9373F, 1.3177F, -2.1293F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 62, 45, -0.25F, 0.0F, -1.4F, 3, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 51, 55, -2.0F, -1.1F, -1.0F, 4, 3, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 35, 55, -1.5F, -0.85F, -1.0F, 3, 2, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 48, 0.0F, -1.85F, 0.0F, 0, 4, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 57, -1.0F, -0.84F, -1.0F, 2, 2, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 17, 31, 0.0F, -1.85F, 0.0F, 0, 4, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 62, 62, -0.5F, -1.08F, -1.0F, 1, 2, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -1.6F, 0.0F, 0, 3, 3, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 17, 35, 0.0F, -1.6F, 0.0F, 0, 3, 4, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, -0.6F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 24, 38, -3.5F, -1.85F, -4.0F, 7, 4, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 52, -3.0F, 1.6F, -4.0F, 6, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 28, 14, -4.0F, 1.65F, -6.01F, 8, 1, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 21, -4.5F, -2.0F, -6.0F, 9, 4, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 1, 28, -4.0F, -2.1F, -5.99F, 8, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -5.0F);
        this.body2.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 19, -4.5F, -1.6F, -6.99F, 9, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -5.0F, 2.45F, -6.99F, 10, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -1.4F, -7.0F, 11, 4, 7, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(4.75F, 1.75F, -6.05F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.4363F, 0.1745F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 12, 63, -0.5F, -0.75F, -0.75F, 4, 2, 2, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(3.5F, 0.25F, 0.25F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 1.5708F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 22, 65, 0.0F, -0.99F, -1.15F, 3, 2, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.1571F, 0.4363F, 0.0F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 54, 62, -0.25F, 0.0F, -1.55F, 3, 1, 3, 0.0F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-4.75F, 1.75F, -6.05F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.4363F, -0.1745F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 42, 62, -3.5F, -0.75F, -0.75F, 4, 2, 2, 0.0F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-3.5F, 0.25F, 0.3F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -1.5708F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 0, 64, -3.0F, -0.99F, -1.15F, 3, 2, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.1571F, -0.4363F, 0.0F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 30, 62, -2.75F, 0.0F, -1.55F, 3, 1, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.75F, -7.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 31, 6, -5.0F, -1.85F, -3.99F, 10, 3, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 29, 0, -4.5F, -2.1F, -4.0F, 9, 1, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.6F, -3.75F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 31, -4.5F, -1.225F, -0.475F, 9, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.75F, -4.0F);
        this.neck.addChild(head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 9, 57, -1.49F, 0.0F, -9.0F, 3, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 52, 0, -3.0F, 0.0F, -5.0F, 6, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 76, -1.5F, -0.5F, -9.565F, 3, 1, 0, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 19, -1.0F, 0.0F, -10.0F, 2, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.0F, -10.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 24, -1.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 1.0F, -10.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -1.2217F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, 0.9F, -1.01F, -0.5F, 10, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 41, 1.15F, -1.51F, -0.24F, 7, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.0F, -10.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 22, 0.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 1.2217F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 48, -8.15F, -0.51F, -0.24F, 7, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 31, -10.9F, -0.015F, -0.5F, 10, 1, 2, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.lowerjaw.addChild(bone2);
        this.setRotateAngle(bone2, -0.2007F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 43, 49, -2.5F, -1.0F, 5.0F, 5, 1, 5, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 56, 5, -1.5F, -1.0F, 1.0F, 3, 1, 4, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 3, 24, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6981F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 23, 0.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6981F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 20, -1.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.2217F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 49, -11.35F, -2.01F, -0.5F, 6, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 43, -10.9F, -1.015F, -0.5F, 10, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -1.2217F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 51, 5.35F, -2.01F, -0.5F, 6, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 38, 0.9F, -1.01F, -0.5F, 10, 1, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 68, -1.5F, -0.5F, -9.575F, 3, 1, 0, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 21, -1.0F, -1.0F, -10.0F, 2, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 19, 58, -1.5F, -1.0F, -9.0F, 3, 1, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 20, 52, -3.0F, -1.0F, -5.0F, 6, 1, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 58, 43, -3.49F, -1.0F, -1.0F, 7, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 14, -3.5F, -0.925F, -2.25F, 7, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0349F, 0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 11, -0.25F, -0.5F, 3.6F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0349F, -0.3054F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 14, -0.75F, -0.5F, 3.6F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 35, -2.5F, 0.0F, 3.0F, 5, 1, 7, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 35, -0.99F, 0.025F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 0.0F, -10.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -1.2217F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 49, 0.9F, -1.01F, -0.5F, 10, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 57, 1.15F, -0.51F, -0.25F, 7, 1, 0, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 0.0F, -10.0F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.6981F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 11, 0.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6981F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 27, -1.0F, -1.02F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.2217F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 49, -10.9F, -1.015F, -0.5F, 10, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 20, -8.15F, -0.51F, -0.25F, 7, 1, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body4.render(f5 * 1.375F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.neck.offsetY = -0.001F;
        this.upperjaw.rotateAngleX = (float) Math.toRadians(35);
        this.head.rotateAngleX = (float) Math.toRadians(-15);
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
        this.body4.offsetY = -0.50F; //72
        this.body4.offsetZ = -1F; //72

        EntityPrehistoricFloraMetoposaurus Metoposaurus = (EntityPrehistoricFloraMetoposaurus) e;

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, head);

        float speed = 0.185F;
        if (Metoposaurus.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2, this.body3};

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (Metoposaurus.isReallyInWater() && isAtBottom && !Metoposaurus.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }


        if (!Metoposaurus.isReallyInWater()) {//on land

            if (f3 == 0.0F || !Metoposaurus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

            this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1.5F, f2, 1);

        }
        else {//in water
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(forelegL, 0, -(float) Math.toRadians(42.5), -(float) Math.toRadians(10));
                this.setRotateAngle(forelegR, 0, -(float) Math.toRadians(-42.5),-(float) Math.toRadians(-10));
                this.setRotateAngle(forelegL2, 0, -(float) Math.toRadians(17.5), 0);
                this.setRotateAngle(forelegR2, 0, -(float) Math.toRadians(-17.5), 0);
                this.setRotateAngle(forelegL3, 0, -(float) Math.toRadians(12.5), -0);
                this.setRotateAngle(forelegR3, 0, -(float) Math.toRadians(-12.5), 0);

                this.setRotateAngle(hindlegL, 0, -(float) Math.toRadians(32.5), -(float) Math.toRadians(17));
                this.setRotateAngle(hindlegR, (0), -(float) Math.toRadians(-32.5), -(float) Math.toRadians(-17));
                this.setRotateAngle(hindlegL2, (float) Math.toRadians(0), -(float) Math.toRadians(75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegR2, (float) Math.toRadians(0), -(float) Math.toRadians(-75), (float) Math.toRadians(0));
                this.setRotateAngle(hindlegL3, (float) Math.toRadians(0), -(float) Math.toRadians(7.5), (float) Math.toRadians(-0));
                this.setRotateAngle(hindlegR3, (float) Math.toRadians(0), -(float) Math.toRadians(-7.5), (float) Math.toRadians(0));

                AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2};
                AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2};
                AdvancedModelRenderer[] FrontL = {this.forelegL, this.forelegL2};
                AdvancedModelRenderer[] FrontR = {this.forelegR, this.forelegR2};

                this.chainSwingExtended(FrontL, speed * 0.85F, -0.2F, 0, 1F, f2, 1);
                this.chainSwingExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.85F, -0.13F, -2, 1F, f2, 1);
                this.chainSwingExtended(BackR, speed * 0.85F, -0.13F, -2, 4F, f2, 1);

            }
            else if (f3 != 0 && Metoposaurus.getIsMoving()) {
                this.flap(hindlegL, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(hindlegL, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(hindlegL2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(hindlegL3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(hindlegR, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(hindlegR, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(hindlegR2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(hindlegR3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(forelegL, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(forelegL2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(forelegL3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(forelegR2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(forelegR3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
                //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

                this.body4.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                this.chainSwing(Torso, speed, 0.15F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,0.3F);
        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,0.3F);
        animator.rotate(this.head, (float) Math.toRadians(7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, -(float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
