package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTomognathus;
import net.lepidodendron.entity.EntityPrehistoricFloraVidalamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTomognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer pelvecfinright;
    private final AdvancedModelRenderer pelvecfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer dorsalfin7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelTomognathus() {
        this.textureWidth = 80;
        this.textureHeight = 72;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 32, 10, -3.5F, 2.05F, -2.0F, 7, 6, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -0.025F, 0.0F, 6, 8, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 38, -3.0F, 0.0F, -3.0F, 6, 4, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 8.15F, 1.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0262F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 18, -2.0F, -1.0F, -2.0F, 5, 1, 11, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.4F, 7.8F, 1.0F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.2182F, -0.1745F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 16, 48, 0.0F, -2.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.4F, 7.8F, 1.0F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.2182F, 0.1745F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 16, 48, 0.0F, -2.5F, 0.0F, 0, 3, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 3.075F, 10.0F);
        this.body.addChild(body2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 5.15F, 0.1F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1091F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 0, -3.0F, -2.0F, -1.0F, 4, 2, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 3.95F, 0.05F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 30, -4.0F, -7.0F, -1.0F, 5, 7, 8, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -3.05F, 1.0F);
        this.body2.addChild(dorsalfin4);
        this.dorsalfin4.cubeList.add(new ModelBox(dorsalfin4, 22, 58, 0.0F, -5.3F, -1.0F, 0, 6, 4, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -2.8F, 5.0F);
        this.body2.addChild(dorsalfin5);
        this.dorsalfin5.cubeList.add(new ModelBox(dorsalfin5, 62, 45, 0.0F, -4.55F, -1.0F, 0, 5, 3, 0.0F, false));

        this.pelvecfinright = new AdvancedModelRenderer(this);
        this.pelvecfinright.setRotationPoint(-1.0F, 4.9F, 2.85F);
        this.body2.addChild(pelvecfinright);
        this.setRotateAngle(pelvecfinright, 0.3491F, 0.0F, 0.5236F);
        this.pelvecfinright.cubeList.add(new ModelBox(pelvecfinright, 64, 37, 0.0F, -0.5F, -0.4F, 0, 3, 3, 0.0F, false));

        this.pelvecfinleft = new AdvancedModelRenderer(this);
        this.pelvecfinleft.setRotationPoint(1.0F, 4.9F, 2.85F);
        this.body2.addChild(pelvecfinleft);
        this.setRotateAngle(pelvecfinleft, 0.3491F, 0.0F, -0.5236F);
        this.pelvecfinleft.cubeList.add(new ModelBox(pelvecfinleft, 64, 37, 0.0F, -0.5F, -0.4F, 0, 3, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.05F, 7.05F);
        this.body2.addChild(body3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.35F, 1.75F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2443F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 48, 0.0F, -1.0F, -2.0F, 0, 3, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 4.0F, 1.5F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 20, -2.0F, -2.0F, -2.0F, 3, 2, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 2.5F, 1.2F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 20, -3.0F, -5.0F, -2.0F, 4, 5, 5, 0.0F, false));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -2.5F, 0.95F);
        this.body3.addChild(dorsalfin6);
        this.dorsalfin6.cubeList.add(new ModelBox(dorsalfin6, 36, 63, 0.0F, -3.8F, -1.0F, 0, 4, 3, 0.0F, false));

        this.dorsalfin7 = new AdvancedModelRenderer(this);
        this.dorsalfin7.setRotationPoint(0.0F, -2.4F, 3.45F);
        this.body3.addChild(dorsalfin7);
        this.dorsalfin7.cubeList.add(new ModelBox(dorsalfin7, 64, 31, 0.0F, -2.9F, -0.5F, 0, 3, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 4.2F);
        this.body3.addChild(body4);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.6F, 0.425F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2094F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 55, -1.0F, -2.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.25F, 0.175F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 45, -2.0F, -4.0F, -1.0F, 3, 4, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.4F, 4.175F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 26, 30, 0.0F, -3.5F, -0.35F, 0, 8, 10, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.65F, 0.9F);
        this.body5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 58, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -0.025F, 1.0F);
        this.body.addChild(dorsalfin1);
        this.dorsalfin1.cubeList.add(new ModelBox(dorsalfin1, 30, 63, 0.0F, -4.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -0.025F, 4.0F);
        this.body.addChild(dorsalfin2);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 52, 61, 0.0F, -6.0F, -1.0F, 0, 6, 3, 0.0F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -0.025F, 7.0F);
        this.body.addChild(dorsalfin3);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 14, 58, 0.0F, -6.0F, -1.0F, 0, 6, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 5.75F, -2.5F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 8, -2.0F, -2.9F, -2.75F, 4, 5, 4, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.95F, -6.55F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.288F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 58, -2.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.325F, -5.8F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 29, -2.0F, -1.0F, -1.0F, 3, 1, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.425F, -5.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 43, -2.0F, -1.0F, -1.0F, 3, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.925F, -6.35F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 66, -3.0F, -1.0F, -1.0F, 4, 1, 5, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.5F, 6.0F, -3.15F);
        this.body.addChild(upperjaw);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -2.425F, -2.975F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 58, 54, -3.0F, -2.0F, 1.0F, 4, 2, 2, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, -3.775F, -2.95F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 56, 3, -2.0F, -1.0F, -1.7F, 3, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -2.025F, -4.75F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 47, -2.0F, -0.25F, -1.35F, 3, 1, 0, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 29, -2.5F, -1.0F, -1.7F, 4, 1, 1, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.55F, -3.85F, -4.45F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1309F, -0.3491F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 48, -1.0F, 0.0F, -1.7F, 1, 0, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.55F, -3.85F, -4.45F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.3491F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 48, 0.0F, 0.0F, -1.7F, 1, 0, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, -2.1F, -4.35F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5672F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 62, -2.0F, -2.0F, -1.7F, 3, 2, 2, 0.01F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 30, -2.5F, -3.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, -1.65F, -4.05F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5672F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 17, -3.0F, -3.0F, -0.1F, 4, 1, 1, 0.01F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 27, -3.0F, -3.0F, 0.4F, 4, 1, 1, 0.015F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 17, -3.0F, -2.75F, 0.15F, 4, 1, 1, 0.02F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 27, -3.0F, -2.5F, -0.1F, 4, 1, 1, 0.015F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 45, -3.0F, -2.5F, 0.4F, 4, 1, 1, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.75F, -1.75F, -5.2F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5236F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 48, 0.55F, -0.75F, -1.0F, 0, 1, 1, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 48, 3.95F, -0.75F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 0.55F, 0.65F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 45, -4.0F, -6.0F, -1.0F, 5, 7, 3, 0.0F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.0F, -3.25F, -5.85F);
        this.upperjaw.addChild(lipright);
        this.setRotateAngle(lipright, -0.5672F, -0.0698F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 44, 54, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.lipright.cubeList.add(new ModelBox(lipright, 58, 64, -0.2F, -0.25F, 2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.lipright.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2269F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 61, 0.0F, -0.8F, 1.1F, 1, 1, 4, -0.01F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(2.0F, -3.25F, -5.85F);
        this.upperjaw.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.5672F, 0.0698F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 44, 54, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, true));
        this.lipleft.cubeList.add(new ModelBox(lipleft, 58, 64, 0.2F, -0.25F, 2.0F, 0, 1, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.lipleft.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2269F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 42, 61, -1.0F, -0.8F, 1.1F, 1, 1, 4, -0.01F, true));

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

    }

    public void renderStaticWall(float f) {
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6, this.dorsalfin7};
        ((EntityPrehistoricFloraTomognathus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
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
            this.chainSwing(fishTail, speed * still, 0.16F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.3F * still, -3.5, f2, 1F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvecfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvecfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvecfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvecfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
//            this.body.offsetY = -0.1F;
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

