package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDeltoptychius;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDeltoptychius extends AdvancedModelBase {
    private ModelAnimator animator;
    private final AdvancedModelRenderer Deltoptychius;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer rightFrontFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftFrontFin;
    private final AdvancedModelRenderer cube_r18;

    public ModelDeltoptychius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Deltoptychius = new AdvancedModelRenderer(this);
        this.Deltoptychius.setRotationPoint(-0.5F, 24.0F, 9.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Deltoptychius.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -2.5F, -9.0F, -7.0F, 6, 6, 6, 0.011F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 22, 0.5F, -10.0F, -7.0F, 0, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, -9.0F, -2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 29, -2.5F, 0.0F, 0.0F, 5, 5, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 0.0F, -0.75F, 1.0F, 0, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 2.0F, 3.5F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 28, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(2.0F, 1.25F, 2.5F);
        this.tail.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, 0.0F, 0.3054F, 0.1309F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftBackFin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -1.5F, 0.0F, -2.5F, 5, 0, 5, 0.0F, false));

        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-2.0F, 1.25F, 2.5F);
        this.tail.addChild(rightBackFin);
        this.setRotateAngle(rightBackFin, 0.0F, -0.3054F, -0.1309F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightBackFin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -3.5F, 0.0F, -2.5F, 5, 0, 5, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.tail.addChild(tail3);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 0, 0.0F, -2.0F, 0.5F, 0, 1, 3, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 13, 37, -1.0F, -1.5F, 0.0F, 2, 3, 5, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 39, -0.5F, -1.0F, 0.0F, 1, 2, 5, -0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, 0.0F, -3.5F, 0.5F, 0, 5, 12, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 41, 24, -0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, -7.0F, -6.5F);
        this.body.addChild(upperbody);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.8527F, -1.9328F);
        this.upperbody.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0945F, 0.0343F, -0.3474F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 2, -0.5F, -1.7414F, -2.3695F, 0, 2, 5, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.8527F, -1.9328F);
        this.upperbody.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0945F, -0.0343F, 0.3474F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 2, 0.5F, -1.7414F, -2.3695F, 0, 2, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.upperbody.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 19, -3.0F, -2.25F, -1.5F, 7, 5, 4, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -2.25F, -2.5F);
        this.upperbody.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -0.25F, -1.75F, 0, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 3.3829F, -1.5131F);
        this.upperbody.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 0, -3.0F, -1.25F, -1.75F, 6, 2, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 7.0F, 6.5F);
        this.upperbody.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 18, 9, -1.5F, -4.75F, -17.5F, 4, 2, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -7.5177F, -12.8481F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5159F, 0.0854F, -0.5981F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 5, 0.0F, -0.7524F, -1.76F, 0, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, -7.5177F, -12.8481F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5159F, -0.0854F, 0.5981F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 5, 0.0F, -0.7524F, -1.76F, 0, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -6.291F, -12.5027F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.48F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 9, -2.0F, -1.25F, -1.5F, 4, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -5.6697F, -15.5699F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 42, -1.0F, -0.113F, -1.9617F, 2, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.0F, -3.75F, -9.5F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 0, -1.0F, -1.0F, -7.0F, 2, 2, 7, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, -3.75F, -9.5F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 30, -1.0F, -1.0F, -7.0F, 2, 2, 7, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.704F, -3.75F, -15.6445F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 10, -3.75F, -1.0F, 0.75F, 2, 1, 1, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 29, -1.75F, -1.0F, 0.75F, 3, 1, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.704F, -3.75F, -15.6445F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 10, 1.75F, -1.0F, 0.75F, 2, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 29, -1.25F, -1.0F, 0.75F, 3, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -4.0318F, -13.5468F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 30, -1.5F, -2.5F, -1.0F, 3, 2, 3, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.5F, -2.75F, -11.6114F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 27, 39, -2.0F, -0.8238F, -3.8527F, 4, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.0F, -0.8238F, -4.8527F, 2, 1, 1, 0.0F, false));

        this.rightFrontFin = new AdvancedModelRenderer(this);
        this.rightFrontFin.setRotationPoint(-2.0F, 3.25F, -2.0F);
        this.upperbody.addChild(rightFrontFin);
        this.setRotateAngle(rightFrontFin, 0.0219F, 0.0868F, 0.0397F);
        this.rightFrontFin.cubeList.add(new ModelBox(rightFrontFin, 0, 38, -3.5F, -0.5F, -1.5F, 5, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-6.8323F, 0.0362F, 2.4646F);
        this.rightFrontFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0082F, 0.0424F, -0.0061F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -6.5F, 0.0F, -3.5F, 13, 0, 7, 0.0F, true));

        this.leftFrontFin = new AdvancedModelRenderer(this);
        this.leftFrontFin.setRotationPoint(3.0F, 3.25F, -2.0F);
        this.upperbody.addChild(leftFrontFin);
        this.setRotateAngle(leftFrontFin, 0.0219F, -0.0868F, -0.0397F);
        this.leftFrontFin.cubeList.add(new ModelBox(leftFrontFin, 0, 38, -1.5F, -0.5F, -1.5F, 5, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(6.8323F, 0.0362F, 2.4646F);
        this.leftFrontFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0082F, -0.0424F, 0.0061F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -6.5F, 0.0F, -3.5F, 13, 0, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.body.rotateAngleZ = (float) Math.toRadians(90);
        this.body.offsetX = 0.02F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.22F, -0.1278F, -0.0285F);
        this.setRotateAngle(leftBackFin, 0.0F, 0.3054F, 0.1309F);
        this.setRotateAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
        this.setRotateAngle(rightBackFin, 0.0F, -0.3054F, -0.1309F);
        this.setRotateAngle(cube_r2, 0.0F, 0.6981F, 0.0F);
        this.setRotateAngle(tail3, 0.1309F, -0.1745F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0945F, 0.0343F, -0.3474F);
        this.setRotateAngle(cube_r4, 0.0945F, -0.0343F, 0.3474F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.5159F, 0.0854F, -0.5981F);
        this.setRotateAngle(cube_r9, 0.5159F, -0.0854F, 0.5981F);
        this.setRotateAngle(cube_r10, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r16, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightFrontFin, 0.0367F, 0.0817F, 0.2148F);
        this.setRotateAngle(cube_r17, 0.0082F, 0.0424F, -0.0061F);
        this.setRotateAngle(leftFrontFin, 0.0331F, -0.0832F, -0.171F);
        this.setRotateAngle(cube_r18, 0.0082F, -0.0424F, 0.0061F);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = 0.28F;
        this.body.offsetX = 0.02F;
        this.body.render(0.01F);
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
        this.body.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail3, this.tail4, this.tail5};
        float speed = 0.3F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.walk(leftBackFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftBackFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| !e.isInWater()) { //if moving, slap fins
                this.flap(leftFrontFin, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                this.flap(rightFrontFin, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F * 0.5F, 0.25F, -3, f2, 1);
            }

            else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(leftFrontFin, (speed), 0.25F, true, -3, 0, f2, 1);
                this.flap(rightFrontFin, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F * 0.5F, -3, f2, 1);
            }


            this.walk(rightBackFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(rightBackFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                this.body.offsetY = 1.55F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDeltoptychius e = (EntityPrehistoricFloraDeltoptychius) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
