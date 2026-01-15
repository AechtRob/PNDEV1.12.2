package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBananogmius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBananogmius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer lipleft;

    private ModelAnimator animator;

    public ModelBananogmius() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.0F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 16, -3.0F, -4.0F, -1.0F, 6, 8, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 0, -0.01F, -14.0F, -2.0F, 0, 10, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 40, -2.5F, -2.0F, -5.0F, 5, 5, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 62, -2.0F, -1.1F, -7.0F, 4, 3, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 14, -2.1F, -0.425F, -6.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 14, 1.1F, -0.425F, -6.0F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.775F, -4.2F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 46, -2.0F, 0.0F, -1.0F, 4, 3, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.1F, -5.2F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6196F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 54, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.9F, -1.225F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 7, -2.5F, 0.0F, 0.0F, 5, 2, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.4F, 3.025F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 57, -2.5F, 0.0F, 0.0F, 5, 2, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.05F, 0.925F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 0, -2.5F, 0.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.4F, -1.975F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 57, -2.5F, 0.0F, 0.0F, 5, 3, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.65F, -2.0F, -3.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1833F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 61, -1.0F, 0.0F, -1.0F, 1, 5, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.65F, -2.0F, -3.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1833F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 61, 0.0F, 0.0F, -1.0F, 1, 5, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.425F, -6.975F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 62, -1.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4F, -9.05F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.0036F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 61, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3F, -8.65F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 16, -1.5F, -0.025F, 0.2F, 3, 1, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.125F, -8.275F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 26, -1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.0F, -0.1F, 0.75F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.2618F, -0.3054F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.75F, 0.65F);
        this.pectoralfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 31, 0.0F, -2.5F, -1.0F, 0, 3, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.0F, -0.1F, 0.75F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.2618F, 0.3054F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.75F, 0.65F);
        this.pectoralfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 31, 0.0F, -2.5F, -1.0F, 0, 3, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.8F, -5.15F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 46, -1.5F, -0.25F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.15F, -2.2F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 66, 12, -1.0F, -1.0F, -2.0F, 2, 1, 3, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.75F, -2.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 66, 23, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.925F, -1.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 54, -1.5F, -1.0F, -0.75F, 3, 1, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.025F, -1.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 51, -1.5F, -1.0F, -1.0F, 3, 1, 2, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 30, 0.0F, -13.0F, 0.0F, 0, 9, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, -4.25F, 0.0F, 6, 9, 7, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.6F, 5.025F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 63, -2.5F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -4.9F, 5.125F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 42, -2.5F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 4.45F, -0.875F);
        this.body2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0305F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 46, 20, -2.5F, 0.0F, 1.0F, 5, 1, 5, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -5.2F, -0.875F);
        this.body2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.048F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 14, -2.5F, 0.0F, 1.0F, 5, 1, 5, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 62, 46, 0.0F, -8.75F, 0.0F, 0, 6, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 26, 18, -2.5F, -3.1F, -1.0F, 5, 7, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 5.675F, 0.5F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1091F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 56, -2.0F, -3.0F, -1.0F, 4, 3, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -2.15F, 0.95F);
        this.body3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1527F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 49, -2.0F, -2.0F, -2.0F, 4, 2, 5, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 3.975F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 63, 0.0F, 2.85F, 0.025F, 0, 5, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 32, 63, 0.0F, -6.9F, 0.025F, 0, 5, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 40, 30, -2.0F, -2.25F, -0.975F, 4, 5, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.6F, 0.5F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.288F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 40, -1.5F, -2.0F, -1.0F, 3, 2, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 4.75F, 0.4F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4625F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 46, 49, -1.5F, -3.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.75F, 4.025F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 10, 66, 0.0F, -5.15F, 0.0F, 0, 5, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 40, 63, 0.0F, 1.6F, 0.0F, 0, 7, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 58, 26, -1.5F, -0.8F, -1.0F, 3, 3, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 3.95F, -0.65F);
        this.body5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4102F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 6, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.175F, -1.35F);
        this.body5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.288F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 62, 0, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.7F, 3.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 16, 66, 0.0F, 0.9F, 0.0F, 0, 4, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 31, 0.0F, -7.6F, 4.0F, 0, 15, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 54, 67, 0.0F, -3.85F, 0.0F, 0, 3, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 58, 33, -1.0F, -1.075F, -1.0F, 2, 2, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 66, 67, -0.5F, -1.075F, 3.575F, 1, 2, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.425F, 0.725F);
        this.body6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3578F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 46, 67, -0.5F, -2.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.425F, 0.125F);
        this.body6.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2269F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 66, 19, -0.5F, -2.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-2.0F, 5.425F, 1.25F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.5672F, -0.2618F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 60, 67, 0.0F, -1.75F, -0.4F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(2.0F, 5.425F, 1.25F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.5672F, 0.2618F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 60, 67, 0.0F, -1.75F, -0.4F, 0, 2, 3, 0.0F, true));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.45F, -0.375F, -8.55F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.6109F, -0.336F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 64, 56, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.01F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.45F, -0.375F, -8.55F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.6109F, 0.336F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 64, 56, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.6F;
        this.body.offsetX = 0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.18F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        ((EntityPrehistoricFloraBananogmius)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = -0.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

