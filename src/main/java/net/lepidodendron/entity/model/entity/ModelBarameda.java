package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarameda extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelBarameda() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 18.0F, -1.0F);
        this.Body.cubeList.add(new ModelBox(Body, 31, 11, -5.0F, -4.5F, -16.5F, 10, 8, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0F, -6.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 32, -4.5F, -1.15F, -10.5F, 9, 2, 11, -0.01F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-4.5F, 1.5F, -13.5F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, 1.0472F, -0.4363F, 0.1309F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 30, 0, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 5, 0, -0.5F, 6.0F, -1.0F, 1, 1, 2, 0.0F, false));
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 27, -0.5F, 2.0F, -1.25F, 1, 4, 3, 0.0F, false));
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 0, 0.0F, 2.0F, -1.25F, 0, 6, 4, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(4.5F, 1.5F, -13.5F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, 1.0472F, 0.4363F, -0.1309F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 30, 0, -0.5F, 0.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 5, 0, -0.5F, 6.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 27, -0.5F, 2.0F, -1.25F, 1, 4, 3, 0.0F, true));
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 0, 0.0F, 2.0F, -1.25F, 0, 6, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -4.5F, -4.25F, 0.0F, 9, 10, 12, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 22, -4.0F, -4.0F, -1.0F, 8, 9, 12, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-2.0F, 4.5F, 7.5F);
        this.Body3.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.7854F, 0.0F, 0.3491F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 8, 3, 0.0F, -0.25F, -0.5F, 1, 3, 1, 0.0F, false));
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 0, 0.5F, 1.0F, -0.25F, 0, 2, 1, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(2.0F, 4.5F, 7.5F);
        this.Body3.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.7854F, 0.0F, -0.3491F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 8, 3, -1.0F, -0.25F, -0.5F, 1, 3, 1, 0.0F, true));
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 0, -0.5F, 1.0F, -0.25F, 0, 2, 1, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.25F, 11.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 43, -3.0F, -3.5F, -1.0F, 6, 8, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.5F, 6.0F);
        this.Body4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 7, 0.0F, 0.0F, 3.0F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 43, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.5F, 8.0F);
        this.Body4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 6, 0.0F, 0.0F, 2.5F, 0, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, 0.0F, -0.5F, 1, 1, 3, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 47, 60, -2.0F, -3.1F, -1.0F, 4, 7, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Body5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 0, 0.0F, 0.0F, 4.0F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 22, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body5.addChild(Tail);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.5F, 3.25F);
        this.Tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 22, 0.0F, -0.15F, 0.0F, 0, 1, 9, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 58, -1.0F, -0.25F, -0.75F, 2, 1, 11, 0.015F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 61, -1.0F, 0.5F, -0.5F, 2, 3, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Tail.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 17, 0.01F, 0.95F, -0.5F, 0, 1, 13, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 30, -1.0F, 0.2F, -0.5F, 2, 1, 11, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 45, -1.0F, -0.75F, 6.75F, 2, 1, 2, -0.015F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 0, -1.0F, -1.75F, -0.75F, 2, 2, 8, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.25F, -16.5F);
        this.Body.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 32, 45, -2.0F, -3.0F, -10.0F, 4, 3, 10, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 30, 10, -2.0F, 0.0F, -9.5F, 4, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.0F, -10.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4014F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 10, -2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.75F, 4.25F, 0.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1004F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 20, -0.5F, -4.75F, -5.5F, 0, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 61, -3.0F, -7.25F, -5.5F, 3, 3, 6, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, 4.25F, -10.0F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 7, -0.5F, -4.75F, 1.0F, 0, 1, 4, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 65, -3.0F, -7.25F, 0.0F, 3, 3, 5, -0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 4.25F, -10.0F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, 0.5F, -4.75F, 1.0F, 0, 1, 4, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 65, 65, 0.0F, -7.25F, 0.0F, 3, 3, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-4.75F, 4.25F, 0.0F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1004F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 20, 0.5F, -4.75F, -5.5F, 0, 1, 3, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 61, 0.0F, -7.25F, -5.5F, 3, 3, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.0F, -10.0F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 0, -3.5F, -1.0F, 4.9F, 7, 4, 6, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.0873F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 60, 60, -4.0F, -2.75F, -2.0F, 8, 3, 2, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 50, 48, -2.0F, 0.0F, -9.75F, 4, 2, 10, 0.0F, false));
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 6, 24, -1.5F, -1.0F, -9.25F, 3, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 1.25F, -9.75F);
        this.Lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 5, -0.575F, -1.75F, 0.05F, 0, 1, 5, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 58, -2.075F, -1.25F, 0.05F, 2, 2, 5, -0.015F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(4.75F, 5.25F, 0.25F);
        this.Lowerjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.1309F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 19, -0.6F, -5.75F, -5.45F, 0, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 45, -3.1F, -5.25F, -5.45F, 3, 2, 6, -0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.0F, 1.25F, -9.75F);
        this.Lowerjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 5, 0.575F, -1.75F, 0.05F, 0, 1, 5, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 58, 0.075F, -1.25F, 0.05F, 2, 2, 5, -0.015F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.75F, 5.25F, 0.25F);
        this.Lowerjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 19, 0.6F, -5.75F, -5.45F, 0, 1, 3, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 45, 0.1F, -5.25F, -5.45F, 3, 2, 6, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetZ = -0.035F;
        this.Body.offsetY = -0.15F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body3, 0.0873F, 0.2182F, 0.0F);
        this.setRotateAngle(Body4, 0.0873F, 0.3054F, 0.0F);
        this.setRotateAngle(Body5, 0.1309F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, 0.1004F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.1004F, 0.0F);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r17, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r18, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralfinL, 1.0472F, 0.4363F, -0.1309F);
        this.setRotateAngle(PectoralfinR, 1.0472F, -0.4363F, 0.1309F);
        this.setRotateAngle(PelvicfinL, 0.7854F, 0.0F, -0.3491F);
        this.setRotateAngle(PelvicfinR, 0.7854F, 0.0F, 0.3491F);
        this.setRotateAngle(Tail, 0.0F, -0.2618F, 0.0F);
        this.Body.offsetZ = -0.035F;
        this.Body.offsetY = -0.4F;
        this.Body.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5, this.Tail};

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
            this.swing(Body, speed, 0.1F * still, true, 0, 0, f2, 0.65F);
        }
        else {
            this.swing(Body, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralfinL, (float) (speed * 0.65), 0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralfinL, (float) (speed * 0.65), 0.6F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralfinR, (float) (speed * 0.65), -0.8F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralfinR, (float) (speed * 0.65), -0.6F, true, 0, 0, f2, 0.5F);

        this.flap(PelvicfinL, (float) (speed * 0.65), 0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicfinL, (float) (speed * 0.65), 0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinL2, (float) (speed * 0.65), 0.4F, true, 1.5F, 0, f2, 0.35F);
        this.flap(PelvicfinR, (float) (speed * 0.65), -0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(PelvicfinR, (float) (speed * 0.65), -0.6F, true, 1, 0, f2, 0.5F);
        //this.swing(pelvicfinR2, (float) (speed * 0.65), -0.4F, true, 1.5F, 0, f2, 0.35F);

        if (!e.isInWater()) {
            //this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = 0.3f;
            this.bob(Body, -speed * 3.8F, 0.25F, false, f2, 1);
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
        animator.move(this.Head, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}

