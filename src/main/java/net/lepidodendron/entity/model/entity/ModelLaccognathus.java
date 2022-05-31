package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLaccognathus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLaccognathus extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r17;

    private ModelAnimator animator;

    public ModelLaccognathus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 20.0F, -6.0F);
        this.head.cubeList.add(new ModelBox(head, 18, 15, -4.0F, 0.0F, 0.0F, 8, 3, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.0F, 2.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 0, -3.0F, -0.9F, -2.0F, 7, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -1.0F, 2.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 5, -3.0F, 0.0F, -0.1F, 7, 2, 2, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 28, -3.5F, -0.65F, -0.85F, 7, 2, 3, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(3.5F, 2.0F, 4.0F);
        this.head.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.6981F, 0.5236F, -0.7418F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 30, 35, 0.0F, -0.5F, 1.0F, 0, 2, 4, 0.01F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 18, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.01F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-3.5F, 2.0F, 4.0F);
        this.head.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.6981F, -0.5236F, 0.7418F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 15, 18, 0.0F, -0.5F, 1.0F, 0, 2, 4, 0.01F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 2, 18, 0.0F, 0.0F, 0.0F, 0, 1, 1, 0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 33, 9, -4.0F, -1.0F, -0.75F, 8, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 36, 28, -2.0F, -0.985F, -3.0F, 4, 1, 3, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 24, 38, -2.0F, -0.75F, -2.75F, 4, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, 0.0F, -3.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.829F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 16, -0.3F, -0.99F, 0.4F, 3, 1, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 39, -0.3F, -0.74F, 0.5F, 3, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, 0.0F, -3.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.829F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 5, -2.7F, -0.74F, 0.5F, 3, 1, 0, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 32, -2.7F, -0.99F, 0.4F, 3, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5934F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 25, -2.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.576F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 11, -2.5F, 0.95F, 1.35F, 5, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 0, -2.5F, 0.0F, 0.85F, 5, 1, 2, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 22, 13, -4.0F, 0.0F, -0.75F, 8, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 35, 35, -2.0F, 0.02F, -3.0F, 4, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 37, 3, -2.0F, -0.25F, -2.75F, 4, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.0F, -0.275F, 0.1F, 2, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.829F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 22, -2.7F, -0.99F, 0.4F, 3, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 13, -2.7F, -1.24F, 0.5F, 3, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, 0.5F, -3.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.829F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 38, -0.3F, -0.74F, 0.5F, 3, 1, 0, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 13, -0.3F, -0.49F, 0.4F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 1, -1.0F, -0.4F, -0.15F, 2, 1, 0, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -2.025F, -1.0F, 7, 4, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 2.0F, -2.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 28, -2.5F, -1.0F, 2.0F, 6, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -2.0F, -2.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 22, -2.5F, 0.0F, 1.0F, 6, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 9, -3.0F, -2.0F, 0.0F, 6, 5, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 33, -3.0F, -1.5F, -0.975F, 6, 4, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, 0.0F, -4.7F, 0.0F, 0, 3, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -2.5F, -1.75F, -1.0F, 5, 4, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.25F, 2.0F, 0.25F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.7854F, 0.3054F, -0.5672F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 2, 12, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 9, 0.0F, -1.0F, 1.0F, 0, 2, 2, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.25F, 2.0F, 0.25F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.7854F, -0.3054F, 0.5672F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 12, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 7, 0.0F, -1.0F, 1.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 33, -1.5F, -1.5F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 17, 25, 0.0F, -4.4F, -0.45F, 0, 3, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6545F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 37, 0.0F, 0.0F, 0.75F, 0, 2, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 3.75F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.2618F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 11, 33, -1.0F, -1.0F, -1.0F, 2, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 33, -0.5F, 0.0F, -0.45F, 1, 1, 6, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 17, 1, 0.0F, 1.0F, -2.45F, 0, 4, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5 * 1.00F);
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

        this.head.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.134F;

        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.210F;
        }

        //this.head.rotateAngleY += (f3 / (180F / (float) Math.PI));
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.43F * still, -0.65, f2, 0.5F * still);
            this.swing(head, speed, 0.1F * still, true, 0, 0, f2, 0.7F * still);
        }
        else {
            this.swing(head, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.2F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            //this.head.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 0.22F;
            this.bob(head, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLaccognathus e = (EntityPrehistoricFloraLaccognathus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.lowerjaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

