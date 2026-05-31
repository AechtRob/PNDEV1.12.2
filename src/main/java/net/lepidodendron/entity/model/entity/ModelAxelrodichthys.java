package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraAxelrodichthys;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAxelrodichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer liplower;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer lipupper;
    private final AdvancedModelRenderer cube_r36;

    public ModelAxelrodichthys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 21.0F, 1.0F);
        this.base.cubeList.add(new ModelBox(base, 46, 42, -2.5F, -7.0F, -6.0F, 5, 5, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 26, 0, -2.5F, -8.75F, -3.0F, 5, 8, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 16, 45, -2.025F, -5.7F, -8.25F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 16, 45, 1.025F, -5.7F, -8.25F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.1F, -5.3F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 7, -2.0F, -2.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.3F, -1.6F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 47, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -9.025F, -2.525F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2007F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 20, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.8F, -5.6F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 47, -2.0F, -2.0F, 0.0F, 4, 3, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -4.3F, -7.6F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6196F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 20, -3.0F, -2.0F, 0.0F, 4, 3, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -3.75F, -8.6F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 14, -3.0F, -2.0F, -1.0F, 4, 2, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -4.85F, -8.7F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 56, -1.0F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -5.2F, -10.4F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 60, -2.0F, 0.0F, -0.35F, 3, 1, 3, 0.02F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 40, -1.5F, 0.0F, -2.0F, 2, 1, 2, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, -2.0F, -2.75F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.6545F, -0.3491F, 0.3491F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 38, 64, -0.5F, -0.5F, 0.0F, 1, 4, 1, -0.01F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 54, 64, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.pectoralfinright.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 61, 0.0F, -2.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, -2.0F, -2.75F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.6545F, 0.3491F, -0.3491F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 38, 64, -0.5F, -0.5F, 0.0F, 1, 4, 1, -0.01F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 54, 64, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.pectoralfinleft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 61, 0.0F, -2.0F, -1.0F, 0, 6, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 25, -2.5F, -3.0F, -0.75F, 5, 8, 7, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 20, 0.0F, -9.65F, -0.575F, 0, 6, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.775F, 0.05F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0611F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 39, -1.0F, 4.0F, -1.0F, 4, 1, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -7.7F, 0.125F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0262F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 12, -1.0F, 4.0F, -1.0F, 4, 1, 7, 0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 5.0F, 5.0F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.7854F, -0.1745F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 30, 64, -0.5F, -0.5F, 0.0F, 1, 4, 1, -0.01F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 34, 64, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 14, 61, 0.0F, 1.0F, -1.25F, 0, 6, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 5.0F, 5.0F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.7854F, 0.1745F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 30, 64, -0.5F, -0.5F, 0.0F, 1, 4, 1, -0.01F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 34, 64, -0.5F, -0.5F, -0.5F, 1, 4, 1, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 14, 61, 0.0F, 1.0F, -1.25F, 0, 6, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 24, 25, -2.0F, -2.75F, -1.0F, 4, 7, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.425F, 6.95F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.1781F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 65, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.775F, 4.85F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.1345F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 13, -0.5F, -0.55F, -0.225F, 1, 5, 1, 0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 7, -0.5F, -0.55F, 0.25F, 1, 5, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 6.475F, 7.575F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8727F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 64, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -5.925F, 8.175F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9599F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 7, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -4.425F, 6.95F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.829F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 62, 64, -0.5F, 0.0F, 0.0F, 1, 3, 1, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.5F, -5.15F, 5.6F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1963F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 4, 0.0F, 2.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.5F, 1.15F, 0.5F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 0, 0.0F, 3.0F, -1.0F, 3, 1, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, -5.725F, 0.5F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0916F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 50, 0.0F, 2.0F, -1.0F, 3, 2, 5, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 40, -1.5F, -2.25F, -0.75F, 3, 6, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 5.575F, 0.15F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 51, -1.0F, -3.075F, -1.2F, 2, 2, 5, 0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.175F, 0.25F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0175F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 26, -1.0F, -2.0F, -1.0F, 2, 1, 5, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, 4.25F);
        this.body3.addChild(body4);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.4F, 6.8F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2094F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 62, 36, 0.0F, -1.0F, 0.3F, 1, 1, 3, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -4.6F, 13.3F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.9163F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 64, 0.0F, 3.0F, 4.0F, 0, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.7F, 6.8F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, 0.0F, -7.0F, -7.25F, 0, 12, 13, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 1.95F, 6.8F);
        this.body4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 58, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.85F, -0.8F);
        this.body4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 32, -1.0F, 0.25F, 1.0F, 2, 2, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.body4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 50, -1.0F, -3.75F, -1.0F, 2, 6, 4, 0.01F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 42, 60, -1.0F, -2.0F, 3.0F, 2, 2, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -3.65F, -0.025F);
        this.body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3971F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 60, 50, -1.0F, 0.025F, 0.1F, 2, 2, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, -1.95F, 0.175F);
        this.body4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.576F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 57, -1.0F, -2.0F, 2.95F, 2, 2, 5, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 6.15F, -1.35F);
        this.body4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.4363F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 46, 33, -1.0F, -3.0F, 3.0F, 2, 3, 6, -0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.2F, -5.15F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.675F, -3.9F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3971F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 43, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, -0.175F, -4.4F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 62, 0, -1.0F, -1.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 0.725F, -1.1F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3054F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 54, -1.0F, -3.0F, -3.0F, 3, 3, 4, 0.0F, false));

        this.liplower = new AdvancedModelRenderer(this);
        this.liplower.setRotationPoint(0.0F, -1.25F, -6.3F);
        this.jaw.addChild(liplower);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.05F, 0.575F, 2.4F);
        this.liplower.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3971F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 46, 1.0F, -1.475F, -2.0F, 0, 1, 3, 0.0F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 46, -0.9F, -1.475F, -2.0F, 0, 1, 3, 0.0F, false));

        this.lipupper = new AdvancedModelRenderer(this);
        this.lipupper.setRotationPoint(0.025F, -3.575F, -11.725F);
        this.base.addChild(lipupper);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.05F, -1.275F, 3.025F);
        this.lipupper.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0873F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 20, 0.995F, 0.05F, -2.0F, 0, 1, 3, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 20, -0.945F, 0.05F, -2.0F, 0, 1, 3, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 40, 1.0F, 0.55F, -3.0F, 0, 1, 4, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 40, -0.95F, 0.55F, -3.0F, 0, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.40F;
        this.base.offsetX = 0.175F;
        this.base.rotateAngleY = (float)Math.toRadians(220);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 0.51F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticSuspended(float f) {

        this.base.offsetY = 0.05F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.base.offsetY = -0.3F;
        this.base.render(0.01F);
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
        //this.resetToDefaultPose();

        this.base.offsetZ = -0.3F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.15F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);


            //this.walk(Jaw, (float) (speed * 0.5), 0.1F, true, -0.8F, -0.1F, f2, 1);


        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(base, speed*still, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(base, speed*still, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(pectoralfinleft, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.swing(pectoralfinleft, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.walk(pectoralfinright, (float) (speed * 0.75*still), 0.1F, true, 0, 0, f2, 1);
        this.swing(pectoralfinright, (float) (speed * 0.75*still), -0.1F, true, 0, 0, f2, 1);

        this.walk(pelvicfinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.swing(pelvicfinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.flap(pelvicfinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinright, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinright, (float) (speed * 0.75*still), -0.2F, true, 3, 0, f2, 1);
        this.flap(pelvicfinright, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = 0.05F;
            this.base.offsetX = -0.3F;
            this.base.offsetZ = -0.3F;
            this.bob(base, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAxelrodichthys ee = (EntityPrehistoricFloraAxelrodichthys) entitylivingbaseIn;

        if (ee.getAnimation() == ee.ATTACK_ANIMATION || ee.getAnimation() == ee.ROAR_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAxelrodichthys entity = (EntityPrehistoricFloraAxelrodichthys) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 5) / 3) * (0-(22.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.5 + (((tickAnim - 5) / 3) * (0-(12.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(liplower, liplower.rotateAngleX + (float) Math.toRadians(xx), liplower.rotateAngleY + (float) Math.toRadians(yy), liplower.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 5) / 3) * (0-(-20)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lipupper, lipupper.rotateAngleX + (float) Math.toRadians(xx), lipupper.rotateAngleY + (float) Math.toRadians(yy), lipupper.rotateAngleZ + (float) Math.toRadians(zz));
    }

}

