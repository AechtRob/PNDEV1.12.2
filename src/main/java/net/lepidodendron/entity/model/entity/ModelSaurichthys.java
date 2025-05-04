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

public class ModelSaurichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;

    private ModelAnimator animator;

    public ModelSaurichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-1.5F, 20.5F, -2.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 40, 0.01F, -2.35F, 0.0F, 3, 5, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, 0.0F, -1.75F, 0.0F, 1, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 42, -1.0F, -1.75F, 0.0F, 1, 4, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(1.5F, 0.5F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 27, -1.5F, -2.84F, 0.0F, 3, 5, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 15, 14, -1.5F, -2.85F, 0.0F, 3, 5, 8, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 15, 0, -1.5F, -2.84F, 0.0F, 3, 5, 8, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 28, -1.0F, -2.35F, 0.0F, 2, 4, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 29, 8, 0.0F, -7.75F, 5.0F, 0, 6, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, 0.0F, 1.15F, 5.0F, 0, 6, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 34, 28, -0.5F, -1.85F, 0.0F, 1, 3, 2, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 32, 42, -0.5F, -1.35F, 0.0F, 1, 2, 4, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 7, 0, -0.5F, -0.6F, 0.0F, 1, 1, 2, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 0, 9, 0.0F, -5.6F, 0.0F, 0, 11, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.25F, 2.1F, 5.0F);
        this.body4.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.6981F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -2.1F, -5.0F);
        this.pelvicfinL.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 10, 1.5F, 2.05F, 3.0F, 0, 3, 4, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.25F, 2.1F, 5.0F);
        this.body4.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.6981F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -2.1F, -5.0F);
        this.pelvicfinR.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 0, -1.5F, 2.05F, 3.0F, 0, 3, 4, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.5F, 0.35F, 0.1F);
        this.body2.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.1745F, -1.0472F, 0.1745F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 19, 40, 0.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 50, 3.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.5F, 0.35F, 0.1F);
        this.body2.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.1745F, 1.0472F, -0.1745F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 10, 40, -3.0F, -1.0F, 0.0F, 3, 3, 0, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 48, -4.0F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(1.5F, 0.5F, 0.25F);
        this.body.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 44, 5, -1.6F, -2.25F, -4.5F, 1, 2, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -0.5F, -1.0F, -17.75F, 1, 1, 13, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 29, 0, -1.5F, -1.99F, -5.25F, 3, 2, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 44, 35, 0.6F, -2.25F, -4.5F, 1, 2, 2, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 1, 1.61F, -1.75F, -4.0F, 0, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -1.61F, -1.75F, -4.0F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, -11.0F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 34, 28, -0.5F, 0.015F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.0F, -11.0F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 35, -0.5F, 0.02F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1658F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 17, -0.49F, -0.1F, -6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, -1.0F, 0.825F, -1.25F, 2, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 0, -1.0F, -0.175F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 13, -0.5F, -0.19F, -0.01F, 1, 1, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 19, -1.4F, -0.2F, 0.0F, 1, 1, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 28, 0.4F, -0.2F, 0.0F, 1, 1, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(1.5F, 0.5F, 0.25F);
        this.body.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 12, 28, -1.5F, 0.01F, -5.25F, 3, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 14, -0.5F, 0.0F, -17.75F, 1, 1, 13, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 21, -0.5F, 0.02F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -11.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 13, -0.5F, 0.01F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1658F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 0, -0.49F, -1.0F, -6.0F, 1, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 40, 0.4F, -1.0F, -0.1F, 1, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 7, -0.5F, -0.99F, -0.11F, 1, 1, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 40, -1.4F, -1.0F, -0.1F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.20F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.1F;
        this.body.offsetX = 0.22F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.13F;
        this.body.offsetY = -0.19F;
        this.body.offsetZ = 0.07F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        if (e instanceof EntityPrehistoricFloraSaurichthysMarine) {
            this.body.offsetY = 1.1F;
        }
        else {
            this.body.offsetY = 1.1F;
        }

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.265F, -2, f2, 1);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            //this.walk(lowerjaw, (float) (speed * 0.75), (float)Math.toRadians(10D), true, 0, 0, f2, 1);
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pelvicfinR, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                if (e instanceof EntityPrehistoricFloraSaurichthysMarine) {
                    this.body.offsetY = 1.2F;
                }
                else {
                    this.body.offsetY = 1.2F;
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
        animator.rotate(this.upperjaw, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

