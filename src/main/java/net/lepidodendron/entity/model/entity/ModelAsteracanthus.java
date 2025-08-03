package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAsteracanthus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAsteracanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pectoralR;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pelvicR;
    private final AdvancedModelRenderer pelvicL;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    private ModelAnimator animator;

    public ModelAsteracanthus() {
        this.textureWidth = 88;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 13.25F, 16.25F);
        this.body.cubeList.add(new ModelBox(body, 0, 30, -4.5F, -0.75F, -27.75F, 8, 7, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.75F, -27.75F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 10, -3.5F, -0.25F, 0.0F, 7, 2, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, 1.75F, -22.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -4.5F, -4.0F, 0.0F, 9, 9, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 28, 41, 0.0F, -8.0F, 1.5F, 0, 4, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.0F, 2.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8727F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 52, -1.0F, -6.0F, -0.75F, 1, 7, 1, 0.0F, false));

        this.pectoralR = new AdvancedModelRenderer(this);
        this.pectoralR.setRotationPoint(-4.25F, 4.0F, 1.0F);
        this.body2.addChild(pectoralR);
        this.setRotateAngle(pectoralR, -0.2182F, -0.1745F, 0.6981F);
        this.pectoralR.cubeList.add(new ModelBox(pectoralR, 60, 24, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(4.25F, 4.0F, 1.0F);
        this.body2.addChild(pectoralL);
        this.setRotateAngle(pectoralL, -0.2182F, 0.1745F, -0.6981F);
        this.pectoralL.cubeList.add(new ModelBox(pectoralL, 60, 24, 0.0F, 0.0F, -0.5F, 0, 5, 7, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 23, 19, -4.0F, -4.5F, -1.0F, 8, 8, 9, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 8.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 36, -3.0F, -3.0F, -1.25F, 6, 6, 6, 0.0F, false));

        this.pelvicR = new AdvancedModelRenderer(this);
        this.pelvicR.setRotationPoint(-1.5F, 3.0F, 1.0F);
        this.body4.addChild(pelvicR);
        this.setRotateAngle(pelvicR, 0.0F, 0.0F, 0.6109F);
        this.pelvicR.cubeList.add(new ModelBox(pelvicR, 15, 37, 0.0F, 0.0F, -1.0F, 0, 5, 6, 0.0F, false));

        this.pelvicL = new AdvancedModelRenderer(this);
        this.pelvicL.setRotationPoint(1.5F, 3.0F, 1.0F);
        this.body4.addChild(pelvicL);
        this.setRotateAngle(pelvicL, 0.0F, 0.0F, -0.6109F);
        this.pelvicL.cubeList.add(new ModelBox(pelvicL, 15, 37, 0.0F, 0.0F, -1.0F, 0, 5, 6, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 43, -2.0F, -2.25F, -1.0F, 4, 5, 7, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 42, 45, 0.0F, -7.0F, -0.25F, 0, 5, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.25F, -0.5F);
        this.body5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -1.0F, -5.0F, 0.0F, 1, 5, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 15, 48, -1.5F, -1.25F, -0.75F, 3, 3, 7, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 0, 0.0F, 1.75F, 1.75F, 0, 4, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.25F, 6.25F);
        this.body6.addChild(tail);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 18, -0.5F, 0.0F, -1.0F, 1, 2, 7, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 0.0F, 0.0F, -1.0F, 0, 7, 16, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, 3.25F, -27.75F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 57, 1, -2.0F, -0.25F, -5.425F, 4, 1, 1, -0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 43, -2.0F, -2.25F, -4.5F, 4, 3, 5, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.275F, 2.0F, -5.575F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 7, -2.5F, -4.25F, 0.5F, 3, 3, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.275F, 2.0F, -5.575F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 7, -0.5F, -4.25F, 0.5F, 3, 3, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, -3.975F, 0.025F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3403F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 0, -0.5F, -0.15F, -6.575F, 4, 2, 7, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.75F, 0.25F);
        this.head.addChild(lowerjaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.4F, -2.25F, -4.9F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.3927F, -0.0349F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 64, 25, -3.0F, 0.0F, 3.1F, 3, 2, 3, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.4F, -2.25F, -4.9F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, -0.3927F, 0.0349F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 64, 25, 0.0F, 0.0F, 3.1F, 3, 2, 3, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, -0.425F, -4.9F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.3927F, -0.0349F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 71, 43, -2.0F, 0.0F, 0.0F, 2, 2, 5, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.5F, -0.425F, -4.9F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, -0.3927F, 0.0349F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 71, 43, 0.0F, 0.0F, 0.0F, 2, 2, 5, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 68, 36, -0.5F, 1.0F, -5.0F, 3, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 36, -0.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.55F, 3.325F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 1, 55, -1.5F, -1.0F, -5.2F, 4, 2, 2, -0.02F, false));

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
        this.body.offsetY = -0.0F;
        this.body.offsetX = 0.05F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.46F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.3F, 3.8F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(pectoralR, -0.2182F, -0.1745F, 0.6981F);
        this.setRotateAngle(pectoralL, -0.2182F, 0.1745F, -0.6981F);
        this.setRotateAngle(body3, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pelvicR, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(pelvicL, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(body5, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(20);
        this.head.offsetY = 0.07F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(pectoralR, -0.2182F, -0.1745F, 0.6981F);
        this.setRotateAngle(pectoralL, -0.2182F, 0.1745F, -0.6981F);
        this.setRotateAngle(body3, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pelvicR, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(pelvicL, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(body5, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = 0.15F;
        this.body.offsetZ = -0.15F;
        this.body.offsetY = -0.3F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(pectoralR, -0.2182F, -0.1745F, 0.6981F);
        this.setRotateAngle(pectoralL, -0.2182F, 0.1745F, -0.6981F);
        this.setRotateAngle(body3, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pelvicR, 0.0F, 0.0F, 0.6109F);
        this.setRotateAngle(pelvicL, 0.0F, 0.0F, -0.6109F);
        this.setRotateAngle(body5, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.1309F, 0.0F);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = 0.15F;
        this.body.offsetZ = -0.15F;
        this.body.offsetY = 0.04F;
        this.body.render(0.01F);
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

        //this.body.offsetY = 0.9F;

        AdvancedModelRenderer[] fishTail = {this.body4, this.body5, this.body6, this.tail};
        ((EntityPrehistoricFloraAsteracanthus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
            this.swing(body, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        this.flap(pectoralL, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralR, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.4F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.1F, -0.55, f2, 0.4F * still);

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

