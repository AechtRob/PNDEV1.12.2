package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDvinosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDvinosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegR;
    private final AdvancedModelRenderer forelegR2;
    private final AdvancedModelRenderer forelegR3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegR;
    private final AdvancedModelRenderer hindlegR2;
    private final AdvancedModelRenderer hindlegR3;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;

    private ModelAnimator animator;

    public ModelDvinosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 36, 30, -3.0F, -3.35F, 1.24F, 6, 1, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 23, -3.5F, -3.0F, 1.25F, 7, 3, 4, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, 1.25F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 38, 35, -2.5F, -0.986F, -3.25F, 5, 3, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 41, 0, -2.0F, -1.236F, -3.25F, 4, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, 2.0F, 0.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 42, -1.0F, -3.0F, -3.25F, 2, 3, 4, -0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.5F, 2.0F, 0.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 13, -1.0F, -3.0F, -3.25F, 2, 3, 4, -0.015F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.neck.addChild(head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.25F, -0.5F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 12, 33, -1.5F, -0.01F, -6.0F, 3, 1, 6, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -0.5F, -0.51F, -5.9F, 1, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 1.0F, -6.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 23, -1.25F, -0.99F, 2.75F, 3, 1, 4, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.15F, -1.49F, 3.75F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 1.0F, -6.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 45, -1.75F, -0.99F, 2.75F, 3, 1, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 2, 1.15F, -1.49F, 3.75F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -0.5F, -6.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, 0.1F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 46, 0.0F, 0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -0.5F, -6.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 4, -0.1F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 49, -3.0F, 0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -6.0F);
        this.lowerjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 40, -2.5F, -1.01F, 2.0F, 5, 1, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 28, -1.5F, -1.01F, 0.0F, 3, 1, 2, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.25F, -0.5F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 39, -1.5F, -1.01F, -6.0F, 3, 1, 6, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 11, -1.5F, -0.51F, -5.9F, 3, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, -6.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -1.25F, -0.99F, 2.75F, 3, 1, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 0, -1.15F, -0.49F, 2.75F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -0.5F, -6.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6981F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 3, 0.1F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 50, 0.0F, -0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -0.5F, -6.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.2618F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 2, 1.15F, 0.01F, 2.75F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 5, -1.75F, -0.49F, 2.75F, 3, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, 1.0F, -5.75F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, -0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 12, 0.0F, -2.25F, 1.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, 1.0F, -5.75F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 12, -1.0F, -2.25F, 1.5F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.5F, -0.5F, -6.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.6981F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 3, -0.1F, 0.0F, 1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 50, -3.0F, -0.5F, 0.0F, 3, 1, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.5F, -1.0F, -6.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, 0.1745F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6109F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 51, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.0F, 8.0F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 8, -3.5F, -0.485F, -5.25F, 7, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 1.0F, 8.0F);
        this.bone.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 10, -1.5F, -1.16F, -7.9F, 3, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.0F, 1.0F, 0.0F);
        this.bone.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.6109F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 51, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(2.75F, -1.5F, 2.25F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.0F, -0.6981F, 0.0873F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 8, 54, 0.0F, 0.0F, -1.0F, 3, 1, 2, 0.01F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(2.75F, 0.5F, 0.0F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.0F, 1.309F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 40, 53, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(1.75F, -0.25F, 0.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, 0.0436F, 0.6545F, -0.0436F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 0, 3, 0.0F, 0.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.forelegR = new AdvancedModelRenderer(this);
        this.forelegR.setRotationPoint(-2.75F, -1.5F, 2.25F);
        this.body.addChild(forelegR);
        this.setRotateAngle(forelegR, 0.0F, 0.6981F, -0.0873F);
        this.forelegR.cubeList.add(new ModelBox(forelegR, 53, 0, -3.0F, 0.0F, -1.0F, 3, 1, 2, 0.01F, false));

        this.forelegR2 = new AdvancedModelRenderer(this);
        this.forelegR2.setRotationPoint(-2.75F, 0.5F, 0.0F);
        this.forelegR.addChild(forelegR2);
        this.setRotateAngle(forelegR2, 0.0F, -1.309F, 0.0F);
        this.forelegR2.cubeList.add(new ModelBox(forelegR2, 21, 53, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.forelegR3 = new AdvancedModelRenderer(this);
        this.forelegR3.setRotationPoint(-1.75F, -0.25F, 0.0F);
        this.forelegR2.addChild(forelegR3);
        this.setRotateAngle(forelegR3, 0.0436F, -0.6545F, 0.0436F);
        this.forelegR3.cubeList.add(new ModelBox(forelegR3, 0, 0, -2.0F, 0.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 4.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, -3.5F, -1.4F, 0.01F, 7, 1, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.0F, -1.0F, 0.0F, 8, 3, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 11, -3.5F, -1.0F, -1.5F, 7, 3, 8, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, -13.25F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 14, -3.0F, -3.9F, 11.66F, 6, 1, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 6.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 0, -3.0F, -1.25F, -1.5F, 6, 3, 5, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(2.75F, 0.25F, 2.0F);
        this.body4.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.0436F, 0.6109F, 0.1047F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 50, 20, -1.0F, 0.0F, -1.0F, 4, 1, 2, 0.01F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.75F, 0.5F, 0.0F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0F, -1.309F, 0.0F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 52, 35, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(1.75F, -0.25F, 0.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, -0.3283F, 1.3343F, -0.3813F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 48, 42, -0.5F, 0.0F, -1.25F, 3, 1, 3, -0.01F, false));

        this.hindlegR = new AdvancedModelRenderer(this);
        this.hindlegR.setRotationPoint(-2.75F, 0.25F, 2.0F);
        this.body4.addChild(hindlegR);
        this.setRotateAngle(hindlegR, 0.0436F, -0.6109F, -0.1047F);
        this.hindlegR.cubeList.add(new ModelBox(hindlegR, 50, 14, -3.0F, 0.0F, -1.0F, 4, 1, 2, 0.01F, false));

        this.hindlegR2 = new AdvancedModelRenderer(this);
        this.hindlegR2.setRotationPoint(-2.75F, 0.5F, 0.0F);
        this.hindlegR.addChild(hindlegR2);
        this.setRotateAngle(hindlegR2, 0.0F, 1.309F, 0.0F);
        this.hindlegR2.cubeList.add(new ModelBox(hindlegR2, 52, 31, -2.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

        this.hindlegR3 = new AdvancedModelRenderer(this);
        this.hindlegR3.setRotationPoint(-1.75F, -0.25F, 0.0F);
        this.hindlegR2.addChild(hindlegR3);
        this.setRotateAngle(hindlegR3, -0.3283F, -1.3343F, 0.3813F);
        this.hindlegR3.cubeList.add(new ModelBox(hindlegR3, 30, 47, -2.5F, 0.0F, -1.25F, 3, 1, 3, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 3.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 31, -2.0F, -1.0F, -0.5F, 4, 3, 5, -0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 22, 6, 0.0F, -2.0F, -0.5F, 0, 1, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 24, 30, -1.5F, -1.25F, -1.0F, 3, 3, 6, -0.015F, false));
        this.body6.cubeList.add(new ModelBox(body6, 42, 15, 0.0F, -2.75F, 0.0F, 0, 2, 5, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 13, 26, 0.0F, -3.0F, 0.0F, 0, 2, 5, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 24, 39, -1.0F, -1.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 23, 47, -0.5F, -0.5F, -1.5F, 1, 1, 5, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 34, 37, 0.0F, -2.25F, 0.0F, 0, 3, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.5F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = -0.3F;
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(head, -0.2618F, 0.3927F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r11, 0.2618F, -0.2618F, 0.0F);
        this.setRotateAngle(cube_r12, 0.2618F, 0.2618F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(bone, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0087F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(forelegL, 0.5236F, -0.8727F, 0.4363F);
        this.setRotateAngle(forelegL2, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(forelegL3, 0.0436F, -0.4363F, -0.0436F);
        this.setRotateAngle(forelegR, 0.5236F, 0.8727F, -0.4363F);
        this.setRotateAngle(forelegR2, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(forelegR3, 0.0436F, 0.4363F, 0.0436F);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(hindlegL, -0.451F, -0.8517F, 0.9963F);
        this.setRotateAngle(hindlegL2, 0.0F, -0.7854F, 0.0F);
        this.setRotateAngle(hindlegL3, -0.1537F, 0.2443F, 0.0114F);
        this.setRotateAngle(hindlegR, -0.451F, 0.8517F, -0.9963F);
        this.setRotateAngle(hindlegR2, 0.0F, 0.7854F, 0.0F);
        this.setRotateAngle(hindlegR3, -0.1537F, -0.2443F, -0.0114F);
        this.setRotateAngle(body5, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(body7, 0.0F, -0.48F, 0.0F);
        this.setRotateAngle(body8, 0.0F, -0.3927F, 0.0F);
        this.body.render(0.1F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.body.offsetY = 0.7F; //moved lower

        EntityPrehistoricFloraDvinosaurus Dvinosaurus = (EntityPrehistoricFloraDvinosaurus) e;

        //this.faceTarget(f3, f4, 4, body); //moved lower

        float speed = 0.225F / 2F;
        if (Dvinosaurus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.body4, this.body5, this.body6, this.body7, this.body8};
        AdvancedModelRenderer[] Torso = {this.head, this.body, this.body2, this.body3};

        if (!Dvinosaurus.isReallyInWater()) {
            this.body.offsetY = 0.75F;
            this.faceTarget(f3, 0, 4, body);

            if (f3 == 0.0F || !Dvinosaurus.getIsMoving()) { //Not moving
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

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(forelegR2, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            //this.bob(body, speed*2, 0.3F, false, f2, 1F);

            this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 1.5F, f2, 1);

        }
        else {
            this.body.offsetY = 0.725F;
            this.faceTarget(f3, f4, 4, body);
            speed = speed * 4F;

            //Feet:

            AdvancedModelRenderer[] BackL = {this.hindlegL, this.hindlegL2};
            AdvancedModelRenderer[] BackR = {this.hindlegR, this.hindlegR2};

            this.flap(hindlegL, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(hindlegR, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F, f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(forelegL, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(forelegL, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(forelegL2, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(forelegR, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(forelegR, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(forelegR2, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.012F, -0.2, f2, 0.5F);
            this.chainSwing(Tail, speed, 0.35F, -2.8, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.2F, -0.12, f2, 0.7F);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.3F);
        animator.rotate(this.head, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
