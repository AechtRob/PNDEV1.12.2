package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTribodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelTribodus() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 17.0F, -5.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 20, -3.0F, -3.0F, -1.1F, 6, 7, 8, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 28, 0, -3.5F, -2.0F, -3.0F, 7, 5, 6, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 4.0F, -1.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 14, -5.0F, -1.025F, -2.1F, 6, 1, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -3.0F, -1.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 38, -5.0F, -0.025F, -2.1F, 6, 1, 2, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -2.8F, -0.8F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 18, 0.5F, 0.0F, 0.0F, 0, 4, 9, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.0F, -1.1F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 41, -0.5F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.25F, 6.9F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 28, 31, -2.5F, -2.75F, -0.6F, 5, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -2.175F, 0.35F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 32, -3.0F, -1.0F, -1.0F, 4, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 3.525F, 0.575F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, -3.0F, -2.0F, -1.0F, 4, 2, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 2.775F, 3.575F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, -0.0873F, 0.6981F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 1.9F, 0.5F);
        this.pelvicfinright.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 41, 1.0F, -2.0F, -1.0F, 0, 3, 5, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 2.775F, 3.575F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0873F, -0.6981F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 1.9F, 0.5F);
        this.pelvicfinleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 41, -1.0F, -2.0F, -1.0F, 0, 3, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.825F, 4.35F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 20, 41, -2.0F, -3.75F, -0.6F, 4, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.725F, 0.4F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 50, -2.0F, -1.0F, -1.0F, 3, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.575F, 0.05F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.9163F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 50, 0.5F, 0.7F, -0.2F, 0, 4, 6, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 7, 0.0F, 0.0F, -0.4F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -3.575F, 0.4F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1833F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 50, -2.0F, -1.0F, -1.0F, 3, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -2.325F, 4.4F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.4905F, -0.2179F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 56, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 1.5905F, -0.2179F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 0, -2.0F, -3.0F, -1.0F, 3, 3, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.3905F, 2.8821F);
        this.body3.addChild(body4);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.75F, 0.5F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 61, 0.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.5F, 0.5F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 56, -1.0F, -3.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 3.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.2618F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 48, 23, -0.5F, -2.0F, -0.75F, 1, 2, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, 4.0F, 0.85F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 2.0F, -6.0F, -1.0F, 0, 6, 14, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.base.addChild(upperjaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.0F, -2.9F, 0.0F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 18, -5.0F, 2.0F, -3.4F, 6, 1, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 1.35F, 1.575F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 60, -3.0F, -1.0F, -8.0F, 4, 2, 2, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.0F, -5.425F, -0.7F);
        this.upperjaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 57, -3.0F, 0.375F, -8.0F, 4, 1, 1, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 49, -3.0F, 0.0F, -8.0F, 4, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.5F, -2.825F, 1.15F);
        this.upperjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1047F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 60, -4.0F, 2.0F, -6.0F, 5, 1, 2, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, -5.55F, -0.1F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 55, -4.0F, 2.0F, -6.0F, 5, 1, 1, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.5F, -4.3F, -0.1F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 55, -4.0F, 0.0F, -6.0F, 5, 3, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, -4.0F, 0.0F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3054F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 35, -5.0F, 0.0F, -4.0F, 6, 3, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-3.5F, 2.1F, -0.1F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.3054F, -0.6109F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 28, 11, -6.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(3.5F, 2.1F, -0.1F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, -0.3054F, 0.6109F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 28, 11, 0.0F, 0.0F, 0.0F, 6, 0, 7, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.5F, -3.0F);
        this.base.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.1309F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 52, 60, -2.0F, 1.0F, -3.25F, 4, 1, 2, -0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.0F, 1.7F, -2.025F);
        this.lowerjaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2618F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 52, -3.0F, -1.0F, -1.0F, 4, 1, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.5F, 2.1F, -0.4F);
        this.lowerjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 49, -4.0F, -3.0F, -1.0F, 5, 3, 3, 0.0F, false));

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
        //Rotations, positions and sizing:
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetY = -0.1F;
        this.base.offsetX = -0.05F;
        this.base.offsetZ = -0.05F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.base.offsetY = -0.14F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.base.offsetY = 0.0F;
        this.base.render(0.01F);
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

        //this.Hybodus.offsetY = 0.5F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5};
        //((EntityPrehistoricFloraTribodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

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
            this.swing(base, speed, 0.12F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(base, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.1F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.4F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.1F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.1F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.2F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.1F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = 0.2F;
            this.bob(base, -speed * 1.8F, 2.5F, false, f2, 1);
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
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

