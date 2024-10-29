package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSolnhofenamia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSolnhofenamia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;

    private ModelAnimator animator;

    public ModelSolnhofenamia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 25.0F, 1.0F);
        this.base.cubeList.add(new ModelBox(base, 14, 22, -2.0F, -6.5F, -8.0F, 4, 4, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 40, -1.5F, -5.6F, -10.85F, 3, 1, 1, 0.015F, false));
        this.base.cubeList.add(new ModelBox(base, 34, 20, -1.5F, -6.0F, -9.425F, 3, 1, 1, 0.02F, false));
        this.base.cubeList.add(new ModelBox(base, 36, 0, -2.25F, -6.475F, -6.25F, 1, 4, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 36, 0, 1.25F, -6.475F, -6.25F, 1, 4, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.3F, -5.1F, -10.85F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, -0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 21, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.6F, -5.5F, -10.3F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 38, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.6F, -5.5F, -10.3F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, -0.1745F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 38, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.6F, -7.9F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 29, -1.5F, 0.0F, -2.0F, 3, 1, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.5F, -8.0F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 35, -1.5F, 1.0F, -1.6F, 3, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 34, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.3F, -5.1F, -10.85F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 21, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -7.0F, -5.0F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1614F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 7, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -3.0F, -4.8F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 12, -1.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.5F, -8.0F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 30, -1.5F, -0.5F, -2.95F, 3, 1, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -2.75F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 16, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.05F, -2.975F, -4.5F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.829F, 0.0F, 0.5236F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 24, 35, 0.0F, -2.0F, 0.2F, 0, 3, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.05F, -2.975F, -4.5F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.829F, 0.0F, -0.5236F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 24, 35, 0.0F, -2.0F, 0.2F, 0, 3, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.75F, -4.25F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.25F, -1.0F, 4, 5, 6, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.75F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 11, 0.0F, -5.1F, 0.075F, 0, 3, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.9F, 0.325F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1004F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 0, -1.0F, -1.0F, -1.0F, 2, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.9F, 0.5F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0305F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, -2.0F, -4.0F, -1.0F, 3, 4, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 2.0F, 0.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.48F, 0.0F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 38, 38, 0.0F, -0.35F, 0.0F, 0, 3, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 2.0F, 0.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.48F, 0.0F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 38, 38, 0.0F, -0.35F, 0.0F, 0, 3, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.65F, 5.5F);
        this.body2.addChild(body3);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.95F, 0.1F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 7, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.3F, 1.55F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3752F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 38, 0.0F, -3.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.975F, 0.3F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0611F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 33, -1.0F, -3.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.025F, 3.1F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 22, -0.5F, -1.5F, -0.65F, 1, 3, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 21, 0.0F, -3.0F, 2.6F, 0, 5, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetX = -0.14F;
        this.base.offsetY = -0.19F;
        this.base.offsetZ = 0.06F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.base.offsetY = -0.18F;
        this.base.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        ((EntityPrehistoricFloraSolnhofenamia)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;

        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.15F * still, -0.85, f2, 0.5F * still);
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = -0.1F;
            this.bob(base, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

