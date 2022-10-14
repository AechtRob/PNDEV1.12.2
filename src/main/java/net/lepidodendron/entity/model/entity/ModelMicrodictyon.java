package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrodictyon;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelMicrodictyon extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer segment1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer legR9;
    private final AdvancedModelRenderer legR10;
    private final AdvancedModelRenderer legL9;
    private final AdvancedModelRenderer legL10;

    private ModelAnimator animator;

    public ModelMicrodictyon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.5F, -7.0F);


        this.segment5 = new AdvancedModelRenderer(this);
        this.segment5.setRotationPoint(0.0F, -0.5F, 20.0F);
        this.body.addChild(segment5);
        this.segment5.cubeList.add(new ModelBox(segment5, 10, 28, -1.0F, -1.24F, 2.75F, 2, 3, 3, 0.0F, false));
        this.segment5.cubeList.add(new ModelBox(segment5, 17, 31, -1.0F, -1.75F, 0.02F, 2, 1, 3, 0.0F, false));
        this.segment5.cubeList.add(new ModelBox(segment5, 12, 16, -1.5F, -1.25F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.2F, 5.65F, 3.0F);
        this.segment5.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 0, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.2F, 5.65F, 3.0F);
        this.segment5.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 6, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.75F, 1.5F, 1.5F);
        this.segment5.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, 0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 32, 49, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.75F, 1.5F, 1.5F);
        this.segment5.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, -0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 49, 28, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment6 = new AdvancedModelRenderer(this);
        this.segment6.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.segment5.addChild(segment6);
        this.segment6.cubeList.add(new ModelBox(segment6, 0, 28, -1.0F, -1.24F, 2.75F, 2, 3, 3, 0.0F, false));
        this.segment6.cubeList.add(new ModelBox(segment6, 30, 22, -1.0F, -1.75F, 0.02F, 2, 1, 3, 0.0F, false));
        this.segment6.cubeList.add(new ModelBox(segment6, 0, 16, -1.5F, -1.26F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2F, 5.65F, 3.0F);
        this.segment6.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 18, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.2F, 5.65F, 3.0F);
        this.segment6.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 39, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.75F, 1.5F, 1.5F);
        this.segment6.addChild(legR6);
        this.setRotateAngle(legR6, 0.0F, 0.0F, 0.2618F);
        this.legR6.cubeList.add(new ModelBox(legR6, 48, 47, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.75F, 1.5F, 1.5F);
        this.segment6.addChild(legL6);
        this.setRotateAngle(legL6, 0.0F, 0.0F, -0.2618F);
        this.legL6.cubeList.add(new ModelBox(legL6, 48, 38, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment7 = new AdvancedModelRenderer(this);
        this.segment7.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.segment6.addChild(segment7);
        this.segment7.cubeList.add(new ModelBox(segment7, 12, 10, -1.5F, -1.25F, 0.0F, 3, 3, 3, 0.0F, false));
        this.segment7.cubeList.add(new ModelBox(segment7, 30, 16, -1.0F, -1.75F, 0.02F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, 3.0F);
        this.segment7.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 25, -1.0F, -0.74F, -0.25F, 2, 3, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.2F, 5.65F, 3.0F);
        this.segment7.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 38, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.2F, 5.65F, 3.0F);
        this.segment7.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 38, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-1.75F, 1.5F, 1.5F);
        this.segment7.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, 0.2618F);
        this.legR7.cubeList.add(new ModelBox(legR7, 48, 9, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(1.75F, 1.5F, 1.5F);
        this.segment7.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, -0.2618F);
        this.legL7.cubeList.add(new ModelBox(legL7, 48, 0, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment8 = new AdvancedModelRenderer(this);
        this.segment8.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.segment7.addChild(segment8);
        this.setRotateAngle(segment8, -0.2182F, 0.0F, 0.0F);
        this.segment8.cubeList.add(new ModelBox(segment8, 41, 34, -1.0F, -1.24F, 2.75F, 2, 3, 2, 0.0F, false));
        this.segment8.cubeList.add(new ModelBox(segment8, 30, 12, -1.0F, -1.75F, 0.02F, 2, 1, 3, 0.0F, false));
        this.segment8.cubeList.add(new ModelBox(segment8, 12, 0, -1.5F, -1.25F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.25F, 3.0F);
        this.segment8.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 35, 0.947F, -7.1153F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 5.25F, 3.0F);
        this.segment8.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 38, -2.947F, -7.1153F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(-1.75F, 1.7F, 1.5F);
        this.segment8.addChild(legR8);
        this.setRotateAngle(legR8, 0.2182F, 0.0F, 0.2618F);
        this.legR8.cubeList.add(new ModelBox(legR8, 28, 46, -0.5F, -1.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(1.75F, 1.7F, 1.5F);
        this.segment8.addChild(legL8);
        this.setRotateAngle(legL8, 0.2182F, 0.0F, -0.2618F);
        this.legL8.cubeList.add(new ModelBox(legL8, 24, 46, -0.5F, -1.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment9 = new AdvancedModelRenderer(this);
        this.segment9.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.segment8.addChild(segment9);
        this.setRotateAngle(segment9, -0.0873F, 0.0F, 0.0F);
        this.segment9.cubeList.add(new ModelBox(segment9, 0, 10, -1.5F, -1.25F, 0.0F, 3, 3, 3, 0.0F, false));
        this.segment9.cubeList.add(new ModelBox(segment9, 21, 9, -1.0F, -1.75F, -0.02F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.25F, 3.0F);
        this.segment9.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 34, -2.947F, -7.1153F, -2.5F, 2, 4, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 5.25F, 3.0F);
        this.segment9.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.947F, -7.1153F, -2.49F, 2, 4, 2, 0.0F, false));

        this.legR9 = new AdvancedModelRenderer(this);
        this.legR9.setRotationPoint(-1.75F, 1.5F, 1.1F);
        this.segment9.addChild(legR9);
        this.setRotateAngle(legR9, 0.2182F, 0.0F, 0.2618F);
        this.legR9.cubeList.add(new ModelBox(legR9, 52, 17, -0.5F, -0.75F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legR10 = new AdvancedModelRenderer(this);
        this.legR10.setRotationPoint(-0.9F, 0.4F, 2.5F);
        this.segment9.addChild(legR10);
        this.setRotateAngle(legR10, 0.8727F, 0.0F, 0.4363F);
        this.legR10.cubeList.add(new ModelBox(legR10, 44, 45, -0.5F, -0.5F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL9 = new AdvancedModelRenderer(this);
        this.legL9.setRotationPoint(1.75F, 1.5F, 1.1F);
        this.segment9.addChild(legL9);
        this.setRotateAngle(legL9, 0.2182F, 0.0F, -0.2618F);
        this.legL9.cubeList.add(new ModelBox(legL9, 52, 9, -0.5F, -0.75F, -0.5F, 1, 7, 1, 0.0F, false));

        this.legL10 = new AdvancedModelRenderer(this);
        this.legL10.setRotationPoint(1.15F, 0.4F, 2.5F);
        this.segment9.addChild(legL10);
        this.setRotateAngle(legL10, 0.8727F, 0.0F, -0.4363F);
        this.legL10.cubeList.add(new ModelBox(legL10, 40, 45, -0.75F, -0.5F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment4 = new AdvancedModelRenderer(this);
        this.segment4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.segment5.addChild(segment4);
        this.segment4.cubeList.add(new ModelBox(segment4, 26, 28, -1.0F, -1.24F, -2.5F, 2, 3, 3, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 33, 26, -1.0F, -1.75F, -5.23F, 2, 1, 3, 0.0F, false));
        this.segment4.cubeList.add(new ModelBox(segment4, 21, 3, -1.5F, -1.26F, -5.25F, 3, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.2F, 5.65F, -2.25F);
        this.segment4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 12, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.2F, 5.65F, -2.25F);
        this.segment4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 40, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.75F, 1.5F, -3.75F);
        this.segment4.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, 0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 50, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.75F, 1.5F, -3.75F);
        this.segment4.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, -0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 36, 49, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment3 = new AdvancedModelRenderer(this);
        this.segment3.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.segment4.addChild(segment3);
        this.segment3.cubeList.add(new ModelBox(segment3, 30, 0, -1.0F, -1.24F, -2.5F, 2, 3, 3, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 33, 31, -1.0F, -1.75F, -5.23F, 2, 1, 3, 0.0F, false));
        this.segment3.cubeList.add(new ModelBox(segment3, 21, 13, -1.5F, -1.25F, -5.25F, 3, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2F, 5.65F, -2.25F);
        this.segment3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.1745F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 41, 28, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2F, 5.65F, -2.25F);
        this.segment3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.1745F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 43, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.75F, 1.5F, -3.75F);
        this.segment3.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 8, 50, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.75F, 1.5F, -3.75F);
        this.segment3.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, -0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 4, 50, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment2 = new AdvancedModelRenderer(this);
        this.segment2.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.segment3.addChild(segment2);
        this.segment2.cubeList.add(new ModelBox(segment2, 12, 22, -1.0F, -1.24F, -2.5F, 2, 3, 3, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 0, 34, -1.0F, -1.75F, -4.98F, 2, 1, 3, 0.0F, false));
        this.segment2.cubeList.add(new ModelBox(segment2, 21, 19, -1.5F, -1.26F, -5.0F, 3, 3, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2F, 5.65F, -2.0F);
        this.segment2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.1745F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 44, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.2F, 5.65F, -2.0F);
        this.segment2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.1745F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 44, 0.75F, -7.55F, -2.51F, 2, 4, 2, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.75F, 1.5F, -3.5F);
        this.segment2.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, 0.2618F);
        this.legR2.cubeList.add(new ModelBox(legR2, 16, 50, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.75F, 1.5F, -3.5F);
        this.segment2.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, -0.2618F);
        this.legL2.cubeList.add(new ModelBox(legL2, 12, 50, -0.6641F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.segment1 = new AdvancedModelRenderer(this);
        this.segment1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.segment2.addChild(segment1);
        this.segment1.cubeList.add(new ModelBox(segment1, 0, 22, -1.5F, -1.25F, -4.49F, 3, 3, 3, 0.0F, false));
        this.segment1.cubeList.add(new ModelBox(segment1, 10, 34, -1.0F, -1.75F, -4.48F, 2, 1, 3, 0.0F, false));
        this.segment1.cubeList.add(new ModelBox(segment1, 30, 6, -1.0F, -1.24F, -2.25F, 2, 3, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2F, 5.65F, -1.5F);
        this.segment1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.1745F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 44, -2.75F, -7.55F, -2.5F, 2, 4, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2F, 5.65F, -1.5F);
        this.segment1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 22, 0.75F, -7.55F, -2.49F, 2, 4, 2, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.75F, 1.5F, -3.0F);
        this.segment1.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, 0.0F, 0.2618F);
        this.legR1.cubeList.add(new ModelBox(legR1, 20, 50, -0.3359F, -0.4558F, -0.5F, 1, 8, 1, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.5F, 1.5F, -3.0F);
        this.segment1.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.0F, -0.2618F);
        this.legL1.cubeList.add(new ModelBox(legL1, 52, 0, -0.4053F, -0.4217F, -0.5F, 1, 8, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -4.5F);
        this.segment1.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -1.25F, -7.25F, 2, 2, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.125F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
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
        this.body.offsetY = 1.32F;

        AdvancedModelRenderer[] bodyF = {this.segment3, this.segment2, this.segment1, this.head};
        AdvancedModelRenderer[] bodyB = {this.segment5, this.segment6, this.segment7, this.segment8, this.segment9};
        AdvancedModelRenderer[] bodyH = {this.head};

        EntityPrehistoricFloraMicrodictyon ee = (EntityPrehistoricFloraMicrodictyon) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 6, head);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.198F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(legL1, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(legR1, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(legL2, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR2, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL3, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR3, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL4, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(legL5, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR5, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL6, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR6, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL7, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR7, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL8, legSpeed * 1.3F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR8, legSpeed * 1.3F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL9, legSpeed * 1.3F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR9, legSpeed * 1.3F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
            this.flap(legL10, legSpeed * 1.3F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(legR10, legSpeed * 1.3F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
        }

        if (f3 != 0.0f) {
            this.walk(legL1, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(legR1, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(legL2, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR2, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL3, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR3, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL4, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL5, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR5, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL6, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR6, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL7, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR7, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL8, legSpeed * 1.3F, -legWalkDegree * 1.3F, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR8, legSpeed * 1.3F, legWalkDegree * 1.3F, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL9, legSpeed * 1.3F, -legWalkDegree * 1.3F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR9, legSpeed * 1.3F, legWalkDegree * 1.3F, false, 18.0F, legWalkDegree, f2, 0.3F);
            this.walk(legL10, legSpeed * 1.3F, -legWalkDegree * 1.3F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(legR10, legSpeed * 1.3F, legWalkDegree * 1.3F, false, 18.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(body, 1F, 0.02F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);
        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyH, legSpeed * 1.25F, 0.4f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyH, legSpeed * 1.25F, 0.25F, 0.8F, f2, 0.45F);
        }
        this.chainWave(bodyF, 0.4F, 0.02f, 0.05, f2, 0.1F);
        this.chainSwing(bodyB, 0.085F, 0.2f, 0.1, f2, 0.15F);
        this.chainSwing(bodyF, 0.06F, 0.4F, -1, f2, 0.25F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMicrodictyon e = (EntityPrehistoricFloraMicrodictyon) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(60);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.head, (float) Math.toRadians(30), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(60);
    }
}
