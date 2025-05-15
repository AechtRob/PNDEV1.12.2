package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSiamamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSiamamia extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer pectralfinright;
    private final AdvancedModelRenderer pectralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer dorsalfin1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer dorsalfin7;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer dorsalfin8;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer dorsalfin9;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r28;

    private ModelAnimator animator;

    public ModelSiamamia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.15F, -2.25F);
        this.body.cubeList.add(new ModelBox(body, 22, 0, -2.5F, -1.35F, -1.025F, 5, 2, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 37, -2.5F, -1.275F, 3.275F, 5, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.5F, -2.925F, -3.4F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 7, -1.0F, 0.0F, 0.05F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.35F, -5.475F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, -0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 7, 0.0F, 0.0F, -0.95F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.35F, -5.475F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.3491F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 7, -1.0F, 0.0F, -0.95F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 2.15F, -0.775F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 4, 0.0F, -4.0F, -5.2F, 3, 1, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, -1.225F, 0.925F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5061F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 7, 0.0F, -4.0F, -4.675F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.125F, 0.025F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 40, -2.0F, -4.0F, -1.2F, 5, 3, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 21, -2.0F, -4.0F, -3.2F, 5, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, -2.925F, -3.4F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, -0.2182F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 7, 0.0F, 0.0F, 0.05F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.35F, 4.225F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 29, -2.5F, -2.0F, -1.0F, 5, 4, 4, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.025F, 0.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -3.0F, -4.0F, -1.0F, 6, 4, 5, 0.0F, false));

        this.pectralfinright = new AdvancedModelRenderer(this);
        this.pectralfinright.setRotationPoint(-2.5F, 0.225F, 3.0F);
        this.body.addChild(pectralfinright);
        this.setRotateAngle(pectralfinright, -0.2618F, -0.3927F, 0.0F);
        this.pectralfinright.cubeList.add(new ModelBox(pectralfinright, 0, 43, 0.0F, -2.25F, -0.25F, 0, 3, 5, 0.0F, false));

        this.pectralfinleft = new AdvancedModelRenderer(this);
        this.pectralfinleft.setRotationPoint(2.5F, 0.225F, 3.0F);
        this.body.addChild(pectralfinleft);
        this.setRotateAngle(pectralfinleft, -0.2618F, 0.3927F, 0.0F);
        this.pectralfinleft.cubeList.add(new ModelBox(pectralfinleft, 0, 43, 0.0F, -2.25F, -0.25F, 0, 3, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.775F, 7.025F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -2.5F, -2.35F, -0.475F, 5, 5, 5, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.7F, 0.525F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 27, -2.5F, -1.0F, -1.0F, 5, 1, 5, 0.0F, false));

        this.dorsalfin1 = new AdvancedModelRenderer(this);
        this.dorsalfin1.setRotationPoint(0.0F, -2.675F, 1.275F);
        this.body2.addChild(dorsalfin1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.075F, 0.0F);
        this.dorsalfin1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 51, 0.01F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -2.75F, 2.775F);
        this.body2.addChild(dorsalfin2);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 4, 51, -0.01F, -1.95F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -2.8F, 4.275F);
        this.body2.addChild(dorsalfin3);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 8, 53, 0.01F, -1.9F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.275F, 4.275F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0262F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -2.0F, -2.5139F, -0.4347F, 4, 4, 6, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 4.7861F, 0.8903F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 19, -3.0F, -4.0F, -1.0F, 4, 2, 6, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -2.525F, 1.25F);
        this.body3.addChild(dorsalfin4);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.9F, 0.0F);
        this.dorsalfin4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 44, -0.01F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -2.475F, 3.75F);
        this.body3.addChild(dorsalfin5);
        this.dorsalfin5.cubeList.add(new ModelBox(dorsalfin5, 18, 47, 0.01F, -2.35F, -1.0F, 0, 3, 3, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 2.275F, 1.45F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.3927F, -0.0436F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 10, 43, 0.0F, -1.0F, -0.5F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 2.275F, 1.45F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.3927F, 0.0436F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 10, 43, 0.0F, -1.0F, -0.5F, 0, 2, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.2639F, 5.5653F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 20, 9, -1.5F, -2.2F, -1.0F, 3, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.0F, 1.85F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 40, 0.0F, -1.7861F, -1.6153F, 0, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.95F, 0.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 33, -1.0F, -0.3027F, -1.061F, 3, 1, 6, -0.01F, false));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -2.2111F, 0.6847F);
        this.body4.addChild(dorsalfin6);
        this.dorsalfin6.cubeList.add(new ModelBox(dorsalfin6, 24, 47, -0.01F, -2.35F, -1.0F, 0, 3, 3, 0.0F, false));

        this.dorsalfin7 = new AdvancedModelRenderer(this);
        this.dorsalfin7.setRotationPoint(0.0F, -2.2111F, 3.1847F);
        this.body4.addChild(dorsalfin7);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.dorsalfin7.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 48, 0.01F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.05F, 5.0F);
        this.body4.addChild(body5);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.15F, 1.1F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 40, -1.0F, -2.0F, -2.0F, 2, 2, 5, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.9F, 1.1F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0611F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 13, -1.0F, -3.0F, -2.0F, 2, 3, 5, 0.0F, false));

        this.dorsalfin8 = new AdvancedModelRenderer(this);
        this.dorsalfin8.setRotationPoint(0.0F, -2.0611F, 0.6847F);
        this.body5.addChild(dorsalfin8);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.175F, -0.2F);
        this.dorsalfin8.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 48, -0.01F, -2.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.dorsalfin9 = new AdvancedModelRenderer(this);
        this.dorsalfin9.setRotationPoint(0.0F, -1.6611F, 2.6847F);
        this.body5.addChild(dorsalfin9);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.075F, -0.2F);
        this.dorsalfin9.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 50, 0.01F, -2.0F, -0.8F, 0, 2, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.25F, 4.2F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 20, 27, 0.0F, -3.0F, -0.125F, 0, 6, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.5F, -0.325F);
        this.body6.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.672F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 44, -0.5F, -2.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.875F, -1.15F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 7, -1.5F, 0.4F, -4.4F, 3, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.95F, 0.4F, -1.4F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1571F, -0.1745F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 33, 0.0F, -2.0123F, -0.1564F, 0, 2, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.95F, 0.4F, -1.4F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1571F, 0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 33, 0.0F, -2.0123F, -0.1564F, 0, 2, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.4F, -2.25F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1571F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 0, -4.0F, -1.0485F, -0.2565F, 5, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 1.3F, -4.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.5236F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 52, 4, -0.8623F, -0.912F, -0.239F, 1, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.5F, 1.3F, -4.0F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.5236F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 4, -0.1377F, -0.912F, -0.239F, 1, 1, 2, 0.0F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.575F, -2.45F, -5.375F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.3491F, -0.6109F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 48, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.lipright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.4974F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 49, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.575F, -2.45F, -5.375F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.3491F, 0.6109F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 48, 50, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, 2.0F);
        this.lipleft.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2182F, -0.4974F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 49, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

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
        this.body.offsetY = -1.3F;
        this.body.offsetX = 0.268F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.400F;
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
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
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
//        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin1, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6, this.dorsalfin7, this.dorsalfin8, this.dorsalfin9};
        ((EntityPrehistoricFloraSiamamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.5F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.15F * still, -0.85, f2, 0.5F * still);
            this.chainFlap(dorsal, speed * still, 0.4F * still, 4.5, f2, 1F);
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
//            this.body.offsetY = 1.3F;
//            this.body.offsetX = 1.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

