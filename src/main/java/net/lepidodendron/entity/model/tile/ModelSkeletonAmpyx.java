package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAmpyx extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer ampyx1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer ampyx2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer ampyx3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer ampyx4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer ampyx5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer ampyx6;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;

    public ModelSkeletonAmpyx() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(-0.5F, 22.25F, 1.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 18, -5.5F, 0.75F, -14.0F, 16, 1, 16, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -13.5F, 0.75F, -5.0F, 16, 1, 16, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -0.5F, 0.75F, 2.0F, 16, 1, 16, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -12.5F, 0.75F, 11.0F, 16, 1, 16, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -1.5F, 0.75F, 18.0F, 16, 1, 16, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, 0.5F, 0.75F, 34.0F, 16, 1, 16, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -10.5F, 0.75F, 43.0F, 16, 1, 16, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -7.5F, 0.75F, 56.0F, 16, 1, 16, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, 3.5F, 0.75F, 56.0F, 16, 1, 16, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, 5.5F, 0.75F, 47.0F, 16, 1, 16, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 18, -14.5F, 0.75F, 27.0F, 16, 1, 16, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, -14, 35, -7.0F, 0.7F, -14.0F, 17, 0, 29, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, -14, 35, -8.0F, 0.7F, 15.0F, 17, 0, 29, 0.0F, true));
        this.base.cubeList.add(new ModelBox(base, -14, 35, -3.0F, 0.7F, 43.0F, 17, 0, 29, 0.0F, true));

        this.ampyx1 = new AdvancedModelRenderer(this);
        this.ampyx1.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.base.addChild(ampyx1);
        this.setRotateAngle(ampyx1, 0.0F, -0.1745F, 0.0F);
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx1.cubeList.add(new ModelBox(ampyx1, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.829F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.ampyx1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 0, -6.5F, -0.5F, -1.75F, 14, 0, 14, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.ampyx2 = new AdvancedModelRenderer(this);
        this.ampyx2.setRotationPoint(-1.0F, 0.25F, 12.0F);
        this.base.addChild(ampyx2);
        this.setRotateAngle(ampyx2, 0.0F, -0.0873F, 0.0F);
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx2.cubeList.add(new ModelBox(ampyx2, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.829F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.ampyx2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 0, -6.5F, -0.5F, -1.75F, 14, 0, 14, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.829F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.ampyx3 = new AdvancedModelRenderer(this);
        this.ampyx3.setRotationPoint(0.0F, 0.25F, 23.0F);
        this.base.addChild(ampyx3);
        this.setRotateAngle(ampyx3, 0.0F, 0.1309F, 0.0F);
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 4, 0, -6.5F, 0.0F, -2.75F, 14, 0, 14, 0.0F, false));
        this.ampyx3.cubeList.add(new ModelBox(ampyx3, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.829F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.ampyx4 = new AdvancedModelRenderer(this);
        this.ampyx4.setRotationPoint(1.0F, 0.25F, 39.0F);
        this.base.addChild(ampyx4);
        this.setRotateAngle(ampyx4, 0.0F, 0.1309F, 0.0F);
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx4.cubeList.add(new ModelBox(ampyx4, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.829F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.ampyx4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 0, -6.5F, -0.5F, -1.75F, 14, 0, 14, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.829F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.ampyx5 = new AdvancedModelRenderer(this);
        this.ampyx5.setRotationPoint(2.0F, 0.25F, 49.0F);
        this.base.addChild(ampyx5);
        this.setRotateAngle(ampyx5, 0.0F, 0.1309F, 0.0F);
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx5.cubeList.add(new ModelBox(ampyx5, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.829F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.ampyx5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0175F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 4, 0, -6.5F, -0.5F, -1.75F, 14, 0, 14, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.829F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        this.ampyx6 = new AdvancedModelRenderer(this);
        this.ampyx6.setRotationPoint(6.0F, 0.25F, 60.0F);
        this.base.addChild(ampyx6);
        this.setRotateAngle(ampyx6, 0.0F, 0.3927F, 0.0F);
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 5, 11, 0.0F, -0.75F, -4.85F, 1, 1, 3, 0.0F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 12, 14, -0.5F, -0.5F, -0.3F, 2, 1, 1, -0.02F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 8, 6, 1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 6, 15, -1.25F, -0.5F, -1.45F, 1, 1, 1, 0.02F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 0, 7, -1.0F, -0.5F, -1.75F, 3, 1, 2, 0.03F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 10, 12, -1.0F, -0.5F, -2.75F, 3, 1, 1, 0.02F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 4, 0, -6.5F, 0.0F, -2.75F, 14, 0, 14, 0.0F, false));
        this.ampyx6.cubeList.add(new ModelBox(ampyx6, 0, 0, 0.0F, -0.525F, -4.25F, 1, 1, 2, 0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-3.0F, 0.5F, -2.0F);
        this.ampyx6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.829F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 14, 0.675F, -1.0F, -3.95F, 1, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.25F, -4.75F);
        this.ampyx6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -0.5F, -0.5F, -7.15F, 1, 0, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(3.0F, 0.5F, -2.0F);
        this.ampyx6.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.829F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 3, -1.0F, -1.0F, -3.225F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
