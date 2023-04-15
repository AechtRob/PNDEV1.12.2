package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelParhybodus extends AdvancedModelBase {
    private final AdvancedModelRenderer Hybodus;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftFrontFin;
    private final AdvancedModelRenderer rightFrontFin;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r17;

    private ModelAnimator animator;

    public ModelParhybodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hybodus = new AdvancedModelRenderer(this);
        this.Hybodus.setRotationPoint(-0.5F, 17.0F, 1.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.Hybodus.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 53, 0, -4.0F, -3.0F, -6.0F, 9, 8, 7, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 49, 67, -2.0F, -1.75F, -13.0F, 5, 4, 7, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 107, 34, -1.0F, 1.75F, -12.5F, 3, 1, 0, 0.011F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, 1.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 15, -3.5F, -1.0F, -6.25F, 8, 3, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 0.25F, -9.5F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 51, 0.0F, -2.0F, -3.25F, 2, 4, 7, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.25F, -9.25F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 96, 27, 0.5F, 1.5F, -3.5F, 0, 1, 7, 0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.0F, 0.25F, -9.5F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 71, -2.0F, -2.0F, -3.25F, 2, 4, 7, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.6386F, -3.9915F, -3.8761F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.829F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, 0.0F, -1.75F, 0.0F, 1, 2, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 3, 5.2773F, -1.75F, 0.0F, 1, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.0F, 0.25F, -9.25F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 96, 27, -0.5F, 1.5F, -3.5F, 0, 1, 7, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.8886F, -4.1575F, -4.4351F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.48F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, -0.25F, -0.5F, -0.25F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 3, 4.0273F, -0.5F, -0.25F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.75F, -9.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 24, -2.0F, -0.25F, -3.25F, 5, 2, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0329F, -12.769F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 59, -1.5F, -2.0F, -1.0F, 4, 4, 2, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.5F, -5.5775F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1309F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 89, 16, -2.0F, -0.25F, -6.9225F, 5, 2, 7, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 19, -2.0F, -0.25F, -6.9225F, 5, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 1, 19, -1.0F, -0.25F, -6.9225F, 3, 1, 2, 0.011F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 107, 34, -2.0F, -0.75F, -6.6725F, 3, 1, 0, 0.011F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 107, 34, 2.0F, -0.75F, -6.6725F, 1, 1, 0, 0.011F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.0F, -2.25F, -3.4225F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2618F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 91, 7, 0.0F, 2.0F, -3.5F, 2, 2, 7, 0.01F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 28, 0.5F, 1.5F, -3.5F, 0, 1, 6, 0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(4.0F, -2.25F, -3.4225F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 28, -0.5F, 1.5F, -3.5F, 0, 1, 6, 0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 91, 7, -2.0F, 2.0F, -3.5F, 2, 2, 7, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.25F, -5.9225F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 19, -1.5F, -1.25F, -0.75F, 4, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -8.0F, -4.0F);
        this.Hybodus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 27, 24, -5.0F, -3.0F, 0.0F, 11, 10, 17, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.0F, 2.5F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 40, 0.5F, -12.5F, -0.5F, 0, 15, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -3.0F, 2.5F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6545F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 72, 0.0F, -10.75F, -1.25F, 1, 14, 1, 0.0F, false));

        this.leftFrontFin = new AdvancedModelRenderer(this);
        this.leftFrontFin.setRotationPoint(6.0F, 6.25F, 7.0F);
        this.body.addChild(leftFrontFin);
        this.setRotateAngle(leftFrontFin, 0.0F, 0.0F, -0.6981F);
        this.leftFrontFin.cubeList.add(new ModelBox(leftFrontFin, 0, 50, 0.0F, -0.5F, -4.0F, 0, 13, 9, 0.0F, false));

        this.rightFrontFin = new AdvancedModelRenderer(this);
        this.rightFrontFin.setRotationPoint(-5.0F, 6.25F, 7.0F);
        this.body.addChild(rightFrontFin);
        this.setRotateAngle(rightFrontFin, 0.0F, 0.0F, 0.6981F);
        this.rightFrontFin.cubeList.add(new ModelBox(rightFrontFin, 0, 50, 0.0F, -0.5F, -4.0F, 0, 13, 9, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 1.75F, 17.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 19, 0, -4.4564F, -4.5F, -0.999F, 9, 9, 8, 0.0F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(3.5436F, 2.5F, 6.501F);
        this.body2.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, -0.1309F, -0.0873F, -0.5236F);
        this.leftBackFin.cubeList.add(new ModelBox(leftBackFin, 18, 57, 0.0F, -0.75F, -1.5F, 0, 10, 9, 0.0F, false));

        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-3.4564F, 2.5F, 6.501F);
        this.body2.addChild(rightBackFin);
        this.setRotateAngle(rightBackFin, -0.1309F, 0.0873F, 0.5236F);
        this.rightBackFin.cubeList.add(new ModelBox(rightBackFin, 18, 57, 0.0F, -0.75F, -1.5F, 0, 10, 9, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9841F, 6.1507F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 41, -2.4564F, -3.2659F, -0.1497F, 5, 7, 11, 0.011F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4564F, -3.3114F, 7.8604F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.9163F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 65, 0.5F, -5.5F, -3.5F, 0, 11, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.4564F, -3.2659F, 4.8503F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.829F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 41, 0.0F, -6.75F, -2.5F, 1, 10, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6409F, 10.9753F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 54, 51, -1.4564F, -2.375F, -3.125F, 3, 5, 11, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 57, 0.0436F, 1.375F, 0.625F, 0, 5, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.625F, 7.875F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, -0.9564F, -1.5F, -1.0F, 2, 4, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.6531F, 3.9434F);
        this.tail3.addChild(tail4);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4564F, 3.3361F, -6.0643F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.5F, -0.3481F, 7.1962F, 0, 19, 22, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.5981F, 7.1962F, 1, 2, 17, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hybodus.render(f5* 0.4f);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Hybodus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.2F, 0.4363F, 0.0F);
        this.setRotateAngle(leftFrontFin, -0.10F, 0.0F, -0.75F);
        this.setRotateAngle(rightFrontFin, 12.5F, -0.0F, 0.75F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(leftBackFin, 0.0F, -0.0611F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(tail, 0.0F, 6.3F, 0.1F);
        this.setRotateAngle(tail2, 0.0F, 6.0F, 0.0F);
        this.setRotateAngle(tail3, 0.1309F, 6.5F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, -0.3491F);
        this.Hybodus.offsetY = -0.14F;
        this.head.offsetY = 0.0f;
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(35);
        this.Hybodus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Hybodus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.2F, 0.4363F, 0.0F);
        this.setRotateAngle(leftFrontFin, -0.10F, 0.0F, -0.75F);
        this.setRotateAngle(rightFrontFin, 12.5F, -0.0F, 0.75F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(leftBackFin, 0.0F, -0.0611F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 0.3491F);
        this.setRotateAngle(tail, 0.0F, 6.3F, 0.1F);
        this.setRotateAngle(tail2, 0.0F, 6.0F, 0.0F);
        this.setRotateAngle(tail3, 0.1309F, 6.5F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, -0.3491F);
        this.Hybodus.offsetY = -0.14F;
        this.Hybodus.render(0.01F);
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

        //this.Hybodus.offsetY = 0.4F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.18F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
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
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.85, f2, 0.6F * still);
            this.swing(Hybodus, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Hybodus, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(leftFrontFin, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftFrontFin, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(rightFrontFin, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightFrontFin, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(leftBackFin, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftBackFin, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(rightBackFin, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightBackFin, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.Hybodus.rotateAngleZ = (float) Math.toRadians(90);
            this.Hybodus.offsetY = 1F;
            this.bob(Hybodus, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

