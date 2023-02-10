package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBungartius extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pelvecfinR;
    private final AdvancedModelRenderer pelvecfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;

    private ModelAnimator animator;

    public ModelBungartius() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.75F, -1.5F);
        this.body.cubeList.add(new ModelBox(body, 21, 24, -4.0F, -8.75F, -0.5F, 8, 8, 9, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.75F, -0.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 32, -2.5F, -1.0F, 0.0F, 6, 1, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -8.75F, -0.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 53, -2.5F, 0.0F, 0.0F, 6, 1, 9, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -4.75F, 7.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 30, 0, -3.0F, -5.0F, 0.0F, 7, 10, 9, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 24, 0.5F, -11.25F, 1.5F, 0, 7, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.5F, 0.25F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 41, -3.0F, -3.25F, -1.0F, 6, 6, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 2.75F, 9.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.192F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.0F, -2.0F, -10.0F, 5, 2, 10, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.25F, 9.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.192F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 41, -2.5F, 0.0F, -10.0F, 5, 2, 10, 0.0F, false));

        this.pelvecfinR = new AdvancedModelRenderer(this);
        this.pelvecfinR.setRotationPoint(-1.0F, 4.25F, 0.5F);
        this.body3.addChild(pelvecfinR);
        this.setRotateAngle(pelvecfinR, 0.1745F, 0.0F, 0.6981F);
        this.pelvecfinR.cubeList.add(new ModelBox(pelvecfinR, 0, 0, 0.0F, 0.0F, -0.75F, 0, 3, 5, 0.0F, false));

        this.pelvecfinL = new AdvancedModelRenderer(this);
        this.pelvecfinL.setRotationPoint(1.0F, 4.25F, 0.5F);
        this.body3.addChild(pelvecfinL);
        this.setRotateAngle(pelvecfinL, 0.1745F, 0.0F, -0.6981F);
        this.pelvecfinL.cubeList.add(new ModelBox(pelvecfinL, 0, 0, 0.0F, 0.0F, -0.75F, 0, 3, 5, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 57, -2.0F, -1.75F, -1.0F, 4, 4, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 8, 0.0F, 2.25F, 2.5F, 0, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.75F, 6.0F);
        this.body4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 9, -1.0F, 0.0F, -7.0F, 3, 2, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.25F, 6.0F);
        this.body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 63, -1.5F, -1.0F, -7.0F, 3, 1, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 46, 19, -1.5F, -0.25F, -1.0F, 3, 1, 11, 0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 51, 42, -1.0F, -1.25F, -1.0F, 2, 3, 11, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, -10.75F, 6.75F, 0, 18, 15, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.5F, 0.0F);
        this.body5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 0, -0.5F, -0.25F, -1.0F, 2, 1, 8, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 2.25F, 0.0F);
        this.body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 41, -0.5F, -1.0F, -1.0F, 2, 1, 8, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -4.75F, -0.5F);
        this.body.addChild(head);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.75F, -5.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5149F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 12, -1.0F, -1.025F, -5.85F, 2, 2, 1, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.75F, -5.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.288F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, 0.1F, -5.0F, 2, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 63, 24, -1.5F, 0.1F, -2.0F, 3, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7854F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.96F, 2.5F, -3.95F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.0F, 1.25F, -4.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1527F, 0.2749F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 65, -1.35F, -3.225F, -5.75F, 1, 2, 7, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2007F, 0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 4, -0.95F, 0.3F, -6.4F, 0, 1, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(3.0F, 1.275F, -4.5F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2007F, 0.2793F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 0, -2.351F, -1.2F, -6.0F, 2, 2, 7, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.0F, 1.25F, -4.5F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 74, 2.076F, -1.225F, -2.6F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.0F, 1.275F, -4.5F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2007F, -0.2793F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 0, 0.351F, -1.2F, -6.0F, 2, 2, 7, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.0F, 1.25F, -4.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1527F, -0.2749F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 65, 0.35F, -3.225F, -5.75F, 1, 2, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.7854F, -0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 0.96F, 2.5F, -3.95F, 0, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.9F, 1.25F, -4.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2007F, -0.1745F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 4, 0.95F, 0.3F, -6.4F, 0, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 63, 18, -3.0F, 6.0F, -3.35F, 6, 2, 4, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.0F, 0.0F, -4.5F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1309F, 0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 42, -1.0F, -2.5F, 0.0F, 1, 6, 5, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.0F, 0.0F, -4.5F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, -0.1745F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 42, 0.0F, -2.5F, 0.0F, 1, 6, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 53, 56, -3.0F, 0.0F, -5.0F, 6, 6, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.75F, -3.75F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 67, -0.5F, 0.0F, -6.75F, 1, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 19, -2.0F, -1.0F, -1.25F, 4, 3, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, 0.0F, -0.15F, -1.75F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0F, -6.75F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1658F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 40, -1.0F, -1.0F, 2.9F, 2, 1, 3, 0.0F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 0, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.25F, -6.75F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2443F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 12, -2.475F, -0.25F, 3.75F, 1, 1, 2, -0.015F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 65, 0, -1.5F, -0.25F, 0.0F, 1, 1, 6, -0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 0.25F, -6.75F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.2443F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 12, 1.475F, -0.25F, 3.75F, 1, 1, 2, -0.015F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 65, 0, 0.5F, -0.25F, 0.0F, 1, 1, 6, -0.01F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.5F, -2.0F, 0.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, 0.6981F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 35, 57, 0.0F, 0.0F, -1.75F, 0, 9, 6, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.5F, -2.0F, 0.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, -0.6981F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 35, 57, 0.0F, 0.0F, -1.75F, 0, 9, 6, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.head.offsetY = 0.15F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.43F;
        this.body.offsetX = -0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
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

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};

        float speed = 0.2F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.7F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        //if (f3 != 0.0F) {
        //    this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, -0.2F, f2, 1);
        //}

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.4F, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(body, speed * still, 0.05F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(body, speed* still, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(pelvecfinL, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(pelvecfinL, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(pelvecfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(pelvecfinR, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.chainWave(fishTail, speed * 0.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 0.5F, 0.1F, -0.55, f2, 0.4F * still);
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(13);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(75), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}

