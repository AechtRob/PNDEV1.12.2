package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHemiaster extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;

    public ModelHemiaster() {
        this.textureWidth = 30;
        this.textureHeight = 40;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.5F, 25.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 15, -4.0F, -6.0F, -4.0F, 7, 5, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 29, -5.0F, -5.0F, -3.0F, 9, 4, 5, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -5.0F, -5.0F, 5, 4, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -1.5F, -5.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, 0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, -2.5F, -3.5F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -0.7854F, -3.1416F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-5.0F, -1.5F, -1.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5708F, -1.1781F, -3.1416F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.8F, -3.5F, -1.5F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.9635F, -1.1781F, -3.1416F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.0F, -4.5F, -3.5F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.9635F, -0.7854F, -3.1416F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 1, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -3.5F, -4.8F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.1781F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5F, -5.8F, -3.5F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3927F, 0.0F, -0.7854F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 0, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, -4.8F, -4.2F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7459F, 0.274F, -0.2849F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, -5.8F, -2.5F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3655F, 0.147F, -0.3655F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5F, -6.0F, -0.5F);
        this.bone.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1963F, 0.0F, -0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.5F, -6.0F, 1.5F);
        this.bone.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 1, 0, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, -6.0F, 1.5F);
        this.bone.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -5.8F, 3.5F);
        this.bone.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3655F, -0.147F, -0.3655F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.5F, -5.8F, 3.5F);
        this.bone.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, -0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, -4.6F, 4.5F);
        this.bone.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7459F, -0.274F, -0.2849F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.0F, -4.5F, 4.0F);
        this.bone.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.1781F, -0.7854F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 1, 1, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -3.5F, 4.8F);
        this.bone.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -1.1781F, -0.3927F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, -2.5F, 4.0F);
        this.bone.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -1.5708F, -0.7854F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, -1.5F, 5.0F);
        this.bone.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.5708F, -0.3927F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.5F, -5.8F, 3.5F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3927F, 0.0F, 0.7854F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.5F, -6.0F, 1.5F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 1, 0, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.5F, -6.0F, -0.5F);
        this.bone.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1963F, 0.0F, 0.7854F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.5F, -5.8F, -3.5F);
        this.bone.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3927F, 0.0F, 0.7854F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 1, 0, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.8F, -3.5F, -1.5F);
        this.bone.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.9635F, 1.1781F, 3.1416F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(4.0F, -1.5F, -1.5F);
        this.bone.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.5708F, 1.1781F, 3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.0F, -4.5F, -3.5F);
        this.bone.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.9635F, 0.7854F, 3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 1, 1, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, -2.5F, -3.5F);
        this.bone.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.5708F, 0.7854F, 3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.0F, -4.5F, 4.0F);
        this.bone.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.1781F, 0.7854F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 1, 1, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.0F, -2.5F, 4.0F);
        this.bone.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.5708F, 0.7854F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.8F, -3.5F, 0.5F);
        this.bone.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.1781F, -1.1781F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-5.0F, -1.5F, 0.5F);
        this.bone.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.5708F, -1.1781F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.8F, -3.5F, 0.5F);
        this.bone.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.1781F, 1.1781F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(4.0F, -1.5F, 0.5F);
        this.bone.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -1.5708F, 1.1781F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.5F, -3.5F, 4.8F);
        this.bone.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -1.1781F, 0.3927F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, -1.5F, 5.0F);
        this.bone.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -1.5708F, 0.3927F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.5F, -1.5F, -5.0F);
        this.bone.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.5708F, -0.3927F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 1, 1, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.5F, -3.5F, -4.8F);
        this.bone.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.1781F, -0.3927F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 1, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, -4.8F, -4.2F);
        this.bone.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.7459F, -0.274F, 0.2849F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, -4.6F, 4.5F);
        this.bone.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.7459F, 0.274F, 0.2849F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.5F, -5.8F, 3.5F);
        this.bone.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.3655F, 0.147F, 0.3655F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 1, 3, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.5F, -6.0F, 1.5F);
        this.bone.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.3927F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.5F, -5.8F, -2.5F);
        this.bone.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3655F, -0.147F, 0.3655F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 1, 2, 0.0F, -1.5F, -0.5F, 0, 2, 1, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

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

        //this.root.offsetY = 1.29F;
        float speed = 0.15F;
        float modifier = 1f;
        if (f3 == 0) {
            modifier = 0.5F;
        }

    }
}
