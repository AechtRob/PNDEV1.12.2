package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBandringa;
import net.lepidodendron.entity.EntityPrehistoricFloraLasanius;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLasanius extends AdvancedModelBase {
    private final AdvancedModelRenderer Lasanius;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    private ModelAnimator animator;

    public ModelLasanius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Lasanius = new AdvancedModelRenderer(this);
        this.Lasanius.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.694F, -6.9949F);
        this.Lasanius.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 45, 49, -1.5F, -4.706F, 0.9949F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.856F, 0.1949F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2705F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 12, -1.0F, -0.9007F, -0.1759F, 2, 1, 6, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 43, -2.0F, -2.923F, -0.1802F, 1, 3, 6, -0.01F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 43, 1.0F, -2.923F, -0.1802F, 1, 3, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.306F, 4.9949F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 0, -2.0F, 0.6F, -5.6F, 4, 1, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 40, -2.0F, 1.6F, -5.6F, 1, 2, 6, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 40, 1.0F, 1.6F, -5.6F, 1, 2, 6, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -3.856F, 5.3949F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 20, -2.5F, -1.95F, 0.0F, 5, 5, 14, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 25, 8, -0.5F, -2.35F, 1.9F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 5, 25, -0.5F, -2.45F, 3.0F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 25, 3, -0.5F, -2.65F, 4.1F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 25, 0, -0.5F, -2.85F, 5.3F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 6, 0, -0.5F, -3.15F, 6.7F, 1, 2, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -0.5F, -3.25F, 8.1F, 1, 2, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 25, -0.5F, -2.85F, 9.6F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 9, 23, -0.5F, -2.45F, 10.9F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 9, 20, -0.5F, -2.45F, 12.3F, 1, 1, 1, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.5F, -1.35F, 0.0F, 5, 5, 14, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.5F, 0.35F, 2.0F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7545F, 0.5698F, 0.6557F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 9, -0.8577F, 0.0334F, 1.0716F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 9, -0.7577F, -0.1666F, 0.8716F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 9, -0.5577F, -0.3666F, 0.6716F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 9, -0.3577F, -0.5666F, 0.3716F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 0, -0.1577F, -0.8666F, 0.0716F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, 0.0423F, -1.0666F, -0.2284F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 20, 0.3423F, -1.2666F, -0.5284F, 1, 4, 0, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 20, 0.5423F, -1.4666F, -0.8284F, 1, 4, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, 0.35F, 2.0F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7545F, -0.5698F, -0.6557F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 9, -0.1423F, 0.0334F, 1.0716F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 9, -0.2423F, -0.1666F, 0.8716F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 9, -0.4423F, -0.3666F, 0.6716F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 9, -0.6423F, -0.5666F, 0.3716F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 0, -0.8423F, -0.8666F, 0.0716F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 20, -1.0423F, -1.0666F, -0.2284F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 20, -1.3423F, -1.2666F, -0.5284F, 1, 4, 0, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 20, -1.5423F, -1.4666F, -0.8284F, 1, 4, 0, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.55F, 13.9F);
        this.Body1.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 40, -2.0F, -2.2F, -0.3F, 4, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.4F, -0.3F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 5, 29, -0.5F, -0.6F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 8, -0.5F, -0.6F, 1.1F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 11, -0.5F, -0.6F, 2.3F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 31, -0.5F, -0.6F, 3.5F, 1, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.45F, 4.7F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 2, -1.5F, -1.45F, -1.0F, 3, 3, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -1.0F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.01F, -0.2F, 0.0F, 0, 3, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.45F, 0.0F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 27, -0.5F, -0.7F, 0.8F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 28, -0.5F, -0.7F, -0.3F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 11, -0.5F, -0.7F, 1.9F, 1, 1, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5962F, 4.6634F);
        this.tail2.addChild(tail3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -0.6F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5498F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 8, 0.0F, -7.0F, -1.0F, 0, 10, 12, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.9538F, -0.6634F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5498F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 31, -1.0F, -2.0454F, -1.3681F, 2, 2, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Head.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Head.rotateAngleY = (float) Math.toRadians(90);
        this.Head.offsetX = -0.18F;
        this.Head.offsetY = 0.05F;
        this.Head.offsetZ = 0.0F;
        this.Head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Head, 0.9599F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.2705F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r3, 0.7545F, 0.5698F, 0.6557F);
        this.setRotateAngle(cube_r4, 0.7545F, -0.5698F, -0.6557F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r6, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1222F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r8, -0.5498F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.5498F, 0.0F, 0.0F);
        this.Head.offsetY = 0.55F;
        this.Head.offsetX = -0.05F;
        this.Head.offsetZ = 0.08F;
        this.Head.render(0.01F);
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
        this.Head.offsetY = 1.5F;

        EntityPrehistoricFloraLasanius Lasanius = (EntityPrehistoricFloraLasanius) e;

        this.faceTarget(f3, f4, 2, Head);

        float speed = 0.32F;
        if (Lasanius.getIsFeeding()) {
            speed = 0.15F;
        }
        if (!e.isInWater()) {
            speed = 0.72F;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.2F, -1.5, f2, 1);
            this.swing(Head, speed, 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Head.rotateAngleZ = (float) Math.toRadians(90);
                this.Head.offsetY = 1.5F;
                this.bob(Head, -speed, 5F, false, f2, 1);
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLasanius e = (EntityPrehistoricFloraLasanius) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FEED_ANIMATION); //duration 100
        animator.startKeyframe(20);
        animator.rotate(this.Head, (float) Math.toRadians(65), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.move(this.Head, 0 , 15,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(70);
        animator.resetKeyframe(10);




    }
}
