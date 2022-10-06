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
import net.minecraft.entity.EntityLiving;

public class ModelFalcatus extends AdvancedModelBase {
    private final AdvancedModelRenderer falcatus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftFrontFin;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightFrontFin;
    private final AdvancedModelRenderer cube_r9;

    private ModelAnimator animator;

    public ModelFalcatus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.falcatus = new AdvancedModelRenderer(this);
        this.falcatus.setRotationPoint(-2.0F, 24.0F, -9.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.falcatus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.5F, -5.0F, -3.0F, 3, 3, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -6.8696F, -0.6366F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 23, -0.5F, -0.142F, -4.9806F, 1, 1, 5, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -6.0F, -1.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, 1.0F, -0.75F, 0.25F, 1, 3, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(2.0F, -4.0F, -2.75F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 1, 17, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.011F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 11, 0.75F, -0.5F, -1.75F, 1, 1, 1, -0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 11, -1.75F, -0.5F, -1.75F, 1, 1, 1, -0.05F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.0F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, -0.5F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -0.5F, -2.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 9, -0.5F, -0.5F, -1.0F, 3, 1, 2, 0.01F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(-1.0F, 1.25F, -0.1F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, -0.48F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1571F, 0.1172F);
        this.mouth.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 0, -0.5F, -0.5F, -1.9F, 3, 1, 2, -0.011F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.1571F, -1.3828F);
        this.mouth.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -0.8499F, -1.1315F, 2, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(2.0F, -3.5F, 3.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 10, 9, -1.5F, -1.5F, 0.0F, 3, 3, 4, -0.01F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(1.5F, 0.75F, 3.75F);
        this.body2.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, 0.0F, 0.0F, -1.0472F);
        this.leftBackFin.cubeList.add(new ModelBox(leftBackFin, 0, 18, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-1.5F, 0.75F, 3.75F);
        this.body2.addChild(rightBackFin);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, 1.0472F);
        this.rightBackFin.cubeList.add(new ModelBox(rightBackFin, 0, 18, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.1768F, 3.9542F);
        this.body2.addChild(tail1);
        this.setRotateAngle(tail1, 0.0F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 14, 0, -1.0F, -0.1232F, -0.9542F, 2, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -0.7232F, 2.0458F);
        this.tail1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 15, 1.0F, -0.75F, -1.375F, 0, 3, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.1F, 0.0768F, 3.0458F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 22, 18, -0.4F, 0.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.1F, 0.5577F, 2.8914F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 6, 19, 0.0F, -3.4577F, -0.8914F, 0, 6, 7, -0.01F, false));

        this.leftFrontFin = new AdvancedModelRenderer(this);
        this.leftFrontFin.setRotationPoint(3.5F, -2.5F, 0.25F);
        this.body.addChild(leftFrontFin);
        this.setRotateAngle(leftFrontFin, 0.0F, 0.0F, -0.2618F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.3784F, 0.9588F, 0.0F);
        this.leftFrontFin.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0899F, 0.0135F, -0.9299F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 16, 1.0102F, -0.4327F, -1.9969F, 0, 5, 5, 0.0F, false));

        this.rightFrontFin = new AdvancedModelRenderer(this);
        this.rightFrontFin.setRotationPoint(0.5F, -2.5F, 0.25F);
        this.body.addChild(rightFrontFin);
        this.setRotateAngle(rightFrontFin, 0.0F, 0.0F, 0.2618F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.3784F, 0.9588F, 0.0F);
        this.rightFrontFin.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0899F, -0.0135F, 0.9299F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 16, -1.0102F, -0.4327F, -1.9969F, 0, 5, 5, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.28F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.06F;
        this.body.offsetY = 0.03F;
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body.offsetY = 1.4F;
        this.body.offsetZ = -0.2F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.tail1, this.tail2, this.tail3};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(leftFrontFin, (float) (speed ), 0.5F, true, 0, 0, f2, 0.5F);
            this.swing(leftFrontFin, (float) (speed), 0.2F, true, 0, 0, f2, 0.5F);
            this.flap(rightFrontFin, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.swing(rightFrontFin, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.flap(leftBackFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(rightBackFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.4F;
                this.body.offsetZ = -0.2F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.mouth, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}