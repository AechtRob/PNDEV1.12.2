package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaivodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSaivodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer all;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    private ModelAnimator animator;

    public ModelSaivodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.all = new AdvancedModelRenderer(this);
        this.all.setRotationPoint(0.0F, 19.25F, -9.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, 8.0F);
        this.all.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 34, -4.5F, -5.0F, 0.01F, 9, 1, 24, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -4.75F, 0.0F, 10, 10, 24, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 24, 0.0F, -11.0F, 1.26F, 0, 6, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 35, -4.5F, 4.75F, 0.01F, 9, 1, 24, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.0F, 1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 0, -0.5F, -4.5F, 0.01F, 1, 5, 1, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(5.0F, 3.75F, 5.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, 0.7854F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 33, 11, 0.0F, 0.0F, -5.0F, 13, 0, 11, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-5.0F, 3.75F, 5.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, -0.7854F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 33, 0, -13.0F, 0.0F, -5.0F, 13, 0, 11, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 23.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 60, -4.0F, -3.5F, -0.5F, 8, 9, 10, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 0.0F, -11.75F, -0.09F, 0, 9, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.0F, -22.0F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, -14.25F, 20.76F, 1, 8, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 5.25F, 9.5F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1134F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 69, -3.5F, -0.75F, -9.99F, 7, 1, 10, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-4.0F, 4.75F, 3.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, -0.7854F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 29, 34, -7.0F, 0.0F, -2.0F, 7, 0, 13, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(4.0F, 4.75F, 3.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, 0.7854F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 55, 22, 0.0F, 0.0F, -2.0F, 7, 0, 13, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 82, 17, -3.0F, -3.75F, -1.0F, 6, 7, 8, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 84, 71, -3.5F, -0.75F, 3.01F, 7, 1, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 124, 2.25F, -0.75F, 1.0F, 1, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 124, -3.25F, -0.75F, 1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 3.5F, 7.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 60, -2.5F, -1.25F, -7.99F, 5, 1, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, 3.25F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.2654F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 0, 0.0F, -4.75F, -1.74F, 0, 3, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 48, 80, -1.5F, -2.5F, -1.0F, 3, 5, 11, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 86, 73, -3.5F, -0.74F, -0.49F, 7, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 91, 52, -3.0F, -0.74F, 6.5F, 6, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 8, 122, -4.0F, -0.74F, 1.5F, 8, 1, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 40, -2.0F, -0.75F, 8.5F, 4, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 42, 0.0F, -13.75F, 3.25F, 0, 25, 17, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 36, 126, -1.0F, -0.75F, 10.5F, 2, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0153F, 0.3742F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 70, 0, -4.5F, -4.0153F, -8.3742F, 9, 8, 9, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 2.9847F, -15.3742F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 79, -4.5F, -1.0F, 7.0F, 8, 2, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.5F, -0.5153F, -9.3742F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0436F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 94, -2.0F, -2.75F, 1.0F, 2, 7, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.5F, -0.5153F, -9.3742F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0436F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, 0.0F, -2.75F, 1.0F, 2, 7, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.5153F, -16.3742F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 84, -4.0F, -0.25F, 8.75F, 8, 3, 8, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.2347F, -8.3742F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 84, 60, -2.0F, -0.26F, -8.75F, 4, 2, 9, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 13, 0, -1.5F, -0.76F, -8.0F, 3, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.0F, 0.75F, -1.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.25F, -1.0F, -7.5F, 2, 2, 9, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 11, 1.0F, -1.5F, -7.75F, 0, 1, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.75F, -8.5F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 90, -1.99F, -1.75F, 0.0F, 4, 2, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.0F, 1.25F, -1.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 12, -1.0F, -2.0F, -7.75F, 0, 1, 9, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 47, -2.25F, -1.5F, -7.5F, 2, 2, 9, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.9847F, -8.3742F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 13, 1, -1.5F, -0.5F, -8.65F, 3, 1, 0, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 76, 80, -2.5F, -4.01F, -9.25F, 5, 4, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.5F, -2.0F, -1.0F);
        this.upperjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2182F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 13, -1.0F, 1.5F, -8.5F, 0, 1, 9, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 95, -2.25F, -2.0F, -8.0F, 2, 4, 9, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-4.5F, -2.0F, -1.0F);
        this.upperjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.2182F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 14, 1.0F, 1.5F, -8.5F, 0, 1, 9, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 88, 94, 0.25F, -2.0F, -8.0F, 2, 4, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -4.5F, -9.0F);
        this.upperjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 84, 32, -2.0F, 0.5F, 0.0F, 5, 3, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        if (entity.isInWater()) {
            this.all.offsetY = this.all.offsetY + 0.275F;
            this.all.offsetZ = this.all.offsetZ - 0.6F;
        }
        this.all.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.all.offsetY = 0.2F;
        this.all.offsetX = 0.25F;
        this.all.offsetZ = 2.0F;
        this.all.rotateAngleY = (float)Math.toRadians(120);
        this.all.rotateAngleX = (float)Math.toRadians(0);
        this.all.rotateAngleZ = (float)Math.toRadians(0);
        this.all.scaleChildren = true;
        float scaler = 0.3F;
        this.all.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(all, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.3491F, 0.0F);
        //End of pose, now render the model:
        this.all.render(f);
        //Reset rotations, positions and sizing:
        this.all.setScale(1.0F, 1.0F, 1.0F);
        this.all.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.head.offsetY = -0.001F;
        this.lowerjaw.rotateAngleX = (float) Math.toRadians(35);
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.all.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.3491F, 0.0F);
        this.all.offsetZ = 0.1F;
        this.all.offsetX = -0.23F;
        this.all.offsetY = -0.3F;
        this.all.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.all.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(lowerjaw, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, -0.1309F, 0.0F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.0F, 0.3054F);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.0F, -0.3054F);
        this.setRotateAngle(body2, 0.0F, -0.2182F, 0.0F);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(body3, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.3491F, 0.0F);
        this.all.offsetZ = 0.1F;
        this.all.offsetX = -0.23F;
        this.all.offsetY = -0.05F;
        this.all.render(0.01F);
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

        //this.all.offsetY = -1.4F;
        this.all.offsetY = 0F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        ((EntityPrehistoricFloraSaivodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
            this.chainSwing(fishTail, speed * still, 0.5F * still, -0.85, f2, 0.6F * still);
            this.swing(all, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(all, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.all.rotateAngleZ = (float) Math.toRadians(90);
            //this.all.offsetY = -1.3F;
            this.all.offsetY = 0F;
            this.bob(all, -speed * 1.8F, 2.5F, false, f2, 1);
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
        //animator.move(this.head, 0,0,-0.2F);
        //animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

