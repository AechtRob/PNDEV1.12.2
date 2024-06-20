package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSaurostomus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Saurostomus;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer Maxillary;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Maxillary2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelSaurostomus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Saurostomus = new AdvancedModelRenderer(this);
        this.Saurostomus.setRotationPoint(0.0F, 21.0F, -14.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Saurostomus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 65, 26, -3.5F, -13.0F, -1.0F, 7, 8, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 48, 46, -4.5F, -13.0F, 2.0F, 9, 8, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -14.1F, 1.9F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4102F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 60, -2.5F, -0.1328F, -2.9149F, 5, 2, 3, 0.1F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -13.0F, -1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 70, -2.5F, 1.0F, -3.9F, 6, 5, 4, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -9.9F, -6.1F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 14, -1.5F, -0.0066F, -0.9742F, 4, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -11.1F, -4.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 77, -2.0F, -0.0428F, -2.0249F, 5, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -13.0F, -0.9F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4887F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 53, -2.5F, -0.0423F, -4.0906F, 6, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -8.5F, -6.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 1, -1.2F, -0.7854F, -0.8439F, 0, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 1, 1.2F, -0.7854F, -0.8439F, 0, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 26, -2.0F, -0.9854F, -0.9439F, 4, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -8.8F, -7.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 12, -1.2F, -1.7F, 1.6F, 0, 2, 6, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 12, 1.2F, -1.7F, 1.6F, 0, 2, 6, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 62, 0, -2.5F, -2.0F, 1.0F, 5, 2, 6, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -14.9F, 5.8F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 51, -3.5F, -0.076F, -3.9622F, 7, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.4F, 1.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2705F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 58, -3.5F, -2.0F, 0.0F, 7, 2, 5, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.8F, -1.5F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 74, -2.5F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -13.6F, -6.0F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.3229F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 49, 19, -3.0F, 2.3993F, 3.2185F, 6, 1, 1, 0.04F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 76, -3.0F, 1.8993F, 2.7185F, 6, 2, 2, 0.03F, false));

        this.Maxillary = new AdvancedModelRenderer(this);
        this.Maxillary.setRotationPoint(1.6F, -8.3004F, -5.7826F);
        this.Head.addChild(Maxillary);
        this.setRotateAngle(Maxillary, -0.4815F, 0.1589F, -0.1476F);
        this.Maxillary.cubeList.add(new ModelBox(Maxillary, 77, 76, 0.0F, -1.0329F, -0.0428F, 1, 1, 5, 0.01F, false));
        this.Maxillary.cubeList.add(new ModelBox(Maxillary, 0, 9, 0.8F, -0.8329F, -0.0428F, 0, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.6F, 0.0F, 0.0F);
        this.Maxillary.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.3F, -3.0F, 1.0F, 0, 2, 4, 0.0F, false));

        this.Maxillary2 = new AdvancedModelRenderer(this);
        this.Maxillary2.setRotationPoint(-1.6F, -8.3004F, -5.7826F);
        this.Head.addChild(Maxillary2);
        this.setRotateAngle(Maxillary2, -0.4815F, -0.1589F, 0.1476F);
        this.Maxillary2.cubeList.add(new ModelBox(Maxillary2, 77, 76, -1.0F, -1.0329F, -0.0428F, 1, 1, 5, 0.01F, true));
        this.Maxillary2.cubeList.add(new ModelBox(Maxillary2, 0, 9, -0.8F, -0.8329F, -0.0428F, 0, 1, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.6F, 0.0F, 0.0F);
        this.Maxillary2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.3F, -3.0F, 1.0F, 0, 2, 4, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.1F, -6.8F, -1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3491F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 74, 46, -3.0999F, -0.103F, -2.6086F, 6, 2, 3, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 15, -1.9999F, 0.241F, -6.02F, 4, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.0F, -5.7F);
        this.Jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 1, 1.8F, -0.2F, -0.4F, 0, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, 0.0F, -0.5F, 3, 1, 1, -0.1F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 1, -0.8F, -0.2F, -0.4F, 0, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.2F, -5.5F);
        this.Jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 42, -2.4999F, -1.0214F, 0.0F, 5, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.Jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -1.8F, -0.3F, -2.4F, 0, 1, 3, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 1.8F, -0.3F, -2.4F, 0, 1, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 75, 18, -2.4999F, -0.0029F, -2.8087F, 5, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.6F, 1.4996F, -2.4826F);
        this.Jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 60, -2.4999F, -0.7019F, -0.2263F, 6, 1, 3, -0.01F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -10.0F, 6.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 8, -4.5F, -5.0F, -0.2F, 9, 12, 10, 0.0F, false));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(4.5F, 5.3F, 1.0F);
        this.Body1.addChild(rightPectoral);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-9.0F, 0.0F, 0.0F);
        this.rightPectoral.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.829F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -18.0F, 0.0F, -1.0F, 19, 0, 8, 0.0F, true));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(4.5F, 5.3F, 1.0F);
        this.Body1.addChild(leftPectoral);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftPectoral.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.829F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.0F, 0.0F, -1.0F, 19, 0, 8, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 9.8F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 29, 21, -4.5F, -4.0F, -1.0F, 9, 11, 9, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 20, 62, 0.0F, -13.0F, 1.0F, 0, 8, 7, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 22, 41, -3.5F, -5.0F, -0.1F, 7, 1, 8, -0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 38, 0, -4.0F, -4.0F, -1.0F, 8, 10, 8, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 34, 68, 0.0F, 6.0F, 1.0F, 0, 10, 6, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 54, 58, 0.0F, -13.0F, 0.0F, 0, 9, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.0F, -0.1F);
        this.Body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1484F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 50, -3.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 56, 18, -3.0F, -1.0F, 0.0F, 6, 1, 7, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 58, -3.0F, -3.0F, -1.0F, 6, 8, 4, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 40, 58, 0.0F, 4.0F, 0.0F, 0, 9, 7, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 68, 65, -2.6F, -3.0F, 3.0F, 5, 7, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 33, 50, -1.6F, -1.9321F, -0.2811F, 3, 2, 8, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 58, 37, -2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 20, 58, -1.5F, -2.0F, -1.0F, 3, 4, 7, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 28, 8, -1.0F, -1.5F, 6.0F, 2, 3, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 8, 0.5F, 0.0F, 2.0F, 2, 0, 6, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 8, -2.5F, 0.0F, 2.0F, 2, 0, 6, 0.0F, true));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 19, 0.0F, -10.5F, 6.0F, 0, 21, 11, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 70, 8, -1.0F, -3.0F, 1.0F, 2, 3, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.Body5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 73, 38, -1.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Saurostomus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Saurostomus, 0.25F, 0.0F, 0.0F);
        this.Saurostomus.offsetY = -0.1F;
        this.Saurostomus.offsetX = -0.2F;
        this.Saurostomus.offsetZ = -0.32F;
        this.Saurostomus.rotateAngleY = (float) Math.toRadians(90);
        this.Saurostomus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Maxillary2, -0.4815F, -0.1589F, 0.1476F);
        this.setRotateAngle(Maxillary, -0.4815F, 0.1589F, -0.1476F);
        this.setRotateAngle(Jaw, 0.7021F, 0.0142F, -0.0115F);
        this.setRotateAngle(cube_r9, -0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.6632F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r25, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.1484F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.829F);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.829F);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r11, -0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0873F, 0.0F);
        this.Saurostomus.offsetY = -0.4F;
        this.Saurostomus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Saurostomus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.0F, 0.0F);
        this.Saurostomus.offsetY = 0.09F;
        this.Saurostomus.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};

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
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.85, f2, 0.5F * still);
            this.swing(Saurostomus, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Saurostomus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(leftPectoral, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftPectoral, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(rightPectoral, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightPectoral, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.Saurostomus.rotateAngleZ = -(float) Math.toRadians(90);
            this.Saurostomus.offsetY = -0.35F;
            this.Saurostomus.offsetX = 0.7F;
            this.bob(Saurostomus, -speed * 3.2F, 2.5F, false, f2, 1);
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
        animator.rotate(this.Maxillary, -(float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Maxillary2, -(float) Math.toRadians(55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

