package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKaykay extends AdvancedModelBase {
    private final AdvancedModelRenderer Kaykay;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Maxillaryleft;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Maxillaryright;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Pectoral2left;
    private final AdvancedModelRenderer Pectoral2right;
    private final AdvancedModelRenderer Pectoral1left;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Pectoral1right;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    private ModelAnimator animator;

    public ModelKaykay() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Kaykay = new AdvancedModelRenderer(this);
        this.Kaykay.setRotationPoint(0.0F, 29.0F, -14.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.Kaykay.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 48, 73, -3.0F, -13.0F, -1.0F, 6, 9, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 60, -4.0F, -12.0F, 3.0F, 8, 8, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 52, 50, -3.0F, -14.0F, 3.0F, 6, 2, 5, 0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 79, 83, -2.0F, -10.0F, -6.0F, 4, 2, 3, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 45, 0, -1.0F, -9.0F, -8.875F, 2, 1, 3, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 4, 0.9F, -8.7F, -8.9F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 4, -0.9F, -8.7F, -8.9F, 0, 1, 3, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 83, 28, -2.5F, -12.0F, -3.0F, 5, 5, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -8.0F, -6.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -1.4F, -0.7F, 0.2F, 0, 1, 3, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 0.4F, -0.7F, 0.2F, 0, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 0, -2.5F, -1.0F, 0.2F, 4, 1, 3, -0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -13.9F, 0.1F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 82, 70, -2.5F, -0.0855F, 2.9894F, 5, 2, 4, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 65, 83, -2.0F, -0.0855F, -0.0106F, 4, 2, 3, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.0F, -1.7F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5061F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 73, -1.5F, 0.0F, -6.0F, 3, 2, 8, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, -1.0F, 0.9F, -6.6F, 2, 1, 1, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 4, -1.0F, 0.0F, -8.9F, 2, 1, 3, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.4F, 3.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 82, 63, -2.5F, -2.0F, 0.0F, 5, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.9F, -1.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 82, 76, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -13.6F, -6.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3229F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 84, 4, -2.5F, 1.9993F, 2.9185F, 5, 2, 2, 0.03F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 7, -2.5F, 2.4993F, 3.4185F, 5, 1, 1, 0.04F, false));

        this.Maxillaryleft = new AdvancedModelRenderer(this);
        this.Maxillaryleft.setRotationPoint(1.5F, -8.0F, -6.0F);
        this.Head.addChild(Maxillaryleft);
        this.setRotateAngle(Maxillaryleft, -0.3952F, 0.1248F, -0.0396F);
        this.Maxillaryleft.cubeList.add(new ModelBox(Maxillaryleft, 22, 79, -0.4F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Maxillaryleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.Maxillaryright = new AdvancedModelRenderer(this);
        this.Maxillaryright.setRotationPoint(-1.5F, -8.0F, -6.0F);
        this.Head.addChild(Maxillaryright);
        this.setRotateAngle(Maxillaryright, -0.3952F, -0.1248F, 0.0396F);
        this.Maxillaryright.cubeList.add(new ModelBox(Maxillaryright, 22, 79, -0.6F, -1.0F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Maxillaryright.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -7.0F, -1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 83, 22, -2.0F, 0.0F, -3.0F, 4, 2, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 22, 5, 1.1F, -0.6F, -3.0F, 0, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 22, 5, -1.1F, -0.6F, -3.0F, 0, 1, 4, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 42, 35, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 5, 0.8F, -0.6F, -6.0F, 0, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 5, -0.8F, -0.6F, -6.0F, 0, 1, 3, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 9, -1.0F, 1.0F, -4.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.5F, -2.4F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 84, 13, -1.5F, -2.0046F, -0.1019F, 3, 2, 3, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.3F, -6.2F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 84, -1.0F, -1.0028F, 0.008F, 2, 1, 4, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.6F, -8.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.5F, -1.0449F, 0.0389F, 1, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 8, -0.7F, -0.6F, -1.9F, 0, 1, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 8, 0.7F, -0.6F, -1.9F, 0, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 17, -1.0F, 0.0F, -1.9F, 2, 1, 2, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -8.0F, 8.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 42, 0, -3.5F, -7.0F, -1.0F, 7, 12, 14, 0.0F, false));

        this.Pectoral2left = new AdvancedModelRenderer(this);
        this.Pectoral2left.setRotationPoint(3.0F, 5.0F, 8.0F);
        this.Body1.addChild(Pectoral2left);
        this.setRotateAngle(Pectoral2left, 0.0F, 0.0F, -0.3491F);
        this.Pectoral2left.cubeList.add(new ModelBox(Pectoral2left, 42, 22, 0.0F, -2.0F, -1.0F, 0, 9, 4, 0.0F, false));

        this.Pectoral2right = new AdvancedModelRenderer(this);
        this.Pectoral2right.setRotationPoint(-3.0F, 5.0F, 8.0F);
        this.Body1.addChild(Pectoral2right);
        this.setRotateAngle(Pectoral2right, 0.0F, 0.0F, 0.3491F);
        this.Pectoral2right.cubeList.add(new ModelBox(Pectoral2right, 42, 22, 0.0F, -2.0F, -1.0F, 0, 9, 4, 0.0F, true));

        this.Pectoral1left = new AdvancedModelRenderer(this);
        this.Pectoral1left.setRotationPoint(3.5F, 4.0F, 0.0F);
        this.Body1.addChild(Pectoral1left);
        this.setRotateAngle(Pectoral1left, 0.0F, 0.0F, -0.6109F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pectoral1left.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.0472F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.0F, 0.0F, -1.0F, 16, 0, 7, 0.0F, false));

        this.Pectoral1right = new AdvancedModelRenderer(this);
        this.Pectoral1right.setRotationPoint(-3.5F, 4.0F, 0.0F);
        this.Body1.addChild(Pectoral1right);
        this.setRotateAngle(Pectoral1right, 0.0F, 0.0F, 0.6109F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Pectoral1right.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -1.0472F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -15.0F, 0.0F, -1.0F, 16, 0, 7, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 42, 26, -3.0F, -6.0F, -1.0F, 6, 11, 13, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 59, 0.0F, -16.0F, 3.0F, 0, 16, 9, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 7, -2.5F, 0.0F, 0.0F, 5, 2, 12, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 31, 50, -2.5F, -4.0F, -1.0F, 5, 7, 11, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -6.1F, -0.1F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1833F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 29, 0, -1.5F, -0.015F, 0.0855F, 3, 3, 10, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2007F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, 0.0F, 0.0F, 5.0F, 0, 6, 5, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 67, 26, -1.5F, -2.0F, 0.0F, 3, 2, 10, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 52, 57, -2.0F, -2.0F, -1.0F, 4, 5, 11, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -3.2F, -0.1F);
        this.Body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1222F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 70, 40, -1.0F, -0.0052F, -0.2404F, 2, 2, 10, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1047F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 71, 52, -1.0F, -1.0F, 0.0F, 2, 1, 10, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 6.0F, -10.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2007F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 22, 3, 0.0F, 0.0F, 10.0F, 0, 4, 10, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 70, 0, -1.0F, -1.0F, -1.0F, 2, 3, 10, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 7, 1.0F, 0.5F, 3.0F, 2, 0, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 7, -3.0F, 0.5F, 3.0F, 2, 0, 6, 0.0F, true));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.001F, -20.0F, 4.0F, 0, 39, 21, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 76, -0.5F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1134F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 75, -0.5F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 6.0F, -20.0F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2007F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 71, 55, 0.0F, 0.0F, 20.0F, 0, 4, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Kaykay.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Kaykay.offsetY = -0.195F;
        this.Kaykay.offsetX = -0.066F;
        this.Kaykay.rotateAngleY = (float) Math.toRadians(90);
        this.Kaykay.render(0.01F);
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

        //this.Body.offsetY = 1.0F;

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.body5};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
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
            this.swing(Kaykay, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Kaykay, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(Pectoral1left, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Pectoral1left, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(Pectoral1right, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(Pectoral1right, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(Pectoral2left, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Pectoral2left, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(Pectoral2right, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(Pectoral2right, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Kaykay.rotateAngleZ = -(float) Math.toRadians(90);
            this.Kaykay.offsetY = -0.35F;
            this.Kaykay.offsetX = 0.7F;
            this.bob(Kaykay, -speed * 3.2F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 2.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 2.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.Cephalon, 0,0,-0.5F);
       // animator.rotate(this.Cephalon, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
       // animator.rotate(this.maxillae, -(float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Maxillaryleft, -(float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Maxillaryright, -(float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

