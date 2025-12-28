package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelProtosphyraena extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer fillamentleft;
    private final AdvancedModelRenderer fillamentright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer jawslope;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer lipleft;

    public ModelProtosphyraena() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-2.25F, 18.05F, -5.95F);
        this.body.cubeList.add(new ModelBox(body, 38, 31, -0.75F, -2.45F, 2.95F, 6, 6, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 56, 9, 1.75F, -0.35F, -7.425F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 53, 1.25F, -0.35F, -6.425F, 2, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 53, 0.2F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 53, 3.3F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 34, 0, -1.25F, -3.75F, 7.5F, 7, 8, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(5.25F, 4.45F, 8.575F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 67, -6.0F, -1.0F, -1.0F, 6, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(5.25F, -2.75F, 8.825F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 7, -6.0F, -2.0F, -1.0F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.25F, 0.05F, -0.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 27, -2.0F, -2.0F, -1.0F, 4, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.75F, -0.8F, -0.55F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 36, -2.0F, -1.0F, -4.0F, 3, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.25F, 0.65F, -7.25F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 49, -0.5F, -1.0F, -4.175F, 1, 1, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.15F, 0.15F, -5.275F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6109F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 9, 0.0F, 0.0F, -0.175F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 60, 9, -1.8F, 0.0F, -0.175F, 0, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.15F, 0.05F, -3.375F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 39, 0.0F, 0.0F, -0.175F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 39, -1.8F, 0.0F, -0.175F, 0, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.75F, -0.35F, -5.375F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 16, -1.5F, 0.0F, -0.175F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.75F, 0.85F, -0.55F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 32, -2.0F, -1.0F, -4.0F, 3, 1, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.25F, 0.95F, -1.05F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 0, -2.0F, -2.0F, -1.4F, 4, 2, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.75F, -2.6F, 0.95F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2923F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 31, -2.0F, 0.0F, 0.0F, 5, 4, 7, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.75F, 1.95F, 2.95F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 63, -2.0F, -4.0F, -3.0F, 5, 4, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.25F, 3.55F, 2.95F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 63, -2.5F, -1.0F, 0.0F, 5, 1, 5, 0.0F, false));

        this.fillamentleft = new AdvancedModelRenderer(this);
        this.fillamentleft.setRotationPoint(5.25F, 3.55F, 7.15F);
        this.body.addChild(fillamentleft);
        this.setRotateAngle(fillamentleft, 0.9512F, 0.0F, -0.6981F);
        this.fillamentleft.cubeList.add(new ModelBox(fillamentleft, 72, 72, 0.0F, 0.0F, -0.5F, 0, 17, 2, 0.0F, true));

        this.fillamentright = new AdvancedModelRenderer(this);
        this.fillamentright.setRotationPoint(-0.75F, 3.55F, 7.15F);
        this.body.addChild(fillamentright);
        this.setRotateAngle(fillamentright, 0.9512F, 0.0F, 0.6981F);
        this.fillamentright.cubeList.add(new ModelBox(fillamentright, 72, 72, 0.0F, 0.0F, -0.5F, 0, 17, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(5.25F, 3.3F, 6.45F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, -0.8727F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 14, 63, 0.0F, 0.0F, -0.5F, 0, 18, 3, 0.0F, true));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-0.75F, 3.3F, 6.45F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, 0.8727F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 14, 63, 0.0F, 0.0F, -0.5F, 0, 18, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(2.25F, -0.95F, 11.45F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 51, 0.0F, -12.35F, 0.0F, 0, 9, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.5F, -3.0F, -0.75F, 7, 8, 10, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 6.0F, 4.25F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0611F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 56, -3.0F, -2.0F, 0.0F, 6, 2, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.9F, 4.0F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 42, -3.0F, -2.0F, 0.125F, 6, 2, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.875F, 4.3F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 56, -3.0F, -2.0F, -5.0F, 6, 2, 5, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 6.0F, 4.25F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 0, -3.0F, -2.0F, -5.0F, 6, 2, 5, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.75F, 9.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 18, -3.0F, -2.75F, -1.0F, 6, 6, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -3.0F, 6.0F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1396F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 21, -2.0F, 0.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 3.7F, 6.0F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1833F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 12, -2.0F, -2.0F, -7.0F, 5, 2, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 4.4F, 0.25F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 67, 0.0F, 0.0F, 0.0F, 0, 5, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 14, 42, -2.0F, -2.25F, -1.0F, 4, 5, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -1.625F, 5.0F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1222F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 20, -1.0F, -0.75F, -6.0F, 3, 1, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 2.75F, 5.0F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 64, 13, -1.0F, -0.7F, -6.0F, 3, 1, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 60, 30, -1.5F, -1.6F, -1.0F, 3, 3, 6, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.55F, -0.025F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 72, -1.0F, -1.0F, -1.0F, 2, 1, 6, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.75F, -0.025F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1396F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 71, -1.0F, -0.975F, -1.0F, 2, 2, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.15F, 5.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 78, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 78, 59, -1.0F, -0.5F, 4.0F, 2, 1, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 34, 42, -2.5F, 0.0F, 0.0F, 5, 0, 7, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 34, 49, -2.5F, 0.01F, 0.0F, 5, 0, 7, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 18, 0.0F, -13.0F, 4.75F, 0, 26, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.975F, -0.05F);
        this.body6.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1963F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 58, 58, -1.0F, -1.0F, -1.0F, 2, 1, 8, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.85F, 0.125F);
        this.body6.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.192F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 58, 49, -1.0F, -1.0F, -1.0F, 2, 1, 8, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(2.25F, 1.8F, 2.95F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 75, -1.5F, 0.0F, -4.75F, 3, 1, 5, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 39, -0.75F, -0.6F, -7.25F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 39, 0.75F, -0.6F, -7.25F, 0, 1, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 0.1F, -1.25F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.3054F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 12, 1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 0.1F, -1.25F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1309F, -0.3054F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 34, 12, -1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.25F, 1.4F, -4.5F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 9, 1.0F, -1.0F, -4.0F, 0, 1, 1, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 9, -0.5F, -1.0F, -4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, 1.0F, -4.75F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.096F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 56, 7, -1.0F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 53, -0.5F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, -0.075F, -4.75F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1571F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 38, 69, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.jawslope = new AdvancedModelRenderer(this);
        this.jawslope.setRotationPoint(-0.5F, 1.0F, -4.5F);
        this.jaw.addChild(jawslope);
        this.setRotateAngle(jawslope, -0.1396F, 0.0F, 0.0F);
        this.jawslope.cubeList.add(new ModelBox(jawslope, 76, 72, -1.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(0.25F, 0.05F, -2.15F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.192F, -0.2269F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 78, 54, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(4.25F, 0.05F, -2.15F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.192F, 0.2269F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 78, 54, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {

        this.body.offsetY = -0.16F;
        this.body.offsetZ = -0.028F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.body.offsetY = -0.4F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.body.offsetY = 0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.6F;
        this.body.offsetX = 0.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(202);
        this.body.rotateAngleX = (float)Math.toRadians(32);
        this.body.rotateAngleZ = (float)Math.toRadians(-12);
        this.body.scaleChildren = true;
        float scaler = 0.6F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
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
        //this.body.offsetY = 0.65F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.265F, -2, f2, 1);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.45F-0.65F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
