package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurichthysMarine;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHuanghelepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelHuanghelepis() {
        this.textureWidth = 41;
        this.textureHeight = 41;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.3F, -6.9F);
        this.body.cubeList.add(new ModelBox(body, 26, 28, -0.775F, -0.95F, -0.35F, 1, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 28, -0.225F, -0.95F, -0.35F, 1, 1, 3, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.2F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 26, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 26, -0.6F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.25F, -0.225F, 1.875F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0611F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 32, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 32, -0.5F, -1.0F, -1.0F, 1, 1, 2, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 33, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 33, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.425F, 3.075F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0262F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 32, 0.0F, -2.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.675F, 3.075F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 6, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.096F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 12, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.025F, 2.175F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 29, -0.5F, -0.15F, -3.0F, 1, 1, 3, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, 0.275F, 3.825F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3054F, -0.5672F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 10, 20, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, 0.275F, 3.825F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3054F, 0.5672F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 10, 20, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.325F, 5.825F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 7, -1.0F, -1.1F, 0.0F, 2, 2, 5, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 20, -0.01F, -1.325F, 0.2F, 0, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 0, -1.0F, 0.675F, 0.0F, 2, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -1.1F, 0.0F, 2, 2, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 14, -1.0F, 0.675F, 0.0F, 2, 1, 5, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 23, 0.0F, -1.325F, 0.45F, 0, 1, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.15F, 0.75F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.5236F, -0.2618F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 18, 29, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.15F, 0.75F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.5236F, 0.2618F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 18, 29, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body3.addChild(body4);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.25F, 1.575F, 1.0F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 23, 0.0F, -1.0F, -1.0F, 1, 1, 4, -0.01F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 23, -0.5F, -1.0F, -1.0F, 1, 1, 4, -0.006F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.25F, 1.0F, 1.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 17, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.003F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 17, -0.5F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.925F, 3.45F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 33, -0.01F, -4.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.675F, -0.05F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 6, -0.01F, -4.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.1F);
        this.body4.addChild(body5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.225F, 0.65F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 26, -0.5F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.075F, -0.225F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 0, 0.0F, -2.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.225F, 0.65F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 17, -0.5F, -1.8717F, -1.0763F, 1, 1, 4, 0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.375F, 3.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 20, 28, 0.0F, -2.4217F, 2.4737F, 0, 5, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.675F, 0.65F);
        this.body6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 13, -0.5F, -1.0F, -1.0F, 1, 1, 3, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.15F, -0.3F);
        this.body6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 31, -0.01F, -2.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.2F, 0.65F);
        this.body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1047F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 22, -0.5F, -1.8717F, -1.0763F, 1, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 );
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.06F;
        this.body.offsetY = -0.2F;
        this.body.offsetZ = 0.07F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.offsetX = 0.01F;
        this.body.offsetY = -0.3F;
        this.body.offsetZ = -0.08F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.0F;
        this.body.offsetX = 1.2F;
        this.body.rotateAngleY = (float)Math.toRadians(130);
        this.body.rotateAngleX = (float)Math.toRadians(-6);
        this.body.rotateAngleZ = (float)Math.toRadians(-2);
        this.body.scaleChildren = true;
        float scaler = 2.85F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};
        float speed = 0.25F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.24F, -1, f2, 1);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            //this.walk(lowerjaw, (float) (speed * 0.75), (float)Math.toRadians(10D), true, 0, 0, f2, 1);
            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                if (e instanceof EntityPrehistoricFloraSaurichthysMarine) {
                    this.body.offsetY = 1.2F;
                }
                else {
                    this.body.offsetY = 0;
                }
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
        //animator.move(this.upperjaw, 0,0,-0.5F);
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

